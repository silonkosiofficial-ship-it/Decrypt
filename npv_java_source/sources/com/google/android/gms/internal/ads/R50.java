package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class R50 implements com.google.android.gms.internal.ads.InterfaceC4366lY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f31123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f31124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2846Su f31125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.UX f31126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5203t60 f31127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2970Wf f31128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f31129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4326l70 f31130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private P4.d f31131i;

    public R50(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, com.google.android.gms.internal.ads.UX ux, com.google.android.gms.internal.ads.C5203t60 c5203t60, com.google.android.gms.internal.ads.C4326l70 c4326l70) {
        this.f31123a = context;
        this.f31124b = executor;
        this.f31125c = abstractC2846Su;
        this.f31126d = ux;
        this.f31130h = c4326l70;
        this.f31127e = c5203t60;
        this.f31129g = abstractC2846Su.F();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4366lY
    public final boolean a() {
        P4.d dVar = this.f31131i;
        return (dVar == null || dVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4366lY
    public final boolean b(p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.AbstractC4146jY abstractC4146jY, com.google.android.gms.internal.ads.InterfaceC4256kY interfaceC4256kY) {
        com.google.android.gms.internal.ads.QH qhE;
        com.google.android.gms.internal.ads.Q90 q90;
        if (str == null) {
            p224w3.p.d("Ad unit ID should not be null for interstitial ad.");
            this.f31124b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.L50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29222C.h();
                }
            });
            return false;
        }
        if (a()) {
            return false;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue() && x6.f54157H) {
            this.f31125c.s().p(true);
        }
        p184s3.c2 c2Var = ((com.google.android.gms.internal.ads.K50) abstractC4146jY).f28850a;
        android.os.Bundle bundleA = com.google.android.gms.internal.ads.ON.a(new android.util.Pair(com.google.android.gms.internal.ads.MN.PUBLIC_API_CALL.e(), java.lang.Long.valueOf(x6.f54177b0)), new android.util.Pair(com.google.android.gms.internal.ads.MN.DYNAMITE_ENTER.e(), java.lang.Long.valueOf(p174r3.v.c().a())));
        com.google.android.gms.internal.ads.C4326l70 c4326l70 = this.f31130h;
        c4326l70.P(str);
        c4326l70.O(c2Var);
        c4326l70.h(x6);
        c4326l70.a(bundleA);
        android.content.Context context = this.f31123a;
        com.google.android.gms.internal.ads.C4546n70 c4546n70J = c4326l70.j();
        com.google.android.gms.internal.ads.E90 e90B = com.google.android.gms.internal.ads.D90.b(context, com.google.android.gms.internal.ads.P90.f(c4546n70J), 4, x6);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25521c8)).booleanValue()) {
            com.google.android.gms.internal.ads.PH phN = this.f31125c.n();
            com.google.android.gms.internal.ads.C4335lC c4335lC = new com.google.android.gms.internal.ads.C4335lC();
            c4335lC.f(this.f31123a);
            c4335lC.k(c4546n70J);
            phN.s(c4335lC.l());
            com.google.android.gms.internal.ads.CF cf = new com.google.android.gms.internal.ads.CF();
            cf.m(this.f31126d, this.f31124b);
            cf.n(this.f31126d, this.f31124b);
            phN.t(cf.q());
            phN.o(new com.google.android.gms.internal.ads.C3269bX(this.f31128f));
            qhE = phN.g();
        } else {
            com.google.android.gms.internal.ads.CF cf2 = new com.google.android.gms.internal.ads.CF();
            com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f31127e;
            if (c5203t60 != null) {
                cf2.h(c5203t60, this.f31124b);
                cf2.i(this.f31127e, this.f31124b);
                cf2.e(this.f31127e, this.f31124b);
            }
            com.google.android.gms.internal.ads.PH phN2 = this.f31125c.n();
            com.google.android.gms.internal.ads.C4335lC c4335lC2 = new com.google.android.gms.internal.ads.C4335lC();
            c4335lC2.f(this.f31123a);
            c4335lC2.k(c4546n70J);
            phN2.s(c4335lC2.l());
            cf2.m(this.f31126d, this.f31124b);
            cf2.h(this.f31126d, this.f31124b);
            cf2.i(this.f31126d, this.f31124b);
            cf2.e(this.f31126d, this.f31124b);
            cf2.d(this.f31126d, this.f31124b);
            cf2.o(this.f31126d, this.f31124b);
            cf2.n(this.f31126d, this.f31124b);
            cf2.l(this.f31126d, this.f31124b);
            cf2.f(this.f31126d, this.f31124b);
            phN2.t(cf2.q());
            phN2.o(new com.google.android.gms.internal.ads.C3269bX(this.f31128f));
            qhE = phN2.g();
        }
        com.google.android.gms.internal.ads.QH qh = qhE;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
            com.google.android.gms.internal.ads.Q90 q90D = qh.d();
            q90D.i(4);
            q90D.b(x6.f54167R);
            q90D.f(x6.f54164O);
            q90 = q90D;
        } else {
            q90 = null;
        }
        com.google.android.gms.internal.ads.LA laA = qh.a();
        P4.d dVarH = laA.h(laA.i());
        this.f31131i = dVarH;
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarH, new com.google.android.gms.internal.ads.Q50(this, interfaceC4256kY, q90, e90B, qh), this.f31124b);
        return true;
    }

    final /* synthetic */ void h() {
        this.f31126d.u0(com.google.android.gms.internal.ads.P70.d(6, null, null));
    }

    public final void i(com.google.android.gms.internal.ads.InterfaceC2970Wf interfaceC2970Wf) {
        this.f31128f = interfaceC2970Wf;
    }
}
