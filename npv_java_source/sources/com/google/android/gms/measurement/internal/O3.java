package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class O3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f42071C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.E f42072D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42073E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService f42074F;

    O3(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u6, com.google.android.gms.measurement.internal.E e6, java.lang.String str) {
        this.f42071C = u6;
        this.f42072D = e6;
        this.f42073E = str;
        this.f42074F = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42074F.f41716C.J().E(this.f42071C, this.f42072D, this.f42073E);
    }
}
