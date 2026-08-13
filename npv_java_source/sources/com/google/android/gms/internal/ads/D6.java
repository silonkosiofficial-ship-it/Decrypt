package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class D6 implements com.google.android.gms.internal.ads.C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.nio.channels.FileChannel f26618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26620c;

    public D6(java.nio.channels.FileChannel fileChannel, long j6, long j10) {
        this.f26618a = fileChannel;
        this.f26619b = j6;
        this.f26620c = j10;
    }

    @Override // com.google.android.gms.internal.ads.C6
    public final long a() {
        return this.f26620c;
    }

    @Override // com.google.android.gms.internal.ads.C6
    public final void b(java.security.MessageDigest[] messageDigestArr, long j6, int i6) throws java.io.IOException {
        java.nio.MappedByteBuffer map = this.f26618a.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, this.f26619b + j6, i6);
        map.load();
        for (java.security.MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
