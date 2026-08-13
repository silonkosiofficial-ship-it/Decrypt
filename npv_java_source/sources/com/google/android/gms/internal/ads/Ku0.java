package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ku0 implements com.google.android.gms.internal.ads.InterfaceC5380ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Oo0 f29029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f29030b;

    private Ku0(byte[] bArr, byte[] bArr2) {
        this.f29029a = new com.google.android.gms.internal.ads.Oo0(bArr);
        this.f29030b = bArr2;
    }

    public static com.google.android.gms.internal.ads.InterfaceC5380ul0 b(com.google.android.gms.internal.ads.Wn0 wn0) {
        return new com.google.android.gms.internal.ads.Ku0(wn0.d().d(com.google.android.gms.internal.ads.Dl0.a()), wn0.c().c());
    }

    private final byte[] c(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        return this.f29029a.b(java.nio.ByteBuffer.wrap(bArr, 24, length - 24), java.util.Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5380ul0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.f29030b;
        if (bArr3.length == 0) {
            return c(bArr, bArr2);
        }
        if (!com.google.android.gms.internal.ads.Kq0.c(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f29030b;
        return c(java.util.Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
