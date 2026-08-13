package D;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    static final class a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.d f1715D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f1716E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f1717F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ V.G1 f1718G;

        /* JADX INFO: renamed from: D.v$a$a, reason: collision with other inner class name */
        static final class C0038a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.d f1719D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ D.C0880q f1720E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ D0.i0 f1721F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ D.P f1722G;

            /* JADX INFO: renamed from: D.v$a$a$a, reason: collision with other inner class name */
            public static final class C0039a implements V.M {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.lazy.layout.d f1723a;

                public C0039a(androidx.compose.foundation.lazy.layout.d dVar) {
                    this.f1723a = dVar;
                }

                @Override // V.M
                public void e() {
                    this.f1723a.f(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0038a(androidx.compose.foundation.lazy.layout.d dVar, D.C0880q c0880q, D0.i0 i0Var, D.P p6) {
                super(1);
                this.f1719D = dVar;
                this.f1720E = c0880q;
                this.f1721F = i0Var;
                this.f1722G = p6;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final V.M l(V.N n6) {
                this.f1719D.f(new androidx.compose.foundation.lazy.layout.h(this.f1720E, this.f1721F, this.f1722G));
                return new D.v.a.C0038a.C0039a(this.f1719D);
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ D.C0880q f1724D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p237x7.p f1725E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(D.C0880q c0880q, p237x7.p pVar) {
                super(2);
                this.f1724D = c0880q;
                this.f1725E = pVar;
            }

            public final D0.K a(D0.j0 j0Var, long j6) {
                return (D0.K) this.f1725E.u(new D.x(this.f1724D, j0Var), Y0.C1859b.a(j6));
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return a((D0.j0) obj, ((Y0.C1859b) obj2).r());
            }
        }

        static final class c extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.G1 f1726D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(V.G1 g6) {
                super(0);
                this.f1726D = g6;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D.InterfaceC0881s b() {
                return (D.InterfaceC0881s) ((p237x7.a) this.f1726D.getValue()).b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.lazy.layout.d dVar, androidx.compose.ui.d dVar2, p237x7.p pVar, V.G1 g6) {
            super(3);
            this.f1715D = dVar;
            this.f1716E = dVar2;
            this.f1717F = pVar;
            this.f1718G = g6;
        }

        public final void a(p041e0.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1488997347, i6, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)");
            }
            V.G1 g6 = this.f1718G;
            java.lang.Object objG = interfaceC1734n.g();
            V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
            if (objG == aVar.a()) {
                objG = new D.C0880q(dVar, new D.v.a.c(g6));
                interfaceC1734n.K(objG);
            }
            D.C0880q c0880q = (D.C0880q) objG;
            java.lang.Object objG2 = interfaceC1734n.g();
            if (objG2 == aVar.a()) {
                objG2 = new D0.i0(new D.u(c0880q));
                interfaceC1734n.K(objG2);
            }
            D0.i0 i0Var = (D0.i0) objG2;
            if (this.f1715D != null) {
                interfaceC1734n.T(205264983);
                D.P pD = this.f1715D.d();
                if (pD == null) {
                    interfaceC1734n.T(6622915);
                    pD = D.Q.a(interfaceC1734n, 0);
                } else {
                    interfaceC1734n.T(6621830);
                }
                interfaceC1734n.J();
                java.lang.Object[] objArr = {this.f1715D, c0880q, i0Var, pD};
                boolean zS = interfaceC1734n.S(this.f1715D) | interfaceC1734n.l(c0880q) | interfaceC1734n.l(i0Var) | interfaceC1734n.l(pD);
                androidx.compose.foundation.lazy.layout.d dVar2 = this.f1715D;
                java.lang.Object objG3 = interfaceC1734n.g();
                if (zS || objG3 == aVar.a()) {
                    objG3 = new D.v.a.C0038a(dVar2, c0880q, i0Var, pD);
                    interfaceC1734n.K(objG3);
                }
                V.Q.c(objArr, (p237x7.l) objG3, interfaceC1734n, 0);
            } else {
                interfaceC1734n.T(205858881);
            }
            interfaceC1734n.J();
            androidx.compose.ui.d dVarB = androidx.compose.foundation.lazy.layout.e.b(this.f1716E, this.f1715D);
            boolean zS2 = interfaceC1734n.S(c0880q) | interfaceC1734n.S(this.f1717F);
            p237x7.p pVar = this.f1717F;
            java.lang.Object objG4 = interfaceC1734n.g();
            if (zS2 || objG4 == aVar.a()) {
                objG4 = new D.v.a.b(c0880q, pVar);
                interfaceC1734n.K(objG4);
            }
            D0.g0.a(i0Var, dVarB, (p237x7.p) objG4, interfaceC1734n, D0.i0.f1864f, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            a((p041e0.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.a f1727D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f1728E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.d f1729F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f1730G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f1731H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f1732I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.a aVar, androidx.compose.ui.d dVar, androidx.compose.foundation.lazy.layout.d dVar2, p237x7.p pVar, int i6, int i10) {
            super(2);
            this.f1727D = aVar;
            this.f1728E = dVar;
            this.f1729F = dVar2;
            this.f1730G = pVar;
            this.f1731H = i6;
            this.f1732I = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            D.v.a(this.f1727D, this.f1728E, this.f1729F, this.f1730G, interfaceC1734n, V.S0.a(this.f1731H | 1), this.f1732I);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(p237x7.a aVar, androidx.compose.ui.d dVar, androidx.compose.foundation.lazy.layout.d dVar2, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(2002163445);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.l(aVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        int i12 = i10 & 2;
        if (i12 != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.S(dVar) ? 32 : 16;
        }
        int i13 = i10 & 4;
        if (i13 != 0) {
            i11 |= 384;
        } else if ((i6 & 384) == 0) {
            i11 |= interfaceC1734nR.S(dVar2) ? 256 : 128;
        }
        if ((i10 & 8) != 0) {
            i11 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i11 |= interfaceC1734nR.l(pVar) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (i12 != 0) {
                dVar = androidx.compose.ui.d.f19586a;
            }
            if (i13 != 0) {
                dVar2 = null;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(2002163445, i11, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:78)");
            }
            D.G.a(p031d0.c.e(-1488997347, true, new D.v.a(dVar2, dVar, pVar, V.v1.n(aVar, interfaceC1734nR, i11 & 14)), interfaceC1734nR, 54), interfaceC1734nR, 6);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        androidx.compose.ui.d dVar3 = dVar;
        androidx.compose.foundation.lazy.layout.d dVar4 = dVar2;
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new D.v.b(aVar, dVar3, dVar4, pVar, i6, i10));
        }
    }
}
