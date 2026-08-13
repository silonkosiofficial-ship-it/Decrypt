package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ThreadFactoryC3094Zq implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f33660a = new java.util.concurrent.atomic.AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.String f33661b;

    ThreadFactoryC3094Zq(java.lang.String str) {
        this.f33661b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "AdWorker(" + this.f33661b + ") #" + this.f33660a.getAndIncrement());
    }
}
