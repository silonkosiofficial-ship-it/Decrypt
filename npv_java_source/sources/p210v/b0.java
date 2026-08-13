package p210v;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private androidx.compose.foundation.m f55670P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f55671Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f55672R;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f55674E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ D0.X f55675F;

        /* JADX INFO: renamed from: v.b0$a$a, reason: collision with other inner class name */
        static final class C0729a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ D0.X f55676D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f55677E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ int f55678F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0729a(D0.X x6, int i6, int i10) {
                super(1);
                this.f55676D = x6;
                this.f55677E = i6;
                this.f55678F = i10;
            }

            public final void a(D0.X.a aVar) {
                D0.X.a.p(aVar, this.f55676D, this.f55677E, this.f55678F, 0.0f, null, 12, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i6, D0.X x6) {
            super(1);
            this.f55674E = i6;
            this.f55675F = x6;
        }

        public final void a(D0.X.a aVar) {
            int iK = E7.j.k(p210v.b0.this.T1().l(), 0, this.f55674E);
            int i6 = p210v.b0.this.U1() ? iK - this.f55674E : -iK;
            aVar.A(new v.b0.a.C0729a(this.f55675F, p210v.b0.this.V1() ? 0 : i6, p210v.b0.this.V1() ? i6 : 0));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public b0(androidx.compose.foundation.m mVar, boolean z6, boolean z10) {
        this.f55670P = mVar;
        this.f55671Q = z6;
        this.f55672R = z10;
    }

    @Override // F0.E
    public int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return this.f55672R ? interfaceC0895n.S(Integer.MAX_VALUE) : interfaceC0895n.S(i6);
    }

    @Override // F0.E
    public int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return this.f55672R ? interfaceC0895n.T(Integer.MAX_VALUE) : interfaceC0895n.T(i6);
    }

    public final androidx.compose.foundation.m T1() {
        return this.f55670P;
    }

    public final boolean U1() {
        return this.f55671Q;
    }

    public final boolean V1() {
        return this.f55672R;
    }

    public final void W1(boolean z6) {
        this.f55671Q = z6;
    }

    public final void X1(androidx.compose.foundation.m mVar) {
        this.f55670P = mVar;
    }

    public final void Y1(boolean z6) {
        this.f55672R = z6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        p210v.AbstractC7216j.a(j6, this.f55672R ? p230x.s.Vertical : p230x.s.Horizontal);
        D0.X xU = g6.U(Y0.C1859b.d(j6, 0, this.f55672R ? Y0.C1859b.l(j6) : Integer.MAX_VALUE, 0, this.f55672R ? Integer.MAX_VALUE : Y0.C1859b.k(j6), 5, null));
        int iG = E7.j.g(xU.I0(), Y0.C1859b.l(j6));
        int iG2 = E7.j.g(xU.w0(), Y0.C1859b.k(j6));
        int iW0 = xU.w0() - iG2;
        int iI0 = xU.I0() - iG;
        if (!this.f55672R) {
            iW0 = iI0;
        }
        this.f55670P.m(iW0);
        this.f55670P.o(this.f55672R ? iG2 : iG);
        return D0.L.b(m6, iG, iG2, null, new v.b0.a(iW0, xU), 4, null);
    }

    @Override // F0.E
    public int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return this.f55672R ? interfaceC0895n.t(i6) : interfaceC0895n.t(Integer.MAX_VALUE);
    }

    @Override // F0.E
    public int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return this.f55672R ? interfaceC0895n.n0(i6) : interfaceC0895n.n0(Integer.MAX_VALUE);
    }
}
