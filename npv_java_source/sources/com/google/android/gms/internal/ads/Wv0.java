package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Wv0 extends java.io.InputStream {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.util.Iterator f32948C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.nio.ByteBuffer f32949D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f32950E = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f32951F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f32952G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f32953H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private byte[] f32954I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f32955J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f32956K;

    Wv0(java.lang.Iterable iterable) {
        this.f32948C = iterable.iterator();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f32950E++;
        }
        this.f32951F = -1;
        if (f()) {
            return;
        }
        this.f32949D = com.google.android.gms.internal.ads.Tv0.f32043c;
        this.f32951F = 0;
        this.f32952G = 0;
        this.f32956K = 0L;
    }

    private final void a(int i6) {
        int i10 = this.f32952G + i6;
        this.f32952G = i10;
        if (i10 == this.f32949D.limit()) {
            f();
        }
    }

    private final boolean f() {
        this.f32951F++;
        if (!this.f32948C.hasNext()) {
            return false;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) this.f32948C.next();
        this.f32949D = byteBuffer;
        this.f32952G = byteBuffer.position();
        if (this.f32949D.hasArray()) {
            this.f32953H = true;
            this.f32954I = this.f32949D.array();
            this.f32955J = this.f32949D.arrayOffset();
        } else {
            this.f32953H = false;
            this.f32956K = com.google.android.gms.internal.ads.Sw0.m(this.f32949D);
            this.f32954I = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f32951F == this.f32950E) {
            return -1;
        }
        int i6 = (this.f32953H ? this.f32954I[this.f32952G + this.f32955J] : com.google.android.gms.internal.ads.Sw0.i(((long) this.f32952G) + this.f32956K)) & 255;
        a(1);
        return i6;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        if (this.f32951F == this.f32950E) {
            return -1;
        }
        int iLimit = this.f32949D.limit();
        int i11 = this.f32952G;
        int i12 = iLimit - i11;
        if (i10 > i12) {
            i10 = i12;
        }
        if (this.f32953H) {
            java.lang.System.arraycopy(this.f32954I, i11 + this.f32955J, bArr, i6, i10);
        } else {
            int iPosition = this.f32949D.position();
            this.f32949D.position(this.f32952G);
            this.f32949D.get(bArr, i6, i10);
            this.f32949D.position(iPosition);
        }
        a(i10);
        return i10;
    }
}
