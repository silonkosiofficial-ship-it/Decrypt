package N;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p200u.C7185o f7499a = new p200u.C7185o(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p200u.x0 f7500b = p200u.z0.a(N.y.a.f7503D, N.y.b.f7504D);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f7501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p200u.C7180l0 f7502d;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final N.y.a f7503D = new N.y.a();

        a() {
            super(1);
        }

        public final p200u.C7185o a(long j6) {
            return p131n0.h.c(j6) ? new p200u.C7185o(p131n0.g.m(j6), p131n0.g.n(j6)) : N.y.f7499a;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((p131n0.g) obj).v());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final N.y.b f7504D = new N.y.b();

        b() {
            super(1);
        }

        public final long a(p200u.C7185o c7185o) {
            return p131n0.h.a(c7185o.f(), c7185o.g());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return p131n0.g.d(a((p200u.C7185o) obj));
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.a f7505D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f7506E;

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.G1 f7507D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V.G1 g6) {
                super(0);
                this.f7507D = g6;
            }

            public final long a() {
                return N.y.c.f(this.f7507D);
            }

            @Override // p237x7.a
            public /* bridge */ /* synthetic */ java.lang.Object b() {
                return p131n0.g.d(a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p237x7.a aVar, p237x7.l lVar) {
            super(3);
            this.f7505D = aVar;
            this.f7506E = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long f(V.G1 g6) {
            return ((p131n0.g) g6.getValue()).v();
        }

        public final androidx.compose.ui.d e(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(759876635);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(759876635, i6, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
            }
            V.G1 g1F = N.y.f(this.f7505D, interfaceC1734n, 0);
            p237x7.l lVar = this.f7506E;
            boolean zS = interfaceC1734n.S(g1F);
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new N.y.c.a(g1F);
                interfaceC1734n.K(objG);
            }
            androidx.compose.ui.d dVar2 = (androidx.compose.ui.d) lVar.l((p237x7.a) objG);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVar2;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return e((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f7508G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f7509H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ V.G1 f7510I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p200u.C7157a f7511J;

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.G1 f7512D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V.G1 g6) {
                super(0);
                this.f7512D = g6;
            }

            public final long a() {
                return N.y.g(this.f7512D);
            }

            @Override // p237x7.a
            public /* bridge */ /* synthetic */ java.lang.Object b() {
                return p131n0.g.d(a());
            }
        }

        static final class b implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p200u.C7157a f7513C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ W8.N f7514D;

            static final class a extends p147o7.l implements p237x7.p {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f7515G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ p200u.C7157a f7516H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                final /* synthetic */ long f7517I;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(p200u.C7157a c7157a, long j6, p127m7.e eVar) {
                    super(2, eVar);
                    this.f7516H = c7157a;
                    this.f7517I = j6;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f7515G;
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        p200u.C7157a c7157a = this.f7516H;
                        p131n0.g gVarD = p131n0.g.d(this.f7517I);
                        p200u.C7180l0 c7180l0E = N.y.e();
                        this.f7515G = 1;
                        if (p200u.C7157a.f(c7157a, gVarD, c7180l0E, null, null, this, 12, null) == objG) {
                            return objG;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    return p087i7.M.f46721a;
                }

                @Override // p237x7.p
                /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                    return ((N.y.d.b.a) x(n6, eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                    return new N.y.d.b.a(this.f7516H, this.f7517I, eVar);
                }
            }

            b(p200u.C7157a c7157a, W8.N n6) {
                this.f7513C = c7157a;
                this.f7514D = n6;
            }

            @Override // Z8.InterfaceC1870g
            public /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                return b(((p131n0.g) obj).v(), eVar);
            }

            public final java.lang.Object b(long j6, p127m7.e eVar) {
                if (p131n0.h.c(((p131n0.g) this.f7513C.m()).v()) && p131n0.h.c(j6) && p131n0.g.n(((p131n0.g) this.f7513C.m()).v()) != p131n0.g.n(j6)) {
                    W8.AbstractC1788i.d(this.f7514D, null, null, new N.y.d.b.a(this.f7513C, j6, null), 3, null);
                    return p087i7.M.f46721a;
                }
                java.lang.Object objS = this.f7513C.s(p131n0.g.d(j6), eVar);
                return objS == p137n7.b.g() ? objS : p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(V.G1 g6, p200u.C7157a c7157a, p127m7.e eVar) {
            super(2, eVar);
            this.f7510I = g6;
            this.f7511J = c7157a;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f7508G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                W8.N n6 = (W8.N) this.f7509H;
                Z8.InterfaceC1869f interfaceC1869fO = V.v1.o(new N.y.d.a(this.f7510I));
                N.y.d.b bVar = new N.y.d.b(this.f7511J, n6);
                this.f7508G = 1;
                if (interfaceC1869fO.b(bVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((N.y.d) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            N.y.d dVar = new N.y.d(this.f7510I, this.f7511J, eVar);
            dVar.f7509H = obj;
            return dVar;
        }
    }

    static {
        long jA = p131n0.h.a(0.01f, 0.01f);
        f7501c = jA;
        f7502d = new p200u.C7180l0(0.0f, 0.0f, p131n0.g.d(jA), 3, null);
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar, p237x7.a aVar, p237x7.l lVar) {
        return androidx.compose.ui.c.c(dVar, null, new N.y.c(aVar, lVar), 1, null);
    }

    public static final p200u.C7180l0 e() {
        return f7502d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V.G1 f(p237x7.a aVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1589795249, i6, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        V.InterfaceC1734n.a aVar2 = V.InterfaceC1734n.f14931a;
        if (objG == aVar2.a()) {
            objG = V.v1.e(aVar);
            interfaceC1734n.K(objG);
        }
        V.G1 g6 = (V.G1) objG;
        java.lang.Object objG2 = interfaceC1734n.g();
        if (objG2 == aVar2.a()) {
            objG2 = new p200u.C7157a(p131n0.g.d(g(g6)), f7500b, p131n0.g.d(f7501c), null, 8, null);
            interfaceC1734n.K(objG2);
        }
        p200u.C7157a c7157a = (p200u.C7157a) objG2;
        p087i7.M m6 = p087i7.M.f46721a;
        boolean zL = interfaceC1734n.l(c7157a);
        java.lang.Object objG3 = interfaceC1734n.g();
        if (zL || objG3 == aVar2.a()) {
            objG3 = new N.y.d(g6, c7157a, null);
            interfaceC1734n.K(objG3);
        }
        V.Q.e(m6, (p237x7.p) objG3, interfaceC1734n, 6);
        V.G1 g1G = c7157a.g();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(V.G1 g6) {
        return ((p131n0.g) g6.getValue()).v();
    }
}
