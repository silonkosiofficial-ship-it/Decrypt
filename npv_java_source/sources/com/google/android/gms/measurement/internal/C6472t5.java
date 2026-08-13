package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6472t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.RunnableC6465s5 f42640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.measurement.internal.C6445p5 f42641b;

    C6472t5(com.google.android.gms.measurement.internal.C6445p5 c6445p5) {
        this.f42641b = c6445p5;
    }

    final void a() {
        this.f42641b.n();
        if (this.f42640a != null) {
            this.f42641b.f42592c.removeCallbacks(this.f42640a);
        }
        this.f42641b.h().f42742u.a(false);
        this.f42641b.D(false);
        if (this.f42641b.d().t(com.google.android.gms.measurement.internal.G.f41835M0) && this.f42641b.r().J0()) {
            this.f42641b.j().K().a("Retrying trigger URI registration in foreground");
            this.f42641b.r().H0();
        }
    }

    final void b(long j6) {
        this.f42640a = new com.google.android.gms.measurement.internal.RunnableC6465s5(this, this.f42641b.b().a(), j6);
        this.f42641b.f42592c.postDelayed(this.f42640a, 2000L);
    }
}
