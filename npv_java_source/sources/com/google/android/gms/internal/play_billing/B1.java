package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class B1 extends com.google.android.gms.internal.play_billing.AbstractC6243k1 implements java.util.concurrent.ScheduledFuture, com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.ScheduledFuture f41329D;

    public B1(com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1, java.util.concurrent.ScheduledFuture scheduledFuture) {
        super(interfaceFutureC6320x1);
        this.f41329D = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        boolean zCancel = m().cancel(z6);
        if (zCancel) {
            this.f41329D.cancel(z6);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        return this.f41329D.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.f41329D.getDelay(timeUnit);
    }
}
