package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Xo0 implements com.google.android.gms.internal.ads.InterfaceC5380ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f33169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f33170b;

    private Xo0(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!c()) {
            throw new java.security.GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f33169a = bArr;
        this.f33170b = bArr2;
    }

    public static com.google.android.gms.internal.ads.InterfaceC5380ul0 b(com.google.android.gms.internal.ads.Wn0 wn0) {
        return new com.google.android.gms.internal.ads.Xo0(wn0.d().d(com.google.android.gms.internal.ads.Dl0.a()), wn0.c().c());
    }

    public static boolean c() {
        return com.google.android.gms.internal.ads.Bo0.c() != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5380ul0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f33170b;
        int length = bArr.length;
        if (length < bArr3.length + 40) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.Kq0.c(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        java.lang.System.arraycopy(bArr, this.f33170b.length, bArr4, 0, 24);
        int[] iArrD = com.google.android.gms.internal.ads.Ho0.d(com.google.android.gms.internal.ads.Ho0.e(this.f33169a), com.google.android.gms.internal.ads.Ho0.e(bArr4));
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(iArrD.length * 4).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrD);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        java.lang.System.arraycopy(bArr4, 16, bArr5, 4, 8);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr5);
        javax.crypto.Cipher cipherC = com.google.android.gms.internal.ads.Bo0.c();
        cipherC.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherC.updateAAD(bArr2);
        }
        int length2 = this.f33170b.length;
        return cipherC.doFinal(bArr, length2 + 24, (length - length2) - 24);
    }
}
