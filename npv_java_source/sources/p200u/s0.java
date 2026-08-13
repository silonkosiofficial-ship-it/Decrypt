package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.v0 f55016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p200u.s0 f55017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f55018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V.InterfaceC1753w0 f55019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V.InterfaceC1753w0 f55020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V.InterfaceC1749u0 f55021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V.InterfaceC1749u0 f55022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final V.InterfaceC1753w0 f55023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p051f0.r f55024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p051f0.r f55025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final V.InterfaceC1753w0 f55026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f55027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final V.G1 f55028m;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p200u.x0 f55029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.String f55030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final V.InterfaceC1753w0 f55031c = V.A1.d(null, null, 2, null);

        /* JADX INFO: renamed from: u.s0$a$a, reason: collision with other inner class name */
        public final class C0719a implements V.G1 {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private final u.s0.d f55033C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private p237x7.l f55034D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            private p237x7.l f55035E;

            public C0719a(u.s0.d dVar, p237x7.l lVar, p237x7.l lVar2) {
                this.f55033C = dVar;
                this.f55034D = lVar;
                this.f55035E = lVar2;
            }

            public final u.s0.d e() {
                return this.f55033C;
            }

            public final p237x7.l g() {
                return this.f55035E;
            }

            @Override // V.G1
            public java.lang.Object getValue() {
                r(p200u.s0.this.n());
                return this.f55033C.getValue();
            }

            public final p237x7.l n() {
                return this.f55034D;
            }

            public final void o(p237x7.l lVar) {
                this.f55035E = lVar;
            }

            public final void q(p237x7.l lVar) {
                this.f55034D = lVar;
            }

            public final void r(u.s0.b bVar) {
                java.lang.Object objL = this.f55035E.l(bVar.d());
                if (!p200u.s0.this.u()) {
                    this.f55033C.K(objL, (p200u.I) this.f55034D.l(bVar));
                } else {
                    this.f55033C.I(this.f55035E.l(bVar.b()), objL, (p200u.I) this.f55034D.l(bVar));
                }
            }
        }

        public a(p200u.x0 x0Var, java.lang.String str) {
            this.f55029a = x0Var;
            this.f55030b = str;
        }

        public final V.G1 a(p237x7.l lVar, p237x7.l lVar2) {
            u.s0.a.C0719a c0719aB = b();
            if (c0719aB == null) {
                p200u.s0 s0Var = p200u.s0.this;
                c0719aB = new u.s0.a.C0719a(s0Var.new d(lVar2.l(s0Var.i()), p200u.AbstractC7181m.i(this.f55029a, lVar2.l(p200u.s0.this.i())), this.f55029a, this.f55030b), lVar, lVar2);
                p200u.s0 s0Var2 = p200u.s0.this;
                c(c0719aB);
                s0Var2.c(c0719aB.e());
            }
            p200u.s0 s0Var3 = p200u.s0.this;
            c0719aB.o(lVar2);
            c0719aB.q(lVar);
            c0719aB.r(s0Var3.n());
            return c0719aB;
        }

        public final u.s0.a.C0719a b() {
            return (u.s0.a.C0719a) this.f55031c.getValue();
        }

        public final void c(u.s0.a.C0719a c0719a) {
            this.f55031c.setValue(c0719a);
        }

        public final void d() {
            u.s0.a.C0719a c0719aB = b();
            if (c0719aB != null) {
                p200u.s0 s0Var = p200u.s0.this;
                c0719aB.e().I(c0719aB.g().l(s0Var.n().b()), c0719aB.g().l(s0Var.n().d()), (p200u.I) c0719aB.n().l(s0Var.n()));
            }
        }
    }

    public interface b {
        java.lang.Object b();

        boolean c(java.lang.Object obj, java.lang.Object obj2);

        java.lang.Object d();
    }

    private static final class c implements u.s0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f55037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.Object f55038b;

        public c(java.lang.Object obj, java.lang.Object obj2) {
            this.f55037a = obj;
            this.f55038b = obj2;
        }

        @Override // u.s0.b
        public java.lang.Object b() {
            return this.f55037a;
        }

        @Override // u.s0.b
        public /* synthetic */ boolean c(java.lang.Object obj, java.lang.Object obj2) {
            return p200u.t0.a(this, obj, obj2);
        }

        @Override // u.s0.b
        public java.lang.Object d() {
            return this.f55038b;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof u.s0.b) {
                u.s0.b bVar = (u.s0.b) obj;
                if (p247y7.AbstractC7350t.b(b(), bVar.b()) && p247y7.AbstractC7350t.b(d(), bVar.d())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            java.lang.Object objB = b();
            int iHashCode = (objB != null ? objB.hashCode() : 0) * 31;
            java.lang.Object objD = d();
            return iHashCode + (objD != null ? objD.hashCode() : 0);
        }
    }

    public final class d implements V.G1 {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final p200u.x0 f55039C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final java.lang.String f55040D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final V.InterfaceC1753w0 f55041E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final p200u.C7180l0 f55042F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private final V.InterfaceC1753w0 f55043G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private final V.InterfaceC1753w0 f55044H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private p200u.C7170g0.b f55045I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private p200u.r0 f55046J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private final V.InterfaceC1753w0 f55047K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private final V.InterfaceC1742q0 f55048L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private boolean f55049M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private final V.InterfaceC1753w0 f55050N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private p200u.r f55051O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private final V.InterfaceC1749u0 f55052P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private boolean f55053Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private final p200u.I f55054R;

        public d(java.lang.Object obj, p200u.r rVar, p200u.x0 x0Var, java.lang.String str) {
            java.lang.Object objL;
            this.f55039C = x0Var;
            this.f55040D = str;
            this.f55041E = V.A1.d(obj, null, 2, null);
            p200u.C7180l0 c7180l0J = p200u.AbstractC7177k.j(0.0f, 0.0f, null, 7, null);
            this.f55042F = c7180l0J;
            this.f55043G = V.A1.d(c7180l0J, null, 2, null);
            this.f55044H = V.A1.d(new p200u.r0(n(), x0Var, obj, s(), rVar), null, 2, null);
            this.f55047K = V.A1.d(java.lang.Boolean.TRUE, null, 2, null);
            this.f55048L = V.J0.a(-1.0f);
            this.f55050N = V.A1.d(obj, null, 2, null);
            this.f55051O = rVar;
            this.f55052P = V.AbstractC1736n1.a(g().b());
            java.lang.Float f6 = (java.lang.Float) p200u.Q0.h().get(x0Var);
            if (f6 != null) {
                float fFloatValue = f6.floatValue();
                p200u.r rVar2 = (p200u.r) x0Var.a().l(obj);
                int iB = rVar2.b();
                for (int i6 = 0; i6 < iB; i6++) {
                    rVar2.e(i6, fFloatValue);
                }
                objL = this.f55039C.b().l(rVar2);
            } else {
                objL = null;
            }
            this.f55054R = p200u.AbstractC7177k.j(0.0f, 0.0f, objL, 3, null);
        }

        private final void E(java.lang.Object obj) {
            this.f55041E.setValue(obj);
        }

        private final void G(java.lang.Object obj, boolean z6) {
            p200u.r0 r0Var = this.f55046J;
            if (p247y7.AbstractC7350t.b(r0Var != null ? r0Var.g() : null, s())) {
                y(new p200u.r0(this.f55054R, this.f55039C, obj, obj, p200u.AbstractC7191s.g(this.f55051O)));
                this.f55049M = true;
                A(g().b());
                return;
            }
            p200u.InterfaceC7175j interfaceC7175jN = (!z6 || this.f55053Q || (n() instanceof p200u.C7180l0)) ? n() : this.f55054R;
            if (p200u.s0.this.m() > 0) {
                interfaceC7175jN = p200u.AbstractC7177k.c(interfaceC7175jN, p200u.s0.this.m());
            }
            y(new p200u.r0(interfaceC7175jN, this.f55039C, obj, s(), this.f55051O));
            A(g().b());
            this.f55049M = false;
            p200u.s0.this.v();
        }

        static /* synthetic */ void H(u.s0.d dVar, java.lang.Object obj, boolean z6, int i6, java.lang.Object obj2) {
            if ((i6 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i6 & 2) != 0) {
                z6 = false;
            }
            dVar.G(obj, z6);
        }

        private final java.lang.Object s() {
            return this.f55041E.getValue();
        }

        private final void y(p200u.r0 r0Var) {
            this.f55044H.setValue(r0Var);
        }

        private final void z(p200u.I i6) {
            this.f55043G.setValue(i6);
        }

        public final void A(long j6) {
            this.f55052P.j(j6);
        }

        public final void B(boolean z6) {
            this.f55047K.setValue(java.lang.Boolean.valueOf(z6));
        }

        public final void C(p200u.C7170g0.b bVar) {
            if (!p247y7.AbstractC7350t.b(g().g(), g().i())) {
                this.f55046J = g();
                this.f55045I = bVar;
            }
            y(new p200u.r0(this.f55054R, this.f55039C, getValue(), getValue(), p200u.AbstractC7191s.g(this.f55051O)));
            A(g().b());
            this.f55049M = true;
        }

        public final void D(float f6) {
            this.f55048L.h(f6);
        }

        public void F(java.lang.Object obj) {
            this.f55050N.setValue(obj);
        }

        public final void I(java.lang.Object obj, java.lang.Object obj2, p200u.I i6) {
            E(obj2);
            z(i6);
            if (p247y7.AbstractC7350t.b(g().i(), obj) && p247y7.AbstractC7350t.b(g().g(), obj2)) {
                return;
            }
            H(this, obj, false, 2, null);
        }

        public final void J() {
            p200u.r0 r0Var;
            p200u.C7170g0.b bVar = this.f55045I;
            if (bVar == null || (r0Var = this.f55046J) == null) {
                return;
            }
            long jE = A7.a.e(bVar.c() * ((double) bVar.g()));
            java.lang.Object objF = r0Var.f(jE);
            if (this.f55049M) {
                g().k(objF);
            }
            g().j(objF);
            A(g().b());
            if (r() == -2.0f || this.f55049M) {
                F(objF);
            } else {
                x(p200u.s0.this.m());
            }
            if (jE < bVar.c()) {
                bVar.k(false);
            } else {
                this.f55045I = null;
                this.f55046J = null;
            }
        }

        public final void K(java.lang.Object obj, p200u.I i6) {
            if (this.f55049M) {
                p200u.r0 r0Var = this.f55046J;
                if (p247y7.AbstractC7350t.b(obj, r0Var != null ? r0Var.g() : null)) {
                    return;
                }
            }
            if (p247y7.AbstractC7350t.b(s(), obj) && r() == -1.0f) {
                return;
            }
            E(obj);
            z(i6);
            G(r() == -3.0f ? obj : getValue(), !t());
            B(r() == -3.0f);
            if (r() < 0.0f) {
                if (r() == -3.0f) {
                }
                this.f55049M = false;
                D(-1.0f);
            }
            obj = g().f((long) (g().b() * r()));
            F(obj);
            this.f55049M = false;
            D(-1.0f);
        }

        public final void e() {
            this.f55046J = null;
            this.f55045I = null;
            this.f55049M = false;
        }

        public final p200u.r0 g() {
            return (p200u.r0) this.f55044H.getValue();
        }

        @Override // V.G1
        public java.lang.Object getValue() {
            return this.f55050N.getValue();
        }

        public final p200u.I n() {
            return (p200u.I) this.f55043G.getValue();
        }

        public final long o() {
            return this.f55052P.a();
        }

        public final p200u.C7170g0.b q() {
            return this.f55045I;
        }

        public final float r() {
            return this.f55048L.b();
        }

        public final boolean t() {
            return ((java.lang.Boolean) this.f55047K.getValue()).booleanValue();
        }

        public java.lang.String toString() {
            return "current value: " + getValue() + ", target: " + s() + ", spec: " + n();
        }

        public final void u(long j6, boolean z6) {
            if (z6) {
                j6 = g().b();
            }
            F(g().f(j6));
            this.f55051O = g().d(j6);
            if (g().e(j6)) {
                B(true);
            }
        }

        public final void v() {
            D(-2.0f);
        }

        public final void w(float f6) {
            if (f6 != -4.0f && f6 != -5.0f) {
                D(f6);
                return;
            }
            p200u.r0 r0Var = this.f55046J;
            if (r0Var != null) {
                g().j(r0Var.g());
                this.f55045I = null;
                this.f55046J = null;
            }
            p200u.r0 r0VarG = g();
            java.lang.Object objI = f6 == -4.0f ? r0VarG.i() : r0VarG.g();
            g().j(objI);
            g().k(objI);
            F(objI);
            A(g().b());
        }

        public final void x(long j6) {
            if (r() == -1.0f) {
                this.f55053Q = true;
                if (p247y7.AbstractC7350t.b(g().g(), g().i())) {
                    F(g().g());
                } else {
                    F(g().f(j6));
                    this.f55051O = g().d(j6);
                }
            }
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ W8.N f55056D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p200u.s0 f55057E;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            float f55058G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f55059H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f55060I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ p200u.s0 f55061J;

            /* JADX INFO: renamed from: u.s0$e$a$a, reason: collision with other inner class name */
            static final class C0720a extends p247y7.AbstractC7352v implements p237x7.l {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ p200u.s0 f55062D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                final /* synthetic */ float f55063E;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0720a(p200u.s0 s0Var, float f6) {
                    super(1);
                    this.f55062D = s0Var;
                    this.f55063E = f6;
                }

                public final void a(long j6) {
                    if (this.f55062D.u()) {
                        return;
                    }
                    this.f55062D.x(j6, this.f55063E);
                }

                @Override // p237x7.l
                public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                    a(((java.lang.Number) obj).longValue());
                    return p087i7.M.f46721a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p200u.s0 s0Var, p127m7.e eVar) {
                super(2, eVar);
                this.f55061J = s0Var;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                float fN;
                W8.N n6;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f55059H;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    W8.N n10 = (W8.N) this.f55060I;
                    fN = p200u.AbstractC7190q0.n(n10.getCoroutineContext());
                    n6 = n10;
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fN = this.f55058G;
                    n6 = (W8.N) this.f55060I;
                    p087i7.x.b(obj);
                }
                while (W8.O.h(n6)) {
                    u.s0.e.a.C0720a c0720a = new u.s0.e.a.C0720a(this.f55061J, fN);
                    this.f55060I = n6;
                    this.f55058G = fN;
                    this.f55059H = 1;
                    if (V.AbstractC1729l0.c(c0720a, this) == objG) {
                        return objG;
                    }
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((u.s0.e.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                u.s0.e.a aVar = new u.s0.e.a(this.f55061J, eVar);
                aVar.f55060I = obj;
                return aVar;
            }
        }

        public static final class b implements V.M {
            @Override // V.M
            public void e() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(W8.N n6, p200u.s0 s0Var) {
            super(1);
            this.f55056D = n6;
            this.f55057E = s0Var;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.M l(V.N n6) {
            W8.AbstractC1788i.d(this.f55056D, null, W8.P.UNDISPATCHED, new u.s0.e.a(this.f55057E, null), 1, null);
            return new u.s0.e.b();
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f55065E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f55066F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(java.lang.Object obj, int i6) {
            super(2);
            this.f55065E = obj;
            this.f55066F = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p200u.s0.this.e(this.f55065E, interfaceC1734n, V.S0.a(this.f55066F | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.a {
        g() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Long b() {
            return java.lang.Long.valueOf(p200u.s0.this.f());
        }
    }

    public s0(java.lang.Object obj, java.lang.String str) {
        this(new p200u.Z(obj), null, str);
    }

    public s0(p200u.v0 v0Var, java.lang.String str) {
        this(v0Var, null, str);
    }

    public s0(p200u.v0 v0Var, p200u.s0 s0Var, java.lang.String str) {
        this.f55016a = v0Var;
        this.f55017b = s0Var;
        this.f55018c = str;
        this.f55019d = V.A1.d(i(), null, 2, null);
        this.f55020e = V.A1.d(new u.s0.c(i(), i()), null, 2, null);
        this.f55021f = V.AbstractC1736n1.a(0L);
        this.f55022g = V.AbstractC1736n1.a(Long.MIN_VALUE);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f55023h = V.A1.d(bool, null, 2, null);
        this.f55024i = V.v1.f();
        this.f55025j = V.v1.f();
        this.f55026k = V.A1.d(bool, null, 2, null);
        this.f55028m = V.v1.e(new u.s0.g());
        v0Var.f(this);
    }

    private final void F() {
        p051f0.r rVar = this.f55024i;
        int size = rVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((u.s0.d) rVar.get(i6)).v();
        }
        p051f0.r rVar2 = this.f55025j;
        int size2 = rVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((p200u.s0) rVar2.get(i10)).F();
        }
    }

    private final void L(u.s0.b bVar) {
        this.f55020e.setValue(bVar);
    }

    private final void O(boolean z6) {
        this.f55023h.setValue(java.lang.Boolean.valueOf(z6));
    }

    private final void P(long j6) {
        this.f55021f.j(j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long f() {
        p051f0.r rVar = this.f55024i;
        int size = rVar.size();
        long jMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            jMax = java.lang.Math.max(jMax, ((u.s0.d) rVar.get(i6)).o());
        }
        p051f0.r rVar2 = this.f55025j;
        int size2 = rVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            jMax = java.lang.Math.max(jMax, ((p200u.s0) rVar2.get(i10)).f());
        }
        return jMax;
    }

    private final boolean r() {
        return ((java.lang.Boolean) this.f55023h.getValue()).booleanValue();
    }

    private final long s() {
        return this.f55021f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        O(true);
        if (u()) {
            p051f0.r rVar = this.f55024i;
            int size = rVar.size();
            long jMax = 0;
            for (int i6 = 0; i6 < size; i6++) {
                u.s0.d dVar = (u.s0.d) rVar.get(i6);
                jMax = java.lang.Math.max(jMax, dVar.o());
                dVar.x(this.f55027l);
            }
            O(false);
        }
    }

    public final void A(long j6) {
        M(j6);
        this.f55016a.e(true);
    }

    public final void B(u.s0.a aVar) {
        u.s0.d dVarE;
        u.s0.a.C0719a c0719aB = aVar.b();
        if (c0719aB == null || (dVarE = c0719aB.e()) == null) {
            return;
        }
        C(dVarE);
    }

    public final void C(u.s0.d dVar) {
        this.f55024i.remove(dVar);
    }

    public final boolean D(p200u.s0 s0Var) {
        return this.f55025j.remove(s0Var);
    }

    public final void E(float f6) {
        p051f0.r rVar = this.f55024i;
        int size = rVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((u.s0.d) rVar.get(i6)).w(f6);
        }
        p051f0.r rVar2 = this.f55025j;
        int size2 = rVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((p200u.s0) rVar2.get(i10)).E(f6);
        }
    }

    public final void G(java.lang.Object obj, java.lang.Object obj2, long j6) {
        M(Long.MIN_VALUE);
        this.f55016a.e(false);
        if (!u() || !p247y7.AbstractC7350t.b(i(), obj) || !p247y7.AbstractC7350t.b(p(), obj2)) {
            if (!p247y7.AbstractC7350t.b(i(), obj)) {
                p200u.v0 v0Var = this.f55016a;
                if (v0Var instanceof p200u.Z) {
                    v0Var.d(obj);
                }
            }
            N(obj2);
            K(true);
            L(new u.s0.c(obj, obj2));
        }
        p051f0.r rVar = this.f55025j;
        int size = rVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            p200u.s0 s0Var = (p200u.s0) rVar.get(i6);
            p247y7.AbstractC7350t.d(s0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (s0Var.u()) {
                s0Var.G(s0Var.i(), s0Var.p(), j6);
            }
        }
        p051f0.r rVar2 = this.f55024i;
        int size2 = rVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((u.s0.d) rVar2.get(i10)).x(j6);
        }
        this.f55027l = j6;
    }

    public final void H(long j6) {
        if (o() == Long.MIN_VALUE) {
            M(j6);
        }
        J(j6);
        O(false);
        p051f0.r rVar = this.f55024i;
        int size = rVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((u.s0.d) rVar.get(i6)).x(j6);
        }
        p051f0.r rVar2 = this.f55025j;
        int size2 = rVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            p200u.s0 s0Var = (p200u.s0) rVar2.get(i10);
            if (!p247y7.AbstractC7350t.b(s0Var.p(), s0Var.i())) {
                s0Var.H(j6);
            }
        }
    }

    public final void I(p200u.C7170g0.b bVar) {
        p051f0.r rVar = this.f55024i;
        int size = rVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((u.s0.d) rVar.get(i6)).C(bVar);
        }
        p051f0.r rVar2 = this.f55025j;
        int size2 = rVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((p200u.s0) rVar2.get(i10)).I(bVar);
        }
    }

    public final void J(long j6) {
        if (this.f55017b == null) {
            P(j6);
        }
    }

    public final void K(boolean z6) {
        this.f55026k.setValue(java.lang.Boolean.valueOf(z6));
    }

    public final void M(long j6) {
        this.f55022g.j(j6);
    }

    public final void N(java.lang.Object obj) {
        this.f55019d.setValue(obj);
    }

    public final void Q() {
        p051f0.r rVar = this.f55024i;
        int size = rVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((u.s0.d) rVar.get(i6)).J();
        }
        p051f0.r rVar2 = this.f55025j;
        int size2 = rVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((p200u.s0) rVar2.get(i10)).Q();
        }
    }

    public final void R(java.lang.Object obj) {
        if (p247y7.AbstractC7350t.b(p(), obj)) {
            return;
        }
        L(new u.s0.c(p(), obj));
        if (!p247y7.AbstractC7350t.b(i(), p())) {
            this.f55016a.d(p());
        }
        N(obj);
        if (!t()) {
            O(true);
        }
        F();
    }

    public final boolean c(u.s0.d dVar) {
        return this.f55024i.add(dVar);
    }

    public final boolean d(p200u.s0 s0Var) {
        return this.f55025j.add(s0Var);
    }

    public final void e(java.lang.Object obj, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1493585151);
        if ((i6 & 6) == 0) {
            i10 = ((i6 & 8) == 0 ? interfaceC1734nR.S(obj) : interfaceC1734nR.l(obj) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.S(this) ? 32 : 16;
        }
        if ((i10 & 19) == 18 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1493585151, i10, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)");
            }
            if (u()) {
                interfaceC1734nR.T(1823992347);
            } else {
                interfaceC1734nR.T(1822507602);
                R(obj);
                if (!p247y7.AbstractC7350t.b(obj, i()) || t() || r()) {
                    interfaceC1734nR.T(1822738893);
                    java.lang.Object objG = interfaceC1734nR.g();
                    V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
                    if (objG == aVar.a()) {
                        V.C c6 = new V.C(V.Q.h(p127m7.j.f51198C, interfaceC1734nR));
                        interfaceC1734nR.K(c6);
                        objG = c6;
                    }
                    W8.N nA = ((V.C) objG).a();
                    int i11 = i10 & 112;
                    boolean zL = (i11 == 32) | interfaceC1734nR.l(nA);
                    java.lang.Object objG2 = interfaceC1734nR.g();
                    if (zL || objG2 == aVar.a()) {
                        objG2 = new u.s0.e(nA, this);
                        interfaceC1734nR.K(objG2);
                    }
                    V.Q.a(nA, this, (p237x7.l) objG2, interfaceC1734nR, i11);
                } else {
                    interfaceC1734nR.T(1823982427);
                }
                interfaceC1734nR.J();
            }
            interfaceC1734nR.J();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new u.s0.f(obj, i6));
        }
    }

    public final void g() {
        p051f0.r rVar = this.f55024i;
        int size = rVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((u.s0.d) rVar.get(i6)).e();
        }
        p051f0.r rVar2 = this.f55025j;
        int size2 = rVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((p200u.s0) rVar2.get(i10)).g();
        }
    }

    public final java.util.List h() {
        return this.f55024i;
    }

    public final java.lang.Object i() {
        return this.f55016a.a();
    }

    public final boolean j() {
        p051f0.r rVar = this.f55024i;
        int size = rVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((u.s0.d) rVar.get(i6)).q() != null) {
                return true;
            }
        }
        p051f0.r rVar2 = this.f55025j;
        int size2 = rVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (((p200u.s0) rVar2.get(i10)).j()) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String k() {
        return this.f55018c;
    }

    public final long l() {
        return this.f55027l;
    }

    public final long m() {
        p200u.s0 s0Var = this.f55017b;
        return s0Var != null ? s0Var.m() : s();
    }

    public final u.s0.b n() {
        return (u.s0.b) this.f55020e.getValue();
    }

    public final long o() {
        return this.f55022g.a();
    }

    public final java.lang.Object p() {
        return this.f55019d.getValue();
    }

    public final long q() {
        return ((java.lang.Number) this.f55028m.getValue()).longValue();
    }

    public final boolean t() {
        return o() != Long.MIN_VALUE;
    }

    public java.lang.String toString() {
        java.util.List listH = h();
        int size = listH.size();
        java.lang.String str = "Transition animation values: ";
        for (int i6 = 0; i6 < size; i6++) {
            str = str + ((u.s0.d) listH.get(i6)) + ", ";
        }
        return str;
    }

    public final boolean u() {
        return ((java.lang.Boolean) this.f55026k.getValue()).booleanValue();
    }

    public final void w() {
        z();
        this.f55016a.g();
    }

    public final void x(long j6, float f6) {
        if (o() == Long.MIN_VALUE) {
            A(j6);
        }
        long jO = j6 - o();
        if (f6 != 0.0f) {
            jO = A7.a.e(jO / ((double) f6));
        }
        J(jO);
        y(jO, f6 == 0.0f);
    }

    public final void y(long j6, boolean z6) {
        boolean z10 = true;
        if (o() == Long.MIN_VALUE) {
            A(j6);
        } else if (!this.f55016a.c()) {
            this.f55016a.e(true);
        }
        O(false);
        p051f0.r rVar = this.f55024i;
        int size = rVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            u.s0.d dVar = (u.s0.d) rVar.get(i6);
            if (!dVar.t()) {
                dVar.u(j6, z6);
            }
            if (!dVar.t()) {
                z10 = false;
            }
        }
        p051f0.r rVar2 = this.f55025j;
        int size2 = rVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            p200u.s0 s0Var = (p200u.s0) rVar2.get(i10);
            if (!p247y7.AbstractC7350t.b(s0Var.p(), s0Var.i())) {
                s0Var.y(j6, z6);
            }
            if (!p247y7.AbstractC7350t.b(s0Var.p(), s0Var.i())) {
                z10 = false;
            }
        }
        if (z10) {
            z();
        }
    }

    public final void z() {
        M(Long.MIN_VALUE);
        p200u.v0 v0Var = this.f55016a;
        if (v0Var instanceof p200u.Z) {
            v0Var.d(p());
        }
        J(0L);
        this.f55016a.e(false);
        p051f0.r rVar = this.f55025j;
        int size = rVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((p200u.s0) rVar.get(i6)).z();
        }
    }
}
