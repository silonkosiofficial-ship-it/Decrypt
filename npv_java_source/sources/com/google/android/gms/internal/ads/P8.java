package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class P8 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.P8 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        com.google.android.gms.internal.ads.P8 p10 = new com.google.android.gms.internal.ads.P8();
        zza = p10;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.P8.class, p10);
    }

    private P8() {
    }

    public static com.google.android.gms.internal.ads.O8 b0() {
        return (com.google.android.gms.internal.ads.O8) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.P8 p10, long j6) {
        p10.zzc |= 32;
        p10.zzi = j6;
    }

    static /* synthetic */ void e0(com.google.android.gms.internal.ads.P8 p10, long j6) {
        p10.zzc |= 4;
        p10.zzf = j6;
    }

    static /* synthetic */ void f0(com.google.android.gms.internal.ads.P8 p10, long j6) {
        p10.zzc |= 1;
        p10.zzd = j6;
    }

    static /* synthetic */ void g0(com.google.android.gms.internal.ads.P8 p10, long j6) {
        p10.zzc |= 8;
        p10.zzg = j6;
    }

    static /* synthetic */ void h0(com.google.android.gms.internal.ads.P8 p10, long j6) {
        p10.zzc |= 16;
        p10.zzh = j6;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.P8();
        }
        com.google.android.gms.internal.ads.AbstractC3891h9 abstractC3891h9 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.O8(abstractC3891h9);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.P8.class) {
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
