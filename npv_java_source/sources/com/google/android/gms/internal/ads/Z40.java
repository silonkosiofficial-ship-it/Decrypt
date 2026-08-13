package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Z40 implements com.google.android.gms.internal.ads.InterfaceC4366lY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f33474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f33475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2846Su f33476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.UX f33477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YX f33478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.view.ViewGroup f33479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2970Wf f33480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.ZD f33481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f33482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4013iF f33483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4326l70 f33484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private P4.d f33485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f33486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p184s3.W0 f33487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4256kY f33488o;

    public Z40(android.content.Context context, java.util.concurrent.Executor executor, p184s3.c2 c2Var, com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, com.google.android.gms.internal.ads.UX ux, com.google.android.gms.internal.ads.YX yx, com.google.android.gms.internal.ads.C4326l70 c4326l70, com.google.android.gms.internal.ads.C4013iF c4013iF) {
        this.f33474a = context;
        this.f33475b = executor;
        this.f33476c = abstractC2846Su;
        this.f33477d = ux;
        this.f33478e = yx;
        this.f33484k = c4326l70;
        this.f33481h = abstractC2846Su.m();
        this.f33482i = abstractC2846Su.F();
        this.f33479f = new android.widget.FrameLayout(context);
        this.f33483j = c4013iF;
        c4326l70.O(c2Var);
        this.f33486m = true;
        this.f33487n = null;
        this.f33488o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        this.f33485l = null;
        final p184s3.W0 w6 = this.f33487n;
        this.f33487n = null;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25499a8)).booleanValue() && w6 != null) {
            this.f33475b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.U40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32108C.j(w6);
                }
            });
        }
        com.google.android.gms.internal.ads.InterfaceC4256kY interfaceC4256kY = this.f33488o;
        if (interfaceC4256kY != null) {
            interfaceC4256kY.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4366lY
    public final boolean a() {
        P4.d dVar = this.f33485l;
        return (dVar == null || dVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4366lY
    public final boolean b(p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.AbstractC4146jY abstractC4146jY, com.google.android.gms.internal.ads.InterfaceC4256kY interfaceC4256kY) {
        com.google.android.gms.internal.ads.InterfaceC5407uz interfaceC5407uzL;
        com.google.android.gms.internal.ads.C2666Ny c2666Ny;
        if (str == null) {
            p224w3.p.d("Ad unit ID should not be null for banner ad.");
            this.f33475b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.W40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32680C.k();
                }
            });
            return false;
        }
        if (!a()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue() && x6.f54157H) {
                this.f33476c.s().p(true);
            }
            android.os.Bundle bundleA = com.google.android.gms.internal.ads.ON.a(new android.util.Pair(com.google.android.gms.internal.ads.MN.PUBLIC_API_CALL.e(), java.lang.Long.valueOf(x6.f54177b0)), new android.util.Pair(com.google.android.gms.internal.ads.MN.DYNAMITE_ENTER.e(), java.lang.Long.valueOf(p174r3.v.c().a())));
            com.google.android.gms.internal.ads.C4326l70 c4326l70 = this.f33484k;
            c4326l70.P(str);
            c4326l70.h(x6);
            c4326l70.a(bundleA);
            android.content.Context context = this.f33474a;
            com.google.android.gms.internal.ads.C4546n70 c4546n70J = c4326l70.j();
            com.google.android.gms.internal.ads.E90 e90B = com.google.android.gms.internal.ads.D90.b(context, com.google.android.gms.internal.ads.P90.f(c4546n70J), 3, x6);
            com.google.android.gms.internal.ads.Q90 q90F = null;
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2459Ig.f28490d.e()).booleanValue() || !this.f33484k.D().f54208M) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25499a8)).booleanValue()) {
                    interfaceC5407uzL = this.f33476c.l();
                    com.google.android.gms.internal.ads.C4335lC c4335lC = new com.google.android.gms.internal.ads.C4335lC();
                    c4335lC.f(this.f33474a);
                    c4335lC.k(c4546n70J);
                    interfaceC5407uzL.j(c4335lC.l());
                    com.google.android.gms.internal.ads.CF cf = new com.google.android.gms.internal.ads.CF();
                    cf.m(this.f33477d, this.f33475b);
                    cf.n(this.f33477d, this.f33475b);
                    interfaceC5407uzL.n(cf.q());
                    interfaceC5407uzL.m(new com.google.android.gms.internal.ads.C3269bX(this.f33480g));
                    interfaceC5407uzL.c(new com.google.android.gms.internal.ads.C4019iI(com.google.android.gms.internal.ads.C4789pJ.f37963h, null));
                    interfaceC5407uzL.h(new com.google.android.gms.internal.ads.C3031Xz(this.f33481h, this.f33483j));
                    c2666Ny = new com.google.android.gms.internal.ads.C2666Ny(this.f33479f);
                } else {
                    interfaceC5407uzL = this.f33476c.l();
                    com.google.android.gms.internal.ads.C4335lC c4335lC2 = new com.google.android.gms.internal.ads.C4335lC();
                    c4335lC2.f(this.f33474a);
                    c4335lC2.k(c4546n70J);
                    interfaceC5407uzL.j(c4335lC2.l());
                    com.google.android.gms.internal.ads.CF cf2 = new com.google.android.gms.internal.ads.CF();
                    cf2.m(this.f33477d, this.f33475b);
                    cf2.d(this.f33477d, this.f33475b);
                    cf2.d(this.f33478e, this.f33475b);
                    cf2.o(this.f33477d, this.f33475b);
                    cf2.g(this.f33477d, this.f33475b);
                    cf2.h(this.f33477d, this.f33475b);
                    cf2.i(this.f33477d, this.f33475b);
                    cf2.e(this.f33477d, this.f33475b);
                    cf2.n(this.f33477d, this.f33475b);
                    cf2.l(this.f33477d, this.f33475b);
                    interfaceC5407uzL.n(cf2.q());
                    interfaceC5407uzL.m(new com.google.android.gms.internal.ads.C3269bX(this.f33480g));
                    interfaceC5407uzL.c(new com.google.android.gms.internal.ads.C4019iI(com.google.android.gms.internal.ads.C4789pJ.f37963h, null));
                    interfaceC5407uzL.h(new com.google.android.gms.internal.ads.C3031Xz(this.f33481h, this.f33483j));
                    c2666Ny = new com.google.android.gms.internal.ads.C2666Ny(this.f33479f);
                }
                interfaceC5407uzL.f(c2666Ny);
                com.google.android.gms.internal.ads.AbstractC5517vz abstractC5517vzK = interfaceC5407uzL.g();
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
                    q90F = abstractC5517vzK.f();
                    q90F.i(3);
                    q90F.b(x6.f54167R);
                    q90F.f(x6.f54164O);
                }
                this.f33488o = interfaceC4256kY;
                com.google.android.gms.internal.ads.LA laD = abstractC5517vzK.d();
                P4.d dVarH = laD.h(laD.i());
                this.f33485l = dVarH;
                com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarH, new com.google.android.gms.internal.ads.X40(this, q90F, e90B, abstractC5517vzK), this.f33475b);
                return true;
            }
            com.google.android.gms.internal.ads.UX ux = this.f33477d;
            if (ux != null) {
                ux.u0(com.google.android.gms.internal.ads.P70.d(7, null, null));
            }
        } else if (!this.f33484k.s()) {
            this.f33486m = true;
        }
        return false;
    }

    public final android.view.ViewGroup c() {
        return this.f33479f;
    }

    public final com.google.android.gms.internal.ads.C4326l70 f() {
        return this.f33484k;
    }

    final /* synthetic */ void j(p184s3.W0 w6) {
        this.f33477d.u0(w6);
    }

    final /* synthetic */ void k() {
        this.f33477d.u0(com.google.android.gms.internal.ads.P70.d(6, null, null));
    }

    public final void l() {
        this.f33481h.q1(this.f33483j.a());
    }

    public final void m() {
        this.f33481h.r1(this.f33483j.b());
    }

    public final void n(p184s3.E e6) {
        this.f33478e.a(e6);
    }

    public final void o(com.google.android.gms.internal.ads.TD td) {
        this.f33481h.F0(td, this.f33475b);
    }

    public final void p(com.google.android.gms.internal.ads.InterfaceC2970Wf interfaceC2970Wf) {
        this.f33480g = interfaceC2970Wf;
    }

    public final void q() {
        com.google.android.gms.internal.ads.ZD zd;
        synchronized (this) {
            try {
                P4.d dVar = this.f33485l;
                if (dVar != null && dVar.isDone()) {
                    try {
                        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = (com.google.android.gms.internal.ads.AbstractC2777Qy) this.f33485l.get();
                        this.f33485l = null;
                        this.f33479f.removeAllViews();
                        if (abstractC2777Qy.k() != null) {
                            android.view.ViewParent parent = abstractC2777Qy.k().getParent();
                            if (parent instanceof android.view.ViewGroup) {
                                p224w3.p.g("Banner view provided from " + (abstractC2777Qy.c() != null ? abstractC2777Qy.c().i() : "") + " already has a parent view. Removing its old parent.");
                                ((android.view.ViewGroup) parent).removeView(abstractC2777Qy.k());
                            }
                        }
                        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25499a8;
                        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
                            com.google.android.gms.internal.ads.OE oeE = abstractC2777Qy.e();
                            oeE.a(this.f33477d);
                            oeE.c(this.f33478e);
                        }
                        this.f33479f.addView(abstractC2777Qy.k());
                        com.google.android.gms.internal.ads.InterfaceC4256kY interfaceC4256kY = this.f33488o;
                        if (interfaceC4256kY != null) {
                            interfaceC4256kY.c(abstractC2777Qy);
                        }
                        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
                            java.util.concurrent.Executor executor = this.f33475b;
                            final com.google.android.gms.internal.ads.UX ux = this.f33477d;
                            j$.util.Objects.requireNonNull(ux);
                            executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.V40
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ux.u();
                                }
                            });
                        }
                        if (abstractC2777Qy.i() >= 0) {
                            this.f33486m = false;
                            this.f33481h.q1(abstractC2777Qy.i());
                            this.f33481h.r1(abstractC2777Qy.j());
                        } else {
                            this.f33486m = true;
                            this.f33481h.q1(abstractC2777Qy.j());
                        }
                    } catch (java.lang.InterruptedException e6) {
                        e = e6;
                        t();
                        p214v3.AbstractC7265q0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f33486m = true;
                        zd = this.f33481h;
                        zd.a();
                    } catch (java.util.concurrent.ExecutionException e10) {
                        e = e10;
                        t();
                        p214v3.AbstractC7265q0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f33486m = true;
                        zd = this.f33481h;
                        zd.a();
                    }
                } else if (this.f33485l != null) {
                    p214v3.AbstractC7265q0.k("Show timer went off but there is an ongoing ad request.");
                    this.f33486m = true;
                } else {
                    p214v3.AbstractC7265q0.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f33486m = true;
                    zd = this.f33481h;
                    zd.a();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s() {
        java.lang.Object parent = this.f33479f.getParent();
        if (!(parent instanceof android.view.View)) {
            return false;
        }
        android.view.View view = (android.view.View) parent;
        p174r3.v.t();
        return p214v3.E0.w(view, view.getContext());
    }
}
