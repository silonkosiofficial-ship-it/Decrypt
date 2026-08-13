package p161q0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p161q0.g {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p161q0.a.C0685a f52911C = new p161q0.a.C0685a(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p161q0.d f52912D = new q0.a.b();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p141o0.N1 f52913E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p141o0.N1 f52914F;

    /* JADX INFO: renamed from: q0.a$a, reason: collision with other inner class name */
    public static final class C0685a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Y0.e f52915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Y0.v f52916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p141o0.InterfaceC6993q0 f52917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f52918d;

        private C0685a(Y0.e eVar, Y0.v vVar, p141o0.InterfaceC6993q0 interfaceC6993q0, long j6) {
            this.f52915a = eVar;
            this.f52916b = vVar;
            this.f52917c = interfaceC6993q0;
            this.f52918d = j6;
        }

        public /* synthetic */ C0685a(Y0.e eVar, Y0.v vVar, p141o0.InterfaceC6993q0 interfaceC6993q0, long j6, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this((i6 & 1) != 0 ? p161q0.e.a() : eVar, (i6 & 2) != 0 ? Y0.v.Ltr : vVar, (i6 & 4) != 0 ? new p161q0.k() : interfaceC6993q0, (i6 & 8) != 0 ? p131n0.m.f51333b.b() : j6, null);
        }

        public /* synthetic */ C0685a(Y0.e eVar, Y0.v vVar, p141o0.InterfaceC6993q0 interfaceC6993q0, long j6, p247y7.AbstractC7342k abstractC7342k) {
            this(eVar, vVar, interfaceC6993q0, j6);
        }

        public final Y0.e a() {
            return this.f52915a;
        }

        public final Y0.v b() {
            return this.f52916b;
        }

        public final p141o0.InterfaceC6993q0 c() {
            return this.f52917c;
        }

        public final long d() {
            return this.f52918d;
        }

        public final p141o0.InterfaceC6993q0 e() {
            return this.f52917c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p161q0.a.C0685a)) {
                return false;
            }
            p161q0.a.C0685a c0685a = (p161q0.a.C0685a) obj;
            return p247y7.AbstractC7350t.b(this.f52915a, c0685a.f52915a) && this.f52916b == c0685a.f52916b && p247y7.AbstractC7350t.b(this.f52917c, c0685a.f52917c) && p131n0.m.f(this.f52918d, c0685a.f52918d);
        }

        public final Y0.e f() {
            return this.f52915a;
        }

        public final Y0.v g() {
            return this.f52916b;
        }

        public final long h() {
            return this.f52918d;
        }

        public int hashCode() {
            return (((((this.f52915a.hashCode() * 31) + this.f52916b.hashCode()) * 31) + this.f52917c.hashCode()) * 31) + p131n0.m.j(this.f52918d);
        }

        public final void i(p141o0.InterfaceC6993q0 interfaceC6993q0) {
            this.f52917c = interfaceC6993q0;
        }

        public final void j(Y0.e eVar) {
            this.f52915a = eVar;
        }

        public final void k(Y0.v vVar) {
            this.f52916b = vVar;
        }

        public final void l(long j6) {
            this.f52918d = j6;
        }

        public java.lang.String toString() {
            return "DrawParams(density=" + this.f52915a + ", layoutDirection=" + this.f52916b + ", canvas=" + this.f52917c + ", size=" + ((java.lang.Object) p131n0.m.l(this.f52918d)) + ')';
        }
    }

    public static final class b implements p161q0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p161q0.j f52919a = p161q0.b.b(this);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p171r0.C7053c f52920b;

        b() {
        }

        @Override // p161q0.d
        public void a(Y0.e eVar) {
            p161q0.a.this.H().j(eVar);
        }

        @Override // p161q0.d
        public void b(Y0.v vVar) {
            p161q0.a.this.H().k(vVar);
        }

        @Override // p161q0.d
        public p161q0.j c() {
            return this.f52919a;
        }

        @Override // p161q0.d
        public void d(long j6) {
            p161q0.a.this.H().l(j6);
        }

        @Override // p161q0.d
        public void e(p171r0.C7053c c7053c) {
            this.f52920b = c7053c;
        }

        @Override // p161q0.d
        public p171r0.C7053c f() {
            return this.f52920b;
        }

        @Override // p161q0.d
        public void g(p141o0.InterfaceC6993q0 interfaceC6993q0) {
            p161q0.a.this.H().i(interfaceC6993q0);
        }

        @Override // p161q0.d
        public Y0.e getDensity() {
            return p161q0.a.this.H().f();
        }

        @Override // p161q0.d
        public Y0.v getLayoutDirection() {
            return p161q0.a.this.H().g();
        }

        @Override // p161q0.d
        public p141o0.InterfaceC6993q0 h() {
            return p161q0.a.this.H().e();
        }

        @Override // p161q0.d
        public long i() {
            return p161q0.a.this.H().h();
        }
    }

    static /* synthetic */ p141o0.N1 C(p161q0.a aVar, long j6, float f6, float f10, int i6, int i10, p141o0.R1 r6, float f11, p141o0.AbstractC7019z0 abstractC7019z0, int i11, int i12, int i13, java.lang.Object obj) {
        return aVar.y(j6, f6, f10, i6, i10, r6, f11, abstractC7019z0, i11, (i13 & 512) != 0 ? p161q0.g.f52924B.b() : i12);
    }

    private final p141o0.N1 F(p141o0.AbstractC6984n0 abstractC6984n0, float f6, float f10, int i6, int i10, p141o0.R1 r6, float f11, p141o0.AbstractC7019z0 abstractC7019z0, int i11, int i12) {
        p141o0.N1 n1M = M();
        if (abstractC6984n0 != null) {
            abstractC6984n0.a(i(), n1M, f11);
        } else if (n1M.a() != f11) {
            n1M.b(f11);
        }
        if (!p247y7.AbstractC7350t.b(n1M.f(), abstractC7019z0)) {
            n1M.A(abstractC7019z0);
        }
        if (!p141o0.AbstractC6960f0.E(n1M.q(), i11)) {
            n1M.u(i11);
        }
        if (n1M.J() != f6) {
            n1M.I(f6);
        }
        if (n1M.v() != f10) {
            n1M.z(f10);
        }
        if (!p141o0.g2.e(n1M.D(), i6)) {
            n1M.s(i6);
        }
        if (!p141o0.h2.e(n1M.r(), i10)) {
            n1M.E(i10);
        }
        n1M.H();
        if (!p247y7.AbstractC7350t.b(null, r6)) {
            n1M.t(r6);
        }
        if (!p141o0.AbstractC7020z1.d(n1M.C(), i12)) {
            n1M.B(i12);
        }
        return n1M;
    }

    static /* synthetic */ p141o0.N1 G(p161q0.a aVar, p141o0.AbstractC6984n0 abstractC6984n0, float f6, float f10, int i6, int i10, p141o0.R1 r6, float f11, p141o0.AbstractC7019z0 abstractC7019z0, int i11, int i12, int i13, java.lang.Object obj) {
        return aVar.F(abstractC6984n0, f6, f10, i6, i10, r6, f11, abstractC7019z0, i11, (i13 & 512) != 0 ? p161q0.g.f52924B.b() : i12);
    }

    private final long J(long j6, float f6) {
        return f6 == 1.0f ? j6 : p141o0.C7016y0.m(j6, p141o0.C7016y0.p(j6) * f6, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final p141o0.N1 K() {
        p141o0.N1 n6 = this.f52913E;
        if (n6 != null) {
            return n6;
        }
        p141o0.N1 n1A = p141o0.U.a();
        n1A.F(p141o0.O1.f52148a.a());
        this.f52913E = n1A;
        return n1A;
    }

    private final p141o0.N1 M() {
        p141o0.N1 n6 = this.f52914F;
        if (n6 != null) {
            return n6;
        }
        p141o0.N1 n1A = p141o0.U.a();
        n1A.F(p141o0.O1.f52148a.b());
        this.f52914F = n1A;
        return n1A;
    }

    private final p141o0.N1 N(p161q0.h hVar) {
        if (p247y7.AbstractC7350t.b(hVar, p161q0.l.f52928a)) {
            return K();
        }
        if (!(hVar instanceof p161q0.m)) {
            throw new p087i7.s();
        }
        p141o0.N1 n1M = M();
        p161q0.m mVar = (p161q0.m) hVar;
        if (n1M.J() != mVar.f()) {
            n1M.I(mVar.f());
        }
        if (!p141o0.g2.e(n1M.D(), mVar.b())) {
            n1M.s(mVar.b());
        }
        if (n1M.v() != mVar.d()) {
            n1M.z(mVar.d());
        }
        if (!p141o0.h2.e(n1M.r(), mVar.c())) {
            n1M.E(mVar.c());
        }
        n1M.H();
        mVar.e();
        if (!p247y7.AbstractC7350t.b(null, null)) {
            mVar.e();
            n1M.t(null);
        }
        return n1M;
    }

    private final p141o0.N1 f(long j6, p161q0.h hVar, float f6, p141o0.AbstractC7019z0 abstractC7019z0, int i6, int i10) {
        p141o0.N1 n1N = N(hVar);
        long J10 = J(j6, f6);
        if (!p141o0.C7016y0.o(n1N.c(), J10)) {
            n1N.G(J10);
        }
        if (n1N.y() != null) {
            n1N.x(null);
        }
        if (!p247y7.AbstractC7350t.b(n1N.f(), abstractC7019z0)) {
            n1N.A(abstractC7019z0);
        }
        if (!p141o0.AbstractC6960f0.E(n1N.q(), i6)) {
            n1N.u(i6);
        }
        if (!p141o0.AbstractC7020z1.d(n1N.C(), i10)) {
            n1N.B(i10);
        }
        return n1N;
    }

    static /* synthetic */ p141o0.N1 k(p161q0.a aVar, long j6, p161q0.h hVar, float f6, p141o0.AbstractC7019z0 abstractC7019z0, int i6, int i10, int i11, java.lang.Object obj) {
        return aVar.f(j6, hVar, f6, abstractC7019z0, i6, (i11 & 32) != 0 ? p161q0.g.f52924B.b() : i10);
    }

    private final p141o0.N1 s(p141o0.AbstractC6984n0 abstractC6984n0, p161q0.h hVar, float f6, p141o0.AbstractC7019z0 abstractC7019z0, int i6, int i10) {
        p141o0.N1 n1N = N(hVar);
        if (abstractC6984n0 != null) {
            abstractC6984n0.a(i(), n1N, f6);
        } else {
            if (n1N.y() != null) {
                n1N.x(null);
            }
            long jC = n1N.c();
            p141o0.C7016y0.a aVar = p141o0.C7016y0.f52264b;
            if (!p141o0.C7016y0.o(jC, aVar.a())) {
                n1N.G(aVar.a());
            }
            if (n1N.a() != f6) {
                n1N.b(f6);
            }
        }
        if (!p247y7.AbstractC7350t.b(n1N.f(), abstractC7019z0)) {
            n1N.A(abstractC7019z0);
        }
        if (!p141o0.AbstractC6960f0.E(n1N.q(), i6)) {
            n1N.u(i6);
        }
        if (!p141o0.AbstractC7020z1.d(n1N.C(), i10)) {
            n1N.B(i10);
        }
        return n1N;
    }

    static /* synthetic */ p141o0.N1 t(p161q0.a aVar, p141o0.AbstractC6984n0 abstractC6984n0, p161q0.h hVar, float f6, p141o0.AbstractC7019z0 abstractC7019z0, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 32) != 0) {
            i10 = p161q0.g.f52924B.b();
        }
        return aVar.s(abstractC6984n0, hVar, f6, abstractC7019z0, i6, i10);
    }

    private final p141o0.N1 y(long j6, float f6, float f10, int i6, int i10, p141o0.R1 r6, float f11, p141o0.AbstractC7019z0 abstractC7019z0, int i11, int i12) {
        p141o0.N1 n1M = M();
        long J10 = J(j6, f11);
        if (!p141o0.C7016y0.o(n1M.c(), J10)) {
            n1M.G(J10);
        }
        if (n1M.y() != null) {
            n1M.x(null);
        }
        if (!p247y7.AbstractC7350t.b(n1M.f(), abstractC7019z0)) {
            n1M.A(abstractC7019z0);
        }
        if (!p141o0.AbstractC6960f0.E(n1M.q(), i11)) {
            n1M.u(i11);
        }
        if (n1M.J() != f6) {
            n1M.I(f6);
        }
        if (n1M.v() != f10) {
            n1M.z(f10);
        }
        if (!p141o0.g2.e(n1M.D(), i6)) {
            n1M.s(i6);
        }
        if (!p141o0.h2.e(n1M.r(), i10)) {
            n1M.E(i10);
        }
        n1M.H();
        if (!p247y7.AbstractC7350t.b(null, r6)) {
            n1M.t(r6);
        }
        if (!p141o0.AbstractC7020z1.d(n1M.C(), i12)) {
            n1M.B(i12);
        }
        return n1M;
    }

    @Override // Y0.e
    public /* synthetic */ float B0(float f6) {
        return Y0.d.g(this, f6);
    }

    @Override // p161q0.g
    public void C0(p141o0.AbstractC6984n0 abstractC6984n0, long j6, long j10, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f52911C.e().l(p131n0.g.m(j6), p131n0.g.n(j6), p131n0.g.m(j6) + p131n0.m.i(j10), p131n0.g.n(j6) + p131n0.m.g(j10), t(this, abstractC6984n0, hVar, f6, abstractC7019z0, i6, 0, 32, null));
    }

    @Override // p161q0.g
    public p161q0.d F0() {
        return this.f52912D;
    }

    public final p161q0.a.C0685a H() {
        return this.f52911C;
    }

    @Override // p161q0.g
    public void I(long j6, float f6, float f10, boolean z6, long j10, long j11, float f11, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f52911C.e().h(p131n0.g.m(j10), p131n0.g.n(j10), p131n0.g.m(j10) + p131n0.m.i(j11), p131n0.g.n(j10) + p131n0.m.g(j11), f6, f10, z6, k(this, j6, hVar, f11, abstractC7019z0, i6, 0, 32, null));
    }

    @Override // p161q0.g
    public void J0(p141o0.E1 e6, long j6, long j10, long j11, long j12, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6, int i10) {
        this.f52911C.e().j(e6, j6, j10, j11, j12, s(null, hVar, f6, abstractC7019z0, i6, i10));
    }

    @Override // Y0.e
    public /* synthetic */ int K0(long j6) {
        return Y0.d.a(this, j6);
    }

    @Override // Y0.n
    public /* synthetic */ long O(float f6) {
        return Y0.m.b(this, f6);
    }

    @Override // Y0.e
    public /* synthetic */ long P(long j6) {
        return Y0.d.e(this, j6);
    }

    @Override // p161q0.g
    public void Q0(p141o0.Q1 q6, long j6, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f52911C.e().t(q6, k(this, j6, hVar, f6, abstractC7019z0, i6, 0, 32, null));
    }

    @Override // Y0.e
    public /* synthetic */ int S0(float f6) {
        return Y0.d.b(this, f6);
    }

    @Override // p161q0.g
    public void U0(long j6, long j10, long j11, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f52911C.e().l(p131n0.g.m(j10), p131n0.g.n(j10), p131n0.g.m(j10) + p131n0.m.i(j11), p131n0.g.n(j10) + p131n0.m.g(j11), k(this, j6, hVar, f6, abstractC7019z0, i6, 0, 32, null));
    }

    @Override // p161q0.g
    public void V0(p141o0.E1 e6, long j6, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f52911C.e().q(e6, j6, t(this, null, hVar, f6, abstractC7019z0, i6, 0, 32, null));
    }

    @Override // p161q0.g
    public /* synthetic */ long W0() {
        return p161q0.f.a(this);
    }

    @Override // Y0.n
    public /* synthetic */ float X(long j6) {
        return Y0.m.a(this, j6);
    }

    @Override // p161q0.g
    public void Z0(long j6, float f6, long j10, float f10, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f52911C.e().f(j10, f6, k(this, j6, hVar, f10, abstractC7019z0, i6, 0, 32, null));
    }

    @Override // p161q0.g
    public void a0(long j6, long j10, long j11, long j12, p161q0.h hVar, float f6, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f52911C.e().p(p131n0.g.m(j10), p131n0.g.n(j10), p131n0.g.m(j10) + p131n0.m.i(j11), p131n0.g.n(j10) + p131n0.m.g(j11), p131n0.a.d(j12), p131n0.a.e(j12), k(this, j6, hVar, f6, abstractC7019z0, i6, 0, 32, null));
    }

    @Override // Y0.e
    public /* synthetic */ long b1(long j6) {
        return Y0.d.h(this, j6);
    }

    @Override // p161q0.g
    public void d1(p141o0.AbstractC6984n0 abstractC6984n0, long j6, long j10, long j11, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f52911C.e().p(p131n0.g.m(j6), p131n0.g.n(j6), p131n0.g.m(j6) + p131n0.m.i(j10), p131n0.g.n(j6) + p131n0.m.g(j10), p131n0.a.d(j11), p131n0.a.e(j11), t(this, abstractC6984n0, hVar, f6, abstractC7019z0, i6, 0, 32, null));
    }

    @Override // p161q0.g
    public void e0(p141o0.AbstractC6984n0 abstractC6984n0, long j6, long j10, float f6, int i6, p141o0.R1 r6, float f10, p141o0.AbstractC7019z0 abstractC7019z0, int i10) {
        this.f52911C.e().r(j6, j10, G(this, abstractC6984n0, f6, 4.0f, i6, p141o0.h2.f52230a.b(), r6, f10, abstractC7019z0, i10, 0, 512, null));
    }

    @Override // Y0.e
    public /* synthetic */ float g1(long j6) {
        return Y0.d.f(this, j6);
    }

    @Override // Y0.e
    public float getDensity() {
        return this.f52911C.f().getDensity();
    }

    @Override // p161q0.g
    public Y0.v getLayoutDirection() {
        return this.f52911C.g();
    }

    @Override // p161q0.g
    public /* synthetic */ long i() {
        return p161q0.f.b(this);
    }

    @Override // Y0.e
    public /* synthetic */ long k0(float f6) {
        return Y0.d.i(this, f6);
    }

    @Override // Y0.e
    public /* synthetic */ float o0(int i6) {
        return Y0.d.d(this, i6);
    }

    @Override // p161q0.g
    public void p1(p141o0.Q1 q6, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        this.f52911C.e().t(q6, t(this, abstractC6984n0, hVar, f6, abstractC7019z0, i6, 0, 32, null));
    }

    @Override // Y0.e
    public /* synthetic */ float q0(float f6) {
        return Y0.d.c(this, f6);
    }

    @Override // Y0.n
    public float v0() {
        return this.f52911C.f().v0();
    }

    @Override // p161q0.g
    public void y0(long j6, long j10, long j11, float f6, int i6, p141o0.R1 r6, float f10, p141o0.AbstractC7019z0 abstractC7019z0, int i10) {
        this.f52911C.e().r(j10, j11, C(this, j6, f6, 4.0f, i6, p141o0.h2.f52230a.b(), r6, f10, abstractC7019z0, i10, 0, 512, null));
    }
}
