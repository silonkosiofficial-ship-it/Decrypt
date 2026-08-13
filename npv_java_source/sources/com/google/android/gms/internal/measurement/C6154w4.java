package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6154w4 extends com.google.android.gms.internal.measurement.F3 implements com.google.android.gms.internal.measurement.B4, com.google.android.gms.internal.measurement.InterfaceC6055k5, java.util.RandomAccess {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int[] f41266F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.C6154w4 f41267G;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int[] f41268D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f41269E;

    static {
        int[] iArr = new int[0];
        f41266F = iArr;
        f41267G = new com.google.android.gms.internal.measurement.C6154w4(iArr, 0, false);
    }

    private C6154w4(int[] iArr, int i6, boolean z6) {
        super(z6);
        this.f41268D = iArr;
        this.f41269E = i6;
    }

    public static com.google.android.gms.internal.measurement.C6154w4 f() {
        return f41267G;
    }

    private static int o(int i6) {
        return java.lang.Math.max(((i6 * 3) / 2) + 1, 10);
    }

    private final java.lang.String s(int i6) {
        return "Index:" + i6 + ", Size:" + this.f41269E;
    }

    private final void w(int i6) {
        if (i6 < 0 || i6 >= this.f41269E) {
            throw new java.lang.IndexOutOfBoundsException(s(i6));
        }
    }

    @Override // com.google.android.gms.internal.measurement.D4
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.B4 r(int i6) {
        if (i6 >= this.f41269E) {
            return new com.google.android.gms.internal.measurement.C6154w4(i6 == 0 ? f41266F : java.util.Arrays.copyOf(this.f41268D, i6), this.f41269E, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i6, java.lang.Object obj) {
        int i10;
        int iIntValue = ((java.lang.Integer) obj).intValue();
        d();
        if (i6 < 0 || i6 > (i10 = this.f41269E)) {
            throw new java.lang.IndexOutOfBoundsException(s(i6));
        }
        int[] iArr = this.f41268D;
        if (i10 < iArr.length) {
            java.lang.System.arraycopy(iArr, i6, iArr, i6 + 1, i10 - i6);
        } else {
            int[] iArr2 = new int[o(iArr.length)];
            java.lang.System.arraycopy(this.f41268D, 0, iArr2, 0, i6);
            java.lang.System.arraycopy(this.f41268D, i6, iArr2, i6 + 1, this.f41269E - i6);
            this.f41268D = iArr2;
        }
        this.f41268D[i6] = iIntValue;
        this.f41269E++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        g(((java.lang.Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.F3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        d();
        com.google.android.gms.internal.measurement.AbstractC6146v4.e(collection);
        if (!(collection instanceof com.google.android.gms.internal.measurement.C6154w4)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) collection;
        int i6 = c6154w4.f41269E;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f41269E;
        if (Integer.MAX_VALUE - i10 < i6) {
            throw new java.lang.OutOfMemoryError();
        }
        int i11 = i10 + i6;
        int[] iArr = this.f41268D;
        if (i11 > iArr.length) {
            this.f41268D = java.util.Arrays.copyOf(iArr, i11);
        }
        java.lang.System.arraycopy(c6154w4.f41268D, 0, this.f41268D, this.f41269E, c6154w4.f41269E);
        this.f41269E = i11;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i6) {
        w(i6);
        return this.f41268D[i6];
    }

    @Override // com.google.android.gms.internal.measurement.F3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.C6154w4)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) obj;
        if (this.f41269E != c6154w4.f41269E) {
            return false;
        }
        int[] iArr = c6154w4.f41268D;
        for (int i6 = 0; i6 < this.f41269E; i6++) {
            if (this.f41268D[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i6) {
        d();
        int i10 = this.f41269E;
        int[] iArr = this.f41268D;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[o(iArr.length)];
            java.lang.System.arraycopy(this.f41268D, 0, iArr2, 0, this.f41269E);
            this.f41268D = iArr2;
        }
        int[] iArr3 = this.f41268D;
        int i11 = this.f41269E;
        this.f41269E = i11 + 1;
        iArr3[i11] = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i6) {
        return java.lang.Integer.valueOf(e(i6));
    }

    @Override // com.google.android.gms.internal.measurement.F3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f41269E; i10++) {
            i6 = (i6 * 31) + this.f41268D[i10];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (this.f41268D[i6] == iIntValue) {
                return i6;
            }
        }
        return -1;
    }

    final void n(int i6) {
        int[] iArr = this.f41268D;
        if (i6 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f41268D = new int[java.lang.Math.max(i6, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i6) {
            length = o(length);
        }
        this.f41268D = java.util.Arrays.copyOf(this.f41268D, length);
    }

    @Override // com.google.android.gms.internal.measurement.F3, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i6) {
        d();
        w(i6);
        int[] iArr = this.f41268D;
        int i10 = iArr[i6];
        int i11 = this.f41269E;
        if (i6 < i11 - 1) {
            java.lang.System.arraycopy(iArr, i6 + 1, iArr, i6, (i11 - i6) - 1);
        }
        this.f41269E--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i6, int i10) {
        d();
        if (i10 < i6) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f41268D;
        java.lang.System.arraycopy(iArr, i10, iArr, i6, this.f41269E - i10);
        this.f41269E -= i10 - i6;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i6, java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        d();
        w(i6);
        int[] iArr = this.f41268D;
        int i10 = iArr[i6];
        iArr[i6] = iIntValue;
        return java.lang.Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41269E;
    }
}
