
# NPV Tunnel cloud-config unlocking mechanism — runtime recovery plan

## Executive conclusion

Static analysis has reached the DexProtector protection boundary. The readable JADX and apktool trees expose the bootstrap and the final native tunnel sinks, but not the real cloud importer/unlocker. The next useful step is therefore runtime recovery: dump the protected runtime DEX after DexProtector initialization, analyze that recovered DEX separately, and trace the cloud response through decode/decrypt/parsing into `libnpvtunnel` validation/start calls.

This update intentionally does **not** continue searching the visible JADX tree for the cloud decryptor. The visible tree is still useful as an anchor for runtime hooks because it identifies the startup sequence, native JNI boundary, and plaintext sink methods.

A Frida runtime recovery harness has been added at `tools/frida/npv_runtime_recovery.js`. It is designed to capture class-loader events, in-memory DEX buffers, file-backed DEX extraction, Java crypto/encoding boundaries, HTTP connection activity, and final `libnpvtunnel` SSH/Xray config sinks.

## Runtime recovery continuation — transformation-path instrumentation

No recovered runtime DEX or live device trace is present in this repository yet, so the cloud unlock algorithm, key source, IV/nonce/salt, and endpoint remain unknown. The correct next step is still to run the harness and collect evidence at runtime rather than infer from the visible JADX tree.

The Frida harness has been extended to better capture the real cloud transformation path after DexProtector initialization:

* It now enumerates loaded `com.napsternetlabs.*`, `libnpvtunnel.*`, and cloud/config-named classes immediately after `attachBaseContext()` and `onCreate()` return. This is the first practical checkpoint for hidden runtime class availability after the `libalice`/`libdpboot` handoff.
* It now hooks Java native-library loading through `Runtime.loadLibrary0()` and `Runtime.load0()` plus best-effort `RegisterNatives` logging. This helps identify whether a recovered cloud importer crosses into app-owned native code before plaintext reaches the tunnel sinks.
* It now adds optional OkHttp request/response hooks when `okhttp3` is present at runtime. These hooks log request URLs, methods, headers, and response codes without assuming that the protected runtime uses `HttpURLConnection`.
* It now adds JSON/compression checkpoints through `JSONObject(String)`, `GZIPInputStream`, and `Inflater.inflate(byte[])`. These are transformation boundary hooks: if the cloud response becomes JSON after Base64, cipher output, gzip, or inflate, the log order should expose that edge.

Evidence expected from a successful run:

```text
DexProtector bootstrap returns
 ↓
new hidden cloud/import classes appear in loaded-class enumeration
 ↓
HTTP/OkHttp request logs reveal URL, headers, method, and response code
 ↓
Base64/Cipher/GZIP/Inflater/JSONObject hooks reveal transformation boundaries
 ↓
validateSshConfig(), validateV2rayConfig(), SshTunnel.start(), or XrayTunnel.start() dumps the final plaintext config
```

Important limitation: these additions are instrumentation, not a recovered result. Until a runtime trace or dumped DEX artifact is analyzed, there is still no proven cloud-config decryptor or Python-reimplementable algorithm.

## Current proven boundary

### Startup chain

# NPV Tunnel cloud-config unlocking mechanism — continued DexProtector investigation

## Executive conclusion

This continuation did **not** recover the cloud-config unlock routine. The new evidence further narrows why: the APK-visible code and native symbol/string surfaces expose the DexProtector bootstrap, asset access, native file I/O, and final tunnel config sinks, but they do not expose the hidden runtime classes or a cloud-specific decryptor.

The protected payload remains `assets/classes.dex.dat`. It is 578,709 bytes, does not contain `dex\n`, `PK\x03\x04`, `\x7fELF`, or `gzip` magic at offset 0, and contains no embedded `dex\n`, ZIP, or ELF magic by byte search. A quick repeated-XOR check against the 32-byte `assets/dp.arm-v7.so.dat` key-like blob also did not reveal a DEX/ZIP/ELF header in the first 512 offsets. This supports encrypted/packed data, but it does **not** prove the exact cipher, key, IV, or unpack format.

