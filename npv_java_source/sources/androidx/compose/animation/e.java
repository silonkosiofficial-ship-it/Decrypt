package androidx.compose.animation;

/* JADX INFO: loaded from: classes.dex */
public final class e implements androidx.compose.animation.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.s0 f18717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p071h0.c f18718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Y0.v f18719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V.InterfaceC1753w0 f18720d = V.A1.d(Y0.t.b(Y0.t.f16230b.a()), null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p170r.K f18721e = p170r.V.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private V.G1 f18722f;

    public static final class a implements D0.U {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V.InterfaceC1753w0 f18723b;

        public a(boolean z6) {
            this.f18723b = V.A1.d(java.lang.Boolean.valueOf(z6), null, 2, null);
        }

        @Override // D0.U
        public java.lang.Object G(Y0.e eVar, java.lang.Object obj) {
            return this;
        }

        @Override // androidx.compose.ui.d
        public /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
            return p071h0.f.a(this, dVar);
        }

        @Override // androidx.compose.ui.d
        public /* synthetic */ java.lang.Object c(java.lang.Object obj, p237x7.p pVar) {
            return p071h0.g.b(this, obj, pVar);
        }

        @Override // androidx.compose.ui.d
        public /* synthetic */ boolean d(p237x7.l lVar) {
            return p071h0.g.a(this, lVar);
        }

        public final boolean g() {
            return ((java.lang.Boolean) this.f18723b.getValue()).booleanValue();
        }

        public final void j(boolean z6) {
            this.f18723b.setValue(java.lang.Boolean.valueOf(z6));
        }
    }

    private final class b extends p190t.t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u.s0.a f18724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final V.G1 f18725c;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.e f18727D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ D0.X f18728E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ long f18729F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.animation.e eVar, D0.X x6, long j6) {
                super(1);
                this.f18727D = eVar;
                this.f18728E = x6;
                this.f18729F = j6;
            }

            public final void a(D0.X.a aVar) {
                D0.X.a.j(aVar, this.f18728E, this.f18727D.h().a(Y0.u.a(this.f18728E.I0(), this.f18728E.w0()), this.f18729F, Y0.v.Ltr), 0.0f, 2, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.animation.e$b$b, reason: collision with other inner class name */
        static final class C0352b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.e f18730D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.e.b f18731E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0352b(androidx.compose.animation.e eVar, androidx.compose.animation.e.b bVar) {
                super(1);
                this.f18730D = eVar;
                this.f18731E = bVar;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p200u.I l(u.s0.b bVar) {
                p200u.I iB;
                V.G1 g6 = (V.G1) this.f18730D.i().c(bVar.b());
                long j6 = g6 != null ? ((Y0.t) g6.getValue()).j() : Y0.t.f16230b.a();
                V.G1 g10 = (V.G1) this.f18730D.i().c(bVar.d());
                long j10 = g10 != null ? ((Y0.t) g10.getValue()).j() : Y0.t.f16230b.a();
                p190t.x xVar = (p190t.x) this.f18731E.g().getValue();
                return (xVar == null || (iB = xVar.b(j6, j10)) == null) ? p200u.AbstractC7177k.j(0.0f, 0.0f, null, 7, null) : iB;
            }
        }

        static final class c extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.e f18732D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(androidx.compose.animation.e eVar) {
                super(1);
                this.f18732D = eVar;
            }

            public final long a(java.lang.Object obj) {
                V.G1 g6 = (V.G1) this.f18732D.i().c(obj);
                return g6 != null ? ((Y0.t) g6.getValue()).j() : Y0.t.f16230b.a();
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                return Y0.t.b(a(obj));
            }
        }

        public b(u.s0.a aVar, V.G1 g6) {
            this.f18724b = aVar;
            this.f18725c = g6;
        }

        @Override // D0.A
        public D0.K f(D0.M m6, D0.G g6, long j6) {
            D0.X xU = g6.U(j6);
            V.G1 g1A = this.f18724b.a(new androidx.compose.animation.e.b.C0352b(androidx.compose.animation.e.this, this), new androidx.compose.animation.e.b.c(androidx.compose.animation.e.this));
            androidx.compose.animation.e.this.j(g1A);
            long jA = m6.A0() ? Y0.u.a(xU.I0(), xU.w0()) : ((Y0.t) g1A.getValue()).j();
            return D0.L.b(m6, Y0.t.g(jA), Y0.t.f(jA), null, new androidx.compose.animation.e.b.a(androidx.compose.animation.e.this, xU, jA), 4, null);
        }

        public final V.G1 g() {
            return this.f18725c;
        }
    }

    public e(p200u.s0 s0Var, p071h0.c cVar, Y0.v vVar) {
        this.f18717a = s0Var;
        this.f18718b = cVar;
        this.f18719c = vVar;
    }

    private static final boolean f(V.InterfaceC1753w0 interfaceC1753w0) {
        return ((java.lang.Boolean) interfaceC1753w0.getValue()).booleanValue();
    }

    private static final void g(V.InterfaceC1753w0 interfaceC1753w0, boolean z6) {
        interfaceC1753w0.setValue(java.lang.Boolean.valueOf(z6));
    }

    @Override // androidx.compose.animation.d
    public p190t.k a(p190t.k kVar, p190t.x xVar) {
        kVar.e(xVar);
        return kVar;
    }

    @Override // u.s0.b
    public java.lang.Object b() {
        return this.f18717a.n().b();
    }

    @Override // u.s0.b
    public /* synthetic */ boolean c(java.lang.Object obj, java.lang.Object obj2) {
        return p200u.t0.a(this, obj, obj2);
    }

    @Override // u.s0.b
    public java.lang.Object d() {
        return this.f18717a.n().d();
    }

    public final androidx.compose.ui.d e(p190t.k kVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        androidx.compose.ui.d dVar;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(93755870, i6, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)");
        }
        boolean zS = interfaceC1734n.S(this);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);
            interfaceC1734n.K(objG);
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
        boolean z6 = false;
        V.G1 g1N = V.v1.n(kVar.b(), interfaceC1734n, 0);
        if (p247y7.AbstractC7350t.b(this.f18717a.i(), this.f18717a.p())) {
            g(interfaceC1753w0, z6);
        } else if (g1N.getValue() != null) {
            z6 = true;
            g(interfaceC1753w0, z6);
        }
        if (f(interfaceC1753w0)) {
            interfaceC1734n.T(249037309);
            u.s0.a aVarC = p200u.u0.c(this.f18717a, p200u.z0.e(Y0.t.f16230b), null, interfaceC1734n, 0, 2);
            boolean zS2 = interfaceC1734n.S(aVarC);
            java.lang.Object objG2 = interfaceC1734n.g();
            if (zS2 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                p190t.x xVar = (p190t.x) g1N.getValue();
                objG2 = ((xVar == null || xVar.a()) ? p111l0.e.b(androidx.compose.ui.d.f19586a) : androidx.compose.ui.d.f19586a).b(new androidx.compose.animation.e.b(aVarC, g1N));
                interfaceC1734n.K(objG2);
            }
            dVar = (androidx.compose.ui.d) objG2;
            interfaceC1734n.J();
        } else {
            interfaceC1734n.T(249353726);
            interfaceC1734n.J();
            this.f18722f = null;
            dVar = androidx.compose.ui.d.f19586a;
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return dVar;
    }

    public p071h0.c h() {
        return this.f18718b;
    }

    public final p170r.K i() {
        return this.f18721e;
    }

    public final void j(V.G1 g6) {
        this.f18722f = g6;
    }

    public void k(p071h0.c cVar) {
        this.f18718b = cVar;
    }

    public final void l(Y0.v vVar) {
        this.f18719c = vVar;
    }

    public final void m(long j6) {
        this.f18720d.setValue(Y0.t.b(j6));
    }
}
