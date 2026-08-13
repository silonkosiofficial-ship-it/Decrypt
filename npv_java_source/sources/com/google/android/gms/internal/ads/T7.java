package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class T7 extends com.google.android.gms.internal.ads.Jy0 {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.util.Date f31875L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private java.util.Date f31876M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f31877N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f31878O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private double f31879P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f31880Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Ty0 f31881R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f31882S;

    public T7() {
        super("mvhd");
        this.f31879P = 1.0d;
        this.f31880Q = 1.0f;
        this.f31881R = com.google.android.gms.internal.ads.Ty0.f32058j;
    }

    @Override // com.google.android.gms.internal.ads.Gy0
    public final void c(java.nio.ByteBuffer byteBuffer) {
        long jE;
        g(byteBuffer);
        if (e() == 1) {
            this.f31875L = com.google.android.gms.internal.ads.Oy0.a(com.google.android.gms.internal.ads.O7.f(byteBuffer));
            this.f31876M = com.google.android.gms.internal.ads.Oy0.a(com.google.android.gms.internal.ads.O7.f(byteBuffer));
            this.f31877N = com.google.android.gms.internal.ads.O7.e(byteBuffer);
            jE = com.google.android.gms.internal.ads.O7.f(byteBuffer);
        } else {
            this.f31875L = com.google.android.gms.internal.ads.Oy0.a(com.google.android.gms.internal.ads.O7.e(byteBuffer));
            this.f31876M = com.google.android.gms.internal.ads.Oy0.a(com.google.android.gms.internal.ads.O7.e(byteBuffer));
            this.f31877N = com.google.android.gms.internal.ads.O7.e(byteBuffer);
            jE = com.google.android.gms.internal.ads.O7.e(byteBuffer);
        }
        this.f31878O = jE;
        this.f31879P = com.google.android.gms.internal.ads.O7.b(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f31880Q = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        com.google.android.gms.internal.ads.O7.d(byteBuffer);
        com.google.android.gms.internal.ads.O7.e(byteBuffer);
        com.google.android.gms.internal.ads.O7.e(byteBuffer);
        this.f31881R = new com.google.android.gms.internal.ads.Ty0(com.google.android.gms.internal.ads.O7.b(byteBuffer), com.google.android.gms.internal.ads.O7.b(byteBuffer), com.google.android.gms.internal.ads.O7.b(byteBuffer), com.google.android.gms.internal.ads.O7.b(byteBuffer), com.google.android.gms.internal.ads.O7.a(byteBuffer), com.google.android.gms.internal.ads.O7.a(byteBuffer), com.google.android.gms.internal.ads.O7.a(byteBuffer), com.google.android.gms.internal.ads.O7.b(byteBuffer), com.google.android.gms.internal.ads.O7.b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f31882S = com.google.android.gms.internal.ads.O7.e(byteBuffer);
    }

    public final long h() {
        return this.f31878O;
    }

    public final long i() {
        return this.f31877N;
    }

    public final java.lang.String toString() {
        return "MovieHeaderBox[creationTime=" + this.f31875L + ";modificationTime=" + this.f31876M + ";timescale=" + this.f31877N + ";duration=" + this.f31878O + ";rate=" + this.f31879P + ";volume=" + this.f31880Q + ";matrix=" + this.f31881R + ";nextTrackId=" + this.f31882S + "]";
    }
}
