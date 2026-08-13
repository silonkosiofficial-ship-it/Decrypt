package p224w3;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final com.google.android.gms.internal.ads.C2755Qg0 f56258a = com.google.android.gms.internal.ads.C2755Qg0.a(4000);

    static java.lang.String a(java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    public static void b(java.lang.String str) {
        if (!j(3) || str.length() <= 4000) {
            return;
        }
        boolean z6 = true;
        for (java.lang.String str2 : f56258a.d(str)) {
            if (z6) {
            }
            z6 = false;
        }
    }

    public static void c(java.lang.String str, java.lang.Throwable th) {
        if (j(3)) {
        }
    }

    public static void d(java.lang.String str) {
        if (!j(6) || str == null || str.length() <= 4000) {
            return;
        }
        boolean z6 = true;
        for (java.lang.String str2 : f56258a.d(str)) {
            if (z6) {
            }
            z6 = false;
        }
    }

    public static void e(java.lang.String str, java.lang.Throwable th) {
        if (j(6)) {
        }
    }

    public static void f(java.lang.String str) {
        if (!j(4) || str == null || str.length() <= 4000) {
            return;
        }
        boolean z6 = true;
        for (java.lang.String str2 : f56258a.d(str)) {
            if (z6) {
            }
            z6 = false;
        }
    }

    public static void g(java.lang.String str) {
        if (!j(5) || str == null || str.length() <= 4000) {
            return;
        }
        boolean z6 = true;
        for (java.lang.String str2 : f56258a.d(str)) {
            if (z6) {
            }
            z6 = false;
        }
    }

    public static void h(java.lang.String str, java.lang.Throwable th) {
        if (j(5)) {
        }
    }

    public static void i(java.lang.String str, java.lang.Throwable th) {
        if (j(5)) {
            java.lang.String strA = a(str);
            if (th != null) {
                h(strA, th);
            } else {
                g(strA);
            }
        }
    }

    public static boolean j(int i6) {
        return i6 >= 5 || android.util.Log.isLoggable("Ads", i6);
    }
}
