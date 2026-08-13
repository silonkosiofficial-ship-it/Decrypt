package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5025rY implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4256kY f38502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Q90 f38503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E90 f38504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC4567nI f38505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5135sY f38506e;

    C5025rY(com.google.android.gms.internal.ads.C5135sY c5135sY, com.google.android.gms.internal.ads.InterfaceC4256kY interfaceC4256kY, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90, com.google.android.gms.internal.ads.AbstractC4567nI abstractC4567nI) {
        this.f38502a = interfaceC4256kY;
        this.f38503b = q90;
        this.f38504c = e90;
        this.f38505d = abstractC4567nI;
        this.f38506e = c5135sY;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.Q90 q90;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25278G5)).booleanValue()) {
            p214v3.AbstractC7265q0.l("Native ad failed to load", th);
        }
        final p184s3.W0 w0A = this.f38505d.a().a(th);
        this.f38505d.b().u0(w0A);
        this.f38506e.f38765b.d().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.qY
            @Override // java.lang.Runnable
            public final void run() {
                this.f38285C.f38506e.f38767d.a().u0(w0A);
            }
        });
        com.google.android.gms.internal.ads.L70.b(w0A.f54145C, th, "NativeAdLoader.onFailure");
        this.f38502a.a();
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue() && (q90 = this.f38503b) != null) {
            q90.c(w0A);
            com.google.android.gms.internal.ads.E90 e90 = this.f38504c;
            e90.c(th);
            e90.K0(false);
            q90.a(e90);
            q90.h();
            return;
        }
        com.google.android.gms.internal.ads.C5135sY c5135sY = this.f38506e;
        com.google.android.gms.internal.ads.E90 e91 = this.f38504c;
        com.google.android.gms.internal.ads.T90 t90 = c5135sY.f38768e;
        e91.p(w0A);
        e91.c(th);
        e91.K0(false);
        t90.b(e91.m());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.Q90 q90;
        com.google.android.gms.internal.ads.AbstractC3673fA abstractC3673fA = (com.google.android.gms.internal.ads.AbstractC3673fA) obj;
        synchronized (this.f38506e) {
            try {
                abstractC3673fA.e().a(this.f38506e.f38767d.d());
                this.f38502a.c(abstractC3673fA);
                this.f38506e.f38765b.d().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.pY
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38023C.f38506e.f38767d.b().u();
                    }
                });
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue() || (q90 = this.f38503b) == null) {
                    com.google.android.gms.internal.ads.T90 t90 = this.f38506e.f38768e;
                    com.google.android.gms.internal.ads.E90 e90 = this.f38504c;
                    e90.a(abstractC3673fA.g().f34899b);
                    e90.Z(abstractC3673fA.c().i());
                    e90.K0(true);
                    t90.b(e90.m());
                } else {
                    q90.g(abstractC3673fA.g().f34899b);
                    q90.e(abstractC3673fA.c().i());
                    com.google.android.gms.internal.ads.E90 e91 = this.f38504c;
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
