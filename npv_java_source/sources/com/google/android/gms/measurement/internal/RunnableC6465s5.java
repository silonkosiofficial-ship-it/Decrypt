package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6465s5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    long f42625C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    long f42626D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.measurement.internal.C6472t5 f42627E;

    RunnableC6465s5(com.google.android.gms.measurement.internal.C6472t5 c6472t5, long j6, long j10) {
        this.f42627E = c6472t5;
        this.f42625C = j6;
        this.f42626D = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42627E.f42641b.l().D(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.v5
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.RunnableC6465s5 runnableC6465s5 = this.f42673C;
                com.google.android.gms.measurement.internal.C6472t5 c6472t5 = runnableC6465s5.f42627E;
                long j6 = runnableC6465s5.f42625C;
                long j10 = runnableC6465s5.f42626D;
                c6472t5.f42641b.n();
                c6472t5.f42641b.j().F().a("Application going to the background");
                c6472t5.f42641b.h().f42742u.a(true);
                c6472t5.f42641b.D(true);
                if (!c6472t5.f42641b.d().V()) {
                    if (c6472t5.f42641b.d().t(com.google.android.gms.measurement.internal.G.f41843Q0)) {
                        c6472t5.f42641b.E(false, false, j10);
                        c6472t5.f42641b.f42595f.e(j10);
                    } else {
                        c6472t5.f42641b.f42595f.e(j10);
                        c6472t5.f42641b.E(false, false, j10);
                    }
                }
                c6472t5.f42641b.j().J().b("Application backgrounded at: timestamp_millis", java.lang.Long.valueOf(j6));
                if (c6472t5.f42641b.d().t(com.google.android.gms.measurement.internal.G.f41876e1)) {
                    c6472t5.f42641b.r().B0();
                }
            }
        });
    }
}
