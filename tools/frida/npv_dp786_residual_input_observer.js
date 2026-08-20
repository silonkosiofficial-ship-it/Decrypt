'use strict';

/*
 * Read-only DP:786 residual-input observer for Frida 17.x.
 *
 * Run this after (or alongside) the existing environment layer. It deliberately
 * does not spoof, redirect, patch, replace native functions, or alter results.
 * It retains startup property and filesystem reads and prints the final observed
 * data source, caller module/offset, and time distance when DP:786 is created.
 *
 *   frida -U -f com.napsternetlabs.napsternetv \
 *     -l tools/frida/npv_dp786_residual_input_observer.js
 */

const TAG = 'npv-dp786-residual-input';
const APP = 'com.napsternetlabs.napsternetv.ProtectedMyApplication';
const TARGET = /DP:\s*786/;
const MAX_EVENTS = 4096;
const MAX_PREVIEW = 384;
const bootMs = Date.now();
const events = [];
const fdPaths = Object.create(null);
const streamPaths = Object.create(null);
const installed = Object.create(null);
let sequence = 0;
let startup = true;
let startupTid = null;

function elapsed() { return Date.now() - bootMs; }
function tid() { try { return Process.getCurrentThreadId(); } catch (_) { return -1; } }
function out(text) {
  sequence += 1;
  console.log(`[${TAG} #${sequence} +${elapsed()}ms pid=${Process.id} tid=${tid()}] ${text}`);
}
function text(value) { try { return String(value); } catch (e) { return `<string-failed:${e}>`; } }
function cstr(value) {
  try { const p = ptr(value); return p.isNull() ? '<null>' : p.readCString(1024); }
  catch (e) { return `<cstr-failed:${e}>`; }
}
function keyOf(value) { try { return ptr(value).toString(); } catch (_) { return '<invalid>'; } }
function integer(value) { try { return value.toInt32(); } catch (_) { return -1; } }
function moduleAt(value) {
  try {
    const address = ptr(value);
    const module = Process.findModuleByAddress(address);
    const range = Process.findRangeByAddress(address);
    if (module) return `${address} module=${module.name} offset=${address.sub(module.base)} path=${module.path}`;
    if (range) return `${address} module=<anonymous> rangeBase=${range.base} rangeOffset=${address.sub(range.base)} protection=${range.protection} file=${range.file ? range.file.path : '<none>'}`;
    return `${address} module=<unknown>`;
  } catch (e) { return `<address-failed:${e}>`; }
}
function backtrace(context) {
  const render = address => moduleAt(address);
  try { return Thread.backtrace(context, Backtracer.ACCURATE).slice(0, 16).map(render).join(' <= '); }
  catch (_) {
    try { return Thread.backtrace(context, Backtracer.FUZZY).slice(0, 16).map(render).join(' <= '); }
    catch (e) { return `<backtrace-failed:${e}>`; }
  }
}
function preview(address, length) {
  try {
    const count = Math.max(0, Math.min(Number(length), MAX_PREVIEW));
    if (count === 0 || ptr(address).isNull()) return '<empty>';
    const bytes = new Uint8Array(ptr(address).readByteArray(count));
    let value = '';
    for (let i = 0; i < bytes.length; i += 1) value += bytes[i] >= 32 && bytes[i] <= 126 ? String.fromCharCode(bytes[i]) : '.';
    return JSON.stringify(value);
  } catch (e) { return `<preview-failed:${e}>`; }
}
function remember(kind, detail, caller, context) {
  if (!startup) return;
  const event = {
    sequence: sequence + 1,
    elapsedMs: elapsed(),
    tid: tid(),
    startupThread: startupTid !== null && tid() === startupTid,
    kind,
    detail,
    caller: moduleAt(caller),
    backtrace: backtrace(context),
  };
  events.push(event);
  if (events.length > MAX_EVENTS) events.shift();
  out(`OBSERVED kind=${kind} startupThread=${event.startupThread} detail=${detail} caller=${event.caller}`);
}
function findExport(name) {
  try { return Module.findGlobalExportByName(name); } catch (_) {
    try { return Module.findExportByName(null, name); } catch (_) { return null; }
  }
}
function hook(name, callbacks) {
  const address = findExport(name);
  if (!address) { out(`UNKNOWN: native symbol unavailable name=${name}`); return; }
  const identity = address.toString();
  if (installed[identity]) return;
  installed[identity] = name;
  Interceptor.attach(address, callbacks);
  out(`observer-hook name=${name} address=${moduleAt(address)}`);
}
function enterState(invocation, detail) {
  invocation.npvDetail = detail;
  invocation.npvCaller = invocation.returnAddress;
  invocation.npvContext = invocation.context;
}
function propertyHooks() {
  hook('__system_property_get', {
    onEnter(args) { this.name = cstr(args[0]); this.value = args[1]; enterState(this, `name=${this.name}`); },
    onLeave(rv) { remember('property-get', `${this.npvDetail} result=${integer(rv)} value=${cstr(this.value)}`, this.npvCaller, this.npvContext); },
  });
  hook('__system_property_find', {
    onEnter(args) { enterState(this, `name=${cstr(args[0])}`); },
    onLeave(rv) { remember('property-find', `${this.npvDetail} propInfo=${rv}`, this.npvCaller, this.npvContext); },
  });
  hook('__system_property_read', {
    onEnter(args) { this.name = args[1]; this.value = args[2]; enterState(this, `propInfo=${args[0]}`); },
    onLeave(rv) { remember('property-read', `${this.npvDetail} result=${integer(rv)} name=${cstr(this.name)} value=${cstr(this.value)}`, this.npvCaller, this.npvContext); },
  });
  hook('__system_property_read_callback', {
    onEnter(args) { enterState(this, `propInfo=${args[0]} callback=${moduleAt(args[1])} cookie=${args[2]}`); },
    onLeave(rv) { remember('property-read-callback', `${this.npvDetail} result=${rv}`, this.npvCaller, this.npvContext); },
  });
  ['__system_property_find_nth', '__system_property_serial', '__system_property_area_serial', '__system_property_wait', '__system_property_wait_any', '__system_property_foreach'].forEach(name => hook(name, {
    onEnter(args) { enterState(this, `arg0=${args[0]} arg1=${args[1]} arg2=${args[2]} arg3=${args[3]}`); },
    onLeave(rv) { remember(`property-api:${name}`, `${this.npvDetail} result=${rv}`, this.npvCaller, this.npvContext); },
  }));
}
function pathHooks() {
  const specs = [
    ['open', 0], ['open64', 0], ['openat', 1], ['openat64', 1], ['creat', 0],
    ['access', 0], ['faccessat', 1], ['stat', 0], ['stat64', 0], ['lstat', 0], ['lstat64', 0],
    ['fstatat', 1], ['fstatat64', 1], ['readlink', 0], ['readlinkat', 1], ['opendir', 0],
  ];
  specs.forEach(spec => hook(spec[0], {
    onEnter(args) { this.path = cstr(args[spec[1]]); enterState(this, `path=${this.path}`); },
    onLeave(rv) {
      const result = integer(rv);
      if (/^open(at)?(64)?$|^creat$/.test(spec[0]) && result >= 0) fdPaths[result] = this.path;
      remember(`filesystem-${spec[0]}`, `${this.npvDetail} result=${rv}`, this.npvCaller, this.npvContext);
    },
  }));
  ['fopen', 'fopen64'].forEach(name => hook(name, {
    onEnter(args) { this.path = cstr(args[0]); enterState(this, `path=${this.path} mode=${cstr(args[1])}`); },
    onLeave(rv) { if (!ptr(rv).isNull()) streamPaths[keyOf(rv)] = this.path; remember(`filesystem-${name}`, `${this.npvDetail} stream=${rv}`, this.npvCaller, this.npvContext); },
  }));
}
function ioHooks() {
  hook('read', {
    onEnter(args) { this.fd = integer(args[0]); this.buffer = args[1]; enterState(this, `fd=${this.fd} path=${fdPaths[this.fd] || '<unknown>'} count=${args[2]}`); },
    onLeave(rv) { const n = integer(rv); remember('filesystem-read', `${this.npvDetail} result=${n} data=${n > 0 ? preview(this.buffer, n) : '<none>'}`, this.npvCaller, this.npvContext); },
  });
  ['pread', 'pread64'].forEach(name => hook(name, {
    onEnter(args) { this.fd = integer(args[0]); this.buffer = args[1]; enterState(this, `fd=${this.fd} path=${fdPaths[this.fd] || '<unknown>'} count=${args[2]} offset=${args[3]}`); },
    onLeave(rv) { const n = integer(rv); remember(`filesystem-${name}`, `${this.npvDetail} result=${n} data=${n > 0 ? preview(this.buffer, n) : '<none>'}`, this.npvCaller, this.npvContext); },
  }));
  hook('readv', {
    onEnter(args) { this.fd = integer(args[0]); this.iov = args[1]; this.iovcnt = integer(args[2]); enterState(this, `fd=${this.fd} path=${fdPaths[this.fd] || '<unknown>'} iovcnt=${this.iovcnt}`); },
    onLeave(rv) {
      const n = integer(rv); let data = '<none>';
      try { if (n > 0 && this.iovcnt > 0) data = preview(ptr(this.iov).readPointer(), n); } catch (e) { data = `<failed:${e}>`; }
      remember('filesystem-readv', `${this.npvDetail} result=${n} firstBufferData=${data}`, this.npvCaller, this.npvContext);
    },
  });
  hook('fread', {
    onEnter(args) { this.buffer = args[0]; this.itemSize = integer(args[1]); enterState(this, `stream=${args[3]} path=${streamPaths[keyOf(args[3])] || '<unknown>'} size=${args[1]} count=${args[2]}`); },
    onLeave(rv) { const bytes = integer(rv) * this.itemSize; remember('filesystem-fread', `${this.npvDetail} items=${integer(rv)} data=${bytes > 0 ? preview(this.buffer, bytes) : '<none>'}`, this.npvCaller, this.npvContext); },
  });
  hook('fgets', {
    onEnter(args) { this.buffer = args[0]; enterState(this, `stream=${args[2]} path=${streamPaths[keyOf(args[2])] || '<unknown>'} size=${args[1]}`); },
    onLeave(rv) { remember('filesystem-fgets', `${this.npvDetail} result=${rv} data=${ptr(rv).isNull() ? '<none>' : cstr(this.buffer)}`, this.npvCaller, this.npvContext); },
  });
  hook('getline', {
    onEnter(args) { this.line = args[0]; enterState(this, `stream=${args[2]} path=${streamPaths[keyOf(args[2])] || '<unknown>'}`); },
    onLeave(rv) { const n = integer(rv); let data = '<none>'; try { if (n > 0) data = preview(ptr(this.line).readPointer(), n); } catch (e) { data = `<failed:${e}>`; } remember('filesystem-getline', `${this.npvDetail} result=${n} data=${data}`, this.npvCaller, this.npvContext); },
  });
  hook('close', { onEnter(args) { this.fd = integer(args[0]); this.path = fdPaths[this.fd] || '<unknown>'; }, onLeave() { delete fdPaths[this.fd]; } });
  hook('fclose', { onEnter(args) { this.stream = keyOf(args[0]); }, onLeave() { delete streamPaths[this.stream]; } });
}
function dumpDp786(message) {
  const when = elapsed();
  const sameThread = events.filter(event => startupTid === null || event.tid === startupTid);
  const source = sameThread.length ? sameThread[sameThread.length - 1] : (events.length ? events[events.length - 1] : null);
  out(`PROVEN: RuntimeException(${JSON.stringify(message)}) observed at +${when}ms startupTid=${startupTid}`);
  if (source) {
    out(`PROVEN: last observed data source before DP:786 kind=${source.kind} detail=${source.detail} eventElapsedMs=${source.elapsedMs} deltaMs=${when - source.elapsedMs} eventTid=${source.tid} caller=${source.caller}`);
    out(`PROVEN: last data-source native backtrace ${source.backtrace}`);
  } else {
    out('PROVEN: no hooked native property or filesystem data source was observed before DP:786');
  }
  out('UNKNOWN: direct syscalls, inlined property-area parsing, memory-mapped input, JNI/Java APIs, cached values, and the final comparison remain checks unless represented in the event above');
  out('NEXT: instrument only the reported caller module+offset and its final comparison; if no source was observed, trace direct openat/read syscalls on the startup thread');
}

propertyHooks();
pathHooks();
ioHooks();

Java.perform(() => {
  const RuntimeException = Java.use('java.lang.RuntimeException');
  const runtimeString = RuntimeException.$init.overload('java.lang.String');
  runtimeString.implementation = function (message) {
    const result = runtimeString.call(this, message);
    const value = message === null ? '<null>' : String(message);
    if (TARGET.test(value)) dumpDp786(value);
    return result;
  };
  const Application = Java.use(APP);
  const onCreate = Application.onCreate.overload();
  onCreate.implementation = function () {
    startupTid = tid();
    out(`startup boundary entered class=${APP} startupTid=${startupTid}`);
    try { return onCreate.call(this); }
    catch (error) { out(`startup boundary threw throwable=${text(error)}`); throw error; }
    finally { startup = false; out(`startup observation closed retainedEvents=${events.length}`); }
  };
  out(`read-only residual-input observer installed target=${APP}`);
});
