package F0;

/* JADX INFO: loaded from: classes.dex */
public final class F extends F0.AbstractC0914d0 {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private static final p141o0.N1 f2327A0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final F0.F.a f2328z0 = new F0.F.a(null);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private F0.E f2329v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private Y0.C1859b f2330w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private F0.U f2331x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private D0.C0885d f2332y0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private final class b extends F0.U {
        public b() {
            super(F0.F.this);
        }

        @Override // F0.U, D0.InterfaceC0895n
        public int S(int i6) {
            F0.E eI3 = F0.F.this.i3();
            F0.U uJ2 = F0.F.this.j3().j2();
            p247y7.AbstractC7350t.c(uJ2);
            return eI3.C(this, uJ2, i6);
        }

        @Override // F0.U, D0.InterfaceC0895n
        public int T(int i6) {
            F0.E eI3 = F0.F.this.i3();
            F0.U uJ2 = F0.F.this.j3().j2();
            p247y7.AbstractC7350t.c(uJ2);
            return eI3.F(this, uJ2, i6);
        }

        @Override // D0.G
        public D0.X U(long j6) {
            F0.F f6 = F0.F.this;
            a1(j6);
            f6.m3(Y0.C1859b.a(j6));
            F0.E eI3 = f6.i3();
            F0.U uJ2 = f6.j3().j2();
            p247y7.AbstractC7350t.c(uJ2);
            R1(eI3.f(this, uJ2, j6));
            return this;
        }

        @Override // F0.T
        public int f1(D0.AbstractC0882a abstractC0882a) {
            int iB = F0.G.b(this, abstractC0882a);
            I1().put(abstractC0882a, java.lang.Integer.valueOf(iB));
            return iB;
        }

        @Override // F0.U, D0.InterfaceC0895n
        public int n0(int i6) {
            F0.E eI3 = F0.F.this.i3();
            F0.U uJ2 = F0.F.this.j3().j2();
            p247y7.AbstractC7350t.c(uJ2);
            return eI3.t(this, uJ2, i6);
        }

        @Override // F0.U, D0.InterfaceC0895n
        public int t(int i6) {
            F0.E eI3 = F0.F.this.i3();
            F0.U uJ2 = F0.F.this.j3().j2();
            p247y7.AbstractC7350t.c(uJ2);
            return eI3.k(this, uJ2, i6);
        }
    }

    static {
        p141o0.N1 n1A = p141o0.U.a();
        n1A.G(p141o0.C7016y0.f52264b.b());
        n1A.I(1.0f);
        n1A.F(p141o0.O1.f52148a.b());
        f2327A0 = n1A;
    }

