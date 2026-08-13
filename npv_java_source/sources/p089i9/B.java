package p089i9;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends p089i9.AbstractC6670a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i9.B.b f47328b = new i9.B.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.f f47329a;

    public static final class a implements p089i9.InterfaceC6671b, p089i9.InterfaceC6673d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p109k9.C6918d f47330a;

        public a(p109k9.C6918d c6918d) {
            p247y7.AbstractC7350t.f(c6918d, "actualBuilder");
            this.f47330a = c6918d;
        }

        public p109k9.f B() {
            return p089i9.InterfaceC6671b.a.c(this);
        }

        @Override // p089i9.InterfaceC6671b
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public i9.B.a w() {
            return new i9.B.a(new p109k9.C6918d());
        }

        @Override // p089i9.InterfaceC6671b
        public p109k9.C6918d a() {
            return this.f47330a;
        }

        @Override // p089i9.InterfaceC6684o.a
        public void b(p089i9.K k6) {
            p089i9.InterfaceC6673d.a.n(this, k6);
        }

        @Override // p089i9.InterfaceC6684o
        public void c(java.lang.String str) {
            p089i9.InterfaceC6671b.a.d(this, str);
        }

        @Override // p089i9.InterfaceC6684o.a
        public void d(p089i9.K k6) {
            p089i9.InterfaceC6673d.a.i(this, k6);
        }

        @Override // p089i9.InterfaceC6671b
        public void i(java.lang.String str, p237x7.l lVar) {
            p089i9.InterfaceC6671b.a.b(this, str, lVar);
        }

        @Override // p089i9.InterfaceC6684o.d
        public void j(int i6, int i10) {
            p089i9.InterfaceC6673d.a.l(this, i6, i10);
        }

        @Override // p089i9.InterfaceC6684o.d
        public void k(p089i9.InterfaceC6683n interfaceC6683n) {
            p089i9.InterfaceC6673d.a.m(this, interfaceC6683n);
        }

        @Override // p089i9.InterfaceC6675f
        public void l(p109k9.o oVar) {
            p089i9.InterfaceC6673d.a.b(this, oVar);
        }

        @Override // p089i9.InterfaceC6684o.d
        public void m(p089i9.K k6) {
            p089i9.InterfaceC6673d.a.g(this, k6);
        }

        @Override // p089i9.InterfaceC6684o.a
        public void o(p089i9.K k6) {
            p089i9.InterfaceC6673d.a.d(this, k6);
        }

        @Override // p089i9.InterfaceC6671b
        public void p(p237x7.l[] lVarArr, p237x7.l lVar) {
            p089i9.InterfaceC6671b.a.a(this, lVarArr, lVar);
        }

        @Override // p089i9.InterfaceC6684o.a
        public void q(int i6) {
            p089i9.InterfaceC6673d.a.o(this, i6);
        }

        @Override // p089i9.InterfaceC6684o.a
        public void s(p089i9.InterfaceC6683n interfaceC6683n) {
            p089i9.InterfaceC6673d.a.c(this, interfaceC6683n);
        }

        @Override // p089i9.InterfaceC6673d
        public void u(p109k9.o oVar) {
            p247y7.AbstractC7350t.f(oVar, "structure");
            a().a(oVar);
        }

        @Override // p089i9.InterfaceC6672c
        public void v(p109k9.o oVar) {
            p089i9.InterfaceC6673d.a.a(this, oVar);
        }

        @Override // p089i9.InterfaceC6684o.d
        public void x(int i6) {
            p089i9.InterfaceC6673d.a.k(this, i6);
        }

        @Override // p089i9.InterfaceC6684o.d
        public void y(p089i9.K k6) {
            p089i9.InterfaceC6673d.a.f(this, k6);
        }

        @Override // p089i9.InterfaceC6684o.d
        public void z(p089i9.K k6) {
            p089i9.InterfaceC6673d.a.j(this, k6);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p089i9.B a(p237x7.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "block");
            i9.B.a aVar = new i9.B.a(new p109k9.C6918d());
            lVar.l(aVar);
            return new p089i9.B(aVar.B());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(p109k9.f fVar) {
        super(null);
        p247y7.AbstractC7350t.f(fVar, "actualFormat");
        this.f47329a = fVar;
    }

    @Override // p089i9.AbstractC6670a
    public p109k9.f c() {
        return this.f47329a;
    }

    @Override // p089i9.AbstractC6670a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p089i9.C6691w d() {
        return p089i9.C.f47332b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p089i9.AbstractC6670a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public p089i9.C6691w e(p079h9.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "value");
        p089i9.C6691w c6691w = new p089i9.C6691w(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        c6691w.h(jVar);
        return c6691w;
    }

    @Override // p089i9.AbstractC6670a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public p079h9.j f(p089i9.C6691w c6691w) {
        p247y7.AbstractC7350t.f(c6691w, "intermediate");
        return c6691w.l();
    }
}
