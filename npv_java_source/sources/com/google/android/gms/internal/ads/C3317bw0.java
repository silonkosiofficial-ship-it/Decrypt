package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3317bw0 extends com.google.android.gms.internal.ads.Qu0 implements java.util.RandomAccess, com.google.android.gms.internal.ads.Rv0, com.google.android.gms.internal.ads.InterfaceC5402uw0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final long[] f34401F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C3317bw0 f34402G;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long[] f34403D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f34404E;

    static {
        long[] jArr = new long[0];
        f34401F = jArr;
        f34402G = new com.google.android.gms.internal.ads.C3317bw0(jArr, 0, false);
    }

    private C3317bw0(long[] jArr, int i6, boolean z6) {
        super(z6);
        this.f34403D = jArr;
        this.f34404E = i6;
    }

    public static com.google.android.gms.internal.ads.C3317bw0 n() {
        return f34402G;
    }

    private static int o(int i6) {
        return java.lang.Math.max(((i6 * 3) / 2) + 1, 10);
    }

    private final java.lang.String s(int i6) {
        return "Index:" + i6 + ", Size:" + this.f34404E;
    }

    private final void w(int i6) {
        if (i6 < 0 || i6 >= this.f34404E) {
            throw new java.lang.IndexOutOfBoundsException(s(i6));
        }
    }

    @Override // com.google.android.gms.internal.ads.Sv0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.Rv0 k(int i6) {
        if (i6 >= this.f34404E) {
            return new com.google.android.gms.internal.ads.C3317bw0(i6 == 0 ? f34401F : java.util.Arrays.copyOf(this.f34403D, i6), this.f34404E, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    final void K(int i6) {
        int length = this.f34403D.length;
        if (i6 <= length) {
            return;
        }
        if (length == 0) {
            this.f34403D = new long[java.lang.Math.max(i6, 10)];
            return;
        }
        while (length < i6) {
            length = o(length);
        }
        this.f34403D = java.util.Arrays.copyOf(this.f34403D, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i6, java.lang.Object obj) {
        int i10;
        long jLongValue = ((java.lang.Long) obj).longValue();
        d();
        if (i6 < 0 || i6 > (i10 = this.f34404E)) {
            throw new java.lang.IndexOutOfBoundsException(s(i6));
        }
        int i11 = i6 + 1;
        long[] jArr = this.f34403D;
        int length = jArr.length;
        if (i10 < length) {
            java.lang.System.arraycopy(jArr, i6, jArr, i11, i10 - i6);
        } else {
            long[] jArr2 = new long[o(length)];
            java.lang.System.arraycopy(this.f34403D, 0, jArr2, 0, i6);
            java.lang.System.arraycopy(this.f34403D, i6, jArr2, i11, this.f34404E - i6);
            this.f34403D = jArr2;
        }
        this.f34403D[i6] = jLongValue;
        this.f34404E++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        g(((java.lang.Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Qu0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        d();
        byte[] bArr = com.google.android.gms.internal.ads.Tv0.f32042b;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.ads.C3317bw0)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.ads.C3317bw0 c3317bw0 = (com.google.android.gms.internal.ads.C3317bw0) collection;
        int i6 = c3317bw0.f34404E;
        if (i6 == 0) {
            return false;
        }
        int i10 = this.f34404E;
        if (Integer.MAX_VALUE - i10 < i6) {
            throw new java.lang.OutOfMemoryError();
        }
        int i11 = i10 + i6;
        long[] jArr = this.f34403D;
        if (i11 > jArr.length) {
            this.f34403D = java.util.Arrays.copyOf(jArr, i11);
        }
        java.lang.System.arraycopy(c3317bw0.f34403D, 0, this.f34403D, this.f34404E, c3317bw0.f34404E);
        this.f34404E = i11;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i6) {
        w(i6);
        return this.f34403D[i6];
    }

    @Override // com.google.android.gms.internal.ads.Qu0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.C3317bw0)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.C3317bw0 c3317bw0 = (com.google.android.gms.internal.ads.C3317bw0) obj;
        if (this.f34404E != c3317bw0.f34404E) {
            return false;
        }
        long[] jArr = c3317bw0.f34403D;
        for (int i6 = 0; i6 < this.f34404E; i6++) {
            if (this.f34403D[i6] != jArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i6, long j6) {
        d();
        w(i6);
        long[] jArr = this.f34403D;
        long j10 = jArr[i6];
        jArr[i6] = j6;
        return j10;
    }

    public final void g(long j6) {
        d();
        int i6 = this.f34404E;
        int length = this.f34403D.length;
        if (i6 == length) {
            long[] jArr = new long[o(length)];
            java.lang.System.arraycopy(this.f34403D, 0, jArr, 0, this.f34404E);
            this.f34403D = jArr;
        }
        long[] jArr2 = this.f34403D;
        int i10 = this.f34404E;
        this.f34404E = i10 + 1;
        jArr2[i10] = j6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i6) {
        w(i6);
        return java.lang.Long.valueOf(this.f34403D[i6]);
    }

    @Override // com.google.android.gms.internal.ads.Qu0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f34404E; i10++) {
            long j6 = this.f34403D[i10];
            byte[] bArr = com.google.android.gms.internal.ads.Tv0.f32042b;
            i6 = (i6 * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        int i6 = this.f34404E;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f34403D[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i6) {
        d();
        w(i6);
        long[] jArr = this.f34403D;
        long j6 = jArr[i6];
        int i10 = this.f34404E;
        if (i6 < i10 - 1) {
            java.lang.System.arraycopy(jArr, i6 + 1, jArr, i6, (i10 - i6) - 1);
        }
        this.f34404E--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Long.valueOf(j6);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i6, int i10) {
        d();
        if (i10 < i6) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f34403D;
        java.lang.System.arraycopy(jArr, i10, jArr, i6, this.f34404E - i10);
        this.f34404E -= i10 - i6;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i6, java.lang.Object obj) {
        return java.lang.Long.valueOf(f(i6, ((java.lang.Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34404E;
    }
}
