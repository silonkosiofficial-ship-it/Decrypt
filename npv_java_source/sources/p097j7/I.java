package p097j7;

/* JADX INFO: loaded from: classes3.dex */
public final class I implements java.util.List, java.io.Serializable, java.util.RandomAccess, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final p097j7.I f49284C = new p097j7.I();

    private I() {
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i6, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.Void) {
            return d((java.lang.Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        return collection.isEmpty();
    }

    public boolean d(java.lang.Void r6) {
        p247y7.AbstractC7350t.f(r6, "element");
        return false;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public java.lang.Void get(int i6) {
        throw new java.lang.IndexOutOfBoundsException("Empty list doesn't contain element at index " + i6 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.List) && ((java.util.List) obj).isEmpty();
    }

    public int f() {
        return 0;
    }

    public int g(java.lang.Void r6) {
        p247y7.AbstractC7350t.f(r6, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Void) {
            return g((java.lang.Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return p097j7.H.f49283C;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Void) {
            return o((java.lang.Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return p097j7.H.f49283C;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i6) {
        if (i6 == 0) {
            return p097j7.H.f49283C;
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i6);
    }

    public int o(java.lang.Void r6) {
        p247y7.AbstractC7350t.f(r6, "element");
        return -1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int i6) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.List
    public java.util.List subList(int i6, int i10) {
        if (i6 == 0 && i10 == 0) {
            return this;
        }
        throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i6 + ", toIndex: " + i10);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return p247y7.AbstractC7341j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "array");
        return p247y7.AbstractC7341j.b(this, objArr);
    }

    public java.lang.String toString() {
        return "[]";
    }
}
