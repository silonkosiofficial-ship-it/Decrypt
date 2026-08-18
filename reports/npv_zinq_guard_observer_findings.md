# NPV zInq guard observer findings

## Scope

This is a read-only investigation plan and static boundary summary for the startup crash where `ProtectedMyApplication.zInq(Object)` raises `RuntimeException: DP: 786`, which is then wrapped as `MessageGuardException` before the earlier framework-connectivity probe can reach `ConnectivityManager.getDefaultProxy()` / `android.net.NetworkUtils`.

The added Frida probe is intentionally narrow and observational. It hooks only:

- `ProtectedMyApplication.onCreate()`.
- `ProtectedMyApplication.zInq(Object)`.
- `ProtectedMyApplication$ProtectedMyApplication.{j,qscdn,fAHytsI,ye}()` wrapper methods on the `MessageGuardException` creation/throw route.
- `MessageGuardException(Throwable)` and `MessageGuardException(Throwable,String)` constructors.

Every hook calls the original method, returns the original return value, and rethrows the original exception.

## Static evidence

### Startup boundary

`ProtectedMyApplication.onCreate()` calls the native `gwj()` method, derives a 32-byte byte array through two lookup tables, and passes that derived array to native `zInq(Object)`. The visible Java/smali boundary around `zInq()` is therefore proven, but the internal native decision remains opaque from static Java alone.

### Guard wrapping boundary

The wrapper method `ProtectedMyApplication$ProtectedMyApplication.j(Context, Throwable)` delegates to `qscdn(Context, Throwable, String)` with a null id. `qscdn()` chooses `fAHytsI()` or `ye()` based on SDK level. The SDK >= 23 path reaches `ye()`, which creates a `MessageGuardException` through `qk(Throwable, String)` and throws it.

`MessageGuardException(Throwable,String)` uses the original throwable localized message as the `RuntimeException` message, stores a guard string from original throwable message + static fingerprint + id, and its `toString()` encodes that guard string. This proves `MessageGuardException` is a wrapper/reporting exception, not the first Java-visible failing decision.

## Current interpretation of DP:786

### PROVEN

- The app `Application` class is `com.napsternetlabs.napsternetv.ProtectedMyApplication`.
- `zInq(Object)` is a private static native method.
- `onCreate()` reaches the `gwj()`/derived-byte-array/`zInq(Object)` startup boundary before normal application startup can continue.
- The visible wrapper path for a thrown startup throwable is `j()` -> `qscdn()` -> `ye()` / `fAHytsI()` -> `qk()` -> `MessageGuardException`.
- `MessageGuardException` preserves the original throwable as cause and derives its displayed/reporting guard from the original throwable message.
- Therefore, if runtime logs show `zInq THROW RuntimeException: DP: 786` followed by `MessageGuardException.<init>` with that throwable as cause, the app terminates before `ConnectivityManager.getDefaultProxy()` / `NetworkUtils` because startup never exits the protected application guard path.

### LIKELY, NOT YET PROVEN

The `DP:786` decision is likely made inside native `zInq(Object)` or a native callee because the Java declaration exposes no Java implementation. The likely classes of checks are protection/runtime-environment checks over the startup byte-array material and current process state. Based on the current evidence alone, `DP:786` cannot yet be assigned to exactly one of:

- Frida detection.
- Debugger detection.
- Emulator detection.
- Signature/environment check.
- Instrumentation detection.

### UNKNOWN

- The exact native function address implementing `zInq(Object)` in this run.
- Which specific predicate inside `zInq()` maps to `DP:786`.
- Whether the trigger is Frida, debugger, emulator, signature/environment, or instrumentation. Any of those labels would currently be an inference, not a proven fact, unless correlated with runtime evidence from inside the `zInq()` window.

## NEXT STEP

Run the narrow observer against the original installed APK:

```bash
frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_zinq_guard_observer.js
```

Success criteria:

1. `ProtectedMyApplication.onCreate ENTER` appears.
2. `ProtectedMyApplication.zInq ENTER` appears with the derived byte-array preview.
3. `ProtectedMyApplication.zInq THROW` records the first Java-visible throwable and message.
4. `ProtectedMyApplication$ProtectedMyApplication.j/qscdn/ye/fAHytsI` entries show the wrapper route used on this SDK.
5. `MessageGuardException.<init>` logs show the original cause and id/fingerprint inputs.
6. The same original exception is rethrown; the crash is not suppressed.

Only after this proves the exact Java-visible failure boundary should a broader native predicate probe be considered. That later probe should still be read-only unless a bypass is explicitly authorized.
