package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ys0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.Ys0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.C3311bt0 zzd;
    private int zze;
    private int zzf;

    static {
        com.google.android.gms.internal.ads.Ys0 ys0 = new com.google.android.gms.internal.ads.Ys0();
        zza = ys0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.Ys0.class, ys0);
    }

    private Ys0() {
    }

    public static com.google.android.gms.internal.ads.Ws0 d0() {
        return (com.google.android.gms.internal.ads.Ws0) zza.p();
    }

    public static com.google.android.gms.internal.ads.Ys0 f0() {
        return zza;
    }

    public static com.google.android.gms.internal.ads.Ys0 g0(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        return (com.google.android.gms.internal.ads.Ys0) com.google.android.gms.internal.ads.Jv0.N(zza, abstractC3753fv0, c5730xv0);
    }

    static /* synthetic */ void j0(com.google.android.gms.internal.ads.Ys0 ys0, com.google.android.gms.internal.ads.C3311bt0 c3311bt0) {
        c3311bt0.getClass();
        ys0.zzd = c3311bt0;
        ys0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.Ys0();
        }
        com.google.android.gms.internal.ads.Xs0 xs0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.Ws0(xs0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.Ys0.class) {
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

    public final int b0() {
        return this.zze;
    }

    public final int c0() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.C3311bt0 h0() {
        com.google.android.gms.internal.ads.C3311bt0 c3311bt0 = this.zzd;
        return c3311bt0 == null ? com.google.android.gms.internal.ads.C3311bt0.f0() : c3311bt0;
    }
}
