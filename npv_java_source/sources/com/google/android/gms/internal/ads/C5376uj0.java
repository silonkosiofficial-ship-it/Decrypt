package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5376uj0 extends java.io.FilterInputStream {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f39211C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f39212D;

    C5376uj0(java.io.InputStream inputStream, long j6) {
        super(inputStream);
        this.f39212D = -1L;
        inputStream.getClass();
        com.google.android.gms.internal.ads.AbstractC2164Ag0.f(j6 >= 0, "limit must be non-negative");
        this.f39211C = j6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) java.lang.Math.min(((java.io.FilterInputStream) this).in.available(), this.f39211C);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i6) {
        ((java.io.FilterInputStream) this).in.mark(i6);
        this.f39212D = this.f39211C;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        if (this.f39211C == 0) {
            return -1;
        }
        int i6 = ((java.io.FilterInputStream) this).in.read();
        if (i6 != -1) {
            this.f39211C--;
        }
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) throws java.io.IOException {
        long j6 = this.f39211C;
        if (j6 == 0) {
            return -1;
        }
        int i11 = ((java.io.FilterInputStream) this).in.read(bArr, i6, (int) java.lang.Math.min(i10, j6));
        if (i11 != -1) {
            this.f39211C -= (long) i11;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((java.io.FilterInputStream) this).in.markSupported()) {
            throw new java.io.IOException("Mark not supported");
        }
        if (this.f39212D == -1) {
            throw new java.io.IOException("Mark not set");
        }
        ((java.io.FilterInputStream) this).in.reset();
        this.f39211C = this.f39212D;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws java.io.IOException {
        long jSkip = ((java.io.FilterInputStream) this).in.skip(java.lang.Math.min(j6, this.f39211C));
        this.f39211C -= jSkip;
        return jSkip;
    }
}
