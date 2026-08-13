package p012b1;

/* JADX INFO: loaded from: classes.dex */
public final class o implements p012b1.n, V.Z0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p012b1.l f24090C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final W8.N f24091D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p051f0.u f24092E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f24093F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p237x7.l f24094G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.List f24095H;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.List f24096D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p012b1.o f24097E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p012b1.z f24098F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.util.List list, p012b1.o oVar, p012b1.z zVar) {
            super(0);
            this.f24096D = list;
            this.f24097E = oVar;
            this.f24098F = zVar;
        }

        public final void a() {
            java.util.List list = this.f24096D;
            p012b1.o oVar = this.f24097E;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                java.lang.Object objZ = ((D0.G) list.get(i6)).Z();
                p012b1.k kVar = objZ instanceof p012b1.k ? (p012b1.k) objZ : null;
                if (kVar != null) {
                    p012b1.f fVarB = kVar.b();
                    kVar.a().l(new p012b1.e(fVarB.a(), oVar.h().b(fVarB)));
                }
                oVar.f24095H.add(kVar);
            }
            this.f24097E.h().a(this.f24098F);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f24100G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ p237x7.a f24101H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p237x7.a aVar, p127m7.e eVar) {
                super(2, eVar);
                this.f24101H = aVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f24100G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                this.f24101H.b();
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((b1.o.b.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new b1.o.b.a(this.f24101H, eVar);
            }
        }

        b() {
            super(1);
        }

        public final void a(p237x7.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "it");
            W8.AbstractC1788i.d(p012b1.o.this.f24091D, W8.C1779d0.c().z1(), null, new b1.o.b.a(aVar, null), 2, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p237x7.a) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        public final void a(p087i7.M m6) {
            p247y7.AbstractC7350t.f(m6, "<anonymous parameter 0>");
            p012b1.o.this.i(true);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p087i7.M) obj);
            return p087i7.M.f46721a;
        }
    }

    public o(p012b1.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "scope");
        this.f24090C = lVar;
        this.f24091D = W8.O.b();
        this.f24092E = new p051f0.u(new b1.o.b());
        this.f24093F = true;
        this.f24094G = new b1.o.c();
        this.f24095H = new java.util.ArrayList();
    }

    @Override // p012b1.n
    public boolean a(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "measurables");
        if (this.f24093F || list.size() != this.f24095H.size()) {
            return true;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object objZ = ((D0.G) list.get(i6)).Z();
            if (!p247y7.AbstractC7350t.b(objZ instanceof p012b1.k ? (p012b1.k) objZ : null, this.f24095H.get(i6))) {
                return true;
            }
        }
        return false;
    }

    @Override // V.Z0
    public void b() {
    }

    @Override // V.Z0
    public void c() {
        this.f24092E.t();
        this.f24092E.j();
    }

    @Override // V.Z0
    public void d() {
        this.f24092E.s();
    }

    @Override // p012b1.n
    public void e(p012b1.z zVar, java.util.List list) {
        p247y7.AbstractC7350t.f(zVar, "state");
        p247y7.AbstractC7350t.f(list, "measurables");
        this.f24095H.clear();
        this.f24092E.o(p087i7.M.f46721a, this.f24094G, new b1.o.a(list, this, zVar));
        this.f24093F = false;
    }

    public final p012b1.l h() {
        return this.f24090C;
    }

    public final void i(boolean z6) {
        this.f24093F = z6;
    }
}
