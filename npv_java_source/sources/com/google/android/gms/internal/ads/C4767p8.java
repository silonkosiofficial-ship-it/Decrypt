package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4767p8 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C4767p8 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private boolean zzd;
    private int zze = 5000;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        com.google.android.gms.internal.ads.C4767p8 c4767p8 = new com.google.android.gms.internal.ads.C4767p8();
        zza = c4767p8;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C4767p8.class, c4767p8);
    }

    private C4767p8() {
    }

    public static com.google.android.gms.internal.ads.C4767p8 d0() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C4767p8();
        }
        com.google.android.gms.internal.ads.AbstractC4657o8 abstractC4657o8 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C4547n8(abstractC4657o8);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C4767p8.class) {
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
        return this.zze;
    }

    public final boolean e0() {
        return this.zzd;
    }

    public final boolean f0() {
        return this.zzg;
    }

    public final boolean g0() {
        return this.zzf;
    }

    public final boolean h0() {
        return this.zzh;
    }
}
