package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ml0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4501ml0 extends com.google.android.gms.internal.ads.AbstractC2246Ck0 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private P4.d f37408J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.util.concurrent.ScheduledFuture f37409K;

    private C4501ml0(P4.d dVar) {
        dVar.getClass();
        this.f37408J = dVar;
    }

    static P4.d F(P4.d dVar, long j6, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        com.google.android.gms.internal.ads.C4501ml0 c4501ml0 = new com.google.android.gms.internal.ads.C4501ml0(dVar);
        com.google.android.gms.internal.ads.RunnableC4171jl0 runnableC4171jl0 = new com.google.android.gms.internal.ads.RunnableC4171jl0(c4501ml0);
        c4501ml0.f37409K = scheduledExecutorService.schedule(runnableC4171jl0, j6, timeUnit);
        dVar.e(runnableC4171jl0, com.google.android.gms.internal.ads.EnumC2172Ak0.INSTANCE);
        return c4501ml0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    protected final java.lang.String c() {
        P4.d dVar = this.f37408J;
        java.util.concurrent.ScheduledFuture scheduledFuture = this.f37409K;
        if (dVar == null) {
            return null;
        }
        java.lang.String str = "inputFuture=[" + dVar.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    protected final void d() {
        u(this.f37408J);
        java.util.concurrent.ScheduledFuture scheduledFuture = this.f37409K;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f37408J = null;
        this.f37409K = null;
    }
}
