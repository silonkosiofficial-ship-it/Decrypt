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

## Runtime flow diagram with confidence levels

```text
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
