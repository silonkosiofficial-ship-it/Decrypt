package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5694xd0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C5694xd0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private int zzd;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.ads.C5254td0 zzg;

    static {
        com.google.android.gms.internal.ads.C5694xd0 c5694xd0 = new com.google.android.gms.internal.ads.C5694xd0();
        zza = c5694xd0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C5694xd0.class, c5694xd0);
    }

    private C5694xd0() {
    }

    public static com.google.android.gms.internal.ads.C5364ud0 b0() {
        return (com.google.android.gms.internal.ads.C5364ud0) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.C5694xd0 c5694xd0, java.lang.String str) {
        str.getClass();
        c5694xd0.zzc |= 2;
        c5694xd0.zze = str;
    }

    static /* synthetic */ void e0(com.google.android.gms.internal.ads.C5694xd0 c5694xd0, com.google.android.gms.internal.ads.C5254td0 c5254td0) {
        c5254td0.getClass();
        c5694xd0.zzg = c5254td0;
        c5694xd0.zzc |= 8;
    }

    static /* synthetic */ void f0(com.google.android.gms.internal.ads.C5694xd0 c5694xd0, int i6) {
        c5694xd0.zzd = 1;
        c5694xd0.zzc = 1 | c5694xd0.zzc;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.C5474vd0.f39427a, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C5694xd0();
        }
        com.google.android.gms.internal.ads.AbstractC5584wd0 abstractC5584wd0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C5364ud0(abstractC5584wd0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C5694xd0.class) {
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
