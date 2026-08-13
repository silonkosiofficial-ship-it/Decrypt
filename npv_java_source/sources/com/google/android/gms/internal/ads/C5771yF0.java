package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5771yF0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Handler f40023a = new android.os.Handler(android.os.Looper.myLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.media.AudioTrack$StreamEventCallback f40024b = new com.google.android.gms.internal.ads.C5441vF0(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.EF0 f40025c;

    public C5771yF0(com.google.android.gms.internal.ads.EF0 ef0) {
        this.f40025c = ef0;
    }

    public final void a(android.media.AudioTrack audioTrack) {
        final android.os.Handler handler = this.f40023a;
        j$.util.Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.uF0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f40024b);
    }

    public final void b(android.media.AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f40024b);
        this.f40023a.removeCallbacksAndMessages(null);
    }
}
