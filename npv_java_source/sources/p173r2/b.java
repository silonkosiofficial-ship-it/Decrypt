package p173r2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p163q2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p173r2.c f53810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f53811b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p173r2.d b() {
            java.lang.String databaseName = p173r2.b.this.c().b().getDatabaseName();
            if (databaseName == null) {
                databaseName = ":memory:";
            }
            return new p173r2.d(p173r2.b.this.c().a(databaseName));
        }
    }

    public b(p173r2.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "supportDriver");
        this.f53810a = cVar;
        this.f53811b = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new r2.b.a());
    }

    private final p173r2.d b() {
        return (p173r2.d) this.f53811b.getValue();
    }

    @Override // p163q2.b
    public java.lang.Object a(boolean z6, p237x7.p pVar, p127m7.e eVar) {
        return pVar.u(b(), eVar);
    }

    public final p173r2.c c() {
        return this.f53810a;
    }

    @Override // p163q2.b
    public void close() {
        this.f53810a.b().close();
    }
}
