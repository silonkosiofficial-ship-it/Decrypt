package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2800Rk0 implements P4.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    static final P4.d f31347D = new com.google.android.gms.internal.ads.C2800Rk0(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Wk0 f31348E = new com.google.android.gms.internal.ads.Wk0(com.google.android.gms.internal.ads.C2800Rk0.class);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f31349C;

    C2800Rk0(java.lang.Object obj) {
        this.f31349C = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // P4.d
    public final void e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.c(runnable, "Runnable was null.");
        com.google.android.gms.internal.ads.AbstractC2164Ag0.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e6) {
            f31348E.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + java.lang.String.valueOf(runnable) + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e6);
        }
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.f31349C;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f31349C;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.f31349C;
        return super.toString() + "[status=SUCCESS, result=[" + java.lang.String.valueOf(obj) + "]]";
    }
}
