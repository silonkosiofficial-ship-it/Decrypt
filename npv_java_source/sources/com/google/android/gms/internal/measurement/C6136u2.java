package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6136u2 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.C6136u2 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private long zzf;
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u2$a */
    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.C6136u2.zzc);
        }

        public final com.google.android.gms.internal.measurement.C6136u2.a A(long j6) {
            r();
            com.google.android.gms.internal.measurement.C6136u2.M((com.google.android.gms.internal.measurement.C6136u2) this.f41216D, j6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6136u2.a B(java.lang.String str) {
            r();
            com.google.android.gms.internal.measurement.C6136u2.N((com.google.android.gms.internal.measurement.C6136u2) this.f41216D, str);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6136u2.a C() {
            r();
            com.google.android.gms.internal.measurement.C6136u2.P((com.google.android.gms.internal.measurement.C6136u2) this.f41216D);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6136u2.a v() {
            r();
            com.google.android.gms.internal.measurement.C6136u2.G((com.google.android.gms.internal.measurement.C6136u2) this.f41216D);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6136u2.a w(double d6) {
            r();
            com.google.android.gms.internal.measurement.C6136u2.H((com.google.android.gms.internal.measurement.C6136u2) this.f41216D, d6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6136u2.a x(long j6) {
            r();
            com.google.android.gms.internal.measurement.C6136u2.I((com.google.android.gms.internal.measurement.C6136u2) this.f41216D, j6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6136u2.a y(java.lang.String str) {
            r();
            com.google.android.gms.internal.measurement.C6136u2.J((com.google.android.gms.internal.measurement.C6136u2) this.f41216D, str);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6136u2.a z() {
            r();
            com.google.android.gms.internal.measurement.C6136u2.L((com.google.android.gms.internal.measurement.C6136u2) this.f41216D);
            return this;
        }
    }

    static {
        com.google.android.gms.internal.measurement.C6136u2 c6136u2 = new com.google.android.gms.internal.measurement.C6136u2();
        zzc = c6136u2;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.C6136u2.class, c6136u2);
    }

    private C6136u2() {
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.C6136u2 c6136u2) {
        c6136u2.zze &= -33;
        c6136u2.zzk = 0.0d;
    }

    static /* synthetic */ void H(com.google.android.gms.internal.measurement.C6136u2 c6136u2, double d6) {
        c6136u2.zze |= 32;
        c6136u2.zzk = d6;
    }

    static /* synthetic */ void I(com.google.android.gms.internal.measurement.C6136u2 c6136u2, long j6) {
        c6136u2.zze |= 8;
        c6136u2.zzi = j6;
    }

    static /* synthetic */ void J(com.google.android.gms.internal.measurement.C6136u2 c6136u2, java.lang.String str) {
        str.getClass();
        c6136u2.zze |= 2;
        c6136u2.zzg = str;
    }

    static /* synthetic */ void L(com.google.android.gms.internal.measurement.C6136u2 c6136u2) {
        c6136u2.zze &= -9;
        c6136u2.zzi = 0L;
    }

    static /* synthetic */ void M(com.google.android.gms.internal.measurement.C6136u2 c6136u2, long j6) {
        c6136u2.zze |= 1;
        c6136u2.zzf = j6;
    }

    static /* synthetic */ void N(com.google.android.gms.internal.measurement.C6136u2 c6136u2, java.lang.String str) {
        str.getClass();
        c6136u2.zze |= 4;
        c6136u2.zzh = str;
    }

    static /* synthetic */ void P(com.google.android.gms.internal.measurement.C6136u2 c6136u2) {
        c6136u2.zze &= -5;
        c6136u2.zzh = zzc.zzh;
    }

    public static com.google.android.gms.internal.measurement.C6136u2.a R() {
        return (com.google.android.gms.internal.measurement.C6136u2.a) zzc.w();
    }

    public final double F() {
        return this.zzk;
    }

    public final float K() {
        return this.zzj;
    }

    public final long O() {
        return this.zzi;
    }

    public final long Q() {
        return this.zzf;
    }

    public final java.lang.String T() {
        return this.zzg;
    }

    public final java.lang.String U() {
        return this.zzh;
    }

    public final boolean V() {
        return (this.zze & 32) != 0;
    }

    public final boolean W() {
        return (this.zze & 16) != 0;
    }

    public final boolean X() {
        return (this.zze & 8) != 0;
    }

    public final boolean Y() {
        return (this.zze & 1) != 0;
    }

    public final boolean Z() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.AbstractC6007f2.f40939a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.C6136u2();
            case 2:
                return new com.google.android.gms.internal.measurement.C6136u2.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new java.lang.Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.C6136u2.class) {
                        try {
                            aVar = zzd;
                            if (aVar == null) {
                                aVar = new com.google.android.gms.internal.measurement.AbstractC6130t4.a(zzc);
                                zzd = aVar;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }
}
