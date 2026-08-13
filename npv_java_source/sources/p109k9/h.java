package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public class h implements p109k9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f49847a;

    public h(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "formats");
        this.f49847a = list;
    }

    @Override // p109k9.o
    public p119l9.e a() {
        java.util.List list = this.f49847a;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((p109k9.s) it.next()).a());
        }
        return arrayList.size() == 1 ? (p119l9.e) p097j7.AbstractC6879v.G0(arrayList) : new p119l9.a(arrayList);
    }

    @Override // p109k9.o
    public p129m9.q b() {
        java.util.List list = this.f49847a;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((p109k9.s) it.next()).b());
        }
        return p129m9.n.b(arrayList);
    }

    public final java.util.List c() {
        return this.f49847a;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p109k9.h) && p247y7.AbstractC7350t.b(this.f49847a, ((p109k9.h) obj).f49847a);
    }

    public int hashCode() {
        return this.f49847a.hashCode();
    }

    public java.lang.String toString() {
        return "ConcatenatedFormatStructure(" + p097j7.AbstractC6879v.r0(this.f49847a, ", ", null, null, 0, null, null, 62, null) + ')';
    }
}
