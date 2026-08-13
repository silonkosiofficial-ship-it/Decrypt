package O7;

/* JADX INFO: loaded from: classes2.dex */
public final class M implements O7.O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Collection f8128a;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final O7.M.a f8129D = new O7.M.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p138n8.c l(O7.K k6) {
            p247y7.AbstractC7350t.f(k6, "it");
            return k6.e();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p138n8.c f8130D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p138n8.c cVar) {
            super(1);
            this.f8130D = cVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(p138n8.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "it");
            return java.lang.Boolean.valueOf(!cVar.d() && p247y7.AbstractC7350t.b(cVar.e(), this.f8130D));
        }
    }

    public M(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "packageFragments");
        this.f8128a = collection;
    }

    @Override // O7.O
    public boolean a(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        java.util.Collection collection = this.f8128a;
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (p247y7.AbstractC7350t.b(((O7.K) it.next()).e(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // O7.L
    public java.util.List b(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        java.util.Collection collection = this.f8128a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (p247y7.AbstractC7350t.b(((O7.K) obj).e(), cVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // O7.O
    public void c(p138n8.c cVar, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(collection, "packageFragments");
        for (java.lang.Object obj : this.f8128a) {
            if (p247y7.AbstractC7350t.b(((O7.K) obj).e(), cVar)) {
                collection.add(obj);
            }
        }
    }

    @Override // O7.L
    public java.util.Collection x(p138n8.c cVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        return R8.k.M(R8.k.w(R8.k.G(p097j7.AbstractC6879v.Y(this.f8128a), O7.M.a.f8129D), new O7.M.b(cVar)));
    }
}
