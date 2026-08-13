package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class P3 extends com.google.android.gms.internal.measurement.W3 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f40638G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f40639H;

    P3(byte[] bArr, int i6, int i10) {
        super(bArr);
        com.google.android.gms.internal.measurement.L3.g(i6, i6 + i10, bArr.length);
        this.f40638G = i6;
        this.f40639H = i10;
    }

    @Override // com.google.android.gms.internal.measurement.W3, com.google.android.gms.internal.measurement.L3
    final byte D(int i6) {
        return this.f40700F[this.f40638G + i6];
    }

    @Override // com.google.android.gms.internal.measurement.W3, com.google.android.gms.internal.measurement.L3
    public final int E() {
        return this.f40639H;
    }

    @Override // com.google.android.gms.internal.measurement.W3
    protected final int P() {
        return this.f40638G;
    }

    @Override // com.google.android.gms.internal.measurement.W3, com.google.android.gms.internal.measurement.L3
    public final byte d(int i6) {
        int iE = E();
        if (((iE - (i6 + 1)) | i6) >= 0) {
            return this.f40700F[this.f40638G + i6];
        }
        if (i6 < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException("Index < 0: " + i6);
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("Index > length: " + i6 + ", " + iE);
    }
}
