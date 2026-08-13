package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4266ke extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final com.google.android.gms.internal.ads.C4266ke zzd;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zze;
    private int zzf;
    private int zzg;
    private com.google.android.gms.internal.ads.C4816pe zzh;
    private com.google.android.gms.internal.ads.C5035re zzi;

    static {
        com.google.android.gms.internal.ads.C4266ke c4266ke = new com.google.android.gms.internal.ads.C4266ke();
        zzd = c4266ke;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C4266ke.class, c4266ke);
    }

    private C4266ke() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(com.google.android.gms.internal.ads.EnumC4486me enumC4486me) {
        this.zzg = enumC4486me.a();
        this.zzf |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(com.google.android.gms.internal.ads.C4816pe c4816pe) {
        c4816pe.getClass();
        this.zzh = c4816pe;
        this.zzf |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(com.google.android.gms.internal.ads.C5035re c5035re) {
        c5035re.getClass();
        this.zzi = c5035re;
        this.zzf |= 4;
    }

    public static com.google.android.gms.internal.ads.C4156je h0() {
        return (com.google.android.gms.internal.ads.C4156je) zzd.p();
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new java.lang.Object[]{"zzf", "zzg", com.google.android.gms.internal.ads.EnumC4486me.g(), "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C4266ke();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C4156je();
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zze;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C4266ke.class) {
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
