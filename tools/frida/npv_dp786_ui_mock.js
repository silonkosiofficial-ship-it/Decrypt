'use strict';

/*
 * DP:786 staging UI mock.
 *
 * Purpose:
 *   Let an authorized staging/test run continue to the normal UI after the
 *   already-observed ProtectedMyApplication.zInq(Object) DP:786 startup guard
 *   failure, so UI automation can proceed.
 *
 * Scope and safety:
 *   - Runtime-only Frida mock; no APK, native memory, or instruction patching.
 *   - Does not replace zInq, change native return values, or spoof properties.
 *   - Only suppresses the Java wrapper throw for Throwable messages containing
 *     the exact DP:786 / DP: 786 startup code.
 *   - Non-DP:786 failures are delegated to the original guard wrapper.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv \
 *     -l tools/frida/npv_dp786_ui_mock.js
 */

const TAG = 'npv-dp786-ui-mock';
const WRAPPER_CLASS = 'com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication';
const RUNTIME_CLASS = 'java.lang.RuntimeException';
const THROWABLE_CLASS = 'java.lang.Throwable';
const CONTEXT_CLASS = 'android.content.Context';
const STRING_CLASS = 'java.lang.String';

let seq = 0;
const startedAt = Date.now();

function now() { return new Date().toISOString(); }
function elapsedMs() { return Date.now() - startedAt; }
function tid() { try { return Process.getCurrentThreadId(); } catch (_) { return -1; } }
function log(message) {
  seq += 1;
  console.log(`[${TAG} #${seq} ${now()} +${elapsedMs()}ms pid=${Process.id} tid=${tid()}] ${message}`);
}
function safeString(value) {
  try { return value === null || value === undefined ? '<null>' : String(value); }
  catch (error) { return `<string-failed:${error}>`; }
}
function throwableMessage(throwable) {
  try {
    if (throwable === null || throwable === undefined) return '<null>';
    const message = throwable.getMessage();
    return message === null ? '<null>' : String(message);
  } catch (error) { return `<message-failed:${error}>`; }
}
function isDp786(throwable) {
  const message = throwableMessage(throwable);
  return message.indexOf('DP:786') !== -1 || message.indexOf('DP: 786') !== -1;
}

Java.perform(() => {
  const Log = Java.use('android.util.Log');
  const Exception = Java.use('java.lang.Exception');
  const RuntimeException = Java.use(RUNTIME_CLASS);
  const Wrapper = Java.use(WRAPPER_CLASS);

  RuntimeException.$init.overload(STRING_CLASS).implementation = function dp786RuntimeExceptionObserver(message) {
    const msg = safeString(message);
    if (msg.indexOf('DP:786') !== -1 || msg.indexOf('DP: 786') !== -1) {
      log(`OBSERVED_DP786_RUNTIME_EXCEPTION message=${msg} javaStack=${Log.getStackTraceString(Exception.$new())}`);
    }
    return this.$init(message);
  };

  const fAHytsI = Wrapper.fAHytsI.overload(CONTEXT_CLASS, THROWABLE_CLASS, STRING_CLASS);
  fAHytsI.implementation = function dp786UiMock(context, throwable, id) {
    if (isDp786(throwable)) {
      log(`MOCKED_DP786_GUARD_WRAPPER method=fAHytsI action=return-without-security-activity-or-throw cause=${throwable} causeMessage=${throwableMessage(throwable)} id=${safeString(id)}`);
      return;
    }
    return fAHytsI.call(this, context, throwable, id);
  };

  log(`installed DP:786 UI mock target=${WRAPPER_CLASS}.fAHytsI`);
});
