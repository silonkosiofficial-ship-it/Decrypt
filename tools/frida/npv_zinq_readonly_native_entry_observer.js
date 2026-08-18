'use strict';

/*
 * Read-only zInq native-entry observer.
 *
 * Purpose:
 *   1. Hook libart RegisterNatives.
 *   2. Capture ProtectedMyApplication.zInq(Ljava/lang/Object;)V from the
 *      JNINativeMethod.fnPtr value registered in this same process session.
 *   3. Immediately attach a native Interceptor to that captured pointer.
 *   4. Emit telemetry only; never patch, bypass, suppress, stringify Java
 *      throwables, or call MessageGuardException methods.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv \
 *     -l tools/frida/npv_zinq_readonly_native_entry_observer.js --no-pause
 */

const TAG = 'npv-zinq-readonly-native-entry-observer';
const TARGET_CLASS_SLASH = 'com/napsternetlabs/napsternetv/ProtectedMyApplication';
const TARGET_METHOD = 'zInq';
const TARGET_SIG = '(Ljava/lang/Object;)V';
const MAX_ARG_POINTERS = 3;

const startedAt = Date.now();
let seq = 0;
let zinqAttached = false;
let pthreadSelf = null;
let pthreadGetnameNp = null;

function now() { return new Date().toISOString(); }
function elapsedMs() { return Date.now() - startedAt; }
function monotonicMs() { return Date.now(); }
function currentTid() { try { return Process.getCurrentThreadId(); } catch (_) { return '?'; } }
function text(v) { return `${v}`; }
function log(msg) {
  seq += 1;
  console.log(`[${TAG} #${seq} ${now()} +${elapsedMs()}ms pid=${Process.id} tid=${currentTid()}] ${msg}`);
}
function readCString(p) {
  try {
    const q = ptr(p);
    if (q.isNull()) return '<null>';
    return q.readCString();
  } catch (e) {
    return `<cstr-read-failed:${text(e)}>`;
  }
}
function normalizeClassName(name) { return text(name).replace(/\./g, '/'); }
function getClassName(env, klass) {
  try { return env.getClassName(klass); } catch (e) { return `<class-read-failed:${text(e)}>`; }
}
function moduleDetails(address) {
  try {
    const p = ptr(address);
    const m = Process.findModuleByAddress(p);
    if (!m) return { found: false, name: '<no-module>', path: '<no-module>', base: '<no-module>', offset: '<no-module>' };
    return { found: true, name: m.name, path: m.path, base: m.base, offset: p.sub(m.base) };
  } catch (e) {
    return { found: false, name: `<module-lookup-failed:${text(e)}>`, path: '<module-lookup-failed>', base: '<module-lookup-failed>', offset: '<module-lookup-failed>' };
  }
}
function formatAddress(label, address) {
  const m = moduleDetails(address);
  return `${label}=${ptr(address)} ${label}ModuleFound=${m.found} ${label}Module=${m.name} ${label}ModulePath=${m.path} ${label}ModuleBase=${m.base} ${label}ModuleOffset=${m.offset}`;
}
function nativeBacktrace(context) {
  try {
    return Thread.backtrace(context, Backtracer.ACCURATE).map(a => {
      const m = moduleDetails(a);
      return `${a} ${m.name}+${m.offset}`;
    }).join(' <= ');
  } catch (_) {
    try {
      return Thread.backtrace(context, Backtracer.FUZZY).map(a => {
        const m = moduleDetails(a);
        return `${a} ${m.name}+${m.offset}`;
      }).join(' <= ');
    } catch (e) {
      return `<native-backtrace-failed:${text(e)}>`;
    }
  }
}
function initThreadNameLookups() {
  try {
    const selfPtr = Module.findExportByName(null, 'pthread_self');
    if (selfPtr) pthreadSelf = new NativeFunction(selfPtr, 'pointer', []);
  } catch (_) {}
  try {
    const getNamePtr = Module.findExportByName(null, 'pthread_getname_np');
    if (getNamePtr) pthreadGetnameNp = new NativeFunction(getNamePtr, 'int', ['pointer', 'pointer', 'ulong']);
  } catch (_) {}
}
function currentThreadName() {
  if (!pthreadSelf || !pthreadGetnameNp) return '<unavailable>';
  try {
    const buf = Memory.alloc(64);
    buf.writeByteArray(new Array(64).fill(0));
    const rc = pthreadGetnameNp(pthreadSelf(), buf, 64);
    if (rc !== 0) return `<unavailable:rc=${rc}>`;
    return readCString(buf);
  } catch (e) {
    return `<unavailable:${text(e)}>`;
  }
}
function readMethods(methodsPtr, count) {
  const out = [];
  const entrySize = Process.pointerSize * 3;
  for (let i = 0; i < count; i += 1) {
    const entry = methodsPtr.add(i * entrySize);
    out.push({
      index: i,
      name: readCString(entry.readPointer()),
      sig: readCString(entry.add(Process.pointerSize).readPointer()),
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
function rawArgs(args) {
  const values = [];
  for (let i = 0; i < MAX_ARG_POINTERS; i += 1) values.push(`arg${i}=${args[i]}`);
  return values.join(' ');
}
function attachZinqNative(capturedPointer) {
  if (zinqAttached) return;
  zinqAttached = true;
  const target = ptr(capturedPointer);
  log(`PROVEN_ZINQ_POINTER_CAPTURED_AND_ATTACHING ${formatAddress('nativePointer', target)}`);

  Interceptor.attach(target, {
    onEnter(args) {
      this.started = monotonicMs();
      this.entryBacktrace = nativeBacktrace(this.context);
      log(`PROVEN_ZINQ_NATIVE_ENTRY timestamp=${now()} pid=${Process.id} tid=${currentTid()} threadName=${currentThreadName()} ${formatAddress('nativePointer', target)} ${rawArgs(args)} nativeBacktrace=${this.entryBacktrace}`);
    },
    onLeave(retval) {
      const duration = monotonicMs() - this.started;
      log(`PROVEN_ZINQ_NATIVE_LEAVE returnValue=${retval} executionTimeMs=${duration}`);
    }
  });
}
function installExceptionHandler() {
  Process.setExceptionHandler(function (details) {
    let faultAddress = '<unavailable>';
    try { faultAddress = details.address; } catch (_) {}
    let type = '<unavailable>';
    try { type = details.type; } catch (_) {}
    let bt = '<unavailable>';
    try { bt = nativeBacktrace(details.context); } catch (e) { bt = `<native-backtrace-failed:${text(e)}>`; }
    log(`NATIVE_EXCEPTION_DIAGNOSTIC type=${type} faultAddress=${faultAddress} nativeBacktrace=${bt}`);
    return false;
  });
}
function installRegisterNativesObserver() {
  const art = Process.findModuleByName('libart.so');
  if (!art) {
    log('UNKNOWN: libart.so is not loaded; RegisterNatives observer not installed');
    return;
  }
  const symbols = art.enumerateSymbols().filter(isRegisterNativesSymbol);
  log(`observer starting targetClass=${TARGET_CLASS_SLASH} targetMethod=${TARGET_METHOD}${TARGET_SIG} libartBase=${art.base} libartPath=${art.path} registerNativesCandidates=${symbols.length}`);

  symbols.forEach(symbol => {
    try {
      Interceptor.attach(symbol.address, {
        onEnter(args) {
          let count = 0;
          try { count = args[3].toInt32(); } catch (_) { return; }

          let className = '<unavailable>';
          try { className = getClassName(Java.vm.getEnv(), args[1]); } catch (e) { className = `<env-unavailable:${text(e)}>`; }
          const classSlash = normalizeClassName(className);
          if (classSlash !== TARGET_CLASS_SLASH) return;

          const methods = readMethods(args[2], count);
          methods.forEach(m => {
            if (m.name === TARGET_METHOD && m.sig === TARGET_SIG) {
              log(`PROVEN_ZINQ_REGISTRATION symbol=${symbol.name} symbolAddress=${symbol.address} class=${classSlash} method=${m.name} signature=${m.sig} methodIndex=${m.index} methodCount=${count} ${formatAddress('capturedPointer', m.fn)}`);
              attachZinqNative(m.fn);
            }
          });
        }
      });
      log(`installed RegisterNatives observer symbol=${symbol.name} address=${symbol.address}`);
    } catch (e) {
      log(`RegisterNatives attach failed symbol=${symbol.name} address=${symbol.address} error=${text(e)}`);
    }
  });
}

initThreadNameLookups();
installExceptionHandler();
Java.perform(function () {
  installRegisterNativesObserver();
});
