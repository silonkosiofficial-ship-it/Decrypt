package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3170ae extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private static final com.google.android.gms.internal.ads.C3170ae zzu;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzv;
    private com.google.android.gms.internal.ads.C2233Ce zzA;
    private com.google.android.gms.internal.ads.C3389ce zzB;
    private com.google.android.gms.internal.ads.C5585we zzC;
    private com.google.android.gms.internal.ads.C4048ie zzD;
    private int zzE;
    private int zzF;
    private com.google.android.gms.internal.ads.C2966Wd zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzM;
    private int zzw;
    private com.google.android.gms.internal.ads.C5365ue zzx;
    private com.google.android.gms.internal.ads.C5805ye zzy;
    private com.google.android.gms.internal.ads.C2159Ae zzz;

    static {
        com.google.android.gms.internal.ads.C3170ae c3170ae = new com.google.android.gms.internal.ads.C3170ae();
        zzu = c3170ae;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3170ae.class, c3170ae);
    }

    private C3170ae() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zzu, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new java.lang.Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3170ae();
        }
        com.google.android.gms.internal.ads.AbstractC3720ff abstractC3720ff = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C3074Zd();
        }
        if (iOrdinal == 5) {
            return zzu;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzv;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3170ae.class) {
                try {
                    gv0 = zzv;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zzu);
                        zzv = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
