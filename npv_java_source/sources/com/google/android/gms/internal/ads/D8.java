package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class D8 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.D8 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;
    private int zzf = 1000;

    static {
        com.google.android.gms.internal.ads.D8 d10 = new com.google.android.gms.internal.ads.D8();
        zza = d10;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.D8.class, d10);
    }

    private D8() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            com.google.android.gms.internal.ads.Nv0 nv0 = com.google.android.gms.internal.ads.X8.f33066a;
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new java.lang.Object[]{"zzc", "zzd", "zze", nv0, "zzf", nv0});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.D8();
        }
        com.google.android.gms.internal.ads.AbstractC3891h9 abstractC3891h9 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C8(abstractC3891h9);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.D8.class) {
                try {
                    gv0 = zzb;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zza);
                        zzb = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
