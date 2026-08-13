package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4243kL {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f36946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f36947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BM f36948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.VL f36949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.content.Context f36950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f36951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f36952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4033iT f36953h;

    public C4243kL(com.google.android.gms.internal.ads.C4546n70 c4546n70, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.BM bm, android.content.Context context, com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.C4033iT c4033iT, com.google.android.gms.internal.ads.VL vl) {
        this.f36946a = c4546n70;
        this.f36947b = executor;
        this.f36948c = bm;
        this.f36950e = context;
        this.f36951f = c3588eO;
        this.f36952g = c2559La0;
        this.f36953h = c4033iT;
        this.f36949d = vl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        j(interfaceC2698Ot);
        interfaceC2698Ot.g1("/video", com.google.android.gms.internal.ads.AbstractC3728fj.f35407l);
        interfaceC2698Ot.g1("/videoMeta", com.google.android.gms.internal.ads.AbstractC3728fj.f35408m);
        interfaceC2698Ot.g1("/precache", new com.google.android.gms.internal.ads.C2916Us());
        interfaceC2698Ot.g1("/delayPageLoaded", com.google.android.gms.internal.ads.AbstractC3728fj.f35411p);
        interfaceC2698Ot.g1("/instrument", com.google.android.gms.internal.ads.AbstractC3728fj.f35409n);
        interfaceC2698Ot.g1("/log", com.google.android.gms.internal.ads.AbstractC3728fj.f35402g);
        interfaceC2698Ot.g1("/click", new com.google.android.gms.internal.ads.C2278Di(null, 0 == true ? 1 : 0));
        if (this.f36946a.f37509b != null) {
            interfaceC2698Ot.M().A0(true);
            interfaceC2698Ot.g1("/open", new com.google.android.gms.internal.ads.C5265tj(null, null, null, null, null));
        } else {
            interfaceC2698Ot.M().A0(false);
        }
        if (p174r3.v.r().p(interfaceC2698Ot.getContext())) {
            java.util.Map map = new java.util.HashMap();
            if (interfaceC2698Ot.Q() != null) {
                map = interfaceC2698Ot.Q().f31205w0;
            }
            interfaceC2698Ot.g1("/logScionEvent", new com.google.android.gms.internal.ads.C4496mj(interfaceC2698Ot.getContext(), map));
        }
    }

    private final void i(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C4402lr c4402lr) {
        if (this.f36946a.f37508a != null && interfaceC2698Ot.s() != null) {
            interfaceC2698Ot.s().s6(this.f36946a.f37508a);
        }
        c4402lr.h();
    }

    private static final void j(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        interfaceC2698Ot.g1("/videoClicked", com.google.android.gms.internal.ads.AbstractC3728fj.f35403h);
        interfaceC2698Ot.M().U(true);
        interfaceC2698Ot.g1("/getNativeAdViewSignals", com.google.android.gms.internal.ads.AbstractC3728fj.f35414s);
        interfaceC2698Ot.g1("/getNativeClickMeta", com.google.android.gms.internal.ads.AbstractC3728fj.f35415t);
    }

    public final P4.d a(final org.json.JSONObject jSONObject) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.aL
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f34065a.e(obj);
            }
        }, this.f36947b), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.ZK
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f33571a.c(jSONObject, (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj);
            }
        }, this.f36947b);
    }

    public final P4.d b(final java.lang.String str, final java.lang.String str2, final com.google.android.gms.internal.ads.R60 r60, final com.google.android.gms.internal.ads.U60 u60, final p184s3.c2 c2Var) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.YK
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f33336a.d(c2Var, r60, u60, str, str2, obj);
            }
        }, this.f36947b);
    }

    final /* synthetic */ P4.d c(org.json.JSONObject jSONObject, final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        com.google.android.gms.internal.ads.C4498mk c4498mk = this.f36946a.f37509b;
        final com.google.android.gms.internal.ads.C4402lr c4402lrF = com.google.android.gms.internal.ads.C4402lr.f(interfaceC2698Ot);
        interfaceC2698Ot.l1(c4498mk != null ? com.google.android.gms.internal.ads.C2625Mu.d() : com.google.android.gms.internal.ads.C2625Mu.e());
        interfaceC2698Ot.M().D(new com.google.android.gms.internal.ads.InterfaceC2478Iu() { // from class: com.google.android.gms.internal.ads.dL
            @Override // com.google.android.gms.internal.ads.InterfaceC2478Iu
            public final void a(boolean z6, int i6, java.lang.String str, java.lang.String str2) {
                this.f34699C.f(interfaceC2698Ot, c4402lrF, z6, i6, str, str2);
            }
        });
        interfaceC2698Ot.G0("google.afma.nativeAds.renderVideo", jSONObject);
        return c4402lrF;
    }

    final /* synthetic */ P4.d d(p184s3.c2 c2Var, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.U60 u60, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = this.f36948c.a(c2Var, r60, u60);
        final com.google.android.gms.internal.ads.C4402lr c4402lrF = com.google.android.gms.internal.ads.C4402lr.f(interfaceC2698OtA);
        if (this.f36946a.f37509b != null) {
            h(interfaceC2698OtA);
            interfaceC2698OtA.l1(com.google.android.gms.internal.ads.C2625Mu.d());
        } else {
            com.google.android.gms.internal.ads.SL slB = this.f36949d.b();
            interfaceC2698OtA.M().V(slB, slB, slB, slB, slB, false, null, new p174r3.b(this.f36950e, null, null), null, null, this.f36953h, this.f36952g, this.f36951f, null, slB, null, null, null, null);
            j(interfaceC2698OtA);
        }
        interfaceC2698OtA.M().D(new com.google.android.gms.internal.ads.InterfaceC2478Iu() { // from class: com.google.android.gms.internal.ads.eL
            @Override // com.google.android.gms.internal.ads.InterfaceC2478Iu
            public final void a(boolean z6, int i6, java.lang.String str3, java.lang.String str4) {
                this.f34971C.g(interfaceC2698OtA, c4402lrF, z6, i6, str3, str4);
            }
        });
        interfaceC2698OtA.d1(str, str2, null);
        return c4402lrF;
    }

    final /* synthetic */ P4.d e(java.lang.Object obj) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = this.f36948c.a(p184s3.c2.s(), null, null);
        final com.google.android.gms.internal.ads.C4402lr c4402lrF = com.google.android.gms.internal.ads.C4402lr.f(interfaceC2698OtA);
        h(interfaceC2698OtA);
        interfaceC2698OtA.M().K(new com.google.android.gms.internal.ads.InterfaceC2515Ju() { // from class: com.google.android.gms.internal.ads.bL
            @Override // com.google.android.gms.internal.ads.InterfaceC2515Ju
            public final void a() {
                c4402lrF.h();
            }
        });
        interfaceC2698OtA.loadUrl((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25397R3));
        return c4402lrF;
    }

    final /* synthetic */ void f(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C4402lr c4402lr, boolean z6, int i6, java.lang.String str, java.lang.String str2) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25485Z3)).booleanValue()) {
            i(interfaceC2698Ot, c4402lr);
            return;
        }
        if (z6) {
            i(interfaceC2698Ot, c4402lr);
            return;
        }
        c4402lr.d(new com.google.android.gms.internal.ads.XV(1, "Native Video WebView failed to load. Error code: " + i6 + ", Description: " + str + ", Failing URL: " + str2));
    }

    final /* synthetic */ void g(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C4402lr c4402lr, boolean z6, int i6, java.lang.String str, java.lang.String str2) {
        if (z6) {
            if (this.f36946a.f37508a != null && interfaceC2698Ot.s() != null) {
                interfaceC2698Ot.s().s6(this.f36946a.f37508a);
            }
            c4402lr.h();
            return;
        }
        c4402lr.d(new com.google.android.gms.internal.ads.XV(1, "Html video Web View failed to load. Error code: " + i6 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
