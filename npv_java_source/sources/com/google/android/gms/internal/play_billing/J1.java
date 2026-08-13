package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class J1 extends com.google.android.gms.internal.play_billing.AbstractC6225h1 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 f41421J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.util.concurrent.ScheduledFuture f41422K;

    private J1(com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1) {
        this.f41421J = interfaceFutureC6320x1;
    }

    static com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 C(com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1, long j6, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        com.google.android.gms.internal.play_billing.J1 j10 = new com.google.android.gms.internal.play_billing.J1(interfaceFutureC6320x1);
        com.google.android.gms.internal.play_billing.G1 g6 = new com.google.android.gms.internal.play_billing.G1(j10);
        j10.f41422K = scheduledExecutorService.schedule(g6, 28500L, timeUnit);
        interfaceFutureC6320x1.g(g6, com.google.android.gms.internal.play_billing.EnumC6219g1.INSTANCE);
        return j10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6183a1
    protected final java.lang.String i() {
        com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1 = this.f41421J;
        java.util.concurrent.ScheduledFuture scheduledFuture = this.f41422K;
        if (interfaceFutureC6320x1 == null) {
            return null;
        }
        java.lang.String str = "inputFuture=[" + interfaceFutureC6320x1.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6183a1
    protected final void n() {
        com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1 = this.f41421J;
        if ((interfaceFutureC6320x1 != null) & isCancelled()) {
            interfaceFutureC6320x1.cancel(r());
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.f41422K;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f41421J = null;
        this.f41422K = null;
    }
}
