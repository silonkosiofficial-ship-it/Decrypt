package p008a8;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements O7.O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p008a8.g f17130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E8.a f17131b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p048e8.u f17133E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p048e8.u uVar) {
            super(0);
            this.f17133E = uVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p018b8.h b() {
            return new p018b8.h(p008a8.f.this.f17130a, this.f17133E);
        }
    }

    public f(p008a8.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "components");
        p008a8.g gVar = new p008a8.g(bVar, a8.k.a.f17146a, p087i7.AbstractC6669o.c(null));
        this.f17130a = gVar;
        this.f17131b = gVar.e().c();
    }

    private final p018b8.h e(p138n8.c cVar) {
        p048e8.u uVarA = X7.o.a(this.f17130a.a().d(), cVar, false, 2, null);
        if (uVarA == null) {
            return null;
        }
        return (p018b8.h) this.f17131b.a(cVar, new a8.f.a(uVarA));
    }

    @Override // O7.O
    public boolean a(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        return X7.o.a(this.f17130a.a().d(), cVar, false, 2, null) == null;
    }

    @Override // O7.L
    public java.util.List b(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        return p097j7.AbstractC6879v.q(e(cVar));
    }

    @Override // O7.O
    public void c(p138n8.c cVar, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(collection, "packageFragments");
        P8.a.a(collection, e(cVar));
    }

    @Override // O7.L
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.util.List x(p138n8.c cVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        p018b8.h hVarE = e(cVar);
        java.util.List listY0 = hVarE != null ? hVarE.Y0() : null;
        return listY0 == null ? p097j7.AbstractC6879v.m() : listY0;
    }

    public java.lang.String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f17130a.a().m();
    }
}
