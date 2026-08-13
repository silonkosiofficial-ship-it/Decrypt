package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class J5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.W5 f42006C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.H5 f42007D;

    J5(com.google.android.gms.measurement.internal.H5 h6, com.google.android.gms.measurement.internal.W5 w6) {
        this.f42006C = w6;
        this.f42007D = h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.H5.y(this.f42007D, this.f42006C);
        this.f42007D.D0();
    }
}
