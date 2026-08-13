package p201u0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p191t0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f55344n = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V.InterfaceC1753w0 f55345g = V.A1.d(p131n0.m.c(p131n0.m.f51333b.b()), null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final V.InterfaceC1753w0 f55346h = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p201u0.m f55347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final V.InterfaceC1745s0 f55348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f55349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p141o0.AbstractC7019z0 f55350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f55351m;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        public final void a() {
            if (p201u0.q.this.f55351m == p201u0.q.this.o()) {
                p201u0.q qVar = p201u0.q.this;
                qVar.s(qVar.o() + 1);
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public q(p201u0.c cVar) {
        p201u0.m mVar = new p201u0.m(cVar);
        mVar.o(new u0.q.a());
        this.f55347i = mVar;
        this.f55348j = V.AbstractC1730l1.a(0);
        this.f55349k = 1.0f;
        this.f55351m = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o() {
        return this.f55348j.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int i6) {
        this.f55348j.i(i6);
    }

    @Override // p191t0.b
    protected boolean a(float f6) {
        this.f55349k = f6;
        return true;
    }

    @Override // p191t0.b
    protected boolean b(p141o0.AbstractC7019z0 abstractC7019z0) {
        this.f55350l = abstractC7019z0;
        return true;
    }

    @Override // p191t0.b
    public long h() {
        return p();
    }

    @Override // p191t0.b
    protected void j(p161q0.g gVar) {
        p201u0.m mVar = this.f55347i;
        p141o0.AbstractC7019z0 abstractC7019z0K = this.f55350l;
        if (abstractC7019z0K == null) {
            abstractC7019z0K = mVar.k();
        }
        if (n() && gVar.getLayoutDirection() == Y0.v.Rtl) {
            long jW0 = gVar.W0();
            p161q0.d dVarF0 = gVar.F0();
            long jI = dVarF0.i();
            dVarF0.h().m();
            try {
                dVarF0.c().e(-1.0f, 1.0f, jW0);
                mVar.i(gVar, this.f55349k, abstractC7019z0K);
                dVarF0.h().s();
                dVarF0.d(jI);
            } catch (java.lang.Throwable th) {
                dVarF0.h().s();
                dVarF0.d(jI);
                throw th;
            }
        } else {
            mVar.i(gVar, this.f55349k, abstractC7019z0K);
        }
        this.f55351m = o();
    }

    public final boolean n() {
        return ((java.lang.Boolean) this.f55346h.getValue()).booleanValue();
    }

    public final long p() {
        return ((p131n0.m) this.f55345g.getValue()).m();
    }

    public final void q(boolean z6) {
        this.f55346h.setValue(java.lang.Boolean.valueOf(z6));
    }

    public final void r(p141o0.AbstractC7019z0 abstractC7019z0) {
        this.f55347i.n(abstractC7019z0);
    }

    public final void t(java.lang.String str) {
        this.f55347i.p(str);
    }

    public final void u(long j6) {
        this.f55345g.setValue(p131n0.m.c(j6));
    }

    public final void v(long j6) {
        this.f55347i.q(j6);
    }
}
