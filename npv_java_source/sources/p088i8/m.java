package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends p8.i.d implements p158p8.q {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final p088i8.m f47051M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static p158p8.r f47052N = new i8.m.a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p158p8.d f47053E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f47054F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p088i8.p f47055G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private p088i8.o f47056H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p088i8.l f47057I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.util.List f47058J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private byte f47059K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f47060L;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.m a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.m(eVar, gVar);
        }
    }

    public static final class b extends p8.i.c implements p158p8.q {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f47061F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private p088i8.p f47062G = p088i8.p.u();

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private p088i8.o f47063H = p088i8.o.u();

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private p088i8.l f47064I = p088i8.l.K();

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private java.util.List f47065J = java.util.Collections.emptyList();

        private b() {
            z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.m.b x() {
            return new i8.m.b();
        }

        private void y() {
            if ((this.f47061F & 8) != 8) {
                this.f47065J = new java.util.ArrayList(this.f47065J);
                this.f47061F |= 8;
            }
        }

        private void z() {
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public i8.m.b l(p088i8.m mVar) {
            if (mVar == p088i8.m.K()) {
                return this;
            }
            if (mVar.R()) {
                F(mVar.O());
            }
            if (mVar.Q()) {
                E(mVar.N());
            }
            if (mVar.P()) {
                C(mVar.M());
            }
            if (!mVar.f47058J.isEmpty()) {
                if (this.f47065J.isEmpty()) {
                    this.f47065J = mVar.f47058J;
                    this.f47061F &= -9;
                } else {
                    y();
                    this.f47065J.addAll(mVar.f47058J);
                }
            }
            r(mVar);
            m(k().e(mVar.f47053E));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public i8.m.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.m mVar = null;
            try {
                try {
                    p088i8.m mVar2 = (p088i8.m) p088i8.m.f47052N.a(eVar, gVar);
                    if (mVar2 != null) {
                        l(mVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.m mVar3 = (p088i8.m) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        mVar = mVar3;
                        if (mVar != null) {
                            l(mVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (mVar != null) {
                    l(mVar);
                }
                throw th;
            }
        }

        public i8.m.b C(p088i8.l lVar) {
            if ((this.f47061F & 4) == 4 && this.f47064I != p088i8.l.K()) {
                lVar = p088i8.l.b0(this.f47064I).l(lVar).v();
            }
            this.f47064I = lVar;
            this.f47061F |= 4;
            return this;
        }

        public i8.m.b E(p088i8.o oVar) {
            if ((this.f47061F & 2) == 2 && this.f47063H != p088i8.o.u()) {
                oVar = p088i8.o.z(this.f47063H).l(oVar).q();
            }
            this.f47063H = oVar;
            this.f47061F |= 2;
            return this;
        }

        public i8.m.b F(p088i8.p pVar) {
            if ((this.f47061F & 1) == 1 && this.f47062G != p088i8.p.u()) {
                pVar = p088i8.p.z(this.f47062G).l(pVar).q();
            }
            this.f47062G = pVar;
            this.f47061F |= 1;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public p088i8.m i() {
            p088i8.m mVarV = v();
            if (mVarV.d()) {
                return mVarV;
            }
            throw p158p8.a.AbstractC0680a.j(mVarV);
        }

        public p088i8.m v() {
            p088i8.m mVar = new p088i8.m(this);
            int i6 = this.f47061F;
            int i10 = (i6 & 1) != 1 ? 0 : 1;
            mVar.f47055G = this.f47062G;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            mVar.f47056H = this.f47063H;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            mVar.f47057I = this.f47064I;
            if ((this.f47061F & 8) == 8) {
                this.f47065J = j$.util.DesugarCollections.unmodifiableList(this.f47065J);
                this.f47061F &= -9;
            }
            mVar.f47058J = this.f47065J;
            mVar.f47054F = i10;
            return mVar;
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.m.b clone() {
            return x().l(v());
        }
    }

    static {
        p088i8.m mVar = new p088i8.m(true);
        f47051M = mVar;
        mVar.S();
    }

    private m(p158p8.e eVar, p158p8.g gVar) {
        int i6;
        int i10;
        this.f47059K = (byte) -1;
        this.f47060L = -1;
        S();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        char c6 = 0;
        while (!z6) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ != 10) {
                            if (iJ == 18) {
                                i6 = 2;
                                i8.o.b bVarE = (this.f47054F & 2) == 2 ? this.f47056H.e() : null;
                                p088i8.o oVar = (p088i8.o) eVar.t(p088i8.o.f47103I, gVar);
                                this.f47056H = oVar;
                                if (bVarE != null) {
                                    bVarE.l(oVar);
                                    this.f47056H = bVarE.q();
                                }
                                i10 = this.f47054F;
                            } else if (iJ == 26) {
                                i6 = 4;
                                i8.l.b bVarE2 = (this.f47054F & 4) == 4 ? this.f47057I.e() : null;
                                p088i8.l lVar = (p088i8.l) eVar.t(p088i8.l.f47035O, gVar);
                                this.f47057I = lVar;
                                if (bVarE2 != null) {
                                    bVarE2.l(lVar);
                                    this.f47057I = bVarE2.v();
                                }
                                i10 = this.f47054F;
                            } else if (iJ == 34) {
                                int i11 = (c6 == true ? 1 : 0) & '\b';
                                c6 = c6;
                                if (i11 != 8) {
                                    this.f47058J = new java.util.ArrayList();
                                    c6 = '\b';
                                }
                                this.f47058J.add(eVar.t(p088i8.c.f46830n0, gVar));
                            } else if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                            this.f47054F = i10 | i6;
                        } else {
                            i8.p.b bVarE3 = (this.f47054F & 1) == 1 ? this.f47055G.e() : null;
                            p088i8.p pVar = (p088i8.p) eVar.t(p088i8.p.f47130I, gVar);
                            this.f47055G = pVar;
                            if (bVarE3 != null) {
                                bVarE3.l(pVar);
                                this.f47055G = bVarE3.q();
                            }
                            this.f47054F |= 1;
                        }
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    if (((c6 == true ? 1 : 0) & '\b') == 8) {
                        this.f47058J = j$.util.DesugarCollections.unmodifiableList(this.f47058J);
                    }
                    try {
                        fVarI.H();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f47053E = bVarM.o();
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
        if (((c6 == true ? 1 : 0) & '\b') == 8) {
            this.f47058J = j$.util.DesugarCollections.unmodifiableList(this.f47058J);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f47053E = bVarM.o();
        }
        m();
    }

    private m(p8.i.c cVar) {
        super(cVar);
        this.f47059K = (byte) -1;
        this.f47060L = -1;
        this.f47053E = cVar.k();
    }

    private m(boolean z6) {
        this.f47059K = (byte) -1;
        this.f47060L = -1;
        this.f47053E = p158p8.d.f52766C;
    }

    public static p088i8.m K() {
        return f47051M;
    }

    private void S() {
        this.f47055G = p088i8.p.u();
        this.f47056H = p088i8.o.u();
        this.f47057I = p088i8.l.K();
        this.f47058J = java.util.Collections.emptyList();
    }

    public static i8.m.b T() {
        return i8.m.b.x();
    }

    public static i8.m.b U(p088i8.m mVar) {
        return T().l(mVar);
    }

    public static p088i8.m W(java.io.InputStream inputStream, p158p8.g gVar) {
        return (p088i8.m) f47052N.c(inputStream, gVar);
    }

    public p088i8.c H(int i6) {
        return (p088i8.c) this.f47058J.get(i6);
    }

    public int I() {
        return this.f47058J.size();
    }

    public java.util.List J() {
        return this.f47058J;
    }

    @Override // p158p8.q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public p088i8.m a() {
        return f47051M;
    }

    public p088i8.l M() {
        return this.f47057I;
    }

    public p088i8.o N() {
        return this.f47056H;
    }

    public p088i8.p O() {
        return this.f47055G;
    }

    public boolean P() {
        return (this.f47054F & 4) == 4;
    }

    public boolean Q() {
        return (this.f47054F & 2) == 2;
    }

    public boolean R() {
        return (this.f47054F & 1) == 1;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public i8.m.b c() {
        return T();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public i8.m.b e() {
        return U(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47060L;
        if (i6 != -1) {
            return i6;
        }
        int iR = (this.f47054F & 1) == 1 ? p158p8.f.r(1, this.f47055G) : 0;
        if ((this.f47054F & 2) == 2) {
            iR += p158p8.f.r(2, this.f47056H);
        }
        if ((this.f47054F & 4) == 4) {
            iR += p158p8.f.r(3, this.f47057I);
        }
        for (int i10 = 0; i10 < this.f47058J.size(); i10++) {
            iR += p158p8.f.r(4, (p158p8.p) this.f47058J.get(i10));
        }
        int iT = iR + t() + this.f47053E.size();
        this.f47060L = iT;
        return iT;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47059K;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        if (Q() && !N().d()) {
            this.f47059K = (byte) 0;
            return false;
        }
        if (P() && !M().d()) {
            this.f47059K = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < I(); i6++) {
            if (!H(i6).d()) {
                this.f47059K = (byte) 0;
                return false;
            }
        }
        if (s()) {
            this.f47059K = (byte) 1;
            return true;
        }
        this.f47059K = (byte) 0;
        return false;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        p8.i.d.a aVarY = y();
        if ((this.f47054F & 1) == 1) {
            fVar.c0(1, this.f47055G);
        }
        if ((this.f47054F & 2) == 2) {
            fVar.c0(2, this.f47056H);
        }
        if ((this.f47054F & 4) == 4) {
            fVar.c0(3, this.f47057I);
        }
        for (int i6 = 0; i6 < this.f47058J.size(); i6++) {
            fVar.c0(4, (p158p8.p) this.f47058J.get(i6));
        }
        aVarY.a(200, fVar);
        fVar.h0(this.f47053E);
    }
}
