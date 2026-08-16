# NPV zInq decision probe plan

## Scope

This continuation is read-only. It does not spoof emulator properties, suppress exceptions, patch native code, or alter APK files. The goal is to identify the exact native decision path that leads to `RuntimeException: DP:786` from `ProtectedMyApplication.zInq(Object)` before any development-only continuation strategy is attempted.

## Static findings reused from existing artifacts

- The app `Application` class is `com.napsternetlabs.napsternetv.ProtectedMyApplication`.
- `ProtectedMyApplication` declares the native startup methods `gwj()`, `uapgpA()`, and `zInq(Object)`.
- `attachBaseContext(Context)` calls the libalice bootstrap helper, the visible signing-certificate check, `System.loadLibrary("dpboot")`, and native `uapgpA()`.
- `onCreate()` calls the libalice application-context handoff, native `gwj()`, derives a 32-byte array through Java lookup tables, and passes that array to native `zInq(Object)`.
- The arm64 native libraries in the decompiled resources export `JNI_OnLoad` but do not export named JNI symbols for `zInq`, `gwj`, or `uapgpA`; therefore the exact method-to-address mapping must be collected at runtime from `RegisterNatives` or equivalent JNI registration telemetry.

## Native-library containment status

Current static evidence proves that the startup native methods are dynamically registered rather than exported as readable JNI symbols. Because `System.loadLibrary("dpboot")` immediately precedes `uapgpA()` and the prior telemetry saw `libdpboot.so`, `libdexprotector.so`, and `libalice.so` around startup, the candidate containing libraries remain:

- `libdpboot.so`
- `libdexprotector.so`
- `libalice.so`

The exact library containing `zInq()` remains **unknown until runtime registration evidence is captured**. The new probe records each `RegisterNatives` entry for `ProtectedMyApplication` and annotates `zInq`, `gwj`, and `uapgpA` with function address and containing module when registration is observed.

## New diagnostic artifact

`tools/frida/npv_zinq_decision_probe.js` is a focused, read-only zInq decision probe. It records:

- `attachBaseContext`, `onCreate`, `uapgpA`, `gwj`, and `zInq` entry/return/throw.
- The Java stack at the native Java-boundary entries.
- The `zInq(Object)` argument preview when it is the expected byte array.
- Runtime `RegisterNatives` mappings for app classes, especially `ProtectedMyApplication.zInq`, `gwj`, and `uapgpA`.
- Loaded native modules at startup boundaries.
- Java and native system-property reads, preserving original values.
- Build fields and SDK/version fields, preserving original values.
- Native filesystem checks for `/proc`, `/sys`, system/vendor paths, Magisk/su/Frida indicators, `.dexp-queue`, `.pb`, and `base.apk`.
- Process execution attempts through `Runtime.exec`, `fork`, `execve`, `system`, and `popen`.
- Native callers and backtraces for the captured native property/filesystem/process events.
- `RuntimeException` DP messages and `MessageGuardException` wrapper creation.

## Command to run

```bash
frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_zinq_decision_probe.js
```

Do not add `--no-pause`; Frida 17.5.1 rejects that option in this environment.

## Expected evidence from a successful diagnostic run

The run should produce a timestamped sequence showing:

1. `attachBaseContext enter` and `attachBaseContext exit`.
2. Loaded-module snapshots including the protection-related libraries present at each startup boundary.
3. `RegisterNatives` rows for `ProtectedMyApplication.zInq`, `gwj`, and `uapgpA`, if registration occurs after the probe is attached.
4. `onCreate enter`.
5. `gwj enter` and `gwj return`.
6. `zInq enter` with the transformed byte-array preview and Java stack.
7. Native property/filesystem/process observations inside the `zInq` window and their callers/backtraces.
8. `zInq THROW=... DP:786` if the same failure reproduces.
9. `RuntimeException DP message=...` and `MessageGuardException cause=...` wrapper evidence.

## Evidence table to fill from runtime logs

| Signal/check | Observed value | Native caller/module | Return value | Timestamp/TID | Immediately before DP:786? | Confidence |
| --- | --- | --- | --- | --- | --- | --- |
| `ro.kernel.qemu` | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | unknown |
| `ro.hardware` / `ranchu` | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | unknown |
| `ro.boot.qemu` | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | unknown |
| `ro.build.characteristics` | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | unknown |
| ABI / x86_64 | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | unknown |
| emulator product/model/device | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | unknown |
| root/Magisk/su checks | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | unknown |
| debugger/Frida/proc checks | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | unknown |
| package/signature/integrity checks | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | unknown |
| network/attestation checks | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | pending runtime trace | unknown |

## Current conclusions before the new run

### Proven

- `zInq(Object)` is the visible Java/native boundary currently associated with the `DP:786` failure in the provided prior runtime evidence.
- `zInq(Object)` is reached from `ProtectedMyApplication.onCreate()` after `gwj()` and the Java 32-byte transform.
- The visible static code does not expose a named exported JNI symbol for `zInq()` in the decompiled arm64 native libraries.

### Likely

- `zInq()` is dynamically registered from one of the protection startup libraries seen in prior telemetry.
- Multiple environment/security signals may be read before the final blocked decision.

### Unknown

- The exact native library and function address for `zInq()` until `RegisterNatives` telemetry is captured.
- Which individual signal, if any, is causal for `DP:786`.
- Whether the final predicate is a single check or a combined decision chain.

## Narrowest future continuation point

No continuation change should be made yet. If the new evidence identifies a single native decision function or a single `ProtectedMyApplication.zInq` registered function address as the final decision boundary, the narrowest development/test continuation point should be there, not broad emulator property spoofing. If source-level control exists for the authorized development build, the preferred path is a test-build-only configuration that disables only this startup gate while preserving the rest of the app behavior.

## Proving normal UI after any later continuation experiment

A later continuation experiment is not successful unless logcat and Frida evidence show:

1. `attachBaseContext enter` and `attachBaseContext exit`.
2. `onCreate enter` and `onCreate exit`.
3. `zInq enter` without a `DP:786` throw.
4. No `MessageGuardException` for the startup failure.
5. Main activity creation/resume or otherwise visible normal NPV UI evidence.
6. The `com.napsternetlabs.napsternetv` process remains alive after initialization.

Only after those conditions are proven should the investigation move to Cloud Import tracing.
