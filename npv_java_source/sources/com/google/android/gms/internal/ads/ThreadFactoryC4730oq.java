package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ThreadFactoryC4730oq implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f37876a = new java.util.concurrent.atomic.AtomicInteger(1);

    ThreadFactoryC4730oq(com.google.android.gms.internal.ads.C4840pq c4840pq) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + this.f37876a.getAndIncrement());
    }
}
