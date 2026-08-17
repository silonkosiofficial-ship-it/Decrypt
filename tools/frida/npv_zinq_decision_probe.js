'use strict';

/*
 * NPV zInq decision probe.
 *
 * Read-only diagnostic instrumentation for the protected startup decision on an
 * authorized development/test build. This probe records Java/JNI/native inputs
 * around ProtectedMyApplication.zInq(Object) and preserves all original return
 * values, exceptions, errno values, and process behavior.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_zinq_decision_probe.js
 */

const TAG = 'npv-zinq-decision';
const PKG = 'com.napsternetlabs.napsternetv';
const PMA = `${PKG}.ProtectedMyApplication`;
const MAX_PREVIEW = 256;

let seq = 0;
let phase = 'pre-java';
let zinqWindow = false;
let attachBaseContextEntered = false;
let attachBaseContextReturned = false;
let onCreateEntered = false;
let onCreateReturned = false;
let Throwable = null;
let JavaThread = null;
const fdPaths = {};
const nativeMethods = {};
const nativeHooked = {};
const runStartedAt = Date.now();

function now() { return new Date().toISOString(); }
function tid() { try { return Process.getCurrentThreadId(); } catch (_) { return '?'; } }
function elapsedMs() { return Date.now() - runStartedAt; }
function threadName() {
  try { return JavaThread ? safe(JavaThread.currentThread().getName()) : '<java-unavailable>'; } catch (_) { return '<java-unavailable>'; }
}
function log(msg) { seq += 1; console.log(`[${TAG} #${seq} ${now()} +${elapsedMs()}ms tid=${tid()} jthread=${threadName()} phase=${phase}] ${msg}`); }
function safe(v) { try { return String(v); } catch (e) { return `<string failed: ${e}>`; } }
function ptrSafe(p) { return p === null || p === undefined ? ptr('0') : p; }
function cstr(p) { try { return ptrSafe(p).isNull() ? 'null' : ptrSafe(p).readCString(); } catch (e) { return `<cstr failed: ${e}>`; } }
function moduleOf(addr) {
  try {
    const m = Process.findModuleByAddress(ptr(addr));
    return m ? `${m.name}+${ptr(addr).sub(m.base)}` : '<no-module>';
  } catch (e) { return `<module failed: ${e}>`; }
}
function rangeOf(addr) {
  try {
    const a = ptr(addr);
    const r = Process.findRangeByAddress(a);
    if (!r) return '<no-range>';
    const off = a.sub(r.base);
    return `base=${r.base} size=${r.size} offset=${off} protection=${r.protection} file=${r.file ? r.file.path : '<anonymous>'}`;
  } catch (e) { return `<range failed: ${e}>`; }
}
function describeAddress(addr) { return `${ptr(addr)} ${moduleOf(addr)} range{${rangeOf(addr)}}`; }
function nativeBacktrace(ctx) {
  try {
    return globalThis.Thread.backtrace(ctx, Backtracer.ACCURATE).map(a => `${a} ${moduleOf(a)}`).join(' <= ');
  } catch (_) {
    try { return globalThis.Thread.backtrace(ctx, Backtracer.FUZZY).map(a => `${a} ${moduleOf(a)}`).join(' <= '); } catch (e) { return `<bt failed: ${e}>`; }
  }
}
function javaStack() {
  try { return Java.use('android.util.Log').getStackTraceString(Throwable.$new()); } catch (e) { return `<java stack failed: ${e}>`; }
}
function lifecycleSnapshot() {
  return `beforeAttachBaseContext=${!attachBaseContextEntered} attachBaseContextEntered=${attachBaseContextEntered} attachBaseContextReturned=${attachBaseContextReturned} beforeOnCreate=${!onCreateEntered} onCreateEntered=${onCreateEntered} onCreateReturned=${onCreateReturned}`;
}
function classifyLoaderOwner(fromClass, stackText) {
  const haystack = `${safe(fromClass)}\n${safe(stackText)}`;
  if (haystack.indexOf(PKG) >= 0 || haystack.indexOf('napsternetlabs') >= 0) return 'NPV code';
  if (/com\.google\.|com\.android\.webview|com\.google\.android\.gms|com\.google\.android\.libraries/.test(haystack)) return 'Google component';
  if (/android\.|java\.|dalvik\.|libcore\.|com\.android\./.test(haystack)) return 'Android framework code';
  return 'another library/unknown';
}
function logLibraryLoadObservation(apiName, libname, fromClass, extra) {
  const stackText = javaStack();
  log(`${apiName} loadLibrary argument=${safe(libname)} fromClass=${safe(fromClass)} owner=${classifyLoaderOwner(fromClass, stackText)} ${lifecycleSnapshot()}${extra ? ` ${extra}` : ''}\nJava stack at ${apiName}(${safe(libname)})\n${stackText}`);
}
function logMgeFingerprint(label) {
  try {
    const MGE = Java.use(`${PKG}.MessageGuardException`);
    log(`MessageGuardException.fingerprint ${label}=${safe(MGE.fingerprint.value)}`);
  } catch (e) { log(`MessageGuardException.fingerprint ${label} unavailable: ${e}`); }
}
function bytesHex(u8, max) {
  const n = Math.min(u8.length, max || MAX_PREVIEW);
  const out = [];
  for (let i = 0; i < n; i += 1) out.push(('0' + u8[i].toString(16)).slice(-2));
  return out.join('') + (u8.length > n ? `...(+${u8.length - n})` : '');
}
function boundedArrayValues(arr, max, transform) {
  const n = Math.min(arr.length, max || MAX_PREVIEW);
  const out = [];
  for (let i = 0; i < n; i += 1) out.push(transform(arr[i]));
  return { length: arr.length, preview: out, truncated: arr.length > n ? arr.length - n : 0 };
}
function javaObjectClassName(obj) {
  if (obj === null || obj === undefined) return '<null>';
  try { return safe(obj.getClass().getName()); } catch (e) { return `<class failed: ${e}>`; }
}
function inspectZinqObject(obj) {
  const className = javaObjectClassName(obj);
  if (obj === null || obj === undefined) return `class=${className} value=${safe(obj)}`;
  if (className === '[B') {
    const arr = Java.cast(obj, Java.use('[B'));
    const vals = boundedArrayValues(arr, 64, v => (v + 256) & 255);
    return `class=${className} byte[] length=${vals.length} hex=${bytesHex(vals.preview, vals.preview.length)}${vals.truncated ? ` truncated=+${vals.truncated}` : ''}`;
  }
  if (className === '[I') {
    const arr = Java.cast(obj, Java.use('[I'));
    const vals = boundedArrayValues(arr, 64, v => v | 0);
    return `class=${className} int[] length=${vals.length} values=${vals.preview.join(',')}${vals.truncated ? `...(+${vals.truncated})` : ''}`;
  }
  return `class=${className} value=${safe(obj)}`;
}
function interestingPath(p) {
  const s = safe(p).toLowerCase();
  return zinqWindow || s.indexOf('/proc') >= 0 || s.indexOf('/sys') >= 0 || s.indexOf('/system') >= 0 ||
    s.indexOf('/vendor') >= 0 || s.indexOf('magisk') >= 0 || s.indexOf('su') >= 0 || s.indexOf('frida') >= 0 ||
    s.indexOf('.dexp-queue') >= 0 || s.indexOf('.pb') >= 0 || s.indexOf('base.apk') >= 0;
}
function hookExport(name, callbacks) {
  let addr = null;
  try { addr = Module.findGlobalExportByName(name); } catch (_) {}
  if (!addr) { try { addr = Module.findExportByName(null, name); } catch (_) {} }
  if (!addr) { log(`native export unavailable ${name}`); return; }
  Interceptor.attach(addr, callbacks);
  log(`hooked ${name} @ ${addr}`);
}
function logLoadedModules(label) {
  try {
    Process.enumerateModules().filter(m => /lib(dpboot|dexprotector|alice|gojni|sqlite|art|android_runtime|c\+\+|log|dl|c)\.so|napsternet|npv/i.test(m.name))
      .forEach(m => log(`${label} module ${m.name} base=${m.base} size=${m.size} path=${m.path}`));
  } catch (e) { log(`${label} module enumeration failed: ${e}`); }
}

