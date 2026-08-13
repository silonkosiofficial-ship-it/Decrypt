package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6452q5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ long f42604C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6445p5 f42605D;

    RunnableC6452q5(com.google.android.gms.measurement.internal.C6445p5 c6445p5, long j6) {
        this.f42604C = j6;
        this.f42605D = c6445p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.C6445p5.C(this.f42605D, this.f42604C);
    }
}
