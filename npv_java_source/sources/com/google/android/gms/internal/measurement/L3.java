package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L3 implements java.io.Serializable, java.lang.Iterable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.L3 f40566D = new com.google.android.gms.internal.measurement.W3(com.google.android.gms.internal.measurement.AbstractC6146v4.f41256b);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.S3 f40567E = new com.google.android.gms.internal.measurement.V3();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f40568C = 0;

    static {
        new com.google.android.gms.internal.measurement.N3();
    }

    L3() {
    }

    static com.google.android.gms.internal.measurement.U3 N(int i6) {
        return new com.google.android.gms.internal.measurement.U3(i6);
    }

    static /* synthetic */ int f(byte b6) {
        return b6 & 255;
    }

    static int g(int i6, int i10, int i11) {
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

    public static com.google.android.gms.internal.measurement.L3 o(java.lang.String str) {
        return new com.google.android.gms.internal.measurement.W3(str.getBytes(com.google.android.gms.internal.measurement.AbstractC6146v4.f41255a));
    }

    public static com.google.android.gms.internal.measurement.L3 s(byte[] bArr) {
        return w(bArr, 0, bArr.length);
    }

    public static com.google.android.gms.internal.measurement.L3 w(byte[] bArr, int i6, int i10) {
        g(i6, i6 + i10, bArr.length);
        return new com.google.android.gms.internal.measurement.W3(f40567E.H(bArr, i6, i10));
    }

    abstract void C(com.google.android.gms.internal.measurement.M3 m6);

    abstract byte D(int i6);

    public abstract int E();

    protected abstract int M(int i6, int i10, int i11);

    public abstract byte d(int i6);

    protected final int e() {
        return this.f40568C;
    }

    public abstract boolean equals(java.lang.Object obj);

    public final int hashCode() {
        int iM = this.f40568C;
        if (iM == 0) {
            int iE = E();
            iM = M(iE, 0, iE);
            if (iM == 0) {
                iM = 1;
            }
            this.f40568C = iM;
        }
        return iM;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.measurement.O3(this);
    }

    public abstract com.google.android.gms.internal.measurement.L3 n(int i6, int i10);

    public final java.lang.String toString() {
        java.lang.String strA;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(E());
        if (E() <= 50) {
            strA = com.google.android.gms.internal.measurement.B5.a(this);
        } else {
            strA = com.google.android.gms.internal.measurement.B5.a(n(0, 47)) + "...";
        }
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, numValueOf, strA);
    }
}
