
# NPV Tunnel cloud-config unlocking mechanism — static trace and extraction plan

## Executive conclusion

The readable JADX and apktool trees do **not** contain the real cloud importer or the cloud unlock/decrypt routine. They contain only the DexProtector bootstrap layer, resource identifiers, native bridge stubs, and third-party SDK code. The protected runtime code is loaded from `assets/classes.dex.dat` by `ProtectedMyApplication` through `libalice.so` and `libdpboot.so`. Therefore the exact cloud algorithm/key is not recoverable from the readable Java/smali alone; it must be recovered by dumping the runtime-unpacked DEX or by hooking the JNI/network/crypto boundaries described below.

What is provable:

* `ProtectedMyApplication.attachBaseContext()` loads `libalice.so`, verifies the signing certificate SHA-256, loads `libdpboot.so`, then calls native `uapgpA()`; this is the protector unpack/load stage.
* `ProtectedMyApplication.onCreate()` derives a 32-byte value from `gwj()` and two hardcoded 256-byte substitution tables, then passes it to native `zInq(Object)`; this is protector key/material handoff, not an app-level cloud key proven by data flow.
* `ProtectedMyApplication` declares native stream/resource and URL helpers (`zqubf`, `s`, `oGzvwx`) and `MainActivity$d` declares native `HttpURLConnection` builders. Those methods are implemented inside protected native code and are likely involved in loading/decrypting protected assets and remote guard/protector telemetry.
* No visible call site invokes `libnpvtunnel.decodeBase64()`, `hexDecode()`, `validateV2rayConfig()`, or `validateSshConfig()`; all real app call sites are in protected code.
* The final tunnel layer is native Go/Xray: `SshTunnel.start(byte[], ...)` and `XrayTunnel.start(byte[], ...)` accept final config bytes, so the best capture point for plaintext is immediately before these JNI calls.

## 1. Where cloud payload enters memory

### Visible app entry points

The manifest shows one main launcher/import Activity and one VPN service:

```text
com.napsternetlabs.napsternetv.kkAhtatwbwcyv     Activity, launcher, ACTION_VIEW file/content import
com.napsternetlabs.napsternetv.bAEBnrhbzougz     VpnService, BIND_VPN_SERVICE
```

The same Activity handles `ACTION_VIEW` for `content://` and `file://` and includes `*.npvt` path patterns, proving file import enters through that Activity. Cloud import is evidenced by Compose resource strings (`import_cloud_config`, `export_to_cloud`, `cloud_config_expiry_minutes`, etc.), but the callback class/method is in the protected payload DEX and is not visible statically.

### Protected-code entry point

The real importer is expected in code loaded by this bootstrap chain:

```text
Application.attachBaseContext(Context)
 ↓
ProtectedMyApplication$ProtectedMyApplication$a$a.a(Context)
 ↓
System.loadLibrary("alice")
 ↓
ProtectedMyApplication.MainActivity.d.a(context)
ProtectedMyApplication.MainActivity.d.a(filesDir)
 ↓
ProtectedMyApplication.J() certificate SHA-256 check
 ↓
System.loadLibrary("dpboot")
 ↓
ProtectedMyApplication.uapgpA()   // native
 ↓
Protected runtime loads/decrypts assets/classes.dex.dat
```

`assets/classes.dex.dat` is 578,709 bytes and does not begin with `dex\n`, ZIP, or GZIP magic. Its first bytes are high-entropy (`07 79 f9 e0 c0 e2 40 bc ...`), consistent with encryption/packing rather than an ordinary DEX.

## 2. DexProtector loading process

The protector-visible Java/smali exposes these native methods:

```java
private static native byte[] gwj();
public static native boolean oGzvwx(String str, int i, List list);
public static native String s(String str);
private static native void uapgpA();
private static native void zInq(Object obj);
public static native InputStream zqubf(Object obj, String str);
```

Key bootstrap details:

* `attachBaseContext()` calls `ProtectedMyApplication$ProtectedMyApplication$a$a.a(this)`, then certificate check `J()`, then `System.loadLibrary("dpboot")`, then native `uapgpA()`.
* Helper class `ProtectedMyApplication$ProtectedMyApplication$a$a` loads `libalice.so` and initializes `ProtectedMyApplication.MainActivity.d` with `Context` and `filesDir`.
* `onCreate()` calls `gwj()`, uses `gwj()[0..31]` as indices into two hardcoded byte tables, produces a 32-byte array, and passes that array to native `zInq(bArr3)`.

