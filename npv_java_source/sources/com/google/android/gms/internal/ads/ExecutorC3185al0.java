package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.al0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ExecutorC3185al0 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.util.concurrent.Executor f34140C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC3183ak0 f34141D;

    ExecutorC3185al0(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0) {
        this.f34140C = executor;
        this.f34141D = abstractC3183ak0;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        try {
            this.f34140C.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e6) {
            this.f34141D.h(e6);
        }
    }
}
