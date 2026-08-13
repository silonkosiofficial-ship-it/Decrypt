package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3841gk0 extends java.util.concurrent.AbstractExecutorService implements com.google.android.gms.internal.ads.Yk0 {
    @Override // com.google.android.gms.internal.ads.Yk0
    public final P4.d H0(java.util.concurrent.Callable callable) {
        return (P4.d) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return com.google.android.gms.internal.ads.RunnableFutureC4831pl0.E(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.util.concurrent.Callable callable) {
        return new com.google.android.gms.internal.ads.RunnableFutureC4831pl0(callable);
    }

    @Override // com.google.android.gms.internal.ads.Yk0
    public final P4.d r(java.lang.Runnable runnable) {
        return (P4.d) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return (P4.d) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return (P4.d) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return (P4.d) super.submit(callable);
    }
}
