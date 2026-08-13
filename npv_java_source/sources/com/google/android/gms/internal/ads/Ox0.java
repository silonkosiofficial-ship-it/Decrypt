package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ox0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.Ox0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.Nx0 zzd;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzf;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzg;
    private int zzh;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzi;
    private byte zzj = 2;
    private com.google.android.gms.internal.ads.Sv0 zze = com.google.android.gms.internal.ads.Jv0.v();

    static {
        com.google.android.gms.internal.ads.Ox0 ox0 = new com.google.android.gms.internal.ads.Ox0();
        zza = ox0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.Ox0.class, ox0);
    }

    private Ox0() {
        com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
        this.zzf = abstractC3753fv0;
        this.zzg = abstractC3753fv0;
        this.zzi = abstractC3753fv0;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.Fy0 fy0 = null;
        switch (iv0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzj);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzj = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new java.lang.Object[]{"zzc", "zzd", "zze", com.google.android.gms.internal.ads.Cx0.class, "zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.Ox0();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.Lx0(fy0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
                if (gv0 == null) {
                    synchronized (com.google.android.gms.internal.ads.Ox0.class) {
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
