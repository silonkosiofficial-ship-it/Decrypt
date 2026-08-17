# STEP 4A — Frida-only original APK baseline and continuation plan

## Scope

This step keeps the original APK unmodified and uses Frida runtime instrumentation only. The previously committed source-level Step 4 development APK remains parked as a fallback and is not changed by this plan.

## Required pre-continuation report

1. **Existing probe to reuse:** reuse `tools/frida/npv_zinq_decision_probe.js` as the first baseline probe. It is already read-only and focused on the known startup chain instead of being a generic application-wide bypass.
2. **What it already proves when run successfully:** it records `attachBaseContext()`, `onCreate()`, Java native-boundary calls for `uapgpA()`, `gwj()`, and `zInq(Object)`, `RegisterNatives` mappings, zInq argument preview, DP `RuntimeException` construction, `MessageGuardException` wrapping, selected Build/SystemProperties reads, native property/filesystem/process observations, and fingerprint/blocked/DP `Log.*` messages.
3. **What it does not prove before the next baseline:** it does not by itself prove the current original APK run still reaches the same sequence, whether the original certificate check returns normally in the current environment, whether the current zInq native address/module is the same as prior runs, whether DP:757 and DP:786 differ by predicate/input/stage, or whether a runtime continuation reaches a stable UI.
4. **Exact Java boundary to instrument:** observe `ProtectedMyApplication.attachBaseContext(Context)` with the nested `J()` certificate check and `System.loadLibrary("dpboot")`, then observe `ProtectedMyApplication.onCreate()` around `gwj()` and `zInq(Object)`. Any continuation, if justified later by baseline evidence, should target the Java-visible `onCreate()` exception path for the specific DP:786 startup failure rather than no-oping zInq.
5. **Whether native zInq hooking is necessary:** native zInq observation is useful for address/range/module evidence and for determining whether zInq returns or throws, but native behavior modification is not necessary for the first baseline and should not be used as the first continuation if the Java boundary remains sufficient.
6. **Hook installation timing:** use spawn-time Frida instrumentation with `frida -U -f com.napsternetlabs.napsternetv -l <probe>`. Do not use `--no-pause` with Frida 17.5.1.
7. **How the original APK remains untouched:** the command runs the package already installed on the emulator and loads only a host-side Frida JavaScript probe into the runtime process. No APK rebuild, signing, zipalign, smali edit, install-over, or file patch is part of this step.
8. **How the experiment is reversible:** stop the Frida session and relaunch the app normally. The runtime hooks live only in the instrumented process lifetime.
9. **Exact Windows CMD-compatible commands to run:**

```cmd
cd /d C:\Users\Administrator\Downloads
adb devices
adb shell su -c "ps -A | grep frida"
adb shell su -c "/data/local/tmp/frida-server >/dev/null 2>&1 &"
adb shell su -c "ps -A | grep frida"
dir "C:\Users\Administrator\Downloads\npv_zinq_decision_probe.js"
adb logcat -c
frida -U -f com.napsternetlabs.napsternetv -l "C:\Users\Administrator\Downloads\npv_zinq_decision_probe.js" > "C:\Users\Administrator\Downloads\npv_frida_baseline_20260817_000000.txt"
adb logcat -d > "C:\Users\Administrator\Downloads\npv_logcat_20260817_000000.txt"
```

Replace the timestamp with a unique value before running so prior evidence is not overwritten. If the probe is run from this repository instead of Downloads, first copy or reference the actual existing path to `tools\frida\npv_zinq_decision_probe.js`.

10. **Expected observations:** a successful baseline should show whether Frida spawn attaches, whether `J()` enters/returns/throws, whether `System.loadLibrary("dpboot")` returns or throws, whether `uapgpA()` completes, whether `onCreate()` reaches `gwj()` and `zInq(Object)`, whether the blocked fingerprint appears before zInq, whether DP:786 appears, whether the exception originates at zInq or later wrapping, and whether AndroidRuntime terminates the process after the uncaught startup exception.

## Baseline reporting template

After the baseline, report: PROVEN, UNKNOWN, OBSERVED STARTUP SEQUENCE, J() RESULT, dpboot RESULT, uapgpA RESULT, onCreate RESULT, gwj RESULT, zInq RESULT, FINGERPRINT RESULT, DP RESULT, EXCEPTION RESULT, PROCESS TERMINATION RESULT, and FRIDA EFFECTS, IF ANY.

## Continuation gate

Do not write or run a continuation script until the current original-APK baseline answers the Java-visible boundary questions above. If the baseline confirms the same DP:786 throw path, the next smallest continuation should be a targeted, logged, runtime-only test at the `ProtectedMyApplication.onCreate()` DP:786 catch/propagation boundary. It should not globally suppress exceptions, spoof Build properties, patch every native function, or interfere with Cloud Import.
