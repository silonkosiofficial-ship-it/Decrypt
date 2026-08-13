package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2217Bs implements com.google.android.gms.internal.ads.My0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.nio.ByteBuffer f26037C;

    C2217Bs(java.nio.ByteBuffer byteBuffer) {
        this.f26037C = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.My0
    public final long b() {
        return this.f26037C.position();
    }

    @Override // com.google.android.gms.internal.ads.My0
    public final long c() {
        return this.f26037C.limit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.My0
    public final void h(long j6) {
        this.f26037C.position((int) j6);
    }

    @Override // com.google.android.gms.internal.ads.My0
    public final int i1(java.nio.ByteBuffer byteBuffer) {
        if (this.f26037C.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = java.lang.Math.min(byteBuffer.remaining(), this.f26037C.remaining());
        byte[] bArr = new byte[iMin];
        this.f26037C.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.My0
    public final java.nio.ByteBuffer n1(long j6, long j10) {
        java.nio.ByteBuffer byteBuffer = this.f26037C;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j6);
        java.nio.ByteBuffer byteBufferSlice = this.f26037C.slice();
        byteBufferSlice.limit((int) j10);
        this.f26037C.position(iPosition);
        return byteBufferSlice;
    }
}
