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
 *   frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_telemetry_probe.js --no-pause
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
  } catch (error) {
    log(`skipped ${name}: ${error}`);
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

  const initString = RuntimeException.$init.overload('java.lang.String');
  initString.implementation = function (message) {
    const ret = initString.call(this, message);
    if (message !== null && safeString(message).indexOf('DP: ') >= 0) {
      log(`RuntimeException(String) DP message=${safeString(message)}`);
      log(`RuntimeException(String) DP stack=${stackOf(this)}`);
    }
    return ret;
  };

  const initStringThrowable = RuntimeException.$init.overload('java.lang.String', 'java.lang.Throwable');
  initStringThrowable.implementation = function (message, cause) {
    const ret = initStringThrowable.call(this, message, cause);
    if (message !== null && safeString(message).indexOf('DP: ') >= 0) {
      log(`RuntimeException(String,Throwable) DP message=${safeString(message)} cause=${safeString(cause)}`);
      log(`RuntimeException(String,Throwable) DP stack=${stackOf(this)}`);
    }
    return ret;
  };
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

function hookNativeSystemProperties() {
  const candidates = [
    ['libc.so', '__system_property_get']
  ];

  candidates.forEach(function (candidate) {
    const libraryName = candidate[0];
    const symbolName = candidate[1];
    try {
      const address = Module.findExportByName(libraryName, symbolName);
      if (address === null) {
        log(`native property symbol unavailable ${libraryName}!${symbolName}`);
        return;
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
            if (this.symbolName.indexOf('__system_property_get') >= 0 && !this.valuePtr.isNull()) {
              value = this.valuePtr.readCString();
            } else {
              value = `<retval=${safeString(retval)}>`;
            }
          } catch (error) {
            value = `<value read failed: ${error}>`;
          }
          log(`NativeProperty ${this.symbolName} key=${this.key} => ${value} retval=${safeString(retval)}`);
        }
      });
      log(`installed native property hook ${libraryName}!${symbolName} @ ${address}`);
    } catch (error) {
      log(`skipped native property hook ${libraryName}!${symbolName}: ${error}`);
    }
  });

}

setImmediate(function () {
  log('probe loading');
  hookNativeSystemProperties();

  Java.perform(function () {
    javaReady = true;
    startupPhase = 'java-perform';
    Throwable = Java.use('java.lang.Throwable');

    installSafely('SystemProperties logging', hookSystemProperties);
    installSafely('Build reflection access logging', hookReflectionBuildAccess);
    installSafely('RuntimeException DP logging', hookRuntimeExceptions);
    installSafely('MessageGuardException logging', hookMessageGuardException);
    installSafely('ProtectedMyApplication startup logging', hookProtectedApplication);
    logBuildSnapshot('initial-java-perform');
    log(`probe ready javaReady=${javaReady}`);
  });
});
