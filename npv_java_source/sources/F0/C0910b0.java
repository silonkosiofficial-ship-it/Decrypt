package F0;

/* JADX INFO: renamed from: F0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0910b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0.J f2550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F0.C0937x f2551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private F0.AbstractC0914d0 f2552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.compose.ui.d.c f2553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.compose.ui.d.c f2554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private X.b f2555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private X.b f2556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private F0.C0910b0.a f2557h;

    /* JADX INFO: renamed from: F0.b0$a */
    private final class a implements F0.InterfaceC0930p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.compose.ui.d.c f2558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private X.b f2560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private X.b f2561d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2562e;

        public a(androidx.compose.ui.d.c cVar, int i6, X.b bVar, X.b bVar2, boolean z6) {
            this.f2558a = cVar;
            this.f2559b = i6;
            this.f2560c = bVar;
            this.f2561d = bVar2;
            this.f2562e = z6;
        }

        @Override // F0.InterfaceC0930p
        public void a(int i6, int i10) {
            androidx.compose.ui.d.c cVarR1 = this.f2558a.r1();
            p247y7.AbstractC7350t.c(cVarR1);
            F0.C0910b0.d(F0.C0910b0.this);
            if ((F0.AbstractC0918f0.a(2) & cVarR1.v1()) != 0) {
                F0.AbstractC0914d0 abstractC0914d0S1 = cVarR1.s1();
                p247y7.AbstractC7350t.c(abstractC0914d0S1);
                F0.AbstractC0914d0 abstractC0914d0P2 = abstractC0914d0S1.p2();
                F0.AbstractC0914d0 abstractC0914d0O2 = abstractC0914d0S1.o2();
                p247y7.AbstractC7350t.c(abstractC0914d0O2);
                if (abstractC0914d0P2 != null) {
                    abstractC0914d0P2.S2(abstractC0914d0O2);
                }
                abstractC0914d0O2.T2(abstractC0914d0P2);
                F0.C0910b0.this.v(this.f2558a, abstractC0914d0O2);
            }
            this.f2558a = F0.C0910b0.this.h(cVarR1);
        }

        @Override // F0.InterfaceC0930p
        public boolean b(int i6, int i10) {
            return F0.AbstractC0912c0.d((androidx.compose.ui.d.b) this.f2560c.s()[this.f2559b + i6], (androidx.compose.ui.d.b) this.f2561d.s()[this.f2559b + i10]) != 0;
        }

        @Override // F0.InterfaceC0930p
        public void c(int i6, int i10) {
            androidx.compose.ui.d.c cVarR1 = this.f2558a.r1();
            p247y7.AbstractC7350t.c(cVarR1);
            this.f2558a = cVarR1;
            X.b bVar = this.f2560c;
            androidx.compose.ui.d.b bVar2 = (androidx.compose.ui.d.b) bVar.s()[this.f2559b + i6];
            X.b bVar3 = this.f2561d;
            androidx.compose.ui.d.b bVar4 = (androidx.compose.ui.d.b) bVar3.s()[this.f2559b + i10];
            if (!p247y7.AbstractC7350t.b(bVar2, bVar4)) {
                F0.C0910b0.this.F(bVar2, bVar4, this.f2558a);
            }
            F0.C0910b0.d(F0.C0910b0.this);
        }

        @Override // F0.InterfaceC0930p
        public void d(int i6) {
            int i10 = this.f2559b + i6;
            this.f2558a = F0.C0910b0.this.g((androidx.compose.ui.d.b) this.f2561d.s()[i10], this.f2558a);
            F0.C0910b0.d(F0.C0910b0.this);
            if (!this.f2562e) {
                this.f2558a.M1(true);
                return;
            }
            androidx.compose.ui.d.c cVarR1 = this.f2558a.r1();
            p247y7.AbstractC7350t.c(cVarR1);
            F0.AbstractC0914d0 abstractC0914d0S1 = cVarR1.s1();
            p247y7.AbstractC7350t.c(abstractC0914d0S1);
            F0.E eD = F0.AbstractC0925k.d(this.f2558a);
            if (eD != null) {
                F0.F f6 = new F0.F(F0.C0910b0.this.m(), eD);
                this.f2558a.S1(f6);
                F0.C0910b0.this.v(this.f2558a, f6);
                f6.T2(abstractC0914d0S1.p2());
                f6.S2(abstractC0914d0S1);
                abstractC0914d0S1.T2(f6);
            } else {
                this.f2558a.S1(abstractC0914d0S1);
            }
            this.f2558a.B1();
            this.f2558a.H1();
            F0.AbstractC0920g0.a(this.f2558a);
        }

        public final void e(X.b bVar) {
            this.f2561d = bVar;
        }

        public final void f(X.b bVar) {
            this.f2560c = bVar;
        }

        public final void g(androidx.compose.ui.d.c cVar) {
            this.f2558a = cVar;
        }

        public final void h(int i6) {
            this.f2559b = i6;
        }

        public final void i(boolean z6) {
            this.f2562e = z6;
        }
    }

    /* JADX INFO: renamed from: F0.b0$b */
    public interface b {
    }

    public C0910b0(F0.J j6) {
        this.f2550a = j6;
        F0.C0937x c0937x = new F0.C0937x(j6);
        this.f2551b = c0937x;
        this.f2552c = c0937x;
        F0.C0 c0H3 = c0937x.n2();
        this.f2553d = c0H3;
        this.f2554e = c0H3;
    }

    private final void A(int i6, X.b bVar, X.b bVar2, androidx.compose.ui.d.c cVar, boolean z6) {
        F0.Z.e(bVar.t() - i6, bVar2.t() - i6, j(cVar, i6, bVar, bVar2, z6));
        B();
    }

    private final void B() {
        int iV1 = 0;
        for (androidx.compose.ui.d.c cVarX1 = this.f2553d.x1(); cVarX1 != null && cVarX1 != F0.AbstractC0912c0.f2571a; cVarX1 = cVarX1.x1()) {
            iV1 |= cVarX1.v1();
            cVarX1.J1(iV1);
        }
    }

    private final androidx.compose.ui.d.c D(androidx.compose.ui.d.c cVar) {
        if (!(cVar == F0.AbstractC0912c0.f2571a)) {
            C0.a.b("trimChain called on already trimmed chain");
        }
        androidx.compose.ui.d.c cVarR1 = F0.AbstractC0912c0.f2571a.r1();
        if (cVarR1 == null) {
            cVarR1 = this.f2553d;
        }
        cVarR1.P1(null);
        F0.AbstractC0912c0.f2571a.L1(null);
        F0.AbstractC0912c0.f2571a.J1(-1);
        F0.AbstractC0912c0.f2571a.S1(null);
        if (!(cVarR1 != F0.AbstractC0912c0.f2571a)) {
            C0.a.b("trimChain did not update the head");
        }
        return cVarR1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r4.A1() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r4.A1() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        F0.AbstractC0920g0.e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        r4.Q1(true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(androidx.compose.ui.d.b r2, androidx.compose.ui.d.b r3, androidx.compose.ui.d.c r4) {
        /*
            r1 = this;
            boolean r2 = r2 instanceof F0.W
            r0 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r3 instanceof F0.W
            if (r2 == 0) goto L1c
            F0.W r3 = (F0.W) r3
            F0.AbstractC0912c0.c(r3, r4)
            boolean r2 = r4.A1()
            if (r2 == 0) goto L18
        L14:
            F0.AbstractC0920g0.e(r4)
            goto L2d
        L18:
            r4.Q1(r0)
            goto L2d
        L1c:
            boolean r2 = r4 instanceof F0.C0911c
            if (r2 == 0) goto L2e
            r2 = r4
            F0.c r2 = (F0.C0911c) r2
            r2.X1(r3)
            boolean r2 = r4.A1()
            if (r2 == 0) goto L18
            goto L14
        L2d:
            return
        L2e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unknown Modifier.Node type"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.C0910b0.F(androidx.compose.ui.d$b, androidx.compose.ui.d$b, androidx.compose.ui.d$c):void");
    }

    public static final /* synthetic */ F0.C0910b0.b d(F0.C0910b0 c0910b0) {
        c0910b0.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.d.c g(androidx.compose.ui.d.b bVar, androidx.compose.ui.d.c cVar) {
        androidx.compose.ui.d.c c0911c;
        if (bVar instanceof F0.W) {
            c0911c = ((F0.W) bVar).g();
            c0911c.N1(F0.AbstractC0920g0.h(c0911c));
        } else {
            c0911c = new F0.C0911c(bVar);
        }
        if (!(!c0911c.A1())) {
            C0.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        c0911c.M1(true);
        return r(c0911c, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.d.c h(androidx.compose.ui.d.c cVar) {
        if (cVar.A1()) {
            F0.AbstractC0920g0.d(cVar);
            cVar.I1();
            cVar.C1();
        }
        return w(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        return this.f2554e.q1();
    }

    private final F0.C0910b0.a j(androidx.compose.ui.d.c cVar, int i6, X.b bVar, X.b bVar2, boolean z6) {
        F0.C0910b0.a aVar = this.f2557h;
        if (aVar == null) {
            F0.C0910b0.a aVar2 = new F0.C0910b0.a(cVar, i6, bVar, bVar2, z6);
            this.f2557h = aVar2;
            return aVar2;
        }
        aVar.g(cVar);
        aVar.h(i6);
        aVar.f(bVar);
        aVar.e(bVar2);
        aVar.i(z6);
        return aVar;
    }

    private final androidx.compose.ui.d.c r(androidx.compose.ui.d.c cVar, androidx.compose.ui.d.c cVar2) {
        androidx.compose.ui.d.c cVarR1 = cVar2.r1();
        if (cVarR1 != null) {
            cVarR1.P1(cVar);
            cVar.L1(cVarR1);
        }
        cVar2.L1(cVar);
        cVar.P1(cVar2);
        return cVar;
    }

    private final androidx.compose.ui.d.c u() {
        if (!(this.f2554e != F0.AbstractC0912c0.f2571a)) {
            C0.a.b("padChain called on already padded chain");
        }
        androidx.compose.ui.d.c cVar = this.f2554e;
        cVar.P1(F0.AbstractC0912c0.f2571a);
        F0.AbstractC0912c0.f2571a.L1(cVar);
        return F0.AbstractC0912c0.f2571a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(androidx.compose.ui.d.c cVar, F0.AbstractC0914d0 abstractC0914d0) {
        while (true) {
            cVar = cVar.x1();
            if (cVar == null) {
                return;
            }
            if (cVar == F0.AbstractC0912c0.f2571a) {
                F0.J jO0 = this.f2550a.o0();
                abstractC0914d0.T2(jO0 != null ? jO0.P() : null);
                this.f2552c = abstractC0914d0;
                return;
            } else if ((F0.AbstractC0918f0.a(2) & cVar.v1()) != 0) {
                return;
            } else {
                cVar.S1(abstractC0914d0);
            }
        }
    }

    private final androidx.compose.ui.d.c w(androidx.compose.ui.d.c cVar) {
        androidx.compose.ui.d.c cVarR1 = cVar.r1();
        androidx.compose.ui.d.c cVarX1 = cVar.x1();
        if (cVarR1 != null) {
            cVarR1.P1(cVarX1);
            cVar.L1(null);
        }
        if (cVarX1 != null) {
            cVarX1.L1(cVarR1);
            cVar.P1(null);
        }
        p247y7.AbstractC7350t.c(cVarX1);
        return cVarX1;
    }

    public final void C() {
        F0.AbstractC0914d0 f6;
        F0.AbstractC0914d0 abstractC0914d0 = this.f2551b;
        androidx.compose.ui.d.c cVarX1 = this.f2553d;
        while (true) {
            cVarX1 = cVarX1.x1();
            if (cVarX1 == null) {
                break;
            }
            F0.E eD = F0.AbstractC0925k.d(cVarX1);
            if (eD != null) {
                if (cVarX1.s1() != null) {
                    F0.AbstractC0914d0 abstractC0914d0S1 = cVarX1.s1();
                    p247y7.AbstractC7350t.d(abstractC0914d0S1, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    f6 = (F0.F) abstractC0914d0S1;
                    F0.E eI3 = f6.i3();
                    f6.l3(eD);
                    if (eI3 != cVarX1) {
                        f6.D2();
                    }
                } else {
                    f6 = new F0.F(this.f2550a, eD);
                    cVarX1.S1(f6);
                }
                abstractC0914d0.T2(f6);
                f6.S2(abstractC0914d0);
                abstractC0914d0 = f6;
            } else {
                cVarX1.S1(abstractC0914d0);
            }
        }
        F0.J jO0 = this.f2550a.o0();
        abstractC0914d0.T2(jO0 != null ? jO0.P() : null);
        this.f2552c = abstractC0914d0;
    }

    public final void E(androidx.compose.ui.d dVar) {
        boolean z6;
        int i6;
        X.b bVar;
        androidx.compose.ui.d.c cVar;
        androidx.compose.ui.d.c cVarU = u();
        X.b bVar2 = this.f2555f;
        int i10 = 0;
        int iT = bVar2 != null ? bVar2.t() : 0;
        X.b bVar3 = this.f2556g;
        if (bVar3 == null) {
            bVar3 = new X.b(new androidx.compose.ui.d.b[16], 0);
        }
        X.b bVarE = F0.AbstractC0912c0.e(dVar, bVar3);
        X.b bVar4 = null;
        if (bVarE.t() == iT) {
            androidx.compose.ui.d.c cVarR1 = cVarU.r1();
            int i11 = 0;
            while (cVarR1 != null && i11 < iT) {
                if (bVar2 == null) {
                    C0.a.c("expected prior modifier list to be non-empty");
                    throw new p087i7.C6665k();
                }
                androidx.compose.ui.d.b bVar5 = (androidx.compose.ui.d.b) bVar2.s()[i11];
                androidx.compose.ui.d.b bVar6 = (androidx.compose.ui.d.b) bVarE.s()[i11];
                int iD = F0.AbstractC0912c0.d(bVar5, bVar6);
                if (iD == 0) {
                    cVarR1 = cVarR1.x1();
                    break;
                }
                if (iD == 1) {
                    F(bVar5, bVar6, cVarR1);
                }
                cVarR1 = cVarR1.r1();
                i11++;
            }
            androidx.compose.ui.d.c cVar2 = cVarR1;
            if (i11 < iT) {
                if (bVar2 == null) {
                    C0.a.c("expected prior modifier list to be non-empty");
                    throw new p087i7.C6665k();
                }
                if (cVar2 == null) {
                    C0.a.c("structuralUpdate requires a non-null tail");
                    throw new p087i7.C6665k();
                }
                i6 = i11;
                bVar = bVar2;
                cVar = cVar2;
                z6 = !this.f2550a.D();
                A(i6, bVar, bVarE, cVar, z6);
                i10 = 1;
            }
        } else if (this.f2550a.D() && iT == 0) {
            androidx.compose.ui.d.c cVarG = cVarU;
            while (i10 < bVarE.t()) {
                cVarG = g((androidx.compose.ui.d.b) bVarE.s()[i10], cVarG);
                i10++;
            }
            B();
            i10 = 1;
        } else if (bVarE.t() != 0) {
            if (bVar2 == null) {
                bVar2 = new X.b(new androidx.compose.ui.d.b[16], 0);
            }
            z6 = !this.f2550a.D();
            i6 = 0;
            bVar = bVar2;
            cVar = cVarU;
            A(i6, bVar, bVarE, cVar, z6);
            i10 = 1;
        } else {
            if (bVar2 == null) {
                C0.a.c("expected prior modifier list to be non-empty");
                throw new p087i7.C6665k();
            }
            androidx.compose.ui.d.c cVarR2 = cVarU.r1();
            for (int i12 = 0; cVarR2 != null && i12 < bVar2.t(); i12++) {
                cVarR2 = h(cVarR2).r1();
            }
            F0.C0937x c0937x = this.f2551b;
            F0.J jO0 = this.f2550a.o0();
            c0937x.T2(jO0 != null ? jO0.P() : null);
            this.f2552c = this.f2551b;
        }
        this.f2555f = bVarE;
        if (bVar2 != null) {
            bVar2.j();
            bVar4 = bVar2;
        }
        this.f2556g = bVar4;
        this.f2554e = D(cVarU);
        if (i10 != 0) {
            C();
        }
    }

    public final androidx.compose.ui.d.c k() {
        return this.f2554e;
    }

    public final F0.C0937x l() {
        return this.f2551b;
    }

    public final F0.J m() {
        return this.f2550a;
    }

    public final F0.AbstractC0914d0 n() {
        return this.f2552c;
    }

    public final androidx.compose.ui.d.c o() {
        return this.f2553d;
    }

    public final boolean p(int i6) {
        return (i6 & i()) != 0;
    }

    public final boolean q(int i6) {
        return (i6 & i()) != 0;
    }

    public final void s() {
        for (androidx.compose.ui.d.c cVarK = k(); cVarK != null; cVarK = cVarK.r1()) {
            cVarK.B1();
        }
    }

    public final void t() {
        for (androidx.compose.ui.d.c cVarO = o(); cVarO != null; cVarO = cVarO.x1()) {
            if (cVarO.A1()) {
                cVarO.C1();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[");
        if (this.f2554e == this.f2553d) {
            sb.append("]");
            break;
        }
        for (androidx.compose.ui.d.c cVarK = k(); cVarK != null && cVarK != o(); cVarK = cVarK.r1()) {
            sb.append(java.lang.String.valueOf(cVarK));
            if (cVarK.r1() == this.f2553d) {
                sb.append("]");
                break;
            }
            sb.append(",");
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void x() {
        for (androidx.compose.ui.d.c cVarO = o(); cVarO != null; cVarO = cVarO.x1()) {
            if (cVarO.A1()) {
                cVarO.G1();
            }
        }
        z();
        t();
    }

    public final void y() {
        for (androidx.compose.ui.d.c cVarK = k(); cVarK != null; cVarK = cVarK.r1()) {
            cVarK.H1();
            if (cVarK.u1()) {
                F0.AbstractC0920g0.a(cVarK);
            }
            if (cVarK.z1()) {
                F0.AbstractC0920g0.e(cVarK);
            }
            cVarK.M1(false);
            cVarK.Q1(false);
        }
    }

    public final void z() {
        for (androidx.compose.ui.d.c cVarO = o(); cVarO != null; cVarO = cVarO.x1()) {
            if (cVarO.A1()) {
                cVarO.I1();
            }
        }
    }
}
