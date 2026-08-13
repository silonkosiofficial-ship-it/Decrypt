package C9;

/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f1395b;

    public I(java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(str, "initialRoute");
        p247y7.AbstractC7350t.f(list, "routes");
        this.f1394a = str;
        this.f1395b = list;
    }

    public final java.lang.String a() {
        return this.f1394a;
    }

    public final java.util.List b() {
        return this.f1395b;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C9.I)) {
            return false;
        }
        C9.I i6 = (C9.I) obj;
        if (!p247y7.AbstractC7350t.b(this.f1394a, i6.f1394a) || this.f1395b.size() != i6.f1395b.size()) {
            return false;
        }
        java.util.List list = this.f1395b;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((D9.c) it.next()).b());
        }
        java.util.List list2 = i6.f1395b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((D9.c) it2.next()).b());
        }
        return arrayList.containsAll(arrayList2);
    }

    public int hashCode() {
        return (this.f1394a.hashCode() * 31) + this.f1395b.hashCode();
    }

    public java.lang.String toString() {
        return "RouteGraph(initialRoute=" + this.f1394a + ", routes=" + this.f1395b + ")";
    }
}
