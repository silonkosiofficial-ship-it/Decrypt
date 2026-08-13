package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Tt0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.Tt0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.Xt0 zze;

    static {
        com.google.android.gms.internal.ads.Tt0 tt0 = new com.google.android.gms.internal.ads.Tt0();
        zza = tt0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.Tt0.class, tt0);
    }

    private Tt0() {
    }

    public static com.google.android.gms.internal.ads.Rt0 c0() {
        return (com.google.android.gms.internal.ads.Rt0) zza.p();
    }

    public static com.google.android.gms.internal.ads.Tt0 e0(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        return (com.google.android.gms.internal.ads.Tt0) com.google.android.gms.internal.ads.Jv0.N(zza, abstractC3753fv0, c5730xv0);
    }

    static /* synthetic */ void g0(com.google.android.gms.internal.ads.Tt0 tt0, com.google.android.gms.internal.ads.Xt0 xt0) {
        xt0.getClass();
        tt0.zze = xt0;
        tt0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new java.lang.Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.Tt0();
        }
        com.google.android.gms.internal.ads.St0 st0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.Rt0(st0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.Tt0.class) {
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

    public final com.google.android.gms.internal.ads.Xt0 f0() {
        com.google.android.gms.internal.ads.Xt0 xt0 = this.zze;
        return xt0 == null ? com.google.android.gms.internal.ads.Xt0.e0() : xt0;
    }
}
