package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class E implements X7.D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f15940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E8.f f15941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E8.h f15942d;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(p138n8.c cVar) {
            p247y7.AbstractC7350t.c(cVar);
            return p138n8.e.a(cVar, X7.E.this.b());
        }
    }

    public E(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "states");
        this.f15940b = map;
        E8.f fVar = new E8.f("Java nullability annotation states");
        this.f15941c = fVar;
        E8.h hVarH = fVar.h(new X7.E.a());
        p247y7.AbstractC7350t.e(hVarH, "createMemoizedFunctionWithNullableValues(...)");
        this.f15942d = hVarH;
    }

    @Override // X7.D
    public java.lang.Object a(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        return this.f15942d.l(cVar);
    }

    public final java.util.Map b() {
        return this.f15940b;
    }
}
