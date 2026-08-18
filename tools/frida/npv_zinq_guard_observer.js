'use strict';

/*
 * Read-only guard observer for ProtectedMyApplication startup DP:786 failures.
 *
 * Scope is intentionally narrow: ProtectedMyApplication.onCreate(),
 * ProtectedMyApplication.zInq(Object), MessageGuardException constructors, and the
 * Java wrapper methods that create/throw MessageGuardException. Every hook calls
 * the original implementation, preserves return values, and rethrows original
 * exceptions.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_zinq_guard_observer.js
 */

const TAG = 'npv-zinq-guard-observer';
const PKG = 'com.napsternetlabs.napsternetv';
const PMA = `${PKG}.ProtectedMyApplication`;
const WRAPPER = `${PKG}.ProtectedMyApplication$ProtectedMyApplication`;
const MGE = `${PKG}.MessageGuardException`;
const startedAt = Date.now();
let seq = 0;
let Throwable;
let Thread;
let Log;

function safe(v) {
  try { return String(v); } catch (e) { return `<string failed: ${e}>`; }
}

function now() { return new Date().toISOString(); }
function elapsedMs() { return Date.now() - startedAt; }
function jthread() {
  try { return safe(Thread.currentThread().getName()); } catch (e) { return '<thread unavailable>'; }
}
function proc() {
  try {
    const ActivityThread = Java.use('android.app.ActivityThread');
    return safe(ActivityThread.currentProcessName());
  } catch (e) { return '<process unavailable>'; }
}
function stack() {
  try { return safe(Log.getStackTraceString(Throwable.$new())); } catch (e) { return `<stack unavailable: ${e}>`; }
}
function throwableSummary(t) {
  if (t === null || t === undefined) return '<null>';
  let cls = '<class unavailable>';
  let msg = '<message unavailable>';
  let localized = '<localized unavailable>';
  try { cls = safe(t.getClass().getName()); } catch (_) {}
  try { msg = safe(t.getMessage()); } catch (_) {}
  try { localized = safe(t.getLocalizedMessage()); } catch (_) {}
  return `class=${cls} message=${msg} localized=${localized} value=${safe(t)}`;
}
function log(msg) {
  seq += 1;
  console.log(`[${TAG} #${seq} ${now()} +${elapsedMs()}ms thread=${jthread()} process=${proc()}] ${msg}`);
}
function byteArrayPreview(obj) {
  if (obj === null || obj === undefined) return '<null>';
  try {
    const className = safe(obj.getClass().getName());
    if (className !== '[B') return `class=${className} value=${safe(obj)}`;
    const arr = Java.cast(obj, Java.use('[B'));
    const n = Math.min(arr.length, 64);
    const hex = [];
    for (let i = 0; i < n; i += 1) hex.push(('0' + (((arr[i] | 0) + 256) & 255).toString(16)).slice(-2));
    return `class=[B length=${arr.length} hex64=${hex.join('')}${arr.length > n ? ` truncated=+${arr.length - n}` : ''}`;
  } catch (e) { return `<arg preview failed: ${e}>`; }
}
function installMethodHook(klass, methodName, label) {
  try {
    klass[methodName].overloads.forEach(ov => {
      ov.implementation = function () {
        log(`${label}.${methodName} ENTER argc=${arguments.length} args=${Array.prototype.map.call(arguments, safe).join(' | ')}\nstack:\n${stack()}`);
        try {
          const ret = ov.apply(this, arguments);
          log(`${label}.${methodName} RETURN ${safe(ret)}`);
          return ret;
        } catch (e) {
          log(`${label}.${methodName} THROW ${throwableSummary(e)}\nstack at catch:\n${stack()}`);
          throw e;
        }
      };
    });
    log(`installed ${label}.${methodName} observer`);
  } catch (e) { log(`could not install ${label}.${methodName}: ${e}`); }
}

Java.perform(function () {
  Throwable = Java.use('java.lang.Throwable');
  Thread = Java.use('java.lang.Thread');
  Log = Java.use('android.util.Log');

  const Pma = Java.use(PMA);
  const onCreate = Pma.onCreate.overload();
  onCreate.implementation = function () {
    log(`ProtectedMyApplication.onCreate ENTER this=${safe(this)}\nstack:\n${stack()}`);
    try {
      const ret = onCreate.call(this);
      log(`ProtectedMyApplication.onCreate RETURN ${safe(ret)}`);
      return ret;
    } catch (e) {
      log(`ProtectedMyApplication.onCreate THROW ${throwableSummary(e)}\nstack at catch:\n${stack()}`);
      throw e;
    }
  };

  Pma.zInq.overloads.forEach(ov => {
    ov.implementation = function () {
      log(`ProtectedMyApplication.zInq ENTER argc=${arguments.length} arg0=${arguments.length > 0 ? byteArrayPreview(arguments[0]) : '<none>'}\nstack:\n${stack()}`);
      try {
        const ret = ov.apply(this, arguments);
        log(`ProtectedMyApplication.zInq RETURN ${safe(ret)}`);
        return ret;
      } catch (e) {
        log(`ProtectedMyApplication.zInq THROW ${throwableSummary(e)}\nstack at catch:\n${stack()}`);
        throw e;
      }
    };
  });
  log('installed ProtectedMyApplication.onCreate/zInq observers');

  const Wrapper = Java.use(WRAPPER);
  ['j', 'qscdn', 'fAHytsI', 'ye'].forEach(name => installMethodHook(Wrapper, name, 'ProtectedMyApplication$ProtectedMyApplication'));

  const Mge = Java.use(MGE);
  Mge.$init.overload('java.lang.Throwable').implementation = function (cause) {
    log(`MessageGuardException.<init>(Throwable) ENTER cause=${throwableSummary(cause)} fingerprint=${safe(Mge.fingerprint.value)}\nstack:\n${stack()}`);
    try {
      const ret = this.$init(cause);
      log(`MessageGuardException.<init>(Throwable) RETURN this=${safe(this)} message=${safe(this.getMessage())}`);
      return ret;
    } catch (e) {
      log(`MessageGuardException.<init>(Throwable) THROW ${throwableSummary(e)}`);
      throw e;
    }
  };
  Mge.$init.overload('java.lang.Throwable', 'java.lang.String').implementation = function (cause, id) {
    log(`MessageGuardException.<init>(Throwable,String) ENTER cause=${throwableSummary(cause)} id=${safe(id)} fingerprint=${safe(Mge.fingerprint.value)}\nstack:\n${stack()}`);
    try {
      const ret = this.$init(cause, id);
      log(`MessageGuardException.<init>(Throwable,String) RETURN this=${safe(this)} message=${safe(this.getMessage())}`);
      return ret;
    } catch (e) {
      log(`MessageGuardException.<init>(Throwable,String) THROW ${throwableSummary(e)}`);
      throw e;
    }
  };
  log('installed MessageGuardException constructor observers');
});
