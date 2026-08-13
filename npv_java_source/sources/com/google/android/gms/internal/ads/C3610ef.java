package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3610ef extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final com.google.android.gms.internal.ads.C3610ef zze;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzf;
    private int zzg;
    private com.google.android.gms.internal.ads.C3172af zzh;
    private com.google.android.gms.internal.ads.Sv0 zzi = com.google.android.gms.internal.ads.Jv0.v();
    private int zzj;
    private com.google.android.gms.internal.ads.C2966Wd zzk;

    static {
        com.google.android.gms.internal.ads.C3610ef c3610ef = new com.google.android.gms.internal.ads.C3610ef();
        zze = c3610ef;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3610ef.class, c3610ef);
    }

    private C3610ef() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new java.lang.Object[]{"zzg", "zzh", "zzi", com.google.android.gms.internal.ads.C2894Ud.class, "zzj", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzk"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3610ef();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C3501df();
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzf;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3610ef.class) {
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
