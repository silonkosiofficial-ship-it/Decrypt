package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class o extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private A.B f19290P;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f19291D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ D0.M f19292E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.o f19293F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X x6, D0.M m6, androidx.compose.foundation.layout.o oVar) {
            super(1);
            this.f19291D = x6;
            this.f19292E = m6;
            this.f19293F = oVar;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.h(aVar, this.f19291D, this.f19292E.S0(this.f19293F.T1().a(this.f19292E.getLayoutDirection())), this.f19292E.S0(this.f19293F.T1().d()), 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public o(A.B b6) {
        this.f19290P = b6;
    }

    @Override // F0.E
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final A.B T1() {
        return this.f19290P;
    }

    public final void U1(A.B b6) {
        this.f19290P = b6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        float f6 = 0;
        if (Y0.i.o(this.f19290P.a(m6.getLayoutDirection()), Y0.i.q(f6)) < 0 || Y0.i.o(this.f19290P.d(), Y0.i.q(f6)) < 0 || Y0.i.o(this.f19290P.b(m6.getLayoutDirection()), Y0.i.q(f6)) < 0 || Y0.i.o(this.f19290P.c(), Y0.i.q(f6)) < 0) {
            throw new java.lang.IllegalArgumentException("Padding must be non-negative".toString());
        }
        int iS0 = m6.S0(this.f19290P.a(m6.getLayoutDirection())) + m6.S0(this.f19290P.b(m6.getLayoutDirection()));
        int iS1 = m6.S0(this.f19290P.d()) + m6.S0(this.f19290P.c());
        D0.X xU = g6.U(Y0.c.n(j6, -iS0, -iS1));
        return D0.L.b(m6, Y0.c.i(j6, xU.I0() + iS0), Y0.c.h(j6, xU.w0() + iS1), null, new androidx.compose.foundation.layout.o.a(xU, m6, this), 4, null);
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
