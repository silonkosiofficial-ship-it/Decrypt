package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6286r3 extends com.google.android.gms.internal.play_billing.AbstractC6184a2 implements java.util.RandomAccess {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.lang.Object[] f41644F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.C6286r3 f41645G;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object[] f41646D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f41647E;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f41644F = objArr;
        f41645G = new com.google.android.gms.internal.play_billing.C6286r3(objArr, 0, false);
    }

    private C6286r3(java.lang.Object[] objArr, int i6, boolean z6) {
        super(z6);
        this.f41646D = objArr;
        this.f41647E = i6;
    }

    private final void K(int i6) {
        if (i6 < 0 || i6 >= this.f41647E) {
            throw new java.lang.IndexOutOfBoundsException(n(i6));
        }
    }

    public static com.google.android.gms.internal.play_billing.C6286r3 e() {
        return f41645G;
    }

    private static int g(int i6) {
        return java.lang.Math.max(((i6 * 3) / 2) + 1, 10);
    }

    private final java.lang.String n(int i6) {
        return "Index:" + i6 + ", Size:" + this.f41647E;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, java.lang.Object obj) {
        int i10;
        d();
        if (i6 < 0 || i6 > (i10 = this.f41647E)) {
            throw new java.lang.IndexOutOfBoundsException(n(i6));
        }
        int i11 = i6 + 1;
        java.lang.Object[] objArr = this.f41646D;
        int length = objArr.length;
        if (i10 < length) {
            java.lang.System.arraycopy(objArr, i6, objArr, i11, i10 - i6);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[g(length)];
            java.lang.System.arraycopy(this.f41646D, 0, objArr2, 0, i6);
            java.lang.System.arraycopy(this.f41646D, i6, objArr2, i11, this.f41647E - i6);
            this.f41646D = objArr2;
        }
        this.f41646D[i6] = obj;
        this.f41647E++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        d();
        int i6 = this.f41647E;
        int length = this.f41646D.length;
        if (i6 == length) {
            this.f41646D = java.util.Arrays.copyOf(this.f41646D, g(length));
        }
        java.lang.Object[] objArr = this.f41646D;
        int i10 = this.f41647E;
        this.f41647E = i10 + 1;
        objArr[i10] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    final void f(int i6) {
        int length = this.f41646D.length;
        if (i6 <= length) {
            return;
        }
        if (length == 0) {
            this.f41646D = new java.lang.Object[java.lang.Math.max(i6, 10)];
            return;
        }
        while (length < i6) {
            length = g(length);
        }
        this.f41646D = java.util.Arrays.copyOf(this.f41646D, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i6) {
        K(i6);
        return this.f41646D[i6];
    }

    @Override // com.google.android.gms.internal.play_billing.P2
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.P2 m(int i6) {
        if (i6 >= this.f41647E) {
            return new com.google.android.gms.internal.play_billing.C6286r3(i6 == 0 ? f41644F : java.util.Arrays.copyOf(this.f41646D, i6), this.f41647E, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6184a2, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i6) {
        d();
        K(i6);
        java.lang.Object[] objArr = this.f41646D;
        java.lang.Object obj = objArr[i6];
        int i10 = this.f41647E;
        if (i6 < i10 - 1) {
            java.lang.System.arraycopy(objArr, i6 + 1, objArr, i6, (i10 - i6) - 1);
        }
        this.f41647E--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i6, java.lang.Object obj) {
        d();
        K(i6);
        java.lang.Object[] objArr = this.f41646D;
        java.lang.Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41647E;
    }
}
