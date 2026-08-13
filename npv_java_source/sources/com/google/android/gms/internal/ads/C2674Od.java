package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2674Od extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private static final com.google.android.gms.internal.ads.C2674Od zzl;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzm;
    private int zzA;
    private int zzB;
    private com.google.android.gms.internal.ads.C2748Qd zzC;
    private int zzn;
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        com.google.android.gms.internal.ads.C2674Od c2674Od = new com.google.android.gms.internal.ads.C2674Od();
        zzl = c2674Od;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C2674Od.class, c2674Od);
    }

    private C2674Od() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzl, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new java.lang.Object[]{"zzn", "zzo", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzp", com.google.android.gms.internal.ads.EnumC2932Ve.g(), "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C2674Od();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C2637Nd();
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzm;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C2674Od.class) {
                try {
                    gv0 = zzm;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzl);
                        zzm = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