function installNativeHooks() {
  hookExport('__system_property_get', {
    onEnter(args) { this.key = cstr(args[0]); this.valuePtr = args[1]; this.bt = nativeBacktrace(this.context); },
    onLeave(ret) { let v = cstr(this.valuePtr); if (zinqWindow || /^(ro\.|persist\.|vendor\.)/.test(this.key)) log(`prop.get key=${this.key} value=${v} ret=${ret} caller=${moduleOf(this.returnAddress)} bt=${this.bt}`); }
  });
  ['open', 'openat', 'access', 'faccessat', 'stat', 'stat64', 'lstat', 'readlink', 'readlinkat'].forEach(name => hookExport(name, {
    onEnter(args) {
      this.name = name;
      this.path = name === 'openat' || name === 'faccessat' || name === 'readlinkat' ? cstr(args[1]) : cstr(args[0]);
      this.doLog = interestingPath(this.path);
      if (this.doLog) this.bt = nativeBacktrace(this.context);
    },
    onLeave(ret) { const rv = ret.toInt32(); if ((this.name === 'open' || this.name === 'openat') && rv >= 0) fdPaths[rv] = this.path; if (this.doLog) log(`fs.${this.name} path=${this.path} ret=${ret} caller=${moduleOf(this.returnAddress)} bt=${this.bt}`); }
  }));
  hookExport('read', {
    onEnter(args) { this.fd = args[0].toInt32(); this.buf = args[1]; this.path = fdPaths[this.fd] || ''; this.doLog = zinqWindow || interestingPath(this.path); },
    onLeave(ret) { if (this.doLog) log(`fs.read fd=${this.fd} path=${this.path} ret=${ret}`); }
  });
  ['fork', 'execve', 'system', 'popen'].forEach(name => hookExport(name, {
    onEnter(args) { log(`process.${name} arg0=${cstr(args[0])} caller=${moduleOf(this.returnAddress)} bt=${nativeBacktrace(this.context)}`); },
    onLeave(ret) { log(`process.${name} ret=${ret}`); }
  }));
}

