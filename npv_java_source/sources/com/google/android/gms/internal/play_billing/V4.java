package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class V4 implements com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.lang.ref.WeakReference f41491C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.R4 f41492D = new com.google.android.gms.internal.play_billing.U4(this);

    V4(com.google.android.gms.internal.play_billing.S4 s6) {
        this.f41491C = new java.lang.ref.WeakReference(s6);
    }

    final boolean a(java.lang.Object obj) {
        return this.f41492D.c(obj);
    }

    final boolean b(java.lang.Throwable th) {
        com.google.android.gms.internal.play_billing.W2 w6 = new com.google.android.gms.internal.play_billing.W2(th);
        com.google.android.gms.internal.play_billing.D1 d6 = com.google.android.gms.internal.play_billing.R4.f41454H;
        com.google.android.gms.internal.play_billing.R4 r6 = this.f41492D;
        if (!d6.d(r6, null, w6)) {
            return false;
        }
        com.google.android.gms.internal.play_billing.R4.b(r6);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        com.google.android.gms.internal.play_billing.S4 s6 = (com.google.android.gms.internal.play_billing.S4) this.f41491C.get();
        boolean zCancel = this.f41492D.cancel(z6);
        if (!zCancel || s6 == null) {
            return zCancel;
        }
        s6.a();
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1
    public final void g(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f41492D.g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.f41492D.get();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) {
        return this.f41492D.get(j6, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f41492D.f41456C instanceof com.google.android.gms.internal.play_billing.C6202d2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f41492D.isDone();
    }

    public final java.lang.String toString() {
        return this.f41492D.toString();
    }
}
