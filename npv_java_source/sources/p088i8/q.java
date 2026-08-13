package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends p8.i.d implements p158p8.q {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final p088i8.q f47137W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static p158p8.r f47138X = new i8.q.a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p158p8.d f47139E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f47140F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.util.List f47141G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f47142H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f47143I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private p088i8.q f47144J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f47145K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f47146L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f47147M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f47148N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f47149O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p088i8.q f47150P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f47151Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p088i8.q f47152R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f47153S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f47154T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private byte f47155U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f47156V;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.q a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.q(eVar, gVar);
        }
    }

    public static final class b extends p158p8.i implements p158p8.q {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private static final i8.q.b f47157K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static p158p8.r f47158L = new i8.q.b.a();

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p158p8.d f47159D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f47160E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private i8.q.b.c f47161F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private p088i8.q f47162G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private int f47163H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private byte f47164I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private int f47165J;

        static class a extends p158p8.b {
            a() {
            }

            @Override // p158p8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public i8.q.b a(p158p8.e eVar, p158p8.g gVar) {
                return new i8.q.b(eVar, gVar);
            }
        }

        /* JADX INFO: renamed from: i8.q$b$b, reason: collision with other inner class name */
        public static final class C0574b extends p8.i.b implements p158p8.q {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private int f47166D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            private i8.q.b.c f47167E = i8.q.b.c.INV;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private p088i8.q f47168F = p088i8.q.X();

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            private int f47169G;

            private C0574b() {
                u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static i8.q.b.C0574b t() {
                return new i8.q.b.C0574b();
            }

            private void u() {
            }

            @Override // p8.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public i8.q.b i() {
                i8.q.b bVarQ = q();
                if (bVarQ.d()) {
                    return bVarQ;
                }
                throw p158p8.a.AbstractC0680a.j(bVarQ);
            }

            public i8.q.b q() {
                i8.q.b bVar = new i8.q.b(this);
                int i6 = this.f47166D;
                int i10 = (i6 & 1) != 1 ? 0 : 1;
                bVar.f47161F = this.f47167E;
                if ((i6 & 2) == 2) {
                    i10 |= 2;
                }
                bVar.f47162G = this.f47168F;
                if ((i6 & 4) == 4) {
                    i10 |= 4;
                }
                bVar.f47163H = this.f47169G;
                bVar.f47160E = i10;
                return bVar;
            }

            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public i8.q.b.C0574b clone() {
                return t().l(q());
            }

            @Override // p8.i.b
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public i8.q.b.C0574b l(i8.q.b bVar) {
                if (bVar == i8.q.b.w()) {
                    return this;
                }
                if (bVar.A()) {
                    y(bVar.x());
                }
                if (bVar.B()) {
                    x(bVar.y());
                }
                if (bVar.C()) {
                    z(bVar.z());
                }
                m(k().e(bVar.f47159D));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p8.p.a
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public i8.q.b.C0574b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
                i8.q.b bVar = null;
                try {
                    try {
                        i8.q.b bVar2 = (i8.q.b) i8.q.b.f47158L.a(eVar, gVar);
                        if (bVar2 != null) {
                            l(bVar2);
                        }
                        return this;
                    } catch (p158p8.k e6) {
                        i8.q.b bVar3 = (i8.q.b) e6.a();
                        try {
                            throw e6;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            bVar = bVar3;
                            if (bVar != null) {
                                l(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                        l(bVar);
                    }
                    throw th;
                }
            }

            public i8.q.b.C0574b x(p088i8.q qVar) {
                if ((this.f47166D & 2) == 2 && this.f47168F != p088i8.q.X()) {
                    qVar = p088i8.q.z0(this.f47168F).l(qVar).v();
                }
                this.f47168F = qVar;
                this.f47166D |= 2;
                return this;
            }

            public i8.q.b.C0574b y(i8.q.b.c cVar) {
                cVar.getClass();
                this.f47166D |= 1;
                this.f47167E = cVar;
                return this;
            }

            public i8.q.b.C0574b z(int i6) {
                this.f47166D |= 4;
                this.f47169G = i6;
                return this;
            }
        }

        public enum c implements p8.j.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);


            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private static p8.j.b f47174H = new i8.q.b.c.a();

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private final int f47176C;

            static class a implements p8.j.b {
                a() {
                }

                @Override // p8.j.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public i8.q.b.c a(int i6) {
                    return i8.q.b.c.e(i6);
                }
            }

            c(int i6, int i10) {
                this.f47176C = i10;
            }

            public static i8.q.b.c e(int i6) {
                if (i6 == 0) {
                    return IN;
                }
                if (i6 == 1) {
                    return OUT;
                }
                if (i6 == 2) {
                    return INV;
                }
                if (i6 != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // p8.j.a
            public final int c() {
                return this.f47176C;
            }
        }

        static {
            i8.q.b bVar = new i8.q.b(true);
            f47157K = bVar;
            bVar.D();
        }

        private b(p158p8.e eVar, p158p8.g gVar) {
            this.f47164I = (byte) -1;
            this.f47165J = -1;
            D();
            p8.d.b bVarM = p158p8.d.M();
            p158p8.f fVarI = p158p8.f.I(bVarM, 1);
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        try {
                            int iJ = eVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    int iM = eVar.m();
                                    i8.q.b.c cVarE = i8.q.b.c.e(iM);
                                    if (cVarE == null) {
                                        fVarI.n0(iJ);
                                        fVarI.n0(iM);
                                    } else {
                                        this.f47160E |= 1;
                                        this.f47161F = cVarE;
                                    }
                                } else if (iJ == 18) {
                                    i8.q.c cVarE2 = (this.f47160E & 2) == 2 ? this.f47162G.e() : null;
                                    p088i8.q qVar = (p088i8.q) eVar.t(p088i8.q.f47138X, gVar);
                                    this.f47162G = qVar;
                                    if (cVarE2 != null) {
                                        cVarE2.l(qVar);
                                        this.f47162G = cVarE2.v();
                                    }
                                    this.f47160E |= 2;
                                } else if (iJ == 24) {
                                    this.f47160E |= 4;
                                    this.f47163H = eVar.r();
                                } else if (!p(eVar, fVarI, gVar, iJ)) {
                                }
                            }
                            z6 = true;
                        } catch (p158p8.k e6) {
                            throw e6.i(this);
                        }
                    } catch (java.io.IOException e10) {
                        throw new p158p8.k(e10.getMessage()).i(this);
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        fVarI.H();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f47159D = bVarM.o();
                    }
                    m();
                    throw th;
                }
            }
            try {
                fVarI.H();
            } catch (java.io.IOException unused2) {
            } finally {
                this.f47159D = bVarM.o();
            }
            m();
        }

        private b(p8.i.b bVar) {
            super(bVar);
            this.f47164I = (byte) -1;
            this.f47165J = -1;
            this.f47159D = bVar.k();
        }

        private b(boolean z6) {
            this.f47164I = (byte) -1;
            this.f47165J = -1;
            this.f47159D = p158p8.d.f52766C;
        }

        private void D() {
            this.f47161F = i8.q.b.c.INV;
            this.f47162G = p088i8.q.X();
            this.f47163H = 0;
        }

        public static i8.q.b.C0574b E() {
            return i8.q.b.C0574b.t();
        }

        public static i8.q.b.C0574b F(i8.q.b bVar) {
            return E().l(bVar);
        }

        public static i8.q.b w() {
            return f47157K;
        }

        public boolean A() {
            return (this.f47160E & 1) == 1;
        }

        public boolean B() {
            return (this.f47160E & 2) == 2;
        }

        public boolean C() {
            return (this.f47160E & 4) == 4;
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public i8.q.b.C0574b c() {
            return E();
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public i8.q.b.C0574b e() {
            return F(this);
        }

        @Override // p158p8.p
        public int b() {
            int i6 = this.f47165J;
            if (i6 != -1) {
                return i6;
            }
            int iH = (this.f47160E & 1) == 1 ? p158p8.f.h(1, this.f47161F.c()) : 0;
            if ((this.f47160E & 2) == 2) {
                iH += p158p8.f.r(2, this.f47162G);
            }
            if ((this.f47160E & 4) == 4) {
                iH += p158p8.f.o(3, this.f47163H);
            }
            int size = iH + this.f47159D.size();
            this.f47165J = size;
            return size;
        }

        @Override // p158p8.q
        public final boolean d() {
            byte b6 = this.f47164I;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (!B() || y().d()) {
                this.f47164I = (byte) 1;
                return true;
            }
            this.f47164I = (byte) 0;
            return false;
        }

        @Override // p158p8.p
        public void h(p158p8.f fVar) throws java.io.IOException {
            b();
            if ((this.f47160E & 1) == 1) {
                fVar.R(1, this.f47161F.c());
            }
            if ((this.f47160E & 2) == 2) {
                fVar.c0(2, this.f47162G);
            }
            if ((this.f47160E & 4) == 4) {
                fVar.Z(3, this.f47163H);
            }
            fVar.h0(this.f47159D);
        }

        public i8.q.b.c x() {
            return this.f47161F;
        }

        public p088i8.q y() {
            return this.f47162G;
        }

        public int z() {
            return this.f47163H;
        }
    }

    public static final class c extends p8.i.c implements p158p8.q {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f47177F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private boolean f47179H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private int f47180I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private int f47182K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private int f47183L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private int f47184M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private int f47185N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f47186O;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private int f47188Q;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private int f47190S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private int f47191T;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private java.util.List f47178G = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private p088i8.q f47181J = p088i8.q.X();

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private p088i8.q f47187P = p088i8.q.X();

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private p088i8.q f47189R = p088i8.q.X();

        private c() {
            z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.q.c x() {
            return new i8.q.c();
        }

        private void y() {
            if ((this.f47177F & 1) != 1) {
                this.f47178G = new java.util.ArrayList(this.f47178G);
                this.f47177F |= 1;
            }
        }

        private void z() {
        }

        public i8.q.c A(p088i8.q qVar) {
            if ((this.f47177F & 2048) == 2048 && this.f47189R != p088i8.q.X()) {
                qVar = p088i8.q.z0(this.f47189R).l(qVar).v();
            }
            this.f47189R = qVar;
            this.f47177F |= 2048;
            return this;
        }

        public i8.q.c B(p088i8.q qVar) {
            if ((this.f47177F & 8) == 8 && this.f47181J != p088i8.q.X()) {
                qVar = p088i8.q.z0(this.f47181J).l(qVar).v();
            }
            this.f47181J = qVar;
            this.f47177F |= 8;
            return this;
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public i8.q.c l(p088i8.q qVar) {
            if (qVar == p088i8.q.X()) {
                return this;
            }
            if (!qVar.f47141G.isEmpty()) {
                if (this.f47178G.isEmpty()) {
                    this.f47178G = qVar.f47141G;
                    this.f47177F &= -2;
                } else {
                    y();
                    this.f47178G.addAll(qVar.f47141G);
                }
            }
            if (qVar.r0()) {
                L(qVar.d0());
            }
            if (qVar.o0()) {
                J(qVar.a0());
            }
            if (qVar.p0()) {
                B(qVar.b0());
            }
            if (qVar.q0()) {
                K(qVar.c0());
            }
            if (qVar.m0()) {
                H(qVar.W());
            }
            if (qVar.v0()) {
                P(qVar.i0());
            }
            if (qVar.w0()) {
                Q(qVar.j0());
            }
            if (qVar.u0()) {
                O(qVar.h0());
            }
            if (qVar.s0()) {
                F(qVar.e0());
            }
            if (qVar.t0()) {
                M(qVar.f0());
            }
            if (qVar.k0()) {
                A(qVar.R());
            }
            if (qVar.l0()) {
                G(qVar.S());
            }
            if (qVar.n0()) {
                I(qVar.Z());
            }
            r(qVar);
            m(k().e(qVar.f47139E));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public i8.q.c g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.q qVar = null;
            try {
                try {
                    p088i8.q qVar2 = (p088i8.q) p088i8.q.f47138X.a(eVar, gVar);
                    if (qVar2 != null) {
                        l(qVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.q qVar3 = (p088i8.q) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        qVar = qVar3;
                        if (qVar != null) {
                            l(qVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (qVar != null) {
                    l(qVar);
                }
                throw th;
            }
        }

        public i8.q.c F(p088i8.q qVar) {
            if ((this.f47177F & 512) == 512 && this.f47187P != p088i8.q.X()) {
                qVar = p088i8.q.z0(this.f47187P).l(qVar).v();
            }
            this.f47187P = qVar;
            this.f47177F |= 512;
            return this;
        }

        public i8.q.c G(int i6) {
            this.f47177F |= 4096;
            this.f47190S = i6;
            return this;
        }

        public i8.q.c H(int i6) {
            this.f47177F |= 32;
            this.f47183L = i6;
            return this;
        }

        public i8.q.c I(int i6) {
            this.f47177F |= 8192;
            this.f47191T = i6;
            return this;
        }

        public i8.q.c J(int i6) {
            this.f47177F |= 4;
            this.f47180I = i6;
            return this;
        }

        public i8.q.c K(int i6) {
            this.f47177F |= 16;
            this.f47182K = i6;
            return this;
        }

        public i8.q.c L(boolean z6) {
            this.f47177F |= 2;
            this.f47179H = z6;
            return this;
        }

        public i8.q.c M(int i6) {
            this.f47177F |= 1024;
            this.f47188Q = i6;
            return this;
        }

        public i8.q.c O(int i6) {
            this.f47177F |= 256;
            this.f47186O = i6;
            return this;
        }

        public i8.q.c P(int i6) {
            this.f47177F |= 64;
            this.f47184M = i6;
            return this;
        }

        public i8.q.c Q(int i6) {
            this.f47177F |= 128;
            this.f47185N = i6;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public p088i8.q i() {
            p088i8.q qVarV = v();
            if (qVarV.d()) {
                return qVarV;
            }
            throw p158p8.a.AbstractC0680a.j(qVarV);
        }

        public p088i8.q v() {
            p088i8.q qVar = new p088i8.q(this);
            int i6 = this.f47177F;
            if ((i6 & 1) == 1) {
                this.f47178G = j$.util.DesugarCollections.unmodifiableList(this.f47178G);
                this.f47177F &= -2;
            }
            qVar.f47141G = this.f47178G;
            int i10 = (i6 & 2) != 2 ? 0 : 1;
            qVar.f47142H = this.f47179H;
            if ((i6 & 4) == 4) {
                i10 |= 2;
            }
            qVar.f47143I = this.f47180I;
            if ((i6 & 8) == 8) {
                i10 |= 4;
            }
            qVar.f47144J = this.f47181J;
            if ((i6 & 16) == 16) {
                i10 |= 8;
            }
            qVar.f47145K = this.f47182K;
            if ((i6 & 32) == 32) {
                i10 |= 16;
            }
            qVar.f47146L = this.f47183L;
            if ((i6 & 64) == 64) {
                i10 |= 32;
            }
            qVar.f47147M = this.f47184M;
            if ((i6 & 128) == 128) {
                i10 |= 64;
            }
            qVar.f47148N = this.f47185N;
            if ((i6 & 256) == 256) {
                i10 |= 128;
            }
            qVar.f47149O = this.f47186O;
            if ((i6 & 512) == 512) {
                i10 |= 256;
            }
            qVar.f47150P = this.f47187P;
            if ((i6 & 1024) == 1024) {
                i10 |= 512;
            }
            qVar.f47151Q = this.f47188Q;
            if ((i6 & 2048) == 2048) {
                i10 |= 1024;
            }
            qVar.f47152R = this.f47189R;
            if ((i6 & 4096) == 4096) {
                i10 |= 2048;
            }
            qVar.f47153S = this.f47190S;
            if ((i6 & 8192) == 8192) {
                i10 |= 4096;
            }
            qVar.f47154T = this.f47191T;
            qVar.f47140F = i10;
            return qVar;
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.q.c clone() {
            return x().l(v());
        }
    }

    static {
        p088i8.q qVar = new p088i8.q(true);
        f47137W = qVar;
        qVar.x0();
    }

    private q(p158p8.e eVar, p158p8.g gVar) {
        int i6;
        i8.q.c cVarE;
        int i10;
        this.f47155U = (byte) -1;
        this.f47156V = -1;
        x0();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        boolean z10 = false;
        while (!z6) {
            try {
                try {
                    try {
                        int iJ = eVar.J();
                        switch (iJ) {
                            case 0:
                                z6 = true;
                                break;
                            case 8:
                                this.f47140F |= 4096;
                                this.f47154T = eVar.r();
                                break;
                            case 18:
                                if (!z10) {
                                    this.f47141G = new java.util.ArrayList();
                                    z10 = true;
                                }
                                this.f47141G.add(eVar.t(i8.q.b.f47158L, gVar));
                                break;
                            case 24:
                                this.f47140F |= 1;
                                this.f47142H = eVar.j();
                                break;
                            case 32:
                                this.f47140F |= 2;
                                this.f47143I = eVar.r();
                                break;
                            case 42:
                                i6 = 4;
                                cVarE = (this.f47140F & 4) == 4 ? this.f47144J.e() : null;
                                p088i8.q qVar = (p088i8.q) eVar.t(f47138X, gVar);
                                this.f47144J = qVar;
                                if (cVarE != null) {
                                    cVarE.l(qVar);
                                    this.f47144J = cVarE.v();
                                }
                                i10 = this.f47140F;
                                this.f47140F = i10 | i6;
                                break;
                            case 48:
                                this.f47140F |= 16;
                                this.f47146L = eVar.r();
                                break;
                            case 56:
                                this.f47140F |= 32;
                                this.f47147M = eVar.r();
                                break;
                            case 64:
                                this.f47140F |= 8;
                                this.f47145K = eVar.r();
                                break;
                            case 72:
                                this.f47140F |= 64;
                                this.f47148N = eVar.r();
                                break;
                            case 82:
                                i6 = 256;
                                cVarE = (this.f47140F & 256) == 256 ? this.f47150P.e() : null;
                                p088i8.q qVar2 = (p088i8.q) eVar.t(f47138X, gVar);
                                this.f47150P = qVar2;
                                if (cVarE != null) {
                                    cVarE.l(qVar2);
                                    this.f47150P = cVarE.v();
                                }
                                i10 = this.f47140F;
                                this.f47140F = i10 | i6;
                                break;
                            case 88:
                                this.f47140F |= 512;
                                this.f47151Q = eVar.r();
                                break;
                            case 96:
                                this.f47140F |= 128;
                                this.f47149O = eVar.r();
                                break;
                            case 106:
                                i6 = 1024;
                                cVarE = (this.f47140F & 1024) == 1024 ? this.f47152R.e() : null;
                                p088i8.q qVar3 = (p088i8.q) eVar.t(f47138X, gVar);
                                this.f47152R = qVar3;
                                if (cVarE != null) {
                                    cVarE.l(qVar3);
                                    this.f47152R = cVarE.v();
                                }
                                i10 = this.f47140F;
                                this.f47140F = i10 | i6;
                                break;
                            case 112:
                                this.f47140F |= 2048;
                                this.f47153S = eVar.r();
                                break;
                            default:
                                if (!p(eVar, fVarI, gVar, iJ)) {
                                    z6 = true;
                                }
                                break;
                        }
                    } catch (java.io.IOException e6) {
                        throw new p158p8.k(e6.getMessage()).i(this);
                    }
                } catch (p158p8.k e10) {
                    throw e10.i(this);
                }
            } catch (java.lang.Throwable th) {
                if (z10) {
                    this.f47141G = j$.util.DesugarCollections.unmodifiableList(this.f47141G);
                }
                try {
                    fVarI.H();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f47139E = bVarM.o();
                }
                m();
                throw th;
            }
        }
        if (z10) {
            this.f47141G = j$.util.DesugarCollections.unmodifiableList(this.f47141G);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f47139E = bVarM.o();
        }
        m();
    }

    private q(p8.i.c cVar) {
        super(cVar);
        this.f47155U = (byte) -1;
        this.f47156V = -1;
        this.f47139E = cVar.k();
    }

    private q(boolean z6) {
        this.f47155U = (byte) -1;
        this.f47156V = -1;
        this.f47139E = p158p8.d.f52766C;
    }

    public static p088i8.q X() {
        return f47137W;
    }

    private void x0() {
        this.f47141G = java.util.Collections.emptyList();
        this.f47142H = false;
        this.f47143I = 0;
        this.f47144J = X();
        this.f47145K = 0;
        this.f47146L = 0;
        this.f47147M = 0;
        this.f47148N = 0;
        this.f47149O = 0;
        this.f47150P = X();
        this.f47151Q = 0;
        this.f47152R = X();
        this.f47153S = 0;
        this.f47154T = 0;
    }

    public static i8.q.c y0() {
        return i8.q.c.x();
    }

    public static i8.q.c z0(p088i8.q qVar) {
        return y0().l(qVar);
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public i8.q.c c() {
        return y0();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public i8.q.c e() {
        return z0(this);
    }

    public p088i8.q R() {
        return this.f47152R;
    }

    public int S() {
        return this.f47153S;
    }

    public i8.q.b T(int i6) {
        return (i8.q.b) this.f47141G.get(i6);
    }

    public int U() {
        return this.f47141G.size();
    }

    public java.util.List V() {
        return this.f47141G;
    }

    public int W() {
        return this.f47146L;
    }

    @Override // p158p8.q
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public p088i8.q a() {
        return f47137W;
    }

    public int Z() {
        return this.f47154T;
    }

    public int a0() {
        return this.f47143I;
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47156V;
        if (i6 != -1) {
            return i6;
        }
        int iO = (this.f47140F & 4096) == 4096 ? p158p8.f.o(1, this.f47154T) : 0;
        for (int i10 = 0; i10 < this.f47141G.size(); i10++) {
            iO += p158p8.f.r(2, (p158p8.p) this.f47141G.get(i10));
        }
        if ((this.f47140F & 1) == 1) {
            iO += p158p8.f.a(3, this.f47142H);
        }
        if ((this.f47140F & 2) == 2) {
            iO += p158p8.f.o(4, this.f47143I);
        }
        if ((this.f47140F & 4) == 4) {
            iO += p158p8.f.r(5, this.f47144J);
        }
        if ((this.f47140F & 16) == 16) {
            iO += p158p8.f.o(6, this.f47146L);
        }
        if ((this.f47140F & 32) == 32) {
            iO += p158p8.f.o(7, this.f47147M);
        }
        if ((this.f47140F & 8) == 8) {
            iO += p158p8.f.o(8, this.f47145K);
        }
        if ((this.f47140F & 64) == 64) {
            iO += p158p8.f.o(9, this.f47148N);
        }
        if ((this.f47140F & 256) == 256) {
            iO += p158p8.f.r(10, this.f47150P);
        }
        if ((this.f47140F & 512) == 512) {
            iO += p158p8.f.o(11, this.f47151Q);
        }
        if ((this.f47140F & 128) == 128) {
            iO += p158p8.f.o(12, this.f47149O);
        }
        if ((this.f47140F & 1024) == 1024) {
            iO += p158p8.f.r(13, this.f47152R);
        }
        if ((this.f47140F & 2048) == 2048) {
            iO += p158p8.f.o(14, this.f47153S);
        }
        int iT = iO + t() + this.f47139E.size();
        this.f47156V = iT;
        return iT;
    }

    public p088i8.q b0() {
        return this.f47144J;
    }

    public int c0() {
        return this.f47145K;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47155U;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < U(); i6++) {
            if (!T(i6).d()) {
                this.f47155U = (byte) 0;
                return false;
            }
        }
        if (p0() && !b0().d()) {
            this.f47155U = (byte) 0;
            return false;
        }
        if (s0() && !e0().d()) {
            this.f47155U = (byte) 0;
            return false;
        }
        if (k0() && !R().d()) {
            this.f47155U = (byte) 0;
            return false;
        }
        if (s()) {
            this.f47155U = (byte) 1;
            return true;
        }
        this.f47155U = (byte) 0;
        return false;
    }

    public boolean d0() {
        return this.f47142H;
    }

    public p088i8.q e0() {
        return this.f47150P;
    }

    public int f0() {
        return this.f47151Q;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        p8.i.d.a aVarY = y();
        if ((this.f47140F & 4096) == 4096) {
            fVar.Z(1, this.f47154T);
        }
        for (int i6 = 0; i6 < this.f47141G.size(); i6++) {
            fVar.c0(2, (p158p8.p) this.f47141G.get(i6));
        }
        if ((this.f47140F & 1) == 1) {
            fVar.K(3, this.f47142H);
        }
        if ((this.f47140F & 2) == 2) {
            fVar.Z(4, this.f47143I);
        }
        if ((this.f47140F & 4) == 4) {
            fVar.c0(5, this.f47144J);
        }
        if ((this.f47140F & 16) == 16) {
            fVar.Z(6, this.f47146L);
        }
        if ((this.f47140F & 32) == 32) {
            fVar.Z(7, this.f47147M);
        }
        if ((this.f47140F & 8) == 8) {
            fVar.Z(8, this.f47145K);
        }
        if ((this.f47140F & 64) == 64) {
            fVar.Z(9, this.f47148N);
        }
        if ((this.f47140F & 256) == 256) {
            fVar.c0(10, this.f47150P);
        }
        if ((this.f47140F & 512) == 512) {
            fVar.Z(11, this.f47151Q);
        }
        if ((this.f47140F & 128) == 128) {
            fVar.Z(12, this.f47149O);
        }
        if ((this.f47140F & 1024) == 1024) {
            fVar.c0(13, this.f47152R);
        }
        if ((this.f47140F & 2048) == 2048) {
            fVar.Z(14, this.f47153S);
        }
        aVarY.a(200, fVar);
        fVar.h0(this.f47139E);
    }

    public int h0() {
        return this.f47149O;
    }

    public int i0() {
        return this.f47147M;
    }

    public int j0() {
        return this.f47148N;
    }

    public boolean k0() {
        return (this.f47140F & 1024) == 1024;
    }

    public boolean l0() {
        return (this.f47140F & 2048) == 2048;
    }

    public boolean m0() {
        return (this.f47140F & 16) == 16;
    }

    public boolean n0() {
        return (this.f47140F & 4096) == 4096;
    }

    public boolean o0() {
        return (this.f47140F & 2) == 2;
    }

    public boolean p0() {
        return (this.f47140F & 4) == 4;
    }

    public boolean q0() {
        return (this.f47140F & 8) == 8;
    }

    public boolean r0() {
        return (this.f47140F & 1) == 1;
    }

    public boolean s0() {
        return (this.f47140F & 256) == 256;
    }

    public boolean t0() {
        return (this.f47140F & 512) == 512;
    }

    public boolean u0() {
        return (this.f47140F & 128) == 128;
    }

    public boolean v0() {
        return (this.f47140F & 32) == 32;
    }

    public boolean w0() {
        return (this.f47140F & 64) == 64;
    }
}
