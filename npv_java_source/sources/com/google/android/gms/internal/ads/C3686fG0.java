package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3686fG0 implements com.google.android.gms.internal.ads.InterfaceC5663xG0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.media.MediaCodec f35307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4454mG0 f35308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5773yG0 f35309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5113sG0 f35310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35312f = 0;

    /* synthetic */ C3686fG0(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, com.google.android.gms.internal.ads.InterfaceC5773yG0 interfaceC5773yG0, com.google.android.gms.internal.ads.C5113sG0 c5113sG0, com.google.android.gms.internal.ads.AbstractC3576eG0 abstractC3576eG0) {
        this.f35307a = mediaCodec;
        this.f35308b = new com.google.android.gms.internal.ads.C4454mG0(handlerThread);
        this.f35309c = interfaceC5773yG0;
        this.f35310d = c5113sG0;
    }

    static /* bridge */ /* synthetic */ void q(com.google.android.gms.internal.ads.C3686fG0 c3686fG0, android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i6) {
        com.google.android.gms.internal.ads.C5113sG0 c5113sG0;
        c3686fG0.f35308b.f(c3686fG0.f35307a);
        android.os.Trace.beginSection("configureCodec");
        c3686fG0.f35307a.configure(mediaFormat, surface, (android.media.MediaCrypto) null, i6);
        android.os.Trace.endSection();
        c3686fG0.f35309c.g();
        android.os.Trace.beginSection("startCodec");
        c3686fG0.f35307a.start();
        android.os.Trace.endSection();
        if (com.google.android.gms.internal.ads.EW.f27061a >= 35 && (c5113sG0 = c3686fG0.f35310d) != null) {
            c5113sG0.a(c3686fG0.f35307a);
        }
        c3686fG0.f35312f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String r(int i6, java.lang.String str) {
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        if (i6 == 1) {
            str2 = "Audio";
        } else if (i6 == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i6);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final java.nio.ByteBuffer D(int i6) {
        return this.f35307a.getOutputBuffer(i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void U(android.os.Bundle bundle) {
        this.f35309c.a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final int a() {
        this.f35309c.c();
        return this.f35308b.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void b(int i6, int i10, int i11, long j6, int i12) {
        this.f35309c.d(i6, 0, i11, j6, i12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final android.media.MediaFormat c() {
        return this.f35308b.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void d(android.view.Surface surface) {
        this.f35307a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void e(int i6, long j6) {
        this.f35307a.releaseOutputBuffer(i6, j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final boolean f(com.google.android.gms.internal.ads.InterfaceC5553wG0 interfaceC5553wG0) {
        this.f35308b.g(interfaceC5553wG0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void g(int i6) {
        this.f35307a.setVideoScalingMode(i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void h() {
        this.f35307a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void i(int i6, boolean z6) {
        this.f35307a.releaseOutputBuffer(i6, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void j() {
        this.f35309c.b();
        this.f35307a.flush();
        this.f35308b.e();
        this.f35307a.start();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final java.nio.ByteBuffer k(int i6) {
        return this.f35307a.getInputBuffer(i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void l(int i6, int i10, com.google.android.gms.internal.ads.Iy0 iy0, long j6, int i11) {
        this.f35309c.e(i6, 0, iy0, j6, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final void m() {
        com.google.android.gms.internal.ads.C5113sG0 c5113sG0;
        com.google.android.gms.internal.ads.C5113sG0 c5113sG1;
        try {
            try {
                if (this.f35312f == 1) {
                    this.f35309c.i();
                    this.f35308b.h();
                }
                this.f35312f = 2;
            } finally {
                if (!this.f35311e) {
                    int i6 = com.google.android.gms.internal.ads.EW.f27061a;
                    if (i6 >= 30 && i6 < 33) {
                        this.f35307a.stop();
                    }
                    if (i6 >= 35 && (c5113sG1 = this.f35310d) != null) {
                        c5113sG1.c(this.f35307a);
                    }
                    this.f35307a.release();
                    this.f35311e = true;
                }
            }
        } catch (java.lang.Throwable th) {
            if (com.google.android.gms.internal.ads.EW.f27061a >= 35 && (c5113sG0 = this.f35310d) != null) {
                c5113sG0.c(this.f35307a);
            }
            this.f35307a.release();
            this.f35311e = true;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5663xG0
    public final int n(android.media.MediaCodec.BufferInfo bufferInfo) {
        this.f35309c.c();
        return this.f35308b.b(bufferInfo);
    }
}
