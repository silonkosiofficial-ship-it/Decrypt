package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ww0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5622ww0 extends com.google.android.gms.internal.ads.Qu0 implements java.util.RandomAccess {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.lang.Object[] f39740F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C5622ww0 f39741G;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object[] f39742D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f39743E;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f39740F = objArr;
        f39741G = new com.google.android.gms.internal.ads.C5622ww0(objArr, 0, false);
    }

    private C5622ww0(java.lang.Object[] objArr, int i6, boolean z6) {
        super(z6);
        this.f39742D = objArr;
        this.f39743E = i6;
    }

    private final void K(int i6) {
        if (i6 < 0 || i6 >= this.f39743E) {
            throw new java.lang.IndexOutOfBoundsException(n(i6));
        }
    }

    public static com.google.android.gms.internal.ads.C5622ww0 e() {
        return f39741G;
    }

    private static int g(int i6) {
        return java.lang.Math.max(((i6 * 3) / 2) + 1, 10);
    }

    private final java.lang.String n(int i6) {
        return "Index:" + i6 + ", Size:" + this.f39743E;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, java.lang.Object obj) {
        int i10;
        d();
        if (i6 < 0 || i6 > (i10 = this.f39743E)) {
            throw new java.lang.IndexOutOfBoundsException(n(i6));
        }
        int i11 = i6 + 1;
        java.lang.Object[] objArr = this.f39742D;
        int length = objArr.length;
        if (i10 < length) {
            java.lang.System.arraycopy(objArr, i6, objArr, i11, i10 - i6);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[g(length)];
            java.lang.System.arraycopy(this.f39742D, 0, objArr2, 0, i6);
            java.lang.System.arraycopy(this.f39742D, i6, objArr2, i11, this.f39743E - i6);
            this.f39742D = objArr2;
        }
        this.f39742D[i6] = obj;
        this.f39743E++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        d();
        int i6 = this.f39743E;
        int length = this.f39742D.length;
        if (i6 == length) {
            this.f39742D = java.util.Arrays.copyOf(this.f39742D, g(length));
        }
        java.lang.Object[] objArr = this.f39742D;
        int i10 = this.f39743E;
        this.f39743E = i10 + 1;
        objArr[i10] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    final void f(int i6) {
        int length = this.f39742D.length;
        if (i6 <= length) {
            return;
        }
        if (length == 0) {
            this.f39742D = new java.lang.Object[java.lang.Math.max(i6, 10)];
            return;
        }
        while (length < i6) {
            length = g(length);
        }
        this.f39742D = java.util.Arrays.copyOf(this.f39742D, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i6) {
        K(i6);
        return this.f39742D[i6];
    }

    @Override // com.google.android.gms.internal.ads.Sv0
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.Sv0 k(int i6) {
        if (i6 >= this.f39743E) {
            return new com.google.android.gms.internal.ads.C5622ww0(i6 == 0 ? f39740F : java.util.Arrays.copyOf(this.f39742D, i6), this.f39743E, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.Qu0, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i6) {
        d();
        K(i6);
        java.lang.Object[] objArr = this.f39742D;
        java.lang.Object obj = objArr[i6];
        int i10 = this.f39743E;
        if (i6 < i10 - 1) {
            java.lang.System.arraycopy(objArr, i6 + 1, objArr, i6, (i10 - i6) - 1);
        }
        this.f39743E--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i6, java.lang.Object obj) {
        d();
        K(i6);
        java.lang.Object[] objArr = this.f39742D;
        java.lang.Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39743E;
    }
}
