package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class DV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f26708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f26709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4111jA f26710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.TV f26711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2337Fa0 f26712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4062il0 f26713f = com.google.android.gms.internal.ads.C4062il0.D();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f26714g = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.EV f26715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3558e70 f26716i;

    DV(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.InterfaceC4111jA interfaceC4111jA, com.google.android.gms.internal.ads.TV tv, com.google.android.gms.internal.ads.C2337Fa0 c2337Fa0) {
        this.f26708a = executor;
        this.f26709b = scheduledExecutorService;
        this.f26710c = interfaceC4111jA;
        this.f26711d = tv;
        this.f26712e = c2337Fa0;
    }

    private final synchronized P4.d d(com.google.android.gms.internal.ads.R60 r60) {
        java.util.Iterator it = r60.f31160a.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.VT vtF = this.f26710c.f(r60.f31162b, (java.lang.String) it.next());
            if (vtF != null && vtF.a(this.f26716i, r60)) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.o(vtF.b(this.f26716i, r60), r60.f31151R, java.util.concurrent.TimeUnit.MILLISECONDS, this.f26709b);
            }
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.C4688oQ(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(com.google.android.gms.internal.ads.R60 r60) {
        P4.d dVarD = d(r60);
        this.f26711d.f(this.f26716i, r60, dVarD, this.f26712e);
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarD, new com.google.android.gms.internal.ads.BV(this, r60), this.f26708a);
    }

    public final synchronized P4.d b(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        try {
            if (!this.f26714g.getAndSet(true)) {
                if (!c3558e70.f34899b.f34447a.isEmpty()) {
                    this.f26716i = c3558e70;
                    this.f26715h = new com.google.android.gms.internal.ads.EV(c3558e70, this.f26711d, this.f26713f);
                    this.f26711d.k(c3558e70.f34899b.f34447a);
                    com.google.android.gms.internal.ads.EV ev = this.f26715h;
                    while (true) {
                        com.google.android.gms.internal.ads.R60 r60A = ev.a();
                        if (r60A == null) {
                            break;
                        }
                        e(r60A);
                        ev = this.f26715h;
                    }
                } else {
                    this.f26713f.h(new com.google.android.gms.internal.ads.XV(3, com.google.android.gms.internal.ads.C3158aW.d(c3558e70)));
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f26713f;
    }
}
