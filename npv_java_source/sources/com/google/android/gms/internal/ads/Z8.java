package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Z8 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.Z8 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private long zzf;
    private long zzh;
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private java.lang.String zzg = "D";

    static {
        com.google.android.gms.internal.ads.Z8 z10 = new com.google.android.gms.internal.ads.Z8();
        zza = z10;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.Z8.class, z10);
    }

    private Z8() {
    }

    public static com.google.android.gms.internal.ads.Y8 b0() {
        return (com.google.android.gms.internal.ads.Y8) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.Z8 z10, java.lang.String str) {
        z10.zzc |= 1;
        z10.zzd = "1.671910402";
    }

    static /* synthetic */ void e0(com.google.android.gms.internal.ads.Z8 z10, java.lang.String str) {
        str.getClass();
        z10.zzc |= 2;
        z10.zze = str;
    }

    static /* synthetic */ void f0(com.google.android.gms.internal.ads.Z8 z10, java.lang.String str) {
        str.getClass();
        z10.zzc |= 8;
        z10.zzg = str;
    }

    static /* synthetic */ void g0(com.google.android.gms.internal.ads.Z8 z10, long j6) {
        z10.zzc |= 4;
        z10.zzf = j6;
    }

    static /* synthetic */ void h0(com.google.android.gms.internal.ads.Z8 z10, long j6) {
        z10.zzc |= 16;
        z10.zzh = j6;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.Z8();
        }
        com.google.android.gms.internal.ads.AbstractC3891h9 abstractC3891h9 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.Y8(abstractC3891h9);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.Z8.class) {
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
