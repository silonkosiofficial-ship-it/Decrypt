package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6389h5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.ServiceConnectionC6361d5 f42423C;

    RunnableC6389h5(com.google.android.gms.measurement.internal.ServiceConnectionC6361d5 serviceConnectionC6361d5) {
        this.f42423C = serviceConnectionC6361d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.F4.K(this.f42423C.f42350c, new android.content.ComponentName(this.f42423C.f42350c.a(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
