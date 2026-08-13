package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1949j1 implements F0.m0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final androidx.compose.ui.platform.C1949j1.b f20125P = new androidx.compose.ui.platform.C1949j1.b(null);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f20126Q = 8;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final p237x7.p f20127R = androidx.compose.ui.platform.C1949j1.a.f20141D;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.compose.ui.platform.r f20128C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p237x7.p f20129D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p237x7.a f20130E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f20131F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f20133H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f20134I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private p141o0.N1 f20135J;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final androidx.compose.ui.platform.InterfaceC1974s0 f20139N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f20140O;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final androidx.compose.ui.platform.P0 f20132G = new androidx.compose.ui.platform.P0();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final androidx.compose.ui.platform.K0 f20136K = new androidx.compose.ui.platform.K0(f20127R);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final p141o0.C6995r0 f20137L = new p141o0.C6995r0();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private long f20138M = androidx.compose.ui.graphics.f.f19784b.a();

    /* JADX INFO: renamed from: androidx.compose.ui.platform.j1$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.C1949j1.a f20141D = new androidx.compose.ui.platform.C1949j1.a();

        a() {
            super(2);
        }

        public final void a(androidx.compose.ui.platform.InterfaceC1974s0 interfaceC1974s0, android.graphics.Matrix matrix) {
            interfaceC1974s0.I(matrix);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((androidx.compose.ui.platform.InterfaceC1974s0) obj, (android.graphics.Matrix) obj2);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.j1$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.j1$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.p f20142D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p237x7.p pVar) {
            super(1);
            this.f20142D = pVar;
        }

        public final void a(p141o0.InterfaceC6993q0 interfaceC6993q0) {
            this.f20142D.u(interfaceC6993q0, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p141o0.InterfaceC6993q0) obj);
            return p087i7.M.f46721a;
        }
    }

    public C1949j1(androidx.compose.ui.platform.r rVar, p237x7.p pVar, p237x7.a aVar) {
        this.f20128C = rVar;
        this.f20129D = pVar;
        this.f20130E = aVar;
        androidx.compose.ui.platform.InterfaceC1974s0 c1943h1 = android.os.Build.VERSION.SDK_INT >= 29 ? new androidx.compose.ui.platform.C1943h1(rVar) : new androidx.compose.ui.platform.U0(rVar);
        c1943h1.F(true);
        c1943h1.u(false);
        this.f20139N = c1943h1;
    }

    private final void l(p141o0.InterfaceC6993q0 interfaceC6993q0) {
        if (this.f20139N.D() || this.f20139N.A()) {
            this.f20132G.a(interfaceC6993q0);
        }
    }

    private final void m(boolean z6) {
        if (z6 != this.f20131F) {
            this.f20131F = z6;
            this.f20128C.x0(this, z6);
        }
    }

    private final void n() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.compose.ui.platform.R1.f19969a.a(this.f20128C);
        } else {
            this.f20128C.invalidate();
        }
    }

    @Override // F0.m0
    public void a(float[] fArr) {
        p141o0.J1.n(fArr, this.f20136K.b(this.f20139N));
    }

    @Override // F0.m0
    public void b(p141o0.InterfaceC6993q0 interfaceC6993q0, p171r0.C7053c c7053c) {
        android.graphics.Canvas canvasD = p141o0.H.d(interfaceC6993q0);
        if (canvasD.isHardwareAccelerated()) {
            j();
            boolean z6 = this.f20139N.J() > 0.0f;
            this.f20134I = z6;
            if (z6) {
                interfaceC6993q0.v();
            }
            this.f20139N.s(canvasD);
            if (this.f20134I) {
                interfaceC6993q0.n();
                return;
            }
            return;
        }
        float f6 = this.f20139N.f();
        float fB = this.f20139N.B();
        float fO = this.f20139N.o();
        float fR = this.f20139N.r();
        if (this.f20139N.a() < 1.0f) {
            p141o0.N1 n1A = this.f20135J;
            if (n1A == null) {
                n1A = p141o0.U.a();
                this.f20135J = n1A;
            }
            n1A.b(this.f20139N.a());
            canvasD.saveLayer(f6, fB, fO, fR, n1A.w());
        } else {
            interfaceC6993q0.m();
        }
        interfaceC6993q0.d(f6, fB);
        interfaceC6993q0.o(this.f20136K.b(this.f20139N));
        l(interfaceC6993q0);
        p237x7.p pVar = this.f20129D;
        if (pVar != null) {
            pVar.u(interfaceC6993q0, null);
        }
        interfaceC6993q0.s();
        m(false);
    }

    @Override // F0.m0
    public void c(p237x7.p pVar, p237x7.a aVar) {
        m(false);
        this.f20133H = false;
        this.f20134I = false;
        this.f20138M = androidx.compose.ui.graphics.f.f19784b.a();
        this.f20129D = pVar;
        this.f20130E = aVar;
    }

    @Override // F0.m0
    public boolean d(long j6) {
        float fM = p131n0.g.m(j6);
        float fN = p131n0.g.n(j6);
        if (this.f20139N.A()) {
            return 0.0f <= fM && fM < ((float) this.f20139N.getWidth()) && 0.0f <= fN && fN < ((float) this.f20139N.getHeight());
        }
        if (this.f20139N.D()) {
            return this.f20132G.f(j6);
        }
        return true;
    }

    @Override // F0.m0
    public void destroy() {
        if (this.f20139N.k()) {
            this.f20139N.i();
        }
        this.f20129D = null;
        this.f20130E = null;
        this.f20133H = true;
        m(false);
        this.f20128C.I0();
        this.f20128C.G0(this);
    }

    @Override // F0.m0
    public void e(androidx.compose.ui.graphics.d dVar) {
        p237x7.a aVar;
        int iF = dVar.F() | this.f20140O;
        int i6 = iF & 4096;
        if (i6 != 0) {
            this.f20138M = dVar.N0();
        }
        boolean z6 = false;
        boolean z10 = this.f20139N.D() && !this.f20132G.e();
        if ((iF & 1) != 0) {
            this.f20139N.h(dVar.o());
        }
        if ((iF & 2) != 0) {
            this.f20139N.g(dVar.E());
        }
        if ((iF & 4) != 0) {
            this.f20139N.b(dVar.f());
        }
        if ((iF & 8) != 0) {
            this.f20139N.j(dVar.z());
        }
        if ((iF & 16) != 0) {
            this.f20139N.e(dVar.v());
        }
        if ((iF & 32) != 0) {
            this.f20139N.x(dVar.J());
        }
        if ((iF & 64) != 0) {
            this.f20139N.C(p141o0.A0.k(dVar.k()));
        }
        if ((iF & 128) != 0) {
            this.f20139N.H(p141o0.A0.k(dVar.M()));
        }
        if ((iF & 1024) != 0) {
            this.f20139N.d(dVar.u());
        }
        if ((iF & 256) != 0) {
            this.f20139N.n(dVar.B());
        }
        if ((iF & 512) != 0) {
            this.f20139N.c(dVar.r());
        }
        if ((iF & 2048) != 0) {
            this.f20139N.m(dVar.x());
        }
        if (i6 != 0) {
            this.f20139N.t(androidx.compose.ui.graphics.f.f(this.f20138M) * this.f20139N.getWidth());
            this.f20139N.w(androidx.compose.ui.graphics.f.g(this.f20138M) * this.f20139N.getHeight());
        }
        boolean z11 = dVar.s() && dVar.K() != p141o0.Y1.a();
        if ((iF & 24576) != 0) {
            this.f20139N.E(z11);
            this.f20139N.u(dVar.s() && dVar.K() == p141o0.Y1.a());
        }
        if ((131072 & iF) != 0) {
            androidx.compose.ui.platform.InterfaceC1974s0 interfaceC1974s0 = this.f20139N;
            dVar.H();
            interfaceC1974s0.l(null);
        }
        if ((32768 & iF) != 0) {
            this.f20139N.q(dVar.t());
        }
        boolean zH = this.f20132G.h(dVar.G(), dVar.f(), z11, dVar.J(), dVar.i());
        if (this.f20132G.c()) {
            this.f20139N.z(this.f20132G.b());
        }
        if (z11 && !this.f20132G.e()) {
            z6 = true;
        }
        if (z10 != z6 || (z6 && zH)) {
            invalidate();
        } else {
            n();
        }
        if (!this.f20134I && this.f20139N.J() > 0.0f && (aVar = this.f20130E) != null) {
            aVar.b();
        }
        if ((iF & 7963) != 0) {
            this.f20136K.c();
        }
        this.f20140O = dVar.F();
    }

    @Override // F0.m0
    public long f(long j6, boolean z6) {
        if (!z6) {
            return p141o0.J1.f(this.f20136K.b(this.f20139N), j6);
        }
        float[] fArrA = this.f20136K.a(this.f20139N);
        return fArrA != null ? p141o0.J1.f(fArrA, j6) : p131n0.g.f51312b.a();
    }

    @Override // F0.m0
    public void g(long j6) {
        int iG = Y0.t.g(j6);
        int iF = Y0.t.f(j6);
        this.f20139N.t(androidx.compose.ui.graphics.f.f(this.f20138M) * iG);
        this.f20139N.w(androidx.compose.ui.graphics.f.g(this.f20138M) * iF);
        androidx.compose.ui.platform.InterfaceC1974s0 interfaceC1974s0 = this.f20139N;
        if (interfaceC1974s0.v(interfaceC1974s0.f(), this.f20139N.B(), this.f20139N.f() + iG, this.f20139N.B() + iF)) {
            this.f20139N.z(this.f20132G.b());
            invalidate();
            this.f20136K.c();
        }
    }

    @Override // F0.m0
    public void h(float[] fArr) {
        float[] fArrA = this.f20136K.a(this.f20139N);
        if (fArrA != null) {
            p141o0.J1.n(fArr, fArrA);
        }
    }

    @Override // F0.m0
    public void i(long j6) {
        int iF = this.f20139N.f();
        int iB = this.f20139N.B();
        int iH = Y0.p.h(j6);
        int i6 = Y0.p.i(j6);
        if (iF == iH && iB == i6) {
            return;
        }
        if (iF != iH) {
            this.f20139N.p(iH - iF);
        }
        if (iB != i6) {
            this.f20139N.y(i6 - iB);
        }
        n();
        this.f20136K.c();
    }

    @Override // F0.m0
    public void invalidate() {
        if (this.f20131F || this.f20133H) {
            return;
        }
        this.f20128C.invalidate();
        m(true);
    }

    @Override // F0.m0
    public void j() {
        if (this.f20131F || !this.f20139N.k()) {
            p141o0.Q1 q1D = (!this.f20139N.D() || this.f20132G.e()) ? null : this.f20132G.d();
            p237x7.p pVar = this.f20129D;
            if (pVar != null) {
                this.f20139N.G(this.f20137L, q1D, new androidx.compose.ui.platform.C1949j1.c(pVar));
            }
            m(false);
        }
    }

    @Override // F0.m0
    public void k(p131n0.e eVar, boolean z6) {
        if (!z6) {
            p141o0.J1.g(this.f20136K.b(this.f20139N), eVar);
            return;
        }
        float[] fArrA = this.f20136K.a(this.f20139N);
        if (fArrA == null) {
            eVar.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            p141o0.J1.g(fArrA, eVar);
        }
    }
}
