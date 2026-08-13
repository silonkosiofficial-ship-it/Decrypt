package R;

/* JADX INFO: loaded from: classes.dex */
public final class a extends R.o implements V.Z0, R.k {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f9152E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final float f9153F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final V.G1 f9154G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final V.G1 f9155H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final android.view.ViewGroup f9156I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private R.j f9157J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final V.InterfaceC1753w0 f9158K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final V.InterfaceC1753w0 f9159L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private long f9160M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f9161N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final p237x7.a f9162O;

    /* JADX INFO: renamed from: R.a$a, reason: collision with other inner class name */
    static final class C0210a extends p247y7.AbstractC7352v implements p237x7.a {
        C0210a() {
            super(0);
        }

        public final void a() {
            R.a aVar = R.a.this;
            aVar.o(!aVar.l());
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    private a(boolean z6, float f6, V.G1 g6, V.G1 g10, android.view.ViewGroup viewGroup) {
        super(z6, g10);
        this.f9152E = z6;
        this.f9153F = f6;
        this.f9154G = g6;
        this.f9155H = g10;
        this.f9156I = viewGroup;
        this.f9158K = V.A1.d(null, null, 2, null);
        this.f9159L = V.A1.d(java.lang.Boolean.TRUE, null, 2, null);
        this.f9160M = p131n0.m.f51333b.b();
        this.f9161N = -1;
        this.f9162O = new R.a.C0210a();
    }

    public /* synthetic */ a(boolean z6, float f6, V.G1 g6, V.G1 g10, android.view.ViewGroup viewGroup, p247y7.AbstractC7342k abstractC7342k) {
        this(z6, f6, g6, g10, viewGroup);
    }

    private final void k() {
        R.j jVar = this.f9157J;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        return ((java.lang.Boolean) this.f9159L.getValue()).booleanValue();
    }

    private final R.j m() {
        R.j jVar = this.f9157J;
        if (jVar != null) {
            p247y7.AbstractC7350t.c(jVar);
            return jVar;
        }
        R.j jVarC = R.t.c(this.f9156I);
        this.f9157J = jVarC;
        p247y7.AbstractC7350t.c(jVarC);
        return jVarC;
    }

    private final R.n n() {
        return (R.n) this.f9158K.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z6) {
        this.f9159L.setValue(java.lang.Boolean.valueOf(z6));
    }

    private final void p(R.n nVar) {
        this.f9158K.setValue(nVar);
    }

    @Override // p210v.H
    public void a(p161q0.c cVar) {
        this.f9160M = cVar.i();
        this.f9161N = java.lang.Float.isNaN(this.f9153F) ? A7.a.d(R.i.a(cVar, this.f9152E, cVar.i())) : cVar.S0(this.f9153F);
        long jW = ((p141o0.C7016y0) this.f9154G.getValue()).w();
        float fD = ((R.g) this.f9155H.getValue()).d();
        cVar.l1();
        f(cVar, this.f9153F, jW);
        p141o0.InterfaceC6993q0 interfaceC6993q0H = cVar.F0().h();
        l();
        R.n nVarN = n();
        if (nVarN != null) {
            nVarN.f(cVar.i(), jW, fD);
            nVarN.draw(p141o0.H.d(interfaceC6993q0H));
        }
    }

    @Override // V.Z0
    public void b() {
        k();
    }

    @Override // V.Z0
    public void c() {
        k();
    }

    @Override // V.Z0
    public void d() {
    }

    @Override // R.o
    public void e(z.n.b bVar, W8.N n6) {
        R.n nVarB = m().b(this);
        nVarB.b(bVar, this.f9152E, this.f9160M, this.f9161N, ((p141o0.C7016y0) this.f9154G.getValue()).w(), ((R.g) this.f9155H.getValue()).d(), this.f9162O);
        p(nVarB);
    }

    @Override // R.o
    public void g(z.n.b bVar) {
        R.n nVarN = n();
        if (nVarN != null) {
            nVarN.e();
        }
    }

    @Override // R.k
    public void i0() {
        p(null);
    }
}
