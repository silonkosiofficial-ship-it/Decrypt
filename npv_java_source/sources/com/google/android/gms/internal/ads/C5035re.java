package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5035re extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final com.google.android.gms.internal.ads.C5035re zzd;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        com.google.android.gms.internal.ads.C5035re c5035re = new com.google.android.gms.internal.ads.C5035re();
        zzd = c5035re;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5035re.class, c5035re);
    }

    private C5035re() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(boolean z6) {
        this.zzf |= 1;
        this.zzg = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(boolean z6) {
        this.zzf |= 2;
        this.zzh = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i6) {
        this.zzf |= 4;
        this.zzi = i6;
    }

    public static com.google.android.gms.internal.ads.C4926qe h0() {
        return (com.google.android.gms.internal.ads.C4926qe) zzd.p();
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new java.lang.Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5035re();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C4926qe();
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zze;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5035re.class) {
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
