package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6359d3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42340C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42341D;

    RunnableC6359d3(com.google.android.gms.measurement.internal.X2 x6, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42340C = m6;
        this.f42341D = x6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42341D.f42198C.z0();
        this.f42341D.f42198C.h0(this.f42340C);
    }
}
