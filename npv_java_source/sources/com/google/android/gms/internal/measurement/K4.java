package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class K4 extends com.google.android.gms.internal.measurement.F3 implements com.google.android.gms.internal.measurement.InterfaceC6178z4, com.google.android.gms.internal.measurement.InterfaceC6055k5, java.util.RandomAccess {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final long[] f40559F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.K4 f40560G;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long[] f40561D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f40562E;

    static {
        long[] jArr = new long[0];
        f40559F = jArr;
        f40560G = new com.google.android.gms.internal.measurement.K4(jArr, 0, false);
    }

    private K4(long[] jArr, int i6, boolean z6) {
        super(z6);
        this.f40561D = jArr;
        this.f40562E = i6;
    }

    public static com.google.android.gms.internal.measurement.K4 f() {
        return f40560G;
    }

    private static int n(int i6) {
        return java.lang.Math.max(((i6 * 3) / 2) + 1, 10);
    }

    private final java.lang.String o(int i6) {
        return "Index:" + i6 + ", Size:" + this.f40562E;
    }

    private final void s(int i6) {
        if (i6 < 0 || i6 >= this.f40562E) {
            throw new java.lang.IndexOutOfBoundsException(o(i6));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6178z4
    public final long B(int i6) {
        s(i6);
        return this.f40561D[i6];
    }

    @Override // com.google.android.gms.internal.measurement.D4
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.InterfaceC6178z4 r(int i6) {
        if (i6 >= this.f40562E) {
            return new com.google.android.gms.internal.measurement.K4(i6 == 0 ? f40559F : java.util.Arrays.copyOf(this.f40561D, i6), this.f40562E, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i6, java.lang.Object obj) {
        int i10;
        long jLongValue = ((java.lang.Long) obj).longValue();
        d();
        if (i6 < 0 || i6 > (i10 = this.f40562E)) {
            throw new java.lang.IndexOutOfBoundsException(o(i6));
        }
        long[] jArr = this.f40561D;
        if (i10 < jArr.length) {
            java.lang.System.arraycopy(jArr, i6, jArr, i6 + 1, i10 - i6);
        } else {
            long[] jArr2 = new long[n(jArr.length)];
            java.lang.System.arraycopy(this.f40561D, 0, jArr2, 0, i6);
            java.lang.System.arraycopy(this.f40561D, i6, jArr2, i6 + 1, this.f40562E - i6);
            this.f40561D = jArr2;
        }
        this.f40561D[i6] = jLongValue;
        this.f40562E++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        e(((java.lang.Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.F3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        d();
        com.google.android.gms.internal.measurement.AbstractC6146v4.e(collection);
        if (!(collection instanceof com.google.android.gms.internal.measurement.K4)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.measurement.K4 k6 = (com.google.android.gms.internal.measurement.K4) collection;
        int i6 = k6.f40562E;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f40562E;
        if (Integer.MAX_VALUE - i10 < i6) {
            throw new java.lang.OutOfMemoryError();
        }
        int i11 = i10 + i6;
        long[] jArr = this.f40561D;
        if (i11 > jArr.length) {
            this.f40561D = java.util.Arrays.copyOf(jArr, i11);
        }
        java.lang.System.arraycopy(k6.f40561D, 0, this.f40561D, this.f40562E, k6.f40562E);
        this.f40562E = i11;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(long j6) {
        d();
        int i6 = this.f40562E;
        long[] jArr = this.f40561D;
        if (i6 == jArr.length) {
            long[] jArr2 = new long[n(jArr.length)];
            java.lang.System.arraycopy(this.f40561D, 0, jArr2, 0, this.f40562E);
            this.f40561D = jArr2;
        }
        long[] jArr3 = this.f40561D;
        int i10 = this.f40562E;
        this.f40562E = i10 + 1;
        jArr3[i10] = j6;
    }

    @Override // com.google.android.gms.internal.measurement.F3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.K4)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.K4 k6 = (com.google.android.gms.internal.measurement.K4) obj;
        if (this.f40562E != k6.f40562E) {
            return false;
        }
        long[] jArr = k6.f40561D;
        for (int i6 = 0; i6 < this.f40562E; i6++) {
            if (this.f40561D[i6] != jArr[i6]) {
                return false;
            }
        }
        return true;
    }

    final void g(int i6) {
        long[] jArr = this.f40561D;
        if (i6 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f40561D = new long[java.lang.Math.max(i6, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i6) {
            length = n(length);
        }
        this.f40561D = java.util.Arrays.copyOf(this.f40561D, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i6) {
        return java.lang.Long.valueOf(B(i6));
    }

    @Override // com.google.android.gms.internal.measurement.F3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i6 = 0; i6 < this.f40562E; i6++) {
            iB = (iB * 31) + com.google.android.gms.internal.measurement.AbstractC6146v4.b(this.f40561D[i6]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (this.f40561D[i6] == jLongValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.F3, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i6) {
        d();
        s(i6);
        long[] jArr = this.f40561D;
        long j6 = jArr[i6];
        int i10 = this.f40562E;
        if (i6 < i10 - 1) {
            java.lang.System.arraycopy(jArr, i6 + 1, jArr, i6, (i10 - i6) - 1);
        }
        this.f40562E--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Long.valueOf(j6);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i6, int i10) {
        d();
        if (i10 < i6) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f40561D;
        java.lang.System.arraycopy(jArr, i10, jArr, i6, this.f40562E - i10);
        this.f40562E -= i10 - i6;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i6, java.lang.Object obj) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        d();
        s(i6);
        long[] jArr = this.f40561D;
        long j6 = jArr[i6];
        jArr[i6] = jLongValue;
        return java.lang.Long.valueOf(j6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40562E;
    }
}
