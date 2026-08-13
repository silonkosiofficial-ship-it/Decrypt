package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2748Qd extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final com.google.android.gms.internal.ads.C2748Qd zzc;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.ads.C2748Qd c2748Qd = new com.google.android.gms.internal.ads.C2748Qd();
        zzc = c2748Qd;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2748Qd.class, c2748Qd);
    }

    private C2748Qd() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new java.lang.Object[]{"zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2748Qd();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C2711Pd();
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzd;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2748Qd.class) {
                try {
                    gv0 = zzd;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzc);
                        zzd = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
