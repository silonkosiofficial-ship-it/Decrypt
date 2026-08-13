package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3586eM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f34974a = new java.lang.Object();

    public static java.lang.String a(java.lang.String str, java.lang.Throwable th) {
        java.lang.String strReplace;
        if (th != null) {
            synchronized (f34974a) {
                java.lang.Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof java.net.UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (java.lang.Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (android.text.TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + "\n";
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        synchronized (f34974a) {
            a(str2, null);
        }
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        synchronized (f34974a) {
            a(str2, null);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (f34974a) {
            a(str2, th);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        synchronized (f34974a) {
            a(str2, null);
        }
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        synchronized (f34974a) {
            a(str2, null);
        }
    }

    public static void g(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (f34974a) {
            a(str2, th);
        }
    }
}
