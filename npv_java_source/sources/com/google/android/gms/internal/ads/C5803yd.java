package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5803yd extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private static final com.google.android.gms.internal.ads.C5803yd zzl;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzm;
    private com.google.android.gms.internal.ads.C3391cf zzA;
    private com.google.android.gms.internal.ads.C3610ef zzB;
    private int zzn;
    private int zzo;
    private com.google.android.gms.internal.ads.C2529Ke zzu;
    private com.google.android.gms.internal.ads.C2602Me zzv;
    private com.google.android.gms.internal.ads.C2676Oe zzx;
    private com.google.android.gms.internal.ads.C2674Od zzy;
    private com.google.android.gms.internal.ads.C2379Gd zzz;
    private int zzp = 1000;
    private com.google.android.gms.internal.ads.Sv0 zzw = com.google.android.gms.internal.ads.Jv0.v();
    private com.google.android.gms.internal.ads.Sv0 zzC = com.google.android.gms.internal.ads.Jv0.v();

    static {
        com.google.android.gms.internal.ads.C5803yd c5803yd = new com.google.android.gms.internal.ads.C5803yd();
        zzl = c5803yd;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5803yd.class, c5803yd);
    }

    private C5803yd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(com.google.android.gms.internal.ads.EnumC5473vd enumC5473vd) {
        this.zzo = enumC5473vd.a();
        this.zzn |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(com.google.android.gms.internal.ads.C2602Me c2602Me) {
        c2602Me.getClass();
        this.zzv = c2602Me;
        this.zzn |= 8;
    }

    public static com.google.android.gms.internal.ads.C5803yd h0() {
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzl, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new java.lang.Object[]{"zzn", "zzo", com.google.android.gms.internal.ads.EnumC5473vd.g(), "zzp", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzu", "zzv", "zzw", com.google.android.gms.internal.ads.C2455Ie.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", com.google.android.gms.internal.ads.C3170ae.class});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5803yd();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5693xd();
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzm;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5803yd.class) {
                try {
                    gv0 = zzm;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzl);
                        zzm = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }

    public com.google.android.gms.internal.ads.C2602Me d0() {
        com.google.android.gms.internal.ads.C2602Me c2602Me = this.zzv;
        return c2602Me == null ? com.google.android.gms.internal.ads.C2602Me.e0() : c2602Me;
    }
}
