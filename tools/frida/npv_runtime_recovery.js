'use strict';

/*
 * NPV Tunnel runtime recovery hooks.
 * Usage:
 *   frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_runtime_recovery.js --no-pause
 */

const PACKAGE_NAME = 'com.napsternetlabs.napsternetv';
const DUMP_DIR = `/data/data/${PACKAGE_NAME}/files/npv_runtime_dumps`;
const MAX_BUFFER_DUMP = 8 * 1024 * 1024;

function log(message) {
  console.log(`[npv-runtime] ${message}`);
}

function javaBytesToArray(javaBytes) {
  if (javaBytes === null || javaBytes === undefined) {
    return [];
  }
  const out = [];
  for (let i = 0; i < javaBytes.length; i += 1) {
    out.push(javaBytes[i]);
  }
  return out;
}

function bytesToHex(bytes, limit) {
  const count = Math.min(bytes.length, limit || bytes.length);
  const out = [];
  for (let i = 0; i < count; i += 1) {
    out.push(((bytes[i] & 0xff) + 0x100).toString(16).slice(1));
  }
  if (bytes.length > count) {
    out.push(`...(+${bytes.length - count})`);
  }
  return out.join(' ');
}

function printablePreview(bytes, limit) {
  const count = Math.min(bytes.length, limit || 256);
  let out = '';
  for (let i = 0; i < count; i += 1) {
    const value = bytes[i] & 0xff;
    out += value >= 0x20 && value <= 0x7e ? String.fromCharCode(value) : '.';
  }
  if (bytes.length > count) {
    out += `...(+${bytes.length - count})`;
  }
  return out;
}

function ensureDumpDir() {
  const File = Java.use('java.io.File');
  const dir = File.$new(DUMP_DIR);
  if (!dir.exists()) {
    dir.mkdirs();
  }
}

function writeJavaBytes(name, javaBytes) {
  ensureDumpDir();
  const FileOutputStream = Java.use('java.io.FileOutputStream');
  const path = `${DUMP_DIR}/${Date.now()}_${name}`;
  const stream = FileOutputStream.$new(path);
  stream.write(javaBytes);
  stream.close();
  log(`dumped ${name} -> ${path} (${javaBytes.length} bytes)`);
}

function dumpByteArrayIfDex(name, javaBytes) {
  if (!javaBytes || javaBytes.length < 4) {
    return;
  }
  const arr = javaBytesToArray(javaBytes);
  const magic = String.fromCharCode(arr[0] & 0xff, arr[1] & 0xff, arr[2] & 0xff, arr[3] & 0xff);
  if (magic === 'dex\n' || magic === 'PK\u0003\u0004') {
    writeJavaBytes(name, javaBytes);
  }
}

function dumpByteBuffer(name, buffer) {
  const duplicate = buffer.duplicate();
  duplicate.position(0);
  const remaining = duplicate.remaining();
  const dumpSize = Math.min(remaining, MAX_BUFFER_DUMP);
  const javaBytes = Java.array('byte', new Array(dumpSize).fill(0));
  duplicate.get(javaBytes, 0, dumpSize);
  const arr = javaBytesToArray(javaBytes);
  log(`${name}: remaining=${remaining}, first=${bytesToHex(arr, 16)}, preview=${printablePreview(arr, 96)}`);
  dumpByteArrayIfDex(`${name}_${remaining}.dex`, javaBytes);
}

function installSafely(name, installer) {
  try {
    installer();
    log(`installed ${name}`);
  } catch (error) {
    log(`skipped ${name}: ${error}`);
  }
}

function hookProtectedApplication() {
  const ProtectedMyApplication = Java.use('com.napsternetlabs.napsternetv.ProtectedMyApplication');
  const attachBaseContext = ProtectedMyApplication.attachBaseContext.overload('android.content.Context');
  const onCreate = ProtectedMyApplication.onCreate.overload();

  attachBaseContext.implementation = function hookedAttachBaseContext(context) {
    log('ProtectedMyApplication.attachBaseContext() entry');
    const result = attachBaseContext.call(this, context);
    log('ProtectedMyApplication.attachBaseContext() exit; DexProtector bootstrap should have returned');
    return result;
  };

  onCreate.implementation = function hookedOnCreate() {
    log('ProtectedMyApplication.onCreate() entry');
    const result = onCreate.call(this);
    log('ProtectedMyApplication.onCreate() exit; zInq(Object) material handoff should have completed');
    return result;
  };
}

