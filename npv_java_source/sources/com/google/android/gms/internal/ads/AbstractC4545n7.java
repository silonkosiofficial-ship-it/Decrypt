package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4545n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f37505a = "Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f37506b = android.util.Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.String f37507c = com.google.android.gms.internal.ads.AbstractC4545n7.class.getName();

    public static void a(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2 = f37505a;
        e(str, objArr);
    }

    public static void b(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2 = f37505a;
        e(str, objArr);
    }

    public static void c(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2 = f37505a;
        e(str, objArr);
    }

    public static void d(java.lang.String str, java.lang.Object... objArr) {
        if (f37506b) {
            java.lang.String str2 = f37505a;
            e(str, objArr);
        }
    }

    private static java.lang.String e(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2;
        java.lang.String str3 = java.lang.String.format(java.util.Locale.US, str, objArr);
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().fillInStackTrace().getStackTrace();
        for (int i6 = 2; i6 < stackTrace.length; i6++) {
            if (!stackTrace[i6].getClassName().equals(f37507c)) {
                java.lang.String className = stackTrace[i6].getClassName();
                java.lang.String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i6].getMethodName();
                return java.lang.String.format(java.util.Locale.US, "[%d] %s: %s", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), str2, str3);
            }
        }
        str2 = "<unknown>";
        return java.lang.String.format(java.util.Locale.US, "[%d] %s: %s", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), str2, str3);
    }
}
