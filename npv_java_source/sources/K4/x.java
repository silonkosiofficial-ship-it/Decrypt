package K4;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f6130a;

    public x(java.lang.String str) {
        this.f6130a = ("UID: [" + android.os.Process.myUid() + "]  PID: [" + android.os.Process.myPid() + "] ").concat(str);
    }

    private static java.lang.String e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = java.lang.String.format(java.util.Locale.US, str2, objArr);
            } catch (java.util.IllegalFormatException e6) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + android.text.TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int a(java.lang.String str, java.lang.Object... objArr) {
        if (!android.util.Log.isLoggable("PlayCore", 6)) {
            return 0;
        }
        e(this.f6130a, "Phonesky is not installed.", objArr);
        return 0;
    }

    public final int b(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (!android.util.Log.isLoggable("PlayCore", 6)) {
            return 0;
        }
        e(this.f6130a, str, objArr);
        return 0;
    }

    public final int c(java.lang.String str, java.lang.Object... objArr) {
        if (!android.util.Log.isLoggable("PlayCore", 4)) {
            return 0;
        }
        e(this.f6130a, str, objArr);
        return 0;
    }

    public final int d(java.lang.String str, java.lang.Object... objArr) {
        if (!android.util.Log.isLoggable("PlayCore", 5)) {
            return 0;
        }
        e(this.f6130a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
        return 0;
    }
}
