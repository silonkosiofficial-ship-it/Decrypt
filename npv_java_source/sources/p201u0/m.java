package p201u0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p201u0.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p201u0.c f55312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f55313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f55314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p201u0.a f55315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p237x7.a f55316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V.InterfaceC1753w0 f55317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p141o0.AbstractC7019z0 f55318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final V.InterfaceC1753w0 f55319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f55320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f55321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f55322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p237x7.l f55323m;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final void a(p201u0.l lVar) {
            p201u0.m.this.h();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p201u0.l) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {
        b() {
            super(1);
        }

        public final void a(p161q0.g gVar) {
            p201u0.c cVarL = p201u0.m.this.l();
            p201u0.m mVar = p201u0.m.this;
            float f6 = mVar.f55321k;
            float f10 = mVar.f55322l;
            long jC = p131n0.g.f51312b.c();
            p161q0.d dVarF0 = gVar.F0();
            long jI = dVarF0.i();
            dVarF0.h().m();
            try {
                dVarF0.c().e(f6, f10, jC);
                cVarL.a(gVar);
            } finally {
                dVarF0.h().s();
                dVarF0.d(jI);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.g) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final u0.m.c f55326D = new u0.m.c();

        c() {
            super(0);
        }

        public final void a() {
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public m(p201u0.c cVar) {
        super(null);
        this.f55312b = cVar;
        cVar.d(new u0.m.a());
        this.f55313c = "";
        this.f55314d = true;
        this.f55315e = new p201u0.a();
        this.f55316f = u0.m.c.f55326D;
        this.f55317g = V.A1.d(null, null, 2, null);
        n0.m.a aVar = p131n0.m.f51333b;
        this.f55319i = V.A1.d(p131n0.m.c(aVar.b()), null, 2, null);
        this.f55320j = aVar.a();
        this.f55321k = 1.0f;
        this.f55322l = 1.0f;
        this.f55323m = new u0.m.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.f55314d = true;
        this.f55316f.b();
    }

    @Override // p201u0.l
    public void a(p161q0.g gVar) {
        i(gVar, 1.0f, null);
    }

    public final void i(p161q0.g gVar, float f6, p141o0.AbstractC7019z0 abstractC7019z0) {
        int iA = (this.f55312b.j() && this.f55312b.g() != 16 && p201u0.o.g(k()) && p201u0.o.g(abstractC7019z0)) ? p141o0.F1.f52118b.a() : p141o0.F1.f52118b.b();
        if (this.f55314d || !p131n0.m.f(this.f55320j, gVar.i()) || !p141o0.F1.i(iA, j())) {
            this.f55318h = p141o0.F1.i(iA, p141o0.F1.f52118b.a()) ? p141o0.AbstractC7019z0.a.b(p141o0.AbstractC7019z0.f52280b, this.f55312b.g(), 0, 2, null) : null;
            this.f55321k = p131n0.m.i(gVar.i()) / p131n0.m.i(m());
            this.f55322l = p131n0.m.g(gVar.i()) / p131n0.m.g(m());
            this.f55315e.b(iA, Y0.u.a((int) java.lang.Math.ceil(p131n0.m.i(gVar.i())), (int) java.lang.Math.ceil(p131n0.m.g(gVar.i()))), gVar, gVar.getLayoutDirection(), this.f55323m);
            this.f55314d = false;
            this.f55320j = gVar.i();
        }
        if (abstractC7019z0 == null) {
            abstractC7019z0 = k() != null ? k() : this.f55318h;
        }
        this.f55315e.c(gVar, f6, abstractC7019z0);
    }

    public final int j() {
        p141o0.E1 e1D = this.f55315e.d();
        return e1D != null ? e1D.b() : p141o0.F1.f52118b.b();
    }

    public final p141o0.AbstractC7019z0 k() {
        return (p141o0.AbstractC7019z0) this.f55317g.getValue();
    }

    public final p201u0.c l() {
        return this.f55312b;
    }

    public final long m() {
        return ((p131n0.m) this.f55319i.getValue()).m();
    }

    public final void n(p141o0.AbstractC7019z0 abstractC7019z0) {
        this.f55317g.setValue(abstractC7019z0);
    }

    public final void o(p237x7.a aVar) {
        this.f55316f = aVar;
    }

    public final void p(java.lang.String str) {
        this.f55313c = str;
    }

    public final void q(long j6) {
        this.f55319i.setValue(p131n0.m.c(j6));
    }

    public java.lang.String toString() {
        java.lang.String str = "Params: \tname: " + this.f55313c + "\n\tviewportWidth: " + p131n0.m.i(m()) + "\n\tviewportHeight: " + p131n0.m.g(m()) + "\n";
        p247y7.AbstractC7350t.e(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
