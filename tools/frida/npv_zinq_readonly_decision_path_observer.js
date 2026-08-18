'use strict';

/*
 * DP:786 read-only native decision-path observer.
 *
 * Question answered:
 *   Which native instructions, branches, calls, returns, and environment reads
 *   occur on the ProtectedMyApplication.onCreate()/zInq startup thread
 *   immediately before RuntimeException("DP:786") is created?
 *
 * Safety:
 *   - Observation only: no memory patches, no instruction changes, no bypasses.
 *   - Hooks call original functions/methods and preserve arguments/returns/errors.
 *   - No replacement of zInq, no return-value changes, no exception suppression.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv \
 *     -l tools/frida/npv_zinq_readonly_decision_path_observer.js
 */

const TAG = 'npv-zinq-readonly-decision-path-observer';
const APP_CLASS = 'com.napsternetlabs.napsternetv.ProtectedMyApplication';
const TARGET_MESSAGE = 'DP:786';
const MAX_EVENTS = 8192;
const MAX_DUMP = 320;
const startedAt = Date.now();
let seq = 0;
let stalkedTid = null;
let stalking = false;
let ranges = [];
let ring = [];
let pthreadSelf = null;
let pthreadGetnameNp = null;

function now() { return new Date().toISOString(); }
function elapsedMs() { return Date.now() - startedAt; }
function tid() { try { return Process.getCurrentThreadId(); } catch (_) { return -1; } }
function s(v) { return `${v}`; }
function log(msg) { seq += 1; console.log(`[${TAG} #${seq} ${now()} +${elapsedMs()}ms pid=${Process.id} tid=${tid()} thread=${threadName()}] ${msg}`); }
function cstr(p) { try { const q = ptr(p); return q.isNull() ? '<null>' : q.readCString(); } catch (e) { return `<cstr-failed:${s(e)}>`; } }
function initThreadName() {
  try { const p = Module.findExportByName(null, 'pthread_self'); if (p) pthreadSelf = new NativeFunction(p, 'pointer', []); } catch (_) {}
  try { const p = Module.findExportByName(null, 'pthread_getname_np'); if (p) pthreadGetnameNp = new NativeFunction(p, 'int', ['pointer', 'pointer', 'ulong']); } catch (_) {}
}
function threadName() {
  if (!pthreadSelf || !pthreadGetnameNp) return '<unavailable>';
  try { const b = Memory.alloc(64); b.writeByteArray(new Array(64).fill(0)); return pthreadGetnameNp(pthreadSelf(), b, 64) === 0 ? cstr(b) : '<unavailable>'; } catch (e) { return `<unavailable:${s(e)}>`; }
}
function refreshRanges() {
  ranges = Process.enumerateRanges({ protection: 'r-x', coalesce: false }).map(r => {
    const m = Process.findModuleByAddress(r.base);
    return { base: r.base, end: r.base.add(r.size), size: r.size, protection: r.protection, file: r.file ? r.file.path : '<anonymous>', moduleName: m ? m.name : '<no-module>', modulePath: m ? m.path : '<no-module>', moduleBase: m ? m.base : ptr(0) };
  });
  log(`PROVEN_EXECUTABLE_RANGE_SNAPSHOT count=${ranges.length}`);
}
function owner(a0) {
  const a = ptr(a0);
  const m = Process.findModuleByAddress(a);
  for (let i = 0; i < ranges.length; i += 1) {
    const r = ranges[i];
    if (a.compare(r.base) >= 0 && a.compare(r.end) < 0) return { address: a, moduleName: m ? m.name : r.moduleName, modulePath: m ? m.path : r.modulePath, moduleBase: m ? m.base : r.moduleBase, moduleOffset: m ? a.sub(m.base) : '<no-module>', rangeBase: r.base, rangeEnd: r.end, rangeOffset: a.sub(r.base), prot: r.protection, file: r.file };
  }
  return { address: a, moduleName: m ? m.name : '<no-module>', modulePath: m ? m.path : '<no-module>', moduleBase: m ? m.base : ptr(0), moduleOffset: m ? a.sub(m.base) : '<no-module>', rangeBase: '<unknown>', rangeEnd: '<unknown>', rangeOffset: '<unknown>', prot: '<unknown>', file: '<unknown>' };
}
function fmt(prefix, a) { const o = owner(a); return `${prefix}=${o.address} ${prefix}Module=${o.moduleName} ${prefix}Path=${o.modulePath} ${prefix}ModuleBase=${o.moduleBase} ${prefix}ModuleOffset=${o.moduleOffset} ${prefix}Range=${o.rangeBase}-${o.rangeEnd} ${prefix}RangeOffset=${o.rangeOffset} ${prefix}Prot=${o.prot} ${prefix}File=${o.file}`; }
function important(a) {
  const o = owner(a);
  return o.file.indexOf('/base.apk') !== -1 || o.file === '<anonymous>' || /lib(dp|dex|protect|alice|art|c\+\+|c\.|dl\.)/i.test(o.moduleName);
}
function remember(kind, detail) {
  ring.push({ t: now(), ms: elapsedMs(), pid: Process.id, tid: tid(), thread: threadName(), kind, detail });
  if (ring.length > MAX_EVENTS) ring.shift();
}
function bt(ctx) { try { return Thread.backtrace(ctx, Backtracer.ACCURATE).map(a => fmt('bt', a)).join(' <= '); } catch (_) { try { return Thread.backtrace(ctx, Backtracer.FUZZY).map(a => fmt('bt', a)).join(' <= '); } catch (e) { return `<bt-failed:${s(e)}>`; } } }
function dump(reason) { const tail = ring.slice(Math.max(0, ring.length - MAX_DUMP)); log(`PROVEN_EVENT_RING_DUMP reason=${reason} totalBuffered=${ring.length} dumped=${tail.length}`); tail.forEach((e, i) => log(`PATH_EVENT index=${i} eventTime=${e.t} eventElapsedMs=${e.ms} eventPid=${e.pid} eventTid=${e.tid} eventThread=${e.thread} kind=${e.kind} ${e.detail}`)); }
function classify(insn) {
  const g = (insn.groups || []).join(',');
  if (g.indexOf('jump') !== -1 || /^b\b|^b\./.test(insn.mnemonic)) return 'branch';
  if (g.indexOf('call') !== -1 || /^bl/.test(insn.mnemonic)) return 'call';
  if (g.indexOf('ret') !== -1 || /^ret$/.test(insn.mnemonic)) return 'ret';
  return null;
}
function start(reason) {
  if (stalking) return;
  stalkedTid = tid(); stalking = true; refreshRanges(); log(`PROVEN_STALKER_START reason=${reason} stalkedTid=${stalkedTid}`);
  Stalker.follow(stalkedTid, { transform(iterator) {
    let insn;
    while ((insn = iterator.next()) !== null) {
      const kind = classify(insn);
      if (kind !== null) {
        const address = insn.address; const text = `${insn.mnemonic} ${insn.opStr}`;
        iterator.putCallout(function (context) {
          if (important(address) || important(context.pc)) remember(kind, `${fmt('insn', address)} mnemonic="${text}" pcAtCallout=${fmt('pc', context.pc)} lr=${fmt('lr', context.lr)} nativeBacktrace=${bt(context)}`);
        });
      }
      iterator.keep();
    }
  }});
}
function stop(reason) { if (!stalking) return; try { Stalker.unfollow(stalkedTid); Stalker.garbageCollect(); } catch (e) { log(`UNKNOWN_STALKER_STOP_ERROR reason=${reason} error=${s(e)}`); } log(`PROVEN_STALKER_STOP reason=${reason} stalkedTid=${stalkedTid}`); stalking = false; stalkedTid = null; }
function hookExport(name, ret, args, render) {
  const p = Module.findExportByName(null, name); if (!p) return;
  Interceptor.attach(p, { onEnter(argv) { if (stalking && tid() === stalkedTid) { this.npv = true; this.argv = argv; this.bt = bt(this.context); } }, onLeave(rv) { if (this.npv) remember(`env-${name}`, `${fmt('api', p)} return=${rv} ${render ? render(this.argv, rv) : ''} nativeBacktrace=${this.bt}`); } });
  log(`PROVEN_ENV_HOOK_INSTALLED name=${name} ${fmt('api', p)}`);
}

