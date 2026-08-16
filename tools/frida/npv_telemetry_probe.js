'use strict';

/*
 * NPV Tunnel startup telemetry probe.
 *
 * Purpose: read-only diagnostics for the DexProtector startup gate on a
 * controlled test device/emulator. This script logs the environment signals and
 * exception flow without modifying return values, suppressing exceptions, or
 * changing application state.
 *
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_telemetry_probe.js
 */

const TAG = 'npv-telemetry';
const PACKAGE_NAME = 'com.napsternetlabs.napsternetv';
const BUILD_FIELDS = [
  'BOARD',
  'BOOTLOADER',
  'BRAND',
  'CPU_ABI',
  'CPU_ABI2',
  'DEVICE',
  'DISPLAY',
  'FINGERPRINT',
  'HARDWARE',
  'HOST',
  'ID',
  'MANUFACTURER',
  'MODEL',
  'ODM_SKU',
  'PRODUCT',
  'RADIO',
  'SERIAL',
  'SKU',
  'SOC_MANUFACTURER',
  'SOC_MODEL',
  'TAGS',
  'TIME',
  'TYPE',
  'UNKNOWN',
  'USER'
];
const VERSION_FIELDS = [
  'BASE_OS',
  'CODENAME',
  'INCREMENTAL',
  'PREVIEW_SDK_FINGERPRINT',
  'PREVIEW_SDK_INT',
  'RELEASE',
  'RELEASE_OR_CODENAME',
  'RELEASE_OR_PREVIEW_DISPLAY',
  'SDK',
  'SDK_INT',
  'SECURITY_PATCH'
];

let javaReady = false;
let startupPhase = 'pre-java';
let sequence = 0;
let Throwable = null;
let javaInstrumentationInstalled = false;
let javaRetryTimer = null;
let nativeLibraryHookInstalled = false;
const pendingClassHookNames = {};

function now() {
  return new Date().toISOString();
}

function log(message) {
  sequence += 1;
  console.log(`[${TAG} #${sequence} ${now()} phase=${startupPhase}] ${message}`);
}

function safeString(value) {
  if (value === null || value === undefined) {
    return String(value);
  }
  try {
    return String(value);
  } catch (error) {
    return `<toString failed: ${error}>`;
  }
}

function stackOf(throwable) {
  try {
    return Java.cast(throwable, Throwable).getStackTrace().toString();
  } catch (error) {
    return `<stack unavailable: ${error}>`;
  }
}

function currentJavaStack() {
  try {
    const Exception = Java.use('java.lang.Exception');
    return Exception.$new().getStackTrace().toString();
  } catch (error) {
    return `<current stack unavailable: ${error}>`;
  }
}

function installSafely(name, installer) {
  try {
    installer();
    log(`installed ${name}`);
    return true;
  } catch (error) {
    log(`FAILED installing ${name}: ${error}`);
    return false;
  }
}

function formatJavaStringArray(arr) {
  try {
    if (arr === null || arr === undefined) {
      return safeString(arr);
    }
    const out = [];
    for (let i = 0; i < arr.length; i += 1) {
      out.push(safeString(arr[i]));
    }
    return `[${out.join(', ')}]`;
  } catch (error) {
    return `<array format failed: ${error}>`;
  }
}

function logBuildSnapshot(reason) {
  installSafely(`Build snapshot (${reason})`, function () {
    const Build = Java.use('android.os.Build');
    const Version = Java.use('android.os.Build$VERSION');
    const parts = [];

    BUILD_FIELDS.forEach(function (fieldName) {
      try {
        parts.push(`Build.${fieldName}=${safeString(Build[fieldName].value)}`);
      } catch (_) {
        // Some fields are API/build dependent. Omit absent fields to keep output readable.
      }
    });

    try {
      parts.push(`Build.SUPPORTED_ABIS=${formatJavaStringArray(Build.SUPPORTED_ABIS.value)}`);
    } catch (_) {}
    try {
      parts.push(`Build.SUPPORTED_32_BIT_ABIS=${formatJavaStringArray(Build.SUPPORTED_32_BIT_ABIS.value)}`);
    } catch (_) {}
    try {
      parts.push(`Build.SUPPORTED_64_BIT_ABIS=${formatJavaStringArray(Build.SUPPORTED_64_BIT_ABIS.value)}`);
    } catch (_) {}

    VERSION_FIELDS.forEach(function (fieldName) {
      try {
        parts.push(`Build.VERSION.${fieldName}=${safeString(Version[fieldName].value)}`);
      } catch (_) {
        // API dependent.
      }
    });

    log(`BUILD_SNAPSHOT reason=${reason} ${parts.join(' | ')}`);
  });
}

