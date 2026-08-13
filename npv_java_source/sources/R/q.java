package R;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends androidx.compose.ui.d.c implements F0.InterfaceC0921h, F0.InterfaceC0932s, F0.C {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final p250z.j f9237P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final boolean f9238Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final float f9239R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final p141o0.B0 f9240S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final p237x7.a f9241T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final boolean f9242U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private R.u f9243V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f9244W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private long f9245X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f9246Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final p170r.I f9247Z;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f9248G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f9249H;

        /* JADX INFO: renamed from: R.q$a$a, reason: collision with other inner class name */
        static final class C0213a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ R.q f9251C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ W8.N f9252D;

            C0213a(R.q qVar, W8.N n6) {
                this.f9251C = qVar;
                this.f9252D = n6;
            }

            @Override // Z8.InterfaceC1870g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(p250z.i iVar, p127m7.e eVar) {
                if (!(iVar instanceof p250z.n)) {
                    this.f9251C.g2(iVar, this.f9252D);
                } else if (this.f9251C.f9246Y) {
                    this.f9251C.e2((p250z.n) iVar);
                } else {
                    this.f9251C.f9247Z.g(iVar);
                }
                return p087i7.M.f46721a;
            }
        }

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f9248G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                W8.N n6 = (W8.N) this.f9249H;
                Z8.InterfaceC1869f interfaceC1869fB = R.q.this.f9237P.b();
                R.q.a.C0213a c0213a = new R.q.a.C0213a(R.q.this, n6);
                this.f9248G = 1;
                if (interfaceC1869fB.b(c0213a, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((R.q.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            R.q.a aVar = R.q.this.new a(eVar);
            aVar.f9249H = obj;
            return aVar;
        }
    }

    private q(p250z.j jVar, boolean z6, float f6, p141o0.B0 b6, p237x7.a aVar) {
        this.f9237P = jVar;
        this.f9238Q = z6;
        this.f9239R = f6;
        this.f9240S = b6;
        this.f9241T = aVar;
        this.f9245X = p131n0.m.f51333b.b();
        this.f9247Z = new p170r.I(0, 1, null);
    }

    public /* synthetic */ q(p250z.j jVar, boolean z6, float f6, p141o0.B0 b6, p237x7.a aVar, p247y7.AbstractC7342k abstractC7342k) {
        this(jVar, z6, f6, b6, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(p250z.n nVar) {
        z.n.b bVarA;
        if (nVar instanceof z.n.b) {
            Y1((z.n.b) nVar, this.f9245X, this.f9244W);
            return;
        }
        if (nVar instanceof z.n.c) {
            bVarA = ((z.n.c) nVar).a();
        } else if (!(nVar instanceof z.n.a)) {
            return;
        } else {
            bVarA = ((z.n.a) nVar).a();
        }
        f2(bVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(p250z.i iVar, W8.N n6) {
        R.u uVar = this.f9243V;
        if (uVar == null) {
            uVar = new R.u(this.f9238Q, this.f9241T);
            F0.AbstractC0933t.a(this);
            this.f9243V = uVar;
        }
        uVar.c(iVar, n6);
    }

    @Override // androidx.compose.ui.d.c
    public void D1() {
        W8.AbstractC1788i.d(t1(), null, null, new R.q.a(null), 3, null);
    }

    @Override // F0.C
    public void M(long j6) {
        this.f9246Y = true;
        Y0.e eVarI = F0.AbstractC0925k.i(this);
        this.f9245X = Y0.u.d(j6);
        this.f9244W = java.lang.Float.isNaN(this.f9239R) ? R.i.a(eVarI, this.f9238Q, this.f9245X) : eVarI.B0(this.f9239R);
        p170r.I i6 = this.f9247Z;
        java.lang.Object[] objArr = i6.f53322a;
        int i10 = i6.f53323b;
        for (int i11 = 0; i11 < i10; i11++) {
            e2((p250z.n) objArr[i11]);
        }
        this.f9247Z.h();
    }

    public abstract void Y1(z.n.b bVar, long j6, float f6);

    public abstract void Z1(p161q0.g gVar);

    protected final boolean a2() {
        return this.f9238Q;
    }

    protected final p237x7.a b2() {
        return this.f9241T;
    }

    public final long c2() {
        return this.f9240S.a();
    }

    protected final long d2() {
        return this.f9245X;
    }

    public abstract void f2(z.n.b bVar);

    @Override // F0.InterfaceC0932s
    public /* synthetic */ void m0() {
        F0.r.a(this);
    }

    @Override // F0.C
    public /* synthetic */ void m1(D0.InterfaceC0900t interfaceC0900t) {
        F0.B.a(this, interfaceC0900t);
    }

    @Override // F0.InterfaceC0932s
    public void y(p161q0.c cVar) {
        cVar.l1();
        R.u uVar = this.f9243V;
        if (uVar != null) {
            uVar.b(cVar, this.f9244W, c2());
        }
        Z1(cVar);
    }

    @Override // androidx.compose.ui.d.c
    public final boolean y1() {
        return this.f9242U;
    }
}
