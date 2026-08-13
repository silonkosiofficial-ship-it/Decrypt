package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I0 extends p055f4.F0 implements java.util.List, java.util.RandomAccess, j$.util.List {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final p055f4.P0 f45046D = new p055f4.G0(p055f4.L0.f45054H, 0);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f45047E = 0;

    I0() {
    }

    static p055f4.I0 o(java.lang.Object[] objArr, int i6) {
        return i6 == 0 ? p055f4.L0.f45054H : new p055f4.L0(objArr, i6);
    }

    @Override // java.util.List
    public final void add(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i6, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p055f4.F0
    int d(java.lang.Object[] objArr, int i6) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i6 = 0; i6 < size; i6++) {
                        if (p055f4.AbstractC6593z0.a(get(i6), list.get(i6))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && p055f4.AbstractC6593z0.a(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i6 = 0; i6 < size; i6++) {
            iHashCode = (iHashCode * 31) + get(i6).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (obj.equals(get(i6))) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public p055f4.I0 subList(int i6, int i10) {
        p055f4.A0.c(i6, i10, size());
        int i11 = i10 - i6;
        if (i11 == size()) {
            return this;
        }
        return i11 == 0 ? p055f4.L0.f45054H : new p055f4.H0(this, i6, i11);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i6) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        j$.util.List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final p055f4.P0 listIterator(int i6) {
        p055f4.A0.b(i6, size(), "index");
        return isEmpty() ? f45046D : new p055f4.G0(this, i6);
    }

    @Override // java.util.List
    public final java.lang.Object set(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(java.util.Comparator comparator) {
        j$.util.List.CC.$default$sort(this, comparator);
    }
}
