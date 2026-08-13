package p210v;

/* JADX INFO: loaded from: classes.dex */
final class A extends androidx.compose.ui.d.c implements F0.InterfaceC0921h, F0.i0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private D0.V.a f55568P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f55569Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final boolean f55570R;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.O f55571D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p210v.A f55572E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p247y7.O o6, p210v.A a6) {
            super(0);
            this.f55571D = o6;
            this.f55572E = a6;
        }

        public final void a() {
            this.f55571D.f57254C = F0.AbstractC0923i.a(this.f55572E, D0.W.a());
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    private final D0.V T1() {
        p247y7.O o6 = new p247y7.O();
        F0.j0.a(this, new v.A.a(o6, this));
        return (D0.V) o6.f57254C;
    }

    @Override // androidx.compose.ui.d.c
    public void F1() {
        D0.V.a aVar = this.f55568P;
        if (aVar != null) {
            aVar.a();
        }
        this.f55568P = null;
    }

    @Override // F0.i0
    public void L0() {
        D0.V vT1 = T1();
        if (this.f55569Q) {
            D0.V.a aVar = this.f55568P;
            if (aVar != null) {
                aVar.a();
            }
            this.f55568P = vT1 != null ? vT1.b() : null;
        }
    }

    public final void U1(boolean z6) {
        D0.V.a aVarB = null;
        if (z6) {
            D0.V vT1 = T1();
            if (vT1 != null) {
                aVarB = vT1.b();
            }
        } else {
            D0.V.a aVar = this.f55568P;
            if (aVar != null) {
                aVar.a();
            }
        }
        this.f55568P = aVarB;
        this.f55569Q = z6;
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return this.f55570R;
    }
}
