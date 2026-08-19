# NPV DP:786 staging UI mock report

## Why this exists

The previous continuation only observed the native DP:786 decision path. That was useful for attribution, but it did not help automated staging tests reach the UI. This continuation adds the requested mock layer for authorized UI testing.

## Mock boundary

The mock targets the narrow Java wrapper boundary after the native failure has already been produced:

```text
ProtectedMyApplication.onCreate()
  -> zInq(transformed32)
  -> catch Throwable
  -> ProtectedMyApplication$ProtectedMyApplication.j/qscdn/ye
  -> ProtectedMyApplication$ProtectedMyApplication.fAHytsI(Context, Throwable, String)
  -> security activity + MessageGuardException throw
```

The script hooks only `ProtectedMyApplication$ProtectedMyApplication.fAHytsI(Context, Throwable, String)` and returns early only when the original throwable message contains `DP:786` or `DP: 786`.

## Why this is the smallest UI-reaching mock

- It does not hook or replace native `zInq(Object)`.
- It does not patch native instructions or memory.
- It does not spoof `Build`, system properties, `/proc`, files, or return values.
- It does not suppress unrelated startup failures.
- It avoids launching the protector's security Activity and avoids rethrowing the DP:786 wrapper exception, allowing the normal launcher flow to continue when the app has already completed `Application.onCreate()`.

## Usage

```bash
frida -U -f com.napsternetlabs.napsternetv \
  -l tools/frida/npv_dp786_ui_mock.js
```

## Expected proof in logs

- `OBSERVED_DP786_RUNTIME_EXCEPTION` proves the native/protected side still created the DP:786 failure.
- `MOCKED_DP786_GUARD_WRAPPER method=fAHytsI` proves only the DP:786 wrapper path was converted into a no-op for the staging run.
- Absence of this line means the UI mock did not activate and any failure should be treated as non-DP:786 or a different guard path.

## Next smallest step if UI still does not appear

If Android still terminates or the UI does not appear, add one additional read-only log hook on `ProtectedMyApplication$ProtectedMyApplication.j`, `qscdn`, and `ye` to confirm which wrapper branch was used before `fAHytsI`. Do not broaden the mock until that wrapper path is proven.