The native loader surface indicates the hidden runtime may be produced in native memory and/or through filesystem-backed extraction. `libalice.so` imports Android asset APIs (`AAssetManager_fromJava`, `AAssetManager_open`, `AAsset_getBuffer`, `AAsset_getLength`) and filesystem/process APIs (`open`, `read`, `write`, `mkdir`, `rename`, `remove`, `unlink`, `dlopen`, `dlsym`). `libdpboot.so` is a small boot library whose dynamic symbol table exposes only `JNI_OnLoad` plus libc/property/file APIs. `libdexprotector.so` exposes only `JNI_OnLoad` and has obfuscated strings. None of these native libraries exposes Java JNI names for the cloud importer.

Most important distinction: the visible 32-byte material derived in `ProtectedMyApplication.onCreate()` is still only proven to be passed into DexProtector native method `zInq(Object)`. It must **not** be labeled as the cloud-config key unless a recovered hidden class or runtime hook shows it is consumed by the cloud payload transformation.

## Evidence base and commands used

This report continues from the prior report rather than restarting the analysis. Additional static checks used:

```text
find . -maxdepth 3 -type f \( -path '*lib/*.so' -o -path '*assets/*' -o -name AndroidManifest.xml \)
python3 byte-magic scan for assets/classes.dex.dat, assets/dp.arm-v7.so.dat, assets/dp.mp3
readelf -d/-Ws on libalice.so, libdpboot.so, libdexprotector.so
strings -a -n 4/6 on libalice.so, libdpboot.so, libdexprotector.so
rg over JADX and smali for ProtectedMyApplication, native loaders, DexClassLoader, PathClassLoader, InMemoryDexClassLoader, and crypto/config terms
```

## 1. Processing status of `assets/classes.dex.dat`

### Proven facts

* `assets/classes.dex.dat` exists and is 578,709 bytes.
* Its first 32 bytes are high-entropy-looking bytes: `07 79 f9 e0 c0 e2 40 bc 4a bf b4 13 ed d6 4e 12 97 26 d3 70 cb c5 b2 82 9f f1 e2 14 34 79 ad ed`.
* It does not begin with DEX, ZIP, GZIP, or ELF magic.
* Full-file byte search did not find `dex\n`, `PK\x03\x04`, or `\x7fELF` inside it.
* `assets/dp.arm-v7.so.dat` is only 32 bytes and also has no ELF magic; despite its misleading name, it is not a directly loadable ARMv7 shared object in the extracted asset form.
* `assets/dp.mp3` is 155,588 bytes, also not an MP3 by header, and has no DEX/ZIP/ELF magic by the same scan.

### What is inferred, not proven

The asset is very likely encrypted or transformed before loading. However, the static dump does **not** prove whether `classes.dex.dat` is:

* decrypted directly to DEX bytes,
* decrypted into a container that is then unpacked,
* split/combined with other assets such as `dp.mp3` or `dp.arm-v7.so.dat`,
* loaded from memory through ART internals,
* written to app-private storage and loaded by a class loader,
* converted into optimized code without leaving a normal `.dex` artifact.

### Placement of resulting DEX bytes

No static path string such as a recovered output `.dex`, `.jar`, `code_cache`, or `dexopt` destination was found in the native string surface. `libalice.so` imports both asset APIs and filesystem APIs, so file-backed extraction remains possible. The visible Java bootstrap gives `libalice.so` the app `Context` and `filesDir`, which is enough for the native layer to write under app-private storage if it chooses to.

## 2. Startup and JNI trace

The bootstrap chain remains:


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

DexProtector native runtime loading
```

### `ProtectedMyApplication$ProtectedMyApplication$a$a`

Class: `com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication$a$a`

Important methods:

* `a(Context)` delegates to `a(Context, "")`.
* `a(Context, String)` loads `alice`, checks `ProtectedMyApplication.MainActivity.d.a()`, and, if needed, stores `filesDir`, passes `Context` to native `MainActivity.d.a(Context)`, and passes `filesDir` to native `MainActivity.d.a(String)`.
* `a(byte[], long)` obtains a native-created `HttpURLConnection` from `MainActivity.d.a(byte[], long)`, writes the byte array to the request body, flushes it, and treats HTTP 200 as success. This is protector/native infrastructure; it is not proven to be the cloud-config download path.
* `b(Context)` passes the application context to native `MainActivity.d.b(Context)`.

Input/output chain:

```text
Application Context + filesDir
 ↓