initThreadName();
Process.setExceptionHandler(details => { log(`NATIVE_EXCEPTION_OBSERVED type=${details.type} ${fmt('fault', details.address)} nativeBacktrace=${bt(details.context)}`); dump('native-exception'); return false; });
hookExport('__system_property_get', 'int', ['pointer', 'pointer'], (a, rv) => `key=${cstr(a[0])} value=${cstr(a[1])}`);
hookExport('openat', 'int', ['int', 'pointer', 'int', 'int'], a => `path=${cstr(a[1])}`);
hookExport('open', 'int', ['pointer', 'int'], a => `path=${cstr(a[0])}`);
hookExport('access', 'int', ['pointer', 'int'], a => `path=${cstr(a[0])}`);
hookExport('readlinkat', 'int', ['int', 'pointer', 'pointer', 'ulong'], (a, rv) => `path=${cstr(a[1])} target=${rv.toInt32() > 0 ? cstr(a[2]) : '<unread>'}`);

Java.perform(() => {
  const Log = Java.use('android.util.Log');
  const Exception = Java.use('java.lang.Exception');
  const RuntimeException = Java.use('java.lang.RuntimeException');
  RuntimeException.$init.overload('java.lang.String').implementation = function (message) {
    const msg = message === null ? '<null>' : String(message);
    if (msg.indexOf(TARGET_MESSAGE) !== -1) { log(`PROVEN_DP786_RUNTIME_EXCEPTION_CONSTRUCTOR message=${msg} javaStack=${Log.getStackTraceString(Exception.$new())}`); dump('DP:786 RuntimeException(String)'); }
    return this.$init(message);
  };
  const App = Java.use(APP_CLASS);
  App.onCreate.implementation = function () {
    log(`PROVEN_JAVA_BOUNDARY_ONCREATE_ENTER class=${APP_CLASS}`); start('ProtectedMyApplication.onCreate entry before zInq');
    try { const ret = this.onCreate(); log('PROVEN_JAVA_BOUNDARY_ONCREATE_RETURN'); stop('onCreate returned'); return ret; }
    catch (e) { log(`PROVEN_JAVA_BOUNDARY_ONCREATE_THROW throwable=${e}`); dump('onCreate throw'); stop('onCreate threw'); throw e; }
  };
  log(`observer installed package=${Java.use('android.app.ActivityThread').currentPackageName()} targetClass=${APP_CLASS}`);
});
