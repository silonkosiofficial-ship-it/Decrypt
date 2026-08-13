package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC4171jl0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    com.google.android.gms.internal.ads.C4501ml0 f36730C;

    RunnableC4171jl0(com.google.android.gms.internal.ads.C4501ml0 c4501ml0) {
        this.f36730C = c4501ml0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P4.d dVar;
        com.google.android.gms.internal.ads.C4501ml0 c4501ml0 = this.f36730C;
        if (c4501ml0 == null || (dVar = c4501ml0.f37408J) == null) {
            return;
        }
        this.f36730C = null;
        if (dVar.isDone()) {
            c4501ml0.v(dVar);
            return;
        }
        try {
            java.util.concurrent.ScheduledFuture scheduledFuture = c4501ml0.f37409K;
            c4501ml0.f37409K = null;
            java.lang.String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = java.lang.Math.abs(scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (java.lang.Throwable th) {
                    c4501ml0.h(new com.google.android.gms.internal.ads.C4281kl0(str, null));
                    throw th;
                }
            }
            c4501ml0.h(new com.google.android.gms.internal.ads.C4281kl0(str + ": " + dVar.toString(), null));
            dVar.cancel(true);
        } catch (java.lang.Throwable th2) {
            dVar.cancel(true);
            throw th2;
        }
    }
}
