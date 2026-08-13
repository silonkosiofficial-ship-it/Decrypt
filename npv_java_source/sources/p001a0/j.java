package p001a0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p097j7.AbstractC6868j implements java.util.Set, p256z7.f {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p001a0.f f17015C;

    public j(p001a0.f fVar) {
        this.f17015C = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f17015C.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this.f17015C.containsKey(obj);
    }

    @Override // p097j7.AbstractC6868j
    public int d() {
        return this.f17015C.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new p001a0.k(this.f17015C);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        if (!this.f17015C.containsKey(obj)) {
            return false;
        }
        this.f17015C.remove(obj);
        return true;
    }
}