function hookSystemProperties() {
  const SystemProperties = Java.use('android.os.SystemProperties');

  function logPropertyCall(signature, key, value, extra) {
    log(`SystemProperties.${signature} key=${safeString(key)}${extra || ''} => ${safeString(value)}`);
  }

  const getString = SystemProperties.get.overload('java.lang.String');
  getString.implementation = function (key) {
    const value = getString.call(this, key);
    logPropertyCall('get(String)', key, value);
    return value;
  };

  const getStringDefault = SystemProperties.get.overload('java.lang.String', 'java.lang.String');
  getStringDefault.implementation = function (key, def) {
    const value = getStringDefault.call(this, key, def);
    logPropertyCall('get(String,String)', key, value, ` default=${safeString(def)}`);
    return value;
  };

  const getInt = SystemProperties.getInt.overload('java.lang.String', 'int');
  getInt.implementation = function (key, def) {
    const value = getInt.call(this, key, def);
    logPropertyCall('getInt(String,int)', key, value, ` default=${def}`);
    return value;
  };

  const getLong = SystemProperties.getLong.overload('java.lang.String', 'long');
  getLong.implementation = function (key, def) {
    const value = getLong.call(this, key, def);
    logPropertyCall('getLong(String,long)', key, value, ` default=${def}`);
    return value;
  };

  const getBoolean = SystemProperties.getBoolean.overload('java.lang.String', 'boolean');
  getBoolean.implementation = function (key, def) {
    const value = getBoolean.call(this, key, def);
    logPropertyCall('getBoolean(String,boolean)', key, value, ` default=${def}`);
    return value;
  };
}

function hookReflectionBuildAccess() {
  const Field = Java.use('java.lang.reflect.Field');

  const get = Field.get.overload('java.lang.Object');
  get.implementation = function (obj) {
    const value = get.call(this, obj);
    try {
      const declaringClass = this.getDeclaringClass().getName();
      if (declaringClass === 'android.os.Build' || declaringClass === 'android.os.Build$VERSION') {
        log(`Reflect Field.get ${declaringClass}.${this.getName()} => ${safeString(value)} stack=${currentJavaStack()}`);
      }
    } catch (_) {}
    return value;
  };

  const primitiveGetters = [
    ['getBoolean', 'java.lang.Object'],
    ['getByte', 'java.lang.Object'],
    ['getChar', 'java.lang.Object'],
    ['getShort', 'java.lang.Object'],
    ['getInt', 'java.lang.Object'],
    ['getLong', 'java.lang.Object'],
    ['getFloat', 'java.lang.Object'],
    ['getDouble', 'java.lang.Object']
  ];

  primitiveGetters.forEach(function (entry) {
    const methodName = entry[0];
    try {
      const overload = Field[methodName].overload(entry[1]);
      overload.implementation = function (obj) {
        const value = overload.call(this, obj);
        try {
          const declaringClass = this.getDeclaringClass().getName();
          if (declaringClass === 'android.os.Build' || declaringClass === 'android.os.Build$VERSION') {
            log(`Reflect Field.${methodName} ${declaringClass}.${this.getName()} => ${safeString(value)} stack=${currentJavaStack()}`);
          }
        } catch (_) {}
        return value;
      };
    } catch (error) {
      log(`reflection primitive hook unavailable for Field.${methodName}: ${error}`);
    }
  });
}

function hookRuntimeExceptions() {
  const RuntimeException = Java.use('java.lang.RuntimeException');

  function logDpRuntimeException(signature, instance, message, extra) {
    if (message !== null && safeString(message).indexOf('DP: ') >= 0) {
      log(`${signature} DP message=${safeString(message)}${extra || ''}`);
      log(`${signature} DP constructorStack=${stackOf(instance)}`);
    }
  }

  const initString = RuntimeException.$init.overload('java.lang.String');
  initString.implementation = function (message) {
    const ret = initString.call(this, message);
    logDpRuntimeException('RuntimeException(String)', this, message);
    return ret;
  };
  log('installed RuntimeException(String) constructor hook');

  const initStringThrowable = RuntimeException.$init.overload('java.lang.String', 'java.lang.Throwable');
  initStringThrowable.implementation = function (message, cause) {
    const ret = initStringThrowable.call(this, message, cause);
    logDpRuntimeException('RuntimeException(String,Throwable)', this, message, ` cause=${safeString(cause)}`);
    return ret;
  };
  log('installed RuntimeException(String,Throwable) constructor hook');
}

function hookMessageGuardException() {
  const MessageGuardException = Java.use(`${PACKAGE_NAME}.MessageGuardException`);

  const initThrowable = MessageGuardException.$init.overload('java.lang.Throwable');
  initThrowable.implementation = function (cause) {
    log(`MessageGuardException(Throwable) cause=${safeString(cause)} causeMessage=${cause ? safeString(cause.getMessage()) : 'null'}`);
    const ret = initThrowable.call(this, cause);
    log(`MessageGuardException(Throwable) created=${safeString(this)} stack=${stackOf(this)}`);
    return ret;
  };

  const initThrowableString = MessageGuardException.$init.overload('java.lang.Throwable', 'java.lang.String');
  initThrowableString.implementation = function (cause, id) {
    log(`MessageGuardException(Throwable,String) cause=${safeString(cause)} causeMessage=${cause ? safeString(cause.getMessage()) : 'null'} id=${safeString(id)}`);
    const ret = initThrowableString.call(this, cause, id);
    log(`MessageGuardException(Throwable,String) created=${safeString(this)} stack=${stackOf(this)}`);
    return ret;
  };
}

