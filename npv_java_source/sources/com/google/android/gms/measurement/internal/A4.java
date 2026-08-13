package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class A4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ long f41714C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6492w4 f41715D;

    A4(com.google.android.gms.measurement.internal.C6492w4 c6492w4, long j6) {
        this.f41714C = j6;
        this.f41715D = c6492w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41715D.o().v(this.f41714C);
        this.f41715D.f42682e = null;
    }
}
