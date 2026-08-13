package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3029Xx implements com.google.android.gms.internal.ads.EC, com.google.android.gms.internal.ads.InterfaceC5326uD, com.google.android.gms.internal.ads.ZC, p184s3.InterfaceC7076a, com.google.android.gms.internal.ads.VC, com.google.android.gms.internal.ads.DG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f33228C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.Executor f33229D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.Executor f33230E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f33231F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3558e70 f33232G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f33233H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2337Fa0 f33234I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5865z70 f33235J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f33236K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4051ig f33237L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final java.lang.ref.WeakReference f33238M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final java.lang.ref.WeakReference f33239N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3458dC f33240O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f33241P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f33242Q = new java.util.concurrent.atomic.AtomicBoolean();

    C3029Xx(android.content.Context context, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C2337Fa0 c2337Fa0, com.google.android.gms.internal.ads.C5865z70 c5865z70, android.view.View view, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.Z9 z10, com.google.android.gms.internal.ads.C4051ig c4051ig, com.google.android.gms.internal.ads.C4270kg c4270kg, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.C3458dC c3458dC) {
        this.f33228C = context;
        this.f33229D = executor;
        this.f33230E = executor2;
        this.f33231F = scheduledExecutorService;
        this.f33232G = c3558e70;
        this.f33233H = r60;
        this.f33234I = c2337Fa0;
        this.f33235J = c5865z70;
        this.f33236K = z10;
        this.f33238M = new java.lang.ref.WeakReference(view);
        this.f33239N = new java.lang.ref.WeakReference(interfaceC2698Ot);
        this.f33237L = c4051ig;
        this.f33240O = c3458dC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List E() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.mb)).booleanValue()) {
            p174r3.v.t();
            if (p214v3.E0.c(this.f33228C)) {
                p174r3.v.t();
                java.lang.Integer numY = p214v3.E0.Y(this.f33228C);
                if (numY != null) {
                    int iMin = java.lang.Math.min(numY.intValue(), 20);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = this.f33233H.f31166d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(android.net.Uri.parse((java.lang.String) it.next()).buildUpon().appendQueryParameter("dspct", java.lang.Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.f33233H.f31166d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        java.lang.String strI;
        int i6;
        java.util.List list = this.f33233H.f31166d;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25254E3)).booleanValue()) {
            strI = this.f33236K.c().i(this.f33228C, (android.view.View) this.f33238M.get(), null);
        } else {
            strI = null;
        }
        if ((((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25219B0)).booleanValue() && this.f33232G.f34899b.f34448b.f32120h) || !((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2200Bg.f26008h.e()).booleanValue()) {
            this.f33235J.a(this.f33234I.d(this.f33232G, this.f33233H, false, strI, null, E()));
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2200Bg.f26007g.e()).booleanValue() && ((i6 = this.f33233H.f31162b) == 1 || i6 == 2 || i6 == 5)) {
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.o(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null)), ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25537e1)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f33231F), new com.google.android.gms.internal.ads.C2993Wx(this, strI), this.f33229D);
    }

    private final void G(final int i6, final int i10) {
        android.view.View view;
        if (i6 <= 0 || !((view = (android.view.View) this.f33238M.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            F();
        } else {
            this.f33231F.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Tx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32045C.B(i6, i10);
                }
            }, i10, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    final /* synthetic */ void B(final int i6, final int i10) {
        this.f33229D.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Ux
            @Override // java.lang.Runnable
            public final void run() {
                this.f32302C.C(i6, i10);
            }
        });
    }

    final /* synthetic */ void C(int i6, int i10) {
        G(i6 - 1, i10);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void d() {
        com.google.android.gms.internal.ads.C5865z70 c5865z70 = this.f33235J;
        com.google.android.gms.internal.ads.C2337Fa0 c2337Fa0 = this.f33234I;
        com.google.android.gms.internal.ads.C3558e70 c3558e70 = this.f33232G;
        com.google.android.gms.internal.ads.R60 r60 = this.f33233H;
        c5865z70.a(c2337Fa0.c(c3558e70, r60, r60.f31176i));
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void e() {
        com.google.android.gms.internal.ads.C5865z70 c5865z70 = this.f33235J;
        com.google.android.gms.internal.ads.C2337Fa0 c2337Fa0 = this.f33234I;
        com.google.android.gms.internal.ads.C3558e70 c3558e70 = this.f33232G;
        com.google.android.gms.internal.ads.R60 r60 = this.f33233H;
        c5865z70.a(c2337Fa0.c(c3558e70, r60, r60.f31172g));
    }

    @Override // p184s3.InterfaceC7076a
    public final void e0() {
        if (!(((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25219B0)).booleanValue() && this.f33232G.f34899b.f34448b.f32120h) && ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2200Bg.f26004d.e()).booleanValue()) {
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.e(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(this.f33237L.a()), java.lang.Throwable.class, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.Rx
                @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                public final java.lang.Object apply(java.lang.Object obj) {
                    return "failure_click_attok";
                }
            }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g), new com.google.android.gms.internal.ads.C2957Vx(this), this.f33229D);
            return;
        }
        com.google.android.gms.internal.ads.C5865z70 c5865z70 = this.f33235J;
        com.google.android.gms.internal.ads.C2337Fa0 c2337Fa0 = this.f33234I;
        com.google.android.gms.internal.ads.C3558e70 c3558e70 = this.f33232G;
        com.google.android.gms.internal.ads.R60 r60 = this.f33233H;
        c5865z70.c(c2337Fa0.c(c3558e70, r60, r60.f31164c), true == p174r3.v.s().a(this.f33228C) ? 2 : 1);
    }

    final /* synthetic */ void n() {
        this.f33229D.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Sx
            @Override // java.lang.Runnable
            public final void run() {
                this.f31817C.F();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.VC
    public final void p(p184s3.W0 w6) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25241D1)).booleanValue()) {
            this.f33235J.a(this.f33234I.c(this.f33232G, this.f33233H, com.google.android.gms.internal.ads.C2337Fa0.f(2, w6.f54145C, this.f33233H.f31188o)));
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void q(com.google.android.gms.internal.ads.InterfaceC3302bp interfaceC3302bp, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.C5865z70 c5865z70 = this.f33235J;
        com.google.android.gms.internal.ads.C2337Fa0 c2337Fa0 = this.f33234I;
        com.google.android.gms.internal.ads.R60 r60 = this.f33233H;
        c5865z70.a(c2337Fa0.e(r60, r60.f31174h, interfaceC3302bp));
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void t() {
        if (this.f33242Q.compareAndSet(false, true)) {
            int iIntValue = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25353N3)).intValue();
            if (iIntValue > 0) {
                G(iIntValue, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25364O3)).intValue());
                return;
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25342M3)).booleanValue()) {
                this.f33230E.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Qx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31090C.n();
                    }
                });
            } else {
                F();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
    public final synchronized void u() {
        com.google.android.gms.internal.ads.C5865z70 c5865z70;
        java.util.List listC;
        com.google.android.gms.internal.ads.C3458dC c3458dC;
        try {
            if (this.f33241P) {
                java.util.ArrayList arrayList = new java.util.ArrayList(E());
                arrayList.addAll(this.f33233H.f31170f);
                c5865z70 = this.f33235J;
                listC = this.f33234I.d(this.f33232G, this.f33233H, true, null, null, arrayList);
            } else {
                com.google.android.gms.internal.ads.C5865z70 c5865z71 = this.f33235J;
                com.google.android.gms.internal.ads.C2337Fa0 c2337Fa0 = this.f33234I;
                com.google.android.gms.internal.ads.C3558e70 c3558e70 = this.f33232G;
                com.google.android.gms.internal.ads.R60 r60 = this.f33233H;
                c5865z71.a(c2337Fa0.c(c3558e70, r60, r60.f31184m));
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25309J3)).booleanValue() && (c3458dC = this.f33240O) != null) {
                    java.util.List listH = com.google.android.gms.internal.ads.C2337Fa0.h(com.google.android.gms.internal.ads.C2337Fa0.g(c3458dC.b().f31184m, c3458dC.a().g()), this.f33240O.a().a());
                    com.google.android.gms.internal.ads.C5865z70 c5865z72 = this.f33235J;
                    com.google.android.gms.internal.ads.C2337Fa0 c2337Fa1 = this.f33234I;
                    com.google.android.gms.internal.ads.C3458dC c3458dC2 = this.f33240O;
                    c5865z72.a(c2337Fa1.c(c3458dC2.c(), c3458dC2.b(), listH));
                }
                c5865z70 = this.f33235J;
                com.google.android.gms.internal.ads.C2337Fa0 c2337Fa2 = this.f33234I;
                com.google.android.gms.internal.ads.C3558e70 c3558e71 = this.f33232G;
                com.google.android.gms.internal.ads.R60 r61 = this.f33233H;
                listC = c2337Fa2.c(c3558e71, r61, r61.f31170f);
            }
            c5865z70.a(listC);
            this.f33241P = true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void w() {
        com.google.android.gms.internal.ads.C5865z70 c5865z70 = this.f33235J;
        com.google.android.gms.internal.ads.C2337Fa0 c2337Fa0 = this.f33234I;
        com.google.android.gms.internal.ads.C3558e70 c3558e70 = this.f33232G;
        com.google.android.gms.internal.ads.R60 r60 = this.f33233H;
        c5865z70.a(c2337Fa0.c(c3558e70, r60, r60.f31201u0));
    }
}
