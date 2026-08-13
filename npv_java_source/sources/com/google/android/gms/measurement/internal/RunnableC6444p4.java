package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6444p4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.A3 f42587C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ long f42588D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ boolean f42589E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.A3 f42590F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42591G;

    RunnableC6444p4(com.google.android.gms.measurement.internal.F3 f6, com.google.android.gms.measurement.internal.A3 a6, long j6, boolean z6, com.google.android.gms.measurement.internal.A3 a10) {
        this.f42587C = a6;
        this.f42588D = j6;
        this.f42589E = z6;
        this.f42590F = a10;
        this.f42591G = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42591G.R(this.f42587C);
        com.google.android.gms.measurement.internal.F3.V(this.f42591G, this.f42587C, this.f42588D, false, this.f42589E);
        com.google.android.gms.measurement.internal.F3.W(this.f42591G, this.f42587C, this.f42590F);
    }
}
