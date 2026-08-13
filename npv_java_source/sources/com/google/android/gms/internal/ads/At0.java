package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class At0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.At0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.Dt0 zze;

    static {
        com.google.android.gms.internal.ads.At0 at0 = new com.google.android.gms.internal.ads.At0();
        zza = at0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.At0.class, at0);
    }

    private At0() {
    }

    public static com.google.android.gms.internal.ads.C5836yt0 c0() {
        return (com.google.android.gms.internal.ads.C5836yt0) zza.p();
    }

    public static com.google.android.gms.internal.ads.At0 e0(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        return (com.google.android.gms.internal.ads.At0) com.google.android.gms.internal.ads.Jv0.N(zza, abstractC3753fv0, c5730xv0);
    }

    public static com.google.android.gms.internal.ads.InterfaceC5292tw0 g0() {
        return zza.x();
    }

    static /* synthetic */ void h0(com.google.android.gms.internal.ads.At0 at0, com.google.android.gms.internal.ads.Dt0 dt0) {
        dt0.getClass();
        at0.zze = dt0;
        at0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new java.lang.Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.At0();
        }
        com.google.android.gms.internal.ads.AbstractC5946zt0 abstractC5946zt0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5836yt0(abstractC5946zt0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.At0.class) {
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
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.Dt0 f0() {
        com.google.android.gms.internal.ads.Dt0 dt0 = this.zze;
        return dt0 == null ? com.google.android.gms.internal.ads.Dt0.d0() : dt0;
    }
}
