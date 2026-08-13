package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2750Qe extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final com.google.android.gms.internal.ads.C2750Qe zzi;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzj;
    private int zzk;
    private com.google.android.gms.internal.ads.C2966Wd zzm;
    private int zzn;
    private com.google.android.gms.internal.ads.C3038Yd zzo;
    private int zzp;
    private java.lang.String zzl = "";
    private int zzu = 1000;
    private int zzv = 1000;
    private int zzw = 1000;

    static {
        com.google.android.gms.internal.ads.C2750Qe c2750Qe = new com.google.android.gms.internal.ads.C2750Qe();
        zzi = c2750Qe;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2750Qe.class, c2750Qe);
    }

    private C2750Qe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(java.lang.String str) {
        str.getClass();
        this.zzk |= 1;
        this.zzl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(com.google.android.gms.internal.ads.C3038Yd c3038Yd) {
        c3038Yd.getClass();
        this.zzo = c3038Yd;
        this.zzk |= 8;
    }

    public static com.google.android.gms.internal.ads.C2750Qe g0() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new java.lang.Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzv", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzw", com.google.android.gms.internal.ads.EnumC2932Ve.g()});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2750Qe();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C2713Pe();
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzj;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2750Qe.class) {
                try {
                    gv0 = zzj;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzi);
                        zzj = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
