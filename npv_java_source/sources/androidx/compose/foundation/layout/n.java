package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class n extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f19282P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f19283Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f19284R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f19285S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f19286T;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ D0.X f19288E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ D0.M f19289F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X x6, D0.M m6) {
            super(1);
            this.f19288E = x6;
            this.f19289F = m6;
        }

        public final void a(D0.X.a aVar) {
            if (androidx.compose.foundation.layout.n.this.T1()) {
                D0.X.a.l(aVar, this.f19288E, this.f19289F.S0(androidx.compose.foundation.layout.n.this.U1()), this.f19289F.S0(androidx.compose.foundation.layout.n.this.V1()), 0.0f, 4, null);
            } else {
                D0.X.a.h(aVar, this.f19288E, this.f19289F.S0(androidx.compose.foundation.layout.n.this.U1()), this.f19289F.S0(androidx.compose.foundation.layout.n.this.V1()), 0.0f, 4, null);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    private n(float f6, float f10, float f11, float f12, boolean z6) {
        this.f19282P = f6;
        this.f19283Q = f10;
        this.f19284R = f11;
        this.f19285S = f12;
        this.f19286T = z6;
    }

    public /* synthetic */ n(float f6, float f10, float f11, float f12, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10, f11, f12, z6);
    }

    @Override // F0.E
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final boolean T1() {
        return this.f19286T;
    }

    public final float U1() {
        return this.f19282P;
    }

    public final float V1() {
        return this.f19283Q;
    }

    public final void W1(float f6) {
        this.f19285S = f6;
    }

    public final void X1(float f6) {
        this.f19284R = f6;
    }

    public final void Y1(boolean z6) {
        this.f19286T = z6;
    }

    public final void Z1(float f6) {
        this.f19282P = f6;
    }

    public final void a2(float f6) {
        this.f19283Q = f6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        int iS0 = m6.S0(this.f19282P) + m6.S0(this.f19284R);
        int iS1 = m6.S0(this.f19283Q) + m6.S0(this.f19285S);
        D0.X xU = g6.U(Y0.c.n(j6, -iS0, -iS1));
        return D0.L.b(m6, Y0.c.i(j6, xU.I0() + iS0), Y0.c.h(j6, xU.w0() + iS1), null, new androidx.compose.foundation.layout.n.a(xU, m6), 4, null);
    }

    @Override // F0.E
    public /* synthetic */ int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.a(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.c(this, interfaceC0896o, interfaceC0895n, i6);
    }
}