function hookProtectedApplication() {
  const ProtectedMyApplication = Java.use(`${PACKAGE_NAME}.ProtectedMyApplication`);
  const Wrapper = Java.use(`${PACKAGE_NAME}.ProtectedMyApplication$ProtectedMyApplication`);

  const attachBaseContext = ProtectedMyApplication.attachBaseContext.overload('android.content.Context');
  attachBaseContext.implementation = function (context) {
    const previousPhase = startupPhase;
    startupPhase = 'attachBaseContext';
    log('ProtectedMyApplication.attachBaseContext enter');
    logBuildSnapshot('attachBaseContext-enter');
    try {
      return attachBaseContext.call(this, context);
    } finally {
      logBuildSnapshot('attachBaseContext-exit');
      log('ProtectedMyApplication.attachBaseContext exit');
      startupPhase = previousPhase;
    }
  };

  const onCreate = ProtectedMyApplication.onCreate.overload();
  onCreate.implementation = function () {
    const previousPhase = startupPhase;
    startupPhase = 'onCreate';
    log('ProtectedMyApplication.onCreate enter');
    logBuildSnapshot('onCreate-enter');
    try {
      return onCreate.call(this);
    } finally {
      logBuildSnapshot('onCreate-exit');
      log('ProtectedMyApplication.onCreate exit');
      startupPhase = previousPhase;
    }
  };

  ['uapgpA', 'gwj', 'zInq'].forEach(function (methodName) {
    try {
      ProtectedMyApplication[methodName].overloads.forEach(function (overload) {
        overload.implementation = function () {
          const previousPhase = startupPhase;
          startupPhase = `native-${methodName}`;
          log(`ProtectedMyApplication.${methodName} enter argc=${arguments.length}`);
          logBuildSnapshot(`${methodName}-enter`);
          try {
            const result = overload.apply(this, arguments);
            log(`ProtectedMyApplication.${methodName} return=${safeString(result)}`);
            return result;
          } catch (error) {
            log(`ProtectedMyApplication.${methodName} THROW=${safeString(error)} message=${error && error.getMessage ? safeString(error.getMessage()) : '<no getMessage>'}`);
            throw error;
          } finally {
            logBuildSnapshot(`${methodName}-exit`);
            startupPhase = previousPhase;
          }
        };
      });
    } catch (error) {
      log(`native Java boundary hook unavailable for ${methodName}: ${error}`);
    }
  });

  const fAHytsI = Wrapper.fAHytsI.overload('android.content.Context', 'java.lang.Throwable', 'java.lang.String');
  fAHytsI.implementation = function (context, throwable, id) {
    const previousPhase = startupPhase;
    startupPhase = 'fAHytsI';
    log(`fAHytsI(ctx,th,id) throwable=${safeString(throwable)} message=${throwable ? safeString(throwable.getMessage()) : 'null'} id=${safeString(id)}`);
    try {
      return fAHytsI.call(this, context, throwable, id);
    } finally {
      startupPhase = previousPhase;
    }
  };

  const qk = Wrapper.qk.overload('java.lang.Throwable', 'java.lang.String');
  qk.implementation = function (throwable, id) {
    log(`qk(th,id) throwable=${safeString(throwable)} message=${throwable ? safeString(throwable.getMessage()) : 'null'} id=${safeString(id)}`);
    return qk.call(this, throwable, id);
  };
}


let nativePropertyHookInstalled = false;
let nativePropertyObserverInstalled = false;
let nativePropertyRetryTimer = null;

