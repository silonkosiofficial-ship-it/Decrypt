package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5799yb extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C5799yb zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.C2190Bb zzd;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zze;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzf;

    static {
        com.google.android.gms.internal.ads.C5799yb c5799yb = new com.google.android.gms.internal.ads.C5799yb();
        zza = c5799yb;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5799yb.class, c5799yb);
    }

    private C5799yb() {
        com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
        this.zze = abstractC3753fv0;
        this.zzf = abstractC3753fv0;
    }

    public static com.google.android.gms.internal.ads.C5799yb c0(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        return (com.google.android.gms.internal.ads.C5799yb) com.google.android.gms.internal.ads.Jv0.N(zza, abstractC3753fv0, c5730xv0);
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5799yb();
        }
        com.google.android.gms.internal.ads.AbstractC5689xb abstractC5689xb = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5579wb(abstractC5689xb);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5799yb.class) {
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

    public final com.google.android.gms.internal.ads.C2190Bb d0() {
        com.google.android.gms.internal.ads.C2190Bb c2190Bb = this.zzd;
        return c2190Bb == null ? com.google.android.gms.internal.ads.C2190Bb.g0() : c2190Bb;
    }

    public final com.google.android.gms.internal.ads.AbstractC3753fv0 e0() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.AbstractC3753fv0 f0() {
        return this.zze;
    }
}
