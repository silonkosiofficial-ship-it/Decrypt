# NPV zInq / DP:786 forensic runtime report

## Scope and guardrails

This report is a read-only diagnostic analysis of the protected startup path for the authorized development/test copy of `com.napsternetlabs.napsternetv`. It does not propose or implement bypasses, return-value replacement, exception suppression, native patching, Build-property spoofing, or exit/abort hooks.

## A. Confirmed startup call graph

### Static Java/smali path

1. Android creates `com.napsternetlabs.napsternetv.ProtectedMyApplication` from the manifest/application path observed in prior runs.
2. `attachBaseContext(Context)` calls:
   - `super.attachBaseContext(context)`
   - `ProtectedMyApplication$ProtectedMyApplication$a$a.a(Context)`
   - `J()` certificate check
   - `System.loadLibrary("dpboot")`
   - native `uapgpA()`
   - on any `Throwable`, `ProtectedMyApplication$ProtectedMyApplication.j(Context, Throwable)`.
3. `onCreate()` calls:
   - `super.onCreate()`
   - `ProtectedMyApplication$ProtectedMyApplication$a$a.b(Context)`
   - native `gwj()`
   - Java loop deriving a 32-byte array from `gwj()[0..31]` through two 256-byte lookup tables
   - native `zInq(Object)` with the derived array
   - on any `Throwable`, `ProtectedMyApplication$ProtectedMyApplication.j(Context, Throwable)`.
4. The visible wrapper chain is:
   - `j(Context, Throwable)` -> `qscdn(Context, Throwable, null)`
   - API >= 35 path: `qscdn()` -> `ye()` -> `Handler.postAtFrontOfQueue(Runnable)` -> `run()` -> `fAHytsI()`
   - older path: `qscdn()` -> `fAHytsI()` directly
   - `fAHytsI()` -> `qk(Throwable, String)` -> `new MessageGuardException(Throwable, id)` -> optional security Activity intent -> `throw MessageGuardException`.

## B. zInq Java signature and callers

Static declaration:

```java
private static native void zInq(java.lang.Object obj);
```

Smali descriptor:

```smali
.method private static native zInq(Ljava/lang/Object;)V
```

Confirmed visible caller:

```java
byte[] bArrGwj = gwj();
byte[] bArr3 = new byte[32];
for (int i6 = 0; i6 < 32; i6++) {
    bArr3[i6] = bArr[bArr2[bArrGwj[i6] & 255] & 255];
}
zInq(bArr3);
```

Therefore the declared parameter type is `java.lang.Object`, while the visible static caller passes a `byte[]`. Runtime instrumentation must still record the actual class because the JNI declaration intentionally accepts `Object`.

## C. RegisterNatives/native mapping

Static ELF symbol inspection of bundled arm64 libraries found `JNI_OnLoad` exports in `libalice.so`, `libdpboot.so`, and `libdexprotector.so`, but no exported named JNI symbol for `zInq`, `gwj`, or `uapgpA`.

This means static export tracing stops before the exact native function. The mapping must be collected at runtime from `RegisterNatives` telemetry or equivalent ART/JNI registration observations.

The diagnostic probe hooks non-CheckJNI `libart.so` symbols containing `RegisterNatives`, decodes each `JNINativeMethod` row, and records entries for `ProtectedMyApplication.zInq`, `gwj`, and `uapgpA` with signature, function pointer, module, and memory range.

## D. Native module/address information

Known statically:

- `attachBaseContext()` explicitly loads `libdpboot.so` before `uapgpA()`.
- The app includes protection/bootstrap libraries `libalice.so`, `libdpboot.so`, and `libdexprotector.so`.
- Those libraries export `JNI_OnLoad`, but do not expose named `Java_com_napsternetlabs_napsternetv_ProtectedMyApplication_zInq` symbols.

Known only at runtime after registration:

- the exact function pointer for `zInq(Object)`
- containing native module
- memory range/base/offset/protection/file path
- native caller/backtrace on entry

`tools/frida/npv_zinq_decision_probe.js` is the current evidence-collection mechanism for this.

## E. Exact DP:757 vs DP:786 comparison

Confirmed from user-provided logcat evidence:

- DP:786 run:
  - Application reaches `ProtectedMyApplication.onCreate()`.
  - Immediately before failure, logcat prints a fingerprint/classification line:
    `Fingerprint: [20250617-202506220716 3e:3e 33 google/sdk_gphone64_x86_64/emu64x:13/TE1A.240213.009/12342917:user/release-keys blocked]`
  - failure becomes `MessageGuardException...: DP: 786`.
  - stack includes `ProtectedMyApplication.onCreate()` -> native `zInq()` -> wrapper chain.
- DP:757 run:
  - user reported an earlier launch produced `DP:757` through the same native `zInq()` path.

Not yet proven:

