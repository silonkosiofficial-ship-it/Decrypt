package W;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final W.b.a f15236m = new W.b.a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f15237n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.C1737o f15238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private W.a f15239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15240c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15244g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f15249l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V.X f15241d = new V.X();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15242e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private V.F1 f15245h = new V.F1();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f15246i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f15247j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f15248k = -1;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public b(V.C1737o c1737o, W.a aVar) {
        this.f15238a = c1737o;
        this.f15239b = aVar;
    }

    private final void A() {
        B();
    }

    private final void B() {
        int i6 = this.f15244g;
        if (i6 > 0) {
            this.f15239b.G(i6);
            this.f15244g = 0;
        }
        if (this.f15245h.d()) {
            this.f15239b.k(this.f15245h.i());
            this.f15245h.a();
        }
    }

    private final void C() {
        I(this, false, 1, null);
        K();
    }

    private final void D(boolean z6) {
        H(z6);
    }

    static /* synthetic */ void E(W.b bVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        bVar.D(z6);
    }

    private final void F(int i6, int i10, int i11) {
        A();
        this.f15239b.u(i6, i10, i11);
    }

    private final void G() {
        int i6 = this.f15249l;
        if (i6 > 0) {
            int i10 = this.f15246i;
            if (i10 >= 0) {
                J(i10, i6);
                this.f15246i = -1;
            } else {
                F(this.f15248k, this.f15247j, i6);
                this.f15247j = -1;
                this.f15248k = -1;
            }
            this.f15249l = 0;
        }
    }

    private final void H(boolean z6) {
        int iU = z6 ? q().u() : q().k();
        int i6 = iU - this.f15243f;
        if (!(i6 >= 0)) {
            V.AbstractC1741q.r("Tried to seek backward");
        }
        if (i6 > 0) {
            this.f15239b.e(i6);
            this.f15243f = iU;
        }
    }

    static /* synthetic */ void I(W.b bVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        bVar.H(z6);
    }

    private final void J(int i6, int i10) {
        A();
        this.f15239b.x(i6, i10);
    }

    private final void k(V.C1704d c1704d) {
        E(this, false, 1, null);
        this.f15239b.o(c1704d);
        this.f15240c = true;
    }

    private final void l() {
        if (this.f15240c || !this.f15242e) {
            return;
        }
        E(this, false, 1, null);
        this.f15239b.p();
        this.f15240c = true;
    }

    private final V.C1715g1 q() {
        return this.f15238a.G0();
    }

    public final void K() {
        V.C1715g1 c1715g1Q;
        int iU;
        if (q().x() <= 0 || this.f15241d.h(-2) == (iU = (c1715g1Q = q()).u())) {
            return;
        }
        l();
        if (iU > 0) {
            V.C1704d c1704dA = c1715g1Q.a(iU);
            this.f15241d.j(iU);
            k(c1704dA);
        }
    }

    public final void L() {
        B();
        if (this.f15240c) {
            U();
            j();
        }
    }

    public final void M(V.Z0 z6) {
        this.f15239b.v(z6);
    }

    public final void N() {
        C();
        this.f15239b.w();
        this.f15243f += q().p();
    }

    public final void O(int i6, int i10) {
        if (i10 > 0) {
            if (!(i6 >= 0)) {
                V.AbstractC1741q.r("Invalid remove index " + i6);
            }
            if (this.f15246i == i6) {
                this.f15249l += i10;
                return;
            }
            G();
            this.f15246i = i6;
            this.f15249l = i10;
        }
    }

    public final void P() {
        this.f15239b.y();
    }

    public final void Q() {
        this.f15240c = false;
        this.f15241d.a();
        this.f15243f = 0;
    }

    public final void R(W.a aVar) {
        this.f15239b = aVar;
    }

    public final void S(boolean z6) {
        this.f15242e = z6;
    }

    public final void T(p237x7.a aVar) {
        this.f15239b.z(aVar);
    }

    public final void U() {
        this.f15239b.A();
    }

    public final void V(int i6) {
        if (i6 > 0) {
            C();
            this.f15239b.B(i6);
        }
    }

    public final void W(java.lang.Object obj, V.C1704d c1704d, int i6) {
        this.f15239b.C(obj, c1704d, i6);
    }

    public final void X(java.lang.Object obj) {
        E(this, false, 1, null);
        this.f15239b.D(obj);
    }

    public final void Y(java.lang.Object obj, p237x7.p pVar) {
        A();
        this.f15239b.E(obj, pVar);
    }

    public final void Z(java.lang.Object obj, int i6) {
        D(true);
        this.f15239b.F(obj, i6);
    }

    public final void a(V.C1704d c1704d, java.lang.Object obj) {
        this.f15239b.f(c1704d, obj);
    }

    public final void a0(java.lang.Object obj) {
        A();
        this.f15239b.H(obj);
    }

    public final void b(java.util.List list, p031d0.d dVar) {
        this.f15239b.g(list, dVar);
    }

    public final void c(V.AbstractC1735n0 abstractC1735n0, V.AbstractC1744s abstractC1744s, V.C1738o0 c1738o0, V.C1738o0 c1738o1) {
        this.f15239b.h(abstractC1735n0, abstractC1744s, c1738o0, c1738o1);
    }

    public final void d() {
        E(this, false, 1, null);
        this.f15239b.i();
    }

    public final void e(p031d0.d dVar, V.C1704d c1704d) {
        B();
        this.f15239b.j(dVar, c1704d);
    }

    public final void f(p237x7.l lVar, V.r rVar) {
        this.f15239b.l(lVar, rVar);
    }

    public final void g() {
        int iU = q().u();
        if (!(this.f15241d.h(-1) <= iU)) {
            V.AbstractC1741q.r("Missed recording an endGroup");
        }
        if (this.f15241d.h(-1) == iU) {
            E(this, false, 1, null);
            this.f15241d.i();
            this.f15239b.m();
        }
    }

    public final void h() {
        this.f15239b.n();
        this.f15243f = 0;
    }

    public final void i() {
        G();
    }

    public final void j() {
        if (this.f15240c) {
            E(this, false, 1, null);
            E(this, false, 1, null);
            this.f15239b.m();
            this.f15240c = false;
        }
    }

    public final void m() {
        B();
        if (this.f15241d.d()) {
            return;
        }
        V.AbstractC1741q.r("Missed recording an endGroup()");
    }

    public final W.a n() {
        return this.f15239b;
    }

    public final boolean o() {
        return this.f15242e;
    }

    public final boolean p() {
        return q().u() - this.f15243f < 0;
    }

    public final void r(W.a aVar, p031d0.d dVar) {
        this.f15239b.q(aVar, dVar);
    }

    public final void s(V.C1704d c1704d, V.C1718h1 c1718h1) {
        B();
        C();
        G();
        this.f15239b.r(c1704d, c1718h1);
    }

    public final void t(V.C1704d c1704d, V.C1718h1 c1718h1, W.c cVar) {
        B();
        C();
        G();
        this.f15239b.s(c1704d, c1718h1, cVar);
    }

    public final void u(int i6) {
        C();
        this.f15239b.t(i6);
    }

    public final void v(java.lang.Object obj) {
        G();
        this.f15245h.h(obj);
    }

    public final void w(int i6, int i10, int i11) {
        if (i11 > 0) {
            int i12 = this.f15249l;
            if (i12 > 0 && this.f15247j == i6 - i12 && this.f15248k == i10 - i12) {
                this.f15249l = i12 + i11;
                return;
            }
            G();
            this.f15247j = i6;
            this.f15248k = i10;
            this.f15249l = i11;
        }
    }

    public final void x(int i6) {
        this.f15243f += i6 - q().k();
    }

    public final void y(int i6) {
        this.f15243f = i6;
    }

    public final void z() {
        G();
        if (this.f15245h.d()) {
            this.f15245h.g();
        } else {
            this.f15244g++;
        }
    }
}
