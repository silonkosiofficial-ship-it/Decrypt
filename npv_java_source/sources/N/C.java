package N;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    static final class a implements D0.I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final N.C.a f7284a = new N.C.a();

        /* JADX INFO: renamed from: N.C$a$a, reason: collision with other inner class name */
        static final class C0173a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ java.util.List f7285D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0173a(java.util.List list) {
                super(1);
                this.f7285D = list;
            }

            public final void a(D0.X.a aVar) {
                java.util.List list = this.f7285D;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    D0.X.a.h(aVar, (D0.X) list.get(i6), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        a() {
        }

        @Override // D0.I
        public /* synthetic */ int a(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return D0.H.b(this, interfaceC0896o, list, i6);
        }

        @Override // D0.I
        public final D0.K b(D0.M m6, java.util.List list, long j6) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            java.lang.Integer numValueOf = 0;
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(((D0.G) list.get(i6)).U(j6));
            }
            int size2 = arrayList.size();
            java.lang.Integer numValueOf2 = numValueOf;
            for (int i10 = 0; i10 < size2; i10++) {
                numValueOf2 = java.lang.Integer.valueOf(java.lang.Math.max(numValueOf2.intValue(), ((D0.X) arrayList.get(i10)).I0()));
            }
            int iIntValue = numValueOf2.intValue();
            int size3 = arrayList.size();
            for (int i11 = 0; i11 < size3; i11++) {
                numValueOf = java.lang.Integer.valueOf(java.lang.Math.max(numValueOf.intValue(), ((D0.X) arrayList.get(i11)).w0()));
            }
            return D0.L.b(m6, iIntValue, numValueOf.intValue(), null, new N.C.a.C0173a(arrayList), 4, null);
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

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f7286D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f7287E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f7288F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f7289G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar, p237x7.p pVar, int i6, int i10) {
            super(2);
            this.f7286D = dVar;
            this.f7287E = pVar;
            this.f7288F = i6;
            this.f7289G = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            N.C.a(this.f7286D, this.f7287E, interfaceC1734n, V.S0.a(this.f7288F | 1), this.f7289G);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-2105228848);
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
                V.AbstractC1741q.Q(-2105228848, i11, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            N.C.a aVar = N.C.a.f7284a;
            int i13 = ((i11 >> 3) & 14) | 384 | ((i11 << 3) & 112);
            int iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734nR, dVar);
            F0.InterfaceC0919g.a aVar2 = F0.InterfaceC0919g.f2641a;
            p237x7.a aVarA = aVar2.a();
            int i14 = ((i13 << 6) & 896) | 6;
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
            V.L1.c(interfaceC1734nA, aVar, aVar2.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar2.e());
            p237x7.p pVarB = aVar2.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar2.d());
            pVar.u(interfaceC1734nR, java.lang.Integer.valueOf((i14 >> 6) & 14));
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new N.C.b(dVar, pVar, i6, i10));
        }
    }
}
