package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Sx0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.Sx0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        com.google.android.gms.internal.ads.Sx0 sx0 = new com.google.android.gms.internal.ads.Sx0();
        zza = sx0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.Sx0.class, sx0);
    }

    private Sx0() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            com.google.android.gms.internal.ads.Nv0 nv0 = com.google.android.gms.internal.ads.Qx0.f31091a;
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new java.lang.Object[]{"zzc", "zzd", nv0, "zze", "zzf", nv0});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.Sx0();
        }
        com.google.android.gms.internal.ads.Fy0 fy0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.Rx0(fy0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.Sx0.class) {
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
