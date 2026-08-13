package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class r implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.r f38411H = new com.google.android.gms.internal.ads.r();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile long f38412C = -9223372036854775807L;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.os.Handler f38413D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.os.HandlerThread f38414E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.view.Choreographer f38415F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f38416G;

    private r() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f38414E = handlerThread;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper(), this);
        this.f38413D = handler;
        handler.sendEmptyMessage(1);
    }

    public static com.google.android.gms.internal.ads.r a() {
        return f38411H;
    }

    public final void b() {
        this.f38413D.sendEmptyMessage(2);
    }

    public final void c() {
        this.f38413D.sendEmptyMessage(3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        this.f38412C = j6;
        android.view.Choreographer choreographer = this.f38415F;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i6 = message.what;
        if (i6 == 1) {
            try {
                this.f38415F = android.view.Choreographer.getInstance();
            } catch (java.lang.RuntimeException e6) {
                com.google.android.gms.internal.ads.AbstractC3586eM.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e6);
            }
            return true;
        }
        if (i6 == 2) {
            android.view.Choreographer choreographer = this.f38415F;
            if (choreographer != null) {
                int i10 = this.f38416G + 1;
                this.f38416G = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i6 != 3) {
            return false;
        }
        android.view.Choreographer choreographer2 = this.f38415F;
        if (choreographer2 != null) {
            int i11 = this.f38416G - 1;
            this.f38416G = i11;
            if (i11 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f38412C = -9223372036854775807L;
            }
        }
        return true;
    }
}
