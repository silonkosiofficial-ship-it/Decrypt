package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class PL {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p174r3.a f30696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f30697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f30698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.Executor f30699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f30700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p224w3.a f30701g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4033iT f30703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f30704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC5240tT f30705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4985r70 f30706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private P4.d f30707m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BL f30695a = new com.google.android.gms.internal.ads.BL();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5705xj f30702h = new com.google.android.gms.internal.ads.C5705xj();

    PL(com.google.android.gms.internal.ads.ML ml) {
        this.f30697c = ml.f29706b;
        this.f30699e = ml.f29709e;
        this.f30700f = ml.f29710f;
        this.f30701g = ml.f29711g;
        this.f30696b = ml.f29705a;
        this.f30703i = ml.f29708d;
        this.f30704j = ml.f29712h;
        this.f30698d = ml.f29707c;
        this.f30705k = ml.f29713i;
        this.f30706l = ml.f29714j;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2698Ot a(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        interfaceC2698Ot.g1("/result", this.f30702h);
        com.google.android.gms.internal.ads.InterfaceC2552Ku interfaceC2552KuM = interfaceC2698Ot.M();
        p174r3.b bVar = new p174r3.b(this.f30697c, null, null);
        com.google.android.gms.internal.ads.C4033iT c4033iT = this.f30703i;
        com.google.android.gms.internal.ads.C2559La0 c2559La0 = this.f30704j;
        com.google.android.gms.internal.ads.C3588eO c3588eO = this.f30698d;
        com.google.android.gms.internal.ads.BL bl = this.f30695a;
        interfaceC2552KuM.V(null, bl, bl, bl, bl, false, null, bVar, null, null, c4033iT, c2559La0, c3588eO, null, null, null, null, null, null);
        return interfaceC2698Ot;
    }

    final /* synthetic */ P4.d f(java.lang.String str, org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        return this.f30702h.b(interfaceC2698Ot, str, jSONObject);
    }

    public final synchronized P4.d g(final java.lang.String str, final org.json.JSONObject jSONObject) {
        P4.d dVar = this.f30707m;
        if (dVar == null) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVar, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.CL
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f26196a.f(str, jSONObject, (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj);
            }
        }, this.f30699e);
    }

    public final synchronized void h(com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.U60 u60, com.google.android.gms.internal.ads.C2591Lx c2591Lx) {
        P4.d dVar = this.f30707m;
        if (dVar == null) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVar, new com.google.android.gms.internal.ads.JL(this, r60, u60, c2591Lx), this.f30699e);
    }

    public final synchronized void i() {
        P4.d dVar = this.f30707m;
        if (dVar == null) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVar, new com.google.android.gms.internal.ads.FL(this), this.f30699e);
        this.f30707m = null;
    }

    public final synchronized void j(java.lang.String str, java.util.Map map) {
        P4.d dVar = this.f30707m;
        if (dVar == null) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVar, new com.google.android.gms.internal.ads.IL(this, "sendMessageToNativeJs", map), this.f30699e);
    }

    public final synchronized void k() {
        final java.lang.String str = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25386Q3);
        final android.content.Context context = this.f30697c;
        final com.google.android.gms.internal.ads.Z9 z10 = this.f30700f;
        final p224w3.a aVar = this.f30701g;
        final p174r3.a aVar2 = this.f30696b;
        final com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT = this.f30705k;
        final com.google.android.gms.internal.ads.C4985r70 c4985r70 = this.f30706l;
        P4.d dVarM = com.google.android.gms.internal.ads.AbstractC2652Nk0.m(com.google.android.gms.internal.ads.AbstractC2652Nk0.k(new com.google.android.gms.internal.ads.InterfaceC5158sk0() { // from class: com.google.android.gms.internal.ads.cu
            @Override // com.google.android.gms.internal.ads.InterfaceC5158sk0
            public final P4.d a() throws com.google.android.gms.internal.ads.C3530du {
                p174r3.v.a();
                android.content.Context context2 = context;
                com.google.android.gms.internal.ads.C2625Mu c2625MuA = com.google.android.gms.internal.ads.C2625Mu.a();
                com.google.android.gms.internal.ads.Z9 z11 = z10;
                com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT2 = binderC5240tT;
                p174r3.a aVar3 = aVar2;
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = com.google.android.gms.internal.ads.C3640eu.a(context2, c2625MuA, "", false, false, z11, null, aVar, null, null, aVar3, com.google.android.gms.internal.ads.C4704od.a(), null, null, binderC5240tT2, c4985r70);
                final com.google.android.gms.internal.ads.C4402lr c4402lrF = com.google.android.gms.internal.ads.C4402lr.f(interfaceC2698OtA);
                interfaceC2698OtA.M().D(new com.google.android.gms.internal.ads.InterfaceC2478Iu() { // from class: com.google.android.gms.internal.ads.bu
                    @Override // com.google.android.gms.internal.ads.InterfaceC2478Iu
                    public final void a(boolean z6, int i6, java.lang.String str2, java.lang.String str3) {
                        c4402lrF.h();
                    }
                });
                interfaceC2698OtA.loadUrl(str);
                return c4402lrF;
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34800f), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.EL
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
                this.f27028a.a(interfaceC2698Ot);
                return interfaceC2698Ot;
            }
        }, this.f30699e);
        this.f30707m = dVarM;
        com.google.android.gms.internal.ads.AbstractC3854gr.a(dVarM, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void l(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        P4.d dVar = this.f30707m;
        if (dVar == null) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVar, new com.google.android.gms.internal.ads.GL(this, str, interfaceC3838gj), this.f30699e);
    }

    public final void m(java.lang.ref.WeakReference weakReference, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        l(str, new com.google.android.gms.internal.ads.NL(this, weakReference, str, interfaceC3838gj, null));
    }

    public final synchronized void n(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        P4.d dVar = this.f30707m;
        if (dVar == null) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVar, new com.google.android.gms.internal.ads.HL(this, str, interfaceC3838gj), this.f30699e);
    }
}
