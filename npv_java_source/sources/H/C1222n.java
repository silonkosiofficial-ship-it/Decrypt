package H;

/* JADX INFO: renamed from: H.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1222n implements D0.A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H.Q f4109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S0.e0 f4111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.a f4112e;

    /* JADX INFO: renamed from: H.n$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.M f4113D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ H.C1222n f4114E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ D0.X f4115F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f4116G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.M m6, H.C1222n c1222n, D0.X x6, int i6) {
            super(1);
            this.f4113D = m6;
            this.f4114E = c1222n;
            this.f4115F = x6;
            this.f4116G = i6;
        }

        public final void a(D0.X.a aVar) {
            D0.M m6 = this.f4113D;
            int iG = this.f4114E.g();
            S0.e0 e0VarM = this.f4114E.m();
            H.V v6 = (H.V) this.f4114E.l().b();
            this.f4114E.j().j(p230x.s.Horizontal, H.P.b(m6, iG, e0VarM, v6 != null ? v6.f() : null, this.f4113D.getLayoutDirection() == Y0.v.Rtl, this.f4115F.I0()), this.f4116G, this.f4115F.I0());
            D0.X.a.l(aVar, this.f4115F, java.lang.Math.round(-this.f4114E.j().d()), 0, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public C1222n(H.Q q6, int i6, S0.e0 e0Var, p237x7.a aVar) {
        this.f4109b = q6;
        this.f4110c = i6;
        this.f4111d = e0Var;
        this.f4112e = aVar;
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
        if (!(obj instanceof H.C1222n)) {
            return false;
        }
        H.C1222n c1222n = (H.C1222n) obj;
        return p247y7.AbstractC7350t.b(this.f4109b, c1222n.f4109b) && this.f4110c == c1222n.f4110c && p247y7.AbstractC7350t.b(this.f4111d, c1222n.f4111d) && p247y7.AbstractC7350t.b(this.f4112e, c1222n.f4112e);
    }

    @Override // D0.A
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        D0.X xU = g6.U(g6.T(Y0.C1859b.k(j6)) < Y0.C1859b.l(j6) ? j6 : Y0.C1859b.d(j6, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        int iMin = java.lang.Math.min(xU.I0(), Y0.C1859b.l(j6));
        return D0.L.b(m6, iMin, xU.w0(), null, new H.C1222n.a(m6, this, xU, iMin), 4, null);
    }

    public final int g() {
        return this.f4110c;
    }

    public int hashCode() {
        return (((((this.f4109b.hashCode() * 31) + this.f4110c) * 31) + this.f4111d.hashCode()) * 31) + this.f4112e.hashCode();
    }

    public final H.Q j() {
        return this.f4109b;
    }

    @Override // D0.A
    public /* synthetic */ int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return D0.AbstractC0906z.a(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final p237x7.a l() {
        return this.f4112e;
    }

    public final S0.e0 m() {
        return this.f4111d;
    }

    @Override // D0.A
    public /* synthetic */ int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return D0.AbstractC0906z.c(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public java.lang.String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f4109b + ", cursorOffset=" + this.f4110c + ", transformedText=" + this.f4111d + ", textLayoutResultProvider=" + this.f4112e + ')';
    }
}
