package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class Y implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ long f42217C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6501y f42218D;

    Y(com.google.android.gms.measurement.internal.C6501y c6501y, long j6) {
        this.f42217C = j6;
        this.f42218D = c6501y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42218D.B(this.f42217C);
    }
}
