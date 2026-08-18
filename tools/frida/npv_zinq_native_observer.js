'use strict';

/*
 * Read-only native observer for ProtectedMyApplication.zInq(Object) DP:786.
 *
 * It preserves all arguments, return values, errno values, exceptions, memory,
 * and instructions. It only observes the zInq window, selected native APIs, JNI
 * registration, RuntimeException("DP:...") construction, and module ownership.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_zinq_native_observer.js
 */

const TAG = 'npv-zinq-native-observer';
const PKG = 'com.napsternetlabs.napsternetv';
const PMA = `${PKG}.ProtectedMyApplication`;
const MAX_STRING = 512;
const MAX_READ_PREVIEW = 192;
const runStartedAt = Date.now();
const fdPaths = {};
const nativeMethods = {};
const hookedNativeMethods = {};
let seq = 0;
let zinqWindow = false;
let zinqDepth = 0;
let zinqTid = null;
let zinqStartedAt = 0;
let Throwable = null;
let JavaThread = null;

function now() { return new Date().toISOString(); }
function elapsedMs() { return Date.now() - runStartedAt; }
function tid() { try { return Process.getCurrentThreadId(); } catch (_) { return -1; } }
function threadName() { try { return JavaThread ? String(JavaThread.currentThread().getName()) : '<java-unavailable>'; } catch (_) { return '<java-unavailable>'; } }
function safe(v) { try { return String(v); } catch (e) { return `<string failed: ${e}>`; } }
function log(msg) { seq += 1; console.log(`[${TAG} #${seq} ${now()} +${elapsedMs()}ms pid=${Process.id} tid=${tid()} jthread=${threadName()} zinq=${zinqWindow ? 'yes' : 'no'}] ${msg}`); }
function pstr(p) { try { const q = ptr(p); return q.isNull() ? 'null' : q.readCString(MAX_STRING); } catch (e) { return `<cstr failed: ${e}>`; } }
function errnoValue() { try { return this.errno; } catch (_) { return '<errno-unavailable>'; } }
function javaStack() { try { return Java.use('android.util.Log').getStackTraceString(Throwable.$new()); } catch (e) { return `<java stack failed: ${e}>`; } }
function rangeInfo(addr) {
  try {
    const a = ptr(addr);
    const r = Process.findRangeByAddress(a);
    if (!r) return '<no-range>';
    const filePath = r.file && r.file.path ? r.file.path : '<anonymous>';
    return `rangeBase=${r.base} rangeOffset=${a.sub(r.base)} rangeSize=${r.size} prot=${r.protection} file=${filePath}`;
  } catch (e) { return `<range failed: ${e}>`; }
}
function moduleInfo(addr) {
  try {
    const a = ptr(addr);
    const m = Process.findModuleByAddress(a);
    if (!m) return `module=<none> ${rangeInfo(a)}`;
    return `module=${m.name} path=${m.path} base=${m.base} offset=${a.sub(m.base)} ${rangeInfo(a)}`;
  } catch (e) { return `<module failed: ${e}>`; }
}
function describeAddress(addr) { return `${ptr(addr)} ${moduleInfo(addr)}`; }
function nativeBacktrace(ctx) {
  const render = a => `${a} ${moduleInfo(a)}`;
  try { return Thread.backtrace(ctx, Backtracer.ACCURATE).map(render).join('\n  <= '); }
  catch (_) { try { return Thread.backtrace(ctx, Backtracer.FUZZY).map(render).join('\n  <= '); } catch (e) { return `<bt failed: ${e}>`; } }
}
function interestingProperty(key) { return zinqWindow || /^(ro\.build\.fingerprint|ro\.product\.|ro\.kernel\.|ro\.boot\.|ro\.hardware|ro\.build\.characteristics|ro\.build\.type|ro\.build\.tags|qemu\.|init\.svc\.qemu|vendor\.|persist\.)/.test(safe(key)); }
function interestingPath(path) { const s = safe(path).toLowerCase(); return zinqWindow || s.indexOf('/proc/') >= 0 || s.indexOf('/proc') === 0 || s.indexOf('/sys/') >= 0 || s.indexOf('/dev/qemu') >= 0 || s.indexOf('qemu') >= 0 || s.indexOf('goldfish') >= 0 || s.indexOf('ranchu') >= 0 || s.indexOf('frida') >= 0 || s.indexOf('magisk') >= 0 || s.indexOf('/su') >= 0 || s.indexOf('/system') >= 0 || s.indexOf('/vendor') >= 0; }
function previewBytes(buf, count) {
  try {
    const n = Math.min(count, MAX_READ_PREVIEW);
    if (n <= 0 || ptr(buf).isNull()) return '';
    const bytes = new Uint8Array(ptr(buf).readByteArray(n));
    let text = '';
    for (let i = 0; i < bytes.length; i += 1) text += bytes[i] >= 32 && bytes[i] <= 126 ? String.fromCharCode(bytes[i]) : '.';
    return ` previewAscii=${JSON.stringify(text)} previewHex=${Array.prototype.map.call(bytes, b => ('0' + b.toString(16)).slice(-2)).join('')}${count > n ? ` truncated=+${count - n}` : ''}`;
  } catch (e) { return ` previewFailed=${e}`; }
}
function hookExport(name, callbacks) {
  let addr = null;
  try { addr = Module.findGlobalExportByName(name); } catch (_) {}
  if (!addr) { try { addr = Module.findExportByName(null, name); } catch (_) {} }
  if (!addr) { log(`export unavailable ${name}`); return; }
  Interceptor.attach(addr, callbacks);
  log(`hooked ${name} @ ${describeAddress(addr)}`);
}
function logNativeApi(name, detail, ret, ctx, returnAddress) { log(`${name} ${detail} ret=${ret} errno=${errnoValue.call({ errno: this && this.errno })} caller=${describeAddress(returnAddress)}\n  bt=${nativeBacktrace(ctx)}`); }

