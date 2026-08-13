package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes.dex */
final class e extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f19764P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f19765Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f19766R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f19767S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f19768T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f19769U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private float f19770V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f19771W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private float f19772X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private float f19773Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private long f19774Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private p141o0.e2 f19775a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f19776b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private long f19777c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f19778d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f19779e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private p237x7.l f19780f0;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.h(androidx.compose.ui.graphics.e.this.o());
            cVar.g(androidx.compose.ui.graphics.e.this.E());
            cVar.b(androidx.compose.ui.graphics.e.this.U1());
            cVar.j(androidx.compose.ui.graphics.e.this.z());
            cVar.e(androidx.compose.ui.graphics.e.this.v());
            cVar.p(androidx.compose.ui.graphics.e.this.Z1());
            cVar.n(androidx.compose.ui.graphics.e.this.B());
            cVar.c(androidx.compose.ui.graphics.e.this.r());
            cVar.d(androidx.compose.ui.graphics.e.this.u());
            cVar.m(androidx.compose.ui.graphics.e.this.x());
            cVar.T0(androidx.compose.ui.graphics.e.this.N0());
            cVar.l0(androidx.compose.ui.graphics.e.this.a2());
            cVar.A(androidx.compose.ui.graphics.e.this.W1());
            androidx.compose.ui.graphics.e.this.Y1();
            cVar.l(null);
            cVar.w(androidx.compose.ui.graphics.e.this.V1());
            cVar.D(androidx.compose.ui.graphics.e.this.b2());
            cVar.q(androidx.compose.ui.graphics.e.this.X1());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f19782D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e f19783E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(D0.X x6, androidx.compose.ui.graphics.e eVar) {
            super(1);
            this.f19782D = x6;
            this.f19783E = eVar;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.v(aVar, this.f19782D, 0, 0, 0.0f, this.f19783E.f19780f0, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    private e(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j6, p141o0.e2 e2Var, boolean z6, p141o0.Z1 z10, long j10, long j11, int i6) {
        this.f19764P = f6;
        this.f19765Q = f10;
        this.f19766R = f11;
        this.f19767S = f12;
        this.f19768T = f13;
        this.f19769U = f14;
        this.f19770V = f15;
        this.f19771W = f16;
        this.f19772X = f17;
        this.f19773Y = f18;
        this.f19774Z = j6;
        this.f19775a0 = e2Var;
        this.f19776b0 = z6;
        this.f19777c0 = j10;
        this.f19778d0 = j11;
        this.f19779e0 = i6;
        this.f19780f0 = new androidx.compose.ui.graphics.e.a();
    }

    public /* synthetic */ e(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j6, p141o0.e2 e2Var, boolean z6, p141o0.Z1 z10, long j10, long j11, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10, f11, f12, f13, f14, f15, f16, f17, f18, j6, e2Var, z6, z10, j10, j11, i6);
    }

    public final void A(boolean z6) {
        this.f19776b0 = z6;
    }

    public final float B() {
        return this.f19770V;
    }

    @Override // F0.E
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final void D(long j6) {
        this.f19778d0 = j6;
    }

    public final float E() {
        return this.f19765Q;
    }

    @Override // F0.E
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final long N0() {
        return this.f19774Z;
    }

    public final void T0(long j6) {
        this.f19774Z = j6;
    }

    public final float U1() {
        return this.f19766R;
    }

    public final long V1() {
        return this.f19777c0;
    }

    public final boolean W1() {
        return this.f19776b0;
    }

    public final int X1() {
        return this.f19779e0;
    }

    public final p141o0.Z1 Y1() {
        return null;
    }

    public final float Z1() {
        return this.f19769U;
    }

    public final p141o0.e2 a2() {
        return this.f19775a0;
    }

    public final void b(float f6) {
        this.f19766R = f6;
    }

    public final long b2() {
        return this.f19778d0;
    }

    public final void c(float f6) {
        this.f19771W = f6;
    }

    public final void c2() {
        F0.AbstractC0914d0 abstractC0914d0O2 = F0.AbstractC0925k.h(this, F0.AbstractC0918f0.a(2)).o2();
        if (abstractC0914d0O2 != null) {
            abstractC0914d0O2.c3(this.f19780f0, true);
        }
    }

    public final void d(float f6) {
        this.f19772X = f6;
    }

    public final void e(float f6) {
        this.f19768T = f6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        D0.X xU = g6.U(j6);
        return D0.L.b(m6, xU.I0(), xU.w0(), null, new androidx.compose.ui.graphics.e.b(xU, this), 4, null);
    }

    public final void g(float f6) {
        this.f19765Q = f6;
    }

    public final void h(float f6) {
        this.f19764P = f6;
    }

    public final void j(float f6) {
        this.f19767S = f6;
    }

    @Override // F0.E
    public /* synthetic */ int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.a(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final void l(p141o0.Z1 z6) {
    }

    public final void l0(p141o0.e2 e2Var) {
        this.f19775a0 = e2Var;
    }

    public final void m(float f6) {
        this.f19773Y = f6;
    }

    public final void n(float f6) {
        this.f19770V = f6;
    }

    public final float o() {
        return this.f19764P;
    }

    public final void p(float f6) {
        this.f19769U = f6;
    }

    public final void q(int i6) {
        this.f19779e0 = i6;
    }

    public final float r() {
        return this.f19771W;
    }

    @Override // F0.E
    public /* synthetic */ int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.c(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public java.lang.String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f19764P + ", scaleY=" + this.f19765Q + ", alpha = " + this.f19766R + ", translationX=" + this.f19767S + ", translationY=" + this.f19768T + ", shadowElevation=" + this.f19769U + ", rotationX=" + this.f19770V + ", rotationY=" + this.f19771W + ", rotationZ=" + this.f19772X + ", cameraDistance=" + this.f19773Y + ", transformOrigin=" + ((java.lang.Object) androidx.compose.ui.graphics.f.i(this.f19774Z)) + ", shape=" + this.f19775a0 + ", clip=" + this.f19776b0 + ", renderEffect=" + ((java.lang.Object) null) + ", ambientShadowColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f19777c0)) + ", spotShadowColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f19778d0)) + ", compositingStrategy=" + ((java.lang.Object) androidx.compose.ui.graphics.a.g(this.f19779e0)) + ')';
    }

    public final float u() {
        return this.f19772X;
    }

    public final float v() {
        return this.f19768T;
    }

    public final void w(long j6) {
        this.f19777c0 = j6;
    }

    public final float x() {
        return this.f19773Y;
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return false;
    }

    public final float z() {
        return this.f19767S;
    }
}
