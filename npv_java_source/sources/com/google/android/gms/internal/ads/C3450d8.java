package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3450d8 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C3450d8 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private java.lang.String zzd = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private java.lang.String zzk = "";
    private java.lang.String zzm = "";
    private java.lang.String zzn = "";
    private com.google.android.gms.internal.ads.Sv0 zzo = com.google.android.gms.internal.ads.Jv0.v();

    static {
        com.google.android.gms.internal.ads.C3450d8 c3450d8 = new com.google.android.gms.internal.ads.C3450d8();
        zza = c3450d8;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C3450d8.class, c3450d8);
    }

    private C3450d8() {
    }

    public static com.google.android.gms.internal.ads.Z7 b0() {
        return (com.google.android.gms.internal.ads.Z7) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.C3450d8 c3450d8, java.lang.String str) {
        str.getClass();
        c3450d8.zzc |= 1;
        c3450d8.zzd = str;
    }

    static /* synthetic */ void e0(com.google.android.gms.internal.ads.C3450d8 c3450d8, java.lang.String str) {
        c3450d8.zzc |= 16;
        c3450d8.zzh = str;
    }

    static /* synthetic */ void f0(com.google.android.gms.internal.ads.C3450d8 c3450d8, java.lang.String str) {
        c3450d8.zzc |= 1024;
        c3450d8.zzn = str;
    }

    static /* synthetic */ void g0(com.google.android.gms.internal.ads.C3450d8 c3450d8, java.lang.String str) {
        str.getClass();
        c3450d8.zzc |= 8;
        c3450d8.zzg = str;
    }

    static /* synthetic */ void h0(com.google.android.gms.internal.ads.C3450d8 c3450d8, long j6) {
        c3450d8.zzc |= 2;
        c3450d8.zze = j6;
    }

    static /* synthetic */ void i0(com.google.android.gms.internal.ads.C3450d8 c3450d8, java.lang.String str) {
        str.getClass();
        c3450d8.zzc |= 4;
        c3450d8.zzf = str;
    }

    static /* synthetic */ void j0(com.google.android.gms.internal.ads.C3450d8 c3450d8, int i6) {
        c3450d8.zzp = i6 - 1;
        c3450d8.zzc |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", com.google.android.gms.internal.ads.C3231b8.class, "zzp", com.google.android.gms.internal.ads.C3340c8.f34451a});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C3450d8();
        }
        com.google.android.gms.internal.ads.AbstractC3559e8 abstractC3559e8 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.Z7(abstractC3559e8);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C3450d8.class) {
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
