package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2896Ue extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final com.google.android.gms.internal.ads.C2896Ue zze;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzf;
    private int zzg;
    private int zzh;
    private com.google.android.gms.internal.ads.C3038Yd zzi;
    private java.lang.String zzj = "";
    private java.lang.String zzk = "";

    static {
        com.google.android.gms.internal.ads.C2896Ue c2896Ue = new com.google.android.gms.internal.ads.C2896Ue();
        zze = c2896Ue;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2896Ue.class, c2896Ue);
    }

    private C2896Ue() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zze, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new java.lang.Object[]{"zzg", "zzh", com.google.android.gms.internal.ads.EnumC2824Se.g(), "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2896Ue();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C2787Re();
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzf;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2896Ue.class) {
                try {
                    gv0 = zzf;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zze);
                        zzf = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
