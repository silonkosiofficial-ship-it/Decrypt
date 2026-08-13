package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5184sx0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C5184sx0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private java.lang.String zzd = "";

    static {
        com.google.android.gms.internal.ads.C5184sx0 c5184sx0 = new com.google.android.gms.internal.ads.C5184sx0();
        zza = c5184sx0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5184sx0.class, c5184sx0);
    }

    private C5184sx0() {
    }

    public static com.google.android.gms.internal.ads.C5074rx0 b0() {
        return (com.google.android.gms.internal.ads.C5074rx0) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.C5184sx0 c5184sx0, java.lang.String str) {
        c5184sx0.zzc |= 1;
        c5184sx0.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new java.lang.Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5184sx0();
        }
        com.google.android.gms.internal.ads.Fy0 fy0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5074rx0(fy0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5184sx0.class) {
                try {
                    gv0 = zzb;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zza);
                        zzb = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