libalice native registration/state initialization
 ↓
Native layer receives asset manager context and writable app-private path
 ↓
Native layer can open assets and write/read private files
```

### `ProtectedMyApplication`

Class: `com.napsternetlabs.napsternetv.ProtectedMyApplication`

Important methods:

* `J()` hashes the APK signing certificate with SHA-256 and compares it to `e03dcc51aad45456b97b6331c08a2f6a67eb9516e931a3e6cefcd0eeee5801d4`.
* Native methods declared: `gwj()`, `oGzvwx(String,int,List)`, `s(String)`, `uapgpA()`, `zInq(Object)`, `zqubf(Object,String)`.
* `attachBaseContext(Context)` runs the `alice` initialization helper, certificate check, `System.loadLibrary("dpboot")`, and `uapgpA()`.
* `onCreate()` calls `gwj()`, derives 32 bytes by indexing two hardcoded 256-byte substitution tables, and passes the result to `zInq(Object)`.

Input/output chain:

```text
APK signing certificate
 ↓
SHA-256 self-check in J()
 ↓
Only expected certificate allows bootstrap to continue
 ↓
libdpboot JNI_OnLoad + uapgpA()
 ↓
protected runtime loading

native gwj() bytes + two Java substitution tables
 ↓
32-byte derived value
 ↓
zInq(Object)
 ↓
DexProtector native state/material handoff
```

## 3. Native loader evidence

### `libalice.so`

Proven imports:

* Asset APIs: `AAssetManager_fromJava`, `AAssetManager_open`, `AAsset_getBuffer`, `AAsset_getLength`, `AAsset_close`.
* Dynamic loader APIs: `dlopen`, `dlsym`.
* Filesystem APIs: `open`, `__open_2`, `read`, `write`, `mkdir`, `rename`, `remove`, `unlink`, `opendir`, `readdir`, `rmdir`, `stat`.
* Only exported symbol in the dynamic symbol table is `JNI_OnLoad`.

String evidence includes `sourceDir`, `dexp_crash_`, `p.dexp_crash_timer`, and broad crypto-library/error strings such as AES/GCM/RSA/SHA variants. These strings demonstrate capability/library inclusion but do **not** establish the cloud-config encryption algorithm.

Interpretation:

```text
Java passes Context/filesDir
 ↓
libalice can get AssetManager and APK sourceDir
 ↓
libalice can read protected assets and write private files
 ↓
libalice can dynamically resolve/load native components
```

### `libdpboot.so`

Proven imports include `__open_2`, `read`, `close`, `malloc`, `realloc`, `memcpy`, Android logging, and system property APIs. Its SONAME is `libboot.so`; its only exported dynamic symbol is `JNI_OnLoad`.

Interpretation:

`libdpboot.so` is a boot handoff library. It is not exposing descriptive Java JNI method names, and no cloud strings/keys/endpoints are recoverable from its dynamic string/symbol surface.

### `libdexprotector.so`

The dynamic symbol table exposes only `JNI_OnLoad`. Strings are minimal/obfuscated, with fragments such as `AESu`, `dGCM.y`, and `3xgcmb`. These are insufficient to identify either the DexProtector asset cipher or the cloud-config cipher.

## 4. Hidden runtime classes after loading

The hidden runtime classes were **not recovered** in this static continuation. No readable decompiled class contains the real cloud import ViewModel/callback or the unlock routine. Searches for `DexClassLoader`, `PathClassLoader`, and `InMemoryDexClassLoader` in the visible app-owned code do not reveal the DexProtector class-loading call site; unrelated Google Ads SDK dynamic loading exists and should not be confused with the app runtime loader.

Therefore, hidden class identification still requires one of these dynamic captures:

* dump DEX bytes from memory after `uapgpA()` / `zInq()` completes,
* hook filesystem writes under app-private storage and app code-cache directories,
* hook ART class definition / dex file opening APIs,
* hook class-loader constructors and enumerate loaded classes after application startup.

## 5. Cloud import and crypto search after this continuation

The requested terms were searched across JADX/smali and the native string surfaces.

### Cloud/import terms

Terms: `cloud`, `import`, `subscription`, `remote`, `config`, `URL`, `HTTP`, `API`.

Result: resources prove the user-facing features (`import_cloud_config`, `export_to_cloud`, `import_sub_config`, etc.), but the actual cloud request class/method remains absent from the readable tree.

### Crypto/transform terms

Terms: `Cipher`, `AES`, `RSA`, `GCM`, `SecretKeySpec`, `IvParameterSpec`, `MessageDigest`, `Base64`, `hex`, `gzip`, `Inflater`.

Result:

* The only app-owned Java `MessageDigest` flow still proven is the signing-certificate SHA-256 check in `ProtectedMyApplication.J()`.
* `ProtectedMyApplication.MainActivity.e.A(String)` performs `Base64.decode(ProtectedMyApplication.s(str), 0)`, but its input comes from the protector string helper `s(String)`, not a proven cloud payload.
* Native `libnpvtunnel.Libnpvtunnel` exposes `decodeBase64`, `encodeBase64`, `hexDecode`, `hexEncode`, `validateSshConfig`, `validateV2rayConfig`, and `testV2rayJsonConfig`, but no visible app-owned call site connects cloud import to those helpers.
* Native libraries contain generic AES/GCM/RSA/SHA strings, but no data-flow evidence links them to cloud configuration.

### Parsing terms

Terms: `JSONObject`, `Gson`, `Moshi`, `JSON parser`.

Result: SDK/library parser code exists, and final Xray config handling necessarily accepts JSON bytes/string through `libnpvtunnel`; the app-specific cloud JSON conversion method is still hidden.

## 6. Exact cloud payload transformation function status

The exact function where:

```text
cloud payload
 ↓
