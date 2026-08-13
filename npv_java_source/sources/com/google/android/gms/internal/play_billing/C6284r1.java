package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6284r1 implements com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.C6314w1 f41641D = new com.google.android.gms.internal.play_billing.C6314w1(com.google.android.gms.internal.play_billing.C6284r1.class);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f41642C;

    C6284r1(java.lang.Object obj) {
        this.f41642C = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1
    public final void g(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.play_billing.AbstractC6294t.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e6) {
            f41641D.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e6);
        }
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.f41642C;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f41642C;
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
        java.lang.Object obj = this.f41642C;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }
}
