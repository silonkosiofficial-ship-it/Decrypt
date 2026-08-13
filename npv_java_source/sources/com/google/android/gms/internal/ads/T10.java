package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class T10 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.L20 f31838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f31840c;

    public T10(com.google.android.gms.internal.ads.L20 l20, long j6, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f31838a = l20;
        this.f31839b = j6;
        this.f31840c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return this.f31838a.a();
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        P4.d dVarB = this.f31838a.b();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25674r2)).booleanValue()) {
            timeUnit = java.util.concurrent.TimeUnit.MICROSECONDS;
        }
        long j6 = this.f31839b;
        if (j6 > 0) {
            dVarB = com.google.android.gms.internal.ads.AbstractC2652Nk0.o(dVarB, j6, timeUnit, this.f31840c);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.f(dVarB, java.lang.Throwable.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.S10
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f31519a.c((java.lang.Throwable) obj);
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }

    final /* synthetic */ P4.d c(java.lang.Throwable th) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25664q2)).booleanValue()) {
            com.google.android.gms.internal.ads.L20 l20 = this.f31838a;
            p174r3.v.s().x(th, "OptionalSignalTimeout:" + l20.a());
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
    }
}
