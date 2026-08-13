package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class L1 extends com.google.android.gms.internal.play_billing.AbstractC6225h1 implements java.util.concurrent.RunnableFuture {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private volatile com.google.android.gms.internal.play_billing.AbstractRunnableC6308v1 f41430J;

    L1(java.util.concurrent.Callable callable) {
        this.f41430J = new com.google.android.gms.internal.play_billing.K1(this, callable);
    }

    static com.google.android.gms.internal.play_billing.L1 B(java.lang.Runnable runnable, java.lang.Object obj) {
        return new com.google.android.gms.internal.play_billing.L1(java.util.concurrent.Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6183a1
    protected final java.lang.String i() {
        com.google.android.gms.internal.play_billing.AbstractRunnableC6308v1 abstractRunnableC6308v1 = this.f41430J;
        if (abstractRunnableC6308v1 == null) {
            return super.i();
        }
        return "task=[" + abstractRunnableC6308v1.toString() + "]";
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6183a1
    protected final void n() {
        com.google.android.gms.internal.play_billing.AbstractRunnableC6308v1 abstractRunnableC6308v1;
        if (r() && (abstractRunnableC6308v1 = this.f41430J) != null) {
            abstractRunnableC6308v1.e();
        }
        this.f41430J = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.play_billing.AbstractRunnableC6308v1 abstractRunnableC6308v1 = this.f41430J;
        if (abstractRunnableC6308v1 != null) {
            abstractRunnableC6308v1.run();
        }
        this.f41430J = null;
    }
}
