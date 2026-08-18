# NPV DP:786 read-only native decision-path observer plan

## Question this experiment answers

Which native instruction path on the `ProtectedMyApplication.onCreate()` / `zInq(Object)` startup thread immediately precedes creation of `RuntimeException("DP:786")`, and which read-only environment/proc/property operations occur on that same thread before failure?

## Why this experiment is needed

Prior evidence proved Java wrapper methods only propagate or report the failure. Direct tracing of a registered `zInq` pointer did not expose executed instructions, which suggests the pointer may be a trampoline, generated dispatcher, or protector boundary. This observer therefore starts at the Java startup boundary and follows the native execution stream for that thread without replacing the native entrypoint.

## What evidence it can prove

The observer can prove:

- The exact startup thread selected for observation, including timestamp, elapsed time, process id, thread id, and thread name.
- The last retained branch, call, and return instructions before `RuntimeException("DP:786")` construction.
- Native return-address context through each instruction callout's `lr` and native backtrace.
- Module/range ownership for every reported instruction, program counter, link register, API hook, and backtrace address.
- Whether the failing path performed directly visible environment reads through `__system_property_get`, `open`, `openat`, `access`, or `readlinkat` on the observed startup thread.
- File/proc/property names and returned property values when those APIs are observed naturally.

## New artifact

`tools/frida/npv_zinq_readonly_decision_path_observer.js`

## Safety constraints

The observer is read-only:

- It does not modify the APK.
- It does not patch memory.
- It does not modify instructions.
- It does not bypass checks.
- It does not replace functions.
- It does not change arguments.
- It does not change return values.
- It does not suppress exceptions.
- Java hooks call originals and rethrow original exceptions.
- Native hooks record arguments, return values, and backtraces only after the original native implementation runs.

## Command

```bash
frida -U -f com.napsternetlabs.napsternetv \
  -l tools/frida/npv_zinq_readonly_decision_path_observer.js
```

## Expected log milestones

1. `PROVEN_ENV_HOOK_INSTALLED` rows identify read-only environment/proc observer APIs and their module ownership.
2. `observer installed` confirms Java setup.
3. `PROVEN_JAVA_BOUNDARY_ONCREATE_ENTER` identifies the Java startup boundary.
4. `PROVEN_EXECUTABLE_RANGE_SNAPSHOT` captures executable ownership ranges.
5. `PROVEN_STALKER_START` confirms the startup thread being followed.
6. `PATH_EVENT kind=branch|call|ret` rows record taken control-flow instructions and native caller context.
7. `PATH_EVENT kind=env-...` rows record natural property/file/proc reads on the same startup thread.
8. `PROVEN_DP786_RUNTIME_EXCEPTION_CONSTRUCTOR` marks the DP:786 creation boundary.
9. `PROVEN_EVENT_RING_DUMP reason=DP:786 RuntimeException(String)` dumps the last retained native path.
10. `PROVEN_JAVA_BOUNDARY_ONCREATE_THROW` proves the original exception still propagates.

## Output format for runtime findings

### PROVEN

- Exact native path: pending runtime run.
- Native caller chain into `RuntimeException("DP:786")`: pending runtime run.
- Module ownership and offsets for important addresses: pending runtime run.
- Directly observed property/file/proc reads: pending runtime run.

### LIKELY

- The current DP:786 message containing `google/sdk_gphone64_x86_64/emu64x:13/... blocked` makes an environment validation category likely, but this script is designed to prove the actual native path before treating that as the decision point.

### UNKNOWN

- The exact comparison, predicate, or policy bit that selects DP:786.
- Whether the failing value comes from Android system properties, Java `Build` fields, `/proc`, filesystem probes, APK/integrity state, debugger/Frida detection, or a combined protector policy.
- Whether the final decision instruction is in executable `base.apk`, anonymous executable memory, a loaded protector library, or an ART/JNI transition frame.

### NEXT

Run this observer once. If the tail still ends at a dispatcher without the final predicate, use the smallest next read-only step: add a temporary instruction-window observer only around the last non-ART app/protector range reported immediately before `PROVEN_DP786_RUNTIME_EXCEPTION_CONSTRUCTOR`.
