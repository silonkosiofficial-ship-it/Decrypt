package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class L8 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.L8 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;

    static {
        com.google.android.gms.internal.ads.L8 l10 = new com.google.android.gms.internal.ads.L8();
        zza = l10;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.L8.class, l10);
    }

    private L8() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new java.lang.Object[]{"zzc", "zzd", "zze", com.google.android.gms.internal.ads.X8.f33066a});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.L8();
        }
        com.google.android.gms.internal.ads.AbstractC3891h9 abstractC3891h9 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.K8(abstractC3891h9);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.L8.class) {
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
