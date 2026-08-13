package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class X90 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.X90 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zzA;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzI;
    private int zzP;
    private int zzQ;
    private int zzS;
    private long zzab;
    private int zzad;
    private int zzae;
    private int zzaf;
    private com.google.android.gms.internal.ads.C5578wa0 zzag;
    private int zzah;
    private com.google.android.gms.internal.ads.C5248ta0 zzai;
    private com.google.android.gms.internal.ads.C3711fa0 zzaj;
    private com.google.android.gms.internal.ads.C4479ma0 zzak;
    private com.google.android.gms.internal.ads.C4041ia0 zzal;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.ads.Ov0 zzj = com.google.android.gms.internal.ads.Jv0.q();
    private java.lang.String zzu = "";
    private java.lang.String zzv = "";
    private java.lang.String zzw = "";
    private java.lang.String zzx = "";
    private java.lang.String zzy = "";
    private java.lang.String zzz = "";
    private java.lang.String zzB = "";
    private java.lang.String zzC = "";
    private com.google.android.gms.internal.ads.Rv0 zzD = com.google.android.gms.internal.ads.Jv0.t();
    private java.lang.String zzJ = "";
    private java.lang.String zzK = "";
    private java.lang.String zzL = "";
    private java.lang.String zzM = "";
    private java.lang.String zzN = "";
    private java.lang.String zzO = "";
    private java.lang.String zzR = "";
    private java.lang.String zzT = "";
    private java.lang.String zzU = "";
    private java.lang.String zzV = "";
    private java.lang.String zzW = "";
    private java.lang.String zzX = "";
    private java.lang.String zzY = "";
    private java.lang.String zzZ = "";
    private java.lang.String zzaa = "";
    private java.lang.String zzac = "";

    static {
        com.google.android.gms.internal.ads.X90 x90 = new com.google.android.gms.internal.ads.X90();
        zza = x90;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.X90.class, x90);
    }

    private X90() {
    }

    public static com.google.android.gms.internal.ads.U90 b0() {
        return (com.google.android.gms.internal.ads.U90) zza.p();
    }

    static /* synthetic */ void d0(com.google.android.gms.internal.ads.X90 x90, java.lang.Iterable iterable) {
        com.google.android.gms.internal.ads.Rv0 rv0 = x90.zzD;
        if (!rv0.c()) {
            x90.zzD = com.google.android.gms.internal.ads.Jv0.u(rv0);
        }
        com.google.android.gms.internal.ads.Ou0.i(iterable, x90.zzD);
    }

    static /* synthetic */ void e0(com.google.android.gms.internal.ads.X90 x90, java.lang.String str) {
        str.getClass();
        x90.zzx = str;
    }

    static /* synthetic */ void f0(com.google.android.gms.internal.ads.X90 x90, java.lang.String str) {
        str.getClass();
        x90.zzJ = str;
    }

    static /* synthetic */ void g0(com.google.android.gms.internal.ads.X90 x90, java.lang.String str) {
        str.getClass();
        x90.zzaa = str;
    }

    static /* synthetic */ void i0(com.google.android.gms.internal.ads.X90 x90, java.lang.String str) {
        str.getClass();
        x90.zzK = str;
    }

    static /* synthetic */ void k0(com.google.android.gms.internal.ads.X90 x90, java.lang.String str) {
        str.getClass();
        x90.zzV = str;
    }

    static /* synthetic */ void n0(com.google.android.gms.internal.ads.X90 x90, java.lang.String str) {
        str.getClass();
        x90.zzz = str;
    }

    static /* synthetic */ void o0(com.google.android.gms.internal.ads.X90 x90, java.lang.String str) {
        str.getClass();
        x90.zzX = str;
    }

    static /* synthetic */ void q0(com.google.android.gms.internal.ads.X90 x90, java.lang.String str) {
        str.getClass();
        x90.zzu = str;
    }

    static /* synthetic */ void r0(com.google.android.gms.internal.ads.X90 x90, java.lang.String str) {
        str.getClass();
        x90.zzZ = str;
    }

    static /* synthetic */ void v0(com.google.android.gms.internal.ads.X90 x90, java.lang.String str) {
        str.getClass();
        x90.zzY = str;
    }

    static /* synthetic */ void w0(com.google.android.gms.internal.ads.X90 x90, int i6) {
        if (i6 == 1) {
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        x90.zzI = i6 - 2;
    }

    static /* synthetic */ void y0(com.google.android.gms.internal.ads.X90 x90, int i6) {
        if (i6 == 1) {
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        x90.zzE = i6 - 2;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u00049\u0000\u0001\u000199\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000", new java.lang.Object[]{"zzc", "zzd", "zzk", "zzl", "zzp", "zzu", "zzx", "zzz", "zzA", "zzE", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzV", "zzW", "zzX", "zzY", "zzZ", "zzaa", "zzv", "zzw", "zzB", "zzC", "zzD", "zzL", "zzM", "zzU", "zzab", "zzf", "zzg", "zzh", "zzi", "zzm", "zzn", "zzo", "zzj", "zzae", "zzaf", "zze", "zzai", "zzaj", "zzP", "zzR", "zzO", "zzN", "zzah", "zzQ", "zzS", "zzT", "zzy", "zzak", "zzF", "zzal", "zzac", "zzad", "zzag"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.X90();
        }
        com.google.android.gms.internal.ads.W90 w90 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.U90(w90);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.X90.class) {
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
