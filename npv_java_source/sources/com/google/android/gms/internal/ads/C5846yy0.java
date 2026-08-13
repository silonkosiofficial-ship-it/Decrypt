package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5846yy0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C5846yy0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.ads.Ov0 zzf = com.google.android.gms.internal.ads.Jv0.q();
    private com.google.android.gms.internal.ads.Sv0 zzh = com.google.android.gms.internal.ads.Jv0.v();
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzi = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;

    static {
        com.google.android.gms.internal.ads.C5846yy0 c5846yy0 = new com.google.android.gms.internal.ads.C5846yy0();
        zza = c5846yy0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5846yy0.class, c5846yy0);
    }

    private C5846yy0() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", com.google.android.gms.internal.ads.C5626wy0.class, "zzi"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5846yy0();
        }
        com.google.android.gms.internal.ads.Fy0 fy0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5736xy0(fy0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5846yy0.class) {
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
