package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ju0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4189ju0 implements com.google.android.gms.internal.ads.InterfaceC5380ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final javax.crypto.SecretKey f36769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f36770b;

    private C4189ju0(byte[] bArr, com.google.android.gms.internal.ads.Lu0 lu0) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f36769a = com.google.android.gms.internal.ads.AbstractC4837po0.c(bArr);
        this.f36770b = lu0.c();
    }

    public static com.google.android.gms.internal.ads.InterfaceC5380ul0 b(com.google.android.gms.internal.ads.Gm0 gm0) {
        return new com.google.android.gms.internal.ads.C4189ju0(gm0.d().d(com.google.android.gms.internal.ads.Dl0.a()), gm0.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5380ul0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f36770b;
        int length = bArr.length;
        if (length < bArr3.length + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.Kq0.c(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpecA = com.google.android.gms.internal.ads.AbstractC4837po0.a(bArr, this.f36770b.length, 12);
        javax.crypto.SecretKey secretKey = this.f36769a;
        javax.crypto.Cipher cipherB = com.google.android.gms.internal.ads.AbstractC4837po0.b();
        cipherB.init(2, secretKey, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherB.updateAAD(bArr2);
        }
        int length2 = this.f36770b.length;
        return cipherB.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
