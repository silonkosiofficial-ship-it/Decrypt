package p089i9;

/* JADX INFO: renamed from: i9.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6694z extends p089i9.AbstractC6670a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p089i9.C6694z.b f47592b = new p089i9.C6694z.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.f f47593a;

    /* JADX INFO: renamed from: i9.z$a */
    public static final class a implements p089i9.InterfaceC6671b, p089i9.InterfaceC6672c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p109k9.C6918d f47594a;

        public a(p109k9.C6918d c6918d) {
            p247y7.AbstractC7350t.f(c6918d, "actualBuilder");
            this.f47594a = c6918d;
        }

        public p109k9.f B() {
            return p089i9.InterfaceC6671b.a.c(this);
        }

        @Override // p089i9.InterfaceC6671b
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public p089i9.C6694z.a w() {
            return new p089i9.C6694z.a(new p109k9.C6918d());
        }

        @Override // p089i9.InterfaceC6671b
        public p109k9.C6918d a() {
            return this.f47594a;
        }

        @Override // p089i9.InterfaceC6684o.a
        public void b(p089i9.K k6) {
            p089i9.InterfaceC6672c.a.f(this, k6);
        }

        @Override // p089i9.InterfaceC6684o
        public void c(java.lang.String str) {
            p089i9.InterfaceC6671b.a.d(this, str);
        }

        @Override // p089i9.InterfaceC6684o.a
        public void d(p089i9.K k6) {
            p089i9.InterfaceC6672c.a.e(this, k6);
        }

        @Override // p089i9.InterfaceC6671b
        public void i(java.lang.String str, p237x7.l lVar) {
            p089i9.InterfaceC6671b.a.b(this, str, lVar);
        }

        @Override // p089i9.InterfaceC6684o.a
        public void o(p089i9.K k6) {
            p089i9.InterfaceC6672c.a.b(this, k6);
        }

        @Override // p089i9.InterfaceC6671b
        public void p(p237x7.l[] lVarArr, p237x7.l lVar) {
            p089i9.InterfaceC6671b.a.a(this, lVarArr, lVar);
        }

        @Override // p089i9.InterfaceC6684o.a
        public void q(int i6) {
            p089i9.InterfaceC6672c.a.g(this, i6);
        }

        @Override // p089i9.InterfaceC6672c
        public void v(p109k9.o oVar) {
            p247y7.AbstractC7350t.f(oVar, "structure");
            a().a(oVar);
        }
    }

    /* JADX INFO: renamed from: i9.z$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p089i9.InterfaceC6683n a(p237x7.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "block");
            p089i9.C6694z.a aVar = new p089i9.C6694z.a(new p109k9.C6918d());
            lVar.l(aVar);
            return new p089i9.C6694z(aVar.B());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6694z(p109k9.f fVar) {
        super(null);
        p247y7.AbstractC7350t.f(fVar, "actualFormat");
        this.f47593a = fVar;
    }

    @Override // p089i9.AbstractC6670a
    public p109k9.f c() {
        return this.f47593a;
    }

    @Override // p089i9.AbstractC6670a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p089i9.C6690v d() {
        return p089i9.A.f47323c;
    }

    @Override // p089i9.AbstractC6670a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public p089i9.C6690v e(p079h9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "value");
        p089i9.C6690v c6690v = new p089i9.C6690v(null, null, null, null, 15, null);
        c6690v.b(hVar);
        return c6690v;
    }

    @Override // p089i9.AbstractC6670a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public p079h9.h f(p089i9.C6690v c6690v) {
        p247y7.AbstractC7350t.f(c6690v, "intermediate");
        return c6690v.c();
    }
}
