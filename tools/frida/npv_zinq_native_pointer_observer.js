'use strict';

/*
 * Read-only native zInq pointer observer for DP:786 correlation.
 *
 * Goal: determine which previously captured ProtectedMyApplication.zInq(Object)
 * native implementation executes during startup and which implementation is on
 * the path that creates/throws java.lang.RuntimeException("DP: 786 ...").
 *
 * This script only observes. It does not replace zInq, modify arguments, modify
 * return values, suppress exceptions, patch memory, or change APK/native code.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv \
 *     -l tools/frida/npv_zinq_native_pointer_observer.js --no-pause
 */

const TAG = 'npv-zinq-native-pointer-observer';
const PKG = 'com.napsternetlabs.napsternetv';
const TARGETS = [
  { label: 'base.apk executable range offset 0x165e', address: ptr('0x7040c063365e') },
  { label: 'anonymous executable memory offset 0x52a20', address: ptr('0x7040c05eea20') }
];

const startedAt = Date.now();
const activeNativeCalls = [];
let seq = 0;
let JavaThread = null;
let ActivityThread = null;
let RuntimeException = null;
let Throwable = null;
let AndroidLog = null;

function safe(v) {
  try { return String(v); } catch (e) { return `<string failed: ${e}>`; }
}

function now() { return new Date().toISOString(); }
function elapsedMs() { return Date.now() - startedAt; }
function pid() { try { return Process.id; } catch (_) { return '<pid unavailable>'; } }
function tid() { try { return Process.getCurrentThreadId(); } catch (_) { return '<tid unavailable>'; } }
function javaThreadName() {
  try { return JavaThread ? safe(JavaThread.currentThread().getName()) : '<java unavailable>'; } catch (_) { return '<java unavailable>'; }
}
function processName() {
  try { return ActivityThread ? safe(ActivityThread.currentProcessName()) : '<process unavailable>'; } catch (_) { return '<process unavailable>'; }
}
function log(message) {
  seq += 1;
  console.log(`[${TAG} #${seq} ${now()} +${elapsedMs()}ms pid=${pid()} tid=${tid()} jthread=${javaThreadName()} process=${processName()}] ${message}`);
}

function describeRange(address) {
  try {
    const range = Process.findRangeByAddress(ptr(address));
    if (!range) return 'range=<no range>';
    const file = range.file ? range.file.path : '<anonymous>';
    return `rangeBase=${range.base} rangeOffset=${ptr(address).sub(range.base)} rangeSize=${range.size} protection=${range.protection} file=${file}`;
  } catch (e) { return `range=<range lookup failed: ${e}>`; }
}

function describeModule(address) {
  try {
    const module = Process.findModuleByAddress(ptr(address));
    if (!module) return 'module=<no module>';
    return `module=${module.name} moduleBase=${module.base} moduleOffset=${ptr(address).sub(module.base)} modulePath=${module.path}`;
  } catch (e) { return `module=<module lookup failed: ${e}>`; }
}

function describeAddress(address) {
  return `${ptr(address)} ${describeModule(address)} ${describeRange(address)}`;
}

function nativeBacktrace(context) {
  try {
    return Thread.backtrace(context, Backtracer.ACCURATE)
      .map(addr => `${addr} ${describeModule(addr)}`)
      .join('\n  ');
  } catch (accurateError) {
    try {
      return `ACCURATE failed: ${accurateError}\nFUZZY:\n  ` + Thread.backtrace(context, Backtracer.FUZZY)
        .map(addr => `${addr} ${describeModule(addr)}`)
        .join('\n  ');
    } catch (fuzzyError) { return `<backtrace failed: ${fuzzyError}>`; }
  }
}

function javaStack() {
  try { return AndroidLog.getStackTraceString(Throwable.$new()); } catch (e) { return `<java stack unavailable: ${e}>`; }
}

function throwableSummary(t) {
  if (t === null || t === undefined) return '<null>';
  let cls = '<class unavailable>';
  let msg = '<message unavailable>';
  try { cls = safe(t.getClass().getName()); } catch (_) {}
  try { msg = safe(t.getMessage()); } catch (_) {}
  return `class=${cls} message=${msg} value=${safe(t)}`;
}

function nearestActiveNativeCall() {
  if (activeNativeCalls.length === 0) return '<no active observed native zInq pointer>';
  const call = activeNativeCalls[activeNativeCalls.length - 1];
  return `activeLabel=${call.label} activeAddress=${call.address} activeDepth=${activeNativeCalls.length} activeDurationMs=${Date.now() - call.enteredAt}`;
}

function installNativePointerObserver(target) {
  try {
    Interceptor.attach(target.address, {
      onEnter(args) {
        this.enteredAt = Date.now();
        this.target = target;
        this.arg0 = args[0];
        this.arg1 = args[1];
        this.arg2 = args[2];
        activeNativeCalls.push({ label: target.label, address: target.address, enteredAt: this.enteredAt });
        log(`NATIVE_ENTER label=${target.label} address=${describeAddress(target.address)} firstArg=${this.arg0} jniEnv=${this.arg0} javaThisOrClass=${this.arg1} zInqArgObject=${this.arg2}\nbacktrace:\n  ${nativeBacktrace(this.context)}`);
      },
      onLeave(retval) {
        const duration = Date.now() - this.enteredAt;
        log(`NATIVE_LEAVE label=${this.target.label} address=${this.target.address} returnValue=${retval} durationMs=${duration}`);
        activeNativeCalls.pop();
      }
    });
    log(`installed native observer label=${target.label} address=${describeAddress(target.address)}`);
  } catch (e) {
    log(`FAILED installing native observer label=${target.label} address=${target.address}: ${e}`);
  }
}

Process.setExceptionHandler(function (details) {
  log(`NATIVE_EXCEPTION type=${details.type} address=${details.address} memory=${details.memory ? JSON.stringify(details.memory) : '<none>'} ${nearestActiveNativeCall()}\ncontext=${JSON.stringify(details.context)}\nbacktrace:\n  ${nativeBacktrace(details.context)}`);
  return false;
});

TARGETS.forEach(installNativePointerObserver);

Java.perform(function () {
  JavaThread = Java.use('java.lang.Thread');
  ActivityThread = Java.use('android.app.ActivityThread');
  RuntimeException = Java.use('java.lang.RuntimeException');
  Throwable = Java.use('java.lang.Throwable');
  AndroidLog = Java.use('android.util.Log');

  RuntimeException.$init.overloads.forEach(overload => {
    overload.implementation = function () {
      const argsText = Array.prototype.map.call(arguments, safe).join(' | ');
      const maybeMessage = arguments.length > 0 ? safe(arguments[0]) : '';
      const isDp786 = maybeMessage.indexOf('DP: 786') >= 0;
      if (isDp786) {
        log(`RUNTIME_EXCEPTION_DP786_CONSTRUCTOR_ENTER overload=(${overload.argumentTypes.map(t => t.className).join(',')}) args=${argsText} correlation=${nearestActiveNativeCall()}\njavaStack:\n${javaStack()}`);
      }
      const ret = overload.apply(this, arguments);
      if (isDp786) {
        log(`RUNTIME_EXCEPTION_DP786_CONSTRUCTOR_LEAVE this=${throwableSummary(this)} correlation=${nearestActiveNativeCall()}`);
      }
      return ret;
    };
  });
  log('installed java.lang.RuntimeException DP:786 constructor observer');
});
