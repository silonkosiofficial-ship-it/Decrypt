package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3828ge extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    private static final com.google.android.gms.internal.ads.C3828ge zzb;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzc;
    private int zzd;
    private int zze;

    static {
        com.google.android.gms.internal.ads.C3828ge c3828ge = new com.google.android.gms.internal.ads.C3828ge();
        zzb = c3828ge;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3828ge.class, c3828ge);
    }

    private C3828ge() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.ads.EnumC3608ee.g()});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3828ge();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C3499de();
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzc;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3828ge.class) {
                try {
                    gv0 = zzc;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzb);
                        zzc = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
