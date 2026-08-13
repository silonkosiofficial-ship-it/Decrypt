package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4870q40 implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4256kY f38163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Q90 f38164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E90 f38165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4979r40 f38166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5199t40 f38167e;

    C4870q40(com.google.android.gms.internal.ads.AbstractC5199t40 abstractC5199t40, com.google.android.gms.internal.ads.InterfaceC4256kY interfaceC4256kY, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90, com.google.android.gms.internal.ads.C4979r40 c4979r40) {
        this.f38163a = interfaceC4256kY;
        this.f38164b = q90;
        this.f38165c = e90;
        this.f38166d = c4979r40;
        this.f38167e = abstractC5199t40;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.Q90 q90;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25278G5)).booleanValue()) {
            p214v3.AbstractC7265q0.l("App open ad failed to load", th);
        }
        com.google.android.gms.internal.ads.InterfaceC5955zy interfaceC5955zy = (com.google.android.gms.internal.ads.InterfaceC5955zy) this.f38167e.f38861e.f();
        final p184s3.W0 w0B = interfaceC5955zy == null ? com.google.android.gms.internal.ads.P70.b(th, null) : interfaceC5955zy.b().a(th);
        synchronized (this.f38167e) {
            try {
                this.f38167e.f38866j = null;
                if (interfaceC5955zy != null) {
                    interfaceC5955zy.c().u0(w0B);
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25510b8)).booleanValue()) {
                        this.f38167e.f38858b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.p40
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f37910C.f38167e.f38860d.u0(w0B);
                            }
                        });
                    }
                } else {
                    this.f38167e.f38860d.u0(w0B);
                    ((com.google.android.gms.internal.ads.InterfaceC5955zy) this.f38167e.m(this.f38166d).g()).b().c().g();
                }
                com.google.android.gms.internal.ads.L70.b(w0B.f54145C, th, "AppOpenAdLoader.onFailure");
                this.f38163a.a();
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue() || (q90 = this.f38164b) == null) {
                    com.google.android.gms.internal.ads.T90 t90 = this.f38167e.f38864h;
                    com.google.android.gms.internal.ads.E90 e90 = this.f38165c;
                    e90.p(w0B);
                    e90.c(th);
                    e90.K0(false);
                    t90.b(e90.m());
                } else {
                    q90.c(w0B);
                    com.google.android.gms.internal.ads.E90 e91 = this.f38165c;
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
        com.google.android.gms.internal.ads.AbstractC3673fA abstractC3673fA = (com.google.android.gms.internal.ads.AbstractC3673fA) obj;
        synchronized (this.f38167e) {
            try {
                this.f38167e.f38866j = null;
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25510b8)).booleanValue()) {
                    abstractC3673fA.e().b(this.f38167e.f38860d);
                }
                this.f38163a.c(abstractC3673fA);
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue() || (q90 = this.f38164b) == null) {
                    com.google.android.gms.internal.ads.T90 t90 = this.f38167e.f38864h;
                    com.google.android.gms.internal.ads.E90 e90 = this.f38165c;
                    e90.a(abstractC3673fA.g().f34899b);
                    e90.Z(abstractC3673fA.c().i());
                    e90.K0(true);
                    t90.b(e90.m());
                } else {
                    q90.g(abstractC3673fA.g().f34899b);
                    q90.e(abstractC3673fA.c().i());
                    com.google.android.gms.internal.ads.E90 e91 = this.f38165c;
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
