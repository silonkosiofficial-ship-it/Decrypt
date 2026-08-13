package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6034i2 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.C6034i2 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i2$a */
    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.C6034i2.zzc);
        }

        public final com.google.android.gms.internal.measurement.C6034i2.a A(boolean z6) {
            r();
            com.google.android.gms.internal.measurement.C6034i2.P((com.google.android.gms.internal.measurement.C6034i2) this.f41216D, z6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6034i2.a B(boolean z6) {
            r();
            com.google.android.gms.internal.measurement.C6034i2.R((com.google.android.gms.internal.measurement.C6034i2) this.f41216D, z6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6034i2.a v(boolean z6) {
            r();
            com.google.android.gms.internal.measurement.C6034i2.G((com.google.android.gms.internal.measurement.C6034i2) this.f41216D, z6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6034i2.a w(boolean z6) {
            r();
            com.google.android.gms.internal.measurement.C6034i2.I((com.google.android.gms.internal.measurement.C6034i2) this.f41216D, z6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6034i2.a x(boolean z6) {
            r();
            com.google.android.gms.internal.measurement.C6034i2.K((com.google.android.gms.internal.measurement.C6034i2) this.f41216D, z6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6034i2.a y(boolean z6) {
            r();
            com.google.android.gms.internal.measurement.C6034i2.L((com.google.android.gms.internal.measurement.C6034i2) this.f41216D, z6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6034i2.a z(boolean z6) {
            r();
            com.google.android.gms.internal.measurement.C6034i2.N((com.google.android.gms.internal.measurement.C6034i2) this.f41216D, z6);
            return this;
        }
    }

    static {
        com.google.android.gms.internal.measurement.C6034i2 c6034i2 = new com.google.android.gms.internal.measurement.C6034i2();
        zzc = c6034i2;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.C6034i2.class, c6034i2);
    }

    private C6034i2() {
    }

    public static com.google.android.gms.internal.measurement.C6034i2.a F() {
        return (com.google.android.gms.internal.measurement.C6034i2.a) zzc.w();
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.C6034i2 c6034i2, boolean z6) {
        c6034i2.zze |= 32;
        c6034i2.zzk = z6;
    }

    static /* synthetic */ void I(com.google.android.gms.internal.measurement.C6034i2 c6034i2, boolean z6) {
        c6034i2.zze |= 16;
        c6034i2.zzj = z6;
    }

    public static com.google.android.gms.internal.measurement.C6034i2 J() {
        return zzc;
    }

    static /* synthetic */ void K(com.google.android.gms.internal.measurement.C6034i2 c6034i2, boolean z6) {
        c6034i2.zze |= 1;
        c6034i2.zzf = z6;
    }

    static /* synthetic */ void L(com.google.android.gms.internal.measurement.C6034i2 c6034i2, boolean z6) {
        c6034i2.zze |= 64;
        c6034i2.zzl = z6;
    }

    static /* synthetic */ void N(com.google.android.gms.internal.measurement.C6034i2 c6034i2, boolean z6) {
        c6034i2.zze |= 2;
        c6034i2.zzg = z6;
    }

    static /* synthetic */ void P(com.google.android.gms.internal.measurement.C6034i2 c6034i2, boolean z6) {
        c6034i2.zze |= 4;
        c6034i2.zzh = z6;
    }

    static /* synthetic */ void R(com.google.android.gms.internal.measurement.C6034i2 c6034i2, boolean z6) {
        c6034i2.zze |= 8;
        c6034i2.zzi = z6;
    }

    public final boolean M() {
        return this.zzk;
    }

    public final boolean O() {
        return this.zzj;
    }

    public final boolean Q() {
        return this.zzf;
    }

    public final boolean S() {
        return this.zzl;
    }

    public final boolean T() {
        return this.zzg;
    }

    public final boolean U() {
        return this.zzh;
    }

    public final boolean V() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.AbstractC6007f2.f40939a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.C6034i2();
            case 2:
                return new com.google.android.gms.internal.measurement.C6034i2.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new java.lang.Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.C6034i2.class) {
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
