package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class A60 implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4256kY f25056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Q90 f25057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E90 f25058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.B60 f25059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E60 f25060e;

    A60(com.google.android.gms.internal.ads.E60 e60, com.google.android.gms.internal.ads.InterfaceC4256kY interfaceC4256kY, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90, com.google.android.gms.internal.ads.B60 b60) {
        this.f25056a = interfaceC4256kY;
        this.f25057b = q90;
        this.f25058c = e90;
        this.f25059d = b60;
        this.f25060e = e60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.Q90 q90;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25278G5)).booleanValue()) {
            p214v3.AbstractC7265q0.l("Rewarded ad failed to load", th);
        }
        com.google.android.gms.internal.ads.AbstractC4244kM abstractC4244kM = (com.google.android.gms.internal.ads.AbstractC4244kM) this.f25060e.f26906e.f();
        final p184s3.W0 w0B = abstractC4244kM == null ? com.google.android.gms.internal.ads.P70.b(th, null) : abstractC4244kM.b().a(th);
        synchronized (this.f25060e) {
            try {
                if (abstractC4244kM != null) {
                    abstractC4244kM.a().u0(w0B);
                    this.f25060e.f26903b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.y60
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f39986C.f25060e.f26905d.u0(w0B);
                        }
                    });
                } else {
                    this.f25060e.f26905d.u0(w0B);
                    this.f25060e.k(this.f25059d).g().b().c().g();
                }
                com.google.android.gms.internal.ads.L70.b(w0B.f54145C, th, "RewardedAdLoader.onFailure");
                this.f25056a.a();
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue() || (q90 = this.f25057b) == null) {
                    com.google.android.gms.internal.ads.T90 t90 = this.f25060e.f26908g;
                    com.google.android.gms.internal.ads.E90 e90 = this.f25058c;
                    e90.p(w0B);
                    e90.c(th);
                    e90.K0(false);
                    t90.b(e90.m());
                } else {
                    q90.c(w0B);
                    com.google.android.gms.internal.ads.E90 e91 = this.f25058c;
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
        com.google.android.gms.internal.ads.C3696fM c3696fM = (com.google.android.gms.internal.ads.C3696fM) obj;
        synchronized (this.f25060e) {
            try {
                c3696fM.e().d(this.f25060e.f26905d);
                this.f25056a.c(c3696fM);
                com.google.android.gms.internal.ads.E60 e60 = this.f25060e;
                java.util.concurrent.Executor executor = e60.f26903b;
                final com.google.android.gms.internal.ads.C5203t60 c5203t60 = e60.f26905d;
                j$.util.Objects.requireNonNull(c5203t60);
                executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.z60
                    @Override // java.lang.Runnable
                    public final void run() {
                        c5203t60.u();
                    }
                });
                this.f25060e.f26905d.k();
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue() || (q90 = this.f25057b) == null) {
                    com.google.android.gms.internal.ads.T90 t90 = this.f25060e.f26908g;
                    com.google.android.gms.internal.ads.E90 e90 = this.f25058c;
                    e90.a(c3696fM.g().f34899b);
                    e90.Z(c3696fM.c().i());
                    e90.K0(true);
                    t90.b(e90.m());
                } else {
                    q90.g(c3696fM.g().f34899b);
                    q90.e(c3696fM.c().i());
                    com.google.android.gms.internal.ads.E90 e91 = this.f25058c;
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
