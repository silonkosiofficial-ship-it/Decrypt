package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3040Ye extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private static final com.google.android.gms.internal.ads.C3040Ye zzn;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzo;
    private com.google.android.gms.internal.ads.C2750Qe zzA;
    private com.google.android.gms.internal.ads.C2896Ue zzB;
    private com.google.android.gms.internal.ads.C2305Ed zzC;
    private com.google.android.gms.internal.ads.C5803yd zzD;
    private com.google.android.gms.internal.ads.C2600Md zzE;
    private com.google.android.gms.internal.ads.C2307Ee zzF;
    private com.google.android.gms.internal.ads.C5145se zzG;
    private int zzp;
    private int zzu;
    private int zzw;
    private com.google.android.gms.internal.ads.C3038Yd zzy;
    private java.lang.String zzv = "";
    private int zzx = 1000;
    private com.google.android.gms.internal.ads.Rv0 zzz = com.google.android.gms.internal.ads.Jv0.t();

    static {
        com.google.android.gms.internal.ads.C3040Ye c3040Ye = new com.google.android.gms.internal.ads.C3040Ye();
        zzn = c3040Ye;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3040Ye.class, c3040Ye);
    }

    private C3040Ye() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(java.lang.Iterable iterable) {
        p0();
        com.google.android.gms.internal.ads.Ou0.i(iterable, this.zzz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(java.lang.String str) {
        str.getClass();
        this.zzp |= 2;
        this.zzv = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(com.google.android.gms.internal.ads.C2600Md c2600Md) {
        c2600Md.getClass();
        this.zzE = c2600Md;
        this.zzp |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(com.google.android.gms.internal.ads.C2307Ee c2307Ee) {
        c2307Ee.getClass();
        this.zzF = c2307Ee;
        this.zzp |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        this.zzz = com.google.android.gms.internal.ads.Jv0.t();
    }

    private void p0() {
        com.google.android.gms.internal.ads.Rv0 rv0 = this.zzz;
        if (rv0.c()) {
            return;
        }
        this.zzz = com.google.android.gms.internal.ads.Jv0.u(rv0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(com.google.android.gms.internal.ads.C5803yd c5803yd) {
        c5803yd.getClass();
        this.zzD = c5803yd;
        this.zzp |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(com.google.android.gms.internal.ads.C5145se c5145se) {
        c5145se.getClass();
        this.zzG = c5145se;
        this.zzp |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(com.google.android.gms.internal.ads.C2750Qe c2750Qe) {
        c2750Qe.getClass();
        this.zzA = c2750Qe;
        this.zzp |= 32;
    }

    public static com.google.android.gms.internal.ads.C3004Xe v0() {
        return (com.google.android.gms.internal.ads.C3004Xe) zzn.p();
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzn, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new java.lang.Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3040Ye();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C3004Xe();
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzo;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3040Ye.class) {
                try {
                    gv0 = zzo;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzn);
                        zzo = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }

    public java.lang.String k0() {
        return this.zzv;
    }

    public com.google.android.gms.internal.ads.C5803yd t0() {
        com.google.android.gms.internal.ads.C5803yd c5803yd = this.zzD;
        return c5803yd == null ? com.google.android.gms.internal.ads.C5803yd.h0() : c5803yd;
    }

    public com.google.android.gms.internal.ads.C2750Qe u0() {
        com.google.android.gms.internal.ads.C2750Qe c2750Qe = this.zzA;
        return c2750Qe == null ? com.google.android.gms.internal.ads.C2750Qe.g0() : c2750Qe;
    }
}
