package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2416Hd extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final com.google.android.gms.internal.ads.Qv0 zzn = new com.google.android.gms.internal.ads.C2416Hd.a();
    private static final com.google.android.gms.internal.ads.C2416Hd zzo;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzp;
    private com.google.android.gms.internal.ads.C2305Ed zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private com.google.android.gms.internal.ads.Ov0 zzz = com.google.android.gms.internal.ads.Jv0.q();

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hd$a */
    class a implements com.google.android.gms.internal.ads.Qv0 {
        a() {
        }
    }

    static {
        com.google.android.gms.internal.ads.C2416Hd c2416Hd = new com.google.android.gms.internal.ads.C2416Hd();
        zzo = c2416Hd;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2416Hd.class, c2416Hd);
    }

    private C2416Hd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(long j6) {
        this.zzu |= 2048;
        this.zzH = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(com.google.android.gms.internal.ads.EnumC2932Ve enumC2932Ve) {
        this.zzB = enumC2932Ve.a();
        this.zzu |= 32;
    }

    public static com.google.android.gms.internal.ads.C2453Id E0() {
        return (com.google.android.gms.internal.ads.C2453Id) zzo.p();
    }

    public static com.google.android.gms.internal.ads.C2416Hd G0(byte[] bArr) {
        return (com.google.android.gms.internal.ads.C2416Hd) com.google.android.gms.internal.ads.Jv0.M(zzo, bArr);
    }

    private void c0() {
        com.google.android.gms.internal.ads.Ov0 ov0 = this.zzz;
        if (ov0.c()) {
            return;
        }
        this.zzz = com.google.android.gms.internal.ads.Jv0.r(ov0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(java.lang.Iterable iterable) {
        c0();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzz.K(((com.google.android.gms.internal.ads.EnumC2344Fe) it.next()).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(com.google.android.gms.internal.ads.EnumC2932Ve enumC2932Ve) {
        this.zzC = enumC2932Ve.a();
        this.zzu |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(com.google.android.gms.internal.ads.EnumC2932Ve enumC2932Ve) {
        this.zzD = enumC2932Ve.a();
        this.zzu |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(int i6) {
        this.zzu |= 256;
        this.zzE = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(com.google.android.gms.internal.ads.EnumC2527Kd enumC2527Kd) {
        this.zzG = enumC2527Kd.a();
        this.zzu |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(com.google.android.gms.internal.ads.C2305Ed c2305Ed) {
        c2305Ed.getClass();
        this.zzA = c2305Ed;
        this.zzu |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(com.google.android.gms.internal.ads.EnumC2932Ve enumC2932Ve) {
        this.zzF = enumC2932Ve.a();
        this.zzu |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(long j6) {
        this.zzu |= 8;
        this.zzy = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(long j6) {
        this.zzu |= 4;
        this.zzx = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(com.google.android.gms.internal.ads.EnumC2932Ve enumC2932Ve) {
        this.zzw = enumC2932Ve.a();
        this.zzu |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(long j6) {
        this.zzu |= 1;
        this.zzv = j6;
    }

    public long C0() {
        return this.zzv;
    }

    public com.google.android.gms.internal.ads.EnumC2932Ve D0() {
        com.google.android.gms.internal.ads.EnumC2932Ve enumC2932VeE = com.google.android.gms.internal.ads.EnumC2932Ve.e(this.zzw);
        return enumC2932VeE == null ? com.google.android.gms.internal.ads.EnumC2932Ve.ENUM_FALSE : enumC2932VeE;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new java.lang.Object[]{"zzu", "zzv", "zzw", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzx", "zzy", "zzz", com.google.android.gms.internal.ads.EnumC2344Fe.g(), "zzA", "zzB", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzC", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzD", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzE", "zzF", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzG", com.google.android.gms.internal.ads.EnumC2527Kd.g(), "zzH"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2416Hd();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C2453Id();
        }
        if (iOrdinal == 5) {
            return zzo;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzp;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2416Hd.class) {
                try {
                    gv0 = zzp;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzo);
                        zzp = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
