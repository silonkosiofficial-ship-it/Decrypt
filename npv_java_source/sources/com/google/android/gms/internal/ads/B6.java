package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class B6 implements com.google.android.gms.internal.ads.C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.nio.ByteBuffer f25902a;

    public B6(java.nio.ByteBuffer byteBuffer) {
        this.f25902a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.C6
    public final long a() {
        return this.f25902a.capacity();
    }

    @Override // com.google.android.gms.internal.ads.C6
    public final void b(java.security.MessageDigest[] messageDigestArr, long j6, int i6) {
        java.nio.ByteBuffer byteBufferSlice;
        synchronized (this.f25902a) {
            int i10 = (int) j6;
            this.f25902a.position(i10);
            this.f25902a.limit(i10 + i6);
            byteBufferSlice = this.f25902a.slice();
        }
        for (java.security.MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
