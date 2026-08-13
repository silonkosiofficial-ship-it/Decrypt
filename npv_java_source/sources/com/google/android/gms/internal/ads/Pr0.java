package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Pr0 implements com.google.android.gms.internal.ads.Rl0 {
    private Pr0(com.google.android.gms.internal.ads.Rl0 rl0, com.google.android.gms.internal.ads.Kt0 kt0, byte[] bArr) {
    }

    public static com.google.android.gms.internal.ads.Rl0 a(com.google.android.gms.internal.ads.C5828yp0 c5828yp0) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Lu0 lu0B;
        com.google.android.gms.internal.ads.C5720xq0 c5720xq0A = c5828yp0.a(com.google.android.gms.internal.ads.Dl0.a());
        com.google.android.gms.internal.ads.C3420ct0 c3420ct0B0 = com.google.android.gms.internal.ads.C3749ft0.b0();
        c3420ct0B0.A(c5720xq0A.g());
        c3420ct0B0.B(c5720xq0A.d());
        c3420ct0B0.z(c5720xq0A.b());
        com.google.android.gms.internal.ads.Rl0 rl0 = (com.google.android.gms.internal.ads.Rl0) com.google.android.gms.internal.ads.Vl0.b((com.google.android.gms.internal.ads.C3749ft0) c3420ct0B0.u(), com.google.android.gms.internal.ads.Rl0.class);
        com.google.android.gms.internal.ads.Kt0 kt0C = c5720xq0A.c();
        int iOrdinal = kt0C.ordinal();
        if (iOrdinal == 1) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.b(c5828yp0.b().intValue());
        } else if (iOrdinal == 2) {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.a(c5828yp0.b().intValue());
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("unknown output prefix type");
            }
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.a(c5828yp0.b().intValue());
        } else {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.f34152a;
        }
        return new com.google.android.gms.internal.ads.Pr0(rl0, kt0C, lu0B.c());
    }
}