function hookClassLoading() {
  const DexClassLoader = Java.use('dalvik.system.DexClassLoader');
  const dexInit = DexClassLoader.$init.overload('java.lang.String', 'java.lang.String', 'java.lang.String', 'java.lang.ClassLoader');
  dexInit.implementation = function hookedDexInit(dexPath, optimizedDirectory, librarySearchPath, parent) {
    log(`DexClassLoader(dexPath=${dexPath}, optimizedDirectory=${optimizedDirectory}, librarySearchPath=${librarySearchPath}, parent=${parent})`);
    return dexInit.call(this, dexPath, optimizedDirectory, librarySearchPath, parent);
  };

  const PathClassLoader = Java.use('dalvik.system.PathClassLoader');
  const pathInitTwo = PathClassLoader.$init.overload('java.lang.String', 'java.lang.ClassLoader');
  pathInitTwo.implementation = function hookedPathInitTwo(path, parent) {
    log(`PathClassLoader(path=${path}, parent=${parent})`);
    return pathInitTwo.call(this, path, parent);
  };
  const pathInitThree = PathClassLoader.$init.overload('java.lang.String', 'java.lang.String', 'java.lang.ClassLoader');
  pathInitThree.implementation = function hookedPathInitThree(path, librarySearchPath, parent) {
    log(`PathClassLoader(path=${path}, librarySearchPath=${librarySearchPath}, parent=${parent})`);
    return pathInitThree.call(this, path, librarySearchPath, parent);
  };

  const ClassLoader = Java.use('java.lang.ClassLoader');
  const loadClass = ClassLoader.loadClass.overload('java.lang.String');
  loadClass.implementation = function hookedLoadClass(className) {
    const klass = loadClass.call(this, className);
    if (className.indexOf('com.napsternetlabs') === 0 || className.indexOf('libnpvtunnel') === 0) {
      log(`loadClass(${className}) via ${this}`);
    }
    return klass;
  };
}

function hookInMemoryDexClassLoader() {
  const InMemoryDexClassLoader = Java.use('dalvik.system.InMemoryDexClassLoader');
  const single = InMemoryDexClassLoader.$init.overload('java.nio.ByteBuffer', 'java.lang.ClassLoader');
  single.implementation = function hookedSingle(buffer, parent) {
    dumpByteBuffer('InMemoryDexClassLoader_single', buffer);
    return single.call(this, buffer, parent);
  };
  const array = InMemoryDexClassLoader.$init.overload('[Ljava.nio.ByteBuffer;', 'java.lang.ClassLoader');
  array.implementation = function hookedArray(buffers, parent) {
    for (let i = 0; i < buffers.length; i += 1) {
      dumpByteBuffer(`InMemoryDexClassLoader_array_${i}`, buffers[i]);
    }
    return array.call(this, buffers, parent);
  };
}

function hookFileWrites() {
  const FileOutputStream = Java.use('java.io.FileOutputStream');
  const File = Java.use('java.io.File');
  const streamPaths = {};

  const initString = FileOutputStream.$init.overload('java.lang.String');
  initString.implementation = function hookedInitString(path) {
    streamPaths[this.$h] = `${path}`;
    return initString.call(this, path);
  };
  const initFile = FileOutputStream.$init.overload('java.io.File');
  initFile.implementation = function hookedInitFile(file) {
    streamPaths[this.$h] = `${file.getAbsolutePath()}`;
    return initFile.call(this, file);
  };
  const initStringBool = FileOutputStream.$init.overload('java.lang.String', 'boolean');
  initStringBool.implementation = function hookedInitStringBool(path, append) {
    streamPaths[this.$h] = `${path}`;
    return initStringBool.call(this, path, append);
  };
  const initFileBool = FileOutputStream.$init.overload('java.io.File', 'boolean');
  initFileBool.implementation = function hookedInitFileBool(file, append) {
    streamPaths[this.$h] = `${file.getAbsolutePath()}`;
    return initFileBool.call(this, file, append);
  };

  const writeBytes = FileOutputStream.write.overload('[B');
  writeBytes.implementation = function hookedWriteBytes(bytes) {
    const path = streamPaths[this.$h] || '<unknown>';
    if (path.indexOf(PACKAGE_NAME) >= 0 || path.indexOf('/data/data/') >= 0 || path.indexOf('/data/user/') >= 0) {
      const arr = javaBytesToArray(bytes);
      log(`FileOutputStream.write([B]) path=${path}, len=${bytes.length}, first=${bytesToHex(arr, 16)}`);
      dumpByteArrayIfDex('file_write_full.dex', bytes);
    }
    return writeBytes.call(this, bytes);
  };

  const writeSlice = FileOutputStream.write.overload('[B', 'int', 'int');
  writeSlice.implementation = function hookedWriteSlice(bytes, off, len) {
    const path = streamPaths[this.$h] || '<unknown>';
    if ((path.indexOf(PACKAGE_NAME) >= 0 || path.indexOf('/data/data/') >= 0 || path.indexOf('/data/user/') >= 0) && len >= 4) {
      const arr = javaBytesToArray(bytes).slice(off, off + Math.min(len, 32));
      log(`FileOutputStream.write([B,int,int]) path=${path}, off=${off}, len=${len}, first=${bytesToHex(arr, 16)}`);
    }
    return writeSlice.call(this, bytes, off, len);
  };

  const renameTo = File.renameTo.overload('java.io.File');
  renameTo.implementation = function hookedRenameTo(dest) {
    log(`File.renameTo(${this.getAbsolutePath()} -> ${dest.getAbsolutePath()})`);
    return renameTo.call(this, dest);
  };
}

