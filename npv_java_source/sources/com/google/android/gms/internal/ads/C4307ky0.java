package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ky0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4307ky0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C4307ky0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.Kx0 zzf;
    private com.google.android.gms.internal.ads.Ox0 zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.ads.Ov0 zzi = com.google.android.gms.internal.ads.Jv0.q();
    private java.lang.String zzj = "";
    private com.google.android.gms.internal.ads.Sv0 zzl = com.google.android.gms.internal.ads.Jv0.v();

    static {
        com.google.android.gms.internal.ads.C4307ky0 c4307ky0 = new com.google.android.gms.internal.ads.C4307ky0();
        zza = c4307ky0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C4307ky0.class, c4307ky0);
    }

    private C4307ky0() {
    }

    public static com.google.android.gms.internal.ads.C4197jy0 c0() {
        return (com.google.android.gms.internal.ads.C4197jy0) zza.p();
    }

    static /* synthetic */ void f0(com.google.android.gms.internal.ads.C4307ky0 c4307ky0, java.lang.String str) {
        str.getClass();
        com.google.android.gms.internal.ads.Sv0 sv0 = c4307ky0.zzl;
        if (!sv0.c()) {
            c4307ky0.zzl = com.google.android.gms.internal.ads.Jv0.w(sv0);
        }
        c4307ky0.zzl.add(str);
    }

    static /* synthetic */ void g0(com.google.android.gms.internal.ads.C4307ky0 c4307ky0, int i6) {
        c4307ky0.zzc |= 1;
        c4307ky0.zzd = i6;
    }

    static /* synthetic */ void h0(com.google.android.gms.internal.ads.C4307ky0 c4307ky0, com.google.android.gms.internal.ads.Kx0 kx0) {
        kx0.getClass();
        c4307ky0.zzf = kx0;
        c4307ky0.zzc |= 4;
    }

    static /* synthetic */ void i0(com.google.android.gms.internal.ads.C4307ky0 c4307ky0, java.lang.String str) {
        str.getClass();
        c4307ky0.zzc |= 2;
        c4307ky0.zze = str;
    }

    static /* synthetic */ void j0(com.google.android.gms.internal.ads.C4307ky0 c4307ky0, int i6) {
        c4307ky0.zzk = i6 - 1;
        c4307ky0.zzc |= 64;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.Fy0 fy0 = null;
        switch (iv0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzm);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzm = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", com.google.android.gms.internal.ads.C3869gy0.f35958a, "zzl"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.C4307ky0();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.C4197jy0(fy0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
                if (gv0 == null) {
                    synchronized (com.google.android.gms.internal.ads.C4307ky0.class) {
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

    public final int b0() {
        return this.zzl.size();
    }

    public final java.lang.String e0() {
        return this.zze;
    }
}
