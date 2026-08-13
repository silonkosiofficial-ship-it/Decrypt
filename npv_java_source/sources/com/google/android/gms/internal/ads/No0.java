package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class No0 extends com.google.android.gms.internal.ads.Jo0 {
    public No0(byte[] bArr, int i6) {
        super(bArr, i6);
    }

    @Override // com.google.android.gms.internal.ads.Jo0
    final int a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.Jo0
    final int[] b(int[] iArr, int i6) {
        int length = iArr.length;
        if (length != 6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", java.lang.Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        com.google.android.gms.internal.ads.Ho0.b(iArr2, com.google.android.gms.internal.ads.Ho0.d(this.f28756a, iArr));
        iArr2[12] = i6;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
