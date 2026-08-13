package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ox0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4745ox0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C4745ox0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzv;
    private long zzw;
    private boolean zzy;
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.ads.Sv0 zzg = com.google.android.gms.internal.ads.Jv0.v();
    private java.lang.String zzl = "";
    private com.google.android.gms.internal.ads.Sv0 zzu = com.google.android.gms.internal.ads.Jv0.v();
    private com.google.android.gms.internal.ads.Ov0 zzx = com.google.android.gms.internal.ads.Jv0.q();
    private com.google.android.gms.internal.ads.Ov0 zzz = com.google.android.gms.internal.ads.Jv0.q();

    static {
        com.google.android.gms.internal.ads.C4745ox0 c4745ox0 = new com.google.android.gms.internal.ads.C4745ox0();
        zza = c4745ox0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C4745ox0.class, c4745ox0);
    }

    private C4745ox0() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.C4635nx0.f37698a, "zze", "zzf", "zzg", "zzh", com.google.android.gms.internal.ads.C4415lx0.f37257a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", com.google.android.gms.internal.ads.C4305kx0.class, "zzv", "zzw", "zzx", com.google.android.gms.internal.ads.AbstractC3209ax0.a(), "zzy", "zzz", com.google.android.gms.internal.ads.C4525mx0.f37441a});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C4745ox0();
        }
        com.google.android.gms.internal.ads.Fy0 fy0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C3977hx0(fy0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C4745ox0.class) {
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
