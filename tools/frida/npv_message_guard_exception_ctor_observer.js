'use strict';

/*
 * Read-only MessageGuardException constructor observer for zInq DP:786.
 *
 * Scope is intentionally limited to MessageGuardException constructors. This
 * script does not hook zInq, replace native functions, alter return values,
 * suppress exceptions, or patch memory. Each constructor hook logs evidence at
 * constructor entry, calls the original constructor unchanged, and lets any
 * original exception propagate naturally.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_message_guard_exception_ctor_observer.js
 */

const TAG = 'npv-mge-ctor-observer';
const PKG = 'com.napsternetlabs.napsternetv';
const MGE = `${PKG}.MessageGuardException`;
const startedAt = Date.now();
let seq = 0;
let JavaThread;
let Throwable;
let Log;

function safeString(value) {
  try {
    if (value === null) return '<null>';
    if (value === undefined) return '<undefined>';
    return String(value);
  } catch (e) {
    return `<string failed: ${e}>`;
  }
}

function isoNow() {
  return new Date().toISOString();
}

function elapsedMs() {
  return Date.now() - startedAt;
}

function currentTid() {
  try {
    return Process.getCurrentThreadId();
  } catch (e) {
    return `<tid unavailable: ${e}>`;
  }
}

function javaThreadName() {
  try {
    return safeString(JavaThread.currentThread().getName());
  } catch (e) {
    return `<java thread unavailable: ${e}>`;
  }
}

function log(message) {
  seq += 1;
  console.log(`[${TAG} #${seq} ts=${isoNow()} +${elapsedMs()}ms pid=${Process.id} tid=${currentTid()} javaThread=${javaThreadName()}] ${message}`);
}

function describeJavaArg(value) {
  if (value === null || value === undefined) return safeString(value);

  let className = '<class unavailable>';
  let message = '<message unavailable>';
  let valueString = safeString(value);

  try { className = safeString(value.getClass().getName()); } catch (_) {}
  try {
    if (Java.cast(value, Throwable)) message = safeString(value.getMessage());
  } catch (_) {}

  return `class=${className} message=${message} value=${valueString}`;
}

function exceptionMessageFromArgs(args) {
  if (args.length === 0) return '<no constructor arguments>';
  const parts = [];
  for (let i = 0; i < args.length; i += 1) {
    parts.push(`arg${i}=${describeJavaArg(args[i])}`);
  }
  return parts.join(' | ');
}

function describeRange(range) {
  if (range === null) return 'range=<none>';
  let fileText = '<none>';
  if (range.file !== null && range.file !== undefined) {
    const fileParts = [];
    try { fileParts.push(`path=${safeString(range.file.path)}`); } catch (_) {}
    try { fileParts.push(`offset=${range.file.offset}`); } catch (_) {}
    try { fileParts.push(`size=${range.file.size}`); } catch (_) {}
    fileText = fileParts.length > 0 ? fileParts.join(',') : safeString(range.file);
  }
  return `rangeBase=${range.base} rangeSize=${range.size} protection=${range.protection} rangeFile=${fileText}`;
}

function describeAddress(address, index) {
  const module = Process.findModuleByAddress(address);
  const range = Process.findRangeByAddress(address);
  const moduleName = module ? module.name : '<none>';
  const modulePath = module ? module.path : '<none>';
  const moduleBase = module ? module.base : '<none>';
  const offset = module ? address.sub(module.base) : '<none>';
  return `  #${index} address=${address} moduleName=${moduleName} modulePath=${modulePath} moduleBase=${moduleBase} offset=${offset} ${describeRange(range)}`;
}

function nativeBacktrace(context) {
  try {
    let frames;
    if (context !== null && context !== undefined) {
      frames = globalThis.Thread.backtrace(context, Backtracer.ACCURATE);
    } else {
      frames = globalThis.Thread.backtrace(Backtracer.ACCURATE);
    }
    if (frames.length === 0) return '  <empty native backtrace>';
    return frames.map(describeAddress).join('\n');
  } catch (e) {
    return `  <native backtrace unavailable: ${e}>`;
  }
}

function javaStack() {
  try {
    return safeString(Log.getStackTraceString(Throwable.$new()));
  } catch (e) {
    return `<java stack unavailable: ${e}>`;
  }
}

function overloadLabel(overload) {
  return `MessageGuardException.<init>(${overload.argumentTypes.map(t => t.className).join(',')})`;
}

Java.perform(function () {
  JavaThread = Java.use('java.lang.Thread');
  Throwable = Java.use('java.lang.Throwable');
  Log = Java.use('android.util.Log');

  const MessageGuardException = Java.use(MGE);

  MessageGuardException.$init.overloads.forEach(function (overload) {
    const label = overloadLabel(overload);
    overload.implementation = function () {
      log(`${label} ENTER exceptionMessage=${exceptionMessageFromArgs(arguments)}\nnativeBacktrace:\n${nativeBacktrace(this.context)}\njavaStackSecondary:\n${javaStack()}`);
      return overload.apply(this, arguments);
    };
    log(`installed constructor observer for ${label}`);
  });
});
