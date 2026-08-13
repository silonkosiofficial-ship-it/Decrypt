package S;

/* JADX INFO: renamed from: S.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1578s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f11699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f11700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f11701c = Y0.i.q(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f11702d = Y0.i.q(8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f11703e = Y0.i.q(112);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f11704f = Y0.i.q(280);

    /* JADX INFO: renamed from: S.s0$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f11705D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p200u.Z f11706E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f11707F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ V.G1 f11708G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ V.G1 f11709H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z6, p200u.Z z10, V.InterfaceC1753w0 interfaceC1753w0, V.G1 g6, V.G1 g10) {
            super(1);
            this.f11705D = z6;
            this.f11706E = z10;
            this.f11707F = interfaceC1753w0;
            this.f11708G = g6;
            this.f11709H = g10;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            float fB;
            float fB2 = 0.8f;
            float fC = 1.0f;
            if (this.f11705D) {
                fB = ((java.lang.Boolean) this.f11706E.b()).booleanValue() ? 1.0f : 0.8f;
            } else {
                fB = S.AbstractC1578s0.b(this.f11708G);
            }
            cVar.h(fB);
            if (!this.f11705D) {
                fB2 = S.AbstractC1578s0.b(this.f11708G);
            } else if (((java.lang.Boolean) this.f11706E.b()).booleanValue()) {
                fB2 = 1.0f;
            }
            cVar.g(fB2);
            if (!this.f11705D) {
                fC = S.AbstractC1578s0.c(this.f11709H);
            } else if (!((java.lang.Boolean) this.f11706E.b()).booleanValue()) {
                fC = 0.0f;
            }
            cVar.b(fC);
            cVar.T0(((androidx.compose.ui.graphics.f) this.f11707F.getValue()).j());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.s0$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11710D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.m f11711E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.q f11712F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar, androidx.compose.foundation.m mVar, p237x7.q qVar) {
            super(2);
            this.f11710D = dVar;
            this.f11711E = mVar;
            this.f11712F = qVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1573559053, i6, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:429)");
            }
            androidx.compose.ui.d dVarD = androidx.compose.foundation.k.d(androidx.compose.foundation.layout.h.a(androidx.compose.foundation.layout.m.k(this.f11710D, 0.0f, S.AbstractC1578s0.i(), 1, null), A.y.Max), this.f11711E, false, null, false, 14, null);
            p237x7.q qVar = this.f11712F;
            D0.I iA = A.AbstractC0775i.a(A.C0768b.f80a.g(), p071h0.c.f45778a.k(), interfaceC1734n, 0);
            int iA2 = V.AbstractC1725k.a(interfaceC1734n, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, dVarD);
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
            V.L1.c(interfaceC1734nA, iA, aVar.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar.e());
            p237x7.p pVarB = aVar.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA2))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA2));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA2), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar.d());
            qVar.j(A.C0778l.f127a, interfaceC1734n, 6);
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

    /* JADX INFO: renamed from: S.s0$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11713D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p200u.Z f11714E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f11715F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.m f11716G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p141o0.e2 f11717H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f11718I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ float f11719J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ float f11720K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p210v.C7213g f11721L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ p237x7.q f11722M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ int f11723N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.d dVar, p200u.Z z6, V.InterfaceC1753w0 interfaceC1753w0, androidx.compose.foundation.m mVar, p141o0.e2 e2Var, long j6, float f6, float f10, p210v.C7213g c7213g, p237x7.q qVar, int i6) {
            super(2);
            this.f11713D = dVar;
            this.f11714E = z6;
            this.f11715F = interfaceC1753w0;
            this.f11716G = mVar;
            this.f11717H = e2Var;
            this.f11718I = j6;
            this.f11719J = f6;
            this.f11720K = f10;
            this.f11721L = c7213g;
            this.f11722M = qVar;
            this.f11723N = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1578s0.a(this.f11713D, this.f11714E, this.f11715F, this.f11716G, this.f11717H, this.f11718I, this.f11719J, this.f11720K, this.f11721L, this.f11722M, interfaceC1734n, V.S0.a(this.f11723N | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.s0$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.AbstractC1578s0.d f11724D = new S.AbstractC1578s0.d();

        d() {
            super(3);
        }

        public final p200u.I a(u.s0.b bVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(-1355418157);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1355418157, i6, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:396)");
            }
            p200u.w0 w0VarL = p200u.AbstractC7177k.l(bVar.c(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE) ? 30 : 75, 0, null, 6, null);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return w0VarL;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((u.s0.b) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: S.s0$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.AbstractC1578s0.e f11725D = new S.AbstractC1578s0.e();

        e() {
            super(3);
        }

        public final p200u.I a(u.s0.b bVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(1033023423);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1033023423, i6, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:381)");
            }
            p200u.w0 w0VarL = bVar.c(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE) ? p200u.AbstractC7177k.l(120, 0, p200u.H.f(), 2, null) : p200u.AbstractC7177k.l(1, 74, null, 4, null);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return w0VarL;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((u.s0.b) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: S.s0$f */
    static final class f extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11726D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ S.C1576r0 f11727E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f11728F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11729G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ A.L f11730H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11731I;

        /* JADX INFO: renamed from: S.s0$f$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p237x7.p f11732D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p237x7.p pVar) {
                super(2);
                this.f11732D = pVar;
            }

            public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
                if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                    interfaceC1734n.A();
                    return;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(2035552199, i6, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:477)");
                }
                androidx.compose.ui.d dVarB = androidx.compose.foundation.layout.p.b(androidx.compose.ui.d.f19586a, U.o.f14077a.i(), 0.0f, 2, null);
                p237x7.p pVar = this.f11732D;
                D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
                V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, dVarB);
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
                pVar.u(interfaceC1734n, 0);
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

        /* JADX INFO: renamed from: S.s0$f$b */
        static final class b extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ A.L f11733D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p237x7.p f11734E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p237x7.p f11735F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ p237x7.p f11736G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(A.L l6, p237x7.p pVar, p237x7.p pVar2, p237x7.p pVar3) {
                super(2);
                this.f11733D = l6;
                this.f11734E = pVar;
                this.f11735F = pVar2;
                this.f11736G = pVar3;
            }

            public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
                if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                    interfaceC1734n.A();
                    return;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1728894036, i6, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:483)");
                }
                androidx.compose.ui.d dVarM = androidx.compose.foundation.layout.m.m(A.K.a(this.f11733D, androidx.compose.ui.d.f19586a, 1.0f, false, 2, null), this.f11734E != null ? S.AbstractC1578s0.f11701c : Y0.i.q(0), 0.0f, this.f11735F != null ? S.AbstractC1578s0.f11701c : Y0.i.q(0), 0.0f, 10, null);
                p237x7.p pVar = this.f11736G;
                D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
                V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, dVarM);
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
                pVar.u(interfaceC1734n, 0);
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

        /* JADX INFO: renamed from: S.s0$f$c */
        static final class c extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p237x7.p f11737D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(p237x7.p pVar) {
                super(2);
                this.f11737D = pVar;
            }

            public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
                if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                    interfaceC1734n.A();
                    return;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(580312062, i6, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:507)");
                }
                androidx.compose.ui.d dVarB = androidx.compose.foundation.layout.p.b(androidx.compose.ui.d.f19586a, U.o.f14077a.k(), 0.0f, 2, null);
                p237x7.p pVar = this.f11737D;
                D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
                V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, dVarB);
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
                pVar.u(interfaceC1734n, 0);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p237x7.p pVar, S.C1576r0 c1576r0, boolean z6, p237x7.p pVar2, A.L l6, p237x7.p pVar3) {
            super(2);
            this.f11726D = pVar;
            this.f11727E = c1576r0;
            this.f11728F = z6;
            this.f11729G = pVar2;
            this.f11730H = l6;
            this.f11731I = pVar3;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1065051884, i6, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:473)");
            }
            interfaceC1734n.T(1264683960);
            if (this.f11726D != null) {
                V.AbstractC1756y.a(S.J.a().d(p141o0.C7016y0.i(this.f11727E.a(this.f11728F))), p031d0.c.e(2035552199, true, new S.AbstractC1578s0.f.a(this.f11726D), interfaceC1734n, 54), interfaceC1734n, V.P0.f14698i | 48);
            }
            interfaceC1734n.J();
            V.P0 p0D = S.J.a().d(p141o0.C7016y0.i(this.f11727E.b(this.f11728F)));
            p031d0.a aVarE = p031d0.c.e(-1728894036, true, new S.AbstractC1578s0.f.b(this.f11730H, this.f11726D, this.f11729G, this.f11731I), interfaceC1734n, 54);
            int i10 = V.P0.f14698i;
            V.AbstractC1756y.a(p0D, aVarE, interfaceC1734n, i10 | 48);
            if (this.f11729G != null) {
                V.AbstractC1756y.a(S.J.a().d(p141o0.C7016y0.i(this.f11727E.c(this.f11728F))), p031d0.c.e(580312062, true, new S.AbstractC1578s0.f.c(this.f11729G), interfaceC1734n, 54), interfaceC1734n, i10 | 48);
            }
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

    /* JADX INFO: renamed from: S.s0$g */
    static final class g extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11738D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.a f11739E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11740F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11741G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11742H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f11743I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ S.C1576r0 f11744J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ A.B f11745K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p250z.l f11746L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f11747M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p237x7.p pVar, p237x7.a aVar, androidx.compose.ui.d dVar, p237x7.p pVar2, p237x7.p pVar3, boolean z6, S.C1576r0 c1576r0, A.B b6, p250z.l lVar, int i6) {
            super(2);
            this.f11738D = pVar;
            this.f11739E = aVar;
            this.f11740F = dVar;
            this.f11741G = pVar2;
            this.f11742H = pVar3;
            this.f11743I = z6;
            this.f11744J = c1576r0;
            this.f11745K = b6;
            this.f11746L = lVar;
            this.f11747M = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1578s0.d(this.f11738D, this.f11739E, this.f11740F, this.f11741G, this.f11742H, this.f11743I, this.f11744J, this.f11745K, this.f11746L, interfaceC1734n, V.S0.a(this.f11747M | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static {
        float f6 = 48;
        f11699a = Y0.i.q(f6);
        f11700b = Y0.i.q(f6);
    }

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
    public static final void a(androidx.compose.ui.d dVar, p200u.Z z6, V.InterfaceC1753w0 interfaceC1753w0, androidx.compose.foundation.m mVar, p141o0.e2 e2Var, long j6, float f6, float f10, p210v.C7213g c7213g, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-151448888);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= (i6 & 64) == 0 ? interfaceC1734nR.S(z6) : interfaceC1734nR.l(z6) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.S(interfaceC1753w0) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i10 |= interfaceC1734nR.S(mVar) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i10 |= interfaceC1734nR.S(e2Var) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i10 |= interfaceC1734nR.j(j6) ? 131072 : 65536;
        }
        if ((1572864 & i6) == 0) {
            i10 |= interfaceC1734nR.h(f6) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i10 |= interfaceC1734nR.h(f10) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            i10 |= interfaceC1734nR.S(c7213g) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i10 |= interfaceC1734nR.l(qVar) ? 536870912 : 268435456;
        }
        if ((i10 & 306783379) == 306783378 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-151448888, i10, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:374)");
            }
            p200u.s0 s0VarH = p200u.u0.h(z6, "DropDownMenu", interfaceC1734nR, p200u.Z.f54777d | 48 | ((i10 >> 3) & 14), 0);
            S.AbstractC1578s0.e eVar = S.AbstractC1578s0.e.f11725D;
            p247y7.C7344m c7344m = p247y7.C7344m.f57303a;
            p200u.x0 x0VarI = p200u.z0.i(c7344m);
            boolean zBooleanValue = ((java.lang.Boolean) s0VarH.i()).booleanValue();
            interfaceC1734nR.T(2139028452);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            float f11 = zBooleanValue ? 1.0f : 0.8f;
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            java.lang.Float fValueOf = java.lang.Float.valueOf(f11);
            boolean zBooleanValue2 = ((java.lang.Boolean) s0VarH.p()).booleanValue();
            interfaceC1734nR.T(2139028452);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            float f12 = zBooleanValue2 ? 1.0f : 0.8f;
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            V.G1 g1D = p200u.u0.d(s0VarH, fValueOf, java.lang.Float.valueOf(f12), (p200u.I) eVar.j(s0VarH.n(), interfaceC1734nR, 0), x0VarI, "FloatAnimation", interfaceC1734nR, 0);
            S.AbstractC1578s0.d dVar2 = S.AbstractC1578s0.d.f11724D;
            p200u.x0 x0VarI2 = p200u.z0.i(c7344m);
            boolean zBooleanValue3 = ((java.lang.Boolean) s0VarH.i()).booleanValue();
            interfaceC1734nR.T(-249413128);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            float f13 = zBooleanValue3 ? 1.0f : 0.0f;
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(f13);
            boolean zBooleanValue4 = ((java.lang.Boolean) s0VarH.p()).booleanValue();
            interfaceC1734nR.T(-249413128);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            float f14 = zBooleanValue4 ? 1.0f : 0.0f;
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            V.G1 g1D2 = p200u.u0.d(s0VarH, fValueOf2, java.lang.Float.valueOf(f14), (p200u.I) dVar2.j(s0VarH.n(), interfaceC1734nR, 0), x0VarI2, "FloatAnimation", interfaceC1734nR, 0);
            boolean zBooleanValue5 = ((java.lang.Boolean) interfaceC1734nR.n(androidx.compose.ui.platform.F0.a())).booleanValue();
            androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
            boolean zD = interfaceC1734nR.d(zBooleanValue5) | interfaceC1734nR.S(g1D) | ((i10 & 112) == 32 || ((i10 & 64) != 0 && interfaceC1734nR.l(z6))) | interfaceC1734nR.S(g1D2) | ((i10 & 896) == 256);
            java.lang.Object objG = interfaceC1734nR.g();
            if (zD || objG == V.InterfaceC1734n.f14931a.a()) {
                S.AbstractC1578s0.a aVar2 = new S.AbstractC1578s0.a(zBooleanValue5, z6, interfaceC1753w0, g1D, g1D2);
                interfaceC1734nR.K(aVar2);
                objG = aVar2;
            }
            int i11 = i10 >> 9;
            int i12 = i10 >> 6;
            S.c1.a(androidx.compose.ui.graphics.b.a(aVar, (p237x7.l) objG), e2Var, j6, 0L, f6, f10, c7213g, p031d0.c.e(1573559053, true, new S.AbstractC1578s0.b(dVar, mVar, qVar), interfaceC1734nR, 54), interfaceC1734nR, (i11 & 896) | (i11 & 112) | 12582912 | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 8);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1578s0.c(dVar, z6, interfaceC1753w0, mVar, e2Var, j6, f6, f10, c7213g, qVar, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(V.G1 g6) {
        return ((java.lang.Number) g6.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(V.G1 g6) {
        return ((java.lang.Number) g6.getValue()).floatValue();
    }

    public static final void d(p237x7.p pVar, p237x7.a aVar, androidx.compose.ui.d dVar, p237x7.p pVar2, p237x7.p pVar3, boolean z6, S.C1576r0 c1576r0, A.B b6, p250z.l lVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1564716777);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.l(pVar) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.l(aVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.S(dVar) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i10 |= interfaceC1734nR.l(pVar2) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i10 |= interfaceC1734nR.l(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i10 |= interfaceC1734nR.d(z6) ? 131072 : 65536;
        }
        if ((1572864 & i6) == 0) {
            i10 |= interfaceC1734nR.S(c1576r0) ? 1048576 : 524288;
        }
        if ((12582912 & i6) == 0) {
            i10 |= interfaceC1734nR.S(b6) ? 8388608 : 4194304;
        }
        if ((100663296 & i6) == 0) {
            i10 |= interfaceC1734nR.S(lVar) ? 67108864 : 33554432;
        }
        if ((38347923 & i10) == 38347922 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1564716777, i10, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:451)");
            }
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.m.h(androidx.compose.foundation.layout.p.s(androidx.compose.foundation.layout.p.f(androidx.compose.foundation.d.b(dVar, lVar, S.I0.c(true, 0.0f, 0L, interfaceC1734nR, 6, 6), z6, null, null, aVar, 24, null), 0.0f, 1, null), f11703e, f11700b, f11704f, 0.0f, 8, null), b6);
            D0.I iB = A.I.b(A.C0768b.f80a.f(), p071h0.c.f45778a.i(), interfaceC1734nR, 48);
            int iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734nR, dVarH);
            F0.InterfaceC0919g.a aVar2 = F0.InterfaceC0919g.f2641a;
            p237x7.a aVarA = aVar2.a();
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
            V.L1.c(interfaceC1734nA, iB, aVar2.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar2.e());
            p237x7.p pVarB = aVar2.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar2.d());
            S.m1.a(S.C1562o0.f11478a.c(interfaceC1734nR, 6).j(), p031d0.c.e(1065051884, true, new S.AbstractC1578s0.f(pVar2, c1576r0, z6, pVar3, A.M.f17a, pVar), interfaceC1734nR, 54), interfaceC1734nR, 48);
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1578s0.g(pVar, aVar, dVar, pVar2, pVar3, z6, c1576r0, b6, lVar, i6));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    public static final long h(Y0.r rVar, Y0.r rVar2) {
        float fMax;
        float fMax2 = 1.0f;
        if (rVar2.g() >= rVar.h()) {
            fMax = 0.0f;
        } else if (rVar2.h() <= rVar.g()) {
            fMax = 1.0f;
        } else if (rVar2.k() == 0) {
            fMax = 0.0f;
        } else {
            fMax = (((java.lang.Math.max(rVar.g(), rVar2.g()) + java.lang.Math.min(rVar.h(), rVar2.h())) / 2) - rVar2.g()) / rVar2.k();
        }
        if (rVar2.i() >= rVar.d()) {
            fMax2 = 0.0f;
        } else if (rVar2.d() > rVar.i()) {
            if (rVar2.f() == 0) {
                fMax2 = 0.0f;
            } else {
                fMax2 = (((java.lang.Math.max(rVar.i(), rVar2.i()) + java.lang.Math.min(rVar.d(), rVar2.d())) / 2) - rVar2.i()) / rVar2.f();
            }
        }
        return p141o0.m2.a(fMax, fMax2);
    }

    public static final float i() {
        return f11702d;
    }

    public static final float j() {
        return f11699a;
    }
}
