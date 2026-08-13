package P7;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements P7.g {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f8388C;

    public h(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "annotations");
        this.f8388C = list;
    }

    @Override // P7.g
    public boolean H(p138n8.c cVar) {
        return P7.g.b.b(this, cVar);
    }

    @Override // P7.g
    public boolean isEmpty() {
        return this.f8388C.isEmpty();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f8388C.iterator();
    }

    @Override // P7.g
    public P7.c j(p138n8.c cVar) {
        return P7.g.b.a(this, cVar);
    }

    public java.lang.String toString() {
        return this.f8388C.toString();
    }
}
