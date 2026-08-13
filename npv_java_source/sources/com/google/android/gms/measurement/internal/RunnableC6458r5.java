package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6458r5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ long f42614C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6445p5 f42615D;

    RunnableC6458r5(com.google.android.gms.measurement.internal.C6445p5 c6445p5, long j6) {
        this.f42614C = j6;
        this.f42615D = c6445p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.C6445p5.I(this.f42615D, this.f42614C);
    }
}
