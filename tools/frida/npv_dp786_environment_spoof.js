'use strict';

/*
 * DP:786 staging environment spoof layer.
 *
 * Purpose:
 *   Normalize emulator/container telemetry during authorized staging UI testing
 *   so the native zInq DP:786 environment gate sees a retail-like profile.
 *
 * Scope:
 *   - Java Build fields and android.os.SystemProperties.get*.
 *   - libc __system_property_get output buffers.
 *   - File/proc probe path redirection for high-signal emulator artifacts.
 *   - Optional DP:786 wrapper no-op so UI automation can continue if the
 *     protector still rejects a hidden signal not covered by this spoof layer.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv \
 *     -l tools/frida/npv_dp786_environment_spoof.js
 */

const TAG = 'npv-dp786-env-spoof';
const PACKAGE_NAME = 'com.napsternetlabs.napsternetv';
const PMA_WRAPPER = `${PACKAGE_NAME}.ProtectedMyApplication$ProtectedMyApplication`;
const ENABLE_DP786_UI_FALLBACK = true;

const RETAIL = {
  FINGERPRINT: 'google/panther/panther:13/TQ3A.230605.012/10208123:user/release-keys',
  MODEL: 'Pixel 7',
  BRAND: 'google',
  MANUFACTURER: 'Google',
  BOARD: 'panther',
  HARDWARE: 'panther',
  PRODUCT: 'panther',
  DEVICE: 'panther',
  BOOTLOADER: 'cloudripper-1.0-10200187',
  HOST: 'abfarm-release-rbe-64-0000',
  TAGS: 'release-keys',
  TYPE: 'user',
  USER: 'android-build',
};

const PROPERTY_OVERRIDES = {
  'ro.build.fingerprint': RETAIL.FINGERPRINT,
  'ro.bootimage.build.fingerprint': RETAIL.FINGERPRINT,
  'ro.system.build.fingerprint': RETAIL.FINGERPRINT,
  'ro.vendor.build.fingerprint': RETAIL.FINGERPRINT,
  'ro.product.model': RETAIL.MODEL,
  'ro.product.brand': RETAIL.BRAND,
  'ro.product.manufacturer': RETAIL.MANUFACTURER,
  'ro.product.board': RETAIL.BOARD,
  'ro.product.device': RETAIL.DEVICE,
  'ro.product.name': RETAIL.PRODUCT,
  'ro.hardware': RETAIL.HARDWARE,
  'ro.boot.hardware': RETAIL.HARDWARE,
  'ro.kernel.qemu': '0',
  'ro.boot.qemu': '0',
  'ro.bootloader': RETAIL.BOOTLOADER,
  'ro.build.tags': RETAIL.TAGS,
  'ro.build.type': RETAIL.TYPE,
  'ro.build.user': RETAIL.USER,
  'ro.build.host': RETAIL.HOST,
};

const PROPERTY_PREFIX_OVERRIDES = [
  { prefix: 'ro.product.', value: RETAIL.PRODUCT },
  { prefix: 'ro.kernel.', value: '0' },
  { prefix: 'init.svc.qemu', value: 'stopped' },
  { prefix: 'qemu.', value: '' },
];

const PROPERTY_SUBSTRING_OVERRIDES = [
  { needle: 'qemu', value: '0' },
  { needle: 'goldfish', value: '' },
  { needle: 'ranchu', value: '' },
  { needle: 'emulator', value: '' },
];

const BLOCKED_PATH_PATTERNS = [
  /\/dev\/qemu_pipe/i,
  /\/dev\/qemu_trace/i,
  /\/dev\/socket\/qemud/i,
  /\/sys\/qemu_trace/i,
  /\/sys\/bus\/platform\/drivers\/goldfish/i,
  /\/proc\/tty\/drivers/i,
  /\/proc\/cpuinfo/i,
  /\/proc\/self\/maps/i,
  /\/system\/build\.prop/i,
  /\/vendor\/build\.prop/i,
  /\/default\.prop/i,
  /goldfish/i,
  /ranchu/i,
  /qemu/i,
  /emu64/i,
];

