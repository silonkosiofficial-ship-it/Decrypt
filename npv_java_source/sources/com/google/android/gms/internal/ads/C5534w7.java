package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5534w7 extends java.io.FilterInputStream {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final long f39543C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f39544D;

    C5534w7(java.io.InputStream inputStream, long j6) {
        super(inputStream);
        this.f39543C = j6;
    }

    final long a() {
        return this.f39543C - this.f39544D;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        int i6 = super.read();
        if (i6 != -1) {
            this.f39544D++;
        }
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) throws java.io.IOException {
        int i11 = super.read(bArr, i6, i10);
        if (i11 != -1) {
            this.f39544D += (long) i11;
        }
        return i11;
    }
}
