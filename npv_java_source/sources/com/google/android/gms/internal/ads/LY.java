package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class LY implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P4.d f29516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f29517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f29518c;

    LY(P4.d dVar, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f29516a = dVar;
        this.f29517b = executor;
        this.f29518c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        P4.d dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(this.f29516a, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.IY
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.MY((java.lang.String) obj));
            }
        }, this.f29517b);
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.qc;
        if (((java.lang.Integer) p184s3.A.c().a(abstractC5037rf)).intValue() > 0) {
            dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.o(dVarN, ((java.lang.Integer) p184s3.A.c().a(abstractC5037rf)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f29518c);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.f(dVarN, java.lang.Throwable.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.KY
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(((java.lang.Throwable) obj) instanceof java.util.concurrent.TimeoutException ? new com.google.android.gms.internal.ads.MY(java.lang.Integer.toString(17)) : new com.google.android.gms.internal.ads.MY(null));
            }
        }, this.f29517b);
    }
}
