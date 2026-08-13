package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6484v3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f42668C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42669D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42670E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ boolean f42671F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService f42672G;

    RunnableC6484v3(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u6, java.lang.String str, java.lang.String str2, boolean z6) {
        this.f42668C = u6;
        this.f42669D = str;
        this.f42670E = str2;
        this.f42671F = z6;
        this.f42672G = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42672G.f41716C.J().G(this.f42668C, this.f42669D, this.f42670E, this.f42671F);
    }
}
