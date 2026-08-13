package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3908hH0 implements com.google.android.gms.internal.ads.InterfaceC5663xG0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.media.MediaCodec f36042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5113sG0 f36043b;

    /* synthetic */ C3908hH0(android.media.MediaCodec mediaCodec, com.google.android.gms.internal.ads.C5113sG0 c5113sG0, com.google.android.gms.internal.ads.AbstractC3798gH0 abstractC3798gH0) {
        this.f36042a = mediaCodec;
        this.f36043b = c5113sG0;
        if (com.google.android.gms.internal.ads.EW.f27061a < 35 || c5113sG0 == null) {
            return;
        }
        c5113sG0.a(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final java.nio.ByteBuffer D(int i6) {
        return this.f36042a.getOutputBuffer(i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void U(android.os.Bundle bundle) {
        this.f36042a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final int a() {
        return this.f36042a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void b(int i6, int i10, int i11, long j6, int i12) {
        this.f36042a.queueInputBuffer(i6, 0, i11, j6, i12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final android.media.MediaFormat c() {
        return this.f36042a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void d(android.view.Surface surface) {
        this.f36042a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void e(int i6, long j6) {
        this.f36042a.releaseOutputBuffer(i6, j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final /* synthetic */ boolean f(com.google.android.gms.internal.ads.InterfaceC5553wG0 interfaceC5553wG0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void g(int i6) {
        this.f36042a.setVideoScalingMode(i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void h() {
        this.f36042a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void i(int i6, boolean z6) {
        this.f36042a.releaseOutputBuffer(i6, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void j() {
        this.f36042a.flush();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final java.nio.ByteBuffer k(int i6) {
        return this.f36042a.getInputBuffer(i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void l(int i6, int i10, com.google.android.gms.internal.ads.Iy0 iy0, long j6, int i11) {
        this.f36042a.queueSecureInputBuffer(i6, 0, iy0.a(), j6, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void m() {
        com.google.android.gms.internal.ads.C5113sG0 c5113sG0;
        try {
            int i6 = com.google.android.gms.internal.ads.EW.f27061a;
            if (i6 >= 30 && i6 < 33) {
                this.f36042a.stop();
            }
            if (i6 >= 35 && this.f36043b != null) {
            }
        } finally {
            if (com.google.android.gms.internal.ads.EW.f27061a >= 35 && (c5113sG0 = this.f36043b) != null) {
                c5113sG0.c(this.f36042a);
            }
            this.f36042a.release();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final int n(android.media.MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f36042a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }
}
