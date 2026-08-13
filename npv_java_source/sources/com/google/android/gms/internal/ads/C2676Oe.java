package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2676Oe extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final com.google.android.gms.internal.ads.C2676Oe zzg;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzh;
    private int zzi;
    private int zzj;
    private com.google.android.gms.internal.ads.C2966Wd zzk;
    private com.google.android.gms.internal.ads.C2966Wd zzl;
    private com.google.android.gms.internal.ads.C2966Wd zzm;
    private com.google.android.gms.internal.ads.Sv0 zzn = com.google.android.gms.internal.ads.Jv0.v();
    private int zzo;

    static {
        com.google.android.gms.internal.ads.C2676Oe c2676Oe = new com.google.android.gms.internal.ads.C2676Oe();
        zzg = c2676Oe;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2676Oe.class, c2676Oe);
    }

    private C2676Oe() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new java.lang.Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", com.google.android.gms.internal.ads.C2966Wd.class, "zzo"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2676Oe();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C2639Ne();
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzh;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2676Oe.class) {
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
