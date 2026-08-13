package p089i9;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends p089i9.AbstractC6670a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i9.D.b f47337b = new i9.D.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.f f47338a;

    private static final class a implements p089i9.InterfaceC6671b, p089i9.InterfaceC6675f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p109k9.C6918d f47339a;

        public a(p109k9.C6918d c6918d) {
            p247y7.AbstractC7350t.f(c6918d, "actualBuilder");
            this.f47339a = c6918d;
        }

        public p109k9.f B() {
            return p089i9.InterfaceC6671b.a.c(this);
        }

        @Override // p089i9.InterfaceC6671b
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public i9.D.a w() {
            return new i9.D.a(new p109k9.C6918d());
        }

        @Override // p089i9.InterfaceC6671b
        public p109k9.C6918d a() {
            return this.f47339a;
        }

        @Override // p089i9.InterfaceC6684o
        public void c(java.lang.String str) {
            p089i9.InterfaceC6671b.a.d(this, str);
        }

        @Override // p089i9.InterfaceC6671b
        public void i(java.lang.String str, p237x7.l lVar) {
            p089i9.InterfaceC6671b.a.b(this, str, lVar);
        }

        @Override // p089i9.InterfaceC6684o.d
        public void j(int i6, int i10) {
            p089i9.InterfaceC6675f.a.e(this, i6, i10);
        }

        @Override // p089i9.InterfaceC6675f
        public void l(p109k9.o oVar) {
            p247y7.AbstractC7350t.f(oVar, "structure");
            a().a(oVar);
        }

        @Override // p089i9.InterfaceC6684o.d
        public void m(p089i9.K k6) {
            p089i9.InterfaceC6675f.a.b(this, k6);
        }

        @Override // p089i9.InterfaceC6671b
        public void p(p237x7.l[] lVarArr, p237x7.l lVar) {
            p089i9.InterfaceC6671b.a.a(this, lVarArr, lVar);
        }

        @Override // p089i9.InterfaceC6684o.d
        public void x(int i6) {
            p089i9.InterfaceC6675f.a.d(this, i6);
        }

        @Override // p089i9.InterfaceC6684o.d
        public void y(p089i9.K k6) {
            p089i9.InterfaceC6675f.a.a(this, k6);
        }

        @Override // p089i9.InterfaceC6684o.d
        public void z(p089i9.K k6) {
            p089i9.InterfaceC6675f.a.c(this, k6);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p089i9.D a(p237x7.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "block");
            i9.D.a aVar = new i9.D.a(new p109k9.C6918d());
            lVar.l(aVar);
            return new p089i9.D(aVar.B());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(p109k9.f fVar) {
        super(null);
        p247y7.AbstractC7350t.f(fVar, "actualFormat");
        this.f47338a = fVar;
    }

    @Override // p089i9.AbstractC6670a
    public p109k9.f c() {
        return this.f47338a;
    }

    @Override // p089i9.AbstractC6670a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p089i9.C6692x d() {
        return p089i9.E.f47341b;
    }

    @Override // p089i9.AbstractC6670a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public p089i9.C6692x e(p079h9.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "value");
        p089i9.C6692x c6692x = new p089i9.C6692x(null, null, null, null, null, null, 63, null);
        c6692x.h(lVar);
        return c6692x;
    }

    @Override // p089i9.AbstractC6670a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public p079h9.l f(p089i9.C6692x c6692x) {
        p247y7.AbstractC7350t.f(c6692x, "intermediate");
        return c6692x.k();
    }
}
