package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3753fv0 implements java.lang.Iterable, java.io.Serializable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.AbstractC3753fv0 f35478D = new com.google.android.gms.internal.ads.C3424cv0(com.google.android.gms.internal.ads.Tv0.f32042b);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f35479C = 0;

    static {
        int i6 = com.google.android.gms.internal.ads.Ru0.f31388a;
    }

    AbstractC3753fv0() {
    }

    static int O(int i6, int i10, int i11) {
        int i12 = i10 - i6;
        if ((i6 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i6 < 0) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index: " + i6 + " < 0");
        }
        if (i10 < i6) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index larger than ending index: " + i6 + ", " + i10);
        }
        throw new java.lang.IndexOutOfBoundsException("End index: " + i10 + " >= " + i11);
    }

    public static com.google.android.gms.internal.ads.C3533dv0 R() {
        return new com.google.android.gms.internal.ads.C3533dv0(128);
    }

    public static com.google.android.gms.internal.ads.AbstractC3753fv0 S(java.lang.Iterable iterable) {
        int size;
        if (iterable instanceof java.util.Collection) {
            size = ((java.util.Collection) iterable).size();
        } else {
            java.util.Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f35478D : g(iterable.iterator(), size);
    }

    public static com.google.android.gms.internal.ads.AbstractC3753fv0 T(byte[] bArr, int i6, int i10) {
        O(i6, i6 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        java.lang.System.arraycopy(bArr, i6, bArr2, 0, i10);
        return new com.google.android.gms.internal.ads.C3424cv0(bArr2);
    }

    public static com.google.android.gms.internal.ads.AbstractC3753fv0 U(java.lang.String str) {
        return new com.google.android.gms.internal.ads.C3424cv0(str.getBytes(com.google.android.gms.internal.ads.Tv0.f32041a));
    }

    static void V(int i6, int i10) {
        if (((i10 - (i6 + 1)) | i6) < 0) {
            if (i6 < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Index < 0: " + i6);
            }
            throw new java.lang.ArrayIndexOutOfBoundsException("Index > length: " + i6 + ", " + i10);
        }
    }

    private static com.google.android.gms.internal.ads.AbstractC3753fv0 g(java.util.Iterator it, int i6) {
        if (i6 <= 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("length (%s) must be >= 1", java.lang.Integer.valueOf(i6)));
        }
        if (i6 == 1) {
            return (com.google.android.gms.internal.ads.AbstractC3753fv0) it.next();
        }
        int i10 = i6 >>> 1;
        com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0G = g(it, i10);
        com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0G2 = g(it, i6 - i10);
        if (Integer.MAX_VALUE - abstractC3753fv0G.n() >= abstractC3753fv0G2.n()) {
            return com.google.android.gms.internal.ads.Dw0.Y(abstractC3753fv0G, abstractC3753fv0G2);
        }
        throw new java.lang.IllegalArgumentException("ByteString would be too long: " + abstractC3753fv0G.n() + "+" + abstractC3753fv0G2.n());
    }

    protected abstract int C(int i6, int i10, int i11);

    public abstract com.google.android.gms.internal.ads.AbstractC3753fv0 D(int i6, int i10);

    public abstract com.google.android.gms.internal.ads.AbstractC4301kv0 E();

    public abstract java.nio.ByteBuffer M();

    abstract void N(com.google.android.gms.internal.ads.Wu0 wu0);

    protected final int P() {
        return this.f35479C;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.ads.InterfaceC3205av0 iterator() {
        return new com.google.android.gms.internal.ads.Xu0(this);
    }

    public final void W(byte[] bArr, int i6, int i10, int i11) {
        O(0, i11, n());
        O(i10, i10 + i11, bArr.length);
        if (i11 > 0) {
            o(bArr, 0, i10, i11);
        }
    }

    public final byte[] d() {
        int iN = n();
        if (iN == 0) {
            return com.google.android.gms.internal.ads.Tv0.f32042b;
        }
        byte[] bArr = new byte[iN];
        o(bArr, 0, 0, iN);
        return bArr;
    }

    public abstract byte e(int i6);

    public abstract boolean equals(java.lang.Object obj);

    abstract byte f(int i6);

    public final int hashCode() {
        int iC = this.f35479C;
        if (iC == 0) {
            int iN = n();
            iC = C(iN, 0, iN);
            if (iC == 0) {
                iC = 1;
            }
            this.f35479C = iC;
        }
        return iC;
    }

    public abstract int n();

    protected abstract void o(byte[] bArr, int i6, int i10, int i11);

    protected abstract int s();

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(n()), n() <= 50 ? com.google.android.gms.internal.ads.Jw0.a(this) : com.google.android.gms.internal.ads.Jw0.a(D(0, 47)).concat("..."));
    }

    protected abstract boolean w();
}
