package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3306br extends com.google.android.gms.internal.ads.AbstractC3841gk0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.Executor f34386C;

    /* synthetic */ C3306br(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.AbstractC3415cr abstractC3415cr) {
        this.f34386C = executor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f34386C.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        throw new java.lang.UnsupportedOperationException();
    }
}
