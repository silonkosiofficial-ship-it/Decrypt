package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5430vA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f39352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f39353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P4.d f39354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f39355d = true;

    public C5430vA(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, P4.d dVar) {
        this.f39352a = executor;
        this.f39353b = scheduledExecutorService;
        this.f39354c = dVar;
    }

    static /* bridge */ /* synthetic */ void b(final com.google.android.gms.internal.ads.C5430vA c5430vA, java.util.List list, final com.google.android.gms.internal.ads.InterfaceC2505Jk0 interfaceC2505Jk0) {
        if (list == null || list.isEmpty()) {
            c5430vA.f39352a.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.qA
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC2505Jk0.a(new com.google.android.gms.internal.ads.C4688oQ(3));
                }
            });
            return;
        }
        P4.d dVarH = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            final P4.d dVar = (P4.d) it.next();
            dVarH = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.f(dVarH, java.lang.Throwable.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.rA
                @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                public final P4.d b(java.lang.Object obj) {
                    interfaceC2505Jk0.a((java.lang.Throwable) obj);
                    return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
                }
            }, c5430vA.f39352a), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.sA
                @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                public final P4.d b(java.lang.Object obj) {
                    return this.f38667a.a(interfaceC2505Jk0, dVar, (com.google.android.gms.internal.ads.AbstractC3673fA) obj);
                }
            }, c5430vA.f39352a);
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarH, new com.google.android.gms.internal.ads.C5320uA(c5430vA, interfaceC2505Jk0), c5430vA.f39352a);
    }

    final /* synthetic */ P4.d a(com.google.android.gms.internal.ads.InterfaceC2505Jk0 interfaceC2505Jk0, P4.d dVar, com.google.android.gms.internal.ads.AbstractC3673fA abstractC3673fA) {
        if (abstractC3673fA != null) {
            interfaceC2505Jk0.c(abstractC3673fA);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.o(dVar, ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2717Pg.f30765a.e()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f39353b);
    }

    final /* synthetic */ void d() {
        this.f39355d = false;
    }

    public final void e(com.google.android.gms.internal.ads.InterfaceC2505Jk0 interfaceC2505Jk0) {
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(this.f39354c, new com.google.android.gms.internal.ads.C5210tA(this, interfaceC2505Jk0), this.f39352a);
    }

    public final boolean f() {
        return this.f39355d;
    }
}
