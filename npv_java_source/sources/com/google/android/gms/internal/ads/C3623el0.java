package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.el0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3623el0 extends com.google.android.gms.internal.ads.C3295bl0 implements com.google.android.gms.internal.ads.Zk0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final java.util.concurrent.ScheduledExecutorService f35047D;

    C3623el0(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f35047D = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable runnable, long j6, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f35047D;
        com.google.android.gms.internal.ads.RunnableFutureC4831pl0 runnableFutureC4831pl0E = com.google.android.gms.internal.ads.RunnableFutureC4831pl0.E(runnable, null);
        return new com.google.android.gms.internal.ads.C3404cl0(runnableFutureC4831pl0E, scheduledExecutorService.schedule(runnableFutureC4831pl0E, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j6, long j10, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.ads.RunnableC3514dl0 runnableC3514dl0 = new com.google.android.gms.internal.ads.RunnableC3514dl0(runnable);
        return new com.google.android.gms.internal.ads.C3404cl0(runnableC3514dl0, this.f35047D.scheduleAtFixedRate(runnableC3514dl0, j6, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j6, long j10, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.ads.RunnableC3514dl0 runnableC3514dl0 = new com.google.android.gms.internal.ads.RunnableC3514dl0(runnable);
        return new com.google.android.gms.internal.ads.C3404cl0(runnableC3514dl0, this.f35047D.scheduleWithFixedDelay(runnableC3514dl0, j6, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.Xk0 schedule(java.util.concurrent.Callable callable, long j6, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.ads.RunnableFutureC4831pl0 runnableFutureC4831pl0 = new com.google.android.gms.internal.ads.RunnableFutureC4831pl0(callable);
        return new com.google.android.gms.internal.ads.C3404cl0(runnableFutureC4831pl0, this.f35047D.schedule(runnableFutureC4831pl0, j6, timeUnit));
    }
}
