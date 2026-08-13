package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5726xt0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C5726xt0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.Sv0 zzd = com.google.android.gms.internal.ads.Jv0.v();

    static {
        com.google.android.gms.internal.ads.C5726xt0 c5726xt0 = new com.google.android.gms.internal.ads.C5726xt0();
        zza = c5726xt0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5726xt0.class, c5726xt0);
    }

    private C5726xt0() {
    }

    public static com.google.android.gms.internal.ads.C5176st0 b0() {
        return (com.google.android.gms.internal.ads.C5176st0) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.C5726xt0 c5726xt0, com.google.android.gms.internal.ads.C5506vt0 c5506vt0) {
        c5506vt0.getClass();
        com.google.android.gms.internal.ads.Sv0 sv0 = c5726xt0.zzd;
        if (!sv0.c()) {
            c5726xt0.zzd = com.google.android.gms.internal.ads.Jv0.w(sv0);
        }
        c5726xt0.zzd.add(c5506vt0);
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.C5506vt0.class});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5726xt0();
        }
        com.google.android.gms.internal.ads.AbstractC5616wt0 abstractC5616wt0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5176st0(abstractC5616wt0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5726xt0.class) {
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
