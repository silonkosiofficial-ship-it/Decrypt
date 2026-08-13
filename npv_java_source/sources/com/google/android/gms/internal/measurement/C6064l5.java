package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6064l5 extends com.google.android.gms.internal.measurement.F3 implements java.util.RandomAccess {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.lang.Object[] f41027F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.C6064l5 f41028G;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object[] f41029D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f41030E;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f41027F = objArr;
        f41028G = new com.google.android.gms.internal.measurement.C6064l5(objArr, 0, false);
    }

    private C6064l5(java.lang.Object[] objArr, int i6, boolean z6) {
        super(z6);
        this.f41029D = objArr;
        this.f41030E = i6;
    }

    private static int f(int i6) {
        return java.lang.Math.max(((i6 * 3) / 2) + 1, 10);
    }

    public static com.google.android.gms.internal.measurement.C6064l5 g() {
        return f41028G;
    }

    private final java.lang.String n(int i6) {
        return "Index:" + i6 + ", Size:" + this.f41030E;
    }

    private final void o(int i6) {
        if (i6 < 0 || i6 >= this.f41030E) {
            throw new java.lang.IndexOutOfBoundsException(n(i6));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, java.lang.Object obj) {
        int i10;
        d();
        if (i6 < 0 || i6 > (i10 = this.f41030E)) {
            throw new java.lang.IndexOutOfBoundsException(n(i6));
        }
        java.lang.Object[] objArr = this.f41029D;
        if (i10 < objArr.length) {
            java.lang.System.arraycopy(objArr, i6, objArr, i6 + 1, i10 - i6);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[f(objArr.length)];
            java.lang.System.arraycopy(this.f41029D, 0, objArr2, 0, i6);
            java.lang.System.arraycopy(this.f41029D, i6, objArr2, i6 + 1, this.f41030E - i6);
            this.f41029D = objArr2;
        }
        this.f41029D[i6] = obj;
        this.f41030E++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        d();
        int i6 = this.f41030E;
        java.lang.Object[] objArr = this.f41029D;
        if (i6 == objArr.length) {
            this.f41029D = java.util.Arrays.copyOf(this.f41029D, f(objArr.length));
        }
        java.lang.Object[] objArr2 = this.f41029D;
        int i10 = this.f41030E;
        this.f41030E = i10 + 1;
        objArr2[i10] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    final void e(int i6) {
        java.lang.Object[] objArr = this.f41029D;
        if (i6 <= objArr.length) {
            return;
        }
        if (objArr.length == 0) {
            this.f41029D = new java.lang.Object[java.lang.Math.max(i6, 10)];
            return;
        }
        int length = objArr.length;
        while (length < i6) {
            length = f(length);
        }
        this.f41029D = java.util.Arrays.copyOf(this.f41029D, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i6) {
        o(i6);
        return this.f41029D[i6];
    }

    @Override // com.google.android.gms.internal.measurement.D4
    public final /* synthetic */ com.google.android.gms.internal.measurement.D4 r(int i6) {
        if (i6 >= this.f41030E) {
            return new com.google.android.gms.internal.measurement.C6064l5(i6 == 0 ? f41027F : java.util.Arrays.copyOf(this.f41029D, i6), this.f41030E, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.F3, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i6) {
        d();
        o(i6);
        java.lang.Object[] objArr = this.f41029D;
        java.lang.Object obj = objArr[i6];
        int i10 = this.f41030E;
        if (i6 < i10 - 1) {
            java.lang.System.arraycopy(objArr, i6 + 1, objArr, i6, (i10 - i6) - 1);
        }
        this.f41030E--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i6, java.lang.Object obj) {
        d();
        o(i6);
        java.lang.Object[] objArr = this.f41029D;
        java.lang.Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41030E;
    }
}
