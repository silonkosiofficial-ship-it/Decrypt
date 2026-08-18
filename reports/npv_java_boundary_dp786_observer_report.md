# NPV Java Boundary DP:786 Observer Report

## Experiment question

Which of the requested Java wrapper methods observes, creates, catches, or rethrows the transition from a `DP: 786` `RuntimeException` into `MessageGuardException_RFA6ID`, without touching native `zInq` or changing application behavior?

## Why this experiment is needed

Earlier evidence places the startup failure across the `ProtectedMyApplication.onCreate()` -> native `zInq(Object)` boundary, but direct native pointer tracing did not prove the decision point. This observer narrows the next read-only boundary to the requested Java wrapper methods only, so any catch/create/rethrow activity can be attributed to a specific Java wrapper without hooking native code.

## What this can prove

Runtime logs from `tools/frida/npv_java_boundary_dp786_observer.js` can prove:

- Which targeted Java wrapper method was entered before the observed failure.
- Which targeted Java wrapper method returned or threw.
- The argument types and declared return type at each wrapper boundary.
- The returned value class when a wrapper returns normally.
- The thrown exception class and message when a wrapper throws.
- The Java stack at entry, return, throw, and filtered `RuntimeException("DP: 786...")` creation.
- Whether `RuntimeException(String)` creation with a message beginning `DP: 786` is on a stack involving one of the targeted wrappers.

## Observer scope

The observer is intentionally limited to:

- `com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication.qk`
- `com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication.fAHytsI`
- `com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication.qscdn`
- `com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication.j`
- `java.lang.RuntimeException.<init>(java.lang.String)` only when the message starts with `DP: 786`

The observer does not hook `zInq`, patch code, alter arguments, alter return values, suppress exceptions, or replace thrown exceptions.

## Runtime report template

### PROVEN

Pending runtime logs from the observer.

### LIKELY

Pending runtime logs from the observer.

### UNKNOWN

- Where the `DP:786` condition is evaluated remains unknown until a stack proves the evaluating frame or a narrower follow-up observer is justified.
- Which Java wrapper catches or creates `MessageGuardException_RFA6ID` remains unknown until the targeted wrapper logs show the relevant throw/catch/create stack.

### NEXT

Run the observer once during app startup and inspect the first `RuntimeException.<init>(String) DP786 ENTER` stack plus any targeted wrapper `THROW` log. If the stack contains one targeted wrapper, the smallest next tracing step is to observe only that wrapper's immediate Java callees shown in the stack. If it does not contain a targeted wrapper, the smallest next step is to add a similarly filtered constructor observer for the concrete `MessageGuardException_RFA6ID` class name observed in logs, still without hooking `zInq`.
