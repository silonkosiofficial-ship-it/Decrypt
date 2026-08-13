package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3157aV implements com.google.android.gms.internal.ads.VT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f34080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BM f34081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.QH f34082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f34083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.Executor f34084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p224w3.a f34085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4166jj f34086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f34087h = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25358N8)).booleanValue();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC5240tT f34088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f34089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f34090k;

    public C3157aV(android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.C4546n70 c4546n70, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.QH qh, com.google.android.gms.internal.ads.BM bm, com.google.android.gms.internal.ads.C4166jj c4166jj, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT, com.google.android.gms.internal.ads.YN yn, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f34080a = context;
        this.f34083d = c4546n70;
        this.f34082c = qh;
        this.f34084e = executor;
        this.f34085f = aVar;
        this.f34081b = bm;
        this.f34086g = c4166jj;
        this.f34088i = binderC5240tT;
        this.f34089j = yn;
        this.f34090k = c3588eO;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.W60 w60 = r60.f31196s;
        return (w60 == null || w60.f32684a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final P4.d b(final com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60) {
        final com.google.android.gms.internal.ads.GM gm = new com.google.android.gms.internal.ads.GM();
        P4.d dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.VU
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f32504a.c(r60, c3558e70, gm, obj);
            }
        }, this.f34084e);
        dVarN.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.WU
            @Override // java.lang.Runnable
            public final void run() {
                gm.b();
            }
        }, this.f34084e);
        return dVarN;
    }

    final /* synthetic */ P4.d c(final com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.GM gm, java.lang.Object obj) {
        final com.google.android.gms.internal.ads.C3157aV c3157aV;
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25624m2;
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            this.f34089j.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_CREATION_START.e(), p174r3.v.c().a());
        }
        final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = this.f34081b.a(this.f34083d.f37512e, r60, c3558e70.f34899b.f34448b);
        interfaceC2698OtA.M0(r60.f31156W);
        gm.a(this.f34080a, interfaceC2698OtA.N());
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            this.f34089j.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_CREATION_END.e(), p174r3.v.c().a());
        }
        com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        final com.google.android.gms.internal.ads.AbstractC4455mH abstractC4455mHC = this.f34082c.c(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, null), new com.google.android.gms.internal.ads.C4785pH(new com.google.android.gms.internal.ads.ZU(this.f34080a, this.f34085f, c4512mr, r60, interfaceC2698OtA, this.f34083d, this.f34087h, this.f34086g, this.f34088i, this.f34090k), interfaceC2698OtA));
        c4512mr.c(abstractC4455mHC);
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            c3157aV = this;
            c3157aV.f34089j.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_AD_COMPONENT_CREATION_END.e(), p174r3.v.c().a());
        } else {
            c3157aV = this;
        }
        abstractC4455mHC.b().F0(new com.google.android.gms.internal.ads.ZC() { // from class: com.google.android.gms.internal.ads.XU
            @Override // com.google.android.gms.internal.ads.ZC
            public final void t() {
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = interfaceC2698OtA;
                if (interfaceC2698Ot.M() != null) {
                    interfaceC2698Ot.M().u();
                }
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
        java.lang.String strB = r60.f31196s.f32684a;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25552f5)).booleanValue() && abstractC4455mHC.l().e(true)) {
            strB = com.google.android.gms.internal.ads.AbstractC2293Du.b(strB, com.google.android.gms.internal.ads.AbstractC2293Du.a(r60));
        }
        abstractC4455mHC.k().i(interfaceC2698OtA, true, c3157aV.f34087h ? c3157aV.f34086g : null, c3157aV.f34089j.a());
        abstractC4455mHC.k();
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(com.google.android.gms.internal.ads.AM.j(interfaceC2698OtA, r60.f31196s.f32685b, strB, c3157aV.f34089j.a()), new com.google.android.gms.internal.ads.InterfaceC4821pg0(c3157aV) { // from class: com.google.android.gms.internal.ads.YU
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj2) {
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = interfaceC2698OtA;
                if (r60.f31146M) {
                    interfaceC2698Ot.j0();
                }
                com.google.android.gms.internal.ads.AbstractC4455mH abstractC4455mH = abstractC4455mHC;
                interfaceC2698Ot.I0();
                interfaceC2698Ot.onPause();
                return abstractC4455mH.i();
            }
        }, c3157aV.f34084e);
    }
}
