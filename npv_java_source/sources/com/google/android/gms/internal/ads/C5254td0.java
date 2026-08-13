package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.td0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5254td0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C5254td0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.Ov0 zzd = com.google.android.gms.internal.ads.Jv0.q();
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.ads.C5254td0 c5254td0 = new com.google.android.gms.internal.ads.C5254td0();
        zza = c5254td0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5254td0.class, c5254td0);
    }

    private C5254td0() {
    }

    public static com.google.android.gms.internal.ads.C5034rd0 b0() {
        return (com.google.android.gms.internal.ads.C5034rd0) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.C5254td0 c5254td0, java.lang.String str) {
        str.getClass();
        c5254td0.zzc |= 1;
        c5254td0.zze = str;
    }

    static /* synthetic */ void e0(com.google.android.gms.internal.ads.C5254td0 c5254td0, int i6) {
        com.google.android.gms.internal.ads.Ov0 ov0 = c5254td0.zzd;
        if (!ov0.c()) {
            c5254td0.zzd = com.google.android.gms.internal.ads.Jv0.r(ov0);
        }
        c5254td0.zzd.K(2);
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.C4925qd0.f38293a, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5254td0();
        }
        com.google.android.gms.internal.ads.AbstractC5144sd0 abstractC5144sd0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5034rd0(abstractC5144sd0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5254td0.class) {
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
