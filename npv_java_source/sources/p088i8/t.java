package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends p158p8.i implements p158p8.q {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final p088i8.t f47243J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static p158p8.r f47244K = new i8.t.a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p158p8.d f47245D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f47246E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.util.List f47247F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f47248G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private byte f47249H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f47250I;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.t a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.t(eVar, gVar);
        }
    }

    public static final class b extends p8.i.b implements p158p8.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f47251D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private java.util.List f47252E = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f47253F = -1;

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.t.b t() {
            return new i8.t.b();
        }

        private void u() {
            if ((this.f47251D & 1) != 1) {
                this.f47252E = new java.util.ArrayList(this.f47252E);
                this.f47251D |= 1;
            }
        }

        private void v() {
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public p088i8.t i() {
            p088i8.t tVarQ = q();
            if (tVarQ.d()) {
                return tVarQ;
            }
            throw p158p8.a.AbstractC0680a.j(tVarQ);
        }

        public p088i8.t q() {
            p088i8.t tVar = new p088i8.t(this);
            int i6 = this.f47251D;
            if ((i6 & 1) == 1) {
                this.f47252E = j$.util.DesugarCollections.unmodifiableList(this.f47252E);
                this.f47251D &= -2;
            }
            tVar.f47247F = this.f47252E;
            int i10 = (i6 & 2) != 2 ? 0 : 1;
            tVar.f47248G = this.f47253F;
            tVar.f47246E = i10;
            return tVar;
        }

        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public i8.t.b clone() {
            return t().l(q());
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.t.b l(p088i8.t tVar) {
            if (tVar == p088i8.t.w()) {
                return this;
            }
            if (!tVar.f47247F.isEmpty()) {
                if (this.f47252E.isEmpty()) {
                    this.f47252E = tVar.f47247F;
                    this.f47251D &= -2;
                } else {
                    u();
                    this.f47252E.addAll(tVar.f47247F);
                }
            }
            if (tVar.B()) {
                y(tVar.x());
            }
            m(k().e(tVar.f47245D));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public i8.t.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.t tVar = null;
            try {
                try {
                    p088i8.t tVar2 = (p088i8.t) p088i8.t.f47244K.a(eVar, gVar);
                    if (tVar2 != null) {
                        l(tVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.t tVar3 = (p088i8.t) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        tVar = tVar3;
                        if (tVar != null) {
                            l(tVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (tVar != null) {
                    l(tVar);
                }
                throw th;
            }
        }

        public i8.t.b y(int i6) {
            this.f47251D |= 2;
            this.f47253F = i6;
            return this;
        }
    }

    static {
        p088i8.t tVar = new p088i8.t(true);
        f47243J = tVar;
        tVar.C();
    }

    private t(p158p8.e eVar, p158p8.g gVar) {
        this.f47249H = (byte) -1;
        this.f47250I = -1;
        C();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        boolean z10 = false;
        while (!z6) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            if (!z10) {
                                this.f47247F = new java.util.ArrayList();
                                z10 = true;
                            }
                            this.f47247F.add(eVar.t(p088i8.q.f47138X, gVar));
                        } else if (iJ == 16) {
                            this.f47246E |= 1;
                            this.f47248G = eVar.r();
                        } else if (!p(eVar, fVarI, gVar, iJ)) {
                        }
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    if (z10) {
                        this.f47247F = j$.util.DesugarCollections.unmodifiableList(this.f47247F);
                    }
                    try {
                        fVarI.H();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f47245D = bVarM.o();
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
        if (z10) {
            this.f47247F = j$.util.DesugarCollections.unmodifiableList(this.f47247F);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f47245D = bVarM.o();
        }
        m();
    }

    private t(p8.i.b bVar) {
        super(bVar);
        this.f47249H = (byte) -1;
        this.f47250I = -1;
        this.f47245D = bVar.k();
    }

    private t(boolean z6) {
        this.f47249H = (byte) -1;
        this.f47250I = -1;
        this.f47245D = p158p8.d.f52766C;
    }

    private void C() {
        this.f47247F = java.util.Collections.emptyList();
        this.f47248G = -1;
    }

    public static i8.t.b D() {
        return i8.t.b.t();
    }

    public static i8.t.b E(p088i8.t tVar) {
        return D().l(tVar);
    }

    public static p088i8.t w() {
        return f47243J;
    }

    public java.util.List A() {
        return this.f47247F;
    }

    public boolean B() {
        return (this.f47246E & 1) == 1;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public i8.t.b c() {
        return D();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public i8.t.b e() {
        return E(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47250I;
        if (i6 != -1) {
            return i6;
        }
        int iO = 0;
        for (int i10 = 0; i10 < this.f47247F.size(); i10++) {
            iO += p158p8.f.r(1, (p158p8.p) this.f47247F.get(i10));
        }
        if ((this.f47246E & 1) == 1) {
            iO += p158p8.f.o(2, this.f47248G);
        }
        int size = iO + this.f47245D.size();
        this.f47250I = size;
        return size;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47249H;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < z(); i6++) {
            if (!y(i6).d()) {
                this.f47249H = (byte) 0;
                return false;
            }
        }
        this.f47249H = (byte) 1;
        return true;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        for (int i6 = 0; i6 < this.f47247F.size(); i6++) {
            fVar.c0(1, (p158p8.p) this.f47247F.get(i6));
        }
        if ((this.f47246E & 1) == 1) {
            fVar.Z(2, this.f47248G);
        }
        fVar.h0(this.f47245D);
    }

    public int x() {
        return this.f47248G;
    }

    public p088i8.q y(int i6) {
        return (p088i8.q) this.f47247F.get(i6);
    }

    public int z() {
        return this.f47247F.size();
    }
}
