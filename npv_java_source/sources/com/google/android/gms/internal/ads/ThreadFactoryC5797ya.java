package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ThreadFactoryC5797ya implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ThreadFactory f40102a = java.util.concurrent.Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f40103b = new java.util.concurrent.atomic.AtomicInteger(1);

    ThreadFactoryC5797ya() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f40103b;
        java.lang.Thread threadNewThread = this.f40102a.newThread(runnable);
        threadNewThread.setName("gads-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