function installNativeApiHooks() {
  hookExport('__system_property_get', {
    onEnter(args) { this.key = pstr(args[0]); this.valuePtr = args[1]; this.ctx = this.context; this.ra = this.returnAddress; this.doLog = interestingProperty(this.key); },
    onLeave(ret) { if (this.doLog) logNativeApi.call(this, '__system_property_get', `key=${this.key} value=${pstr(this.valuePtr)}`, ret, this.ctx, this.ra); }
  });
  hookExport('__system_property_read', {
    onEnter(args) { this.namePtr = args[1]; this.valuePtr = args[2]; this.ctx = this.context; this.ra = this.returnAddress; this.doLog = zinqWindow; },
    onLeave(ret) { const key = pstr(this.namePtr); if (this.doLog || interestingProperty(key)) logNativeApi.call(this, '__system_property_read', `name=${key} value=${pstr(this.valuePtr)}`, ret, this.ctx, this.ra); }
  });
  ['open', 'openat', 'access', 'stat', 'readlink'].forEach(name => hookExport(name, {
    onEnter(args) { this.api = name; this.path = (name === 'openat') ? pstr(args[1]) : pstr(args[0]); this.buf = name === 'readlink' ? args[1] : ptr(0); this.ctx = this.context; this.ra = this.returnAddress; this.doLog = interestingPath(this.path); },
    onLeave(ret) { const rv = ret.toInt32(); if ((this.api === 'open' || this.api === 'openat') && rv >= 0) fdPaths[rv] = this.path; if (this.doLog) logNativeApi.call(this, this.api, `path=${this.path}${this.api === 'readlink' && rv > 0 ? previewBytes(this.buf, rv) : ''}`, ret, this.ctx, this.ra); }
  }));
  hookExport('read', {
    onEnter(args) { this.fd = args[0].toInt32(); this.buf = args[1]; this.path = fdPaths[this.fd] || '<unknown>'; this.ctx = this.context; this.ra = this.returnAddress; this.doLog = zinqWindow || interestingPath(this.path); },
    onLeave(ret) { const rv = ret.toInt32(); if (this.doLog) logNativeApi.call(this, 'read', `fd=${this.fd} path=${this.path}${rv > 0 ? previewBytes(this.buf, rv) : ''}`, ret, this.ctx, this.ra); }
  });
}

function startStalkerForZinq() {
  if (zinqTid === null) return;
  try {
    Stalker.follow(zinqTid, {
      events: { call: true, ret: false, exec: false, block: false, compile: false },
      onCallSummary(summary) {
        Object.keys(summary).forEach(k => {
          const addr = ptr(k);
          const count = summary[k];
          const mi = moduleInfo(addr);
          if (/lib(dpboot|dexprotector|alice|art|c|log|dl)\.so|base\.apk|<anonymous>/.test(mi)) log(`zInq callSummary count=${count} target=${describeAddress(addr)}`);
        });
      }
    });
    log(`Stalker follow started for zInq tid=${zinqTid} call summaries only`);
  } catch (e) { log(`Stalker follow failed: ${e}`); }
}
function stopStalkerForZinq() { if (zinqTid === null) return; try { Stalker.unfollow(zinqTid); Stalker.garbageCollect(); log(`Stalker follow stopped for zInq tid=${zinqTid}`); } catch (e) { log(`Stalker stop failed: ${e}`); } }

