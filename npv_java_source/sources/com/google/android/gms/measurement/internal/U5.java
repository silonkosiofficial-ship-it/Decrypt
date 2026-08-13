package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class U5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42169C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42170D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f42171E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.S5 f42172F;

    U5(com.google.android.gms.measurement.internal.S5 s6, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.f42169C = str;
        this.f42170D = str2;
        this.f42171E = bundle;
        this.f42172F = s6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42172F.f42154a.w((com.google.android.gms.measurement.internal.E) Q3.AbstractC1477p.l(this.f42172F.f42154a.y0().H(this.f42169C, this.f42170D, this.f42171E, "auto", this.f42172F.f42154a.b().a(), false, true)), this.f42169C);
    }
}
