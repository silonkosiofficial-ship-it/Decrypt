package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5365ue extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final com.google.android.gms.internal.ads.C5365ue zzf;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzg;
    private int zzh;
    private int zzi = 1000;
    private com.google.android.gms.internal.ads.C3828ge zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        com.google.android.gms.internal.ads.C5365ue c5365ue = new com.google.android.gms.internal.ads.C5365ue();
        zzf = c5365ue;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5365ue.class, c5365ue);
    }

    private C5365ue() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new java.lang.Object[]{"zzh", "zzi", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5365ue();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5255te();
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzg;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5365ue.class) {
                try {
                    gv0 = zzg;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzf);
                        zzg = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