This is the only visible 32-byte derivation in the app-owned Java. It may be a DexProtector runtime/session key, asset-decryption key, or anti-tamper material. Static evidence does **not** prove it is the cloud-config content key.

## 3. Raw received data and HTTP/auth

No readable app class contains the cloud URL, endpoint path, headers, request parameters, or auth token. The only app-owned `HttpURLConnection` APIs are native stubs:

```java
ProtectedMyApplication.MainActivity.d.a(byte[] body, long value): HttpURLConnection
ProtectedMyApplication.MainActivity.d.b(String value): HttpURLConnection
```

A wrapper method writes arbitrary bytes to the connection returned by `d.a(byte[], long)`, flushes them, and returns whether HTTP status is 200. This is protector/native infrastructure; there is no visible code tying it to cloud shared-config import.

Therefore the raw cloud payload entry point cannot be identified by class/method name until the protected DEX is dumped. Dynamic capture should hook, in order:

1. `java.net.URL.openConnection()` / `HttpURLConnection.getInputStream()` / `getOutputStream()`.
2. OkHttp (`okhttp3.RealCall.execute/enqueue`, `ResponseBody.string/bytes`) if the protected DEX uses OkHttp.
3. Firebase Database SDK methods if the protected DEX uses Firebase.
4. `ProtectedMyApplication$MainActivity$d.a([B,J)` and `.b(String)` native-returned connections.

## 4. Decode/decrypt/unpack pipeline findings

### Search results in readable Java/smali

The requested crypto and transform terms were searched across both source trees:

* `Cipher`, `SecretKeySpec`, `IvParameterSpec`, `GCMParameterSpec`, `Mac`, `MessageDigest`, `AES`, `RSA`, `DES`
* `Base64`, `hexDecode`, `hexEncode`, `GZIP`, `Inflater`
* `validateV2rayConfig`, `validateSshConfig`, `decodeBase64`

Findings:

* App-owned visible code uses `MessageDigest.getInstance("SHA-256")` only for certificate pin/self-check in `ProtectedMyApplication.J()`.
* App-owned visible code uses `Base64.decode(ProtectedMyApplication.s(str), 0)` in `ProtectedMyApplication.MainActivity.e.A(String)`, where `s(String)` is native. That is a protector string-decoding helper, not proven cloud config decoding.
* `libnpvtunnel.Libnpvtunnel` declares native Base64/hex helpers and config validators, but there are **zero visible Java/smali call sites** to `decodeBase64`, `hexDecode`, `hexEncode`, `validateV2rayConfig`, or `validateSshConfig` in the readable dump.
* `libalice.so` contains generic crypto-library strings (`AES`, `GCM`, `RSA`, `BASE64`, `SHA256`) and Android asset APIs (`AAssetManager_open`, `AAsset_getBuffer`). These prove native crypto capability and asset access, but not the cloud-config algorithm/key.
* `libdexprotector.so` exposes only `JNI_OnLoad` in the dynamic symbol table and contains obfuscated/high-entropy strings including `AES`/`GCM` fragments; no recoverable Java JNI symbol names or hardcoded cloud key are exposed.

### Current proven pipeline

```text
assets/classes.dex.dat / protected methods
 ↓
libalice.so / libdpboot.so / libdexprotector.so native bootstrap
 ↓
runtime-unpacked app DEX loaded into ClassLoader
 ↓
cloud import implementation (not in static readable tree)
 ↓
unknown decode/decrypt/unpack operations
 ↓
final plaintext bytes/string passed to libnpvtunnel or tunnel.start
```

## 5. Secret/key material, IV/nonce/salt status

The only app-owned derived 32-byte material visible is in `ProtectedMyApplication.onCreate()`:

```text
gwj() returns byte[]
for i in 0..31:
    derived[i] = table1[ table2[ gwj()[i] & 0xff ] & 0xff ]
zInq(derived)
```

This looks like a DexProtector native key handoff. Because no visible cloud importer consumes this value, I cannot label it as the cloud config key. No cloud IV, nonce, salt, AES mode, RSA key, HMAC key, or KDF is present in readable Java/smali.

## 6. How cloud config becomes JSON/bytes and VPN config

The final native API establishes the terminal data types:

### SSH path

```text
plaintext/imported SSH config bytes
 ↓
Libnpvtunnel.validateSshConfig(byte[]) -> SshConfig
 ↓
SshTunnel.start(byte[] configBytes, SshTunnelInterface cb, ...)
```

