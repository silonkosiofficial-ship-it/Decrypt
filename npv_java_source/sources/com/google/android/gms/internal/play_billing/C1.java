package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class C1 extends com.google.android.gms.internal.play_billing.X0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.lang.Runnable f41331J;

    public C1(java.lang.Runnable runnable) {
        runnable.getClass();
        this.f41331J = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6183a1
    protected final java.lang.String i() {
        return "task=[" + this.f41331J.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f41331J.run();
        } catch (java.lang.Throwable th) {
            p(th);
            throw th;
        }
    }
}
