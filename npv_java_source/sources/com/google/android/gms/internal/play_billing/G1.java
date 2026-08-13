package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class G1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    com.google.android.gms.internal.play_billing.J1 f41401C;

    G1(com.google.android.gms.internal.play_billing.J1 j6) {
        this.f41401C = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1;
        com.google.android.gms.internal.play_billing.J1 j6 = this.f41401C;
        if (j6 == null || (interfaceFutureC6320x1 = j6.f41421J) == null) {
            return;
        }
        this.f41401C = null;
        if (interfaceFutureC6320x1.isDone()) {
            j6.q(interfaceFutureC6320x1);
            return;
        }
        try {
            java.util.concurrent.ScheduledFuture scheduledFuture = j6.f41422K;
            j6.f41422K = null;
            java.lang.String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = java.lang.Math.abs(scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (java.lang.Throwable th) {
                    j6.p(new com.google.android.gms.internal.play_billing.H1(str, null));
                    throw th;
                }
            }
            j6.p(new com.google.android.gms.internal.play_billing.H1(str + ": " + interfaceFutureC6320x1.toString(), null));
            interfaceFutureC6320x1.cancel(true);
        } catch (java.lang.Throwable th2) {
            interfaceFutureC6320x1.cancel(true);
            throw th2;
        }
    }
}