- whether DP:757 and DP:786 are two distinct native checks, two codes emitted by one scoring/classification routine, or the same native decision reached with different runtime inputs.
- whether the fingerprint/classification line exists for the DP:757 run.
- whether `gwj()` output / derived 32-byte `zInq` input differs between the two runs.

The current repo does not contain full timestamped DP:757 and DP:786 Frida/logcat artifacts sufficient to compare native addresses, inputs, module callers, or environment reads. The next run should save complete logcat + Frida output for both cases without overwriting prior evidence.

## F. Fingerprint/"blocked" provenance

Static Java findings:

- `MessageGuardException` has a static `fingerprint` field.
- Its constructor appends the original throwable message, `MessageGuardException.fingerprint`, and optional id into the guard string.
- The visible Java does not compute the logcat fingerprint line or assign a literal value to `MessageGuardException.fingerprint`.

Runtime implications:

- The user-provided logcat line is evidence that some startup path computes or logs a fingerprint classification ending in `blocked` immediately before DP:786.
- Static Java/smali search did not reveal the exact `Fingerprint: [` producer in visible Java. Therefore the producer is likely native/protected/hidden code, or a dynamically loaded class not represented as readable static source. This remains an inference, not proof, until runtime Log/SystemProperties/native telemetry captures the call stack.

Instrumentation added in this pass:

- logs `MessageGuardException.fingerprint` before/after `zInq` and before/after `MessageGuardException` construction;
- hooks `android.util.Log.d/i/w/e(String,String)` and emits Java stacks for messages containing `Fingerprint:`, `blocked`, or `DP:`;
- retains existing Build and SystemProperties/native `__system_property_get` logging.

## G. What is known about the input to zInq

Static evidence proves the visible `onCreate()` caller passes a Java `byte[]` of length 32 to `zInq(Object)`. Each byte is computed as:

```java
bArr3[i] = bArr[bArr2[gwj()[i] & 255] & 255];
```

Known runtime requirement:

- Do not assume the JNI-side object is always a byte array. The probe records the actual runtime Java class name and safely previews arrays.

Current probe coverage:

- Java-level `zInq` entry/return/throw
- actual argument class and byte/int-array preview
- Java stack at `zInq` entry
- native function address/range when `RegisterNatives` mapping is observed
- native entry, native caller, native backtrace, native return when mapping was captured early enough
- thread id, Java thread name, timestamp, elapsed milliseconds, and phase

## H. What is still unknown

1. The exact native function pointer/module for `zInq(Object)` in the failing x86_64/API-33 emulator run.
2. Whether `zInq` directly throws `RuntimeException("DP: 786...")` through JNI/ART, or returns/sets state that a Java/protected wrapper converts to DP:786.
3. The immediate native predicate that classifies the environment as `blocked`.
4. Whether the fingerprint string is built from Java `Build.*`, native `__system_property_get`, `/proc`/`/sys`/filesystem checks, anti-instrumentation probes, root/Magisk probes, architecture/emulator checks, or a composite of several signals.
5. The causal difference between DP:757 and DP:786.
6. Whether the separate `ClassNotFoundException: com.napsternetlabs.napsternetv.kkAhtatwbwcyv` is only launcher/instrumentation timing/class-loading fallout or contributes to startup protection state. Static manifest does reference `.kkAhtatwbwcyv` as the launcher Activity, so that issue should be tracked separately unless correlated with the zInq DP path.

## I. Smallest next diagnostic experiment

Run the updated probe once against the same emulator state that produced DP:786, redirecting Frida and logcat to unique timestamped files. Do not spoof, bypass, or keep the process alive.

Expected distinguishing evidence:

1. If `RegisterNatives` logs `ProtectedMyApplication.zInq(Ljava/lang/Object;)V`, then the native module/address/range are known.
2. If Java `zInq THROW=java.lang.RuntimeException: DP: 786...` appears before `MessageGuardException`, then the native boundary itself throws or propagates the original DP exception.
3. If `zInq return=...` appears and only later `RuntimeException DP message=...` appears, then a Java/protected wrapper after native return is converting state into DP.
4. If `Log.* tag=... msg=Fingerprint: ... blocked` includes a Java stack, the fingerprint producer is visible Java/hidden DEX. If only logcat sees it and Frida Java Log hooks do not, the producer may be native logging.
5. If property/filesystem/process events occur inside the `zInq` window immediately before DP:786, compare their values/backtraces to a DP:757 run.

Suggested command pattern from repo root:

```bash
TS=$(date -u +%Y%m%dT%H%M%SZ)
adb logcat -c
(adb logcat -v threadtime > "reports/logcat_zinq_${TS}.txt" &) 
frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_zinq_decision_probe.js > "reports/frida_zinq_${TS}.txt" 2>&1
```

Do not use `--no-pause` for Frida 17.5.1 unless explicitly verified in the environment.
