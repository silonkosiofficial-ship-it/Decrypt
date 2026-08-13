package p210v;

/* JADX INFO: renamed from: v.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7231z extends F0.AbstractC0927m implements p121m0.b, F0.z0, F0.InterfaceC0934u, p121m0.m {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final boolean f55748R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p121m0.n f55749S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final p210v.C7230y f55750T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final p210v.A f55751U = (p210v.A) T1(new p210v.A());

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final p210v.C f55752V = (p210v.C) T1(new p210v.C());

    /* JADX INFO: renamed from: v.z$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.valueOf(androidx.compose.ui.focus.p.a(p210v.C7231z.this));
        }
    }

    /* JADX INFO: renamed from: v.z$b */
    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f55754G;

        b(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f55754G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p210v.C7231z c7231z = p210v.C7231z.this;
                this.f55754G = 1;
                if (E.f.b(c7231z, null, this, 1, null) == objG) {
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
            return ((p210v.C7231z.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p210v.C7231z.this.new b(eVar);
        }
    }

    public C7231z(p250z.l lVar) {
        this.f55750T = (p210v.C7230y) T1(new p210v.C7230y(lVar));
        T1(p121m0.q.a());
    }

    @Override // F0.z0
    public void M0(K0.w wVar) {
        p121m0.n nVar = this.f55749S;
        boolean z6 = false;
        if (nVar != null && nVar.g()) {
            z6 = true;
        }
        K0.u.S(wVar, z6);
        K0.u.F(wVar, null, new p210v.C7231z.a(), 1, null);
    }

    @Override // p121m0.b
    public void R0(p121m0.n nVar) {
        if (p247y7.AbstractC7350t.b(this.f55749S, nVar)) {
            return;
        }
        boolean zG = nVar.g();
        if (zG) {
            W8.AbstractC1788i.d(t1(), null, null, new p210v.C7231z.b(null), 3, null);
        }
        if (A1()) {
            F0.A0.b(this);
        }
        this.f55750T.V1(zG);
        this.f55752V.V1(zG);
        this.f55751U.U1(zG);
        this.f55749S = nVar;
    }

    public final void Z1(p250z.l lVar) {
        this.f55750T.W1(lVar);
    }

    @Override // F0.z0
    public /* synthetic */ boolean h0() {
        return F0.y0.a(this);
    }

    @Override // F0.z0
    public /* synthetic */ boolean k1() {
        return F0.y0.b(this);
    }

    @Override // F0.InterfaceC0934u
    public void s(D0.InterfaceC0900t interfaceC0900t) {
        this.f55752V.s(interfaceC0900t);
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return this.f55748R;
    }
}
