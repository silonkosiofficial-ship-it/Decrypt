package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3342c9 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C3342c9 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private long zzd;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzf = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;

    static {
        com.google.android.gms.internal.ads.C3342c9 c3342c9 = new com.google.android.gms.internal.ads.C3342c9();
        zza = c3342c9;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3342c9.class, c3342c9);
    }

    private C3342c9() {
    }

    public static com.google.android.gms.internal.ads.C3342c9 d0() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3342c9();
        }
        com.google.android.gms.internal.ads.AbstractC3891h9 abstractC3891h9 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C3233b9(abstractC3891h9);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3342c9.class) {
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

    public final long b0() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.AbstractC3753fv0 e0() {
        return this.zzf;
    }

    public final java.lang.String f0() {
        return this.zze;
    }

    public final boolean g0() {
        return (this.zzc & 1) != 0;
    }
}
