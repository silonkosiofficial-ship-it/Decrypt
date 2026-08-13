package p210v;

/* JADX INFO: renamed from: v.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7230y extends androidx.compose.ui.d.c {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p250z.l f55739P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p250z.d f55740Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final boolean f55741R;

    /* JADX INFO: renamed from: v.y$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f55742G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p250z.l f55743H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p250z.i f55744I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ W8.InterfaceC1783f0 f55745J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p250z.l lVar, p250z.i iVar, W8.InterfaceC1783f0 interfaceC1783f0, p127m7.e eVar) {
            super(2, eVar);
            this.f55743H = lVar;
            this.f55744I = iVar;
            this.f55745J = interfaceC1783f0;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f55742G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p250z.l lVar = this.f55743H;
                p250z.i iVar = this.f55744I;
                this.f55742G = 1;
                if (lVar.c(iVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            W8.InterfaceC1783f0 interfaceC1783f0 = this.f55745J;
            if (interfaceC1783f0 != null) {
                interfaceC1783f0.e();
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((p210v.C7230y.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new p210v.C7230y.a(this.f55743H, this.f55744I, this.f55745J, eVar);
        }
    }

    /* JADX INFO: renamed from: v.y$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p250z.l f55746D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p250z.i f55747E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p250z.l lVar, p250z.i iVar) {
            super(1);
            this.f55746D = lVar;
            this.f55747E = iVar;
        }

        public final void a(java.lang.Throwable th) {
            this.f55746D.a(this.f55747E);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    public C7230y(p250z.l lVar) {
        this.f55739P = lVar;
    }

    private final void T1() {
        p250z.d dVar;
        p250z.l lVar = this.f55739P;
        if (lVar != null && (dVar = this.f55740Q) != null) {
            lVar.a(new p250z.e(dVar));
        }
        this.f55740Q = null;
    }

    private final void U1(p250z.l lVar, p250z.i iVar) {
        if (!A1()) {
            lVar.a(iVar);
        } else {
            W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) t1().getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
            W8.AbstractC1788i.d(t1(), null, null, new p210v.C7230y.a(lVar, iVar, interfaceC1822z0 != null ? interfaceC1822z0.e1(new p210v.C7230y.b(lVar, iVar)) : null, null), 3, null);
        }
    }

    public final void V1(boolean z6) {
        p250z.l lVar = this.f55739P;
        if (lVar != null) {
            if (!z6) {
                p250z.d dVar = this.f55740Q;
                if (dVar != null) {
                    U1(lVar, new p250z.e(dVar));
                    this.f55740Q = null;
                    return;
                }
                return;
            }
            p250z.d dVar2 = this.f55740Q;
            if (dVar2 != null) {
                U1(lVar, new p250z.e(dVar2));
                this.f55740Q = null;
            }
            p250z.d dVar3 = new p250z.d();
            U1(lVar, dVar3);
            this.f55740Q = dVar3;
        }
    }

    public final void W1(p250z.l lVar) {
        if (p247y7.AbstractC7350t.b(this.f55739P, lVar)) {
            return;
        }
        T1();
        this.f55739P = lVar;
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return this.f55741R;
    }
}
