package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3311bt0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C3311bt0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private int zzd;

    static {
        com.google.android.gms.internal.ads.C3311bt0 c3311bt0 = new com.google.android.gms.internal.ads.C3311bt0();
        zza = c3311bt0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3311bt0.class, c3311bt0);
    }

    private C3311bt0() {
    }

    public static com.google.android.gms.internal.ads.Zs0 d0() {
        return (com.google.android.gms.internal.ads.Zs0) zza.p();
    }

    public static com.google.android.gms.internal.ads.C3311bt0 f0() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new java.lang.Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3311bt0();
        }
        com.google.android.gms.internal.ads.AbstractC3201at0 abstractC3201at0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.Zs0(abstractC3201at0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3311bt0.class) {
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

    public final com.google.android.gms.internal.ads.Rs0 c0() {
        com.google.android.gms.internal.ads.Rs0 rs0;
        int i6 = this.zzc;
        if (i6 == 0) {
            rs0 = com.google.android.gms.internal.ads.Rs0.UNKNOWN_HASH;
        } else if (i6 == 1) {
            rs0 = com.google.android.gms.internal.ads.Rs0.SHA1;
        } else if (i6 == 2) {
            rs0 = com.google.android.gms.internal.ads.Rs0.SHA384;
        } else if (i6 == 3) {
            rs0 = com.google.android.gms.internal.ads.Rs0.SHA256;
        } else if (i6 != 4) {
            rs0 = i6 != 5 ? null : com.google.android.gms.internal.ads.Rs0.SHA224;
        } else {
            rs0 = com.google.android.gms.internal.ads.Rs0.SHA512;
        }
        return rs0 == null ? com.google.android.gms.internal.ads.Rs0.UNRECOGNIZED : rs0;
    }
}