function findExportAddress(libraryName, symbolName) {
  const attempts = [];

  attempts.push(function processModuleFindExport() {
    if (typeof Process === 'undefined' || typeof Process.findModuleByName !== 'function') {
      return null;
    }
    const module = Process.findModuleByName(libraryName);
    if (module === null || module === undefined || typeof module.findExportByName !== 'function') {
      return null;
    }
    return module.findExportByName(symbolName);
  });

  attempts.push(function processModuleEnumerateExports() {
    if (typeof Process === 'undefined' || typeof Process.findModuleByName !== 'function') {
      return null;
    }
    const module = Process.findModuleByName(libraryName);
    if (module === null || module === undefined || typeof module.enumerateExports !== 'function') {
      return null;
    }
    const exports = module.enumerateExports();
    for (let i = 0; i < exports.length; i += 1) {
      if (exports[i].name === symbolName) {
        return exports[i].address;
      }
    }
    return null;
  });

  attempts.push(function apiResolverExports() {
    if (typeof ApiResolver !== 'function') {
      return null;
    }
    const resolver = new ApiResolver('module');
    const matches = resolver.enumerateMatches(`exports:${libraryName}!${symbolName}`);
    return matches.length > 0 ? matches[0].address : null;
  });

  attempts.push(function moduleGetExportByName() {
    if (typeof Module === 'undefined' || typeof Module.getExportByName !== 'function') {
      return null;
    }
    try {
      return Module.getExportByName(libraryName, symbolName);
    } catch (_) {
      return null;
    }
  });

  attempts.push(function moduleFindExportByNameLegacy() {
    if (typeof Module === 'undefined' || typeof Module.findExportByName !== 'function') {
      return null;
    }
    return Module.findExportByName(libraryName, symbolName);
  });

  attempts.push(function moduleFindGlobalExportByName() {
    if (typeof Module === 'undefined' || typeof Module.findGlobalExportByName !== 'function') {
      return null;
    }
    return Module.findGlobalExportByName(symbolName);
  });

  attempts.push(function moduleGetGlobalExportByName() {
    if (typeof Module === 'undefined' || typeof Module.getGlobalExportByName !== 'function') {
      return null;
    }
    try {
      return Module.getGlobalExportByName(symbolName);
    } catch (_) {
      return null;
    }
  });

  for (let i = 0; i < attempts.length; i += 1) {
    try {
      const address = attempts[i]();
      if (address !== null && address !== undefined) {
        log(`resolved ${libraryName}!${symbolName} via ${attempts[i].name} @ ${address}`);
        return address;
      }
    } catch (error) {
      log(`resolver ${attempts[i].name} failed for ${libraryName}!${symbolName}: ${error}`);
    }
  }

  return null;
}

function installNativePropertyHookAt(address, libraryName, symbolName, reason) {
  if (nativePropertyHookInstalled) {
    return true;
  }

  Interceptor.attach(address, {
    onEnter(args) {
      this.symbolName = `${libraryName}!${symbolName}`;
      this.key = '<unreadable>';
      try {
        this.key = args[0].readCString();
      } catch (error) {
        this.key = `<key read failed: ${error}>`;
      }
      this.valuePtr = args[1];
    },
    onLeave(retval) {
      let value = '<unreadable>';
      try {
        if (this.valuePtr !== null && this.valuePtr !== undefined && !this.valuePtr.isNull()) {
          value = this.valuePtr.readCString();
        }
      } catch (error) {
        value = `<value read failed: ${error}>`;
      }
      log(`NativeProperty ${this.symbolName} key=${this.key} => ${value} retval=${safeString(retval)}`);
    }
  });

  nativePropertyHookInstalled = true;
  log(`installed native property hook ${libraryName}!${symbolName} @ ${address} reason=${reason}`);
  return true;
}

function tryInstallNativePropertyHook(reason) {
  if (nativePropertyHookInstalled) {
    return true;
  }

  const libraryName = 'libc.so';
  const symbolName = '__system_property_get';

  try {
    const address = findExportAddress(libraryName, symbolName);
    if (address === null || address === undefined) {
      log(`native property hook pending; ${libraryName}!${symbolName} not resolved reason=${reason}`);
      return false;
    }
    return installNativePropertyHookAt(address, libraryName, symbolName, reason);
  } catch (error) {
    log(`native property hook install attempt failed reason=${reason}: ${error}`);
    return false;
  }
}

function installNativePropertyLateResolution() {
  if (!nativePropertyObserverInstalled && typeof Process !== 'undefined' && typeof Process.attachModuleObserver === 'function') {
    try {
      Process.attachModuleObserver({
        onAdded(module) {
          try {
            if (!nativePropertyHookInstalled && module.name === 'libc.so') {
              log(`module observer noticed ${module.name}; retrying native property hook`);
              tryInstallNativePropertyHook('module-observer');
            }
          } catch (error) {
            log(`module observer native property retry failed: ${error}`);
          }
        }
      });
      nativePropertyObserverInstalled = true;
      log('installed native property module observer');
    } catch (error) {
      log(`skipped native property module observer: ${error}`);
    }
  } else if (!nativePropertyObserverInstalled) {
    log('native property module observer unavailable in this Frida runtime');
  }

  if (nativePropertyRetryTimer === null && typeof setInterval === 'function') {
    let attempts = 0;
    nativePropertyRetryTimer = setInterval(function () {
      attempts += 1;
      if (nativePropertyHookInstalled) {
        clearInterval(nativePropertyRetryTimer);
        nativePropertyRetryTimer = null;
        log(`native property retry loop stopped after successful install attempts=${attempts}`);
        return;
      }
      if (attempts > 40) {
        clearInterval(nativePropertyRetryTimer);
        nativePropertyRetryTimer = null;
        log('native property retry loop stopped; hook still unresolved after 40 attempts');
        return;
      }
      tryInstallNativePropertyHook(`retry-${attempts}`);
    }, 250);
    log('installed native property retry loop intervalMs=250 maxAttempts=40');
  }
}

function hookNativeSystemProperties() {
  log('installing native property instrumentation layer');
  if (tryInstallNativePropertyHook('initial')) {
    return;
  }
  installNativePropertyLateResolution();
}



