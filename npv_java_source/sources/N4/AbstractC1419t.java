package N4;

/* JADX INFO: renamed from: N4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1419t extends N4.u implements java.util.NavigableSet, N4.O {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final transient java.util.Comparator f7784E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    transient N4.AbstractC1419t f7785F;

    AbstractC1419t(java.util.Comparator comparator) {
        this.f7784E = comparator;
    }

    static N4.AbstractC1419t R(java.util.Comparator comparator, int i6, java.lang.Object... objArr) {
        if (i6 == 0) {
            return W(comparator);
        }
        N4.F.c(objArr, i6);
        java.util.Arrays.sort(objArr, 0, i6, comparator);
        int i10 = 1;
        for (int i11 = 1; i11 < i6; i11++) {
            java.lang.Object obj = objArr[i11];
            if (comparator.compare(obj, objArr[i10 - 1]) != 0) {
                objArr[i10] = obj;
                i10++;
            }
        }
        java.util.Arrays.fill(objArr, i10, i6, (java.lang.Object) null);
        if (i10 < objArr.length / 2) {
            objArr = java.util.Arrays.copyOf(objArr, i10);
        }
        return new N4.L(N4.AbstractC1415o.s(objArr, i10), comparator);
    }

    public static N4.AbstractC1419t S(java.util.Comparator comparator, java.lang.Iterable iterable) {
        M4.h.i(comparator);
        if (N4.P.b(comparator, iterable) && (iterable instanceof N4.AbstractC1419t)) {
            N4.AbstractC1419t abstractC1419t = (N4.AbstractC1419t) iterable;
            if (!abstractC1419t.n()) {
                return abstractC1419t;
            }
        }
        java.lang.Object[] objArrB = N4.v.b(iterable);
        return R(comparator, objArrB.length, objArrB);
    }

    public static N4.AbstractC1419t T(java.util.Comparator comparator, java.util.Collection collection) {
        return S(comparator, collection);
    }

    static N4.L W(java.util.Comparator comparator) {
        return N4.G.c().equals(comparator) ? N4.L.f7710H : new N4.L(N4.AbstractC1415o.M(), comparator);
    }

    static int h0(java.util.Comparator comparator, java.lang.Object obj, java.lang.Object obj2) {
        return comparator.compare(obj, obj2);
    }

    abstract N4.AbstractC1419t U();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public N4.AbstractC1419t descendingSet() {
        N4.AbstractC1419t abstractC1419t = this.f7785F;
        if (abstractC1419t != null) {
            return abstractC1419t;
        }
        N4.AbstractC1419t abstractC1419tU = U();
        this.f7785F = abstractC1419tU;
        abstractC1419tU.f7785F = this;
        return abstractC1419tU;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public N4.AbstractC1419t headSet(java.lang.Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public N4.AbstractC1419t headSet(java.lang.Object obj, boolean z6) {
        return Z(M4.h.i(obj), z6);
    }

    abstract N4.AbstractC1419t Z(java.lang.Object obj, boolean z6);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public N4.AbstractC1419t subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public N4.AbstractC1419t subSet(java.lang.Object obj, boolean z6, java.lang.Object obj2, boolean z10) {
        M4.h.i(obj);
        M4.h.i(obj2);
        M4.h.d(this.f7784E.compare(obj, obj2) <= 0);
        return c0(obj, z6, obj2, z10);
    }

    abstract N4.AbstractC1419t c0(java.lang.Object obj, boolean z6, java.lang.Object obj2, boolean z10);

    @Override // java.util.SortedSet, N4.O
    public java.util.Comparator comparator() {
        return this.f7784E;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public N4.AbstractC1419t tailSet(java.lang.Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public N4.AbstractC1419t tailSet(java.lang.Object obj, boolean z6) {
        return f0(M4.h.i(obj), z6);
    }

    abstract N4.AbstractC1419t f0(java.lang.Object obj, boolean z6);

    int g0(java.lang.Object obj, java.lang.Object obj2) {
        return h0(this.f7784E, obj, obj2);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollFirst() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollLast() {
        throw new java.lang.UnsupportedOperationException();
    }
}
