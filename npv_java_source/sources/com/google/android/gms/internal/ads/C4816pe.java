package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4816pe extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final com.google.android.gms.internal.ads.C4816pe zzc;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.ads.C4816pe c4816pe = new com.google.android.gms.internal.ads.C4816pe();
        zzc = c4816pe;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C4816pe.class, c4816pe);
    }

    private C4816pe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z6) {
        this.zze |= 1;
        this.zzf = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i6) {
        this.zze |= 2;
        this.zzg = i6;
    }

    public static com.google.android.gms.internal.ads.C4706oe d0() {
        return (com.google.android.gms.internal.ads.C4706oe) zzc.p();
    }

    public static com.google.android.gms.internal.ads.C4816pe f0() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new java.lang.Object[]{"zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C4816pe();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C4706oe();
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzd;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C4816pe.class) {
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
