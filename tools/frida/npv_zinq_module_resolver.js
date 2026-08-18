'use strict';

/*
 * Read-only module resolver for captured ProtectedMyApplication.zInq native
 * registrations and RegisterNatives caller addresses.
 *
 * Purpose:
 *   Determine which loaded native library owns each captured zInq
 *   implementation pointer without hooking zInq, replacing functions,
 *   patching code, or modifying app behavior.
 *
 * Usage:
 *   1) Paste any captured RegisterNatives caller addresses into
 *      CAPTURED_REGISTER_NATIVES_CALLERS below.
 *   2) Run against the original app process:
 *      frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_zinq_module_resolver.js --no-pause
 *
 * Notes:
 *   - This script only enumerates Process.enumerateModules() and compares
 *     address ranges.
 *   - The two zInq native pointers below are the captured runtime
 *     RegisterNatives fnPtr values provided for this investigation.
 */

const TAG = 'npv-zinq-module-resolver';
const TARGET_CLASS_SLASH = 'com/napsternetlabs/napsternetv/ProtectedMyApplication';
const TARGET_METHOD = 'zInq';
const TARGET_SIG = '(Ljava/lang/Object;)V';

const CAPTURED_ZINQ_NATIVE_POINTERS = [
  '0x7040c05f365e',
  '0x7040bf066a20',
];

// Paste RegisterNatives caller return addresses from the capture here, for
// example: '0x7040c0123456'. Leave empty when caller addresses are not yet
// available in the current log set.
const CAPTURED_REGISTER_NATIVES_CALLERS = [
];

const startedAt = Date.now();
let seq = 0;
let JavaThread = null;

function now() { return new Date().toISOString(); }
function elapsedMs() { return Date.now() - startedAt; }
function tid() { try { return Process.getCurrentThreadId(); } catch (_) { return '?'; } }
function safe(v) { try { return String(v); } catch (e) { return `<string failed: ${e}>`; } }
function threadName() {
  try { return JavaThread ? safe(JavaThread.currentThread().getName()) : '<java-unavailable>'; } catch (_) { return '<java-unavailable>'; }
}
function processName() {
  try { return Java.available ? safe(Java.use('android.app.ActivityThread').currentProcessName()) : '<java-unavailable>'; } catch (_) { return '<process unavailable>'; }
}
function log(msg) {
  seq += 1;
  console.log(`[${TAG} #${seq} ${now()} +${elapsedMs()}ms pid=${Process.id} tid=${tid()} jthread=${threadName()} process=${processName()}] ${msg}`);
}

function parseAddress(label, value) {
  try {
    return ptr(value);
  } catch (e) {
    log(`UNKNOWN: ${label} address parse failed value=${value} error=${e}`);
    return null;
  }
}

function moduleEnd(moduleInfo) {
  return moduleInfo.base.add(moduleInfo.size);
}

function moduleContains(moduleInfo, address) {
  const start = moduleInfo.base;
  const end = moduleEnd(moduleInfo);
  return address.compare(start) >= 0 && address.compare(end) < 0;
}

function resolveAddress(modules, label, addressText) {
  const address = parseAddress(label, addressText);
  if (address === null) return;

  for (let i = 0; i < modules.length; i += 1) {
    const moduleInfo = modules[i];
    if (moduleContains(moduleInfo, address)) {
      const offset = address.sub(moduleInfo.base);
      log(`PROVEN: ${label} address=${address} moduleName=${moduleInfo.name} modulePath=${moduleInfo.path} moduleBase=${moduleInfo.base} moduleEnd=${moduleEnd(moduleInfo)} moduleSize=${moduleInfo.size} offset=${offset}`);
      return;
    }
  }

  log(`UNKNOWN: ${label} address=${address} no containing module found enumeratedModules=${modules.length}`);
}

function resolveCapturedAddresses() {
  const modules = Process.enumerateModules();
  log(`PROVEN: Process.enumerateModules completed count=${modules.length} target=${TARGET_CLASS_SLASH}.${TARGET_METHOD}${TARGET_SIG}`);

  CAPTURED_ZINQ_NATIVE_POINTERS.forEach((addressText, index) => {
    resolveAddress(modules, `zInqNativePointer[${index}]`, addressText);
  });

  if (CAPTURED_REGISTER_NATIVES_CALLERS.length === 0) {
    log('UNKNOWN: no RegisterNatives caller addresses configured; paste captured caller return addresses into CAPTURED_REGISTER_NATIVES_CALLERS to resolve caller ownership');
  }

  CAPTURED_REGISTER_NATIVES_CALLERS.forEach((addressText, index) => {
    resolveAddress(modules, `RegisterNativesCaller[${index}]`, addressText);
  });
}

function main() {
  log(`resolver starting zInqPointers=${CAPTURED_ZINQ_NATIVE_POINTERS.join(',')} registerNativesCallers=${CAPTURED_REGISTER_NATIVES_CALLERS.join(',') || '<none configured>'}`);
  resolveCapturedAddresses();
  log('resolver complete; no hooks installed and no behavior modified');
}

if (Java.available) {
  Java.perform(function () {
    try { JavaThread = Java.use('java.lang.Thread'); } catch (_) {}
    main();
  });
} else {
  main();
}
