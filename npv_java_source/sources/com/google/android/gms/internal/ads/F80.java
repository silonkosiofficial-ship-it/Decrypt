package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class F80 implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f27311a = new java.util.concurrent.atomic.AtomicInteger(1);

    F80() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "AdWorker(NG) #" + this.f27311a.getAndIncrement());
    }
}
