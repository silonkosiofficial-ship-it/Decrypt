package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4462mK0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C3694fK0 f37334d = new com.google.android.gms.internal.ads.C3694fK0(2, -9223372036854775807L, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C3694fK0 f37335e = new com.google.android.gms.internal.ads.C3694fK0(3, -9223372036854775807L, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceExecutorC5451vK0 f37336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.HandlerC3804gK0 f37337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.io.IOException f37338c;

    public C4462mK0(java.lang.String str) {
        final java.lang.String str2 = "ExoPlayer:Loader:ProgressiveMediaPeriod";
        this.f37336a = com.google.android.gms.internal.ads.AbstractC5231tK0.a(java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.CV

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f26238a = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return new java.lang.Thread(runnable, this.f26238a);
            }
        }), new com.google.android.gms.internal.ads.InterfaceC5000rF() { // from class: com.google.android.gms.internal.ads.dK0
            @Override // com.google.android.gms.internal.ads.InterfaceC5000rF
            public final void b(java.lang.Object obj) {
                ((java.util.concurrent.ExecutorService) obj).shutdown();
            }
        });
    }

    public static com.google.android.gms.internal.ads.C3694fK0 b(boolean z6, long j6) {
        return new com.google.android.gms.internal.ads.C3694fK0(z6 ? 1 : 0, j6, null);
    }

    public final long a(com.google.android.gms.internal.ads.InterfaceC3914hK0 interfaceC3914hK0, com.google.android.gms.internal.ads.InterfaceC3584eK0 interfaceC3584eK0, int i6) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        com.google.android.gms.internal.ads.LC.b(looperMyLooper);
        this.f37338c = null;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        new com.google.android.gms.internal.ads.HandlerC3804gK0(this, looperMyLooper, interfaceC3914hK0, interfaceC3584eK0, i6, jElapsedRealtime).c(0L);
        return jElapsedRealtime;
    }

    public final void g() {
        com.google.android.gms.internal.ads.HandlerC3804gK0 handlerC3804gK0 = this.f37337b;
        com.google.android.gms.internal.ads.LC.b(handlerC3804gK0);
        handlerC3804gK0.a(false);
    }

    public final void h() {
        this.f37338c = null;
    }

    public final void i(int i6) throws java.io.IOException {
        java.io.IOException iOException = this.f37338c;
        if (iOException != null) {
            throw iOException;
        }
        com.google.android.gms.internal.ads.HandlerC3804gK0 handlerC3804gK0 = this.f37337b;
        if (handlerC3804gK0 != null) {
            handlerC3804gK0.b(i6);
        }
    }

    public final void j(com.google.android.gms.internal.ads.InterfaceC4024iK0 interfaceC4024iK0) {
        com.google.android.gms.internal.ads.HandlerC3804gK0 handlerC3804gK0 = this.f37337b;
        if (handlerC3804gK0 != null) {
            handlerC3804gK0.a(true);
        }
        this.f37336a.execute(new com.google.android.gms.internal.ads.RunnableC4132jK0(interfaceC4024iK0));
        this.f37336a.a();
    }

    public final boolean k() {
        return this.f37338c != null;
    }

    public final boolean l() {
        return this.f37337b != null;
    }
}
