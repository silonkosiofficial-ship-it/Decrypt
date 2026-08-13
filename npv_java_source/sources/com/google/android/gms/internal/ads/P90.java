package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P90 {
    public static void a(P4.d dVar, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90) {
        g(dVar, q90, e90, false);
    }

    public static void b(P4.d dVar, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90) {
        g(dVar, q90, e90, true);
    }

    public static void c(P4.d dVar, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(dVar), new com.google.android.gms.internal.ads.O90(q90, e90), com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
        }
    }

    public static void d(P4.d dVar, com.google.android.gms.internal.ads.E90 e90) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(dVar), new com.google.android.gms.internal.ads.M90(e90), com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
        }
    }

    public static boolean e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return java.util.regex.Pattern.matches((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25303I8), str);
    }

    public static int f(com.google.android.gms.internal.ads.C4546n70 c4546n70) {
        int iF = B3.AbstractC0797c.f(c4546n70) - 1;
        return (iF == 0 || iF == 1) ? 7 : 23;
    }

    private static void g(P4.d dVar, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90, boolean z6) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(dVar), new com.google.android.gms.internal.ads.N90(q90, e90, z6), com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
        }
    }
}