decoded/decrypted data
 ↓
JSON/config object
```

happens has **not** been identified because the protected runtime DEX has not been recovered. The strongest proven sink points remain:

```text
Plain SSH config bytes
 ↓
libnpvtunnel.Libnpvtunnel.validateSshConfig(byte[])
 ↓
libnpvtunnel.SshTunnel.start(byte[], ...)
```

and

```text
Plain Xray/V2Ray JSON string/bytes
 ↓
libnpvtunnel.Libnpvtunnel.validateV2rayConfig(String)
libnpvtunnel.Libnpvtunnel.testV2rayJsonConfig(byte[])
 ↓
libnpvtunnel.XrayTunnel.start(byte[], ...)
```

Hooking these sinks will reveal the final plaintext config even if the upstream cloud decryptor remains obfuscated.

## 7. Algorithm/key/IV/nonce/salt status

### Proven

* DexProtector uses a native bootstrap and encrypted/packed assets.
* The visible Java derives one 32-byte value from `gwj()` and substitution tables, then passes it to `zInq(Object)`.
* Native libraries include generic cryptographic implementation strings.

### Not proven

* Cloud payload cipher algorithm.
* Cloud key source.
* IV/nonce/salt format.
* Whether the cloud key is embedded, derived locally, obtained remotely, or bound to device/account/license state.
* Whether the cloud config is encrypted at all versus encoded/signed/compressed/protected by backend access control.


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

Application start                                                [manifest/source-proven]
 ↓
ProtectedMyApplication.attachBaseContext(Context)                 [source-proven]
 ↓
load libalice.so and pass Context/filesDir to native methods      [source-proven]
 ↓
certificate SHA-256 check                                         [source-proven]
 ↓
load libdpboot.so; call native uapgpA()                           [source-proven]
 ↓
read/process assets/classes.dex.dat via native DexProtector path  [strongly inferred from assets + native imports]
 ↓
hidden DEX/runtime classes become available                       [not recovered]
 ↓
user selects cloud import                                         [resource-proven]
 ↓
cloud request/download/auth                                       [not exposed]
 ↓
decode/decrypt/decompress/verify                                  [not exposed]
 ↓
plain SSH config bytes or Xray JSON                               [native sink-proven]
 ↓
validateSshConfig / validateV2rayConfig / testV2rayJsonConfig     [source-proven]
 ↓
SshTunnel.start(byte[], ...) or XrayTunnel.start(byte[], ...)     [source-proven]
```

## Recommended next investigation steps