function maybeHookNativeMethod(name, fn) {
  const key = `${name}@${fn}`;
  if (nativeHooked[key]) return;
  nativeHooked[key] = true;
  try {
    Interceptor.attach(fn, {
      onEnter(args) {
        this.name = name;
        this.enteredAt = Date.now();
        this.arg0 = args[2];
        if (name === 'zInq') {
          const old = phase;
          phase = 'native-zInq';
          try {
            log(`native zInq enter fn=${describeAddress(fn)} caller=${describeAddress(this.returnAddress)} arg0Handle=${args[2]}`);
            try { log(`native zInq arg0 ${inspectZinqObject(Java.cast(args[2], Java.use('java.lang.Object')))}`); } catch (e) { log(`native zInq arg0 inspect failed: ${e}`); }
            log(`native zInq backtrace ${nativeBacktrace(this.context)}`);
          } finally { phase = old; }
        }
      },
      onLeave(ret) {
        if (name === 'zInq') {
          const old = phase;
          phase = 'native-zInq';
          try { log(`native zInq leave ret=${ret} durationMs=${Date.now() - this.enteredAt}`); } finally { phase = old; }
        }
      }
    });
    log(`hooked native ${name} @ ${describeAddress(fn)}`);
  } catch (e) { log(`hook native ${name} @ ${fn} failed: ${e}`); }
}

function installRegisterNativesHook() {
  const art = Process.findModuleByName('libart.so');
  if (!art) { log('libart.so unavailable for RegisterNatives scan'); return; }
  art.enumerateSymbols().filter(s => s.name.indexOf('RegisterNatives') >= 0 && s.name.indexOf('CheckJNI') < 0).forEach(s => {
    Interceptor.attach(s.address, {
      onEnter(args) {
        this.methods = [];
        const env = Java.vm.getEnv();
        const clsName = (() => { try { return env.getClassName(args[1]); } catch (e) { return `<class failed: ${e}>`; } })();
        const count = args[3].toInt32();
        const methodSize = Process.pointerSize * 3;
        for (let i = 0; i < count; i += 1) {
          const entry = args[2].add(i * methodSize);
          const name = cstr(entry.readPointer());
          const sig = cstr(entry.add(Process.pointerSize).readPointer());
          const fn = entry.add(Process.pointerSize * 2).readPointer();
          const mod = moduleOf(fn);
          this.methods.push(`${clsName}.${name}${sig} @ ${fn} ${mod}`);
          if (clsName === PMA && (name === 'zInq' || name === 'gwj' || name === 'uapgpA')) {
            nativeMethods[name] = { fn: safe(fn), module: mod, range: rangeOf(fn), sig: sig };
            maybeHookNativeMethod(name, fn);
          }
        }
      },
      onLeave(ret) { if (this.methods.some(m => m.indexOf(PMA) >= 0 || m.indexOf('napsternetlabs') >= 0)) this.methods.forEach(m => log(`RegisterNatives ret=${ret} ${m}`)); }
    });
    log(`hooked RegisterNatives candidate ${s.name} @ ${s.address}`);
  });
}

