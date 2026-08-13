package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5064rs0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C5064rs0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.C5834ys0 zze;
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzf = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;

    static {
        com.google.android.gms.internal.ads.C5064rs0 c5064rs0 = new com.google.android.gms.internal.ads.C5064rs0();
        zza = c5064rs0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5064rs0.class, c5064rs0);
    }

    private C5064rs0() {
    }

    public static com.google.android.gms.internal.ads.C4845ps0 c0() {
        return (com.google.android.gms.internal.ads.C4845ps0) zza.p();
    }

    public static com.google.android.gms.internal.ads.C5064rs0 e0(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        return (com.google.android.gms.internal.ads.C5064rs0) com.google.android.gms.internal.ads.Jv0.N(zza, abstractC3753fv0, c5730xv0);
    }

    public static com.google.android.gms.internal.ads.InterfaceC5292tw0 h0() {
        return zza.x();
    }

    static /* synthetic */ void j0(com.google.android.gms.internal.ads.C5064rs0 c5064rs0, com.google.android.gms.internal.ads.C5834ys0 c5834ys0) {
        c5834ys0.getClass();
        c5064rs0.zze = c5834ys0;
        c5064rs0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5064rs0();
        }
        com.google.android.gms.internal.ads.AbstractC4955qs0 abstractC4955qs0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C4845ps0(abstractC4955qs0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5064rs0.class) {
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
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.C5834ys0 f0() {
        com.google.android.gms.internal.ads.C5834ys0 c5834ys0 = this.zze;
        return c5834ys0 == null ? com.google.android.gms.internal.ads.C5834ys0.e0() : c5834ys0;
    }

    public final com.google.android.gms.internal.ads.AbstractC3753fv0 g0() {
        return this.zzf;
    }
}
