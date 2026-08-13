package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2081m extends androidx.lifecycle.AbstractC2080l implements androidx.lifecycle.InterfaceC2083o {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.lifecycle.AbstractC2079k f22829C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p127m7.i f22830D;

    /* JADX INFO: renamed from: androidx.lifecycle.m$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f22831G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f22832H;

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f22831G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            W8.N n6 = (W8.N) this.f22832H;
            if (androidx.lifecycle.C2081m.this.a().b().compareTo(androidx.lifecycle.AbstractC2079k.b.INITIALIZED) >= 0) {
                androidx.lifecycle.C2081m.this.a().a(androidx.lifecycle.C2081m.this);
            } else {
                W8.D0.f(n6.getCoroutineContext(), null, 1, null);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((androidx.lifecycle.C2081m.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.lifecycle.C2081m.a aVar = androidx.lifecycle.C2081m.this.new a(eVar);
            aVar.f22832H = obj;
            return aVar;
        }
    }

    public C2081m(androidx.lifecycle.AbstractC2079k abstractC2079k, p127m7.i iVar) {
        p247y7.AbstractC7350t.f(abstractC2079k, "lifecycle");
        p247y7.AbstractC7350t.f(iVar, "coroutineContext");
        this.f22829C = abstractC2079k;
        this.f22830D = iVar;
        if (a().b() == androidx.lifecycle.AbstractC2079k.b.DESTROYED) {
            W8.D0.f(getCoroutineContext(), null, 1, null);
        }
    }

    public androidx.lifecycle.AbstractC2079k a() {
        return this.f22829C;
    }

    public final void b() {
        W8.AbstractC1788i.d(this, W8.C1779d0.c().z1(), null, new androidx.lifecycle.C2081m.a(null), 2, null);
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f22830D;
    }

    @Override // androidx.lifecycle.InterfaceC2083o
    public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        p247y7.AbstractC7350t.f(rVar, "source");
        p247y7.AbstractC7350t.f(aVar, "event");
        if (a().b().compareTo(androidx.lifecycle.AbstractC2079k.b.DESTROYED) <= 0) {
            a().d(this);
            W8.D0.f(getCoroutineContext(), null, 1, null);
        }
    }
}