let seq = 0;
const startedAt = Date.now();
const redirectedPaths = [];

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
function readCString(pointerValue) {
  try {
    const p = ptr(pointerValue);
    return p.isNull() ? '<null>' : p.readCString();
  } catch (error) { return `<read-cstr-failed:${error}>`; }
}
function spoofPropertyValue(key, fallbackValue) {
  const name = safeString(key);
  if (Object.prototype.hasOwnProperty.call(PROPERTY_OVERRIDES, name)) return PROPERTY_OVERRIDES[name];
  for (let i = 0; i < PROPERTY_PREFIX_OVERRIDES.length; i += 1) {
    const item = PROPERTY_PREFIX_OVERRIDES[i];
    if (name.indexOf(item.prefix) === 0) return item.value;
  }
  const lower = name.toLowerCase();
  for (let i = 0; i < PROPERTY_SUBSTRING_OVERRIDES.length; i += 1) {
    const item = PROPERTY_SUBSTRING_OVERRIDES[i];
    if (lower.indexOf(item.needle) !== -1) return item.value;
  }
  return fallbackValue;
}
function shouldRedirectPath(path) {
  if (!path || path === '<null>') return false;
  for (let i = 0; i < BLOCKED_PATH_PATTERNS.length; i += 1) {
    if (BLOCKED_PATH_PATTERNS[i].test(path)) return true;
  }
  return false;
}
function redirectedPathFor(path) {
  if (/\/proc\/self\/maps/i.test(path)) return '/proc/self/status';
  return '/dev/null';
}
function redirectPathArg(args, index, apiName) {
  const original = readCString(args[index]);
  if (!shouldRedirectPath(original)) return;
  const replacement = redirectedPathFor(original);
  const replacementPtr = Memory.allocUtf8String(replacement);
  redirectedPaths.push(replacementPtr);
  args[index] = replacementPtr;
  log(`SPOOF_NATIVE_PATH api=${apiName} original=${original} replacement=${replacement}`);
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

function installNativePropertySpoof() {
  const fn = Module.findExportByName(null, '__system_property_get');
  if (!fn) {
    log('MISSING_NATIVE_SYMBOL name=__system_property_get');
    return;
  }
  Interceptor.attach(fn, {
    onEnter(args) {
      this.name = readCString(args[0]);
      this.valuePtr = args[1];
    },
    onLeave(retval) {
      const replacement = spoofPropertyValue(this.name, null);
      if (replacement === null || replacement === undefined) return;
      try {
        this.valuePtr.writeUtf8String(replacement);
        retval.replace(replacement.length);
        log(`SPOOF_NATIVE_PROPERTY api=__system_property_get key=${this.name} value=${replacement}`);
      } catch (error) {
        log(`FAILED_NATIVE_PROPERTY_SPOOF key=${this.name} error=${error}`);
      }
    },
  });
  log('installed native __system_property_get spoof');
}

function installNativePathSpoof() {
  [
    { name: 'open', index: 0 },
    { name: 'open64', index: 0 },
    { name: 'openat', index: 1 },
    { name: 'openat64', index: 1 },
    { name: 'access', index: 0 },
    { name: 'stat', index: 0 },
    { name: 'stat64', index: 0 },
    { name: 'lstat', index: 0 },
    { name: 'lstat64', index: 0 },
    { name: 'readlink', index: 0 },
    { name: 'readlinkat', index: 1 },
    { name: 'fstatat', index: 1 },
    { name: 'fstatat64', index: 1 },
  ].forEach((spec) => {
    const fn = Module.findExportByName(null, spec.name);
    if (!fn) {
      log(`MISSING_NATIVE_SYMBOL name=${spec.name}`);
      return;
    }
    Interceptor.attach(fn, {
      onEnter(args) { redirectPathArg(args, spec.index, spec.name); },
    });
    log(`installed native path spoof name=${spec.name}`);
  });
}

function installJavaSpoof() {
  const Build = Java.use('android.os.Build');
  Build.FINGERPRINT.value = RETAIL.FINGERPRINT;
  Build.MODEL.value = RETAIL.MODEL;
  Build.BRAND.value = RETAIL.BRAND;
  Build.MANUFACTURER.value = RETAIL.MANUFACTURER;
  Build.BOARD.value = RETAIL.BOARD;
  Build.HARDWARE.value = RETAIL.HARDWARE;
  Build.PRODUCT.value = RETAIL.PRODUCT;
  Build.DEVICE.value = RETAIL.DEVICE;
  Build.BOOTLOADER.value = RETAIL.BOOTLOADER;
  Build.HOST.value = RETAIL.HOST;
  Build.TAGS.value = RETAIL.TAGS;
  Build.TYPE.value = RETAIL.TYPE;
  Build.USER.value = RETAIL.USER;
  log(`SPOOF_JAVA_BUILD fingerprint=${RETAIL.FINGERPRINT} model=${RETAIL.MODEL}`);

  const SystemProperties = Java.use('android.os.SystemProperties');
  const getOne = SystemProperties.get.overload('java.lang.String');
  getOne.implementation = function spoofSystemPropertyOne(key) {
    const original = getOne.call(this, key);
    const replacement = spoofPropertyValue(key, original);
    if (replacement !== original) log(`SPOOF_JAVA_PROPERTY key=${key} original=${original} replacement=${replacement}`);
    return replacement;
  };

  const getTwo = SystemProperties.get.overload('java.lang.String', 'java.lang.String');
  getTwo.implementation = function spoofSystemPropertyTwo(key, def) {
    const original = getTwo.call(this, key, def);
    const replacement = spoofPropertyValue(key, original);
    if (replacement !== original) log(`SPOOF_JAVA_PROPERTY key=${key} original=${original} replacement=${replacement}`);
    return replacement;
  };

  try {
    const getBoolean = SystemProperties.getBoolean.overload('java.lang.String', 'boolean');
    getBoolean.implementation = function spoofSystemPropertyBoolean(key, def) {
      const replacement = spoofPropertyValue(key, null);
      if (replacement !== null && replacement !== undefined) {
        const boolValue = replacement === '1' || replacement === 'true';
        log(`SPOOF_JAVA_PROPERTY_BOOLEAN key=${key} replacement=${boolValue}`);
        return boolValue;
      }
      return getBoolean.call(this, key, def);
    };
  } catch (error) { log(`SKIP_JAVA_GET_BOOLEAN error=${error}`); }
}

function installDp786UiFallback() {
  if (!ENABLE_DP786_UI_FALLBACK) return;
  const Wrapper = Java.use(PMA_WRAPPER);
  const fAHytsI = Wrapper.fAHytsI.overload('android.content.Context', 'java.lang.Throwable', 'java.lang.String');
  fAHytsI.implementation = function dp786Fallback(context, throwable, id) {
    if (isDp786(throwable)) {
      log(`SPOOF_UI_FALLBACK_DP786 method=fAHytsI action=return cause=${throwable} causeMessage=${throwableMessage(throwable)} id=${safeString(id)}`);
      return;
    }
    return fAHytsI.call(this, context, throwable, id);
  };
  log('installed optional DP:786 UI fallback at fAHytsI');
}

installNativePropertySpoof();
installNativePathSpoof();

Java.perform(() => {
  installJavaSpoof();
  installDp786UiFallback();
  log('DP:786 environment spoof layer installed');
});
