package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class A1 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f24997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f24998e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2227Cb f25000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.E0 f25001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5852z1 f25004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f25006m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f24994a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f24995b = new com.google.android.gms.internal.ads.C5128sR(new byte[32768], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5850z0 f24996c = new com.google.android.gms.internal.ads.C5850z0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24999f = 0;

    public A1(int i6) {
    }

    private final long a(com.google.android.gms.internal.ads.C5128sR c5128sR, boolean z6) {
        boolean zC;
        this.f25001h.getClass();
        int iT = c5128sR.t();
        while (iT <= c5128sR.u() - 16) {
            c5128sR.l(iT);
            if (com.google.android.gms.internal.ads.A0.c(c5128sR, this.f25001h, this.f25003j, this.f24996c)) {
                c5128sR.l(iT);
                return this.f24996c.f40186a;
            }
            iT++;
        }
        if (!z6) {
            c5128sR.l(iT);
            return -1L;
        }
        while (iT <= c5128sR.u() - this.f25002i) {
            c5128sR.l(iT);
            try {
                zC = com.google.android.gms.internal.ads.A0.c(c5128sR, this.f25001h, this.f25003j, this.f24996c);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                zC = false;
            }
            if (c5128sR.t() <= c5128sR.u() && zC) {
                c5128sR.l(iT);
                return this.f24996c.f40186a;
            }
            iT++;
        }
        c5128sR.l(c5128sR.u());
        return -1L;
    }

    private final void b() {
        long j6 = this.f25006m * 1000000;
        com.google.android.gms.internal.ads.E0 e6 = this.f25001h;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f24998e.b(j6 / ((long) e6.f26862e), 1, this.f25005l, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        if (j6 == 0) {
            this.f24999f = 0;
        } else {
            com.google.android.gms.internal.ads.C5852z1 c5852z1 = this.f25004k;
            if (c5852z1 != null) {
                c5852z1.d(j10);
            }
        }
        this.f25006m = j10 != 0 ? -1L : 0L;
        this.f25005l = 0;
        this.f24995b.i(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) throws com.google.android.gms.internal.ads.C4708of {
        boolean zP;
        com.google.android.gms.internal.ads.T0 s6;
        boolean z6;
        int i6 = this.f24999f;
        if (i6 == 0) {
            interfaceC5300u0.j();
            long jD = interfaceC5300u0.d();
            com.google.android.gms.internal.ads.C2227Cb c2227CbA = com.google.android.gms.internal.ads.B0.a(interfaceC5300u0, true);
            interfaceC5300u0.I((int) (interfaceC5300u0.d() - jD));
            this.f25000g = c2227CbA;
            this.f24999f = 1;
            return 0;
        }
        if (i6 == 1) {
            interfaceC5300u0.N(this.f24994a, 0, 42);
            interfaceC5300u0.j();
            this.f24999f = 2;
            return 0;
        }
        if (i6 == 2) {
            com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(4);
            interfaceC5300u0.M(c5128sR.n(), 0, 4);
            if (c5128sR.K() != 1716281667) {
                throw com.google.android.gms.internal.ads.C4708of.a("Failed to read FLAC stream marker.", null);
            }
            this.f24999f = 3;
            return 0;
        }
        if (i6 == 3) {
            com.google.android.gms.internal.ads.E0 e0E = this.f25001h;
            do {
                interfaceC5300u0.j();
                com.google.android.gms.internal.ads.RQ rq = new com.google.android.gms.internal.ads.RQ(new byte[4], 4);
                interfaceC5300u0.N(rq.f31264a, 0, 4);
                zP = rq.p();
                int iD = rq.d(7);
                int iD2 = rq.d(24) + 4;
                if (iD == 0) {
                    byte[] bArr = new byte[38];
                    interfaceC5300u0.M(bArr, 0, 38);
                    e0E = new com.google.android.gms.internal.ads.E0(bArr, 4);
                } else {
                    if (e0E == null) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    if (iD == 3) {
                        com.google.android.gms.internal.ads.C5128sR c5128sR2 = new com.google.android.gms.internal.ads.C5128sR(iD2);
                        interfaceC5300u0.M(c5128sR2.n(), 0, iD2);
                        e0E = e0E.f(com.google.android.gms.internal.ads.B0.b(c5128sR2));
                    } else if (iD == 4) {
                        com.google.android.gms.internal.ads.C5128sR c5128sR3 = new com.google.android.gms.internal.ads.C5128sR(iD2);
                        interfaceC5300u0.M(c5128sR3.n(), 0, iD2);
                        c5128sR3.m(4);
                        e0E = e0E.g(java.util.Arrays.asList(com.google.android.gms.internal.ads.AbstractC3765g1.c(c5128sR3, false, false).f34628a));
                    } else if (iD == 6) {
                        com.google.android.gms.internal.ads.C5128sR c5128sR4 = new com.google.android.gms.internal.ads.C5128sR(iD2);
                        interfaceC5300u0.M(c5128sR4.n(), 0, iD2);
                        c5128sR4.m(4);
                        e0E = e0E.e(com.google.android.gms.internal.ads.AbstractC3398ci0.P(com.google.android.gms.internal.ads.W1.a(c5128sR4)));
                    } else {
                        interfaceC5300u0.I(iD2);
                    }
                }
                int i10 = com.google.android.gms.internal.ads.EW.f27061a;
                this.f25001h = e0E;
            } while (!zP);
            e0E.getClass();
            this.f25002i = java.lang.Math.max(e0E.f26860c, 6);
            this.f24998e.c(this.f25001h.c(this.f24994a, this.f25000g));
            this.f24999f = 4;
            return 0;
        }
        if (i6 == 4) {
            interfaceC5300u0.j();
            com.google.android.gms.internal.ads.C5128sR c5128sR5 = new com.google.android.gms.internal.ads.C5128sR(2);
            interfaceC5300u0.N(c5128sR5.n(), 0, 2);
            int iG = c5128sR5.G();
            int i11 = iG >> 2;
            interfaceC5300u0.j();
            if (i11 != 16382) {
                throw com.google.android.gms.internal.ads.C4708of.a("First frame does not start with sync code.", null);
            }
            this.f25003j = iG;
            com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0 = this.f24997d;
            int i12 = com.google.android.gms.internal.ads.EW.f27061a;
            long jE = interfaceC5300u0.e();
            long jF = interfaceC5300u0.f();
            com.google.android.gms.internal.ads.E0 e6 = this.f25001h;
            e6.getClass();
            if (e6.f26868k != null) {
                s6 = new com.google.android.gms.internal.ads.C0(e6, jE);
            } else if (jF == -1 || e6.f26867j <= 0) {
                s6 = new com.google.android.gms.internal.ads.S0(e6.a(), 0L);
            } else {
                com.google.android.gms.internal.ads.C5852z1 c5852z1 = new com.google.android.gms.internal.ads.C5852z1(e6, this.f25003j, jE, jF);
                this.f25004k = c5852z1;
                s6 = c5852z1.b();
            }
            interfaceC5520w0.R(s6);
            this.f24999f = 5;
            return 0;
        }
        this.f24998e.getClass();
        com.google.android.gms.internal.ads.E0 e10 = this.f25001h;
        e10.getClass();
        com.google.android.gms.internal.ads.C5852z1 c5852z2 = this.f25004k;
        if (c5852z2 != null && c5852z2.e()) {
            return c5852z2.a(interfaceC5300u0, q6);
        }
        if (this.f25006m == -1) {
            this.f25006m = com.google.android.gms.internal.ads.A0.b(interfaceC5300u0, e10);
            return 0;
        }
        com.google.android.gms.internal.ads.C5128sR c5128sR6 = this.f24995b;
        int iU = c5128sR6.u();
        if (iU < 32768) {
            int iH = interfaceC5300u0.H(c5128sR6.n(), iU, 32768 - iU);
            z6 = iH == -1;
            if (!z6) {
                this.f24995b.k(iU + iH);
            } else if (this.f24995b.r() == 0) {
                b();
                return -1;
            }
        } else {
            z6 = false;
        }
        com.google.android.gms.internal.ads.C5128sR c5128sR7 = this.f24995b;
        int iT = c5128sR7.t();
        int i13 = this.f25005l;
        int i14 = this.f25002i;
        if (i13 < i14) {
            c5128sR7.m(java.lang.Math.min(i14 - i13, c5128sR7.r()));
        }
        long jA = a(this.f24995b, z6);
        com.google.android.gms.internal.ads.C5128sR c5128sR8 = this.f24995b;
        int iT2 = c5128sR8.t() - iT;
        c5128sR8.l(iT);
        this.f24998e.a(this.f24995b, iT2);
        this.f25005l += iT2;
        if (jA != -1) {
            b();
            this.f25005l = 0;
            this.f25006m = jA;
        }
        com.google.android.gms.internal.ads.C5128sR c5128sR9 = this.f24995b;
        if (c5128sR9.r() >= 16) {
            return 0;
        }
        int iR = c5128sR9.r();
        java.lang.System.arraycopy(c5128sR9.n(), c5128sR9.t(), c5128sR9.n(), 0, iR);
        this.f24995b.l(0);
        this.f24995b.k(iR);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        com.google.android.gms.internal.ads.B0.a(interfaceC5300u0, false);
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(4);
        ((com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0).L(c5128sR.n(), 0, 4, false);
        return c5128sR.K() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f24997d = interfaceC5520w0;
        this.f24998e = interfaceC5520w0.S(0, 1);
        interfaceC5520w0.Q();
    }
}