1. Run the APK on a test device/emulator and hook `ProtectedMyApplication.uapgpA()`, `zInq(Object)`, and class-loader/dex-opening APIs immediately after `attachBaseContext()`.
2. Hook native filesystem APIs (`open`, `write`, `rename`) scoped to the app private directory to catch file-backed DEX extraction.
3. Hook ART/native dex APIs and `dalvik.system.BaseDexClassLoader`, `DexClassLoader`, and `InMemoryDexClassLoader` constructors to catch memory-backed or class-loader-backed DEX loading.
4. After startup, enumerate loaded classes and search recovered DEX/JADX output for cloud/import/subscription/config and crypto/parsing terms.
5. Hook `URL.openConnection`, `HttpURLConnection`, OkHttp, and Firebase Database/Remote Config APIs to capture cloud URLs, headers, request bodies, response bytes, and auth material.
6. Hook `Cipher`, `Mac`, `MessageDigest`, `Base64`, `GZIPInputStream`, `Inflater`, `SecretKeySpec`, `IvParameterSpec`, and `GCMParameterSpec` to distinguish cloud config crypto from DexProtector loader crypto.
7. Hook final plaintext sinks: `Libnpvtunnel.validateSshConfig(byte[])`, `Libnpvtunnel.validateV2rayConfig(String)`, `Libnpvtunnel.testV2rayJsonConfig(byte[])`, `SshTunnel.start(byte[], ...)`, and `XrayTunnel.start(byte[], ...)`.

## Final status

The cloud-config unlock mechanism is still inside unrecovered protected runtime code. This continuation strengthens the DexProtector loading evidence and documents why `assets/classes.dex.dat` must be dynamically unpacked/dumped before the exact cloud payload transformation, algorithm, key source, IV/nonce/salt, and JSON/config construction function can be named with evidence.


## DP:789 security-gate trace continuation

### Scope of this continuation

This section continues from the previous DexProtector boundary findings instead of re-searching the cloud importer. The immediate blocker is the proven runtime failure:

```text
ProtectedMyApplication startup
 ↓
DexProtector bootstrap/native handoff
 ↓
java.lang.RuntimeException: DP: 789 011503210500
 ↓
ProtectedMyApplication$ProtectedMyApplication.qk(Throwable,String)
 ↓
MessageGuardException(Throwable,String)
 ↓
ProtectedMyApplication$ProtectedMyApplication.fAHytsI(Context,Throwable,String)
 ↓
crash/security Activity
 ↓
process stops before cloud-config import/decryption
```

### 1. Where `MessageGuardException` is created or thrown

**Trigger location:** `ProtectedMyApplication$ProtectedMyApplication.qk(Throwable,String)` creates the wrapper exception.

**Class:** `com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication`

**Function:** `qk(Throwable th, String id)`

**Relevant code:**

* If the caller supplied no ID, `qk()` generates a UUID-derived ID with `Ccwtchjno()`.
* It constructs `new MessageGuardException(th, id)`.
* If the ID was generated locally, it also calls native `ProtectedMyApplication.MainActivity.d.a(Throwable,String)` with the wrapper and ID.
* It returns the wrapper to `fAHytsI()`.

**Input values:**

* `th`: the original `Throwable`; in the observed run this is the cause whose message is `DP: 789 011503210500`.
* `id`: normally `null` from the catch handlers, so a UUID-like support/report ID is generated.

**Output data:**

* A `MessageGuardException` whose `guard` string is built from `th.getMessage()`, static `MessageGuardException.fingerprint`, and the generated ID.

**Connection to next step:** `fAHytsI()` throws the returned wrapper after optionally launching the crash/security UI.

**Evidence:** `MessageGuardException(Throwable,String)` wraps `th.getLocalizedMessage()` as its displayed exception message, copies `th.getMessage()` into the guard payload, appends the static fingerprint and optional ID, and `toString()` emits `MessageGuardException_<base64 guard>: <localized message>`. `qk()` is the only visible constructor site in this startup wrapper path and returns the wrapper to `fAHytsI()`.

### 2. Code path reaching `qk()` and `fAHytsI()`

There are two visible startup catch paths that can feed the DP exception into the same wrapper:

