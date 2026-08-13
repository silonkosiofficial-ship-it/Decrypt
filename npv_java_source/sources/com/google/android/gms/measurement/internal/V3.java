package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class V3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ long f42174C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42175D;

    V3(com.google.android.gms.measurement.internal.F3 f6, long j6) {
        this.f42174C = j6;
        this.f42175D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42175D.h().f42734m.b(this.f42174C);
        this.f42175D.j().F().b("Session timeout duration set", java.lang.Long.valueOf(this.f42174C));
    }
}
