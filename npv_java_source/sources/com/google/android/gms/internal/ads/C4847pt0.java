package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4847pt0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C4847pt0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.C3749ft0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.ads.C4847pt0 c4847pt0 = new com.google.android.gms.internal.ads.C4847pt0();
        zza = c4847pt0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C4847pt0.class, c4847pt0);
    }

    private C4847pt0() {
    }

    public static com.google.android.gms.internal.ads.C4737ot0 d0() {
        return (com.google.android.gms.internal.ads.C4737ot0) zza.p();
    }

    static /* synthetic */ void g0(com.google.android.gms.internal.ads.C4847pt0 c4847pt0, com.google.android.gms.internal.ads.C3749ft0 c3749ft0) {
        c3749ft0.getClass();
        c4847pt0.zzd = c3749ft0;
        c4847pt0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C4847pt0();
        }
        com.google.android.gms.internal.ads.AbstractC4957qt0 abstractC4957qt0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C4737ot0(abstractC4957qt0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C4847pt0.class) {
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
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.C3749ft0 c0() {
        com.google.android.gms.internal.ads.C3749ft0 c3749ft0 = this.zzd;
        return c3749ft0 == null ? com.google.android.gms.internal.ads.C3749ft0.e0() : c3749ft0;
    }

    public final com.google.android.gms.internal.ads.Kt0 f0() {
        com.google.android.gms.internal.ads.Kt0 kt0E = com.google.android.gms.internal.ads.Kt0.e(this.zzg);
        return kt0E == null ? com.google.android.gms.internal.ads.Kt0.UNRECOGNIZED : kt0E;
    }

    public final boolean j0() {
        return (this.zzc & 1) != 0;
    }

    public final int k0() {
        int i6 = this.zze;
        int i10 = 2;
        if (i6 != 0) {
            if (i6 == 1) {
                i10 = 3;
            } else if (i6 != 2) {
                i10 = i6 != 3 ? 0 : 5;
            } else {
                i10 = 4;
            }
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
