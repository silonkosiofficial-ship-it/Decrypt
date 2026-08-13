package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.au0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3203au0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C3203au0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzd = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;

    static {
        com.google.android.gms.internal.ads.C3203au0 c3203au0 = new com.google.android.gms.internal.ads.C3203au0();
        zza = c3203au0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3203au0.class, c3203au0);
    }

    private C3203au0() {
    }

    public static com.google.android.gms.internal.ads.Yt0 c0() {
        return (com.google.android.gms.internal.ads.Yt0) zza.p();
    }

    public static com.google.android.gms.internal.ads.C3203au0 e0(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        return (com.google.android.gms.internal.ads.C3203au0) com.google.android.gms.internal.ads.Jv0.N(zza, abstractC3753fv0, c5730xv0);
    }

    public static com.google.android.gms.internal.ads.InterfaceC5292tw0 g0() {
        return zza.x();
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new java.lang.Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3203au0();
        }
        com.google.android.gms.internal.ads.Zt0 zt0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.Yt0(zt0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3203au0.class) {
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
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.AbstractC3753fv0 f0() {
        return this.zzd;
    }
}
