package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class D4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6499x4 f41766C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ long f41767D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6492w4 f41768E;

    D4(com.google.android.gms.measurement.internal.C6492w4 c6492w4, com.google.android.gms.measurement.internal.C6499x4 c6499x4, long j6) {
        this.f41766C = c6499x4;
        this.f41767D = j6;
        this.f41768E = c6492w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41768E.O(this.f41766C, false, this.f41767D);
        com.google.android.gms.measurement.internal.C6492w4 c6492w4 = this.f41768E;
        c6492w4.f42682e = null;
        c6492w4.t().J(null);
    }
}
