package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends p158p8.i implements p158p8.q {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final p088i8.f f46921L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static p158p8.r f46922M = new i8.f.a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p158p8.d f46923D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f46924E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private i8.f.c f46925F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.util.List f46926G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private p088i8.h f46927H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private i8.f.d f46928I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private byte f46929J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f46930K;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.f a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.f(eVar, gVar);
        }
    }

    public static final class b extends p8.i.b implements p158p8.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f46931D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private i8.f.c f46932E = i8.f.c.RETURNS_CONSTANT;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private java.util.List f46933F = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private p088i8.h f46934G = p088i8.h.F();

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private i8.f.d f46935H = i8.f.d.AT_MOST_ONCE;

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.f.b t() {
            return new i8.f.b();
        }

        private void u() {
            if ((this.f46931D & 2) != 2) {
                this.f46933F = new java.util.ArrayList(this.f46933F);
                this.f46931D |= 2;
            }
        }

        private void v() {
        }

        public i8.f.b A(i8.f.d dVar) {
            dVar.getClass();
            this.f46931D |= 8;
            this.f46935H = dVar;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public p088i8.f i() {
            p088i8.f fVarQ = q();
            if (fVarQ.d()) {
                return fVarQ;
            }
            throw p158p8.a.AbstractC0680a.j(fVarQ);
        }

        public p088i8.f q() {
            p088i8.f fVar = new p088i8.f(this);
            int i6 = this.f46931D;
            int i10 = (i6 & 1) != 1 ? 0 : 1;
            fVar.f46925F = this.f46932E;
            if ((this.f46931D & 2) == 2) {
                this.f46933F = j$.util.DesugarCollections.unmodifiableList(this.f46933F);
                this.f46931D &= -3;
            }
            fVar.f46926G = this.f46933F;
            if ((i6 & 4) == 4) {
                i10 |= 2;
            }
            fVar.f46927H = this.f46934G;
            if ((i6 & 8) == 8) {
                i10 |= 4;
            }
            fVar.f46928I = this.f46935H;
            fVar.f46924E = i10;
            return fVar;
        }

        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public i8.f.b clone() {
            return t().l(q());
        }

        public i8.f.b w(p088i8.h hVar) {
            if ((this.f46931D & 4) == 4 && this.f46934G != p088i8.h.F()) {
                hVar = p088i8.h.T(this.f46934G).l(hVar).q();
            }
            this.f46934G = hVar;
            this.f46931D |= 4;
            return this;
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public i8.f.b l(p088i8.f fVar) {
            if (fVar == p088i8.f.z()) {
                return this;
            }
            if (fVar.F()) {
                z(fVar.C());
            }
            if (!fVar.f46926G.isEmpty()) {
                if (this.f46933F.isEmpty()) {
                    this.f46933F = fVar.f46926G;
                    this.f46931D &= -3;
                } else {
                    u();
                    this.f46933F.addAll(fVar.f46926G);
                }
            }
            if (fVar.E()) {
                w(fVar.y());
            }
            if (fVar.G()) {
                A(fVar.D());
            }
            m(k().e(fVar.f46923D));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public i8.f.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.f fVar = null;
            try {
                try {
                    p088i8.f fVar2 = (p088i8.f) p088i8.f.f46922M.a(eVar, gVar);
                    if (fVar2 != null) {
                        l(fVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.f fVar3 = (p088i8.f) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        fVar = fVar3;
                        if (fVar != null) {
                            l(fVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (fVar != null) {
                    l(fVar);
                }
                throw th;
            }
        }

        public i8.f.b z(i8.f.c cVar) {
            cVar.getClass();
            this.f46931D |= 1;
            this.f46932E = cVar;
            return this;
        }
    }

    public enum c implements p8.j.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);


        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static p8.j.b f46939G = new i8.f.c.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f46941C;

        static class a implements p8.j.b {
            a() {
            }

            @Override // p8.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i8.f.c a(int i6) {
                return i8.f.c.e(i6);
            }
        }

        c(int i6, int i10) {
            this.f46941C = i10;
        }

        public static i8.f.c e(int i6) {
            if (i6 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i6 == 1) {
                return CALLS;
            }
            if (i6 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // p8.j.a
        public final int c() {
            return this.f46941C;
        }
    }

    public enum d implements p8.j.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);


        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static p8.j.b f46945G = new i8.f.d.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f46947C;

        static class a implements p8.j.b {
            a() {
            }

            @Override // p8.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i8.f.d a(int i6) {
                return i8.f.d.e(i6);
            }
        }

        d(int i6, int i10) {
            this.f46947C = i10;
        }

        public static i8.f.d e(int i6) {
            if (i6 == 0) {
                return AT_MOST_ONCE;
            }
            if (i6 == 1) {
                return EXACTLY_ONCE;
            }
            if (i6 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // p8.j.a
        public final int c() {
            return this.f46947C;
        }
    }

    static {
        p088i8.f fVar = new p088i8.f(true);
        f46921L = fVar;
        fVar.H();
    }

    private f(p158p8.e eVar, p158p8.g gVar) {
        int iM;
        this.f46929J = (byte) -1;
        this.f46930K = -1;
        H();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        char c6 = 0;
        while (!z6) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            iM = eVar.m();
                            i8.f.c cVarE = i8.f.c.e(iM);
                            if (cVarE == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f46924E |= 1;
                                this.f46925F = cVarE;
                            }
                        } else if (iJ == 18) {
                            if ((c6 & 2) != 2) {
                                this.f46926G = new java.util.ArrayList();
                                c6 = 2;
                            }
                            this.f46926G.add(eVar.t(p088i8.h.f46958P, gVar));
                        } else if (iJ == 26) {
                            i8.h.b bVarE = (this.f46924E & 2) == 2 ? this.f46927H.e() : null;
                            p088i8.h hVar = (p088i8.h) eVar.t(p088i8.h.f46958P, gVar);
                            this.f46927H = hVar;
                            if (bVarE != null) {
                                bVarE.l(hVar);
                                this.f46927H = bVarE.q();
                            }
                            this.f46924E |= 2;
                        } else if (iJ == 32) {
                            iM = eVar.m();
                            i8.f.d dVarE = i8.f.d.e(iM);
                            if (dVarE == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f46924E |= 4;
                                this.f46928I = dVarE;
                            }
                        } else if (!p(eVar, fVarI, gVar, iJ)) {
                        }
                    }
                    z6 = true;
                } catch (p158p8.k e6) {
                    throw e6.i(this);
                } catch (java.io.IOException e10) {
                    throw new p158p8.k(e10.getMessage()).i(this);
                }
            } catch (java.lang.Throwable th) {
                if ((c6 & 2) == 2) {
                    this.f46926G = j$.util.DesugarCollections.unmodifiableList(this.f46926G);
                }
                try {
                    fVarI.H();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f46923D = bVarM.o();
                }
                m();
                throw th;
            }
        }
        if ((c6 & 2) == 2) {
            this.f46926G = j$.util.DesugarCollections.unmodifiableList(this.f46926G);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f46923D = bVarM.o();
        }
        m();
    }

    private f(p8.i.b bVar) {
        super(bVar);
        this.f46929J = (byte) -1;
        this.f46930K = -1;
        this.f46923D = bVar.k();
    }

    private f(boolean z6) {
        this.f46929J = (byte) -1;
        this.f46930K = -1;
        this.f46923D = p158p8.d.f52766C;
    }

    private void H() {
        this.f46925F = i8.f.c.RETURNS_CONSTANT;
        this.f46926G = java.util.Collections.emptyList();
        this.f46927H = p088i8.h.F();
        this.f46928I = i8.f.d.AT_MOST_ONCE;
    }

    public static i8.f.b I() {
        return i8.f.b.t();
    }

    public static i8.f.b J(p088i8.f fVar) {
        return I().l(fVar);
    }

    public static p088i8.f z() {
        return f46921L;
    }

    public p088i8.h A(int i6) {
        return (p088i8.h) this.f46926G.get(i6);
    }

    public int B() {
        return this.f46926G.size();
    }

    public i8.f.c C() {
        return this.f46925F;
    }

    public i8.f.d D() {
        return this.f46928I;
    }

    public boolean E() {
        return (this.f46924E & 2) == 2;
    }

    public boolean F() {
        return (this.f46924E & 1) == 1;
    }

    public boolean G() {
        return (this.f46924E & 4) == 4;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public i8.f.b c() {
        return I();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public i8.f.b e() {
        return J(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f46930K;
        if (i6 != -1) {
            return i6;
        }
        int iH = (this.f46924E & 1) == 1 ? p158p8.f.h(1, this.f46925F.c()) : 0;
        for (int i10 = 0; i10 < this.f46926G.size(); i10++) {
            iH += p158p8.f.r(2, (p158p8.p) this.f46926G.get(i10));
        }
        if ((this.f46924E & 2) == 2) {
            iH += p158p8.f.r(3, this.f46927H);
        }
        if ((this.f46924E & 4) == 4) {
            iH += p158p8.f.h(4, this.f46928I.c());
        }
        int size = iH + this.f46923D.size();
        this.f46930K = size;
        return size;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f46929J;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < B(); i6++) {
            if (!A(i6).d()) {
                this.f46929J = (byte) 0;
                return false;
            }
        }
        if (!E() || y().d()) {
            this.f46929J = (byte) 1;
            return true;
        }
        this.f46929J = (byte) 0;
        return false;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        if ((this.f46924E & 1) == 1) {
            fVar.R(1, this.f46925F.c());
        }
        for (int i6 = 0; i6 < this.f46926G.size(); i6++) {
            fVar.c0(2, (p158p8.p) this.f46926G.get(i6));
        }
        if ((this.f46924E & 2) == 2) {
            fVar.c0(3, this.f46927H);
        }
        if ((this.f46924E & 4) == 4) {
            fVar.R(4, this.f46928I.c());
        }
        fVar.h0(this.f46923D);
    }

    public p088i8.h y() {
        return this.f46927H;
    }
}
