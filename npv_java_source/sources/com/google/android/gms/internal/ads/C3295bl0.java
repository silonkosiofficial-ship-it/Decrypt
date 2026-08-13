package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C3295bl0 extends com.google.android.gms.internal.ads.AbstractC3841gk0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f34369C;

    C3295bl0(java.util.concurrent.ExecutorService executorService) {
        executorService.getClass();
        this.f34369C = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, java.util.concurrent.TimeUnit timeUnit) {
        return this.f34369C.awaitTermination(j6, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f34369C.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f34369C.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f34369C.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f34369C.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        return this.f34369C.shutdownNow();
    }

    public final java.lang.String toString() {
        java.util.concurrent.ExecutorService executorService = this.f34369C;
        return super.toString() + "[" + java.lang.String.valueOf(executorService) + "]";
    }
}
