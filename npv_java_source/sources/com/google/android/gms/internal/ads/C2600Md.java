package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2600Md extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final com.google.android.gms.internal.ads.C2600Md zzi;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzj;
    private int zzk;
    private int zzm;
    private int zzn;
    private long zzo;
    private long zzv;
    private int zzw;
    private com.google.android.gms.internal.ads.Sv0 zzl = com.google.android.gms.internal.ads.Jv0.v();
    private java.lang.String zzp = "";
    private java.lang.String zzu = "";

    static {
        com.google.android.gms.internal.ads.C2600Md c2600Md = new com.google.android.gms.internal.ads.C2600Md();
        zzi = c2600Md;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2600Md.class, c2600Md);
    }

    private C2600Md() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(int i6) {
        this.zzk |= 1;
        this.zzm = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(long j6) {
        this.zzk |= 32;
        this.zzv = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i6) {
        this.zzk |= 2;
        this.zzn = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(long j6) {
        this.zzk |= 4;
        this.zzo = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(java.lang.Iterable iterable) {
        o0();
        com.google.android.gms.internal.ads.Ou0.i(iterable, this.zzl);
    }

    private void o0() {
        com.google.android.gms.internal.ads.Sv0 sv0 = this.zzl;
        if (sv0.c()) {
            return;
        }
        this.zzl = com.google.android.gms.internal.ads.Jv0.w(sv0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(java.lang.String str) {
        str.getClass();
        this.zzk |= 8;
        this.zzp = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(int i6) {
        this.zzk |= 64;
        this.zzw = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(java.lang.String str) {
        str.getClass();
        this.zzk |= 16;
        this.zzu = str;
    }

    public static com.google.android.gms.internal.ads.C2490Jd s0() {
        return (com.google.android.gms.internal.ads.C2490Jd) zzi.p();
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new java.lang.Object[]{"zzk", "zzl", com.google.android.gms.internal.ads.C2416Hd.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2600Md();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C2490Jd();
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzj;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2600Md.class) {
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
