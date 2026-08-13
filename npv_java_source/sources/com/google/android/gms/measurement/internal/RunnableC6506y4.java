package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6506y4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6499x4 f42711C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6499x4 f42712D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ long f42713E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ boolean f42714F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6492w4 f42715G;

    RunnableC6506y4(com.google.android.gms.measurement.internal.C6492w4 c6492w4, com.google.android.gms.measurement.internal.C6499x4 c6499x4, com.google.android.gms.measurement.internal.C6499x4 c6499x5, long j6, boolean z6) {
        this.f42711C = c6499x4;
        this.f42712D = c6499x5;
        this.f42713E = j6;
        this.f42714F = z6;
        this.f42715G = c6492w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42715G.N(this.f42711C, this.f42712D, this.f42713E, this.f42714F, null);
    }
}
