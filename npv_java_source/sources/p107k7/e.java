package p107k7;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends p107k7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p107k7.d f49756C;

    public e(p107k7.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "backing");
        this.f49756C = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f49756C.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        return this.f49756C.q(collection);
    }

    @Override // p097j7.AbstractC6868j
    public int d() {
        return this.f49756C.size();
    }

    @Override // p107k7.a
    public boolean f(java.util.Map.Entry entry) {
        p247y7.AbstractC7350t.f(entry, "element");
        return this.f49756C.r(entry);
    }

    @Override // p107k7.a
    public boolean g(java.util.Map.Entry entry) {
        p247y7.AbstractC7350t.f(entry, "element");
        return this.f49756C.P(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f49756C.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return this.f49756C.x();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean add(java.util.Map.Entry entry) {
        p247y7.AbstractC7350t.f(entry, "element");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        this.f49756C.o();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        this.f49756C.o();
        return super.retainAll(collection);
    }
}
