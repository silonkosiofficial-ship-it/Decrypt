package p001a0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p097j7.AbstractC6865g implements java.util.Collection, p256z7.b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p001a0.f f17016C;

    public l(p001a0.f fVar) {
        this.f17016C = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f17016C.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f17016C.containsValue(obj);
    }

    @Override // p097j7.AbstractC6865g
    public int d() {
        return this.f17016C.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new p001a0.m(this.f17016C);
    }
}
