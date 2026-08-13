package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Jo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f28756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28757b;

    public Jo0(byte[] bArr, int i6) throws java.security.InvalidKeyException {
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f28756a = com.google.android.gms.internal.ads.Ho0.e(bArr);
        this.f28757b = i6;
    }

    abstract int a();

    abstract int[] b(int[] iArr, int i6);

    final java.nio.ByteBuffer c(byte[] bArr, int i6) {
        int[] iArrB = b(com.google.android.gms.internal.ads.Ho0.e(bArr), i6);
        int[] iArr = (int[]) iArrB.clone();
        com.google.android.gms.internal.ads.Ho0.c(iArr);
        for (int i10 = 0; i10 < 16; i10++) {
            iArrB[i10] = iArrB[i10] + iArr[i10];
        }
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(64).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public final byte[] d(byte[] bArr, java.nio.ByteBuffer byteBuffer) throws java.security.GeneralSecurityException {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != a()) {
            throw new java.security.GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int iRemaining = byteBuffer.remaining();
        int i6 = iRemaining / 64;
        for (int i10 = 0; i10 < i6 + 1; i10++) {
            java.nio.ByteBuffer byteBufferC = c(bArr, this.f28757b + i10);
            int i11 = 64;
            if (i10 == i6) {
                i11 = iRemaining % 64;
            }
            com.google.android.gms.internal.ads.AbstractC4299ku0.a(byteBufferAllocate, byteBuffer, byteBufferC, i11);
        }
        return byteBufferAllocate.array();
    }
}