let nativeInspectionHookInstalled = false;
const fdPathMap = {};

function isBufferPreviewPath(path) {
  if (path === null || path === undefined) {
    return false;
  }
  const text = safeString(path);
  return text.indexOf('maps') >= 0 ||
    text.indexOf('status') >= 0 ||
    text.indexOf('cmdline') >= 0 ||
    text.indexOf('auxv') >= 0 ||
    text.indexOf('mounts') >= 0;
}

const MAX_NATIVE_READ_PREVIEW_BYTES = 512;

function escapeNativeReadPreview(bytes) {
  const out = [];
  for (let i = 0; i < bytes.length; i += 1) {
    const value = bytes[i];
    if (value === 0) {
      out.push('\\0');
    } else if (value === 9) {
      out.push('\\t');
    } else if (value === 10) {
      out.push('\\n');
    } else if (value === 13) {
      out.push('\\r');
    } else if (value >= 32 && value <= 126) {
      out.push(String.fromCharCode(value));
    } else {
      out.push(`\\x${(`0${value.toString(16)}`).slice(-2)}`);
    }
  }
  return out.join('');
}

function readNativeReadPreview(bufferPtr, byteCount, label) {
  try {
    if (bufferPtr === null || bufferPtr === undefined || bufferPtr.isNull()) {
      return 'null';
    }
    if (byteCount <= 0) {
      return '';
    }
    const previewLength = Math.min(byteCount, MAX_NATIVE_READ_PREVIEW_BYTES);
    const byteArray = bufferPtr.readByteArray(previewLength);
    if (byteArray === null || byteArray === undefined) {
      return '<null byte array>';
    }
    return escapeNativeReadPreview(new Uint8Array(byteArray));
  } catch (error) {
    return `<${label} preview failed: ${error}>`;
  }
}

function isInterestingInspectionPath(path) {
  if (path === null || path === undefined) {
    return false;
  }
  const text = safeString(path);
  return text.indexOf('/proc/self/maps') >= 0 ||
    text.indexOf('/proc/self/status') >= 0 ||
    text.indexOf('/proc/self/task/') >= 0 ||
    text.indexOf('/proc/self/fd') >= 0 ||
    text.indexOf('/proc/self/cmdline') >= 0 ||
    text.indexOf('/proc/self/environ') >= 0 ||
    text.indexOf('/proc/self/mount') >= 0 ||
    text.indexOf('/proc/self/attr') >= 0 ||
    text.indexOf('/proc/self/exe') >= 0 ||
    text.indexOf('/proc/self/mem') >= 0 ||
    text.indexOf('/proc/thread-self') >= 0 ||
    text.indexOf('/proc/') >= 0 ||
    text.indexOf('/sys/') >= 0 ||
    text.indexOf('/dev/socket') >= 0 ||
    text.indexOf('frida') >= 0 ||
    text.indexOf('gum-js-loop') >= 0 ||
    text.indexOf('gmain') >= 0 ||
    text.indexOf('tracerpid') >= 0 ||
    text.indexOf('TracerPid') >= 0;
}

function readCStringArg(ptrValue, label) {
  try {
    if (ptrValue === null || ptrValue === undefined || ptrValue.isNull()) {
      return 'null';
    }
    return ptrValue.readCString();
  } catch (error) {
    return `<${label} read failed: ${error}>`;
  }
}

function pointerToSigned(value) {
  try {
    return value.toInt32();
  } catch (_) {
    return Number(value);
  }
}

function logNativeInspection(event) {
  log(`NativeInspection ${event}`);
}

function attachNativeInspectionHook(libraryName, symbolName, handlers) {
  try {
    const address = findExportAddress(libraryName, symbolName);
    if (address === null || address === undefined) {
      log(`native inspection symbol unavailable ${libraryName}!${symbolName}`);
      return false;
    }
    Interceptor.attach(address, handlers);
    log(`installed native inspection hook ${libraryName}!${symbolName} @ ${address}`);
    return true;
  } catch (error) {
    log(`FAILED installing native inspection hook ${libraryName}!${symbolName}: ${error}`);
    return false;
  }
}

