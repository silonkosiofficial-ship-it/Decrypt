package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6366e3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42370C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42371D;

    RunnableC6366e3(com.google.android.gms.measurement.internal.X2 x6, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42370C = m6;
        this.f42371D = x6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42371D.f42198C.z0();
        com.google.android.gms.measurement.internal.H5 h6 = this.f42371D.f42198C;
        com.google.android.gms.measurement.internal.M5 m6 = this.f42370C;
        h6.l().n();
        h6.A0();
        Q3.AbstractC1477p.f(m6.f42031C);
        h6.h(m6);
    }
}
