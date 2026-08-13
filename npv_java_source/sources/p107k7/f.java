package p107k7;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends p097j7.AbstractC6868j implements java.util.Set, p256z7.f {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p107k7.d f49757C;

    public f(p107k7.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "backing");
        this.f49757C = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f49757C.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this.f49757C.containsKey(obj);
    }

    @Override // p097j7.AbstractC6868j
    public int d() {
        return this.f49757C.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f49757C.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return this.f49757C.J();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        return this.f49757C.S(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        this.f49757C.o();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        this.f49757C.o();
        return super.retainAll(collection);
    }
}
