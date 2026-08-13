package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class X40 implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Q90 f33046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E90 f33047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5517vz f33048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Z40 f33049d;

    X40(com.google.android.gms.internal.ads.Z40 z40, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90, com.google.android.gms.internal.ads.AbstractC5517vz abstractC5517vz) {
        this.f33046a = q90;
        this.f33047b = e90;
        this.f33048c = abstractC5517vz;
        this.f33049d = z40;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.Q90 q90;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25278G5)).booleanValue()) {
            p214v3.AbstractC7265q0.l("Banner ad failed to load", th);
        }
        synchronized (this.f33049d) {
            try {
                p184s3.W0 w0A = this.f33048c.d().a(th);
                this.f33049d.f33487n = w0A;
                this.f33048c.e().u0(w0A);
                com.google.android.gms.internal.ads.L70.b(w0A.f54145C, th, "BannerAdLoader.onFailure");
                com.google.android.gms.internal.ads.Z40 z40 = this.f33049d;
                if (z40.f33486m) {
                    z40.t();
                    com.google.android.gms.internal.ads.Z40 z41 = this.f33049d;
                    z41.f33481h.q1(z41.f33483j.a());
                }
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue() || (q90 = this.f33046a) == null) {
                    com.google.android.gms.internal.ads.T90 t90 = this.f33049d.f33482i;
                    com.google.android.gms.internal.ads.E90 e90 = this.f33047b;
                    e90.p(w0A);
                    e90.c(th);
                    e90.K0(false);
                    t90.b(e90.m());
                } else {
                    q90.c(w0A);
                    com.google.android.gms.internal.ads.E90 e91 = this.f33047b;
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
        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = (com.google.android.gms.internal.ads.AbstractC2777Qy) obj;
        synchronized (this.f33049d) {
            try {
                com.google.android.gms.internal.ads.Z40 z40 = this.f33049d;
                if (z40.f33486m) {
                    z40.q();
                }
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue() || (q90 = this.f33046a) == null) {
                    com.google.android.gms.internal.ads.T90 t90 = this.f33049d.f33482i;
                    com.google.android.gms.internal.ads.E90 e90 = this.f33047b;
                    e90.a(abstractC2777Qy.g().f34899b);
                    e90.Z(abstractC2777Qy.c().i());
                    e90.K0(true);
                    t90.b(e90.m());
                } else {
                    q90.g(abstractC2777Qy.g().f34899b);
                    q90.e(abstractC2777Qy.c().i());
                    com.google.android.gms.internal.ads.E90 e91 = this.f33047b;
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
