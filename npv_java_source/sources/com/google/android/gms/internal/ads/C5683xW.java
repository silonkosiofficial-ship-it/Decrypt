package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5683xW implements com.google.android.gms.internal.ads.VT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f39864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BM f39865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4244kM f39866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f39867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.Executor f39868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p224w3.a f39869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4166jj f39870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f39871h = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25358N8)).booleanValue();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC5240tT f39872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f39873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f39874k;

    public C5683xW(android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.C4546n70 c4546n70, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.AbstractC4244kM abstractC4244kM, com.google.android.gms.internal.ads.BM bm, com.google.android.gms.internal.ads.C4166jj c4166jj, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT, com.google.android.gms.internal.ads.YN yn, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f39864a = context;
        this.f39867d = c4546n70;
        this.f39866c = abstractC4244kM;
        this.f39868e = executor;
        this.f39869f = aVar;
        this.f39865b = bm;
        this.f39870g = c4166jj;
        this.f39872i = binderC5240tT;
        this.f39873j = yn;
        this.f39874k = c3588eO;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.W60 w60 = r60.f31196s;
        return (w60 == null || w60.f32684a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final P4.d b(final com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60) {
        final com.google.android.gms.internal.ads.GM gm = new com.google.android.gms.internal.ads.GM();
        P4.d dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.sW
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f38754a.c(r60, c3558e70, gm, obj);
            }
        }, this.f39868e);
        dVarN.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.tW
            @Override // java.lang.Runnable
            public final void run() {
                gm.b();
            }
        }, this.f39868e);
        return dVarN;
    }

    final /* synthetic */ P4.d c(final com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.GM gm, java.lang.Object obj) {
        final com.google.android.gms.internal.ads.C5683xW c5683xW;
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25624m2;
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            this.f39873j.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_CREATION_START.e(), p174r3.v.c().a());
        }
        final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = this.f39865b.a(this.f39867d.f37512e, r60, c3558e70.f34899b.f34448b);
        interfaceC2698OtA.M0(r60.f31156W);
        gm.a(this.f39864a, interfaceC2698OtA.N());
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            this.f39873j.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_CREATION_END.e(), p174r3.v.c().a());
        }
        com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        final com.google.android.gms.internal.ads.AbstractC3806gM abstractC3806gMD = this.f39866c.d(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, null), new com.google.android.gms.internal.ads.C3916hM(new com.google.android.gms.internal.ads.C5573wW(this.f39864a, this.f39865b, this.f39867d, this.f39869f, r60, c4512mr, interfaceC2698OtA, this.f39870g, this.f39871h, this.f39872i, this.f39873j, this.f39874k), interfaceC2698OtA));
        c4512mr.c(abstractC3806gMD);
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            c5683xW = this;
            c5683xW.f39873j.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_AD_COMPONENT_CREATION_END.e(), p174r3.v.c().a());
        } else {
            c5683xW = this;
        }
        com.google.android.gms.internal.ads.C5925zj.b(interfaceC2698OtA, abstractC3806gMD.i());
        abstractC3806gMD.b().F0(new com.google.android.gms.internal.ads.ZC() { // from class: com.google.android.gms.internal.ads.qW
            @Override // com.google.android.gms.internal.ads.ZC
            public final void t() {
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = interfaceC2698OtA;
                if (interfaceC2698Ot.M() != null) {
                    interfaceC2698Ot.M().u();
                }
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
        abstractC3806gMD.l().i(interfaceC2698OtA, true, c5683xW.f39871h ? c5683xW.f39870g : null, c5683xW.f39873j.a());
        java.lang.String strB = r60.f31196s.f32684a;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25552f5)).booleanValue() && abstractC3806gMD.m().e(true)) {
            strB = com.google.android.gms.internal.ads.AbstractC2293Du.b(strB, com.google.android.gms.internal.ads.AbstractC2293Du.a(r60));
        }
        abstractC3806gMD.l();
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(com.google.android.gms.internal.ads.AM.j(interfaceC2698OtA, r60.f31196s.f32685b, strB, c5683xW.f39873j.a()), new com.google.android.gms.internal.ads.InterfaceC4821pg0(c5683xW) { // from class: com.google.android.gms.internal.ads.rW
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj2) {
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = interfaceC2698OtA;
                if (r60.f31146M) {
                    interfaceC2698Ot.j0();
                }
                com.google.android.gms.internal.ads.AbstractC3806gM abstractC3806gM = abstractC3806gMD;
                interfaceC2698Ot.I0();
                interfaceC2698Ot.onPause();
                return abstractC3806gM.k();
            }
        }, c5683xW.f39868e);
    }
}
