package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Kv0 extends com.google.android.gms.internal.ads.Qu0 implements java.util.RandomAccess, com.google.android.gms.internal.ads.Ov0, com.google.android.gms.internal.ads.InterfaceC5402uw0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int[] f29156F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Kv0 f29157G;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int[] f29158D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f29159E;

    static {
        int[] iArr = new int[0];
        f29156F = iArr;
        f29157G = new com.google.android.gms.internal.ads.Kv0(iArr, 0, false);
    }

    private Kv0(int[] iArr, int i6, boolean z6) {
        super(z6);
        this.f29158D = iArr;
        this.f29159E = i6;
    }

    public static com.google.android.gms.internal.ads.Kv0 g() {
        return f29157G;
    }

    private static int o(int i6) {
        return java.lang.Math.max(((i6 * 3) / 2) + 1, 10);
    }

    private final java.lang.String s(int i6) {
        return "Index:" + i6 + ", Size:" + this.f29159E;
    }

    private final void w(int i6) {
        if (i6 < 0 || i6 >= this.f29159E) {
            throw new java.lang.IndexOutOfBoundsException(s(i6));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ov0
    public final void K(int i6) {
        d();
        int i10 = this.f29159E;
        int length = this.f29158D.length;
        if (i10 == length) {
            int[] iArr = new int[o(length)];
            java.lang.System.arraycopy(this.f29158D, 0, iArr, 0, this.f29159E);
            this.f29158D = iArr;
        }
        int[] iArr2 = this.f29158D;
        int i11 = this.f29159E;
        this.f29159E = i11 + 1;
        iArr2[i11] = i6;
    }

    @Override // com.google.android.gms.internal.ads.Sv0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.Ov0 k(int i6) {
        if (i6 >= this.f29159E) {
            return new com.google.android.gms.internal.ads.Kv0(i6 == 0 ? f29156F : java.util.Arrays.copyOf(this.f29158D, i6), this.f29159E, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i6, java.lang.Object obj) {
        int i10;
        int iIntValue = ((java.lang.Integer) obj).intValue();
        d();
        if (i6 < 0 || i6 > (i10 = this.f29159E)) {
            throw new java.lang.IndexOutOfBoundsException(s(i6));
        }
        int i11 = i6 + 1;
        int[] iArr = this.f29158D;
        int length = iArr.length;
        if (i10 < length) {
            java.lang.System.arraycopy(iArr, i6, iArr, i11, i10 - i6);
        } else {
            int[] iArr2 = new int[o(length)];
            java.lang.System.arraycopy(this.f29158D, 0, iArr2, 0, i6);
            java.lang.System.arraycopy(this.f29158D, i6, iArr2, i11, this.f29159E - i6);
            this.f29158D = iArr2;
        }
        this.f29158D[i6] = iIntValue;
        this.f29159E++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        K(((java.lang.Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Qu0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        d();
        byte[] bArr = com.google.android.gms.internal.ads.Tv0.f32042b;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.ads.Kv0)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) collection;
        int i6 = kv0.f29159E;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f29159E;
        if (Integer.MAX_VALUE - i10 < i6) {
            throw new java.lang.OutOfMemoryError();
        }
        int i11 = i10 + i6;
        int[] iArr = this.f29158D;
        if (i11 > iArr.length) {
            this.f29158D = java.util.Arrays.copyOf(iArr, i11);
        }
        java.lang.System.arraycopy(kv0.f29158D, 0, this.f29158D, this.f29159E, kv0.f29159E);
        this.f29159E = i11;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i6) {
        w(i6);
        return this.f29158D[i6];
    }

    @Override // com.google.android.gms.internal.ads.Qu0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.Kv0)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) obj;
        if (this.f29159E != kv0.f29159E) {
            return false;
        }
        int[] iArr = kv0.f29158D;
        for (int i6 = 0; i6 < this.f29159E; i6++) {
            if (this.f29158D[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i6, int i10) {
        d();
        w(i6);
        int[] iArr = this.f29158D;
        int i11 = iArr[i6];
        iArr[i6] = i10;
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i6) {
        w(i6);
        return java.lang.Integer.valueOf(this.f29158D[i6]);
    }

    @Override // com.google.android.gms.internal.ads.Qu0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f29159E; i10++) {
            i6 = (i6 * 31) + this.f29158D[i10];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        int i6 = this.f29159E;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f29158D[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    final void n(int i6) {
        int length = this.f29158D.length;
        if (i6 <= length) {
            return;
        }
        if (length == 0) {
            this.f29158D = new int[java.lang.Math.max(i6, 10)];
            return;
        }
        while (length < i6) {
            length = o(length);
        }
        this.f29158D = java.util.Arrays.copyOf(this.f29158D, length);
    }

    @Override // com.google.android.gms.internal.ads.Qu0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i6) {
        d();
        w(i6);
        int[] iArr = this.f29158D;
        int i10 = iArr[i6];
        int i11 = this.f29159E;
        if (i6 < i11 - 1) {
            java.lang.System.arraycopy(iArr, i6 + 1, iArr, i6, (i11 - i6) - 1);
        }
        this.f29159E--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i6, int i10) {
        d();
        if (i10 < i6) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f29158D;
        java.lang.System.arraycopy(iArr, i10, iArr, i6, this.f29159E - i10);
        this.f29159E -= i10 - i6;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i6, java.lang.Object obj) {
        return java.lang.Integer.valueOf(f(i6, ((java.lang.Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29159E;
    }
}
