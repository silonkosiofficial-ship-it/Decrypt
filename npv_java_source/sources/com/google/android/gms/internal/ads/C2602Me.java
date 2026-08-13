package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2602Me extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final com.google.android.gms.internal.ads.C2602Me zzf;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzg;
    private int zzh;
    private java.lang.String zzi = "";
    private com.google.android.gms.internal.ads.Sv0 zzj = com.google.android.gms.internal.ads.Jv0.v();
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        com.google.android.gms.internal.ads.C2602Me c2602Me = new com.google.android.gms.internal.ads.C2602Me();
        zzf = c2602Me;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2602Me.class, c2602Me);
    }

    private C2602Me() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(java.lang.String str) {
        str.getClass();
        this.zzh |= 1;
        this.zzi = str;
    }

    public static com.google.android.gms.internal.ads.C2602Me e0() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new java.lang.Object[]{"zzh", "zzi", "zzj", com.google.android.gms.internal.ads.C2455Ie.class, "zzk", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzl", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzm", com.google.android.gms.internal.ads.EnumC2932Ve.g()});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2602Me();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C2566Le();
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzg;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2602Me.class) {
                try {
                    gv0 = zzg;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzf);
                        zzg = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
