package N;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H.Y f7298a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private H.C1230w f7301d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.compose.ui.platform.InterfaceC1957m0 f7304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.compose.ui.platform.t1 f7305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p211v0.a f7306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.compose.ui.focus.n f7307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final V.InterfaceC1753w0 f7308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final V.InterfaceC1753w0 f7309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f7310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private java.lang.Integer f7311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f7312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final V.InterfaceC1753w0 f7313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final V.InterfaceC1753w0 f7314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f7315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private S0.V f7316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private N.w f7317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final H.F f7318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final N.InterfaceC1358h f7319v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private S0.L f7299b = H.c0.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p237x7.l f7300c = N.F.d.f7324D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V.InterfaceC1753w0 f7302e = V.A1.d(new S0.V((java.lang.String) null, 0, (M0.N) null, 7, (p247y7.AbstractC7342k) null), null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private S0.g0 f7303f = S0.g0.f12355a.c();

    public static final class a implements H.F {
        a() {
        }

        @Override // H.F
        public void a(long j6) {
        }

        @Override // H.F
        public void b(long j6) {
            H.V vJ;
            long jA = N.v.a(N.F.this.G(true));
            H.C1230w c1230wL = N.F.this.L();
            if (c1230wL == null || (vJ = c1230wL.j()) == null) {
                return;
            }
            long jK = vJ.k(jA);
            N.F.this.f7310m = jK;
            N.F.this.W(p131n0.g.d(jK));
            N.F.this.f7312o = p131n0.g.f51312b.c();
            N.F.this.Y(H.EnumC1219k.Cursor);
            N.F.this.m0(false);
        }

        @Override // H.F
        public void c() {
            N.F.this.Y(null);
            N.F.this.W(null);
        }

        @Override // H.F
        public void d() {
            N.F.this.Y(null);
            N.F.this.W(null);
        }

        @Override // H.F
        public void e(long j6) {
            H.V vJ;
            p211v0.a aVarH;
            N.F f6 = N.F.this;
            f6.f7312o = p131n0.g.r(f6.f7312o, j6);
            H.C1230w c1230wL = N.F.this.L();
            if (c1230wL == null || (vJ = c1230wL.j()) == null) {
                return;
            }
            N.F f10 = N.F.this;
            f10.W(p131n0.g.d(p131n0.g.r(f10.f7310m, f10.f7312o)));
            S0.L lJ = f10.J();
            p131n0.g gVarA = f10.A();
            p247y7.AbstractC7350t.c(gVarA);
            int iA = lJ.a(H.V.e(vJ, gVarA.v(), false, 2, null));
            long jB = M0.O.b(iA, iA);
            if (M0.N.g(jB, f10.O().h())) {
                return;
            }
            H.C1230w c1230wL2 = f10.L();
            if ((c1230wL2 == null || c1230wL2.y()) && (aVarH = f10.H()) != null) {
                aVarH.a(p211v0.b.f55756a.b());
            }
            f10.K().l(f10.q(f10.O().f(), jB));
        }

        @Override // H.F
        public void onCancel() {
        }
    }

    public static final class b implements H.F {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7322b;

        b(boolean z6) {
            this.f7322b = z6;
        }

        @Override // H.F
        public void a(long j6) {
            H.V vJ;
            N.F.this.Y(this.f7322b ? H.EnumC1219k.SelectionStart : H.EnumC1219k.SelectionEnd);
            long jA = N.v.a(N.F.this.G(this.f7322b));
            H.C1230w c1230wL = N.F.this.L();
            if (c1230wL == null || (vJ = c1230wL.j()) == null) {
                return;
            }
            long jK = vJ.k(jA);
            N.F.this.f7310m = jK;
            N.F.this.W(p131n0.g.d(jK));
            N.F.this.f7312o = p131n0.g.f51312b.c();
            N.F.this.f7315r = -1;
            H.C1230w c1230wL2 = N.F.this.L();
            if (c1230wL2 != null) {
                c1230wL2.D(true);
            }
            N.F.this.m0(false);
        }

        @Override // H.F
        public void b(long j6) {
        }

        @Override // H.F
        public void c() {
            N.F.this.Y(null);
            N.F.this.W(null);
            N.F.this.m0(true);
        }

        @Override // H.F
        public void d() {
            N.F.this.Y(null);
            N.F.this.W(null);
            N.F.this.m0(true);
        }

        @Override // H.F
        public void e(long j6) {
            N.F f6 = N.F.this;
            f6.f7312o = p131n0.g.r(f6.f7312o, j6);
            N.F f10 = N.F.this;
            f10.W(p131n0.g.d(p131n0.g.r(f10.f7310m, N.F.this.f7312o)));
            N.F f11 = N.F.this;
            S0.V vO = f11.O();
            p131n0.g gVarA = N.F.this.A();
            p247y7.AbstractC7350t.c(gVarA);
            f11.n0(vO, gVarA.v(), false, this.f7322b, N.q.f7440a.k(), true);
            N.F.this.m0(false);
        }

        @Override // H.F
        public void onCancel() {
        }
    }

    public static final class c implements N.InterfaceC1358h {
        c() {
        }

        @Override // N.InterfaceC1358h
        public boolean a(long j6, N.q qVar) {
            H.C1230w c1230wL;
            if (!N.F.this.E() || N.F.this.O().i().length() == 0 || (c1230wL = N.F.this.L()) == null || c1230wL.j() == null) {
                return false;
            }
            androidx.compose.ui.focus.n nVarF = N.F.this.F();
            if (nVarF != null) {
                nVarF.f();
            }
            N.F.this.f7310m = j6;
            N.F.this.f7315r = -1;
            N.F.w(N.F.this, false, 1, null);
            f(N.F.this.O(), N.F.this.f7310m, true, qVar);
            return true;
        }

        @Override // N.InterfaceC1358h
        public boolean b(long j6) {
            H.C1230w c1230wL;
            if (!N.F.this.E() || N.F.this.O().i().length() == 0 || (c1230wL = N.F.this.L()) == null || c1230wL.j() == null) {
                return false;
            }
            f(N.F.this.O(), j6, false, N.q.f7440a.l());
            return true;
        }

        @Override // N.InterfaceC1358h
        public boolean c(long j6, N.q qVar) {
            H.C1230w c1230wL;
            if (!N.F.this.E() || N.F.this.O().i().length() == 0 || (c1230wL = N.F.this.L()) == null || c1230wL.j() == null) {
                return false;
            }
            f(N.F.this.O(), j6, false, qVar);
            return true;
        }

        @Override // N.InterfaceC1358h
        public void d() {
        }

        @Override // N.InterfaceC1358h
        public boolean e(long j6) {
            H.C1230w c1230wL = N.F.this.L();
            if (c1230wL == null || c1230wL.j() == null || !N.F.this.E()) {
                return false;
            }
            N.F.this.f7315r = -1;
            f(N.F.this.O(), j6, false, N.q.f7440a.l());
            return true;
        }

        public final void f(S0.V v6, long j6, boolean z6, N.q qVar) {
            N.F.this.c0(M0.N.h(N.F.this.n0(v6, j6, z6, false, qVar, false)) ? H.EnumC1220l.Cursor : H.EnumC1220l.Selection);
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final N.F.d f7324D = new N.F.d();

        d() {
            super(1);
        }

        public final void a(S0.V v6) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((S0.V) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {
        e() {
            super(0);
        }

        public final void a() {
            N.F.p(N.F.this, false, 1, null);
            N.F.this.R();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.a {
        f() {
            super(0);
        }

        public final void a() {
            N.F.this.s();
            N.F.this.R();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.a {
        g() {
            super(0);
        }

        public final void a() {
            N.F.this.T();
            N.F.this.R();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.a {
        h() {
            super(0);
        }

        public final void a() {
            N.F.this.U();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public static final class i implements H.F {
        i() {
        }

        private final void f() {
            N.F.this.Y(null);
            N.F.this.W(null);
            N.F.this.m0(true);
            N.F.this.f7311n = null;
            boolean zH = M0.N.h(N.F.this.O().h());
            N.F.this.c0(zH ? H.EnumC1220l.Cursor : H.EnumC1220l.Selection);
            H.C1230w c1230wL = N.F.this.L();
            if (c1230wL != null) {
                c1230wL.M(!zH && N.G.c(N.F.this, true));
            }
            H.C1230w c1230wL2 = N.F.this.L();
            if (c1230wL2 != null) {
                c1230wL2.L(!zH && N.G.c(N.F.this, false));
            }
            H.C1230w c1230wL3 = N.F.this.L();
            if (c1230wL3 == null) {
                return;
            }
            c1230wL3.J(zH && N.G.c(N.F.this, true));
        }

        @Override // H.F
        public void a(long j6) {
        }

        @Override // H.F
        public void b(long j6) {
            H.V vJ;
            H.V vJ2;
            if (N.F.this.E() && N.F.this.C() == null) {
                N.F.this.Y(H.EnumC1219k.SelectionEnd);
                N.F.this.f7315r = -1;
                N.F.this.R();
                H.C1230w c1230wL = N.F.this.L();
                if (c1230wL == null || (vJ2 = c1230wL.j()) == null || !vJ2.g(j6)) {
                    H.C1230w c1230wL2 = N.F.this.L();
                    if (c1230wL2 != null && (vJ = c1230wL2.j()) != null) {
                        N.F f6 = N.F.this;
                        int iA = f6.J().a(H.V.e(vJ, j6, false, 2, null));
                        S0.V vQ = f6.q(f6.O().f(), M0.O.b(iA, iA));
                        f6.v(false);
                        p211v0.a aVarH = f6.H();
                        if (aVarH != null) {
                            aVarH.a(p211v0.b.f55756a.b());
                        }
                        f6.K().l(vQ);
                    }
                } else {
                    if (N.F.this.O().i().length() == 0) {
                        return;
                    }
                    N.F.this.v(false);
                    N.F f10 = N.F.this;
                    N.F.this.f7311n = java.lang.Integer.valueOf(M0.N.n(f10.n0(S0.V.d(f10.O(), null, M0.N.f6666b.a(), null, 5, null), j6, true, false, N.q.f7440a.n(), true)));
                }
                N.F.this.c0(H.EnumC1220l.None);
                N.F.this.f7310m = j6;
                N.F f11 = N.F.this;
                f11.W(p131n0.g.d(f11.f7310m));
                N.F.this.f7312o = p131n0.g.f51312b.c();
            }
        }

        @Override // H.F
        public void c() {
            f();
        }

        @Override // H.F
        public void d() {
        }

        /* JADX WARN: Code duplicated, block: B:21:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:24:0x00c1  */
        @Override // H.F
        public void e(long j6) {
            H.V vJ;
            java.lang.Integer num;
            int iD;
            S0.V vO;
            long jV;
            N.q qVarN;
            boolean z6;
            boolean z10;
            boolean z11;
            if (!N.F.this.E() || N.F.this.O().i().length() == 0) {
                return;
            }
            N.F f6 = N.F.this;
            f6.f7312o = p131n0.g.r(f6.f7312o, j6);
            H.C1230w c1230wL = N.F.this.L();
            if (c1230wL != null && (vJ = c1230wL.j()) != null) {
                N.F f10 = N.F.this;
                f10.W(p131n0.g.d(p131n0.g.r(f10.f7310m, f10.f7312o)));
                if (f10.f7311n == null) {
                    p131n0.g gVarA = f10.A();
                    p247y7.AbstractC7350t.c(gVarA);
                    if (vJ.g(gVarA.v())) {
                        num = f10.f7311n;
                        if (num != null) {
                            iD = num.intValue();
                        } else {
                            iD = vJ.d(f10.f7310m, false);
                        }
                        p131n0.g gVarA2 = f10.A();
                        p247y7.AbstractC7350t.c(gVarA2);
                        int iD2 = vJ.d(gVarA2.v(), false);
                        if (f10.f7311n != null && iD == iD2) {
                            return;
                        }
                        vO = f10.O();
                        p131n0.g gVarA3 = f10.A();
                        p247y7.AbstractC7350t.c(gVarA3);
                        jV = gVarA3.v();
                        qVarN = N.q.f7440a.n();
                        z6 = true;
                        z10 = false;
                        z11 = false;
                    } else {
                        int iA = f10.J().a(H.V.e(vJ, f10.f7310m, false, 2, null));
                        S0.L lJ = f10.J();
                        p131n0.g gVarA4 = f10.A();
                        p247y7.AbstractC7350t.c(gVarA4);
                        qVarN = iA == lJ.a(H.V.e(vJ, gVarA4.v(), false, 2, null)) ? N.q.f7440a.l() : N.q.f7440a.n();
                        vO = f10.O();
                        p131n0.g gVarA5 = f10.A();
                        p247y7.AbstractC7350t.c(gVarA5);
                        jV = gVarA5.v();
                        z11 = false;
                        z6 = true;
                        z10 = false;
                    }
                } else {
                    num = f10.f7311n;
                    if (num != null) {
                        iD = num.intValue();
                    } else {
                        iD = vJ.d(f10.f7310m, false);
                    }
                    p131n0.g gVarA6 = f10.A();
                    p247y7.AbstractC7350t.c(gVarA6);
                    int iD3 = vJ.d(gVarA6.v(), false);
                    if (f10.f7311n != null) {
                    }
                    vO = f10.O();
                    p131n0.g gVarA7 = f10.A();
                    p247y7.AbstractC7350t.c(gVarA7);
                    jV = gVarA7.v();
                    qVarN = N.q.f7440a.n();
                    z6 = true;
                    z10 = false;
                    z11 = false;
                }
                M0.N.b(f10.n0(vO, jV, z10, z11, qVarN, z6));
            }
            N.F.this.m0(false);
        }

        @Override // H.F
        public void onCancel() {
            f();
        }
    }

    public F(H.Y y6) {
        this.f7298a = y6;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.f7308k = V.A1.d(bool, null, 2, null);
        this.f7309l = V.A1.d(bool, null, 2, null);
        n0.g.a aVar = p131n0.g.f51312b;
        this.f7310m = aVar.c();
        this.f7312o = aVar.c();
        this.f7313p = V.A1.d(null, null, 2, null);
        this.f7314q = V.A1.d(null, null, 2, null);
        this.f7315r = -1;
        this.f7316s = new S0.V((java.lang.String) null, 0L, (M0.N) null, 7, (p247y7.AbstractC7342k) null);
        this.f7318u = new N.F.i();
        this.f7319v = new N.F.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(p131n0.g gVar) {
        this.f7314q.setValue(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(H.EnumC1219k enumC1219k) {
        this.f7313p.setValue(enumC1219k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(H.EnumC1220l enumC1220l) {
        H.C1230w c1230w = this.f7301d;
        if (c1230w != null) {
            if (c1230w.d() == enumC1220l) {
                c1230w = null;
            }
            if (c1230w != null) {
                c1230w.B(enumC1220l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(boolean z6) {
        H.C1230w c1230w = this.f7301d;
        if (c1230w != null) {
            c1230w.K(z6);
        }
        if (z6) {
            l0();
        } else {
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long n0(S0.V v6, long j6, boolean z6, boolean z10, N.q qVar, boolean z11) {
        H.V vJ;
        p211v0.a aVar;
        int i6;
        H.C1230w c1230w = this.f7301d;
        if (c1230w == null || (vJ = c1230w.j()) == null) {
            return M0.N.f6666b.a();
        }
        long jB = M0.O.b(this.f7299b.b(M0.N.n(v6.h())), this.f7299b.b(M0.N.i(v6.h())));
        boolean z12 = false;
        int iD = vJ.d(j6, false);
        int iN = (z10 || z6) ? iD : M0.N.n(jB);
        int i10 = (!z10 || z6) ? iD : M0.N.i(jB);
        N.w wVar = this.f7317t;
        int i11 = -1;
        if (!z6 && wVar != null && (i6 = this.f7315r) != -1) {
            i11 = i6;
        }
        N.w wVarC = N.x.c(vJ.f(), iN, i10, i11, jB, z6, z10);
        if (!wVarC.f(wVar)) {
            return v6.h();
        }
        this.f7317t = wVarC;
        this.f7315r = iD;
        N.C1361k c1361kA = qVar.a(wVarC);
        long jB2 = M0.O.b(this.f7299b.a(c1361kA.e().c()), this.f7299b.a(c1361kA.c().c()));
        if (M0.N.g(jB2, v6.h())) {
            return v6.h();
        }
        boolean z13 = M0.N.m(jB2) != M0.N.m(v6.h()) && M0.N.g(M0.O.b(M0.N.i(jB2), M0.N.n(jB2)), v6.h());
        boolean z14 = M0.N.h(jB2) && M0.N.h(v6.h());
        if (z11 && v6.i().length() > 0 && !z13 && !z14 && (aVar = this.f7306i) != null) {
            aVar.a(p211v0.b.f55756a.b());
        }
        this.f7300c.l(q(v6.f(), jB2));
        if (!z11) {
            m0(!M0.N.h(jB2));
        }
        H.C1230w c1230w2 = this.f7301d;
        if (c1230w2 != null) {
            c1230w2.D(z11);
        }
        H.C1230w c1230w3 = this.f7301d;
        if (c1230w3 != null) {
            c1230w3.M(!M0.N.h(jB2) && N.G.c(this, true));
        }
        H.C1230w c1230w4 = this.f7301d;
        if (c1230w4 != null) {
            c1230w4.L(!M0.N.h(jB2) && N.G.c(this, false));
        }
        H.C1230w c1230w5 = this.f7301d;
        if (c1230w5 != null) {
            if (M0.N.h(jB2) && N.G.c(this, true)) {
                z12 = true;
            }
            c1230w5.J(z12);
        }
        return jB2;
    }

    public static /* synthetic */ void p(N.F f6, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        f6.o(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S0.V q(M0.C1332d c1332d, long j6) {
        return new S0.V(c1332d, j6, (M0.N) null, 4, (p247y7.AbstractC7342k) null);
    }

    public static /* synthetic */ void u(N.F f6, p131n0.g gVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            gVar = null;
        }
        f6.t(gVar);
    }

    public static /* synthetic */ void w(N.F f6, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        f6.v(z6);
    }

    private final p131n0.i z() {
        float fN;
        D0.InterfaceC0900t interfaceC0900tI;
        M0.K kF;
        p131n0.i iVarE;
        D0.InterfaceC0900t interfaceC0900tI2;
        M0.K kF2;
        p131n0.i iVarE2;
        D0.InterfaceC0900t interfaceC0900tI3;
        D0.InterfaceC0900t interfaceC0900tI4;
        H.C1230w c1230w = this.f7301d;
        if (c1230w != null) {
            if (!(!c1230w.z())) {
                c1230w = null;
            }
            if (c1230w != null) {
                int iB = this.f7299b.b(M0.N.n(O().h()));
                int iB2 = this.f7299b.b(M0.N.i(O().h()));
                H.C1230w c1230w2 = this.f7301d;
                long jC = (c1230w2 == null || (interfaceC0900tI4 = c1230w2.i()) == null) ? p131n0.g.f51312b.c() : interfaceC0900tI4.h0(G(true));
                H.C1230w c1230w3 = this.f7301d;
                long jC2 = (c1230w3 == null || (interfaceC0900tI3 = c1230w3.i()) == null) ? p131n0.g.f51312b.c() : interfaceC0900tI3.h0(G(false));
                H.C1230w c1230w4 = this.f7301d;
                float fN2 = 0.0f;
                if (c1230w4 == null || (interfaceC0900tI2 = c1230w4.i()) == null) {
                    fN = 0.0f;
                } else {
                    H.V vJ = c1230w.j();
                    fN = p131n0.g.n(interfaceC0900tI2.h0(p131n0.h.a(0.0f, (vJ == null || (kF2 = vJ.f()) == null || (iVarE2 = kF2.e(iB)) == null) ? 0.0f : iVarE2.l())));
                }
                H.C1230w c1230w5 = this.f7301d;
                if (c1230w5 != null && (interfaceC0900tI = c1230w5.i()) != null) {
                    H.V vJ2 = c1230w.j();
                    fN2 = p131n0.g.n(interfaceC0900tI.h0(p131n0.h.a(0.0f, (vJ2 == null || (kF = vJ2.f()) == null || (iVarE = kF.e(iB2)) == null) ? 0.0f : iVarE.l())));
                }
                return new p131n0.i(java.lang.Math.min(p131n0.g.m(jC), p131n0.g.m(jC2)), java.lang.Math.min(fN, fN2), java.lang.Math.max(p131n0.g.m(jC), p131n0.g.m(jC2)), java.lang.Math.max(p131n0.g.n(jC), p131n0.g.n(jC2)) + (Y0.i.q(25) * c1230w.v().a().getDensity()));
            }
        }
        return p131n0.i.f51317e.a();
    }

    public final p131n0.g A() {
        return (p131n0.g) this.f7314q.getValue();
    }

    public final long B(Y0.e eVar) {
        int iB = this.f7299b.b(M0.N.n(O().h()));
        H.C1230w c1230w = this.f7301d;
        H.V vJ = c1230w != null ? c1230w.j() : null;
        p247y7.AbstractC7350t.c(vJ);
        M0.K kF = vJ.f();
        p131n0.i iVarE = kF.e(E7.j.k(iB, 0, kF.l().j().length()));
        return p131n0.h.a(iVarE.i() + (eVar.B0(H.G.b()) / 2), iVarE.e());
    }

    public final H.EnumC1219k C() {
        return (H.EnumC1219k) this.f7313p.getValue();
    }

    public final boolean D() {
        return ((java.lang.Boolean) this.f7308k.getValue()).booleanValue();
    }

    public final boolean E() {
        return ((java.lang.Boolean) this.f7309l.getValue()).booleanValue();
    }

    public final androidx.compose.ui.focus.n F() {
        return this.f7307j;
    }

    public final long G(boolean z6) {
        H.V vJ;
        M0.K kF;
        H.C1230w c1230w = this.f7301d;
        if (c1230w == null || (vJ = c1230w.j()) == null || (kF = vJ.f()) == null) {
            return p131n0.g.f51312b.b();
        }
        M0.C1332d c1332dN = N();
        if (c1332dN == null) {
            return p131n0.g.f51312b.b();
        }
        if (!p247y7.AbstractC7350t.b(c1332dN.i(), kF.l().j().i())) {
            return p131n0.g.f51312b.b();
        }
        long jH = O().h();
        return N.L.b(kF, this.f7299b.b(z6 ? M0.N.n(jH) : M0.N.i(jH)), z6, M0.N.m(O().h()));
    }

    public final p211v0.a H() {
        return this.f7306i;
    }

    public final N.InterfaceC1358h I() {
        return this.f7319v;
    }

    public final S0.L J() {
        return this.f7299b;
    }

    public final p237x7.l K() {
        return this.f7300c;
    }

    public final H.C1230w L() {
        return this.f7301d;
    }

    public final H.F M() {
        return this.f7318u;
    }

    public final M0.C1332d N() {
        H.D dV;
        H.C1230w c1230w = this.f7301d;
        if (c1230w == null || (dV = c1230w.v()) == null) {
            return null;
        }
        return dV.k();
    }

    public final S0.V O() {
        return (S0.V) this.f7302e.getValue();
    }

    public final S0.g0 P() {
        return this.f7303f;
    }

    public final H.F Q(boolean z6) {
        return new N.F.b(z6);
    }

    public final void R() {
        androidx.compose.ui.platform.t1 t1Var;
        androidx.compose.ui.platform.t1 t1Var2 = this.f7305h;
        if ((t1Var2 != null ? t1Var2.d() : null) != androidx.compose.ui.platform.v1.Shown || (t1Var = this.f7305h) == null) {
            return;
        }
        t1Var.a();
    }

    public final boolean S() {
        return !p247y7.AbstractC7350t.b(this.f7316s.i(), O().i());
    }

    public final void T() {
        M0.C1332d c1332dA;
        androidx.compose.ui.platform.InterfaceC1957m0 interfaceC1957m0 = this.f7304g;
        if (interfaceC1957m0 == null || (c1332dA = interfaceC1957m0.a()) == null) {
            return;
        }
        M0.C1332d c1332dN = S0.W.c(O(), O().i().length()).n(c1332dA).n(S0.W.b(O(), O().i().length()));
        int iL = M0.N.l(O().h()) + c1332dA.length();
        this.f7300c.l(q(c1332dN, M0.O.b(iL, iL)));
        c0(H.EnumC1220l.None);
        H.Y y6 = this.f7298a;
        if (y6 != null) {
            y6.a();
        }
    }

    public final void U() {
        S0.V vQ = q(O().f(), M0.O.b(0, O().i().length()));
        this.f7300c.l(vQ);
        this.f7316s = S0.V.d(this.f7316s, null, vQ.h(), null, 5, null);
        v(true);
    }

    public final void V(androidx.compose.ui.platform.InterfaceC1957m0 interfaceC1957m0) {
        this.f7304g = interfaceC1957m0;
    }

    public final void X(long j6) {
        H.C1230w c1230w = this.f7301d;
        if (c1230w != null) {
            c1230w.A(j6);
        }
        H.C1230w c1230w2 = this.f7301d;
        if (c1230w2 != null) {
            c1230w2.I(M0.N.f6666b.a());
        }
        if (M0.N.h(j6)) {
            return;
        }
        x();
    }

    public final void Z(boolean z6) {
        this.f7308k.setValue(java.lang.Boolean.valueOf(z6));
    }

    public final void a0(boolean z6) {
        this.f7309l.setValue(java.lang.Boolean.valueOf(z6));
    }

    public final void b0(androidx.compose.ui.focus.n nVar) {
        this.f7307j = nVar;
    }

    public final void d0(p211v0.a aVar) {
        this.f7306i = aVar;
    }

    public final void e0(S0.L l6) {
        this.f7299b = l6;
    }

    public final void f0(p237x7.l lVar) {
        this.f7300c = lVar;
    }

    public final void g0(long j6) {
        H.C1230w c1230w = this.f7301d;
        if (c1230w != null) {
            c1230w.I(j6);
        }
        H.C1230w c1230w2 = this.f7301d;
        if (c1230w2 != null) {
            c1230w2.A(M0.N.f6666b.a());
        }
        if (M0.N.h(j6)) {
            return;
        }
        x();
    }

    public final void h0(H.C1230w c1230w) {
        this.f7301d = c1230w;
    }

    public final void i0(androidx.compose.ui.platform.t1 t1Var) {
        this.f7305h = t1Var;
    }

    public final void j0(S0.V v6) {
        this.f7302e.setValue(v6);
    }

    public final void k0(S0.g0 g0Var) {
        this.f7303f = g0Var;
    }

    public final void l0() {
        androidx.compose.ui.platform.InterfaceC1957m0 interfaceC1957m0;
        if (E()) {
            H.C1230w c1230w = this.f7301d;
            if (c1230w == null || c1230w.y()) {
                boolean z6 = this.f7303f instanceof S0.N;
                N.F.e eVar = (M0.N.h(O().h()) || z6) ? null : new N.F.e();
                N.F.f fVar = (M0.N.h(O().h()) || !D() || z6) ? null : new N.F.f();
                N.F.g gVar = (D() && (interfaceC1957m0 = this.f7304g) != null && interfaceC1957m0.c()) ? new N.F.g() : null;
                N.F.h hVar = M0.N.j(O().h()) != O().i().length() ? new N.F.h() : null;
                androidx.compose.ui.platform.t1 t1Var = this.f7305h;
                if (t1Var != null) {
                    t1Var.b(z(), eVar, gVar, fVar, hVar);
                }
            }
        }
    }

    public final void n() {
        H.C1230w c1230w = this.f7301d;
        if (c1230w != null) {
            c1230w.A(M0.N.f6666b.a());
        }
        H.C1230w c1230w2 = this.f7301d;
        if (c1230w2 == null) {
            return;
        }
        c1230w2.I(M0.N.f6666b.a());
    }

    public final void o(boolean z6) {
        if (M0.N.h(O().h())) {
            return;
        }
        androidx.compose.ui.platform.InterfaceC1957m0 interfaceC1957m0 = this.f7304g;
        if (interfaceC1957m0 != null) {
            interfaceC1957m0.b(S0.W.a(O()));
        }
        if (z6) {
            int iK = M0.N.k(O().h());
            this.f7300c.l(q(O().f(), M0.O.b(iK, iK)));
            c0(H.EnumC1220l.None);
        }
    }

    public final H.F r() {
        return new N.F.a();
    }

    public final void s() {
        if (M0.N.h(O().h())) {
            return;
        }
        androidx.compose.ui.platform.InterfaceC1957m0 interfaceC1957m0 = this.f7304g;
        if (interfaceC1957m0 != null) {
            interfaceC1957m0.b(S0.W.a(O()));
        }
        M0.C1332d c1332dN = S0.W.c(O(), O().i().length()).n(S0.W.b(O(), O().i().length()));
        int iL = M0.N.l(O().h());
        this.f7300c.l(q(c1332dN, M0.O.b(iL, iL)));
        c0(H.EnumC1220l.None);
        H.Y y6 = this.f7298a;
        if (y6 != null) {
            y6.a();
        }
    }

    public final void t(p131n0.g gVar) {
        if (!M0.N.h(O().h())) {
            H.C1230w c1230w = this.f7301d;
            H.V vJ = c1230w != null ? c1230w.j() : null;
            this.f7300c.l(S0.V.d(O(), null, M0.O.a((gVar == null || vJ == null) ? M0.N.k(O().h()) : this.f7299b.a(H.V.e(vJ, gVar.v(), false, 2, null))), null, 5, null));
        }
        c0((gVar == null || O().i().length() <= 0) ? H.EnumC1220l.None : H.EnumC1220l.Cursor);
        m0(false);
    }

    public final void v(boolean z6) {
        androidx.compose.ui.focus.n nVar;
        H.C1230w c1230w = this.f7301d;
        if (c1230w != null && !c1230w.e() && (nVar = this.f7307j) != null) {
            nVar.f();
        }
        this.f7316s = O();
        m0(z6);
        c0(H.EnumC1220l.Selection);
    }

    public final void x() {
        m0(false);
        c0(H.EnumC1220l.None);
    }

    public final androidx.compose.ui.platform.InterfaceC1957m0 y() {
        return this.f7304g;
    }
}
