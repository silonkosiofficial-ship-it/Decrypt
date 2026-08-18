'use strict';

/*
 * Combined read-only RegisterNatives observer for ProtectedMyApplication.zInq.
 *
 * Purpose:
 *   Capture the zInq JNINativeMethod.fnPtr at registration time and resolve it
 *   immediately in the same process/ASLR session.
 *
 * Target:
 *   class     com/napsternetlabs/napsternetv/ProtectedMyApplication
 *   method    zInq
 *   signature (Ljava/lang/Object;)V
 *
 * This script does not hardcode runtime addresses, hook zInq, replace native
 * functions, patch code, change return values, suppress exceptions, or modify
 * APK/app behavior. It only observes RegisterNatives and reads Frida process
 * metadata for the native pointer that the app registers.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_zinq_register_natives_pointer_observer.js --no-pause
 */

const TAG = 'npv-zinq-register-natives-pointer-observer';
const TARGET_CLASS_SLASH = 'com/napsternetlabs/napsternetv/ProtectedMyApplication';
const TARGET_METHOD = 'zInq';
const TARGET_SIG = '(Ljava/lang/Object;)V';

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
function getClassName(env, klass) {
  try { return env.getClassName(klass); } catch (e) { return `<class failed: ${e}>`; }
}
function readMethods(methodsPtr, count) {
  const out = [];
  const entrySize = Process.pointerSize * 3;
  for (let i = 0; i < count; i += 1) {
    const entry = methodsPtr.add(i * entrySize);
    out.push({
      index: i,
      name: cstr(entry.readPointer()),
      sig: cstr(entry.add(Process.pointerSize).readPointer()),
      fn: entry.add(Process.pointerSize * 2).readPointer(),
    });
  }
  return out;
}
function isRegisterNativesSymbol(s) {
  return s.name.indexOf('RegisterNatives') >= 0 &&
    s.name.indexOf('CheckJNI') < 0 &&
    s.name.indexOf('Trace') < 0;
}
function moduleSummary(address) {
  try {
    const p = ptr(address);
    const moduleInfo = Process.findModuleByAddress(p);
    if (!moduleInfo) {
      return {
        found: false,
        raw: '<null>',
        name: '<no-module>',
        path: '<no-module>',
        base: '<no-module>',
        offset: '<no-module>',
      };
    }
    return {
      found: true,
      raw: safe(moduleInfo),
      name: moduleInfo.name,
      path: moduleInfo.path,
      base: moduleInfo.base,
      offset: p.sub(moduleInfo.base),
    };
  } catch (e) {
    return {
      found: false,
      raw: `<module lookup failed: ${e}>`,
      name: `<module lookup failed: ${e}>`,
      path: `<module lookup failed: ${e}>`,
      base: '<module lookup failed>',
      offset: '<module lookup failed>',
    };
  }
}
function rangeSummary(address) {
  try {
    const p = ptr(address);
    const rangeInfo = Process.findRangeByAddress(p);
    if (!rangeInfo) {
      return {
        found: false,
        raw: '<null>',
        base: '<no-range>',
        size: '<no-range>',
        protection: '<no-range>',
        file: '<no-range>',
        offset: '<no-range>',
      };
    }
    return {
      found: true,
      raw: safe(rangeInfo),
      base: rangeInfo.base,
      size: rangeInfo.size,
      protection: rangeInfo.protection,
      file: rangeInfo.file ? safe(rangeInfo.file.path || rangeInfo.file) : '<anonymous>',
      offset: p.sub(rangeInfo.base),
    };
  } catch (e) {
    return {
      found: false,
      raw: `<range lookup failed: ${e}>`,
      base: '<range lookup failed>',
      size: '<range lookup failed>',
      protection: `<range lookup failed: ${e}>`,
      file: `<range lookup failed: ${e}>`,
      offset: '<range lookup failed>',
    };
  }
}
function logPointerResolution(methodRecord, registerNativesSymbol, retval) {
  const nativePointer = methodRecord.fn;
  const moduleInfo = moduleSummary(nativePointer);
  const rangeInfo = rangeSummary(nativePointer);

  log(`PROVEN_ZINQ_REGISTER_NATIVES_POINTER symbol=${registerNativesSymbol.name} symbolAddress=${registerNativesSymbol.address} ret=${retval} class=${methodRecord.classSlash} classReported=${methodRecord.className} method=${methodRecord.name} signature=${methodRecord.sig} methodIndex=${methodRecord.index} methodCount=${methodRecord.count} nativePointer=${nativePointer} Process.findModuleByAddress(pointer)=${moduleInfo.raw} moduleFound=${moduleInfo.found} moduleName=${moduleInfo.name} modulePath=${moduleInfo.path} moduleBase=${moduleInfo.base} moduleOffset=${moduleInfo.offset} Process.findRangeByAddress(pointer)=${rangeInfo.raw} rangeFound=${rangeInfo.found} rangeBase=${rangeInfo.base} rangeSize=${rangeInfo.size} rangeOffset=${rangeInfo.offset} protection=${rangeInfo.protection} rangeFile=${rangeInfo.file}`);
}
function installRegisterNativesObserver() {
  const art = Process.findModuleByName('libart.so');
  if (!art) {
    log('UNKNOWN: libart.so is not loaded; RegisterNatives hook was not installed');
    return;
  }

  const symbols = art.enumerateSymbols().filter(isRegisterNativesSymbol);
  log(`observer starting targetClass=${TARGET_CLASS_SLASH} targetMethod=${TARGET_METHOD}${TARGET_SIG} libartBase=${art.base} libartPath=${art.path} registerNativesCandidates=${symbols.length}`);

  symbols.forEach(symbol => {
    try {
      Interceptor.attach(symbol.address, {
        onEnter(args) {
          this.symbol = symbol;
          this.matches = [];

          let count = 0;
          try { count = args[3].toInt32(); } catch (e) { log(`UNKNOWN: RegisterNatives count read failed symbol=${symbol.name} error=${e}`); return; }

          let className = '<unavailable>';
          try { className = getClassName(Java.vm.getEnv(), args[1]); } catch (e) { className = `<env unavailable: ${e}>`; }
          const classSlash = normalizeClassName(className);
          if (classSlash !== TARGET_CLASS_SLASH) return;

          const methods = readMethods(args[2], count);
          methods.forEach(m => {
            if (m.name === TARGET_METHOD && m.sig === TARGET_SIG) {
              this.matches.push({
                className,
                classSlash,
                count,
                index: m.index,
                name: m.name,
                sig: m.sig,
                fn: m.fn,
              });
            }
          });
        },
        onLeave(retval) {
          this.matches.forEach(m => logPointerResolution(m, this.symbol, retval));
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
  installRegisterNativesObserver();
});
