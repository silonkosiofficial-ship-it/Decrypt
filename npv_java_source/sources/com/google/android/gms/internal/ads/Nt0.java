package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Nt0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.Nt0 zzb;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzc;
    private java.lang.String zzd = "";
    private com.google.android.gms.internal.ads.Sv0 zze = com.google.android.gms.internal.ads.Jv0.v();

    static {
        com.google.android.gms.internal.ads.Nt0 nt0 = new com.google.android.gms.internal.ads.Nt0();
        zzb = nt0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.Nt0.class, nt0);
    }

    private Nt0() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.ads.C4517mt0.class});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.Nt0();
        }
        com.google.android.gms.internal.ads.Mt0 mt0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.Lt0(mt0);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzc;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.Nt0.class) {
                try {
                    gv0 = zzc;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzb);
                        zzc = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
