package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3711fa0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C3711fa0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private java.lang.String zzc = "";

    static {
        com.google.android.gms.internal.ads.C3711fa0 c3711fa0 = new com.google.android.gms.internal.ads.C3711fa0();
        zza = c3711fa0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3711fa0.class, c3711fa0);
    }

    private C3711fa0() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"zzc"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3711fa0();
        }
        com.google.android.gms.internal.ads.AbstractC3601ea0 abstractC3601ea0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C3492da0(abstractC3601ea0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3711fa0.class) {
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
