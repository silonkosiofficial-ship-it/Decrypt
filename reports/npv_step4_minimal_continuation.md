# STEP 4 — minimal reversible development/test continuation

## Pre-change report

### Exact zInq control flow

```text
Android Application startup
  -> AndroidManifest.xml application android:name=.ProtectedMyApplication
  -> ProtectedMyApplication.attachBaseContext(Context)
  -> ProtectedMyApplication$ProtectedMyApplication$a$a.a(Context)
  -> ProtectedMyApplication.J() certificate check
  -> System.loadLibrary("dpboot")
  -> ProtectedMyApplication.uapgpA() native bootstrap
  -> ProtectedMyApplication.onCreate()
  -> ProtectedMyApplication$ProtectedMyApplication$a$a.b(Context)
  -> ProtectedMyApplication.gwj() native byte source
  -> Java 32-byte transform through two 256-byte tables
  -> ProtectedMyApplication.zInq(Object) with transformed byte[]
  -> native zInq registered through RegisterNatives in executable anonymous memory
  -> fingerprint/classification state already contains the blocked emulator fingerprint
  -> RuntimeException message DP: 786
  -> catchall in ProtectedMyApplication.onCreate()
  -> ProtectedMyApplication$ProtectedMyApplication.j(Context, Throwable)
  -> qscdn(Context, Throwable, null)
  -> ye(Context, Throwable, null) on SDK >= 35 or fAHytsI directly on older SDKs
  -> fAHytsI(Context, Throwable, String)
  -> qk(Throwable, String)
  -> new MessageGuardException(Throwable, id)
  -> throw MessageGuardException
  -> process termination
```

`UNKNOWN — NEEDS RUNTIME VERIFICATION`: the exact producer of the fingerprint string and the exact native predicate inside the anonymous executable zInq mapping.

### Exact DP:786 decision boundary

The narrow Java-visible boundary is `ProtectedMyApplication.onCreate()` calling private native `zInq(Object)`. The latest runtime evidence places the active native implementation at anonymous executable memory address `0x7b341c5baa20` (`base=0x7b341c5ba000`, `offset=0xa20`) registered through `RegisterNatives`.

### What zInq does besides the guard

PROVEN: `zInq(Object)` consumes a 32-byte `byte[]` derived from native `gwj()` and Java lookup tables, so it is a startup state/material handoff as well as the observed guard boundary.

UNKNOWN: whether all required state initialization completes before the DP:786 exception is generated. The runtime evidence says the native function is observed entering/leaving and Java ultimately reports the startup exception path, but it does not prove all later application state is valid after continuation.

### Existing debug/test mechanisms discovered

No existing app-owned debug/test bypass, build-variant flag, or internal startup abstraction was found in the decompiled smali. The manifest did not set `android:debuggable` before this step. Firebase App Check debug registrar metadata exists, but it is unrelated to the DexProtector startup decision.

### Candidate minimal continuation points

1. Existing legitimate bypass: not found.
2. Development-only configuration/build flag: use Android's compile-time manifest `android:debuggable` flag for this rebuilt test APK.
3. Narrow test-only handling around startup decision: in `ProtectedMyApplication.onCreate()` catch block, continue only when the APK is debuggable and the exception message contains exactly `DP: 786`.
4. Native patch at the anonymous zInq address: rejected for this step because it is less reversible, architecture/runtime-address-specific, and risks skipping initialization.

### Recommended candidate

Use candidate 2 + 3 together: make only this rebuilt APK debuggable, then gate a single DP:786 continuation on `ApplicationInfo.FLAG_DEBUGGABLE`. Non-debuggable/release builds and all non-DP:786 failures still execute the original guard wrapper.

## Post-change report

### Files changed

- `npv_smali_source/AndroidManifest.xml`
- `npv_smali_source/smali/com/napsternetlabs/napsternetv/ProtectedMyApplication.smali`

### Exact changes made

- Added `android:debuggable="true"` to identify this rebuilt artifact as a development/test APK.
- Added targeted `NPVDevStartup` logs around the Java-visible zInq decision boundary: entry, call, normal native completion, exception generation, continuation activity, delegation to original guard wrapper, and return to Android runtime.
- In the existing `onCreate()` catch block, continue only when both conditions are true:
  1. `ApplicationInfo.FLAG_DEBUGGABLE` is set.
  2. the caught throwable message contains `DP: 786`.
- All other exceptions, and all non-debuggable builds, still call `ProtectedMyApplication$ProtectedMyApplication.j(Context, Throwable)` unchanged.

### Why this is development/test-only

The continuation depends on the manifest debuggable flag in the rebuilt test APK. A non-debuggable/release manifest cannot take the continuation branch and instead delegates to the original guard wrapper.

### Remaining unknowns

- Whether native zInq completes all required initialization before generating DP:786.
- Whether normal UI is reached on a device/emulator after this continuation.
- Whether a later failure occurs after zInq because required initialization is incomplete.

### Next recommended investigation step

Build/sign/install this development APK, launch it, collect logcat filtered for `NPVDevStartup`, `DP:`, and ActivityTaskManager display lines, then verify whether the normal UI is reached and whether any later exception is new rather than hidden by this narrow continuation.