```text
ProtectedMyApplication.attachBaseContext(Context)
  super.attachBaseContext(context)
  ProtectedMyApplication$ProtectedMyApplication$a$a.a(this)  // load libalice + native context/filesDir handoff
  J()                                                        // visible certificate SHA-256 check
  System.loadLibrary("dpboot")
  uapgpA()                                                   // native DexProtector bootstrap
  catch Throwable th -> ProtectedMyApplication$ProtectedMyApplication.j(this, th)
    -> qscdn(this, th, null)
    -> ye(this, th, null) on SDK >= 23
    -> Handler.postAtFrontOfQueue(new ProtectedMyApplication$ProtectedMyApplication(...))
    -> run()
    -> fAHytsI(this, th, null)
    -> qk(th, null)
```

```text
ProtectedMyApplication.onCreate()
  super.onCreate()
  ProtectedMyApplication$ProtectedMyApplication$a$a.b(this)  // native application-context handoff
  gwj()                                                      // native byte source
  32-byte Java substitution transform
  zInq(transformed32)                                        // native DexProtector state/material handoff
  catch Throwable th -> ProtectedMyApplication$ProtectedMyApplication.j(this, th)
    -> same qscdn/ye/run/fAHytsI/qk wrapper path
```

**Interpretation:** `qk()` and `fAHytsI()` are not the first security decision point. They are the common reporting/crash wrapper for an earlier `Throwable` emitted by either the `attachBaseContext()` native bootstrap path or the `onCreate()` native material handoff path.

### 3. Checks immediately visible before the exception

#### Visible Java certificate/signature check

**Trigger location:** `ProtectedMyApplication.J()`

**Class/function:** `com.napsternetlabs.napsternetv.ProtectedMyApplication.J()`

**Input values:** Android package signatures from `PackageManager.getPackageInfo(getPackageName(), 64).signatures`.

**Condition:**

* fail if no signatures are returned;
* fail if more than one signing certificate is returned;
* fail if SHA-256 of the sole signing certificate is not `e03dcc51aad45456b97b6331c08a2f6a67eb9516e931a3e6cefcd0eeee5801d4`.

**Reasoning:** This is a real visible security gate, but it is **not** the observed DP:789 gate. Its thrown messages are `Signing certificates not found`, `Package is signed by multiple signing certificates [...]`, or `Certificate mismatch...`; they do not contain `DP: 789 011503210500`.

**Confidence:** High that this gate exists; high that it is not the observed DP:789 if the observed cause message is exactly `DP: 789 011503210500`.

#### Native DexProtector gate

**Trigger location:** native code reached from either `uapgpA()` or `zInq(Object)`.

**Class/function:** visible Java declaration is in `com.napsternetlabs.napsternetv.ProtectedMyApplication`; implementation is native in the DexProtector libraries.

**Input values proven statically:**

* `uapgpA()` receives no Java arguments but runs after `libalice` and `libdpboot` are loaded, after native code receives `Context` and `filesDir`, and after `J()` passes.
* `zInq(Object)` receives the 32-byte Java-transformed array produced from native `gwj()[0..31]` and two static 256-byte lookup tables.

**Condition that fails:** not recoverable from the visible Java/smali alone. The only proven failed value is the resulting native exception message: `DP: 789 011503210500`.

**Reason:** The literal `DP: 789 011503210500`, `789`, and `011503210500` were not found as Java/smali constants; native-library strings are also not exposing a readable DP message. That means the exact check and message are produced dynamically/obfuscated in native DexProtector code or hidden runtime code, not by the visible Java crash wrapper.

**Confidence:** High that the decision point is before `qk()`/`fAHytsI()` and inside a native DexProtector boundary; medium on whether it is specifically `uapgpA()` vs `zInq(Object)` until runtime hooks capture which native method throws.

### 4. What DP code 789 means in the visible UI layer

The crash/security UI parses the integer immediately after `DP:` and chooses a user-facing message:

* `code > 4096`: warning page that can be accepted and writes the little-endian integer to private file `rtc`; bit labels shown in the UI are root, emulator, custom firmware, and Xposed.
* `code == 773`: unofficial installer/vendor page.
* `754 <= code <= 757`: emulator-specific page.
* other `700 < code < 800`: generic insecure-environment page.
* otherwise: generic device-incompatibility page.

