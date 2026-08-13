package H;

/* JADX INFO: loaded from: classes.dex */
final class d0 implements D0.A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H.Q f3885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S0.e0 f3887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.a f3888e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.M f3889D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ H.d0 f3890E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ D0.X f3891F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f3892G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.M m6, H.d0 d0Var, D0.X x6, int i6) {
            super(1);
            this.f3889D = m6;
            this.f3890E = d0Var;
            this.f3891F = x6;
            this.f3892G = i6;
        }

        public final void a(D0.X.a aVar) {
            D0.M m6 = this.f3889D;
            int iG = this.f3890E.g();
            S0.e0 e0VarM = this.f3890E.m();
            H.V v6 = (H.V) this.f3890E.l().b();
            this.f3890E.j().j(p230x.s.Vertical, H.P.b(m6, iG, e0VarM, v6 != null ? v6.f() : null, false, this.f3891F.I0()), this.f3892G, this.f3891F.w0());
            D0.X.a.l(aVar, this.f3891F, 0, java.lang.Math.round(-this.f3890E.j().d()), 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public d0(H.Q q6, int i6, S0.e0 e0Var, p237x7.a aVar) {
        this.f3885b = q6;
        this.f3886c = i6;
        this.f3887d = e0Var;
        this.f3888e = aVar;
    }

    @Override // D0.A
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return D0.AbstractC0906z.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // D0.A
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return D0.AbstractC0906z.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
        return p071h0.f.a(this, dVar);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ java.lang.Object c(java.lang.Object obj, p237x7.p pVar) {
        return p071h0.g.b(this, obj, pVar);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ boolean d(p237x7.l lVar) {
        return p071h0.g.a(this, lVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H.d0)) {
            return false;
        }
        H.d0 d0Var = (H.d0) obj;
        return p247y7.AbstractC7350t.b(this.f3885b, d0Var.f3885b) && this.f3886c == d0Var.f3886c && p247y7.AbstractC7350t.b(this.f3887d, d0Var.f3887d) && p247y7.AbstractC7350t.b(this.f3888e, d0Var.f3888e);
    }

    @Override // D0.A
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        D0.X xU = g6.U(Y0.C1859b.d(j6, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int iMin = java.lang.Math.min(xU.w0(), Y0.C1859b.k(j6));
        return D0.L.b(m6, xU.I0(), iMin, null, new H.d0.a(m6, this, xU, iMin), 4, null);
    }

    public final int g() {
        return this.f3886c;
    }

    public int hashCode() {
        return (((((this.f3885b.hashCode() * 31) + this.f3886c) * 31) + this.f3887d.hashCode()) * 31) + this.f3888e.hashCode();
    }

    public final H.Q j() {
        return this.f3885b;
    }

    @Override // D0.A
    public /* synthetic */ int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return D0.AbstractC0906z.a(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final p237x7.a l() {
        return this.f3888e;
    }

    public final S0.e0 m() {
        return this.f3887d;
    }

    @Override // D0.A
    public /* synthetic */ int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return D0.AbstractC0906z.c(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public java.lang.String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f3885b + ", cursorOffset=" + this.f3886c + ", transformedText=" + this.f3887d + ", textLayoutResultProvider=" + this.f3888e + ')';
    }
}
