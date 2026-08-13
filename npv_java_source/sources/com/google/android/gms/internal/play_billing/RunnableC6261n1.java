package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6261n1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.concurrent.Future f41597C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final com.google.android.gms.internal.play_billing.InterfaceC6255m1 f41598D;

    RunnableC6261n1(java.util.concurrent.Future future, com.google.android.gms.internal.play_billing.InterfaceC6255m1 interfaceC6255m1) {
        this.f41597C = future;
        this.f41598D = interfaceC6255m1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.lang.Throwable thA;
        boolean z6 = true;
        boolean z10 = false;
        java.lang.Object obj2 = this.f41597C;
        if ((obj2 instanceof com.google.android.gms.internal.play_billing.M1) && (thA = com.google.android.gms.internal.play_billing.N1.a((com.google.android.gms.internal.play_billing.M1) obj2)) != null) {
            this.f41598D.a(thA);
            return;
        }
        try {
            java.util.concurrent.Future future = this.f41597C;
            if (!future.isDone()) {
                throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.AbstractC6300u.a("Future was expected to be done: %s", future));
            }
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z10 = z6;
                } catch (java.lang.Throwable th) {
                    if (z10) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z10) {
                java.lang.Thread.currentThread().interrupt();
            }
            this.f41598D.c(obj);
        } catch (java.util.concurrent.ExecutionException e6) {
            this.f41598D.a(e6.getCause());
        } catch (java.lang.Throwable th2) {
            this.f41598D.a(th2);
        }
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.play_billing.C6271p c6271pA = com.google.android.gms.internal.play_billing.r.a(this);
        c6271pA.a(this.f41598D);
        return c6271pA.toString();
    }
}
