package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class Z3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ long f42239C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42240D;

    Z3(com.google.android.gms.measurement.internal.F3 f6, long j6) {
        this.f42239C = j6;
        this.f42240D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42240D.M0(this.f42239C);
        this.f42240D.t().Q(new java.util.concurrent.atomic.AtomicReference());
    }
}
