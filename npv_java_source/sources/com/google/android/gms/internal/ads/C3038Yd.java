package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3038Yd extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final com.google.android.gms.internal.ads.C3038Yd zzd;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        com.google.android.gms.internal.ads.C3038Yd c3038Yd = new com.google.android.gms.internal.ads.C3038Yd();
        zzd = c3038Yd;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3038Yd.class, c3038Yd);
    }

    private C3038Yd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i6) {
        this.zzf |= 1;
        this.zzg = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i6) {
        this.zzf |= 4;
        this.zzi = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i6) {
        this.zzf |= 2;
        this.zzh = i6;
    }

    public static com.google.android.gms.internal.ads.C3002Xd h0() {
        return (com.google.android.gms.internal.ads.C3002Xd) zzd.p();
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new java.lang.Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3038Yd();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C3002Xd();
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zze;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3038Yd.class) {
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
