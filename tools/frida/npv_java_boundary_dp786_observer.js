'use strict';

/*
 * Read-only Java boundary observer for DP:786 -> MessageGuardException_RFA6ID.
 *
 * Question answered by this experiment:
 *   Which targeted Java wrapper method enters, returns, throws, or wraps while
 *   the DP:786 RuntimeException is transformed into MessageGuardException?
 *
 * Scope constraints:
 *   - Does not hook native zInq.
 *   - Does not patch memory or modify app state.
 *   - Does not suppress exceptions.
 *   - Calls original methods unchanged and rethrows original exceptions.
 *   - Targets only the four requested Java wrapper methods plus the specific
 *     RuntimeException(String) constructor case whose message starts with
 *     "DP: 786".
 *   - Does not stringify arbitrary Throwable objects.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv \
 *     -l tools/frida/npv_java_boundary_dp786_observer.js --no-pause
 */

const TAG = 'npv-java-boundary-dp786';
const PKG = 'com.napsternetlabs.napsternetv';
const WRAPPER = `${PKG}.ProtectedMyApplication$ProtectedMyApplication`;
const TARGET_METHODS = ['qk', 'fAHytsI', 'qscdn', 'j'];
const DP786_PREFIX = 'DP: 786';
const startedAt = Date.now();
let seq = 0;
let ActivityThread = null;
let JavaThread = null;
let Throwable = null;
let Log = null;

function safeText(value) {
  try {
    if (value === null) return '<null>';
    if (value === undefined) return '<undefined>';
    return String(value);
  } catch (e) {
    return `<string unavailable: ${e}>`;
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

function threadName() {
  try {
    return safeText(JavaThread.currentThread().getName());
  } catch (e) {
    return `<thread name unavailable: ${e}>`;
  }
}

function processName() {
  try {
    return safeText(ActivityThread.currentProcessName());
  } catch (e) {
    return `<process name unavailable: ${e}>`;
  }
}

function log(message) {
  seq += 1;
  console.log(`[${TAG} #${seq} ts=${isoNow()} +${elapsedMs()}ms pid=${Process.id} tid=${currentTid()} thread=${threadName()} process=${processName()}] ${message}`);
}

function javaStack() {
  try {
    return safeText(Log.getStackTraceString(Throwable.$new()));
  } catch (e) {
    return `<java stack unavailable: ${e}>`;
  }
}

function argType(value) {
  if (value === null) return '<null>';
  if (value === undefined) return '<undefined>';
  try {
    return safeText(value.getClass().getName());
  } catch (_) {
    return typeof value;
  }
}

function argTypes(args) {
  const types = [];
  for (let i = 0; i < args.length; i += 1) types.push(argType(args[i]));
  return `[${types.join(', ')}]`;
}

function returnType(overload) {
  try {
    if (overload.returnType === null || overload.returnType === undefined) return 'void';
    return safeText(overload.returnType.className);
  } catch (e) {
    return `<return type unavailable: ${e}>`;
  }
}

function valueClass(value) {
  if (value === null) return '<null>';
  if (value === undefined) return '<undefined-or-void>';
  try {
    return safeText(value.getClass().getName());
  } catch (_) {
    return typeof value;
  }
}

function exceptionClassAndMessage(error) {
  if (error === null || error === undefined) return 'class=<null> message=<null>';
  let cls = '<class unavailable>';
  let msg = '<message unavailable>';
  try { cls = safeText(error.getClass().getName()); } catch (_) {}
  try { msg = safeText(error.getMessage()); } catch (_) {}
  return `class=${cls} message=${msg}`;
}

function runtimeExceptionMessage(args) {
  if (args.length < 1 || args[0] === null || args[0] === undefined) return null;
  return safeText(args[0]);
}

function installBoundaryMethod(klass, methodName) {
  const overloads = klass[methodName].overloads;
  overloads.forEach(function (overload) {
    const signature = `${WRAPPER}.${methodName}(${overload.argumentTypes.map(t => t.className).join(',')})`;
    overload.implementation = function () {
      log(`ENTER method=${signature} argTypes=${argTypes(arguments)} returnType=${returnType(overload)}\njavaStack:\n${javaStack()}`);
      try {
        const ret = overload.apply(this, arguments);
        log(`RETURN method=${signature} returnType=${returnType(overload)} returnValueClass=${valueClass(ret)}\njavaStack:\n${javaStack()}`);
        return ret;
      } catch (e) {
        log(`THROW method=${signature} thrown=${exceptionClassAndMessage(e)}\njavaStack:\n${javaStack()}`);
        throw e;
      }
    };
    log(`installed method observer for ${signature}`);
  });
}

Java.perform(function () {
  ActivityThread = Java.use('android.app.ActivityThread');
  JavaThread = Java.use('java.lang.Thread');
  Throwable = Java.use('java.lang.Throwable');
  Log = Java.use('android.util.Log');

  const Wrapper = Java.use(WRAPPER);
  TARGET_METHODS.forEach(function (methodName) {
    installBoundaryMethod(Wrapper, methodName);
  });

  const RuntimeException = Java.use('java.lang.RuntimeException');
  RuntimeException.$init.overload('java.lang.String').implementation = function (message) {
    const text = runtimeExceptionMessage(arguments);
    if (text !== null && text.indexOf(DP786_PREFIX) === 0) {
      log(`RuntimeException.<init>(String) DP786 ENTER message=${text}\njavaStack:\n${javaStack()}`);
    }
    return this.$init(message);
  };
  log('installed RuntimeException.<init>(String) observer filtered to DP: 786 prefix');
});
