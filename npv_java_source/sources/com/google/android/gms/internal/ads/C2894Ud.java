package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2894Ud extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final com.google.android.gms.internal.ads.C2894Ud zzd;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zze;
    private int zzf;
    private java.lang.String zzg = "";
    private int zzh;
    private com.google.android.gms.internal.ads.C2966Wd zzi;

    static {
        com.google.android.gms.internal.ads.C2894Ud c2894Ud = new com.google.android.gms.internal.ads.C2894Ud();
        zzd = c2894Ud;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2894Ud.class, c2894Ud);
    }

    private C2894Ud() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new java.lang.Object[]{"zzf", "zzg", "zzh", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzi"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2894Ud();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C2858Td();
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zze;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2894Ud.class) {
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
