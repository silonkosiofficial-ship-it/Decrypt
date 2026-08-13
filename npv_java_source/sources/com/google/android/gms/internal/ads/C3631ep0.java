package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ep0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3631ep0 implements com.google.android.gms.internal.ads.InterfaceC5380ul0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f35059c = com.google.android.gms.internal.ads.Cu0.a("7a806c");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f35060d = com.google.android.gms.internal.ads.Cu0.a("46bb91c3c5");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f35061e = com.google.android.gms.internal.ads.Cu0.a("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f35062f = com.google.android.gms.internal.ads.Cu0.a("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f35063g = com.google.android.gms.internal.ads.Cu0.a("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.lang.ThreadLocal f35064h = new com.google.android.gms.internal.ads.C3521dp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final javax.crypto.SecretKey f35065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f35066b;

    private C3631ep0(byte[] bArr, byte[] bArr2) throws java.security.InvalidAlgorithmParameterException {
        this.f35066b = bArr2;
        com.google.android.gms.internal.ads.Ju0.a(bArr.length);
        this.f35065a = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
    }

    public static com.google.android.gms.internal.ads.InterfaceC5380ul0 b(com.google.android.gms.internal.ads.Sm0 sm0) {
        return new com.google.android.gms.internal.ads.C3631ep0(sm0.d().d(com.google.android.gms.internal.ads.Dl0.a()), sm0.c().c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(javax.crypto.Cipher cipher) {
        try {
            byte[] bArr = f35062f;
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(f35061e, "AES"), new javax.crypto.spec.GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f35060d);
            byte[] bArr2 = f35063g;
            return java.security.MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f35059c);
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    private final byte[] e(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) f35064h.get();
        if (cipher == null) {
            throw new java.security.GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        int length = bArr.length;
        if (length < 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.f35065a, new javax.crypto.spec.GCMParameterSpec(128, bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5380ul0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.f35066b;
        if (bArr3.length == 0) {
            return e(bArr, bArr2);
        }
        if (!com.google.android.gms.internal.ads.Kq0.c(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f35066b;
        return e(java.util.Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
