package D0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D0.g0.a f1844a = new D0.g0.a();

    public static final class a {
        a() {
        }

        public java.lang.String toString() {
            return "ReusedSlotId";
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f1845D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f1846E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f1847F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f1848G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar, p237x7.p pVar, int i6, int i10) {
            super(2);
            this.f1845D = dVar;
            this.f1846E = pVar;
            this.f1847F = i6;
            this.f1848G = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            D0.g0.b(this.f1845D, this.f1846E, interfaceC1734n, V.S0.a(this.f1847F | 1), this.f1848G);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.i0 f1849D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(D0.i0 i0Var) {
            super(0);
            this.f1849D = i0Var;
        }

        public final void a() {
            this.f1849D.d();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.i0 f1850D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f1851E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f1852F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f1853G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f1854H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(D0.i0 i0Var, androidx.compose.ui.d dVar, p237x7.p pVar, int i6, int i10) {
            super(2);
            this.f1850D = i0Var;
            this.f1851E = dVar;
            this.f1852F = pVar;
            this.f1853G = i6;
            this.f1854H = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            D0.g0.a(this.f1850D, this.f1851E, this.f1852F, interfaceC1734n, V.S0.a(this.f1853G | 1), this.f1854H);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(D0.i0 i0Var, androidx.compose.ui.d dVar, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-511989831);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.l(i0Var) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        int i12 = i10 & 2;
        if (i12 != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.S(dVar) ? 32 : 16;
        }
        if ((i10 & 4) != 0) {
            i11 |= 384;
        } else if ((i6 & 384) == 0) {
            i11 |= interfaceC1734nR.l(pVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (i12 != 0) {
                dVar = androidx.compose.ui.d.f19586a;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-511989831, i11, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:112)");
            }
            int iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.AbstractC1744s abstractC1744sD = V.AbstractC1725k.d(interfaceC1734nR, 0);
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734nR, dVar);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734nR.F();
            p237x7.a aVarA = F0.J.f2334n0.a();
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
            V.L1.c(interfaceC1734nA, i0Var, i0Var.g());
            V.L1.c(interfaceC1734nA, abstractC1744sD, i0Var.e());
            V.L1.c(interfaceC1734nA, pVar, i0Var.f());
            F0.InterfaceC0919g.a aVar = F0.InterfaceC0919g.f2641a;
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar.e());
            V.L1.c(interfaceC1734nA, dVarE, aVar.d());
            p237x7.p pVarB = aVar.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            interfaceC1734nR.Q();
            if (interfaceC1734nR.u()) {
                interfaceC1734nR.T(-26502501);
            } else {
                interfaceC1734nR.T(-26580342);
                boolean zL = interfaceC1734nR.l(i0Var);
                java.lang.Object objG = interfaceC1734nR.g();
                if (zL || objG == V.InterfaceC1734n.f14931a.a()) {
                    objG = new D0.g0.c(i0Var);
                    interfaceC1734nR.K(objG);
                }
                V.Q.f((p237x7.a) objG, interfaceC1734nR, 0);
            }
            interfaceC1734nR.J();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        androidx.compose.ui.d dVar2 = dVar;
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new D0.g0.d(i0Var, dVar2, pVar, i6, i10));
        }
    }

    public static final void b(androidx.compose.ui.d dVar, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1298353104);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.l(pVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (i12 != 0) {
                dVar = androidx.compose.ui.d.f19586a;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1298353104, i11, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:78)");
            }
            java.lang.Object objG = interfaceC1734nR.g();
            if (objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new D0.i0();
                interfaceC1734nR.K(objG);
            }
            a((D0.i0) objG, dVar, pVar, interfaceC1734nR, (i11 << 3) & 1008, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new D0.g0.b(dVar, pVar, i6, i10));
        }
    }
}
