'use strict';

/*
 * Read-only Stalker native execution tracer for
 * ProtectedMyApplication.zInq(Ljava/lang/Object;)V.
 *
 * Purpose:
 *   1. Hook ART RegisterNatives and capture the runtime zInq native pointer.
 *   2. Do not Interceptor.attach() the captured zInq pointer.
 *   3. Start Stalker.follow(threadId) only from the Java zInq boundary, just
 *      before the original native method is invoked on the current thread.
 *   4. Record executed native instruction addresses, owning module/range,
 *      relative offsets, call targets, and branch targets until DP:786, zInq
 *      return/throw, or MAX_INSTRUCTIONS is reached.
 *
 * This observer is intentionally read-only: it does not patch APK/native memory,
 * replace functions, change registers, change arguments, change return values,
 * or suppress exceptions.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv \
 *     -l tools/frida/npv_zinq_stalker_native_execution_observer.js
 */

const TAG = 'npv-zinq-stalker-native-execution-observer';
const TARGET_CLASS_DOT = 'com.napsternetlabs.napsternetv.ProtectedMyApplication';
const TARGET_CLASS_SLASH = 'com/napsternetlabs/napsternetv/ProtectedMyApplication';
const TARGET_METHOD = 'zInq';
const TARGET_SIG = '(Ljava/lang/Object;)V';
const MAX_INSTRUCTIONS = 5000;

const startedAt = Date.now();
let seq = 0;
let JavaThread = null;
let capturedZinqPointer = null;
let trace = null;

