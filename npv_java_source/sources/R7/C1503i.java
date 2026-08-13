package R7;

/* JADX INFO: renamed from: R7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1503i implements O7.O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f9620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f9621b;

    public C1503i(java.util.List list, java.lang.String str) {
        p247y7.AbstractC7350t.f(list, "providers");
        p247y7.AbstractC7350t.f(str, "debugName");
        this.f9620a = list;
        this.f9621b = str;
        list.size();
        p097j7.AbstractC6879v.Y0(list).size();
    }

    @Override // O7.O
    public boolean a(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        java.util.List list = this.f9620a;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!O7.N.b((O7.L) it.next(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // O7.L
    public java.util.List b(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f9620a.iterator();
        while (it.hasNext()) {
            O7.N.a((O7.L) it.next(), cVar, arrayList);
        }
        return p097j7.AbstractC6879v.T0(arrayList);
    }

    @Override // O7.O
    public void c(p138n8.c cVar, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(collection, "packageFragments");
        java.util.Iterator it = this.f9620a.iterator();
        while (it.hasNext()) {
            O7.N.a((O7.L) it.next(), cVar, collection);
        }
    }

    public java.lang.String toString() {
        return this.f9621b;
    }

    @Override // O7.L
    public java.util.Collection x(p138n8.c cVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.f9620a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((O7.L) it.next()).x(cVar, lVar));
        }
        return hashSet;
    }
}
