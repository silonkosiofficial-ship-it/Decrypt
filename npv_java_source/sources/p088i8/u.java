package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends p8.i.d implements p158p8.q {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final p088i8.u f47254O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static p158p8.r f47255P = new i8.u.a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p158p8.d f47256E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f47257F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f47258G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f47259H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p088i8.q f47260I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f47261J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private p088i8.q f47262K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f47263L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private byte f47264M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f47265N;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.u a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.u(eVar, gVar);
        }
    }

    public static final class b extends p8.i.c implements p158p8.q {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f47266F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f47267G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private int f47268H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private int f47270J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private int f47272L;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private p088i8.q f47269I = p088i8.q.X();

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private p088i8.q f47271K = p088i8.q.X();

        private b() {
            y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.u.b x() {
            return new i8.u.b();
        }

        private void y() {
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public i8.u.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.u uVar = null;
            try {
                try {
                    p088i8.u uVar2 = (p088i8.u) p088i8.u.f47255P.a(eVar, gVar);
                    if (uVar2 != null) {
                        l(uVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.u uVar3 = (p088i8.u) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        uVar = uVar3;
                        if (uVar != null) {
                            l(uVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (uVar != null) {
                    l(uVar);
                }
                throw th;
            }
        }

        public i8.u.b B(p088i8.q qVar) {
            if ((this.f47266F & 4) == 4 && this.f47269I != p088i8.q.X()) {
                qVar = p088i8.q.z0(this.f47269I).l(qVar).v();
            }
            this.f47269I = qVar;
            this.f47266F |= 4;
            return this;
        }

        public i8.u.b C(p088i8.q qVar) {
            if ((this.f47266F & 16) == 16 && this.f47271K != p088i8.q.X()) {
                qVar = p088i8.q.z0(this.f47271K).l(qVar).v();
            }
            this.f47271K = qVar;
            this.f47266F |= 16;
            return this;
        }

        public i8.u.b E(int i6) {
            this.f47266F |= 1;
            this.f47267G = i6;
            return this;
        }

        public i8.u.b F(int i6) {
            this.f47266F |= 2;
            this.f47268H = i6;
            return this;
        }

        public i8.u.b G(int i6) {
            this.f47266F |= 8;
            this.f47270J = i6;
            return this;
        }

        public i8.u.b H(int i6) {
            this.f47266F |= 32;
            this.f47272L = i6;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public p088i8.u i() {
            p088i8.u uVarV = v();
            if (uVarV.d()) {
                return uVarV;
            }
            throw p158p8.a.AbstractC0680a.j(uVarV);
        }

        public p088i8.u v() {
            p088i8.u uVar = new p088i8.u(this);
            int i6 = this.f47266F;
            int i10 = (i6 & 1) != 1 ? 0 : 1;
            uVar.f47258G = this.f47267G;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            uVar.f47259H = this.f47268H;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            uVar.f47260I = this.f47269I;
            if ((i6 & 8) == 8) {
                i10 |= 8;
            }
            uVar.f47261J = this.f47270J;
            if ((i6 & 16) == 16) {
                i10 |= 16;
            }
            uVar.f47262K = this.f47271K;
            if ((i6 & 32) == 32) {
                i10 |= 32;
            }
            uVar.f47263L = this.f47272L;
            uVar.f47257F = i10;
            return uVar;
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.u.b clone() {
            return x().l(v());
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public i8.u.b l(p088i8.u uVar) {
            if (uVar == p088i8.u.I()) {
                return this;
            }
            if (uVar.Q()) {
                E(uVar.K());
            }
            if (uVar.R()) {
                F(uVar.L());
            }
            if (uVar.S()) {
                B(uVar.M());
            }
            if (uVar.T()) {
                G(uVar.N());
            }
            if (uVar.U()) {
                C(uVar.O());
            }
            if (uVar.V()) {
                H(uVar.P());
            }
            r(uVar);
            m(k().e(uVar.f47256E));
            return this;
        }
    }

    static {
        p088i8.u uVar = new p088i8.u(true);
        f47254O = uVar;
        uVar.W();
    }

    private u(p158p8.e eVar, p158p8.g gVar) {
        i8.q.c cVarE;
        this.f47264M = (byte) -1;
        this.f47265N = -1;
        W();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        while (!z6) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f47257F |= 1;
                            this.f47258G = eVar.r();
                        } else if (iJ != 16) {
                            if (iJ == 26) {
                                cVarE = (this.f47257F & 4) == 4 ? this.f47260I.e() : null;
                                p088i8.q qVar = (p088i8.q) eVar.t(p088i8.q.f47138X, gVar);
                                this.f47260I = qVar;
                                if (cVarE != null) {
                                    cVarE.l(qVar);
                                    this.f47260I = cVarE.v();
                                }
                                this.f47257F |= 4;
                            } else if (iJ == 34) {
                                cVarE = (this.f47257F & 16) == 16 ? this.f47262K.e() : null;
                                p088i8.q qVar2 = (p088i8.q) eVar.t(p088i8.q.f47138X, gVar);
                                this.f47262K = qVar2;
                                if (cVarE != null) {
                                    cVarE.l(qVar2);
                                    this.f47262K = cVarE.v();
                                }
                                this.f47257F |= 16;
                            } else if (iJ == 40) {
                                this.f47257F |= 8;
                                this.f47261J = eVar.r();
                            } else if (iJ == 48) {
                                this.f47257F |= 32;
                                this.f47263L = eVar.r();
                            } else if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            this.f47257F |= 2;
                            this.f47259H = eVar.r();
                        }
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    try {
                        fVarI.H();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f47256E = bVarM.o();
                    }
                    m();
                    throw th;
                }
            } catch (p158p8.k e6) {
                throw e6.i(this);
            } catch (java.io.IOException e10) {
                throw new p158p8.k(e10.getMessage()).i(this);
            }
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f47256E = bVarM.o();
        }
        m();
    }

    private u(p8.i.c cVar) {
        super(cVar);
        this.f47264M = (byte) -1;
        this.f47265N = -1;
        this.f47256E = cVar.k();
    }

    private u(boolean z6) {
        this.f47264M = (byte) -1;
        this.f47265N = -1;
        this.f47256E = p158p8.d.f52766C;
    }

    public static p088i8.u I() {
        return f47254O;
    }

    private void W() {
        this.f47258G = 0;
        this.f47259H = 0;
        this.f47260I = p088i8.q.X();
        this.f47261J = 0;
        this.f47262K = p088i8.q.X();
        this.f47263L = 0;
    }

    public static i8.u.b X() {
        return i8.u.b.x();
    }

    public static i8.u.b Y(p088i8.u uVar) {
        return X().l(uVar);
    }

    @Override // p158p8.q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public p088i8.u a() {
        return f47254O;
    }

    public int K() {
        return this.f47258G;
    }

    public int L() {
        return this.f47259H;
    }

    public p088i8.q M() {
        return this.f47260I;
    }

    public int N() {
        return this.f47261J;
    }

    public p088i8.q O() {
        return this.f47262K;
    }

    public int P() {
        return this.f47263L;
    }

    public boolean Q() {
        return (this.f47257F & 1) == 1;
    }

    public boolean R() {
        return (this.f47257F & 2) == 2;
    }

    public boolean S() {
        return (this.f47257F & 4) == 4;
    }

    public boolean T() {
        return (this.f47257F & 8) == 8;
    }

    public boolean U() {
        return (this.f47257F & 16) == 16;
    }

    public boolean V() {
        return (this.f47257F & 32) == 32;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public i8.u.b c() {
        return X();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public i8.u.b e() {
        return Y(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47265N;
        if (i6 != -1) {
            return i6;
        }
        int iO = (this.f47257F & 1) == 1 ? p158p8.f.o(1, this.f47258G) : 0;
        if ((this.f47257F & 2) == 2) {
            iO += p158p8.f.o(2, this.f47259H);
        }
        if ((this.f47257F & 4) == 4) {
            iO += p158p8.f.r(3, this.f47260I);
        }
        if ((this.f47257F & 16) == 16) {
            iO += p158p8.f.r(4, this.f47262K);
        }
        if ((this.f47257F & 8) == 8) {
            iO += p158p8.f.o(5, this.f47261J);
        }
        if ((this.f47257F & 32) == 32) {
            iO += p158p8.f.o(6, this.f47263L);
        }
        int iT = iO + t() + this.f47256E.size();
        this.f47265N = iT;
        return iT;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47264M;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        if (!R()) {
            this.f47264M = (byte) 0;
            return false;
        }
        if (S() && !M().d()) {
            this.f47264M = (byte) 0;
            return false;
        }
        if (U() && !O().d()) {
            this.f47264M = (byte) 0;
            return false;
        }
        if (s()) {
            this.f47264M = (byte) 1;
            return true;
        }
        this.f47264M = (byte) 0;
        return false;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        p8.i.d.a aVarY = y();
        if ((this.f47257F & 1) == 1) {
            fVar.Z(1, this.f47258G);
        }
        if ((this.f47257F & 2) == 2) {
            fVar.Z(2, this.f47259H);
        }
        if ((this.f47257F & 4) == 4) {
            fVar.c0(3, this.f47260I);
        }
        if ((this.f47257F & 16) == 16) {
            fVar.c0(4, this.f47262K);
        }
        if ((this.f47257F & 8) == 8) {
            fVar.Z(5, this.f47261J);
        }
        if ((this.f47257F & 32) == 32) {
            fVar.Z(6, this.f47263L);
        }
        aVarY.a(200, fVar);
        fVar.h0(this.f47256E);
    }
}
