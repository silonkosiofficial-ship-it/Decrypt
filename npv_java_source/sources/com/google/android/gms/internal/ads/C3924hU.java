package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3924hU implements com.google.android.gms.internal.ads.VT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2334Ey f36072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f36073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BM f36074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f36075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.Executor f36076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p224w3.a f36077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4166jj f36078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f36079h = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25358N8)).booleanValue();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC5240tT f36080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f36081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f36082k;

    public C3924hU(com.google.android.gms.internal.ads.AbstractC2334Ey abstractC2334Ey, android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.BM bm, com.google.android.gms.internal.ads.C4546n70 c4546n70, p224w3.a aVar, com.google.android.gms.internal.ads.C4166jj c4166jj, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT, com.google.android.gms.internal.ads.YN yn, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f36073b = context;
        this.f36072a = abstractC2334Ey;
        this.f36076e = executor;
        this.f36074c = bm;
        this.f36075d = c4546n70;
        this.f36077f = aVar;
        this.f36078g = c4166jj;
        this.f36080i = binderC5240tT;
        this.f36081j = yn;
        this.f36082k = c3588eO;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.W60 w60 = r60.f31196s;
        return (w60 == null || w60.f32684a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final P4.d b(final com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60) {
        final com.google.android.gms.internal.ads.GM gm = new com.google.android.gms.internal.ads.GM();
        P4.d dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.dU
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f34730a.c(r60, c3558e70, gm, obj);
            }
        }, this.f36076e);
        dVarN.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.eU
            @Override // java.lang.Runnable
            public final void run() {
                gm.b();
            }
        }, this.f36076e);
        return dVarN;
    }

    final /* synthetic */ P4.d c(final com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.GM gm, java.lang.Object obj) {
        final com.google.android.gms.internal.ads.C3924hU c3924hU;
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25624m2;
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            this.f36081j.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_CREATION_START.e(), p174r3.v.c().a());
        }
        final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = this.f36074c.a(this.f36075d.f37512e, r60, c3558e70.f34899b.f34448b);
        interfaceC2698OtA.M0(r60.f31156W);
        gm.a(this.f36073b, interfaceC2698OtA.N());
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            this.f36081j.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_CREATION_END.e(), p174r3.v.c().a());
        }
        com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        final com.google.android.gms.internal.ads.AbstractC2186Ay abstractC2186AyA = this.f36072a.a(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, null), new com.google.android.gms.internal.ads.C4785pH(new com.google.android.gms.internal.ads.C4142jU(this.f36077f, c4512mr, r60, interfaceC2698OtA, this.f36075d, this.f36079h, this.f36078g, this.f36080i, this.f36082k), interfaceC2698OtA), new com.google.android.gms.internal.ads.C2223By(r60.f31161a0));
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            c3924hU = this;
            c3924hU.f36081j.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_AD_COMPONENT_CREATION_END.e(), p174r3.v.c().a());
        } else {
            c3924hU = this;
        }
        abstractC2186AyA.j().i(interfaceC2698OtA, false, c3924hU.f36079h ? c3924hU.f36078g : null, c3924hU.f36081j.a());
        c4512mr.c(abstractC2186AyA);
        abstractC2186AyA.b().F0(new com.google.android.gms.internal.ads.ZC() { // from class: com.google.android.gms.internal.ads.fU
            @Override // com.google.android.gms.internal.ads.ZC
            public final void t() {
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = interfaceC2698OtA;
                if (interfaceC2698Ot.M() != null) {
                    interfaceC2698Ot.M().u();
                }
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
        java.lang.String strB = r60.f31196s.f32684a;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25552f5)).booleanValue() && abstractC2186AyA.k().e(true)) {
            strB = com.google.android.gms.internal.ads.AbstractC2293Du.b(strB, com.google.android.gms.internal.ads.AbstractC2293Du.a(r60));
        }
        abstractC2186AyA.j();
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(com.google.android.gms.internal.ads.AM.j(interfaceC2698OtA, r60.f31196s.f32685b, strB, c3924hU.f36081j.a()), new com.google.android.gms.internal.ads.InterfaceC4821pg0(c3924hU) { // from class: com.google.android.gms.internal.ads.gU
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj2) {
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = interfaceC2698OtA;
                if (r60.f31146M) {
                    interfaceC2698Ot.j0();
                }
                com.google.android.gms.internal.ads.AbstractC2186Ay abstractC2186Ay = abstractC2186AyA;
                interfaceC2698Ot.I0();
                interfaceC2698Ot.onPause();
                return abstractC2186Ay.h();
            }
        }, c3924hU.f36076e);
    }
}
