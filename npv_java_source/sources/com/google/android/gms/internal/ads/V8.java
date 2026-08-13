package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class V8 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.V8 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzd;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zze;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzf;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzg;

    static {
        com.google.android.gms.internal.ads.V8 v10 = new com.google.android.gms.internal.ads.V8();
        zza = v10;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.V8.class, v10);
    }

    private V8() {
        com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
        this.zzd = abstractC3753fv0;
        this.zze = abstractC3753fv0;
        this.zzf = abstractC3753fv0;
        this.zzg = abstractC3753fv0;
    }

    public static com.google.android.gms.internal.ads.U8 b0() {
        return (com.google.android.gms.internal.ads.U8) zza.p();
    }

    public static com.google.android.gms.internal.ads.V8 d0(byte[] bArr, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        return (com.google.android.gms.internal.ads.V8) com.google.android.gms.internal.ads.Jv0.Q(zza, bArr, c5730xv0);
    }

    static /* synthetic */ void i0(com.google.android.gms.internal.ads.V8 v10, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        v10.zzc |= 1;
        v10.zzd = abstractC3753fv0;
    }

    static /* synthetic */ void j0(com.google.android.gms.internal.ads.V8 v10, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        v10.zzc |= 2;
        v10.zze = abstractC3753fv0;
    }

    static /* synthetic */ void k0(com.google.android.gms.internal.ads.V8 v10, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        v10.zzc |= 8;
        v10.zzg = abstractC3753fv0;
    }

    static /* synthetic */ void l0(com.google.android.gms.internal.ads.V8 v10, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        v10.zzc |= 4;
        v10.zzf = abstractC3753fv0;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.V8();
        }
        com.google.android.gms.internal.ads.AbstractC3891h9 abstractC3891h9 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.U8(abstractC3891h9);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.V8.class) {
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

    public final com.google.android.gms.internal.ads.AbstractC3753fv0 e0() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.AbstractC3753fv0 f0() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.AbstractC3753fv0 g0() {
        return this.zzg;
    }

    public final com.google.android.gms.internal.ads.AbstractC3753fv0 h0() {
        return this.zzf;
    }
}
