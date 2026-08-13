package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5406uy0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C5406uy0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private com.google.android.gms.internal.ads.C4967qy0 zzC;
    private com.google.android.gms.internal.ads.C5624wx0 zzE;
    private com.google.android.gms.internal.ads.C4745ox0 zzG;
    private com.google.android.gms.internal.ads.Tx0 zzI;
    private int zzJ;
    private long zzM;
    private com.google.android.gms.internal.ads.C5296ty0 zzN;
    private com.google.android.gms.internal.ads.Yx0 zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.ads.C5184sx0 zzi;
    private com.google.android.gms.internal.ads.C3649ey0 zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.internal.ads.C4527my0 zzx;
    private boolean zzy;
    private byte zzQ = 2;
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private com.google.android.gms.internal.ads.Sv0 zzj = com.google.android.gms.internal.ads.Jv0.v();
    private com.google.android.gms.internal.ads.Sv0 zzk = com.google.android.gms.internal.ads.Jv0.v();
    private java.lang.String zzl = "";
    private com.google.android.gms.internal.ads.Sv0 zzo = com.google.android.gms.internal.ads.Jv0.v();
    private java.lang.String zzp = "";
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzw = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
    private java.lang.String zzz = "";
    private com.google.android.gms.internal.ads.Sv0 zzA = com.google.android.gms.internal.ads.Jv0.v();
    private com.google.android.gms.internal.ads.Sv0 zzB = com.google.android.gms.internal.ads.Jv0.v();
    private com.google.android.gms.internal.ads.Sv0 zzD = com.google.android.gms.internal.ads.Jv0.v();
    private java.lang.String zzF = "";
    private com.google.android.gms.internal.ads.Sv0 zzH = com.google.android.gms.internal.ads.Jv0.v();
    private com.google.android.gms.internal.ads.Sv0 zzK = com.google.android.gms.internal.ads.Jv0.v();
    private com.google.android.gms.internal.ads.Sv0 zzL = com.google.android.gms.internal.ads.Jv0.v();
    private java.lang.String zzP = "";

    static {
        com.google.android.gms.internal.ads.C5406uy0 c5406uy0 = new com.google.android.gms.internal.ads.C5406uy0();
        zza = c5406uy0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5406uy0.class, c5406uy0);
    }

    private C5406uy0() {
    }

    public static com.google.android.gms.internal.ads.C4965qx0 b0() {
        return (com.google.android.gms.internal.ads.C4965qx0) zza.p();
    }

    static /* synthetic */ void g0(com.google.android.gms.internal.ads.C5406uy0 c5406uy0, java.lang.Iterable iterable) {
        com.google.android.gms.internal.ads.Sv0 sv0 = c5406uy0.zzA;
        if (!sv0.c()) {
            c5406uy0.zzA = com.google.android.gms.internal.ads.Jv0.w(sv0);
        }
        com.google.android.gms.internal.ads.Ou0.i(iterable, c5406uy0.zzA);
    }

    static /* synthetic */ void h0(com.google.android.gms.internal.ads.C5406uy0 c5406uy0, java.lang.Iterable iterable) {
        com.google.android.gms.internal.ads.Sv0 sv0 = c5406uy0.zzB;
        if (!sv0.c()) {
            c5406uy0.zzB = com.google.android.gms.internal.ads.Jv0.w(sv0);
        }
        com.google.android.gms.internal.ads.Ou0.i(iterable, c5406uy0.zzB);
    }

    static /* synthetic */ void i0(com.google.android.gms.internal.ads.C5406uy0 c5406uy0, com.google.android.gms.internal.ads.C4307ky0 c4307ky0) {
        c4307ky0.getClass();
        com.google.android.gms.internal.ads.Sv0 sv0 = c5406uy0.zzj;
        if (!sv0.c()) {
            c5406uy0.zzj = com.google.android.gms.internal.ads.Jv0.w(sv0);
        }
        c5406uy0.zzj.add(c4307ky0);
    }

    static /* synthetic */ void j0(com.google.android.gms.internal.ads.C5406uy0 c5406uy0) {
        c5406uy0.zzc &= -65;
        c5406uy0.zzl = zza.zzl;
    }

    static /* synthetic */ void k0(com.google.android.gms.internal.ads.C5406uy0 c5406uy0, java.lang.String str) {
        c5406uy0.zzc |= 64;
        c5406uy0.zzl = str;
    }

    static /* synthetic */ void l0(com.google.android.gms.internal.ads.C5406uy0 c5406uy0, com.google.android.gms.internal.ads.C4527my0 c4527my0) {
        c4527my0.getClass();
        c5406uy0.zzx = c4527my0;
        c5406uy0.zzc |= 8192;
    }

    static /* synthetic */ void m0(com.google.android.gms.internal.ads.C5406uy0 c5406uy0, com.google.android.gms.internal.ads.C5184sx0 c5184sx0) {
        c5184sx0.getClass();
        c5406uy0.zzi = c5184sx0;
        c5406uy0.zzc |= 32;
    }

    static /* synthetic */ void n0(com.google.android.gms.internal.ads.C5406uy0 c5406uy0, java.lang.String str) {
        str.getClass();
        c5406uy0.zzc |= 8;
        c5406uy0.zzg = str;
    }

    static /* synthetic */ void o0(com.google.android.gms.internal.ads.C5406uy0 c5406uy0, com.google.android.gms.internal.ads.C3649ey0 c3649ey0) {
        c3649ey0.getClass();
        c5406uy0.zzm = c3649ey0;
        c5406uy0.zzc |= 128;
    }

    static /* synthetic */ void p0(com.google.android.gms.internal.ads.C5406uy0 c5406uy0, java.lang.String str) {
        str.getClass();
        c5406uy0.zzc |= 4;
        c5406uy0.zzf = str;
    }

    static /* synthetic */ void q0(com.google.android.gms.internal.ads.C5406uy0 c5406uy0, int i6) {
        c5406uy0.zzd = i6 - 1;
        c5406uy0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.Fy0 fy0 = null;
        switch (iv0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new java.lang.Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", com.google.android.gms.internal.ads.C4307ky0.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", com.google.android.gms.internal.ads.C3759fy0.f35494a, "zze", com.google.android.gms.internal.ads.C4855px0.f38115a, "zzi", "zzl", "zzm", "zzw", "zzk", com.google.android.gms.internal.ads.C5846yy0.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", com.google.android.gms.internal.ads.Ey0.class, "zzE", "zzF", "zzG", "zzH", com.google.android.gms.internal.ads.Ax0.class, "zzI", "zzJ", com.google.android.gms.internal.ads.C4747oy0.f37892a, "zzK", com.google.android.gms.internal.ads.Wx0.class, "zzL", com.google.android.gms.internal.ads.C3320by0.class, "zzM", "zzN", "zzO", "zzP"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.C5406uy0();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.C4965qx0(fy0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
                if (gv0 == null) {
                    synchronized (com.google.android.gms.internal.ads.C5406uy0.class) {
                        try {
                            gv0 = zzb;
                            if (gv0 == null) {
                                gv0 = new com.google.android.gms.internal.ads.Gv0(zza);
                                zzb = gv0;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return gv0;
            default:
                throw null;
        }
    }

    public final java.lang.String d0() {
        return this.zzl;
    }

    public final java.lang.String e0() {
        return this.zzf;
    }

    public final java.util.List f0() {
        return this.zzj;
    }
}
