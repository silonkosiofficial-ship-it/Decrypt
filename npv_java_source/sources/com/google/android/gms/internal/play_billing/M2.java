package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class M2 extends com.google.android.gms.internal.play_billing.AbstractC6184a2 implements java.util.RandomAccess, com.google.android.gms.internal.play_billing.O2, com.google.android.gms.internal.play_billing.InterfaceC6275p3 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int[] f41431F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.M2 f41432G;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int[] f41433D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f41434E;

    static {
        int[] iArr = new int[0];
        f41431F = iArr;
        f41432G = new com.google.android.gms.internal.play_billing.M2(iArr, 0, false);
    }

    private M2(int[] iArr, int i6, boolean z6) {
        super(z6);
        this.f41433D = iArr;
        this.f41434E = i6;
    }

    public static com.google.android.gms.internal.play_billing.M2 f() {
        return f41432G;
    }

    private static int o(int i6) {
        return java.lang.Math.max(((i6 * 3) / 2) + 1, 10);
    }

    private final java.lang.String s(int i6) {
        return "Index:" + i6 + ", Size:" + this.f41434E;
    }

    private final void w(int i6) {
        if (i6 < 0 || i6 >= this.f41434E) {
            throw new java.lang.IndexOutOfBoundsException(s(i6));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i6, java.lang.Object obj) {
        int i10;
        int iIntValue = ((java.lang.Integer) obj).intValue();
        d();
        if (i6 < 0 || i6 > (i10 = this.f41434E)) {
            throw new java.lang.IndexOutOfBoundsException(s(i6));
        }
        int i11 = i6 + 1;
        int[] iArr = this.f41433D;
        int length = iArr.length;
        if (i10 < length) {
            java.lang.System.arraycopy(iArr, i6, iArr, i11, i10 - i6);
        } else {
            int[] iArr2 = new int[o(length)];
            java.lang.System.arraycopy(this.f41433D, 0, iArr2, 0, i6);
            java.lang.System.arraycopy(this.f41433D, i6, iArr2, i11, this.f41434E - i6);
            this.f41433D = iArr2;
        }
        this.f41433D[i6] = iIntValue;
        this.f41434E++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        g(((java.lang.Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6184a2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        d();
        byte[] bArr = com.google.android.gms.internal.play_billing.Q2.f41449b;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.play_billing.M2)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) collection;
        int i6 = m6.f41434E;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f41434E;
        if (Integer.MAX_VALUE - i10 < i6) {
            throw new java.lang.OutOfMemoryError();
        }
        int i11 = i10 + i6;
        int[] iArr = this.f41433D;
        if (i11 > iArr.length) {
            this.f41433D = java.util.Arrays.copyOf(iArr, i11);
        }
        java.lang.System.arraycopy(m6.f41433D, 0, this.f41433D, this.f41434E, m6.f41434E);
        this.f41434E = i11;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i6) {
        w(i6);
        return this.f41433D[i6];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6184a2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.M2)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) obj;
        if (this.f41434E != m6.f41434E) {
            return false;
        }
        int[] iArr = m6.f41433D;
        for (int i6 = 0; i6 < this.f41434E; i6++) {
            if (this.f41433D[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i6) {
        d();
        int i10 = this.f41434E;
        int length = this.f41433D.length;
        if (i10 == length) {
            int[] iArr = new int[o(length)];
            java.lang.System.arraycopy(this.f41433D, 0, iArr, 0, this.f41434E);
            this.f41433D = iArr;
        }
        int[] iArr2 = this.f41433D;
        int i11 = this.f41434E;
        this.f41434E = i11 + 1;
        iArr2[i11] = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i6) {
        w(i6);
        return java.lang.Integer.valueOf(this.f41433D[i6]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6184a2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f41434E; i10++) {
            i6 = (i6 * 31) + this.f41433D[i10];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        int i6 = this.f41434E;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f41433D[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.P2
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.P2 m(int i6) {
        if (i6 >= this.f41434E) {
            return new com.google.android.gms.internal.play_billing.M2(i6 == 0 ? f41431F : java.util.Arrays.copyOf(this.f41433D, i6), this.f41434E, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    final void n(int i6) {
        int length = this.f41433D.length;
        if (i6 <= length) {
            return;
        }
        if (length == 0) {
            this.f41433D = new int[java.lang.Math.max(i6, 10)];
            return;
        }
        while (length < i6) {
            length = o(length);
        }
        this.f41433D = java.util.Arrays.copyOf(this.f41433D, length);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6184a2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i6) {
        d();
        w(i6);
        int[] iArr = this.f41433D;
        int i10 = iArr[i6];
        int i11 = this.f41434E;
        if (i6 < i11 - 1) {
            java.lang.System.arraycopy(iArr, i6 + 1, iArr, i6, (i11 - i6) - 1);
        }
        this.f41434E--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i6, int i10) {
        d();
        if (i10 < i6) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f41433D;
        java.lang.System.arraycopy(iArr, i10, iArr, i6, this.f41434E - i10);
        this.f41434E -= i10 - i6;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i6, java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        d();
        w(i6);
        int[] iArr = this.f41433D;
        int i10 = iArr[i6];
        iArr[i6] = iIntValue;
        return java.lang.Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41434E;
    }
}
