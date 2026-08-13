package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5145se extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    private static final com.google.android.gms.internal.ads.C5145se zzb;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzc;
    private com.google.android.gms.internal.ads.Sv0 zzd = com.google.android.gms.internal.ads.Jv0.v();

    static {
        com.google.android.gms.internal.ads.C5145se c5145se = new com.google.android.gms.internal.ads.C5145se();
        zzb = c5145se;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5145se.class, c5145se);
    }

    private C5145se() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(com.google.android.gms.internal.ads.C4266ke c4266ke) {
        c4266ke.getClass();
        c0();
        this.zzd.add(c4266ke);
    }

    private void c0() {
        com.google.android.gms.internal.ads.Sv0 sv0 = this.zzd;
        if (sv0.c()) {
            return;
        }
        this.zzd = com.google.android.gms.internal.ads.Jv0.w(sv0);
    }

    public static com.google.android.gms.internal.ads.C4376le d0() {
        return (com.google.android.gms.internal.ads.C4376le) zzb.p();
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzd", com.google.android.gms.internal.ads.C4266ke.class});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5145se();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C4376le();
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzc;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5145se.class) {
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
