package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableFutureC4831pl0 extends com.google.android.gms.internal.ads.AbstractC2246Ck0 implements java.util.concurrent.RunnableFuture {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private volatile com.google.android.gms.internal.ads.Vk0 f38065J;

    RunnableFutureC4831pl0(com.google.android.gms.internal.ads.InterfaceC5158sk0 interfaceC5158sk0) {
        this.f38065J = new com.google.android.gms.internal.ads.C4611nl0(this, interfaceC5158sk0);
    }

    RunnableFutureC4831pl0(java.util.concurrent.Callable callable) {
        this.f38065J = new com.google.android.gms.internal.ads.C4721ol0(this, callable);
    }

    static com.google.android.gms.internal.ads.RunnableFutureC4831pl0 E(java.lang.Runnable runnable, java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.RunnableFutureC4831pl0(java.util.concurrent.Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    protected final java.lang.String c() {
        com.google.android.gms.internal.ads.Vk0 vk0 = this.f38065J;
        if (vk0 == null) {
            return super.c();
        }
        return "task=[" + vk0.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    protected final void d() {
        com.google.android.gms.internal.ads.Vk0 vk0;
        if (w() && (vk0 = this.f38065J) != null) {
            vk0.g();
        }
        this.f38065J = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.Vk0 vk0 = this.f38065J;
        if (vk0 != null) {
            vk0.run();
        }
        this.f38065J = null;
    }
}
