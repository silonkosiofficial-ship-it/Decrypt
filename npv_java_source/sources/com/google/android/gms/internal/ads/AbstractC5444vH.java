package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5444vH {
    public static void a(boolean z6, java.lang.String str) throws com.google.android.gms.internal.ads.UG {
        if (!z6) {
            throw new com.google.android.gms.internal.ads.UG(str);
        }
    }

    public static boolean b(android.content.Context context) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        if (i6 < 24) {
            return false;
        }
        if (i6 < 26 && ("samsung".equals(com.google.android.gms.internal.ads.EW.f27063c) || "XT1650".equals(com.google.android.gms.internal.ads.EW.f27064d))) {
            return false;
        }
        if (i6 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return d("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean c() {
        return d("EGL_KHR_surfaceless_context");
    }

    private static boolean d(java.lang.String str) {
        java.lang.String strEglQueryString = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }
}