    public F(F0.J j6, F0.E e6) {
        super(j6);
        this.f2329v0 = e6;
        D0.C0885d c0885d = null;
        this.f2331x0 = j6.b0() != null ? new F0.F.b() : null;
        if ((e6.E0().v1() & F0.AbstractC0918f0.a(512)) != 0) {
            p247y7.AbstractC7350t.d(e6, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            androidx.appcompat.app.D.a(e6);
            c0885d = new D0.C0885d(this, null);
        }
        this.f2332y0 = c0885d;
    }

    private final void k3() {
        if (z1()) {
            return;
        }
        H2();
        D0.C0885d c0885d = this.f2332y0;
        if (c0885d == null) {
            q1().k();
            j3().P2(false);
            return;
        }
        c0885d.f();
        s1();
        F0.U uJ2 = j2();
        p247y7.AbstractC7350t.c(uJ2);
        uJ2.L1();
        throw null;
    }

    @Override // F0.AbstractC0914d0
    public void J2(p141o0.InterfaceC6993q0 interfaceC6993q0, p171r0.C7053c c7053c) {
        j3().W1(interfaceC6993q0, c7053c);
        if (F0.N.b(o1()).getShowLayoutBounds()) {
            X1(interfaceC6993q0, f2327A0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // F0.AbstractC0914d0, D0.X
    public void M0(long j6, float f6, p171r0.C7053c c7053c) {
        super.M0(j6, f6, c7053c);
        k3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // F0.AbstractC0914d0, D0.X
    public void R0(long j6, float f6, p237x7.l lVar) {
        super.R0(j6, f6, lVar);
        k3();
    }

    @Override // D0.InterfaceC0895n
    public int S(int i6) {
        D0.C0885d c0885d = this.f2332y0;
        if (c0885d == null) {
            return this.f2329v0.C(this, j3(), i6);
        }
        c0885d.f();
        j3();
        throw null;
    }

    @Override // D0.InterfaceC0895n
    public int T(int i6) {
        D0.C0885d c0885d = this.f2332y0;
        if (c0885d == null) {
            return this.f2329v0.F(this, j3(), i6);
        }
        c0885d.f();
        j3();
        throw null;
    }

    @Override // D0.G
    public D0.X U(long j6) {
        if (f2()) {
            Y0.C1859b c1859b = this.f2330w0;
            if (c1859b == null) {
                throw new java.lang.IllegalArgumentException("Lookahead constraints cannot be null in approach pass.".toString());
            }
            j6 = c1859b.r();
        }
        a1(j6);
        D0.C0885d c0885d = this.f2332y0;
        if (c0885d == null) {
            Q2(i3().f(this, j3(), j6));
            G2();
            return this;
        }
        c0885d.f();
        c0885d.s();
        throw null;
    }

    @Override // F0.AbstractC0914d0
    public void Z1() {
        if (j2() == null) {
            n3(new F0.F.b());
        }
    }

    @Override // F0.T
    public int f1(D0.AbstractC0882a abstractC0882a) {
        F0.U uJ2 = j2();
        return uJ2 != null ? uJ2.H1(abstractC0882a) : F0.G.b(this, abstractC0882a);
    }

    public final F0.E i3() {
        return this.f2329v0;
    }

    @Override // F0.AbstractC0914d0
    public F0.U j2() {
        return this.f2331x0;
    }

    public final F0.AbstractC0914d0 j3() {
        F0.AbstractC0914d0 abstractC0914d0O2 = o2();
        p247y7.AbstractC7350t.c(abstractC0914d0O2);
        return abstractC0914d0O2;
    }

    public final void l3(F0.E e6) {
        if (!p247y7.AbstractC7350t.b(e6, this.f2329v0)) {
            androidx.compose.ui.d.c cVarE0 = e6.E0();
            if ((cVarE0.v1() & F0.AbstractC0918f0.a(512)) != 0) {
                p247y7.AbstractC7350t.d(e6, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                androidx.appcompat.app.D.a(e6);
                D0.C0885d c0885d = this.f2332y0;
                if (c0885d != null) {
                    androidx.appcompat.app.D.a(e6);
                    c0885d.t(null);
                } else {
                    androidx.appcompat.app.D.a(e6);
                    c0885d = new D0.C0885d(this, null);
                }
                this.f2332y0 = c0885d;
            } else {
                this.f2332y0 = null;
            }
        }
        this.f2329v0 = e6;
    }

    public final void m3(Y0.C1859b c1859b) {
        this.f2330w0 = c1859b;
    }

    @Override // D0.InterfaceC0895n
    public int n0(int i6) {
        D0.C0885d c0885d = this.f2332y0;
        if (c0885d == null) {
            return this.f2329v0.t(this, j3(), i6);
        }
        c0885d.f();
        j3();
        throw null;
    }

    @Override // F0.AbstractC0914d0
    public androidx.compose.ui.d.c n2() {
        return this.f2329v0.E0();
    }

    protected void n3(F0.U u6) {
        this.f2331x0 = u6;
    }

    @Override // D0.InterfaceC0895n
    public int t(int i6) {
        D0.C0885d c0885d = this.f2332y0;
        if (c0885d == null) {
            return this.f2329v0.k(this, j3(), i6);
        }
        c0885d.f();
        j3();
        throw null;
    }
}
