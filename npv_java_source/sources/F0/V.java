package F0;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0.J f2520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F0.C0929o f2521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F0.l0 f2524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final X.b f2525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f2526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final X.b f2527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Y0.C1859b f2528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final F0.Q f2529j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F0.J f2530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f2531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f2532c;

        public a(F0.J j6, boolean z6, boolean z10) {
            this.f2530a = j6;
            this.f2531b = z6;
            this.f2532c = z10;
        }

        public final F0.J a() {
            return this.f2530a;
        }

        public final boolean b() {
            return this.f2532c;
        }

        public final boolean c() {
            return this.f2531b;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2533a;

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
                iArr[F0.J.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[F0.J.e.LayingOut.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[F0.J.e.Idle.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            f2533a = iArr;
        }
    }

    public V(F0.J j6) {
        this.f2520a = j6;
        F0.o0.a aVar = F0.o0.f2690b;
        F0.C0929o c0929o = new F0.C0929o(aVar.a());
        this.f2521b = c0929o;
        this.f2524e = new F0.l0();
        this.f2525f = new X.b(new F0.o0.b[16], 0);
        this.f2526g = 1L;
        X.b bVar = new X.b(new F0.V.a[16], 0);
        this.f2527h = bVar;
        this.f2529j = aVar.a() ? new F0.Q(j6, c0929o, bVar.i()) : null;
    }

    private final void A(F0.J j6, boolean z6) {
        Y0.C1859b c1859b;
        if (j6.L0()) {
            return;
        }
        if (j6 == this.f2520a) {
            c1859b = this.f2528i;
            p247y7.AbstractC7350t.c(c1859b);
        } else {
            c1859b = null;
        }
        if (z6) {
            e(j6, c1859b);
        } else {
            f(j6, c1859b);
        }
    }

    public static /* synthetic */ boolean G(F0.V v6, F0.J j6, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return v6.F(j6, z6);
    }

    private final void b() {
        X.b bVar = this.f2525f;
        int iT = bVar.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVar.s();
            int i6 = 0;
            do {
                ((F0.o0.b) objArrS[i6]).c();
                i6++;
            } while (i6 < iT);
        }
        this.f2525f.j();
    }

    public static /* synthetic */ void d(F0.V v6, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        v6.c(z6);
    }

    private final boolean e(F0.J j6, Y0.C1859b c1859b) {
        if (j6.b0() == null) {
            return false;
        }
        boolean zP0 = c1859b != null ? j6.P0(c1859b) : F0.J.Q0(j6, null, 1, null);
        F0.J jO0 = j6.o0();
        if (zP0 && jO0 != null) {
            if (jO0.b0() == null) {
                F0.J.w1(jO0, false, false, false, 3, null);
            } else if (j6.h0() == F0.J.g.InMeasureBlock) {
                F0.J.s1(jO0, false, false, false, 3, null);
            } else if (j6.h0() == F0.J.g.InLayoutBlock) {
                F0.J.q1(jO0, false, 1, null);
            }
        }
        return zP0;
    }

    private final boolean f(F0.J j6, Y0.C1859b c1859b) {
        boolean zK1 = c1859b != null ? j6.k1(c1859b) : F0.J.l1(j6, null, 1, null);
        F0.J jO0 = j6.o0();
        if (zK1 && jO0 != null) {
            if (j6.g0() == F0.J.g.InMeasureBlock) {
                F0.J.w1(jO0, false, false, false, 3, null);
            } else if (j6.g0() == F0.J.g.InLayoutBlock) {
                F0.J.u1(jO0, false, 1, null);
            }
        }
        return zK1;
    }

    private final void g() {
        if (this.f2527h.x()) {
            X.b bVar = this.f2527h;
            int iT = bVar.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVar.s();
                int i6 = 0;
                do {
                    F0.V.a aVar = (F0.V.a) objArrS[i6];
                    if (aVar.a().K0()) {
                        if (aVar.c()) {
                            F0.J.s1(aVar.a(), aVar.b(), false, false, 2, null);
                        } else {
                            F0.J.w1(aVar.a(), aVar.b(), false, false, 2, null);
                        }
                    }
                    i6++;
                } while (i6 < iT);
            }
            this.f2527h.j();
        }
    }

    private final void h(F0.J j6) {
        X.b bVarW0 = j6.w0();
        int iT = bVarW0.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVarW0.s();
            int i6 = 0;
            do {
                F0.J j10 = (F0.J) objArrS[i6];
                if (p247y7.AbstractC7350t.b(j10.N0(), java.lang.Boolean.TRUE) && !j10.L0()) {
                    if (this.f2521b.e(j10, true)) {
                        j10.R0();
                    }
                    h(j10);
                }
                i6++;
            } while (i6 < iT);
        }
    }

    private final void j(F0.J j6, boolean z6) {
        X.b bVarW0 = j6.w0();
        int iT = bVarW0.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVarW0.s();
            int i6 = 0;
            do {
                F0.J j10 = (F0.J) objArrS[i6];
                if ((!z6 && o(j10)) || (z6 && p(j10))) {
                    if (F0.P.a(j10) && !z6) {
                        if (j10.Z() && this.f2521b.e(j10, true)) {
                            x(j10, true, false);
                        } else {
                            i(j10, true);
                        }
                    }
                    w(j10, z6);
                    if (!u(j10, z6)) {
                        j(j10, z6);
                    }
                }
                i6++;
            } while (i6 < iT);
        }
        w(j6, z6);
    }

    private final boolean k(F0.J j6) {
        return j6.e0() && o(j6);
    }

    private final boolean l(F0.J j6) {
        return j6.Z() && p(j6);
    }

    private final boolean o(F0.J j6) {
        return j6.g0() == F0.J.g.InMeasureBlock || j6.V().r().f().k();
    }

    private final boolean p(F0.J j6) {
        F0.AbstractC0907a abstractC0907aF;
        if (j6.h0() == F0.J.g.InMeasureBlock) {
            return true;
        }
        F0.InterfaceC0909b interfaceC0909bC = j6.V().C();
        return (interfaceC0909bC == null || (abstractC0907aF = interfaceC0909bC.f()) == null || !abstractC0907aF.k()) ? false : true;
    }

    private final boolean u(F0.J j6, boolean z6) {
        return z6 ? j6.Z() : j6.e0();
    }

    private final void w(F0.J j6, boolean z6) {
        if (u(j6, z6) && this.f2521b.e(j6, z6)) {
            x(j6, z6, false);
        }
    }

    private final boolean x(F0.J j6, boolean z6, boolean z10) {
        Y0.C1859b c1859b;
        F0.J jO0;
        boolean zE = false;
        if (j6.L0()) {
            return false;
        }
        if (j6.k() || j6.M0() || k(j6) || p247y7.AbstractC7350t.b(j6.N0(), java.lang.Boolean.TRUE) || l(j6) || j6.C()) {
            if (j6 == this.f2520a) {
                c1859b = this.f2528i;
                p247y7.AbstractC7350t.c(c1859b);
            } else {
                c1859b = null;
            }
            if (z6) {
                zE = j6.Z() ? e(j6, c1859b) : false;
                if (z10 && ((zE || j6.Y()) && p247y7.AbstractC7350t.b(j6.N0(), java.lang.Boolean.TRUE))) {
                    j6.R0();
                }
            } else {
                boolean zF = j6.e0() ? f(j6, c1859b) : false;
                if (z10 && j6.W() && (j6 == this.f2520a || ((jO0 = j6.o0()) != null && jO0.k() && j6.M0()))) {
                    if (j6 == this.f2520a) {
                        j6.i1(0, 0);
                    } else {
                        j6.o1();
                    }
                    this.f2524e.d(j6);
                    F0.Q q6 = this.f2529j;
                    if (q6 != null) {
                        q6.a();
                    }
                }
                zE = zF;
            }
            g();
        }
        return zE;
    }

    static /* synthetic */ boolean y(F0.V v6, F0.J j6, boolean z6, boolean z10, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = true;
        }
        if ((i6 & 4) != 0) {
            z10 = true;
        }
        return v6.x(j6, z6, z10);
    }

    private final void z(F0.J j6) {
        X.b bVarW0 = j6.w0();
        int iT = bVarW0.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVarW0.s();
            int i6 = 0;
            do {
                F0.J j10 = (F0.J) objArrS[i6];
                if (o(j10)) {
                    if (F0.P.a(j10)) {
                        A(j10, true);
                    } else {
                        z(j10);
                    }
                }
                i6++;
            } while (i6 < iT);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public final boolean B(F0.J j6, boolean z6) {
        F0.Q q6;
        int i6 = F0.V.b.f2533a[j6.X().ordinal()];
        if (i6 == 1) {
            q6 = this.f2529j;
            if (q6 == null) {
                return false;
            }
        } else {
            if (i6 != 2) {
                if (i6 == 3) {
                    q6 = this.f2529j;
                    if (q6 == null) {
                        return false;
                    }
                } else if (i6 != 4 && i6 != 5) {
                    throw new p087i7.s();
                }
            }
            if ((!j6.Z() && !j6.Y()) || z6) {
                j6.T0();
                j6.S0();
                if (j6.L0()) {
                    return false;
                }
                F0.J jO0 = j6.o0();
                if (p247y7.AbstractC7350t.b(j6.N0(), java.lang.Boolean.TRUE) && ((jO0 == null || !jO0.Z()) && (jO0 == null || !jO0.Y()))) {
                    this.f2521b.c(j6, true);
                } else if (j6.k() && ((jO0 == null || !jO0.W()) && (jO0 == null || !jO0.e0()))) {
                    this.f2521b.c(j6, false);
                }
                return !this.f2523d;
            }
            q6 = this.f2529j;
            if (q6 == null) {
                return false;
            }
        }
        q6.a();
        return false;
    }

    public final boolean C(F0.J j6, boolean z6) {
        F0.J jO0;
        F0.J jO1;
        if (!(j6.b0() != null)) {
            C0.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i6 = F0.V.b.f2533a[j6.X().ordinal()];
        if (i6 == 1) {
            return false;
        }
        if (i6 == 2 || i6 == 3 || i6 == 4) {
            this.f2527h.d(new F0.V.a(j6, true, z6));
            F0.Q q6 = this.f2529j;
            if (q6 == null) {
                return false;
            }
            q6.a();
            return false;
        }
        if (i6 != 5) {
            throw new p087i7.s();
        }
        if (j6.Z() && !z6) {
            return false;
        }
        j6.U0();
        j6.V0();
        if (j6.L0()) {
            return false;
        }
        if ((p247y7.AbstractC7350t.b(j6.N0(), java.lang.Boolean.TRUE) || l(j6)) && ((jO0 = j6.o0()) == null || !jO0.Z())) {
            this.f2521b.c(j6, true);
        } else if ((j6.k() || k(j6)) && ((jO1 = j6.o0()) == null || !jO1.e0())) {
            this.f2521b.c(j6, false);
        }
        return !this.f2523d;
    }

    public final void D(F0.J j6) {
        this.f2524e.d(j6);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0038 A[PHI: r5
  0x0038: PHI (r5v2 F0.Q) = (r5v1 F0.Q), (r5v5 F0.Q) binds: [B:44:0x0075, B:20:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean E(F0.J j6, boolean z6) {
        F0.Q q6;
        int i6 = F0.V.b.f2533a[j6.X().ordinal()];
        if (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) {
            q6 = this.f2529j;
            if (q6 != null) {
                q6.a();
            }
        } else {
            if (i6 != 5) {
                throw new p087i7.s();
            }
            if (!z6 && j6.k() == j6.M0() && (j6.e0() || j6.W())) {
                q6 = this.f2529j;
                if (q6 != null) {
                    q6.a();
                }
            } else {
                j6.S0();
                if (!j6.L0() && j6.M0()) {
                    F0.J jO0 = j6.o0();
                    if ((jO0 == null || !jO0.W()) && (jO0 == null || !jO0.e0())) {
                        this.f2521b.c(j6, false);
                    }
                    if (!this.f2523d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean F(F0.J j6, boolean z6) {
        int i6 = F0.V.b.f2533a[j6.X().ordinal()];
        if (i6 != 1 && i6 != 2) {
            if (i6 == 3 || i6 == 4) {
                this.f2527h.d(new F0.V.a(j6, false, z6));
                F0.Q q6 = this.f2529j;
                if (q6 != null) {
                    q6.a();
                }
            } else {
                if (i6 != 5) {
                    throw new p087i7.s();
                }
                if (!j6.e0() || z6) {
                    j6.V0();
                    if (!j6.L0() && (j6.k() || k(j6))) {
                        F0.J jO0 = j6.o0();
                        if (jO0 == null || !jO0.e0()) {
                            this.f2521b.c(j6, false);
                        }
                        if (!this.f2523d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void H(long j6) {
        Y0.C1859b c1859b = this.f2528i;
        if (c1859b == null ? false : Y0.C1859b.f(c1859b.r(), j6)) {
            return;
        }
        if (!(!this.f2522c)) {
            C0.a.a("updateRootConstraints called while measuring");
        }
        this.f2528i = Y0.C1859b.a(j6);
        if (this.f2520a.b0() != null) {
            this.f2520a.U0();
        }
        this.f2520a.V0();
        F0.C0929o c0929o = this.f2521b;
        F0.J j10 = this.f2520a;
        c0929o.c(j10, j10.b0() != null);
    }

    public final void c(boolean z6) {
        if (z6) {
            this.f2524e.e(this.f2520a);
        }
        this.f2524e.a();
    }

    public final void i(F0.J j6, boolean z6) {
        if (this.f2521b.g(z6)) {
            return;
        }
        if (!this.f2522c) {
            C0.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (!(!u(j6, z6))) {
            C0.a.a("node not yet measured");
        }
        j(j6, z6);
    }

    public final boolean m() {
        return this.f2521b.h();
    }

    public final boolean n() {
        return this.f2524e.c();
    }

    public final long q() {
        if (!this.f2522c) {
            C0.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return this.f2526g;
    }

    public final boolean r(p237x7.a aVar) {
        boolean z6;
        if (!this.f2520a.K0()) {
            C0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.f2520a.k()) {
            C0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (!(!this.f2522c)) {
            C0.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z10 = false;
        if (this.f2528i != null) {
            this.f2522c = true;
            this.f2523d = true;
            try {
                if (this.f2521b.h()) {
                    F0.C0929o c0929o = this.f2521b;
                    z6 = false;
                    while (c0929o.h()) {
                        boolean z11 = !c0929o.f2688a.d();
                        F0.J jE = (z11 ? c0929o.f2688a : c0929o.f2689b).e();
                        boolean zY = y(this, jE, z11, false, 4, null);
                        if (jE == this.f2520a && zY) {
                            z6 = true;
                        }
                    }
                    if (aVar != null) {
                        aVar.b();
                    }
                } else {
                    z6 = false;
                }
                this.f2522c = false;
                this.f2523d = false;
                F0.Q q6 = this.f2529j;
                if (q6 != null) {
                    q6.a();
                }
                z10 = z6;
            } catch (java.lang.Throwable th) {
                this.f2522c = false;
                this.f2523d = false;
                throw th;
            }
        }
        b();
        return z10;
    }

    public final void s(F0.J j6, long j10) {
        if (j6.L0()) {
            return;
        }
        if (!(!p247y7.AbstractC7350t.b(j6, this.f2520a))) {
            C0.a.a("measureAndLayout called on root");
        }
        if (!this.f2520a.K0()) {
            C0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.f2520a.k()) {
            C0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (!(!this.f2522c)) {
            C0.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f2528i != null) {
            this.f2522c = true;
            this.f2523d = false;
            try {
                this.f2521b.i(j6);
                if (e(j6, Y0.C1859b.a(j10)) || j6.Y()) {
                    if (p247y7.AbstractC7350t.b(j6.N0(), java.lang.Boolean.TRUE)) {
                        j6.R0();
                    }
                }
                h(j6);
                f(j6, Y0.C1859b.a(j10));
                if (j6.W() && j6.k()) {
                    j6.o1();
                    this.f2524e.d(j6);
                }
                g();
                this.f2522c = false;
                this.f2523d = false;
                F0.Q q6 = this.f2529j;
                if (q6 != null) {
                    q6.a();
                }
            } catch (java.lang.Throwable th) {
                this.f2522c = false;
                this.f2523d = false;
                throw th;
            }
        }
        b();
    }

    public final void t() {
        if (this.f2521b.h()) {
            if (!this.f2520a.K0()) {
                C0.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!this.f2520a.k()) {
                C0.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (!(!this.f2522c)) {
                C0.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f2528i != null) {
                this.f2522c = true;
                this.f2523d = false;
                try {
                    if (!this.f2521b.g(true)) {
                        if (this.f2520a.b0() != null) {
                            A(this.f2520a, true);
                        } else {
                            z(this.f2520a);
                        }
                    }
                    A(this.f2520a, false);
                    this.f2522c = false;
                    this.f2523d = false;
                    F0.Q q6 = this.f2529j;
                    if (q6 != null) {
                        q6.a();
                    }
                } catch (java.lang.Throwable th) {
                    this.f2522c = false;
                    this.f2523d = false;
                    throw th;
                }
            }
        }
    }

    public final void v(F0.J j6) {
        this.f2521b.i(j6);
        this.f2524e.f(j6);
    }
}
