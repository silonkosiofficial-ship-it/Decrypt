package F0;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends D0.X implements D0.M, F0.X {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final F0.T.b f2494P = new F0.T.b(null);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final p237x7.l f2495Q = F0.T.a.f2504D;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private D0.d0 f2496H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f2497I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f2498J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f2499K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final D0.X.a f2500L = D0.Y.a(this);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private p170r.G f2501M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private p170r.G f2502N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private p170r.K f2503O;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final F0.T.a f2504D = new F0.T.a();

        a() {
            super(1);
        }

        public final void a(F0.t0 t0Var) {
            if (t0Var.R()) {
                t0Var.a().h1(t0Var);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((F0.t0) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ F0.t0 f2505D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ F0.T f2506E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(F0.t0 t0Var, F0.T t6) {
            super(0);
            this.f2505D = t0Var;
            this.f2506E = t6;
        }

        public final void a() {
            p237x7.l lVarL = this.f2505D.b().l();
            if (lVarL != null) {
                lVarL.l(this.f2506E.u1());
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public static final class d implements D0.K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f2507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.util.Map f2509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p237x7.l f2510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p237x7.l f2511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ F0.T f2512f;

        d(int i6, int i10, java.util.Map map, p237x7.l lVar, p237x7.l lVar2, F0.T t6) {
            this.f2507a = i6;
            this.f2508b = i10;
            this.f2509c = map;
            this.f2510d = lVar;
            this.f2511e = lVar2;
            this.f2512f = t6;
        }

        @Override // D0.K
        public java.util.Map f() {
            return this.f2509c;
        }

        @Override // D0.K
        public int getHeight() {
            return this.f2508b;
        }

        @Override // D0.K
        public int getWidth() {
            return this.f2507a;
        }

        @Override // D0.K
        public void k() {
            this.f2511e.l(this.f2512f.s1());
        }

        @Override // D0.K
        public p237x7.l l() {
            return this.f2510d;
        }
    }

    public static final class e implements D0.d0 {
        e() {
        }

        @Override // Y0.e
        public /* synthetic */ float B0(float f6) {
            return Y0.d.g(this, f6);
        }

        @Override // Y0.e
        public /* synthetic */ int K0(long j6) {
            return Y0.d.a(this, j6);
        }

        @Override // Y0.n
        public /* synthetic */ long O(float f6) {
            return Y0.m.b(this, f6);
        }

        @Override // Y0.e
        public /* synthetic */ long P(long j6) {
            return Y0.d.e(this, j6);
        }

        @Override // Y0.e
        public /* synthetic */ int S0(float f6) {
            return Y0.d.b(this, f6);
        }

        @Override // Y0.n
        public /* synthetic */ float X(long j6) {
            return Y0.m.a(this, j6);
        }

        @Override // Y0.e
        public /* synthetic */ long b1(long j6) {
            return Y0.d.h(this, j6);
        }

        @Override // Y0.e
        public /* synthetic */ float g1(long j6) {
            return Y0.d.f(this, j6);
        }

        @Override // Y0.e
        public float getDensity() {
            return F0.T.this.getDensity();
        }

        @Override // Y0.e
        public /* synthetic */ long k0(float f6) {
            return Y0.d.i(this, f6);
        }

        @Override // Y0.e
        public /* synthetic */ float o0(int i6) {
            return Y0.d.d(this, i6);
        }

        @Override // Y0.e
        public /* synthetic */ float q0(float f6) {
            return Y0.d.c(this, f6);
        }

        @Override // Y0.n
        public float v0() {
            return F0.T.this.v0();
        }
    }

    private final void A1(p170r.L l6) {
        F0.J j6;
        java.lang.Object[] objArr = l6.f53341b;
        long[] jArr = l6.f53340a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j10 = jArr[i6];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i6 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j10) < 128 && (j6 = (F0.J) ((java.lang.ref.WeakReference) objArr[(i6 << 3) + i11]).get()) != null) {
                        if (A0()) {
                            j6.p1(false);
                        } else {
                            j6.t1(false);
                        }
                    }
                    j10 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005d A[LOOP:0: B:11:0x002a->B:21:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0100 A[LOOP:2: B:38:0x00ad->B:54:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0060 A[EDGE_INSN: B:81:0x0060->B:22:0x0060 BREAK  A[LOOP:0: B:11:0x002a->B:21:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x010b A[EDGE_INSN: B:86:0x010b->B:55:0x010b BREAK  A[LOOP:2: B:38:0x00ad->B:54:0x0100], SYNTHETIC] */
    public final void h1(F0.t0 t0Var) {
        F0.T tR1;
        p170r.L l6;
        F0.q0 snapshotObserver;
        if (this.f2499K) {
            return;
        }
        p237x7.l lVarL = t0Var.b().l();
        p170r.K k6 = this.f2503O;
        char c6 = 7;
        long j6 = -9187201950435737472L;
        int i6 = 0;
        if (lVarL == null) {
            if (k6 != null) {
                java.lang.Object[] objArr = k6.f53335c;
                long[] jArr = k6.f53333a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i10 != length) {
                                break;
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j10 & 255) < 128) {
                                    A1((p170r.L) objArr[(i10 << 3) + i12]);
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            } else if (i10 != length) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                k6.i();
                return;
            }
            return;
        }
        p170r.G g6 = this.f2502N;
        p247y7.AbstractC7342k abstractC7342k = null;
        int i13 = 1;
        if (g6 == null) {
            g6 = new p170r.G(i6, i13, abstractC7342k);
            this.f2502N = g6;
        }
        p170r.G g10 = this.f2501M;
        if (g10 == null) {
            g10 = new p170r.G(i6, i13, abstractC7342k);
            this.f2501M = g10;
        }
        g6.p(g10);
        g10.i();
        F0.o0 o0VarN0 = o1().n0();
        if (o0VarN0 != null && (snapshotObserver = o0VarN0.getSnapshotObserver()) != null) {
            snapshotObserver.i(t0Var, f2495Q, new F0.T.c(t0Var, this));
        }
        if (k6 != null) {
            java.lang.Object[] objArr2 = g6.f53312b;
            float[] fArr = g6.f53313c;
            long[] jArr2 = g6.f53311a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i14 = 0;
                while (true) {
                    long j11 = jArr2[i14];
                    if ((((~j11) << 7) & j11 & j6) != j6) {
                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((j11 & 255) < 128) {
                                int i17 = (i14 << 3) + i16;
                                java.lang.Object obj = objArr2[i17];
                                float f6 = fArr[i17];
                                androidx.appcompat.app.D.a(obj);
                                if (g10.e(null, Float.NaN) != f6 && (l6 = (p170r.L) k6.p(null)) != null) {
                                    A1(l6);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        }
                        if (i14 != length2) {
                            break;
                        }
                        i14++;
                        j6 = -9187201950435737472L;
                    } else if (i14 != length2) {
                        break;
                        break;
                    } else {
                        i14++;
                        j6 = -9187201950435737472L;
                    }
                }
            }
        }
        java.lang.Object[] objArr3 = g10.f53312b;
        long[] jArr3 = g10.f53311a;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i18 = 0;
            while (true) {
                long j12 = jArr3[i18];
                if ((((~j12) << c6) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length3)) >>> 31);
                    for (int i20 = 0; i20 < i19; i20++) {
                        if ((j12 & 255) < 128) {
                            androidx.appcompat.app.D.a(objArr3[(i18 << 3) + i20]);
                            if (!g6.a(null) && (tR1 = r1()) != null) {
                                tR1.w1(null);
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i19 != 8) {
                        break;
                    }
                }
                if (i18 == length3) {
                    break;
                }
                i18++;
                c6 = 7;
            }
        }
        g6.i();
    }

    private final F0.T j1(D0.c0 c0Var) {
        F0.T tR1;
        F0.T t6 = this;
        while (true) {
            p170r.G g6 = t6.f2501M;
            if ((g6 != null && g6.a(c0Var)) || (tR1 = t6.r1()) == null) {
                return t6;
            }
            t6 = tR1;
        }
    }

    private final void w1(D0.c0 c0Var) {
        p170r.K k6 = j1(c0Var).f2503O;
        p170r.L l6 = k6 != null ? (p170r.L) k6.p(c0Var) : null;
        if (l6 != null) {
            A1(l6);
        }
    }

    @Override // D0.InterfaceC0896o
    public boolean A0() {
        return false;
    }

    @Override // Y0.e
    public /* synthetic */ float B0(float f6) {
        return Y0.d.g(this, f6);
    }

    public abstract void B1();

    public final void C1(boolean z6) {
        this.f2499K = z6;
    }

    public final void D1(boolean z6) {
        this.f2498J = z6;
    }

    @Override // Y0.e
    public /* synthetic */ int K0(long j6) {
        return Y0.d.a(this, j6);
    }

    @Override // Y0.n
    public /* synthetic */ long O(float f6) {
        return Y0.m.b(this, f6);
    }

    @Override // D0.M
    public D0.K O0(int i6, int i10, java.util.Map map, p237x7.l lVar, p237x7.l lVar2) {
        if (!((i6 & (-16777216)) == 0 && ((-16777216) & i10) == 0)) {
            C0.a.b("Size(" + i6 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new F0.T.d(i6, i10, map, lVar, lVar2, this);
    }

    @Override // Y0.e
    public /* synthetic */ long P(long j6) {
        return Y0.d.e(this, j6);
    }

    @Override // D0.O
    public final int Q(D0.AbstractC0882a abstractC0882a) {
        int iF1;
        if (n1() && (iF1 = f1(abstractC0882a)) != Integer.MIN_VALUE) {
            return iF1 + Y0.p.i(u0());
        }
        return Integer.MIN_VALUE;
    }

    @Override // Y0.e
    public /* synthetic */ int S0(float f6) {
        return Y0.d.b(this, f6);
    }

    @Override // Y0.n
    public /* synthetic */ float X(long j6) {
        return Y0.m.a(this, j6);
    }

    @Override // Y0.e
    public /* synthetic */ long b1(long j6) {
        return Y0.d.h(this, j6);
    }

    @Override // D0.M
    public /* synthetic */ D0.K f0(int i6, int i10, java.util.Map map, p237x7.l lVar) {
        return D0.L.a(this, i6, i10, map, lVar);
    }

    public abstract int f1(D0.AbstractC0882a abstractC0882a);

    @Override // F0.X
    public void g0(boolean z6) {
        this.f2497I = z6;
    }

    @Override // Y0.e
    public /* synthetic */ float g1(long j6) {
        return Y0.d.f(this, j6);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[LOOP:0: B:9:0x001a->B:19:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[EDGE_INSN: B:28:0x0054->B:20:0x0054 BREAK  A[LOOP:0: B:9:0x001a->B:19:0x0051], SYNTHETIC] */
    public final void i1(D0.K k6) {
        if (k6 != null) {
            h1(new F0.t0(k6, this));
            return;
        }
        p170r.K k10 = this.f2503O;
        if (k10 != null) {
            java.lang.Object[] objArr = k10.f53335c;
            long[] jArr = k10.f53333a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j6 = jArr[i6];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i6 != length) {
                            break;
                            break;
                        }
                        i6++;
                    } else {
                        int i10 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j6) < 128) {
                                A1((p170r.L) objArr[(i6 << 3) + i11]);
                            }
                            j6 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        } else if (i6 != length) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            }
        }
        p170r.K k11 = this.f2503O;
        if (k11 != null) {
            k11.i();
        }
        p170r.G g6 = this.f2501M;
        if (g6 != null) {
            g6.i();
        }
    }

    @Override // Y0.e
    public /* synthetic */ long k0(float f6) {
        return Y0.d.i(this, f6);
    }

    public abstract F0.T k1();

    public abstract D0.InterfaceC0900t m1();

    public abstract boolean n1();

    @Override // Y0.e
    public /* synthetic */ float o0(int i6) {
        return Y0.d.d(this, i6);
    }

    public abstract F0.J o1();

    @Override // Y0.e
    public /* synthetic */ float q0(float f6) {
        return Y0.d.c(this, f6);
    }

    public abstract D0.K q1();

    public abstract F0.T r1();

    public final D0.X.a s1() {
        return this.f2500L;
    }

    public abstract long t1();

    public final D0.d0 u1() {
        D0.d0 d0Var = this.f2496H;
        return d0Var == null ? new F0.T.e() : d0Var;
    }

    protected final void v1(F0.AbstractC0914d0 abstractC0914d0) {
        F0.AbstractC0907a abstractC0907aF;
        F0.AbstractC0914d0 abstractC0914d0O2 = abstractC0914d0.o2();
        boolean zB = p247y7.AbstractC7350t.b(abstractC0914d0O2 != null ? abstractC0914d0O2.o1() : null, abstractC0914d0.o1());
        F0.InterfaceC0909b interfaceC0909bE2 = abstractC0914d0.e2();
        if (zB) {
            F0.InterfaceC0909b interfaceC0909bJ = interfaceC0909bE2.J();
            if (interfaceC0909bJ == null || (abstractC0907aF = interfaceC0909bJ.f()) == null) {
                return;
            }
        } else {
            abstractC0907aF = interfaceC0909bE2.f();
        }
        abstractC0907aF.m();
    }

    public boolean x1() {
        return this.f2497I;
    }

    public final boolean y1() {
        return this.f2499K;
    }

    public final boolean z1() {
        return this.f2498J;
    }
}
