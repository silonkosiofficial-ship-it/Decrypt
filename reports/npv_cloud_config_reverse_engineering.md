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
