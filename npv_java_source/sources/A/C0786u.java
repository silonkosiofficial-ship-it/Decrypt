package A;

/* JADX INFO: renamed from: A.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0786u implements D0.A, E0.d, E0.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A.S f153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.InterfaceC1753w0 f154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V.InterfaceC1753w0 f155d;

    /* JADX INFO: renamed from: A.u$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f156D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f157E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f158F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X x6, int i6, int i10) {
            super(1);
            this.f156D = x6;
            this.f157E = i6;
            this.f158F = i10;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.h(aVar, this.f156D, this.f157E, this.f158F, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public C0786u(A.S s6) {
        this.f153b = s6;
        this.f154c = V.A1.d(s6, null, 2, null);
        this.f155d = V.A1.d(s6, null, 2, null);
    }

    private final A.S g() {
        return (A.S) this.f155d.getValue();
    }

    private final A.S j() {
        return (A.S) this.f154c.getValue();
    }

    private final void m(A.S s6) {
        this.f155d.setValue(s6);
    }

    private final void n(A.S s6) {
        this.f154c.setValue(s6);
    }

    @Override // D0.A
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return D0.AbstractC0906z.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // D0.A
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return D0.AbstractC0906z.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
        return p071h0.f.a(this, dVar);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ java.lang.Object c(java.lang.Object obj, p237x7.p pVar) {
        return p071h0.g.b(this, obj, pVar);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ boolean d(p237x7.l lVar) {
        return p071h0.g.a(this, lVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A.C0786u) {
            return p247y7.AbstractC7350t.b(((A.C0786u) obj).f153b, this.f153b);
        }
        return false;
    }

    @Override // D0.A
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        int iD = j().d(m6, m6.getLayoutDirection());
        int iC = j().c(m6);
        int iA = j().a(m6, m6.getLayoutDirection()) + iD;
        int iB = j().b(m6) + iC;
        D0.X xU = g6.U(Y0.c.n(j6, -iA, -iB));
        return D0.L.b(m6, Y0.c.i(j6, xU.I0() + iA), Y0.c.h(j6, xU.w0() + iB), null, new A.C0786u.a(xU, iD, iC), 4, null);
    }

    @Override // E0.k
    public E0.m getKey() {
        return A.V.a();
    }

    @Override // E0.d
    public void h(E0.l lVar) {
        A.S s6 = (A.S) lVar.D0(A.V.a());
        n(A.U.c(this.f153b, s6));
        m(A.U.e(s6, this.f153b));
    }

    public int hashCode() {
        return this.f153b.hashCode();
    }

    @Override // D0.A
    public /* synthetic */ int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return D0.AbstractC0906z.a(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // E0.k
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public A.S getValue() {
        return g();
    }

    @Override // D0.A
    public /* synthetic */ int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return D0.AbstractC0906z.c(this, interfaceC0896o, interfaceC0895n, i6);
    }
}
