package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6424m5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.H5 f42530C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.Runnable f42531D;

    RunnableC6424m5(com.google.android.gms.measurement.internal.C6417l5 c6417l5, com.google.android.gms.measurement.internal.H5 h6, java.lang.Runnable runnable) {
        this.f42530C = h6;
        this.f42531D = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        this.f42530C.z0();
        this.f42530C.A(this.f42531D);
        this.f42530C.E0();
    }
}