function hookNetwork() {
  const URL = Java.use('java.net.URL');
  const openConnection = URL.openConnection.overload();
  openConnection.implementation = function hookedOpenConnection() {
    log(`URL.openConnection(${this.toString()})`);
    return openConnection.call(this);
  };

  const HttpURLConnection = Java.use('java.net.HttpURLConnection');
  const getInputStream = HttpURLConnection.getInputStream.overload();
  getInputStream.implementation = function hookedGetInputStream() {
    log(`HttpURLConnection.getInputStream(url=${this.getURL()}, method=${this.getRequestMethod()}, code=${this.getResponseCode()})`);
    return getInputStream.call(this);
  };
  const getOutputStream = HttpURLConnection.getOutputStream.overload();
  getOutputStream.implementation = function hookedGetOutputStream() {
    log(`HttpURLConnection.getOutputStream(url=${this.getURL()}, method=${this.getRequestMethod()})`);
    return getOutputStream.call(this);
  };
}

function hookCryptoAndEncoding() {
  const SecretKeySpec = Java.use('javax.crypto.spec.SecretKeySpec');
  const secretKeySpecInit = SecretKeySpec.$init.overload('[B', 'java.lang.String');
  secretKeySpecInit.implementation = function hookedSecretKeySpec(key, algorithm) {
    log(`SecretKeySpec(algorithm=${algorithm}, keyLen=${key.length}, key=${bytesToHex(javaBytesToArray(key), 64)})`);
    return secretKeySpecInit.call(this, key, algorithm);
  };

  const IvParameterSpec = Java.use('javax.crypto.spec.IvParameterSpec');
  const ivInit = IvParameterSpec.$init.overload('[B');
  ivInit.implementation = function hookedIv(iv) {
    log(`IvParameterSpec(ivLen=${iv.length}, iv=${bytesToHex(javaBytesToArray(iv), 64)})`);
    return ivInit.call(this, iv);
  };

  const GCMParameterSpec = Java.use('javax.crypto.spec.GCMParameterSpec');
  const gcmInit = GCMParameterSpec.$init.overload('int', '[B');
  gcmInit.implementation = function hookedGcm(tagLength, iv) {
    log(`GCMParameterSpec(tagLength=${tagLength}, ivLen=${iv.length}, iv=${bytesToHex(javaBytesToArray(iv), 64)})`);
    return gcmInit.call(this, tagLength, iv);
  };

  const Cipher = Java.use('javax.crypto.Cipher');
  const getInstance = Cipher.getInstance.overload('java.lang.String');
  getInstance.implementation = function hookedGetInstance(transformation) {
    log(`Cipher.getInstance(${transformation})`);
    return getInstance.call(this, transformation);
  };
  const doFinal = Cipher.doFinal.overload('[B');
  doFinal.implementation = function hookedDoFinal(input) {
    const inArr = javaBytesToArray(input);
    log(`Cipher.doFinal inputLen=${input.length}, input=${bytesToHex(inArr, 64)}, preview=${printablePreview(inArr, 128)}`);
    const output = doFinal.call(this, input);
    const outArr = javaBytesToArray(output);
    log(`Cipher.doFinal outputLen=${output.length}, output=${bytesToHex(outArr, 64)}, preview=${printablePreview(outArr, 256)}`);
    dumpByteArrayIfDex('cipher_output.dex', output);
    return output;
  };

  const Base64 = Java.use('android.util.Base64');
  const decodeString = Base64.decode.overload('java.lang.String', 'int');
  decodeString.implementation = function hookedDecodeString(input, flags) {
    log(`Base64.decode(String,len=${input.length}, flags=${flags}, preview=${input.substring(0, Math.min(input.length, 160))})`);
    const output = decodeString.call(this, input, flags);
    const outArr = javaBytesToArray(output);
    log(`Base64.decode outputLen=${output.length}, output=${bytesToHex(outArr, 32)}, preview=${printablePreview(outArr, 160)}`);
    return output;
  };
}

