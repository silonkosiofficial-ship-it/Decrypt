package W6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B implements W6.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f15363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f15364b;

    public B(boolean z6, int i6) {
        this.f15363a = z6;
        this.f15364b = z6 ? W6.o.a() : new java.util.LinkedHashMap(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M h(W6.B b6, java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(list, "values");
        b6.d(str, list);
        return p087i7.M.f46721a;
    }

    private final java.util.List j(java.lang.String str) {
        java.util.List list = (java.util.List) this.f15364b.get(str);
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        o(str);
        this.f15364b.put(str, arrayList);
        return arrayList;
    }

    @Override // W6.z
    public java.util.Set a() {
        return W6.n.a(this.f15364b.entrySet());
    }

    @Override // W6.z
    public final boolean b() {
        return this.f15363a;
    }

    @Override // W6.z
    public java.util.List c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return (java.util.List) this.f15364b.get(str);
    }

    @Override // W6.z
    public void clear() {
        this.f15364b.clear();
    }

    @Override // W6.z
    public void d(java.lang.String str, java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(iterable, "values");
        java.util.List listJ = j(str);
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p((java.lang.String) it.next());
        }
        p097j7.AbstractC6879v.C(listJ, iterable);
    }

    @Override // W6.z
    public void e(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "value");
        p(str2);
        j(str).add(str2);
    }

    public void g(W6.y yVar) {
        p247y7.AbstractC7350t.f(yVar, "stringValues");
        yVar.e(new p237x7.p() { // from class: W6.A
            @Override // p237x7.p
            public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return W6.B.h(this.f15362C, (java.lang.String) obj, (java.util.List) obj2);
            }
        });
    }

    @Override // W6.z
    public boolean isEmpty() {
        return this.f15364b.isEmpty();
    }

    public java.lang.String k(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        java.util.List listC = c(str);
        if (listC != null) {
            return (java.lang.String) p097j7.AbstractC6879v.k0(listC);
        }
        return null;
    }

    protected final java.util.Map l() {
        return this.f15364b;
    }

    public void m(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        this.f15364b.remove(str);
    }

    public void n(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "value");
        p(str2);
        java.util.List listJ = j(str);
        listJ.clear();
        listJ.add(str2);
    }

    @Override // W6.z
    public java.util.Set names() {
        return this.f15364b.keySet();
    }

    protected void o(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
    }

    protected void p(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
    }
}
