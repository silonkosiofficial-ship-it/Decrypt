'use strict';

/*
 * Read-only native execution-path observer for DP:786 inside
 * ProtectedMyApplication.zInq(Object).
 *
 * Question answered:
 *   Which native basic blocks/calls execute on the startup thread immediately
 *   before RuntimeException("DP:786") is constructed/thrown?
 *
 * Safety:
 *   - Does not patch memory or instructions.
 *   - Does not attach to/replace zInq's native pointer.
 *   - Does not alter arguments, return values, or exceptions.
 *   - Java hooks call the original implementation and rethrow original errors.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv \
 *     -l tools/frida/npv_zinq_native_execution_path_observer.js
 */

const TAG = 'npv-zinq-native-execution-path-observer';
const APP_CLASS = 'com.napsternetlabs.napsternetv.ProtectedMyApplication';
const TARGET_MESSAGE = 'DP:786';
const MAX_EVENTS = 4096;
const MAX_DUMP = 240;

const startedAt = Date.now();
let seq = 0;
let stalkedTid = null;
let stalking = false;
let eventRing = [];
let ranges = [];
let pthreadSelf = null;
let pthreadGetnameNp = null;

function now() { return new Date().toISOString(); }
function elapsedMs() { return Date.now() - startedAt; }
function tid() { try { return Process.getCurrentThreadId(); } catch (_) { return -1; } }
function text(v) { return `${v}`; }
function log(msg) {
  seq += 1;
  console.log(`[${TAG} #${seq} ${now()} +${elapsedMs()}ms pid=${Process.id} tid=${tid()} thread=${threadName()}] ${msg}`);
}
function readCString(p) {
  try { const q = ptr(p); return q.isNull() ? '<null>' : q.readCString(); } catch (e) { return `<read-cstr-failed:${text(e)}>`; }
}
function initThreadName() {
  try { const p = Module.findExportByName(null, 'pthread_self'); if (p) pthreadSelf = new NativeFunction(p, 'pointer', []); } catch (_) {}
  try { const p = Module.findExportByName(null, 'pthread_getname_np'); if (p) pthreadGetnameNp = new NativeFunction(p, 'int', ['pointer', 'pointer', 'ulong']); } catch (_) {}
}
function threadName() {
  if (!pthreadSelf || !pthreadGetnameNp) return '<unavailable>';
  try {
    const b = Memory.alloc(64);
    b.writeByteArray(new Array(64).fill(0));
    const rc = pthreadGetnameNp(pthreadSelf(), b, 64);
    return rc === 0 ? readCString(b) : `<unavailable:rc=${rc}>`;
  } catch (e) { return `<unavailable:${text(e)}>`; }
}
function refreshRanges() {
  ranges = Process.enumerateRanges({ protection: 'r-x', coalesce: false }).map(r => {
    const m = Process.findModuleByAddress(r.base);
    return {
      base: r.base,
      size: r.size,
      end: r.base.add(r.size),
      protection: r.protection,
      file: r.file ? r.file.path : '<anonymous>',
      moduleName: m ? m.name : '<no-module>',
      modulePath: m ? m.path : '<no-module>',
      moduleBase: m ? m.base : ptr(0),
    };
  });
  log(`PROVEN_EXECUTABLE_RANGE_SNAPSHOT count=${ranges.length}`);
}
function ownership(address) {
  const a = ptr(address);
  const m = Process.findModuleByAddress(a);
  for (let i = 0; i < ranges.length; i += 1) {
    const r = ranges[i];
    if (a.compare(r.base) >= 0 && a.compare(r.end) < 0) {
      return {
        address: a,
        moduleName: m ? m.name : r.moduleName,
        modulePath: m ? m.path : r.modulePath,
        moduleBase: m ? m.base : r.moduleBase,
        moduleOffset: m ? a.sub(m.base) : '<no-module>',
        rangeBase: r.base,
        rangeEnd: r.end,
        rangeOffset: a.sub(r.base),
        protection: r.protection,
        file: r.file,
      };
    }
  }
  return { address: a, moduleName: m ? m.name : '<no-module>', modulePath: m ? m.path : '<no-module>', moduleBase: m ? m.base : ptr(0), moduleOffset: m ? a.sub(m.base) : '<no-module>', rangeBase: '<unknown>', rangeEnd: '<unknown>', rangeOffset: '<unknown>', protection: '<unknown>', file: '<unknown>' };
}
function fmtOwner(prefix, address) {
  const o = ownership(address);
  return `${prefix}=${o.address} ${prefix}Module=${o.moduleName} ${prefix}Path=${o.modulePath} ${prefix}ModuleBase=${o.moduleBase} ${prefix}ModuleOffset=${o.moduleOffset} ${prefix}Range=${o.rangeBase}-${o.rangeEnd} ${prefix}RangeOffset=${o.rangeOffset} ${prefix}Prot=${o.protection} ${prefix}File=${o.file}`;
}
function interesting(address) {
  const o = ownership(address);
  return o.file.indexOf('/base.apk') >= 0 || o.file === '<anonymous>' || o.moduleName.indexOf('libdpboot') >= 0 || o.moduleName.indexOf('libdexprotector') >= 0 || o.moduleName.indexOf('libalice') >= 0 || o.moduleName.indexOf('libart') >= 0;
}
function remember(kind, fields) {
  const rec = Object.assign({ t: now(), ms: elapsedMs(), tid: tid(), thread: threadName(), kind }, fields);
  eventRing.push(rec);
  if (eventRing.length > MAX_EVENTS) eventRing.shift();
}
function nativeBt(context) {
  try { return Thread.backtrace(context, Backtracer.ACCURATE).map(a => fmtOwner('bt', a)).join(' <= '); }
  catch (_) { try { return Thread.backtrace(context, Backtracer.FUZZY).map(a => fmtOwner('bt', a)).join(' <= '); } catch (e) { return `<bt-failed:${text(e)}>`; } }
}
function dumpRing(reason) {
  const tail = eventRing.slice(Math.max(0, eventRing.length - MAX_DUMP));
  log(`PROVEN_EVENT_RING_DUMP reason=${reason} totalBuffered=${eventRing.length} dumped=${tail.length}`);
  tail.forEach((e, i) => log(`PATH_EVENT index=${i} eventTime=${e.t} eventElapsedMs=${e.ms} eventTid=${e.tid} eventThread=${e.thread} kind=${e.kind} ${e.detail}`));
}
function startStalker(reason) {
  if (stalking) return;
  stalkedTid = tid();
  stalking = true;
  refreshRanges();
  log(`PROVEN_STALKER_START reason=${reason} stalkedTid=${stalkedTid}`);
  Stalker.follow(stalkedTid, {
    events: { call: true, ret: false, exec: false, block: true, compile: false },
    onReceive(events) {
      const parsed = Stalker.parse(events, { annotate: false, stringify: false });
      parsed.forEach(e => {
        const kind = e[0];
        const from = e[1];
        const to = e.length > 2 ? e[2] : null;
        if (from && interesting(from)) remember(kind, { detail: `${fmtOwner('from', from)}${to ? ' ' + fmtOwner('to', to) : ''}` });
        else if (to && interesting(to)) remember(kind, { detail: `${fmtOwner('from', from)} ${fmtOwner('to', to)}` });
      });
    }
  });
}
function stopStalker(reason) {
  if (!stalking) return;
  try { Stalker.unfollow(stalkedTid); Stalker.garbageCollect(); } catch (e) { log(`UNKNOWN_STALKER_STOP_ERROR reason=${reason} error=${text(e)}`); }
  log(`PROVEN_STALKER_STOP reason=${reason} stalkedTid=${stalkedTid}`);
  stalking = false;
  stalkedTid = null;
}

