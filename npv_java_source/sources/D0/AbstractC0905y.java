package D0;

/* JADX INFO: renamed from: D0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0905y {

    /* JADX INFO: renamed from: D0.y$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final D0.AbstractC0905y.a f1891D = new D0.AbstractC0905y.a();

        a() {
            super(1);
        }

        public final void a(F0.J j6) {
            j6.A1(true);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((F0.J) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: D0.y$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f1892D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f1893E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ D0.I f1894F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f1895G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f1896H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar, p237x7.p pVar, D0.I i6, int i10, int i11) {
            super(2);
            this.f1892D = dVar;
            this.f1893E = pVar;
            this.f1894F = i6;
            this.f1895G = i10;
            this.f1896H = i11;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            D0.AbstractC0905y.a(this.f1892D, this.f1893E, this.f1894F, interfaceC1734n, V.S0.a(this.f1895G | 1), this.f1896H);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, p237x7.p pVar, D0.I i6, V.InterfaceC1734n interfaceC1734n, int i10, int i11) {
        int i12;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1949933075);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC1734nR.l(pVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC1734nR.S(i6) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f19586a;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1949933075, i12, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:248)");
            }
            int iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734nR, dVar);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734nR.F();
            p237x7.a aVarA = F0.J.f2334n0.a();
            int i14 = ((i12 << 3) & 896) | 6;
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
            F0.InterfaceC0919g.a aVar = F0.InterfaceC0919g.f2641a;
            V.L1.c(interfaceC1734nA, i6, aVar.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar.e());
            V.L1.b(interfaceC1734nA, D0.AbstractC0905y.a.f1891D);
            V.L1.c(interfaceC1734nA, dVarE, aVar.d());
            p237x7.p pVarB = aVar.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            pVar.u(interfaceC1734nR, java.lang.Integer.valueOf((i14 >> 6) & 14));
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        androidx.compose.ui.d dVar2 = dVar;
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new D0.AbstractC0905y.b(dVar2, pVar, i6, i10, i11));
        }
    }
}
