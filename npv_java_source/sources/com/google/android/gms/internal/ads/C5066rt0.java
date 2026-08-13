package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5066rt0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C5066rt0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.Sv0 zzd = com.google.android.gms.internal.ads.Jv0.v();

    static {
        com.google.android.gms.internal.ads.C5066rt0 c5066rt0 = new com.google.android.gms.internal.ads.C5066rt0();
        zza = c5066rt0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5066rt0.class, c5066rt0);
    }

    private C5066rt0() {
    }

    public static com.google.android.gms.internal.ads.C4627nt0 d0() {
        return (com.google.android.gms.internal.ads.C4627nt0) zza.p();
    }

    public static com.google.android.gms.internal.ads.C5066rt0 g0(java.io.InputStream inputStream, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        return (com.google.android.gms.internal.ads.C5066rt0) com.google.android.gms.internal.ads.Jv0.O(zza, inputStream, c5730xv0);
    }

    static /* synthetic */ void i0(com.google.android.gms.internal.ads.C5066rt0 c5066rt0, com.google.android.gms.internal.ads.C4847pt0 c4847pt0) {
        c4847pt0.getClass();
        com.google.android.gms.internal.ads.Sv0 sv0 = c5066rt0.zzd;
        if (!sv0.c()) {
            c5066rt0.zzd = com.google.android.gms.internal.ads.Jv0.w(sv0);
        }
        c5066rt0.zzd.add(c4847pt0);
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.C4847pt0.class});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5066rt0();
        }
        com.google.android.gms.internal.ads.AbstractC4957qt0 abstractC4957qt0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C4627nt0(abstractC4957qt0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5066rt0.class) {
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
        return this.zzd.size();
    }

    public final int c0() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.C4847pt0 e0(int i6) {
        return (com.google.android.gms.internal.ads.C4847pt0) this.zzd.get(i6);
    }

    public final java.util.List h0() {
        return this.zzd;
    }
}
