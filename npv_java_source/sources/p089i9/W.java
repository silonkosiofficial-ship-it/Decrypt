package p089i9;

/* JADX INFO: loaded from: classes2.dex */
public final class W extends p089i9.AbstractC6670a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i9.W.b f47468b = new i9.W.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.f f47469a;

    private static final class a implements p089i9.InterfaceC6671b, p089i9.InterfaceC6674e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p109k9.C6918d f47470a;

        public a(p109k9.C6918d c6918d) {
            p247y7.AbstractC7350t.f(c6918d, "actualBuilder");
            this.f47470a = c6918d;
        }

        public p109k9.f B() {
            return p089i9.InterfaceC6671b.a.c(this);
        }

        @Override // p089i9.InterfaceC6671b
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public i9.W.a w() {
            return new i9.W.a(new p109k9.C6918d());
        }

        @Override // p089i9.InterfaceC6671b
        public p109k9.C6918d a() {
            return this.f47470a;
        }

        @Override // p089i9.InterfaceC6684o
        public void c(java.lang.String str) {
            p089i9.InterfaceC6671b.a.d(this, str);
        }

        @Override // p089i9.InterfaceC6684o.e
        public void e(p089i9.K k6) {
            p089i9.InterfaceC6674e.a.b(this, k6);
        }

        @Override // p089i9.InterfaceC6684o.e
        public void h(p089i9.K k6) {
            p089i9.InterfaceC6674e.a.d(this, k6);
        }

        @Override // p089i9.InterfaceC6671b
        public void i(java.lang.String str, p237x7.l lVar) {
            p089i9.InterfaceC6671b.a.b(this, str, lVar);
        }

        @Override // p089i9.InterfaceC6671b
        public void p(p237x7.l[] lVarArr, p237x7.l lVar) {
            p089i9.InterfaceC6671b.a.a(this, lVarArr, lVar);
        }

        @Override // p089i9.InterfaceC6684o.e
        public void r(p089i9.K k6) {
            p089i9.InterfaceC6674e.a.c(this, k6);
        }

        @Override // p089i9.InterfaceC6674e
        public void t(p109k9.o oVar) {
            p247y7.AbstractC7350t.f(oVar, "structure");
            a().a(oVar);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p089i9.W a(p237x7.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "block");
            i9.W.a aVar = new i9.W.a(new p109k9.C6918d());
            lVar.l(aVar);
            return new p089i9.W(aVar.B());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(p109k9.f fVar) {
        super(null);
        p247y7.AbstractC7350t.f(fVar, "actualFormat");
        this.f47469a = fVar;
    }

    @Override // p089i9.AbstractC6670a
    public p109k9.f c() {
        return this.f47469a;
    }

    @Override // p089i9.AbstractC6670a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p089i9.C6693y d() {
        return p089i9.X.f47474d;
    }

    @Override // p089i9.AbstractC6670a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public p089i9.C6693y e(p079h9.r rVar) {
        p247y7.AbstractC7350t.f(rVar, "value");
        p089i9.C6693y c6693y = new p089i9.C6693y(null, null, null, null, 15, null);
        c6693y.b(rVar);
        return c6693y;
    }

    @Override // p089i9.AbstractC6670a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public p079h9.r f(p089i9.C6693y c6693y) {
        p247y7.AbstractC7350t.f(c6693y, "intermediate");
        return c6693y.d();
    }
}