Therefore `789` is classified by the app's own visible UI as a generic `700..799` DexProtector security-requirement failure, **not** as the emulator-specific visible bucket (`754..757`) and not as the visible installer bucket (`773`). This does not prove that emulator properties are unrelated; it only proves the app does not map `789` to the hard-coded emulator-only message.

**Confidence:** High for the UI classification; low for the underlying cause category because the underlying native code remains hidden.

### 5. Current answer in the required format

**Trigger location:** Native DexProtector startup/material handoff before Java crash wrapping.

**Class:** visible boundary is `com.napsternetlabs.napsternetv.ProtectedMyApplication`.

**Function:** either `uapgpA()` from `attachBaseContext()` or `zInq(Object)` from `onCreate()`; `qk()`/`fAHytsI()` only wrap/report the native failure.

**Relevant code:**

```text
attachBaseContext(): load libalice -> native context/filesDir handoff -> J() certificate hash check -> load libdpboot -> uapgpA() -> catch Throwable -> j()/qscdn()/ye()/run()/fAHytsI()/qk()

onCreate(): native app-context handoff -> gwj() -> Java 32-byte transform -> zInq(transformed32) -> catch Throwable -> j()/qscdn()/ye()/run()/fAHytsI()/qk()
```

**Input values:**

* Package certificate SHA-256 for the visible `J()` check.
* Android `Context`, app private files directory, native `gwj()` bytes, and the derived 32-byte array for the native DexProtector checks.
* Runtime environment/device state is very likely read by native code, but the exact fields/properties are not proven from static evidence.

**Condition that fails:** Proven only as a native/generated `RuntimeException` with message `DP: 789 011503210500`. Static evidence does not expose the exact predicate such as a specific `Build.*`, `ro.*` property, root file, debugger flag, signature, attestation result, or server response.

**Reason:** The Java frames named in the stack trace (`qk()` and `fAHytsI()`) are post-decision wrapper/reporting code. The visible Java certificate check has different messages and therefore does not match DP:789. The visible UI maps `789` to generic DexProtector security requirements, not the hard-coded emulator-only or installer-only buckets.

**Confidence level:**

* High: `MessageGuardException` is created in `qk()` and thrown from `fAHytsI()`.
* High: `qk()`/`fAHytsI()` are not the original security decision.
* High: visible certificate SHA-256 gate is not the observed DP:789 message.
* Medium: original throw is native DexProtector code reached from `uapgpA()` or `zInq(Object)`.
* Low: exact category of DP:789 (emulator/root/debugger/tamper/attestation/server-side/other) without a runtime trace of the native throw site.

### Runtime tracer added for the exact decision point

A focused Frida tracer was added at `tools/frida/npv_dp789_gate_trace.js`.

Usage:

```text
frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_dp789_gate_trace.js --no-pause
```

The tracer hooks:

* `RuntimeException(String)` and `RuntimeException(String,Throwable)` to capture the first Java creation stack when a message contains `DP:`.
* `MessageGuardException(Throwable,String)` to confirm the wrapper inputs.
* `ProtectedMyApplication$ProtectedMyApplication.qk()` and `fAHytsI()` to log wrapper flow.
* `ProtectedMyApplication.attachBaseContext()` and `onCreate()` to separate the two startup phases.
* native Java declarations `uapgpA()`, `gwj()`, and `zInq(Object)` to identify which visible JNI boundary throws before the wrapper catches it.

Expected proof from a successful run:

```text
native uapgpA THROW=java.lang.RuntimeException: DP: 789 011503210500
```

or

```text
native zInq THROW=java.lang.RuntimeException: DP: 789 011503210500
```

That output will identify the exact visible boundary. If the throw still appears only after the native method returns, the next step is native instrumentation around `libdpboot.so`/`libdexprotector.so` exception construction, system-property reads, file probes, package/signature reads, and any network/attestation calls during the same timestamp window.

### Next investigation step

Run the new DP:789 tracer on the same Android Studio Google Play AVD that reaches the guard. Do not change emulator properties yet. The first required evidence is which native boundary throws and whether any Java-visible inputs immediately precede the DP message. After that, attach native hooks for the specific boundary window rather than guessing between emulator, root, debugger/tamper, certificate, Play Integrity/SafetyNet, server-side validation, or another DexProtector mechanism.
