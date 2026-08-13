package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Cx0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.Cx0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzd;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zze;
    private byte zzf = 2;

    static {
        com.google.android.gms.internal.ads.Cx0 cx0 = new com.google.android.gms.internal.ads.Cx0();
        zza = cx0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.Cx0.class, cx0);
    }

    private Cx0() {
        com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
        this.zzd = abstractC3753fv0;
        this.zze = abstractC3753fv0;
    }

    public static com.google.android.gms.internal.ads.Bx0 b0() {
        return (com.google.android.gms.internal.ads.Bx0) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.Cx0 cx0, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        cx0.zzc |= 1;
        cx0.zzd = abstractC3753fv0;
    }

    static /* synthetic */ void e0(com.google.android.gms.internal.ads.Cx0 cx0, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        cx0.zzc |= 2;
        cx0.zze = abstractC3753fv0;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.Fy0 fy0 = null;
        switch (iv0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new java.lang.Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.Cx0();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.Bx0(fy0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
                if (gv0 == null) {
                    synchronized (com.google.android.gms.internal.ads.Cx0.class) {
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
