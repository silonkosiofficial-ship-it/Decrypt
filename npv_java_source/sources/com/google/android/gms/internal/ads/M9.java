package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class M9 {
    public static final java.lang.String a(android.content.Context context, java.lang.String str, boolean z6) {
        try {
            com.google.android.gms.internal.ads.Y8 y8B0 = com.google.android.gms.internal.ads.Z8.b0();
            y8B0.A(str);
            y8B0.z("1.671910402");
            y8B0.B(context.getPackageName());
            y8B0.C(java.lang.System.currentTimeMillis() / 1000);
            try {
                y8B0.E(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                y8B0.E(-1L);
            }
            com.google.android.gms.internal.ads.C3671f9 c3671f9A = com.google.android.gms.internal.ads.AbstractC5428v9.a(((com.google.android.gms.internal.ads.Z8) y8B0.u()).l(), null);
            c3671f9A.C(5);
            c3671f9A.B(2);
            return android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.C3781g9) c3671f9A.u()).l(), 11);
        } catch (java.io.UnsupportedEncodingException | java.security.GeneralSecurityException unused2) {
            return java.lang.Integer.toString(7);
        }
    }
}
