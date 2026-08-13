package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6268o2 implements java.lang.Iterable, java.io.Serializable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.AbstractC6268o2 f41602D = new com.google.android.gms.internal.play_billing.C6256m2(com.google.android.gms.internal.play_billing.Q2.f41449b);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f41603C = 0;

    static {
        int i6 = com.google.android.gms.internal.play_billing.AbstractC6190b2.f41519a;
    }

    AbstractC6268o2() {
    }

    public static com.google.android.gms.internal.play_billing.AbstractC6268o2 C(byte[] bArr, int i6, int i10) {
        s(i6, i6 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        java.lang.System.arraycopy(bArr, i6, bArr2, 0, i10);
        return new com.google.android.gms.internal.play_billing.C6256m2(bArr2);
    }

    static int s(int i6, int i10, int i11) {
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

    public abstract byte d(int i6);

    abstract byte e(int i6);

    public abstract boolean equals(java.lang.Object obj);

    public abstract int f();

    protected abstract int g(int i6, int i10, int i11);

    public final int hashCode() {
        int iG = this.f41603C;
        if (iG == 0) {
            int iF = f();
            iG = g(iF, 0, iF);
            if (iG == 0) {
                iG = 1;
            }
            this.f41603C = iG;
        }
        return iG;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.play_billing.C6226h2(this);
    }

    public abstract com.google.android.gms.internal.play_billing.AbstractC6268o2 n(int i6, int i10);

    abstract void o(com.google.android.gms.internal.play_billing.AbstractC6220g2 abstractC6220g2);

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(f()), f() <= 50 ? com.google.android.gms.internal.play_billing.AbstractC6322x3.a(this) : com.google.android.gms.internal.play_billing.AbstractC6322x3.a(n(0, 47)).concat("..."));
    }

    protected final int w() {
        return this.f41603C;
    }
}