function maybeHookNativeMethod(name, fn) {
  const key = `${name}@${fn}`;
  if (hookedNativeMethods[key]) return;
  hookedNativeMethods[key] = true;
  Interceptor.attach(fn, {
    onEnter(args) {
      if (name !== 'zInq') return;
      zinqDepth += 1; zinqWindow = true; zinqTid = tid(); zinqStartedAt = Date.now();
      log(`native zInq ENTER fn=${describeAddress(fn)} caller=${describeAddress(this.returnAddress)} env=${args[0]} clazzOrThis=${args[1]} arg0=${args[2]}\n  bt=${nativeBacktrace(this.context)}`);
      startStalkerForZinq();
    },
    onLeave(ret) {
      if (name !== 'zInq') return;
      stopStalkerForZinq();
      log(`native zInq LEAVE ret=${ret} durationMs=${Date.now() - zinqStartedAt}`);
      zinqDepth -= 1; if (zinqDepth <= 0) { zinqDepth = 0; zinqWindow = false; zinqTid = null; }
    }
  });
  log(`hooked registered native ${name} @ ${describeAddress(fn)}`);
}

function installRegisterNativesHook() {
  const art = Process.findModuleByName('libart.so');
  if (!art) { log('libart.so unavailable; cannot observe RegisterNatives'); return; }
  art.enumerateSymbols().filter(s => s.name.indexOf('RegisterNatives') >= 0 && s.name.indexOf('CheckJNI') < 0).forEach(s => {
    Interceptor.attach(s.address, {
      onEnter(args) {
        this.rows = [];
        const env = Java.vm.getEnv();
        const clsName = (() => { try { return env.getClassName(args[1]); } catch (e) { return `<class failed: ${e}>`; } })();
        const count = args[3].toInt32();
        const sz = Process.pointerSize * 3;
        for (let i = 0; i < count; i += 1) {
          const entry = args[2].add(i * sz);
          const name = pstr(entry.readPointer());
          const sig = pstr(entry.add(Process.pointerSize).readPointer());
          const fn = entry.add(Process.pointerSize * 2).readPointer();
          if (clsName.indexOf(PKG) >= 0 || clsName === PMA) this.rows.push(`${clsName}.${name}${sig} fn=${describeAddress(fn)}`);
          if (clsName === PMA && name === 'zInq') { nativeMethods.zInq = { signature: sig, fn: safe(fn), owner: moduleInfo(fn) }; maybeHookNativeMethod(name, fn); }
        }
      },
      onLeave(ret) { this.rows.forEach(r => log(`RegisterNatives ret=${ret} ${r}`)); }
    });
    log(`hooked RegisterNatives candidate ${s.name} @ ${describeAddress(s.address)}`);
  });
}

Java.perform(function () {
  Throwable = Java.use('java.lang.Throwable');
  JavaThread = Java.use('java.lang.Thread');
  installRegisterNativesHook();
  installNativeApiHooks();

  const PMAClass = Java.use(PMA);
  PMAClass.zInq.overloads.forEach(ov => {
    ov.implementation = function () {
      zinqWindow = true; zinqDepth += 1;
      log(`Java zInq ENTER argc=${arguments.length} nativeMapping=${JSON.stringify(nativeMethods)}\nJava stack:\n${javaStack()}`);
      try {
        const r = ov.apply(this, arguments);
        log(`Java zInq RETURN ${safe(r)}`);
        return r;
      } catch (e) {
        log(`Java zInq THROW ${safe(e)} message=${e && e.getMessage ? safe(e.getMessage()) : '<no-message>'}\nJava stack:\n${javaStack()}`);
        throw e;
      } finally {
        zinqDepth -= 1; if (zinqDepth <= 0) { zinqDepth = 0; zinqWindow = false; }
      }
    };
  });

  const RuntimeException = Java.use('java.lang.RuntimeException');
  RuntimeException.$init.overload('java.lang.String').implementation = function (s) {
    const r = this.$init(s);
    if (safe(s).indexOf('DP:') >= 0) log(`RuntimeException(String) DP message=${safe(s)} nativeMapping=${JSON.stringify(nativeMethods)}\nJava stack:\n${javaStack()}`);
    return r;
  };

  log('read-only native zInq observer installed');
});
