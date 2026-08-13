package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3781g9 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C3781g9 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.Sv0 zzd = com.google.android.gms.internal.ads.Jv0.v();
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zze = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
    private int zzf = 1;
    private int zzg = 1;

    static {
        com.google.android.gms.internal.ads.C3781g9 c3781g9 = new com.google.android.gms.internal.ads.C3781g9();
        zza = c3781g9;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3781g9.class, c3781g9);
    }

    private C3781g9() {
    }

    public static com.google.android.gms.internal.ads.C3671f9 b0() {
        return (com.google.android.gms.internal.ads.C3671f9) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.C3781g9 c3781g9, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        com.google.android.gms.internal.ads.Sv0 sv0 = c3781g9.zzd;
        if (!sv0.c()) {
            c3781g9.zzd = com.google.android.gms.internal.ads.Jv0.w(sv0);
        }
        c3781g9.zzd.add(abstractC3753fv0);
    }

    static /* synthetic */ void e0(com.google.android.gms.internal.ads.C3781g9 c3781g9, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        c3781g9.zzc |= 1;
        c3781g9.zze = abstractC3753fv0;
    }

    static /* synthetic */ void f0(com.google.android.gms.internal.ads.C3781g9 c3781g9, int i6) {
        c3781g9.zzg = i6 - 1;
        c3781g9.zzc |= 4;
    }

    static /* synthetic */ void g0(com.google.android.gms.internal.ads.C3781g9 c3781g9, int i6) {
        c3781g9.zzf = 4;
        c3781g9.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", com.google.android.gms.internal.ads.C3123a9.f34017a, "zzg", com.google.android.gms.internal.ads.W8.f32690a});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3781g9();
        }
        com.google.android.gms.internal.ads.AbstractC3891h9 abstractC3891h9 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C3671f9(abstractC3891h9);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3781g9.class) {
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
