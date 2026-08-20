# DP:786 residual-input investigation

## Purpose

This continuation does not add another environment spoof. The new observer records the native inputs that the process naturally receives and correlates the last observed startup input with construction of `RuntimeException("DP:786")`.

## Coverage

The observer records:

- Native property discovery and reads, including `__system_property_find`, `get`, `read`, `read_callback`, enumeration, serial, and wait APIs.
- Filesystem metadata and path probes through open, access, stat, readlink, and directory APIs.
- File content consumed through `read`, `pread`, `readv`, `fread`, `fgets`, and `getline`, with bounded previews and descriptor/stream-to-path correlation.
- The native return address, owning module, module offset, and a bounded native backtrace for each retained input.
- Monotonic elapsed time and thread ID, allowing the final same-startup-thread input to be reported with its millisecond distance from `RuntimeException("DP:786")` construction.

The script is read-only: it does not replace native functions, rewrite arguments, modify buffers or return values, patch instructions, suppress exceptions, or keep the application alive.

## Run

```bash
frida -U -f com.napsternetlabs.napsternetv \
  -l tools/frida/npv_dp786_residual_input_observer.js
```

If the existing spoof layer must remain loaded for reproduction, load it first and this observer second. The observer itself performs no spoofing.

## Output contract

### PROVEN

At runtime, the `PROVEN:` rows identify:

1. The exact time and startup thread on which DP:786 is constructed.
2. The final intercepted property or filesystem data source on that thread.
3. Its original result/data preview, caller address, caller module and offset, native backtrace, and time delta to DP:786.

No exact remaining source can honestly be marked proven until a device run supplies these rows. A row proves the final **observed** input; it proves causality only after the reported caller's comparison/branch is traced.

### UNKNOWN

Until runtime evidence excludes them, remaining paths are direct syscalls, inlined Android property-area parsing, memory-mapped or cached input, Java/JNI APIs, and a composite decision over multiple earlier observations. The observer prints this limitation at the failure boundary.

### NEXT

The smallest engineering step is to instrument only the caller module and offset printed for the last input, then observe its comparison and outgoing branch. If no hooked input appears, add a startup-thread-only direct-syscall trace for `openat` and `read`; do not broaden spoofing.
