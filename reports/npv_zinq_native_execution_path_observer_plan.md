# NPV DP:786 read-only native execution path observer

## Question this experiment answers

Which native basic blocks and calls execute on the application startup thread immediately before `RuntimeException("DP:786")` is constructed from the `ProtectedMyApplication.onCreate()` / `zInq(Object)` startup path?

## Why this experiment is needed

The prior direct `Interceptor.attach(zInqPointer)` attempt observed the Java exception boundary but collected zero native instructions. That leaves the native `zInq` implementation, trampoline, or protector dispatcher unproven. This observer avoids attaching to the captured `zInq` pointer and instead follows the startup thread from the Java `onCreate()` boundary, then dumps only the relevant native path tail when `DP:786` is constructed or the startup boundary throws.

## What evidence it can prove

The script can prove:

- The Java startup boundary where tracing begins.
- The thread id and thread name followed by Stalker.
- Instruction-pointer progression as native basic-block and call events on that thread.
- Native caller/backtrace context at native faults, if any.
- The event tail immediately before `RuntimeException("DP:786")` construction.
- Module/range ownership for every retained address, including executable `base.apk` ranges, anonymous executable ranges, loaded shared libraries, and ART/libart ranges.

It does not prove the exact failed condition by itself unless the final path and adjacent telemetry identify the value or predicate. Until then, the exact condition remains unknown.

## New artifact

`tools/frida/npv_zinq_native_execution_path_observer.js`

## Safety constraints

The observer is read-only:

- It does not patch memory.
- It does not modify instructions.
- It does not attach to or replace the native `zInq` pointer.
- It does not alter native or Java arguments.
- It does not alter return values.
- It does not suppress or replace exceptions.
- Java wrappers call the original implementations and rethrow original exceptions.

## Command

```bash
frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_zinq_native_execution_path_observer.js
```

## Expected log milestones

1. `observer installed` confirms the Java-side observer is active.
2. `PROVEN_JAVA_BOUNDARY_ONCREATE_ENTER` marks the startup boundary.
3. `PROVEN_EXECUTABLE_RANGE_SNAPSHOT` records executable range ownership.
4. `PROVEN_STALKER_START` confirms current-thread native observation.
5. `PATH_EVENT` rows in the ring dump show the pre-failure instruction-pointer path.
6. `PROVEN_DP786_RUNTIME_EXCEPTION_CONSTRUCTOR` identifies the DP:786 construction boundary.
7. `PROVEN_EVENT_RING_DUMP reason=DP:786 RuntimeException(String)` emits the retained path tail.
8. `PROVEN_JAVA_BOUNDARY_ONCREATE_THROW` proves the original startup exception still propagated.

## Output interpretation template

### PROVEN

- Native address responsible for DP:786 generation: pending runtime run.
- Owning module/range: pending runtime run.
- Caller chain: pending runtime run.

### LIKELY

- The check type should be inferred only after the last retained native path is correlated with property/file/runtime telemetry. Current known DP:786 message text contains emulator fingerprint evidence, so an emulator/environment check remains likely but not yet proven as the exact predicate.

### UNKNOWN

- The exact decision instruction or final native branch.
- Whether the failing predicate is a single emulator fingerprint check or a combined protector policy decision.
- Whether the responsible address is in executable `base.apk`, anonymous executable memory, a loaded `.so`, or ART-dispatched code.

### NEXT

Run the observer once and identify the last non-ART app/protector/basic-block or call event immediately before `PROVEN_DP786_RUNTIME_EXCEPTION_CONSTRUCTOR`. If the event tail still stops at a dispatcher, add one smaller read-only trace around the constructor-time native caller range only, rather than broad property spoofing or any bypass.
