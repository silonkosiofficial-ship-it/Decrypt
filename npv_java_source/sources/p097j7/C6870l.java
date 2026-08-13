package p097j7;

/* JADX INFO: renamed from: j7.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6870l implements java.util.Collection, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object[] f49308C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f49309D;

    public C6870l(java.lang.Object[] objArr, boolean z6) {
        p247y7.AbstractC7350t.f(objArr, "values");
        this.f49308C = objArr;
        this.f49309D = z6;
    }

    @Override // java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return p097j7.AbstractC6872n.T(this.f49308C, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        java.util.Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int d() {
        return this.f49308C.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f49308C.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return p247y7.AbstractC7334c.a(this.f49308C);
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return p097j7.AbstractC6880w.b(this.f49308C, this.f49309D);
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "array");
        return p247y7.AbstractC7341j.b(this, objArr);
    }
}
