package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2305Ed extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final com.google.android.gms.internal.ads.C2305Ed zzc;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.ads.C2305Ed c2305Ed = new com.google.android.gms.internal.ads.C2305Ed();
        zzc = c2305Ed;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2305Ed.class, c2305Ed);
    }

    private C2305Ed() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(com.google.android.gms.internal.ads.EnumC2157Ad enumC2157Ad) {
        this.zzg = enumC2157Ad.a();
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(com.google.android.gms.internal.ads.EnumC2231Cd enumC2231Cd) {
        this.zzf = enumC2231Cd.a();
        this.zze |= 1;
    }

    public static com.google.android.gms.internal.ads.C5913zd d0() {
        return (com.google.android.gms.internal.ads.C5913zd) zzc.p();
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new java.lang.Object[]{"zze", "zzf", com.google.android.gms.internal.ads.EnumC2231Cd.g(), "zzg", com.google.android.gms.internal.ads.EnumC2157Ad.g()});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2305Ed();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5913zd();
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzd;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2305Ed.class) {
                try {
                    gv0 = zzd;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzc);
                        zzd = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
