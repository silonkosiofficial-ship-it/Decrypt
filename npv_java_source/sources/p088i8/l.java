package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends p8.i.d implements p158p8.q {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final p088i8.l f47034N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static p158p8.r f47035O = new i8.l.a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p158p8.d f47036E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f47037F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.util.List f47038G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private java.util.List f47039H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.util.List f47040I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private p088i8.t f47041J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private p088i8.w f47042K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private byte f47043L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f47044M;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.l a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.l(eVar, gVar);
        }
    }

    public static final class b extends p8.i.c implements p158p8.q {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f47045F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private java.util.List f47046G = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private java.util.List f47047H = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private java.util.List f47048I = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private p088i8.t f47049J = p088i8.t.w();

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private p088i8.w f47050K = p088i8.w.u();

        private b() {
            B();
        }

        private void A() {
            if ((this.f47045F & 4) != 4) {
                this.f47048I = new java.util.ArrayList(this.f47048I);
                this.f47045F |= 4;
            }
        }

        private void B() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.l.b x() {
            return new i8.l.b();
        }

        private void y() {
            if ((this.f47045F & 1) != 1) {
                this.f47046G = new java.util.ArrayList(this.f47046G);
                this.f47045F |= 1;
            }
        }

        private void z() {
            if ((this.f47045F & 2) != 2) {
                this.f47047H = new java.util.ArrayList(this.f47047H);
                this.f47045F |= 2;
            }
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public i8.l.b l(p088i8.l lVar) {
            if (lVar == p088i8.l.K()) {
                return this;
            }
            if (!lVar.f47038G.isEmpty()) {
                if (this.f47046G.isEmpty()) {
                    this.f47046G = lVar.f47038G;
                    this.f47045F &= -2;
                } else {
                    y();
                    this.f47046G.addAll(lVar.f47038G);
                }
            }
            if (!lVar.f47039H.isEmpty()) {
                if (this.f47047H.isEmpty()) {
                    this.f47047H = lVar.f47039H;
                    this.f47045F &= -3;
                } else {
                    z();
                    this.f47047H.addAll(lVar.f47039H);
                }
            }
            if (!lVar.f47040I.isEmpty()) {
                if (this.f47048I.isEmpty()) {
                    this.f47048I = lVar.f47040I;
                    this.f47045F &= -5;
                } else {
                    A();
                    this.f47048I.addAll(lVar.f47040I);
                }
            }
            if (lVar.X()) {
                F(lVar.V());
            }
            if (lVar.Y()) {
                G(lVar.W());
            }
            r(lVar);
            m(k().e(lVar.f47036E));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public i8.l.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.l lVar = null;
            try {
                try {
                    p088i8.l lVar2 = (p088i8.l) p088i8.l.f47035O.a(eVar, gVar);
                    if (lVar2 != null) {
                        l(lVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.l lVar3 = (p088i8.l) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        lVar = lVar3;
                        if (lVar != null) {
                            l(lVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (lVar != null) {
                    l(lVar);
                }
                throw th;
            }
        }

        public i8.l.b F(p088i8.t tVar) {
            if ((this.f47045F & 8) == 8 && this.f47049J != p088i8.t.w()) {
                tVar = p088i8.t.E(this.f47049J).l(tVar).q();
            }
            this.f47049J = tVar;
            this.f47045F |= 8;
            return this;
        }

        public i8.l.b G(p088i8.w wVar) {
            if ((this.f47045F & 16) == 16 && this.f47050K != p088i8.w.u()) {
                wVar = p088i8.w.z(this.f47050K).l(wVar).q();
            }
            this.f47050K = wVar;
            this.f47045F |= 16;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public p088i8.l i() {
            p088i8.l lVarV = v();
            if (lVarV.d()) {
                return lVarV;
            }
            throw p158p8.a.AbstractC0680a.j(lVarV);
        }

        public p088i8.l v() {
            p088i8.l lVar = new p088i8.l(this);
            int i6 = this.f47045F;
            if ((i6 & 1) == 1) {
                this.f47046G = j$.util.DesugarCollections.unmodifiableList(this.f47046G);
                this.f47045F &= -2;
            }
            lVar.f47038G = this.f47046G;
            if ((this.f47045F & 2) == 2) {
                this.f47047H = j$.util.DesugarCollections.unmodifiableList(this.f47047H);
                this.f47045F &= -3;
            }
            lVar.f47039H = this.f47047H;
            if ((this.f47045F & 4) == 4) {
                this.f47048I = j$.util.DesugarCollections.unmodifiableList(this.f47048I);
                this.f47045F &= -5;
            }
            lVar.f47040I = this.f47048I;
            int i10 = (i6 & 8) != 8 ? 0 : 1;
            lVar.f47041J = this.f47049J;
            if ((i6 & 16) == 16) {
                i10 |= 2;
            }
            lVar.f47042K = this.f47050K;
            lVar.f47037F = i10;
            return lVar;
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.l.b clone() {
            return x().l(v());
        }
    }

    static {
        p088i8.l lVar = new p088i8.l(true);
        f47034N = lVar;
        lVar.Z();
    }

    private l(p158p8.e eVar, p158p8.g gVar) {
        java.util.List list;
        p158p8.p pVarT;
        this.f47043L = (byte) -1;
        this.f47044M = -1;
        Z();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        int i6 = 0;
        while (!z6) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 26) {
                            int i10 = (i6 == true ? 1 : 0) & 1;
                            int i11 = i6;
                            if (i10 != 1) {
                                this.f47038G = new java.util.ArrayList();
                                i11 = (i6 == true ? 1 : 0) | 1;
                            }
                            list = this.f47038G;
                            pVarT = eVar.t(p088i8.i.f46985Y, gVar);
                            i6 = i11;
                        } else if (iJ == 34) {
                            int i12 = (i6 == true ? 1 : 0) & 2;
                            int i13 = i6;
                            if (i12 != 2) {
                                this.f47039H = new java.util.ArrayList();
                                i13 = (i6 == true ? 1 : 0) | 2;
                            }
                            list = this.f47039H;
                            pVarT = eVar.t(p088i8.n.f47067Y, gVar);
                            i6 = i13;
                        } else if (iJ != 42) {
                            if (iJ == 242) {
                                i8.t.b bVarG = (this.f47037F & 1) == 1 ? this.f47041J.e() : null;
                                p088i8.t tVar = (p088i8.t) eVar.t(p088i8.t.f47244K, gVar);
                                this.f47041J = tVar;
                                if (bVarG != null) {
                                    bVarG.l(tVar);
                                    this.f47041J = bVarG.q();
                                }
                                this.f47037F |= 1;
                            } else if (iJ == 258) {
                                i8.w.b bVarB = (this.f47037F & 2) == 2 ? this.f47042K.e() : null;
                                p088i8.w wVar = (p088i8.w) eVar.t(p088i8.w.f47305I, gVar);
                                this.f47042K = wVar;
                                if (bVarB != null) {
                                    bVarB.l(wVar);
                                    this.f47042K = bVarB.q();
                                }
                                this.f47037F |= 2;
                            } else if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            int i14 = (i6 == true ? 1 : 0) & 4;
                            int i15 = i6;
                            if (i14 != 4) {
                                this.f47040I = new java.util.ArrayList();
                                i15 = (i6 == true ? 1 : 0) | 4;
                            }
                            list = this.f47040I;
                            pVarT = eVar.t(p088i8.r.f47193S, gVar);
                            i6 = i15;
                        }
                        list.add(pVarT);
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    if (((i6 == true ? 1 : 0) & 1) == 1) {
                        this.f47038G = j$.util.DesugarCollections.unmodifiableList(this.f47038G);
                    }
                    if (((i6 == true ? 1 : 0) & 2) == 2) {
                        this.f47039H = j$.util.DesugarCollections.unmodifiableList(this.f47039H);
                    }
                    if (((i6 == true ? 1 : 0) & 4) == 4) {
                        this.f47040I = j$.util.DesugarCollections.unmodifiableList(this.f47040I);
                    }
                    try {
                        fVarI.H();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f47036E = bVarM.o();
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
        if (((i6 == true ? 1 : 0) & 1) == 1) {
            this.f47038G = j$.util.DesugarCollections.unmodifiableList(this.f47038G);
        }
        if (((i6 == true ? 1 : 0) & 2) == 2) {
            this.f47039H = j$.util.DesugarCollections.unmodifiableList(this.f47039H);
        }
        if (((i6 == true ? 1 : 0) & 4) == 4) {
            this.f47040I = j$.util.DesugarCollections.unmodifiableList(this.f47040I);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f47036E = bVarM.o();
        }
        m();
    }

    private l(p8.i.c cVar) {
        super(cVar);
        this.f47043L = (byte) -1;
        this.f47044M = -1;
        this.f47036E = cVar.k();
    }

    private l(boolean z6) {
        this.f47043L = (byte) -1;
        this.f47044M = -1;
        this.f47036E = p158p8.d.f52766C;
    }

    public static p088i8.l K() {
        return f47034N;
    }

    private void Z() {
        this.f47038G = java.util.Collections.emptyList();
        this.f47039H = java.util.Collections.emptyList();
        this.f47040I = java.util.Collections.emptyList();
        this.f47041J = p088i8.t.w();
        this.f47042K = p088i8.w.u();
    }

    public static i8.l.b a0() {
        return i8.l.b.x();
    }

    public static i8.l.b b0(p088i8.l lVar) {
        return a0().l(lVar);
    }

    public static p088i8.l d0(java.io.InputStream inputStream, p158p8.g gVar) {
        return (p088i8.l) f47035O.c(inputStream, gVar);
    }

    @Override // p158p8.q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public p088i8.l a() {
        return f47034N;
    }

    public p088i8.i M(int i6) {
        return (p088i8.i) this.f47038G.get(i6);
    }

    public int N() {
        return this.f47038G.size();
    }

    public java.util.List O() {
        return this.f47038G;
    }

    public p088i8.n P(int i6) {
        return (p088i8.n) this.f47039H.get(i6);
    }

    public int Q() {
        return this.f47039H.size();
    }

    public java.util.List R() {
        return this.f47039H;
    }

    public p088i8.r S(int i6) {
        return (p088i8.r) this.f47040I.get(i6);
    }

    public int T() {
        return this.f47040I.size();
    }

    public java.util.List U() {
        return this.f47040I;
    }

    public p088i8.t V() {
        return this.f47041J;
    }

    public p088i8.w W() {
        return this.f47042K;
    }

    public boolean X() {
        return (this.f47037F & 1) == 1;
    }

    public boolean Y() {
        return (this.f47037F & 2) == 2;
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47044M;
        if (i6 != -1) {
            return i6;
        }
        int iR = 0;
        for (int i10 = 0; i10 < this.f47038G.size(); i10++) {
            iR += p158p8.f.r(3, (p158p8.p) this.f47038G.get(i10));
        }
        for (int i11 = 0; i11 < this.f47039H.size(); i11++) {
            iR += p158p8.f.r(4, (p158p8.p) this.f47039H.get(i11));
        }
        for (int i12 = 0; i12 < this.f47040I.size(); i12++) {
            iR += p158p8.f.r(5, (p158p8.p) this.f47040I.get(i12));
        }
        if ((this.f47037F & 1) == 1) {
            iR += p158p8.f.r(30, this.f47041J);
        }
        if ((this.f47037F & 2) == 2) {
            iR += p158p8.f.r(32, this.f47042K);
        }
        int iT = iR + t() + this.f47036E.size();
        this.f47044M = iT;
        return iT;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public i8.l.b c() {
        return a0();
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47043L;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < N(); i6++) {
            if (!M(i6).d()) {
                this.f47043L = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < Q(); i10++) {
            if (!P(i10).d()) {
                this.f47043L = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < T(); i11++) {
            if (!S(i11).d()) {
                this.f47043L = (byte) 0;
                return false;
            }
        }
        if (X() && !V().d()) {
            this.f47043L = (byte) 0;
            return false;
        }
        if (s()) {
            this.f47043L = (byte) 1;
            return true;
        }
        this.f47043L = (byte) 0;
        return false;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public i8.l.b e() {
        return b0(this);
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        p8.i.d.a aVarY = y();
        for (int i6 = 0; i6 < this.f47038G.size(); i6++) {
            fVar.c0(3, (p158p8.p) this.f47038G.get(i6));
        }
        for (int i10 = 0; i10 < this.f47039H.size(); i10++) {
            fVar.c0(4, (p158p8.p) this.f47039H.get(i10));
        }
        for (int i11 = 0; i11 < this.f47040I.size(); i11++) {
            fVar.c0(5, (p158p8.p) this.f47040I.get(i11));
        }
        if ((this.f47037F & 1) == 1) {
            fVar.c0(30, this.f47041J);
        }
        if ((this.f47037F & 2) == 2) {
            fVar.c0(32, this.f47042K);
        }
        aVarY.a(200, fVar);
        fVar.h0(this.f47036E);
    }
}
