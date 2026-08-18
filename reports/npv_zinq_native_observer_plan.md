# NPV zInq native observer plan

## Question this experiment answers

Can the failing `ProtectedMyApplication.zInq(Object)` startup window be correlated with a concrete native property or filesystem query, its caller address, owning module, offset, and native backtrace immediately before `RuntimeException("DP:...")` is created?

## Why this experiment is needed

The current Java evidence proves that `DP:786` originates at the native `zInq(Object)` boundary and that the Java wrapper chain only propagates or wraps it. The new emulator fingerprint log is strong evidence of an environment decision, but it does not yet prove which native API call or protected native VM path made that decision. A read-only native observer is the smallest next step because it observes only registration, the zInq execution window, and the requested native APIs without spoofing values or changing control flow.

## What evidence it can prove

`tools/frida/npv_zinq_native_observer.js` can prove:

- The runtime `RegisterNatives` mapping for `ProtectedMyApplication.zInq(Object)` when registration is observable after attach.
- The native zInq entry caller, function owner module, module path, base address, module offset, memory range, protection flags, and native backtrace.
- Calls during the zInq window to `__system_property_get`, `__system_property_read`, `open`, `openat`, `read`, `readlink`, `access`, and `stat`.
- Queried property names and returned values for emulator-relevant keys such as `ro.build.fingerprint`, `ro.product.*`, `ro.kernel.*`, `ro.boot.*`, `ro.hardware`, vendor/persist properties, and qemu-related names when those values are exposed through libc property APIs.
- Queried paths and safe read previews for `/proc/*`, `/sys/*`, qemu/goldfish/ranchu, Frida, root/Magisk/su, system, and vendor paths.
- Whether a captured native API/backtrace is temporally inside the zInq window and before Java-visible DP exception construction.

## Read-only guardrails

The observer does not patch memory, modify instructions, replace functions, change return values, alter arguments, suppress exceptions, spoof properties, or keep the process alive. Hook implementations call the original Java methods and rethrow original Java exceptions. Native hooks only log original arguments and return values.

## Command

```bash
frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_zinq_native_observer.js
```

Do not add `--no-pause` unless the local Frida version is verified to accept it.

## Report template for runtime findings

### PROVEN

- zInq native mapping: pending runtime observer output.
- Native API/check directly preceding DP:786: pending runtime observer output.
- Queried value/path and original return value: pending runtime observer output.
- Caller/module/offset/backtrace: pending runtime observer output.

### LIKELY

- The logcat fingerprint evidence makes emulator/environment classification the leading hypothesis, especially if the observer records `ro.build.fingerprint`, `ro.product.*`, `ro.kernel.*`, `ro.boot.*`, qemu/ranchu/goldfish paths, or `/proc` emulator indicators inside the zInq window before DP:786.

### UNKNOWN

- Whether the final DP:786 predicate is a direct native API result, a composite of several environment signals, or hidden inside a protector VM/anonymous executable region.
- Whether `RegisterNatives` will expose the final callee or only a trampoline/dispatcher.
- Whether Stalker call summaries will expose a stable protected-code target if execution enters anonymous/generated executable memory.

### NEXT

Run the observer once against the same emulator state that produced the fingerprint `blocked` log. If one property/path read immediately precedes DP creation with a zInq-owned backtrace, inspect only that caller offset next. If only anonymous/protector VM call summaries appear, add a second read-only Stalker block-summary observer limited to the zInq thread and the single anonymous/protector range observed in this run.
