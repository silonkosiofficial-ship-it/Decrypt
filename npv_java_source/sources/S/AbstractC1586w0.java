package S;

/* JADX INFO: renamed from: S.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1586w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f11834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f11835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f11836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f11837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f11838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f11839f;

    /* JADX INFO: renamed from: S.w0$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1745s0 f11840D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(V.InterfaceC1745s0 interfaceC1745s0) {
            super(1);
            this.f11840D = interfaceC1745s0;
        }

        public final void a(long j6) {
            S.AbstractC1586w0.c(this.f11840D, Y0.t.g(j6));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((Y0.t) obj).j());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.w0$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f11841D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(V.G1 g6) {
            super(0);
            this.f11841D = g6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Float b() {
            return (java.lang.Float) this.f11841D.getValue();
        }
    }

    /* JADX INFO: renamed from: S.w0$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f11842D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ S.C1582u0 f11843E;

        /* JADX INFO: renamed from: S.w0$c$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.G1 f11844D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V.G1 g6) {
                super(1);
                this.f11844D = g6;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.b(((java.lang.Number) this.f11844D.getValue()).floatValue());
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((androidx.compose.ui.graphics.c) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(V.G1 g6, S.C1582u0 c1582u0) {
            super(2);
            this.f11842D = g6;
            this.f11843E = c1582u0;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-474426875, i6, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:265)");
            }
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f19586a, "indicator");
            boolean zS = interfaceC1734n.S(this.f11842D);
            V.G1 g6 = this.f11842D;
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new S.AbstractC1586w0.c.a(g6);
                interfaceC1734n.K(objG);
            }
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.a(androidx.compose.ui.graphics.b.a(dVarB, (p237x7.l) objG), this.f11843E.a(), S.T0.e(U.r.f14130a.d(), interfaceC1734n, 6)), interfaceC1734n, 0);
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

    /* JADX INFO: renamed from: S.w0$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ T.t f11845D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T.t tVar) {
            super(2);
            this.f11845D = tVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(691730997, i6, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:257)");
            }
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.h.b(p111l0.e.a(androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f19586a, "indicatorRipple"), S.T0.e(U.r.f14130a.d(), interfaceC1734n, 6)), this.f11845D, S.I0.c(false, 0.0f, 0L, interfaceC1734n, 0, 7)), interfaceC1734n, 0);
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

    /* JADX INFO: renamed from: S.w0$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ A.L f11846D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f11847E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.a f11848F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11849G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11850H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f11851I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11852J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ boolean f11853K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ S.C1582u0 f11854L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ p250z.l f11855M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ int f11856N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f11857O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(A.L l6, boolean z6, p237x7.a aVar, p237x7.p pVar, androidx.compose.ui.d dVar, boolean z10, p237x7.p pVar2, boolean z11, S.C1582u0 c1582u0, p250z.l lVar, int i6, int i10) {
            super(2);
            this.f11846D = l6;
            this.f11847E = z6;
            this.f11848F = aVar;
            this.f11849G = pVar;
            this.f11850H = dVar;
            this.f11851I = z10;
            this.f11852J = pVar2;
            this.f11853K = z11;
            this.f11854L = c1582u0;
            this.f11855M = lVar;
            this.f11856N = i6;
            this.f11857O = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1586w0.a(this.f11846D, this.f11847E, this.f11848F, this.f11849G, this.f11850H, this.f11851I, this.f11852J, this.f11853K, this.f11854L, this.f11855M, interfaceC1734n, V.S0.a(this.f11856N | 1), this.f11857O);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.w0$f */
    static final class f extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ S.C1582u0 f11858D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f11859E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f11860F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11861G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ boolean f11862H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11863I;

        /* JADX INFO: renamed from: S.w0$f$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final S.AbstractC1586w0.f.a f11864D = new S.AbstractC1586w0.f.a();

            a() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(S.C1582u0 c1582u0, boolean z6, boolean z10, p237x7.p pVar, boolean z11, p237x7.p pVar2) {
            super(2);
            this.f11858D = c1582u0;
            this.f11859E = z6;
            this.f11860F = z10;
            this.f11861G = pVar;
            this.f11862H = z11;
            this.f11863I = pVar2;
        }

        private static final long e(V.G1 g6) {
            return ((p141o0.C7016y0) g6.getValue()).w();
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1419576100, i6, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:186)");
            }
            V.G1 g1A = p190t.w.a(this.f11858D.b(this.f11859E, this.f11860F), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734n, 48, 12);
            androidx.compose.ui.d dVarA = (this.f11861G == null || !(this.f11862H || this.f11859E)) ? androidx.compose.ui.d.f19586a : K0.n.a(androidx.compose.ui.d.f19586a, S.AbstractC1586w0.f.a.f11864D);
            p237x7.p pVar = this.f11863I;
            D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
            int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, dVarA);
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
            V.L1.c(interfaceC1734nA, iH, aVar.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar.e());
            p237x7.p pVarB = aVar.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f19260a;
            V.AbstractC1756y.a(S.J.a().d(p141o0.C7016y0.i(e(g1A))), pVar, interfaceC1734n, V.P0.f14698i);
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

    /* JADX INFO: renamed from: S.w0$g */
    static final class g extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ S.C1582u0 f11865D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f11866E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f11867F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11868G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(S.C1582u0 c1582u0, boolean z6, boolean z10, p237x7.p pVar) {
            super(2);
            this.f11865D = c1582u0;
            this.f11866E = z6;
            this.f11867F = z10;
            this.f11868G = pVar;
        }

        private static final long e(V.G1 g6) {
            return ((p141o0.C7016y0) g6.getValue()).w();
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1644987592, i6, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:201)");
            }
            T.w.a(e(p190t.w.a(this.f11865D.c(this.f11866E, this.f11867F), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734n, 48, 12)), S.B1.c(U.r.f14130a.k(), interfaceC1734n, 6), this.f11868G, interfaceC1734n, 0);
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

    /* JADX INFO: renamed from: S.w0$h */
    static final class h extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f11869D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.a f11870E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z6, p237x7.a aVar) {
            super(1);
            this.f11869D = z6;
            this.f11870E = aVar;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.b(this.f11869D ? 1.0f : ((java.lang.Number) this.f11870E.b()).floatValue());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.w0$i */
    static final class i implements D0.I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p237x7.a f11871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11873c;

        i(p237x7.a aVar, p237x7.p pVar, boolean z6) {
            this.f11871a = aVar;
            this.f11872b = pVar;
            this.f11873c = z6;
        }

        @Override // D0.I
        public /* synthetic */ int a(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return D0.H.b(this, interfaceC0896o, list, i6);
        }

        @Override // D0.I
        public final D0.K b(D0.M m6, java.util.List list, long j6) {
            java.lang.Object obj;
            D0.X xU;
            float fFloatValue = ((java.lang.Number) this.f11871a.b()).floatValue();
            long jD = Y0.C1859b.d(j6, 0, 0, 0, 0, 10, null);
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                D0.G g6 = (D0.G) list.get(i6);
                if (p247y7.AbstractC7350t.b(androidx.compose.ui.layout.a.a(g6), "icon")) {
                    D0.X xU2 = g6.U(jD);
                    float f6 = 2;
                    int iI0 = xU2.I0() + m6.S0(Y0.i.q(S.AbstractC1586w0.f11837d * f6));
                    int iD = A7.a.d(iI0 * fFloatValue);
                    int iW0 = xU2.w0() + m6.S0(Y0.i.q(S.AbstractC1586w0.j() * f6));
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        D0.G g10 = (D0.G) list.get(i10);
                        if (p247y7.AbstractC7350t.b(androidx.compose.ui.layout.a.a(g10), "indicatorRipple")) {
                            D0.X xU3 = g10.U(Y0.C1859b.f16201b.c(iI0, iW0));
                            int size3 = list.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size3) {
                                    obj = null;
                                    break;
                                }
                                obj = list.get(i11);
                                if (p247y7.AbstractC7350t.b(androidx.compose.ui.layout.a.a((D0.G) obj), "indicator")) {
                                    break;
                                }
                                i11++;
                            }
                            D0.G g11 = (D0.G) obj;
                            D0.X xU4 = g11 != null ? g11.U(Y0.C1859b.f16201b.c(iD, iW0)) : null;
                            if (this.f11872b != null) {
                                int size4 = list.size();
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= size4) {
                                        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    D0.G g12 = (D0.G) list.get(i12);
                                    if (p247y7.AbstractC7350t.b(androidx.compose.ui.layout.a.a(g12), "label")) {
                                        xU = g12.U(jD);
                                        break;
                                    }
                                    i12++;
                                }
                            } else {
                                xU = null;
                            }
                            if (this.f11872b == null) {
                                return S.AbstractC1586w0.k(m6, xU2, xU3, xU4, j6);
                            }
                            p247y7.AbstractC7350t.c(xU);
                            return S.AbstractC1586w0.l(m6, xU, xU2, xU3, xU4, j6, this.f11873c, fFloatValue);
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

    /* JADX INFO: renamed from: S.w0$j */
    static final class j extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11874D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11875E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11876F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11877G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ boolean f11878H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.a f11879I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f11880J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(p237x7.p pVar, p237x7.p pVar2, p237x7.p pVar3, p237x7.p pVar4, boolean z6, p237x7.a aVar, int i6) {
            super(2);
            this.f11874D = pVar;
            this.f11875E = pVar2;
            this.f11876F = pVar3;
            this.f11877G = pVar4;
            this.f11878H = z6;
            this.f11879I = aVar;
            this.f11880J = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1586w0.d(this.f11874D, this.f11875E, this.f11876F, this.f11877G, this.f11878H, this.f11879I, interfaceC1734n, V.S0.a(this.f11880J | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.w0$k */
    static final class k extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f11881D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ D0.X f11882E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f11883F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f11884G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ D0.X f11885H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f11886I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f11887J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f11888K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f11889L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(D0.X x6, D0.X x10, int i6, int i10, D0.X x11, int i11, int i12, int i13, int i14) {
            super(1);
            this.f11881D = x6;
            this.f11882E = x10;
            this.f11883F = i6;
            this.f11884G = i10;
            this.f11885H = x11;
            this.f11886I = i11;
            this.f11887J = i12;
            this.f11888K = i13;
            this.f11889L = i14;
        }

        public final void a(D0.X.a aVar) {
            D0.X x6 = this.f11881D;
            if (x6 != null) {
                D0.X.a.l(aVar, x6, (this.f11888K - x6.I0()) / 2, (this.f11889L - x6.w0()) / 2, 0.0f, 4, null);
            }
            D0.X.a.l(aVar, this.f11882E, this.f11883F, this.f11884G, 0.0f, 4, null);
            D0.X.a.l(aVar, this.f11885H, this.f11886I, this.f11887J, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.w0$l */
    static final class l extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f11890D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f11891E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ float f11892F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ D0.X f11893G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f11894H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f11895I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ float f11896J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ D0.X f11897K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f11898L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ float f11899M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ D0.X f11900N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f11901O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        final /* synthetic */ float f11902P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        final /* synthetic */ int f11903Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        final /* synthetic */ D0.M f11904R;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(D0.X x6, boolean z6, float f6, D0.X x10, int i6, float f10, float f11, D0.X x11, int i10, float f12, D0.X x12, int i11, float f13, int i12, D0.M m6) {
            super(1);
            this.f11890D = x6;
            this.f11891E = z6;
            this.f11892F = f6;
            this.f11893G = x10;
            this.f11894H = i6;
            this.f11895I = f10;
            this.f11896J = f11;
            this.f11897K = x11;
            this.f11898L = i10;
            this.f11899M = f12;
            this.f11900N = x12;
            this.f11901O = i11;
            this.f11902P = f13;
            this.f11903Q = i12;
            this.f11904R = m6;
        }

        public final void a(D0.X.a aVar) {
            D0.X x6 = this.f11890D;
            if (x6 != null) {
                D0.X.a.l(aVar, x6, (this.f11903Q - x6.I0()) / 2, A7.a.d((this.f11899M - this.f11904R.S0(S.AbstractC1586w0.j())) + this.f11896J), 0.0f, 4, null);
            }
            if (this.f11891E || this.f11892F != 0.0f) {
                D0.X.a.l(aVar, this.f11893G, this.f11894H, A7.a.d(this.f11895I + this.f11896J), 0.0f, 4, null);
            }
            D0.X.a.l(aVar, this.f11897K, this.f11898L, A7.a.d(this.f11899M + this.f11896J), 0.0f, 4, null);
            D0.X.a.l(aVar, this.f11900N, this.f11901O, A7.a.d(this.f11902P + this.f11896J), 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    static {
        U.r rVar = U.r.f14130a;
        f11834a = rVar.g();
        f11835b = Y0.i.q(8);
        f11836c = Y0.i.q(4);
        float f6 = 2;
        f11837d = Y0.i.q(Y0.i.q(rVar.e() - rVar.h()) / f6);
        f11838e = Y0.i.q(Y0.i.q(rVar.c() - rVar.h()) / f6);
        f11839f = Y0.i.q(12);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0123  */
    /* JADX WARN: Code duplicated, block: B:103:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0132  */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:116:0x015f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0173 A[PHI: r1 r4 r5 r6 r8 r13
  0x0173: PHI (r1v9 S.u0) = (r1v5 S.u0), (r1v12 S.u0) binds: [B:138:0x0197, B:122:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r4v19 androidx.compose.ui.d) = (r4v7 androidx.compose.ui.d), (r4v21 androidx.compose.ui.d) binds: [B:138:0x0197, B:122:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r5v7 boolean) = (r5v3 boolean), (r5v2 boolean) binds: [B:138:0x0197, B:122:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r6v22 x7.p) = (r6v3 x7.p), (r6v2 x7.p) binds: [B:138:0x0197, B:122:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r8v29 boolean) = (r8v3 boolean), (r8v2 boolean) binds: [B:138:0x0197, B:122:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r13v50 int) = (r13v24 int), (r13v51 int) binds: [B:138:0x0197, B:122:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:126:0x017c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0180  */
    /* JADX WARN: Code duplicated, block: B:130:0x0183  */
    /* JADX WARN: Code duplicated, block: B:133:0x0188  */
    /* JADX WARN: Code duplicated, block: B:136:0x018c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0195  */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:156:0x0215  */
    /* JADX WARN: Code duplicated, block: B:159:0x026c  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:171:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:175:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:178:0x034f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0355  */
    /* JADX WARN: Code duplicated, block: B:183:0x0384  */
    /* JADX WARN: Code duplicated, block: B:185:0x038a  */
    /* JADX WARN: Code duplicated, block: B:188:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:192:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(A.L l6, boolean z6, p237x7.a aVar, p237x7.p pVar, androidx.compose.ui.d dVar, boolean z10, p237x7.p pVar2, boolean z11, S.C1582u0 c1582u0, p250z.l lVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        int i12;
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        int i15;
        boolean z12;
        int i16;
        int i17;
        p237x7.p pVar3;
        int i18;
        int i19;
        boolean z13;
        int i20;
        int i21;
        int i22;
        androidx.compose.ui.d dVar3;
        S.C1582u0 c1582u0A;
        int i23;
        p250z.l lVar2;
        p250z.l lVar3;
        p250z.l lVar4;
        p031d0.a aVarE;
        java.lang.Object objG;
        V.InterfaceC1734n.a aVar2;
        V.InterfaceC1745s0 interfaceC1745s0;
        java.lang.Object objG2;
        int iA;
        p237x7.a aVarA;
        V.InterfaceC1734n interfaceC1734nA;
        p237x7.p pVarB;
        float f6;
        V.G1 g1D;
        long jA;
        boolean zS;
        java.lang.Object objG3;
        boolean zS2;
        java.lang.Object objG4;
        S.C1582u0 c1582u1;
        boolean z14;
        androidx.compose.ui.d dVar4;
        p237x7.p pVar4;
        boolean z15;
        java.lang.Object objG5;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-663510974);
        if ((Integer.MIN_VALUE & i10) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.S(l6) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i10 & 1) != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.d(z6) ? 32 : 16;
        }
        if ((i10 & 2) == 0) {
            if ((i6 & 384) == 0) {
                i11 |= interfaceC1734nR.l(aVar) ? 256 : 128;
            }
            if ((4 & i10) != 0) {
                if ((i6 & 3072) == 0) {
                    if (interfaceC1734nR.l(pVar)) {
                        i12 = 2048;
                    } else {
                        i12 = 1024;
                    }
                    i11 |= i12;
                }
                i13 = i10 & 8;
                if (i13 != 0) {
                    if ((i6 & 24576) == 0) {
                        dVar2 = dVar;
                        if (interfaceC1734nR.S(dVar2)) {
                            i14 = 16384;
                        } else {
                            i14 = 8192;
                        }
                        i11 |= i14;
                    }
                    i15 = 16 & i10;
                    if (i15 != 0) {
                        i11 |= 196608;
                        z12 = z10;
                    } else {
                        z12 = z10;
                        if ((i6 & 196608) == 0) {
                            if (interfaceC1734nR.d(z12)) {
                                i16 = 131072;
                            } else {
                                i16 = 65536;
                            }
                            i11 |= i16;
                        }
                    }
                    i17 = 32 & i10;
                    if (i17 != 0) {
                        i11 |= 1572864;
                        pVar3 = pVar2;
                    } else {
                        pVar3 = pVar2;
                        if ((i6 & 1572864) == 0) {
                            if (interfaceC1734nR.l(pVar3)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i11 |= i18;
                        }
                    }
                    i19 = i10 & 64;
                    if (i19 != 0) {
                        i11 |= 12582912;
                        z13 = z11;
                    } else {
                        z13 = z11;
                        if ((i6 & 12582912) == 0) {
                            if (interfaceC1734nR.d(z13)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i11 |= i20;
                        }
                    }
                    if ((i6 & 100663296) != 0) {
                        i11 |= ((i10 & 128) == 0 || !interfaceC1734nR.S(c1582u0)) ? 33554432 : 67108864;
                    }
                    i21 = 256 & i10;
                    if (i21 != 0) {
                        i11 |= 805306368;
                    } else if ((i6 & 805306368) == 0) {
                        if (interfaceC1734nR.S(lVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i11 |= i22;
                    }
                    if ((i11 & 306783379) == 306783378 || !interfaceC1734nR.u()) {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0 || interfaceC1734nR.G()) {
                            if (i13 != 0) {
                                dVar3 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if (i17 != 0) {
                                pVar3 = null;
                            }
                            if (i19 != 0) {
                                z13 = true;
                            }
                            if ((128 & i10) != 0) {
                                c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                                i11 &= -234881025;
                            } else {
                                c1582u0A = c1582u0;
                            }
                            if (i21 != 0) {
                                i23 = i11;
                                lVar2 = null;
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                            }
                            interfaceC1734nR.T(-103235253);
                            if (lVar2 == null) {
                                objG5 = interfaceC1734nR.g();
                                if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                                    objG5 = p250z.k.a();
                                    interfaceC1734nR.K(objG5);
                                }
                                lVar3 = (p250z.l) objG5;
                            } else {
                                lVar3 = lVar2;
                            }
                            interfaceC1734nR.J();
                            lVar4 = lVar2;
                            p031d0.a aVarE2 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                            interfaceC1734nR.T(-103209106);
                            if (pVar3 == null) {
                                aVarE = null;
                            } else {
                                aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                            }
                            interfaceC1734nR.J();
                            objG = interfaceC1734nR.g();
                            aVar2 = V.InterfaceC1734n.f14931a;
                            if (objG == aVar2.a()) {
                                objG = V.AbstractC1730l1.a(0);
                                interfaceC1734nR.K(objG);
                            }
                            interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                            androidx.compose.ui.d dVar5 = dVar3;
                            p237x7.p pVar5 = pVar3;
                            boolean z16 = z12;
                            androidx.compose.ui.d dVarA = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                            objG2 = interfaceC1734nR.g();
                            if (objG2 == aVar2.a()) {
                                objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                                interfaceC1734nR.K(objG2);
                            }
                            androidx.compose.ui.d dVarA2 = androidx.compose.ui.layout.e.a(dVarA, (p237x7.l) objG2);
                            D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                            iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                            V.InterfaceC1758z interfaceC1758zF = interfaceC1734nR.F();
                            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734nR, dVarA2);
                            F0.InterfaceC0919g.a aVar3 = F0.InterfaceC0919g.f2641a;
                            aVarA = aVar3.a();
                            if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                                V.AbstractC1725k.c();
                            }
                            interfaceC1734nR.t();
                            if (interfaceC1734nR.o()) {
                                interfaceC1734nR.B(aVarA);
                            } else {
                                interfaceC1734nR.H();
                            }
                            interfaceC1734nA = V.L1.a(interfaceC1734nR);
                            V.L1.c(interfaceC1734nA, iH, aVar3.c());
                            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar3.e());
                            pVarB = aVar3.b();
                            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                            }
                            V.L1.c(interfaceC1734nA, dVarE, aVar3.d());
                            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f19260a;
                            if (z6) {
                                f6 = 1.0f;
                            } else {
                                f6 = 0.0f;
                            }
                            g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                            Y0.e eVar = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                            jA = p131n0.h.a((b(interfaceC1745s0) - eVar.S0(U.r.f14130a.e())) / 2, eVar.B0(f11839f));
                            p087i7.M m6 = p087i7.M.f46721a;
                            zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                            objG3 = interfaceC1734nR.g();
                            if (zS || objG3 == aVar2.a()) {
                                objG3 = new T.t(lVar3, jA, null);
                                interfaceC1734nR.K(objG3);
                            }
                            p031d0.a aVarE3 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                            p031d0.a aVarE4 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                            zS2 = interfaceC1734nR.S(g1D);
                            objG4 = interfaceC1734nR.g();
                            if (zS2 || objG4 == aVar2.a()) {
                                objG4 = new S.AbstractC1586w0.b(g1D);
                                interfaceC1734nR.K(objG4);
                            }
                            d(aVarE3, aVarE4, aVarE2, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                            interfaceC1734nR.Q();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            c1582u1 = c1582u0A;
                            z14 = z13;
                            dVar4 = dVar5;
                            pVar4 = pVar5;
                            z15 = z16;
                        } else {
                            interfaceC1734nR.A();
                            if ((128 & i10) != 0) {
                                i11 &= -234881025;
                            }
                            dVar3 = dVar;
                            c1582u0A = c1582u0;
                        }
                        lVar2 = lVar;
                        i23 = i11;
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                        }
                        interfaceC1734nR.T(-103235253);
                        if (lVar2 == null) {
                            objG5 = interfaceC1734nR.g();
                            if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                                objG5 = p250z.k.a();
                                interfaceC1734nR.K(objG5);
                            }
                            lVar3 = (p250z.l) objG5;
                        } else {
                            lVar3 = lVar2;
                        }
                        interfaceC1734nR.J();
                        lVar4 = lVar2;
                        p031d0.a aVarE5 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                        interfaceC1734nR.T(-103209106);
                        if (pVar3 == null) {
                            aVarE = null;
                        } else {
                            aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                        }
                        interfaceC1734nR.J();
                        objG = interfaceC1734nR.g();
                        aVar2 = V.InterfaceC1734n.f14931a;
                        if (objG == aVar2.a()) {
                            objG = V.AbstractC1730l1.a(0);
                            interfaceC1734nR.K(objG);
                        }
                        interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                        androidx.compose.ui.d dVar6 = dVar3;
                        p237x7.p pVar6 = pVar3;
                        boolean z17 = z12;
                        androidx.compose.ui.d dVarA3 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                        objG2 = interfaceC1734nR.g();
                        if (objG2 == aVar2.a()) {
                            objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                            interfaceC1734nR.K(objG2);
                        }
                        androidx.compose.ui.d dVarA4 = androidx.compose.ui.layout.e.a(dVarA3, (p237x7.l) objG2);
                        D0.I iH2 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                        iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                        V.InterfaceC1758z interfaceC1758zF2 = interfaceC1734nR.F();
                        androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA4);
                        F0.InterfaceC0919g.a aVar4 = F0.InterfaceC0919g.f2641a;
                        aVarA = aVar4.a();
                        if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                            V.AbstractC1725k.c();
                        }
                        interfaceC1734nR.t();
                        if (interfaceC1734nR.o()) {
                            interfaceC1734nR.B(aVarA);
                        } else {
                            interfaceC1734nR.H();
                        }
                        interfaceC1734nA = V.L1.a(interfaceC1734nR);
                        V.L1.c(interfaceC1734nA, iH2, aVar4.c());
                        V.L1.c(interfaceC1734nA, interfaceC1758zF2, aVar4.e());
                        pVarB = aVar4.b();
                        if (interfaceC1734nA.o()) {
                            interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                            interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                        } else {
                            interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                            interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                        }
                        V.L1.c(interfaceC1734nA, dVarE2, aVar4.d());
                        androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.f.f19260a;
                        if (z6) {
                            f6 = 1.0f;
                        } else {
                            f6 = 0.0f;
                        }
                        g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                        Y0.e eVar2 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                        jA = p131n0.h.a((b(interfaceC1745s0) - eVar2.S0(U.r.f14130a.e())) / 2, eVar2.B0(f11839f));
                        p087i7.M m10 = p087i7.M.f46721a;
                        zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                        objG3 = interfaceC1734nR.g();
                        if (zS) {
                            objG3 = new T.t(lVar3, jA, null);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new T.t(lVar3, jA, null);
                            interfaceC1734nR.K(objG3);
                        }
                        p031d0.a aVarE6 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                        p031d0.a aVarE7 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                        zS2 = interfaceC1734nR.S(g1D);
                        objG4 = interfaceC1734nR.g();
                        if (zS2) {
                            objG4 = new S.AbstractC1586w0.b(g1D);
                            interfaceC1734nR.K(objG4);
                        } else {
                            objG4 = new S.AbstractC1586w0.b(g1D);
                            interfaceC1734nR.K(objG4);
                        }
                        d(aVarE6, aVarE7, aVarE5, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                        interfaceC1734nR.Q();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        c1582u1 = c1582u0A;
                        z14 = z13;
                        dVar4 = dVar6;
                        pVar4 = pVar6;
                        z15 = z17;
                    } else {
                        interfaceC1734nR.A();
                        c1582u1 = c1582u0;
                        lVar4 = lVar;
                        pVar4 = pVar3;
                        z15 = z12;
                        z14 = z13;
                        dVar4 = dVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.AbstractC1586w0.e(l6, z6, aVar, pVar, dVar4, z15, pVar4, z14, c1582u1, lVar4, i6, i10));
                    }
                }
                i11 |= 24576;
                dVar2 = dVar;
                i15 = 16 & i10;
                if (i15 != 0) {
                    i11 |= 196608;
                    z12 = z10;
                } else {
                    z12 = z10;
                    if ((i6 & 196608) == 0) {
                        if (interfaceC1734nR.d(z12)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i11 |= i16;
                    }
                }
                i17 = 32 & i10;
                if (i17 != 0) {
                    i11 |= 1572864;
                    pVar3 = pVar2;
                } else {
                    pVar3 = pVar2;
                    if ((i6 & 1572864) == 0) {
                        if (interfaceC1734nR.l(pVar3)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i11 |= i18;
                    }
                }
                i19 = i10 & 64;
                if (i19 != 0) {
                    i11 |= 12582912;
                    z13 = z11;
                } else {
                    z13 = z11;
                    if ((i6 & 12582912) == 0) {
                        if (interfaceC1734nR.d(z13)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i11 |= i20;
                    }
                }
                if ((i6 & 100663296) != 0) {
                    i11 |= ((i10 & 128) == 0 || !interfaceC1734nR.S(c1582u0)) ? 33554432 : 67108864;
                }
                i21 = 256 & i10;
                if (i21 != 0) {
                    i11 |= 805306368;
                } else if ((i6 & 805306368) == 0) {
                    if (interfaceC1734nR.S(lVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i11 |= i22;
                }
                if ((i11 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i13 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if (i17 != 0) {
                            pVar3 = null;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if ((128 & i10) != 0) {
                            c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                            i11 &= -234881025;
                        } else {
                            c1582u0A = c1582u0;
                        }
                        if (i21 != 0) {
                            i23 = i11;
                            lVar2 = null;
                        } else {
                            lVar2 = lVar;
                            i23 = i11;
                        }
                    } else {
                        if (i13 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if (i17 != 0) {
                            pVar3 = null;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if ((128 & i10) != 0) {
                            c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                            i11 &= -234881025;
                        } else {
                            c1582u0A = c1582u0;
                        }
                        if (i21 != 0) {
                            i23 = i11;
                            lVar2 = null;
                        } else {
                            lVar2 = lVar;
                            i23 = i11;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                    }
                    interfaceC1734nR.T(-103235253);
                    if (lVar2 == null) {
                        objG5 = interfaceC1734nR.g();
                        if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                            objG5 = p250z.k.a();
                            interfaceC1734nR.K(objG5);
                        }
                        lVar3 = (p250z.l) objG5;
                    } else {
                        lVar3 = lVar2;
                    }
                    interfaceC1734nR.J();
                    lVar4 = lVar2;
                    p031d0.a aVarE8 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                    interfaceC1734nR.T(-103209106);
                    if (pVar3 == null) {
                        aVarE = null;
                    } else {
                        aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                    }
                    interfaceC1734nR.J();
                    objG = interfaceC1734nR.g();
                    aVar2 = V.InterfaceC1734n.f14931a;
                    if (objG == aVar2.a()) {
                        objG = V.AbstractC1730l1.a(0);
                        interfaceC1734nR.K(objG);
                    }
                    interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                    androidx.compose.ui.d dVar7 = dVar3;
                    p237x7.p pVar7 = pVar3;
                    boolean z18 = z12;
                    androidx.compose.ui.d dVarA5 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                    objG2 = interfaceC1734nR.g();
                    if (objG2 == aVar2.a()) {
                        objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                        interfaceC1734nR.K(objG2);
                    }
                    androidx.compose.ui.d dVarA6 = androidx.compose.ui.layout.e.a(dVarA5, (p237x7.l) objG2);
                    D0.I iH3 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                    iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                    V.InterfaceC1758z interfaceC1758zF3 = interfaceC1734nR.F();
                    androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA6);
                    F0.InterfaceC0919g.a aVar5 = F0.InterfaceC0919g.f2641a;
                    aVarA = aVar5.a();
                    if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734nR.t();
                    if (interfaceC1734nR.o()) {
                        interfaceC1734nR.B(aVarA);
                    } else {
                        interfaceC1734nR.H();
                    }
                    interfaceC1734nA = V.L1.a(interfaceC1734nR);
                    V.L1.c(interfaceC1734nA, iH3, aVar5.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF3, aVar5.e());
                    pVarB = aVar5.b();
                    if (interfaceC1734nA.o()) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    } else {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE3, aVar5.d());
                    androidx.compose.foundation.layout.f fVar3 = androidx.compose.foundation.layout.f.f19260a;
                    if (z6) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                    Y0.e eVar3 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                    jA = p131n0.h.a((b(interfaceC1745s0) - eVar3.S0(U.r.f14130a.e())) / 2, eVar3.B0(f11839f));
                    p087i7.M m11 = p087i7.M.f46721a;
                    zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                    objG3 = interfaceC1734nR.g();
                    if (zS) {
                        objG3 = new T.t(lVar3, jA, null);
                        interfaceC1734nR.K(objG3);
                    } else {
                        objG3 = new T.t(lVar3, jA, null);
                        interfaceC1734nR.K(objG3);
                    }
                    p031d0.a aVarE9 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                    p031d0.a aVarE10 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                    zS2 = interfaceC1734nR.S(g1D);
                    objG4 = interfaceC1734nR.g();
                    if (zS2) {
                        objG4 = new S.AbstractC1586w0.b(g1D);
                        interfaceC1734nR.K(objG4);
                    } else {
                        objG4 = new S.AbstractC1586w0.b(g1D);
                        interfaceC1734nR.K(objG4);
                    }
                    d(aVarE9, aVarE10, aVarE8, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                    interfaceC1734nR.Q();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    c1582u1 = c1582u0A;
                    z14 = z13;
                    dVar4 = dVar7;
                    pVar4 = pVar7;
                    z15 = z18;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i13 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if (i17 != 0) {
                            pVar3 = null;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if ((128 & i10) != 0) {
                            c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                            i11 &= -234881025;
                        } else {
                            c1582u0A = c1582u0;
                        }
                        if (i21 != 0) {
                            i23 = i11;
                            lVar2 = null;
                        } else {
                            lVar2 = lVar;
                            i23 = i11;
                        }
                    } else {
                        if (i13 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if (i17 != 0) {
                            pVar3 = null;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if ((128 & i10) != 0) {
                            c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                            i11 &= -234881025;
                        } else {
                            c1582u0A = c1582u0;
                        }
                        if (i21 != 0) {
                            i23 = i11;
                            lVar2 = null;
                        } else {
                            lVar2 = lVar;
                            i23 = i11;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                    }
                    interfaceC1734nR.T(-103235253);
                    if (lVar2 == null) {
                        objG5 = interfaceC1734nR.g();
                        if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                            objG5 = p250z.k.a();
                            interfaceC1734nR.K(objG5);
                        }
                        lVar3 = (p250z.l) objG5;
                    } else {
                        lVar3 = lVar2;
                    }
                    interfaceC1734nR.J();
                    lVar4 = lVar2;
                    p031d0.a aVarE11 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                    interfaceC1734nR.T(-103209106);
                    if (pVar3 == null) {
                        aVarE = null;
                    } else {
                        aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                    }
                    interfaceC1734nR.J();
                    objG = interfaceC1734nR.g();
                    aVar2 = V.InterfaceC1734n.f14931a;
                    if (objG == aVar2.a()) {
                        objG = V.AbstractC1730l1.a(0);
                        interfaceC1734nR.K(objG);
                    }
                    interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                    androidx.compose.ui.d dVar8 = dVar3;
                    p237x7.p pVar8 = pVar3;
                    boolean z19 = z12;
                    androidx.compose.ui.d dVarA7 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                    objG2 = interfaceC1734nR.g();
                    if (objG2 == aVar2.a()) {
                        objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                        interfaceC1734nR.K(objG2);
                    }
                    androidx.compose.ui.d dVarA8 = androidx.compose.ui.layout.e.a(dVarA7, (p237x7.l) objG2);
                    D0.I iH4 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                    iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                    V.InterfaceC1758z interfaceC1758zF4 = interfaceC1734nR.F();
                    androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA8);
                    F0.InterfaceC0919g.a aVar6 = F0.InterfaceC0919g.f2641a;
                    aVarA = aVar6.a();
                    if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734nR.t();
                    if (interfaceC1734nR.o()) {
                        interfaceC1734nR.B(aVarA);
                    } else {
                        interfaceC1734nR.H();
                    }
                    interfaceC1734nA = V.L1.a(interfaceC1734nR);
                    V.L1.c(interfaceC1734nA, iH4, aVar6.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF4, aVar6.e());
                    pVarB = aVar6.b();
                    if (interfaceC1734nA.o()) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    } else {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE4, aVar6.d());
                    androidx.compose.foundation.layout.f fVar4 = androidx.compose.foundation.layout.f.f19260a;
                    if (z6) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                    Y0.e eVar4 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                    jA = p131n0.h.a((b(interfaceC1745s0) - eVar4.S0(U.r.f14130a.e())) / 2, eVar4.B0(f11839f));
                    p087i7.M m12 = p087i7.M.f46721a;
                    zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                    objG3 = interfaceC1734nR.g();
                    if (zS) {
                        objG3 = new T.t(lVar3, jA, null);
                        interfaceC1734nR.K(objG3);
                    } else {
                        objG3 = new T.t(lVar3, jA, null);
                        interfaceC1734nR.K(objG3);
                    }
                    p031d0.a aVarE12 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                    p031d0.a aVarE13 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                    zS2 = interfaceC1734nR.S(g1D);
                    objG4 = interfaceC1734nR.g();
                    if (zS2) {
                        objG4 = new S.AbstractC1586w0.b(g1D);
                        interfaceC1734nR.K(objG4);
                    } else {
                        objG4 = new S.AbstractC1586w0.b(g1D);
                        interfaceC1734nR.K(objG4);
                    }
                    d(aVarE12, aVarE13, aVarE11, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                    interfaceC1734nR.Q();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    c1582u1 = c1582u0A;
                    z14 = z13;
                    dVar4 = dVar8;
                    pVar4 = pVar8;
                    z15 = z19;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1586w0.e(l6, z6, aVar, pVar, dVar4, z15, pVar4, z14, c1582u1, lVar4, i6, i10));
                }
            }
            i11 |= 3072;
            i13 = i10 & 8;
            if (i13 != 0) {
                if ((i6 & 24576) == 0) {
                    dVar2 = dVar;
                    if (interfaceC1734nR.S(dVar2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i11 |= i14;
                }
                i15 = 16 & i10;
                if (i15 != 0) {
                    i11 |= 196608;
                    z12 = z10;
                } else {
                    z12 = z10;
                    if ((i6 & 196608) == 0) {
                        if (interfaceC1734nR.d(z12)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i11 |= i16;
                    }
                }
                i17 = 32 & i10;
                if (i17 != 0) {
                    i11 |= 1572864;
                    pVar3 = pVar2;
                } else {
                    pVar3 = pVar2;
                    if ((i6 & 1572864) == 0) {
                        if (interfaceC1734nR.l(pVar3)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i11 |= i18;
                    }
                }
                i19 = i10 & 64;
                if (i19 != 0) {
                    i11 |= 12582912;
                    z13 = z11;
                } else {
                    z13 = z11;
                    if ((i6 & 12582912) == 0) {
                        if (interfaceC1734nR.d(z13)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i11 |= i20;
                    }
                }
                if ((i6 & 100663296) != 0) {
                    i11 |= ((i10 & 128) == 0 || !interfaceC1734nR.S(c1582u0)) ? 33554432 : 67108864;
                }
                i21 = 256 & i10;
                if (i21 != 0) {
                    i11 |= 805306368;
                } else if ((i6 & 805306368) == 0) {
                    if (interfaceC1734nR.S(lVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i11 |= i22;
                }
                if ((i11 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i13 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if (i17 != 0) {
                            pVar3 = null;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if ((128 & i10) != 0) {
                            c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                            i11 &= -234881025;
                        } else {
                            c1582u0A = c1582u0;
                        }
                        if (i21 != 0) {
                            i23 = i11;
                            lVar2 = null;
                        } else {
                            lVar2 = lVar;
                            i23 = i11;
                        }
                    } else {
                        if (i13 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if (i17 != 0) {
                            pVar3 = null;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if ((128 & i10) != 0) {
                            c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                            i11 &= -234881025;
                        } else {
                            c1582u0A = c1582u0;
                        }
                        if (i21 != 0) {
                            i23 = i11;
                            lVar2 = null;
                        } else {
                            lVar2 = lVar;
                            i23 = i11;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                    }
                    interfaceC1734nR.T(-103235253);
                    if (lVar2 == null) {
                        objG5 = interfaceC1734nR.g();
                        if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                            objG5 = p250z.k.a();
                            interfaceC1734nR.K(objG5);
                        }
                        lVar3 = (p250z.l) objG5;
                    } else {
                        lVar3 = lVar2;
                    }
                    interfaceC1734nR.J();
                    lVar4 = lVar2;
                    p031d0.a aVarE14 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                    interfaceC1734nR.T(-103209106);
                    if (pVar3 == null) {
                        aVarE = null;
                    } else {
                        aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                    }
                    interfaceC1734nR.J();
                    objG = interfaceC1734nR.g();
                    aVar2 = V.InterfaceC1734n.f14931a;
                    if (objG == aVar2.a()) {
                        objG = V.AbstractC1730l1.a(0);
                        interfaceC1734nR.K(objG);
                    }
                    interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                    androidx.compose.ui.d dVar9 = dVar3;
                    p237x7.p pVar9 = pVar3;
                    boolean z110 = z12;
                    androidx.compose.ui.d dVarA9 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                    objG2 = interfaceC1734nR.g();
                    if (objG2 == aVar2.a()) {
                        objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                        interfaceC1734nR.K(objG2);
                    }
                    androidx.compose.ui.d dVarA10 = androidx.compose.ui.layout.e.a(dVarA9, (p237x7.l) objG2);
                    D0.I iH5 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                    iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                    V.InterfaceC1758z interfaceC1758zF5 = interfaceC1734nR.F();
                    androidx.compose.ui.d dVarE5 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA10);
                    F0.InterfaceC0919g.a aVar7 = F0.InterfaceC0919g.f2641a;
                    aVarA = aVar7.a();
                    if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734nR.t();
                    if (interfaceC1734nR.o()) {
                        interfaceC1734nR.B(aVarA);
                    } else {
                        interfaceC1734nR.H();
                    }
                    interfaceC1734nA = V.L1.a(interfaceC1734nR);
                    V.L1.c(interfaceC1734nA, iH5, aVar7.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF5, aVar7.e());
                    pVarB = aVar7.b();
                    if (interfaceC1734nA.o()) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    } else {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE5, aVar7.d());
                    androidx.compose.foundation.layout.f fVar5 = androidx.compose.foundation.layout.f.f19260a;
                    if (z6) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                    Y0.e eVar5 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                    jA = p131n0.h.a((b(interfaceC1745s0) - eVar5.S0(U.r.f14130a.e())) / 2, eVar5.B0(f11839f));
                    p087i7.M m13 = p087i7.M.f46721a;
                    zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                    objG3 = interfaceC1734nR.g();
                    if (zS) {
                        objG3 = new T.t(lVar3, jA, null);
                        interfaceC1734nR.K(objG3);
                    } else {
                        objG3 = new T.t(lVar3, jA, null);
                        interfaceC1734nR.K(objG3);
                    }
                    p031d0.a aVarE15 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                    p031d0.a aVarE16 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                    zS2 = interfaceC1734nR.S(g1D);
                    objG4 = interfaceC1734nR.g();
                    if (zS2) {
                        objG4 = new S.AbstractC1586w0.b(g1D);
                        interfaceC1734nR.K(objG4);
                    } else {
                        objG4 = new S.AbstractC1586w0.b(g1D);
                        interfaceC1734nR.K(objG4);
                    }
                    d(aVarE15, aVarE16, aVarE14, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                    interfaceC1734nR.Q();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    c1582u1 = c1582u0A;
                    z14 = z13;
                    dVar4 = dVar9;
                    pVar4 = pVar9;
                    z15 = z110;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i13 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if (i17 != 0) {
                            pVar3 = null;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if ((128 & i10) != 0) {
                            c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                            i11 &= -234881025;
                        } else {
                            c1582u0A = c1582u0;
                        }
                        if (i21 != 0) {
                            i23 = i11;
                            lVar2 = null;
                        } else {
                            lVar2 = lVar;
                            i23 = i11;
                        }
                    } else {
                        if (i13 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if (i17 != 0) {
                            pVar3 = null;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if ((128 & i10) != 0) {
                            c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                            i11 &= -234881025;
                        } else {
                            c1582u0A = c1582u0;
                        }
                        if (i21 != 0) {
                            i23 = i11;
                            lVar2 = null;
                        } else {
                            lVar2 = lVar;
                            i23 = i11;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                    }
                    interfaceC1734nR.T(-103235253);
                    if (lVar2 == null) {
                        objG5 = interfaceC1734nR.g();
                        if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                            objG5 = p250z.k.a();
                            interfaceC1734nR.K(objG5);
                        }
                        lVar3 = (p250z.l) objG5;
                    } else {
                        lVar3 = lVar2;
                    }
                    interfaceC1734nR.J();
                    lVar4 = lVar2;
                    p031d0.a aVarE17 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                    interfaceC1734nR.T(-103209106);
                    if (pVar3 == null) {
                        aVarE = null;
                    } else {
                        aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                    }
                    interfaceC1734nR.J();
                    objG = interfaceC1734nR.g();
                    aVar2 = V.InterfaceC1734n.f14931a;
                    if (objG == aVar2.a()) {
                        objG = V.AbstractC1730l1.a(0);
                        interfaceC1734nR.K(objG);
                    }
                    interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                    androidx.compose.ui.d dVar10 = dVar3;
                    p237x7.p pVar10 = pVar3;
                    boolean z111 = z12;
                    androidx.compose.ui.d dVarA11 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                    objG2 = interfaceC1734nR.g();
                    if (objG2 == aVar2.a()) {
                        objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                        interfaceC1734nR.K(objG2);
                    }
                    androidx.compose.ui.d dVarA12 = androidx.compose.ui.layout.e.a(dVarA11, (p237x7.l) objG2);
                    D0.I iH6 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                    iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                    V.InterfaceC1758z interfaceC1758zF6 = interfaceC1734nR.F();
                    androidx.compose.ui.d dVarE6 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA12);
                    F0.InterfaceC0919g.a aVar8 = F0.InterfaceC0919g.f2641a;
                    aVarA = aVar8.a();
                    if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734nR.t();
                    if (interfaceC1734nR.o()) {
                        interfaceC1734nR.B(aVarA);
                    } else {
                        interfaceC1734nR.H();
                    }
                    interfaceC1734nA = V.L1.a(interfaceC1734nR);
                    V.L1.c(interfaceC1734nA, iH6, aVar8.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF6, aVar8.e());
                    pVarB = aVar8.b();
                    if (interfaceC1734nA.o()) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    } else {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE6, aVar8.d());
                    androidx.compose.foundation.layout.f fVar6 = androidx.compose.foundation.layout.f.f19260a;
                    if (z6) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                    Y0.e eVar6 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                    jA = p131n0.h.a((b(interfaceC1745s0) - eVar6.S0(U.r.f14130a.e())) / 2, eVar6.B0(f11839f));
                    p087i7.M m14 = p087i7.M.f46721a;
                    zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                    objG3 = interfaceC1734nR.g();
                    if (zS) {
                        objG3 = new T.t(lVar3, jA, null);
                        interfaceC1734nR.K(objG3);
                    } else {
                        objG3 = new T.t(lVar3, jA, null);
                        interfaceC1734nR.K(objG3);
                    }
                    p031d0.a aVarE18 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                    p031d0.a aVarE19 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                    zS2 = interfaceC1734nR.S(g1D);
                    objG4 = interfaceC1734nR.g();
                    if (zS2) {
                        objG4 = new S.AbstractC1586w0.b(g1D);
                        interfaceC1734nR.K(objG4);
                    } else {
                        objG4 = new S.AbstractC1586w0.b(g1D);
                        interfaceC1734nR.K(objG4);
                    }
                    d(aVarE18, aVarE19, aVarE17, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                    interfaceC1734nR.Q();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    c1582u1 = c1582u0A;
                    z14 = z13;
                    dVar4 = dVar10;
                    pVar4 = pVar10;
                    z15 = z111;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1586w0.e(l6, z6, aVar, pVar, dVar4, z15, pVar4, z14, c1582u1, lVar4, i6, i10));
                }
            }
            i11 |= 24576;
            dVar2 = dVar;
            i15 = 16 & i10;
            if (i15 != 0) {
                i11 |= 196608;
                z12 = z10;
            } else {
                z12 = z10;
                if ((i6 & 196608) == 0) {
                    if (interfaceC1734nR.d(z12)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i11 |= i16;
                }
            }
            i17 = 32 & i10;
            if (i17 != 0) {
                i11 |= 1572864;
                pVar3 = pVar2;
            } else {
                pVar3 = pVar2;
                if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(pVar3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
            }
            i19 = i10 & 64;
            if (i19 != 0) {
                i11 |= 12582912;
                z13 = z11;
            } else {
                z13 = z11;
                if ((i6 & 12582912) == 0) {
                    if (interfaceC1734nR.d(z13)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i11 |= i20;
                }
            }
            if ((i6 & 100663296) != 0) {
                i11 |= ((i10 & 128) == 0 || !interfaceC1734nR.S(c1582u0)) ? 33554432 : 67108864;
            }
            i21 = 256 & i10;
            if (i21 != 0) {
                i11 |= 805306368;
            } else if ((i6 & 805306368) == 0) {
                if (interfaceC1734nR.S(lVar)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i11 |= i22;
            }
            if ((i11 & 306783379) == 306783378) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if ((128 & i10) != 0) {
                        c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                        i11 &= -234881025;
                    } else {
                        c1582u0A = c1582u0;
                    }
                    if (i21 != 0) {
                        i23 = i11;
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                        i23 = i11;
                    }
                } else {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if ((128 & i10) != 0) {
                        c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                        i11 &= -234881025;
                    } else {
                        c1582u0A = c1582u0;
                    }
                    if (i21 != 0) {
                        i23 = i11;
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                        i23 = i11;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                }
                interfaceC1734nR.T(-103235253);
                if (lVar2 == null) {
                    objG5 = interfaceC1734nR.g();
                    if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                        objG5 = p250z.k.a();
                        interfaceC1734nR.K(objG5);
                    }
                    lVar3 = (p250z.l) objG5;
                } else {
                    lVar3 = lVar2;
                }
                interfaceC1734nR.J();
                lVar4 = lVar2;
                p031d0.a aVarE110 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                interfaceC1734nR.T(-103209106);
                if (pVar3 == null) {
                    aVarE = null;
                } else {
                    aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                }
                interfaceC1734nR.J();
                objG = interfaceC1734nR.g();
                aVar2 = V.InterfaceC1734n.f14931a;
                if (objG == aVar2.a()) {
                    objG = V.AbstractC1730l1.a(0);
                    interfaceC1734nR.K(objG);
                }
                interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                androidx.compose.ui.d dVar11 = dVar3;
                p237x7.p pVar11 = pVar3;
                boolean z112 = z12;
                androidx.compose.ui.d dVarA13 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                objG2 = interfaceC1734nR.g();
                if (objG2 == aVar2.a()) {
                    objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                    interfaceC1734nR.K(objG2);
                }
                androidx.compose.ui.d dVarA14 = androidx.compose.ui.layout.e.a(dVarA13, (p237x7.l) objG2);
                D0.I iH7 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF7 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE7 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA14);
                F0.InterfaceC0919g.a aVar9 = F0.InterfaceC0919g.f2641a;
                aVarA = aVar9.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH7, aVar9.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF7, aVar9.e());
                pVarB = aVar9.b();
                if (interfaceC1734nA.o()) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                } else {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE7, aVar9.d());
                androidx.compose.foundation.layout.f fVar7 = androidx.compose.foundation.layout.f.f19260a;
                if (z6) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                Y0.e eVar7 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                jA = p131n0.h.a((b(interfaceC1745s0) - eVar7.S0(U.r.f14130a.e())) / 2, eVar7.B0(f11839f));
                p087i7.M m15 = p087i7.M.f46721a;
                zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                objG3 = interfaceC1734nR.g();
                if (zS) {
                    objG3 = new T.t(lVar3, jA, null);
                    interfaceC1734nR.K(objG3);
                } else {
                    objG3 = new T.t(lVar3, jA, null);
                    interfaceC1734nR.K(objG3);
                }
                p031d0.a aVarE111 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                p031d0.a aVarE112 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                zS2 = interfaceC1734nR.S(g1D);
                objG4 = interfaceC1734nR.g();
                if (zS2) {
                    objG4 = new S.AbstractC1586w0.b(g1D);
                    interfaceC1734nR.K(objG4);
                } else {
                    objG4 = new S.AbstractC1586w0.b(g1D);
                    interfaceC1734nR.K(objG4);
                }
                d(aVarE111, aVarE112, aVarE110, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                c1582u1 = c1582u0A;
                z14 = z13;
                dVar4 = dVar11;
                pVar4 = pVar11;
                z15 = z112;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if ((128 & i10) != 0) {
                        c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                        i11 &= -234881025;
                    } else {
                        c1582u0A = c1582u0;
                    }
                    if (i21 != 0) {
                        i23 = i11;
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                        i23 = i11;
                    }
                } else {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if ((128 & i10) != 0) {
                        c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                        i11 &= -234881025;
                    } else {
                        c1582u0A = c1582u0;
                    }
                    if (i21 != 0) {
                        i23 = i11;
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                        i23 = i11;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                }
                interfaceC1734nR.T(-103235253);
                if (lVar2 == null) {
                    objG5 = interfaceC1734nR.g();
                    if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                        objG5 = p250z.k.a();
                        interfaceC1734nR.K(objG5);
                    }
                    lVar3 = (p250z.l) objG5;
                } else {
                    lVar3 = lVar2;
                }
                interfaceC1734nR.J();
                lVar4 = lVar2;
                p031d0.a aVarE113 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                interfaceC1734nR.T(-103209106);
                if (pVar3 == null) {
                    aVarE = null;
                } else {
                    aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                }
                interfaceC1734nR.J();
                objG = interfaceC1734nR.g();
                aVar2 = V.InterfaceC1734n.f14931a;
                if (objG == aVar2.a()) {
                    objG = V.AbstractC1730l1.a(0);
                    interfaceC1734nR.K(objG);
                }
                interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                androidx.compose.ui.d dVar12 = dVar3;
                p237x7.p pVar12 = pVar3;
                boolean z113 = z12;
                androidx.compose.ui.d dVarA15 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                objG2 = interfaceC1734nR.g();
                if (objG2 == aVar2.a()) {
                    objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                    interfaceC1734nR.K(objG2);
                }
                androidx.compose.ui.d dVarA16 = androidx.compose.ui.layout.e.a(dVarA15, (p237x7.l) objG2);
                D0.I iH8 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF8 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE8 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA16);
                F0.InterfaceC0919g.a aVar10 = F0.InterfaceC0919g.f2641a;
                aVarA = aVar10.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH8, aVar10.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF8, aVar10.e());
                pVarB = aVar10.b();
                if (interfaceC1734nA.o()) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                } else {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE8, aVar10.d());
                androidx.compose.foundation.layout.f fVar8 = androidx.compose.foundation.layout.f.f19260a;
                if (z6) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                Y0.e eVar8 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                jA = p131n0.h.a((b(interfaceC1745s0) - eVar8.S0(U.r.f14130a.e())) / 2, eVar8.B0(f11839f));
                p087i7.M m16 = p087i7.M.f46721a;
                zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                objG3 = interfaceC1734nR.g();
                if (zS) {
                    objG3 = new T.t(lVar3, jA, null);
                    interfaceC1734nR.K(objG3);
                } else {
                    objG3 = new T.t(lVar3, jA, null);
                    interfaceC1734nR.K(objG3);
                }
                p031d0.a aVarE114 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                p031d0.a aVarE115 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                zS2 = interfaceC1734nR.S(g1D);
                objG4 = interfaceC1734nR.g();
                if (zS2) {
                    objG4 = new S.AbstractC1586w0.b(g1D);
                    interfaceC1734nR.K(objG4);
                } else {
                    objG4 = new S.AbstractC1586w0.b(g1D);
                    interfaceC1734nR.K(objG4);
                }
                d(aVarE114, aVarE115, aVarE113, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                c1582u1 = c1582u0A;
                z14 = z13;
                dVar4 = dVar12;
                pVar4 = pVar12;
                z15 = z113;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1586w0.e(l6, z6, aVar, pVar, dVar4, z15, pVar4, z14, c1582u1, lVar4, i6, i10));
            }
        }
        i11 |= 384;
        if ((4 & i10) != 0) {
            if ((i6 & 3072) == 0) {
                if (interfaceC1734nR.l(pVar)) {
                    i12 = 2048;
                } else {
                    i12 = 1024;
                }
                i11 |= i12;
            }
            i13 = i10 & 8;
            if (i13 != 0) {
                if ((i6 & 24576) == 0) {
                    dVar2 = dVar;
                    if (interfaceC1734nR.S(dVar2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i11 |= i14;
                }
                i15 = 16 & i10;
                if (i15 != 0) {
                    i11 |= 196608;
                    z12 = z10;
                } else {
                    z12 = z10;
                    if ((i6 & 196608) == 0) {
                        if (interfaceC1734nR.d(z12)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i11 |= i16;
                    }
                }
                i17 = 32 & i10;
                if (i17 != 0) {
                    i11 |= 1572864;
                    pVar3 = pVar2;
                } else {
                    pVar3 = pVar2;
                    if ((i6 & 1572864) == 0) {
                        if (interfaceC1734nR.l(pVar3)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i11 |= i18;
                    }
                }
                i19 = i10 & 64;
                if (i19 != 0) {
                    i11 |= 12582912;
                    z13 = z11;
                } else {
                    z13 = z11;
                    if ((i6 & 12582912) == 0) {
                        if (interfaceC1734nR.d(z13)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i11 |= i20;
                    }
                }
                if ((i6 & 100663296) != 0) {
                    i11 |= ((i10 & 128) == 0 || !interfaceC1734nR.S(c1582u0)) ? 33554432 : 67108864;
                }
                i21 = 256 & i10;
                if (i21 != 0) {
                    i11 |= 805306368;
                } else if ((i6 & 805306368) == 0) {
                    if (interfaceC1734nR.S(lVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i11 |= i22;
                }
                if ((i11 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i13 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if (i17 != 0) {
                            pVar3 = null;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if ((128 & i10) != 0) {
                            c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                            i11 &= -234881025;
                        } else {
                            c1582u0A = c1582u0;
                        }
                        if (i21 != 0) {
                            i23 = i11;
                            lVar2 = null;
                        } else {
                            lVar2 = lVar;
                            i23 = i11;
                        }
                    } else {
                        if (i13 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if (i17 != 0) {
                            pVar3 = null;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if ((128 & i10) != 0) {
                            c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                            i11 &= -234881025;
                        } else {
                            c1582u0A = c1582u0;
                        }
                        if (i21 != 0) {
                            i23 = i11;
                            lVar2 = null;
                        } else {
                            lVar2 = lVar;
                            i23 = i11;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                    }
                    interfaceC1734nR.T(-103235253);
                    if (lVar2 == null) {
                        objG5 = interfaceC1734nR.g();
                        if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                            objG5 = p250z.k.a();
                            interfaceC1734nR.K(objG5);
                        }
                        lVar3 = (p250z.l) objG5;
                    } else {
                        lVar3 = lVar2;
                    }
                    interfaceC1734nR.J();
                    lVar4 = lVar2;
                    p031d0.a aVarE116 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                    interfaceC1734nR.T(-103209106);
                    if (pVar3 == null) {
                        aVarE = null;
                    } else {
                        aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                    }
                    interfaceC1734nR.J();
                    objG = interfaceC1734nR.g();
                    aVar2 = V.InterfaceC1734n.f14931a;
                    if (objG == aVar2.a()) {
                        objG = V.AbstractC1730l1.a(0);
                        interfaceC1734nR.K(objG);
                    }
                    interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                    androidx.compose.ui.d dVar13 = dVar3;
                    p237x7.p pVar13 = pVar3;
                    boolean z114 = z12;
                    androidx.compose.ui.d dVarA17 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                    objG2 = interfaceC1734nR.g();
                    if (objG2 == aVar2.a()) {
                        objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                        interfaceC1734nR.K(objG2);
                    }
                    androidx.compose.ui.d dVarA18 = androidx.compose.ui.layout.e.a(dVarA17, (p237x7.l) objG2);
                    D0.I iH9 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                    iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                    V.InterfaceC1758z interfaceC1758zF9 = interfaceC1734nR.F();
                    androidx.compose.ui.d dVarE9 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA18);
                    F0.InterfaceC0919g.a aVar11 = F0.InterfaceC0919g.f2641a;
                    aVarA = aVar11.a();
                    if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734nR.t();
                    if (interfaceC1734nR.o()) {
                        interfaceC1734nR.B(aVarA);
                    } else {
                        interfaceC1734nR.H();
                    }
                    interfaceC1734nA = V.L1.a(interfaceC1734nR);
                    V.L1.c(interfaceC1734nA, iH9, aVar11.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF9, aVar11.e());
                    pVarB = aVar11.b();
                    if (interfaceC1734nA.o()) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    } else {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE9, aVar11.d());
                    androidx.compose.foundation.layout.f fVar9 = androidx.compose.foundation.layout.f.f19260a;
                    if (z6) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                    Y0.e eVar9 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                    jA = p131n0.h.a((b(interfaceC1745s0) - eVar9.S0(U.r.f14130a.e())) / 2, eVar9.B0(f11839f));
                    p087i7.M m17 = p087i7.M.f46721a;
                    zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                    objG3 = interfaceC1734nR.g();
                    if (zS) {
                        objG3 = new T.t(lVar3, jA, null);
                        interfaceC1734nR.K(objG3);
                    } else {
                        objG3 = new T.t(lVar3, jA, null);
                        interfaceC1734nR.K(objG3);
                    }
                    p031d0.a aVarE117 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                    p031d0.a aVarE118 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                    zS2 = interfaceC1734nR.S(g1D);
                    objG4 = interfaceC1734nR.g();
                    if (zS2) {
                        objG4 = new S.AbstractC1586w0.b(g1D);
                        interfaceC1734nR.K(objG4);
                    } else {
                        objG4 = new S.AbstractC1586w0.b(g1D);
                        interfaceC1734nR.K(objG4);
                    }
                    d(aVarE117, aVarE118, aVarE116, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                    interfaceC1734nR.Q();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    c1582u1 = c1582u0A;
                    z14 = z13;
                    dVar4 = dVar13;
                    pVar4 = pVar13;
                    z15 = z114;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i13 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if (i17 != 0) {
                            pVar3 = null;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if ((128 & i10) != 0) {
                            c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                            i11 &= -234881025;
                        } else {
                            c1582u0A = c1582u0;
                        }
                        if (i21 != 0) {
                            i23 = i11;
                            lVar2 = null;
                        } else {
                            lVar2 = lVar;
                            i23 = i11;
                        }
                    } else {
                        if (i13 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if (i17 != 0) {
                            pVar3 = null;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if ((128 & i10) != 0) {
                            c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                            i11 &= -234881025;
                        } else {
                            c1582u0A = c1582u0;
                        }
                        if (i21 != 0) {
                            i23 = i11;
                            lVar2 = null;
                        } else {
                            lVar2 = lVar;
                            i23 = i11;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                    }
                    interfaceC1734nR.T(-103235253);
                    if (lVar2 == null) {
                        objG5 = interfaceC1734nR.g();
                        if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                            objG5 = p250z.k.a();
                            interfaceC1734nR.K(objG5);
                        }
                        lVar3 = (p250z.l) objG5;
                    } else {
                        lVar3 = lVar2;
                    }
                    interfaceC1734nR.J();
                    lVar4 = lVar2;
                    p031d0.a aVarE119 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                    interfaceC1734nR.T(-103209106);
                    if (pVar3 == null) {
                        aVarE = null;
                    } else {
                        aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                    }
                    interfaceC1734nR.J();
                    objG = interfaceC1734nR.g();
                    aVar2 = V.InterfaceC1734n.f14931a;
                    if (objG == aVar2.a()) {
                        objG = V.AbstractC1730l1.a(0);
                        interfaceC1734nR.K(objG);
                    }
                    interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                    androidx.compose.ui.d dVar14 = dVar3;
                    p237x7.p pVar14 = pVar3;
                    boolean z115 = z12;
                    androidx.compose.ui.d dVarA19 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                    objG2 = interfaceC1734nR.g();
                    if (objG2 == aVar2.a()) {
                        objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                        interfaceC1734nR.K(objG2);
                    }
                    androidx.compose.ui.d dVarA110 = androidx.compose.ui.layout.e.a(dVarA19, (p237x7.l) objG2);
                    D0.I iH10 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                    iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                    V.InterfaceC1758z interfaceC1758zF10 = interfaceC1734nR.F();
                    androidx.compose.ui.d dVarE10 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA110);
                    F0.InterfaceC0919g.a aVar12 = F0.InterfaceC0919g.f2641a;
                    aVarA = aVar12.a();
                    if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734nR.t();
                    if (interfaceC1734nR.o()) {
                        interfaceC1734nR.B(aVarA);
                    } else {
                        interfaceC1734nR.H();
                    }
                    interfaceC1734nA = V.L1.a(interfaceC1734nR);
                    V.L1.c(interfaceC1734nA, iH10, aVar12.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF10, aVar12.e());
                    pVarB = aVar12.b();
                    if (interfaceC1734nA.o()) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    } else {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE10, aVar12.d());
                    androidx.compose.foundation.layout.f fVar10 = androidx.compose.foundation.layout.f.f19260a;
                    if (z6) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                    Y0.e eVar10 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                    jA = p131n0.h.a((b(interfaceC1745s0) - eVar10.S0(U.r.f14130a.e())) / 2, eVar10.B0(f11839f));
                    p087i7.M m18 = p087i7.M.f46721a;
                    zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                    objG3 = interfaceC1734nR.g();
                    if (zS) {
                        objG3 = new T.t(lVar3, jA, null);
                        interfaceC1734nR.K(objG3);
                    } else {
                        objG3 = new T.t(lVar3, jA, null);
                        interfaceC1734nR.K(objG3);
                    }
                    p031d0.a aVarE1110 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                    p031d0.a aVarE1111 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                    zS2 = interfaceC1734nR.S(g1D);
                    objG4 = interfaceC1734nR.g();
                    if (zS2) {
                        objG4 = new S.AbstractC1586w0.b(g1D);
                        interfaceC1734nR.K(objG4);
                    } else {
                        objG4 = new S.AbstractC1586w0.b(g1D);
                        interfaceC1734nR.K(objG4);
                    }
                    d(aVarE1110, aVarE1111, aVarE119, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                    interfaceC1734nR.Q();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    c1582u1 = c1582u0A;
                    z14 = z13;
                    dVar4 = dVar14;
                    pVar4 = pVar14;
                    z15 = z115;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1586w0.e(l6, z6, aVar, pVar, dVar4, z15, pVar4, z14, c1582u1, lVar4, i6, i10));
                }
            }
            i11 |= 24576;
            dVar2 = dVar;
            i15 = 16 & i10;
            if (i15 != 0) {
                i11 |= 196608;
                z12 = z10;
            } else {
                z12 = z10;
                if ((i6 & 196608) == 0) {
                    if (interfaceC1734nR.d(z12)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i11 |= i16;
                }
            }
            i17 = 32 & i10;
            if (i17 != 0) {
                i11 |= 1572864;
                pVar3 = pVar2;
            } else {
                pVar3 = pVar2;
                if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(pVar3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
            }
            i19 = i10 & 64;
            if (i19 != 0) {
                i11 |= 12582912;
                z13 = z11;
            } else {
                z13 = z11;
                if ((i6 & 12582912) == 0) {
                    if (interfaceC1734nR.d(z13)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i11 |= i20;
                }
            }
            if ((i6 & 100663296) != 0) {
                i11 |= ((i10 & 128) == 0 || !interfaceC1734nR.S(c1582u0)) ? 33554432 : 67108864;
            }
            i21 = 256 & i10;
            if (i21 != 0) {
                i11 |= 805306368;
            } else if ((i6 & 805306368) == 0) {
                if (interfaceC1734nR.S(lVar)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i11 |= i22;
            }
            if ((i11 & 306783379) == 306783378) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if ((128 & i10) != 0) {
                        c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                        i11 &= -234881025;
                    } else {
                        c1582u0A = c1582u0;
                    }
                    if (i21 != 0) {
                        i23 = i11;
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                        i23 = i11;
                    }
                } else {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if ((128 & i10) != 0) {
                        c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                        i11 &= -234881025;
                    } else {
                        c1582u0A = c1582u0;
                    }
                    if (i21 != 0) {
                        i23 = i11;
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                        i23 = i11;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                }
                interfaceC1734nR.T(-103235253);
                if (lVar2 == null) {
                    objG5 = interfaceC1734nR.g();
                    if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                        objG5 = p250z.k.a();
                        interfaceC1734nR.K(objG5);
                    }
                    lVar3 = (p250z.l) objG5;
                } else {
                    lVar3 = lVar2;
                }
                interfaceC1734nR.J();
                lVar4 = lVar2;
                p031d0.a aVarE1112 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                interfaceC1734nR.T(-103209106);
                if (pVar3 == null) {
                    aVarE = null;
                } else {
                    aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                }
                interfaceC1734nR.J();
                objG = interfaceC1734nR.g();
                aVar2 = V.InterfaceC1734n.f14931a;
                if (objG == aVar2.a()) {
                    objG = V.AbstractC1730l1.a(0);
                    interfaceC1734nR.K(objG);
                }
                interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                androidx.compose.ui.d dVar15 = dVar3;
                p237x7.p pVar15 = pVar3;
                boolean z116 = z12;
                androidx.compose.ui.d dVarA111 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                objG2 = interfaceC1734nR.g();
                if (objG2 == aVar2.a()) {
                    objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                    interfaceC1734nR.K(objG2);
                }
                androidx.compose.ui.d dVarA112 = androidx.compose.ui.layout.e.a(dVarA111, (p237x7.l) objG2);
                D0.I iH11 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF11 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE11 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA112);
                F0.InterfaceC0919g.a aVar13 = F0.InterfaceC0919g.f2641a;
                aVarA = aVar13.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH11, aVar13.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF11, aVar13.e());
                pVarB = aVar13.b();
                if (interfaceC1734nA.o()) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                } else {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE11, aVar13.d());
                androidx.compose.foundation.layout.f fVar11 = androidx.compose.foundation.layout.f.f19260a;
                if (z6) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                Y0.e eVar11 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                jA = p131n0.h.a((b(interfaceC1745s0) - eVar11.S0(U.r.f14130a.e())) / 2, eVar11.B0(f11839f));
                p087i7.M m19 = p087i7.M.f46721a;
                zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                objG3 = interfaceC1734nR.g();
                if (zS) {
                    objG3 = new T.t(lVar3, jA, null);
                    interfaceC1734nR.K(objG3);
                } else {
                    objG3 = new T.t(lVar3, jA, null);
                    interfaceC1734nR.K(objG3);
                }
                p031d0.a aVarE1113 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                p031d0.a aVarE1114 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                zS2 = interfaceC1734nR.S(g1D);
                objG4 = interfaceC1734nR.g();
                if (zS2) {
                    objG4 = new S.AbstractC1586w0.b(g1D);
                    interfaceC1734nR.K(objG4);
                } else {
                    objG4 = new S.AbstractC1586w0.b(g1D);
                    interfaceC1734nR.K(objG4);
                }
                d(aVarE1113, aVarE1114, aVarE1112, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                c1582u1 = c1582u0A;
                z14 = z13;
                dVar4 = dVar15;
                pVar4 = pVar15;
                z15 = z116;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if ((128 & i10) != 0) {
                        c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                        i11 &= -234881025;
                    } else {
                        c1582u0A = c1582u0;
                    }
                    if (i21 != 0) {
                        i23 = i11;
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                        i23 = i11;
                    }
                } else {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if ((128 & i10) != 0) {
                        c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                        i11 &= -234881025;
                    } else {
                        c1582u0A = c1582u0;
                    }
                    if (i21 != 0) {
                        i23 = i11;
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                        i23 = i11;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                }
                interfaceC1734nR.T(-103235253);
                if (lVar2 == null) {
                    objG5 = interfaceC1734nR.g();
                    if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                        objG5 = p250z.k.a();
                        interfaceC1734nR.K(objG5);
                    }
                    lVar3 = (p250z.l) objG5;
                } else {
                    lVar3 = lVar2;
                }
                interfaceC1734nR.J();
                lVar4 = lVar2;
                p031d0.a aVarE1115 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                interfaceC1734nR.T(-103209106);
                if (pVar3 == null) {
                    aVarE = null;
                } else {
                    aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                }
                interfaceC1734nR.J();
                objG = interfaceC1734nR.g();
                aVar2 = V.InterfaceC1734n.f14931a;
                if (objG == aVar2.a()) {
                    objG = V.AbstractC1730l1.a(0);
                    interfaceC1734nR.K(objG);
                }
                interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                androidx.compose.ui.d dVar16 = dVar3;
                p237x7.p pVar16 = pVar3;
                boolean z117 = z12;
                androidx.compose.ui.d dVarA113 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                objG2 = interfaceC1734nR.g();
                if (objG2 == aVar2.a()) {
                    objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                    interfaceC1734nR.K(objG2);
                }
                androidx.compose.ui.d dVarA114 = androidx.compose.ui.layout.e.a(dVarA113, (p237x7.l) objG2);
                D0.I iH12 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF12 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE12 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA114);
                F0.InterfaceC0919g.a aVar14 = F0.InterfaceC0919g.f2641a;
                aVarA = aVar14.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH12, aVar14.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF12, aVar14.e());
                pVarB = aVar14.b();
                if (interfaceC1734nA.o()) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                } else {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE12, aVar14.d());
                androidx.compose.foundation.layout.f fVar12 = androidx.compose.foundation.layout.f.f19260a;
                if (z6) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                Y0.e eVar12 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                jA = p131n0.h.a((b(interfaceC1745s0) - eVar12.S0(U.r.f14130a.e())) / 2, eVar12.B0(f11839f));
                p087i7.M m110 = p087i7.M.f46721a;
                zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                objG3 = interfaceC1734nR.g();
                if (zS) {
                    objG3 = new T.t(lVar3, jA, null);
                    interfaceC1734nR.K(objG3);
                } else {
                    objG3 = new T.t(lVar3, jA, null);
                    interfaceC1734nR.K(objG3);
                }
                p031d0.a aVarE1116 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                p031d0.a aVarE1117 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                zS2 = interfaceC1734nR.S(g1D);
                objG4 = interfaceC1734nR.g();
                if (zS2) {
                    objG4 = new S.AbstractC1586w0.b(g1D);
                    interfaceC1734nR.K(objG4);
                } else {
                    objG4 = new S.AbstractC1586w0.b(g1D);
                    interfaceC1734nR.K(objG4);
                }
                d(aVarE1116, aVarE1117, aVarE1115, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                c1582u1 = c1582u0A;
                z14 = z13;
                dVar4 = dVar16;
                pVar4 = pVar16;
                z15 = z117;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1586w0.e(l6, z6, aVar, pVar, dVar4, z15, pVar4, z14, c1582u1, lVar4, i6, i10));
            }
        }
        i11 |= 3072;
        i13 = i10 & 8;
        if (i13 != 0) {
            if ((i6 & 24576) == 0) {
                dVar2 = dVar;
                if (interfaceC1734nR.S(dVar2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i11 |= i14;
            }
            i15 = 16 & i10;
            if (i15 != 0) {
                i11 |= 196608;
                z12 = z10;
            } else {
                z12 = z10;
                if ((i6 & 196608) == 0) {
                    if (interfaceC1734nR.d(z12)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i11 |= i16;
                }
            }
            i17 = 32 & i10;
            if (i17 != 0) {
                i11 |= 1572864;
                pVar3 = pVar2;
            } else {
                pVar3 = pVar2;
                if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(pVar3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
            }
            i19 = i10 & 64;
            if (i19 != 0) {
                i11 |= 12582912;
                z13 = z11;
            } else {
                z13 = z11;
                if ((i6 & 12582912) == 0) {
                    if (interfaceC1734nR.d(z13)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i11 |= i20;
                }
            }
            if ((i6 & 100663296) != 0) {
                i11 |= ((i10 & 128) == 0 || !interfaceC1734nR.S(c1582u0)) ? 33554432 : 67108864;
            }
            i21 = 256 & i10;
            if (i21 != 0) {
                i11 |= 805306368;
            } else if ((i6 & 805306368) == 0) {
                if (interfaceC1734nR.S(lVar)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i11 |= i22;
            }
            if ((i11 & 306783379) == 306783378) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if ((128 & i10) != 0) {
                        c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                        i11 &= -234881025;
                    } else {
                        c1582u0A = c1582u0;
                    }
                    if (i21 != 0) {
                        i23 = i11;
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                        i23 = i11;
                    }
                } else {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if ((128 & i10) != 0) {
                        c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                        i11 &= -234881025;
                    } else {
                        c1582u0A = c1582u0;
                    }
                    if (i21 != 0) {
                        i23 = i11;
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                        i23 = i11;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                }
                interfaceC1734nR.T(-103235253);
                if (lVar2 == null) {
                    objG5 = interfaceC1734nR.g();
                    if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                        objG5 = p250z.k.a();
                        interfaceC1734nR.K(objG5);
                    }
                    lVar3 = (p250z.l) objG5;
                } else {
                    lVar3 = lVar2;
                }
                interfaceC1734nR.J();
                lVar4 = lVar2;
                p031d0.a aVarE1118 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                interfaceC1734nR.T(-103209106);
                if (pVar3 == null) {
                    aVarE = null;
                } else {
                    aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                }
                interfaceC1734nR.J();
                objG = interfaceC1734nR.g();
                aVar2 = V.InterfaceC1734n.f14931a;
                if (objG == aVar2.a()) {
                    objG = V.AbstractC1730l1.a(0);
                    interfaceC1734nR.K(objG);
                }
                interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                androidx.compose.ui.d dVar17 = dVar3;
                p237x7.p pVar17 = pVar3;
                boolean z118 = z12;
                androidx.compose.ui.d dVarA115 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                objG2 = interfaceC1734nR.g();
                if (objG2 == aVar2.a()) {
                    objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                    interfaceC1734nR.K(objG2);
                }
                androidx.compose.ui.d dVarA116 = androidx.compose.ui.layout.e.a(dVarA115, (p237x7.l) objG2);
                D0.I iH13 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF13 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE13 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA116);
                F0.InterfaceC0919g.a aVar15 = F0.InterfaceC0919g.f2641a;
                aVarA = aVar15.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH13, aVar15.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF13, aVar15.e());
                pVarB = aVar15.b();
                if (interfaceC1734nA.o()) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                } else {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE13, aVar15.d());
                androidx.compose.foundation.layout.f fVar13 = androidx.compose.foundation.layout.f.f19260a;
                if (z6) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                Y0.e eVar13 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                jA = p131n0.h.a((b(interfaceC1745s0) - eVar13.S0(U.r.f14130a.e())) / 2, eVar13.B0(f11839f));
                p087i7.M m111 = p087i7.M.f46721a;
                zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                objG3 = interfaceC1734nR.g();
                if (zS) {
                    objG3 = new T.t(lVar3, jA, null);
                    interfaceC1734nR.K(objG3);
                } else {
                    objG3 = new T.t(lVar3, jA, null);
                    interfaceC1734nR.K(objG3);
                }
                p031d0.a aVarE1119 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                p031d0.a aVarE11110 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                zS2 = interfaceC1734nR.S(g1D);
                objG4 = interfaceC1734nR.g();
                if (zS2) {
                    objG4 = new S.AbstractC1586w0.b(g1D);
                    interfaceC1734nR.K(objG4);
                } else {
                    objG4 = new S.AbstractC1586w0.b(g1D);
                    interfaceC1734nR.K(objG4);
                }
                d(aVarE1119, aVarE11110, aVarE1118, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                c1582u1 = c1582u0A;
                z14 = z13;
                dVar4 = dVar17;
                pVar4 = pVar17;
                z15 = z118;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if ((128 & i10) != 0) {
                        c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                        i11 &= -234881025;
                    } else {
                        c1582u0A = c1582u0;
                    }
                    if (i21 != 0) {
                        i23 = i11;
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                        i23 = i11;
                    }
                } else {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if ((128 & i10) != 0) {
                        c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                        i11 &= -234881025;
                    } else {
                        c1582u0A = c1582u0;
                    }
                    if (i21 != 0) {
                        i23 = i11;
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                        i23 = i11;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
                }
                interfaceC1734nR.T(-103235253);
                if (lVar2 == null) {
                    objG5 = interfaceC1734nR.g();
                    if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                        objG5 = p250z.k.a();
                        interfaceC1734nR.K(objG5);
                    }
                    lVar3 = (p250z.l) objG5;
                } else {
                    lVar3 = lVar2;
                }
                interfaceC1734nR.J();
                lVar4 = lVar2;
                p031d0.a aVarE11111 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
                interfaceC1734nR.T(-103209106);
                if (pVar3 == null) {
                    aVarE = null;
                } else {
                    aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
                }
                interfaceC1734nR.J();
                objG = interfaceC1734nR.g();
                aVar2 = V.InterfaceC1734n.f14931a;
                if (objG == aVar2.a()) {
                    objG = V.AbstractC1730l1.a(0);
                    interfaceC1734nR.K(objG);
                }
                interfaceC1745s0 = (V.InterfaceC1745s0) objG;
                androidx.compose.ui.d dVar18 = dVar3;
                p237x7.p pVar18 = pVar3;
                boolean z119 = z12;
                androidx.compose.ui.d dVarA117 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
                objG2 = interfaceC1734nR.g();
                if (objG2 == aVar2.a()) {
                    objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                    interfaceC1734nR.K(objG2);
                }
                androidx.compose.ui.d dVarA118 = androidx.compose.ui.layout.e.a(dVarA117, (p237x7.l) objG2);
                D0.I iH14 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF14 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE14 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA118);
                F0.InterfaceC0919g.a aVar16 = F0.InterfaceC0919g.f2641a;
                aVarA = aVar16.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH14, aVar16.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF14, aVar16.e());
                pVarB = aVar16.b();
                if (interfaceC1734nA.o()) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                } else {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE14, aVar16.d());
                androidx.compose.foundation.layout.f fVar14 = androidx.compose.foundation.layout.f.f19260a;
                if (z6) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
                Y0.e eVar14 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                jA = p131n0.h.a((b(interfaceC1745s0) - eVar14.S0(U.r.f14130a.e())) / 2, eVar14.B0(f11839f));
                p087i7.M m112 = p087i7.M.f46721a;
                zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
                objG3 = interfaceC1734nR.g();
                if (zS) {
                    objG3 = new T.t(lVar3, jA, null);
                    interfaceC1734nR.K(objG3);
                } else {
                    objG3 = new T.t(lVar3, jA, null);
                    interfaceC1734nR.K(objG3);
                }
                p031d0.a aVarE11112 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
                p031d0.a aVarE11113 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
                zS2 = interfaceC1734nR.S(g1D);
                objG4 = interfaceC1734nR.g();
                if (zS2) {
                    objG4 = new S.AbstractC1586w0.b(g1D);
                    interfaceC1734nR.K(objG4);
                } else {
                    objG4 = new S.AbstractC1586w0.b(g1D);
                    interfaceC1734nR.K(objG4);
                }
                d(aVarE11112, aVarE11113, aVarE11111, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                c1582u1 = c1582u0A;
                z14 = z13;
                dVar4 = dVar18;
                pVar4 = pVar18;
                z15 = z119;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1586w0.e(l6, z6, aVar, pVar, dVar4, z15, pVar4, z14, c1582u1, lVar4, i6, i10));
            }
        }
        i11 |= 24576;
        dVar2 = dVar;
        i15 = 16 & i10;
        if (i15 != 0) {
            i11 |= 196608;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i6 & 196608) == 0) {
                if (interfaceC1734nR.d(z12)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i11 |= i16;
            }
        }
        i17 = 32 & i10;
        if (i17 != 0) {
            i11 |= 1572864;
            pVar3 = pVar2;
        } else {
            pVar3 = pVar2;
            if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.l(pVar3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i11 |= i18;
            }
        }
        i19 = i10 & 64;
        if (i19 != 0) {
            i11 |= 12582912;
            z13 = z11;
        } else {
            z13 = z11;
            if ((i6 & 12582912) == 0) {
                if (interfaceC1734nR.d(z13)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i11 |= i20;
            }
        }
        if ((i6 & 100663296) != 0) {
            i11 |= ((i10 & 128) == 0 || !interfaceC1734nR.S(c1582u0)) ? 33554432 : 67108864;
        }
        i21 = 256 & i10;
        if (i21 != 0) {
            i11 |= 805306368;
        } else if ((i6 & 805306368) == 0) {
            if (interfaceC1734nR.S(lVar)) {
                i22 = 536870912;
            } else {
                i22 = 268435456;
            }
            i11 |= i22;
        }
        if ((i11 & 306783379) == 306783378) {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i13 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar;
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if (i17 != 0) {
                    pVar3 = null;
                }
                if (i19 != 0) {
                    z13 = true;
                }
                if ((128 & i10) != 0) {
                    c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                    i11 &= -234881025;
                } else {
                    c1582u0A = c1582u0;
                }
                if (i21 != 0) {
                    i23 = i11;
                    lVar2 = null;
                } else {
                    lVar2 = lVar;
                    i23 = i11;
                }
            } else {
                if (i13 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar;
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if (i17 != 0) {
                    pVar3 = null;
                }
                if (i19 != 0) {
                    z13 = true;
                }
                if ((128 & i10) != 0) {
                    c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                    i11 &= -234881025;
                } else {
                    c1582u0A = c1582u0;
                }
                if (i21 != 0) {
                    i23 = i11;
                    lVar2 = null;
                } else {
                    lVar2 = lVar;
                    i23 = i11;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
            }
            interfaceC1734nR.T(-103235253);
            if (lVar2 == null) {
                objG5 = interfaceC1734nR.g();
                if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                    objG5 = p250z.k.a();
                    interfaceC1734nR.K(objG5);
                }
                lVar3 = (p250z.l) objG5;
            } else {
                lVar3 = lVar2;
            }
            interfaceC1734nR.J();
            lVar4 = lVar2;
            p031d0.a aVarE11114 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
            interfaceC1734nR.T(-103209106);
            if (pVar3 == null) {
                aVarE = null;
            } else {
                aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
            }
            interfaceC1734nR.J();
            objG = interfaceC1734nR.g();
            aVar2 = V.InterfaceC1734n.f14931a;
            if (objG == aVar2.a()) {
                objG = V.AbstractC1730l1.a(0);
                interfaceC1734nR.K(objG);
            }
            interfaceC1745s0 = (V.InterfaceC1745s0) objG;
            androidx.compose.ui.d dVar19 = dVar3;
            p237x7.p pVar19 = pVar3;
            boolean z1110 = z12;
            androidx.compose.ui.d dVarA119 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
            objG2 = interfaceC1734nR.g();
            if (objG2 == aVar2.a()) {
                objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                interfaceC1734nR.K(objG2);
            }
            androidx.compose.ui.d dVarA1110 = androidx.compose.ui.layout.e.a(dVarA119, (p237x7.l) objG2);
            D0.I iH15 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
            iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF15 = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE15 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA1110);
            F0.InterfaceC0919g.a aVar17 = F0.InterfaceC0919g.f2641a;
            aVarA = aVar17.a();
            if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734nR.t();
            if (interfaceC1734nR.o()) {
                interfaceC1734nR.B(aVarA);
            } else {
                interfaceC1734nR.H();
            }
            interfaceC1734nA = V.L1.a(interfaceC1734nR);
            V.L1.c(interfaceC1734nA, iH15, aVar17.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF15, aVar17.e());
            pVarB = aVar17.b();
            if (interfaceC1734nA.o()) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            } else {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE15, aVar17.d());
            androidx.compose.foundation.layout.f fVar15 = androidx.compose.foundation.layout.f.f19260a;
            if (z6) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
            Y0.e eVar15 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
            jA = p131n0.h.a((b(interfaceC1745s0) - eVar15.S0(U.r.f14130a.e())) / 2, eVar15.B0(f11839f));
            p087i7.M m113 = p087i7.M.f46721a;
            zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
            objG3 = interfaceC1734nR.g();
            if (zS) {
                objG3 = new T.t(lVar3, jA, null);
                interfaceC1734nR.K(objG3);
            } else {
                objG3 = new T.t(lVar3, jA, null);
                interfaceC1734nR.K(objG3);
            }
            p031d0.a aVarE11115 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
            p031d0.a aVarE11116 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
            zS2 = interfaceC1734nR.S(g1D);
            objG4 = interfaceC1734nR.g();
            if (zS2) {
                objG4 = new S.AbstractC1586w0.b(g1D);
                interfaceC1734nR.K(objG4);
            } else {
                objG4 = new S.AbstractC1586w0.b(g1D);
                interfaceC1734nR.K(objG4);
            }
            d(aVarE11115, aVarE11116, aVarE11114, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            c1582u1 = c1582u0A;
            z14 = z13;
            dVar4 = dVar19;
            pVar4 = pVar19;
            z15 = z1110;
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i13 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar;
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if (i17 != 0) {
                    pVar3 = null;
                }
                if (i19 != 0) {
                    z13 = true;
                }
                if ((128 & i10) != 0) {
                    c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                    i11 &= -234881025;
                } else {
                    c1582u0A = c1582u0;
                }
                if (i21 != 0) {
                    i23 = i11;
                    lVar2 = null;
                } else {
                    lVar2 = lVar;
                    i23 = i11;
                }
            } else {
                if (i13 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar;
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if (i17 != 0) {
                    pVar3 = null;
                }
                if (i19 != 0) {
                    z13 = true;
                }
                if ((128 & i10) != 0) {
                    c1582u0A = S.C1584v0.f11832a.a(interfaceC1734nR, 6);
                    i11 &= -234881025;
                } else {
                    c1582u0A = c1582u0;
                }
                if (i21 != 0) {
                    i23 = i11;
                    lVar2 = null;
                } else {
                    lVar2 = lVar;
                    i23 = i11;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-663510974, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
            }
            interfaceC1734nR.T(-103235253);
            if (lVar2 == null) {
                objG5 = interfaceC1734nR.g();
                if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                    objG5 = p250z.k.a();
                    interfaceC1734nR.K(objG5);
                }
                lVar3 = (p250z.l) objG5;
            } else {
                lVar3 = lVar2;
            }
            interfaceC1734nR.J();
            lVar4 = lVar2;
            p031d0.a aVarE11117 = p031d0.c.e(-1419576100, true, new S.AbstractC1586w0.f(c1582u0A, z6, z12, pVar3, z13, pVar), interfaceC1734nR, 54);
            interfaceC1734nR.T(-103209106);
            if (pVar3 == null) {
                aVarE = null;
            } else {
                aVarE = p031d0.c.e(1644987592, true, new S.AbstractC1586w0.g(c1582u0A, z6, z12, pVar3), interfaceC1734nR, 54);
            }
            interfaceC1734nR.J();
            objG = interfaceC1734nR.g();
            aVar2 = V.InterfaceC1734n.f14931a;
            if (objG == aVar2.a()) {
                objG = V.AbstractC1730l1.a(0);
                interfaceC1734nR.K(objG);
            }
            interfaceC1745s0 = (V.InterfaceC1745s0) objG;
            androidx.compose.ui.d dVar110 = dVar3;
            p237x7.p pVar110 = pVar3;
            boolean z1111 = z12;
            androidx.compose.ui.d dVarA1111 = A.K.a(l6, androidx.compose.foundation.layout.p.b(androidx.compose.foundation.selection.a.a(dVar3, z6, lVar3, null, z12, K0.h.h(K0.h.f5956b.g()), aVar), 0.0f, f11834a, 1, null), 1.0f, false, 2, null);
            objG2 = interfaceC1734nR.g();
            if (objG2 == aVar2.a()) {
                objG2 = new S.AbstractC1586w0.a(interfaceC1745s0);
                interfaceC1734nR.K(objG2);
            }
            androidx.compose.ui.d dVarA1112 = androidx.compose.ui.layout.e.a(dVarA1111, (p237x7.l) objG2);
            D0.I iH16 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.e(), true);
            iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF16 = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE16 = androidx.compose.ui.c.e(interfaceC1734nR, dVarA1112);
            F0.InterfaceC0919g.a aVar18 = F0.InterfaceC0919g.f2641a;
            aVarA = aVar18.a();
            if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734nR.t();
            if (interfaceC1734nR.o()) {
                interfaceC1734nR.B(aVarA);
            } else {
                interfaceC1734nR.H();
            }
            interfaceC1734nA = V.L1.a(interfaceC1734nR);
            V.L1.c(interfaceC1734nA, iH16, aVar18.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF16, aVar18.e());
            pVarB = aVar18.b();
            if (interfaceC1734nA.o()) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            } else {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE16, aVar18.d());
            androidx.compose.foundation.layout.f fVar16 = androidx.compose.foundation.layout.f.f19260a;
            if (z6) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            g1D = p200u.AbstractC7161c.d(f6, p200u.AbstractC7177k.l(100, 0, null, 6, null), 0.0f, null, null, interfaceC1734nR, 48, 28);
            Y0.e eVar16 = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
            jA = p131n0.h.a((b(interfaceC1745s0) - eVar16.S0(U.r.f14130a.e())) / 2, eVar16.B0(f11839f));
            p087i7.M m114 = p087i7.M.f46721a;
            zS = interfaceC1734nR.S(lVar3) | interfaceC1734nR.j(jA);
            objG3 = interfaceC1734nR.g();
            if (zS) {
                objG3 = new T.t(lVar3, jA, null);
                interfaceC1734nR.K(objG3);
            } else {
                objG3 = new T.t(lVar3, jA, null);
                interfaceC1734nR.K(objG3);
            }
            p031d0.a aVarE11118 = p031d0.c.e(691730997, true, new S.AbstractC1586w0.d((T.t) objG3), interfaceC1734nR, 54);
            p031d0.a aVarE11119 = p031d0.c.e(-474426875, true, new S.AbstractC1586w0.c(g1D, c1582u0A), interfaceC1734nR, 54);
            zS2 = interfaceC1734nR.S(g1D);
            objG4 = interfaceC1734nR.g();
            if (zS2) {
                objG4 = new S.AbstractC1586w0.b(g1D);
                interfaceC1734nR.K(objG4);
            } else {
                objG4 = new S.AbstractC1586w0.b(g1D);
                interfaceC1734nR.K(objG4);
            }
            d(aVarE11118, aVarE11119, aVarE11117, aVarE, z13, (p237x7.a) objG4, interfaceC1734nR, ((i23 >> 9) & 57344) | 438);
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            c1582u1 = c1582u0A;
            z14 = z13;
            dVar4 = dVar110;
            pVar4 = pVar110;
            z15 = z1111;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1586w0.e(l6, z6, aVar, pVar, dVar4, z15, pVar4, z14, c1582u1, lVar4, i6, i10));
        }
    }

    private static final int b(V.InterfaceC1745s0 interfaceC1745s0) {
        return interfaceC1745s0.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(V.InterfaceC1745s0 interfaceC1745s0, int i6) {
        interfaceC1745s0.i(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(p237x7.p pVar, p237x7.p pVar2, p237x7.p pVar3, p237x7.p pVar4, boolean z6, p237x7.a aVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        int i11;
        boolean z10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1427075886);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.l(pVar) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.l(pVar2) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.l(pVar3) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i10 |= interfaceC1734nR.l(pVar4) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i10 |= interfaceC1734nR.d(z6) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i10 |= interfaceC1734nR.l(aVar) ? 131072 : 65536;
        }
        if ((74899 & i10) == 74898 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1427075886, i10, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:516)");
            }
            int i12 = 458752 & i10;
            int i13 = 57344 & i10;
            boolean z11 = (i12 == 131072) | ((i10 & 7168) == 2048) | (i13 == 16384);
            java.lang.Object objG = interfaceC1734nR.g();
            if (z11 || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new S.AbstractC1586w0.i(aVar, pVar4, z6);
                interfaceC1734nR.K(objG);
            }
            D0.I i14 = (D0.I) objG;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.f19586a;
            int iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734nR, aVar2);
            F0.InterfaceC0919g.a aVar3 = F0.InterfaceC0919g.f2641a;
            p237x7.a aVarA = aVar3.a();
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
            V.L1.c(interfaceC1734nA, i14, aVar3.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar3.e());
            p237x7.p pVarB = aVar3.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar3.d());
            pVar.u(interfaceC1734nR, java.lang.Integer.valueOf(i10 & 14));
            pVar2.u(interfaceC1734nR, java.lang.Integer.valueOf((i10 >> 3) & 14));
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(aVar2, "icon");
            h0.c.a aVar4 = p071h0.c.f45778a;
            D0.I iH = androidx.compose.foundation.layout.d.h(aVar4.o(), false);
            int iA2 = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF2 = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(interfaceC1734nR, dVarB);
            p237x7.a aVarA2 = aVar3.a();
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
            V.L1.c(interfaceC1734nA2, iH, aVar3.c());
            V.L1.c(interfaceC1734nA2, interfaceC1758zF2, aVar3.e());
            p237x7.p pVarB2 = aVar3.b();
            if (interfaceC1734nA2.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA2.g(), java.lang.Integer.valueOf(iA2))) {
                interfaceC1734nA2.K(java.lang.Integer.valueOf(iA2));
                interfaceC1734nA2.D(java.lang.Integer.valueOf(iA2), pVarB2);
            }
            V.L1.c(interfaceC1734nA2, dVarE2, aVar3.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f19260a;
            pVar3.u(interfaceC1734nR, java.lang.Integer.valueOf((i10 >> 6) & 14));
            interfaceC1734nR.Q();
            interfaceC1734nR.T(1087198243);
            if (pVar4 != null) {
                androidx.compose.ui.d dVarB2 = androidx.compose.ui.layout.a.b(aVar2, "label");
                if (i13 == 16384) {
                    i11 = 131072;
                    z10 = true;
                } else {
                    i11 = 131072;
                    z10 = false;
                }
                boolean z12 = z10 | (i12 == i11);
                java.lang.Object objG2 = interfaceC1734nR.g();
                if (z12 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                    objG2 = new S.AbstractC1586w0.h(z6, aVar);
                    interfaceC1734nR.K(objG2);
                }
                androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.m.k(androidx.compose.ui.graphics.b.a(dVarB2, (p237x7.l) objG2), Y0.i.q(f11835b / 2), 0.0f, 2, null);
                D0.I iH2 = androidx.compose.foundation.layout.d.h(aVar4.o(), false);
                int iA3 = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF3 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(interfaceC1734nR, dVarK);
                p237x7.a aVarA3 = aVar3.a();
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
                V.L1.c(interfaceC1734nA3, iH2, aVar3.c());
                V.L1.c(interfaceC1734nA3, interfaceC1758zF3, aVar3.e());
                p237x7.p pVarB3 = aVar3.b();
                if (interfaceC1734nA3.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA3.g(), java.lang.Integer.valueOf(iA3))) {
                    interfaceC1734nA3.K(java.lang.Integer.valueOf(iA3));
                    interfaceC1734nA3.D(java.lang.Integer.valueOf(iA3), pVarB3);
                }
                V.L1.c(interfaceC1734nA3, dVarE3, aVar3.d());
                pVar4.u(interfaceC1734nR, java.lang.Integer.valueOf((i10 >> 9) & 14));
                interfaceC1734nR.Q();
            }
            interfaceC1734nR.J();
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1586w0.j(pVar, pVar2, pVar3, pVar4, z6, aVar, i6));
        }
    }

    public static final float j() {
        return f11838e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D0.K k(D0.M m6, D0.X x6, D0.X x10, D0.X x11, long j6) {
        int iL = Y0.C1859b.l(j6);
        int iH = Y0.c.h(j6, m6.S0(f11834a));
        return D0.L.b(m6, iL, iH, null, new S.AbstractC1586w0.k(x11, x6, (iL - x6.I0()) / 2, (iH - x6.w0()) / 2, x10, (iL - x10.I0()) / 2, (iH - x10.w0()) / 2, iL, iH), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D0.K l(D0.M m6, D0.X x6, D0.X x10, D0.X x11, D0.X x12, long j6, boolean z6, float f6) {
        float fW0 = x10.w0();
        float f10 = f11838e;
        float fB0 = fW0 + m6.B0(f10);
        float f11 = f11836c;
        float fB1 = fB0 + m6.B0(f11) + x6.w0();
        float f12 = 2;
        float fC = E7.j.c((Y0.C1859b.m(j6) - fB1) / f12, m6.B0(f10));
        float f13 = fB1 + (fC * f12);
        float fW1 = ((z6 ? fC : (f13 - x10.w0()) / f12) - fC) * (1 - f6);
        float fW2 = x10.w0() + fC + m6.B0(f10) + m6.B0(f11);
        int iL = Y0.C1859b.l(j6);
        return D0.L.b(m6, iL, A7.a.d(f13), null, new S.AbstractC1586w0.l(x12, z6, f6, x6, (iL - x6.I0()) / 2, fW2, fW1, x10, (iL - x10.I0()) / 2, fC, x11, (iL - x11.I0()) / 2, fC - m6.B0(f10), iL, m6), 4, null);
    }
}
