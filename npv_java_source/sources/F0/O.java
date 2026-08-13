package F0;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0.J f2396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2397b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f2411p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2412q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private F0.O.a f2414s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private F0.J.e f2398c = F0.J.e.Idle;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final F0.O.b f2413r = new F0.O.b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f2415t = Y0.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p237x7.a f2416u = new F0.O.d();

    public final class a extends D0.X implements D0.G, F0.InterfaceC0909b, F0.X {

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private boolean f2417H;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private boolean f2421L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private boolean f2422M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private boolean f2423N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Y0.C1859b f2424O;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private float f2426Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private p237x7.l f2427R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private p171r0.C7053c f2428S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private boolean f2429T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private boolean f2433X;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private boolean f2436a0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private boolean f2437b0;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private int f2418I = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private int f2419J = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private F0.J.g f2420K = F0.J.g.NotUsed;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private long f2425P = Y0.p.f16221b.a();

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        private final F0.AbstractC0907a f2430U = new F0.S(this);

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        private final X.b f2431V = new X.b(new F0.O.a[16], 0);

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        private boolean f2432W = true;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private boolean f2434Y = true;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private java.lang.Object f2435Z = n1().Z();

        /* JADX INFO: renamed from: F0.O$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0054a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2439a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f2440b;

            static {
                int[] iArr = new int[F0.J.e.values().length];
                try {
                    iArr[F0.J.e.LookaheadMeasuring.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[F0.J.e.Measuring.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[F0.J.e.LayingOut.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[F0.J.e.LookaheadLayingOut.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                f2439a = iArr;
                int[] iArr2 = new int[F0.J.g.values().length];
                try {
                    iArr2[F0.J.g.InMeasureBlock.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr2[F0.J.g.InLayoutBlock.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                f2440b = iArr2;
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ F0.U f2442E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ F0.O f2443F;

            /* JADX INFO: renamed from: F0.O$a$b$a, reason: collision with other inner class name */
            static final class C0055a extends p247y7.AbstractC7352v implements p237x7.l {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                public static final F0.O.a.b.C0055a f2444D = new F0.O.a.b.C0055a();

                C0055a() {
                    super(1);
                }

                public final void a(F0.InterfaceC0909b interfaceC0909b) {
                    interfaceC0909b.f().t(false);
                }

                @Override // p237x7.l
                public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                    a((F0.InterfaceC0909b) obj);
                    return p087i7.M.f46721a;
                }
            }

            /* JADX INFO: renamed from: F0.O$a$b$b, reason: collision with other inner class name */
            static final class C0056b extends p247y7.AbstractC7352v implements p237x7.l {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                public static final F0.O.a.b.C0056b f2445D = new F0.O.a.b.C0056b();

                C0056b() {
                    super(1);
                }

                public final void a(F0.InterfaceC0909b interfaceC0909b) {
                    interfaceC0909b.f().q(interfaceC0909b.f().l());
                }

                @Override // p237x7.l
                public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                    a((F0.InterfaceC0909b) obj);
                    return p087i7.M.f46721a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(F0.U u6, F0.O o6) {
                super(0);
                this.f2442E = u6;
                this.f2443F = o6;
            }

            public final void a() {
                F0.O.a.this.i1();
                F0.O.a.this.c0(F0.O.a.b.C0055a.f2444D);
                F0.U uJ2 = F0.O.a.this.F().j2();
                if (uJ2 != null) {
                    boolean zY1 = uJ2.y1();
                    java.util.List listH = this.f2443F.f2396a.H();
                    int size = listH.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        F0.U uJ3 = ((F0.J) listH.get(i6)).m0().j2();
                        if (uJ3 != null) {
                            uJ3.C1(zY1);
                        }
                    }
                }
                this.f2442E.q1().k();
                F0.U uJ4 = F0.O.a.this.F().j2();
                if (uJ4 != null) {
                    uJ4.y1();
                    java.util.List listH2 = this.f2443F.f2396a.H();
                    int size2 = listH2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        F0.U uJ5 = ((F0.J) listH2.get(i10)).m0().j2();
                        if (uJ5 != null) {
                            uJ5.C1(false);
                        }
                    }
                }
                F0.O.a.this.h1();
                F0.O.a.this.c0(F0.O.a.b.C0056b.f2445D);
            }

            @Override // p237x7.a
            public /* bridge */ /* synthetic */ java.lang.Object b() {
                a();
                return p087i7.M.f46721a;
            }
        }

        static final class c extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ F0.O f2446D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ F0.o0 f2447E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ long f2448F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(F0.O o6, F0.o0 o0Var, long j6) {
                super(0);
                this.f2446D = o6;
                this.f2447E = o0Var;
                this.f2448F = j6;
            }

            public final void a() {
                F0.AbstractC0914d0 abstractC0914d0P2;
                F0.T tJ2;
                D0.X.a placementScope = null;
                if (!F0.P.a(this.f2446D.f2396a) ? !((abstractC0914d0P2 = this.f2446D.K().p2()) == null || (tJ2 = abstractC0914d0P2.j2()) == null) : (tJ2 = this.f2446D.K().p2()) != null) {
                    placementScope = tJ2.s1();
                }
                if (placementScope == null) {
                    placementScope = this.f2447E.getPlacementScope();
                }
                F0.O o6 = this.f2446D;
                long j6 = this.f2448F;
                F0.U uJ2 = o6.K().j2();
                p247y7.AbstractC7350t.c(uJ2);
                D0.X.a.j(placementScope, uJ2, j6, 0.0f, 2, null);
            }

            @Override // p237x7.a
            public /* bridge */ /* synthetic */ java.lang.Object b() {
                a();
                return p087i7.M.f46721a;
            }
        }

        static final class d extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final F0.O.a.d f2449D = new F0.O.a.d();

            d() {
                super(1);
            }

            public final void a(F0.InterfaceC0909b interfaceC0909b) {
                interfaceC0909b.f().u(false);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((F0.InterfaceC0909b) obj);
                return p087i7.M.f46721a;
            }
        }

        public a() {
        }

        private final void A1(long j6, float f6, p237x7.l lVar, p171r0.C7053c c7053c) {
            if (!(!F0.O.this.f2396a.L0())) {
                C0.a.a("place is called on a deactivated node");
            }
            F0.O.this.f2398c = F0.J.e.LookaheadLayingOut;
            this.f2422M = true;
            this.f2437b0 = false;
            if (!Y0.p.g(j6, this.f2425P)) {
                if (F0.O.this.D() || F0.O.this.E()) {
                    F0.O.this.f2403h = true;
                }
                v1();
            }
            F0.o0 o0VarB = F0.N.b(F0.O.this.f2396a);
            if (F0.O.this.F() || !k()) {
                F0.O.this.a0(false);
                f().r(false);
                F0.q0.d(o0VarB.getSnapshotObserver(), F0.O.this.f2396a, false, new F0.O.a.c(F0.O.this, o0VarB, j6), 2, null);
            } else {
                F0.U uJ2 = F0.O.this.K().j2();
                p247y7.AbstractC7350t.c(uJ2);
                uJ2.O1(j6);
                z1();
            }
            this.f2425P = j6;
            this.f2426Q = f6;
            this.f2427R = lVar;
            this.f2428S = c7053c;
            F0.O.this.f2398c = F0.J.e.Idle;
        }

        private final void H1(F0.J j6) {
            F0.J.g gVar;
            F0.J jO0 = j6.o0();
            if (jO0 != null) {
                if (!(this.f2420K == F0.J.g.NotUsed || j6.E())) {
                    C0.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                }
                int i6 = F0.O.a.C0054a.f2439a[jO0.X().ordinal()];
                if (i6 == 1 || i6 == 2) {
                    gVar = F0.J.g.InMeasureBlock;
                } else {
                    if (i6 != 3 && i6 != 4) {
                        throw new java.lang.IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + jO0.X());
                    }
                    gVar = F0.J.g.InLayoutBlock;
                }
            } else {
                gVar = F0.J.g.NotUsed;
            }
            this.f2420K = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h1() {
            X.b bVarW0 = F0.O.this.f2396a.w0();
            int iT = bVarW0.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarW0.s();
                int i6 = 0;
                do {
                    F0.O.a aVarH = ((F0.J) objArrS[i6]).V().H();
                    p247y7.AbstractC7350t.c(aVarH);
                    int i10 = aVarH.f2418I;
                    int i11 = aVarH.f2419J;
                    if (i10 != i11 && i11 == Integer.MAX_VALUE) {
                        aVarH.u1();
                    }
                    i6++;
                } while (i6 < iT);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i1() {
            int i6 = 0;
            F0.O.this.f2405j = 0;
            X.b bVarW0 = F0.O.this.f2396a.w0();
            int iT = bVarW0.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarW0.s();
                do {
                    F0.O.a aVarH = ((F0.J) objArrS[i6]).V().H();
                    p247y7.AbstractC7350t.c(aVarH);
                    aVarH.f2418I = aVarH.f2419J;
                    aVarH.f2419J = Integer.MAX_VALUE;
                    if (aVarH.f2420K == F0.J.g.InLayoutBlock) {
                        aVarH.f2420K = F0.J.g.NotUsed;
                    }
                    i6++;
                } while (i6 < iT);
            }
        }

        private final void t1() {
            boolean zK = k();
            G1(true);
            if (!zK && F0.O.this.G()) {
                F0.J.s1(F0.O.this.f2396a, true, false, false, 6, null);
            }
            X.b bVarW0 = F0.O.this.f2396a.w0();
            int iT = bVarW0.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarW0.s();
                int i6 = 0;
                do {
                    F0.J j6 = (F0.J) objArrS[i6];
                    F0.O.a aVarA0 = j6.a0();
                    if (aVarA0 == null) {
                        throw new java.lang.IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.".toString());
                    }
                    if (aVarA0.f2419J != Integer.MAX_VALUE) {
                        aVarA0.t1();
                        j6.x1(j6);
                    }
                    i6++;
                } while (i6 < iT);
            }
        }

        private final void u1() {
            if (k()) {
                int i6 = 0;
                G1(false);
                X.b bVarW0 = F0.O.this.f2396a.w0();
                int iT = bVarW0.t();
                if (iT > 0) {
                    java.lang.Object[] objArrS = bVarW0.s();
                    do {
                        F0.O.a aVarH = ((F0.J) objArrS[i6]).V().H();
                        p247y7.AbstractC7350t.c(aVarH);
                        aVarH.u1();
                        i6++;
                    } while (i6 < iT);
                }
            }
        }

        private final void w1() {
            F0.J j6 = F0.O.this.f2396a;
            F0.O o6 = F0.O.this;
            X.b bVarW0 = j6.w0();
            int iT = bVarW0.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarW0.s();
                int i6 = 0;
                do {
                    F0.J j10 = (F0.J) objArrS[i6];
                    if (j10.Z() && j10.h0() == F0.J.g.InMeasureBlock) {
                        F0.O.a aVarH = j10.V().H();
                        p247y7.AbstractC7350t.c(aVarH);
                        Y0.C1859b c1859bZ = j10.V().z();
                        p247y7.AbstractC7350t.c(c1859bZ);
                        if (aVarH.B1(c1859bZ.r())) {
                            F0.J.s1(o6.f2396a, false, false, false, 7, null);
                        }
                    }
                    i6++;
                } while (i6 < iT);
            }
        }

        private final void x1() {
            F0.J.g gVarU;
            F0.J.s1(F0.O.this.f2396a, false, false, false, 7, null);
            F0.J jO0 = F0.O.this.f2396a.o0();
            if (jO0 == null || F0.O.this.f2396a.U() != F0.J.g.NotUsed) {
                return;
            }
            F0.J j6 = F0.O.this.f2396a;
            int i6 = F0.O.a.C0054a.f2439a[jO0.X().ordinal()];
            if (i6 != 2) {
                gVarU = i6 != 3 ? jO0.U() : F0.J.g.InLayoutBlock;
            } else {
                gVarU = F0.J.g.InMeasureBlock;
            }
            j6.D1(gVarU);
        }

        public final boolean B1(long j6) {
            if (!(!F0.O.this.f2396a.L0())) {
                C0.a.a("measure is called on a deactivated node");
            }
            F0.J jO0 = F0.O.this.f2396a.o0();
            F0.O.this.f2396a.A1(F0.O.this.f2396a.E() || (jO0 != null && jO0.E()));
            if (!F0.O.this.f2396a.Z()) {
                Y0.C1859b c1859b = this.f2424O;
                if (c1859b == null ? false : Y0.C1859b.f(c1859b.r(), j6)) {
                    F0.o0 o0VarN0 = F0.O.this.f2396a.n0();
                    if (o0VarN0 != null) {
                        o0VarN0.p(F0.O.this.f2396a, true);
                    }
                    F0.O.this.f2396a.z1();
                    return false;
                }
            }
            this.f2424O = Y0.C1859b.a(j6);
            a1(j6);
            f().s(false);
            c0(F0.O.a.d.f2449D);
            long jZ0 = this.f2423N ? z0() : Y0.u.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f2423N = true;
            F0.U uJ2 = F0.O.this.K().j2();
            if (!(uJ2 != null)) {
                C0.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            F0.O.this.T(j6);
            Y0(Y0.u.a(uJ2.I0(), uJ2.w0()));
            return (Y0.t.g(jZ0) == uJ2.I0() && Y0.t.f(jZ0) == uJ2.w0()) ? false : true;
        }

        public final void C1() {
            F0.J jO0;
            try {
                this.f2417H = true;
                if (!this.f2422M) {
                    C0.a.b("replace() called on item that was not placed");
                }
                this.f2437b0 = false;
                boolean zK = k();
                A1(this.f2425P, 0.0f, this.f2427R, this.f2428S);
                if (zK && !this.f2437b0 && (jO0 = F0.O.this.f2396a.o0()) != null) {
                    F0.J.q1(jO0, false, 1, null);
                }
            } finally {
                this.f2417H = false;
            }
        }

        public final void D1(boolean z6) {
            this.f2432W = z6;
        }

        public final void E1(F0.J.g gVar) {
            this.f2420K = gVar;
        }

        @Override // F0.InterfaceC0909b
        public F0.AbstractC0914d0 F() {
            return F0.O.this.f2396a.P();
        }

        public final void F1(int i6) {
            this.f2419J = i6;
        }

        public void G1(boolean z6) {
            this.f2429T = z6;
        }

        public final boolean I1() {
            if (Z() == null) {
                F0.U uJ2 = F0.O.this.K().j2();
                p247y7.AbstractC7350t.c(uJ2);
                if (uJ2.Z() == null) {
                    return false;
                }
            }
            if (!this.f2434Y) {
                return false;
            }
            this.f2434Y = false;
            F0.U uJ3 = F0.O.this.K().j2();
            p247y7.AbstractC7350t.c(uJ3);
            this.f2435Z = uJ3.Z();
            return true;
        }

        @Override // F0.InterfaceC0909b
        public F0.InterfaceC0909b J() {
            F0.O oV;
            F0.J jO0 = F0.O.this.f2396a.o0();
            if (jO0 == null || (oV = jO0.V()) == null) {
                return null;
            }
            return oV.C();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // D0.X
        public void M0(long j6, float f6, p171r0.C7053c c7053c) {
            A1(j6, f6, null, c7053c);
        }

        @Override // D0.O
        public int Q(D0.AbstractC0882a abstractC0882a) {
            F0.J jO0 = F0.O.this.f2396a.o0();
            if ((jO0 != null ? jO0.X() : null) == F0.J.e.LookaheadMeasuring) {
                f().u(true);
            } else {
                F0.J jO1 = F0.O.this.f2396a.o0();
                if ((jO1 != null ? jO1.X() : null) == F0.J.e.LookaheadLayingOut) {
                    f().t(true);
                }
            }
            this.f2421L = true;
            F0.U uJ2 = F0.O.this.K().j2();
            p247y7.AbstractC7350t.c(uJ2);
            int iQ = uJ2.Q(abstractC0882a);
            this.f2421L = false;
            return iQ;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // D0.X
        public void R0(long j6, float f6, p237x7.l lVar) {
            A1(j6, f6, lVar, null);
        }

        @Override // D0.InterfaceC0895n
        public int S(int i6) {
            x1();
            F0.U uJ2 = F0.O.this.K().j2();
            p247y7.AbstractC7350t.c(uJ2);
            return uJ2.S(i6);
        }

        @Override // D0.InterfaceC0895n
        public int T(int i6) {
            x1();
            F0.U uJ2 = F0.O.this.K().j2();
            p247y7.AbstractC7350t.c(uJ2);
            return uJ2.T(i6);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002b  */
        @Override // D0.G
        public D0.X U(long j6) {
            F0.J jO0 = F0.O.this.f2396a.o0();
            if ((jO0 != null ? jO0.X() : null) == F0.J.e.LookaheadMeasuring) {
                F0.O.this.f2397b = false;
            } else {
                F0.J jO1 = F0.O.this.f2396a.o0();
                if ((jO1 != null ? jO1.X() : null) == F0.J.e.LookaheadLayingOut) {
                    F0.O.this.f2397b = false;
                }
            }
            H1(F0.O.this.f2396a);
            if (F0.O.this.f2396a.U() == F0.J.g.NotUsed) {
                F0.O.this.f2396a.v();
            }
            B1(j6);
            return this;
        }

        @Override // D0.X, D0.InterfaceC0895n
        public java.lang.Object Z() {
            return this.f2435Z;
        }

        @Override // F0.InterfaceC0909b
        public void c0(p237x7.l lVar) {
            X.b bVarW0 = F0.O.this.f2396a.w0();
            int iT = bVarW0.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarW0.s();
                int i6 = 0;
                do {
                    F0.InterfaceC0909b interfaceC0909bC = ((F0.J) objArrS[i6]).V().C();
                    p247y7.AbstractC7350t.c(interfaceC0909bC);
                    lVar.l(interfaceC0909bC);
                    i6++;
                } while (i6 < iT);
            }
        }

        @Override // F0.InterfaceC0909b
        public void d0() {
            this.f2433X = true;
            f().o();
            if (F0.O.this.F()) {
                w1();
            }
            F0.U uJ2 = F().j2();
            p247y7.AbstractC7350t.c(uJ2);
            if (F0.O.this.f2404i || (!this.f2421L && !uJ2.y1() && F0.O.this.F())) {
                F0.O.this.f2403h = false;
                F0.J.e eVarB = F0.O.this.B();
                F0.O.this.f2398c = F0.J.e.LookaheadLayingOut;
                F0.o0 o0VarB = F0.N.b(F0.O.this.f2396a);
                F0.O.this.b0(false);
                F0.q0.f(o0VarB.getSnapshotObserver(), F0.O.this.f2396a, false, new F0.O.a.b(uJ2, F0.O.this), 2, null);
                F0.O.this.f2398c = eVarB;
                if (F0.O.this.E() && uJ2.y1()) {
                    requestLayout();
                }
                F0.O.this.f2404i = false;
            }
            if (f().l()) {
                f().q(true);
            }
            if (f().g() && f().k()) {
                f().n();
            }
            this.f2433X = false;
        }

        @Override // F0.InterfaceC0909b
        public F0.AbstractC0907a f() {
            return this.f2430U;
        }

        @Override // F0.X
        public void g0(boolean z6) {
            F0.U uJ2;
            F0.U uJ3 = F0.O.this.K().j2();
            if (!p247y7.AbstractC7350t.b(java.lang.Boolean.valueOf(z6), uJ3 != null ? java.lang.Boolean.valueOf(uJ3.x1()) : null) && (uJ2 = F0.O.this.K().j2()) != null) {
                uJ2.g0(z6);
            }
            this.f2436a0 = z6;
        }

        @Override // F0.InterfaceC0909b
        public void i0() {
            F0.J.s1(F0.O.this.f2396a, false, false, false, 7, null);
        }

        public final java.util.List j1() {
            F0.O.this.f2396a.H();
            if (this.f2432W) {
                F0.J j6 = F0.O.this.f2396a;
                X.b bVar = this.f2431V;
                X.b bVarW0 = j6.w0();
                int iT = bVarW0.t();
                if (iT > 0) {
                    java.lang.Object[] objArrS = bVarW0.s();
                    int i6 = 0;
                    do {
                        F0.J j10 = (F0.J) objArrS[i6];
                        int iT2 = bVar.t();
                        F0.O.a aVarH = j10.V().H();
                        p247y7.AbstractC7350t.c(aVarH);
                        if (iT2 <= i6) {
                            bVar.d(aVarH);
                        } else {
                            bVar.J(i6, aVarH);
                        }
                        i6++;
                    } while (i6 < iT);
                }
                bVar.E(j6.H().size(), bVar.t());
                this.f2432W = false;
            }
            return this.f2431V.i();
        }

        @Override // F0.InterfaceC0909b
        public boolean k() {
            return this.f2429T;
        }

        public final Y0.C1859b k1() {
            return this.f2424O;
        }

        public final boolean m1() {
            return this.f2433X;
        }

        @Override // D0.InterfaceC0895n
        public int n0(int i6) {
            x1();
            F0.U uJ2 = F0.O.this.K().j2();
            p247y7.AbstractC7350t.c(uJ2);
            return uJ2.n0(i6);
        }

        public final F0.O.b n1() {
            return F0.O.this.I();
        }

        public final F0.J.g o1() {
            return this.f2420K;
        }

        public final boolean q1() {
            return this.f2422M;
        }

        public final void r1(boolean z6) {
            F0.J j6;
            F0.J jO0 = F0.O.this.f2396a.o0();
            F0.J.g gVarU = F0.O.this.f2396a.U();
            if (jO0 == null || gVarU == F0.J.g.NotUsed) {
                return;
            }
            do {
                j6 = jO0;
                if (j6.U() != gVarU) {
                    break;
                } else {
                    jO0 = j6.o0();
                }
            } while (jO0 != null);
            int i6 = F0.O.a.C0054a.f2440b[gVarU.ordinal()];
            if (i6 == 1) {
                if (j6.b0() != null) {
                    F0.J.s1(j6, z6, false, false, 6, null);
                    return;
                } else {
                    F0.J.w1(j6, z6, false, false, 6, null);
                    return;
                }
            }
            if (i6 != 2) {
                throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
            if (j6.b0() != null) {
                j6.p1(z6);
            } else {
                j6.t1(z6);
            }
        }

        @Override // F0.InterfaceC0909b
        public void requestLayout() {
            F0.J.q1(F0.O.this.f2396a, false, 1, null);
        }

        public final void s1() {
            this.f2434Y = true;
        }

        @Override // D0.InterfaceC0895n
        public int t(int i6) {
            x1();
            F0.U uJ2 = F0.O.this.K().j2();
            p247y7.AbstractC7350t.c(uJ2);
            return uJ2.t(i6);
        }

        public final void v1() {
            X.b bVarW0;
            int iT;
            if (F0.O.this.t() <= 0 || (iT = (bVarW0 = F0.O.this.f2396a.w0()).t()) <= 0) {
                return;
            }
            java.lang.Object[] objArrS = bVarW0.s();
            int i6 = 0;
            do {
                F0.J j6 = (F0.J) objArrS[i6];
                F0.O oV = j6.V();
                if ((oV.E() || oV.D()) && !oV.F()) {
                    F0.J.q1(j6, false, 1, null);
                }
                F0.O.a aVarH = oV.H();
                if (aVarH != null) {
                    aVarH.v1();
                }
                i6++;
            } while (i6 < iT);
        }

        @Override // F0.InterfaceC0909b
        public java.util.Map y() {
            if (!this.f2421L) {
                if (F0.O.this.B() == F0.J.e.LookaheadMeasuring) {
                    f().s(true);
                    if (f().g()) {
                        F0.O.this.P();
                    }
                } else {
                    f().r(true);
                }
            }
            F0.U uJ2 = F().j2();
            if (uJ2 != null) {
                uJ2.C1(true);
            }
            d0();
            F0.U uJ3 = F().j2();
            if (uJ3 != null) {
                uJ3.C1(false);
            }
            return f().h();
        }

        public final void y1() {
            this.f2419J = Integer.MAX_VALUE;
            this.f2418I = Integer.MAX_VALUE;
            G1(false);
        }

        public final void z1() {
            this.f2437b0 = true;
            F0.J jO0 = F0.O.this.f2396a.o0();
            if (!k()) {
                t1();
                if (this.f2417H && jO0 != null) {
                    F0.J.q1(jO0, false, 1, null);
                }
            }
            if (jO0 == null) {
                this.f2419J = 0;
            } else if (!this.f2417H && (jO0.X() == F0.J.e.LayingOut || jO0.X() == F0.J.e.LookaheadLayingOut)) {
                if (!(this.f2419J == Integer.MAX_VALUE)) {
                    C0.a.b("Place was called on a node which was placed already");
                }
                this.f2419J = jO0.V().f2405j;
                jO0.V().f2405j++;
            }
            d0();
        }
    }

    public final class b extends D0.X implements D0.G, F0.InterfaceC0909b, F0.X {

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private boolean f2450H;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private boolean f2453K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private boolean f2454L;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private boolean f2456N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f2457O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private p237x7.l f2458P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private p171r0.C7053c f2459Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private float f2460R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private boolean f2461S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private java.lang.Object f2462T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        private boolean f2463U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        private boolean f2464V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        private final F0.AbstractC0907a f2465W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private final X.b f2466X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private boolean f2467Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private boolean f2468Z;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private final p237x7.a f2469a0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private float f2470b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        private boolean f2471c0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        private p237x7.l f2472d0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        private p171r0.C7053c f2473e0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        private long f2474f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        private float f2475g0;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        private final p237x7.a f2476h0;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        private boolean f2477i0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        private boolean f2478j0;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private int f2451I = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private int f2452J = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private F0.J.g f2455M = F0.J.g.NotUsed;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2480a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f2481b;

            static {
                int[] iArr = new int[F0.J.e.values().length];
                try {
                    iArr[F0.J.e.Measuring.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[F0.J.e.LayingOut.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                f2480a = iArr;
                int[] iArr2 = new int[F0.J.g.values().length];
                try {
                    iArr2[F0.J.g.InMeasureBlock.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr2[F0.J.g.InLayoutBlock.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                f2481b = iArr2;
            }
        }

        /* JADX INFO: renamed from: F0.O$b$b, reason: collision with other inner class name */
        static final class C0057b extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: F0.O$b$b$a */
            static final class a extends p247y7.AbstractC7352v implements p237x7.l {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                public static final F0.O.b.C0057b.a f2483D = new F0.O.b.C0057b.a();

                a() {
                    super(1);
                }

                public final void a(F0.InterfaceC0909b interfaceC0909b) {
                    interfaceC0909b.f().t(false);
                }

                @Override // p237x7.l
                public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                    a((F0.InterfaceC0909b) obj);
                    return p087i7.M.f46721a;
                }
            }

            /* JADX INFO: renamed from: F0.O$b$b$b, reason: collision with other inner class name */
            static final class C0058b extends p247y7.AbstractC7352v implements p237x7.l {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                public static final F0.O.b.C0057b.C0058b f2484D = new F0.O.b.C0057b.C0058b();

                C0058b() {
                    super(1);
                }

                public final void a(F0.InterfaceC0909b interfaceC0909b) {
                    interfaceC0909b.f().q(interfaceC0909b.f().l());
                }

                @Override // p237x7.l
                public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                    a((F0.InterfaceC0909b) obj);
                    return p087i7.M.f46721a;
                }
            }

            C0057b() {
                super(0);
            }

            public final void a() {
                F0.O.b.this.n1();
                F0.O.b.this.c0(F0.O.b.C0057b.a.f2483D);
                F0.O.b.this.F().q1().k();
                F0.O.b.this.m1();
                F0.O.b.this.c0(F0.O.b.C0057b.C0058b.f2484D);
            }

            @Override // p237x7.a
            public /* bridge */ /* synthetic */ java.lang.Object b() {
                a();
                return p087i7.M.f46721a;
            }
        }

        static final class c extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ F0.O f2485D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ F0.O.b f2486E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(F0.O o6, F0.O.b bVar) {
                super(0);
                this.f2485D = o6;
                this.f2486E = bVar;
            }

            public final void a() {
                D0.X.a placementScope;
                F0.AbstractC0914d0 abstractC0914d0P2 = this.f2485D.K().p2();
                if (abstractC0914d0P2 == null || (placementScope = abstractC0914d0P2.s1()) == null) {
                    placementScope = F0.N.b(this.f2485D.f2396a).getPlacementScope();
                }
                D0.X.a aVar = placementScope;
                F0.O.b bVar = this.f2486E;
                F0.O o6 = this.f2485D;
                p237x7.l lVar = bVar.f2472d0;
                p171r0.C7053c c7053c = bVar.f2473e0;
                F0.AbstractC0914d0 abstractC0914d0K = o6.K();
                long j6 = bVar.f2474f0;
                if (c7053c != null) {
                    aVar.x(abstractC0914d0K, j6, c7053c, bVar.f2475g0);
                } else if (lVar == null) {
                    aVar.i(abstractC0914d0K, j6, bVar.f2475g0);
                } else {
                    aVar.w(abstractC0914d0K, j6, bVar.f2475g0, lVar);
                }
            }

            @Override // p237x7.a
            public /* bridge */ /* synthetic */ java.lang.Object b() {
                a();
                return p087i7.M.f46721a;
            }
        }

        static final class d extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final F0.O.b.d f2487D = new F0.O.b.d();

            d() {
                super(1);
            }

            public final void a(F0.InterfaceC0909b interfaceC0909b) {
                interfaceC0909b.f().u(false);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((F0.InterfaceC0909b) obj);
                return p087i7.M.f46721a;
            }
        }

        public b() {
            Y0.p.a aVar = Y0.p.f16221b;
            this.f2457O = aVar.a();
            this.f2461S = true;
            this.f2465W = new F0.K(this);
            this.f2466X = new X.b(new F0.O.b[16], 0);
            this.f2467Y = true;
            this.f2469a0 = new F0.O.b.C0057b();
            this.f2474f0 = aVar.a();
            this.f2476h0 = new F0.O.b.c(F0.O.this, this);
        }

        private final void A1() {
            if (k()) {
                int i6 = 0;
                M1(false);
                F0.J j6 = F0.O.this.f2396a;
                F0.AbstractC0914d0 abstractC0914d0O2 = j6.P().o2();
                for (F0.AbstractC0914d0 abstractC0914d0M0 = j6.m0(); !p247y7.AbstractC7350t.b(abstractC0914d0M0, abstractC0914d0O2) && abstractC0914d0M0 != null; abstractC0914d0M0 = abstractC0914d0M0.o2()) {
                    abstractC0914d0M0.O2();
                }
                X.b bVarW0 = F0.O.this.f2396a.w0();
                int iT = bVarW0.t();
                if (iT > 0) {
                    java.lang.Object[] objArrS = bVarW0.s();
                    do {
                        ((F0.J) objArrS[i6]).d0().A1();
                        i6++;
                    } while (i6 < iT);
                }
            }
        }

        private final void C1() {
            F0.J j6 = F0.O.this.f2396a;
            F0.O o6 = F0.O.this;
            X.b bVarW0 = j6.w0();
            int iT = bVarW0.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarW0.s();
                int i6 = 0;
                do {
                    F0.J j10 = (F0.J) objArrS[i6];
                    if (j10.e0() && j10.g0() == F0.J.g.InMeasureBlock && F0.J.l1(j10, null, 1, null)) {
                        F0.J.w1(o6.f2396a, false, false, false, 7, null);
                    }
                    i6++;
                } while (i6 < iT);
            }
        }

        private final void D1() {
            F0.J.g gVarU;
            F0.J.w1(F0.O.this.f2396a, false, false, false, 7, null);
            F0.J jO0 = F0.O.this.f2396a.o0();
            if (jO0 == null || F0.O.this.f2396a.U() != F0.J.g.NotUsed) {
                return;
            }
            F0.J j6 = F0.O.this.f2396a;
            int i6 = F0.O.b.a.f2480a[jO0.X().ordinal()];
            if (i6 != 1) {
                gVarU = i6 != 2 ? jO0.U() : F0.J.g.InLayoutBlock;
            } else {
                gVarU = F0.J.g.InMeasureBlock;
            }
            j6.D1(gVarU);
        }

        private final void G1(long j6, float f6, p237x7.l lVar, p171r0.C7053c c7053c) {
            if (!(!F0.O.this.f2396a.L0())) {
                C0.a.a("place is called on a deactivated node");
            }
            F0.O.this.f2398c = F0.J.e.LayingOut;
            this.f2457O = j6;
            this.f2460R = f6;
            this.f2458P = lVar;
            this.f2459Q = c7053c;
            this.f2454L = true;
            this.f2471c0 = false;
            F0.o0 o0VarB = F0.N.b(F0.O.this.f2396a);
            if (F0.O.this.A() || !k()) {
                f().r(false);
                F0.O.this.Y(false);
                this.f2472d0 = lVar;
                this.f2474f0 = j6;
                this.f2475g0 = f6;
                this.f2473e0 = c7053c;
                o0VarB.getSnapshotObserver().c(F0.O.this.f2396a, false, this.f2476h0);
            } else {
                F0.O.this.K().L2(j6, f6, lVar, c7053c);
                F1();
            }
            F0.O.this.f2398c = F0.J.e.Idle;
        }

        private final void H1(long j6, float f6, p237x7.l lVar, p171r0.C7053c c7053c) {
            D0.X.a placementScope;
            this.f2464V = true;
            boolean z6 = false;
            if (!Y0.p.g(j6, this.f2457O) || this.f2477i0) {
                if (F0.O.this.u() || F0.O.this.v() || this.f2477i0) {
                    F0.O.this.f2400e = true;
                    this.f2477i0 = false;
                }
                B1();
            }
            if (F0.P.a(F0.O.this.f2396a)) {
                F0.AbstractC0914d0 abstractC0914d0P2 = F0.O.this.K().p2();
                if (abstractC0914d0P2 == null || (placementScope = abstractC0914d0P2.s1()) == null) {
                    placementScope = F0.N.b(F0.O.this.f2396a).getPlacementScope();
                }
                D0.X.a aVar = placementScope;
                F0.O o6 = F0.O.this;
                F0.O.a aVarH = o6.H();
                p247y7.AbstractC7350t.c(aVarH);
                F0.J jO0 = o6.f2396a.o0();
                if (jO0 != null) {
                    jO0.V().f2405j = 0;
                }
                aVarH.F1(Integer.MAX_VALUE);
                D0.X.a.h(aVar, aVarH, Y0.p.h(j6), Y0.p.i(j6), 0.0f, 4, null);
            }
            F0.O.a aVarH2 = F0.O.this.H();
            if (aVarH2 != null && !aVarH2.q1()) {
                z6 = true;
            }
            if (!(true ^ z6)) {
                C0.a.b("Error: Placement happened before lookahead.");
            }
            G1(j6, f6, lVar, c7053c);
        }

        private final void N1(F0.J j6) {
            F0.J.g gVar;
            F0.J jO0 = j6.o0();
            if (jO0 != null) {
                if (!(this.f2455M == F0.J.g.NotUsed || j6.E())) {
                    C0.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                }
                int i6 = F0.O.b.a.f2480a[jO0.X().ordinal()];
                if (i6 == 1) {
                    gVar = F0.J.g.InMeasureBlock;
                } else {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + jO0.X());
                    }
                    gVar = F0.J.g.InLayoutBlock;
                }
            } else {
                gVar = F0.J.g.NotUsed;
            }
            this.f2455M = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m1() {
            F0.J j6 = F0.O.this.f2396a;
            X.b bVarW0 = j6.w0();
            int iT = bVarW0.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarW0.s();
                int i6 = 0;
                do {
                    F0.J j10 = (F0.J) objArrS[i6];
                    if (j10.d0().f2451I != j10.p0()) {
                        j6.h1();
                        j6.D0();
                        if (j10.p0() == Integer.MAX_VALUE) {
                            j10.d0().A1();
                        }
                    }
                    i6++;
                } while (i6 < iT);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n1() {
            F0.O.this.f2406k = 0;
            X.b bVarW0 = F0.O.this.f2396a.w0();
            int iT = bVarW0.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarW0.s();
                int i6 = 0;
                do {
                    F0.O.b bVarD0 = ((F0.J) objArrS[i6]).d0();
                    bVarD0.f2451I = bVarD0.f2452J;
                    bVarD0.f2452J = Integer.MAX_VALUE;
                    bVarD0.f2464V = false;
                    if (bVarD0.f2455M == F0.J.g.InLayoutBlock) {
                        bVarD0.f2455M = F0.J.g.NotUsed;
                    }
                    i6++;
                } while (i6 < iT);
            }
        }

        private final void z1() {
            boolean zK = k();
            M1(true);
            F0.J j6 = F0.O.this.f2396a;
            if (!zK) {
                if (j6.e0()) {
                    F0.J.w1(j6, true, false, false, 6, null);
                } else if (j6.Z()) {
                    F0.J.s1(j6, true, false, false, 6, null);
                }
            }
            F0.AbstractC0914d0 abstractC0914d0O2 = j6.P().o2();
            for (F0.AbstractC0914d0 abstractC0914d0M0 = j6.m0(); !p247y7.AbstractC7350t.b(abstractC0914d0M0, abstractC0914d0O2) && abstractC0914d0M0 != null; abstractC0914d0M0 = abstractC0914d0M0.o2()) {
                if (abstractC0914d0M0.g2()) {
                    abstractC0914d0M0.y2();
                }
            }
            X.b bVarW0 = j6.w0();
            int iT = bVarW0.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarW0.s();
                int i6 = 0;
                do {
                    F0.J j10 = (F0.J) objArrS[i6];
                    if (j10.p0() != Integer.MAX_VALUE) {
                        j10.d0().z1();
                        j6.x1(j10);
                    }
                    i6++;
                } while (i6 < iT);
            }
        }

        public final void B1() {
            X.b bVarW0;
            int iT;
            if (F0.O.this.s() <= 0 || (iT = (bVarW0 = F0.O.this.f2396a.w0()).t()) <= 0) {
                return;
            }
            java.lang.Object[] objArrS = bVarW0.s();
            int i6 = 0;
            do {
                F0.J j6 = (F0.J) objArrS[i6];
                F0.O oV = j6.V();
                if ((oV.v() || oV.u()) && !oV.A()) {
                    F0.J.u1(j6, false, 1, null);
                }
                oV.I().B1();
                i6++;
            } while (i6 < iT);
        }

        public final void E1() {
            this.f2452J = Integer.MAX_VALUE;
            this.f2451I = Integer.MAX_VALUE;
            M1(false);
        }

        @Override // F0.InterfaceC0909b
        public F0.AbstractC0914d0 F() {
            return F0.O.this.f2396a.P();
        }

        public final void F1() {
            this.f2471c0 = true;
            F0.J jO0 = F0.O.this.f2396a.o0();
            float fQ2 = F().q2();
            F0.J j6 = F0.O.this.f2396a;
            F0.AbstractC0914d0 abstractC0914d0M0 = j6.m0();
            F0.AbstractC0914d0 abstractC0914d0P = j6.P();
            while (abstractC0914d0M0 != abstractC0914d0P) {
                p247y7.AbstractC7350t.d(abstractC0914d0M0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                F0.F f6 = (F0.F) abstractC0914d0M0;
                fQ2 += f6.q2();
                abstractC0914d0M0 = f6.o2();
            }
            if (fQ2 != this.f2470b0) {
                this.f2470b0 = fQ2;
                if (jO0 != null) {
                    jO0.h1();
                }
                if (jO0 != null) {
                    jO0.D0();
                }
            }
            if (!k()) {
                if (jO0 != null) {
                    jO0.D0();
                }
                z1();
                if (this.f2450H && jO0 != null) {
                    F0.J.u1(jO0, false, 1, null);
                }
            }
            if (jO0 == null) {
                this.f2452J = 0;
            } else if (!this.f2450H && jO0.X() == F0.J.e.LayingOut) {
                if (!(this.f2452J == Integer.MAX_VALUE)) {
                    C0.a.b("Place was called on a node which was placed already");
                }
                this.f2452J = jO0.V().f2406k;
                jO0.V().f2406k++;
            }
            d0();
        }

        public final boolean I1(long j6) {
            boolean z6 = true;
            if (!(!F0.O.this.f2396a.L0())) {
                C0.a.a("measure is called on a deactivated node");
            }
            F0.o0 o0VarB = F0.N.b(F0.O.this.f2396a);
            F0.J jO0 = F0.O.this.f2396a.o0();
            F0.O.this.f2396a.A1(F0.O.this.f2396a.E() || (jO0 != null && jO0.E()));
            if (!F0.O.this.f2396a.e0() && Y0.C1859b.f(E0(), j6)) {
                F0.n0.b(o0VarB, F0.O.this.f2396a, false, 2, null);
                F0.O.this.f2396a.z1();
                return false;
            }
            f().s(false);
            c0(F0.O.b.d.f2487D);
            this.f2453K = true;
            long jA = F0.O.this.K().a();
            a1(j6);
            F0.O.this.U(j6);
            if (Y0.t.e(F0.O.this.K().a(), jA) && F0.O.this.K().I0() == I0() && F0.O.this.K().w0() == w0()) {
                z6 = false;
            }
            Y0(Y0.u.a(F0.O.this.K().I0(), F0.O.this.K().w0()));
            return z6;
        }

        @Override // F0.InterfaceC0909b
        public F0.InterfaceC0909b J() {
            F0.O oV;
            F0.J jO0 = F0.O.this.f2396a.o0();
            if (jO0 == null || (oV = jO0.V()) == null) {
                return null;
            }
            return oV.r();
        }

        public final void J1() {
            F0.J jO0;
            try {
                this.f2450H = true;
                if (!this.f2454L) {
                    C0.a.b("replace called on unplaced item");
                }
                boolean zK = k();
                G1(this.f2457O, this.f2460R, this.f2458P, this.f2459Q);
                if (zK && !this.f2471c0 && (jO0 = F0.O.this.f2396a.o0()) != null) {
                    F0.J.u1(jO0, false, 1, null);
                }
            } finally {
                this.f2450H = false;
            }
        }

        public final void K1(boolean z6) {
            this.f2467Y = z6;
        }

        public final void L1(F0.J.g gVar) {
            this.f2455M = gVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // D0.X
        public void M0(long j6, float f6, p171r0.C7053c c7053c) {
            H1(j6, f6, null, c7053c);
        }

        public void M1(boolean z6) {
            this.f2463U = z6;
        }

        public final boolean O1() {
            if ((Z() == null && F0.O.this.K().Z() == null) || !this.f2461S) {
                return false;
            }
            this.f2461S = false;
            this.f2462T = F0.O.this.K().Z();
            return true;
        }

        @Override // D0.O
        public int Q(D0.AbstractC0882a abstractC0882a) {
            F0.J jO0 = F0.O.this.f2396a.o0();
            if ((jO0 != null ? jO0.X() : null) == F0.J.e.Measuring) {
                f().u(true);
            } else {
                F0.J jO1 = F0.O.this.f2396a.o0();
                if ((jO1 != null ? jO1.X() : null) == F0.J.e.LayingOut) {
                    f().t(true);
                }
            }
            this.f2456N = true;
            int iQ = F0.O.this.K().Q(abstractC0882a);
            this.f2456N = false;
            return iQ;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // D0.X
        public void R0(long j6, float f6, p237x7.l lVar) {
            H1(j6, f6, lVar, null);
        }

        @Override // D0.InterfaceC0895n
        public int S(int i6) {
            D1();
            return F0.O.this.K().S(i6);
        }

        @Override // D0.InterfaceC0895n
        public int T(int i6) {
            D1();
            return F0.O.this.K().T(i6);
        }

        @Override // D0.G
        public D0.X U(long j6) {
            F0.J.g gVarU = F0.O.this.f2396a.U();
            F0.J.g gVar = F0.J.g.NotUsed;
            if (gVarU == gVar) {
                F0.O.this.f2396a.v();
            }
            if (F0.P.a(F0.O.this.f2396a)) {
                F0.O.a aVarH = F0.O.this.H();
                p247y7.AbstractC7350t.c(aVarH);
                aVarH.E1(gVar);
                aVarH.U(j6);
            }
            N1(F0.O.this.f2396a);
            I1(j6);
            return this;
        }

        @Override // D0.X, D0.InterfaceC0895n
        public java.lang.Object Z() {
            return this.f2462T;
        }

        @Override // F0.InterfaceC0909b
        public void c0(p237x7.l lVar) {
            X.b bVarW0 = F0.O.this.f2396a.w0();
            int iT = bVarW0.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarW0.s();
                int i6 = 0;
                do {
                    lVar.l(((F0.J) objArrS[i6]).V().r());
                    i6++;
                } while (i6 < iT);
            }
        }

        @Override // F0.InterfaceC0909b
        public void d0() {
            this.f2468Z = true;
            f().o();
            if (F0.O.this.A()) {
                C1();
            }
            if (F0.O.this.f2401f || (!this.f2456N && !F().y1() && F0.O.this.A())) {
                F0.O.this.f2400e = false;
                F0.J.e eVarB = F0.O.this.B();
                F0.O.this.f2398c = F0.J.e.LayingOut;
                F0.O.this.Z(false);
                F0.J j6 = F0.O.this.f2396a;
                F0.N.b(j6).getSnapshotObserver().e(j6, false, this.f2469a0);
                F0.O.this.f2398c = eVarB;
                if (F().y1() && F0.O.this.v()) {
                    requestLayout();
                }
                F0.O.this.f2401f = false;
            }
            if (f().l()) {
                f().q(true);
            }
            if (f().g() && f().k()) {
                f().n();
            }
            this.f2468Z = false;
        }

        @Override // F0.InterfaceC0909b
        public F0.AbstractC0907a f() {
            return this.f2465W;
        }

        @Override // F0.X
        public void g0(boolean z6) {
            boolean zX1 = F0.O.this.K().x1();
            if (z6 != zX1) {
                F0.O.this.K().g0(zX1);
                this.f2477i0 = true;
            }
            this.f2478j0 = z6;
        }

        @Override // F0.InterfaceC0909b
        public void i0() {
            F0.J.w1(F0.O.this.f2396a, false, false, false, 7, null);
        }

        @Override // F0.InterfaceC0909b
        public boolean k() {
            return this.f2463U;
        }

        @Override // D0.InterfaceC0895n
        public int n0(int i6) {
            D1();
            return F0.O.this.K().n0(i6);
        }

        public final java.util.List o1() {
            F0.O.this.f2396a.K1();
            if (this.f2467Y) {
                F0.J j6 = F0.O.this.f2396a;
                X.b bVar = this.f2466X;
                X.b bVarW0 = j6.w0();
                int iT = bVarW0.t();
                if (iT > 0) {
                    java.lang.Object[] objArrS = bVarW0.s();
                    int i6 = 0;
                    do {
                        F0.J j10 = (F0.J) objArrS[i6];
                        int iT2 = bVar.t();
                        F0.O.b bVarI = j10.V().I();
                        if (iT2 <= i6) {
                            bVar.d(bVarI);
                        } else {
                            bVar.J(i6, bVarI);
                        }
                        i6++;
                    } while (i6 < iT);
                }
                bVar.E(j6.H().size(), bVar.t());
                this.f2467Y = false;
            }
            return this.f2466X.i();
        }

        public final Y0.C1859b q1() {
            if (this.f2453K) {
                return Y0.C1859b.a(E0());
            }
            return null;
        }

        public final boolean r1() {
            return this.f2468Z;
        }

        @Override // F0.InterfaceC0909b
        public void requestLayout() {
            F0.J.u1(F0.O.this.f2396a, false, 1, null);
        }

        public final F0.J.g s1() {
            return this.f2455M;
        }

        @Override // D0.InterfaceC0895n
        public int t(int i6) {
            D1();
            return F0.O.this.K().t(i6);
        }

        public final int t1() {
            return this.f2452J;
        }

        public final float u1() {
            return this.f2470b0;
        }

        public final void v1(boolean z6) {
            F0.J j6;
            F0.J jO0 = F0.O.this.f2396a.o0();
            F0.J.g gVarU = F0.O.this.f2396a.U();
            if (jO0 == null || gVarU == F0.J.g.NotUsed) {
                return;
            }
            do {
                j6 = jO0;
                if (j6.U() != gVarU) {
                    break;
                } else {
                    jO0 = j6.o0();
                }
            } while (jO0 != null);
            int i6 = F0.O.b.a.f2481b[gVarU.ordinal()];
            if (i6 == 1) {
                F0.J.w1(j6, z6, false, false, 6, null);
            } else {
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                j6.t1(z6);
            }
        }

        public final void w1() {
            this.f2461S = true;
        }

        public final boolean x1() {
            return this.f2464V;
        }

        @Override // F0.InterfaceC0909b
        public java.util.Map y() {
            if (!this.f2456N) {
                if (F0.O.this.B() == F0.J.e.Measuring) {
                    f().s(true);
                    if (f().g()) {
                        F0.O.this.O();
                    }
                } else {
                    f().r(true);
                }
            }
            F().C1(true);
            d0();
            F().C1(false);
            return f().h();
        }

        public final void y1() {
            F0.O.this.f2397b = true;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f2489E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j6) {
            super(0);
            this.f2489E = j6;
        }

        public final void a() {
            F0.U uJ2 = F0.O.this.K().j2();
            p247y7.AbstractC7350t.c(uJ2);
            uJ2.U(this.f2489E);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {
        d() {
            super(0);
        }

        public final void a() {
            F0.O.this.K().U(F0.O.this.f2415t);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public O(F0.J j6) {
        this.f2396a = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(long j6) {
        this.f2398c = F0.J.e.LookaheadMeasuring;
        this.f2402g = false;
        F0.q0.h(F0.N.b(this.f2396a).getSnapshotObserver(), this.f2396a, false, new F0.O.c(j6), 2, null);
        P();
        if (F0.P.a(this.f2396a)) {
            O();
        } else {
            R();
        }
        this.f2398c = F0.J.e.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(long j6) {
        F0.J.e eVar = this.f2398c;
        F0.J.e eVar2 = F0.J.e.Idle;
        if (!(eVar == eVar2)) {
            C0.a.b("layout state is not idle before measure starts");
        }
        F0.J.e eVar3 = F0.J.e.Measuring;
        this.f2398c = eVar3;
        this.f2399d = false;
        this.f2415t = j6;
        F0.N.b(this.f2396a).getSnapshotObserver().g(this.f2396a, false, this.f2416u);
        if (this.f2398c == eVar3) {
            O();
            this.f2398c = eVar2;
        }
    }

    public final boolean A() {
        return this.f2400e;
    }

    public final F0.J.e B() {
        return this.f2398c;
    }

    public final F0.InterfaceC0909b C() {
        return this.f2414s;
    }

    public final boolean D() {
        return this.f2411p;
    }

    public final boolean E() {
        return this.f2410o;
    }

    public final boolean F() {
        return this.f2403h;
    }

    public final boolean G() {
        return this.f2402g;
    }

    public final F0.O.a H() {
        return this.f2414s;
    }

    public final F0.O.b I() {
        return this.f2413r;
    }

    public final boolean J() {
        return this.f2399d;
    }

    public final F0.AbstractC0914d0 K() {
        return this.f2396a.k0().n();
    }

    public final int L() {
        return this.f2413r.I0();
    }

    public final void M() {
        this.f2413r.w1();
        F0.O.a aVar = this.f2414s;
        if (aVar != null) {
            aVar.s1();
        }
    }

    public final void N() {
        this.f2413r.K1(true);
        F0.O.a aVar = this.f2414s;
        if (aVar != null) {
            aVar.D1(true);
        }
    }

    public final void O() {
        this.f2400e = true;
        this.f2401f = true;
    }

    public final void P() {
        this.f2403h = true;
        this.f2404i = true;
    }

    public final void Q() {
        this.f2402g = true;
    }

    public final void R() {
        this.f2399d = true;
    }

    public final void S() {
        F0.J.e eVarX = this.f2396a.X();
        if (eVarX == F0.J.e.LayingOut || eVarX == F0.J.e.LookaheadLayingOut) {
            if (this.f2413r.r1()) {
                Z(true);
            } else {
                Y(true);
            }
        }
        if (eVarX == F0.J.e.LookaheadLayingOut) {
            F0.O.a aVar = this.f2414s;
            if (aVar == null || !aVar.m1()) {
                a0(true);
            } else {
                b0(true);
            }
        }
    }

    public final void V() {
        F0.AbstractC0907a abstractC0907aF;
        this.f2413r.f().p();
        F0.O.a aVar = this.f2414s;
        if (aVar == null || (abstractC0907aF = aVar.f()) == null) {
            return;
        }
        abstractC0907aF.p();
    }

    public final void W(int i6) {
        int i10 = this.f2409n;
        this.f2409n = i6;
        if ((i10 == 0) != (i6 == 0)) {
            F0.J jO0 = this.f2396a.o0();
            F0.O oV = jO0 != null ? jO0.V() : null;
            if (oV != null) {
                oV.W(i6 == 0 ? oV.f2409n - 1 : oV.f2409n + 1);
            }
        }
    }

    public final void X(int i6) {
        int i10 = this.f2412q;
        this.f2412q = i6;
        if ((i10 == 0) != (i6 == 0)) {
            F0.J jO0 = this.f2396a.o0();
            F0.O oV = jO0 != null ? jO0.V() : null;
            if (oV != null) {
                oV.X(i6 == 0 ? oV.f2412q - 1 : oV.f2412q + 1);
            }
        }
    }

    public final void Y(boolean z6) {
        int i6;
        if (this.f2408m != z6) {
            this.f2408m = z6;
            if (z6 && !this.f2407l) {
                i6 = this.f2409n + 1;
            } else if (z6 || this.f2407l) {
                return;
            } else {
                i6 = this.f2409n - 1;
            }
            W(i6);
        }
    }

    public final void Z(boolean z6) {
        int i6;
        if (this.f2407l != z6) {
            this.f2407l = z6;
            if (z6 && !this.f2408m) {
                i6 = this.f2409n + 1;
            } else if (z6 || this.f2408m) {
                return;
            } else {
                i6 = this.f2409n - 1;
            }
            W(i6);
        }
    }

    public final void a0(boolean z6) {
        int i6;
        if (this.f2411p != z6) {
            this.f2411p = z6;
            if (z6 && !this.f2410o) {
                i6 = this.f2412q + 1;
            } else if (z6 || this.f2410o) {
                return;
            } else {
                i6 = this.f2412q - 1;
            }
            X(i6);
        }
    }

    public final void b0(boolean z6) {
        int i6;
        if (this.f2410o != z6) {
            this.f2410o = z6;
            if (z6 && !this.f2411p) {
                i6 = this.f2412q + 1;
            } else if (z6 || this.f2411p) {
                return;
            } else {
                i6 = this.f2412q - 1;
            }
            X(i6);
        }
    }

    public final void c0() {
        F0.J jO0;
        if (this.f2413r.O1() && (jO0 = this.f2396a.o0()) != null) {
            F0.J.w1(jO0, false, false, false, 7, null);
        }
        F0.O.a aVar = this.f2414s;
        if (aVar == null || !aVar.I1()) {
            return;
        }
        if (F0.P.a(this.f2396a)) {
            F0.J jO1 = this.f2396a.o0();
            if (jO1 != null) {
                F0.J.w1(jO1, false, false, false, 7, null);
                return;
            }
            return;
        }
        F0.J jO2 = this.f2396a.o0();
        if (jO2 != null) {
            F0.J.s1(jO2, false, false, false, 7, null);
        }
    }

    public final void q() {
        if (this.f2414s == null) {
            this.f2414s = new F0.O.a();
        }
    }

    public final F0.InterfaceC0909b r() {
        return this.f2413r;
    }

    public final int s() {
        return this.f2409n;
    }

    public final int t() {
        return this.f2412q;
    }

    public final boolean u() {
        return this.f2408m;
    }

    public final boolean v() {
        return this.f2407l;
    }

    public final boolean w() {
        return this.f2397b;
    }

    public final int x() {
        return this.f2413r.w0();
    }

    public final Y0.C1859b y() {
        return this.f2413r.q1();
    }

    public final Y0.C1859b z() {
        F0.O.a aVar = this.f2414s;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }
}
