package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Bo0 implements com.google.android.gms.internal.ads.InterfaceC5380ul0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f26024c = com.google.android.gms.internal.ads.Cu0.a("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f26025d = com.google.android.gms.internal.ads.Cu0.a("070000004041424344454647");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f26026e = com.google.android.gms.internal.ads.Cu0.a("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.ThreadLocal f26027f = new com.google.android.gms.internal.ads.Ao0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final javax.crypto.SecretKey f26028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f26029b;

    private Bo0(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!e()) {
            throw new java.security.GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f26028a = new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20");
        this.f26029b = bArr2;
    }

    public static com.google.android.gms.internal.ads.InterfaceC5380ul0 b(com.google.android.gms.internal.ads.C3299bn0 c3299bn0) {
        return new com.google.android.gms.internal.ads.Bo0(c3299bn0.d().d(com.google.android.gms.internal.ads.Dl0.a()), c3299bn0.c().c());
    }

    static javax.crypto.Cipher c() {
        return (javax.crypto.Cipher) f26027f.get();
    }

    public static boolean e() {
        return f26027f.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(javax.crypto.Cipher cipher) {
        try {
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(f26025d);
            byte[] bArr = f26024c;
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f26026e;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5380ul0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f26029b;
        int length = bArr.length;
        if (length < bArr3.length + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.Kq0.c(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        java.lang.System.arraycopy(bArr, this.f26029b.length, bArr4, 0, 12);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr4);
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) f26027f.get();
        cipher.init(2, this.f26028a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int length2 = this.f26029b.length;
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