`SshConfig` exposes fields for SSH address, username, password, HTTP proxy, proxy credentials, payload, SNI, TLS version, DNS tunnel resolver/mode, public key, nameserver, UDPGW port, tunnel type, proxy authentication, and transparent DNS.

### Xray/V2Ray path

```text
plaintext/imported V2Ray/Xray JSON string/bytes
 ↓
Libnpvtunnel.validateV2rayConfig(String)
Libnpvtunnel.testV2rayJsonConfig(byte[])
 ↓
XrayTunnel.start(byte[] jsonBytes, XrayTunnelInterface cb, ...)
```

`libgojni.so` contains Xray core strings and Go JNI symbols, confirming Xray parsing/runtime lives in the native Go library.

## 7. Import-method comparison

Readable resources prove distinct user-facing import actions:

* Cloud import: `import_cloud_config`
* QR import: `menu_item_import_config_qrcode`
* Clipboard import: `menu_item_import_config_clipboard`, `clipboard_v2ray`
* File import: `import_npvt_config_file`, manifest `ACTION_VIEW *.npvt`
* Subscription import: `import_sub_config`

The shared final parser is very likely `libnpvtunnel` because only one exposed native validation/start surface exists for SSH and Xray. But the exact protected dispatch methods for cloud/QR/clipboard/file are not visible until unpacking.

## 8. Required dynamic extraction to answer the remaining “exact” questions

To identify the exact cloud unlocking mechanism, capture these boundaries at runtime:

```text
Cloud shared config
 ↓  hook Activity/ViewModel callback after runtime DEX dump
Raw received data
 ↓  hook URL/OkHttp/Firebase response bytes
Decode/decrypt/unpack operations
 ↓  hook Base64, Cipher, Mac, MessageDigest, GZIPInputStream, Inflater, libnpvtunnel.decodeBase64/hexDecode
Secret/key derivation
 ↓  hook SecretKeySpec, IvParameterSpec, GCMParameterSpec constructors and native zInq/gwj
Plain configuration JSON/bytes
 ↓  hook JSONObject/Gson/Moshi and validateV2rayConfig/validateSshConfig/testV2rayJsonConfig
Xray/SSH validation/start
 ↓  hook XrayTunnel.start and SshTunnel.start byte[] arguments
```

Recommended Frida hooks:

* `dalvik.system.BaseDexClassLoader.<init>` and `DexClassLoader.<init>` to log the unpacked DEX path.
* `java.io.FileOutputStream.write(byte[])` when the destination ends with `.dex`/`.jar`/`.apk` to dump unpacked code.
* `javax.crypto.Cipher.getInstance/init/doFinal`, `SecretKeySpec.<init>`, `IvParameterSpec.<init>`, `GCMParameterSpec.<init>`.
* `android.util.Base64.decode`, `libnpvtunnel.Libnpvtunnel.decodeBase64`, `hexDecode`, `validateSshConfig`, `validateV2rayConfig`, `testV2rayJsonConfig`.
* `libnpvtunnel.SshTunnel.start` and `libnpvtunnel.XrayTunnel.start` to dump final plaintext bytes.

## Final answer to the requested fields

* **Where decryption happens:** not in readable Java/smali. Protected runtime code loaded via `ProtectedMyApplication.attachBaseContext()` / `libalice.so` / `libdpboot.so` / `uapgpA()` must be unpacked. Native asset access and crypto strings in `libalice.so` indicate decryption capability there, but cloud-specific decryption is not statically proven.
* **What algorithm is used:** not recoverable from the readable dump. AES/GCM/RSA strings exist in native libraries, but no call chain links them to cloud payloads.
* **Where the key comes from:** the only visible 32-byte derived material is produced in `ProtectedMyApplication.onCreate()` from `gwj()` plus two substitution tables and passed to native `zInq()`. This is likely protector key material, not proven cloud material.
* **How cloud config becomes JSON:** not visible before runtime unpacking. The final accepted form is either SSH config bytes consumed by `validateSshConfig`/`SshTunnel.start`, or V2Ray/Xray JSON consumed by `validateV2rayConfig`/`XrayTunnel.start`.
* **Exact classes/functions involved:** visible bootstrap classes are `ProtectedMyApplication`, `ProtectedMyApplication$ProtectedMyApplication$a$a`, `ProtectedMyApplication$MainActivity$d`, and `ProtectedMyApplication$MainActivity$e`; final VPN classes are `libnpvtunnel.Libnpvtunnel`, `SshTunnel`, `XrayTunnel`, `SshConfig`, `SshTunnelInterface`, and `XrayTunnelInterface`. The exact cloud importer class/function is in the protected runtime DEX and is not present in the static readable dump.
=======
# NPV Tunnel cloud-configuration reverse-engineering report

