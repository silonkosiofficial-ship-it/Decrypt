package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6380g3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42408C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42409D;

    RunnableC6380g3(com.google.android.gms.measurement.internal.X2 x6, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42408C = m6;
        this.f42409D = x6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42409D.f42198C.z0();
        this.f42409D.f42198C.f0(this.f42408C);
    }
}
