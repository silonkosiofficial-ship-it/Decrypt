package p073h2;

/* JADX INFO: renamed from: h2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C6643u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W8.N f46250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p073h2.F f46251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p073h2.C6625b f46252c;

    /* JADX INFO: renamed from: h2.u$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46253G;

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            int i6 = this.f46253G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p073h2.C6643u.this.d();
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
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((p073h2.C6643u.a) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p073h2.C6643u.this.new a(eVar);
        }
    }

    /* JADX INFO: renamed from: h2.u$b */
    static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46255G;

        b(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            int i6 = this.f46255G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p073h2.C6643u.this.d();
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(Z8.InterfaceC1870g interfaceC1870g, java.lang.Throwable th, p127m7.e eVar) {
            return p073h2.C6643u.this.new b(eVar).B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: renamed from: h2.u$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p073h2.AbstractC6646x.b b() {
            return p073h2.C6643u.this.f46252c.f();
        }
    }

    public C6643u(W8.N n6, p073h2.F f6, p073h2.InterfaceC6624a interfaceC6624a) {
        p247y7.AbstractC7350t.f(n6, "scope");
        p247y7.AbstractC7350t.f(f6, "parent");
        this.f46250a = n6;
        this.f46251b = f6;
        this.f46252c = new p073h2.C6625b(f6.b(), n6);
    }

    public final p073h2.F b() {
        return new p073h2.F(Z8.AbstractC1871h.F(Z8.AbstractC1871h.H(this.f46252c.g(), new p073h2.C6643u.a(null)), new p073h2.C6643u.b(null)), this.f46251b.d(), this.f46251b.c(), new p073h2.C6643u.c());
    }

    public final java.lang.Object c(p127m7.e eVar) {
        this.f46252c.e();
        return p087i7.M.f46721a;
    }

    public final p073h2.InterfaceC6624a d() {
        return null;
    }
}