## Scope and evidence base

This analysis used both decompiled JADX output under `npv_java_source/` and apktool smali/resources under `npv_smali_source/`.  The APK is protected: the manifest uses `com.napsternetlabs.napsternetv.ProtectedAppComponentFactory` and `.ProtectedMyApplication`, and the real app classes are hidden behind DexProtector/libdexprotector plus an encrypted `assets/classes.dex.dat`.  Consequently, the complete Compose UI/ViewModel Kotlin call graph is not present as readable Java/smali in the provided dump.

## Entry points that are provable from the static dump

### Android entry points

* Main launcher/import Activity: `com.napsternetlabs.napsternetv.kkAhtatwbwcyv`.
* VPN Service: `com.napsternetlabs.napsternetv.bAEBnrhbzougz`, exported with `android.permission.BIND_VPN_SERVICE`.
* Native Go/Xray bridge: package `libnpvtunnel`, loaded by `go.Seq.touch()` from `Libnpvtunnel`.

The manifest also proves that file import enters the same main Activity through `ACTION_VIEW` handlers for `content://` and `file://` data, specifically including `*.npvt` path patterns.

### Cloud-import UI string evidence

The application contains Compose resource strings for:

* `import_cloud_config`
* `export_to_cloud`
* `cloud_config_expiry_minutes`
* `cloud_config_disable_integrity_check`
* `invalid_cloud_config_expiry`
* `configuration_is_expired`
* `config_expiry_check_failed`
* `menu_item_import_config_clipboard`
* `menu_item_import_config_qrcode`
* `import_npvt_config_file`
* `import_sub_config`

These are evidence that cloud, QR, clipboard, file, and subscription import features exist. They do **not**, by themselves, prove the exact runtime UI callback because the protected application logic that references these resources is not readable in the provided Java/smali.

## Cloud download architecture

No readable Java or smali class in the dump contains a recoverable cloud-import HTTP endpoint, URL-construction routine, request headers, auth token generation, Retrofit interface, or app-level OkHttp request for NPV cloud configs.  Searches for `HttpURLConnection`, `OkHttp`, `Retrofit`, `cloud`, endpoint-looking `https://` strings, `FirebaseDatabase`, and Firebase Remote Config show SDK/framework code and resources, not a concrete NPV cloud-config import call chain.

Important distinction: Firebase Database/Remote Config components are registered in the manifest, but no readable NPV app call site to them is exposed in the Java/smali. Therefore the cloud backend cannot be asserted as Firebase from the provided static dump alone.

## Data transformation / encryption findings

### Java-visible transformation helpers

`libnpvtunnel.Libnpvtunnel` exports native helpers:

* `decodeBase64(String): String`
* `encodeBase64(String): String`
* `hexDecode(byte[]): byte[]`
* `hexEncode(byte[]): String`
* `stripIPAddresses(...)`
* `validateSshConfig(byte[]): SshConfig`
* `validateV2rayConfig(String)`
* `testV2rayJsonConfig(byte[])`

This proves at least Base64 and hex encoding helpers are available to the app, and that SSH/V2Ray validation is delegated to native Go code. It does **not** prove that cloud responses are AES/RSA encrypted; no readable cloud import path reaches these helpers in the exposed code.

### Native cryptography/key status

`libgojni.so` contains Xray/Go bridge symbols and exposes validation/start routines. `libalice.so` contains crypto-library strings mentioning AES/RSA/GCM/PKCS errors, but those are generic library strings and are not evidence of NPV cloud-config encryption. No hardcoded cloud decryption key, AES mode, IV format, RSA public/private key, HMAC key, signature verifier, or key-derivation routine was recoverable from readable Java/smali.

The likely reason is protection: `assets/classes.dex.dat` is present and `libdexprotector.so` is shipped. The actual cloud import and any decryptor may be in encrypted code loaded at runtime by DexProtector.

## Expiry / lifetime system

Two separate expiry mechanisms are visible:

