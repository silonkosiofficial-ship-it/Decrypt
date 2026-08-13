# NPV Tunnel cloud-config unlocking mechanism — runtime recovery plan

## Executive conclusion

Static analysis has reached the DexProtector protection boundary. The readable JADX and apktool trees expose the bootstrap and the final native tunnel sinks, but not the real cloud importer/unlocker. The next useful step is therefore runtime recovery: dump the protected runtime DEX after DexProtector initialization, analyze that recovered DEX separately, and trace the cloud response through decode/decrypt/parsing into `libnpvtunnel` validation/start calls.

This update intentionally does **not** continue searching the visible JADX tree for the cloud decryptor. The visible tree is still useful as an anchor for runtime hooks because it identifies the startup sequence, native JNI boundary, and plaintext sink methods.

A Frida runtime recovery harness has been added at `tools/frida/npv_runtime_recovery.js`. It is designed to capture class-loader events, in-memory DEX buffers, file-backed DEX extraction, Java crypto/encoding boundaries, HTTP connection activity, and final `libnpvtunnel` SSH/Xray config sinks.

## Current proven boundary

### Startup chain

```text
ProtectedMyApplication.attachBaseContext(Context)
 ↓
ProtectedMyApplication$ProtectedMyApplication$a$a.a(Context)
 ↓
System.loadLibrary("alice")
 ↓
ProtectedMyApplication.MainActivity.d.a(Context)
ProtectedMyApplication.MainActivity.d.a(filesDir)
 ↓
ProtectedMyApplication.J() certificate SHA-256 check
 ↓
System.loadLibrary("dpboot")
 ↓
ProtectedMyApplication.uapgpA()
 ↓
DexProtector runtime loading boundary
```

### Protected asset state

* `assets/classes.dex.dat` is the protected payload candidate.
* It is not a plaintext DEX/ZIP/ELF/GZIP blob in the extracted APK form.
* The resulting hidden runtime classes have not been recovered statically.
* `libalice.so` imports Android asset APIs and filesystem/dynamic-loader APIs, so runtime recovery must watch both memory-backed and file-backed loading.

### Material that must not be mislabeled

`ProtectedMyApplication.onCreate()` calls native `gwj()`, transforms the first 32 bytes through two substitution tables, and passes the result to native `zInq(Object)`. This is proven DexProtector state/material handoff. It is **not** proven to be a cloud-config key.

## Runtime objective

Recover this actual application flow:

```text
Cloud response
 ↓
raw bytes/string
 ↓
decode/decrypt/decompress/verify
 ↓
plaintext SSH config bytes or Xray/V2Ray JSON
 ↓
libnpvtunnel.Libnpvtunnel.validateSshConfig(byte[])
or
libnpvtunnel.Libnpvtunnel.validateV2rayConfig(String)
libnpvtunnel.Libnpvtunnel.testV2rayJsonConfig(byte[])
 ↓
libnpvtunnel.SshTunnel.start(byte[], ...)
or
libnpvtunnel.XrayTunnel.start(byte[], ...)
```

The goal is not a generic DexProtector bypass. DexProtector dumping is only the required route to the cloud-unlock implementation.

## Added runtime recovery harness

File: `tools/frida/npv_runtime_recovery.js`

Usage example:

```text
frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_runtime_recovery.js --no-pause
```

Default dump directory on device:

```text
/data/data/com.napsternetlabs.napsternetv/files/npv_runtime_dumps
```

### 1. DexProtector initialization timing hooks

The harness hooks:

* `com.napsternetlabs.napsternetv.ProtectedMyApplication.attachBaseContext(Context)`
* `com.napsternetlabs.napsternetv.ProtectedMyApplication.onCreate()`

Purpose:

```text
Application launch
 ↓
attachBaseContext() entry
 ↓
libalice/libdpboot/uapgpA() execution inside original method
 ↓
attachBaseContext() exit: first point where hidden classes may be loaded
 ↓
onCreate() entry/exit: zInq(Object) material handoff should complete
 ↓
enumerate class-loading and watch cloud/tunnel behavior
```

Expected evidence:

* Timestamped logs showing when DexProtector initialization finishes.
* A synchronization point for post-bootstrap class enumeration and DEX dumping.

### 2. Class loading and DEX-loading hooks

The harness hooks:

* `dalvik.system.DexClassLoader.<init>(String,String,String,ClassLoader)`
* `dalvik.system.PathClassLoader.<init>(String,ClassLoader)`
* `dalvik.system.PathClassLoader.<init>(String,String,ClassLoader)`
* `dalvik.system.InMemoryDexClassLoader.<init>(ByteBuffer,ClassLoader)`
* `dalvik.system.InMemoryDexClassLoader.<init>(ByteBuffer[],ClassLoader)`
* `java.lang.ClassLoader.loadClass(String)` for `com.napsternetlabs.*` and `libnpvtunnel.*`

