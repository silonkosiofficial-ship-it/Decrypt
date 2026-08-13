package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class N8 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.N8 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        com.google.android.gms.internal.ads.N8 n10 = new com.google.android.gms.internal.ads.N8();
        zza = n10;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.N8.class, n10);
    }

    private N8() {
    }

    public static com.google.android.gms.internal.ads.M8 b0() {
        return (com.google.android.gms.internal.ads.M8) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.N8 n10) {
        n10.zzc &= -9;
        n10.zzg = -1L;
    }

    static /* synthetic */ void e0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 8;
        n10.zzg = j6;
    }

    static /* synthetic */ void f0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 32;
        n10.zzi = j6;
    }

    static /* synthetic */ void g0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 4096;
        n10.zzp = j6;
    }

    static /* synthetic */ void h0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 512;
        n10.zzm = j6;
    }

    static /* synthetic */ void i0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 2048;
        n10.zzo = j6;
    }

    static /* synthetic */ void j0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 4;
        n10.zzf = j6;
    }

    static /* synthetic */ void k0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 16;
        n10.zzh = j6;
    }

    static /* synthetic */ void l0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 128;
        n10.zzk = j6;
    }

    static /* synthetic */ void m0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 131072;
        n10.zzy = j6;
    }

    static /* synthetic */ void n0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 1;
        n10.zzd = j6;
    }

    static /* synthetic */ void o0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 262144;
        n10.zzz = j6;
    }

    static /* synthetic */ void p0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 2;
        n10.zze = j6;
    }

    static /* synthetic */ void q0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 256;
        n10.zzl = j6;
    }

    static /* synthetic */ void r0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 32768;
        n10.zzw = j6;
    }

    static /* synthetic */ void s0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 65536;
        n10.zzx = j6;
    }

    static /* synthetic */ void t0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 8192;
        n10.zzu = j6;
    }

    static /* synthetic */ void u0(com.google.android.gms.internal.ads.N8 n10, long j6) {
        n10.zzc |= 16384;
        n10.zzv = j6;
    }

    static /* synthetic */ void v0(com.google.android.gms.internal.ads.N8 n10, int i6) {
        n10.zzn = i6 - 1;
        n10.zzc |= 1024;
    }

    static /* synthetic */ void w0(com.google.android.gms.internal.ads.N8 n10, int i6) {
        n10.zzj = i6 - 1;
        n10.zzc |= 64;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            com.google.android.gms.internal.ads.Nv0 nv0 = com.google.android.gms.internal.ads.X8.f33066a;
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", nv0, "zzk", "zzl", "zzm", "zzn", nv0, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.N8();
        }
        com.google.android.gms.internal.ads.AbstractC3891h9 abstractC3891h9 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.M8(abstractC3891h9);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.N8.class) {
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
