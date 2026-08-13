package C9;

/* JADX INFO: renamed from: C9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0850d {

    /* JADX INFO: renamed from: C9.d$a */
    public static final class a implements F9.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C9.A f1429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ W8.N f1430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ V.G1 f1431d;

        a(boolean z6, W8.N n6, V.G1 g6) {
            this.f1430c = n6;
            this.f1431d = g6;
            this.f1428a = z6;
        }

        @Override // F9.c
        public void a() {
            C9.A a6 = this.f1429b;
            if (a6 != null) {
                a6.a();
            }
        }

        @Override // F9.c
        public void b() {
            C9.A a6 = this.f1429b;
            if (a6 != null) {
                a6.a();
            }
            this.f1429b = new C9.A(this.f1430c, true, C9.AbstractC0850d.e(this.f1431d));
        }

        @Override // F9.c
        public void c(float f6) {
            C9.A a6 = this.f1429b;
            if (a6 != null) {
                Y8.n.b(a6.e(f6));
            }
        }

        @Override // F9.c
        public void d() {
            C9.A a6 = this.f1429b;
            if (a6 != null && !a6.d()) {
                a6.a();
                this.f1429b = null;
            }
            if (this.f1429b == null) {
                this.f1429b = new C9.A(this.f1430c, false, C9.AbstractC0850d.e(this.f1431d));
            }
            C9.A a10 = this.f1429b;
            if (a10 != null) {
                a10.b();
            }
        }

        public void e(boolean z6) {
            this.f1428a = z6;
        }

        @Override // F9.c
        public boolean isEnabled() {
            return this.f1428a;
        }
    }

    /* JADX INFO: renamed from: C9.d$b */
    public static final class b implements V.M {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ F9.a f1432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9.AbstractC0850d.a f1433b;

        public b(F9.a aVar, C9.AbstractC0850d.a aVar2) {
            this.f1432a = aVar;
            this.f1433b = aVar2;
        }

        @Override // V.M
        public void e() {
            this.f1432a.j(this.f1433b);
        }
    }

    public static final void d(final boolean z6, final p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, final int i6, final int i10) {
        int i11;
        p247y7.AbstractC7350t.f(pVar, "onBack");
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-569860079);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.d(z6) ? 4 : 2) | i6;
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
                z6 = true;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-569860079, i11, -1, "moe.tlaster.precompose.navigation.PredictiveBackHandler (BackHandler.kt:83)");
            }
            V.G1 g1N = V.v1.n(pVar, interfaceC1734nR, (i11 >> 3) & 14);
            java.lang.Object objG = interfaceC1734nR.g();
            V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
            if (objG == aVar.a()) {
                V.C c6 = new V.C(V.Q.h(p127m7.j.f51198C, interfaceC1734nR));
                interfaceC1734nR.K(c6);
                objG = c6;
            }
            W8.N nA = ((V.C) objG).a();
            interfaceC1734nR.T(857162689);
            java.lang.Object objG2 = interfaceC1734nR.g();
            if (objG2 == aVar.a()) {
                objG2 = new C9.AbstractC0850d.a(z6, nA, g1N);
                interfaceC1734nR.K(objG2);
            }
            final C9.AbstractC0850d.a aVar2 = (C9.AbstractC0850d.a) objG2;
            interfaceC1734nR.J();
            java.lang.Object objN = interfaceC1734nR.n(F9.e.c());
            if (objN == null) {
                throw new java.lang.IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            final F9.a aVarC = ((F9.b) objN).c();
            interfaceC1734nR.T(857224802);
            boolean zL = interfaceC1734nR.l(aVar2) | ((i11 & 14) == 4) | interfaceC1734nR.l(aVarC);
            java.lang.Object objG3 = interfaceC1734nR.g();
            if (zL || objG3 == aVar.a()) {
                objG3 = new p237x7.a() { // from class: C9.a
                    @Override // p237x7.a
                    public final java.lang.Object b() {
                        return C9.AbstractC0850d.f(aVar2, z6, aVarC);
                    }
                };
                interfaceC1734nR.K(objG3);
            }
            interfaceC1734nR.J();
            V.Q.f((p237x7.a) objG3, interfaceC1734nR, 0);
            androidx.lifecycle.r rVar = (androidx.lifecycle.r) interfaceC1734nR.n(p003a2.a.a());
            interfaceC1734nR.T(857233199);
            boolean zL2 = interfaceC1734nR.l(aVarC) | interfaceC1734nR.l(aVar2);
            java.lang.Object objG4 = interfaceC1734nR.g();
            if (zL2 || objG4 == aVar.a()) {
                objG4 = new p237x7.l() { // from class: C9.b
                    @Override // p237x7.l
                    public final java.lang.Object l(java.lang.Object obj) {
                        return C9.AbstractC0850d.g(aVarC, aVar2, (V.N) obj);
                    }
                };
                interfaceC1734nR.K(objG4);
            }
            interfaceC1734nR.J();
            V.Q.a(rVar, aVarC, (p237x7.l) objG4, interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new p237x7.p() { // from class: C9.c
                @Override // p237x7.p
                public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                    return C9.AbstractC0850d.h(z6, pVar, i6, i10, (V.InterfaceC1734n) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p237x7.p e(V.G1 g6) {
        return (p237x7.p) g6.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M f(C9.AbstractC0850d.a aVar, boolean z6, F9.a aVar2) {
        if (aVar.isEnabled() != z6) {
            aVar2.g();
        }
        aVar.e(z6);
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V.M g(F9.a aVar, C9.AbstractC0850d.a aVar2, V.N n6) {
        p247y7.AbstractC7350t.f(n6, "$this$DisposableEffect");
        aVar.i(aVar2);
        return new C9.AbstractC0850d.b(aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M h(boolean z6, p237x7.p pVar, int i6, int i10, V.InterfaceC1734n interfaceC1734n, int i11) {
        d(z6, pVar, interfaceC1734n, V.S0.a(i6 | 1), i10);
        return p087i7.M.f46721a;
    }
}
