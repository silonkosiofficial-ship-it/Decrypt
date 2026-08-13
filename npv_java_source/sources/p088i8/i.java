package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends p8.i.d implements p158p8.q {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final p088i8.i f46984X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static p158p8.r f46985Y = new i8.i.a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p158p8.d f46986E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f46987F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f46988G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f46989H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f46990I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private p088i8.q f46991J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f46992K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.util.List f46993L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private p088i8.q f46994M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f46995N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private java.util.List f46996O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private java.util.List f46997P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f46998Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private java.util.List f46999R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p088i8.t f47000S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private java.util.List f47001T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private p088i8.e f47002U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private byte f47003V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f47004W;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.i a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.i(eVar, gVar);
        }
    }

    public static final class b extends p8.i.c implements p158p8.q {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f47005F;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private int f47008I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private int f47010K;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private int f47013N;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f47006G = 6;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private int f47007H = 6;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private p088i8.q f47009J = p088i8.q.X();

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private java.util.List f47011L = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private p088i8.q f47012M = p088i8.q.X();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private java.util.List f47014O = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private java.util.List f47015P = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private java.util.List f47016Q = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private p088i8.t f47017R = p088i8.t.w();

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private java.util.List f47018S = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private p088i8.e f47019T = p088i8.e.u();

        private b() {
            E();
        }

        private void A() {
            if ((this.f47005F & 32) != 32) {
                this.f47011L = new java.util.ArrayList(this.f47011L);
                this.f47005F |= 32;
            }
        }

        private void B() {
            if ((this.f47005F & 1024) != 1024) {
                this.f47016Q = new java.util.ArrayList(this.f47016Q);
                this.f47005F |= 1024;
            }
        }

        private void C() {
            if ((this.f47005F & 4096) != 4096) {
                this.f47018S = new java.util.ArrayList(this.f47018S);
                this.f47005F |= 4096;
            }
        }

        private void E() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.i.b x() {
            return new i8.i.b();
        }

        private void y() {
            if ((this.f47005F & 512) != 512) {
                this.f47015P = new java.util.ArrayList(this.f47015P);
                this.f47005F |= 512;
            }
        }

        private void z() {
            if ((this.f47005F & 256) != 256) {
                this.f47014O = new java.util.ArrayList(this.f47014O);
                this.f47005F |= 256;
            }
        }

        public i8.i.b F(p088i8.e eVar) {
            if ((this.f47005F & 8192) == 8192 && this.f47019T != p088i8.e.u()) {
                eVar = p088i8.e.z(this.f47019T).l(eVar).q();
            }
            this.f47019T = eVar;
            this.f47005F |= 8192;
            return this;
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public i8.i.b l(p088i8.i iVar) {
            if (iVar == p088i8.i.a0()) {
                return this;
            }
            if (iVar.t0()) {
                L(iVar.c0());
            }
            if (iVar.v0()) {
                O(iVar.e0());
            }
            if (iVar.u0()) {
                M(iVar.d0());
            }
            if (iVar.y0()) {
                J(iVar.i0());
            }
            if (iVar.z0()) {
                Q(iVar.j0());
            }
            if (!iVar.f46993L.isEmpty()) {
                if (this.f47011L.isEmpty()) {
                    this.f47011L = iVar.f46993L;
                    this.f47005F &= -33;
                } else {
                    A();
                    this.f47011L.addAll(iVar.f46993L);
                }
            }
            if (iVar.w0()) {
                I(iVar.f0());
            }
            if (iVar.x0()) {
                P(iVar.h0());
            }
            if (!iVar.f46996O.isEmpty()) {
                if (this.f47014O.isEmpty()) {
                    this.f47014O = iVar.f46996O;
                    this.f47005F &= -257;
                } else {
                    z();
                    this.f47014O.addAll(iVar.f46996O);
                }
            }
            if (!iVar.f46997P.isEmpty()) {
                if (this.f47015P.isEmpty()) {
                    this.f47015P = iVar.f46997P;
                    this.f47005F &= -513;
                } else {
                    y();
                    this.f47015P.addAll(iVar.f46997P);
                }
            }
            if (!iVar.f46999R.isEmpty()) {
                if (this.f47016Q.isEmpty()) {
                    this.f47016Q = iVar.f46999R;
                    this.f47005F &= -1025;
                } else {
                    B();
                    this.f47016Q.addAll(iVar.f46999R);
                }
            }
            if (iVar.A0()) {
                K(iVar.n0());
            }
            if (!iVar.f47001T.isEmpty()) {
                if (this.f47018S.isEmpty()) {
                    this.f47018S = iVar.f47001T;
                    this.f47005F &= -4097;
                } else {
                    C();
                    this.f47018S.addAll(iVar.f47001T);
                }
            }
            if (iVar.s0()) {
                F(iVar.Z());
            }
            r(iVar);
            m(k().e(iVar.f46986E));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public i8.i.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.i iVar = null;
            try {
                try {
                    p088i8.i iVar2 = (p088i8.i) p088i8.i.f46985Y.a(eVar, gVar);
                    if (iVar2 != null) {
                        l(iVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.i iVar3 = (p088i8.i) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        iVar = iVar3;
                        if (iVar != null) {
                            l(iVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (iVar != null) {
                    l(iVar);
                }
                throw th;
            }
        }

        public i8.i.b I(p088i8.q qVar) {
            if ((this.f47005F & 64) == 64 && this.f47012M != p088i8.q.X()) {
                qVar = p088i8.q.z0(this.f47012M).l(qVar).v();
            }
            this.f47012M = qVar;
            this.f47005F |= 64;
            return this;
        }

        public i8.i.b J(p088i8.q qVar) {
            if ((this.f47005F & 8) == 8 && this.f47009J != p088i8.q.X()) {
                qVar = p088i8.q.z0(this.f47009J).l(qVar).v();
            }
            this.f47009J = qVar;
            this.f47005F |= 8;
            return this;
        }

        public i8.i.b K(p088i8.t tVar) {
            if ((this.f47005F & 2048) == 2048 && this.f47017R != p088i8.t.w()) {
                tVar = p088i8.t.E(this.f47017R).l(tVar).q();
            }
            this.f47017R = tVar;
            this.f47005F |= 2048;
            return this;
        }

        public i8.i.b L(int i6) {
            this.f47005F |= 1;
            this.f47006G = i6;
            return this;
        }

        public i8.i.b M(int i6) {
            this.f47005F |= 4;
            this.f47008I = i6;
            return this;
        }

        public i8.i.b O(int i6) {
            this.f47005F |= 2;
            this.f47007H = i6;
            return this;
        }

        public i8.i.b P(int i6) {
            this.f47005F |= 128;
            this.f47013N = i6;
            return this;
        }

        public i8.i.b Q(int i6) {
            this.f47005F |= 16;
            this.f47010K = i6;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public p088i8.i i() {
            p088i8.i iVarV = v();
            if (iVarV.d()) {
                return iVarV;
            }
            throw p158p8.a.AbstractC0680a.j(iVarV);
        }

        public p088i8.i v() {
            p088i8.i iVar = new p088i8.i(this);
            int i6 = this.f47005F;
            int i10 = (i6 & 1) != 1 ? 0 : 1;
            iVar.f46988G = this.f47006G;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            iVar.f46989H = this.f47007H;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            iVar.f46990I = this.f47008I;
            if ((i6 & 8) == 8) {
                i10 |= 8;
            }
            iVar.f46991J = this.f47009J;
            if ((i6 & 16) == 16) {
                i10 |= 16;
            }
            iVar.f46992K = this.f47010K;
            if ((this.f47005F & 32) == 32) {
                this.f47011L = j$.util.DesugarCollections.unmodifiableList(this.f47011L);
                this.f47005F &= -33;
            }
            iVar.f46993L = this.f47011L;
            if ((i6 & 64) == 64) {
                i10 |= 32;
            }
            iVar.f46994M = this.f47012M;
            if ((i6 & 128) == 128) {
                i10 |= 64;
            }
            iVar.f46995N = this.f47013N;
            if ((this.f47005F & 256) == 256) {
                this.f47014O = j$.util.DesugarCollections.unmodifiableList(this.f47014O);
                this.f47005F &= -257;
            }
            iVar.f46996O = this.f47014O;
            if ((this.f47005F & 512) == 512) {
                this.f47015P = j$.util.DesugarCollections.unmodifiableList(this.f47015P);
                this.f47005F &= -513;
            }
            iVar.f46997P = this.f47015P;
            if ((this.f47005F & 1024) == 1024) {
                this.f47016Q = j$.util.DesugarCollections.unmodifiableList(this.f47016Q);
                this.f47005F &= -1025;
            }
            iVar.f46999R = this.f47016Q;
            if ((i6 & 2048) == 2048) {
                i10 |= 128;
            }
            iVar.f47000S = this.f47017R;
            if ((this.f47005F & 4096) == 4096) {
                this.f47018S = j$.util.DesugarCollections.unmodifiableList(this.f47018S);
                this.f47005F &= -4097;
            }
            iVar.f47001T = this.f47018S;
            if ((i6 & 8192) == 8192) {
                i10 |= 256;
            }
            iVar.f47002U = this.f47019T;
            iVar.f46987F = i10;
            return iVar;
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.i.b clone() {
            return x().l(v());
        }
    }

    static {
        p088i8.i iVar = new p088i8.i(true);
        f46984X = iVar;
        iVar.B0();
    }

    private i(p158p8.e eVar, p158p8.g gVar) {
        int i6;
        int i10;
        java.util.List list;
        int i11;
        java.lang.Object objT;
        this.f46998Q = -1;
        this.f47003V = (byte) -1;
        this.f47004W = -1;
        B0();
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
                            this.f46987F |= 2;
                            this.f46989H = eVar.r();
                            break;
                        case 16:
                            this.f46987F |= 4;
                            this.f46990I = eVar.r();
                            break;
                        case 26:
                            i6 = 8;
                            i8.q.c cVarB0 = (this.f46987F & 8) == 8 ? this.f46991J.e() : null;
                            p088i8.q qVar = (p088i8.q) eVar.t(p088i8.q.f47138X, gVar);
                            this.f46991J = qVar;
                            if (cVarB0 != null) {
                                cVarB0.l(qVar);
                                this.f46991J = cVarB0.v();
                            }
                            i10 = this.f46987F;
                            this.f46987F = i10 | i6;
                            break;
                        case 34:
                            int i13 = (i12 == true ? 1 : 0) & 32;
                            int i14 = i12;
                            if (i13 != 32) {
                                this.f46993L = new java.util.ArrayList();
                                i14 = (i12 == true ? 1 : 0) | 32;
                            }
                            list = this.f46993L;
                            i12 = i14;
                            objT = eVar.t(p088i8.s.f47218Q, gVar);
                            list.add(objT);
                            break;
                        case 42:
                            i8.q.c cVarB1 = (this.f46987F & 32) == 32 ? this.f46994M.e() : null;
                            p088i8.q qVar2 = (p088i8.q) eVar.t(p088i8.q.f47138X, gVar);
                            this.f46994M = qVar2;
                            if (cVarB1 != null) {
                                cVarB1.l(qVar2);
                                this.f46994M = cVarB1.v();
                            }
                            this.f46987F |= 32;
                            break;
                        case 50:
                            int i15 = (i12 == true ? 1 : 0) & 1024;
                            int i16 = i12;
                            if (i15 != 1024) {
                                this.f46999R = new java.util.ArrayList();
                                i16 = (i12 == true ? 1 : 0) | 1024;
                            }
                            list = this.f46999R;
                            i12 = i16;
                            objT = eVar.t(p088i8.u.f47255P, gVar);
                            list.add(objT);
                            break;
                        case 56:
                            this.f46987F |= 16;
                            this.f46992K = eVar.r();
                            break;
                        case 64:
                            this.f46987F |= 64;
                            this.f46995N = eVar.r();
                            break;
                        case 72:
                            this.f46987F |= 1;
                            this.f46988G = eVar.r();
                            break;
                        case 82:
                            int i17 = (i12 == true ? 1 : 0) & 256;
                            int i18 = i12;
                            if (i17 != 256) {
                                this.f46996O = new java.util.ArrayList();
                                i18 = (i12 == true ? 1 : 0) | 256;
                            }
                            list = this.f46996O;
                            i12 = i18;
                            objT = eVar.t(p088i8.q.f47138X, gVar);
                            list.add(objT);
                            break;
                        case 88:
                            int i19 = (i12 == true ? 1 : 0) & 512;
                            int i20 = i12;
                            if (i19 != 512) {
                                this.f46997P = new java.util.ArrayList();
                                i20 = (i12 == true ? 1 : 0) | 512;
                            }
                            list = this.f46997P;
                            i12 = i20;
                            objT = java.lang.Integer.valueOf(eVar.r());
                            list.add(objT);
                            break;
                        case 90:
                            i11 = eVar.i(eVar.z());
                            int i21 = (i12 == true ? 1 : 0) & 512;
                            i12 = i12;
                            if (i21 != 512 && eVar.e() > 0) {
                                i12 = i12;
                                this.f46997P = new java.util.ArrayList();
                                i12 = (i12 == true ? 1 : 0) | 512;
                            }
                            i12 = i12;
                            while (eVar.e() > 0) {
                                this.f46997P.add(java.lang.Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i11);
                            break;
                        case 242:
                            i6 = 128;
                            i8.t.b bVarG = (this.f46987F & 128) == 128 ? this.f47000S.e() : null;
                            p088i8.t tVar = (p088i8.t) eVar.t(p088i8.t.f47244K, gVar);
                            this.f47000S = tVar;
                            if (bVarG != null) {
                                bVarG.l(tVar);
                                this.f47000S = bVarG.q();
                            }
                            i10 = this.f46987F;
                            this.f46987F = i10 | i6;
                            break;
                        case 248:
                            int i22 = (i12 == true ? 1 : 0) & 4096;
                            int i23 = i12;
                            if (i22 != 4096) {
                                this.f47001T = new java.util.ArrayList();
                                i23 = (i12 == true ? 1 : 0) | 4096;
                            }
                            list = this.f47001T;
                            i12 = i23;
                            objT = java.lang.Integer.valueOf(eVar.r());
                            list.add(objT);
                            break;
                        case 250:
                            i11 = eVar.i(eVar.z());
                            int i24 = (i12 == true ? 1 : 0) & 4096;
                            i12 = i12;
                            if (i24 != 4096 && eVar.e() > 0) {
                                i12 = i12;
                                this.f47001T = new java.util.ArrayList();
                                i12 = (i12 == true ? 1 : 0) | 4096;
                            }
                            i12 = i12;
                            while (eVar.e() > 0) {
                                this.f47001T.add(java.lang.Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i11);
                            break;
                        case 258:
                            i8.e.b bVarB = (this.f46987F & 256) == 256 ? this.f47002U.e() : null;
                            p088i8.e eVar2 = (p088i8.e) eVar.t(p088i8.e.f46914I, gVar);
                            this.f47002U = eVar2;
                            if (bVarB != null) {
                                bVarB.l(eVar2);
                                this.f47002U = bVarB.q();
                            }
                            this.f46987F |= 256;
                            break;
                        default:
                            if (!p(eVar, fVarI, gVar, iJ)) {
                                z6 = true;
                            }
                            break;
                    }
                } catch (java.lang.Throwable th) {
                    if (((i12 == true ? 1 : 0) & 32) == 32) {
                        this.f46993L = j$.util.DesugarCollections.unmodifiableList(this.f46993L);
                    }
                    if (((i12 == true ? 1 : 0) & 1024) == 1024) {
                        this.f46999R = j$.util.DesugarCollections.unmodifiableList(this.f46999R);
                    }
                    if (((i12 == true ? 1 : 0) & 256) == 256) {
                        this.f46996O = j$.util.DesugarCollections.unmodifiableList(this.f46996O);
                    }
                    if (((i12 == true ? 1 : 0) & 512) == 512) {
                        this.f46997P = j$.util.DesugarCollections.unmodifiableList(this.f46997P);
                    }
                    if (((i12 == true ? 1 : 0) & 4096) == 4096) {
                        this.f47001T = j$.util.DesugarCollections.unmodifiableList(this.f47001T);
                    }
                    try {
                        fVarI.H();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f46986E = bVarM.o();
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
        if (((i12 == true ? 1 : 0) & 32) == 32) {
            this.f46993L = j$.util.DesugarCollections.unmodifiableList(this.f46993L);
        }
        if (((i12 == true ? 1 : 0) & 1024) == 1024) {
            this.f46999R = j$.util.DesugarCollections.unmodifiableList(this.f46999R);
        }
        if (((i12 == true ? 1 : 0) & 256) == 256) {
            this.f46996O = j$.util.DesugarCollections.unmodifiableList(this.f46996O);
        }
        if (((i12 == true ? 1 : 0) & 512) == 512) {
            this.f46997P = j$.util.DesugarCollections.unmodifiableList(this.f46997P);
        }
        if (((i12 == true ? 1 : 0) & 4096) == 4096) {
            this.f47001T = j$.util.DesugarCollections.unmodifiableList(this.f47001T);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f46986E = bVarM.o();
        }
        m();
    }

    private i(p8.i.c cVar) {
        super(cVar);
        this.f46998Q = -1;
        this.f47003V = (byte) -1;
        this.f47004W = -1;
        this.f46986E = cVar.k();
    }

    private i(boolean z6) {
        this.f46998Q = -1;
        this.f47003V = (byte) -1;
        this.f47004W = -1;
        this.f46986E = p158p8.d.f52766C;
    }

    private void B0() {
        this.f46988G = 6;
        this.f46989H = 6;
        this.f46990I = 0;
        this.f46991J = p088i8.q.X();
        this.f46992K = 0;
        this.f46993L = java.util.Collections.emptyList();
        this.f46994M = p088i8.q.X();
        this.f46995N = 0;
        this.f46996O = java.util.Collections.emptyList();
        this.f46997P = java.util.Collections.emptyList();
        this.f46999R = java.util.Collections.emptyList();
        this.f47000S = p088i8.t.w();
        this.f47001T = java.util.Collections.emptyList();
        this.f47002U = p088i8.e.u();
    }

    public static i8.i.b C0() {
        return i8.i.b.x();
    }

    public static i8.i.b D0(p088i8.i iVar) {
        return C0().l(iVar);
    }

    public static p088i8.i F0(java.io.InputStream inputStream, p158p8.g gVar) {
        return (p088i8.i) f46985Y.c(inputStream, gVar);
    }

    public static p088i8.i a0() {
        return f46984X;
    }

    public boolean A0() {
        return (this.f46987F & 128) == 128;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public i8.i.b c() {
        return C0();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public i8.i.b e() {
        return D0(this);
    }

    public p088i8.q V(int i6) {
        return (p088i8.q) this.f46996O.get(i6);
    }

    public int W() {
        return this.f46996O.size();
    }

    public java.util.List X() {
        return this.f46997P;
    }

    public java.util.List Y() {
        return this.f46996O;
    }

    public p088i8.e Z() {
        return this.f47002U;
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47004W;
        if (i6 != -1) {
            return i6;
        }
        int iO = (this.f46987F & 2) == 2 ? p158p8.f.o(1, this.f46989H) : 0;
        if ((this.f46987F & 4) == 4) {
            iO += p158p8.f.o(2, this.f46990I);
        }
        if ((this.f46987F & 8) == 8) {
            iO += p158p8.f.r(3, this.f46991J);
        }
        for (int i10 = 0; i10 < this.f46993L.size(); i10++) {
            iO += p158p8.f.r(4, (p158p8.p) this.f46993L.get(i10));
        }
        if ((this.f46987F & 32) == 32) {
            iO += p158p8.f.r(5, this.f46994M);
        }
        for (int i11 = 0; i11 < this.f46999R.size(); i11++) {
            iO += p158p8.f.r(6, (p158p8.p) this.f46999R.get(i11));
        }
        if ((this.f46987F & 16) == 16) {
            iO += p158p8.f.o(7, this.f46992K);
        }
        if ((this.f46987F & 64) == 64) {
            iO += p158p8.f.o(8, this.f46995N);
        }
        if ((this.f46987F & 1) == 1) {
            iO += p158p8.f.o(9, this.f46988G);
        }
        for (int i12 = 0; i12 < this.f46996O.size(); i12++) {
            iO += p158p8.f.r(10, (p158p8.p) this.f46996O.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f46997P.size(); i13++) {
            iP += p158p8.f.p(((java.lang.Integer) this.f46997P.get(i13)).intValue());
        }
        int iR = iO + iP;
        if (!X().isEmpty()) {
            iR = iR + 1 + p158p8.f.p(iP);
        }
        this.f46998Q = iP;
        if ((this.f46987F & 128) == 128) {
            iR += p158p8.f.r(30, this.f47000S);
        }
        int iP2 = 0;
        for (int i14 = 0; i14 < this.f47001T.size(); i14++) {
            iP2 += p158p8.f.p(((java.lang.Integer) this.f47001T.get(i14)).intValue());
        }
        int size = iR + iP2 + (r0().size() * 2);
        if ((this.f46987F & 256) == 256) {
            size += p158p8.f.r(32, this.f47002U);
        }
        int iT = size + t() + this.f46986E.size();
        this.f47004W = iT;
        return iT;
    }

    @Override // p158p8.q
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public p088i8.i a() {
        return f46984X;
    }

    public int c0() {
        return this.f46988G;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47003V;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        if (!u0()) {
            this.f47003V = (byte) 0;
            return false;
        }
        if (y0() && !i0().d()) {
            this.f47003V = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < l0(); i6++) {
            if (!k0(i6).d()) {
                this.f47003V = (byte) 0;
                return false;
            }
        }
        if (w0() && !f0().d()) {
            this.f47003V = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < W(); i10++) {
            if (!V(i10).d()) {
                this.f47003V = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < p0(); i11++) {
            if (!o0(i11).d()) {
                this.f47003V = (byte) 0;
                return false;
            }
        }
        if (A0() && !n0().d()) {
            this.f47003V = (byte) 0;
            return false;
        }
        if (s0() && !Z().d()) {
            this.f47003V = (byte) 0;
            return false;
        }
        if (s()) {
            this.f47003V = (byte) 1;
            return true;
        }
        this.f47003V = (byte) 0;
        return false;
    }

    public int d0() {
        return this.f46990I;
    }

    public int e0() {
        return this.f46989H;
    }

    public p088i8.q f0() {
        return this.f46994M;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        p8.i.d.a aVarY = y();
        if ((this.f46987F & 2) == 2) {
            fVar.Z(1, this.f46989H);
        }
        if ((this.f46987F & 4) == 4) {
            fVar.Z(2, this.f46990I);
        }
        if ((this.f46987F & 8) == 8) {
            fVar.c0(3, this.f46991J);
        }
        for (int i6 = 0; i6 < this.f46993L.size(); i6++) {
            fVar.c0(4, (p158p8.p) this.f46993L.get(i6));
        }
        if ((this.f46987F & 32) == 32) {
            fVar.c0(5, this.f46994M);
        }
        for (int i10 = 0; i10 < this.f46999R.size(); i10++) {
            fVar.c0(6, (p158p8.p) this.f46999R.get(i10));
        }
        if ((this.f46987F & 16) == 16) {
            fVar.Z(7, this.f46992K);
        }
        if ((this.f46987F & 64) == 64) {
            fVar.Z(8, this.f46995N);
        }
        if ((this.f46987F & 1) == 1) {
            fVar.Z(9, this.f46988G);
        }
        for (int i11 = 0; i11 < this.f46996O.size(); i11++) {
            fVar.c0(10, (p158p8.p) this.f46996O.get(i11));
        }
        if (X().size() > 0) {
            fVar.n0(90);
            fVar.n0(this.f46998Q);
        }
        for (int i12 = 0; i12 < this.f46997P.size(); i12++) {
            fVar.a0(((java.lang.Integer) this.f46997P.get(i12)).intValue());
        }
        if ((this.f46987F & 128) == 128) {
            fVar.c0(30, this.f47000S);
        }
        for (int i13 = 0; i13 < this.f47001T.size(); i13++) {
            fVar.Z(31, ((java.lang.Integer) this.f47001T.get(i13)).intValue());
        }
        if ((this.f46987F & 256) == 256) {
            fVar.c0(32, this.f47002U);
        }
        aVarY.a(19000, fVar);
        fVar.h0(this.f46986E);
    }

    public int h0() {
        return this.f46995N;
    }

    public p088i8.q i0() {
        return this.f46991J;
    }

    public int j0() {
        return this.f46992K;
    }

    public p088i8.s k0(int i6) {
        return (p088i8.s) this.f46993L.get(i6);
    }

    public int l0() {
        return this.f46993L.size();
    }

    public java.util.List m0() {
        return this.f46993L;
    }

    public p088i8.t n0() {
        return this.f47000S;
    }

    public p088i8.u o0(int i6) {
        return (p088i8.u) this.f46999R.get(i6);
    }

    public int p0() {
        return this.f46999R.size();
    }

    public java.util.List q0() {
        return this.f46999R;
    }

    public java.util.List r0() {
        return this.f47001T;
    }

    public boolean s0() {
        return (this.f46987F & 256) == 256;
    }

    public boolean t0() {
        return (this.f46987F & 1) == 1;
    }

    public boolean u0() {
        return (this.f46987F & 4) == 4;
    }

    public boolean v0() {
        return (this.f46987F & 2) == 2;
    }

    public boolean w0() {
        return (this.f46987F & 32) == 32;
    }

    public boolean x0() {
        return (this.f46987F & 64) == 64;
    }

    public boolean y0() {
        return (this.f46987F & 8) == 8;
    }

    public boolean z0() {
        return (this.f46987F & 16) == 16;
    }
}
