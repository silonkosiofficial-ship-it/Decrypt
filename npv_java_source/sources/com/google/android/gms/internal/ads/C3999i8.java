package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3999i8 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C3999i8 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private int zzd = 2;

    static {
        com.google.android.gms.internal.ads.C3999i8 c3999i8 = new com.google.android.gms.internal.ads.C3999i8();
        zza = c3999i8;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3999i8.class, c3999i8);
    }

    private C3999i8() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.C4107j8.f36588a});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3999i8();
        }
        com.google.android.gms.internal.ads.AbstractC4437m8 abstractC4437m8 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C3889h8(abstractC4437m8);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3999i8.class) {
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