1. UI/config strings for cloud-config expiry settings and errors: `cloud_config_expiry_minutes`, `invalid_cloud_config_expiry`, `configuration_is_expired`, and `config_expiry_check_failed`.
2. Native tunnel callback interfaces for runtime expiry enforcement:
   * `SshTunnelInterface.onConfigTimeLeft(String)`
   * `SshTunnelInterface.onConfigurationExpired()`
   * `SshTunnelInterface.onConfigurationExpiryCheckFailed(String)`
   * `XrayTunnelInterface.onConfigTimeLeft(String)`
   * `XrayTunnelInterface.onConfigurationExpired()`
   * `XrayTunnelInterface.onConfigurationExpiryCheckFailed(String)`

This indicates expiry is not just an import-screen property: the running SSH/Xray tunnel reports remaining time and expiry failures back to Java. The static dump does not expose where the imported cloud expiry timestamp/TTL is persisted, nor whether the periodic check is local-only or remote-assisted. The `onConfigurationExpiryCheckFailed` callback name strongly suggests at least one validation/check operation can fail independently from a simple local timestamp comparison, but the callback implementation and scheduler are protected.

## VPN configuration path proven from native bridge

The visible native API supports two final runtime outputs:

### SSH path

Cloud/QR/clipboard/file payload, after parsing, can become a native `SshConfig` object.  `SshConfig` fields include SSH address, username, password, HTTP proxy, proxy credentials, payload, SNI, TLS version, DNS tunnel mode/resolver, public key, nameserver, UDPGW port, tunnel type, proxy-auth flag, and UDPGW transparent DNS flag. `Libnpvtunnel.validateSshConfig(byte[])` returns this object, and `SshTunnel.start(SshConfig, SshTunnelInterface, ...)` starts the native tunnel.

### Xray/V2Ray path

Cloud/QR/clipboard/file payload, after parsing, can become raw V2Ray/Xray JSON. `Libnpvtunnel.validateV2rayConfig(String)` and `Libnpvtunnel.testV2rayJsonConfig(byte[])` validate it, and `XrayTunnel.start(byte[], XrayTunnelInterface, String, String, boolean...)` starts it.

The Xray core itself is inside `libgojni.so`, which contains many Xray protobuf/package strings (`github.com/xtls/xray-core/...`).

## Comparison of import methods

Static evidence proves the app has separate user-facing import commands for cloud import, QR-code import, clipboard import, file import, and subscription import. The final parser/validator layer is very likely shared because there are only common native validators for SSH config bytes and V2Ray JSON/string data. However, the exact Java/Kotlin dispatch code that routes cloud-vs-QR-vs-clipboard-vs-file into these validators is inside protected code and is not readable in the provided JADX/smali.

## Runtime flow diagram with confidence levels

```text
User selects “Import cloud config”                         [resource-proven]
 ↓
Protected Compose Activity/ViewModel code                  [not exposed]
 ↓
Cloud request / backend token / response download           [not exposed]
 ↓
Decode/decrypt/parse response                               [not exposed]
 ↓
Either SSH config bytes or V2Ray/Xray JSON                  [native API-proven]
 ↓
Libnpvtunnel.validateSshConfig(byte[]) or validateV2rayConfig(String)
 ↓
SshConfig native object OR accepted Xray JSON               [native API-proven]
 ↓
SshTunnel.start(...) or XrayTunnel.start(...)               [native API-proven]
 ↓
VpnService `bAEBnrhbzougz` and Go/Xray native core          [manifest/native-proven]
 ↓
Expiry callbacks: onConfigTimeLeft / onConfigurationExpired / onConfigurationExpiryCheckFailed
```

## Direct answer about the cloud decryption key/auth

I did **not** recover a cloud decryption key, cloud auth token, request signing secret, or exact decryption algorithm from the provided readable source. The exposed Java/smali contains no cloud endpoint or key material. The app is protected by DexProtector and ships `assets/classes.dex.dat`; this is the most likely location of the missing cloud-import code and any associated decryptor/auth logic after runtime unpacking.

## Remaining unknowns / next work

1. Run the APK under instrumentation and dump the dynamically loaded/unpacked DEX after `ProtectedMyApplication` initializes.
2. Hook OkHttp/HttpURLConnection/Firebase Database calls dynamically to capture cloud URLs, headers, parameters, and tokens.
3. Hook `javax.crypto.Cipher`, `Mac`, `MessageDigest`, `Base64`, and `libnpvtunnel.*` JNI boundaries to capture plaintext before/after transformations.
4. Hook `SshTunnel.start`, `XrayTunnel.start`, `validateSshConfig`, and `validateV2rayConfig` arguments to recover final readable configs.
5. Hook expiry callbacks and time APIs to determine whether the 1-15 minute lifetime is server-issued TTL, signed timestamp, remote polling, or local wall-clock enforcement.

