package W6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C implements W6.y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f15365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f15366d;

    public C(boolean z6, java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "values");
        this.f15365c = z6;
        java.util.Map mapA = z6 ? W6.o.a() : new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add((java.lang.String) list.get(i6));
            }
            mapA.put(str, arrayList);
        }
        this.f15366d = mapA;
    }

    private final java.util.List f(java.lang.String str) {
        return (java.util.List) this.f15366d.get(str);
    }

    @Override // W6.y
    public java.util.Set a() {
        return W6.n.a(this.f15366d.entrySet());
    }

    @Override // W6.y
    public final boolean b() {
        return this.f15365c;
    }

    @Override // W6.y
    public java.util.List c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return f(str);
    }

    @Override // W6.y
    public java.lang.String d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        java.util.List listF = f(str);
        if (listF != null) {
            return (java.lang.String) p097j7.AbstractC6879v.k0(listF);
        }
        return null;
    }

    @Override // W6.y
    public void e(p237x7.p pVar) {
        p247y7.AbstractC7350t.f(pVar, "body");
        for (java.util.Map.Entry entry : this.f15366d.entrySet()) {
            pVar.u((java.lang.String) entry.getKey(), (java.util.List) entry.getValue());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W6.y)) {
            return false;
        }
        W6.y yVar = (W6.y) obj;
        if (this.f15365c != yVar.b()) {
            return false;
        }
        return W6.D.d(a(), yVar.a());
    }

    public int hashCode() {
        return W6.D.e(a(), p190t.h.a(this.f15365c) * 31);
    }

    @Override // W6.y
    public boolean isEmpty() {
        return this.f15366d.isEmpty();
    }

    @Override // W6.y
    public java.util.Set names() {
        return W6.n.a(this.f15366d.keySet());
    }
}
