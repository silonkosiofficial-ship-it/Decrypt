package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ey0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.Ey0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private boolean zzj;
    private double zzk;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private int zzf = 4;
    private com.google.android.gms.internal.ads.Sv0 zzg = com.google.android.gms.internal.ads.Jv0.v();
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";
    private com.google.android.gms.internal.ads.Sv0 zzl = com.google.android.gms.internal.ads.Jv0.v();

    static {
        com.google.android.gms.internal.ads.Ey0 ey0 = new com.google.android.gms.internal.ads.Ey0();
        zza = ey0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.Ey0.class, ey0);
    }

    private Ey0() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new java.lang.Object[]{"zzc", "zzd", "zzf", com.google.android.gms.internal.ads.Dy0.f26854a, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", com.google.android.gms.internal.ads.Cy0.class, "zze", "zzm", com.google.android.gms.internal.ads.Ay0.f25826a, "zzn", "zzo", "zzp", "zzu"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.Ey0();
        }
        com.google.android.gms.internal.ads.Fy0 fy0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5956zy0(fy0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.Ey0.class) {
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
