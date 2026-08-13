package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends p8.i.d implements p158p8.q {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final p088i8.n f47066X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static p158p8.r f47067Y = new i8.n.a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p158p8.d f47068E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f47069F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f47070G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f47071H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f47072I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private p088i8.q f47073J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f47074K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.util.List f47075L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private p088i8.q f47076M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f47077N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private java.util.List f47078O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private java.util.List f47079P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f47080Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p088i8.u f47081R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f47082S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f47083T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private java.util.List f47084U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private byte f47085V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f47086W;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.n a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.n(eVar, gVar);
        }
    }

    public static final class b extends p8.i.c implements p158p8.q {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f47087F;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private int f47090I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private int f47092K;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private int f47095N;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private int f47099R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private int f47100S;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f47088G = 518;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private int f47089H = 2054;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private p088i8.q f47091J = p088i8.q.X();

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private java.util.List f47093L = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private p088i8.q f47094M = p088i8.q.X();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private java.util.List f47096O = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private java.util.List f47097P = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private p088i8.u f47098Q = p088i8.u.I();

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private java.util.List f47101T = java.util.Collections.emptyList();

        private b() {
            C();
        }

        private void A() {
            if ((this.f47087F & 32) != 32) {
                this.f47093L = new java.util.ArrayList(this.f47093L);
                this.f47087F |= 32;
            }
        }

        private void B() {
            if ((this.f47087F & 8192) != 8192) {
                this.f47101T = new java.util.ArrayList(this.f47101T);
                this.f47087F |= 8192;
            }
        }

        private void C() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.n.b x() {
            return new i8.n.b();
        }

        private void y() {
            if ((this.f47087F & 512) != 512) {
                this.f47097P = new java.util.ArrayList(this.f47097P);
                this.f47087F |= 512;
            }
        }

        private void z() {
            if ((this.f47087F & 256) != 256) {
                this.f47096O = new java.util.ArrayList(this.f47096O);
                this.f47087F |= 256;
            }
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public i8.n.b l(p088i8.n nVar) {
            if (nVar == p088i8.n.Y()) {
                return this;
            }
            if (nVar.p0()) {
                J(nVar.a0());
            }
            if (nVar.s0()) {
                M(nVar.d0());
            }
            if (nVar.r0()) {
                L(nVar.c0());
            }
            if (nVar.v0()) {
                H(nVar.h0());
            }
            if (nVar.w0()) {
                P(nVar.i0());
            }
            if (!nVar.f47075L.isEmpty()) {
                if (this.f47093L.isEmpty()) {
                    this.f47093L = nVar.f47075L;
                    this.f47087F &= -33;
                } else {
                    A();
                    this.f47093L.addAll(nVar.f47075L);
                }
            }
            if (nVar.t0()) {
                G(nVar.e0());
            }
            if (nVar.u0()) {
                O(nVar.f0());
            }
            if (!nVar.f47078O.isEmpty()) {
                if (this.f47096O.isEmpty()) {
                    this.f47096O = nVar.f47078O;
                    this.f47087F &= -257;
                } else {
                    z();
                    this.f47096O.addAll(nVar.f47078O);
                }
            }
            if (!nVar.f47079P.isEmpty()) {
                if (this.f47097P.isEmpty()) {
                    this.f47097P = nVar.f47079P;
                    this.f47087F &= -513;
                } else {
                    y();
                    this.f47097P.addAll(nVar.f47079P);
                }
            }
            if (nVar.y0()) {
                I(nVar.k0());
            }
            if (nVar.q0()) {
                K(nVar.b0());
            }
            if (nVar.x0()) {
                Q(nVar.j0());
            }
            if (!nVar.f47084U.isEmpty()) {
                if (this.f47101T.isEmpty()) {
                    this.f47101T = nVar.f47084U;
                    this.f47087F &= -8193;
                } else {
                    B();
                    this.f47101T.addAll(nVar.f47084U);
                }
            }
            r(nVar);
            m(k().e(nVar.f47068E));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public i8.n.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.n nVar = null;
            try {
                try {
                    p088i8.n nVar2 = (p088i8.n) p088i8.n.f47067Y.a(eVar, gVar);
                    if (nVar2 != null) {
                        l(nVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.n nVar3 = (p088i8.n) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        nVar = nVar3;
                        if (nVar != null) {
                            l(nVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (nVar != null) {
                    l(nVar);
                }
                throw th;
            }
        }

        public i8.n.b G(p088i8.q qVar) {
            if ((this.f47087F & 64) == 64 && this.f47094M != p088i8.q.X()) {
                qVar = p088i8.q.z0(this.f47094M).l(qVar).v();
            }
            this.f47094M = qVar;
            this.f47087F |= 64;
            return this;
        }

        public i8.n.b H(p088i8.q qVar) {
            if ((this.f47087F & 8) == 8 && this.f47091J != p088i8.q.X()) {
                qVar = p088i8.q.z0(this.f47091J).l(qVar).v();
            }
            this.f47091J = qVar;
            this.f47087F |= 8;
            return this;
        }

        public i8.n.b I(p088i8.u uVar) {
            if ((this.f47087F & 1024) == 1024 && this.f47098Q != p088i8.u.I()) {
                uVar = p088i8.u.Y(this.f47098Q).l(uVar).v();
            }
            this.f47098Q = uVar;
            this.f47087F |= 1024;
            return this;
        }

        public i8.n.b J(int i6) {
            this.f47087F |= 1;
            this.f47088G = i6;
            return this;
        }

        public i8.n.b K(int i6) {
            this.f47087F |= 2048;
            this.f47099R = i6;
            return this;
        }

        public i8.n.b L(int i6) {
            this.f47087F |= 4;
            this.f47090I = i6;
            return this;
        }

        public i8.n.b M(int i6) {
            this.f47087F |= 2;
            this.f47089H = i6;
            return this;
        }

        public i8.n.b O(int i6) {
            this.f47087F |= 128;
            this.f47095N = i6;
            return this;
        }

        public i8.n.b P(int i6) {
            this.f47087F |= 16;
            this.f47092K = i6;
            return this;
        }

        public i8.n.b Q(int i6) {
            this.f47087F |= 4096;
            this.f47100S = i6;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public p088i8.n i() {
            p088i8.n nVarV = v();
            if (nVarV.d()) {
                return nVarV;
            }
            throw p158p8.a.AbstractC0680a.j(nVarV);
        }

        public p088i8.n v() {
            p088i8.n nVar = new p088i8.n(this);
            int i6 = this.f47087F;
            int i10 = (i6 & 1) != 1 ? 0 : 1;
            nVar.f47070G = this.f47088G;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            nVar.f47071H = this.f47089H;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            nVar.f47072I = this.f47090I;
            if ((i6 & 8) == 8) {
                i10 |= 8;
            }
            nVar.f47073J = this.f47091J;
            if ((i6 & 16) == 16) {
                i10 |= 16;
            }
            nVar.f47074K = this.f47092K;
            if ((this.f47087F & 32) == 32) {
                this.f47093L = j$.util.DesugarCollections.unmodifiableList(this.f47093L);
                this.f47087F &= -33;
            }
            nVar.f47075L = this.f47093L;
            if ((i6 & 64) == 64) {
                i10 |= 32;
            }
            nVar.f47076M = this.f47094M;
            if ((i6 & 128) == 128) {
                i10 |= 64;
            }
            nVar.f47077N = this.f47095N;
            if ((this.f47087F & 256) == 256) {
                this.f47096O = j$.util.DesugarCollections.unmodifiableList(this.f47096O);
                this.f47087F &= -257;
            }
            nVar.f47078O = this.f47096O;
            if ((this.f47087F & 512) == 512) {
                this.f47097P = j$.util.DesugarCollections.unmodifiableList(this.f47097P);
                this.f47087F &= -513;
            }
            nVar.f47079P = this.f47097P;
            if ((i6 & 1024) == 1024) {
                i10 |= 128;
            }
            nVar.f47081R = this.f47098Q;
            if ((i6 & 2048) == 2048) {
                i10 |= 256;
            }
            nVar.f47082S = this.f47099R;
            if ((i6 & 4096) == 4096) {
                i10 |= 512;
            }
            nVar.f47083T = this.f47100S;
            if ((this.f47087F & 8192) == 8192) {
                this.f47101T = j$.util.DesugarCollections.unmodifiableList(this.f47101T);
                this.f47087F &= -8193;
            }
            nVar.f47084U = this.f47101T;
            nVar.f47069F = i10;
            return nVar;
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.n.b clone() {
            return x().l(v());
        }
    }

    static {
        p088i8.n nVar = new p088i8.n(true);
        f47066X = nVar;
        nVar.z0();
    }

    private n(p158p8.e eVar, p158p8.g gVar) {
        int i6;
        int i10;
        java.util.List list;
        int i11;
        java.lang.Object objT;
        this.f47080Q = -1;
        this.f47085V = (byte) -1;
        this.f47086W = -1;
        z0();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        int i12 = 0;
        while (!z6) {
            try {
                try {
                    int iJ = eVar.J();
                    switch (iJ) {
                        case 0:
                            z6 = true;
                            break;
                        case 8:
                            this.f47069F |= 2;
                            this.f47071H = eVar.r();
                            break;
                        case 16:
                            this.f47069F |= 4;
                            this.f47072I = eVar.r();
                            break;
                        case 26:
                            i6 = 8;
                            i8.q.c cVarB0 = (this.f47069F & 8) == 8 ? this.f47073J.e() : null;
                            p088i8.q qVar = (p088i8.q) eVar.t(p088i8.q.f47138X, gVar);
                            this.f47073J = qVar;
                            if (cVarB0 != null) {
                                cVarB0.l(qVar);
                                this.f47073J = cVarB0.v();
                            }
                            i10 = this.f47069F;
                            this.f47069F = i10 | i6;
                            break;
                        case 34:
                            int i13 = (i12 == true ? 1 : 0) & 32;
                            int i14 = i12;
                            if (i13 != 32) {
                                this.f47075L = new java.util.ArrayList();
                                i14 = (i12 == true ? 1 : 0) | 32;
                            }
                            list = this.f47075L;
                            i12 = i14;
                            objT = eVar.t(p088i8.s.f47218Q, gVar);
                            list.add(objT);
                            break;
                        case 42:
                            i8.q.c cVarB1 = (this.f47069F & 32) == 32 ? this.f47076M.e() : null;
                            p088i8.q qVar2 = (p088i8.q) eVar.t(p088i8.q.f47138X, gVar);
                            this.f47076M = qVar2;
                            if (cVarB1 != null) {
                                cVarB1.l(qVar2);
                                this.f47076M = cVarB1.v();
                            }
                            this.f47069F |= 32;
                            break;
                        case 50:
                            i6 = 128;
                            i8.u.b bVarA0 = (this.f47069F & 128) == 128 ? this.f47081R.e() : null;
                            p088i8.u uVar = (p088i8.u) eVar.t(p088i8.u.f47255P, gVar);
                            this.f47081R = uVar;
                            if (bVarA0 != null) {
                                bVarA0.l(uVar);
                                this.f47081R = bVarA0.v();
                            }
                            i10 = this.f47069F;
                            this.f47069F = i10 | i6;
                            break;
                        case 56:
                            this.f47069F |= 256;
                            this.f47082S = eVar.r();
                            break;
                        case 64:
                            this.f47069F |= 512;
                            this.f47083T = eVar.r();
                            break;
                        case 72:
                            this.f47069F |= 16;
                            this.f47074K = eVar.r();
                            break;
                        case 80:
                            this.f47069F |= 64;
                            this.f47077N = eVar.r();
                            break;
                        case 88:
                            this.f47069F |= 1;
                            this.f47070G = eVar.r();
                            break;
                        case 98:
                            int i15 = (i12 == true ? 1 : 0) & 256;
                            int i16 = i12;
                            if (i15 != 256) {
                                this.f47078O = new java.util.ArrayList();
                                i16 = (i12 == true ? 1 : 0) | 256;
                            }
                            list = this.f47078O;
                            i12 = i16;
                            objT = eVar.t(p088i8.q.f47138X, gVar);
                            list.add(objT);
                            break;
                        case 104:
                            int i17 = (i12 == true ? 1 : 0) & 512;
                            int i18 = i12;
                            if (i17 != 512) {
                                this.f47079P = new java.util.ArrayList();
                                i18 = (i12 == true ? 1 : 0) | 512;
                            }
                            list = this.f47079P;
                            i12 = i18;
                            objT = java.lang.Integer.valueOf(eVar.r());
                            list.add(objT);
                            break;
                        case 106:
                            i11 = eVar.i(eVar.z());
                            int i19 = (i12 == true ? 1 : 0) & 512;
                            i12 = i12;
                            if (i19 != 512 && eVar.e() > 0) {
                                i12 = i12;
                                this.f47079P = new java.util.ArrayList();
                                i12 = (i12 == true ? 1 : 0) | 512;
                            }
                            i12 = i12;
                            while (eVar.e() > 0) {
                                this.f47079P.add(java.lang.Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i11);
                            break;
                        case 248:
                            int i20 = (i12 == true ? 1 : 0) & 8192;
                            int i21 = i12;
                            if (i20 != 8192) {
                                this.f47084U = new java.util.ArrayList();
                                i21 = (i12 == true ? 1 : 0) | 8192;
                            }
                            list = this.f47084U;
                            i12 = i21;
                            objT = java.lang.Integer.valueOf(eVar.r());
                            list.add(objT);
                            break;
                        case 250:
                            i11 = eVar.i(eVar.z());
                            int i22 = (i12 == true ? 1 : 0) & 8192;
                            i12 = i12;
                            if (i22 != 8192 && eVar.e() > 0) {
                                i12 = i12;
                                this.f47084U = new java.util.ArrayList();
                                i12 = (i12 == true ? 1 : 0) | 8192;
                            }
                            i12 = i12;
                            while (eVar.e() > 0) {
                                this.f47084U.add(java.lang.Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i11);
                            break;
                        default:
                            if (!p(eVar, fVarI, gVar, iJ)) {
                                z6 = true;
                            }
                            break;
                    }
                } catch (p158p8.k e6) {
                    throw e6.i(this);
                } catch (java.io.IOException e10) {
                    throw new p158p8.k(e10.getMessage()).i(this);
                }
            } catch (java.lang.Throwable th) {
                if (((i12 == true ? 1 : 0) & 32) == 32) {
                    this.f47075L = j$.util.DesugarCollections.unmodifiableList(this.f47075L);
                }
                if (((i12 == true ? 1 : 0) & 256) == 256) {
                    this.f47078O = j$.util.DesugarCollections.unmodifiableList(this.f47078O);
                }
                if (((i12 == true ? 1 : 0) & 512) == 512) {
                    this.f47079P = j$.util.DesugarCollections.unmodifiableList(this.f47079P);
                }
                if (((i12 == true ? 1 : 0) & 8192) == 8192) {
                    this.f47084U = j$.util.DesugarCollections.unmodifiableList(this.f47084U);
                }
                try {
                    fVarI.H();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f47068E = bVarM.o();
                }
                m();
                throw th;
            }
        }
        if (((i12 == true ? 1 : 0) & 32) == 32) {
            this.f47075L = j$.util.DesugarCollections.unmodifiableList(this.f47075L);
        }
        if (((i12 == true ? 1 : 0) & 256) == 256) {
            this.f47078O = j$.util.DesugarCollections.unmodifiableList(this.f47078O);
        }
        if (((i12 == true ? 1 : 0) & 512) == 512) {
            this.f47079P = j$.util.DesugarCollections.unmodifiableList(this.f47079P);
        }
        if (((i12 == true ? 1 : 0) & 8192) == 8192) {
            this.f47084U = j$.util.DesugarCollections.unmodifiableList(this.f47084U);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f47068E = bVarM.o();
        }
        m();
    }

    private n(p8.i.c cVar) {
        super(cVar);
        this.f47080Q = -1;
        this.f47085V = (byte) -1;
        this.f47086W = -1;
        this.f47068E = cVar.k();
    }

    private n(boolean z6) {
        this.f47080Q = -1;
        this.f47085V = (byte) -1;
        this.f47086W = -1;
        this.f47068E = p158p8.d.f52766C;
    }

    public static i8.n.b A0() {
        return i8.n.b.x();
    }

    public static i8.n.b B0(p088i8.n nVar) {
        return A0().l(nVar);
    }

    public static p088i8.n Y() {
        return f47066X;
    }

    private void z0() {
        this.f47070G = 518;
        this.f47071H = 2054;
        this.f47072I = 0;
        this.f47073J = p088i8.q.X();
        this.f47074K = 0;
        this.f47075L = java.util.Collections.emptyList();
        this.f47076M = p088i8.q.X();
        this.f47077N = 0;
        this.f47078O = java.util.Collections.emptyList();
        this.f47079P = java.util.Collections.emptyList();
        this.f47081R = p088i8.u.I();
        this.f47082S = 0;
        this.f47083T = 0;
        this.f47084U = java.util.Collections.emptyList();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public i8.n.b c() {
        return A0();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public i8.n.b e() {
        return B0(this);
    }

    public p088i8.q U(int i6) {
        return (p088i8.q) this.f47078O.get(i6);
    }

    public int V() {
        return this.f47078O.size();
    }

    public java.util.List W() {
        return this.f47079P;
    }

    public java.util.List X() {
        return this.f47078O;
    }

    @Override // p158p8.q
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public p088i8.n a() {
        return f47066X;
    }

    public int a0() {
        return this.f47070G;
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47086W;
        if (i6 != -1) {
            return i6;
        }
        int iO = (this.f47069F & 2) == 2 ? p158p8.f.o(1, this.f47071H) : 0;
        if ((this.f47069F & 4) == 4) {
            iO += p158p8.f.o(2, this.f47072I);
        }
        if ((this.f47069F & 8) == 8) {
            iO += p158p8.f.r(3, this.f47073J);
        }
        for (int i10 = 0; i10 < this.f47075L.size(); i10++) {
            iO += p158p8.f.r(4, (p158p8.p) this.f47075L.get(i10));
        }
        if ((this.f47069F & 32) == 32) {
            iO += p158p8.f.r(5, this.f47076M);
        }
        if ((this.f47069F & 128) == 128) {
            iO += p158p8.f.r(6, this.f47081R);
        }
        if ((this.f47069F & 256) == 256) {
            iO += p158p8.f.o(7, this.f47082S);
        }
        if ((this.f47069F & 512) == 512) {
            iO += p158p8.f.o(8, this.f47083T);
        }
        if ((this.f47069F & 16) == 16) {
            iO += p158p8.f.o(9, this.f47074K);
        }
        if ((this.f47069F & 64) == 64) {
            iO += p158p8.f.o(10, this.f47077N);
        }
        if ((this.f47069F & 1) == 1) {
            iO += p158p8.f.o(11, this.f47070G);
        }
        for (int i11 = 0; i11 < this.f47078O.size(); i11++) {
            iO += p158p8.f.r(12, (p158p8.p) this.f47078O.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f47079P.size(); i12++) {
            iP += p158p8.f.p(((java.lang.Integer) this.f47079P.get(i12)).intValue());
        }
        int iP2 = iO + iP;
        if (!W().isEmpty()) {
            iP2 = iP2 + 1 + p158p8.f.p(iP);
        }
        this.f47080Q = iP;
        int iP3 = 0;
        for (int i13 = 0; i13 < this.f47084U.size(); i13++) {
            iP3 += p158p8.f.p(((java.lang.Integer) this.f47084U.get(i13)).intValue());
        }
        int size = iP2 + iP3 + (o0().size() * 2) + t() + this.f47068E.size();
        this.f47086W = size;
        return size;
    }

    public int b0() {
        return this.f47082S;
    }

    public int c0() {
        return this.f47072I;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47085V;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        if (!r0()) {
            this.f47085V = (byte) 0;
            return false;
        }
        if (v0() && !h0().d()) {
            this.f47085V = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < m0(); i6++) {
            if (!l0(i6).d()) {
                this.f47085V = (byte) 0;
                return false;
            }
        }
        if (t0() && !e0().d()) {
            this.f47085V = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < V(); i10++) {
            if (!U(i10).d()) {
                this.f47085V = (byte) 0;
                return false;
            }
        }
        if (y0() && !k0().d()) {
            this.f47085V = (byte) 0;
            return false;
        }
        if (s()) {
            this.f47085V = (byte) 1;
            return true;
        }
        this.f47085V = (byte) 0;
        return false;
    }

    public int d0() {
        return this.f47071H;
    }

    public p088i8.q e0() {
        return this.f47076M;
    }

    public int f0() {
        return this.f47077N;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        p8.i.d.a aVarY = y();
        if ((this.f47069F & 2) == 2) {
            fVar.Z(1, this.f47071H);
        }
        if ((this.f47069F & 4) == 4) {
            fVar.Z(2, this.f47072I);
        }
        if ((this.f47069F & 8) == 8) {
            fVar.c0(3, this.f47073J);
        }
        for (int i6 = 0; i6 < this.f47075L.size(); i6++) {
            fVar.c0(4, (p158p8.p) this.f47075L.get(i6));
        }
        if ((this.f47069F & 32) == 32) {
            fVar.c0(5, this.f47076M);
        }
        if ((this.f47069F & 128) == 128) {
            fVar.c0(6, this.f47081R);
        }
        if ((this.f47069F & 256) == 256) {
            fVar.Z(7, this.f47082S);
        }
        if ((this.f47069F & 512) == 512) {
            fVar.Z(8, this.f47083T);
        }
        if ((this.f47069F & 16) == 16) {
            fVar.Z(9, this.f47074K);
        }
        if ((this.f47069F & 64) == 64) {
            fVar.Z(10, this.f47077N);
        }
        if ((this.f47069F & 1) == 1) {
            fVar.Z(11, this.f47070G);
        }
        for (int i10 = 0; i10 < this.f47078O.size(); i10++) {
            fVar.c0(12, (p158p8.p) this.f47078O.get(i10));
        }
        if (W().size() > 0) {
            fVar.n0(106);
            fVar.n0(this.f47080Q);
        }
        for (int i11 = 0; i11 < this.f47079P.size(); i11++) {
            fVar.a0(((java.lang.Integer) this.f47079P.get(i11)).intValue());
        }
        for (int i12 = 0; i12 < this.f47084U.size(); i12++) {
            fVar.Z(31, ((java.lang.Integer) this.f47084U.get(i12)).intValue());
        }
        aVarY.a(19000, fVar);
        fVar.h0(this.f47068E);
    }

    public p088i8.q h0() {
        return this.f47073J;
    }

    public int i0() {
        return this.f47074K;
    }

    public int j0() {
        return this.f47083T;
    }

    public p088i8.u k0() {
        return this.f47081R;
    }

    public p088i8.s l0(int i6) {
        return (p088i8.s) this.f47075L.get(i6);
    }

    public int m0() {
        return this.f47075L.size();
    }

    public java.util.List n0() {
        return this.f47075L;
    }

    public java.util.List o0() {
        return this.f47084U;
    }

    public boolean p0() {
        return (this.f47069F & 1) == 1;
    }

    public boolean q0() {
        return (this.f47069F & 256) == 256;
    }

    public boolean r0() {
        return (this.f47069F & 4) == 4;
    }

    public boolean s0() {
        return (this.f47069F & 2) == 2;
    }

    public boolean t0() {
        return (this.f47069F & 32) == 32;
    }

    public boolean u0() {
        return (this.f47069F & 64) == 64;
    }

    public boolean v0() {
        return (this.f47069F & 8) == 8;
    }

    public boolean w0() {
        return (this.f47069F & 16) == 16;
    }

    public boolean x0() {
        return (this.f47069F & 512) == 512;
    }

    public boolean y0() {
        return (this.f47069F & 128) == 128;
    }
}