function now() { return new Date().toISOString(); }
function elapsedMs() { return Date.now() - startedAt; }
function tid() { try { return Process.getCurrentThreadId(); } catch (_) { return '?'; } }
function safe(v) { try { return String(v); } catch (e) { return `<string-failed:${e}>`; } }
function log(msg) {
  seq += 1;
  console.log(`[${TAG} #${seq} ${now()} +${elapsedMs()}ms pid=${Process.id} tid=${tid()} thread=${threadName()}] ${msg}`);
}
function threadName() {
  try { return JavaThread ? safe(JavaThread.currentThread().getName()) : '<java-unavailable>'; } catch (_) { return '<java-unavailable>'; }
}
function cstr(p) {
  try {
    const q = ptr(p);
    return q.isNull() ? '<null>' : q.readCString();
  } catch (e) {
    return `<cstr-failed:${e}>`;
  }
}
function normalizeClassName(name) { return safe(name).replace(/\./g, '/'); }
function getClassName(env, klass) {
  try { return env.getClassName(klass); } catch (e) { return `<class-read-failed:${e}>`; }
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
    const m = Process.findModuleByAddress(p);
    if (!m) return 'moduleFound=false moduleName=<no-module> modulePath=<no-module> moduleBase=<no-module> moduleOffset=<no-module>';
    return `moduleFound=true moduleName=${m.name} modulePath=${m.path} moduleBase=${m.base} moduleOffset=${p.sub(m.base)}`;
  } catch (e) {
    return `moduleFound=false moduleError=${safe(e)}`;
  }
}
function rangeSummary(address) {
  try {
    const p = ptr(address);
    const r = Process.findRangeByAddress(p);
    if (!r) return 'rangeFound=false rangeBase=<no-range> rangeSize=<no-range> rangeOffset=<no-range> protection=<no-range> rangeFile=<no-range>';
    const file = r.file ? safe(r.file.path || r.file) : '<anonymous>';
    return `rangeFound=true rangeBase=${r.base} rangeSize=${r.size} rangeOffset=${p.sub(r.base)} protection=${r.protection} rangeFile=${file}`;
  } catch (e) {
    return `rangeFound=false rangeError=${safe(e)}`;
  }
}
function describeAddress(label, address) {
  return `${label}=${ptr(address)} ${moduleSummary(address)} ${rangeSummary(address)}`;
}
function immediateTarget(insn) {
  try {
    const groups = insn.groups || [];
    const isControl = groups.indexOf('call') >= 0 || groups.indexOf('jump') >= 0 || groups.indexOf('branch_relative') >= 0;
    if (!isControl) return null;
    const ops = insn.operands || [];
    if (ops.length === 0) return null;
    const value = ops[0].value;
    if (value === undefined || value === null) return null;
    if (typeof value === 'number') return ptr(value);
    try { return ptr(value); } catch (_) { return null; }
  } catch (_) {
    return null;
  }
}
function controlKind(insn) {
  try {
    const groups = insn.groups || [];
    if (groups.indexOf('call') >= 0) return 'CALL';
    if (groups.indexOf('jump') >= 0 || groups.indexOf('branch_relative') >= 0) return 'BRANCH';
  } catch (_) {}
  const m = safe(insn.mnemonic).toLowerCase();
  if (m === 'bl' || m === 'blr' || m === 'call') return 'CALL';
  if (m.charAt(0) === 'b' || m.charAt(0) === 'j' || m === 'cbz' || m === 'cbnz' || m === 'tbz' || m === 'tbnz') return 'BRANCH';
  return null;
}
function stopTrace(reason) {
  if (!trace || trace.stopped) return;
  trace.stopped = true;
  try { Stalker.unfollow(trace.threadId); } catch (e) { log(`UNKNOWN: Stalker.unfollow failed reason=${reason} error=${safe(e)}`); }
  try { Stalker.garbageCollect(); } catch (_) {}
  log(`PROVEN_ZINQ_TRACE_END reason=${reason} instructions=${trace.count} lastNativeAddress=${trace.lastAddress || '<none>'} maxInstructions=${MAX_INSTRUCTIONS}`);
}
function recordInstruction(address, mnemonic, opStr, kind, target) {
  if (!trace || trace.stopped) return;
  trace.count += 1;
  trace.lastAddress = safe(address);
  log(`PROVEN_ZINQ_TRACE_BLOCK index=${trace.count} ${describeAddress('address', address)} mnemonic=${mnemonic} operands=${opStr || '<none>'}`);
  if (kind === 'CALL' && target) log(`PROVEN_ZINQ_CALL_TARGET index=${trace.count} from=${address} ${describeAddress('target', target)} mnemonic=${mnemonic} operands=${opStr || '<none>'}`);
  if (kind === 'BRANCH' && target) log(`PROVEN_ZINQ_BRANCH_TARGET index=${trace.count} from=${address} ${describeAddress('target', target)} mnemonic=${mnemonic} operands=${opStr || '<none>'}`);
  if (trace.count >= MAX_INSTRUCTIONS) stopTrace('max-instructions');
}
function startTrace() {
  if (trace && !trace.stopped) return;
  const threadId = tid();
  trace = { threadId, count: 0, stopped: false, lastAddress: null };
  log(`PROVEN_ZINQ_TRACE_START threadId=${threadId} targetClass=${TARGET_CLASS_SLASH} method=${TARGET_METHOD} signature=${TARGET_SIG} ${capturedZinqPointer ? describeAddress('capturedNativePointer', capturedZinqPointer) : 'capturedNativePointer=<not-yet-seen>'}`);
  Stalker.follow(threadId, {
    transform(iterator) {
      let insn;
      while ((insn = iterator.next()) !== null) {
        const address = ptr(insn.address);
        const mnemonic = safe(insn.mnemonic);
        const opStr = safe(insn.opStr || '');
        const kind = controlKind(insn);
        const target = immediateTarget(insn);
        iterator.putCallout(function () { recordInstruction(address, mnemonic, opStr, kind, target); });
        iterator.keep();
      }
    }
  });
}
function installRegisterNativesObserver() {
  const art = Process.findModuleByName('libart.so');
  if (!art) { log('UNKNOWN: libart.so is not loaded; RegisterNatives observer was not installed'); return; }
  const symbols = art.enumerateSymbols().filter(isRegisterNativesSymbol);
  log(`RegisterNatives observer starting candidates=${symbols.length} libartBase=${art.base} libartPath=${art.path}`);
  symbols.forEach(symbol => {
    try {
      Interceptor.attach(symbol.address, {
        onEnter(args) {
          let count = 0;
          try { count = args[3].toInt32(); } catch (_) { return; }
          const className = getClassName(Java.vm.getEnv(), args[1]);
          const classSlash = normalizeClassName(className);
          if (classSlash !== TARGET_CLASS_SLASH) return;
          readMethods(args[2], count).forEach(m => {
            if (m.name === TARGET_METHOD && m.sig === TARGET_SIG) {
              capturedZinqPointer = m.fn;
              log(`PROVEN_ZINQ_REGISTRATION symbol=${symbol.name} symbolAddress=${symbol.address} class=${classSlash} classReported=${className} method=${m.name} signature=${m.sig} methodIndex=${m.index} methodCount=${count} ${describeAddress('nativePointer', m.fn)}`);
            }
          });
        }
      });
      log(`installed RegisterNatives observer symbol=${symbol.name} address=${symbol.address}`);
    } catch (e) {
      log(`RegisterNatives observer attach failed symbol=${symbol.name} address=${symbol.address} error=${safe(e)}`);
    }
  });
}
function throwableMessage(t) {
  try { return t && t.getMessage ? safe(t.getMessage()) : safe(t); } catch (e) { return `<message-failed:${e}>`; }
}
function installJavaBoundaryObservers() {
  JavaThread = Java.use('java.lang.Thread');
  const Pma = Java.use(TARGET_CLASS_DOT);
  const zinqOverload = Pma[TARGET_METHOD].overload('java.lang.Object');
  zinqOverload.implementation = function (arg0) {
    startTrace();
    try {
      const ret = zinqOverload.call(this, arg0);
      stopTrace('zInq-return');
      return ret;
    } catch (e) {
      const msg = throwableMessage(e);
      if (msg.indexOf('DP: 786') >= 0 || msg.indexOf('DP:786') >= 0) stopTrace(`RuntimeException-DP786 message=${msg}`);
      else stopTrace(`zInq-throw message=${msg}`);
      throw e;
    }
  };
  const RuntimeException = Java.use('java.lang.RuntimeException');
  RuntimeException.$init.overloads.forEach(ov => {
    ov.implementation = function () {
      const ret = ov.apply(this, arguments);
      const msg = throwableMessage(this);
      if (trace && !trace.stopped && (msg.indexOf('DP: 786') >= 0 || msg.indexOf('DP:786') >= 0)) stopTrace(`RuntimeException-DP786 message=${msg}`);
      return ret;
    };
  });
  log('installed Java zInq boundary and RuntimeException DP:786 observers');
}

Java.perform(function () {
  installRegisterNativesObserver();
  installJavaBoundaryObservers();
});