initThreadName();
Process.setExceptionHandler(details => {
  log(`NATIVE_EXCEPTION_OBSERVED type=${details.type} ${fmtOwner('fault', details.address)} nativeBacktrace=${nativeBt(details.context)}`);
  dumpRing('native-exception');
  return false;
});

Java.perform(() => {
  const RuntimeException = Java.use('java.lang.RuntimeException');
  RuntimeException.$init.overload('java.lang.String').implementation = function (message) {
    const s = message === null ? '<null>' : String(message);
    if (s.indexOf(TARGET_MESSAGE) >= 0) {
      log(`PROVEN_DP786_RUNTIME_EXCEPTION_CONSTRUCTOR message=${s} javaStack=${Java.use('android.util.Log').getStackTraceString(Java.use('java.lang.Exception').$new())}`);
      log(`PROVEN_DP786_NATIVE_BACKTRACE_AT_CONSTRUCTOR nativeBacktrace=${nativeBt(this.context)}`);
      dumpRing('DP:786 RuntimeException(String)');
    }
    return this.$init(message);
  };

  const App = Java.use(APP_CLASS);
  App.onCreate.implementation = function () {
    log(`PROVEN_JAVA_BOUNDARY_ONCREATE_ENTER class=${APP_CLASS}`);
    startStalker('ProtectedMyApplication.onCreate entry before native startup calls');
    try {
      const ret = this.onCreate();
      log('PROVEN_JAVA_BOUNDARY_ONCREATE_RETURN');
      stopStalker('onCreate returned');
      return ret;
    } catch (e) {
      log(`PROVEN_JAVA_BOUNDARY_ONCREATE_THROW throwable=${e}`);
      dumpRing('onCreate throw');
      stopStalker('onCreate threw');
      throw e;
    }
  };

  log(`observer installed package=${Java.use('android.app.ActivityThread').currentPackageName()} targetClass=${APP_CLASS}`);
});