Runtime evidence to collect:

```text
DEX source path or ByteBuffer
 ↓
class loader constructor
 ↓
loaded class names becoming available
 ↓
recovered hidden application classes
```

If DexProtector uses `InMemoryDexClassLoader`, the harness duplicates the incoming `ByteBuffer`, logs the first bytes, and writes buffers with DEX/ZIP magic to the dump directory. If DexProtector uses file-backed extraction, the class-loader path logs identify the extracted file path.

### 3. File-backed extraction hooks

The harness hooks:

* `java.io.FileOutputStream.<init>(String)`
* `java.io.FileOutputStream.<init>(File)`
* `java.io.FileOutputStream.<init>(String,boolean)`
* `java.io.FileOutputStream.<init>(File,boolean)`
* `java.io.FileOutputStream.write(byte[])`
* `java.io.FileOutputStream.write(byte[],int,int)`
* `java.io.File.renameTo(File)`

Runtime evidence to collect:

```text
Native/Java extraction writes
 ↓
app-private file path
 ↓
first bytes and length of each write
 ↓
renamed final artifact
 ↓
DEX/ZIP artifact copied to npv_runtime_dumps if magic is visible
```

This is necessary because `libalice.so` imports file APIs and receives `filesDir` during bootstrap.

### 4. HTTP/cloud response hooks

The harness hooks:

* `java.net.URL.openConnection()`
* `java.net.HttpURLConnection.getOutputStream()`
* `java.net.HttpURLConnection.getInputStream()`

Runtime evidence to collect:

```text
URL.openConnection()
 ↓
request method/output stream
 ↓
response code/input stream
 ↓
raw response bytes captured by stream/body hooks added in a follow-up if needed
```

This layer establishes the cloud endpoint and request/response timing. If the recovered DEX uses OkHttp/Firebase instead, those hooks should be added after class enumeration shows the concrete client classes.

### 5. Crypto and transform hooks

The harness hooks:

* `javax.crypto.Cipher.getInstance(String)`
* `javax.crypto.Cipher.doFinal(byte[])`
* `javax.crypto.spec.SecretKeySpec(byte[],String)`
* `javax.crypto.spec.IvParameterSpec(byte[])`
* `javax.crypto.spec.GCMParameterSpec(int,byte[])`
* `android.util.Base64.decode(String,int)`

Runtime evidence to collect:

```text
raw response or encoded payload
 ↓
Base64/crypto input
 ↓
key/IV constructor arguments with algorithm names
 ↓
Cipher.doFinal output
 ↓
plaintext JSON/config candidate or next transform input
```

Important limitation: these hooks capture Java crypto only. If cloud unlock happens in native code, the Java crypto hooks will stay silent or only show unrelated DexProtector activity. In that case, trace JNI/native buffers around app-owned native calls and final `libnpvtunnel` sinks.

### 6. Final plaintext sink hooks

The harness hooks:

* `libnpvtunnel.Libnpvtunnel.validateSshConfig(byte[])`
* `libnpvtunnel.Libnpvtunnel.validateV2rayConfig(String)`
* `libnpvtunnel.Libnpvtunnel.testV2rayJsonConfig(byte[])`
* `libnpvtunnel.SshTunnel.start(byte[], ...)`
* `libnpvtunnel.XrayTunnel.start(byte[], ...)`

Runtime evidence to collect:

```text
post-unlock config bytes/string
 ↓
validator/start method arguments
 ↓
plaintext config dumps in npv_runtime_dumps
 ↓
SSH/Xray tunnel startup
```

These hooks are the highest-confidence plaintext capture points because the native tunnel must receive usable config data regardless of where cloud unlock happens upstream.

## Recovered DEX analysis workflow

After obtaining one or more dumped DEX/ZIP artifacts:

1. Pull dumps from the device:

   ```text
   adb shell run-as com.napsternetlabs.napsternetv ls -l files/npv_runtime_dumps
   adb exec-out run-as com.napsternetlabs.napsternetv tar -C files -cf - npv_runtime_dumps > npv_runtime_dumps.tar
   ```

2. Identify artifacts:

   ```text
   python3 - <<'PY'
   from pathlib import Path
   for p in Path('npv_runtime_dumps').glob('*'):
       b = p.read_bytes()[:16]
       print(p, len(p.read_bytes()), b.hex(), b[:4])
   PY
   ```