function installPathInspectionHook(symbolName, pathArgIndex, options) {
  const opts = options || {};
  return attachNativeInspectionHook('libc.so', symbolName, {
    onEnter(args) {
      this.symbolName = symbolName;
      this.path = readCStringArg(args[pathArgIndex], 'path');
      this.dirfd = opts.dirfdArgIndex !== undefined ? pointerToSigned(args[opts.dirfdArgIndex]) : null;
      this.mode = opts.modeArgIndex !== undefined ? pointerToSigned(args[opts.modeArgIndex]) : null;
      this.modeString = opts.modeStringArgIndex !== undefined ? readCStringArg(args[opts.modeStringArgIndex], 'mode') : null;
      this.flags = opts.flagsArgIndex !== undefined ? pointerToSigned(args[opts.flagsArgIndex]) : null;
      this.shouldLog = opts.logAll === true || isInterestingInspectionPath(this.path);
      if (this.shouldLog) {
        const dirfdPart = this.dirfd === null ? '' : ` dirfd=${this.dirfd}`;
        const flagsPart = this.flags === null ? '' : ` flags=${this.flags}`;
        const modePart = this.mode === null ? '' : ` mode=${this.mode}`;
        const modeStringPart = this.modeString === null ? '' : ` modeString=${this.modeString}`;
        logNativeInspection(`${this.symbolName} enter path=${this.path}${dirfdPart}${flagsPart}${modePart}${modeStringPart}`);
      }
    },
    onLeave(retval) {
      if (!this.shouldLog) {
        return;
      }
      const rv = pointerToSigned(retval);
      if (opts.trackFd === true && rv >= 0) {
        fdPathMap[rv] = this.path;
      }
      logNativeInspection(`${this.symbolName} leave path=${this.path} retval=${safeString(retval)} signedRet=${rv}`);
    }
  });
}

function hookNativeInspection() {
  if (nativeInspectionHookInstalled) {
    return;
  }

  log('installing native inspection instrumentation layer');

  const installed = [];

  installed.push(attachNativeInspectionHook('libc.so', 'ptrace', {
    onEnter(args) {
      this.request = pointerToSigned(args[0]);
      this.pid = pointerToSigned(args[1]);
      this.addr = args[2];
      this.data = args[3];
      logNativeInspection(`ptrace enter request=${this.request} pid=${this.pid} addr=${safeString(this.addr)} data=${safeString(this.data)}`);
    },
    onLeave(retval) {
      logNativeInspection(`ptrace leave request=${this.request} pid=${this.pid} retval=${safeString(retval)} signedRet=${pointerToSigned(retval)}`);
    }
  }));

  installed.push(installPathInspectionHook('open', 0, { flagsArgIndex: 1, modeArgIndex: 2, trackFd: true, logAll: true }));
  installed.push(installPathInspectionHook('open64', 0, { flagsArgIndex: 1, modeArgIndex: 2, trackFd: true, logAll: true }));
  installed.push(installPathInspectionHook('openat', 1, { dirfdArgIndex: 0, flagsArgIndex: 2, modeArgIndex: 3, trackFd: true, logAll: true }));
  installed.push(installPathInspectionHook('openat64', 1, { dirfdArgIndex: 0, flagsArgIndex: 2, modeArgIndex: 3, trackFd: true, logAll: true }));
  installed.push(installPathInspectionHook('fopen', 0, { modeStringArgIndex: 1, logAll: true }));
  installed.push(installPathInspectionHook('fopen64', 0, { modeStringArgIndex: 1, logAll: true }));
  installed.push(installPathInspectionHook('access', 0, { modeArgIndex: 1, logAll: true }));
  installed.push(installPathInspectionHook('faccessat', 1, { dirfdArgIndex: 0, modeArgIndex: 2, flagsArgIndex: 3, logAll: true }));
  installed.push(installPathInspectionHook('stat', 0, { logAll: true }));
  installed.push(installPathInspectionHook('stat64', 0, { logAll: true }));
  installed.push(installPathInspectionHook('lstat', 0, { logAll: true }));
  installed.push(installPathInspectionHook('lstat64', 0, { logAll: true }));
  installed.push(installPathInspectionHook('fstatat', 1, { dirfdArgIndex: 0, flagsArgIndex: 3, logAll: true }));
  installed.push(installPathInspectionHook('readlink', 0, { logAll: true }));
  installed.push(installPathInspectionHook('readlinkat', 1, { dirfdArgIndex: 0, logAll: true }));


  installed.push(attachNativeInspectionHook('libc.so', 'fstat', {
    onEnter(args) {
      this.fd = pointerToSigned(args[0]);
      this.path = Object.prototype.hasOwnProperty.call(fdPathMap, this.fd) ? fdPathMap[this.fd] : '<unknown>';
      this.shouldLog = isInterestingInspectionPath(this.path);
      if (this.shouldLog) {
        logNativeInspection(`fstat enter fd=${this.fd} path=${this.path}`);
      }
    },
    onLeave(retval) {
      if (this.shouldLog) {
        logNativeInspection(`fstat leave fd=${this.fd} path=${this.path} retval=${safeString(retval)} signedRet=${pointerToSigned(retval)}`);
      }
    }
  }));

  installed.push(attachNativeInspectionHook('libc.so', 'fstat64', {
    onEnter(args) {
      this.fd = pointerToSigned(args[0]);
      this.path = Object.prototype.hasOwnProperty.call(fdPathMap, this.fd) ? fdPathMap[this.fd] : '<unknown>';
      this.shouldLog = isInterestingInspectionPath(this.path);
      if (this.shouldLog) {
        logNativeInspection(`fstat64 enter fd=${this.fd} path=${this.path}`);
      }
    },
    onLeave(retval) {
      if (this.shouldLog) {
        logNativeInspection(`fstat64 leave fd=${this.fd} path=${this.path} retval=${safeString(retval)} signedRet=${pointerToSigned(retval)}`);
      }
    }
  }));

  function installReadBufferInspectionHook(symbolName, options) {
    const opts = options || {};
    return attachNativeInspectionHook('libc.so', symbolName, {
      onEnter(args) {
        this.fd = pointerToSigned(args[0]);
        this.bufferPtr = args[1];
        this.count = pointerToSigned(args[2]);
        this.offset = opts.offsetArgIndex !== undefined ? safeString(args[opts.offsetArgIndex]) : null;
        this.path = Object.prototype.hasOwnProperty.call(fdPathMap, this.fd) ? fdPathMap[this.fd] : '<unknown>';
        this.shouldLog = isInterestingInspectionPath(this.path);
        this.shouldPreview = isBufferPreviewPath(this.path);
        if (this.shouldLog) {
          const offsetPart = this.offset === null ? '' : ` offset=${this.offset}`;
          logNativeInspection(`${symbolName} enter fd=${this.fd} path=${this.path} count=${this.count}${offsetPart}`);
        }
      },
      onLeave(retval) {
        if (!this.shouldLog) {
          return;
        }
        const signedRet = pointerToSigned(retval);
        const previewPart = this.shouldPreview && signedRet > 0 ?
          ` previewBytes=${Math.min(signedRet, MAX_NATIVE_READ_PREVIEW_BYTES)} preview=${JSON.stringify(readNativeReadPreview(this.bufferPtr, signedRet, symbolName))}` :
          '';
        logNativeInspection(`${symbolName} leave fd=${this.fd} path=${this.path} retval=${safeString(retval)} signedRet=${signedRet}${previewPart}`);
      }
    });
  }

  installed.push(installReadBufferInspectionHook('read'));
  installed.push(installReadBufferInspectionHook('pread', { offsetArgIndex: 3 }));
  installed.push(installReadBufferInspectionHook('pread64', { offsetArgIndex: 3 }));

  installed.push(attachNativeInspectionHook('libc.so', 'close', {
    onEnter(args) {
      this.fd = pointerToSigned(args[0]);
      this.path = Object.prototype.hasOwnProperty.call(fdPathMap, this.fd) ? fdPathMap[this.fd] : '<unknown>';
      this.shouldLog = isInterestingInspectionPath(this.path);
      if (this.shouldLog) {
        logNativeInspection(`close enter fd=${this.fd} path=${this.path}`);
      }
    },
    onLeave(retval) {
      if (this.shouldLog) {
        logNativeInspection(`close leave fd=${this.fd} path=${this.path} retval=${safeString(retval)} signedRet=${pointerToSigned(retval)}`);
      }
      if (Object.prototype.hasOwnProperty.call(fdPathMap, this.fd)) {
        delete fdPathMap[this.fd];
      }
    }
  }));

  nativeInspectionHookInstalled = installed.some(function (value) { return value; });
  log(`native inspection instrumentation install complete installedAny=${nativeInspectionHookInstalled}`);
}

