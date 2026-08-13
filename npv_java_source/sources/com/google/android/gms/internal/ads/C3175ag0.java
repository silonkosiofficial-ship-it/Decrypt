package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ag0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3175ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f34124a;

    public C3175ag0(java.lang.String str) {
        this.f34124a = ("UID: [" + android.os.Process.myUid() + "]  PID: [" + android.os.Process.myPid() + "] ").concat(str);
    }

    private static java.lang.String e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = java.lang.String.format(java.util.Locale.US, str2, objArr);
            } catch (java.util.IllegalFormatException e6) {
                "Unable to format ".concat(java.lang.String.valueOf(str2));
                str2 = str2 + " [" + android.text.TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int a(java.lang.String str, java.lang.Object... objArr) {
        if (!android.util.Log.isLoggable("PlayCore", 6)) {
            return 0;
        }
        e(this.f34124a, str, objArr);
        return 0;
    }

    public final int b(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (!android.util.Log.isLoggable("PlayCore", 6)) {
            return 0;
        }
        e(this.f34124a, str, objArr);
        return 0;
    }

    public final int c(java.lang.String str, java.lang.Object... objArr) {
        if (!android.util.Log.isLoggable("PlayCore", 4)) {
            return 0;
        }
        e(this.f34124a, str, objArr);
        return 0;
    }

    public final int d(java.lang.String str, java.lang.Object... objArr) {
        if (!android.util.Log.isLoggable("PlayCore", 5)) {
            return 0;
        }
        e(this.f34124a, str, objArr);
        return 0;
    }
}
