package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6429n3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42552C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.X2 f42553D;

    RunnableC6429n3(com.google.android.gms.measurement.internal.X2 x6, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42552C = m6;
        this.f42553D = x6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42553D.f42198C.z0();
        com.google.android.gms.measurement.internal.H5 h6 = this.f42553D.f42198C;
        com.google.android.gms.measurement.internal.M5 m6 = this.f42552C;
        h6.l().n();
        h6.A0();
        Q3.AbstractC1477p.f(m6.f42031C);
        h6.o0(m6);
        h6.m0(m6);
    }
}
