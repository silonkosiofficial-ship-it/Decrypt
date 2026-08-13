package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6079n2 extends com.google.android.gms.internal.measurement.AbstractC6130t4 implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
    private static final com.google.android.gms.internal.measurement.C6079n2 zzc;
    private static volatile com.google.android.gms.internal.measurement.InterfaceC6028h5 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private com.google.android.gms.internal.measurement.D4 zzk = com.google.android.gms.internal.measurement.AbstractC6130t4.B();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n2$a */
    public static final class a extends com.google.android.gms.internal.measurement.AbstractC6130t4.b implements com.google.android.gms.internal.measurement.InterfaceC5983c5 {
        private a() {
            super(com.google.android.gms.internal.measurement.C6079n2.zzc);
        }

        public final com.google.android.gms.internal.measurement.C6079n2.a A(java.lang.String str) {
            r();
            com.google.android.gms.internal.measurement.C6079n2.L((com.google.android.gms.internal.measurement.C6079n2) this.f41216D, str);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6079n2.a B() {
            r();
            com.google.android.gms.internal.measurement.C6079n2.G((com.google.android.gms.internal.measurement.C6079n2) this.f41216D);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6079n2.a C(java.lang.String str) {
            r();
            com.google.android.gms.internal.measurement.C6079n2.O((com.google.android.gms.internal.measurement.C6079n2) this.f41216D, str);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6079n2.a E() {
            r();
            com.google.android.gms.internal.measurement.C6079n2.N((com.google.android.gms.internal.measurement.C6079n2) this.f41216D);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6079n2.a F() {
            r();
            com.google.android.gms.internal.measurement.C6079n2.Q((com.google.android.gms.internal.measurement.C6079n2) this.f41216D);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6079n2.a G() {
            r();
            com.google.android.gms.internal.measurement.C6079n2.S((com.google.android.gms.internal.measurement.C6079n2) this.f41216D);
            return this;
        }

        public final java.lang.String H() {
            return ((com.google.android.gms.internal.measurement.C6079n2) this.f41216D).V();
        }

        public final java.lang.String I() {
            return ((com.google.android.gms.internal.measurement.C6079n2) this.f41216D).W();
        }

        public final int v() {
            return ((com.google.android.gms.internal.measurement.C6079n2) this.f41216D).P();
        }

        public final com.google.android.gms.internal.measurement.C6079n2.a w(double d6) {
            r();
            com.google.android.gms.internal.measurement.C6079n2.H((com.google.android.gms.internal.measurement.C6079n2) this.f41216D, d6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6079n2.a x(long j6) {
            r();
            com.google.android.gms.internal.measurement.C6079n2.I((com.google.android.gms.internal.measurement.C6079n2) this.f41216D, j6);
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6079n2.a y(com.google.android.gms.internal.measurement.C6079n2.a aVar) {
            r();
            com.google.android.gms.internal.measurement.C6079n2.J((com.google.android.gms.internal.measurement.C6079n2) this.f41216D, (com.google.android.gms.internal.measurement.C6079n2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
            return this;
        }

        public final com.google.android.gms.internal.measurement.C6079n2.a z(java.lang.Iterable iterable) {
            r();
            com.google.android.gms.internal.measurement.C6079n2.K((com.google.android.gms.internal.measurement.C6079n2) this.f41216D, iterable);
            return this;
        }
    }

    static {
        com.google.android.gms.internal.measurement.C6079n2 c6079n2 = new com.google.android.gms.internal.measurement.C6079n2();
        zzc = c6079n2;
        com.google.android.gms.internal.measurement.AbstractC6130t4.t(com.google.android.gms.internal.measurement.C6079n2.class, c6079n2);
    }

    private C6079n2() {
    }

    static /* synthetic */ void G(com.google.android.gms.internal.measurement.C6079n2 c6079n2) {
        c6079n2.zze &= -17;
        c6079n2.zzj = 0.0d;
    }

    static /* synthetic */ void H(com.google.android.gms.internal.measurement.C6079n2 c6079n2, double d6) {
        c6079n2.zze |= 16;
        c6079n2.zzj = d6;
    }

    static /* synthetic */ void I(com.google.android.gms.internal.measurement.C6079n2 c6079n2, long j6) {
        c6079n2.zze |= 4;
        c6079n2.zzh = j6;
    }

    static /* synthetic */ void J(com.google.android.gms.internal.measurement.C6079n2 c6079n2, com.google.android.gms.internal.measurement.C6079n2 c6079n3) {
        c6079n3.getClass();
        c6079n2.d0();
        c6079n2.zzk.add(c6079n3);
    }

    static /* synthetic */ void K(com.google.android.gms.internal.measurement.C6079n2 c6079n2, java.lang.Iterable iterable) {
        c6079n2.d0();
        com.google.android.gms.internal.measurement.D3.g(iterable, c6079n2.zzk);
    }

    static /* synthetic */ void L(com.google.android.gms.internal.measurement.C6079n2 c6079n2, java.lang.String str) {
        str.getClass();
        c6079n2.zze |= 1;
        c6079n2.zzf = str;
    }

    static /* synthetic */ void N(com.google.android.gms.internal.measurement.C6079n2 c6079n2) {
        c6079n2.zze &= -5;
        c6079n2.zzh = 0L;
    }

    static /* synthetic */ void O(com.google.android.gms.internal.measurement.C6079n2 c6079n2, java.lang.String str) {
        str.getClass();
        c6079n2.zze |= 2;
        c6079n2.zzg = str;
    }

    static /* synthetic */ void Q(com.google.android.gms.internal.measurement.C6079n2 c6079n2) {
        c6079n2.zzk = com.google.android.gms.internal.measurement.AbstractC6130t4.B();
    }

    static /* synthetic */ void S(com.google.android.gms.internal.measurement.C6079n2 c6079n2) {
        c6079n2.zze &= -3;
        c6079n2.zzg = zzc.zzg;
    }

    public static com.google.android.gms.internal.measurement.C6079n2.a T() {
        return (com.google.android.gms.internal.measurement.C6079n2.a) zzc.w();
    }

    private final void d0() {
        com.google.android.gms.internal.measurement.D4 d6 = this.zzk;
        if (d6.c()) {
            return;
        }
        this.zzk = com.google.android.gms.internal.measurement.AbstractC6130t4.p(d6);
    }

    public final double F() {
        return this.zzj;
    }

    public final float M() {
        return this.zzi;
    }

    public final int P() {
        return this.zzk.size();
    }

    public final long R() {
        return this.zzh;
    }

    public final java.lang.String V() {
        return this.zzf;
    }

    public final java.lang.String W() {
        return this.zzg;
    }

    public final java.util.List X() {
        return this.zzk;
    }

    public final boolean Y() {
        return (this.zze & 16) != 0;
    }

    public final boolean Z() {
        return (this.zze & 8) != 0;
    }

    public final boolean a0() {
        return (this.zze & 4) != 0;
    }

    public final boolean b0() {
        return (this.zze & 1) != 0;
    }

    public final boolean c0() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6130t4
    protected final java.lang.Object q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.google.android.gms.internal.measurement.AbstractC6007f2.f40939a[i6 - 1]) {
            case 1:
                return new com.google.android.gms.internal.measurement.C6079n2();
            case 2:
                return new com.google.android.gms.internal.measurement.C6079n2.a();
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC6130t4.r(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new java.lang.Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", com.google.android.gms.internal.measurement.C6079n2.class});
            case 4:
                return zzc;
            case 5:
                com.google.android.gms.internal.measurement.InterfaceC6028h5 aVar = zzd;
                if (aVar == null) {
                    synchronized (com.google.android.gms.internal.measurement.C6079n2.class) {
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
