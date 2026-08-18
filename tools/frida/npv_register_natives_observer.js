'use strict';

/*
 * Read-only JNI RegisterNatives observer for ProtectedMyApplication.zInq.
 *
 * Purpose:
 *   Prove the exact native module/address registered for:
 *   com/napsternetlabs/napsternetv/ProtectedMyApplication.zInq(Ljava/lang/Object;)V
 *
 * This script only observes RegisterNatives calls. It does not replace native
 * functions, patch code, change return values, suppress exceptions, or modify
 * APK/app behavior.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_register_natives_observer.js --no-pause
 */

const TAG = 'npv-register-natives-observer';
const TARGET_CLASS_SLASH = 'com/napsternetlabs/napsternetv/ProtectedMyApplication';
const TARGET_METHOD = 'zInq';
const TARGET_SIG = '(Ljava/lang/Object;)V';
const CAPTURE_ALL_REGISTRATIONS = true;

const startedAt = Date.now();
let seq = 0;
let JavaThread = null;

function now() { return new Date().toISOString(); }
function elapsedMs() { return Date.now() - startedAt; }
function tid() { try { return Process.getCurrentThreadId(); } catch (_) { return '?'; } }
function safe(v) { try { return String(v); } catch (e) { return `<string failed: ${e}>`; } }
function cstr(p) {
  try {
    const q = ptr(p);
    return q.isNull() ? '<null>' : q.readCString();
  } catch (e) {
    return `<cstr failed: ${e}>`;
  }
}
function threadName() {
  try { return JavaThread ? safe(JavaThread.currentThread().getName()) : '<java-unavailable>'; } catch (_) { return '<java-unavailable>'; }
}
function processName() {
  try { return Java.available ? safe(Java.use('android.app.ActivityThread').currentProcessName()) : '<java-unavailable>'; } catch (_) { return '<process unavailable>'; }
}
function log(msg) {
  seq += 1;
  console.log(`[${TAG} #${seq} ${now()} +${elapsedMs()}ms pid=${Process.id} tid=${tid()} jthread=${threadName()} process=${processName()}] ${msg}`);
}
function normalizeClassName(name) { return safe(name).replace(/\./g, '/'); }
function moduleDetails(addr) {
  try {
    const p = ptr(addr);
    const m = Process.findModuleByAddress(p);
    if (!m) return { name: '<no-module>', path: '<no-module>', base: ptr('0'), offset: '<no-module>' };
    return { name: m.name, path: m.path, base: m.base, offset: p.sub(m.base) };
  } catch (e) {
    return { name: `<module failed: ${e}>`, path: `<module failed: ${e}>`, base: ptr('0'), offset: '<module failed>' };
  }
}
function formatModule(prefix, addr) {
  const m = moduleDetails(addr);
  return `${prefix}=${ptr(addr)} ${prefix}Module=${m.name} ${prefix}ModulePath=${m.path} ${prefix}ModuleBase=${m.base} ${prefix}ModuleOffset=${m.offset}`;
}
function nativeBacktrace(ctx) {
  try {
    return Thread.backtrace(ctx, Backtracer.ACCURATE).map(a => {
      const m = moduleDetails(a);
      return `${a} ${m.name}+${m.offset}`;
    }).join(' <= ');
  } catch (_) {
    try {
      return Thread.backtrace(ctx, Backtracer.FUZZY).map(a => {
        const m = moduleDetails(a);
        return `${a} ${m.name}+${m.offset}`;
      }).join(' <= ');
    } catch (e) {
      return `<backtrace failed: ${e}>`;
    }
  }
}
function getClassName(env, klass) {
  try { return env.getClassName(klass); } catch (e) { return `<class failed: ${e}>`; }
}
function readMethods(methodsPtr, count) {
  const out = [];
  const entrySize = Process.pointerSize * 3;
  for (let i = 0; i < count; i += 1) {
    const entry = methodsPtr.add(i * entrySize);
    const name = cstr(entry.readPointer());
    const sig = cstr(entry.add(Process.pointerSize).readPointer());
    const fn = entry.add(Process.pointerSize * 2).readPointer();
    out.push({ index: i, name, sig, fn });
  }
  return out;
}
function isRegisterNativesSymbol(s) {
  return s.name.indexOf('RegisterNatives') >= 0 &&
    s.name.indexOf('CheckJNI') < 0 &&
    s.name.indexOf('Trace') < 0;
}

function installRegisterNativesObserver() {
  const art = Process.findModuleByName('libart.so');
  if (!art) {
    log('UNKNOWN: libart.so is not loaded; RegisterNatives hook was not installed');
    return;
  }

  const symbols = art.enumerateSymbols().filter(isRegisterNativesSymbol);
  log(`PROVEN: scanning libart.so for RegisterNatives candidates found=${symbols.length} libartBase=${art.base} libartPath=${art.path}`);

  symbols.forEach(symbol => {
    try {
      Interceptor.attach(symbol.address, {
        onEnter(args) {
          this.symbol = symbol.name;
          this.symbolAddress = symbol.address;
          this.caller = this.returnAddress;
          this.bt = nativeBacktrace(this.context);
          this.records = [];

          let count = 0;
          try { count = args[3].toInt32(); } catch (e) { this.records.push({ error: `count read failed: ${e}` }); return; }

          let className = '<unavailable>';
          try { className = getClassName(Java.vm.getEnv(), args[1]); } catch (e) { className = `<env unavailable: ${e}>`; }
          const classSlash = normalizeClassName(className);
          const isTargetClass = classSlash === TARGET_CLASS_SLASH;
          const methods = readMethods(args[2], count);

          methods.forEach(m => {
            const isTargetMethod = isTargetClass && m.name === TARGET_METHOD && m.sig === TARGET_SIG;
            if (CAPTURE_ALL_REGISTRATIONS || isTargetClass || isTargetMethod) {
              this.records.push({ className, classSlash, count, method: m, isTargetClass, isTargetMethod });
            }
          });
        },
        onLeave(retval) {
          this.records.forEach(r => {
            if (r.error) {
              log(`RegisterNatives READ_ERROR symbol=${this.symbol} symbolAddress=${this.symbolAddress} ${formatModule('caller', this.caller)} error=${r.error} ret=${retval}`);
              return;
            }
            const m = r.method;
            const level = r.isTargetMethod ? 'PROVEN_ZINQ_REGISTRATION' : (r.isTargetClass ? 'TARGET_CLASS_REGISTRATION' : 'REGISTRATION');
            log(`${level} symbol=${this.symbol} symbolAddress=${this.symbolAddress} ret=${retval} ${formatModule('caller', this.caller)} class=${r.classSlash} classReported=${r.className} method=${m.name} signature=${m.sig} nativePointer=${m.fn} ${formatModule('native', m.fn)} methodIndex=${m.index} methodCount=${r.count} nativeBacktrace=${this.bt}`);
          });
        }
      });
      log(`installed RegisterNatives observer symbol=${symbol.name} address=${symbol.address}`);
    } catch (e) {
      log(`failed to attach RegisterNatives observer symbol=${symbol.name} address=${symbol.address} error=${e}`);
    }
  });
}

Java.perform(function () {
  try { JavaThread = Java.use('java.lang.Thread'); } catch (_) {}
  log(`observer starting targetClass=${TARGET_CLASS_SLASH} targetMethod=${TARGET_METHOD}${TARGET_SIG} captureAll=${CAPTURE_ALL_REGISTRATIONS}`);
  installRegisterNativesObserver();
});
