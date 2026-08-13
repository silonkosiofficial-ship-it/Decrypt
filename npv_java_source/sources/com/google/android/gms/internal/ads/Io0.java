package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Io0 extends com.google.android.gms.internal.ads.Jo0 {
    public Io0(byte[] bArr, int i6) {
        super(bArr, i6);
    }

    @Override // com.google.android.gms.internal.ads.Jo0
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.Jo0
    public final int[] b(int[] iArr, int i6) {
        int length = iArr.length;
        if (length != 3) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", java.lang.Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        com.google.android.gms.internal.ads.Ho0.b(iArr2, this.f28756a);
        iArr2[12] = i6;
        java.lang.System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
