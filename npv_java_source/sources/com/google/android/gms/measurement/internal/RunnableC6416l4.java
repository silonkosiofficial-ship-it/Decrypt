package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6416l4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.A3 f42509C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ long f42510D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ long f42511E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ boolean f42512F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.A3 f42513G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42514H;

    RunnableC6416l4(com.google.android.gms.measurement.internal.F3 f6, com.google.android.gms.measurement.internal.A3 a6, long j6, long j10, boolean z6, com.google.android.gms.measurement.internal.A3 a10) {
        this.f42509C = a6;
        this.f42510D = j6;
        this.f42511E = j10;
        this.f42512F = z6;
        this.f42513G = a10;
        this.f42514H = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42514H.R(this.f42509C);
        if (!com.google.android.gms.internal.measurement.C6038i6.a() || !this.f42514H.d().t(com.google.android.gms.measurement.internal.G.f41859Y0)) {
            this.f42514H.J(this.f42510D, false);
        }
        com.google.android.gms.measurement.internal.F3.V(this.f42514H, this.f42509C, this.f42511E, true, this.f42512F);
        com.google.android.gms.measurement.internal.F3.W(this.f42514H, this.f42509C, this.f42513G);
    }
}
