package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3404cl0 extends com.google.android.gms.internal.ads.AbstractC2431Hk0 implements com.google.android.gms.internal.ads.Xk0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.ScheduledFuture f34561D;

    public C3404cl0(P4.d dVar, java.util.concurrent.ScheduledFuture scheduledFuture) {
        super(dVar);
        this.f34561D = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        boolean zCancel = o().cancel(z6);
        if (zCancel) {
            this.f34561D.cancel(z6);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        return this.f34561D.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.f34561D.getDelay(timeUnit);
    }
}
