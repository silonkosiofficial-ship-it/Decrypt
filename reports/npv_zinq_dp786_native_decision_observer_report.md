# NPV zInq DP:786 native decision observer report

## Scope

This continuation is read-only. It adds a focused native observer for the `ProtectedMyApplication.onCreate()` / `zInq(Object)` startup thread and does not patch memory, modify instructions, replace functions, change return values, suppress exceptions, or spoof Java/native environment values.

## Observer

Use:

```bash
frida -U -f com.napsternetlabs.napsternetv \
  -l tools/frida/npv_zinq_readonly_decision_path_observer.js
```

The observer starts Stalker at `ProtectedMyApplication.onCreate()` before the native startup call chain reaches `zInq(Object)`. It retains the last native branch/call/return events from application/protector/anonymous executable ranges and dumps the retained tail when `RuntimeException("DP:786")` is constructed or when `onCreate()` throws.

## Captured native APIs

The observer records same-thread calls to these read-only native APIs when they occur during the active startup trace window:

- `__system_property_get`
- `__system_property_read`
- `__system_property_read_callback`
- `open`, `open64`, `openat`, `openat64`
- `read`
- `readlink`, `readlinkat`
- `access`
- `stat`, `stat64`, `lstat`, `lstat64`, `fstatat`, `fstatat64`

For each observed API call it records the caller address, module ownership, module offset, executable range ownership, return value, and native backtrace. Values are captured only by reading existing output/path buffers after the original function executes. The observer does not write to those buffers.

## Value collection focus

The intended high-signal values are:

- `ro.build.fingerprint`
- `ro.product.*`
- `ro.kernel.*`
- qemu/goldfish/ranchu/emulator-related properties
- `/proc/*` reads and links
- build/property files inspected through open/read/stat/access

`read()` content is capped to a short hex/ascii preview to avoid excessive output while preserving enough context to identify `/proc`, property, and emulator-fingerprint reads.

## Final report format after runtime execution

### PROVEN

Record the exact native API/check leading to `DP:786` only if the event tail shows an immediately preceding API/value or native branch/call path that reaches `RuntimeException("DP:786")` creation on the same thread.

### LIKELY

If the exact predicate remains inside protector VM/anonymous code, rank the most probable source by proximity to the DP constructor. Current external evidence makes the emulator fingerprint classification likely, especially the observed `google/sdk_gphone64_x86_64/emu64x... blocked` fingerprint.

### UNKNOWN

Anything executed only inside obfuscated/protector VM code without an observable libc/property/filesystem edge remains unknown. A Stalker tail can prove ownership, offsets, and execution adjacency, but not necessarily the internal comparison semantics.

### NEXT

The smallest next tracing step is to rerun the same observer and compare the final 20-50 `PATH_EVENT` lines immediately before `PROVEN_DP786_RUNTIME_EXCEPTION_CONSTRUCTOR`. If the last external API is a property or file read, add a second read-only hook for the specific lower-level helper or JNI exception construction path observed in that backtrace.
