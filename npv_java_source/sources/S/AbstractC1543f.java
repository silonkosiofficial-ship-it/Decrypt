package S;

/* JADX INFO: renamed from: S.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1543f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f10979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f10980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f10981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f10982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p200u.C7198z f10983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f10984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f10985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f10986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f10987i;

    /* JADX INFO: renamed from: S.f$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10988D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f10989E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f10990F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ float f10991G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ A.B f10992H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ A.S f10993I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.q f10994J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f10995K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f10996L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.d dVar, long j6, long j10, float f6, A.B b6, A.S s6, p237x7.q qVar, int i6, int i10) {
            super(2);
            this.f10988D = dVar;
            this.f10989E = j6;
            this.f10990F = j10;
            this.f10991G = f6;
            this.f10992H = b6;
            this.f10993I = s6;
            this.f10994J = qVar;
            this.f10995K = i6;
            this.f10996L = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1543f.a(this.f10988D, this.f10989E, this.f10990F, this.f10991G, this.f10992H, this.f10993I, this.f10994J, interfaceC1734n, V.S0.a(this.f10995K | 1), this.f10996L);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.f$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: S.f$b$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ D0.X f10997D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(D0.X x6) {
                super(1);
                this.f10997D = x6;
            }

            public final void a(D0.X.a aVar) {
                D0.X.a.h(aVar, this.f10997D, 0, 0, 0.0f, 4, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        b(S.InterfaceC1551j interfaceC1551j) {
            super(3);
        }

        public final D0.K a(D0.M m6, D0.G g6, long j6) {
            D0.X xU = g6.U(j6);
            return D0.L.b(m6, xU.I0(), A7.a.d(xU.w0() + 0.0f), null, new S.AbstractC1543f.b.a(xU), 4, null);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((D0.M) obj, (D0.G) obj2, ((Y0.C1859b) obj3).r());
        }
    }

    /* JADX INFO: renamed from: S.f$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ A.S f10998D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ A.B f10999E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.q f11000F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(A.S s6, A.B b6, p237x7.q qVar) {
            super(2);
            this.f10998D = s6;
            this.f10999E = b6;
            this.f11000F = qVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1243053520, i6, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:912)");
            }
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.m.h(androidx.compose.foundation.layout.p.g(A.V.c(androidx.compose.foundation.layout.p.f(androidx.compose.ui.d.f19586a, 0.0f, 1, null), this.f10998D), U.C1678a.f13648a.b()), this.f10999E);
            A.C0768b.e eVarF = A.C0768b.f80a.f();
            p071h0.c.InterfaceC0526c interfaceC0526cI = p071h0.c.f45778a.i();
            p237x7.q qVar = this.f11000F;
            D0.I iB = A.I.b(eVarF, interfaceC0526cI, interfaceC1734n, 54);
            int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, dVarH);
            F0.InterfaceC0919g.a aVar = F0.InterfaceC0919g.f2641a;
            p237x7.a aVarA = aVar.a();
            if (!(interfaceC1734n.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734n.t();
            if (interfaceC1734n.o()) {
                interfaceC1734n.B(aVarA);
            } else {
                interfaceC1734n.H();
            }
            V.InterfaceC1734n interfaceC1734nA = V.L1.a(interfaceC1734n);
            V.L1.c(interfaceC1734nA, iB, aVar.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar.e());
            p237x7.p pVarB = aVar.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar.d());
            qVar.j(A.M.f17a, interfaceC1734n, 6);
            interfaceC1734n.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.f$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11001D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f11002E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f11003F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ float f11004G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ A.B f11005H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ A.S f11006I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.q f11007J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f11008K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f11009L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.d dVar, long j6, long j10, float f6, A.B b6, A.S s6, S.InterfaceC1551j interfaceC1551j, p237x7.q qVar, int i6, int i10) {
            super(2);
            this.f11001D = dVar;
            this.f11002E = j6;
            this.f11003F = j10;
            this.f11004G = f6;
            this.f11005H = b6;
            this.f11006I = s6;
            this.f11007J = qVar;
            this.f11008K = i6;
            this.f11009L = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1543f.b(this.f11001D, this.f11002E, this.f11003F, this.f11004G, this.f11005H, this.f11006I, null, this.f11007J, interfaceC1734n, V.S0.a(this.f11008K | 1), this.f11009L);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.f$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.l {
        e(S.InterfaceC1551j interfaceC1551j) {
            super(1);
        }

        public final void a(float f6) {
            throw null;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((java.lang.Number) obj).floatValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.f$f, reason: collision with other inner class name */
    static final class C0245f extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f11010G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ float f11011H;

        C0245f(S.InterfaceC1551j interfaceC1551j, p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            int i6 = this.f11010G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                throw null;
            }
            if (i6 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return p087i7.M.f46721a;
        }

        public final java.lang.Object H(W8.N n6, float f6, p127m7.e eVar) {
            S.AbstractC1543f.C0245f c0245f = new S.AbstractC1543f.C0245f(null, eVar);
            c0245f.f11011H = f6;
            return c0245f.B(p087i7.M.f46721a);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return H((W8.N) obj, ((java.lang.Number) obj2).floatValue(), (p127m7.e) obj3);
        }
    }

    /* JADX INFO: renamed from: S.f$g */
    static final class g extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11012D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11013E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11014F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.q f11015G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ float f11016H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ A.S f11017I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ S.w1 f11018J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f11019K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f11020L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p237x7.p pVar, androidx.compose.ui.d dVar, p237x7.p pVar2, p237x7.q qVar, float f6, A.S s6, S.w1 w1Var, S.y1 y1Var, int i6, int i10) {
            super(2);
            this.f11012D = pVar;
            this.f11013E = dVar;
            this.f11014F = pVar2;
            this.f11015G = qVar;
            this.f11016H = f6;
            this.f11017I = s6;
            this.f11018J = w1Var;
            this.f11019K = i6;
            this.f11020L = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1543f.c(this.f11012D, this.f11013E, this.f11014F, this.f11015G, this.f11016H, this.f11017I, this.f11018J, null, interfaceC1734n, V.S0.a(this.f11019K | 1), this.f11020L);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.f$h */
    static final class h extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f11021D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(S.y1 y1Var, float f6) {
            super(0);
            this.f11021D = f6;
        }

        public final void a() {
            p247y7.AbstractC7350t.a(null, -this.f11021D);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.f$i */
    static final class i extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ A.S f11022D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ float f11023E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ S.w1 f11024F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11025G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ M0.P f11026H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f11027I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11028J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11029K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(A.S s6, float f6, S.y1 y1Var, S.w1 w1Var, p237x7.p pVar, M0.P p6, boolean z6, p237x7.p pVar2, p237x7.p pVar3) {
            super(2);
            this.f11022D = s6;
            this.f11023E = f6;
            this.f11024F = w1Var;
            this.f11025G = pVar;
            this.f11026H = p6;
            this.f11027I = z6;
            this.f11028J = pVar2;
            this.f11029K = pVar3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float f(S.y1 y1Var) {
            if (y1Var == null) {
                return 0.0f;
            }
            y1Var.getState();
            return 0.0f;
        }

        public final void e(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1943739546, i6, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)");
            }
            final S.y1 y1Var = null;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.p.i(p111l0.e.b(A.V.c(androidx.compose.ui.d.f19586a, this.f11022D)), 0.0f, this.f11023E, 1, null);
            boolean zS = interfaceC1734n.S(null);
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new S.N0(y1Var) { // from class: S.g
                    @Override // S.N0
                    public final float a() {
                        return S.AbstractC1543f.i.f(null);
                    }
                };
                interfaceC1734n.K(objG);
            }
            S.N0 n6 = (S.N0) objG;
            long jC = this.f11024F.c();
            long jD = this.f11024F.d();
            long jB = this.f11024F.b();
            p237x7.p pVar = this.f11025G;
            M0.P p6 = this.f11026H;
            A.C0768b c0768b = A.C0768b.f80a;
            S.AbstractC1543f.g(dVarI, n6, jC, jD, jB, pVar, p6, 1.0f, c0768b.b(), this.f11027I ? c0768b.b() : c0768b.f(), 0, false, this.f11028J, this.f11029K, interfaceC1734n, 113246208, 3126);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            e((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.f$j */
    static final class j extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11030D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11031E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ M0.P f11032F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f11033G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11034H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.q f11035I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ float f11036J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ A.S f11037K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ S.w1 f11038L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f11039M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ int f11040N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.ui.d dVar, p237x7.p pVar, M0.P p6, boolean z6, p237x7.p pVar2, p237x7.q qVar, float f6, A.S s6, S.w1 w1Var, S.y1 y1Var, int i6, int i10) {
            super(2);
            this.f11030D = dVar;
            this.f11031E = pVar;
            this.f11032F = p6;
            this.f11033G = z6;
            this.f11034H = pVar2;
            this.f11035I = qVar;
            this.f11036J = f6;
            this.f11037K = s6;
            this.f11038L = w1Var;
            this.f11039M = i6;
            this.f11040N = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1543f.d(this.f11030D, this.f11031E, this.f11032F, this.f11033G, this.f11034H, this.f11035I, this.f11036J, this.f11037K, this.f11038L, null, interfaceC1734n, V.S0.a(this.f11039M | 1), this.f11040N);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.f$k */
    static final class k extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.q f11041D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(p237x7.q qVar) {
            super(2);
            this.f11041D = qVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1370231018, i6, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1895)");
            }
            A.C0768b.e eVarC = A.C0768b.f80a.c();
            p071h0.c.InterfaceC0526c interfaceC0526cI = p071h0.c.f45778a.i();
            p237x7.q qVar = this.f11041D;
            androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
            D0.I iB = A.I.b(eVarC, interfaceC0526cI, interfaceC1734n, 54);
            int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, aVar);
            F0.InterfaceC0919g.a aVar2 = F0.InterfaceC0919g.f2641a;
            p237x7.a aVarA = aVar2.a();
            if (!(interfaceC1734n.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734n.t();
            if (interfaceC1734n.o()) {
                interfaceC1734n.B(aVarA);
            } else {
                interfaceC1734n.H();
            }
            V.InterfaceC1734n interfaceC1734nA = V.L1.a(interfaceC1734n);
            V.L1.c(interfaceC1734nA, iB, aVar2.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar2.e());
            p237x7.p pVarB = aVar2.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar2.d());
            qVar.j(A.M.f17a, interfaceC1734n, 6);
            interfaceC1734n.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.f$l */
    static final class l extends p247y7.AbstractC7352v implements p237x7.l {
        l(S.y1 y1Var) {
            super(1);
        }

        public final void a(float f6) {
            throw null;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((java.lang.Number) obj).floatValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.f$m */
    static final class m extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f11042G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ float f11043H;

        m(S.y1 y1Var, p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            int i6 = this.f11042G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                throw null;
            }
            if (i6 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return p087i7.M.f46721a;
        }

        public final java.lang.Object H(W8.N n6, float f6, p127m7.e eVar) {
            S.AbstractC1543f.m mVar = new S.AbstractC1543f.m(null, eVar);
            mVar.f11043H = f6;
            return mVar.B(p087i7.M.f46721a);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return H((W8.N) obj, ((java.lang.Number) obj2).floatValue(), (p127m7.e) obj3);
        }
    }

    /* JADX INFO: renamed from: S.f$n */
    static final class n extends p247y7.AbstractC7352v implements p237x7.a {
        n(S.y1 y1Var) {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Float b() {
            return java.lang.Float.valueOf(0.0f > 0.01f ? 1.0f : 0.0f);
        }
    }

    /* JADX INFO: renamed from: S.f$o */
    static final class o extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.AbstractC1543f.o f11044D = new S.AbstractC1543f.o();

        o() {
            super(1);
        }

        public final void a(K0.w wVar) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((K0.w) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.f$p */
    static final class p implements D0.I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ S.N0 f11045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ A.C0768b.e f11046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ A.C0768b.m f11047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11048d;

        /* JADX INFO: renamed from: S.f$p$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ D0.X f11049D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f11050E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ D0.X f11051F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ A.C0768b.e f11052G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ long f11053H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ D0.X f11054I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ D0.M f11055J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ A.C0768b.m f11056K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ int f11057L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            final /* synthetic */ int f11058M;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(D0.X x6, int i6, D0.X x10, A.C0768b.e eVar, long j6, D0.X x11, D0.M m6, A.C0768b.m mVar, int i10, int i11) {
                super(1);
                this.f11049D = x6;
                this.f11050E = i6;
                this.f11051F = x10;
                this.f11052G = eVar;
                this.f11053H = j6;
                this.f11054I = x11;
                this.f11055J = m6;
                this.f11056K = mVar;
                this.f11057L = i10;
                this.f11058M = i11;
            }

            public final void a(D0.X.a aVar) {
                int iL;
                int iW0;
                int iW1;
                int iL2;
                D0.X x6 = this.f11049D;
                D0.X.a.l(aVar, x6, 0, (this.f11050E - x6.w0()) / 2, 0.0f, 4, null);
                D0.X x10 = this.f11051F;
                A.C0768b.e eVar = this.f11052G;
                A.C0768b c0768b = A.C0768b.f80a;
                if (p247y7.AbstractC7350t.b(eVar, c0768b.b())) {
                    iL = (Y0.C1859b.l(this.f11053H) - this.f11051F.I0()) / 2;
                    if (iL < this.f11049D.I0()) {
                        iL2 = this.f11049D.I0() - iL;
                    } else if (this.f11051F.I0() + iL > Y0.C1859b.l(this.f11053H) - this.f11054I.I0()) {
                        iL2 = (Y0.C1859b.l(this.f11053H) - this.f11054I.I0()) - (this.f11051F.I0() + iL);
                    }
                    iL += iL2;
                } else {
                    iL = p247y7.AbstractC7350t.b(eVar, c0768b.c()) ? (Y0.C1859b.l(this.f11053H) - this.f11051F.I0()) - this.f11054I.I0() : java.lang.Math.max(this.f11055J.S0(S.AbstractC1543f.f10987i), this.f11049D.I0());
                }
                int i6 = iL;
                A.C0768b.m mVar = this.f11056K;
                if (!p247y7.AbstractC7350t.b(mVar, c0768b.b())) {
                    if (p247y7.AbstractC7350t.b(mVar, c0768b.a())) {
                        int i10 = this.f11057L;
                        if (i10 == 0) {
                            iW1 = this.f11050E - this.f11051F.w0();
                        } else {
                            int iW2 = i10 - (this.f11051F.w0() - this.f11058M);
                            int iW3 = this.f11051F.w0() + iW2;
                            if (iW3 > Y0.C1859b.k(this.f11053H)) {
                                iW2 -= iW3 - Y0.C1859b.k(this.f11053H);
                            }
                            iW0 = (this.f11050E - this.f11051F.w0()) - java.lang.Math.max(0, iW2);
                        }
                    } else {
                        iW0 = 0;
                    }
                    D0.X.a.l(aVar, x10, i6, iW0, 0.0f, 4, null);
                    D0.X.a.l(aVar, this.f11054I, Y0.C1859b.l(this.f11053H) - this.f11054I.I0(), (this.f11050E - this.f11054I.w0()) / 2, 0.0f, 4, null);
                }
                iW1 = (this.f11050E - this.f11051F.w0()) / 2;
                iW0 = iW1;
                D0.X.a.l(aVar, x10, i6, iW0, 0.0f, 4, null);
                D0.X.a.l(aVar, this.f11054I, Y0.C1859b.l(this.f11053H) - this.f11054I.I0(), (this.f11050E - this.f11054I.w0()) / 2, 0.0f, 4, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        p(S.N0 n6, A.C0768b.e eVar, A.C0768b.m mVar, int i6) {
            this.f11045a = n6;
            this.f11046b = eVar;
            this.f11047c = mVar;
            this.f11048d = i6;
        }

        @Override // D0.I
        public /* synthetic */ int a(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return D0.H.b(this, interfaceC0896o, list, i6);
        }

        @Override // D0.I
        public final D0.K b(D0.M m6, java.util.List list, long j6) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                D0.G g6 = (D0.G) list.get(i6);
                if (p247y7.AbstractC7350t.b(androidx.compose.ui.layout.a.a(g6), "navigationIcon")) {
                    D0.X xU = g6.U(Y0.C1859b.d(j6, 0, 0, 0, 0, 14, null));
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        D0.G g10 = (D0.G) list.get(i10);
                        if (p247y7.AbstractC7350t.b(androidx.compose.ui.layout.a.a(g10), "actionIcons")) {
                            D0.X xU2 = g10.U(Y0.C1859b.d(j6, 0, 0, 0, 0, 14, null));
                            int iL = Y0.C1859b.l(j6) == Integer.MAX_VALUE ? Y0.C1859b.l(j6) : E7.j.d((Y0.C1859b.l(j6) - xU.I0()) - xU2.I0(), 0);
                            int size3 = list.size();
                            for (int i11 = 0; i11 < size3; i11++) {
                                D0.G g11 = (D0.G) list.get(i11);
                                if (p247y7.AbstractC7350t.b(androidx.compose.ui.layout.a.a(g11), "title")) {
                                    D0.X xU3 = g11.U(Y0.C1859b.d(j6, 0, iL, 0, 0, 12, null));
                                    int iQ = xU3.Q(D0.AbstractC0883b.b()) != Integer.MIN_VALUE ? xU3.Q(D0.AbstractC0883b.b()) : 0;
                                    float fA = this.f11045a.a();
                                    int iK = Y0.C1859b.k(j6) == Integer.MAX_VALUE ? Y0.C1859b.k(j6) : Y0.C1859b.k(j6) + (java.lang.Float.isNaN(fA) ? 0 : A7.a.d(fA));
                                    return D0.L.b(m6, Y0.C1859b.l(j6), iK, null, new S.AbstractC1543f.p.a(xU, iK, xU3, this.f11046b, j6, xU2, m6, this.f11047c, this.f11048d, iQ), 4, null);
                                }
                            }
                            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // D0.I
        public /* synthetic */ int c(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return D0.H.d(this, interfaceC0896o, list, i6);
        }

        @Override // D0.I
        public /* synthetic */ int e(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return D0.H.c(this, interfaceC0896o, list, i6);
        }

        @Override // D0.I
        public /* synthetic */ int j(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return D0.H.a(this, interfaceC0896o, list, i6);
        }
    }

    /* JADX INFO: renamed from: S.f$q */
    static final class q extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11059D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ S.N0 f11060E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f11061F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ long f11062G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ long f11063H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11064I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ M0.P f11065J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ float f11066K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ A.C0768b.m f11067L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ A.C0768b.e f11068M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ int f11069N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f11070O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11071P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11072Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        final /* synthetic */ int f11073R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ int f11074S;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(androidx.compose.ui.d dVar, S.N0 n6, long j6, long j10, long j11, p237x7.p pVar, M0.P p6, float f6, A.C0768b.m mVar, A.C0768b.e eVar, int i6, boolean z6, p237x7.p pVar2, p237x7.p pVar3, int i10, int i11) {
            super(2);
            this.f11059D = dVar;
            this.f11060E = n6;
            this.f11061F = j6;
            this.f11062G = j10;
            this.f11063H = j11;
            this.f11064I = pVar;
            this.f11065J = p6;
            this.f11066K = f6;
            this.f11067L = mVar;
            this.f11068M = eVar;
            this.f11069N = i6;
            this.f11070O = z6;
            this.f11071P = pVar2;
            this.f11072Q = pVar3;
            this.f11073R = i10;
            this.f11074S = i11;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1543f.g(this.f11059D, this.f11060E, this.f11061F, this.f11062G, this.f11063H, this.f11064I, this.f11065J, this.f11066K, this.f11067L, this.f11068M, this.f11069N, this.f11070O, this.f11071P, this.f11072Q, interfaceC1734n, V.S0.a(this.f11073R | 1), V.S0.a(this.f11074S));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static {
        float f6 = 16;
        float f10 = 12;
        float fQ = Y0.i.q(Y0.i.q(f6) - Y0.i.q(f10));
        f10979a = fQ;
        float fQ2 = Y0.i.q(Y0.i.q(f6) - Y0.i.q(f10));
        f10980b = fQ2;
        f10981c = Y0.i.q(Y0.i.q(f6) - fQ);
        f10982d = Y0.i.q(Y0.i.q(f10) - fQ2);
        f10983e = new p200u.C7198z(0.8f, 0.0f, 0.8f, 0.15f);
        f10984f = Y0.i.q(24);
        f10985g = Y0.i.q(28);
        float fQ3 = Y0.i.q(4);
        f10986h = fQ3;
        f10987i = Y0.i.q(Y0.i.q(f6) - fQ3);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010e A[PHI: r0 r4 r5 r7 r11 r13
  0x010e: PHI (r0v7 androidx.compose.ui.d) = (r0v4 androidx.compose.ui.d), (r0v12 androidx.compose.ui.d) binds: [B:115:0x014a, B:99:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r4v23 int) = (r4v17 int), (r4v27 int) binds: [B:115:0x014a, B:99:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r5v6 long) = (r5v3 long), (r5v2 long) binds: [B:115:0x014a, B:99:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r7v6 long) = (r7v3 long), (r7v2 long) binds: [B:115:0x014a, B:99:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r11v16 float) = (r11v3 float), (r11v2 float) binds: [B:115:0x014a, B:99:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r13v7 A.B) = (r13v3 A.B), (r13v2 A.B) binds: [B:115:0x014a, B:99:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:101:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0115  */
    /* JADX WARN: Code duplicated, block: B:103:0x0118  */
    /* JADX WARN: Code duplicated, block: B:106:0x011f  */
    /* JADX WARN: Code duplicated, block: B:109:0x012b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0138  */
    /* JADX WARN: Code duplicated, block: B:113:0x0141  */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    public static final void a(androidx.compose.ui.d dVar, long j6, long j10, float f6, A.B b6, A.S s6, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        long jA;
        long jC;
        float fB;
        int i12;
        A.B bC;
        int i13;
        A.S s10;
        int i14;
        androidx.compose.ui.d dVar2;
        int i15;
        A.B b10;
        A.S sD;
        float f10;
        androidx.compose.ui.d dVar3;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1391700845);
        int i16 = i10 & 1;
        if (i16 != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i6 & 48) == 0) {
            if ((i10 & 2) == 0) {
                jA = j6;
                int i17 = interfaceC1734nR.j(jA) ? 32 : 16;
                i11 |= i17;
            } else {
                jA = j6;
            }
            i11 |= i17;
        } else {
            jA = j6;
        }
        if ((i6 & 384) == 0) {
            if ((i10 & 4) == 0) {
                jC = j10;
                int i18 = interfaceC1734nR.j(jC) ? 256 : 128;
                i11 |= i18;
            } else {
                jC = j10;
            }
            i11 |= i18;
        } else {
            jC = j10;
        }
        int i19 = i10 & 8;
        if (i19 == 0) {
            if ((i6 & 3072) == 0) {
                fB = f6;
                i11 |= interfaceC1734nR.h(fB) ? 2048 : 1024;
            }
            i12 = i10 & 16;
            if (i12 != 0) {
                if ((i6 & 24576) == 0) {
                    bC = b6;
                    if (interfaceC1734nR.S(bC)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i11 |= i13;
                }
                if ((196608 & i6) == 0) {
                    if ((i10 & 32) == 0) {
                        s10 = s6;
                        int i20 = interfaceC1734nR.S(s10) ? 131072 : 65536;
                        i11 |= i20;
                    } else {
                        s10 = s6;
                    }
                    i11 |= i20;
                } else {
                    s10 = s6;
                }
                if ((i10 & 64) != 0) {
                    if ((i6 & 1572864) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i11 |= i14;
                    }
                    if ((i11 & 599187) == 599186 || !interfaceC1734nR.u()) {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0 || interfaceC1734nR.G()) {
                            if (i16 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if ((i10 & 2) != 0) {
                                jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                                i11 &= -113;
                            }
                            if ((i10 & 4) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                                i11 &= -897;
                            }
                            if (i19 != 0) {
                                fB = S.C1549i.f11144a.b();
                            }
                            if (i12 != 0) {
                                bC = S.C1549i.f11144a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i15 = i11 & (-458753);
                                b10 = bC;
                                sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                                f10 = fB;
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                            }
                            b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            fB = f10;
                            bC = b10;
                            s10 = sD;
                            dVar3 = dVar2;
                        } else {
                            interfaceC1734nR.A();
                            if ((i10 & 2) != 0) {
                                i11 &= -113;
                            }
                            if ((i10 & 4) != 0) {
                                i11 &= -897;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                            }
                            dVar2 = dVar;
                        }
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                        }
                        b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        fB = f10;
                        bC = b10;
                        s10 = sD;
                        dVar3 = dVar2;
                    } else {
                        interfaceC1734nR.A();
                        dVar3 = dVar;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.AbstractC1543f.a(dVar3, jA, jC, fB, bC, s10, qVar, i6, i10));
                    }
                }
                i11 |= 1572864;
                if ((i11 & 599187) == 599186) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i16 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i19 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i15 = i11 & (-458753);
                            b10 = bC;
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            f10 = fB;
                        } else {
                            i15 = i11;
                            f10 = fB;
                            b10 = bC;
                            sD = s10;
                        }
                    } else {
                        if (i16 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i19 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i15 = i11 & (-458753);
                            b10 = bC;
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            f10 = fB;
                        } else {
                            i15 = i11;
                            f10 = fB;
                            b10 = bC;
                            sD = s10;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                    }
                    b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    fB = f10;
                    bC = b10;
                    s10 = sD;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i16 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i19 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i15 = i11 & (-458753);
                            b10 = bC;
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            f10 = fB;
                        } else {
                            i15 = i11;
                            f10 = fB;
                            b10 = bC;
                            sD = s10;
                        }
                    } else {
                        if (i16 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i19 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i15 = i11 & (-458753);
                            b10 = bC;
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            f10 = fB;
                        } else {
                            i15 = i11;
                            f10 = fB;
                            b10 = bC;
                            sD = s10;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                    }
                    b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    fB = f10;
                    bC = b10;
                    s10 = sD;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1543f.a(dVar3, jA, jC, fB, bC, s10, qVar, i6, i10));
                }
            }
            i11 |= 24576;
            bC = b6;
            if ((196608 & i6) == 0) {
                if ((i10 & 32) == 0) {
                    s10 = s6;
                    if (interfaceC1734nR.S(s10)) {
                    }
                    i11 |= i20;
                } else {
                    s10 = s6;
                }
                i11 |= i20;
            } else {
                s10 = s6;
            }
            if ((i10 & 64) != 0) {
                if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i11 |= i14;
                }
                if ((i11 & 599187) == 599186) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i16 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i19 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i15 = i11 & (-458753);
                            b10 = bC;
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            f10 = fB;
                        } else {
                            i15 = i11;
                            f10 = fB;
                            b10 = bC;
                            sD = s10;
                        }
                    } else {
                        if (i16 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i19 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i15 = i11 & (-458753);
                            b10 = bC;
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            f10 = fB;
                        } else {
                            i15 = i11;
                            f10 = fB;
                            b10 = bC;
                            sD = s10;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                    }
                    b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    fB = f10;
                    bC = b10;
                    s10 = sD;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i16 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i19 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i15 = i11 & (-458753);
                            b10 = bC;
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            f10 = fB;
                        } else {
                            i15 = i11;
                            f10 = fB;
                            b10 = bC;
                            sD = s10;
                        }
                    } else {
                        if (i16 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i19 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i15 = i11 & (-458753);
                            b10 = bC;
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            f10 = fB;
                        } else {
                            i15 = i11;
                            f10 = fB;
                            b10 = bC;
                            sD = s10;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                    }
                    b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    fB = f10;
                    bC = b10;
                    s10 = sD;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1543f.a(dVar3, jA, jC, fB, bC, s10, qVar, i6, i10));
                }
            }
            i11 |= 1572864;
            if ((i11 & 599187) == 599186) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i16 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i19 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i15 = i11 & (-458753);
                        b10 = bC;
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        f10 = fB;
                    } else {
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                    }
                } else {
                    if (i16 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i19 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i15 = i11 & (-458753);
                        b10 = bC;
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        f10 = fB;
                    } else {
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                }
                b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                fB = f10;
                bC = b10;
                s10 = sD;
                dVar3 = dVar2;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i16 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i19 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i15 = i11 & (-458753);
                        b10 = bC;
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        f10 = fB;
                    } else {
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                    }
                } else {
                    if (i16 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i19 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i15 = i11 & (-458753);
                        b10 = bC;
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        f10 = fB;
                    } else {
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                }
                b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                fB = f10;
                bC = b10;
                s10 = sD;
                dVar3 = dVar2;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1543f.a(dVar3, jA, jC, fB, bC, s10, qVar, i6, i10));
            }
        }
        i11 |= 3072;
        fB = f6;
        i12 = i10 & 16;
        if (i12 != 0) {
            if ((i6 & 24576) == 0) {
                bC = b6;
                if (interfaceC1734nR.S(bC)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i11 |= i13;
            }
            if ((196608 & i6) == 0) {
                if ((i10 & 32) == 0) {
                    s10 = s6;
                    if (interfaceC1734nR.S(s10)) {
                    }
                    i11 |= i20;
                } else {
                    s10 = s6;
                }
                i11 |= i20;
            } else {
                s10 = s6;
            }
            if ((i10 & 64) != 0) {
                if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i11 |= i14;
                }
                if ((i11 & 599187) == 599186) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i16 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i19 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i15 = i11 & (-458753);
                            b10 = bC;
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            f10 = fB;
                        } else {
                            i15 = i11;
                            f10 = fB;
                            b10 = bC;
                            sD = s10;
                        }
                    } else {
                        if (i16 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i19 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i15 = i11 & (-458753);
                            b10 = bC;
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            f10 = fB;
                        } else {
                            i15 = i11;
                            f10 = fB;
                            b10 = bC;
                            sD = s10;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                    }
                    b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    fB = f10;
                    bC = b10;
                    s10 = sD;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i16 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i19 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i15 = i11 & (-458753);
                            b10 = bC;
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            f10 = fB;
                        } else {
                            i15 = i11;
                            f10 = fB;
                            b10 = bC;
                            sD = s10;
                        }
                    } else {
                        if (i16 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i19 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i15 = i11 & (-458753);
                            b10 = bC;
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            f10 = fB;
                        } else {
                            i15 = i11;
                            f10 = fB;
                            b10 = bC;
                            sD = s10;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                    }
                    b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    fB = f10;
                    bC = b10;
                    s10 = sD;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1543f.a(dVar3, jA, jC, fB, bC, s10, qVar, i6, i10));
                }
            }
            i11 |= 1572864;
            if ((i11 & 599187) == 599186) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i16 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i19 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i15 = i11 & (-458753);
                        b10 = bC;
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        f10 = fB;
                    } else {
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                    }
                } else {
                    if (i16 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i19 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i15 = i11 & (-458753);
                        b10 = bC;
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        f10 = fB;
                    } else {
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                }
                b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                fB = f10;
                bC = b10;
                s10 = sD;
                dVar3 = dVar2;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i16 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i19 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i15 = i11 & (-458753);
                        b10 = bC;
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        f10 = fB;
                    } else {
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                    }
                } else {
                    if (i16 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i19 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i15 = i11 & (-458753);
                        b10 = bC;
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        f10 = fB;
                    } else {
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                }
                b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                fB = f10;
                bC = b10;
                s10 = sD;
                dVar3 = dVar2;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1543f.a(dVar3, jA, jC, fB, bC, s10, qVar, i6, i10));
            }
        }
        i11 |= 24576;
        bC = b6;
        if ((196608 & i6) == 0) {
            if ((i10 & 32) == 0) {
                s10 = s6;
                if (interfaceC1734nR.S(s10)) {
                }
                i11 |= i20;
            } else {
                s10 = s6;
            }
            i11 |= i20;
        } else {
            s10 = s6;
        }
        if ((i10 & 64) != 0) {
            if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i11 |= i14;
            }
            if ((i11 & 599187) == 599186) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i16 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i19 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i15 = i11 & (-458753);
                        b10 = bC;
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        f10 = fB;
                    } else {
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                    }
                } else {
                    if (i16 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i19 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i15 = i11 & (-458753);
                        b10 = bC;
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        f10 = fB;
                    } else {
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                }
                b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                fB = f10;
                bC = b10;
                s10 = sD;
                dVar3 = dVar2;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i16 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i19 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i15 = i11 & (-458753);
                        b10 = bC;
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        f10 = fB;
                    } else {
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                    }
                } else {
                    if (i16 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i19 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i15 = i11 & (-458753);
                        b10 = bC;
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        f10 = fB;
                    } else {
                        i15 = i11;
                        f10 = fB;
                        b10 = bC;
                        sD = s10;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                }
                b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                fB = f10;
                bC = b10;
                s10 = sD;
                dVar3 = dVar2;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1543f.a(dVar3, jA, jC, fB, bC, s10, qVar, i6, i10));
            }
        }
        i11 |= 1572864;
        if ((i11 & 599187) == 599186) {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i16 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if ((i10 & 2) != 0) {
                    jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                    i11 &= -113;
                }
                if ((i10 & 4) != 0) {
                    jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                    i11 &= -897;
                }
                if (i19 != 0) {
                    fB = S.C1549i.f11144a.b();
                }
                if (i12 != 0) {
                    bC = S.C1549i.f11144a.c();
                }
                if ((i10 & 32) != 0) {
                    i15 = i11 & (-458753);
                    b10 = bC;
                    sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                    f10 = fB;
                } else {
                    i15 = i11;
                    f10 = fB;
                    b10 = bC;
                    sD = s10;
                }
            } else {
                if (i16 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if ((i10 & 2) != 0) {
                    jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                    i11 &= -113;
                }
                if ((i10 & 4) != 0) {
                    jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                    i11 &= -897;
                }
                if (i19 != 0) {
                    fB = S.C1549i.f11144a.b();
                }
                if (i12 != 0) {
                    bC = S.C1549i.f11144a.c();
                }
                if ((i10 & 32) != 0) {
                    i15 = i11 & (-458753);
                    b10 = bC;
                    sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                    f10 = fB;
                } else {
                    i15 = i11;
                    f10 = fB;
                    b10 = bC;
                    sD = s10;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
            }
            b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            fB = f10;
            bC = b10;
            s10 = sD;
            dVar3 = dVar2;
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i16 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if ((i10 & 2) != 0) {
                    jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                    i11 &= -113;
                }
                if ((i10 & 4) != 0) {
                    jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                    i11 &= -897;
                }
                if (i19 != 0) {
                    fB = S.C1549i.f11144a.b();
                }
                if (i12 != 0) {
                    bC = S.C1549i.f11144a.c();
                }
                if ((i10 & 32) != 0) {
                    i15 = i11 & (-458753);
                    b10 = bC;
                    sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                    f10 = fB;
                } else {
                    i15 = i11;
                    f10 = fB;
                    b10 = bC;
                    sD = s10;
                }
            } else {
                if (i16 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if ((i10 & 2) != 0) {
                    jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                    i11 &= -113;
                }
                if ((i10 & 4) != 0) {
                    jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                    i11 &= -897;
                }
                if (i19 != 0) {
                    fB = S.C1549i.f11144a.b();
                }
                if (i12 != 0) {
                    bC = S.C1549i.f11144a.c();
                }
                if ((i10 & 32) != 0) {
                    i15 = i11 & (-458753);
                    b10 = bC;
                    sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                    f10 = fB;
                } else {
                    i15 = i11;
                    f10 = fB;
                    b10 = bC;
                    sD = s10;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1391700845, i15, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
            }
            b(dVar2, jA, jC, f10, b10, sD, null, qVar, interfaceC1734nR, (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | ((i15 << 3) & 29360128), 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            fB = f10;
            bC = b10;
            s10 = sD;
            dVar3 = dVar2;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1543f.a(dVar3, jA, jC, fB, bC, s10, qVar, i6, i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013a A[PHI: r0 r2 r4 r5 r7 r9 r13
  0x013a: PHI (r0v20 androidx.compose.ui.d) = (r0v13 androidx.compose.ui.d), (r0v25 androidx.compose.ui.d) binds: [B:127:0x0183, B:107:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x013a: PHI (r2v18 float) = (r2v6 float), (r2v19 float) binds: [B:127:0x0183, B:107:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x013a: PHI (r4v31 A.B) = (r4v21 A.B), (r4v35 A.B) binds: [B:127:0x0183, B:107:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x013a: PHI (r5v6 long) = (r5v3 long), (r5v2 long) binds: [B:127:0x0183, B:107:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x013a: PHI (r7v7 long) = (r7v3 long), (r7v2 long) binds: [B:127:0x0183, B:107:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x013a: PHI (r9v4 A.S) = (r9v1 A.S), (r9v5 A.S) binds: [B:127:0x0183, B:107:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x013a: PHI (r13v8 int) = (r13v4 int), (r13v9 int) binds: [B:127:0x0183, B:107:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x013f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:117:0x0154  */
    /* JADX WARN: Code duplicated, block: B:119:0x0160  */
    /* JADX WARN: Code duplicated, block: B:121:0x0169  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x017d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0185  */
    /* JADX WARN: Code duplicated, block: B:131:0x018f  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:155:0x0207  */
    /* JADX WARN: Code duplicated, block: B:158:0x021f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0221  */
    /* JADX WARN: Code duplicated, block: B:162:0x0228  */
    /* JADX WARN: Code duplicated, block: B:164:0x0230  */
    /* JADX WARN: Code duplicated, block: B:167:0x027c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0292  */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    public static final void b(androidx.compose.ui.d dVar, long j6, long j10, float f6, A.B b6, A.S s6, S.InterfaceC1551j interfaceC1551j, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        long jA;
        long jC;
        float fB;
        int i12;
        A.B bC;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.compose.ui.d dVar2;
        A.S sD;
        A.S s10;
        float f10;
        int i17;
        A.B b10;
        S.InterfaceC1551j interfaceC1551j2;
        androidx.compose.ui.d dVarG;
        boolean z6;
        java.lang.Object objG;
        androidx.compose.ui.d dVar3;
        S.InterfaceC1551j interfaceC1551j3;
        float f11;
        long j11;
        long j12;
        A.S s11;
        A.B b11;
        V.InterfaceC1709e1 interfaceC1709e1X;
        int i18;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(422438773);
        int i19 = i10 & 1;
        if (i19 != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i6 & 48) == 0) {
            if ((i10 & 2) == 0) {
                jA = j6;
                int i20 = interfaceC1734nR.j(jA) ? 32 : 16;
                i11 |= i20;
            } else {
                jA = j6;
            }
            i11 |= i20;
        } else {
            jA = j6;
        }
        if ((i6 & 384) == 0) {
            if ((i10 & 4) == 0) {
                jC = j10;
                int i21 = interfaceC1734nR.j(jC) ? 256 : 128;
                i11 |= i21;
            } else {
                jC = j10;
            }
            i11 |= i21;
        } else {
            jC = j10;
        }
        int i22 = i10 & 8;
        if (i22 == 0) {
            if ((i6 & 3072) == 0) {
                fB = f6;
                i11 |= interfaceC1734nR.h(fB) ? 2048 : 1024;
            }
            i12 = i10 & 16;
            if (i12 != 0) {
                if ((i6 & 24576) == 0) {
                    bC = b6;
                    if (interfaceC1734nR.S(bC)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i11 |= i13;
                }
                if ((i6 & 196608) != 0) {
                    if ((i10 & 32) == 0 || !interfaceC1734nR.S(s6)) {
                        i18 = 65536;
                    } else {
                        i18 = 131072;
                    }
                    i11 |= i18;
                }
                i14 = i10 & 64;
                if (i14 != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.S(interfaceC1551j)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i11 |= i15;
                }
                if ((i10 & 128) != 0) {
                    i11 |= 12582912;
                } else if ((i6 & 12582912) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i11 |= i16;
                }
                if ((4793491 & i11) == 4793490 || !interfaceC1734nR.u()) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0 || interfaceC1734nR.G()) {
                        if (i19 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i10 & 2) != 0) {
                            jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                            i11 &= -897;
                        }
                        if (i22 != 0) {
                            fB = S.C1549i.f11144a.b();
                        }
                        if (i12 != 0) {
                            bC = S.C1549i.f11144a.c();
                        }
                        if ((i10 & 32) != 0) {
                            sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                            i11 &= -458753;
                        } else {
                            sD = s6;
                        }
                        s10 = sD;
                        f10 = fB;
                        i17 = i11;
                        b10 = bC;
                        if (i14 != 0) {
                            interfaceC1551j2 = null;
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(422438773, i17, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
                        }
                        interfaceC1734nR.T(1393560009);
                        if (interfaceC1551j2 != null || interfaceC1551j2.a()) {
                            dVarG = androidx.compose.ui.d.f19586a;
                        } else {
                            androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
                            p230x.s sVar = p230x.s.Vertical;
                            int i23 = i17 & 3670016;
                            boolean z10 = i23 == 1048576;
                            java.lang.Object objG2 = interfaceC1734nR.g();
                            if (z10 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                                objG2 = new S.AbstractC1543f.e(interfaceC1551j2);
                                interfaceC1734nR.K(objG2);
                            }
                            p230x.o oVarI = p230x.n.i((p237x7.l) objG2, interfaceC1734nR, 0);
                            boolean z11 = i23 == 1048576;
                            java.lang.Object objG3 = interfaceC1734nR.g();
                            if (z11 || objG3 == V.InterfaceC1734n.f14931a.a()) {
                                objG3 = new S.AbstractC1543f.C0245f(interfaceC1551j2, null);
                                interfaceC1734nR.K(objG3);
                            }
                            dVarG = p230x.n.g(aVar, oVarI, sVar, (188 & 4) != 0, (188 & 8) != 0 ? null : null, (188 & 16) != 0 ? false : false, (188 & 32) != 0 ? p230x.n.f56571a : null, (188 & 64) != 0 ? p230x.n.f56572b : (p237x7.q) objG3, (188 & 128) != 0 ? false : false);
                        }
                        interfaceC1734nR.J();
                        p141o0.e2 e2VarE = S.T0.e(U.C1678a.f13648a.c(), interfaceC1734nR, 6);
                        if ((3670016 & i17) == 1048576) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG = interfaceC1734nR.g();
                        if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
                            objG = new S.AbstractC1543f.b(interfaceC1551j2);
                            interfaceC1734nR.K(objG);
                        }
                        dVar3 = dVar2;
                        A.B b12 = b10;
                        int i24 = i17 << 3;
                        int i25 = (i24 & 896) | 12582912 | (i24 & 7168) | (i24 & 57344);
                        S.InterfaceC1551j interfaceC1551j4 = interfaceC1551j2;
                        S.c1.a(androidx.compose.ui.layout.b.a(dVar2, (p237x7.q) objG).b(dVarG), e2VarE, jA, jC, f10, 0.0f, null, p031d0.c.e(1243053520, true, new S.AbstractC1543f.c(s10, b10, qVar), interfaceC1734nR, 54), interfaceC1734nR, i25, 96);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        A.S s12 = s10;
                        interfaceC1551j3 = interfaceC1551j4;
                        f11 = f10;
                        j11 = jA;
                        j12 = jC;
                        s11 = s12;
                        b11 = b12;
                    } else {
                        interfaceC1734nR.A();
                        if ((i10 & 2) != 0) {
                            i11 &= -113;
                        }
                        if ((i10 & 4) != 0) {
                            i11 &= -897;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                        }
                        dVar2 = dVar;
                        s10 = s6;
                        f10 = fB;
                        i17 = i11;
                        b10 = bC;
                    }
                    interfaceC1551j2 = interfaceC1551j;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(422438773, i17, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
                    }
                    interfaceC1734nR.T(1393560009);
                    if (interfaceC1551j2 != null) {
                        dVarG = androidx.compose.ui.d.f19586a;
                    } else {
                        dVarG = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    p141o0.e2 e2VarE2 = S.T0.e(U.C1678a.f13648a.c(), interfaceC1734nR, 6);
                    if ((3670016 & i17) == 1048576) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new S.AbstractC1543f.b(interfaceC1551j2);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.AbstractC1543f.b(interfaceC1551j2);
                        interfaceC1734nR.K(objG);
                    }
                    dVar3 = dVar2;
                    A.B b13 = b10;
                    int i26 = i17 << 3;
                    int i27 = (i26 & 896) | 12582912 | (i26 & 7168) | (i26 & 57344);
                    S.InterfaceC1551j interfaceC1551j5 = interfaceC1551j2;
                    S.c1.a(androidx.compose.ui.layout.b.a(dVar2, (p237x7.q) objG).b(dVarG), e2VarE2, jA, jC, f10, 0.0f, null, p031d0.c.e(1243053520, true, new S.AbstractC1543f.c(s10, b10, qVar), interfaceC1734nR, 54), interfaceC1734nR, i27, 96);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    A.S s13 = s10;
                    interfaceC1551j3 = interfaceC1551j5;
                    f11 = f10;
                    j11 = jA;
                    j12 = jC;
                    s11 = s13;
                    b11 = b13;
                } else {
                    interfaceC1734nR.A();
                    dVar3 = dVar;
                    interfaceC1551j3 = interfaceC1551j;
                    j11 = jA;
                    j12 = jC;
                    f11 = fB;
                    b11 = bC;
                    s11 = s6;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1543f.d(dVar3, j11, j12, f11, b11, s11, interfaceC1551j3, qVar, i6, i10));
                }
            }
            i11 |= 24576;
            bC = b6;
            if ((i6 & 196608) != 0) {
                if ((i10 & 32) == 0) {
                    i18 = 65536;
                } else {
                    i18 = 65536;
                }
                i11 |= i18;
            }
            i14 = i10 & 64;
            if (i14 != 0) {
                i11 |= 1572864;
            } else if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.S(interfaceC1551j)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i11 |= i15;
            }
            if ((i10 & 128) != 0) {
                i11 |= 12582912;
            } else if ((i6 & 12582912) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i11 |= i16;
            }
            if ((4793491 & i11) == 4793490) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i22 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        i11 &= -458753;
                    } else {
                        sD = s6;
                    }
                    s10 = sD;
                    f10 = fB;
                    i17 = i11;
                    b10 = bC;
                    if (i14 != 0) {
                        interfaceC1551j2 = null;
                    } else {
                        interfaceC1551j2 = interfaceC1551j;
                    }
                } else {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i22 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        i11 &= -458753;
                    } else {
                        sD = s6;
                    }
                    s10 = sD;
                    f10 = fB;
                    i17 = i11;
                    b10 = bC;
                    if (i14 != 0) {
                        interfaceC1551j2 = null;
                    } else {
                        interfaceC1551j2 = interfaceC1551j;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(422438773, i17, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
                }
                interfaceC1734nR.T(1393560009);
                if (interfaceC1551j2 != null) {
                    dVarG = androidx.compose.ui.d.f19586a;
                } else {
                    dVarG = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                p141o0.e2 e2VarE3 = S.T0.e(U.C1678a.f13648a.c(), interfaceC1734nR, 6);
                if ((3670016 & i17) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new S.AbstractC1543f.b(interfaceC1551j2);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.AbstractC1543f.b(interfaceC1551j2);
                    interfaceC1734nR.K(objG);
                }
                dVar3 = dVar2;
                A.B b14 = b10;
                int i28 = i17 << 3;
                int i29 = (i28 & 896) | 12582912 | (i28 & 7168) | (i28 & 57344);
                S.InterfaceC1551j interfaceC1551j6 = interfaceC1551j2;
                S.c1.a(androidx.compose.ui.layout.b.a(dVar2, (p237x7.q) objG).b(dVarG), e2VarE3, jA, jC, f10, 0.0f, null, p031d0.c.e(1243053520, true, new S.AbstractC1543f.c(s10, b10, qVar), interfaceC1734nR, 54), interfaceC1734nR, i29, 96);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                A.S s14 = s10;
                interfaceC1551j3 = interfaceC1551j6;
                f11 = f10;
                j11 = jA;
                j12 = jC;
                s11 = s14;
                b11 = b14;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i22 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        i11 &= -458753;
                    } else {
                        sD = s6;
                    }
                    s10 = sD;
                    f10 = fB;
                    i17 = i11;
                    b10 = bC;
                    if (i14 != 0) {
                        interfaceC1551j2 = null;
                    } else {
                        interfaceC1551j2 = interfaceC1551j;
                    }
                } else {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i22 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        i11 &= -458753;
                    } else {
                        sD = s6;
                    }
                    s10 = sD;
                    f10 = fB;
                    i17 = i11;
                    b10 = bC;
                    if (i14 != 0) {
                        interfaceC1551j2 = null;
                    } else {
                        interfaceC1551j2 = interfaceC1551j;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(422438773, i17, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
                }
                interfaceC1734nR.T(1393560009);
                if (interfaceC1551j2 != null) {
                    dVarG = androidx.compose.ui.d.f19586a;
                } else {
                    dVarG = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                p141o0.e2 e2VarE4 = S.T0.e(U.C1678a.f13648a.c(), interfaceC1734nR, 6);
                if ((3670016 & i17) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new S.AbstractC1543f.b(interfaceC1551j2);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.AbstractC1543f.b(interfaceC1551j2);
                    interfaceC1734nR.K(objG);
                }
                dVar3 = dVar2;
                A.B b15 = b10;
                int i210 = i17 << 3;
                int i211 = (i210 & 896) | 12582912 | (i210 & 7168) | (i210 & 57344);
                S.InterfaceC1551j interfaceC1551j7 = interfaceC1551j2;
                S.c1.a(androidx.compose.ui.layout.b.a(dVar2, (p237x7.q) objG).b(dVarG), e2VarE4, jA, jC, f10, 0.0f, null, p031d0.c.e(1243053520, true, new S.AbstractC1543f.c(s10, b10, qVar), interfaceC1734nR, 54), interfaceC1734nR, i211, 96);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                A.S s15 = s10;
                interfaceC1551j3 = interfaceC1551j7;
                f11 = f10;
                j11 = jA;
                j12 = jC;
                s11 = s15;
                b11 = b15;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1543f.d(dVar3, j11, j12, f11, b11, s11, interfaceC1551j3, qVar, i6, i10));
            }
        }
        i11 |= 3072;
        fB = f6;
        i12 = i10 & 16;
        if (i12 != 0) {
            if ((i6 & 24576) == 0) {
                bC = b6;
                if (interfaceC1734nR.S(bC)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i11 |= i13;
            }
            if ((i6 & 196608) != 0) {
                if ((i10 & 32) == 0) {
                    i18 = 65536;
                } else {
                    i18 = 65536;
                }
                i11 |= i18;
            }
            i14 = i10 & 64;
            if (i14 != 0) {
                i11 |= 1572864;
            } else if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.S(interfaceC1551j)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i11 |= i15;
            }
            if ((i10 & 128) != 0) {
                i11 |= 12582912;
            } else if ((i6 & 12582912) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i11 |= i16;
            }
            if ((4793491 & i11) == 4793490) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i22 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        i11 &= -458753;
                    } else {
                        sD = s6;
                    }
                    s10 = sD;
                    f10 = fB;
                    i17 = i11;
                    b10 = bC;
                    if (i14 != 0) {
                        interfaceC1551j2 = null;
                    } else {
                        interfaceC1551j2 = interfaceC1551j;
                    }
                } else {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i22 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        i11 &= -458753;
                    } else {
                        sD = s6;
                    }
                    s10 = sD;
                    f10 = fB;
                    i17 = i11;
                    b10 = bC;
                    if (i14 != 0) {
                        interfaceC1551j2 = null;
                    } else {
                        interfaceC1551j2 = interfaceC1551j;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(422438773, i17, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
                }
                interfaceC1734nR.T(1393560009);
                if (interfaceC1551j2 != null) {
                    dVarG = androidx.compose.ui.d.f19586a;
                } else {
                    dVarG = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                p141o0.e2 e2VarE5 = S.T0.e(U.C1678a.f13648a.c(), interfaceC1734nR, 6);
                if ((3670016 & i17) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new S.AbstractC1543f.b(interfaceC1551j2);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.AbstractC1543f.b(interfaceC1551j2);
                    interfaceC1734nR.K(objG);
                }
                dVar3 = dVar2;
                A.B b16 = b10;
                int i212 = i17 << 3;
                int i213 = (i212 & 896) | 12582912 | (i212 & 7168) | (i212 & 57344);
                S.InterfaceC1551j interfaceC1551j8 = interfaceC1551j2;
                S.c1.a(androidx.compose.ui.layout.b.a(dVar2, (p237x7.q) objG).b(dVarG), e2VarE5, jA, jC, f10, 0.0f, null, p031d0.c.e(1243053520, true, new S.AbstractC1543f.c(s10, b10, qVar), interfaceC1734nR, 54), interfaceC1734nR, i213, 96);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                A.S s16 = s10;
                interfaceC1551j3 = interfaceC1551j8;
                f11 = f10;
                j11 = jA;
                j12 = jC;
                s11 = s16;
                b11 = b16;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i22 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        i11 &= -458753;
                    } else {
                        sD = s6;
                    }
                    s10 = sD;
                    f10 = fB;
                    i17 = i11;
                    b10 = bC;
                    if (i14 != 0) {
                        interfaceC1551j2 = null;
                    } else {
                        interfaceC1551j2 = interfaceC1551j;
                    }
                } else {
                    if (i19 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i10 & 2) != 0) {
                        jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                        i11 &= -113;
                    }
                    if ((i10 & 4) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                        i11 &= -897;
                    }
                    if (i22 != 0) {
                        fB = S.C1549i.f11144a.b();
                    }
                    if (i12 != 0) {
                        bC = S.C1549i.f11144a.c();
                    }
                    if ((i10 & 32) != 0) {
                        sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                        i11 &= -458753;
                    } else {
                        sD = s6;
                    }
                    s10 = sD;
                    f10 = fB;
                    i17 = i11;
                    b10 = bC;
                    if (i14 != 0) {
                        interfaceC1551j2 = null;
                    } else {
                        interfaceC1551j2 = interfaceC1551j;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(422438773, i17, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
                }
                interfaceC1734nR.T(1393560009);
                if (interfaceC1551j2 != null) {
                    dVarG = androidx.compose.ui.d.f19586a;
                } else {
                    dVarG = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                p141o0.e2 e2VarE6 = S.T0.e(U.C1678a.f13648a.c(), interfaceC1734nR, 6);
                if ((3670016 & i17) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new S.AbstractC1543f.b(interfaceC1551j2);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.AbstractC1543f.b(interfaceC1551j2);
                    interfaceC1734nR.K(objG);
                }
                dVar3 = dVar2;
                A.B b17 = b10;
                int i214 = i17 << 3;
                int i215 = (i214 & 896) | 12582912 | (i214 & 7168) | (i214 & 57344);
                S.InterfaceC1551j interfaceC1551j9 = interfaceC1551j2;
                S.c1.a(androidx.compose.ui.layout.b.a(dVar2, (p237x7.q) objG).b(dVarG), e2VarE6, jA, jC, f10, 0.0f, null, p031d0.c.e(1243053520, true, new S.AbstractC1543f.c(s10, b10, qVar), interfaceC1734nR, 54), interfaceC1734nR, i215, 96);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                A.S s17 = s10;
                interfaceC1551j3 = interfaceC1551j9;
                f11 = f10;
                j11 = jA;
                j12 = jC;
                s11 = s17;
                b11 = b17;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1543f.d(dVar3, j11, j12, f11, b11, s11, interfaceC1551j3, qVar, i6, i10));
            }
        }
        i11 |= 24576;
        bC = b6;
        if ((i6 & 196608) != 0) {
            if ((i10 & 32) == 0) {
                i18 = 65536;
            } else {
                i18 = 65536;
            }
            i11 |= i18;
        }
        i14 = i10 & 64;
        if (i14 != 0) {
            i11 |= 1572864;
        } else if ((i6 & 1572864) == 0) {
            if (interfaceC1734nR.S(interfaceC1551j)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i11 |= i15;
        }
        if ((i10 & 128) != 0) {
            i11 |= 12582912;
        } else if ((i6 & 12582912) == 0) {
            if (interfaceC1734nR.l(qVar)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i11 |= i16;
        }
        if ((4793491 & i11) == 4793490) {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i19 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if ((i10 & 2) != 0) {
                    jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                    i11 &= -113;
                }
                if ((i10 & 4) != 0) {
                    jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                    i11 &= -897;
                }
                if (i22 != 0) {
                    fB = S.C1549i.f11144a.b();
                }
                if (i12 != 0) {
                    bC = S.C1549i.f11144a.c();
                }
                if ((i10 & 32) != 0) {
                    sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                    i11 &= -458753;
                } else {
                    sD = s6;
                }
                s10 = sD;
                f10 = fB;
                i17 = i11;
                b10 = bC;
                if (i14 != 0) {
                    interfaceC1551j2 = null;
                } else {
                    interfaceC1551j2 = interfaceC1551j;
                }
            } else {
                if (i19 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if ((i10 & 2) != 0) {
                    jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                    i11 &= -113;
                }
                if ((i10 & 4) != 0) {
                    jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                    i11 &= -897;
                }
                if (i22 != 0) {
                    fB = S.C1549i.f11144a.b();
                }
                if (i12 != 0) {
                    bC = S.C1549i.f11144a.c();
                }
                if ((i10 & 32) != 0) {
                    sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                    i11 &= -458753;
                } else {
                    sD = s6;
                }
                s10 = sD;
                f10 = fB;
                i17 = i11;
                b10 = bC;
                if (i14 != 0) {
                    interfaceC1551j2 = null;
                } else {
                    interfaceC1551j2 = interfaceC1551j;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(422438773, i17, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
            }
            interfaceC1734nR.T(1393560009);
            if (interfaceC1551j2 != null) {
                dVarG = androidx.compose.ui.d.f19586a;
            } else {
                dVarG = androidx.compose.ui.d.f19586a;
            }
            interfaceC1734nR.J();
            p141o0.e2 e2VarE7 = S.T0.e(U.C1678a.f13648a.c(), interfaceC1734nR, 6);
            if ((3670016 & i17) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            objG = interfaceC1734nR.g();
            if (z6) {
                objG = new S.AbstractC1543f.b(interfaceC1551j2);
                interfaceC1734nR.K(objG);
            } else {
                objG = new S.AbstractC1543f.b(interfaceC1551j2);
                interfaceC1734nR.K(objG);
            }
            dVar3 = dVar2;
            A.B b18 = b10;
            int i216 = i17 << 3;
            int i217 = (i216 & 896) | 12582912 | (i216 & 7168) | (i216 & 57344);
            S.InterfaceC1551j interfaceC1551j10 = interfaceC1551j2;
            S.c1.a(androidx.compose.ui.layout.b.a(dVar2, (p237x7.q) objG).b(dVarG), e2VarE7, jA, jC, f10, 0.0f, null, p031d0.c.e(1243053520, true, new S.AbstractC1543f.c(s10, b10, qVar), interfaceC1734nR, 54), interfaceC1734nR, i217, 96);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            A.S s18 = s10;
            interfaceC1551j3 = interfaceC1551j10;
            f11 = f10;
            j11 = jA;
            j12 = jC;
            s11 = s18;
            b11 = b18;
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i19 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if ((i10 & 2) != 0) {
                    jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                    i11 &= -113;
                }
                if ((i10 & 4) != 0) {
                    jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                    i11 &= -897;
                }
                if (i22 != 0) {
                    fB = S.C1549i.f11144a.b();
                }
                if (i12 != 0) {
                    bC = S.C1549i.f11144a.c();
                }
                if ((i10 & 32) != 0) {
                    sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                    i11 &= -458753;
                } else {
                    sD = s6;
                }
                s10 = sD;
                f10 = fB;
                i17 = i11;
                b10 = bC;
                if (i14 != 0) {
                    interfaceC1551j2 = null;
                } else {
                    interfaceC1551j2 = interfaceC1551j;
                }
            } else {
                if (i19 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if ((i10 & 2) != 0) {
                    jA = S.C1549i.f11144a.a(interfaceC1734nR, 6);
                    i11 &= -113;
                }
                if ((i10 & 4) != 0) {
                    jC = S.A.c(jA, interfaceC1734nR, (i11 >> 3) & 14);
                    i11 &= -897;
                }
                if (i22 != 0) {
                    fB = S.C1549i.f11144a.b();
                }
                if (i12 != 0) {
                    bC = S.C1549i.f11144a.c();
                }
                if ((i10 & 32) != 0) {
                    sD = S.C1549i.f11144a.d(interfaceC1734nR, 6);
                    i11 &= -458753;
                } else {
                    sD = s6;
                }
                s10 = sD;
                f10 = fB;
                i17 = i11;
                b10 = bC;
                if (i14 != 0) {
                    interfaceC1551j2 = null;
                } else {
                    interfaceC1551j2 = interfaceC1551j;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(422438773, i17, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
            }
            interfaceC1734nR.T(1393560009);
            if (interfaceC1551j2 != null) {
                dVarG = androidx.compose.ui.d.f19586a;
            } else {
                dVarG = androidx.compose.ui.d.f19586a;
            }
            interfaceC1734nR.J();
            p141o0.e2 e2VarE8 = S.T0.e(U.C1678a.f13648a.c(), interfaceC1734nR, 6);
            if ((3670016 & i17) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            objG = interfaceC1734nR.g();
            if (z6) {
                objG = new S.AbstractC1543f.b(interfaceC1551j2);
                interfaceC1734nR.K(objG);
            } else {
                objG = new S.AbstractC1543f.b(interfaceC1551j2);
                interfaceC1734nR.K(objG);
            }
            dVar3 = dVar2;
            A.B b19 = b10;
            int i218 = i17 << 3;
            int i219 = (i218 & 896) | 12582912 | (i218 & 7168) | (i218 & 57344);
            S.InterfaceC1551j interfaceC1551j11 = interfaceC1551j2;
            S.c1.a(androidx.compose.ui.layout.b.a(dVar2, (p237x7.q) objG).b(dVarG), e2VarE8, jA, jC, f10, 0.0f, null, p031d0.c.e(1243053520, true, new S.AbstractC1543f.c(s10, b10, qVar), interfaceC1734nR, 54), interfaceC1734nR, i219, 96);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            A.S s19 = s10;
            interfaceC1551j3 = interfaceC1551j11;
            f11 = f10;
            j11 = jA;
            j12 = jC;
            s11 = s19;
            b11 = b19;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1543f.d(dVar3, j11, j12, f11, b11, s11, interfaceC1551j3, qVar, i6, i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0132 A[PHI: r2 r3 r7 r11 r13 r14 r15
  0x0132: PHI (r2v11 androidx.compose.ui.d) = (r2v8 androidx.compose.ui.d), (r2v13 androidx.compose.ui.d) binds: [B:124:0x0178, B:106:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0132: PHI (r3v26 int) = (r3v20 int), (r3v28 int) binds: [B:124:0x0178, B:106:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0132: PHI (r7v7 x7.p) = (r7v3 x7.p), (r7v2 x7.p) binds: [B:124:0x0178, B:106:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0132: PHI (r11v14 x7.q) = (r11v3 x7.q), (r11v2 x7.q) binds: [B:124:0x0178, B:106:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0132: PHI (r13v8 float) = (r13v3 float), (r13v2 float) binds: [B:124:0x0178, B:106:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0132: PHI (r14v17 A.S) = (r14v8 A.S), (r14v7 A.S) binds: [B:124:0x0178, B:106:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0132: PHI (r15v8 S.w1) = (r15v4 S.w1), (r15v3 S.w1) binds: [B:124:0x0178, B:106:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x013c  */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0155  */
    /* JADX WARN: Code duplicated, block: B:120:0x0160  */
    /* JADX WARN: Code duplicated, block: B:123:0x016d  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0186  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:142:0x0206  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    public static final void c(p237x7.p pVar, androidx.compose.ui.d dVar, p237x7.p pVar2, p237x7.q qVar, float f6, A.S s6, S.w1 w1Var, S.y1 y1Var, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        int i12;
        p237x7.p pVarA;
        int i13;
        int i14;
        p237x7.q qVarB;
        int i15;
        int i16;
        float fC;
        int i17;
        A.S sD;
        S.w1 w1VarA;
        int i18;
        int i19;
        androidx.compose.ui.d dVar2;
        S.y1 y1Var2;
        int i20;
        float f10;
        Y0.i.a aVar;
        float fC2;
        float f11;
        p237x7.p pVar3;
        S.w1 w1Var2;
        A.S s10;
        p237x7.q qVar2;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1952988048);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.l(pVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        int i21 = i10 & 2;
        if (i21 == 0) {
            if ((i6 & 48) == 0) {
                i11 |= interfaceC1734nR.S(dVar) ? 32 : 16;
            }
            i12 = i10 & 4;
            if (i12 != 0) {
                if ((i6 & 384) == 0) {
                    pVarA = pVar2;
                    if (interfaceC1734nR.l(pVarA)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i11 |= i13;
                }
                i14 = i10 & 8;
                if (i14 != 0) {
                    if ((i6 & 3072) == 0) {
                        qVarB = qVar;
                        if (interfaceC1734nR.l(qVarB)) {
                            i15 = 2048;
                        } else {
                            i15 = 1024;
                        }
                        i11 |= i15;
                    }
                    i16 = i10 & 16;
                    if (i16 != 0) {
                        if ((i6 & 24576) == 0) {
                            fC = f6;
                            if (interfaceC1734nR.h(fC)) {
                                i17 = 16384;
                            } else {
                                i17 = 8192;
                            }
                            i11 |= i17;
                        }
                        if ((196608 & i6) == 0) {
                            if ((i10 & 32) == 0) {
                                sD = s6;
                                int i22 = interfaceC1734nR.S(sD) ? 131072 : 65536;
                                i11 |= i22;
                            } else {
                                sD = s6;
                            }
                            i11 |= i22;
                        } else {
                            sD = s6;
                        }
                        if ((1572864 & i6) == 0) {
                            if ((i10 & 64) == 0) {
                                w1VarA = w1Var;
                                int i23 = interfaceC1734nR.S(w1VarA) ? 1048576 : 524288;
                                i11 |= i23;
                            } else {
                                w1VarA = w1Var;
                            }
                            i11 |= i23;
                        } else {
                            w1VarA = w1Var;
                        }
                        i18 = i10 & 128;
                        if (i18 != 0) {
                            i11 |= 12582912;
                        } else if ((i6 & 12582912) == 0) {
                            if (interfaceC1734nR.S(y1Var)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i11 |= i19;
                        }
                        if ((i11 & 4793491) == 4793490 || !interfaceC1734nR.u()) {
                            interfaceC1734nR.q();
                            if ((i6 & 1) != 0 || interfaceC1734nR.G()) {
                                if (i21 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i12 != 0) {
                                    pVarA = S.C.f9879a.a();
                                }
                                if (i14 != 0) {
                                    qVarB = S.C.f9879a.b();
                                }
                                if (i16 != 0) {
                                    fC = S.x1.f11987a.c();
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                                }
                                if ((i10 & 64) != 0) {
                                    i11 &= -3670017;
                                    w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                                }
                                if (i18 != 0) {
                                    y1Var2 = null;
                                }
                                p237x7.q qVar3 = qVarB;
                                A.S s11 = sD;
                                S.w1 w1Var3 = w1VarA;
                                i20 = i11;
                                f10 = fC;
                                interfaceC1734nR.R();
                                if (V.AbstractC1741q.H()) {
                                    V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                                }
                                M0.P pC = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                                aVar = Y0.i.f16208D;
                                if (!Y0.i.s(f10, aVar.c()) || Y0.i.s(f10, aVar.b())) {
                                    fC2 = S.x1.f11987a.c();
                                } else {
                                    fC2 = f10;
                                }
                                int i24 = i20 << 6;
                                d(dVar2, pVar, pC, true, pVarA, qVar3, fC2, s11, w1Var3, y1Var2, interfaceC1734nR, (57344 & i24) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192), 0);
                                if (V.AbstractC1741q.H()) {
                                    V.AbstractC1741q.P();
                                }
                                f11 = f10;
                                pVar3 = pVarA;
                                w1Var2 = w1Var3;
                                s10 = s11;
                                qVar2 = qVar3;
                            } else {
                                interfaceC1734nR.A();
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                }
                                if ((i10 & 64) != 0) {
                                    i11 &= -3670017;
                                }
                                dVar2 = dVar;
                            }
                            y1Var2 = y1Var;
                            p237x7.q qVar4 = qVarB;
                            A.S s12 = sD;
                            S.w1 w1Var4 = w1VarA;
                            i20 = i11;
                            f10 = fC;
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                            }
                            M0.P pC2 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                            aVar = Y0.i.f16208D;
                            if (Y0.i.s(f10, aVar.c())) {
                                fC2 = S.x1.f11987a.c();
                            } else {
                                fC2 = S.x1.f11987a.c();
                            }
                            int i25 = i20 << 6;
                            d(dVar2, pVar, pC2, true, pVarA, qVar4, fC2, s12, w1Var4, y1Var2, interfaceC1734nR, (57344 & i25) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i25) | (29360128 & i25) | (234881024 & i25) | (i25 & 1879048192), 0);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            f11 = f10;
                            pVar3 = pVarA;
                            w1Var2 = w1Var4;
                            s10 = s12;
                            qVar2 = qVar4;
                        } else {
                            interfaceC1734nR.A();
                            dVar2 = dVar;
                            y1Var2 = y1Var;
                            pVar3 = pVarA;
                            qVar2 = qVarB;
                            f11 = fC;
                            s10 = sD;
                            w1Var2 = w1VarA;
                        }
                        interfaceC1709e1X = interfaceC1734nR.x();
                        if (interfaceC1709e1X != null) {
                            interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
                        }
                    }
                    i11 |= 24576;
                    fC = f6;
                    if ((196608 & i6) == 0) {
                        if ((i10 & 32) == 0) {
                            sD = s6;
                            if (interfaceC1734nR.S(sD)) {
                            }
                            i11 |= i22;
                        } else {
                            sD = s6;
                        }
                        i11 |= i22;
                    } else {
                        sD = s6;
                    }
                    if ((1572864 & i6) == 0) {
                        if ((i10 & 64) == 0) {
                            w1VarA = w1Var;
                            if (interfaceC1734nR.S(w1VarA)) {
                            }
                            i11 |= i23;
                        } else {
                            w1VarA = w1Var;
                        }
                        i11 |= i23;
                    } else {
                        w1VarA = w1Var;
                    }
                    i18 = i10 & 128;
                    if (i18 != 0) {
                        i11 |= 12582912;
                    } else if ((i6 & 12582912) == 0) {
                        if (interfaceC1734nR.S(y1Var)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i11 |= i19;
                    }
                    if ((i11 & 4793491) == 4793490) {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0) {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        } else {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        }
                        p237x7.q qVar5 = qVarB;
                        A.S s13 = sD;
                        S.w1 w1Var5 = w1VarA;
                        i20 = i11;
                        f10 = fC;
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                        }
                        M0.P pC3 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                        aVar = Y0.i.f16208D;
                        if (Y0.i.s(f10, aVar.c())) {
                            fC2 = S.x1.f11987a.c();
                        } else {
                            fC2 = S.x1.f11987a.c();
                        }
                        int i26 = i20 << 6;
                        d(dVar2, pVar, pC3, true, pVarA, qVar5, fC2, s13, w1Var5, y1Var2, interfaceC1734nR, (57344 & i26) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i26) | (29360128 & i26) | (234881024 & i26) | (i26 & 1879048192), 0);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        f11 = f10;
                        pVar3 = pVarA;
                        w1Var2 = w1Var5;
                        s10 = s13;
                        qVar2 = qVar5;
                    } else {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0) {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        } else {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        }
                        p237x7.q qVar6 = qVarB;
                        A.S s14 = sD;
                        S.w1 w1Var6 = w1VarA;
                        i20 = i11;
                        f10 = fC;
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                        }
                        M0.P pC4 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                        aVar = Y0.i.f16208D;
                        if (Y0.i.s(f10, aVar.c())) {
                            fC2 = S.x1.f11987a.c();
                        } else {
                            fC2 = S.x1.f11987a.c();
                        }
                        int i27 = i20 << 6;
                        d(dVar2, pVar, pC4, true, pVarA, qVar6, fC2, s14, w1Var6, y1Var2, interfaceC1734nR, (57344 & i27) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i27) | (29360128 & i27) | (234881024 & i27) | (i27 & 1879048192), 0);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        f11 = f10;
                        pVar3 = pVarA;
                        w1Var2 = w1Var6;
                        s10 = s14;
                        qVar2 = qVar6;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
                    }
                }
                i11 |= 3072;
                qVarB = qVar;
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((i6 & 24576) == 0) {
                        fC = f6;
                        if (interfaceC1734nR.h(fC)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i11 |= i17;
                    }
                    if ((196608 & i6) == 0) {
                        if ((i10 & 32) == 0) {
                            sD = s6;
                            if (interfaceC1734nR.S(sD)) {
                            }
                            i11 |= i22;
                        } else {
                            sD = s6;
                        }
                        i11 |= i22;
                    } else {
                        sD = s6;
                    }
                    if ((1572864 & i6) == 0) {
                        if ((i10 & 64) == 0) {
                            w1VarA = w1Var;
                            if (interfaceC1734nR.S(w1VarA)) {
                            }
                            i11 |= i23;
                        } else {
                            w1VarA = w1Var;
                        }
                        i11 |= i23;
                    } else {
                        w1VarA = w1Var;
                    }
                    i18 = i10 & 128;
                    if (i18 != 0) {
                        i11 |= 12582912;
                    } else if ((i6 & 12582912) == 0) {
                        if (interfaceC1734nR.S(y1Var)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i11 |= i19;
                    }
                    if ((i11 & 4793491) == 4793490) {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0) {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        } else {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        }
                        p237x7.q qVar7 = qVarB;
                        A.S s15 = sD;
                        S.w1 w1Var7 = w1VarA;
                        i20 = i11;
                        f10 = fC;
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                        }
                        M0.P pC5 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                        aVar = Y0.i.f16208D;
                        if (Y0.i.s(f10, aVar.c())) {
                            fC2 = S.x1.f11987a.c();
                        } else {
                            fC2 = S.x1.f11987a.c();
                        }
                        int i28 = i20 << 6;
                        d(dVar2, pVar, pC5, true, pVarA, qVar7, fC2, s15, w1Var7, y1Var2, interfaceC1734nR, (57344 & i28) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i28) | (29360128 & i28) | (234881024 & i28) | (i28 & 1879048192), 0);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        f11 = f10;
                        pVar3 = pVarA;
                        w1Var2 = w1Var7;
                        s10 = s15;
                        qVar2 = qVar7;
                    } else {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0) {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        } else {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        }
                        p237x7.q qVar8 = qVarB;
                        A.S s16 = sD;
                        S.w1 w1Var8 = w1VarA;
                        i20 = i11;
                        f10 = fC;
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                        }
                        M0.P pC6 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                        aVar = Y0.i.f16208D;
                        if (Y0.i.s(f10, aVar.c())) {
                            fC2 = S.x1.f11987a.c();
                        } else {
                            fC2 = S.x1.f11987a.c();
                        }
                        int i29 = i20 << 6;
                        d(dVar2, pVar, pC6, true, pVarA, qVar8, fC2, s16, w1Var8, y1Var2, interfaceC1734nR, (57344 & i29) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i29) | (29360128 & i29) | (234881024 & i29) | (i29 & 1879048192), 0);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        f11 = f10;
                        pVar3 = pVarA;
                        w1Var2 = w1Var8;
                        s10 = s16;
                        qVar2 = qVar8;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
                    }
                }
                i11 |= 24576;
                fC = f6;
                if ((196608 & i6) == 0) {
                    if ((i10 & 32) == 0) {
                        sD = s6;
                        if (interfaceC1734nR.S(sD)) {
                        }
                        i11 |= i22;
                    } else {
                        sD = s6;
                    }
                    i11 |= i22;
                } else {
                    sD = s6;
                }
                if ((1572864 & i6) == 0) {
                    if ((i10 & 64) == 0) {
                        w1VarA = w1Var;
                        if (interfaceC1734nR.S(w1VarA)) {
                        }
                        i11 |= i23;
                    } else {
                        w1VarA = w1Var;
                    }
                    i11 |= i23;
                } else {
                    w1VarA = w1Var;
                }
                i18 = i10 & 128;
                if (i18 != 0) {
                    i11 |= 12582912;
                } else if ((i6 & 12582912) == 0) {
                    if (interfaceC1734nR.S(y1Var)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i11 |= i19;
                }
                if ((i11 & 4793491) == 4793490) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    }
                    p237x7.q qVar9 = qVarB;
                    A.S s17 = sD;
                    S.w1 w1Var9 = w1VarA;
                    i20 = i11;
                    f10 = fC;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                    }
                    M0.P pC7 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                    aVar = Y0.i.f16208D;
                    if (Y0.i.s(f10, aVar.c())) {
                        fC2 = S.x1.f11987a.c();
                    } else {
                        fC2 = S.x1.f11987a.c();
                    }
                    int i210 = i20 << 6;
                    d(dVar2, pVar, pC7, true, pVarA, qVar9, fC2, s17, w1Var9, y1Var2, interfaceC1734nR, (57344 & i210) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i210) | (29360128 & i210) | (234881024 & i210) | (i210 & 1879048192), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    f11 = f10;
                    pVar3 = pVarA;
                    w1Var2 = w1Var9;
                    s10 = s17;
                    qVar2 = qVar9;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    }
                    p237x7.q qVar10 = qVarB;
                    A.S s18 = sD;
                    S.w1 w1Var10 = w1VarA;
                    i20 = i11;
                    f10 = fC;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                    }
                    M0.P pC8 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                    aVar = Y0.i.f16208D;
                    if (Y0.i.s(f10, aVar.c())) {
                        fC2 = S.x1.f11987a.c();
                    } else {
                        fC2 = S.x1.f11987a.c();
                    }
                    int i211 = i20 << 6;
                    d(dVar2, pVar, pC8, true, pVarA, qVar10, fC2, s18, w1Var10, y1Var2, interfaceC1734nR, (57344 & i211) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i211) | (29360128 & i211) | (234881024 & i211) | (i211 & 1879048192), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    f11 = f10;
                    pVar3 = pVarA;
                    w1Var2 = w1Var10;
                    s10 = s18;
                    qVar2 = qVar10;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
                }
            }
            i11 |= 384;
            pVarA = pVar2;
            i14 = i10 & 8;
            if (i14 != 0) {
                if ((i6 & 3072) == 0) {
                    qVarB = qVar;
                    if (interfaceC1734nR.l(qVarB)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i11 |= i15;
                }
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((i6 & 24576) == 0) {
                        fC = f6;
                        if (interfaceC1734nR.h(fC)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i11 |= i17;
                    }
                    if ((196608 & i6) == 0) {
                        if ((i10 & 32) == 0) {
                            sD = s6;
                            if (interfaceC1734nR.S(sD)) {
                            }
                            i11 |= i22;
                        } else {
                            sD = s6;
                        }
                        i11 |= i22;
                    } else {
                        sD = s6;
                    }
                    if ((1572864 & i6) == 0) {
                        if ((i10 & 64) == 0) {
                            w1VarA = w1Var;
                            if (interfaceC1734nR.S(w1VarA)) {
                            }
                            i11 |= i23;
                        } else {
                            w1VarA = w1Var;
                        }
                        i11 |= i23;
                    } else {
                        w1VarA = w1Var;
                    }
                    i18 = i10 & 128;
                    if (i18 != 0) {
                        i11 |= 12582912;
                    } else if ((i6 & 12582912) == 0) {
                        if (interfaceC1734nR.S(y1Var)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i11 |= i19;
                    }
                    if ((i11 & 4793491) == 4793490) {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0) {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        } else {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        }
                        p237x7.q qVar11 = qVarB;
                        A.S s19 = sD;
                        S.w1 w1Var11 = w1VarA;
                        i20 = i11;
                        f10 = fC;
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                        }
                        M0.P pC9 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                        aVar = Y0.i.f16208D;
                        if (Y0.i.s(f10, aVar.c())) {
                            fC2 = S.x1.f11987a.c();
                        } else {
                            fC2 = S.x1.f11987a.c();
                        }
                        int i212 = i20 << 6;
                        d(dVar2, pVar, pC9, true, pVarA, qVar11, fC2, s19, w1Var11, y1Var2, interfaceC1734nR, (57344 & i212) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i212) | (29360128 & i212) | (234881024 & i212) | (i212 & 1879048192), 0);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        f11 = f10;
                        pVar3 = pVarA;
                        w1Var2 = w1Var11;
                        s10 = s19;
                        qVar2 = qVar11;
                    } else {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0) {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        } else {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        }
                        p237x7.q qVar12 = qVarB;
                        A.S s110 = sD;
                        S.w1 w1Var12 = w1VarA;
                        i20 = i11;
                        f10 = fC;
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                        }
                        M0.P pC10 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                        aVar = Y0.i.f16208D;
                        if (Y0.i.s(f10, aVar.c())) {
                            fC2 = S.x1.f11987a.c();
                        } else {
                            fC2 = S.x1.f11987a.c();
                        }
                        int i213 = i20 << 6;
                        d(dVar2, pVar, pC10, true, pVarA, qVar12, fC2, s110, w1Var12, y1Var2, interfaceC1734nR, (57344 & i213) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i213) | (29360128 & i213) | (234881024 & i213) | (i213 & 1879048192), 0);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        f11 = f10;
                        pVar3 = pVarA;
                        w1Var2 = w1Var12;
                        s10 = s110;
                        qVar2 = qVar12;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
                    }
                }
                i11 |= 24576;
                fC = f6;
                if ((196608 & i6) == 0) {
                    if ((i10 & 32) == 0) {
                        sD = s6;
                        if (interfaceC1734nR.S(sD)) {
                        }
                        i11 |= i22;
                    } else {
                        sD = s6;
                    }
                    i11 |= i22;
                } else {
                    sD = s6;
                }
                if ((1572864 & i6) == 0) {
                    if ((i10 & 64) == 0) {
                        w1VarA = w1Var;
                        if (interfaceC1734nR.S(w1VarA)) {
                        }
                        i11 |= i23;
                    } else {
                        w1VarA = w1Var;
                    }
                    i11 |= i23;
                } else {
                    w1VarA = w1Var;
                }
                i18 = i10 & 128;
                if (i18 != 0) {
                    i11 |= 12582912;
                } else if ((i6 & 12582912) == 0) {
                    if (interfaceC1734nR.S(y1Var)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i11 |= i19;
                }
                if ((i11 & 4793491) == 4793490) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    }
                    p237x7.q qVar13 = qVarB;
                    A.S s111 = sD;
                    S.w1 w1Var13 = w1VarA;
                    i20 = i11;
                    f10 = fC;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                    }
                    M0.P pC11 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                    aVar = Y0.i.f16208D;
                    if (Y0.i.s(f10, aVar.c())) {
                        fC2 = S.x1.f11987a.c();
                    } else {
                        fC2 = S.x1.f11987a.c();
                    }
                    int i214 = i20 << 6;
                    d(dVar2, pVar, pC11, true, pVarA, qVar13, fC2, s111, w1Var13, y1Var2, interfaceC1734nR, (57344 & i214) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i214) | (29360128 & i214) | (234881024 & i214) | (i214 & 1879048192), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    f11 = f10;
                    pVar3 = pVarA;
                    w1Var2 = w1Var13;
                    s10 = s111;
                    qVar2 = qVar13;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    }
                    p237x7.q qVar14 = qVarB;
                    A.S s112 = sD;
                    S.w1 w1Var14 = w1VarA;
                    i20 = i11;
                    f10 = fC;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                    }
                    M0.P pC12 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                    aVar = Y0.i.f16208D;
                    if (Y0.i.s(f10, aVar.c())) {
                        fC2 = S.x1.f11987a.c();
                    } else {
                        fC2 = S.x1.f11987a.c();
                    }
                    int i215 = i20 << 6;
                    d(dVar2, pVar, pC12, true, pVarA, qVar14, fC2, s112, w1Var14, y1Var2, interfaceC1734nR, (57344 & i215) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i215) | (29360128 & i215) | (234881024 & i215) | (i215 & 1879048192), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    f11 = f10;
                    pVar3 = pVarA;
                    w1Var2 = w1Var14;
                    s10 = s112;
                    qVar2 = qVar14;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
                }
            }
            i11 |= 3072;
            qVarB = qVar;
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((i6 & 24576) == 0) {
                    fC = f6;
                    if (interfaceC1734nR.h(fC)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i11 |= i17;
                }
                if ((196608 & i6) == 0) {
                    if ((i10 & 32) == 0) {
                        sD = s6;
                        if (interfaceC1734nR.S(sD)) {
                        }
                        i11 |= i22;
                    } else {
                        sD = s6;
                    }
                    i11 |= i22;
                } else {
                    sD = s6;
                }
                if ((1572864 & i6) == 0) {
                    if ((i10 & 64) == 0) {
                        w1VarA = w1Var;
                        if (interfaceC1734nR.S(w1VarA)) {
                        }
                        i11 |= i23;
                    } else {
                        w1VarA = w1Var;
                    }
                    i11 |= i23;
                } else {
                    w1VarA = w1Var;
                }
                i18 = i10 & 128;
                if (i18 != 0) {
                    i11 |= 12582912;
                } else if ((i6 & 12582912) == 0) {
                    if (interfaceC1734nR.S(y1Var)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i11 |= i19;
                }
                if ((i11 & 4793491) == 4793490) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    }
                    p237x7.q qVar15 = qVarB;
                    A.S s113 = sD;
                    S.w1 w1Var15 = w1VarA;
                    i20 = i11;
                    f10 = fC;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                    }
                    M0.P pC13 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                    aVar = Y0.i.f16208D;
                    if (Y0.i.s(f10, aVar.c())) {
                        fC2 = S.x1.f11987a.c();
                    } else {
                        fC2 = S.x1.f11987a.c();
                    }
                    int i216 = i20 << 6;
                    d(dVar2, pVar, pC13, true, pVarA, qVar15, fC2, s113, w1Var15, y1Var2, interfaceC1734nR, (57344 & i216) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i216) | (29360128 & i216) | (234881024 & i216) | (i216 & 1879048192), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    f11 = f10;
                    pVar3 = pVarA;
                    w1Var2 = w1Var15;
                    s10 = s113;
                    qVar2 = qVar15;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    }
                    p237x7.q qVar16 = qVarB;
                    A.S s114 = sD;
                    S.w1 w1Var16 = w1VarA;
                    i20 = i11;
                    f10 = fC;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                    }
                    M0.P pC14 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                    aVar = Y0.i.f16208D;
                    if (Y0.i.s(f10, aVar.c())) {
                        fC2 = S.x1.f11987a.c();
                    } else {
                        fC2 = S.x1.f11987a.c();
                    }
                    int i217 = i20 << 6;
                    d(dVar2, pVar, pC14, true, pVarA, qVar16, fC2, s114, w1Var16, y1Var2, interfaceC1734nR, (57344 & i217) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i217) | (29360128 & i217) | (234881024 & i217) | (i217 & 1879048192), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    f11 = f10;
                    pVar3 = pVarA;
                    w1Var2 = w1Var16;
                    s10 = s114;
                    qVar2 = qVar16;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
                }
            }
            i11 |= 24576;
            fC = f6;
            if ((196608 & i6) == 0) {
                if ((i10 & 32) == 0) {
                    sD = s6;
                    if (interfaceC1734nR.S(sD)) {
                    }
                    i11 |= i22;
                } else {
                    sD = s6;
                }
                i11 |= i22;
            } else {
                sD = s6;
            }
            if ((1572864 & i6) == 0) {
                if ((i10 & 64) == 0) {
                    w1VarA = w1Var;
                    if (interfaceC1734nR.S(w1VarA)) {
                    }
                    i11 |= i23;
                } else {
                    w1VarA = w1Var;
                }
                i11 |= i23;
            } else {
                w1VarA = w1Var;
            }
            i18 = i10 & 128;
            if (i18 != 0) {
                i11 |= 12582912;
            } else if ((i6 & 12582912) == 0) {
                if (interfaceC1734nR.S(y1Var)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i11 |= i19;
            }
            if ((i11 & 4793491) == 4793490) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                } else {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                }
                p237x7.q qVar17 = qVarB;
                A.S s115 = sD;
                S.w1 w1Var17 = w1VarA;
                i20 = i11;
                f10 = fC;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                }
                M0.P pC15 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                aVar = Y0.i.f16208D;
                if (Y0.i.s(f10, aVar.c())) {
                    fC2 = S.x1.f11987a.c();
                } else {
                    fC2 = S.x1.f11987a.c();
                }
                int i218 = i20 << 6;
                d(dVar2, pVar, pC15, true, pVarA, qVar17, fC2, s115, w1Var17, y1Var2, interfaceC1734nR, (57344 & i218) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i218) | (29360128 & i218) | (234881024 & i218) | (i218 & 1879048192), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                f11 = f10;
                pVar3 = pVarA;
                w1Var2 = w1Var17;
                s10 = s115;
                qVar2 = qVar17;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                } else {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                }
                p237x7.q qVar18 = qVarB;
                A.S s116 = sD;
                S.w1 w1Var18 = w1VarA;
                i20 = i11;
                f10 = fC;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                }
                M0.P pC16 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                aVar = Y0.i.f16208D;
                if (Y0.i.s(f10, aVar.c())) {
                    fC2 = S.x1.f11987a.c();
                } else {
                    fC2 = S.x1.f11987a.c();
                }
                int i219 = i20 << 6;
                d(dVar2, pVar, pC16, true, pVarA, qVar18, fC2, s116, w1Var18, y1Var2, interfaceC1734nR, (57344 & i219) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i219) | (29360128 & i219) | (234881024 & i219) | (i219 & 1879048192), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                f11 = f10;
                pVar3 = pVarA;
                w1Var2 = w1Var18;
                s10 = s116;
                qVar2 = qVar18;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
            }
        }
        i11 |= 48;
        i12 = i10 & 4;
        if (i12 != 0) {
            if ((i6 & 384) == 0) {
                pVarA = pVar2;
                if (interfaceC1734nR.l(pVarA)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i11 |= i13;
            }
            i14 = i10 & 8;
            if (i14 != 0) {
                if ((i6 & 3072) == 0) {
                    qVarB = qVar;
                    if (interfaceC1734nR.l(qVarB)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i11 |= i15;
                }
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((i6 & 24576) == 0) {
                        fC = f6;
                        if (interfaceC1734nR.h(fC)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i11 |= i17;
                    }
                    if ((196608 & i6) == 0) {
                        if ((i10 & 32) == 0) {
                            sD = s6;
                            if (interfaceC1734nR.S(sD)) {
                            }
                            i11 |= i22;
                        } else {
                            sD = s6;
                        }
                        i11 |= i22;
                    } else {
                        sD = s6;
                    }
                    if ((1572864 & i6) == 0) {
                        if ((i10 & 64) == 0) {
                            w1VarA = w1Var;
                            if (interfaceC1734nR.S(w1VarA)) {
                            }
                            i11 |= i23;
                        } else {
                            w1VarA = w1Var;
                        }
                        i11 |= i23;
                    } else {
                        w1VarA = w1Var;
                    }
                    i18 = i10 & 128;
                    if (i18 != 0) {
                        i11 |= 12582912;
                    } else if ((i6 & 12582912) == 0) {
                        if (interfaceC1734nR.S(y1Var)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i11 |= i19;
                    }
                    if ((i11 & 4793491) == 4793490) {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0) {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        } else {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        }
                        p237x7.q qVar19 = qVarB;
                        A.S s117 = sD;
                        S.w1 w1Var19 = w1VarA;
                        i20 = i11;
                        f10 = fC;
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                        }
                        M0.P pC17 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                        aVar = Y0.i.f16208D;
                        if (Y0.i.s(f10, aVar.c())) {
                            fC2 = S.x1.f11987a.c();
                        } else {
                            fC2 = S.x1.f11987a.c();
                        }
                        int i2110 = i20 << 6;
                        d(dVar2, pVar, pC17, true, pVarA, qVar19, fC2, s117, w1Var19, y1Var2, interfaceC1734nR, (57344 & i2110) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i2110) | (29360128 & i2110) | (234881024 & i2110) | (i2110 & 1879048192), 0);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        f11 = f10;
                        pVar3 = pVarA;
                        w1Var2 = w1Var19;
                        s10 = s117;
                        qVar2 = qVar19;
                    } else {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0) {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        } else {
                            if (i21 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i12 != 0) {
                                pVarA = S.C.f9879a.a();
                            }
                            if (i14 != 0) {
                                qVarB = S.C.f9879a.b();
                            }
                            if (i16 != 0) {
                                fC = S.x1.f11987a.c();
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                            }
                            if ((i10 & 64) != 0) {
                                i11 &= -3670017;
                                w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                            }
                            if (i18 != 0) {
                                y1Var2 = null;
                            } else {
                                y1Var2 = y1Var;
                            }
                        }
                        p237x7.q qVar110 = qVarB;
                        A.S s118 = sD;
                        S.w1 w1Var110 = w1VarA;
                        i20 = i11;
                        f10 = fC;
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                        }
                        M0.P pC18 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                        aVar = Y0.i.f16208D;
                        if (Y0.i.s(f10, aVar.c())) {
                            fC2 = S.x1.f11987a.c();
                        } else {
                            fC2 = S.x1.f11987a.c();
                        }
                        int i2111 = i20 << 6;
                        d(dVar2, pVar, pC18, true, pVarA, qVar110, fC2, s118, w1Var110, y1Var2, interfaceC1734nR, (57344 & i2111) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i2111) | (29360128 & i2111) | (234881024 & i2111) | (i2111 & 1879048192), 0);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        f11 = f10;
                        pVar3 = pVarA;
                        w1Var2 = w1Var110;
                        s10 = s118;
                        qVar2 = qVar110;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
                    }
                }
                i11 |= 24576;
                fC = f6;
                if ((196608 & i6) == 0) {
                    if ((i10 & 32) == 0) {
                        sD = s6;
                        if (interfaceC1734nR.S(sD)) {
                        }
                        i11 |= i22;
                    } else {
                        sD = s6;
                    }
                    i11 |= i22;
                } else {
                    sD = s6;
                }
                if ((1572864 & i6) == 0) {
                    if ((i10 & 64) == 0) {
                        w1VarA = w1Var;
                        if (interfaceC1734nR.S(w1VarA)) {
                        }
                        i11 |= i23;
                    } else {
                        w1VarA = w1Var;
                    }
                    i11 |= i23;
                } else {
                    w1VarA = w1Var;
                }
                i18 = i10 & 128;
                if (i18 != 0) {
                    i11 |= 12582912;
                } else if ((i6 & 12582912) == 0) {
                    if (interfaceC1734nR.S(y1Var)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i11 |= i19;
                }
                if ((i11 & 4793491) == 4793490) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    }
                    p237x7.q qVar111 = qVarB;
                    A.S s119 = sD;
                    S.w1 w1Var111 = w1VarA;
                    i20 = i11;
                    f10 = fC;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                    }
                    M0.P pC19 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                    aVar = Y0.i.f16208D;
                    if (Y0.i.s(f10, aVar.c())) {
                        fC2 = S.x1.f11987a.c();
                    } else {
                        fC2 = S.x1.f11987a.c();
                    }
                    int i2112 = i20 << 6;
                    d(dVar2, pVar, pC19, true, pVarA, qVar111, fC2, s119, w1Var111, y1Var2, interfaceC1734nR, (57344 & i2112) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i2112) | (29360128 & i2112) | (234881024 & i2112) | (i2112 & 1879048192), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    f11 = f10;
                    pVar3 = pVarA;
                    w1Var2 = w1Var111;
                    s10 = s119;
                    qVar2 = qVar111;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    }
                    p237x7.q qVar112 = qVarB;
                    A.S s1110 = sD;
                    S.w1 w1Var112 = w1VarA;
                    i20 = i11;
                    f10 = fC;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                    }
                    M0.P pC110 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                    aVar = Y0.i.f16208D;
                    if (Y0.i.s(f10, aVar.c())) {
                        fC2 = S.x1.f11987a.c();
                    } else {
                        fC2 = S.x1.f11987a.c();
                    }
                    int i2113 = i20 << 6;
                    d(dVar2, pVar, pC110, true, pVarA, qVar112, fC2, s1110, w1Var112, y1Var2, interfaceC1734nR, (57344 & i2113) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i2113) | (29360128 & i2113) | (234881024 & i2113) | (i2113 & 1879048192), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    f11 = f10;
                    pVar3 = pVarA;
                    w1Var2 = w1Var112;
                    s10 = s1110;
                    qVar2 = qVar112;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
                }
            }
            i11 |= 3072;
            qVarB = qVar;
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((i6 & 24576) == 0) {
                    fC = f6;
                    if (interfaceC1734nR.h(fC)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i11 |= i17;
                }
                if ((196608 & i6) == 0) {
                    if ((i10 & 32) == 0) {
                        sD = s6;
                        if (interfaceC1734nR.S(sD)) {
                        }
                        i11 |= i22;
                    } else {
                        sD = s6;
                    }
                    i11 |= i22;
                } else {
                    sD = s6;
                }
                if ((1572864 & i6) == 0) {
                    if ((i10 & 64) == 0) {
                        w1VarA = w1Var;
                        if (interfaceC1734nR.S(w1VarA)) {
                        }
                        i11 |= i23;
                    } else {
                        w1VarA = w1Var;
                    }
                    i11 |= i23;
                } else {
                    w1VarA = w1Var;
                }
                i18 = i10 & 128;
                if (i18 != 0) {
                    i11 |= 12582912;
                } else if ((i6 & 12582912) == 0) {
                    if (interfaceC1734nR.S(y1Var)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i11 |= i19;
                }
                if ((i11 & 4793491) == 4793490) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    }
                    p237x7.q qVar113 = qVarB;
                    A.S s1111 = sD;
                    S.w1 w1Var113 = w1VarA;
                    i20 = i11;
                    f10 = fC;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                    }
                    M0.P pC111 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                    aVar = Y0.i.f16208D;
                    if (Y0.i.s(f10, aVar.c())) {
                        fC2 = S.x1.f11987a.c();
                    } else {
                        fC2 = S.x1.f11987a.c();
                    }
                    int i2114 = i20 << 6;
                    d(dVar2, pVar, pC111, true, pVarA, qVar113, fC2, s1111, w1Var113, y1Var2, interfaceC1734nR, (57344 & i2114) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i2114) | (29360128 & i2114) | (234881024 & i2114) | (i2114 & 1879048192), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    f11 = f10;
                    pVar3 = pVarA;
                    w1Var2 = w1Var113;
                    s10 = s1111;
                    qVar2 = qVar113;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    }
                    p237x7.q qVar114 = qVarB;
                    A.S s1112 = sD;
                    S.w1 w1Var114 = w1VarA;
                    i20 = i11;
                    f10 = fC;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                    }
                    M0.P pC112 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                    aVar = Y0.i.f16208D;
                    if (Y0.i.s(f10, aVar.c())) {
                        fC2 = S.x1.f11987a.c();
                    } else {
                        fC2 = S.x1.f11987a.c();
                    }
                    int i2115 = i20 << 6;
                    d(dVar2, pVar, pC112, true, pVarA, qVar114, fC2, s1112, w1Var114, y1Var2, interfaceC1734nR, (57344 & i2115) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i2115) | (29360128 & i2115) | (234881024 & i2115) | (i2115 & 1879048192), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    f11 = f10;
                    pVar3 = pVarA;
                    w1Var2 = w1Var114;
                    s10 = s1112;
                    qVar2 = qVar114;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
                }
            }
            i11 |= 24576;
            fC = f6;
            if ((196608 & i6) == 0) {
                if ((i10 & 32) == 0) {
                    sD = s6;
                    if (interfaceC1734nR.S(sD)) {
                    }
                    i11 |= i22;
                } else {
                    sD = s6;
                }
                i11 |= i22;
            } else {
                sD = s6;
            }
            if ((1572864 & i6) == 0) {
                if ((i10 & 64) == 0) {
                    w1VarA = w1Var;
                    if (interfaceC1734nR.S(w1VarA)) {
                    }
                    i11 |= i23;
                } else {
                    w1VarA = w1Var;
                }
                i11 |= i23;
            } else {
                w1VarA = w1Var;
            }
            i18 = i10 & 128;
            if (i18 != 0) {
                i11 |= 12582912;
            } else if ((i6 & 12582912) == 0) {
                if (interfaceC1734nR.S(y1Var)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i11 |= i19;
            }
            if ((i11 & 4793491) == 4793490) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                } else {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                }
                p237x7.q qVar115 = qVarB;
                A.S s1113 = sD;
                S.w1 w1Var115 = w1VarA;
                i20 = i11;
                f10 = fC;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                }
                M0.P pC113 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                aVar = Y0.i.f16208D;
                if (Y0.i.s(f10, aVar.c())) {
                    fC2 = S.x1.f11987a.c();
                } else {
                    fC2 = S.x1.f11987a.c();
                }
                int i2116 = i20 << 6;
                d(dVar2, pVar, pC113, true, pVarA, qVar115, fC2, s1113, w1Var115, y1Var2, interfaceC1734nR, (57344 & i2116) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i2116) | (29360128 & i2116) | (234881024 & i2116) | (i2116 & 1879048192), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                f11 = f10;
                pVar3 = pVarA;
                w1Var2 = w1Var115;
                s10 = s1113;
                qVar2 = qVar115;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                } else {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                }
                p237x7.q qVar116 = qVarB;
                A.S s1114 = sD;
                S.w1 w1Var116 = w1VarA;
                i20 = i11;
                f10 = fC;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                }
                M0.P pC114 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                aVar = Y0.i.f16208D;
                if (Y0.i.s(f10, aVar.c())) {
                    fC2 = S.x1.f11987a.c();
                } else {
                    fC2 = S.x1.f11987a.c();
                }
                int i2117 = i20 << 6;
                d(dVar2, pVar, pC114, true, pVarA, qVar116, fC2, s1114, w1Var116, y1Var2, interfaceC1734nR, (57344 & i2117) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i2117) | (29360128 & i2117) | (234881024 & i2117) | (i2117 & 1879048192), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                f11 = f10;
                pVar3 = pVarA;
                w1Var2 = w1Var116;
                s10 = s1114;
                qVar2 = qVar116;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
            }
        }
        i11 |= 384;
        pVarA = pVar2;
        i14 = i10 & 8;
        if (i14 != 0) {
            if ((i6 & 3072) == 0) {
                qVarB = qVar;
                if (interfaceC1734nR.l(qVarB)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i11 |= i15;
            }
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((i6 & 24576) == 0) {
                    fC = f6;
                    if (interfaceC1734nR.h(fC)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i11 |= i17;
                }
                if ((196608 & i6) == 0) {
                    if ((i10 & 32) == 0) {
                        sD = s6;
                        if (interfaceC1734nR.S(sD)) {
                        }
                        i11 |= i22;
                    } else {
                        sD = s6;
                    }
                    i11 |= i22;
                } else {
                    sD = s6;
                }
                if ((1572864 & i6) == 0) {
                    if ((i10 & 64) == 0) {
                        w1VarA = w1Var;
                        if (interfaceC1734nR.S(w1VarA)) {
                        }
                        i11 |= i23;
                    } else {
                        w1VarA = w1Var;
                    }
                    i11 |= i23;
                } else {
                    w1VarA = w1Var;
                }
                i18 = i10 & 128;
                if (i18 != 0) {
                    i11 |= 12582912;
                } else if ((i6 & 12582912) == 0) {
                    if (interfaceC1734nR.S(y1Var)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i11 |= i19;
                }
                if ((i11 & 4793491) == 4793490) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    }
                    p237x7.q qVar117 = qVarB;
                    A.S s1115 = sD;
                    S.w1 w1Var117 = w1VarA;
                    i20 = i11;
                    f10 = fC;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                    }
                    M0.P pC115 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                    aVar = Y0.i.f16208D;
                    if (Y0.i.s(f10, aVar.c())) {
                        fC2 = S.x1.f11987a.c();
                    } else {
                        fC2 = S.x1.f11987a.c();
                    }
                    int i2118 = i20 << 6;
                    d(dVar2, pVar, pC115, true, pVarA, qVar117, fC2, s1115, w1Var117, y1Var2, interfaceC1734nR, (57344 & i2118) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i2118) | (29360128 & i2118) | (234881024 & i2118) | (i2118 & 1879048192), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    f11 = f10;
                    pVar3 = pVarA;
                    w1Var2 = w1Var117;
                    s10 = s1115;
                    qVar2 = qVar117;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    } else {
                        if (i21 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i12 != 0) {
                            pVarA = S.C.f9879a.a();
                        }
                        if (i14 != 0) {
                            qVarB = S.C.f9879a.b();
                        }
                        if (i16 != 0) {
                            fC = S.x1.f11987a.c();
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                        }
                        if ((i10 & 64) != 0) {
                            i11 &= -3670017;
                            w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                        }
                        if (i18 != 0) {
                            y1Var2 = null;
                        } else {
                            y1Var2 = y1Var;
                        }
                    }
                    p237x7.q qVar118 = qVarB;
                    A.S s1116 = sD;
                    S.w1 w1Var118 = w1VarA;
                    i20 = i11;
                    f10 = fC;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                    }
                    M0.P pC116 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                    aVar = Y0.i.f16208D;
                    if (Y0.i.s(f10, aVar.c())) {
                        fC2 = S.x1.f11987a.c();
                    } else {
                        fC2 = S.x1.f11987a.c();
                    }
                    int i2119 = i20 << 6;
                    d(dVar2, pVar, pC116, true, pVarA, qVar118, fC2, s1116, w1Var118, y1Var2, interfaceC1734nR, (57344 & i2119) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i2119) | (29360128 & i2119) | (234881024 & i2119) | (i2119 & 1879048192), 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    f11 = f10;
                    pVar3 = pVarA;
                    w1Var2 = w1Var118;
                    s10 = s1116;
                    qVar2 = qVar118;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
                }
            }
            i11 |= 24576;
            fC = f6;
            if ((196608 & i6) == 0) {
                if ((i10 & 32) == 0) {
                    sD = s6;
                    if (interfaceC1734nR.S(sD)) {
                    }
                    i11 |= i22;
                } else {
                    sD = s6;
                }
                i11 |= i22;
            } else {
                sD = s6;
            }
            if ((1572864 & i6) == 0) {
                if ((i10 & 64) == 0) {
                    w1VarA = w1Var;
                    if (interfaceC1734nR.S(w1VarA)) {
                    }
                    i11 |= i23;
                } else {
                    w1VarA = w1Var;
                }
                i11 |= i23;
            } else {
                w1VarA = w1Var;
            }
            i18 = i10 & 128;
            if (i18 != 0) {
                i11 |= 12582912;
            } else if ((i6 & 12582912) == 0) {
                if (interfaceC1734nR.S(y1Var)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i11 |= i19;
            }
            if ((i11 & 4793491) == 4793490) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                } else {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                }
                p237x7.q qVar119 = qVarB;
                A.S s1117 = sD;
                S.w1 w1Var119 = w1VarA;
                i20 = i11;
                f10 = fC;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                }
                M0.P pC117 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                aVar = Y0.i.f16208D;
                if (Y0.i.s(f10, aVar.c())) {
                    fC2 = S.x1.f11987a.c();
                } else {
                    fC2 = S.x1.f11987a.c();
                }
                int i21110 = i20 << 6;
                d(dVar2, pVar, pC117, true, pVarA, qVar119, fC2, s1117, w1Var119, y1Var2, interfaceC1734nR, (57344 & i21110) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i21110) | (29360128 & i21110) | (234881024 & i21110) | (i21110 & 1879048192), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                f11 = f10;
                pVar3 = pVarA;
                w1Var2 = w1Var119;
                s10 = s1117;
                qVar2 = qVar119;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                } else {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                }
                p237x7.q qVar1110 = qVarB;
                A.S s1118 = sD;
                S.w1 w1Var1110 = w1VarA;
                i20 = i11;
                f10 = fC;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                }
                M0.P pC118 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                aVar = Y0.i.f16208D;
                if (Y0.i.s(f10, aVar.c())) {
                    fC2 = S.x1.f11987a.c();
                } else {
                    fC2 = S.x1.f11987a.c();
                }
                int i21111 = i20 << 6;
                d(dVar2, pVar, pC118, true, pVarA, qVar1110, fC2, s1118, w1Var1110, y1Var2, interfaceC1734nR, (57344 & i21111) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i21111) | (29360128 & i21111) | (234881024 & i21111) | (i21111 & 1879048192), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                f11 = f10;
                pVar3 = pVarA;
                w1Var2 = w1Var1110;
                s10 = s1118;
                qVar2 = qVar1110;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
            }
        }
        i11 |= 3072;
        qVarB = qVar;
        i16 = i10 & 16;
        if (i16 != 0) {
            if ((i6 & 24576) == 0) {
                fC = f6;
                if (interfaceC1734nR.h(fC)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i11 |= i17;
            }
            if ((196608 & i6) == 0) {
                if ((i10 & 32) == 0) {
                    sD = s6;
                    if (interfaceC1734nR.S(sD)) {
                    }
                    i11 |= i22;
                } else {
                    sD = s6;
                }
                i11 |= i22;
            } else {
                sD = s6;
            }
            if ((1572864 & i6) == 0) {
                if ((i10 & 64) == 0) {
                    w1VarA = w1Var;
                    if (interfaceC1734nR.S(w1VarA)) {
                    }
                    i11 |= i23;
                } else {
                    w1VarA = w1Var;
                }
                i11 |= i23;
            } else {
                w1VarA = w1Var;
            }
            i18 = i10 & 128;
            if (i18 != 0) {
                i11 |= 12582912;
            } else if ((i6 & 12582912) == 0) {
                if (interfaceC1734nR.S(y1Var)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i11 |= i19;
            }
            if ((i11 & 4793491) == 4793490) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                } else {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                }
                p237x7.q qVar1111 = qVarB;
                A.S s1119 = sD;
                S.w1 w1Var1111 = w1VarA;
                i20 = i11;
                f10 = fC;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                }
                M0.P pC119 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                aVar = Y0.i.f16208D;
                if (Y0.i.s(f10, aVar.c())) {
                    fC2 = S.x1.f11987a.c();
                } else {
                    fC2 = S.x1.f11987a.c();
                }
                int i21112 = i20 << 6;
                d(dVar2, pVar, pC119, true, pVarA, qVar1111, fC2, s1119, w1Var1111, y1Var2, interfaceC1734nR, (57344 & i21112) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i21112) | (29360128 & i21112) | (234881024 & i21112) | (i21112 & 1879048192), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                f11 = f10;
                pVar3 = pVarA;
                w1Var2 = w1Var1111;
                s10 = s1119;
                qVar2 = qVar1111;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                } else {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i12 != 0) {
                        pVarA = S.C.f9879a.a();
                    }
                    if (i14 != 0) {
                        qVarB = S.C.f9879a.b();
                    }
                    if (i16 != 0) {
                        fC = S.x1.f11987a.c();
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                    }
                    if ((i10 & 64) != 0) {
                        i11 &= -3670017;
                        w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                    }
                    if (i18 != 0) {
                        y1Var2 = null;
                    } else {
                        y1Var2 = y1Var;
                    }
                }
                p237x7.q qVar1112 = qVarB;
                A.S s11110 = sD;
                S.w1 w1Var1112 = w1VarA;
                i20 = i11;
                f10 = fC;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                }
                M0.P pC1110 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
                aVar = Y0.i.f16208D;
                if (Y0.i.s(f10, aVar.c())) {
                    fC2 = S.x1.f11987a.c();
                } else {
                    fC2 = S.x1.f11987a.c();
                }
                int i21113 = i20 << 6;
                d(dVar2, pVar, pC1110, true, pVarA, qVar1112, fC2, s11110, w1Var1112, y1Var2, interfaceC1734nR, (57344 & i21113) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i21113) | (29360128 & i21113) | (234881024 & i21113) | (i21113 & 1879048192), 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                f11 = f10;
                pVar3 = pVarA;
                w1Var2 = w1Var1112;
                s10 = s11110;
                qVar2 = qVar1112;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
            }
        }
        i11 |= 24576;
        fC = f6;
        if ((196608 & i6) == 0) {
            if ((i10 & 32) == 0) {
                sD = s6;
                if (interfaceC1734nR.S(sD)) {
                }
                i11 |= i22;
            } else {
                sD = s6;
            }
            i11 |= i22;
        } else {
            sD = s6;
        }
        if ((1572864 & i6) == 0) {
            if ((i10 & 64) == 0) {
                w1VarA = w1Var;
                if (interfaceC1734nR.S(w1VarA)) {
                }
                i11 |= i23;
            } else {
                w1VarA = w1Var;
            }
            i11 |= i23;
        } else {
            w1VarA = w1Var;
        }
        i18 = i10 & 128;
        if (i18 != 0) {
            i11 |= 12582912;
        } else if ((i6 & 12582912) == 0) {
            if (interfaceC1734nR.S(y1Var)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i11 |= i19;
        }
        if ((i11 & 4793491) == 4793490) {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i21 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if (i12 != 0) {
                    pVarA = S.C.f9879a.a();
                }
                if (i14 != 0) {
                    qVarB = S.C.f9879a.b();
                }
                if (i16 != 0) {
                    fC = S.x1.f11987a.c();
                }
                if ((i10 & 32) != 0) {
                    i11 &= -458753;
                    sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                }
                if ((i10 & 64) != 0) {
                    i11 &= -3670017;
                    w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                }
                if (i18 != 0) {
                    y1Var2 = null;
                } else {
                    y1Var2 = y1Var;
                }
            } else {
                if (i21 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if (i12 != 0) {
                    pVarA = S.C.f9879a.a();
                }
                if (i14 != 0) {
                    qVarB = S.C.f9879a.b();
                }
                if (i16 != 0) {
                    fC = S.x1.f11987a.c();
                }
                if ((i10 & 32) != 0) {
                    i11 &= -458753;
                    sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                }
                if ((i10 & 64) != 0) {
                    i11 &= -3670017;
                    w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                }
                if (i18 != 0) {
                    y1Var2 = null;
                } else {
                    y1Var2 = y1Var;
                }
            }
            p237x7.q qVar1113 = qVarB;
            A.S s11111 = sD;
            S.w1 w1Var1113 = w1VarA;
            i20 = i11;
            f10 = fC;
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
            }
            M0.P pC1111 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
            aVar = Y0.i.f16208D;
            if (Y0.i.s(f10, aVar.c())) {
                fC2 = S.x1.f11987a.c();
            } else {
                fC2 = S.x1.f11987a.c();
            }
            int i21114 = i20 << 6;
            d(dVar2, pVar, pC1111, true, pVarA, qVar1113, fC2, s11111, w1Var1113, y1Var2, interfaceC1734nR, (57344 & i21114) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i21114) | (29360128 & i21114) | (234881024 & i21114) | (i21114 & 1879048192), 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            f11 = f10;
            pVar3 = pVarA;
            w1Var2 = w1Var1113;
            s10 = s11111;
            qVar2 = qVar1113;
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i21 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if (i12 != 0) {
                    pVarA = S.C.f9879a.a();
                }
                if (i14 != 0) {
                    qVarB = S.C.f9879a.b();
                }
                if (i16 != 0) {
                    fC = S.x1.f11987a.c();
                }
                if ((i10 & 32) != 0) {
                    i11 &= -458753;
                    sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                }
                if ((i10 & 64) != 0) {
                    i11 &= -3670017;
                    w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                }
                if (i18 != 0) {
                    y1Var2 = null;
                } else {
                    y1Var2 = y1Var;
                }
            } else {
                if (i21 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if (i12 != 0) {
                    pVarA = S.C.f9879a.a();
                }
                if (i14 != 0) {
                    qVarB = S.C.f9879a.b();
                }
                if (i16 != 0) {
                    fC = S.x1.f11987a.c();
                }
                if ((i10 & 32) != 0) {
                    i11 &= -458753;
                    sD = S.x1.f11987a.d(interfaceC1734nR, 6);
                }
                if ((i10 & 64) != 0) {
                    i11 &= -3670017;
                    w1VarA = S.x1.f11987a.a(interfaceC1734nR, 6);
                }
                if (i18 != 0) {
                    y1Var2 = null;
                } else {
                    y1Var2 = y1Var;
                }
            }
            p237x7.q qVar1114 = qVarB;
            A.S s11112 = sD;
            S.w1 w1Var1114 = w1VarA;
            i20 = i11;
            f10 = fC;
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1952988048, i20, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
            }
            M0.P pC1112 = S.B1.c(U.I.f13519a.b(), interfaceC1734nR, 6);
            aVar = Y0.i.f16208D;
            if (Y0.i.s(f10, aVar.c())) {
                fC2 = S.x1.f11987a.c();
            } else {
                fC2 = S.x1.f11987a.c();
            }
            int i21115 = i20 << 6;
            d(dVar2, pVar, pC1112, true, pVarA, qVar1114, fC2, s11112, w1Var1114, y1Var2, interfaceC1734nR, (57344 & i21115) | ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112) | (458752 & i21115) | (29360128 & i21115) | (234881024 & i21115) | (i21115 & 1879048192), 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            f11 = f10;
            pVar3 = pVarA;
            w1Var2 = w1Var1114;
            s10 = s11112;
            qVar2 = qVar1114;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1543f.g(pVar, dVar2, pVar3, qVar2, f11, s10, w1Var2, y1Var2, i6, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x011b  */
    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x013a  */
    /* JADX WARN: Code duplicated, block: B:112:0x013d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0144  */
    /* JADX WARN: Code duplicated, block: B:118:0x0155  */
    /* JADX WARN: Code duplicated, block: B:120:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x015d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0161  */
    /* JADX WARN: Code duplicated, block: B:126:0x017c  */
    /* JADX WARN: Code duplicated, block: B:127:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x018b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0193  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x0204  */
    /* JADX WARN: Code duplicated, block: B:165:0x0265  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:172:0x02be  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    public static final void d(androidx.compose.ui.d dVar, p237x7.p pVar, M0.P p6, boolean z6, p237x7.p pVar2, p237x7.q qVar, float f6, A.S s6, S.w1 w1Var, S.y1 y1Var, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        androidx.compose.ui.d dVar2;
        int i11;
        int i12;
        int i13;
        androidx.compose.ui.d dVar3;
        boolean z10;
        float fC;
        int i14;
        boolean z11;
        boolean zH;
        java.lang.Object objG;
        boolean z12;
        java.lang.Object objG2;
        androidx.compose.ui.d dVarG;
        V.InterfaceC1734n interfaceC1734n2;
        androidx.compose.ui.d dVar4;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-342194911);
        int i15 = i10 & 1;
        if (i15 != 0) {
            i11 = i6 | 6;
            dVar2 = dVar;
        } else if ((i6 & 6) == 0) {
            dVar2 = dVar;
            i11 = (interfaceC1734nR.S(dVar2) ? 4 : 2) | i6;
        } else {
            dVar2 = dVar;
            i11 = i6;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.l(pVar) ? 32 : 16;
        }
        if ((i10 & 4) != 0) {
            i11 |= 384;
        } else if ((i6 & 384) == 0) {
            i11 |= interfaceC1734nR.S(p6) ? 256 : 128;
        }
        if ((i10 & 8) != 0) {
            i11 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i11 |= interfaceC1734nR.d(z6) ? 2048 : 1024;
        }
        if ((i10 & 16) != 0) {
            i11 |= 24576;
        } else if ((i6 & 24576) == 0) {
            i11 |= interfaceC1734nR.l(pVar2) ? 16384 : 8192;
        }
        if ((i10 & 32) != 0) {
            i11 |= 196608;
        } else if ((i6 & 196608) == 0) {
            i11 |= interfaceC1734nR.l(qVar) ? 131072 : 65536;
        }
        if ((i10 & 64) != 0) {
            i11 |= 1572864;
        } else if ((i6 & 1572864) == 0) {
            i11 |= interfaceC1734nR.h(f6) ? 1048576 : 524288;
        }
        if ((i10 & 128) == 0) {
            if ((i6 & 12582912) == 0) {
                i11 |= interfaceC1734nR.S(s6) ? 8388608 : 4194304;
            }
            if ((i10 & 256) != 0) {
                i11 |= 100663296;
            } else if ((i6 & 100663296) == 0) {
                if (interfaceC1734nR.S(w1Var)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i11 |= i12;
            }
            if ((i10 & 512) != 0) {
                i11 |= 805306368;
            } else if ((i6 & 805306368) == 0) {
                if (interfaceC1734nR.S(y1Var)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i11 |= i13;
            }
            if ((306783379 & i11) == 306783378 || !interfaceC1734nR.u()) {
                if (i15 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-342194911, i11, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)");
                }
                if (!java.lang.Float.isNaN(f6)) {
                    if (f6 == Float.POSITIVE_INFINITY) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        fC = E7.j.c(((Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(f6), 0.0f);
                        i14 = i11 & 1879048192;
                        if (i14 == 536870912) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zH = z11 | interfaceC1734nR.h(fC);
                        objG = interfaceC1734nR.g();
                        if (zH || objG == V.InterfaceC1734n.f14931a.a()) {
                            objG = new S.AbstractC1543f.h(y1Var, fC);
                            interfaceC1734nR.K(objG);
                        }
                        V.Q.f((p237x7.a) objG, interfaceC1734nR, 0);
                        if (i14 == 536870912) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objG2 = interfaceC1734nR.g();
                        if (z12 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                            objG2 = V.v1.e(new S.AbstractC1543f.n(y1Var));
                            interfaceC1734nR.K(objG2);
                        }
                        V.G1 g1A = p190t.w.a(w1Var.a(f((V.G1) objG2)), p200u.AbstractC7177k.j(0.0f, 400.0f, null, 5, null), null, null, interfaceC1734nR, 48, 12);
                        p031d0.a aVarE = p031d0.c.e(1370231018, true, new S.AbstractC1543f.k(qVar), interfaceC1734nR, 54);
                        interfaceC1734nR.T(-1193605157);
                        if (y1Var != null || y1Var.a()) {
                            dVarG = androidx.compose.ui.d.f19586a;
                        } else {
                            androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
                            p230x.s sVar = p230x.s.Vertical;
                            boolean z13 = i14 == 536870912;
                            java.lang.Object objG3 = interfaceC1734nR.g();
                            if (z13 || objG3 == V.InterfaceC1734n.f14931a.a()) {
                                objG3 = new S.AbstractC1543f.l(y1Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p230x.o oVarI = p230x.n.i((p237x7.l) objG3, interfaceC1734nR, 0);
                            boolean z14 = i14 == 536870912;
                            java.lang.Object objG4 = interfaceC1734nR.g();
                            if (z14 || objG4 == V.InterfaceC1734n.f14931a.a()) {
                                objG4 = new S.AbstractC1543f.m(y1Var, null);
                                interfaceC1734nR.K(objG4);
                            }
                            dVarG = p230x.n.g(aVar, oVarI, sVar, (188 & 4) != 0, (188 & 8) != 0 ? null : null, (188 & 16) != 0 ? false : false, (188 & 32) != 0 ? p230x.n.f56571a : null, (188 & 64) != 0 ? p230x.n.f56572b : (p237x7.q) objG4, (188 & 128) != 0 ? false : false);
                        }
                        interfaceC1734nR.J();
                        androidx.compose.ui.d dVar5 = dVar3;
                        interfaceC1734n2 = interfaceC1734nR;
                        S.c1.a(dVar3.b(dVarG), null, e(g1A), 0L, 0.0f, 0.0f, null, p031d0.c.e(-1943739546, true, new S.AbstractC1543f.i(s6, f6, y1Var, w1Var, pVar, p6, z6, pVar2, aVarE), interfaceC1734n2, 54), interfaceC1734n2, 12582912, 122);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar5;
                    }
                }
                throw new java.lang.IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
            }
            interfaceC1734nR.A();
            dVar4 = dVar2;
            interfaceC1734n2 = interfaceC1734nR;
            interfaceC1709e1X = interfaceC1734n2.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1543f.j(dVar4, pVar, p6, z6, pVar2, qVar, f6, s6, w1Var, y1Var, i6, i10));
            }
        }
        i11 |= 12582912;
        if ((i10 & 256) != 0) {
            i11 |= 100663296;
        } else if ((i6 & 100663296) == 0) {
            if (interfaceC1734nR.S(w1Var)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i11 |= i12;
        }
        if ((i10 & 512) != 0) {
            i11 |= 805306368;
        } else if ((i6 & 805306368) == 0) {
            if (interfaceC1734nR.S(y1Var)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i11 |= i13;
        }
        if ((306783379 & i11) == 306783378) {
            if (i15 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-342194911, i11, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)");
            }
            if (!java.lang.Float.isNaN(f6)) {
                if (f6 == Float.POSITIVE_INFINITY) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    fC = E7.j.c(((Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(f6), 0.0f);
                    i14 = i11 & 1879048192;
                    if (i14 == 536870912) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zH = z11 | interfaceC1734nR.h(fC);
                    objG = interfaceC1734nR.g();
                    if (zH) {
                        objG = new S.AbstractC1543f.h(y1Var, fC);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.AbstractC1543f.h(y1Var, fC);
                        interfaceC1734nR.K(objG);
                    }
                    V.Q.f((p237x7.a) objG, interfaceC1734nR, 0);
                    if (i14 == 536870912) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objG2 = interfaceC1734nR.g();
                    if (z12) {
                        objG2 = V.v1.e(new S.AbstractC1543f.n(y1Var));
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = V.v1.e(new S.AbstractC1543f.n(y1Var));
                        interfaceC1734nR.K(objG2);
                    }
                    V.G1 g1A2 = p190t.w.a(w1Var.a(f((V.G1) objG2)), p200u.AbstractC7177k.j(0.0f, 400.0f, null, 5, null), null, null, interfaceC1734nR, 48, 12);
                    p031d0.a aVarE2 = p031d0.c.e(1370231018, true, new S.AbstractC1543f.k(qVar), interfaceC1734nR, 54);
                    interfaceC1734nR.T(-1193605157);
                    if (y1Var != null) {
                        dVarG = androidx.compose.ui.d.f19586a;
                    } else {
                        dVarG = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    androidx.compose.ui.d dVar6 = dVar3;
                    interfaceC1734n2 = interfaceC1734nR;
                    S.c1.a(dVar3.b(dVarG), null, e(g1A2), 0L, 0.0f, 0.0f, null, p031d0.c.e(-1943739546, true, new S.AbstractC1543f.i(s6, f6, y1Var, w1Var, pVar, p6, z6, pVar2, aVarE2), interfaceC1734n2, 54), interfaceC1734n2, 12582912, 122);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar6;
                }
            }
            throw new java.lang.IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
        }
        if (i15 != 0) {
            dVar3 = androidx.compose.ui.d.f19586a;
        } else {
            dVar3 = dVar2;
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-342194911, i11, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)");
        }
        if (!java.lang.Float.isNaN(f6)) {
            if (f6 == Float.POSITIVE_INFINITY) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                fC = E7.j.c(((Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(f6), 0.0f);
                i14 = i11 & 1879048192;
                if (i14 == 536870912) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zH = z11 | interfaceC1734nR.h(fC);
                objG = interfaceC1734nR.g();
                if (zH) {
                    objG = new S.AbstractC1543f.h(y1Var, fC);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.AbstractC1543f.h(y1Var, fC);
                    interfaceC1734nR.K(objG);
                }
                V.Q.f((p237x7.a) objG, interfaceC1734nR, 0);
                if (i14 == 536870912) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objG2 = interfaceC1734nR.g();
                if (z12) {
                    objG2 = V.v1.e(new S.AbstractC1543f.n(y1Var));
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = V.v1.e(new S.AbstractC1543f.n(y1Var));
                    interfaceC1734nR.K(objG2);
                }
                V.G1 g1A3 = p190t.w.a(w1Var.a(f((V.G1) objG2)), p200u.AbstractC7177k.j(0.0f, 400.0f, null, 5, null), null, null, interfaceC1734nR, 48, 12);
                p031d0.a aVarE3 = p031d0.c.e(1370231018, true, new S.AbstractC1543f.k(qVar), interfaceC1734nR, 54);
                interfaceC1734nR.T(-1193605157);
                if (y1Var != null) {
                    dVarG = androidx.compose.ui.d.f19586a;
                } else {
                    dVarG = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                androidx.compose.ui.d dVar7 = dVar3;
                interfaceC1734n2 = interfaceC1734nR;
                S.c1.a(dVar3.b(dVarG), null, e(g1A3), 0L, 0.0f, 0.0f, null, p031d0.c.e(-1943739546, true, new S.AbstractC1543f.i(s6, f6, y1Var, w1Var, pVar, p6, z6, pVar2, aVarE3), interfaceC1734n2, 54), interfaceC1734n2, 12582912, 122);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar7;
            }
        }
        throw new java.lang.IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
        interfaceC1709e1X = interfaceC1734n2.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1543f.j(dVar4, pVar, p6, z6, pVar2, qVar, f6, s6, w1Var, y1Var, i6, i10));
        }
    }

    private static final long e(V.G1 g6) {
        return ((p141o0.C7016y0) g6.getValue()).w();
    }

    private static final float f(V.G1 g6) {
        return ((java.lang.Number) g6.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(androidx.compose.ui.d dVar, S.N0 n6, long j6, long j10, long j11, p237x7.p pVar, M0.P p6, float f6, A.C0768b.m mVar, A.C0768b.e eVar, int i6, boolean z6, p237x7.p pVar2, p237x7.p pVar3, V.InterfaceC1734n interfaceC1734n, int i10, int i11) {
        int i12;
        int i13;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-742442296);
        if ((i10 & 6) == 0) {
            i12 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? interfaceC1734nR.S(n6) : interfaceC1734nR.l(n6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= interfaceC1734nR.j(j6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= interfaceC1734nR.j(j10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= interfaceC1734nR.j(j11) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= interfaceC1734nR.l(pVar) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= interfaceC1734nR.S(p6) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= interfaceC1734nR.h(f6) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= interfaceC1734nR.S(mVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i12 |= interfaceC1734nR.S(eVar) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = (interfaceC1734nR.i(i6) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= interfaceC1734nR.d(z6) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= interfaceC1734nR.l(pVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= interfaceC1734nR.l(pVar3) ? 2048 : 1024;
        }
        if ((306783379 & i12) == 306783378 && (i13 & 1171) == 1170 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-742442296, i12, i13, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            boolean z10 = ((i12 & 112) == 32 || ((i12 & 64) != 0 && interfaceC1734nR.l(n6))) | ((1879048192 & i12) == 536870912) | ((234881024 & i12) == 67108864) | ((i13 & 14) == 4);
            java.lang.Object objG = interfaceC1734nR.g();
            if (z10 || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new S.AbstractC1543f.p(n6, eVar, mVar, i6);
                interfaceC1734nR.K(objG);
            }
            D0.I i14 = (D0.I) objG;
            int iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734nR, dVar);
            F0.InterfaceC0919g.a aVar = F0.InterfaceC0919g.f2641a;
            p237x7.a aVarA = aVar.a();
            if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734nR.t();
            if (interfaceC1734nR.o()) {
                interfaceC1734nR.B(aVarA);
            } else {
                interfaceC1734nR.H();
            }
            V.InterfaceC1734n interfaceC1734nA = V.L1.a(interfaceC1734nR);
            V.L1.c(interfaceC1734nA, i14, aVar.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar.e());
            p237x7.p pVarB = aVar.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar.d());
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.f19586a;
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(aVar2, "navigationIcon");
            float f10 = f10986h;
            androidx.compose.ui.d dVarM = androidx.compose.foundation.layout.m.m(dVarB, f10, 0.0f, 0.0f, 0.0f, 14, null);
            h0.c.a aVar3 = p071h0.c.f45778a;
            D0.I iH = androidx.compose.foundation.layout.d.h(aVar3.o(), false);
            int iA2 = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF2 = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(interfaceC1734nR, dVarM);
            p237x7.a aVarA2 = aVar.a();
            if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734nR.t();
            if (interfaceC1734nR.o()) {
                interfaceC1734nR.B(aVarA2);
            } else {
                interfaceC1734nR.H();
            }
            V.InterfaceC1734n interfaceC1734nA2 = V.L1.a(interfaceC1734nR);
            V.L1.c(interfaceC1734nA2, iH, aVar.c());
            V.L1.c(interfaceC1734nA2, interfaceC1758zF2, aVar.e());
            p237x7.p pVarB2 = aVar.b();
            if (interfaceC1734nA2.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA2.g(), java.lang.Integer.valueOf(iA2))) {
                interfaceC1734nA2.K(java.lang.Integer.valueOf(iA2));
                interfaceC1734nA2.D(java.lang.Integer.valueOf(iA2), pVarB2);
            }
            V.L1.c(interfaceC1734nA2, dVarE2, aVar.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f19260a;
            V.P0 p0D = S.J.a().d(p141o0.C7016y0.i(j6));
            int i15 = V.P0.f14698i;
            V.AbstractC1756y.a(p0D, pVar2, interfaceC1734nR, ((i13 >> 3) & 112) | i15);
            interfaceC1734nR.Q();
            androidx.compose.ui.d dVarC = androidx.compose.ui.graphics.b.c(androidx.compose.foundation.layout.m.k(androidx.compose.ui.layout.a.b(aVar2, "title"), f10, 0.0f, 2, null).b(z6 ? K0.n.a(aVar2, S.AbstractC1543f.o.f11044D) : aVar2), 0.0f, 0.0f, f6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            D0.I iH2 = androidx.compose.foundation.layout.d.h(aVar3.o(), false);
            int iA3 = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF3 = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(interfaceC1734nR, dVarC);
            p237x7.a aVarA3 = aVar.a();
            if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734nR.t();
            if (interfaceC1734nR.o()) {
                interfaceC1734nR.B(aVarA3);
            } else {
                interfaceC1734nR.H();
            }
            V.InterfaceC1734n interfaceC1734nA3 = V.L1.a(interfaceC1734nR);
            V.L1.c(interfaceC1734nA3, iH2, aVar.c());
            V.L1.c(interfaceC1734nA3, interfaceC1758zF3, aVar.e());
            p237x7.p pVarB3 = aVar.b();
            if (interfaceC1734nA3.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA3.g(), java.lang.Integer.valueOf(iA3))) {
                interfaceC1734nA3.K(java.lang.Integer.valueOf(iA3));
                interfaceC1734nA3.D(java.lang.Integer.valueOf(iA3), pVarB3);
            }
            V.L1.c(interfaceC1734nA3, dVarE3, aVar.d());
            int i16 = i12 >> 9;
            T.w.a(j10, p6, pVar, interfaceC1734nR, ((i12 >> 15) & 112) | (i16 & 14) | (i16 & 896));
            interfaceC1734nR.Q();
            androidx.compose.ui.d dVarM2 = androidx.compose.foundation.layout.m.m(androidx.compose.ui.layout.a.b(aVar2, "actionIcons"), 0.0f, 0.0f, f10, 0.0f, 11, null);
            D0.I iH3 = androidx.compose.foundation.layout.d.h(aVar3.o(), false);
            int iA4 = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF4 = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(interfaceC1734nR, dVarM2);
            p237x7.a aVarA4 = aVar.a();
            if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734nR.t();
            if (interfaceC1734nR.o()) {
                interfaceC1734nR.B(aVarA4);
            } else {
                interfaceC1734nR.H();
            }
            V.InterfaceC1734n interfaceC1734nA4 = V.L1.a(interfaceC1734nR);
            V.L1.c(interfaceC1734nA4, iH3, aVar.c());
            V.L1.c(interfaceC1734nA4, interfaceC1758zF4, aVar.e());
            p237x7.p pVarB4 = aVar.b();
            if (interfaceC1734nA4.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA4.g(), java.lang.Integer.valueOf(iA4))) {
                interfaceC1734nA4.K(java.lang.Integer.valueOf(iA4));
                interfaceC1734nA4.D(java.lang.Integer.valueOf(iA4), pVarB4);
            }
            V.L1.c(interfaceC1734nA4, dVarE4, aVar.d());
            V.AbstractC1756y.a(S.J.a().d(p141o0.C7016y0.i(j11)), pVar3, interfaceC1734nR, ((i13 >> 6) & 112) | i15);
            interfaceC1734nR.Q();
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1543f.q(dVar, n6, j6, j10, j11, pVar, p6, f6, mVar, eVar, i6, z6, pVar2, pVar3, i10, i11));
        }
    }

    public static final float l() {
        return f10980b;
    }
}
