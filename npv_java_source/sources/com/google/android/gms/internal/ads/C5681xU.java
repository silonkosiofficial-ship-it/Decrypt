package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5681xU implements com.google.android.gms.internal.ads.VT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC5517vz f39857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f39858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BM f39859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f39860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.Executor f39861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4821pg0 f39862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f39863g;

    public C5681xU(com.google.android.gms.internal.ads.AbstractC5517vz abstractC5517vz, android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.BM bm, com.google.android.gms.internal.ads.C4546n70 c4546n70, com.google.android.gms.internal.ads.InterfaceC4821pg0 interfaceC4821pg0, com.google.android.gms.internal.ads.YN yn) {
        this.f39858b = context;
        this.f39857a = abstractC5517vz;
        this.f39861e = executor;
        this.f39859c = bm;
        this.f39860d = c4546n70;
        this.f39862f = interfaceC4821pg0;
        this.f39863g = yn;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.W60 w60 = r60.f31196s;
        return (w60 == null || w60.f32684a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final P4.d b(final com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.wU
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f39607a.c(c3558e70, r60, obj);
            }
        }, this.f39861e);
    }

    final /* synthetic */ P4.d c(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, java.lang.Object obj) {
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25624m2;
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            this.f39863g.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_CREATION_START.e(), p174r3.v.c().a());
        }
        p184s3.c2 c2VarA = com.google.android.gms.internal.ads.AbstractC5205t70.a(this.f39858b, r60.f31200u);
        final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = this.f39859c.a(c2VarA, r60, c3558e70.f34899b.f34448b);
        interfaceC2698OtA.M0(r60.f31156W);
        android.view.View viewA = (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25313J7)).booleanValue() && r60.f31173g0) ? com.google.android.gms.internal.ads.ViewTreeObserverOnScrollChangedListenerC2815Rz.a(this.f39858b, interfaceC2698OtA.N(), r60) : new com.google.android.gms.internal.ads.EM(this.f39858b, interfaceC2698OtA.N(), (p214v3.C7273v) this.f39862f.apply(r60));
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            this.f39863g.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_CREATION_END.e(), p174r3.v.c().a());
        }
        final com.google.android.gms.internal.ads.AbstractC2814Ry abstractC2814RyA = this.f39857a.a(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, null), new com.google.android.gms.internal.ads.C3030Xy(viewA, interfaceC2698OtA, new com.google.android.gms.internal.ads.InterfaceC3454dA() { // from class: com.google.android.gms.internal.ads.rU
            @Override // com.google.android.gms.internal.ads.InterfaceC3454dA
            public final p184s3.Y0 a() {
                return interfaceC2698OtA.s();
            }
        }, com.google.android.gms.internal.ads.AbstractC5205t70.b(c2VarA)));
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            this.f39863g.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_AD_COMPONENT_CREATION_END.e(), p174r3.v.c().a());
        }
        abstractC2814RyA.j().i(interfaceC2698OtA, false, null, this.f39863g.a());
        com.google.android.gms.internal.ads.XC xcB = abstractC2814RyA.b();
        com.google.android.gms.internal.ads.ZC zc = new com.google.android.gms.internal.ads.ZC() { // from class: com.google.android.gms.internal.ads.sU
            @Override // com.google.android.gms.internal.ads.ZC
            public final void t() {
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = interfaceC2698OtA;
                if (interfaceC2698Ot.M() != null) {
                    interfaceC2698Ot.M().u();
                }
            }
        };
        com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34801g;
        xcB.F0(zc, yk0);
        java.lang.String strB = r60.f31196s.f32684a;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25552f5)).booleanValue() && abstractC2814RyA.k().e(true)) {
            strB = com.google.android.gms.internal.ads.AbstractC2293Du.b(strB, com.google.android.gms.internal.ads.AbstractC2293Du.a(r60));
        }
        abstractC2814RyA.j();
        P4.d dVarJ = com.google.android.gms.internal.ads.AM.j(interfaceC2698OtA, r60.f31196s.f32685b, strB, this.f39863g.a());
        if (r60.f31146M) {
            dVarJ.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.tU
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC2698OtA.j0();
                }
            }, this.f39861e);
        }
        dVarJ.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.uU
            @Override // java.lang.Runnable
            public final void run() {
                this.f39161C.d(interfaceC2698OtA);
            }
        }, this.f39861e);
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(dVarJ, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.vU
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj2) {
                return abstractC2814RyA.h();
            }
        }, yk0);
    }

    final /* synthetic */ void d(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        interfaceC2698Ot.I0();
        com.google.android.gms.internal.ads.C4546n70 c4546n70 = this.f39860d;
        com.google.android.gms.internal.ads.BinderC5287tu binderC5287tuS = interfaceC2698Ot.s();
        p184s3.Q1 q6 = c4546n70.f37508a;
        if (q6 != null && binderC5287tuS != null) {
            binderC5287tuS.s6(q6);
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25673r1)).booleanValue() || interfaceC2698Ot.isAttachedToWindow()) {
            return;
        }
        interfaceC2698Ot.onPause();
        interfaceC2698Ot.N0(true);
    }
}
