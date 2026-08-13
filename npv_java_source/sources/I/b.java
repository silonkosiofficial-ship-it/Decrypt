package I;

/* JADX INFO: loaded from: classes.dex */
public final class b extends I.a implements F0.E {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f4930D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f4931E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f4932F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X x6, int i6, int i10) {
            super(1);
            this.f4930D = x6;
            this.f4931E = i6;
            this.f4932F = i10;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.h(aVar, this.f4930D, -this.f4931E, -this.f4932F, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public b(p237x7.a aVar) {
        super(aVar);
    }

    @Override // F0.E
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.v0
    public boolean Y0() {
        return true;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        int iS0 = m6.S0(androidx.compose.foundation.text.handwriting.a.b());
        int iS1 = m6.S0(androidx.compose.foundation.text.handwriting.a.a());
        int i6 = iS1 * 2;
        int i10 = iS0 * 2;
        D0.X xU = g6.U(Y0.c.n(j6, i6, i10));
        return D0.L.b(m6, xU.I0() - i6, xU.w0() - i10, null, new I.b.a(xU, iS1, iS0), 4, null);
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
