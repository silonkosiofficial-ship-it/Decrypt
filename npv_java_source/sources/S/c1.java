package S;

/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.O0 f10828a = V.AbstractC1756y.d(null, S.c1.a.f10829D, 1, null);

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.c1.a f10829D = new S.c1.a();

        a() {
            super(0);
        }

        public final float a() {
            return Y0.i.q(0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            return Y0.i.m(a());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10830D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p141o0.e2 f10831E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f10832F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ float f10833G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p210v.C7213g f10834H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f10835I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10836J;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final S.c1.b.a f10837D = new S.c1.b.a();

            a() {
                super(1);
            }

            public final void a(K0.w wVar) {
                K0.u.N(wVar, true);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((K0.w) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: S.c1$b$b, reason: collision with other inner class name */
        static final class C0244b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f10838G;

            C0244b(p127m7.e eVar) {
                super(2, eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f10838G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p251z0.K k6, p127m7.e eVar) {
                return ((S.c1.b.C0244b) x(k6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new S.c1.b.C0244b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar, p141o0.e2 e2Var, long j6, float f6, p210v.C7213g c7213g, float f10, p237x7.p pVar) {
            super(2);
            this.f10830D = dVar;
            this.f10831E = e2Var;
            this.f10832F = j6;
            this.f10833G = f6;
            this.f10834H = c7213g;
            this.f10835I = f10;
            this.f10836J = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-70914509, i6, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
            }
            androidx.compose.ui.d dVarD = p251z0.U.d(K0.n.c(S.c1.f(this.f10830D, this.f10831E, S.c1.g(this.f10832F, this.f10833G, interfaceC1734n, 0), this.f10834H, ((Y0.e) interfaceC1734n.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(this.f10835I)), false, S.c1.b.a.f10837D), p087i7.M.f46721a, new S.c1.b.C0244b(null));
            p237x7.p pVar = this.f10836J;
            D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), true);
            int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
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

    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10839D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p141o0.e2 f10840E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f10841F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ float f10842G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p210v.C7213g f10843H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p250z.l f10844I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ boolean f10845J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.a f10846K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ float f10847L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10848M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.d dVar, p141o0.e2 e2Var, long j6, float f6, p210v.C7213g c7213g, p250z.l lVar, boolean z6, p237x7.a aVar, float f10, p237x7.p pVar) {
            super(2);
            this.f10839D = dVar;
            this.f10840E = e2Var;
            this.f10841F = j6;
            this.f10842G = f6;
            this.f10843H = c7213g;
            this.f10844I = lVar;
            this.f10845J = z6;
            this.f10846K = aVar;
            this.f10847L = f10;
            this.f10848M = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1279702876, i6, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.d.b(S.c1.f(S.AbstractC1554k0.b(this.f10839D), this.f10840E, S.c1.g(this.f10841F, this.f10842G, interfaceC1734n, 0), this.f10843H, ((Y0.e) interfaceC1734n.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(this.f10847L)), this.f10844I, S.I0.c(false, 0.0f, 0L, interfaceC1734n, 0, 7), this.f10845J, null, null, this.f10846K, 24, null);
            p237x7.p pVar = this.f10848M;
            D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), true);
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

    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10849D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p141o0.e2 f10850E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f10851F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ float f10852G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p210v.C7213g f10853H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f10854I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p250z.l f10855J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ boolean f10856K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p237x7.a f10857L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ float f10858M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10859N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.d dVar, p141o0.e2 e2Var, long j6, float f6, p210v.C7213g c7213g, boolean z6, p250z.l lVar, boolean z10, p237x7.a aVar, float f10, p237x7.p pVar) {
            super(2);
            this.f10849D = dVar;
            this.f10850E = e2Var;
            this.f10851F = j6;
            this.f10852G = f6;
            this.f10853H = c7213g;
            this.f10854I = z6;
            this.f10855J = lVar;
            this.f10856K = z10;
            this.f10857L = aVar;
            this.f10858M = f10;
            this.f10859N = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1164547968, i6, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:312)");
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.selection.a.b(S.c1.f(S.AbstractC1554k0.b(this.f10849D), this.f10850E, S.c1.g(this.f10851F, this.f10852G, interfaceC1734n, 0), this.f10853H, ((Y0.e) interfaceC1734n.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(this.f10858M)), this.f10854I, this.f10855J, S.I0.c(false, 0.0f, 0L, interfaceC1734n, 0, 7), this.f10856K, null, this.f10857L, 16, null);
            p237x7.p pVar = this.f10859N;
            D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), true);
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

    public static final void a(androidx.compose.ui.d dVar, p141o0.e2 e2Var, long j6, long j10, float f6, float f10, p210v.C7213g c7213g, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        androidx.compose.ui.d dVar2 = (i10 & 1) != 0 ? androidx.compose.ui.d.f19586a : dVar;
        p141o0.e2 e2VarA = (i10 & 2) != 0 ? p141o0.Y1.a() : e2Var;
        long jO = (i10 & 4) != 0 ? S.C1562o0.f11478a.a(interfaceC1734n, 6).O() : j6;
        long jC = (i10 & 8) != 0 ? S.A.c(jO, interfaceC1734n, (i6 >> 6) & 14) : j10;
        float fQ = (i10 & 16) != 0 ? Y0.i.q(0) : f6;
        float fQ2 = (i10 & 32) != 0 ? Y0.i.q(0) : f10;
        p210v.C7213g c7213g2 = (i10 & 64) != 0 ? null : c7213g;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-513881741, i6, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        V.O0 o6 = f10828a;
        float fQ3 = Y0.i.q(((Y0.i) interfaceC1734n.n(o6)).v() + fQ);
        V.AbstractC1756y.b(new V.P0[]{S.J.a().d(p141o0.C7016y0.i(jC)), o6.d(Y0.i.m(fQ3))}, p031d0.c.e(-70914509, true, new S.c1.b(dVar2, e2VarA, jO, fQ3, c7213g2, fQ2, pVar), interfaceC1734n, 54), interfaceC1734n, V.P0.f14698i | 48);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
    }

    public static final void b(boolean z6, p237x7.a aVar, androidx.compose.ui.d dVar, boolean z10, p141o0.e2 e2Var, long j6, long j10, float f6, float f10, p210v.C7213g c7213g, p250z.l lVar, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10, int i11) {
        androidx.compose.ui.d dVar2 = (i11 & 4) != 0 ? androidx.compose.ui.d.f19586a : dVar;
        boolean z11 = (i11 & 8) != 0 ? true : z10;
        p141o0.e2 e2VarA = (i11 & 16) != 0 ? p141o0.Y1.a() : e2Var;
        long jO = (i11 & 32) != 0 ? S.C1562o0.f11478a.a(interfaceC1734n, 6).O() : j6;
        long jC = (i11 & 64) != 0 ? S.A.c(jO, interfaceC1734n, (i6 >> 15) & 14) : j10;
        float fQ = (i11 & 128) != 0 ? Y0.i.q(0) : f6;
        float fQ2 = (i11 & 256) != 0 ? Y0.i.q(0) : f10;
        p210v.C7213g c7213g2 = (i11 & 512) != 0 ? null : c7213g;
        p250z.l lVar2 = (i11 & 1024) != 0 ? null : lVar;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(540296512, i6, i10, "androidx.compose.material3.Surface (Surface.kt:306)");
        }
        V.O0 o6 = f10828a;
        float fQ3 = Y0.i.q(((Y0.i) interfaceC1734n.n(o6)).v() + fQ);
        V.AbstractC1756y.b(new V.P0[]{S.J.a().d(p141o0.C7016y0.i(jC)), o6.d(Y0.i.m(fQ3))}, p031d0.c.e(-1164547968, true, new S.c1.d(dVar2, e2VarA, jO, fQ3, c7213g2, z6, lVar2, z11, aVar, fQ2, pVar), interfaceC1734n, 54), interfaceC1734n, V.P0.f14698i | 48);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
    }

    public static final void c(p237x7.a aVar, androidx.compose.ui.d dVar, boolean z6, p141o0.e2 e2Var, long j6, long j10, float f6, float f10, p210v.C7213g c7213g, p250z.l lVar, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10, int i11) {
        androidx.compose.ui.d dVar2 = (i11 & 2) != 0 ? androidx.compose.ui.d.f19586a : dVar;
        boolean z10 = (i11 & 4) != 0 ? true : z6;
        p141o0.e2 e2VarA = (i11 & 8) != 0 ? p141o0.Y1.a() : e2Var;
        long jO = (i11 & 16) != 0 ? S.C1562o0.f11478a.a(interfaceC1734n, 6).O() : j6;
        long jC = (i11 & 32) != 0 ? S.A.c(jO, interfaceC1734n, (i6 >> 12) & 14) : j10;
        float fQ = (i11 & 64) != 0 ? Y0.i.q(0) : f6;
        float fQ2 = (i11 & 128) != 0 ? Y0.i.q(0) : f10;
        p210v.C7213g c7213g2 = (i11 & 256) != 0 ? null : c7213g;
        p250z.l lVar2 = (i11 & 512) == 0 ? lVar : null;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-789752804, i6, i10, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        V.O0 o6 = f10828a;
        float fQ3 = Y0.i.q(((Y0.i) interfaceC1734n.n(o6)).v() + fQ);
        V.AbstractC1756y.b(new V.P0[]{S.J.a().d(p141o0.C7016y0.i(jC)), o6.d(Y0.i.m(fQ3))}, p031d0.c.e(1279702876, true, new S.c1.c(dVar2, e2VarA, jO, fQ3, c7213g2, lVar2, z10, aVar, fQ2, pVar), interfaceC1734n, 54), interfaceC1734n, V.P0.f14698i | 48);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.d f(androidx.compose.ui.d dVar, p141o0.e2 e2Var, long j6, p210v.C7213g c7213g, float f6) {
        p141o0.e2 e2Var2;
        androidx.compose.ui.d dVarE;
        androidx.compose.ui.d dVarB = dVar.b(f6 > 0.0f ? androidx.compose.ui.graphics.b.c(androidx.compose.ui.d.f19586a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f6, 0.0f, 0.0f, 0.0f, 0.0f, 0L, e2Var, false, null, 0L, 0L, 0, 124895, null) : androidx.compose.ui.d.f19586a);
        if (c7213g != null) {
            e2Var2 = e2Var;
            dVarE = p210v.AbstractC7211e.e(androidx.compose.ui.d.f19586a, c7213g, e2Var2);
        } else {
            e2Var2 = e2Var;
            dVarE = androidx.compose.ui.d.f19586a;
        }
        return p111l0.e.a(androidx.compose.foundation.b.a(dVarB.b(dVarE), j6, e2Var2), e2Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(long j6, float f6, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-2079918090, i6, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long jA = S.A.a(S.C1562o0.f11478a.a(interfaceC1734n, 6), j6, f6, interfaceC1734n, (i6 << 3) & 1008);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return jA;
    }
}
