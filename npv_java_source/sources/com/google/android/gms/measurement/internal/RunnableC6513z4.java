package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6513z4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f42749C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6499x4 f42750D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6499x4 f42751E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ long f42752F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6492w4 f42753G;

    RunnableC6513z4(com.google.android.gms.measurement.internal.C6492w4 c6492w4, android.os.Bundle bundle, com.google.android.gms.measurement.internal.C6499x4 c6499x4, com.google.android.gms.measurement.internal.C6499x4 c6499x5, long j6) {
        this.f42749C = bundle;
        this.f42750D = c6499x4;
        this.f42751E = c6499x5;
        this.f42752F = j6;
        this.f42753G = c6492w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.C6492w4.J(this.f42753G, this.f42749C, this.f42750D, this.f42751E, this.f42752F);
    }
}
