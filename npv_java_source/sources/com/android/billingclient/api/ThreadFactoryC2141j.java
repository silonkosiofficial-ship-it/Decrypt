package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class ThreadFactoryC2141j implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ThreadFactory f24608a = java.util.concurrent.Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f24609b = new java.util.concurrent.atomic.AtomicInteger(1);

    ThreadFactoryC2141j(com.android.billingclient.api.C2133b c2133b) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f24609b;
        java.lang.Thread threadNewThread = this.f24608a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