function hookNativeLibraryLoading() {
  if (nativeLibraryHookInstalled) {
    return;
  }

  const nativeCandidates = [
    ['libdl.so', 'android_dlopen_ext'],
    ['libdl.so', 'dlopen']
  ];

  nativeCandidates.forEach(function (candidate) {
    const libraryName = candidate[0];
    const symbolName = candidate[1];
    try {
      const address = findExportAddress(libraryName, symbolName);
      if (address === null || address === undefined) {
        log(`native library load symbol unavailable ${libraryName}!${symbolName}`);
        return;
      }
      Interceptor.attach(address, {
        onEnter(args) {
          this.symbolName = `${libraryName}!${symbolName}`;
          this.path = '<unreadable>';
          try {
            this.path = args[0].readCString();
          } catch (error) {
            this.path = `<path read failed: ${error}>`;
          }
        },
        onLeave(retval) {
          log(`NativeLibrary ${this.symbolName} path=${this.path} retval=${safeString(retval)}`);
        }
      });
      log(`installed native library load hook ${libraryName}!${symbolName} @ ${address}`);
      nativeLibraryHookInstalled = true;
    } catch (error) {
      log(`FAILED installing native library load hook ${libraryName}!${symbolName}: ${error}`);
    }
  });
}

function hookJavaLibraryLoading() {
  const Runtime = Java.use('java.lang.Runtime');

  installSafely('Runtime.load0(Class,String) hook', function () {
    const load0 = Runtime.load0.overload('java.lang.Class', 'java.lang.String');
    load0.implementation = function (fromClass, filename) {
      log(`Runtime.load0 fromClass=${safeString(fromClass)} filename=${safeString(filename)}`);
      return load0.call(this, fromClass, filename);
    };
  });

  installSafely('Runtime.loadLibrary0(ClassLoader,Class,String) hook', function () {
    const loadLibrary0 = Runtime.loadLibrary0.overload('java.lang.ClassLoader', 'java.lang.Class', 'java.lang.String');
    loadLibrary0.implementation = function (loader, fromClass, libname) {
      log(`Runtime.loadLibrary0 loader=${safeString(loader)} fromClass=${safeString(fromClass)} libname=${safeString(libname)}`);
      return loadLibrary0.call(this, loader, fromClass, libname);
    };
  });
}

