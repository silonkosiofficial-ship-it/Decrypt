package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.my0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4527my0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C4527my0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private java.lang.String zzd = "";
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";

    static {
        com.google.android.gms.internal.ads.C4527my0 c4527my0 = new com.google.android.gms.internal.ads.C4527my0();
        zza = c4527my0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C4527my0.class, c4527my0);
    }

    private C4527my0() {
    }

    public static com.google.android.gms.internal.ads.C4417ly0 b0() {
        return (com.google.android.gms.internal.ads.C4417ly0) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.C4527my0 c4527my0, java.lang.String str) {
        c4527my0.zzc |= 1;
        c4527my0.zzd = str;
    }

    static /* synthetic */ void e0(com.google.android.gms.internal.ads.C4527my0 c4527my0, long j6) {
        c4527my0.zzc |= 2;
        c4527my0.zze = j6;
    }

    static /* synthetic */ void f0(com.google.android.gms.internal.ads.C4527my0 c4527my0, boolean z6) {
        c4527my0.zzc |= 4;
        c4527my0.zzf = z6;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.ads.C4637ny0.f37701a, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C4527my0();
        }
        com.google.android.gms.internal.ads.Fy0 fy0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C4417ly0(fy0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C4527my0.class) {
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
