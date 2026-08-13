package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class Y2 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.D3 f42219C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.S2 f42220D;

    Y2(com.google.android.gms.measurement.internal.S2 s6, com.google.android.gms.measurement.internal.D3 d6) {
        this.f42219C = d6;
        this.f42220D = s6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.S2.g(this.f42220D, this.f42219C);
        this.f42220D.d(this.f42219C.f41762g);
    }
}
