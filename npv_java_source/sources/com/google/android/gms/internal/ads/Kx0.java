package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Kx0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.Kx0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.Jx0 zzd;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzf;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzg;
    private int zzh;
    private byte zzi = 2;
    private com.google.android.gms.internal.ads.Sv0 zze = com.google.android.gms.internal.ads.Jv0.v();

    static {
        com.google.android.gms.internal.ads.Kx0 kx0 = new com.google.android.gms.internal.ads.Kx0();
        zza = kx0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.Kx0.class, kx0);
    }

    private Kx0() {
        com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
        this.zzf = abstractC3753fv0;
        this.zzg = abstractC3753fv0;
    }

    public static com.google.android.gms.internal.ads.Hx0 b0() {
        return (com.google.android.gms.internal.ads.Hx0) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.Kx0 kx0, com.google.android.gms.internal.ads.Cx0 cx0) {
        cx0.getClass();
        com.google.android.gms.internal.ads.Sv0 sv0 = kx0.zze;
        if (!sv0.c()) {
            kx0.zze = com.google.android.gms.internal.ads.Jv0.w(sv0);
        }
        kx0.zze.add(cx0);
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.Fy0 fy0 = null;
        switch (iv0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzi);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzi = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new java.lang.Object[]{"zzc", "zzd", "zze", com.google.android.gms.internal.ads.Cx0.class, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.Kx0();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.Hx0(fy0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
                if (gv0 == null) {
                    synchronized (com.google.android.gms.internal.ads.Kx0.class) {
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
}
