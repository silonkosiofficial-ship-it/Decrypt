package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5135sY implements com.google.android.gms.internal.ads.InterfaceC4366lY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4326l70 f38764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2846Su f38765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f38766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4038iY f38767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f38768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5430vA f38769f;

    public C5135sY(com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, android.content.Context context, com.google.android.gms.internal.ads.C4038iY c4038iY, com.google.android.gms.internal.ads.C4326l70 c4326l70) {
        this.f38765b = abstractC2846Su;
        this.f38766c = context;
        this.f38767d = c4038iY;
        this.f38764a = c4326l70;
        this.f38768e = abstractC2846Su.F();
        c4326l70.R(c4038iY.d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4366lY
    public final boolean a() {
        com.google.android.gms.internal.ads.C5430vA c5430vA = this.f38769f;
        return c5430vA != null && c5430vA.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4366lY
    public final boolean b(p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.AbstractC4146jY abstractC4146jY, com.google.android.gms.internal.ads.InterfaceC4256kY interfaceC4256kY) {
        com.google.android.gms.internal.ads.Q90 q90;
        java.util.concurrent.Executor executorD;
        java.lang.Runnable runnable;
        p174r3.v.t();
        if (p214v3.E0.i(this.f38766c) && x6.f54170U == null) {
            p224w3.p.d("Failed to load the ad because app ID is missing.");
            executorD = this.f38765b.d();
            runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.nY
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37612C.f();
                }
            };
        } else {
            if (str != null) {
                com.google.android.gms.internal.ads.L70.a(this.f38766c, x6.f54157H);
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue() && x6.f54157H) {
                    this.f38765b.s().p(true);
                }
                int i6 = ((com.google.android.gms.internal.ads.C4476mY) abstractC4146jY).f37362a;
                long jA = p174r3.v.c().a();
                java.lang.String strE = com.google.android.gms.internal.ads.MN.PUBLIC_API_CALL.e();
                java.lang.Long lValueOf = java.lang.Long.valueOf(jA);
                android.os.Bundle bundleA = com.google.android.gms.internal.ads.ON.a(new android.util.Pair(strE, lValueOf), new android.util.Pair(com.google.android.gms.internal.ads.MN.DYNAMITE_ENTER.e(), lValueOf));
                com.google.android.gms.internal.ads.C4326l70 c4326l70 = this.f38764a;
                c4326l70.h(x6);
                c4326l70.a(bundleA);
                c4326l70.c(i6);
                android.content.Context context = this.f38766c;
                com.google.android.gms.internal.ads.C4546n70 c4546n70J = c4326l70.j();
                com.google.android.gms.internal.ads.E90 e90B = com.google.android.gms.internal.ads.D90.b(context, com.google.android.gms.internal.ads.P90.f(c4546n70J), 8, x6);
                p184s3.InterfaceC7101i0 interfaceC7101i0 = c4546n70J.f37521n;
                if (interfaceC7101i0 != null) {
                    this.f38767d.d().C(interfaceC7101i0);
                }
                com.google.android.gms.internal.ads.InterfaceC4457mI interfaceC4457mIO = this.f38765b.o();
                com.google.android.gms.internal.ads.C4335lC c4335lC = new com.google.android.gms.internal.ads.C4335lC();
                c4335lC.f(this.f38766c);
                c4335lC.k(c4546n70J);
                interfaceC4457mIO.p(c4335lC.l());
                com.google.android.gms.internal.ads.CF cf = new com.google.android.gms.internal.ads.CF();
                cf.n(this.f38767d.d(), this.f38765b.d());
                interfaceC4457mIO.r(cf.q());
                interfaceC4457mIO.c(this.f38767d.c());
                interfaceC4457mIO.f(new com.google.android.gms.internal.ads.C2666Ny(null));
                com.google.android.gms.internal.ads.AbstractC4567nI abstractC4567nII = interfaceC4457mIO.i();
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
                    com.google.android.gms.internal.ads.Q90 q90E = abstractC4567nII.e();
                    q90E.i(8);
                    q90E.b(x6.f54167R);
                    q90E.f(x6.f54164O);
                    q90 = q90E;
                } else {
                    q90 = null;
                }
                this.f38765b.E().c(1);
                com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su = this.f38765b;
                com.google.android.gms.internal.ads.Yk0 yk0C = com.google.android.gms.internal.ads.O80.c();
                java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceE = abstractC2846Su.e();
                com.google.android.gms.internal.ads.LA laA = abstractC4567nII.a();
                com.google.android.gms.internal.ads.C5430vA c5430vA = new com.google.android.gms.internal.ads.C5430vA(yk0C, scheduledExecutorServiceE, laA.h(laA.i()));
                this.f38769f = c5430vA;
                c5430vA.e(new com.google.android.gms.internal.ads.C5025rY(this, interfaceC4256kY, q90, e90B, abstractC4567nII));
                return true;
            }
            p224w3.p.d("Ad unit ID should not be null for NativeAdLoader.");
            executorD = this.f38765b.d();
            runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.oY
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37833C.g();
                }
            };
        }
        executorD.execute(runnable);
        return false;
    }

    final /* synthetic */ void f() {
        this.f38767d.a().u0(com.google.android.gms.internal.ads.P70.d(4, null, null));
    }

    final /* synthetic */ void g() {
        this.f38767d.a().u0(com.google.android.gms.internal.ads.P70.d(6, null, null));
    }
}
