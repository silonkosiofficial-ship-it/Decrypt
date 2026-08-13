package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements androidx.compose.ui.graphics.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f19743C;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f19747G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float f19748H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private float f19749I;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private float f19752L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float f19753M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f19754N;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f19758R;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private p141o0.L1 f19763W;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private float f19744D = 1.0f;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private float f19745E = 1.0f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private float f19746F = 1.0f;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f19750J = p141o0.D1.a();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f19751K = p141o0.D1.a();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f19755O = 8.0f;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private long f19756P = androidx.compose.ui.graphics.f.f19784b.a();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p141o0.e2 f19757Q = p141o0.Y1.a();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f19759S = androidx.compose.ui.graphics.a.f19739a.a();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private long f19760T = p131n0.m.f51333b.a();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Y0.e f19761U = Y0.g.b(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Y0.v f19762V = Y0.v.Ltr;

    @Override // androidx.compose.ui.graphics.c
    public void A(boolean z6) {
        if (this.f19758R != z6) {
            this.f19743C |= 16384;
            this.f19758R = z6;
        }
    }

    @Override // androidx.compose.ui.graphics.c
    public float B() {
        return this.f19752L;
    }

    @Override // Y0.e
    public /* synthetic */ float B0(float f6) {
        return Y0.d.g(this, f6);
    }

    public final Y0.v C() {
        return this.f19762V;
    }

    @Override // androidx.compose.ui.graphics.c
    public void D(long j6) {
        if (p141o0.C7016y0.o(this.f19751K, j6)) {
            return;
        }
        this.f19743C |= 128;
        this.f19751K = j6;
    }

    @Override // androidx.compose.ui.graphics.c
    public float E() {
        return this.f19745E;
    }

    public final int F() {
        return this.f19743C;
    }

    public final p141o0.L1 G() {
        return this.f19763W;
    }

    public p141o0.Z1 H() {
        return null;
    }

    public float J() {
        return this.f19749I;
    }

    public p141o0.e2 K() {
        return this.f19757Q;
    }

    @Override // Y0.e
    public /* synthetic */ int K0(long j6) {
        return Y0.d.a(this, j6);
    }

    public long M() {
        return this.f19751K;
    }

    public final void N() {
        h(1.0f);
        g(1.0f);
        b(1.0f);
        j(0.0f);
        e(0.0f);
        p(0.0f);
        w(p141o0.D1.a());
        D(p141o0.D1.a());
        n(0.0f);
        c(0.0f);
        d(0.0f);
        m(8.0f);
        T0(androidx.compose.ui.graphics.f.f19784b.a());
        l0(p141o0.Y1.a());
        A(false);
        l(null);
        q(androidx.compose.ui.graphics.a.f19739a.a());
        S(p131n0.m.f51333b.a());
        this.f19763W = null;
        this.f19743C = 0;
    }

    @Override // androidx.compose.ui.graphics.c
    public long N0() {
        return this.f19756P;
    }

    @Override // Y0.n
    public /* synthetic */ long O(float f6) {
        return Y0.m.b(this, f6);
    }

    @Override // Y0.e
    public /* synthetic */ long P(long j6) {
        return Y0.d.e(this, j6);
    }

    public final void Q(Y0.e eVar) {
        this.f19761U = eVar;
    }

    public final void R(Y0.v vVar) {
        this.f19762V = vVar;
    }

    public void S(long j6) {
        this.f19760T = j6;
    }

    @Override // Y0.e
    public /* synthetic */ int S0(float f6) {
        return Y0.d.b(this, f6);
    }

    public final void T() {
        this.f19763W = K().a(i(), this.f19762V, this.f19761U);
    }

    @Override // androidx.compose.ui.graphics.c
    public void T0(long j6) {
        if (androidx.compose.ui.graphics.f.e(this.f19756P, j6)) {
            return;
        }
        this.f19743C |= 4096;
        this.f19756P = j6;
    }

    @Override // Y0.n
    public /* synthetic */ float X(long j6) {
        return Y0.m.a(this, j6);
    }

    @Override // androidx.compose.ui.graphics.c
    public void b(float f6) {
        if (this.f19746F == f6) {
            return;
        }
        this.f19743C |= 4;
        this.f19746F = f6;
    }

    @Override // Y0.e
    public /* synthetic */ long b1(long j6) {
        return Y0.d.h(this, j6);
    }

    @Override // androidx.compose.ui.graphics.c
    public void c(float f6) {
        if (this.f19753M == f6) {
            return;
        }
        this.f19743C |= 512;
        this.f19753M = f6;
    }

    @Override // androidx.compose.ui.graphics.c
    public void d(float f6) {
        if (this.f19754N == f6) {
            return;
        }
        this.f19743C |= 1024;
        this.f19754N = f6;
    }

    @Override // androidx.compose.ui.graphics.c
    public void e(float f6) {
        if (this.f19748H == f6) {
            return;
        }
        this.f19743C |= 16;
        this.f19748H = f6;
    }

    public float f() {
        return this.f19746F;
    }

    @Override // androidx.compose.ui.graphics.c
    public void g(float f6) {
        if (this.f19745E == f6) {
            return;
        }
        this.f19743C |= 2;
        this.f19745E = f6;
    }

    @Override // Y0.e
    public /* synthetic */ float g1(long j6) {
        return Y0.d.f(this, j6);
    }

    @Override // Y0.e
    public float getDensity() {
        return this.f19761U.getDensity();
    }

    @Override // androidx.compose.ui.graphics.c
    public void h(float f6) {
        if (this.f19744D == f6) {
            return;
        }
        this.f19743C |= 1;
        this.f19744D = f6;
    }

    public long i() {
        return this.f19760T;
    }

    @Override // androidx.compose.ui.graphics.c
    public void j(float f6) {
        if (this.f19747G == f6) {
            return;
        }
        this.f19743C |= 8;
        this.f19747G = f6;
    }

    public long k() {
        return this.f19750J;
    }

    @Override // Y0.e
    public /* synthetic */ long k0(float f6) {
        return Y0.d.i(this, f6);
    }

    @Override // androidx.compose.ui.graphics.c
    public void l(p141o0.Z1 z6) {
        if (p247y7.AbstractC7350t.b(null, z6)) {
            return;
        }
        this.f19743C |= 131072;
    }

    @Override // androidx.compose.ui.graphics.c
    public void l0(p141o0.e2 e2Var) {
        if (p247y7.AbstractC7350t.b(this.f19757Q, e2Var)) {
            return;
        }
        this.f19743C |= 8192;
        this.f19757Q = e2Var;
    }

    @Override // androidx.compose.ui.graphics.c
    public void m(float f6) {
        if (this.f19755O == f6) {
            return;
        }
        this.f19743C |= 2048;
        this.f19755O = f6;
    }

    @Override // androidx.compose.ui.graphics.c
    public void n(float f6) {
        if (this.f19752L == f6) {
            return;
        }
        this.f19743C |= 256;
        this.f19752L = f6;
    }

    @Override // androidx.compose.ui.graphics.c
    public float o() {
        return this.f19744D;
    }

    @Override // Y0.e
    public /* synthetic */ float o0(int i6) {
        return Y0.d.d(this, i6);
    }

    @Override // androidx.compose.ui.graphics.c
    public void p(float f6) {
        if (this.f19749I == f6) {
            return;
        }
        this.f19743C |= 32;
        this.f19749I = f6;
    }

    @Override // androidx.compose.ui.graphics.c
    public void q(int i6) {
        if (androidx.compose.ui.graphics.a.e(this.f19759S, i6)) {
            return;
        }
        this.f19743C |= 32768;
        this.f19759S = i6;
    }

    @Override // Y0.e
    public /* synthetic */ float q0(float f6) {
        return Y0.d.c(this, f6);
    }

    @Override // androidx.compose.ui.graphics.c
    public float r() {
        return this.f19753M;
    }

    public boolean s() {
        return this.f19758R;
    }

    public int t() {
        return this.f19759S;
    }

    @Override // androidx.compose.ui.graphics.c
    public float u() {
        return this.f19754N;
    }

    @Override // androidx.compose.ui.graphics.c
    public float v() {
        return this.f19748H;
    }

    @Override // Y0.n
    public float v0() {
        return this.f19761U.v0();
    }

    @Override // androidx.compose.ui.graphics.c
    public void w(long j6) {
        if (p141o0.C7016y0.o(this.f19750J, j6)) {
            return;
        }
        this.f19743C |= 64;
        this.f19750J = j6;
    }

    @Override // androidx.compose.ui.graphics.c
    public float x() {
        return this.f19755O;
    }

    public final Y0.e y() {
        return this.f19761U;
    }

    @Override // androidx.compose.ui.graphics.c
    public float z() {
        return this.f19747G;
    }
}
