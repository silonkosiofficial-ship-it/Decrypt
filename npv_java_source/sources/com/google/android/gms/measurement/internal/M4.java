package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class M4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.a f42029C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService f42030D;

    M4(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.a aVar) {
        this.f42029C = aVar;
        this.f42030D = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42030D.f41716C.H().a0(this.f42029C);
    }
}
