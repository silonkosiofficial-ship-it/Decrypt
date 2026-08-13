package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ca0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3382ca0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C3382ca0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private com.google.android.gms.internal.ads.Sv0 zzc = com.google.android.gms.internal.ads.Jv0.v();

    static {
        com.google.android.gms.internal.ads.C3382ca0 c3382ca0 = new com.google.android.gms.internal.ads.C3382ca0();
        zza = c3382ca0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3382ca0.class, c3382ca0);
    }

    private C3382ca0() {
    }

    public static com.google.android.gms.internal.ads.Y90 c0() {
        return (com.google.android.gms.internal.ads.Y90) zza.p();
    }

    static /* synthetic */ void e0(com.google.android.gms.internal.ads.C3382ca0 c3382ca0, com.google.android.gms.internal.ads.C3163aa0 c3163aa0) {
        c3163aa0.getClass();
        com.google.android.gms.internal.ads.Sv0 sv0 = c3382ca0.zzc;
        if (!sv0.c()) {
            c3382ca0.zzc = com.google.android.gms.internal.ads.Jv0.w(sv0);
        }
        c3382ca0.zzc.add(c3163aa0);
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzc", com.google.android.gms.internal.ads.C3163aa0.class});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3382ca0();
        }
        com.google.android.gms.internal.ads.AbstractC3273ba0 abstractC3273ba0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.Y90(abstractC3273ba0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3382ca0.class) {
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

    public final int b0() {
        return this.zzc.size();
    }
}
