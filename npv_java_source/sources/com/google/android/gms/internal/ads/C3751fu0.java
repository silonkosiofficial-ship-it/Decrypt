package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3751fu0 implements com.google.android.gms.internal.ads.Du0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.ThreadLocal f35473d = new com.google.android.gms.internal.ads.C3641eu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final javax.crypto.spec.SecretKeySpec f35474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35476c;

    public C3751fu0(byte[] bArr, int i6) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.android.gms.internal.ads.Ju0.a(bArr.length);
        this.f35474a = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        int blockSize = ((javax.crypto.Cipher) f35473d.get()).getBlockSize();
        this.f35476c = blockSize;
        if (i6 > blockSize) {
            throw new java.security.GeneralSecurityException("invalid IV size");
        }
        this.f35475b = i6;
    }

    @Override // com.google.android.gms.internal.ads.Du0
    public final byte[] f(byte[] bArr) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        int i6 = this.f35475b;
        if (length < i6) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i6];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i6);
        int i10 = this.f35475b;
        int i11 = length - i10;
        byte[] bArr3 = new byte[i11];
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) f35473d.get();
        byte[] bArr4 = new byte[this.f35476c];
        java.lang.System.arraycopy(bArr2, 0, bArr4, 0, this.f35475b);
        cipher.init(2, this.f35474a, new javax.crypto.spec.IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i10, i11, bArr3, 0) == i11) {
            return bArr3;
        }
        throw new java.security.GeneralSecurityException("stored output's length does not match input's length");
    }
}
