package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5625wy implements com.google.android.gms.internal.ads.InterfaceC3824gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f39745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V3.f f39746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.concurrent.ScheduledFuture f39747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f39748d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39749e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.Runnable f39750f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f39751g = false;

    public C5625wy(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, V3.f fVar) {
        this.f39745a = scheduledExecutorService;
        this.f39746b = fVar;
        p174r3.v.e().c(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3824gc
    public final void a(boolean z6) {
        if (z6) {
            c();
        } else {
            b();
        }
    }

    final synchronized void b() {
        try {
            if (this.f39751g) {
                return;
            }
            java.util.concurrent.ScheduledFuture scheduledFuture = this.f39747c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f39749e = -1L;
            } else {
                this.f39747c.cancel(true);
                this.f39749e = this.f39748d - this.f39746b.c();
            }
            this.f39751g = true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    final synchronized void c() {
        java.util.concurrent.ScheduledFuture scheduledFuture;
        try {
            if (this.f39751g) {
                if (this.f39749e > 0 && (scheduledFuture = this.f39747c) != null && scheduledFuture.isCancelled()) {
                    this.f39747c = this.f39745a.schedule(this.f39750f, this.f39749e, java.util.concurrent.TimeUnit.MILLISECONDS);
                }
                this.f39751g = false;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(int i6, java.lang.Runnable runnable) {
        this.f39750f = runnable;
        long j6 = i6;
        this.f39748d = this.f39746b.c() + j6;
        this.f39747c = this.f39745a.schedule(runnable, j6, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
