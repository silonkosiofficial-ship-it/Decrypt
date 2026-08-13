package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6437o4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f42569C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42570D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42571E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService f42572F;

    RunnableC6437o4(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u6, java.lang.String str, java.lang.String str2) {
        this.f42569C = u6;
        this.f42570D = str;
        this.f42571E = str2;
        this.f42572F = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42572F.f41716C.J().F(this.f42569C, this.f42570D, this.f42571E);
    }
}
