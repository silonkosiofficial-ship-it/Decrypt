package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ft0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3749ft0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C3749ft0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private java.lang.String zzc = "";
    private com.google.android.gms.internal.ads.AbstractC3753fv0 zzd = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
    private int zze;

    static {
        com.google.android.gms.internal.ads.C3749ft0 c3749ft0 = new com.google.android.gms.internal.ads.C3749ft0();
        zza = c3749ft0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3749ft0.class, c3749ft0);
    }

    private C3749ft0() {
    }

    public static com.google.android.gms.internal.ads.C3420ct0 b0() {
        return (com.google.android.gms.internal.ads.C3420ct0) zza.p();
    }

    public static com.google.android.gms.internal.ads.C3749ft0 e0() {
        return zza;
    }

    static /* synthetic */ void i0(com.google.android.gms.internal.ads.C3749ft0 c3749ft0, java.lang.String str) {
        str.getClass();
        c3749ft0.zzc = str;
    }

    static /* synthetic */ void j0(com.google.android.gms.internal.ads.C3749ft0 c3749ft0, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        abstractC3753fv0.getClass();
        c3749ft0.zzd = abstractC3753fv0;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new java.lang.Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3749ft0();
        }
        com.google.android.gms.internal.ads.AbstractC3639et0 abstractC3639et0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C3420ct0(abstractC3639et0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3749ft0.class) {
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

    public final com.google.android.gms.internal.ads.EnumC3529dt0 c0() {
        com.google.android.gms.internal.ads.EnumC3529dt0 enumC3529dt0;
        int i6 = this.zze;
        if (i6 == 0) {
            enumC3529dt0 = com.google.android.gms.internal.ads.EnumC3529dt0.UNKNOWN_KEYMATERIAL;
        } else if (i6 == 1) {
            enumC3529dt0 = com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC;
        } else if (i6 == 2) {
            enumC3529dt0 = com.google.android.gms.internal.ads.EnumC3529dt0.ASYMMETRIC_PRIVATE;
        } else if (i6 != 3) {
            enumC3529dt0 = i6 != 4 ? null : com.google.android.gms.internal.ads.EnumC3529dt0.REMOTE;
        } else {
            enumC3529dt0 = com.google.android.gms.internal.ads.EnumC3529dt0.ASYMMETRIC_PUBLIC;
        }
        return enumC3529dt0 == null ? com.google.android.gms.internal.ads.EnumC3529dt0.UNRECOGNIZED : enumC3529dt0;
    }

    public final com.google.android.gms.internal.ads.AbstractC3753fv0 f0() {
        return this.zzd;
    }

    public final java.lang.String g0() {
        return this.zzc;
    }
}
