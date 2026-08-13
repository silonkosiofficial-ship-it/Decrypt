package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends p158p8.i implements p158p8.q {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final p088i8.h f46957O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static p158p8.r f46958P = new i8.h.a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p158p8.d f46959D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f46960E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f46961F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f46962G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private i8.h.c f46963H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p088i8.q f46964I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f46965J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.util.List f46966K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.util.List f46967L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private byte f46968M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f46969N;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.h a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.h(eVar, gVar);
        }
    }

    public static final class b extends p8.i.b implements p158p8.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f46970D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f46971E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f46972F;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private int f46975I;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private i8.h.c f46973G = i8.h.c.TRUE;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private p088i8.q f46974H = p088i8.q.X();

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private java.util.List f46976J = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private java.util.List f46977K = java.util.Collections.emptyList();

        private b() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.h.b t() {
            return new i8.h.b();
        }

        private void u() {
            if ((this.f46970D & 32) != 32) {
                this.f46976J = new java.util.ArrayList(this.f46976J);
                this.f46970D |= 32;
            }
        }

        private void v() {
            if ((this.f46970D & 64) != 64) {
                this.f46977K = new java.util.ArrayList(this.f46977K);
                this.f46970D |= 64;
            }
        }

        private void w() {
        }

        public i8.h.b A(i8.h.c cVar) {
            cVar.getClass();
            this.f46970D |= 4;
            this.f46973G = cVar;
            return this;
        }

        public i8.h.b B(int i6) {
            this.f46970D |= 1;
            this.f46971E = i6;
            return this;
        }

        public i8.h.b C(int i6) {
            this.f46970D |= 16;
            this.f46975I = i6;
            return this;
        }

        public i8.h.b E(int i6) {
            this.f46970D |= 2;
            this.f46972F = i6;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public p088i8.h i() {
            p088i8.h hVarQ = q();
            if (hVarQ.d()) {
                return hVarQ;
            }
            throw p158p8.a.AbstractC0680a.j(hVarQ);
        }

        public p088i8.h q() {
            p088i8.h hVar = new p088i8.h(this);
            int i6 = this.f46970D;
            int i10 = (i6 & 1) != 1 ? 0 : 1;
            hVar.f46961F = this.f46971E;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            hVar.f46962G = this.f46972F;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            hVar.f46963H = this.f46973G;
            if ((i6 & 8) == 8) {
                i10 |= 8;
            }
            hVar.f46964I = this.f46974H;
            if ((i6 & 16) == 16) {
                i10 |= 16;
            }
            hVar.f46965J = this.f46975I;
            if ((this.f46970D & 32) == 32) {
                this.f46976J = j$.util.DesugarCollections.unmodifiableList(this.f46976J);
                this.f46970D &= -33;
            }
            hVar.f46966K = this.f46976J;
            if ((this.f46970D & 64) == 64) {
                this.f46977K = j$.util.DesugarCollections.unmodifiableList(this.f46977K);
                this.f46970D &= -65;
            }
            hVar.f46967L = this.f46977K;
            hVar.f46960E = i10;
            return hVar;
        }

        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public i8.h.b clone() {
            return t().l(q());
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public i8.h.b l(p088i8.h hVar) {
            if (hVar == p088i8.h.F()) {
                return this;
            }
            if (hVar.N()) {
                B(hVar.G());
            }
            if (hVar.Q()) {
                E(hVar.L());
            }
            if (hVar.M()) {
                A(hVar.E());
            }
            if (hVar.O()) {
                z(hVar.H());
            }
            if (hVar.P()) {
                C(hVar.I());
            }
            if (!hVar.f46966K.isEmpty()) {
                if (this.f46976J.isEmpty()) {
                    this.f46976J = hVar.f46966K;
                    this.f46970D &= -33;
                } else {
                    u();
                    this.f46976J.addAll(hVar.f46966K);
                }
            }
            if (!hVar.f46967L.isEmpty()) {
                if (this.f46977K.isEmpty()) {
                    this.f46977K = hVar.f46967L;
                    this.f46970D &= -65;
                } else {
                    v();
                    this.f46977K.addAll(hVar.f46967L);
                }
            }
            m(k().e(hVar.f46959D));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public i8.h.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.h hVar = null;
            try {
                try {
                    p088i8.h hVar2 = (p088i8.h) p088i8.h.f46958P.a(eVar, gVar);
                    if (hVar2 != null) {
                        l(hVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.h hVar3 = (p088i8.h) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        hVar = hVar3;
                        if (hVar != null) {
                            l(hVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (hVar != null) {
                    l(hVar);
                }
                throw th;
            }
        }

        public i8.h.b z(p088i8.q qVar) {
            if ((this.f46970D & 8) == 8 && this.f46974H != p088i8.q.X()) {
                qVar = p088i8.q.z0(this.f46974H).l(qVar).v();
            }
            this.f46974H = qVar;
            this.f46970D |= 8;
            return this;
        }
    }

    public enum c implements p8.j.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);


        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static p8.j.b f46981G = new i8.h.c.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f46983C;

        static class a implements p8.j.b {
            a() {
            }

            @Override // p8.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i8.h.c a(int i6) {
                return i8.h.c.e(i6);
            }
        }

        c(int i6, int i10) {
            this.f46983C = i10;
        }

        public static i8.h.c e(int i6) {
            if (i6 == 0) {
                return TRUE;
            }
            if (i6 == 1) {
                return FALSE;
            }
            if (i6 != 2) {
                return null;
            }
            return NULL;
        }

        @Override // p8.j.a
        public final int c() {
            return this.f46983C;
        }
    }

    static {
        p088i8.h hVar = new p088i8.h(true);
        f46957O = hVar;
        hVar.R();
    }

    private h(p158p8.e eVar, p158p8.g gVar) {
        java.util.List list;
        p158p8.p pVarT;
        this.f46968M = (byte) -1;
        this.f46969N = -1;
        R();
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
                            this.f46960E |= 1;
                            this.f46961F = eVar.r();
                        } else if (iJ == 16) {
                            this.f46960E |= 2;
                            this.f46962G = eVar.r();
                        } else if (iJ == 24) {
                            int iM = eVar.m();
                            i8.h.c cVarE = i8.h.c.e(iM);
                            if (cVarE == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f46960E |= 4;
                                this.f46963H = cVarE;
                            }
                        } else if (iJ == 34) {
                            i8.q.c cVarE2 = (this.f46960E & 8) == 8 ? this.f46964I.e() : null;
                            p088i8.q qVar = (p088i8.q) eVar.t(p088i8.q.f47138X, gVar);
                            this.f46964I = qVar;
                            if (cVarE2 != null) {
                                cVarE2.l(qVar);
                                this.f46964I = cVarE2.v();
                            }
                            this.f46960E |= 8;
                        } else if (iJ != 40) {
                            if (iJ == 50) {
                                if ((i6 & 32) != 32) {
                                    this.f46966K = new java.util.ArrayList();
                                    i6 |= 32;
                                }
                                list = this.f46966K;
                                pVarT = eVar.t(f46958P, gVar);
                            } else if (iJ == 58) {
                                if ((i6 & 64) != 64) {
                                    this.f46967L = new java.util.ArrayList();
                                    i6 |= 64;
                                }
                                list = this.f46967L;
                                pVarT = eVar.t(f46958P, gVar);
                            } else if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                            list.add(pVarT);
                        } else {
                            this.f46960E |= 16;
                            this.f46965J = eVar.r();
                        }
                    }
                    z6 = true;
                } catch (p158p8.k e6) {
                    throw e6.i(this);
                } catch (java.io.IOException e10) {
                    throw new p158p8.k(e10.getMessage()).i(this);
                }
            } catch (java.lang.Throwable th) {
                if ((i6 & 32) == 32) {
                    this.f46966K = j$.util.DesugarCollections.unmodifiableList(this.f46966K);
                }
                if ((i6 & 64) == 64) {
                    this.f46967L = j$.util.DesugarCollections.unmodifiableList(this.f46967L);
                }
                try {
                    fVarI.H();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f46959D = bVarM.o();
                }
                m();
                throw th;
            }
        }
        if ((i6 & 32) == 32) {
            this.f46966K = j$.util.DesugarCollections.unmodifiableList(this.f46966K);
        }
        if ((i6 & 64) == 64) {
            this.f46967L = j$.util.DesugarCollections.unmodifiableList(this.f46967L);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f46959D = bVarM.o();
        }
        m();
    }

    private h(p8.i.b bVar) {
        super(bVar);
        this.f46968M = (byte) -1;
        this.f46969N = -1;
        this.f46959D = bVar.k();
    }

    private h(boolean z6) {
        this.f46968M = (byte) -1;
        this.f46969N = -1;
        this.f46959D = p158p8.d.f52766C;
    }

    public static p088i8.h F() {
        return f46957O;
    }

    private void R() {
        this.f46961F = 0;
        this.f46962G = 0;
        this.f46963H = i8.h.c.TRUE;
        this.f46964I = p088i8.q.X();
        this.f46965J = 0;
        this.f46966K = java.util.Collections.emptyList();
        this.f46967L = java.util.Collections.emptyList();
    }

    public static i8.h.b S() {
        return i8.h.b.t();
    }

    public static i8.h.b T(p088i8.h hVar) {
        return S().l(hVar);
    }

    public p088i8.h C(int i6) {
        return (p088i8.h) this.f46966K.get(i6);
    }

    public int D() {
        return this.f46966K.size();
    }

    public i8.h.c E() {
        return this.f46963H;
    }

    public int G() {
        return this.f46961F;
    }

    public p088i8.q H() {
        return this.f46964I;
    }

    public int I() {
        return this.f46965J;
    }

    public p088i8.h J(int i6) {
        return (p088i8.h) this.f46967L.get(i6);
    }

    public int K() {
        return this.f46967L.size();
    }

    public int L() {
        return this.f46962G;
    }

    public boolean M() {
        return (this.f46960E & 4) == 4;
    }

    public boolean N() {
        return (this.f46960E & 1) == 1;
    }

    public boolean O() {
        return (this.f46960E & 8) == 8;
    }

    public boolean P() {
        return (this.f46960E & 16) == 16;
    }

    public boolean Q() {
        return (this.f46960E & 2) == 2;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public i8.h.b c() {
        return S();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public i8.h.b e() {
        return T(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f46969N;
        if (i6 != -1) {
            return i6;
        }
        int iO = (this.f46960E & 1) == 1 ? p158p8.f.o(1, this.f46961F) : 0;
        if ((this.f46960E & 2) == 2) {
            iO += p158p8.f.o(2, this.f46962G);
        }
        if ((this.f46960E & 4) == 4) {
            iO += p158p8.f.h(3, this.f46963H.c());
        }
        if ((this.f46960E & 8) == 8) {
            iO += p158p8.f.r(4, this.f46964I);
        }
        if ((this.f46960E & 16) == 16) {
            iO += p158p8.f.o(5, this.f46965J);
        }
        for (int i10 = 0; i10 < this.f46966K.size(); i10++) {
            iO += p158p8.f.r(6, (p158p8.p) this.f46966K.get(i10));
        }
        for (int i11 = 0; i11 < this.f46967L.size(); i11++) {
            iO += p158p8.f.r(7, (p158p8.p) this.f46967L.get(i11));
        }
        int size = iO + this.f46959D.size();
        this.f46969N = size;
        return size;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f46968M;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        if (O() && !H().d()) {
            this.f46968M = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < D(); i6++) {
            if (!C(i6).d()) {
                this.f46968M = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < K(); i10++) {
            if (!J(i10).d()) {
                this.f46968M = (byte) 0;
                return false;
            }
        }
        this.f46968M = (byte) 1;
        return true;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        if ((this.f46960E & 1) == 1) {
            fVar.Z(1, this.f46961F);
        }
        if ((this.f46960E & 2) == 2) {
            fVar.Z(2, this.f46962G);
        }
        if ((this.f46960E & 4) == 4) {
            fVar.R(3, this.f46963H.c());
        }
        if ((this.f46960E & 8) == 8) {
            fVar.c0(4, this.f46964I);
        }
        if ((this.f46960E & 16) == 16) {
            fVar.Z(5, this.f46965J);
        }
        for (int i6 = 0; i6 < this.f46966K.size(); i6++) {
            fVar.c0(6, (p158p8.p) this.f46966K.get(i6));
        }
        for (int i10 = 0; i10 < this.f46967L.size(); i10++) {
            fVar.c0(7, (p158p8.p) this.f46967L.get(i10));
        }
        fVar.h0(this.f46959D);
    }
}
