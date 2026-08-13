package O6;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements T6.InterfaceC1676y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final O6.d.a f8069g = new O6.d.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T6.M f8070a = new T6.M(null, null, 0, null, null, null, null, null, false, 511, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T6.A f8071b = T6.A.f12975b.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T6.C1669q f8072c = new T6.C1669q(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Object f8073d = R6.b.f9497a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private W8.InterfaceC1822z0 f8074e = W8.U0.b(null, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final W6.InterfaceC1768b f8075f = W6.AbstractC1770d.a(true);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map n() {
        return new java.util.LinkedHashMap();
    }

    @Override // T6.InterfaceC1676y
    public T6.C1669q a() {
        return this.f8072c;
    }

    public final O6.e c() {
        T6.g0 g0VarB = this.f8070a.b();
        T6.A a6 = this.f8071b;
        T6.InterfaceC1668p interfaceC1668pQ = a().q();
        java.lang.Object obj = this.f8073d;
        U6.b bVar = obj instanceof U6.b ? (U6.b) obj : null;
        if (bVar != null) {
            return new O6.e(g0VarB, a6, interfaceC1668pQ, bVar, this.f8074e, this.f8075f);
        }
        throw new java.lang.IllegalStateException(("No request transformation found: " + this.f8073d).toString());
    }

    public final W6.InterfaceC1768b d() {
        return this.f8075f;
    }

    public final java.lang.Object e() {
        return this.f8073d;
    }

    public final p017b7.a f() {
        return (p017b7.a) this.f8075f.c(O6.j.a());
    }

    public final java.lang.Object g(F6.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "key");
        java.util.Map map = (java.util.Map) this.f8075f.c(F6.i.a());
        if (map != null) {
            return map.get(hVar);
        }
        return null;
    }

    public final W8.InterfaceC1822z0 h() {
        return this.f8074e;
    }

    public final T6.A i() {
        return this.f8071b;
    }

    public final T6.M j() {
        return this.f8070a;
    }

    public final void k(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "<set-?>");
        this.f8073d = obj;
    }

    public final void l(p017b7.a aVar) {
        if (aVar != null) {
            this.f8075f.f(O6.j.a(), aVar);
        } else {
            this.f8075f.d(O6.j.a());
        }
    }

    public final void m(F6.h hVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(hVar, "key");
        p247y7.AbstractC7350t.f(obj, "capability");
        ((java.util.Map) this.f8075f.g(F6.i.a(), new p237x7.a() { // from class: O6.c
            @Override // p237x7.a
            public final java.lang.Object b() {
                return O6.d.n();
            }
        })).put(hVar, obj);
    }

    public final void o(W8.InterfaceC1822z0 interfaceC1822z0) {
        p247y7.AbstractC7350t.f(interfaceC1822z0, "<set-?>");
        this.f8074e = interfaceC1822z0;
    }

    public final void p(T6.A a6) {
        p247y7.AbstractC7350t.f(a6, "<set-?>");
        this.f8071b = a6;
    }

    public final O6.d q(O6.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "builder");
        this.f8071b = dVar.f8071b;
        this.f8073d = dVar.f8073d;
        l(dVar.f());
        T6.X.i(this.f8070a, dVar.f8070a);
        T6.M m6 = this.f8070a;
        m6.v(m6.g());
        W6.D.c(a(), dVar.a());
        W6.AbstractC1771e.a(this.f8075f, dVar.f8075f);
        return this;
    }

    public final O6.d r(O6.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "builder");
        this.f8074e = dVar.f8074e;
        return q(dVar);
    }
}
