package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H.H.a f3678a = new H.H.a(null);

    public static final class a {

        /* JADX INFO: renamed from: H.H$a$a, reason: collision with other inner class name */
        static final class C0078a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ S0.C1603k f3679D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p237x7.l f3680E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p247y7.O f3681F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0078a(S0.C1603k c1603k, p237x7.l lVar, p247y7.O o6) {
                super(1);
                this.f3679D = c1603k;
                this.f3680E = lVar;
                this.f3681F = o6;
            }

            public final void a(java.util.List list) {
                H.H.f3678a.g(list, this.f3679D, this.f3680E, (S0.d0) this.f3681F.f57254C);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((java.util.List) obj);
                return p087i7.M.f46721a;
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ D0.InterfaceC0900t f3682D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(D0.InterfaceC0900t interfaceC0900t) {
                super(1);
                this.f3682D = interfaceC0900t;
            }

            public final void a(float[] fArr) {
                if (this.f3682D.K()) {
                    D0.AbstractC0901u.d(this.f3682D).Y(this.f3682D, fArr);
                }
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a(((p141o0.J1) obj).r());
                return p087i7.M.f46721a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final void c(p141o0.InterfaceC6993q0 interfaceC6993q0, long j6, S0.L l6, M0.K k6, p141o0.N1 n6) {
            int iB = l6.b(M0.N.l(j6));
            int iB2 = l6.b(M0.N.k(j6));
            if (iB != iB2) {
                interfaceC6993q0.t(k6.z(iB, iB2), n6);
            }
        }

        public final S0.e0 a(long j6, S0.e0 e0Var) {
            int iB = e0Var.a().b(M0.N.n(j6));
            int iB2 = e0Var.a().b(M0.N.i(j6));
            int iMin = java.lang.Math.min(iB, iB2);
            int iMax = java.lang.Math.max(iB, iB2);
            M0.C1332d.a aVar = new M0.C1332d.a(e0Var.b());
            aVar.b(new M0.C(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, X0.k.f15631b.d(), null, null, null, 61439, null), iMin, iMax);
            return new S0.e0(aVar.i(), e0Var.a());
        }

        public final void b(p141o0.InterfaceC6993q0 interfaceC6993q0, S0.V v6, long j6, long j10, S0.L l6, M0.K k6, p141o0.N1 n6, long j11) {
            long jH;
            p141o0.N1 n10;
            if (M0.N.h(j6)) {
                if (!M0.N.h(j10)) {
                    p141o0.C7016y0 c7016y0I = p141o0.C7016y0.i(k6.l().i().h());
                    if (c7016y0I.w() == 16) {
                        c7016y0I = null;
                    }
                    long jW = c7016y0I != null ? c7016y0I.w() : p141o0.C7016y0.f52264b.a();
                    n10 = n6;
                    n10.G(p141o0.C7016y0.m(jW, p141o0.C7016y0.p(jW) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                    jH = j10;
                } else if (!M0.N.h(v6.h())) {
                    n6.G(j11);
                    jH = v6.h();
                    n10 = n6;
                }
                c(interfaceC6993q0, jH, l6, k6, n10);
            } else {
                n6.G(j11);
                c(interfaceC6993q0, j6, l6, k6, n6);
            }
            M0.M.f6665a.a(interfaceC6993q0, k6);
        }

        public final p087i7.A d(H.D d6, long j6, Y0.v vVar, M0.K k6) {
            M0.K kL = d6.l(j6, vVar, k6);
            return new p087i7.A(java.lang.Integer.valueOf(Y0.t.g(kL.B())), java.lang.Integer.valueOf(Y0.t.f(kL.B())), kL);
        }

        public final void e(S0.V v6, H.D d6, M0.K k6, D0.InterfaceC0900t interfaceC0900t, S0.d0 d0Var, boolean z6, S0.L l6) {
            p131n0.i iVar;
            if (z6) {
                int iB = l6.b(M0.N.k(v6.h()));
                if (iB < k6.l().j().length()) {
                    iVar = k6.d(iB);
                } else if (iB != 0) {
                    iB--;
                    iVar = k6.d(iB);
                } else {
                    iVar = new p131n0.i(0.0f, 0.0f, 1.0f, Y0.t.f(H.I.b(d6.j(), d6.a(), d6.b(), null, 0, 24, null)));
                }
                long jH0 = interfaceC0900t.h0(p131n0.h.a(iVar.i(), iVar.l()));
                d0Var.c(p131n0.j.b(p131n0.h.a(p131n0.g.m(jH0), p131n0.g.n(jH0)), p131n0.n.a(iVar.n(), iVar.h())));
            }
        }

        public final void f(S0.d0 d0Var, S0.C1603k c1603k, p237x7.l lVar) {
            lVar.l(S0.V.d(c1603k.f(), null, 0L, null, 3, null));
            d0Var.a();
        }

        public final void g(java.util.List list, S0.C1603k c1603k, p237x7.l lVar, S0.d0 d0Var) {
            S0.V vB = c1603k.b(list);
            if (d0Var != null) {
                d0Var.d(null, vB);
            }
            lVar.l(vB);
        }

        public final S0.d0 h(S0.X x6, S0.V v6, S0.C1603k c1603k, S0.C1610s c1610s, p237x7.l lVar, p237x7.l lVar2) {
            return i(x6, v6, c1603k, c1610s, lVar, lVar2);
        }

        public final S0.d0 i(S0.X x6, S0.V v6, S0.C1603k c1603k, S0.C1610s c1610s, p237x7.l lVar, p237x7.l lVar2) {
            p247y7.O o6 = new p247y7.O();
            S0.d0 d0VarD = x6.d(v6, c1610s, new H.H.a.C0078a(c1603k, lVar, o6), lVar2);
            o6.f57254C = d0VarD;
            return d0VarD;
        }

        public final void j(long j6, H.V v6, S0.C1603k c1603k, S0.L l6, p237x7.l lVar) {
            lVar.l(S0.V.d(c1603k.f(), null, M0.O.a(l6.a(H.V.e(v6, j6, false, 2, null))), null, 5, null));
        }

        public final void k(S0.d0 d0Var, S0.V v6, S0.L l6, H.V v10) {
            D0.InterfaceC0900t interfaceC0900tB;
            D0.InterfaceC0900t interfaceC0900tC = v10.c();
            if (interfaceC0900tC == null || !interfaceC0900tC.K() || (interfaceC0900tB = v10.b()) == null) {
                return;
            }
            d0Var.e(v6, l6, v10.f(), new H.H.a.b(interfaceC0900tC), N.z.b(interfaceC0900tC), interfaceC0900tC.N(interfaceC0900tB, false));
        }
    }
}
