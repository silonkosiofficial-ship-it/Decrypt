package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class YB implements com.google.android.gms.internal.ads.EC, com.google.android.gms.internal.ads.InterfaceC4893qG, com.google.android.gms.internal.ads.InterfaceC3573eF, com.google.android.gms.internal.ads.VC, com.google.android.gms.internal.ads.InterfaceC2633Nb {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XC f33318C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f33319D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f33320E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.concurrent.Executor f33321F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private java.util.concurrent.ScheduledFuture f33323H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.lang.String f33325J;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4062il0 f33322G = com.google.android.gms.internal.ads.C4062il0.D();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f33324I = new java.util.concurrent.atomic.AtomicBoolean();

    YB(com.google.android.gms.internal.ads.XC xc, com.google.android.gms.internal.ads.R60 r60, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, java.lang.String str) {
        this.f33318C = xc;
        this.f33319D = r60;
        this.f33320E = scheduledExecutorService;
        this.f33321F = executor;
        this.f33325J = str;
    }

    private final boolean i() {
        return this.f33325J.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2633Nb
    public final void L(com.google.android.gms.internal.ads.C2596Mb c2596Mb) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.qb)).booleanValue() && i() && c2596Mb.f29800j && this.f33324I.compareAndSet(false, true) && this.f33319D.f31168e != 3) {
            p214v3.AbstractC7265q0.k("Full screen 1px impression occurred");
            this.f33318C.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void c() {
        com.google.android.gms.internal.ads.R60 r60 = this.f33319D;
        if (r60.f31168e == 3) {
            return;
        }
        int i6 = r60.f31158Y;
        if (i6 == 0 || i6 == 1) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.qb)).booleanValue() && i()) {
                return;
            }
            this.f33318C.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void e() {
    }

    final /* synthetic */ void g() {
        synchronized (this) {
            try {
                if (this.f33322G.isDone()) {
                    return;
                }
                this.f33322G.f(java.lang.Boolean.TRUE);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573eF
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573eF
    public final synchronized void j() {
        try {
            if (this.f33322G.isDone()) {
                return;
            }
            java.util.concurrent.ScheduledFuture scheduledFuture = this.f33323H;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f33322G.f(java.lang.Boolean.TRUE);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893qG
    public final void k() {
        if (this.f33319D.f31168e == 3) {
            return;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25252E1)).booleanValue()) {
            com.google.android.gms.internal.ads.R60 r60 = this.f33319D;
            if (r60.f31158Y == 2) {
                if (r60.f31192q == 0) {
                    this.f33318C.a();
                } else {
                    com.google.android.gms.internal.ads.AbstractC2652Nk0.r(this.f33322G, new com.google.android.gms.internal.ads.XB(this), this.f33321F);
                    this.f33323H = this.f33320E.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.WB
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f32705C.g();
                        }
                    }, this.f33319D.f31192q, java.util.concurrent.TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893qG
    public final void l() {
    }

    @Override // com.google.android.gms.internal.ads.VC
    public final synchronized void p(p184s3.W0 w6) {
        try {
            if (this.f33322G.isDone()) {
                return;
            }
            java.util.concurrent.ScheduledFuture scheduledFuture = this.f33323H;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f33322G.h(new java.lang.Exception());
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void q(com.google.android.gms.internal.ads.InterfaceC3302bp interfaceC3302bp, java.lang.String str, java.lang.String str2) {
    }
}
