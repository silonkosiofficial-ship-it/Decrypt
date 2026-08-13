package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6483v2 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ boolean f42666C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6490w2 f42667D;

    RunnableC6483v2(com.google.android.gms.measurement.internal.C6490w2 c6490w2, boolean z6) {
        this.f42666C = z6;
        this.f42667D = c6490w2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42667D.f42676a.K(this.f42666C);
    }
}
