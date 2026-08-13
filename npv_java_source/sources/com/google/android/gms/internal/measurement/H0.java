package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class H0 implements com.google.android.gms.internal.measurement.E0 {
    private H0() {
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final java.util.concurrent.ExecutorService a(java.util.concurrent.ThreadFactory threadFactory, int i6) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