3. Decompile recovered DEX separately with JADX/apktool tooling and keep output outside the original visible tree, for example:

   ```text
   jadx -d recovered_runtime_jadx recovered.dex
   ```

4. Search only the recovered runtime for cloud logic:

   ```text
   rg -n "cloud|import|subscription|remote|config|url|http|api|firebase|retrofit|okhttp" recovered_runtime_jadx
   rg -n "Cipher|AES|RSA|GCM|SecretKeySpec|IvParameterSpec|GCMParameterSpec|MessageDigest|Mac|Base64|hex|gzip|Inflater" recovered_runtime_jadx
   rg -n "JSONObject|Gson|Moshi|Json|validateV2rayConfig|validateSshConfig|SshTunnel|XrayTunnel" recovered_runtime_jadx
   ```

5. Build a recovered-code data-flow table for each candidate cloud handler:

   ```text
   Class/method
   Input: URL/share token/raw response
   Processing: decode/decrypt/decompress/verify/parse
   Output: JSON string, config byte[], model object, or tunnel validator call
   Next edge: caller/callee or JNI/native boundary
   ```

## If the cloud unlocker is native

If recovered Java/Kotlin only passes opaque buffers into JNI and receives plaintext/config bytes back, the investigation should pivot to native boundary capture rather than guessing from strings.

Required runtime captures:

```text
Java/Kotlin caller argument
 ↓
JNI native method entry
 ↓
input pointer/length or jbyteArray contents
 ↓
native transform
 ↓
returned jbyteArray/String/Object or output pointer/length
 ↓
validator/start sink argument
```

Native hook priorities:

1. App-owned JNI methods discovered in recovered DEX.
2. `RegisterNatives` mappings during `JNI_OnLoad` for `libalice.so`, `libdpboot.so`, `libdexprotector.so`, and any newly loaded native library.
3. `JNIEnv->NewByteArray`, `SetByteArrayRegion`, `GetByteArrayElements`, `ReleaseByteArrayElements`, `NewStringUTF`, and `GetStringUTFChars` around the candidate native method.
4. `libnpvtunnel` validators/start methods as the downstream plaintext confirmation point.

## Proven vs unknown after this update

### Proven

* Static cloud unlock code is not present in the visible JADX/smali tree.
* The DexProtector bootstrap boundary is `attachBaseContext()` → `libalice.so` → certificate check → `libdpboot.so` → `uapgpA()`.
* `classes.dex.dat` is not plaintext DEX/ZIP/ELF/GZIP in the extracted asset form.
* Runtime hooks must observe memory-backed and file-backed DEX loading.
* Final plaintext config must reach `libnpvtunnel` validator/start APIs.
* A runtime Frida harness now exists to collect DEX-loading, class-loading, network, crypto, and final sink evidence.

### Unknown

* Where the decrypted DEX bytes exist in memory.
* Whether hidden DEX is loaded through a public class-loader constructor, ART internals, or a file-backed extraction path.
* The recovered hidden class names and cloud import method names.
* Cloud endpoint/auth/request format.
* Decode/decrypt/decompress/signature verification logic.
* Cloud config algorithm, key source, IV/nonce/salt, and whether the cloud payload is encrypted at all.
* Whether the unlocker is Java/Kotlin or native.

## Runtime flow diagram

```text
Launch app under Frida
 ↓
attachBaseContext() entry
 ↓
libalice + libdpboot + uapgpA() bootstrap
 ↓
watch class-loader constructors, file writes, InMemoryDexClassLoader buffers
 ↓
dump recovered runtime DEX/ZIP
 ↓
decompile recovered runtime separately
 ↓
locate cloud import/download handler
 ↓
hook HTTP/raw response and crypto/native boundaries
 ↓
capture raw cloud response
 ↓
capture decode/decrypt/decompress output
 ↓
capture plaintext validator/start arguments
 ↓
identify exact cloud unlock function, algorithm, key source, IV/nonce/salt with evidence
```

## Immediate next steps

1. Run `tools/frida/npv_runtime_recovery.js` against the APK on a test device/emulator.
2. Confirm whether the hidden runtime appears through `InMemoryDexClassLoader`, `DexClassLoader`, file writes, or only lower-level ART/native APIs.
3. Pull and decompile dumped DEX artifacts.
4. Search the recovered DEX for cloud/import/network/crypto/parser/tunnel sink terms.
5. Add focused hooks for the recovered cloud classes and any native methods they call.
6. Produce the final cloud-unlock report only after the raw response → decoded/decrypted payload → plaintext config → `libnpvtunnel` sink flow is captured.
