package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.HashMap f19237a = d(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.HashMap f19238b = d(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final D0.I f19239c = new androidx.compose.foundation.layout.e(p071h0.c.f45778a.o(), false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final D0.I f19240d = androidx.compose.foundation.layout.d.b.f19243a;

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f19241D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f19242E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.d dVar, int i6) {
            super(2);
            this.f19241D = dVar;
            this.f19242E = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            androidx.compose.foundation.layout.d.a(this.f19241D, interfaceC1734n, V.S0.a(this.f19242E | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class b implements D0.I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.compose.foundation.layout.d.b f19243a = new androidx.compose.foundation.layout.d.b();

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final androidx.compose.foundation.layout.d.b.a f19244D = new androidx.compose.foundation.layout.d.b.a();

            a() {
                super(1);
            }

            public final void a(D0.X.a aVar) {
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        b() {
        }

        @Override // D0.I
        public /* synthetic */ int a(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return D0.H.b(this, interfaceC0896o, list, i6);
        }

        @Override // D0.I
        public final D0.K b(D0.M m6, java.util.List list, long j6) {
            return D0.L.b(m6, Y0.C1859b.n(j6), Y0.C1859b.m(j6), null, androidx.compose.foundation.layout.d.b.a.f19244D, 4, null);
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

    public static final void a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-211209833);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i10 & 3) == 2 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-211209833, i10, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            D0.I i11 = f19240d;
            int iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734nR, dVar);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734nR.F();
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
            V.L1.c(interfaceC1734nA, i11, aVar.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar.e());
            V.L1.c(interfaceC1734nA, dVarE, aVar.d());
            p237x7.p pVarB = aVar.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new androidx.compose.foundation.layout.d.a(dVar, i6));
        }
    }

    private static final java.util.HashMap d(boolean z6) {
        java.util.HashMap map = new java.util.HashMap(9);
        h0.c.a aVar = p071h0.c.f45778a;
        e(map, z6, aVar.o());
        e(map, z6, aVar.m());
        e(map, z6, aVar.n());
        e(map, z6, aVar.h());
        e(map, z6, aVar.e());
        e(map, z6, aVar.f());
        e(map, z6, aVar.d());
        e(map, z6, aVar.b());
        e(map, z6, aVar.c());
        return map;
    }

    private static final void e(java.util.HashMap map, boolean z6, p071h0.c cVar) {
        map.put(cVar, new androidx.compose.foundation.layout.e(cVar, z6));
    }

    private static final androidx.compose.foundation.layout.c f(D0.G g6) {
        java.lang.Object objZ = g6.Z();
        if (objZ instanceof androidx.compose.foundation.layout.c) {
            return (androidx.compose.foundation.layout.c) objZ;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(D0.G g6) {
        androidx.compose.foundation.layout.c cVarF = f(g6);
        if (cVarF != null) {
            return cVarF.U1();
        }
        return false;
    }

    public static final D0.I h(p071h0.c cVar, boolean z6) {
        D0.I i6 = (D0.I) (z6 ? f19237a : f19238b).get(cVar);
        return i6 == null ? new androidx.compose.foundation.layout.e(cVar, z6) : i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(D0.X.a aVar, D0.X x6, D0.G g6, Y0.v vVar, int i6, int i10, p071h0.c cVar) {
        p071h0.c cVarT1;
        androidx.compose.foundation.layout.c cVarF = f(g6);
        D0.X.a.j(aVar, x6, ((cVarF == null || (cVarT1 = cVarF.T1()) == null) ? cVar : cVarT1).a(Y0.u.a(x6.I0(), x6.w0()), Y0.u.a(i6, i10), vVar), 0.0f, 2, null);
    }
}
