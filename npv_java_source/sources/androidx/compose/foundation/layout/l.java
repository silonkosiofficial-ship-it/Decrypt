package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class l extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p237x7.l f19269P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f19270Q;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ D0.M f19272E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ D0.X f19273F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.M m6, D0.X x6) {
            super(1);
            this.f19272E = m6;
            this.f19273F = x6;
        }

        public final void a(D0.X.a aVar) {
            long jN = ((Y0.p) androidx.compose.foundation.layout.l.this.T1().l(this.f19272E)).n();
            if (androidx.compose.foundation.layout.l.this.U1()) {
                D0.X.a.p(aVar, this.f19273F, Y0.p.h(jN), Y0.p.i(jN), 0.0f, null, 12, null);
            } else {
                D0.X.a.v(aVar, this.f19273F, Y0.p.h(jN), Y0.p.i(jN), 0.0f, null, 12, null);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public l(p237x7.l lVar, boolean z6) {
        this.f19269P = lVar;
        this.f19270Q = z6;
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
        return this.f19269P;
    }

    public final boolean U1() {
        return this.f19270Q;
    }

    public final void V1(p237x7.l lVar) {
        this.f19269P = lVar;
    }

    public final void W1(boolean z6) {
        this.f19270Q = z6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        D0.X xU = g6.U(j6);
        return D0.L.b(m6, xU.I0(), xU.w0(), null, new androidx.compose.foundation.layout.l.a(m6, xU), 4, null);
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
