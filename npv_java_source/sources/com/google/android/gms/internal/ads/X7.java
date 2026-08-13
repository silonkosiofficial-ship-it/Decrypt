package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class X7 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.X7 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private com.google.android.gms.internal.ads.C4767p8 zzi;
    private com.google.android.gms.internal.ads.C5206t8 zzj;
    private boolean zzk;
    private boolean zze = true;
    private java.lang.String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        com.google.android.gms.internal.ads.X7 x10 = new com.google.android.gms.internal.ads.X7();
        zza = x10;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.X7.class, x10);
    }

    private X7() {
    }

    public static com.google.android.gms.internal.ads.V7 b0() {
        return (com.google.android.gms.internal.ads.V7) zza.p();
    }

    static /* synthetic */ void g0(com.google.android.gms.internal.ads.X7 x10, boolean z6) {
        x10.zzc |= 8;
        x10.zzg = z6;
    }

    static /* synthetic */ void h0(com.google.android.gms.internal.ads.X7 x10, java.lang.String str) {
        str.getClass();
        x10.zzc |= 4;
        x10.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.Y7.f33288a, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.X7();
        }
        com.google.android.gms.internal.ads.W7 w10 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.V7(w10);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.X7.class) {
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

    public final com.google.android.gms.internal.ads.C4767p8 d0() {
        com.google.android.gms.internal.ads.C4767p8 c4767p8 = this.zzi;
        return c4767p8 == null ? com.google.android.gms.internal.ads.C4767p8.d0() : c4767p8;
    }

    public final com.google.android.gms.internal.ads.C5206t8 e0() {
        com.google.android.gms.internal.ads.C5206t8 c5206t8 = this.zzj;
        return c5206t8 == null ? com.google.android.gms.internal.ads.C5206t8.c0() : c5206t8;
    }

    public final java.lang.String f0() {
        return this.zzf;
    }

    public final boolean i0() {
        return this.zzg;
    }
}
