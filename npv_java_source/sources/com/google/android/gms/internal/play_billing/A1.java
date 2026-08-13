package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
class A1 extends com.google.android.gms.internal.play_billing.AbstractC6213f1 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f41316C;

    A1(java.util.concurrent.ExecutorService executorService) {
        executorService.getClass();
        this.f41316C = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, java.util.concurrent.TimeUnit timeUnit) {
        return this.f41316C.awaitTermination(j6, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f41316C.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f41316C.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f41316C.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f41316C.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        return this.f41316C.shutdownNow();
    }

    public final java.lang.String toString() {
        java.util.concurrent.ExecutorService executorService = this.f41316C;
        return super.toString() + "[" + java.lang.String.valueOf(executorService) + "]";
    }
}
