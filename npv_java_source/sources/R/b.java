package R;

/* JADX INFO: loaded from: classes.dex */
public final class b extends R.q implements R.k {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private R.j f9164a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private R.n f9165b0;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        public final void a() {
            F0.AbstractC0933t.a(R.b.this);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    private b(p250z.j jVar, boolean z6, float f6, p141o0.B0 b6, p237x7.a aVar) {
        super(jVar, z6, f6, b6, aVar, null);
    }

    public /* synthetic */ b(p250z.j jVar, boolean z6, float f6, p141o0.B0 b6, p237x7.a aVar, p247y7.AbstractC7342k abstractC7342k) {
        this(jVar, z6, f6, b6, aVar);
    }

    private final R.j h2() {
        R.j jVar = this.f9164a0;
        if (jVar != null) {
            p247y7.AbstractC7350t.c(jVar);
            return jVar;
        }
        R.j jVarC = R.t.c(R.t.e((android.view.View) F0.AbstractC0923i.a(this, androidx.compose.ui.platform.T.i())));
        this.f9164a0 = jVarC;
        p247y7.AbstractC7350t.c(jVarC);
        return jVarC;
    }

    private final void i2(R.n nVar) {
        this.f9165b0 = nVar;
        F0.AbstractC0933t.a(this);
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        R.j jVar = this.f9164a0;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    @Override // R.q
    public void Y1(z.n.b bVar, long j6, float f6) {
        R.n nVarB = h2().b(this);
        nVarB.b(bVar, a2(), j6, A7.a.d(f6), c2(), ((R.g) b2().b()).d(), new R.b.a());
        i2(nVarB);
    }

    @Override // R.q
    public void Z1(p161q0.g gVar) {
        p141o0.InterfaceC6993q0 interfaceC6993q0H = gVar.F0().h();
        R.n nVar = this.f9165b0;
        if (nVar != null) {
            nVar.f(d2(), c2(), ((R.g) b2().b()).d());
            nVar.draw(p141o0.H.d(interfaceC6993q0H));
        }
    }

    @Override // R.q
    public void f2(z.n.b bVar) {
        R.n nVar = this.f9165b0;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override // R.k
    public void i0() {
        i2(null);
    }
}