Java.perform(function () {
  Throwable = Java.use('java.lang.Throwable');
  JavaThread = Java.use('java.lang.Thread');
  installRegisterNativesHook();
  installNativeHooks();

  const Build = Java.use('android.os.Build');
  const Version = Java.use('android.os.Build$VERSION');
  function buildSnapshot(label) {
    ['BRAND','MANUFACTURER','MODEL','DEVICE','PRODUCT','HARDWARE','FINGERPRINT','TAGS','TYPE','SUPPORTED_ABIS'].forEach(k => { try { log(`Build ${label} ${k}=${safe(Build[k].value)}`); } catch (_) {} });
    try { log(`Build ${label} VERSION.RELEASE=${Version.RELEASE.value} SDK_INT=${Version.SDK_INT.value}`); } catch (_) {}
  }

  const SystemProperties = Java.use('android.os.SystemProperties');
  SystemProperties.get.overload('java.lang.String').implementation = function (k) { const r = this.get(k); if (zinqWindow || /^ro\.|^persist\.|^vendor\./.test(safe(k))) log(`SystemProperties.get ${k} => ${r}\n${javaStack()}`); return r; };
  SystemProperties.get.overload('java.lang.String', 'java.lang.String').implementation = function (k, d) { const r = this.get(k, d); if (zinqWindow || /^ro\.|^persist\.|^vendor\./.test(safe(k))) log(`SystemProperties.getDefault ${k} default=${d} => ${r}\n${javaStack()}`); return r; };

  const System = Java.use('java.lang.System');
  const systemLoadLibrary = System.loadLibrary.overload('java.lang.String');
  systemLoadLibrary.implementation = function (lib) {
    const old = phase;
    const libString = safe(lib);
    if (libString === 'dpboot') phase = 'loadLibrary-dpboot';
    logLibraryLoadObservation('System.loadLibrary', lib, '<System.loadLibrary caller in Java stack>', `targetFrameworkConnectivity=${libString === 'framework-connectivity-jni'}`);
    try {
      const r = systemLoadLibrary.call(this, lib);
      log(`System.loadLibrary return lib=${libString} result=${safe(r)} ${lifecycleSnapshot()}`);
      return r;
    } catch (e) {
      log(`System.loadLibrary THROW lib=${libString} exception=${safe(e)} message=${e && e.getMessage ? safe(e.getMessage()) : '<no getMessage>'} ${lifecycleSnapshot()}`);
      throw e;
    } finally {
      if (libString === 'dpboot') logLoadedModules('after-loadLibrary-dpboot');
      phase = old;
    }
  };

  const Runtime = Java.use('java.lang.Runtime');
  try {
    const runtimeLoadLibrary0 = Runtime.loadLibrary0.overload('java.lang.ClassLoader', 'java.lang.Class', 'java.lang.String');
    runtimeLoadLibrary0.implementation = function (loader, fromClass, libname) {
      logLibraryLoadObservation('Runtime.loadLibrary0', libname, fromClass, `loader=${safe(loader)} targetFrameworkConnectivity=${safe(libname) === 'framework-connectivity-jni'}`);
      try {
        const r = runtimeLoadLibrary0.call(this, loader, fromClass, libname);
        log(`Runtime.loadLibrary0 return lib=${safe(libname)} fromClass=${safe(fromClass)} result=${safe(r)} ${lifecycleSnapshot()}`);
        return r;
      } catch (e) {
        log(`Runtime.loadLibrary0 THROW lib=${safe(libname)} fromClass=${safe(fromClass)} exception=${safe(e)} message=${e && e.getMessage ? safe(e.getMessage()) : '<no getMessage>'} ${lifecycleSnapshot()}`);
        throw e;
      }
    };
  } catch (e) { log(`Runtime.loadLibrary0(ClassLoader,Class,String) hook unavailable: ${e}`); }
  Runtime.exec.overloads.forEach(ov => { ov.implementation = function () { log(`Runtime.exec argc=${arguments.length} args=${Array.prototype.map.call(arguments, safe).join(' | ')}\n${javaStack()}`); return ov.apply(this, arguments); }; });

  const PMAClass = Java.use(PMA);
  const certificateJ = PMAClass.J.overload();
  certificateJ.implementation = function () { const old = phase; phase = 'certificate-J'; log('J enter'); try { const r = certificateJ.call(this); log(`J return normally result=${safe(r)}`); return r; } catch (e) { log(`J THROW=${safe(e)} message=${e && e.getMessage ? safe(e.getMessage()) : '<no getMessage>'}`); throw e; } finally { phase = old; } };

  PMAClass.attachBaseContext.overload('android.content.Context').implementation = function (ctx) { const old = phase; phase = 'attachBaseContext'; attachBaseContextEntered = true; log('attachBaseContext enter'); buildSnapshot('attachBaseContext-enter'); logLoadedModules('attachBaseContext-enter'); try { const r = this.attachBaseContext(ctx); attachBaseContextReturned = true; log('attachBaseContext return normally'); return r; } catch (e) { log(`attachBaseContext THROW=${safe(e)} message=${e && e.getMessage ? safe(e.getMessage()) : '<no getMessage>'}`); throw e; } finally { log('attachBaseContext exit/finally'); logLoadedModules('attachBaseContext-exit'); phase = old; } };
  PMAClass.onCreate.overload().implementation = function () { const old = phase; phase = 'onCreate'; onCreateEntered = true; log('onCreate enter'); buildSnapshot('onCreate-enter'); try { const r = this.onCreate(); onCreateReturned = true; log('onCreate return normally'); return r; } catch (e) { log(`onCreate THROW=${safe(e)} message=${e && e.getMessage ? safe(e.getMessage()) : '<no getMessage>'}`); throw e; } finally { log('onCreate exit/finally'); logLoadedModules('onCreate-exit'); phase = old; } };

  ['uapgpA', 'gwj', 'zInq'].forEach(name => {
    PMAClass[name].overloads.forEach(ov => { ov.implementation = function () {
      const old = phase; phase = `java-native-${name}`; const was = zinqWindow; if (name === 'zInq') zinqWindow = true;
      log(`${name} enter argc=${arguments.length} nativeMapping=${nativeMethods[name] ? JSON.stringify(nativeMethods[name]) : '<unknown>'}`);
      if (name === 'zInq') logMgeFingerprint('before-zInq');
      if (name === 'zInq' && arguments.length > 0) { try { log(`zInq arg0 ${inspectZinqObject(arguments[0])}`); } catch (e) { log(`zInq arg0 inspect failed: ${e} value=${safe(arguments[0])}`); } }
      log(`java stack at ${name} entry\n${javaStack()}`);
      try { const r = ov.apply(this, arguments); log(`${name} return=${safe(r)}`); if (name === 'zInq') logMgeFingerprint('after-zInq-return'); return r; }
      catch (e) { log(`${name} THROW=${safe(e)} message=${e && e.getMessage ? safe(e.getMessage()) : '<no getMessage>'}`); if (name === 'zInq') logMgeFingerprint('after-zInq-throw'); throw e; }
      finally { if (name === 'zInq') zinqWindow = was; phase = old; }
    }; });
  });

  const RuntimeException = Java.use('java.lang.RuntimeException');
  RuntimeException.$init.overload('java.lang.String').implementation = function (s) { const r = this.$init(s); if (safe(s).indexOf('DP:') >= 0) log(`RuntimeException(String) DP message=${s}\n${javaStack()}`); return r; };
  RuntimeException.$init.overload('java.lang.String', 'java.lang.Throwable').implementation = function (s, t) { const r = this.$init(s, t); if (safe(s).indexOf('DP:') >= 0 || safe(t).indexOf('DP:') >= 0) log(`RuntimeException(String,Throwable) message=${s} cause=${safe(t)} causeMessage=${t ? safe(t.getMessage()) : 'null'}\n${javaStack()}`); return r; };
  const MGE = Java.use(`${PKG}.MessageGuardException`);
  MGE.$init.overload('java.lang.Throwable', 'java.lang.String').implementation = function (t, id) { logMgeFingerprint('before-MGE-init'); log(`MessageGuardException cause=${safe(t)} causeMessage=${t ? safe(t.getMessage()) : 'null'} id=${safe(id)}`); const r = this.$init(t, id); logMgeFingerprint('after-MGE-init'); return r; };
  try {
    const Log = Java.use('android.util.Log');
    ['d', 'i', 'w', 'e'].forEach(level => {
      Log[level].overload('java.lang.String', 'java.lang.String').implementation = function (tag, msg) {
        const text = `${safe(tag)} ${safe(msg)}`;
        if (text.indexOf('Fingerprint:') >= 0 || text.indexOf('blocked') >= 0 || text.indexOf('DP:') >= 0) log(`Log.${level} tag=${safe(tag)} msg=${safe(msg)}\n${javaStack()}`);
        return this[level](tag, msg);
      };
    });
  } catch (e) { log(`android.util.Log hook failed: ${e}`); }

  log(`npv zInq decision probe installed (read-only) runStartedAt=${new Date(runStartedAt).toISOString()}`);
});
