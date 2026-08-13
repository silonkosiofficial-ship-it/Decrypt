package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Yl0 {
    public static com.google.android.gms.internal.ads.Sl0 a(byte[] bArr) throws java.security.GeneralSecurityException {
        try {
            com.google.android.gms.internal.ads.C4187jt0 c4187jt0E0 = com.google.android.gms.internal.ads.C4187jt0.e0(bArr, com.google.android.gms.internal.ads.C5730xv0.a());
            com.google.android.gms.internal.ads.Zp0 zp0C = com.google.android.gms.internal.ads.Zp0.c();
            com.google.android.gms.internal.ads.C5830yq0 c5830yq0A = com.google.android.gms.internal.ads.C5830yq0.a(c4187jt0E0);
            return !zp0C.k(c5830yq0A) ? new com.google.android.gms.internal.ads.C5938zp0(c5830yq0A) : zp0C.b(c5830yq0A);
        } catch (java.io.IOException e6) {
            throw new java.security.GeneralSecurityException("Failed to parse proto", e6);
        }
    }

    public static byte[] b(com.google.android.gms.internal.ads.Sl0 sl0) {
        return ((com.google.android.gms.internal.ads.C5830yq0) com.google.android.gms.internal.ads.Zp0.c().e(sl0, com.google.android.gms.internal.ads.C5830yq0.class)).c().l();
    }
}
