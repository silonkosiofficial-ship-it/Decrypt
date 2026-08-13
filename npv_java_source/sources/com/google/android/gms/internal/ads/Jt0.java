package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Jt0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.Jt0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private java.lang.String zzd = "";
    private com.google.android.gms.internal.ads.C4187jt0 zze;

    static {
        com.google.android.gms.internal.ads.Jt0 jt0 = new com.google.android.gms.internal.ads.Jt0();
        zza = jt0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.Jt0.class, jt0);
    }

    private Jt0() {
    }

    public static com.google.android.gms.internal.ads.Ht0 c0() {
        return (com.google.android.gms.internal.ads.Ht0) zza.p();
    }

    public static com.google.android.gms.internal.ads.Jt0 e0() {
        return zza;
    }

    public static com.google.android.gms.internal.ads.Jt0 f0(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        return (com.google.android.gms.internal.ads.Jt0) com.google.android.gms.internal.ads.Jv0.N(zza, abstractC3753fv0, c5730xv0);
    }

    static /* synthetic */ void h0(com.google.android.gms.internal.ads.Jt0 jt0, com.google.android.gms.internal.ads.C4187jt0 c4187jt0) {
        c4187jt0.getClass();
        jt0.zze = c4187jt0;
        jt0.zzc |= 1;
    }

    static /* synthetic */ void i0(com.google.android.gms.internal.ads.Jt0 jt0, java.lang.String str) {
        str.getClass();
        jt0.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new java.lang.Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.Jt0();
        }
        com.google.android.gms.internal.ads.It0 it0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.Ht0(it0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.Jt0.class) {
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

    public final com.google.android.gms.internal.ads.C4187jt0 b0() {
        com.google.android.gms.internal.ads.C4187jt0 c4187jt0 = this.zze;
        return c4187jt0 == null ? com.google.android.gms.internal.ads.C4187jt0.d0() : c4187jt0;
    }

    public final java.lang.String g0() {
        return this.zzd;
    }
}
