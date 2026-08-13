package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5805ye extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final com.google.android.gms.internal.ads.C5805ye zzg;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzh;
    private int zzi;
    private int zzj = 1000;
    private com.google.android.gms.internal.ads.C3828ge zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;

    static {
        com.google.android.gms.internal.ads.C5805ye c5805ye = new com.google.android.gms.internal.ads.C5805ye();
        zzg = c5805ye;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5805ye.class, c5805ye);
    }

    private C5805ye() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new java.lang.Object[]{"zzi", "zzj", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5805ye();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5695xe();
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzh;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5805ye.class) {
                try {
                    gv0 = zzh;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzg);
                        zzh = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
