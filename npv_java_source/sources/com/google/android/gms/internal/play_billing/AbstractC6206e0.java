package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6206e0 extends com.google.android.gms.internal.play_billing.Z implements java.util.List, java.util.RandomAccess, j$.util.List {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.O0 f41546D = new com.google.android.gms.internal.play_billing.C6188b0(com.google.android.gms.internal.play_billing.B0.f41326H, 0);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f41547E = 0;

    AbstractC6206e0() {
    }

    static com.google.android.gms.internal.play_billing.AbstractC6206e0 C(java.lang.Object[] objArr, int i6) {
        return i6 == 0 ? com.google.android.gms.internal.play_billing.B0.f41326H : new com.google.android.gms.internal.play_billing.B0(objArr, i6);
    }

    public static com.google.android.gms.internal.play_billing.AbstractC6206e0 D(java.util.Collection collection) {
        if (!(collection instanceof com.google.android.gms.internal.play_billing.Z)) {
            java.lang.Object[] array = collection.toArray();
            int length = array.length;
            com.google.android.gms.internal.play_billing.AbstractC6301u0.b(array, length);
            return C(array, length);
        }
        com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0G = ((com.google.android.gms.internal.play_billing.Z) collection).g();
        if (!abstractC6206e0G.n()) {
            return abstractC6206e0G;
        }
        java.lang.Object[] array2 = abstractC6206e0G.toArray();
        return C(array2, array2.length);
    }

    public static com.google.android.gms.internal.play_billing.AbstractC6206e0 E() {
        return com.google.android.gms.internal.play_billing.B0.f41326H;
    }

    public static com.google.android.gms.internal.play_billing.AbstractC6206e0 M(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        com.google.android.gms.internal.play_billing.AbstractC6301u0.b(objArr, 1);
        return C(objArr, 1);
    }

    public static j$.util.stream.Collector O() {
        return com.google.android.gms.internal.play_billing.K.a();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.O0 listIterator(int i6) {
        com.google.android.gms.internal.play_billing.AbstractC6294t.b(i6, size(), "index");
        return isEmpty() ? f41546D : new com.google.android.gms.internal.play_billing.C6188b0(this, i6);
    }

    @Override // java.util.List
    public final void add(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i6, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
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
                        if (com.google.android.gms.internal.play_billing.AbstractC6288s.a(get(i6), list.get(i6))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && com.google.android.gms.internal.play_billing.AbstractC6288s.a(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final com.google.android.gms.internal.play_billing.AbstractC6206e0 g() {
        return this;
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

    public int indexOf(java.lang.Object obj) {
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

    public int lastIndexOf(java.lang.Object obj) {
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
    public final java.lang.Object remove(int i6) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        j$.util.List.CC.$default$replaceAll(this, unaryOperator);
    }

    public com.google.android.gms.internal.play_billing.AbstractC6206e0 s() {
        return size() <= 1 ? this : new com.google.android.gms.internal.play_billing.C6194c0(this);
    }

    @Override // java.util.List
    public final java.lang.Object set(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(java.util.Comparator comparator) {
        j$.util.List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.play_billing.AbstractC6206e0 subList(int i6, int i10) {
        com.google.android.gms.internal.play_billing.AbstractC6294t.e(i6, i10, size());
        int i11 = i10 - i6;
        if (i11 == size()) {
            return this;
        }
        return i11 == 0 ? com.google.android.gms.internal.play_billing.B0.f41326H : new com.google.android.gms.internal.play_billing.C6200d0(this, i6, i11);
    }
}
