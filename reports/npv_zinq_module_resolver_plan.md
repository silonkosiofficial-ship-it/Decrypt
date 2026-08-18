# NPV zInq native module resolver plan

## Scope

This adds a read-only Frida resolver for the captured `ProtectedMyApplication.zInq(Object)` native registration pointers. The resolver does not hook `zInq`, replace native functions, patch code, suppress exceptions, or modify application behavior.

## PROVEN input

Two runtime `RegisterNatives` registrations for `com/napsternetlabs/napsternetv/ProtectedMyApplication.zInq(Ljava/lang/Object;)V` were captured:

1. `nativePointer=0x7040c05f365e`
2. `nativePointer=0x7040bf066a20`

The multiple pointers prove there are multiple runtime registrations or implementation addresses for the same native Java boundary in the observed run. The owning native libraries are not yet proven by the pointer values alone.

## Added diagnostic

`tools/frida/npv_zinq_module_resolver.js` enumerates `Process.enumerateModules()` once, then compares each captured address against every loaded module range:

```text
module.base <= address < module.base + module.size
```

For every containing module it logs:

- module name
- module path
- module base address
- module end address
- module size
- address offset from module base

The script also includes `CAPTURED_REGISTER_NATIVES_CALLERS` for resolving the caller return addresses from the earlier `RegisterNatives` capture using the same module-range logic.

## UNKNOWN

- Which loaded module owns `0x7040c05f365e`.
- Which loaded module owns `0x7040bf066a20`.
- Which loaded module owns each `RegisterNatives` caller address, until the captured caller addresses are pasted into `CAPTURED_REGISTER_NATIVES_CALLERS` or resolved from the previous observer logs.

## NEXT STEP

Run the resolver against the original app process:

```bash
frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_zinq_module_resolver.js --no-pause
```

Success criteria:

1. A `Process.enumerateModules completed` line records the module count.
2. Each `zInqNativePointer[...]` line records a `PROVEN` containing module or an `UNKNOWN` no-module result.
3. After pasting caller addresses into `CAPTURED_REGISTER_NATIVES_CALLERS`, each `RegisterNativesCaller[...]` line records the caller module and offset.
