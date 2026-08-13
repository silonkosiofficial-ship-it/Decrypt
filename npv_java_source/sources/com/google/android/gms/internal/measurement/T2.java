package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.os.UserManager f40663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f40664b = !a();

    public static boolean a() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b(android.content.Context context) {
        return a() && !d(context);
    }

    public static boolean c(android.content.Context context) {
        return !a() || d(context);
    }

    private static boolean d(android.content.Context context) {
        if (f40664b) {
            return true;
        }
        synchronized (com.google.android.gms.internal.measurement.T2.class) {
            try {
                if (f40664b) {
                    return true;
                }
                boolean zE = e(context);
                if (zE) {
                    f40664b = zE;
                }
                return zE;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private static boolean e(android.content.Context context) {
        boolean z6;
        boolean z10 = true;
        int i6 = 1;
        while (true) {
            z6 = false;
            if (i6 > 2) {
                break;
            }
            if (f40663a == null) {
                f40663a = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
            }
            android.os.UserManager userManager = f40663a;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(android.os.Process.myUserHandle())) {
                    z10 = false;
                }
                z6 = z10;
                break;
            } catch (java.lang.NullPointerException e6) {
                f40663a = null;
                i6++;
            }
        }
        if (z6) {
            f40663a = null;
        }
        return z6;
    }
}
