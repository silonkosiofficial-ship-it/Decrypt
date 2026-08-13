package androidx.compose.ui;

/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f19633P;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f19634D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f19635E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X x6, androidx.compose.ui.e eVar) {
            super(1);
            this.f19634D = x6;
            this.f19635E = eVar;
        }

        public final void a(D0.X.a aVar) {
            aVar.g(this.f19634D, 0, 0, this.f19635E.T1());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public e(float f6) {
        this.f19633P = f6;
    }

    @Override // F0.E
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final float T1() {
        return this.f19633P;
    }

    public final void U1(float f6) {
        this.f19633P = f6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        D0.X xU = g6.U(j6);
        return D0.L.b(m6, xU.I0(), xU.w0(), null, new androidx.compose.ui.e.a(xU, this), 4, null);
    }

    @Override // F0.E
    public /* synthetic */ int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.a(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.c(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public java.lang.String toString() {
        return "ZIndexModifier(zIndex=" + this.f19633P + ')';
    }
}