function tryInstallLateClassHooks(className, reason) {
  if (pendingClassHookNames[className]) {
    return;
  }

  if (className === `${PACKAGE_NAME}.MessageGuardException`) {
    if (installSafely(`MessageGuardException logging (${reason})`, hookMessageGuardException)) {
      pendingClassHookNames[className] = true;
    }
  } else if (className === `${PACKAGE_NAME}.ProtectedMyApplication` || className === `${PACKAGE_NAME}.ProtectedMyApplication$ProtectedMyApplication`) {
    if (installSafely(`ProtectedMyApplication startup logging (${reason})`, hookProtectedApplication)) {
      pendingClassHookNames[`${PACKAGE_NAME}.ProtectedMyApplication`] = true;
      pendingClassHookNames[`${PACKAGE_NAME}.ProtectedMyApplication$ProtectedMyApplication`] = true;
    }
  }
}

function hookClassLoaderObservation() {
  const ClassLoader = Java.use('java.lang.ClassLoader');
  const interesting = [
    `${PACKAGE_NAME}.ProtectedMyApplication`,
    `${PACKAGE_NAME}.ProtectedMyApplication$ProtectedMyApplication`,
    `${PACKAGE_NAME}.MessageGuardException`
  ];

  const loadClass = ClassLoader.loadClass.overload('java.lang.String', 'boolean');
  loadClass.implementation = function (name, resolve) {
    const klass = loadClass.call(this, name, resolve);
    if (interesting.indexOf(safeString(name)) >= 0) {
      log(`ClassLoader.loadClass observed name=${safeString(name)} resolve=${resolve} loader=${safeString(this)} result=${safeString(klass)}`);
      tryInstallLateClassHooks(safeString(name), 'classloader-observed');
    }
    return klass;
  };
  log('installed ClassLoader.loadClass(String,boolean) observer');
}

function installJavaInstrumentation(reason) {
  if (javaInstrumentationInstalled) {
    log(`Java instrumentation already installed reason=${reason}`);
    return;
  }

  javaReady = true;
  const previousPhase = startupPhase;
  startupPhase = 'java-perform';
  log(`Java.perform begin reason=${reason}`);

  try {
    Throwable = Java.use('java.lang.Throwable');
    log('installed Throwable helper');

    installSafely('SystemProperties logging', hookSystemProperties);
    installSafely('Build reflection access logging', hookReflectionBuildAccess);
    installSafely('RuntimeException DP logging', hookRuntimeExceptions);
    installSafely('MessageGuardException logging', hookMessageGuardException);
    installSafely('ProtectedMyApplication startup logging', hookProtectedApplication);
    installSafely('Java native library loading logging', hookJavaLibraryLoading);
    installSafely('ClassLoader observation', hookClassLoaderObservation);
    logBuildSnapshot('initial-java-perform');

    javaInstrumentationInstalled = true;
    log(`probe ready javaReady=${javaReady} javaInstrumentationInstalled=${javaInstrumentationInstalled}`);
  } finally {
    startupPhase = previousPhase;
  }
}

function scheduleJavaInstrumentation() {
  if (typeof Java === 'undefined') {
    log('Java API unavailable in this Frida runtime; cannot schedule Java instrumentation');
    return;
  }

  function attempt(reason) {
    if (javaInstrumentationInstalled) {
      return true;
    }
    let available = false;
    try {
      available = Java.available;
    } catch (error) {
      log(`Java availability check failed reason=${reason}: ${error}`);
      return false;
    }

    log(`Java availability check reason=${reason} Java.available=${available}`);
    if (!available) {
      return false;
    }

    log(`Java became available reason=${reason}; scheduling Java.perform`);
    Java.perform(function () {
      installJavaInstrumentation(reason);
    });
    return true;
  }

  if (attempt('initial')) {
    return;
  }

  if (javaRetryTimer === null && typeof setInterval === 'function') {
    let attempts = 0;
    javaRetryTimer = setInterval(function () {
      attempts += 1;
      if (javaInstrumentationInstalled) {
        clearInterval(javaRetryTimer);
        javaRetryTimer = null;
        log(`Java retry loop stopped after successful install attempts=${attempts}`);
        return;
      }
      if (attempts > 80) {
        clearInterval(javaRetryTimer);
        javaRetryTimer = null;
        log('Java retry loop stopped; Java instrumentation not installed after 80 attempts');
        return;
      }
      attempt(`retry-${attempts}`);
    }, 50);
    log('installed Java availability retry loop intervalMs=50 maxAttempts=80');
  }
}

setImmediate(function () {
  log('probe loading');
  hookNativeSystemProperties();
  hookNativeInspection();
  hookNativeLibraryLoading();
  scheduleJavaInstrumentation();
});
