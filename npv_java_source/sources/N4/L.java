package N4;

/* JADX INFO: loaded from: classes3.dex */
final class L extends N4.AbstractC1419t {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static final N4.L f7710H = new N4.L(N4.AbstractC1415o.M(), N4.G.c());

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final transient N4.AbstractC1415o f7711G;

    L(N4.AbstractC1415o abstractC1415o, java.util.Comparator comparator) {
        super(comparator);
        this.f7711G = abstractC1415o;
    }

    private int n0(java.lang.Object obj) {
        return java.util.Collections.binarySearch(this.f7711G, obj, o0());
    }

    @Override // N4.AbstractC1419t
    N4.AbstractC1419t U() {
        java.util.Comparator comparatorReverseOrder = java.util.Collections.reverseOrder(this.f7784E);
        return isEmpty() ? N4.AbstractC1419t.W(comparatorReverseOrder) : new N4.L(this.f7711G.Q(), comparatorReverseOrder);
    }

    @Override // N4.AbstractC1419t
    N4.AbstractC1419t Z(java.lang.Object obj, boolean z6) {
        return j0(0, k0(obj, z6));
    }

    @Override // N4.AbstractC1419t
    N4.AbstractC1419t c0(java.lang.Object obj, boolean z6, java.lang.Object obj2, boolean z10) {
        return f0(obj, z6).Z(obj2, z10);
    }

    @Override // java.util.NavigableSet
    public java.lang.Object ceiling(java.lang.Object obj) {
        int iM0 = m0(obj, true);
        if (iM0 == size()) {
            return null;
        }
        return this.f7711G.get(iM0);
    }

    @Override // N4.AbstractC1414n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return n0(obj) >= 0;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection collection) {
        if (collection instanceof N4.C) {
            collection = ((N4.C) collection).t();
        }
        if (!N4.P.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        N4.S it = iterator();
        java.util.Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        java.lang.Object next = it2.next();
        java.lang.Object next2 = it.next();
        while (true) {
            try {
                int iG0 = g0(next2, next);
                if (iG0 < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iG0 == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iG0 > 0) {
                    return false;
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
    }

    @Override // N4.AbstractC1414n
    int d(java.lang.Object[] objArr, int i6) {
        return this.f7711G.d(objArr, i6);
    }

    @Override // N4.AbstractC1414n
    java.lang.Object[] e() {
        return this.f7711G.e();
    }

    @Override // N4.r, java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!N4.P.b(this.f7784E, set)) {
            return containsAll(set);
        }
        java.util.Iterator it = set.iterator();
        try {
            N4.S it2 = iterator();
            while (it2.hasNext()) {
                java.lang.Object next = it2.next();
                java.lang.Object next2 = it.next();
                if (next2 == null || g0(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.util.NoSuchElementException unused) {
            return false;
        }
    }

    @Override // N4.AbstractC1414n
    int f() {
        return this.f7711G.f();
    }

    @Override // N4.AbstractC1419t
    N4.AbstractC1419t f0(java.lang.Object obj, boolean z6) {
        return j0(m0(obj, z6), size());
    }

    @Override // java.util.SortedSet
    public java.lang.Object first() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.f7711G.get(0);
    }

    @Override // java.util.NavigableSet
    public java.lang.Object floor(java.lang.Object obj) {
        int iK0 = k0(obj, true) - 1;
        if (iK0 == -1) {
            return null;
        }
        return this.f7711G.get(iK0);
    }

    @Override // N4.AbstractC1414n
    int g() {
        return this.f7711G.g();
    }

    @Override // java.util.NavigableSet
    public java.lang.Object higher(java.lang.Object obj) {
        int iM0 = m0(obj, false);
        if (iM0 == size()) {
            return null;
        }
        return this.f7711G.get(iM0);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public N4.S descendingIterator() {
        return this.f7711G.Q().iterator();
    }

    N4.L j0(int i6, int i10) {
        if (i6 == 0 && i10 == size()) {
            return this;
        }
        return i6 < i10 ? new N4.L(this.f7711G.subList(i6, i10), this.f7784E) : N4.AbstractC1419t.W(this.f7784E);
    }

    int k0(java.lang.Object obj, boolean z6) {
        int iBinarySearch = java.util.Collections.binarySearch(this.f7711G, M4.h.i(obj), comparator());
        if (iBinarySearch >= 0) {
            return z6 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public N4.S iterator() {
        return this.f7711G.iterator();
    }

    @Override // java.util.SortedSet
    public java.lang.Object last() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.f7711G.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public java.lang.Object lower(java.lang.Object obj) {
        int iK0 = k0(obj, false) - 1;
        if (iK0 == -1) {
            return null;
        }
        return this.f7711G.get(iK0);
    }

    int m0(java.lang.Object obj, boolean z6) {
        int iBinarySearch = java.util.Collections.binarySearch(this.f7711G, M4.h.i(obj), comparator());
        if (iBinarySearch >= 0) {
            return z6 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // N4.AbstractC1414n
    boolean n() {
        return this.f7711G.n();
    }

    java.util.Comparator o0() {
        return this.f7784E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f7711G.size();
    }
}
