package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class RK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f31233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5340uK f31234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f31235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p224w3.a f31236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p174r3.a f31237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4704od f31238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.Executor f31239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3505dh f31240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4243kL f31241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BM f31242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f31243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.VL f31244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f31245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f31246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4033iT f31247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC5240tT f31248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4985r70 f31249q;

    public RK(android.content.Context context, com.google.android.gms.internal.ads.C5340uK c5340uK, com.google.android.gms.internal.ads.Z9 z10, p224w3.a aVar, p174r3.a aVar2, com.google.android.gms.internal.ads.C4704od c4704od, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.C4546n70 c4546n70, com.google.android.gms.internal.ads.C4243kL c4243kL, com.google.android.gms.internal.ads.BM bm, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.C4033iT c4033iT, com.google.android.gms.internal.ads.VL vl, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT, com.google.android.gms.internal.ads.C4985r70 c4985r70) {
        this.f31233a = context;
        this.f31234b = c5340uK;
        this.f31235c = z10;
        this.f31236d = aVar;
        this.f31237e = aVar2;
        this.f31238f = c4704od;
        this.f31239g = executor;
        this.f31240h = c4546n70.f37516i;
        this.f31241i = c4243kL;
        this.f31242j = bm;
        this.f31243k = scheduledExecutorService;
        this.f31245m = c3588eO;
        this.f31246n = c2559La0;
        this.f31247o = c4033iT;
        this.f31244l = vl;
        this.f31248p = binderC5240tT;
        this.f31249q = c4985r70;
    }

    public static final p184s3.BinderC7126q1 i(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return r(jSONObjectOptJSONObject);
    }

    public static final java.util.List j(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
            p184s3.BinderC7126q1 binderC7126q1R = r(jSONArrayOptJSONArray.optJSONObject(i6));
            if (binderC7126q1R != null) {
                arrayList.add(binderC7126q1R);
            }
        }
        return com.google.android.gms.internal.ads.AbstractC3398ci0.M(arrayList);
    }

    private final p184s3.c2 k(int i6, int i10) {
        if (i6 == 0) {
            if (i10 == 0) {
                return p184s3.c2.s();
            }
            i6 = 0;
        }
        return new p184s3.c2(this.f31233a, new p104k3.h(i6, i10));
    }

    private static P4.d l(P4.d dVar, java.lang.Object obj) {
        final java.lang.Object obj2 = null;
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.f(dVar, java.lang.Exception.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0(obj2) { // from class: com.google.android.gms.internal.ads.MK
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj3) {
                p214v3.AbstractC7265q0.l("Error during loading assets.", (java.lang.Exception) obj3);
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }

    private static P4.d m(boolean z6, final P4.d dVar, java.lang.Object obj) {
        return z6 ? com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVar, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.NK
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj2) {
                return obj2 != null ? dVar : com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.XV(1, "Retrieve required value in native ad response failed."));
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g) : l(dVar, null);
    }

    private final P4.d n(org.json.JSONObject jSONObject, boolean z6) {
        if (jSONObject == null) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        }
        final java.lang.String strOptString = jSONObject.optString("url");
        if (android.text.TextUtils.isEmpty(strOptString)) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z6) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.BinderC3286bh(null, android.net.Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return m(jSONObject.optBoolean("require"), com.google.android.gms.internal.ads.AbstractC2652Nk0.m(this.f31234b.b(strOptString, dOptDouble, zOptBoolean), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.FK
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                return new com.google.android.gms.internal.ads.BinderC3286bh(new android.graphics.drawable.BitmapDrawable(android.content.res.Resources.getSystem(), (android.graphics.Bitmap) obj), android.net.Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.f31239g), null);
    }

    private final P4.d o(org.json.JSONArray jSONArray, boolean z6, boolean z10) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(java.util.Collections.emptyList());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = z10 ? jSONArray.length() : 1;
        for (int i6 = 0; i6 < length; i6++) {
            arrayList.add(n(jSONArray.optJSONObject(i6), z6));
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(com.google.android.gms.internal.ads.AbstractC2652Nk0.d(arrayList), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.KK
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.google.android.gms.internal.ads.BinderC3286bh binderC3286bh : (java.util.List) obj) {
                    if (binderC3286bh != null) {
                        arrayList2.add(binderC3286bh);
                    }
                }
                return arrayList2;
            }
        }, this.f31239g);
    }

    private final P4.d p(org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.U60 u60) {
        final P4.d dVarB = this.f31241i.b(jSONObject.optString("base_url"), jSONObject.optString("html"), r60, u60, k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVarB, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.HK
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) throws com.google.android.gms.internal.ads.XV {
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
                if (interfaceC2698Ot == null || interfaceC2698Ot.s() == null) {
                    throw new com.google.android.gms.internal.ads.XV(1, "Retrieve video view in html5 ad response failed.");
                }
                return dVarB;
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }

    private static java.lang.Integer q(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return java.lang.Integer.valueOf(android.graphics.Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private static final p184s3.BinderC7126q1 r(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String strOptString = jSONObject.optString("reason");
        java.lang.String strOptString2 = jSONObject.optString("ping_url");
        if (android.text.TextUtils.isEmpty(strOptString) || android.text.TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new p184s3.BinderC7126q1(strOptString, strOptString2);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.BinderC3044Yg a(org.json.JSONObject jSONObject, java.util.List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.lang.String strOptString = jSONObject.optString("text");
        java.lang.Integer numQ = q(jSONObject, "bg_color");
        java.lang.Integer numQ2 = q(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new com.google.android.gms.internal.ads.BinderC3044Yg(strOptString, list, numQ, numQ2, iOptInt > 0 ? java.lang.Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.f31240h.f34779G, zOptBoolean);
    }

    final /* synthetic */ P4.d b(p184s3.c2 c2Var, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.U60 u60, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = this.f31242j.a(c2Var, r60, u60);
        final com.google.android.gms.internal.ads.C4402lr c4402lrF = com.google.android.gms.internal.ads.C4402lr.f(interfaceC2698OtA);
        com.google.android.gms.internal.ads.SL slB = this.f31244l.b();
        interfaceC2698OtA.M().V(slB, slB, slB, slB, slB, false, null, new p174r3.b(this.f31233a, null, null), null, null, this.f31247o, this.f31246n, this.f31245m, null, slB, null, null, null, null);
        interfaceC2698OtA.g1("/getNativeAdViewSignals", com.google.android.gms.internal.ads.AbstractC3728fj.f35414s);
        interfaceC2698OtA.g1("/getNativeClickMeta", com.google.android.gms.internal.ads.AbstractC3728fj.f35415t);
        interfaceC2698OtA.M().s0(true);
        interfaceC2698OtA.M().D(new com.google.android.gms.internal.ads.InterfaceC2478Iu() { // from class: com.google.android.gms.internal.ads.OK
            @Override // com.google.android.gms.internal.ads.InterfaceC2478Iu
            public final void a(boolean z6, int i6, java.lang.String str3, java.lang.String str4) {
                com.google.android.gms.internal.ads.C4402lr c4402lr = c4402lrF;
                if (z6) {
                    c4402lr.h();
                    return;
                }
                c4402lr.d(new com.google.android.gms.internal.ads.XV(1, "Image Web View failed to load. Error code: " + i6 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        interfaceC2698OtA.d1(str, str2, null);
        return c4402lrF;
    }

    final /* synthetic */ P4.d c(java.lang.String str, java.lang.Object obj) throws com.google.android.gms.internal.ads.C3530du {
        p174r3.v.a();
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = com.google.android.gms.internal.ads.C3640eu.a(this.f31233a, com.google.android.gms.internal.ads.C2625Mu.a(), "native-omid", false, false, this.f31235c, null, this.f31236d, null, null, this.f31237e, this.f31238f, null, null, this.f31248p, this.f31249q);
        final com.google.android.gms.internal.ads.C4402lr c4402lrF = com.google.android.gms.internal.ads.C4402lr.f(interfaceC2698OtA);
        interfaceC2698OtA.M().D(new com.google.android.gms.internal.ads.InterfaceC2478Iu() { // from class: com.google.android.gms.internal.ads.EK
            @Override // com.google.android.gms.internal.ads.InterfaceC2478Iu
            public final void a(boolean z6, int i6, java.lang.String str2, java.lang.String str3) {
                c4402lrF.h();
            }
        });
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25585i5)).booleanValue()) {
            interfaceC2698OtA.loadData(android.util.Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            interfaceC2698OtA.loadData(str, "text/html", "UTF-8");
        }
        return c4402lrF;
    }

    public final P4.d d(org.json.JSONObject jSONObject, java.lang.String str) {
        final org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new org.json.JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return m(jSONObjectOptJSONObject.optBoolean("require"), com.google.android.gms.internal.ads.AbstractC2652Nk0.m(o(jSONArrayOptJSONArray, false, true), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.LK
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f29470a.a(jSONObjectOptJSONObject, (java.util.List) obj);
            }
        }, this.f31239g), null);
    }

    public final P4.d e(org.json.JSONObject jSONObject, java.lang.String str) {
        return n(jSONObject.optJSONObject(str), this.f31240h.f34776D);
    }

    public final P4.d f(org.json.JSONObject jSONObject, java.lang.String str) {
        com.google.android.gms.internal.ads.C3505dh c3505dh = this.f31240h;
        return o(jSONObject.optJSONArray("images"), c3505dh.f34776D, c3505dh.f34778F);
    }

    public final P4.d g(org.json.JSONObject jSONObject, java.lang.String str, final com.google.android.gms.internal.ads.R60 r60, final com.google.android.gms.internal.ads.U60 u60) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25425T9)).booleanValue()) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        }
        org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        }
        final java.lang.String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final p184s3.c2 c2VarK = k(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (android.text.TextUtils.isEmpty(strOptString2)) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        }
        final P4.d dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.IK
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f28442a.b(c2VarK, r60, u60, strOptString, strOptString2, obj);
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34800f);
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVarN, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.JK
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) throws com.google.android.gms.internal.ads.XV {
                if (((com.google.android.gms.internal.ads.InterfaceC2698Ot) obj) != null) {
                    return dVarN;
                }
                throw new com.google.android.gms.internal.ads.XV(1, "Retrieve Web View from image ad response failed.");
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }

    public final P4.d h(org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.U60 u60) {
        P4.d dVarA;
        org.json.JSONObject jSONObjectH = p214v3.V.h(jSONObject, "html_containers", "instream");
        if (jSONObjectH != null) {
            return p(jSONObjectH, r60, u60);
        }
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject != null) {
            java.lang.String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
            boolean z6 = false;
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25414S9)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
                z6 = true;
            }
            if (!android.text.TextUtils.isEmpty(strOptString)) {
                if (!z6) {
                    dVarA = this.f31241i.a(jSONObjectOptJSONObject);
                }
                return l(com.google.android.gms.internal.ads.AbstractC2652Nk0.o(dVarA, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25408S3)).intValue(), java.util.concurrent.TimeUnit.SECONDS, this.f31243k), null);
            }
            if (!z6) {
                p224w3.p.g("Required field 'vast_xml' or 'html' is missing");
            }
            dVarA = p(jSONObjectOptJSONObject, r60, u60);
            return l(com.google.android.gms.internal.ads.AbstractC2652Nk0.o(dVarA, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25408S3)).intValue(), java.util.concurrent.TimeUnit.SECONDS, this.f31243k), null);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
    }
}
