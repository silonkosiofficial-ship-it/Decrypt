package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2455Ie extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final com.google.android.gms.internal.ads.C2455Ie zzc;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.ads.C2822Sd zzg;

    static {
        com.google.android.gms.internal.ads.C2455Ie c2455Ie = new com.google.android.gms.internal.ads.C2455Ie();
        zzc = c2455Ie;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2455Ie.class, c2455Ie);
    }

    private C2455Ie() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new java.lang.Object[]{"zze", "zzf", com.google.android.gms.internal.ads.EnumC2344Fe.g(), "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2455Ie();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C2418He();
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzd;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2455Ie.class) {
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
