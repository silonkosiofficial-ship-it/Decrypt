package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class U2 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f42164C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService f42165D;

    U2(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u6) {
        this.f42164C = u6;
        this.f42165D = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42165D.f41716C.J().D(this.f42164C);
    }
}
