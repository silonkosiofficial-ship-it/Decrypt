package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends p8.i.d implements p158p8.q {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final p088i8.s f47217P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static p158p8.r f47218Q = new i8.s.a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p158p8.d f47219E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f47220F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f47221G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f47222H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f47223I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private i8.s.c f47224J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.util.List f47225K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.util.List f47226L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f47227M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private byte f47228N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f47229O;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.s a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.s(eVar, gVar);
        }
    }

    public static final class b extends p8.i.c implements p158p8.q {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f47230F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f47231G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private int f47232H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private boolean f47233I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private i8.s.c f47234J = i8.s.c.INV;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private java.util.List f47235K = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private java.util.List f47236L = java.util.Collections.emptyList();

        private b() {
            A();
        }

        private void A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.s.b x() {
            return new i8.s.b();
        }

        private void y() {
            if ((this.f47230F & 32) != 32) {
                this.f47236L = new java.util.ArrayList(this.f47236L);
                this.f47230F |= 32;
            }
        }

        private void z() {
            if ((this.f47230F & 16) != 16) {
                this.f47235K = new java.util.ArrayList(this.f47235K);
                this.f47230F |= 16;
            }
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public i8.s.b l(p088i8.s sVar) {
            if (sVar == p088i8.s.K()) {
                return this;
            }
            if (sVar.U()) {
                E(sVar.M());
            }
            if (sVar.V()) {
                F(sVar.N());
            }
            if (sVar.W()) {
                G(sVar.O());
            }
            if (sVar.X()) {
                H(sVar.T());
            }
            if (!sVar.f47225K.isEmpty()) {
                if (this.f47235K.isEmpty()) {
                    this.f47235K = sVar.f47225K;
                    this.f47230F &= -17;
                } else {
                    z();
                    this.f47235K.addAll(sVar.f47225K);
                }
            }
            if (!sVar.f47226L.isEmpty()) {
                if (this.f47236L.isEmpty()) {
                    this.f47236L = sVar.f47226L;
                    this.f47230F &= -33;
                } else {
                    y();
                    this.f47236L.addAll(sVar.f47226L);
                }
            }
            r(sVar);
            m(k().e(sVar.f47219E));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public i8.s.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.s sVar = null;
            try {
                try {
                    p088i8.s sVar2 = (p088i8.s) p088i8.s.f47218Q.a(eVar, gVar);
                    if (sVar2 != null) {
                        l(sVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.s sVar3 = (p088i8.s) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        sVar = sVar3;
                        if (sVar != null) {
                            l(sVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (sVar != null) {
                    l(sVar);
                }
                throw th;
            }
        }

        public i8.s.b E(int i6) {
            this.f47230F |= 1;
            this.f47231G = i6;
            return this;
        }

        public i8.s.b F(int i6) {
            this.f47230F |= 2;
            this.f47232H = i6;
            return this;
        }

        public i8.s.b G(boolean z6) {
            this.f47230F |= 4;
            this.f47233I = z6;
            return this;
        }

        public i8.s.b H(i8.s.c cVar) {
            cVar.getClass();
            this.f47230F |= 8;
            this.f47234J = cVar;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public p088i8.s i() {
            p088i8.s sVarV = v();
            if (sVarV.d()) {
                return sVarV;
            }
            throw p158p8.a.AbstractC0680a.j(sVarV);
        }

        public p088i8.s v() {
            p088i8.s sVar = new p088i8.s(this);
            int i6 = this.f47230F;
            int i10 = (i6 & 1) != 1 ? 0 : 1;
            sVar.f47221G = this.f47231G;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            sVar.f47222H = this.f47232H;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            sVar.f47223I = this.f47233I;
            if ((i6 & 8) == 8) {
                i10 |= 8;
            }
            sVar.f47224J = this.f47234J;
            if ((this.f47230F & 16) == 16) {
                this.f47235K = j$.util.DesugarCollections.unmodifiableList(this.f47235K);
                this.f47230F &= -17;
            }
            sVar.f47225K = this.f47235K;
            if ((this.f47230F & 32) == 32) {
                this.f47236L = j$.util.DesugarCollections.unmodifiableList(this.f47236L);
                this.f47230F &= -33;
            }
            sVar.f47226L = this.f47236L;
            sVar.f47220F = i10;
            return sVar;
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.s.b clone() {
            return x().l(v());
        }
    }

    public enum c implements p8.j.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static p8.j.b f47240G = new i8.s.c.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f47242C;

        static class a implements p8.j.b {
            a() {
            }

            @Override // p8.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i8.s.c a(int i6) {
                return i8.s.c.e(i6);
            }
        }

        c(int i6, int i10) {
            this.f47242C = i10;
        }

        public static i8.s.c e(int i6) {
            if (i6 == 0) {
                return IN;
            }
            if (i6 == 1) {
                return OUT;
            }
            if (i6 != 2) {
                return null;
            }
            return INV;
        }

        @Override // p8.j.a
        public final int c() {
            return this.f47242C;
        }
    }

    static {
        p088i8.s sVar = new p088i8.s(true);
        f47217P = sVar;
        sVar.Y();
    }

    private s(p158p8.e eVar, p158p8.g gVar) {
        java.util.List list;
        java.lang.Object objT;
        this.f47227M = -1;
        this.f47228N = (byte) -1;
        this.f47229O = -1;
        Y();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        int i6 = 0;
        while (!z6) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f47220F |= 1;
                            this.f47221G = eVar.r();
                        } else if (iJ == 16) {
                            this.f47220F |= 2;
                            this.f47222H = eVar.r();
                        } else if (iJ == 24) {
                            this.f47220F |= 4;
                            this.f47223I = eVar.j();
                        } else if (iJ != 32) {
                            if (iJ == 42) {
                                if ((i6 & 16) != 16) {
                                    this.f47225K = new java.util.ArrayList();
                                    i6 |= 16;
                                }
                                list = this.f47225K;
                                objT = eVar.t(p088i8.q.f47138X, gVar);
                            } else if (iJ == 48) {
                                if ((i6 & 32) != 32) {
                                    this.f47226L = new java.util.ArrayList();
                                    i6 |= 32;
                                }
                                list = this.f47226L;
                                objT = java.lang.Integer.valueOf(eVar.r());
                            } else if (iJ == 50) {
                                int i10 = eVar.i(eVar.z());
                                if ((i6 & 32) != 32 && eVar.e() > 0) {
                                    this.f47226L = new java.util.ArrayList();
                                    i6 |= 32;
                                }
                                while (eVar.e() > 0) {
                                    this.f47226L.add(java.lang.Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i10);
                            } else if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                            list.add(objT);
                        } else {
                            int iM = eVar.m();
                            i8.s.c cVarE = i8.s.c.e(iM);
                            if (cVarE == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f47220F |= 8;
                                this.f47224J = cVarE;
                            }
                        }
                    }
                    z6 = true;
                } catch (p158p8.k e6) {
                    throw e6.i(this);
                } catch (java.io.IOException e10) {
                    throw new p158p8.k(e10.getMessage()).i(this);
                }
            } catch (java.lang.Throwable th) {
                if ((i6 & 16) == 16) {
                    this.f47225K = j$.util.DesugarCollections.unmodifiableList(this.f47225K);
                }
                if ((i6 & 32) == 32) {
                    this.f47226L = j$.util.DesugarCollections.unmodifiableList(this.f47226L);
                }
                try {
                    fVarI.H();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f47219E = bVarM.o();
                }
                m();
                throw th;
            }
        }
        if ((i6 & 16) == 16) {
            this.f47225K = j$.util.DesugarCollections.unmodifiableList(this.f47225K);
        }
        if ((i6 & 32) == 32) {
            this.f47226L = j$.util.DesugarCollections.unmodifiableList(this.f47226L);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f47219E = bVarM.o();
        }
        m();
    }

    private s(p8.i.c cVar) {
        super(cVar);
        this.f47227M = -1;
        this.f47228N = (byte) -1;
        this.f47229O = -1;
        this.f47219E = cVar.k();
    }

    private s(boolean z6) {
        this.f47227M = -1;
        this.f47228N = (byte) -1;
        this.f47229O = -1;
        this.f47219E = p158p8.d.f52766C;
    }

    public static p088i8.s K() {
        return f47217P;
    }

    private void Y() {
        this.f47221G = 0;
        this.f47222H = 0;
        this.f47223I = false;
        this.f47224J = i8.s.c.INV;
        this.f47225K = java.util.Collections.emptyList();
        this.f47226L = java.util.Collections.emptyList();
    }

    public static i8.s.b Z() {
        return i8.s.b.x();
    }

    public static i8.s.b a0(p088i8.s sVar) {
        return Z().l(sVar);
    }

    @Override // p158p8.q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public p088i8.s a() {
        return f47217P;
    }

    public int M() {
        return this.f47221G;
    }

    public int N() {
        return this.f47222H;
    }

    public boolean O() {
        return this.f47223I;
    }

    public p088i8.q P(int i6) {
        return (p088i8.q) this.f47225K.get(i6);
    }

    public int Q() {
        return this.f47225K.size();
    }

    public java.util.List R() {
        return this.f47226L;
    }

    public java.util.List S() {
        return this.f47225K;
    }

    public i8.s.c T() {
        return this.f47224J;
    }

    public boolean U() {
        return (this.f47220F & 1) == 1;
    }

    public boolean V() {
        return (this.f47220F & 2) == 2;
    }

    public boolean W() {
        return (this.f47220F & 4) == 4;
    }

    public boolean X() {
        return (this.f47220F & 8) == 8;
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47229O;
        if (i6 != -1) {
            return i6;
        }
        int iO = (this.f47220F & 1) == 1 ? p158p8.f.o(1, this.f47221G) : 0;
        if ((this.f47220F & 2) == 2) {
            iO += p158p8.f.o(2, this.f47222H);
        }
        if ((this.f47220F & 4) == 4) {
            iO += p158p8.f.a(3, this.f47223I);
        }
        if ((this.f47220F & 8) == 8) {
            iO += p158p8.f.h(4, this.f47224J.c());
        }
        for (int i10 = 0; i10 < this.f47225K.size(); i10++) {
            iO += p158p8.f.r(5, (p158p8.p) this.f47225K.get(i10));
        }
        int iP = 0;
        for (int i11 = 0; i11 < this.f47226L.size(); i11++) {
            iP += p158p8.f.p(((java.lang.Integer) this.f47226L.get(i11)).intValue());
        }
        int iP2 = iO + iP;
        if (!R().isEmpty()) {
            iP2 = iP2 + 1 + p158p8.f.p(iP);
        }
        this.f47227M = iP;
        int iT = iP2 + t() + this.f47219E.size();
        this.f47229O = iT;
        return iT;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public i8.s.b c() {
        return Z();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public i8.s.b e() {
        return a0(this);
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47228N;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        if (!U()) {
            this.f47228N = (byte) 0;
            return false;
        }
        if (!V()) {
            this.f47228N = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < Q(); i6++) {
            if (!P(i6).d()) {
                this.f47228N = (byte) 0;
                return false;
            }
        }
        if (s()) {
            this.f47228N = (byte) 1;
            return true;
        }
        this.f47228N = (byte) 0;
        return false;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        p8.i.d.a aVarY = y();
        if ((this.f47220F & 1) == 1) {
            fVar.Z(1, this.f47221G);
        }
        if ((this.f47220F & 2) == 2) {
            fVar.Z(2, this.f47222H);
        }
        if ((this.f47220F & 4) == 4) {
            fVar.K(3, this.f47223I);
        }
        if ((this.f47220F & 8) == 8) {
            fVar.R(4, this.f47224J.c());
        }
        for (int i6 = 0; i6 < this.f47225K.size(); i6++) {
            fVar.c0(5, (p158p8.p) this.f47225K.get(i6));
        }
        if (R().size() > 0) {
            fVar.n0(50);
            fVar.n0(this.f47227M);
        }
        for (int i10 = 0; i10 < this.f47226L.size(); i10++) {
            fVar.a0(((java.lang.Integer) this.f47226L.get(i10)).intValue());
        }
        aVarY.a(1000, fVar);
        fVar.h0(this.f47219E);
    }
}
