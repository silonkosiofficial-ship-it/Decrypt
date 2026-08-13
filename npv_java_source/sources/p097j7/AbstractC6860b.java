package p097j7;

/* JADX INFO: renamed from: j7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6860b implements java.util.Collection, p256z7.a {
    protected AbstractC6860b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence f(p097j7.AbstractC6860b abstractC6860b, java.lang.Object obj) {
        return obj == abstractC6860b ? "(this Collection)" : java.lang.String.valueOf(obj);
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

    @Override // java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        if (isEmpty()) {
            return false;
        }
        java.util.Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (p247y7.AbstractC7350t.b(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
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

    public abstract int e();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
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
        return e();
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return p247y7.AbstractC7341j.a(this);
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "array");
        return p247y7.AbstractC7341j.b(this, objArr);
    }

    public java.lang.String toString() {
        return p097j7.AbstractC6879v.r0(this, ", ", "[", "]", 0, null, new p237x7.l() { // from class: j7.a
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return p097j7.AbstractC6860b.f(this.f49295C, obj);
            }
        }, 24, null);
    }
}
