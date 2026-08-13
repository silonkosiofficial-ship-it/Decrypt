package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ce0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2234Ce0 implements com.google.android.gms.internal.ads.InterfaceC2197Be0 {
    /* synthetic */ C2234Ce0(com.google.android.gms.internal.ads.AbstractC2271De0 abstractC2271De0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2197Be0
    public final java.util.concurrent.ExecutorService a(int i6, java.util.concurrent.ThreadFactory threadFactory, int i10) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i6, i6, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2197Be0
    public final java.util.concurrent.ExecutorService b(java.util.concurrent.ThreadFactory threadFactory, int i6) {
        return a(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2197Be0
    public final java.util.concurrent.ExecutorService r(int i6) {
        return a(1, java.util.concurrent.Executors.defaultThreadFactory(), 2);
    }
}
