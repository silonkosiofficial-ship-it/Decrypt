package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class r extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f19331P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f19332Q;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f19333D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X x6) {
            super(1);
            this.f19333D = x6;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.l(aVar, this.f19333D, 0, 0, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    private r(float f6, float f10) {
        this.f19331P = f6;
        this.f19332Q = f10;
    }

    public /* synthetic */ r(float f6, float f10, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10);
    }

    @Override // F0.E
    public int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return E7.j.d(interfaceC0895n.S(i6), !Y0.i.s(this.f19331P, Y0.i.f16208D.c()) ? interfaceC0896o.S0(this.f19331P) : 0);
    }

    @Override // F0.E
    public int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return E7.j.d(interfaceC0895n.T(i6), !Y0.i.s(this.f19331P, Y0.i.f16208D.c()) ? interfaceC0896o.S0(this.f19331P) : 0);
    }

    public final void T1(float f6) {
        this.f19332Q = f6;
    }

    public final void U1(float f6) {
        this.f19331P = f6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        float f6 = this.f19331P;
        Y0.i.a aVar = Y0.i.f16208D;
        D0.X xU = g6.U(Y0.c.a((Y0.i.s(f6, aVar.c()) || Y0.C1859b.n(j6) != 0) ? Y0.C1859b.n(j6) : E7.j.d(E7.j.g(m6.S0(this.f19331P), Y0.C1859b.l(j6)), 0), Y0.C1859b.l(j6), (Y0.i.s(this.f19332Q, aVar.c()) || Y0.C1859b.m(j6) != 0) ? Y0.C1859b.m(j6) : E7.j.d(E7.j.g(m6.S0(this.f19332Q), Y0.C1859b.k(j6)), 0), Y0.C1859b.k(j6)));
        return D0.L.b(m6, xU.I0(), xU.w0(), null, new androidx.compose.foundation.layout.r.a(xU), 4, null);
    }

    @Override // F0.E
    public int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return E7.j.d(interfaceC0895n.t(i6), !Y0.i.s(this.f19332Q, Y0.i.f16208D.c()) ? interfaceC0896o.S0(this.f19332Q) : 0);
    }

    @Override // F0.E
    public int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return E7.j.d(interfaceC0895n.n0(i6), !Y0.i.s(this.f19332Q, Y0.i.f16208D.c()) ? interfaceC0896o.S0(this.f19332Q) : 0);
    }
}
