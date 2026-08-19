# NPV DP:786 staging environment spoof report

## Purpose

This continuation adds an explicit spoof layer because passive tracing and wrapper-only continuation were not enough for the staging goal: reach the normal UI under authorized automated testing.

## What is spoofed

The script `tools/frida/npv_dp786_environment_spoof.js` normalizes three surfaces that a native protector commonly cross-checks:

1. Java framework telemetry: `android.os.Build` fields and `android.os.SystemProperties.get*`.
2. Native property telemetry: libc `__system_property_get` output buffers.
3. Filesystem/proc probes: selected `open`, `openat`, `access`, `stat`, `lstat`, `fstatat`, and `readlink` paths containing emulator artifacts such as `qemu`, `goldfish`, `ranchu`, `emu64`, build property files, and high-signal `/proc` files.

## Retail profile

The active profile is Pixel 7 / Panther-like:

```text
google/panther/panther:13/TQ3A.230605.012/10208123:user/release-keys
```

It covers `ro.build.fingerprint`, boot/system/vendor fingerprint aliases, `ro.product.*`, `ro.hardware`, `ro.boot.hardware`, `ro.kernel.qemu`, and related qemu/goldfish/ranchu/emulator keys.

## UI fallback

The script keeps the existing DP:786 Java wrapper fallback enabled. If spoofing misses a hidden/native signal, `ProtectedMyApplication$ProtectedMyApplication.fAHytsI(Context, Throwable, String)` returns early only for messages containing `DP:786` or `DP: 786`, so the staging run can still reach UI.

## Usage

```bash
frida -U -f com.napsternetlabs.napsternetv \
  -l tools/frida/npv_dp786_environment_spoof.js
```

## Expected proof markers

- `SPOOF_JAVA_BUILD` confirms Java Build fields were rewritten.
- `SPOOF_JAVA_PROPERTY` confirms a Java property query was normalized.
- `SPOOF_NATIVE_PROPERTY api=__system_property_get` confirms native property output was normalized.
- `SPOOF_NATIVE_PATH` confirms a native filesystem/proc probe was redirected away from emulator evidence.
- `SPOOF_UI_FALLBACK_DP786` means spoofing did not satisfy every guard signal, but the narrow DP:786 UI fallback allowed the test flow to proceed.

## Next if this still fails

If the UI still does not appear, capture the final log markers. The next smallest spoofing addition is `__system_property_read_callback`, because some Android/native call paths bypass `__system_property_get` and receive property values through a callback instead of an output buffer.
