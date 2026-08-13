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