function hookTunnelSinks() {
  const Libnpvtunnel = Java.use('libnpvtunnel.Libnpvtunnel');
  const validateSshConfig = Libnpvtunnel.validateSshConfig.overload('[B');
  validateSshConfig.implementation = function hookedValidateSshConfig(configBytes) {
    const arr = javaBytesToArray(configBytes);
    log(`validateSshConfig len=${configBytes.length}, first=${bytesToHex(arr, 64)}, preview=${printablePreview(arr, 512)}`);
    writeJavaBytes('validateSshConfig_input.bin', configBytes);
    return validateSshConfig.call(this, configBytes);
  };
  const validateV2rayConfig = Libnpvtunnel.validateV2rayConfig.overload('java.lang.String');
  validateV2rayConfig.implementation = function hookedValidateV2rayConfig(configString) {
    log(`validateV2rayConfig len=${configString.length}, preview=${configString.substring(0, Math.min(configString.length, 2048))}`);
    return validateV2rayConfig.call(this, configString);
  };
  const testV2rayJsonConfig = Libnpvtunnel.testV2rayJsonConfig.overload('[B');
  testV2rayJsonConfig.implementation = function hookedTestV2rayJsonConfig(configBytes) {
    const arr = javaBytesToArray(configBytes);
    log(`testV2rayJsonConfig len=${configBytes.length}, first=${bytesToHex(arr, 64)}, preview=${printablePreview(arr, 1024)}`);
    writeJavaBytes('testV2rayJsonConfig_input.json', configBytes);
    return testV2rayJsonConfig.call(this, configBytes);
  };

  const SshTunnel = Java.use('libnpvtunnel.SshTunnel');
  const sshStart = SshTunnel.start.overload('[B', 'libnpvtunnel.SshTunnelInterface', 'boolean', 'java.lang.String', 'long', 'long', 'boolean', 'boolean', 'boolean', 'java.lang.String');
  sshStart.implementation = function hookedSshStart(configBytes, callback, udpRelayMode, dnsServer, connectTimeout, readWriteTimeout, enableCompression, enableMux, enableUdp, logLevel) {
    const arr = javaBytesToArray(configBytes);
    log(`SshTunnel.start len=${configBytes.length}, preview=${printablePreview(arr, 1024)}`);
    writeJavaBytes('SshTunnel_start_config.bin', configBytes);
    return sshStart.call(this, configBytes, callback, udpRelayMode, dnsServer, connectTimeout, readWriteTimeout, enableCompression, enableMux, enableUdp, logLevel);
  };

  const XrayTunnel = Java.use('libnpvtunnel.XrayTunnel');
  const xrayStart = XrayTunnel.start.overload('[B', 'libnpvtunnel.XrayTunnelInterface', 'java.lang.String', 'java.lang.String', 'boolean', 'boolean', 'boolean', 'boolean', 'java.lang.String');
  xrayStart.implementation = function hookedXrayStart(configBytes, callback, datDir, configName, domainStrategy, sniffing, mux, allowInsecure, logLevel) {
    const arr = javaBytesToArray(configBytes);
    log(`XrayTunnel.start len=${configBytes.length}, preview=${printablePreview(arr, 2048)}`);
    writeJavaBytes('XrayTunnel_start_config.json', configBytes);
    return xrayStart.call(this, configBytes, callback, datDir, configName, domainStrategy, sniffing, mux, allowInsecure, logLevel);
  };
}

Java.perform(function main() {
  log('installing runtime recovery hooks');
  ensureDumpDir();
  installSafely('ProtectedMyApplication timing hooks', hookProtectedApplication);
  installSafely('class-loader hooks', hookClassLoading);
  installSafely('InMemoryDexClassLoader hooks', hookInMemoryDexClassLoader);
  installSafely('file-write hooks', hookFileWrites);
  installSafely('network hooks', hookNetwork);
  installSafely('crypto/encoding hooks', hookCryptoAndEncoding);
  installSafely('libnpvtunnel sink hooks', hookTunnelSinks);
  log(`hooks installed; dump directory: ${DUMP_DIR}`);
});
