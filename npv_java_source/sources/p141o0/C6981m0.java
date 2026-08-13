package p141o0;

/* JADX INFO: renamed from: o0.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6981m0 extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p237x7.l f52244P;

    /* JADX INFO: renamed from: o0.m0$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f52245D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p141o0.C6981m0 f52246E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X x6, p141o0.C6981m0 c6981m0) {
            super(1);
            this.f52245D = x6;
            this.f52246E = c6981m0;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.v(aVar, this.f52245D, 0, 0, 0.0f, this.f52246E.T1(), 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public C6981m0(p237x7.l lVar) {
        this.f52244P = lVar;
    }

    @Override // F0.E
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final p237x7.l T1() {
        return this.f52244P;
    }

    public final void U1() {
        F0.AbstractC0914d0 abstractC0914d0O2 = F0.AbstractC0925k.h(this, F0.AbstractC0918f0.a(2)).o2();
        if (abstractC0914d0O2 != null) {
            abstractC0914d0O2.c3(this.f52244P, true);
        }
    }

    public final void V1(p237x7.l lVar) {
        this.f52244P = lVar;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        D0.X xU = g6.U(j6);
        return D0.L.b(m6, xU.I0(), xU.w0(), null, new p141o0.C6981m0.a(xU, this), 4, null);
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
        return "BlockGraphicsLayerModifier(block=" + this.f52244P + ')';
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return false;
    }
}
