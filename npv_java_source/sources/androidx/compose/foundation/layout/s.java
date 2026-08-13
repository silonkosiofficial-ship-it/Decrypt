package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class s extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private A.EnumC0781o f19334P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f19335Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p237x7.p f19336R;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f19338E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ D0.X f19339F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f19340G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ D0.M f19341H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i6, D0.X x6, int i10, D0.M m6) {
            super(1);
            this.f19338E = i6;
            this.f19339F = x6;
            this.f19340G = i10;
            this.f19341H = m6;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.j(aVar, this.f19339F, ((Y0.p) androidx.compose.foundation.layout.s.this.T1().u(Y0.t.b(Y0.u.a(this.f19338E - this.f19339F.I0(), this.f19340G - this.f19339F.w0())), this.f19341H.getLayoutDirection())).n(), 0.0f, 2, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public s(A.EnumC0781o enumC0781o, boolean z6, p237x7.p pVar) {
        this.f19334P = enumC0781o;
        this.f19335Q = z6;
        this.f19336R = pVar;
    }

    @Override // F0.E
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final p237x7.p T1() {
        return this.f19336R;
    }

    public final void U1(p237x7.p pVar) {
        this.f19336R = pVar;
    }

    public final void V1(A.EnumC0781o enumC0781o) {
        this.f19334P = enumC0781o;
    }

    public final void W1(boolean z6) {
        this.f19335Q = z6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        A.EnumC0781o enumC0781o = this.f19334P;
        A.EnumC0781o enumC0781o2 = A.EnumC0781o.Vertical;
        int iN = enumC0781o != enumC0781o2 ? 0 : Y0.C1859b.n(j6);
        A.EnumC0781o enumC0781o3 = this.f19334P;
        A.EnumC0781o enumC0781o4 = A.EnumC0781o.Horizontal;
        D0.X xU = g6.U(Y0.c.a(iN, (this.f19334P == enumC0781o2 || !this.f19335Q) ? Y0.C1859b.l(j6) : Integer.MAX_VALUE, enumC0781o3 == enumC0781o4 ? Y0.C1859b.m(j6) : 0, (this.f19334P == enumC0781o4 || !this.f19335Q) ? Y0.C1859b.k(j6) : Integer.MAX_VALUE));
        int iK = E7.j.k(xU.I0(), Y0.C1859b.n(j6), Y0.C1859b.l(j6));
        int iK2 = E7.j.k(xU.w0(), Y0.C1859b.m(j6), Y0.C1859b.k(j6));
        return D0.L.b(m6, iK, iK2, null, new androidx.compose.foundation.layout.s.a(iK, xU, iK2, m6), 4, null);
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
