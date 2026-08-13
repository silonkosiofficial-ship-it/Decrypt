package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ro0 implements com.google.android.gms.internal.ads.InterfaceC5380ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f31361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Qr0 f31363c;

    private Ro0(byte[] bArr, com.google.android.gms.internal.ads.Lu0 lu0, int i6) {
        this.f31363c = new com.google.android.gms.internal.ads.Fu0(bArr);
        this.f31361a = lu0.c();
        this.f31362b = i6;
    }

    public static com.google.android.gms.internal.ads.InterfaceC5380ul0 b(com.google.android.gms.internal.ads.Qn0 qn0) {
        return new com.google.android.gms.internal.ads.Ro0(qn0.d().d(com.google.android.gms.internal.ads.Dl0.a()), qn0.c(), qn0.b().b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5380ul0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f31361a;
        int i6 = this.f31362b;
        int length = bArr.length;
        if (length < bArr3.length + i6 + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.Kq0.c(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f31361a;
        int i10 = this.f31362b;
        int length2 = bArr4.length;
        int i11 = i10 + length2;
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, length2, i11);
        byte[] bArr5 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr6 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new java.security.GeneralSecurityException("invalid salt size");
        }
        java.lang.System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        java.lang.System.arraycopy(bArrCopyOfRange, 0, bArr6, 4, length3);
        byte[] bArr7 = new byte[32];
        java.lang.System.arraycopy(this.f31363c.a(bArr5, 16), 0, bArr7, 0, 16);
        java.lang.System.arraycopy(this.f31363c.a(bArr6, 16), 0, bArr7, 16, 16);
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        javax.crypto.SecretKey secretKeyC = com.google.android.gms.internal.ads.AbstractC4837po0.c(bArr7);
        int i12 = i11 + 12;
        byte[] bArrCopyOfRange2 = java.util.Arrays.copyOfRange(bArr, i11, i12);
        if (bArrCopyOfRange2.length != 12) {
            throw new java.security.GeneralSecurityException("iv is wrong size");
        }
        if (length < i11 + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpecA = com.google.android.gms.internal.ads.AbstractC4837po0.a(bArrCopyOfRange2, 0, 12);
        javax.crypto.Cipher cipherB = com.google.android.gms.internal.ads.AbstractC4837po0.b();
        cipherB.init(2, secretKeyC, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherB.updateAAD(bArr2);
        }
        return cipherB.doFinal(bArr, i12, length - i12);
    }
}
