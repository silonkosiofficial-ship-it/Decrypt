package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class g extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private A.EnumC0781o f19261P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f19262Q;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f19263D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X x6) {
            super(1);
            this.f19263D = x6;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.l(aVar, this.f19263D, 0, 0, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public g(A.EnumC0781o enumC0781o, float f6) {
        this.f19261P = enumC0781o;
        this.f19262Q = f6;
    }

    @Override // F0.E
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final void T1(A.EnumC0781o enumC0781o) {
        this.f19261P = enumC0781o;
    }

    public final void U1(float f6) {
        this.f19262Q = f6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        int iN;
        int iL;
        int iK;
        int iK2;
        if (!Y0.C1859b.h(j6) || this.f19261P == A.EnumC0781o.Vertical) {
            iN = Y0.C1859b.n(j6);
            iL = Y0.C1859b.l(j6);
        } else {
            iN = E7.j.k(java.lang.Math.round(Y0.C1859b.l(j6) * this.f19262Q), Y0.C1859b.n(j6), Y0.C1859b.l(j6));
            iL = iN;
        }
        if (!Y0.C1859b.g(j6) || this.f19261P == A.EnumC0781o.Horizontal) {
            int iM = Y0.C1859b.m(j6);
            iK = Y0.C1859b.k(j6);
            iK2 = iM;
        } else {
            iK2 = E7.j.k(java.lang.Math.round(Y0.C1859b.k(j6) * this.f19262Q), Y0.C1859b.m(j6), Y0.C1859b.k(j6));
            iK = iK2;
        }
        D0.X xU = g6.U(Y0.c.a(iN, iL, iK2, iK));
        return D0.L.b(m6, xU.I0(), xU.w0(), null, new androidx.compose.foundation.layout.g.a(xU), 4, null);
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
