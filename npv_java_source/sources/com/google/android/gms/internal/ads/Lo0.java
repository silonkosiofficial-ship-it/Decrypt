package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Lo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Jo0 f29572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Jo0 f29573b;

    public Lo0(byte[] bArr) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f29572a = a(bArr, 1);
        this.f29573b = a(bArr, 0);
    }

    abstract com.google.android.gms.internal.ads.Jo0 a(byte[] bArr, int i6);

    public final byte[] b(java.nio.ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f29573b.c(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i6 = length & 15;
            int i10 = i6 == 0 ? length : (length + 16) - i6;
            int iRemaining = byteBuffer.remaining();
            int i11 = iRemaining % 16;
            int i12 = (i11 == 0 ? iRemaining : (iRemaining + 16) - i11) + i10;
            java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(i12 + 16).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i10);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i12);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!java.security.MessageDigest.isEqual(com.google.android.gms.internal.ads.Qo0.a(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new java.security.GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            return this.f29572a.d(bArr, byteBuffer);
        } catch (java.security.GeneralSecurityException e6) {
            throw new javax.crypto.AEADBadTagException(e6.toString());
        }
    }
}
