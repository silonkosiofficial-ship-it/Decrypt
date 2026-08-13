package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5132sV implements com.google.android.gms.internal.ads.InterfaceC4473mV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4567nI f38748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f38749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.CK f38750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.N70 f38751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.VL f38752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f38753f;

    public C5132sV(com.google.android.gms.internal.ads.AbstractC4567nI abstractC4567nI, com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.CK ck, com.google.android.gms.internal.ads.N70 n70, com.google.android.gms.internal.ads.VL vl, com.google.android.gms.internal.ads.YN yn) {
        this.f38748a = abstractC4567nI;
        this.f38749b = yk0;
        this.f38750c = ck;
        this.f38751d = n70;
        this.f38752e = vl;
        this.f38753f = yn;
    }

    private final P4.d g(final com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60, final org.json.JSONObject jSONObject) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25624m2)).booleanValue()) {
            this.f38753f.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_CREATION_START.e(), p174r3.v.c().a());
        }
        com.google.android.gms.internal.ads.N70 n70 = this.f38751d;
        com.google.android.gms.internal.ads.CK ck = this.f38750c;
        final P4.d dVarA = n70.a();
        final P4.d dVarA2 = ck.a(c3558e70, r60, jSONObject);
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.c(dVarA, dVarA2).a(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.nV
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f37604a.c(dVarA2, dVarA, c3558e70, r60, jSONObject);
            }
        }, this.f38749b);
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.W60 w60 = r60.f31196s;
        return (w60 == null || w60.f32686c == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final P4.d b(final com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.n(this.f38751d.a(), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.pV
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f38012a.e(r60, (com.google.android.gms.internal.ads.PL) obj);
            }
        }, this.f38749b), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.qV
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f38281a.f(c3558e70, r60, (org.json.JSONArray) obj);
            }
        }, this.f38749b);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.ZI c(P4.d dVar, P4.d dVar2, com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.C3581eJ c3581eJ = (com.google.android.gms.internal.ads.C3581eJ) dVar.get();
        com.google.android.gms.internal.ads.PL pl = (com.google.android.gms.internal.ads.PL) dVar2.get();
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25624m2;
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            this.f38753f.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_CREATION_END.e(), p174r3.v.c().a());
        }
        com.google.android.gms.internal.ads.AbstractC3691fJ abstractC3691fJC = this.f38748a.c(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, null), new com.google.android.gms.internal.ads.C4899qJ(c3581eJ), new com.google.android.gms.internal.ads.BI(jSONObject, pl));
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            long jA = p174r3.v.c().a();
            this.f38753f.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_AD_COMPONENT_CREATION_END.e(), jA);
            this.f38753f.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_CONFIGURE_WEBVIEW_START.e(), jA);
        }
        abstractC3691fJC.j().b();
        abstractC3691fJC.k().a(pl);
        abstractC3691fJC.i().a(c3581eJ.f0());
        abstractC3691fJC.l().a(this.f38752e, c3581eJ.d0());
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            this.f38753f.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_CONFIGURE_WEBVIEW_END.e(), p174r3.v.c().a());
        }
        return abstractC3691fJC.h();
    }

    final /* synthetic */ P4.d d(com.google.android.gms.internal.ads.PL pl, org.json.JSONObject jSONObject) throws com.google.android.gms.internal.ads.C4280kl {
        this.f38751d.b(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(pl));
        if (jSONObject.optBoolean("success")) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new com.google.android.gms.internal.ads.C4280kl("process json failed");
    }

    final /* synthetic */ P4.d e(com.google.android.gms.internal.ads.R60 r60, final com.google.android.gms.internal.ads.PL pl) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isNonagon", true);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25226B8)).booleanValue() && V3.n.k()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("response", r60.f31196s.f32686c);
        jSONObject2.put("sdk_params", jSONObject);
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(pl.g("google.afma.nativeAds.preProcessJson", jSONObject2), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.oV
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f37819a.d(pl, (org.json.JSONObject) obj);
            }
        }, this.f38749b);
    }

    final /* synthetic */ P4.d f(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, org.json.JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.C4688oQ(3));
        }
        int i6 = 0;
        if (c3558e70.f34898a.f34012a.f37518k <= 1) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(g(c3558e70, r60, jSONArray.getJSONObject(0)), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.rV
                @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.util.Collections.singletonList(com.google.android.gms.internal.ads.AbstractC2652Nk0.h((com.google.android.gms.internal.ads.ZI) obj));
                }
            }, this.f38749b);
        }
        int length = jSONArray.length();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25634n2)).booleanValue()) {
            this.f38753f.c("nsl", java.lang.String.valueOf(length));
        }
        this.f38751d.c(java.lang.Math.min(length, c3558e70.f34898a.f34012a.f37518k));
        java.util.ArrayList arrayList = new java.util.ArrayList(c3558e70.f34898a.f34012a.f37518k);
        while (i6 < c3558e70.f34898a.f34012a.f37518k) {
            arrayList.add(i6 < length ? g(c3558e70, r60, jSONArray.getJSONObject(i6)) : com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.C4688oQ(3)));
            i6++;
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(arrayList);
    }
}
