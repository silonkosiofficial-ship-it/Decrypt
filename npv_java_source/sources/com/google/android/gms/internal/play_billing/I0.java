package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class I0 extends com.google.android.gms.internal.play_billing.AbstractC6254m0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static final com.google.android.gms.internal.play_billing.I0 f41417H;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final transient com.google.android.gms.internal.play_billing.AbstractC6206e0 f41418G;

    static {
        int i6 = com.google.android.gms.internal.play_billing.AbstractC6206e0.f41547E;
        f41417H = new com.google.android.gms.internal.play_billing.I0(com.google.android.gms.internal.play_billing.B0.f41326H, com.google.android.gms.internal.play_billing.C6295t0.f41656C);
    }

    I0(com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0, java.util.Comparator comparator) {
        super(comparator);
        this.f41418G = abstractC6206e0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6254m0
    final com.google.android.gms.internal.play_billing.AbstractC6254m0 M() {
        java.util.Comparator comparatorReverseOrder = java.util.Collections.reverseOrder(this.f41588E);
        return isEmpty() ? com.google.android.gms.internal.play_billing.AbstractC6254m0.R(comparatorReverseOrder) : new com.google.android.gms.internal.play_billing.I0(this.f41418G.s(), comparatorReverseOrder);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6254m0
    final com.google.android.gms.internal.play_billing.AbstractC6254m0 N(java.lang.Object obj, boolean z6) {
        return V(0, T(obj, z6));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6254m0
    final com.google.android.gms.internal.play_billing.AbstractC6254m0 P(java.lang.Object obj, boolean z6, java.lang.Object obj2, boolean z10) {
        return Q(obj, z6).N(obj2, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6254m0
    final com.google.android.gms.internal.play_billing.AbstractC6254m0 Q(java.lang.Object obj, boolean z6) {
        return V(U(obj, z6), this.f41418G.size());
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.N0 descendingIterator() {
        return this.f41418G.s().listIterator(0);
    }

    final int T(java.lang.Object obj, boolean z6) {
        obj.getClass();
        int iBinarySearch = java.util.Collections.binarySearch(this.f41418G, obj, this.f41588E);
        if (iBinarySearch >= 0) {
            return z6 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    final int U(java.lang.Object obj, boolean z6) {
        obj.getClass();
        int iBinarySearch = java.util.Collections.binarySearch(this.f41418G, obj, this.f41588E);
        if (iBinarySearch >= 0) {
            return z6 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    final com.google.android.gms.internal.play_billing.I0 V(int i6, int i10) {
        if (i6 == 0) {
            if (i10 == this.f41418G.size()) {
                return this;
            }
            i6 = 0;
        }
        if (i6 >= i10) {
            return com.google.android.gms.internal.play_billing.AbstractC6254m0.R(this.f41588E);
        }
        com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0 = this.f41418G;
        return new com.google.android.gms.internal.play_billing.I0(abstractC6206e0.subList(i6, i10), this.f41588E);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object ceiling(java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0 = this.f41418G;
        int iU = U(obj, true);
        if (iU == abstractC6206e0.size()) {
            return null;
        }
        return this.f41418G.get(iU);
    }

    @Override // com.google.android.gms.internal.play_billing.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj != null) {
            try {
                if (java.util.Collections.binarySearch(this.f41418G, obj, this.f41588E) >= 0) {
                    return true;
                }
            } catch (java.lang.ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        if (collection instanceof com.google.android.gms.internal.play_billing.InterfaceC6289s0) {
            collection = ((com.google.android.gms.internal.play_billing.InterfaceC6289s0) collection).a();
        }
        if (!com.google.android.gms.internal.play_billing.M0.a(this.f41588E, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        com.google.android.gms.internal.play_billing.O0 o0ListIterator = this.f41418G.listIterator(0);
        java.util.Iterator it = collection.iterator();
        if (!o0ListIterator.hasNext()) {
            return false;
        }
        java.lang.Object next = it.next();
        E next2 = o0ListIterator.next();
        while (true) {
            try {
                int iCompare = this.f41588E.compare(next2, next);
                if (iCompare < 0) {
                    if (!o0ListIterator.hasNext()) {
                        return false;
                    }
                    next2 = o0ListIterator.next();
                } else {
                    if (iCompare != 0) {
                        return false;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int d(java.lang.Object[] objArr, int i6) {
        return this.f41418G.d(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int e() {
        return this.f41418G.e();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6248l0, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (this.f41418G.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!com.google.android.gms.internal.play_billing.M0.a(this.f41588E, set)) {
            return containsAll(set);
        }
        java.util.Iterator it = set.iterator();
        try {
            com.google.android.gms.internal.play_billing.O0 o0ListIterator = this.f41418G.listIterator(0);
            while (o0ListIterator.hasNext()) {
                E next = o0ListIterator.next();
                java.lang.Object next2 = it.next();
                if (next2 == null || this.f41588E.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.util.NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int f() {
        return this.f41418G.f();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.f41418G.get(0);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object floor(java.lang.Object obj) {
        int iT = T(obj, true) - 1;
        if (iT == -1) {
            return null;
        }
        return this.f41418G.get(iT);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6248l0, com.google.android.gms.internal.play_billing.Z
    public final com.google.android.gms.internal.play_billing.AbstractC6206e0 g() {
        return this.f41418G;
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object higher(java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0 = this.f41418G;
        int iU = U(obj, false);
        if (iU == abstractC6206e0.size()) {
            return null;
        }
        return this.f41418G.get(iU);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.f41418G.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0 = this.f41418G;
        return abstractC6206e0.get(abstractC6206e0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object lower(java.lang.Object obj) {
        int iT = T(obj, false) - 1;
        if (iT == -1) {
            return null;
        }
        return this.f41418G.get(iT);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final java.lang.Object[] o() {
        return this.f41418G.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41418G.size();
    }
}
