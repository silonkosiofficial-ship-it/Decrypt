package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class E1 extends com.google.android.gms.internal.play_billing.A1 implements com.google.android.gms.internal.play_billing.InterfaceScheduledExecutorServiceC6331z1 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final java.util.concurrent.ScheduledExecutorService f41338D;

    E1(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f41338D = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable runnable, long j6, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f41338D;
        com.google.android.gms.internal.play_billing.L1 l1B = com.google.android.gms.internal.play_billing.L1.B(runnable, null);
        return new com.google.android.gms.internal.play_billing.B1(l1B, scheduledExecutorService.schedule(l1B, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable callable, long j6, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.play_billing.L1 l6 = new com.google.android.gms.internal.play_billing.L1(callable);
        return new com.google.android.gms.internal.play_billing.B1(l6, this.f41338D.schedule(l6, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j6, long j10, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.play_billing.C1 c6 = new com.google.android.gms.internal.play_billing.C1(runnable);
        return new com.google.android.gms.internal.play_billing.B1(c6, this.f41338D.scheduleAtFixedRate(c6, j6, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j6, long j10, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.play_billing.C1 c6 = new com.google.android.gms.internal.play_billing.C1(runnable);
        return new com.google.android.gms.internal.play_billing.B1(c6, this.f41338D.scheduleWithFixedDelay(c6, j6, j10, timeUnit));
    }
}
