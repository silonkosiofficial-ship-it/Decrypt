package p107k7;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends p097j7.AbstractC6865g implements java.util.Collection, p256z7.b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p107k7.d f49758C;

    public g(p107k7.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "backing");
        this.f49758C = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f49758C.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f49758C.containsValue(obj);
    }

    @Override // p097j7.AbstractC6865g
    public int d() {
        return this.f49758C.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f49758C.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f49758C.V();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return this.f49758C.T(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        this.f49758C.o();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        this.f49758C.o();
        return super.retainAll(collection);
    }
}
