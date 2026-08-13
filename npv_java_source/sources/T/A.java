package T;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f12694b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f12699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f12700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final androidx.compose.ui.d f12701i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f12693a = Y0.c.a(0, 0, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f12695c = Y0.i.q(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f12696d = Y0.i.q(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f12697e = Y0.i.q(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f12698f = Y0.i.q(24);

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f12702D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f12703E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f6, V.InterfaceC1753w0 interfaceC1753w0) {
            super(1);
            this.f12702D = f6;
            this.f12703E = interfaceC1753w0;
        }

        public final void a(long j6) {
            float fI = p131n0.m.i(j6) * this.f12702D;
            float fG = p131n0.m.g(j6) * this.f12702D;
            if (p131n0.m.i(((p131n0.m) this.f12703E.getValue()).m()) == fI && p131n0.m.g(((p131n0.m) this.f12703E.getValue()).m()) == fG) {
                return;
            }
            this.f12703E.setValue(p131n0.m.c(p131n0.n.a(fI, fG)));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((p131n0.m) obj).m());
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f12704D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ A.B f12705E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12706F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(V.InterfaceC1753w0 interfaceC1753w0, A.B b6, p237x7.p pVar) {
            super(2);
            this.f12704D = interfaceC1753w0;
            this.f12705E = b6;
            this.f12706F = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(157291737, i6, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
            }
            androidx.compose.ui.d dVarL = S.AbstractC1590y0.l(androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f19586a, "Container"), new p247y7.AbstractC7355y(this.f12704D) { // from class: T.A.b.a
                @Override // F7.l
                public java.lang.Object get() {
                    return ((V.InterfaceC1753w0) this.f57287D).getValue();
                }
            }, this.f12705E);
            p237x7.p pVar = this.f12706F;
            D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), true);
            int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, dVarL);
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
        final /* synthetic */ p237x7.p f12707D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p237x7.p pVar) {
            super(2);
            this.f12707D = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1750327932, i6, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:229)");
            }
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f19586a, "Container");
            p237x7.p pVar = this.f12707D;
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
        final /* synthetic */ M0.P f12708D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ M0.P f12709E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ float f12710F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ V.G1 f12711G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12712H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f12713I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ V.G1 f12714J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(M0.P p6, M0.P p10, float f6, V.G1 g6, p237x7.p pVar, boolean z6, V.G1 g10) {
            super(2);
            this.f12708D = p6;
            this.f12709E = p10;
            this.f12710F = f6;
            this.f12711G = g6;
            this.f12712H = pVar;
            this.f12713I = z6;
            this.f12714J = g10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1236585568, i6, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
            }
            M0.P pC = M0.Q.c(this.f12708D, this.f12709E, this.f12710F);
            boolean z6 = this.f12713I;
            V.G1 g6 = this.f12714J;
            if (z6) {
                pC = pC.b((15204351 & 1) != 0 ? pC.f6671a.g() : ((p141o0.C7016y0) g6.getValue()).w(), (15204351 & 2) != 0 ? pC.f6671a.k() : 0L, (15204351 & 4) != 0 ? pC.f6671a.n() : null, (15204351 & 8) != 0 ? pC.f6671a.l() : null, (15204351 & 16) != 0 ? pC.f6671a.m() : null, (15204351 & 32) != 0 ? pC.f6671a.i() : null, (15204351 & 64) != 0 ? pC.f6671a.j() : null, (15204351 & 128) != 0 ? pC.f6671a.o() : 0L, (15204351 & 256) != 0 ? pC.f6671a.e() : null, (15204351 & 512) != 0 ? pC.f6671a.u() : null, (15204351 & 1024) != 0 ? pC.f6671a.p() : null, (15204351 & 2048) != 0 ? pC.f6671a.d() : 0L, (15204351 & 4096) != 0 ? pC.f6671a.s() : null, (15204351 & 8192) != 0 ? pC.f6671a.r() : null, (15204351 & 16384) != 0 ? pC.f6671a.h() : null, (15204351 & 32768) != 0 ? pC.f6672b.h() : 0, (15204351 & 65536) != 0 ? pC.f6672b.i() : 0, (15204351 & 131072) != 0 ? pC.f6672b.e() : 0L, (15204351 & 262144) != 0 ? pC.f6672b.j() : null, (15204351 & 524288) != 0 ? pC.f6673c : null, (15204351 & 1048576) != 0 ? pC.f6672b.f() : null, (15204351 & 2097152) != 0 ? pC.f6672b.d() : 0, (15204351 & 4194304) != 0 ? pC.f6672b.c() : 0, (15204351 & 8388608) != 0 ? pC.f6672b.k() : null);
            }
            T.A.d(((p141o0.C7016y0) this.f12711G.getValue()).w(), pC, this.f12712H, interfaceC1734n, 0);
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

    static final class e extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f12715D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12716E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j6, p237x7.p pVar) {
            super(2);
            this.f12715D = j6;
            this.f12716E = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-130107406, i6, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:205)");
            }
            T.A.e(this.f12715D, this.f12716E, interfaceC1734n, 0);
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

    static final class f extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f12717D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f12718E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ M0.P f12719F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12720G;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.G1 f12721D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V.G1 g6) {
                super(1);
                this.f12721D = g6;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.b(((java.lang.Number) this.f12721D.getValue()).floatValue());
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((androidx.compose.ui.graphics.c) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(V.G1 g6, long j6, M0.P p6, p237x7.p pVar) {
            super(3);
            this.f12717D = g6;
            this.f12718E = j6;
            this.f12719F = p6;
            this.f12720G = pVar;
        }

        public final void a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 6) == 0) {
                i6 |= interfaceC1734n.S(dVar) ? 4 : 2;
            }
            if ((i6 & 19) == 18 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-660524084, i6, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
            }
            boolean zS = interfaceC1734n.S(this.f12717D);
            V.G1 g6 = this.f12717D;
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new T.A.f.a(g6);
                interfaceC1734n.K(objG);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.b.a(dVar, (p237x7.l) objG);
            long j6 = this.f12718E;
            M0.P p6 = this.f12719F;
            p237x7.p pVar = this.f12720G;
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
            T.A.d(j6, p6, pVar, interfaceC1734n, 0);
            interfaceC1734n.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f12722D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f12723E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ M0.P f12724F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12725G;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.G1 f12726D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V.G1 g6) {
                super(1);
                this.f12726D = g6;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.b(((java.lang.Number) this.f12726D.getValue()).floatValue());
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((androidx.compose.ui.graphics.c) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(V.G1 g6, long j6, M0.P p6, p237x7.p pVar) {
            super(2);
            this.f12722D = g6;
            this.f12723E = j6;
            this.f12724F = p6;
            this.f12725G = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(274398694, i6, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:178)");
            }
            androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
            boolean zS = interfaceC1734n.S(this.f12722D);
            V.G1 g6 = this.f12722D;
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new T.A.g.a(g6);
                interfaceC1734n.K(objG);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.b.a(aVar, (p237x7.l) objG);
            long j6 = this.f12723E;
            M0.P p6 = this.f12724F;
            p237x7.p pVar = this.f12725G;
            D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
            int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, dVarA);
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
            V.L1.c(interfaceC1734nA, iH, aVar2.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar2.e());
            p237x7.p pVarB = aVar2.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar2.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f19260a;
            T.A.d(j6, p6, pVar, interfaceC1734n, 0);
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

    static final class h extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f12727D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f12728E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ M0.P f12729F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12730G;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.G1 f12731D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V.G1 g6) {
                super(1);
                this.f12731D = g6;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.b(((java.lang.Number) this.f12731D.getValue()).floatValue());
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((androidx.compose.ui.graphics.c) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(V.G1 g6, long j6, M0.P p6, p237x7.p pVar) {
            super(2);
            this.f12727D = g6;
            this.f12728E = j6;
            this.f12729F = p6;
            this.f12730G = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1526229403, i6, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:192)");
            }
            androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
            boolean zS = interfaceC1734n.S(this.f12727D);
            V.G1 g6 = this.f12727D;
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new T.A.h.a(g6);
                interfaceC1734n.K(objG);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.b.a(aVar, (p237x7.l) objG);
            long j6 = this.f12728E;
            M0.P p6 = this.f12729F;
            p237x7.p pVar = this.f12730G;
            D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
            int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, dVarA);
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
            V.L1.c(interfaceC1734nA, iH, aVar2.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar2.e());
            p237x7.p pVarB = aVar2.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar2.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f19260a;
            T.A.d(j6, p6, pVar, interfaceC1734n, 0);
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

    static final class i extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f12732D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ M0.P f12733E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12734F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j6, M0.P p6, p237x7.p pVar) {
            super(2);
            this.f12732D = j6;
            this.f12733E = p6;
            this.f12734F = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1263707005, i6, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
            }
            T.A.d(this.f12732D, this.f12733E, this.f12734F, interfaceC1734n, 0);
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

    static final class j extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f12735D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12736E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j6, p237x7.p pVar) {
            super(2);
            this.f12735D = j6;
            this.f12736E = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(2079816678, i6, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:211)");
            }
            T.A.e(this.f12735D, this.f12736E, interfaceC1734n, 0);
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

    static final class k extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f12737D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(V.G1 g6) {
            super(0);
            this.f12737D = g6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.valueOf(((java.lang.Number) this.f12737D.getValue()).floatValue() > 0.0f);
        }
    }

    static final class l extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f12738D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(V.G1 g6) {
            super(0);
            this.f12738D = g6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.valueOf(((java.lang.Number) this.f12738D.getValue()).floatValue() > 0.0f);
        }
    }

    static final class m extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ T.G f12739D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.String f12740E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12741F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ S0.g0 f12742G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12743H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12744I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12745J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12746K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12747L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12748M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12749N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f12750O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        final /* synthetic */ boolean f12751P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        final /* synthetic */ boolean f12752Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        final /* synthetic */ p250z.j f12753R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ A.B f12754S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ S.i1 f12755T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12756U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        final /* synthetic */ int f12757V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        final /* synthetic */ int f12758W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ int f12759X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(T.G g6, java.lang.String str, p237x7.p pVar, S0.g0 g0Var, p237x7.p pVar2, p237x7.p pVar3, p237x7.p pVar4, p237x7.p pVar5, p237x7.p pVar6, p237x7.p pVar7, p237x7.p pVar8, boolean z6, boolean z10, boolean z11, p250z.j jVar, A.B b6, S.i1 i1Var, p237x7.p pVar9, int i6, int i10, int i11) {
            super(2);
            this.f12739D = g6;
            this.f12740E = str;
            this.f12741F = pVar;
            this.f12742G = g0Var;
            this.f12743H = pVar2;
            this.f12744I = pVar3;
            this.f12745J = pVar4;
            this.f12746K = pVar5;
            this.f12747L = pVar6;
            this.f12748M = pVar7;
            this.f12749N = pVar8;
            this.f12750O = z6;
            this.f12751P = z10;
            this.f12752Q = z11;
            this.f12753R = jVar;
            this.f12754S = b6;
            this.f12755T = i1Var;
            this.f12756U = pVar9;
            this.f12757V = i6;
            this.f12758W = i10;
            this.f12759X = i11;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            T.A.a(this.f12739D, this.f12740E, this.f12741F, this.f12742G, this.f12743H, this.f12744I, this.f12745J, this.f12746K, this.f12747L, this.f12748M, this.f12749N, this.f12750O, this.f12751P, this.f12752Q, this.f12753R, this.f12754S, this.f12755T, this.f12756U, interfaceC1734n, V.S0.a(this.f12757V | 1), V.S0.a(this.f12758W), this.f12759X);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class n extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f12760D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ M0.P f12761E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12762F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f12763G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(long j6, M0.P p6, p237x7.p pVar, int i6) {
            super(2);
            this.f12760D = j6;
            this.f12761E = p6;
            this.f12762F = pVar;
            this.f12763G = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            T.A.d(this.f12760D, this.f12761E, this.f12762F, interfaceC1734n, V.S0.a(this.f12763G | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class o extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f12764D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12765E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f12766F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(long j6, p237x7.p pVar, int i6) {
            super(2);
            this.f12764D = j6;
            this.f12765E = pVar;
            this.f12766F = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            T.A.e(this.f12764D, this.f12765E, interfaceC1734n, V.S0.a(this.f12766F | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public /* synthetic */ class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f12768b;

        static {
            int[] iArr = new int[T.G.values().length];
            try {
                iArr[T.G.Filled.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[T.G.Outlined.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f12767a = iArr;
            int[] iArr2 = new int[T.p.values().length];
            try {
                iArr2[T.p.Focused.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[T.p.UnfocusedEmpty.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[T.p.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            f12768b = iArr2;
        }
    }

    static final class q extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.String f12769D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(java.lang.String str) {
            super(1);
            this.f12769D = str;
        }

        public final void a(K0.w wVar) {
            K0.u.m(wVar, this.f12769D);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((K0.w) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class r extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p141o0.e2 f12770D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p141o0.B0 f12771E;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p141o0.L1 f12772D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p141o0.B0 f12773E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p141o0.L1 l6, p141o0.B0 b6) {
                super(1);
                this.f12772D = l6;
                this.f12773E = b6;
            }

            public final void a(p161q0.g gVar) {
                p141o0.M1.c(gVar, this.f12772D, this.f12773E.a(), (60 & 4) != 0 ? 1.0f : 0.0f, (60 & 8) != 0 ? p161q0.l.f52928a : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? p161q0.g.f52924B.a() : 0);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p161q0.g) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(p141o0.e2 e2Var, p141o0.B0 b6) {
            super(1);
            this.f12770D = e2Var;
            this.f12771E = b6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p111l0.h l(p111l0.d dVar) {
            return dVar.k(new T.A.r.a(this.f12770D.a(dVar.i(), dVar.getLayoutDirection(), dVar), this.f12771E));
        }
    }

    static {
        float f6 = 16;
        f12694b = Y0.i.q(f6);
        f12699g = Y0.i.q(f6);
        f12700h = Y0.i.q(f6);
        float f10 = 48;
        f12701i = androidx.compose.foundation.layout.p.a(androidx.compose.ui.d.f19586a, Y0.i.q(f10), Y0.i.q(f10));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0141  */
    /* JADX WARN: Code duplicated, block: B:105:0x0147  */
    /* JADX WARN: Code duplicated, block: B:106:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0153  */
    /* JADX WARN: Code duplicated, block: B:110:0x0158  */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:117:0x016a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:122:0x0177  */
    /* JADX WARN: Code duplicated, block: B:124:0x017d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0183  */
    /* JADX WARN: Code duplicated, block: B:130:0x018c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0195  */
    /* JADX WARN: Code duplicated, block: B:134:0x019b  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:157:0x01db  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:164:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:170:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:171:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:175:0x0204  */
    /* JADX WARN: Code duplicated, block: B:177:0x0209  */
    /* JADX WARN: Code duplicated, block: B:179:0x020d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0213  */
    /* JADX WARN: Code duplicated, block: B:182:0x0216  */
    /* JADX WARN: Code duplicated, block: B:186:0x021d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0220  */
    /* JADX WARN: Code duplicated, block: B:189:0x0224  */
    /* JADX WARN: Code duplicated, block: B:191:0x022a  */
    /* JADX WARN: Code duplicated, block: B:192:0x022d  */
    /* JADX WARN: Code duplicated, block: B:202:0x0261 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0263  */
    /* JADX WARN: Code duplicated, block: B:204:0x0265  */
    /* JADX WARN: Code duplicated, block: B:206:0x0269  */
    /* JADX WARN: Code duplicated, block: B:207:0x026b  */
    /* JADX WARN: Code duplicated, block: B:209:0x026f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0271  */
    /* JADX WARN: Code duplicated, block: B:212:0x0275  */
    /* JADX WARN: Code duplicated, block: B:213:0x0277  */
    /* JADX WARN: Code duplicated, block: B:215:0x027b  */
    /* JADX WARN: Code duplicated, block: B:216:0x027d  */
    /* JADX WARN: Code duplicated, block: B:218:0x0281  */
    /* JADX WARN: Code duplicated, block: B:219:0x0283  */
    /* JADX WARN: Code duplicated, block: B:221:0x0287  */
    /* JADX WARN: Code duplicated, block: B:222:0x028a  */
    /* JADX WARN: Code duplicated, block: B:224:0x028e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0290  */
    /* JADX WARN: Code duplicated, block: B:227:0x0294  */
    /* JADX WARN: Code duplicated, block: B:228:0x0296  */
    /* JADX WARN: Code duplicated, block: B:231:0x029e  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:235:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:238:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:239:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:242:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:246:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:249:0x030c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0311  */
    /* JADX WARN: Code duplicated, block: B:253:0x0317  */
    /* JADX WARN: Code duplicated, block: B:254:0x031a  */
    /* JADX WARN: Code duplicated, block: B:257:0x034a  */
    /* JADX WARN: Code duplicated, block: B:259:0x0358  */
    /* JADX WARN: Code duplicated, block: B:267:0x037d  */
    /* JADX WARN: Code duplicated, block: B:273:0x038c  */
    /* JADX WARN: Code duplicated, block: B:279:0x0399  */
    /* JADX WARN: Code duplicated, block: B:280:0x039b  */
    /* JADX WARN: Code duplicated, block: B:283:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:284:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:287:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:289:0x03e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:290:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:291:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:293:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:296:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:299:0x0417  */
    /* JADX WARN: Code duplicated, block: B:300:0x0423  */
    /* JADX WARN: Code duplicated, block: B:303:0x0430  */
    /* JADX WARN: Code duplicated, block: B:305:0x0433  */
    /* JADX WARN: Code duplicated, block: B:307:0x0436  */
    /* JADX WARN: Code duplicated, block: B:308:0x0439  */
    /* JADX WARN: Code duplicated, block: B:310:0x043f  */
    /* JADX WARN: Code duplicated, block: B:313:0x0446  */
    /* JADX WARN: Code duplicated, block: B:316:0x048f  */
    /* JADX WARN: Code duplicated, block: B:319:0x049f  */
    /* JADX WARN: Code duplicated, block: B:321:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:324:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:326:0x04ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:328:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:331:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:334:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:335:0x04de  */
    /* JADX WARN: Code duplicated, block: B:338:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:340:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:343:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:345:0x04f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:347:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:350:0x0502  */
    /* JADX WARN: Code duplicated, block: B:353:0x054b  */
    /* JADX WARN: Code duplicated, block: B:356:0x055b  */
    /* JADX WARN: Code duplicated, block: B:358:0x055e  */
    /* JADX WARN: Code duplicated, block: B:360:0x0561  */
    /* JADX WARN: Code duplicated, block: B:361:0x0564  */
    /* JADX WARN: Code duplicated, block: B:363:0x056a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:364:0x056c  */
    /* JADX WARN: Code duplicated, block: B:367:0x0573  */
    /* JADX WARN: Code duplicated, block: B:370:0x058f  */
    /* JADX WARN: Code duplicated, block: B:373:0x059f  */
    /* JADX WARN: Code duplicated, block: B:375:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:377:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:378:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:380:0x05ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:381:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:384:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:387:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:390:0x060c  */
    /* JADX WARN: Code duplicated, block: B:391:0x060f  */
    /* JADX WARN: Code duplicated, block: B:394:0x0617  */
    /* JADX WARN: Code duplicated, block: B:397:0x062b  */
    /* JADX WARN: Code duplicated, block: B:399:0x0633  */
    /* JADX WARN: Code duplicated, block: B:402:0x0653  */
    /* JADX WARN: Code duplicated, block: B:405:0x0661  */
    /* JADX WARN: Code duplicated, block: B:406:0x0664  */
    /* JADX WARN: Code duplicated, block: B:409:0x066c  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:412:0x0685  */
    /* JADX WARN: Code duplicated, block: B:415:0x0693  */
    /* JADX WARN: Code duplicated, block: B:418:0x069b  */
    /* JADX WARN: Code duplicated, block: B:421:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:424:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:427:0x0701  */
    /* JADX WARN: Code duplicated, block: B:429:0x0709  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:432:0x0729  */
    /* JADX WARN: Code duplicated, block: B:435:0x0734  */
    /* JADX WARN: Code duplicated, block: B:438:0x074d  */
    /* JADX WARN: Code duplicated, block: B:439:0x0753  */
    /* JADX WARN: Code duplicated, block: B:43:0x0098  */
    /* JADX WARN: Code duplicated, block: B:442:0x075a  */
    /* JADX WARN: Code duplicated, block: B:445:0x079e  */
    /* JADX WARN: Code duplicated, block: B:446:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:449:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:452:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:457:0x081a  */
    /* JADX WARN: Code duplicated, block: B:460:0x082d  */
    /* JADX WARN: Code duplicated, block: B:463:0x0847  */
    /* JADX WARN: Code duplicated, block: B:466:0x0869  */
    /* JADX WARN: Code duplicated, block: B:469:0x087a  */
    /* JADX WARN: Code duplicated, block: B:472:0x089a  */
    /* JADX WARN: Code duplicated, block: B:475:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:476:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:479:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x009f  */
    /* JADX WARN: Code duplicated, block: B:480:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:483:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:484:0x0903  */
    /* JADX WARN: Code duplicated, block: B:487:0x091f  */
    /* JADX WARN: Code duplicated, block: B:489:0x0922  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:490:0x0939  */
    /* JADX WARN: Code duplicated, block: B:492:0x0949  */
    /* JADX WARN: Code duplicated, block: B:495:0x0983  */
    /* JADX WARN: Code duplicated, block: B:497:0x0989  */
    /* JADX WARN: Code duplicated, block: B:500:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:503:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:507:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:509:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0102  */
    /* JADX WARN: Code duplicated, block: B:84:0x0108  */
    /* JADX WARN: Code duplicated, block: B:85:0x010b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x011b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0121  */
    /* JADX WARN: Code duplicated, block: B:94:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134 A[PHI: r38
  0x0134: PHI (r38v13 int) = (r38v4 int), (r38v7 int), (r38v8 int) binds: [B:98:0x0132, B:106:0x014a, B:105:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void a(T.G g6, java.lang.String str, p237x7.p pVar, S0.g0 g0Var, p237x7.p pVar2, p237x7.p pVar3, p237x7.p pVar4, p237x7.p pVar5, p237x7.p pVar6, p237x7.p pVar7, p237x7.p pVar8, boolean z6, boolean z10, boolean z11, p250z.j jVar, A.B b6, S.i1 i1Var, p237x7.p pVar9, V.InterfaceC1734n interfaceC1734n, int i6, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        p237x7.p pVar10;
        p237x7.p pVar11;
        p237x7.p pVar12;
        p237x7.p pVar13;
        p237x7.p pVar14;
        p237x7.p pVar15;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i37;
        boolean z16;
        boolean z17;
        java.lang.Object objA;
        java.lang.String strI;
        boolean zBooleanValue;
        T.p pVar16;
        long jE;
        int i38;
        M0.P pA;
        M0.P pC;
        p237x7.p pVar17;
        p237x7.p pVar18;
        p141o0.C7016y0.a aVar;
        p237x7.p pVar19;
        boolean z18;
        long jH;
        long jH2;
        long j6;
        boolean z19;
        p237x7.p pVar20;
        int[] iArr;
        int i39;
        float f6;
        int i40;
        float f10;
        int i41;
        float f11;
        int i42;
        float f12;
        V.G1 g1D;
        int i43;
        float f13;
        int i44;
        float f14;
        V.G1 g1D2;
        T.p pVar21;
        long j10;
        p151p0.c cVarR;
        boolean zS;
        java.lang.Object objG;
        T.p pVar22;
        long j11;
        T.p pVar23;
        V.G1 g1D3;
        p151p0.c cVarR2;
        boolean zS2;
        java.lang.Object objG2;
        int i45;
        V.G1 g1D4;
        float fFloatValue;
        p031d0.a aVarE;
        boolean z20;
        java.lang.Object objG3;
        V.InterfaceC1734n.a aVar2;
        p031d0.a aVarE2;
        java.lang.Object objG4;
        p031d0.a aVarE3;
        p031d0.a aVarE4;
        long jF;
        p237x7.p pVar24;
        p031d0.a aVarE5;
        long jL;
        p237x7.p pVar25;
        int i46;
        int i47;
        p031d0.a aVarE6;
        long j12;
        p237x7.p pVar26;
        int i48;
        p031d0.a aVarE7;
        int i49;
        boolean z21;
        p237x7.p pVar27;
        p237x7.p pVar28;
        p237x7.p pVar29;
        p237x7.p pVar30;
        p237x7.p pVar31;
        java.lang.Object objG5;
        V.InterfaceC1753w0 interfaceC1753w0;
        boolean zH;
        java.lang.Object objG6;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1514469103);
        if ((i11 & 1) != 0) {
            i12 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i12 = i6 | (interfaceC1734nR.S(g6) ? 4 : 2);
        } else {
            i12 = i6;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i6 & 48) == 0) {
            i12 |= interfaceC1734nR.S(str) ? 32 : 16;
        }
        int i50 = i12;
        if ((i11 & 4) == 0) {
            if ((i6 & 384) == 0) {
                i50 |= interfaceC1734nR.l(pVar) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i50 |= 3072;
            } else if ((i6 & 3072) == 0) {
                if (interfaceC1734nR.S(g0Var)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i50 |= i13;
            }
            if ((i11 & 16) != 0) {
                i50 |= 24576;
            } else if ((i6 & 24576) == 0) {
                if (interfaceC1734nR.l(pVar2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i50 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i50 |= 196608;
            } else if ((i6 & 196608) == 0) {
                if (interfaceC1734nR.l(pVar3)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i50 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i50 |= 1572864;
            } else if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.l(pVar4)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i50 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i50 |= 12582912;
            } else if ((i6 & 12582912) == 0) {
                if (interfaceC1734nR.l(pVar5)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i50 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                i50 |= 100663296;
            } else if ((i6 & 100663296) == 0) {
                if (interfaceC1734nR.l(pVar6)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i50 |= i22;
            }
            i23 = i11 & 512;
            i24 = 805306368;
            if (i23 == 0) {
                i50 |= i24;
            } else if ((i6 & 805306368) == 0) {
                if (interfaceC1734nR.l(pVar7)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i50 |= i24;
            }
            i25 = i11 & 1024;
            if (i25 != 0) {
                i26 = i10 | 6;
            } else if ((i10 & 6) == 0) {
                i26 = i10 | (interfaceC1734nR.l(pVar8) ? 4 : 2);
            } else {
                i26 = i10;
            }
            i27 = i11 & 2048;
            if (i27 != 0) {
                i26 |= 48;
            } else if ((i10 & 48) == 0) {
                i26 |= interfaceC1734nR.d(z6) ? 32 : 16;
            }
            i28 = i26;
            i29 = i11 & 4096;
            if (i29 != 0) {
                i28 |= 384;
                i30 = i29;
            } else {
                i30 = i29;
                if ((i10 & 384) != 0) {
                    if (interfaceC1734nR.d(z10)) {
                        i31 = 256;
                    } else {
                        i31 = 128;
                    }
                    i28 |= i31;
                }
            }
            i32 = i11 & 8192;
            if (i32 != 0) {
                i28 |= 3072;
            } else if ((i10 & 3072) != 0) {
                if (interfaceC1734nR.d(z11)) {
                    i33 = 2048;
                } else {
                    i33 = 1024;
                }
                i28 |= i33;
            }
            if ((i11 & 16384) != 0) {
                i28 |= 24576;
            } else if ((i10 & 24576) == 0) {
                i28 |= interfaceC1734nR.S(jVar) ? 16384 : 8192;
            }
            if ((32768 & i11) != 0) {
                i28 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (interfaceC1734nR.S(b6)) {
                    i34 = 131072;
                } else {
                    i34 = 65536;
                }
                i28 |= i34;
            }
            if ((65536 & i11) != 0) {
                i28 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (interfaceC1734nR.S(i1Var)) {
                    i35 = 1048576;
                } else {
                    i35 = 524288;
                }
                i28 |= i35;
            }
            if ((131072 & i11) != 0) {
                i28 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (interfaceC1734nR.l(pVar9)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i28 |= i36;
            }
            if ((306783379 & i50) != 306783378 && (4793491 & i28) == 4793490 && interfaceC1734nR.u()) {
                interfaceC1734nR.A();
                pVar31 = pVar3;
                pVar30 = pVar4;
                pVar29 = pVar5;
                pVar27 = pVar6;
                pVar28 = pVar7;
                pVar26 = pVar8;
                z12 = z6;
                z20 = z10;
                z21 = z11;
            } else {
                if (i15 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar3;
                }
                if (i17 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i19 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i21 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i23 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i25 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar8;
                }
                if (i27 != 0) {
                    z12 = false;
                } else {
                    z12 = z6;
                }
                if (i30 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i32 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1514469103, i50, i28, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                }
                if ((i50 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i37 = i50;
                if ((i50 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | z15;
                java.lang.Object objG7 = interfaceC1734nR.g();
                if (!z17 || objG7 == V.InterfaceC1734n.f14931a.a()) {
                    objA = g0Var.a(new M0.C1332d(str, null, null, 6, null));
                    interfaceC1734nR.K(objA);
                } else {
                    objA = objG7;
                }
                strI = ((S0.e0) objA).b().i();
                zBooleanValue = ((java.lang.Boolean) p250z.f.a(jVar, interfaceC1734nR, (i28 >> 12) & 14).getValue()).booleanValue();
                if (zBooleanValue) {
                    pVar16 = T.p.Focused;
                } else if (strI.length() == 0) {
                    pVar16 = T.p.UnfocusedEmpty;
                } else {
                    pVar16 = T.p.UnfocusedNotEmpty;
                }
                T.p pVar32 = pVar16;
                jE = i1Var.e(z13, z14, zBooleanValue);
                i38 = i28;
                S.A1 a1C = S.C1562o0.f11478a.c(interfaceC1734nR, 6);
                pA = a1C.a();
                pC = a1C.c();
                pVar17 = pVar13;
                pVar18 = pVar15;
                long jH3 = pA.h();
                aVar = p141o0.C7016y0.f52264b;
                pVar19 = pVar14;
                z18 = !(p141o0.C7016y0.o(jH3, aVar.g()) || p141o0.C7016y0.o(pC.h(), aVar.g())) || (!p141o0.C7016y0.o(pA.h(), aVar.g()) && p141o0.C7016y0.o(pC.h(), aVar.g()));
                jH = pC.h();
                if (z18 && jH == 16) {
                    jH = jE;
                }
                jH2 = pA.h();
                if (z18 && jH2 == 16) {
                    jH2 = jE;
                }
                j6 = jH;
                if (pVar2 != null) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                p200u.s0 s0VarG = p200u.u0.g(pVar32, "TextFieldInputState", interfaceC1734nR, 48, 0);
                T.C c6 = T.C.f12775D;
                p247y7.C7344m c7344m = p247y7.C7344m.f57303a;
                p200u.x0 x0VarI = p200u.z0.i(c7344m);
                T.p pVar33 = (T.p) s0VarG.i();
                pVar20 = pVar12;
                interfaceC1734nR.T(-2036730335);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                iArr = T.A.p.f12768b;
                i39 = iArr[pVar33.ordinal()];
                if (i39 == 1) {
                    f6 = 1.0f;
                } else if (i39 != 2) {
                    if (i39 != 3) {
                        throw new p087i7.s();
                    }
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                java.lang.Float fValueOf = java.lang.Float.valueOf(f6);
                T.p pVar34 = (T.p) s0VarG.p();
                interfaceC1734nR.T(-2036730335);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                i40 = iArr[pVar34.ordinal()];
                if (i40 == 1) {
                    f10 = 1.0f;
                } else if (i40 != 2) {
                    if (i40 != 3) {
                        throw new p087i7.s();
                    }
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                V.G1 g1D5 = p200u.u0.d(s0VarG, fValueOf, java.lang.Float.valueOf(f10), (p200u.I) c6.j(s0VarG.n(), interfaceC1734nR, 0), x0VarI, "LabelProgress", interfaceC1734nR, 196608);
                T.E e6 = T.E.f12777D;
                p200u.x0 x0VarI2 = p200u.z0.i(c7344m);
                T.p pVar35 = (T.p) s0VarG.i();
                interfaceC1734nR.T(1435837472);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i41 = iArr[pVar35.ordinal()];
                if (i41 == 1) {
                    f11 = 1.0f;
                } else {
                    if (i41 != 2) {
                        if (i41 != 3) {
                            throw new p087i7.s();
                        }
                    } else if (!z19) {
                        f11 = 1.0f;
                    }
                    f11 = 0.0f;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                java.lang.Float fValueOf2 = java.lang.Float.valueOf(f11);
                T.p pVar36 = (T.p) s0VarG.p();
                interfaceC1734nR.T(1435837472);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i42 = iArr[pVar36.ordinal()];
                if (i42 == 1) {
                    f12 = 1.0f;
                } else {
                    if (i42 != 2) {
                        if (i42 != 3) {
                            throw new p087i7.s();
                        }
                    } else if (!z19) {
                        f12 = 1.0f;
                    }
                    f12 = 0.0f;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                g1D = p200u.u0.d(s0VarG, fValueOf2, java.lang.Float.valueOf(f12), (p200u.I) e6.j(s0VarG.n(), interfaceC1734nR, 0), x0VarI2, "PlaceholderOpacity", interfaceC1734nR, 196608);
                T.F f15 = T.F.f12778D;
                p200u.x0 x0VarI3 = p200u.z0.i(c7344m);
                T.p pVar37 = (T.p) s0VarG.i();
                interfaceC1734nR.T(1128033978);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i43 = iArr[pVar37.ordinal()];
                if (i43 == 1) {
                    f13 = 1.0f;
                } else {
                    if (i43 != 2) {
                        if (i43 != 3) {
                            throw new p087i7.s();
                        }
                    } else if (z19) {
                        f13 = 0.0f;
                    }
                    f13 = 1.0f;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                java.lang.Float fValueOf3 = java.lang.Float.valueOf(f13);
                T.p pVar38 = (T.p) s0VarG.p();
                interfaceC1734nR.T(1128033978);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i44 = iArr[pVar38.ordinal()];
                if (i44 == 1) {
                    f14 = 1.0f;
                } else {
                    if (i44 != 2) {
                        if (i44 != 3) {
                            throw new p087i7.s();
                        }
                    } else if (z19) {
                        f14 = 0.0f;
                    }
                    f14 = 1.0f;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                g1D2 = p200u.u0.d(s0VarG, fValueOf3, java.lang.Float.valueOf(f14), (p200u.I) f15.j(s0VarG.n(), interfaceC1734nR, 0), x0VarI3, "PrefixSuffixOpacity", interfaceC1734nR, 196608);
                T.D d6 = T.D.f12776D;
                pVar21 = (T.p) s0VarG.p();
                interfaceC1734nR.T(-107432127);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[pVar21.ordinal()] == 1) {
                    j10 = j6;
                } else {
                    j10 = jH2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                cVarR = p141o0.C7016y0.r(j10);
                zS = interfaceC1734nR.S(cVarR);
                objG = interfaceC1734nR.g();
                if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                    objG = (p200u.x0) p190t.j.a(aVar).l(cVarR);
                    interfaceC1734nR.K(objG);
                }
                p200u.x0 x0Var = (p200u.x0) objG;
                pVar22 = (T.p) s0VarG.i();
                interfaceC1734nR.T(-107432127);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[pVar22.ordinal()] == 1) {
                    j11 = j6;
                } else {
                    j11 = jH2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                p141o0.C7016y0 c7016y0I = p141o0.C7016y0.i(j11);
                pVar23 = (T.p) s0VarG.p();
                interfaceC1734nR.T(-107432127);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                }
                if (iArr[pVar23.ordinal()] == 1) {
                    jH2 = j6;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                g1D3 = p200u.u0.d(s0VarG, c7016y0I, p141o0.C7016y0.i(jH2), (p200u.I) d6.j(s0VarG.n(), interfaceC1734nR, 0), x0Var, "LabelTextStyleColor", interfaceC1734nR, 196608);
                T.B b10 = T.B.f12774D;
                interfaceC1734nR.T(1023351670);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                cVarR2 = p141o0.C7016y0.r(jE);
                zS2 = interfaceC1734nR.S(cVarR2);
                objG2 = interfaceC1734nR.g();
                if (zS2 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                    objG2 = (p200u.x0) p190t.j.a(aVar).l(cVarR2);
                    interfaceC1734nR.K(objG2);
                }
                p200u.x0 x0Var2 = (p200u.x0) objG2;
                interfaceC1734nR.T(1023351670);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                p141o0.C7016y0 c7016y0I2 = p141o0.C7016y0.i(jE);
                interfaceC1734nR.T(1023351670);
                if (V.AbstractC1741q.H()) {
                    i45 = 0;
                    V.AbstractC1741q.Q(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                } else {
                    i45 = 0;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                g1D4 = p200u.u0.d(s0VarG, c7016y0I2, p141o0.C7016y0.i(jE), (p200u.I) b10.j(s0VarG.n(), interfaceC1734nR, java.lang.Integer.valueOf(i45)), x0Var2, "LabelContentColor", interfaceC1734nR, 196608);
                fFloatValue = ((java.lang.Number) g1D5.getValue()).floatValue();
                interfaceC1734nR.T(-156998101);
                if (pVar2 == null) {
                    aVarE = null;
                } else {
                    aVarE = p031d0.c.e(-1236585568, true, new T.A.d(pA, pC, fFloatValue, g1D4, pVar2, z18, g1D3), interfaceC1734nR, 54);
                }
                interfaceC1734nR.J();
                z20 = z13;
                boolean z22 = z14;
                long jG = i1Var.g(z20, z22, zBooleanValue);
                objG3 = interfaceC1734nR.g();
                aVar2 = V.InterfaceC1734n.f14931a;
                if (objG3 == aVar2.a()) {
                    objG3 = V.v1.d(V.v1.p(), new T.A.k(g1D));
                    interfaceC1734nR.K(objG3);
                }
                V.G1 g10 = (V.G1) objG3;
                interfaceC1734nR.T(-156965270);
                if (pVar10 == 0 && strI.length() == 0 && b(g10)) {
                    aVarE2 = p031d0.c.e(-660524084, true, new T.A.f(g1D, jG, pA, pVar10), interfaceC1734nR, 54);
                } else {
                    aVarE2 = null;
                }
                interfaceC1734nR.J();
                long jH4 = i1Var.h(z20, z22, zBooleanValue);
                objG4 = interfaceC1734nR.g();
                if (objG4 == aVar2.a()) {
                    objG4 = V.v1.d(V.v1.p(), new T.A.l(g1D2));
                    interfaceC1734nR.K(objG4);
                }
                V.G1 g11 = (V.G1) objG4;
                interfaceC1734nR.T(-156940524);
                if (pVar17 == null && c(g11)) {
                    aVarE3 = p031d0.c.e(274398694, true, new T.A.g(g1D2, jH4, pA, pVar17), interfaceC1734nR, 54);
                } else {
                    aVarE3 = null;
                }
                interfaceC1734nR.J();
                long jI = i1Var.i(z20, z22, zBooleanValue);
                interfaceC1734nR.T(-156921964);
                if (pVar19 == null && c(g11)) {
                    aVarE4 = p031d0.c.e(-1526229403, true, new T.A.h(g1D2, jI, pA, pVar19), interfaceC1734nR, 54);
                } else {
                    aVarE4 = null;
                }
                interfaceC1734nR.J();
                jF = i1Var.f(z20, z22, zBooleanValue);
                interfaceC1734nR.T(-156902962);
                if (pVar11 == 0) {
                    pVar24 = pVar11;
                    aVarE5 = null;
                } else {
                    pVar24 = pVar11;
                    aVarE5 = p031d0.c.e(-130107406, true, new T.A.e(jF, pVar24), interfaceC1734nR, 54);
                }
                interfaceC1734nR.J();
                jL = i1Var.l(z20, z22, zBooleanValue);
                interfaceC1734nR.T(-156893937);
                if (pVar20 == null) {
                    pVar25 = pVar20;
                    i46 = 1;
                    i47 = 54;
                    aVarE6 = null;
                } else {
                    pVar25 = pVar20;
                    i46 = 1;
                    i47 = 54;
                    aVarE6 = p031d0.c.e(2079816678, true, new T.A.j(jL, pVar25), interfaceC1734nR, 54);
                }
                interfaceC1734nR.J();
                j12 = i1Var.j(z20, z22, zBooleanValue);
                interfaceC1734nR.T(-156884470);
                if (pVar18 == null) {
                    i48 = i46;
                    pVar26 = pVar18;
                    aVarE7 = null;
                } else {
                    pVar26 = pVar18;
                    i48 = 1;
                    aVarE7 = p031d0.c.e(1263707005, true, new T.A.i(j12, pC, pVar26), interfaceC1734nR, i47);
                }
                interfaceC1734nR.J();
                i49 = T.A.p.f12767a[g6.ordinal()];
                if (i49 != i48) {
                    if (i49 != 2) {
                        interfaceC1734nR.T(-565271199);
                        interfaceC1734nR.J();
                        p087i7.M m6 = p087i7.M.f46721a;
                        pVar24 = pVar24;
                        z20 = z20;
                        pVar25 = pVar25;
                    } else {
                        interfaceC1734nR.T(-567018607);
                        objG5 = interfaceC1734nR.g();
                        if (objG5 == aVar2.a()) {
                            objG5 = V.A1.d(p131n0.m.c(p131n0.m.f51333b.b()), null, 2, null);
                            interfaceC1734nR.K(objG5);
                        }
                        interfaceC1753w0 = (V.InterfaceC1753w0) objG5;
                        p031d0.a aVarE8 = p031d0.c.e(157291737, true, new T.A.b(interfaceC1753w0, b6, pVar9), interfaceC1734nR, 54);
                        androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.f19586a;
                        zH = interfaceC1734nR.h(fFloatValue);
                        objG6 = interfaceC1734nR.g();
                        if (zH || objG6 == aVar2.a()) {
                            objG6 = new T.A.a(fFloatValue, interfaceC1753w0);
                            interfaceC1734nR.K(objG6);
                        }
                        S.AbstractC1590y0.c(aVar3, pVar, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z12, fFloatValue, (p237x7.l) objG6, aVarE8, aVarE7, b6, interfaceC1734nR, ((i37 >> 3) & 112) | 6 | ((i38 << 21) & 234881024), ((i38 >> 6) & 7168) | 48);
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    z21 = z22;
                    pVar27 = pVar17;
                    pVar28 = pVar19;
                    pVar29 = pVar25;
                    pVar30 = pVar24;
                    pVar31 = pVar10;
                } else {
                    interfaceC1734nR.T(-568105095);
                    S.k1.b(androidx.compose.ui.d.f19586a, pVar, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z12, fFloatValue, p031d0.c.e(1750327932, true, new T.A.c(pVar9), interfaceC1734nR, 54), aVarE7, b6, interfaceC1734nR, ((i37 >> 3) & 112) | 6 | ((i38 << 21) & 234881024), ((i38 >> 9) & 896) | 6);
                }
                interfaceC1734nR.J();
                p087i7.M m10 = p087i7.M.f46721a;
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                z21 = z22;
                pVar27 = pVar17;
                pVar28 = pVar19;
                pVar29 = pVar25;
                pVar30 = pVar24;
                pVar31 = pVar10;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new T.A.m(g6, str, pVar, g0Var, pVar2, pVar31, pVar30, pVar29, pVar27, pVar28, pVar26, z12, z20, z21, jVar, b6, i1Var, pVar9, i6, i10, i11));
            }
        }
        i50 |= 384;
        if ((i11 & 8) != 0) {
            i50 |= 3072;
        } else if ((i6 & 3072) == 0) {
            if (interfaceC1734nR.S(g0Var)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i50 |= i13;
        }
        if ((i11 & 16) != 0) {
            i50 |= 24576;
        } else if ((i6 & 24576) == 0) {
            if (interfaceC1734nR.l(pVar2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i50 |= i14;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i50 |= 196608;
        } else if ((i6 & 196608) == 0) {
            if (interfaceC1734nR.l(pVar3)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i50 |= i16;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i50 |= 1572864;
        } else if ((i6 & 1572864) == 0) {
            if (interfaceC1734nR.l(pVar4)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i50 |= i18;
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            i50 |= 12582912;
        } else if ((i6 & 12582912) == 0) {
            if (interfaceC1734nR.l(pVar5)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i50 |= i20;
        }
        i21 = i11 & 256;
        if (i21 != 0) {
            i50 |= 100663296;
        } else if ((i6 & 100663296) == 0) {
            if (interfaceC1734nR.l(pVar6)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i50 |= i22;
        }
        i23 = i11 & 512;
        i24 = 805306368;
        if (i23 == 0) {
            i50 |= i24;
        } else if ((i6 & 805306368) == 0) {
            if (interfaceC1734nR.l(pVar7)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i50 |= i24;
        }
        i25 = i11 & 1024;
        if (i25 != 0) {
            i26 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i26 = i10 | (interfaceC1734nR.l(pVar8) ? 4 : 2);
        } else {
            i26 = i10;
        }
        i27 = i11 & 2048;
        if (i27 != 0) {
            i26 |= 48;
        } else if ((i10 & 48) == 0) {
            i26 |= interfaceC1734nR.d(z6) ? 32 : 16;
        }
        i28 = i26;
        i29 = i11 & 4096;
        if (i29 != 0) {
            i28 |= 384;
            i30 = i29;
        } else {
            i30 = i29;
            if ((i10 & 384) != 0) {
                if (interfaceC1734nR.d(z10)) {
                    i31 = 256;
                } else {
                    i31 = 128;
                }
                i28 |= i31;
            }
        }
        i32 = i11 & 8192;
        if (i32 != 0) {
            i28 |= 3072;
        } else if ((i10 & 3072) != 0) {
            if (interfaceC1734nR.d(z11)) {
                i33 = 2048;
            } else {
                i33 = 1024;
            }
            i28 |= i33;
        }
        if ((i11 & 16384) != 0) {
            i28 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i28 |= interfaceC1734nR.S(jVar) ? 16384 : 8192;
        }
        if ((32768 & i11) != 0) {
            i28 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (interfaceC1734nR.S(b6)) {
                i34 = 131072;
            } else {
                i34 = 65536;
            }
            i28 |= i34;
        }
        if ((65536 & i11) != 0) {
            i28 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (interfaceC1734nR.S(i1Var)) {
                i35 = 1048576;
            } else {
                i35 = 524288;
            }
            i28 |= i35;
        }
        if ((131072 & i11) != 0) {
            i28 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (interfaceC1734nR.l(pVar9)) {
                i36 = 8388608;
            } else {
                i36 = 4194304;
            }
            i28 |= i36;
        }
        if ((306783379 & i50) != 306783378) {
            if (i15 != 0) {
                pVar10 = null;
            } else {
                pVar10 = pVar3;
            }
            if (i17 != 0) {
                pVar11 = null;
            } else {
                pVar11 = pVar4;
            }
            if (i19 != 0) {
                pVar12 = null;
            } else {
                pVar12 = pVar5;
            }
            if (i21 != 0) {
                pVar13 = null;
            } else {
                pVar13 = pVar6;
            }
            if (i23 != 0) {
                pVar14 = null;
            } else {
                pVar14 = pVar7;
            }
            if (i25 != 0) {
                pVar15 = null;
            } else {
                pVar15 = pVar8;
            }
            if (i27 != 0) {
                z12 = false;
            } else {
                z12 = z6;
            }
            if (i30 != 0) {
                z13 = true;
            } else {
                z13 = z10;
            }
            if (i32 != 0) {
                z14 = false;
            } else {
                z14 = z11;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1514469103, i50, i28, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
            }
            if ((i50 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            i37 = i50;
            if ((i50 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z16 | z15;
            java.lang.Object objG8 = interfaceC1734nR.g();
            if (z17) {
                objA = g0Var.a(new M0.C1332d(str, null, null, 6, null));
                interfaceC1734nR.K(objA);
            } else {
                objA = g0Var.a(new M0.C1332d(str, null, null, 6, null));
                interfaceC1734nR.K(objA);
            }
            strI = ((S0.e0) objA).b().i();
            zBooleanValue = ((java.lang.Boolean) p250z.f.a(jVar, interfaceC1734nR, (i28 >> 12) & 14).getValue()).booleanValue();
            if (zBooleanValue) {
                pVar16 = T.p.Focused;
            } else if (strI.length() == 0) {
                pVar16 = T.p.UnfocusedEmpty;
            } else {
                pVar16 = T.p.UnfocusedNotEmpty;
            }
            T.p pVar39 = pVar16;
            jE = i1Var.e(z13, z14, zBooleanValue);
            i38 = i28;
            S.A1 a1C2 = S.C1562o0.f11478a.c(interfaceC1734nR, 6);
            pA = a1C2.a();
            pC = a1C2.c();
            pVar17 = pVar13;
            pVar18 = pVar15;
            long jH5 = pA.h();
            aVar = p141o0.C7016y0.f52264b;
            pVar19 = pVar14;
            if (p141o0.C7016y0.o(jH5, aVar.g())) {
            }
            jH = pC.h();
            if (z18) {
                jH = jE;
            }
            jH2 = pA.h();
            if (z18) {
                jH2 = jE;
            }
            j6 = jH;
            if (pVar2 != null) {
                z19 = true;
            } else {
                z19 = false;
            }
            p200u.s0 s0VarG2 = p200u.u0.g(pVar39, "TextFieldInputState", interfaceC1734nR, 48, 0);
            T.C c10 = T.C.f12775D;
            p247y7.C7344m c7344m2 = p247y7.C7344m.f57303a;
            p200u.x0 x0VarI4 = p200u.z0.i(c7344m2);
            T.p pVar310 = (T.p) s0VarG2.i();
            pVar20 = pVar12;
            interfaceC1734nR.T(-2036730335);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
            }
            iArr = T.A.p.f12768b;
            i39 = iArr[pVar310.ordinal()];
            if (i39 == 1) {
                f6 = 1.0f;
            } else if (i39 != 2) {
                if (i39 != 3) {
                    throw new p087i7.s();
                }
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            java.lang.Float fValueOf4 = java.lang.Float.valueOf(f6);
            T.p pVar311 = (T.p) s0VarG2.p();
            interfaceC1734nR.T(-2036730335);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
            }
            i40 = iArr[pVar311.ordinal()];
            if (i40 == 1) {
                f10 = 1.0f;
            } else if (i40 != 2) {
                if (i40 != 3) {
                    throw new p087i7.s();
                }
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            V.G1 g1D6 = p200u.u0.d(s0VarG2, fValueOf4, java.lang.Float.valueOf(f10), (p200u.I) c10.j(s0VarG2.n(), interfaceC1734nR, 0), x0VarI4, "LabelProgress", interfaceC1734nR, 196608);
            T.E e10 = T.E.f12777D;
            p200u.x0 x0VarI5 = p200u.z0.i(c7344m2);
            T.p pVar312 = (T.p) s0VarG2.i();
            interfaceC1734nR.T(1435837472);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
            }
            i41 = iArr[pVar312.ordinal()];
            if (i41 == 1) {
                f11 = 1.0f;
            } else {
                if (i41 != 2) {
                    if (i41 != 3) {
                        throw new p087i7.s();
                    }
                } else if (!z19) {
                    f11 = 1.0f;
                }
                f11 = 0.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            java.lang.Float fValueOf5 = java.lang.Float.valueOf(f11);
            T.p pVar313 = (T.p) s0VarG2.p();
            interfaceC1734nR.T(1435837472);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
            }
            i42 = iArr[pVar313.ordinal()];
            if (i42 == 1) {
                f12 = 1.0f;
            } else {
                if (i42 != 2) {
                    if (i42 != 3) {
                        throw new p087i7.s();
                    }
                } else if (!z19) {
                    f12 = 1.0f;
                }
                f12 = 0.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            g1D = p200u.u0.d(s0VarG2, fValueOf5, java.lang.Float.valueOf(f12), (p200u.I) e10.j(s0VarG2.n(), interfaceC1734nR, 0), x0VarI5, "PlaceholderOpacity", interfaceC1734nR, 196608);
            T.F f16 = T.F.f12778D;
            p200u.x0 x0VarI6 = p200u.z0.i(c7344m2);
            T.p pVar314 = (T.p) s0VarG2.i();
            interfaceC1734nR.T(1128033978);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
            }
            i43 = iArr[pVar314.ordinal()];
            if (i43 == 1) {
                f13 = 1.0f;
            } else {
                if (i43 != 2) {
                    if (i43 != 3) {
                        throw new p087i7.s();
                    }
                } else if (z19) {
                    f13 = 0.0f;
                }
                f13 = 1.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            java.lang.Float fValueOf6 = java.lang.Float.valueOf(f13);
            T.p pVar315 = (T.p) s0VarG2.p();
            interfaceC1734nR.T(1128033978);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
            }
            i44 = iArr[pVar315.ordinal()];
            if (i44 == 1) {
                f14 = 1.0f;
            } else {
                if (i44 != 2) {
                    if (i44 != 3) {
                        throw new p087i7.s();
                    }
                } else if (z19) {
                    f14 = 0.0f;
                }
                f14 = 1.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            g1D2 = p200u.u0.d(s0VarG2, fValueOf6, java.lang.Float.valueOf(f14), (p200u.I) f16.j(s0VarG2.n(), interfaceC1734nR, 0), x0VarI6, "PrefixSuffixOpacity", interfaceC1734nR, 196608);
            T.D d10 = T.D.f12776D;
            pVar21 = (T.p) s0VarG2.p();
            interfaceC1734nR.T(-107432127);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            if (iArr[pVar21.ordinal()] == 1) {
                j10 = j6;
            } else {
                j10 = jH2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            cVarR = p141o0.C7016y0.r(j10);
            zS = interfaceC1734nR.S(cVarR);
            objG = interfaceC1734nR.g();
            if (zS) {
                objG = (p200u.x0) p190t.j.a(aVar).l(cVarR);
                interfaceC1734nR.K(objG);
            } else {
                objG = (p200u.x0) p190t.j.a(aVar).l(cVarR);
                interfaceC1734nR.K(objG);
            }
            p200u.x0 x0Var3 = (p200u.x0) objG;
            pVar22 = (T.p) s0VarG2.i();
            interfaceC1734nR.T(-107432127);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            if (iArr[pVar22.ordinal()] == 1) {
                j11 = j6;
            } else {
                j11 = jH2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            p141o0.C7016y0 c7016y0I3 = p141o0.C7016y0.i(j11);
            pVar23 = (T.p) s0VarG2.p();
            interfaceC1734nR.T(-107432127);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            if (iArr[pVar23.ordinal()] == 1) {
                jH2 = j6;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            g1D3 = p200u.u0.d(s0VarG2, c7016y0I3, p141o0.C7016y0.i(jH2), (p200u.I) d10.j(s0VarG2.n(), interfaceC1734nR, 0), x0Var3, "LabelTextStyleColor", interfaceC1734nR, 196608);
            T.B b11 = T.B.f12774D;
            interfaceC1734nR.T(1023351670);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            cVarR2 = p141o0.C7016y0.r(jE);
            zS2 = interfaceC1734nR.S(cVarR2);
            objG2 = interfaceC1734nR.g();
            if (zS2) {
                objG2 = (p200u.x0) p190t.j.a(aVar).l(cVarR2);
                interfaceC1734nR.K(objG2);
            } else {
                objG2 = (p200u.x0) p190t.j.a(aVar).l(cVarR2);
                interfaceC1734nR.K(objG2);
            }
            p200u.x0 x0Var4 = (p200u.x0) objG2;
            interfaceC1734nR.T(1023351670);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            p141o0.C7016y0 c7016y0I4 = p141o0.C7016y0.i(jE);
            interfaceC1734nR.T(1023351670);
            if (V.AbstractC1741q.H()) {
                i45 = 0;
                V.AbstractC1741q.Q(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            } else {
                i45 = 0;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            g1D4 = p200u.u0.d(s0VarG2, c7016y0I4, p141o0.C7016y0.i(jE), (p200u.I) b11.j(s0VarG2.n(), interfaceC1734nR, java.lang.Integer.valueOf(i45)), x0Var4, "LabelContentColor", interfaceC1734nR, 196608);
            fFloatValue = ((java.lang.Number) g1D6.getValue()).floatValue();
            interfaceC1734nR.T(-156998101);
            if (pVar2 == null) {
                aVarE = null;
            } else {
                aVarE = p031d0.c.e(-1236585568, true, new T.A.d(pA, pC, fFloatValue, g1D4, pVar2, z18, g1D3), interfaceC1734nR, 54);
            }
            interfaceC1734nR.J();
            z20 = z13;
            boolean z23 = z14;
            long jG2 = i1Var.g(z20, z23, zBooleanValue);
            objG3 = interfaceC1734nR.g();
            aVar2 = V.InterfaceC1734n.f14931a;
            if (objG3 == aVar2.a()) {
                objG3 = V.v1.d(V.v1.p(), new T.A.k(g1D));
                interfaceC1734nR.K(objG3);
            }
            V.G1 g12 = (V.G1) objG3;
            interfaceC1734nR.T(-156965270);
            if (pVar10 == 0) {
                aVarE2 = null;
            } else {
                aVarE2 = null;
            }
            interfaceC1734nR.J();
            long jH6 = i1Var.h(z20, z23, zBooleanValue);
            objG4 = interfaceC1734nR.g();
            if (objG4 == aVar2.a()) {
                objG4 = V.v1.d(V.v1.p(), new T.A.l(g1D2));
                interfaceC1734nR.K(objG4);
            }
            V.G1 g13 = (V.G1) objG4;
            interfaceC1734nR.T(-156940524);
            if (pVar17 == null) {
                aVarE3 = null;
            } else {
                aVarE3 = null;
            }
            interfaceC1734nR.J();
            long jI2 = i1Var.i(z20, z23, zBooleanValue);
            interfaceC1734nR.T(-156921964);
            if (pVar19 == null) {
                aVarE4 = null;
            } else {
                aVarE4 = null;
            }
            interfaceC1734nR.J();
            jF = i1Var.f(z20, z23, zBooleanValue);
            interfaceC1734nR.T(-156902962);
            if (pVar11 == 0) {
                pVar24 = pVar11;
                aVarE5 = null;
            } else {
                pVar24 = pVar11;
                aVarE5 = p031d0.c.e(-130107406, true, new T.A.e(jF, pVar24), interfaceC1734nR, 54);
            }
            interfaceC1734nR.J();
            jL = i1Var.l(z20, z23, zBooleanValue);
            interfaceC1734nR.T(-156893937);
            if (pVar20 == null) {
                pVar25 = pVar20;
                i46 = 1;
                i47 = 54;
                aVarE6 = null;
            } else {
                pVar25 = pVar20;
                i46 = 1;
                i47 = 54;
                aVarE6 = p031d0.c.e(2079816678, true, new T.A.j(jL, pVar25), interfaceC1734nR, 54);
            }
            interfaceC1734nR.J();
            j12 = i1Var.j(z20, z23, zBooleanValue);
            interfaceC1734nR.T(-156884470);
            if (pVar18 == null) {
                i48 = i46;
                pVar26 = pVar18;
                aVarE7 = null;
            } else {
                pVar26 = pVar18;
                i48 = 1;
                aVarE7 = p031d0.c.e(1263707005, true, new T.A.i(j12, pC, pVar26), interfaceC1734nR, i47);
            }
            interfaceC1734nR.J();
            i49 = T.A.p.f12767a[g6.ordinal()];
            if (i49 != i48) {
                if (i49 != 2) {
                    interfaceC1734nR.T(-565271199);
                    interfaceC1734nR.J();
                    p087i7.M m11 = p087i7.M.f46721a;
                    pVar24 = pVar24;
                    z20 = z20;
                    pVar25 = pVar25;
                } else {
                    interfaceC1734nR.T(-567018607);
                    objG5 = interfaceC1734nR.g();
                    if (objG5 == aVar2.a()) {
                        objG5 = V.A1.d(p131n0.m.c(p131n0.m.f51333b.b()), null, 2, null);
                        interfaceC1734nR.K(objG5);
                    }
                    interfaceC1753w0 = (V.InterfaceC1753w0) objG5;
                    p031d0.a aVarE9 = p031d0.c.e(157291737, true, new T.A.b(interfaceC1753w0, b6, pVar9), interfaceC1734nR, 54);
                    androidx.compose.ui.d.a aVar4 = androidx.compose.ui.d.f19586a;
                    zH = interfaceC1734nR.h(fFloatValue);
                    objG6 = interfaceC1734nR.g();
                    if (zH) {
                        objG6 = new T.A.a(fFloatValue, interfaceC1753w0);
                        interfaceC1734nR.K(objG6);
                    } else {
                        objG6 = new T.A.a(fFloatValue, interfaceC1753w0);
                        interfaceC1734nR.K(objG6);
                    }
                    S.AbstractC1590y0.c(aVar4, pVar, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z12, fFloatValue, (p237x7.l) objG6, aVarE9, aVarE7, b6, interfaceC1734nR, ((i37 >> 3) & 112) | 6 | ((i38 << 21) & 234881024), ((i38 >> 6) & 7168) | 48);
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                z21 = z23;
                pVar27 = pVar17;
                pVar28 = pVar19;
                pVar29 = pVar25;
                pVar30 = pVar24;
                pVar31 = pVar10;
            } else {
                interfaceC1734nR.T(-568105095);
                S.k1.b(androidx.compose.ui.d.f19586a, pVar, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z12, fFloatValue, p031d0.c.e(1750327932, true, new T.A.c(pVar9), interfaceC1734nR, 54), aVarE7, b6, interfaceC1734nR, ((i37 >> 3) & 112) | 6 | ((i38 << 21) & 234881024), ((i38 >> 9) & 896) | 6);
            }
            interfaceC1734nR.J();
            p087i7.M m12 = p087i7.M.f46721a;
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            z21 = z23;
            pVar27 = pVar17;
            pVar28 = pVar19;
            pVar29 = pVar25;
            pVar30 = pVar24;
            pVar31 = pVar10;
        } else {
            if (i15 != 0) {
                pVar10 = null;
            } else {
                pVar10 = pVar3;
            }
            if (i17 != 0) {
                pVar11 = null;
            } else {
                pVar11 = pVar4;
            }
            if (i19 != 0) {
                pVar12 = null;
            } else {
                pVar12 = pVar5;
            }
            if (i21 != 0) {
                pVar13 = null;
            } else {
                pVar13 = pVar6;
            }
            if (i23 != 0) {
                pVar14 = null;
            } else {
                pVar14 = pVar7;
            }
            if (i25 != 0) {
                pVar15 = null;
            } else {
                pVar15 = pVar8;
            }
            if (i27 != 0) {
                z12 = false;
            } else {
                z12 = z6;
            }
            if (i30 != 0) {
                z13 = true;
            } else {
                z13 = z10;
            }
            if (i32 != 0) {
                z14 = false;
            } else {
                z14 = z11;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1514469103, i50, i28, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
            }
            if ((i50 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            i37 = i50;
            if ((i50 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z16 | z15;
            java.lang.Object objG9 = interfaceC1734nR.g();
            if (z17) {
                objA = g0Var.a(new M0.C1332d(str, null, null, 6, null));
                interfaceC1734nR.K(objA);
            } else {
                objA = g0Var.a(new M0.C1332d(str, null, null, 6, null));
                interfaceC1734nR.K(objA);
            }
            strI = ((S0.e0) objA).b().i();
            zBooleanValue = ((java.lang.Boolean) p250z.f.a(jVar, interfaceC1734nR, (i28 >> 12) & 14).getValue()).booleanValue();
            if (zBooleanValue) {
                pVar16 = T.p.Focused;
            } else if (strI.length() == 0) {
                pVar16 = T.p.UnfocusedEmpty;
            } else {
                pVar16 = T.p.UnfocusedNotEmpty;
            }
            T.p pVar316 = pVar16;
            jE = i1Var.e(z13, z14, zBooleanValue);
            i38 = i28;
            S.A1 a1C3 = S.C1562o0.f11478a.c(interfaceC1734nR, 6);
            pA = a1C3.a();
            pC = a1C3.c();
            pVar17 = pVar13;
            pVar18 = pVar15;
            long jH7 = pA.h();
            aVar = p141o0.C7016y0.f52264b;
            pVar19 = pVar14;
            if (p141o0.C7016y0.o(jH7, aVar.g())) {
            }
            jH = pC.h();
            if (z18) {
                jH = jE;
            }
            jH2 = pA.h();
            if (z18) {
                jH2 = jE;
            }
            j6 = jH;
            if (pVar2 != null) {
                z19 = true;
            } else {
                z19 = false;
            }
            p200u.s0 s0VarG3 = p200u.u0.g(pVar316, "TextFieldInputState", interfaceC1734nR, 48, 0);
            T.C c11 = T.C.f12775D;
            p247y7.C7344m c7344m3 = p247y7.C7344m.f57303a;
            p200u.x0 x0VarI7 = p200u.z0.i(c7344m3);
            T.p pVar317 = (T.p) s0VarG3.i();
            pVar20 = pVar12;
            interfaceC1734nR.T(-2036730335);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
            }
            iArr = T.A.p.f12768b;
            i39 = iArr[pVar317.ordinal()];
            if (i39 == 1) {
                f6 = 1.0f;
            } else if (i39 != 2) {
                if (i39 != 3) {
                    throw new p087i7.s();
                }
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            java.lang.Float fValueOf7 = java.lang.Float.valueOf(f6);
            T.p pVar318 = (T.p) s0VarG3.p();
            interfaceC1734nR.T(-2036730335);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
            }
            i40 = iArr[pVar318.ordinal()];
            if (i40 == 1) {
                f10 = 1.0f;
            } else if (i40 != 2) {
                if (i40 != 3) {
                    throw new p087i7.s();
                }
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            V.G1 g1D7 = p200u.u0.d(s0VarG3, fValueOf7, java.lang.Float.valueOf(f10), (p200u.I) c11.j(s0VarG3.n(), interfaceC1734nR, 0), x0VarI7, "LabelProgress", interfaceC1734nR, 196608);
            T.E e11 = T.E.f12777D;
            p200u.x0 x0VarI8 = p200u.z0.i(c7344m3);
            T.p pVar319 = (T.p) s0VarG3.i();
            interfaceC1734nR.T(1435837472);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
            }
            i41 = iArr[pVar319.ordinal()];
            if (i41 == 1) {
                f11 = 1.0f;
            } else {
                if (i41 != 2) {
                    if (i41 != 3) {
                        throw new p087i7.s();
                    }
                } else if (!z19) {
                    f11 = 1.0f;
                }
                f11 = 0.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            java.lang.Float fValueOf8 = java.lang.Float.valueOf(f11);
            T.p pVar3110 = (T.p) s0VarG3.p();
            interfaceC1734nR.T(1435837472);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
            }
            i42 = iArr[pVar3110.ordinal()];
            if (i42 == 1) {
                f12 = 1.0f;
            } else {
                if (i42 != 2) {
                    if (i42 != 3) {
                        throw new p087i7.s();
                    }
                } else if (!z19) {
                    f12 = 1.0f;
                }
                f12 = 0.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            g1D = p200u.u0.d(s0VarG3, fValueOf8, java.lang.Float.valueOf(f12), (p200u.I) e11.j(s0VarG3.n(), interfaceC1734nR, 0), x0VarI8, "PlaceholderOpacity", interfaceC1734nR, 196608);
            T.F f17 = T.F.f12778D;
            p200u.x0 x0VarI9 = p200u.z0.i(c7344m3);
            T.p pVar3111 = (T.p) s0VarG3.i();
            interfaceC1734nR.T(1128033978);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
            }
            i43 = iArr[pVar3111.ordinal()];
            if (i43 == 1) {
                f13 = 1.0f;
            } else {
                if (i43 != 2) {
                    if (i43 != 3) {
                        throw new p087i7.s();
                    }
                } else if (z19) {
                    f13 = 0.0f;
                }
                f13 = 1.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            java.lang.Float fValueOf9 = java.lang.Float.valueOf(f13);
            T.p pVar3112 = (T.p) s0VarG3.p();
            interfaceC1734nR.T(1128033978);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
            }
            i44 = iArr[pVar3112.ordinal()];
            if (i44 == 1) {
                f14 = 1.0f;
            } else {
                if (i44 != 2) {
                    if (i44 != 3) {
                        throw new p087i7.s();
                    }
                } else if (z19) {
                    f14 = 0.0f;
                }
                f14 = 1.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            g1D2 = p200u.u0.d(s0VarG3, fValueOf9, java.lang.Float.valueOf(f14), (p200u.I) f17.j(s0VarG3.n(), interfaceC1734nR, 0), x0VarI9, "PrefixSuffixOpacity", interfaceC1734nR, 196608);
            T.D d11 = T.D.f12776D;
            pVar21 = (T.p) s0VarG3.p();
            interfaceC1734nR.T(-107432127);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            if (iArr[pVar21.ordinal()] == 1) {
                j10 = j6;
            } else {
                j10 = jH2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            cVarR = p141o0.C7016y0.r(j10);
            zS = interfaceC1734nR.S(cVarR);
            objG = interfaceC1734nR.g();
            if (zS) {
                objG = (p200u.x0) p190t.j.a(aVar).l(cVarR);
                interfaceC1734nR.K(objG);
            } else {
                objG = (p200u.x0) p190t.j.a(aVar).l(cVarR);
                interfaceC1734nR.K(objG);
            }
            p200u.x0 x0Var5 = (p200u.x0) objG;
            pVar22 = (T.p) s0VarG3.i();
            interfaceC1734nR.T(-107432127);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            if (iArr[pVar22.ordinal()] == 1) {
                j11 = j6;
            } else {
                j11 = jH2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            p141o0.C7016y0 c7016y0I5 = p141o0.C7016y0.i(j11);
            pVar23 = (T.p) s0VarG3.p();
            interfaceC1734nR.T(-107432127);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            if (iArr[pVar23.ordinal()] == 1) {
                jH2 = j6;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            g1D3 = p200u.u0.d(s0VarG3, c7016y0I5, p141o0.C7016y0.i(jH2), (p200u.I) d11.j(s0VarG3.n(), interfaceC1734nR, 0), x0Var5, "LabelTextStyleColor", interfaceC1734nR, 196608);
            T.B b12 = T.B.f12774D;
            interfaceC1734nR.T(1023351670);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            cVarR2 = p141o0.C7016y0.r(jE);
            zS2 = interfaceC1734nR.S(cVarR2);
            objG2 = interfaceC1734nR.g();
            if (zS2) {
                objG2 = (p200u.x0) p190t.j.a(aVar).l(cVarR2);
                interfaceC1734nR.K(objG2);
            } else {
                objG2 = (p200u.x0) p190t.j.a(aVar).l(cVarR2);
                interfaceC1734nR.K(objG2);
            }
            p200u.x0 x0Var6 = (p200u.x0) objG2;
            interfaceC1734nR.T(1023351670);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            p141o0.C7016y0 c7016y0I6 = p141o0.C7016y0.i(jE);
            interfaceC1734nR.T(1023351670);
            if (V.AbstractC1741q.H()) {
                i45 = 0;
                V.AbstractC1741q.Q(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            } else {
                i45 = 0;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            g1D4 = p200u.u0.d(s0VarG3, c7016y0I6, p141o0.C7016y0.i(jE), (p200u.I) b12.j(s0VarG3.n(), interfaceC1734nR, java.lang.Integer.valueOf(i45)), x0Var6, "LabelContentColor", interfaceC1734nR, 196608);
            fFloatValue = ((java.lang.Number) g1D7.getValue()).floatValue();
            interfaceC1734nR.T(-156998101);
            if (pVar2 == null) {
                aVarE = null;
            } else {
                aVarE = p031d0.c.e(-1236585568, true, new T.A.d(pA, pC, fFloatValue, g1D4, pVar2, z18, g1D3), interfaceC1734nR, 54);
            }
            interfaceC1734nR.J();
            z20 = z13;
            boolean z24 = z14;
            long jG3 = i1Var.g(z20, z24, zBooleanValue);
            objG3 = interfaceC1734nR.g();
            aVar2 = V.InterfaceC1734n.f14931a;
            if (objG3 == aVar2.a()) {
                objG3 = V.v1.d(V.v1.p(), new T.A.k(g1D));
                interfaceC1734nR.K(objG3);
            }
            V.G1 g14 = (V.G1) objG3;
            interfaceC1734nR.T(-156965270);
            if (pVar10 == 0) {
                aVarE2 = null;
            } else {
                aVarE2 = null;
            }
            interfaceC1734nR.J();
            long jH8 = i1Var.h(z20, z24, zBooleanValue);
            objG4 = interfaceC1734nR.g();
            if (objG4 == aVar2.a()) {
                objG4 = V.v1.d(V.v1.p(), new T.A.l(g1D2));
                interfaceC1734nR.K(objG4);
            }
            V.G1 g15 = (V.G1) objG4;
            interfaceC1734nR.T(-156940524);
            if (pVar17 == null) {
                aVarE3 = null;
            } else {
                aVarE3 = null;
            }
            interfaceC1734nR.J();
            long jI3 = i1Var.i(z20, z24, zBooleanValue);
            interfaceC1734nR.T(-156921964);
            if (pVar19 == null) {
                aVarE4 = null;
            } else {
                aVarE4 = null;
            }
            interfaceC1734nR.J();
            jF = i1Var.f(z20, z24, zBooleanValue);
            interfaceC1734nR.T(-156902962);
            if (pVar11 == 0) {
                pVar24 = pVar11;
                aVarE5 = null;
            } else {
                pVar24 = pVar11;
                aVarE5 = p031d0.c.e(-130107406, true, new T.A.e(jF, pVar24), interfaceC1734nR, 54);
            }
            interfaceC1734nR.J();
            jL = i1Var.l(z20, z24, zBooleanValue);
            interfaceC1734nR.T(-156893937);
            if (pVar20 == null) {
                pVar25 = pVar20;
                i46 = 1;
                i47 = 54;
                aVarE6 = null;
            } else {
                pVar25 = pVar20;
                i46 = 1;
                i47 = 54;
                aVarE6 = p031d0.c.e(2079816678, true, new T.A.j(jL, pVar25), interfaceC1734nR, 54);
            }
            interfaceC1734nR.J();
            j12 = i1Var.j(z20, z24, zBooleanValue);
            interfaceC1734nR.T(-156884470);
            if (pVar18 == null) {
                i48 = i46;
                pVar26 = pVar18;
                aVarE7 = null;
            } else {
                pVar26 = pVar18;
                i48 = 1;
                aVarE7 = p031d0.c.e(1263707005, true, new T.A.i(j12, pC, pVar26), interfaceC1734nR, i47);
            }
            interfaceC1734nR.J();
            i49 = T.A.p.f12767a[g6.ordinal()];
            if (i49 != i48) {
                if (i49 != 2) {
                    interfaceC1734nR.T(-565271199);
                    interfaceC1734nR.J();
                    p087i7.M m13 = p087i7.M.f46721a;
                    pVar24 = pVar24;
                    z20 = z20;
                    pVar25 = pVar25;
                } else {
                    interfaceC1734nR.T(-567018607);
                    objG5 = interfaceC1734nR.g();
                    if (objG5 == aVar2.a()) {
                        objG5 = V.A1.d(p131n0.m.c(p131n0.m.f51333b.b()), null, 2, null);
                        interfaceC1734nR.K(objG5);
                    }
                    interfaceC1753w0 = (V.InterfaceC1753w0) objG5;
                    p031d0.a aVarE10 = p031d0.c.e(157291737, true, new T.A.b(interfaceC1753w0, b6, pVar9), interfaceC1734nR, 54);
                    androidx.compose.ui.d.a aVar5 = androidx.compose.ui.d.f19586a;
                    zH = interfaceC1734nR.h(fFloatValue);
                    objG6 = interfaceC1734nR.g();
                    if (zH) {
                        objG6 = new T.A.a(fFloatValue, interfaceC1753w0);
                        interfaceC1734nR.K(objG6);
                    } else {
                        objG6 = new T.A.a(fFloatValue, interfaceC1753w0);
                        interfaceC1734nR.K(objG6);
                    }
                    S.AbstractC1590y0.c(aVar5, pVar, aVarE2, aVarE, aVarE5, aVarE6, aVarE3, aVarE4, z12, fFloatValue, (p237x7.l) objG6, aVarE10, aVarE7, b6, interfaceC1734nR, ((i37 >> 3) & 112) | 6 | ((i38 << 21) & 234881024), ((i38 >> 6) & 7168) | 48);
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                z21 = z24;
                pVar27 = pVar17;
                pVar28 = pVar19;
                pVar29 = pVar25;
                pVar30 = pVar24;
                pVar31 = pVar10;
            } else {
                interfaceC1734nR.T(-568105095);
                S.k1.b(androidx.compose.ui.d.f19586a, pVar, aVarE, aVarE2, aVarE5, aVarE6, aVarE3, aVarE4, z12, fFloatValue, p031d0.c.e(1750327932, true, new T.A.c(pVar9), interfaceC1734nR, 54), aVarE7, b6, interfaceC1734nR, ((i37 >> 3) & 112) | 6 | ((i38 << 21) & 234881024), ((i38 >> 9) & 896) | 6);
            }
            interfaceC1734nR.J();
            p087i7.M m14 = p087i7.M.f46721a;
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            z21 = z24;
            pVar27 = pVar17;
            pVar28 = pVar19;
            pVar29 = pVar25;
            pVar30 = pVar24;
            pVar31 = pVar10;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new T.A.m(g6, str, pVar, g0Var, pVar2, pVar31, pVar30, pVar29, pVar27, pVar28, pVar26, z12, z20, z21, jVar, b6, i1Var, pVar9, i6, i10, i11));
        }
    }

    private static final boolean b(V.G1 g6) {
        return ((java.lang.Boolean) g6.getValue()).booleanValue();
    }

    private static final boolean c(V.G1 g6) {
        return ((java.lang.Boolean) g6.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(long j6, M0.P p6, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1208685580);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.j(j6) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.S(p6) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.l(pVar) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1208685580, i10, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
            }
            T.w.a(j6, p6, pVar, interfaceC1734nR, i10 & 1022);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new T.A.n(j6, p6, pVar, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(long j6, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(660142980);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.j(j6) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.l(pVar) ? 32 : 16;
        }
        if ((i10 & 19) == 18 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(660142980, i10, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
            }
            V.AbstractC1756y.a(S.J.a().d(p141o0.C7016y0.i(j6)), pVar, interfaceC1734nR, (i10 & 112) | V.P0.f14698i);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new T.A.o(j6, pVar, i6));
        }
    }

    public static final V.G1 h(boolean z6, boolean z10, boolean z11, S.i1 i1Var, float f6, float f10, V.InterfaceC1734n interfaceC1734n, int i6) {
        V.G1 g1N;
        V.G1 g1N2;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(2047013045, i6, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
        }
        long jD = i1Var.d(z6, z10, z11);
        if (z6) {
            interfaceC1734n.T(1023053998);
            g1N = p190t.w.a(jD, p200u.AbstractC7177k.l(150, 0, null, 6, null), null, null, interfaceC1734n, 48, 12);
        } else {
            interfaceC1734n.T(1023165505);
            g1N = V.v1.n(p141o0.C7016y0.i(jD), interfaceC1734n, 0);
        }
        interfaceC1734n.J();
        V.G1 g6 = g1N;
        if (z6) {
            interfaceC1734n.T(1023269417);
            g1N2 = p200u.AbstractC7161c.c(z11 ? f6 : f10, p200u.AbstractC7177k.l(150, 0, null, 6, null), null, null, interfaceC1734n, 48, 12);
        } else {
            interfaceC1734n.T(1023478388);
            g1N2 = V.v1.n(Y0.i.m(f10), interfaceC1734n, (i6 >> 15) & 14);
        }
        interfaceC1734n.J();
        V.G1 g1N3 = V.v1.n(p210v.AbstractC7214h.a(((Y0.i) g1N2.getValue()).v(), ((p141o0.C7016y0) g6.getValue()).w()), interfaceC1734n, 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1N3;
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, boolean z6, java.lang.String str) {
        return z6 ? K0.n.d(dVar, false, new T.A.q(str), 1, null) : dVar;
    }

    public static final float j() {
        return f12695c;
    }

    public static final androidx.compose.ui.d k() {
        return f12701i;
    }

    public static final java.lang.Object l(D0.InterfaceC0895n interfaceC0895n) {
        java.lang.Object objZ = interfaceC0895n.Z();
        D0.InterfaceC0903w interfaceC0903w = objZ instanceof D0.InterfaceC0903w ? (D0.InterfaceC0903w) objZ : null;
        if (interfaceC0903w != null) {
            return interfaceC0903w.Q();
        }
        return null;
    }

    public static final float m() {
        return f12699g;
    }

    public static final float n() {
        return f12700h;
    }

    public static final float o() {
        return f12698f;
    }

    public static final float p() {
        return f12697e;
    }

    public static final float q() {
        return f12696d;
    }

    public static final float r() {
        return f12694b;
    }

    public static final long s() {
        return f12693a;
    }

    public static final int t(D0.X x6) {
        if (x6 != null) {
            return x6.w0();
        }
        return 0;
    }

    public static final androidx.compose.ui.d u(androidx.compose.ui.d dVar, p141o0.B0 b6, p141o0.e2 e2Var) {
        return androidx.compose.ui.draw.b.c(dVar, new T.A.r(e2Var, b6));
    }

    public static final int v(D0.X x6) {
        if (x6 != null) {
            return x6.I0();
        }
        return 0;
    }
}
