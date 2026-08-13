package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6213f1 extends java.util.concurrent.AbstractExecutorService implements com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC6326y1 {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return com.google.android.gms.internal.play_billing.L1.B(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.util.concurrent.Callable callable) {
        return new com.google.android.gms.internal.play_billing.L1(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return (com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return (com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return (com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1) super.submit(callable);
    }
}
