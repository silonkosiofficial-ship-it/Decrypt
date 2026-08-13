package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4519mu0 implements com.google.android.gms.internal.ads.InterfaceC5380ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Du0 f37431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Rl0 f37432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f37434d;

    private C4519mu0(com.google.android.gms.internal.ads.Du0 du0, com.google.android.gms.internal.ads.Rl0 rl0, int i6, byte[] bArr) {
        this.f37431a = du0;
        this.f37432b = rl0;
        this.f37433c = i6;
        this.f37434d = bArr;
    }

    public static com.google.android.gms.internal.ads.InterfaceC5380ul0 b(com.google.android.gms.internal.ads.C4283km0 c4283km0) {
        com.google.android.gms.internal.ads.C3751fu0 c3751fu0 = new com.google.android.gms.internal.ads.C3751fu0(c4283km0.d().d(com.google.android.gms.internal.ads.Dl0.a()), c4283km0.b().d());
        java.lang.String strValueOf = java.lang.String.valueOf(c4283km0.b().g());
        return new com.google.android.gms.internal.ads.C4519mu0(c3751fu0, new com.google.android.gms.internal.ads.Iu0(new com.google.android.gms.internal.ads.Hu0("HMAC".concat(strValueOf), new javax.crypto.spec.SecretKeySpec(c4283km0.e().d(com.google.android.gms.internal.ads.Dl0.a()), "HMAC")), c4283km0.b().e()), c4283km0.b().e(), c4283km0.c().c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5380ul0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.f37434d;
        int i6 = this.f37433c;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i6 + length) {
            throw new java.security.GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!com.google.android.gms.internal.ads.Kq0.c(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, this.f37434d.length, length2 - this.f37433c);
        byte[] bArrCopyOfRange2 = java.util.Arrays.copyOfRange(bArr, length2 - this.f37433c, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (java.security.MessageDigest.isEqual(((com.google.android.gms.internal.ads.Iu0) this.f37432b).c(com.google.android.gms.internal.ads.AbstractC4299ku0.b(bArr2, bArrCopyOfRange, java.util.Arrays.copyOf(java.nio.ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.f37431a.f(bArrCopyOfRange);
        }
        throw new java.security.GeneralSecurityException("invalid MAC");
    }
}
