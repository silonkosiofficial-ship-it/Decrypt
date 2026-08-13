package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Q50 implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4256kY f30887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Q90 f30888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E90 f30889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.QH f30890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.R50 f30891e;

    Q50(com.google.android.gms.internal.ads.R50 r50, com.google.android.gms.internal.ads.InterfaceC4256kY interfaceC4256kY, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90, com.google.android.gms.internal.ads.QH qh) {
        this.f30887a = interfaceC4256kY;
        this.f30888b = q90;
        this.f30889c = e90;
        this.f30890d = qh;
        this.f30891e = r50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.Q90 q90;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25278G5)).booleanValue()) {
            p214v3.AbstractC7265q0.l("Interstitial ad failed to load", th);
        }
        final p184s3.W0 w0A = this.f30890d.a().a(th);
        synchronized (this.f30891e) {
            try {
                this.f30891e.f31131i = null;
                this.f30890d.b().u0(w0A);
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25521c8)).booleanValue()) {
                    this.f30891e.f31124b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.M50
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f29654C.f30891e.f31126d.u0(w0A);
                        }
                    });
                    this.f30891e.f31124b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.N50
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f30176C.f30891e.f31127e.u0(w0A);
                        }
                    });
                }
                com.google.android.gms.internal.ads.L70.b(w0A.f54145C, th, "InterstitialAdLoader.onFailure");
                this.f30887a.a();
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue() || (q90 = this.f30888b) == null) {
                    com.google.android.gms.internal.ads.T90 t90 = this.f30891e.f31129g;
                    com.google.android.gms.internal.ads.E90 e90 = this.f30889c;
                    e90.p(w0A);
                    e90.c(th);
                    e90.K0(false);
                    t90.b(e90.m());
                } else {
                    q90.c(w0A);
                    com.google.android.gms.internal.ads.E90 e91 = this.f30889c;
                    e91.c(th);
                    e91.K0(false);
                    q90.a(e91);
                    q90.h();
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.Q90 q90;
        com.google.android.gms.internal.ads.C4345lH c4345lH = (com.google.android.gms.internal.ads.C4345lH) obj;
        synchronized (this.f30891e) {
            try {
                this.f30891e.f31131i = null;
                com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25521c8;
                if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
                    com.google.android.gms.internal.ads.OE oeE = c4345lH.e();
                    oeE.a(this.f30891e.f31126d);
                    oeE.d(this.f30891e.f31127e);
                }
                this.f30887a.c(c4345lH);
                if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
                    this.f30891e.f31124b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.O50
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f30444C.f30891e.f31126d.u();
                        }
                    });
                    this.f30891e.f31124b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.P50
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f30647C.f30891e.f31127e.u();
                        }
                    });
                }
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue() || (q90 = this.f30888b) == null) {
                    com.google.android.gms.internal.ads.T90 t90 = this.f30891e.f31129g;
                    com.google.android.gms.internal.ads.E90 e90 = this.f30889c;
                    e90.a(c4345lH.g().f34899b);
                    e90.Z(c4345lH.c().i());
                    e90.K0(true);
                    t90.b(e90.m());
                } else {
                    q90.g(c4345lH.g().f34899b);
                    q90.e(c4345lH.c().i());
                    com.google.android.gms.internal.ads.E90 e91 = this.f30889c;
                    e91.K0(true);
                    q90.a(e91);
                    q90.h();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
