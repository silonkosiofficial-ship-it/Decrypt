package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ci0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3398ci0 extends com.google.android.gms.internal.ads.AbstractC3011Xh0 implements java.util.List, java.util.RandomAccess, j$.util.List {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4277kj0 f34558D = new com.google.android.gms.internal.ads.C3179ai0(com.google.android.gms.internal.ads.C2685Oi0.f30551H, 0);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f34559E = 0;

    AbstractC3398ci0() {
    }

    public static com.google.android.gms.internal.ads.C3083Zh0 C(int i6) {
        com.google.android.gms.internal.ads.AbstractC5812yh0.a(i6, "expectedSize");
        return new com.google.android.gms.internal.ads.C3083Zh0(i6);
    }

    static com.google.android.gms.internal.ads.AbstractC3398ci0 D(java.lang.Object[] objArr, int i6) {
        return i6 == 0 ? com.google.android.gms.internal.ads.C2685Oi0.f30551H : new com.google.android.gms.internal.ads.C2685Oi0(objArr, i6);
    }

    public static com.google.android.gms.internal.ads.AbstractC3398ci0 E(java.lang.Iterable iterable) {
        iterable.getClass();
        return M((java.util.Collection) iterable);
    }

    public static com.google.android.gms.internal.ads.AbstractC3398ci0 M(java.util.Collection collection) {
        if (!(collection instanceof com.google.android.gms.internal.ads.AbstractC3011Xh0)) {
            java.lang.Object[] array = collection.toArray();
            int length = array.length;
            com.google.android.gms.internal.ads.AbstractC2611Mi0.b(array, length);
            return D(array, length);
        }
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0G = ((com.google.android.gms.internal.ads.AbstractC3011Xh0) collection).g();
        if (!abstractC3398ci0G.o()) {
            return abstractC3398ci0G;
        }
        java.lang.Object[] array2 = abstractC3398ci0G.toArray();
        return D(array2, array2.length);
    }

    public static com.google.android.gms.internal.ads.AbstractC3398ci0 N(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            return com.google.android.gms.internal.ads.C2685Oi0.f30551H;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr.clone();
        int length = objArr2.length;
        com.google.android.gms.internal.ads.AbstractC2611Mi0.b(objArr2, length);
        return D(objArr2, length);
    }

    public static com.google.android.gms.internal.ads.AbstractC3398ci0 O() {
        return com.google.android.gms.internal.ads.C2685Oi0.f30551H;
    }

    public static com.google.android.gms.internal.ads.AbstractC3398ci0 P(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        com.google.android.gms.internal.ads.AbstractC2611Mi0.b(objArr, 1);
        return D(objArr, 1);
    }

    public static com.google.android.gms.internal.ads.AbstractC3398ci0 Q(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = {obj, obj2};
        com.google.android.gms.internal.ads.AbstractC2611Mi0.b(objArr, 2);
        return D(objArr, 2);
    }

    public static com.google.android.gms.internal.ads.AbstractC3398ci0 R(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object[] objArr = {obj, obj2, obj3};
        com.google.android.gms.internal.ads.AbstractC2611Mi0.b(objArr, 3);
        return D(objArr, 3);
    }

    public static com.google.android.gms.internal.ads.AbstractC3398ci0 S(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        com.google.android.gms.internal.ads.AbstractC2611Mi0.b(objArr, 5);
        return D(objArr, 5);
    }

    public static com.google.android.gms.internal.ads.AbstractC3398ci0 T(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        java.lang.Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        com.google.android.gms.internal.ads.AbstractC2611Mi0.b(objArr, 6);
        return D(objArr, 6);
    }

    public static com.google.android.gms.internal.ads.AbstractC3398ci0 U(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object... objArr) {
        int length = objArr.length;
        int i6 = length + 12;
        java.lang.Object[] objArr2 = new java.lang.Object[i6];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        java.lang.System.arraycopy(objArr, 0, objArr2, 12, length);
        com.google.android.gms.internal.ads.AbstractC2611Mi0.b(objArr2, i6);
        return D(objArr2, i6);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.AbstractC4277kj0 listIterator(int i6) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.b(i6, size(), "index");
        return isEmpty() ? f34558D : new com.google.android.gms.internal.ads.C3179ai0(this, i6);
    }

    @Override // java.util.List
    public final void add(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i6, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    int d(java.lang.Object[] objArr, int i6) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i6 + i10] = get(i10);
        }
        return i6 + size;
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
                        if (com.google.android.gms.internal.ads.AbstractC5700xg0.a(get(i6), list.get(i6))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && com.google.android.gms.internal.ads.AbstractC5700xg0.a(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    public final com.google.android.gms.internal.ads.AbstractC3398ci0 g() {
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

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    public final com.google.android.gms.internal.ads.AbstractC4167jj0 n() {
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
    public com.google.android.gms.internal.ads.AbstractC3398ci0 subList(int i6, int i10) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.k(i6, i10, size());
        int i11 = i10 - i6;
        if (i11 == size()) {
            return this;
        }
        return i11 == 0 ? com.google.android.gms.internal.ads.C2685Oi0.f30551H : new com.google.android.gms.internal.ads.C3289bi0(this, i6, i11);
    }
}
