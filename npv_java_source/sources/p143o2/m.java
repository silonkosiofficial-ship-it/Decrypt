package p143o2;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p143o2.AbstractC7021a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p143o2.C7023c f52435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p143o2.r f52436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f52437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p163q2.b f52438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p253z2.d f52439h;

    private static final class a extends p143o2.r {
        public a() {
            super(-1, "", "");
        }

        @Override // p143o2.r
        public void a(p243y2.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "connection");
            throw new java.lang.IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // p143o2.r
        public void b(p243y2.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "connection");
            throw new java.lang.IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // p143o2.r
        public void f(p243y2.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "connection");
            throw new java.lang.IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // p143o2.r
        public void g(p243y2.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "connection");
            throw new java.lang.IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // p143o2.r
        public void h(p243y2.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "connection");
            throw new java.lang.IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // p143o2.r
        public void i(p243y2.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "connection");
            throw new java.lang.IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // p143o2.r
        public o2.r.a j(p243y2.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "connection");
            throw new java.lang.IllegalStateException("NOP delegate should never be called".toString());
        }
    }

    public final class b extends z2.e.a {
        public b(int i6) {
            super(i6);
        }

        @Override // z2.e.a
        public void d(p253z2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "db");
            p143o2.m.this.x(new p173r2.a(dVar));
        }

        @Override // z2.e.a
        public void e(p253z2.d dVar, int i6, int i10) {
            p247y7.AbstractC7350t.f(dVar, "db");
            g(dVar, i6, i10);
        }

        @Override // z2.e.a
        public void f(p253z2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "db");
            p143o2.m.this.z(new p173r2.a(dVar));
            p143o2.m.this.f52439h = dVar;
        }

        @Override // z2.e.a
        public void g(p253z2.d dVar, int i6, int i10) {
            p247y7.AbstractC7350t.f(dVar, "db");
            p143o2.m.this.y(new p173r2.a(dVar), i6, i10);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        public final void a(p253z2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "db");
            p143o2.m.this.f52439h = dVar;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p253z2.d) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final class d extends o2.n.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p237x7.l f52442a;

        d(p237x7.l lVar) {
            this.f52442a = lVar;
        }

        @Override // o2.n.b
        public void f(p253z2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "db");
            this.f52442a.l(dVar);
        }
    }

    public m(p143o2.C7023c c7023c, p143o2.r rVar) {
        p247y7.AbstractC7350t.f(c7023c, "config");
        p247y7.AbstractC7350t.f(rVar, "openDelegate");
        this.f52435d = c7023c;
        this.f52436e = rVar;
        java.util.List list = c7023c.f52401e;
        this.f52437f = list == null ? p097j7.AbstractC6879v.m() : list;
        if (c7023c.f52416t != null) {
            this.f52438g = o().f52398b == null ? p163q2.e.b(new p143o2.AbstractC7021a.b(this, c7023c.f52416t), ":memory:") : p163q2.e.a(new p143o2.AbstractC7021a.b(this, c7023c.f52416t), o().f52398b, p(o().f52403g), q(o().f52403g));
        } else {
            if (c7023c.f52399c == null) {
                throw new java.lang.IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!".toString());
            }
            this.f52438g = new p173r2.b(new p173r2.c(c7023c.f52399c.a(z2.e.b.f57641f.a(c7023c.f52397a).c(c7023c.f52398b).b(new o2.m.b(rVar.e())).a())));
        }
        E();
    }

    public m(p143o2.C7023c c7023c, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(c7023c, "config");
        p247y7.AbstractC7350t.f(lVar, "supportOpenHelperFactory");
        this.f52435d = c7023c;
        this.f52436e = new o2.m.a();
        java.util.List list = c7023c.f52401e;
        this.f52437f = list == null ? p097j7.AbstractC6879v.m() : list;
        this.f52438g = new p173r2.b(new p173r2.c((p253z2.e) lVar.l(F(c7023c, new o2.m.c()))));
        E();
    }

    private final void E() {
        boolean z6 = o().f52403g == o2.n.d.WRITE_AHEAD_LOGGING;
        p253z2.e eVarD = D();
        if (eVarD != null) {
            eVarD.setWriteAheadLoggingEnabled(z6);
        }
    }

    private final p143o2.C7023c F(p143o2.C7023c c7023c, p237x7.l lVar) {
        java.util.List listM = c7023c.f52401e;
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        return p143o2.C7023c.b(c7023c, null, null, null, null, p097j7.AbstractC6879v.D0(listM, new o2.m.d(lVar)), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    public final void C() {
        this.f52438g.close();
    }

    public final p253z2.e D() {
        p173r2.c cVarC;
        p163q2.b bVar = this.f52438g;
        p173r2.b bVar2 = bVar instanceof p173r2.b ? (p173r2.b) bVar : null;
        if (bVar2 == null || (cVarC = bVar2.c()) == null) {
            return null;
        }
        return cVarC.b();
    }

    public final boolean G() {
        p253z2.d dVar = this.f52439h;
        if (dVar != null) {
            return dVar.isOpen();
        }
        return false;
    }

    public java.lang.Object H(boolean z6, p237x7.p pVar, p127m7.e eVar) {
        return this.f52438g.a(z6, pVar, eVar);
    }

    @Override // p143o2.AbstractC7021a
    protected java.util.List n() {
        return this.f52437f;
    }

    @Override // p143o2.AbstractC7021a
    protected p143o2.C7023c o() {
        return this.f52435d;
    }

    @Override // p143o2.AbstractC7021a
    protected p143o2.r r() {
        return this.f52436e;
    }
}
