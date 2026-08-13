package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2190Bb extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C2190Bb zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        com.google.android.gms.internal.ads.C2190Bb c2190Bb = new com.google.android.gms.internal.ads.C2190Bb();
        zza = c2190Bb;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2190Bb.class, c2190Bb);
    }

    private C2190Bb() {
    }

    public static com.google.android.gms.internal.ads.C5909zb e0() {
        return (com.google.android.gms.internal.ads.C5909zb) zza.p();
    }

    public static com.google.android.gms.internal.ads.C2190Bb g0() {
        return zza;
    }

    public static com.google.android.gms.internal.ads.C2190Bb h0(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        return (com.google.android.gms.internal.ads.C2190Bb) com.google.android.gms.internal.ads.Jv0.L(zza, abstractC3753fv0);
    }

    public static com.google.android.gms.internal.ads.C2190Bb i0(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        return (com.google.android.gms.internal.ads.C2190Bb) com.google.android.gms.internal.ads.Jv0.N(zza, abstractC3753fv0, c5730xv0);
    }

    static /* synthetic */ void l0(com.google.android.gms.internal.ads.C2190Bb c2190Bb, java.lang.String str) {
        str.getClass();
        c2190Bb.zzc |= 2;
        c2190Bb.zze = str;
    }

    static /* synthetic */ void m0(com.google.android.gms.internal.ads.C2190Bb c2190Bb, long j6) {
        c2190Bb.zzc |= 8;
        c2190Bb.zzg = j6;
    }

    static /* synthetic */ void n0(com.google.android.gms.internal.ads.C2190Bb c2190Bb, long j6) {
        c2190Bb.zzc |= 4;
        c2190Bb.zzf = j6;
    }

    static /* synthetic */ void o0(com.google.android.gms.internal.ads.C2190Bb c2190Bb, long j6) {
        c2190Bb.zzc |= 16;
        c2190Bb.zzh = j6;
    }

    static /* synthetic */ void p0(com.google.android.gms.internal.ads.C2190Bb c2190Bb, java.lang.String str) {
        str.getClass();
        c2190Bb.zzc |= 1;
        c2190Bb.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2190Bb();
        }
        com.google.android.gms.internal.ads.AbstractC2153Ab abstractC2153Ab = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5909zb(abstractC2153Ab);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2190Bb.class) {
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

    public final long b0() {
        return this.zzg;
    }

    public final long c0() {
        return this.zzf;
    }

    public final long d0() {
        return this.zzh;
    }

    public final java.lang.String j0() {
        return this.zze;
    }

    public final java.lang.String k0() {
        return this.zzd;
    }
}
