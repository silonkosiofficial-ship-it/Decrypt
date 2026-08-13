package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends p8.i.d implements p158p8.q {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final p088i8.r f47192R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static p158p8.r f47193S = new i8.r.a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p158p8.d f47194E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f47195F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f47196G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f47197H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.util.List f47198I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private p088i8.q f47199J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f47200K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private p088i8.q f47201L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f47202M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private java.util.List f47203N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private java.util.List f47204O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private byte f47205P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f47206Q;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.r a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.r(eVar, gVar);
        }
    }

    public static final class b extends p8.i.c implements p158p8.q {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f47207F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private int f47209H;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private int f47212K;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private int f47214M;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f47208G = 6;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private java.util.List f47210I = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private p088i8.q f47211J = p088i8.q.X();

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private p088i8.q f47213L = p088i8.q.X();

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private java.util.List f47215N = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private java.util.List f47216O = java.util.Collections.emptyList();

        private b() {
            B();
        }

        private void A() {
            if ((this.f47207F & 256) != 256) {
                this.f47216O = new java.util.ArrayList(this.f47216O);
                this.f47207F |= 256;
            }
        }

        private void B() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.r.b x() {
            return new i8.r.b();
        }

        private void y() {
            if ((this.f47207F & 128) != 128) {
                this.f47215N = new java.util.ArrayList(this.f47215N);
                this.f47207F |= 128;
            }
        }

        private void z() {
            if ((this.f47207F & 4) != 4) {
                this.f47210I = new java.util.ArrayList(this.f47210I);
                this.f47207F |= 4;
            }
        }

        public i8.r.b C(p088i8.q qVar) {
            if ((this.f47207F & 32) == 32 && this.f47213L != p088i8.q.X()) {
                qVar = p088i8.q.z0(this.f47213L).l(qVar).v();
            }
            this.f47213L = qVar;
            this.f47207F |= 32;
            return this;
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public i8.r.b l(p088i8.r rVar) {
            if (rVar == p088i8.r.R()) {
                return this;
            }
            if (rVar.f0()) {
                I(rVar.V());
            }
            if (rVar.h0()) {
                J(rVar.W());
            }
            if (!rVar.f47198I.isEmpty()) {
                if (this.f47210I.isEmpty()) {
                    this.f47210I = rVar.f47198I;
                    this.f47207F &= -5;
                } else {
                    z();
                    this.f47210I.addAll(rVar.f47198I);
                }
            }
            if (rVar.i0()) {
                G(rVar.a0());
            }
            if (rVar.j0()) {
                K(rVar.b0());
            }
            if (rVar.d0()) {
                C(rVar.T());
            }
            if (rVar.e0()) {
                H(rVar.U());
            }
            if (!rVar.f47203N.isEmpty()) {
                if (this.f47215N.isEmpty()) {
                    this.f47215N = rVar.f47203N;
                    this.f47207F &= -129;
                } else {
                    y();
                    this.f47215N.addAll(rVar.f47203N);
                }
            }
            if (!rVar.f47204O.isEmpty()) {
                if (this.f47216O.isEmpty()) {
                    this.f47216O = rVar.f47204O;
                    this.f47207F &= -257;
                } else {
                    A();
                    this.f47216O.addAll(rVar.f47204O);
                }
            }
            r(rVar);
            m(k().e(rVar.f47194E));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public i8.r.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.r rVar = null;
            try {
                try {
                    p088i8.r rVar2 = (p088i8.r) p088i8.r.f47193S.a(eVar, gVar);
                    if (rVar2 != null) {
                        l(rVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.r rVar3 = (p088i8.r) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        rVar = rVar3;
                        if (rVar != null) {
                            l(rVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (rVar != null) {
                    l(rVar);
                }
                throw th;
            }
        }

        public i8.r.b G(p088i8.q qVar) {
            if ((this.f47207F & 8) == 8 && this.f47211J != p088i8.q.X()) {
                qVar = p088i8.q.z0(this.f47211J).l(qVar).v();
            }
            this.f47211J = qVar;
            this.f47207F |= 8;
            return this;
        }

        public i8.r.b H(int i6) {
            this.f47207F |= 64;
            this.f47214M = i6;
            return this;
        }

        public i8.r.b I(int i6) {
            this.f47207F |= 1;
            this.f47208G = i6;
            return this;
        }

        public i8.r.b J(int i6) {
            this.f47207F |= 2;
            this.f47209H = i6;
            return this;
        }

        public i8.r.b K(int i6) {
            this.f47207F |= 16;
            this.f47212K = i6;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public p088i8.r i() {
            p088i8.r rVarV = v();
            if (rVarV.d()) {
                return rVarV;
            }
            throw p158p8.a.AbstractC0680a.j(rVarV);
        }

        public p088i8.r v() {
            p088i8.r rVar = new p088i8.r(this);
            int i6 = this.f47207F;
            int i10 = (i6 & 1) != 1 ? 0 : 1;
            rVar.f47196G = this.f47208G;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            rVar.f47197H = this.f47209H;
            if ((this.f47207F & 4) == 4) {
                this.f47210I = j$.util.DesugarCollections.unmodifiableList(this.f47210I);
                this.f47207F &= -5;
            }
            rVar.f47198I = this.f47210I;
            if ((i6 & 8) == 8) {
                i10 |= 4;
            }
            rVar.f47199J = this.f47211J;
            if ((i6 & 16) == 16) {
                i10 |= 8;
            }
            rVar.f47200K = this.f47212K;
            if ((i6 & 32) == 32) {
                i10 |= 16;
            }
            rVar.f47201L = this.f47213L;
            if ((i6 & 64) == 64) {
                i10 |= 32;
            }
            rVar.f47202M = this.f47214M;
            if ((this.f47207F & 128) == 128) {
                this.f47215N = j$.util.DesugarCollections.unmodifiableList(this.f47215N);
                this.f47207F &= -129;
            }
            rVar.f47203N = this.f47215N;
            if ((this.f47207F & 256) == 256) {
                this.f47216O = j$.util.DesugarCollections.unmodifiableList(this.f47216O);
                this.f47207F &= -257;
            }
            rVar.f47204O = this.f47216O;
            rVar.f47195F = i10;
            return rVar;
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.r.b clone() {
            return x().l(v());
        }
    }

    static {
        p088i8.r rVar = new p088i8.r(true);
        f47192R = rVar;
        rVar.k0();
    }

    private r(p158p8.e eVar, p158p8.g gVar) {
        java.util.List list;
        java.lang.Object objT;
        i8.q.c cVarE;
        this.f47205P = (byte) -1;
        this.f47206Q = -1;
        k0();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        int i6 = 0;
        while (!z6) {
            try {
                try {
                    int iJ = eVar.J();
                    switch (iJ) {
                        case 0:
                            z6 = true;
                            break;
                        case 8:
                            this.f47195F |= 1;
                            this.f47196G = eVar.r();
                            break;
                        case 16:
                            this.f47195F |= 2;
                            this.f47197H = eVar.r();
                            break;
                        case 26:
                            if ((i6 & 4) != 4) {
                                this.f47198I = new java.util.ArrayList();
                                i6 |= 4;
                            }
                            list = this.f47198I;
                            objT = eVar.t(p088i8.s.f47218Q, gVar);
                            list.add(objT);
                            break;
                        case 34:
                            cVarE = (this.f47195F & 4) == 4 ? this.f47199J.e() : null;
                            p088i8.q qVar = (p088i8.q) eVar.t(p088i8.q.f47138X, gVar);
                            this.f47199J = qVar;
                            if (cVarE != null) {
                                cVarE.l(qVar);
                                this.f47199J = cVarE.v();
                            }
                            this.f47195F |= 4;
                            break;
                        case 40:
                            this.f47195F |= 8;
                            this.f47200K = eVar.r();
                            break;
                        case 50:
                            cVarE = (this.f47195F & 16) == 16 ? this.f47201L.e() : null;
                            p088i8.q qVar2 = (p088i8.q) eVar.t(p088i8.q.f47138X, gVar);
                            this.f47201L = qVar2;
                            if (cVarE != null) {
                                cVarE.l(qVar2);
                                this.f47201L = cVarE.v();
                            }
                            this.f47195F |= 16;
                            break;
                        case 56:
                            this.f47195F |= 32;
                            this.f47202M = eVar.r();
                            break;
                        case 66:
                            if ((i6 & 128) != 128) {
                                this.f47203N = new java.util.ArrayList();
                                i6 |= 128;
                            }
                            list = this.f47203N;
                            objT = eVar.t(p088i8.b.f46763K, gVar);
                            list.add(objT);
                            break;
                        case 248:
                            if ((i6 & 256) != 256) {
                                this.f47204O = new java.util.ArrayList();
                                i6 |= 256;
                            }
                            list = this.f47204O;
                            objT = java.lang.Integer.valueOf(eVar.r());
                            list.add(objT);
                            break;
                        case 250:
                            int i10 = eVar.i(eVar.z());
                            if ((i6 & 256) != 256 && eVar.e() > 0) {
                                this.f47204O = new java.util.ArrayList();
                                i6 |= 256;
                            }
                            while (eVar.e() > 0) {
                                this.f47204O.add(java.lang.Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i10);
                            break;
                        default:
                            if (!p(eVar, fVarI, gVar, iJ)) {
                                z6 = true;
                            }
                            break;
                    }
                } catch (java.lang.Throwable th) {
                    if ((i6 & 4) == 4) {
                        this.f47198I = j$.util.DesugarCollections.unmodifiableList(this.f47198I);
                    }
                    if ((i6 & 128) == 128) {
                        this.f47203N = j$.util.DesugarCollections.unmodifiableList(this.f47203N);
                    }
                    if ((i6 & 256) == 256) {
                        this.f47204O = j$.util.DesugarCollections.unmodifiableList(this.f47204O);
                    }
                    try {
                        fVarI.H();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f47194E = bVarM.o();
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
        if ((i6 & 4) == 4) {
            this.f47198I = j$.util.DesugarCollections.unmodifiableList(this.f47198I);
        }
        if ((i6 & 128) == 128) {
            this.f47203N = j$.util.DesugarCollections.unmodifiableList(this.f47203N);
        }
        if ((i6 & 256) == 256) {
            this.f47204O = j$.util.DesugarCollections.unmodifiableList(this.f47204O);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f47194E = bVarM.o();
        }
        m();
    }

    private r(p8.i.c cVar) {
        super(cVar);
        this.f47205P = (byte) -1;
        this.f47206Q = -1;
        this.f47194E = cVar.k();
    }

    private r(boolean z6) {
        this.f47205P = (byte) -1;
        this.f47206Q = -1;
        this.f47194E = p158p8.d.f52766C;
    }

    public static p088i8.r R() {
        return f47192R;
    }

    private void k0() {
        this.f47196G = 6;
        this.f47197H = 0;
        this.f47198I = java.util.Collections.emptyList();
        this.f47199J = p088i8.q.X();
        this.f47200K = 0;
        this.f47201L = p088i8.q.X();
        this.f47202M = 0;
        this.f47203N = java.util.Collections.emptyList();
        this.f47204O = java.util.Collections.emptyList();
    }

    public static i8.r.b l0() {
        return i8.r.b.x();
    }

    public static i8.r.b m0(p088i8.r rVar) {
        return l0().l(rVar);
    }

    public static p088i8.r o0(java.io.InputStream inputStream, p158p8.g gVar) {
        return (p088i8.r) f47193S.b(inputStream, gVar);
    }

    public p088i8.b O(int i6) {
        return (p088i8.b) this.f47203N.get(i6);
    }

    public int P() {
        return this.f47203N.size();
    }

    public java.util.List Q() {
        return this.f47203N;
    }

    @Override // p158p8.q
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public p088i8.r a() {
        return f47192R;
    }

    public p088i8.q T() {
        return this.f47201L;
    }

    public int U() {
        return this.f47202M;
    }

    public int V() {
        return this.f47196G;
    }

    public int W() {
        return this.f47197H;
    }

    public p088i8.s X(int i6) {
        return (p088i8.s) this.f47198I.get(i6);
    }

    public int Y() {
        return this.f47198I.size();
    }

    public java.util.List Z() {
        return this.f47198I;
    }

    public p088i8.q a0() {
        return this.f47199J;
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47206Q;
        if (i6 != -1) {
            return i6;
        }
        int iO = (this.f47195F & 1) == 1 ? p158p8.f.o(1, this.f47196G) : 0;
        if ((this.f47195F & 2) == 2) {
            iO += p158p8.f.o(2, this.f47197H);
        }
        for (int i10 = 0; i10 < this.f47198I.size(); i10++) {
            iO += p158p8.f.r(3, (p158p8.p) this.f47198I.get(i10));
        }
        if ((this.f47195F & 4) == 4) {
            iO += p158p8.f.r(4, this.f47199J);
        }
        if ((this.f47195F & 8) == 8) {
            iO += p158p8.f.o(5, this.f47200K);
        }
        if ((this.f47195F & 16) == 16) {
            iO += p158p8.f.r(6, this.f47201L);
        }
        if ((this.f47195F & 32) == 32) {
            iO += p158p8.f.o(7, this.f47202M);
        }
        for (int i11 = 0; i11 < this.f47203N.size(); i11++) {
            iO += p158p8.f.r(8, (p158p8.p) this.f47203N.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f47204O.size(); i12++) {
            iP += p158p8.f.p(((java.lang.Integer) this.f47204O.get(i12)).intValue());
        }
        int size = iO + iP + (c0().size() * 2) + t() + this.f47194E.size();
        this.f47206Q = size;
        return size;
    }

    public int b0() {
        return this.f47200K;
    }

    public java.util.List c0() {
        return this.f47204O;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47205P;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        if (!h0()) {
            this.f47205P = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < Y(); i6++) {
            if (!X(i6).d()) {
                this.f47205P = (byte) 0;
                return false;
            }
        }
        if (i0() && !a0().d()) {
            this.f47205P = (byte) 0;
            return false;
        }
        if (d0() && !T().d()) {
            this.f47205P = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < P(); i10++) {
            if (!O(i10).d()) {
                this.f47205P = (byte) 0;
                return false;
            }
        }
        if (s()) {
            this.f47205P = (byte) 1;
            return true;
        }
        this.f47205P = (byte) 0;
        return false;
    }

    public boolean d0() {
        return (this.f47195F & 16) == 16;
    }

    public boolean e0() {
        return (this.f47195F & 32) == 32;
    }

    public boolean f0() {
        return (this.f47195F & 1) == 1;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        p8.i.d.a aVarY = y();
        if ((this.f47195F & 1) == 1) {
            fVar.Z(1, this.f47196G);
        }
        if ((this.f47195F & 2) == 2) {
            fVar.Z(2, this.f47197H);
        }
        for (int i6 = 0; i6 < this.f47198I.size(); i6++) {
            fVar.c0(3, (p158p8.p) this.f47198I.get(i6));
        }
        if ((this.f47195F & 4) == 4) {
            fVar.c0(4, this.f47199J);
        }
        if ((this.f47195F & 8) == 8) {
            fVar.Z(5, this.f47200K);
        }
        if ((this.f47195F & 16) == 16) {
            fVar.c0(6, this.f47201L);
        }
        if ((this.f47195F & 32) == 32) {
            fVar.Z(7, this.f47202M);
        }
        for (int i10 = 0; i10 < this.f47203N.size(); i10++) {
            fVar.c0(8, (p158p8.p) this.f47203N.get(i10));
        }
        for (int i11 = 0; i11 < this.f47204O.size(); i11++) {
            fVar.Z(31, ((java.lang.Integer) this.f47204O.get(i11)).intValue());
        }
        aVarY.a(200, fVar);
        fVar.h0(this.f47194E);
    }

    public boolean h0() {
        return (this.f47195F & 2) == 2;
    }

    public boolean i0() {
        return (this.f47195F & 4) == 4;
    }

    public boolean j0() {
        return (this.f47195F & 8) == 8;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public i8.r.b c() {
        return l0();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public i8.r.b e() {
        return m0(this);
    }
}
