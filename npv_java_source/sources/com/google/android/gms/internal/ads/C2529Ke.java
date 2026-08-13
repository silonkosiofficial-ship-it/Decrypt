package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2529Ke extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final com.google.android.gms.internal.ads.C2529Ke zzd;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zze;
    private int zzf;
    private java.lang.String zzg = "";
    private com.google.android.gms.internal.ads.Sv0 zzh = com.google.android.gms.internal.ads.Jv0.v();
    private int zzi;

    static {
        com.google.android.gms.internal.ads.C2529Ke c2529Ke = new com.google.android.gms.internal.ads.C2529Ke();
        zzd = c2529Ke;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2529Ke.class, c2529Ke);
    }

    private C2529Ke() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new java.lang.Object[]{"zzf", "zzg", "zzh", com.google.android.gms.internal.ads.C2455Ie.class, "zzi", com.google.android.gms.internal.ads.EnumC2932Ve.g()});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2529Ke();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C2492Je();
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zze;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2529Ke.class) {
                try {
                    gv0 = zze;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzd);
                        zze = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
