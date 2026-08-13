package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6423m4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6480v f42528C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42529D;

    RunnableC6423m4(com.google.android.gms.measurement.internal.F3 f6, com.google.android.gms.measurement.internal.C6480v c6480v) {
        this.f42528C = c6480v;
        this.f42529D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f42529D.h().A(this.f42528C)) {
            this.f42529D.j().J().b("Lower precedence consent source ignored, proposed source", java.lang.Integer.valueOf(this.f42528C.a()));
            return;
        }
        this.f42529D.j().K().b("Setting DMA consent(FE)", this.f42528C);
        if (this.f42529D.t().j0()) {
            this.f42529D.t().e0();
        } else {
            this.f42529D.t().U(false);
        }
    }
}
