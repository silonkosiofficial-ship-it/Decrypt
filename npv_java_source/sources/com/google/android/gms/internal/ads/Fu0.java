package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Fu0 implements com.google.android.gms.internal.ads.Qr0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.ThreadLocal f27468d = new com.google.android.gms.internal.ads.Eu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final javax.crypto.SecretKey f27469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f27470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f27471c;

    public Fu0(byte[] bArr) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Ju0.a(bArr.length);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        this.f27469a = secretKeySpec;
        javax.crypto.Cipher cipherB = b();
        cipherB.init(1, secretKeySpec);
        byte[] bArrA = com.google.android.gms.internal.ads.Hr0.a(cipherB.doFinal(new byte[16]));
        this.f27470b = bArrA;
        this.f27471c = com.google.android.gms.internal.ads.Hr0.a(bArrA);
    }

    private static javax.crypto.Cipher b() throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            return (javax.crypto.Cipher) f27468d.get();
        }
        throw new java.security.GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void c(byte[] bArr, byte[] bArr2, int i6, byte[] bArr3) {
        for (int i10 = 0; i10 < 16; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10 + i6]);
        }
    }

    @Override // com.google.android.gms.internal.ads.Qr0
    public final byte[] a(byte[] bArr, int i6) throws java.security.GeneralSecurityException {
        byte[] bArrC;
        if (i6 > 16) {
            throw new java.security.InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        javax.crypto.SecretKey secretKey = this.f27469a;
        javax.crypto.Cipher cipherB = b();
        cipherB.init(1, secretKey);
        int length = bArr.length;
        int i10 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i11 = i10 - 1;
        int i12 = i11 * 16;
        if (i10 * 16 == length) {
            bArrC = com.google.android.gms.internal.ads.AbstractC4299ku0.c(bArr, i12, this.f27470b, 0, 16);
        } else {
            byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i12, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new java.lang.IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            byte[] bArr2 = this.f27471c;
            if (bArrCopyOf.length != 16) {
                throw new java.lang.IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrC = com.google.android.gms.internal.ads.AbstractC4299ku0.c(bArrCopyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i13 = 0; i13 < i11; i13++) {
            c(bArr3, bArr, i13 * 16, bArr4);
            if (cipherB.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new java.lang.IllegalStateException("Cipher didn't write full block");
            }
        }
        c(bArr3, bArrC, 0, bArr4);
        if (cipherB.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i6 == 16 ? bArr3 : java.util.Arrays.copyOf(bArr3, i6);
        }
        throw new java.lang.IllegalStateException("Cipher didn't write full block");
    }
}
