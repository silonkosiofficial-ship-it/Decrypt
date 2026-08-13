package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4409lu0 implements com.google.android.gms.internal.ads.InterfaceC5380ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Ko0 f37249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f37250b;

    private C4409lu0(byte[] bArr, byte[] bArr2) {
        this.f37249a = new com.google.android.gms.internal.ads.Ko0(bArr);
        this.f37250b = bArr2;
    }

    public static com.google.android.gms.internal.ads.InterfaceC5380ul0 b(com.google.android.gms.internal.ads.C3299bn0 c3299bn0) {
        return new com.google.android.gms.internal.ads.C4409lu0(c3299bn0.d().d(com.google.android.gms.internal.ads.Dl0.a()), c3299bn0.c().c());
    }

    private final byte[] c(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        return this.f37249a.b(java.nio.ByteBuffer.wrap(bArr, 12, length - 12), java.util.Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5380ul0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.f37250b;
        if (bArr3.length == 0) {
            return c(bArr, bArr2);
        }
        if (!com.google.android.gms.internal.ads.Kq0.c(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f37250b;
        return c(java.util.Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
