package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class CK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f26193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RK f26194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.WK f26195c;

    public CK(com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.RK rk, com.google.android.gms.internal.ads.WK wk) {
        this.f26193a = yk0;
        this.f26194b = rk;
        this.f26195c = wk;
    }

    static final /* synthetic */ com.google.android.gms.internal.ads.C3581eJ b(P4.d dVar, P4.d dVar2, P4.d dVar3, P4.d dVar4, P4.d dVar5, org.json.JSONObject jSONObject, P4.d dVar6, P4.d dVar7, P4.d dVar8, P4.d dVar9, P4.d dVar10) {
        com.google.android.gms.internal.ads.C3581eJ c3581eJ = (com.google.android.gms.internal.ads.C3581eJ) dVar.get();
        c3581eJ.p((java.util.List) dVar2.get());
        c3581eJ.m((com.google.android.gms.internal.ads.InterfaceC4712oh) dVar3.get());
        c3581eJ.q((com.google.android.gms.internal.ads.InterfaceC4712oh) dVar4.get());
        c3581eJ.j((com.google.android.gms.internal.ads.InterfaceC3944hh) dVar5.get());
        c3581eJ.s(com.google.android.gms.internal.ads.RK.j(jSONObject));
        c3581eJ.l(com.google.android.gms.internal.ads.RK.i(jSONObject));
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) dVar6.get();
        if (interfaceC2698Ot != null) {
            c3581eJ.E(interfaceC2698Ot);
            c3581eJ.D(interfaceC2698Ot.N());
            c3581eJ.C(interfaceC2698Ot.s());
        }
        c3581eJ.Q().putAll((android.os.Bundle) dVar7.get());
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = (com.google.android.gms.internal.ads.InterfaceC2698Ot) dVar8.get();
        if (interfaceC2698Ot2 != null) {
            c3581eJ.o(interfaceC2698Ot2);
            c3581eJ.F(interfaceC2698Ot2.N());
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25617l5)).booleanValue() || c(jSONObject)) {
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot3 = (com.google.android.gms.internal.ads.InterfaceC2698Ot) dVar9.get();
            if (interfaceC2698Ot3 != null) {
                c3581eJ.t(interfaceC2698Ot3);
            }
        } else {
            c3581eJ.u(dVar9);
            c3581eJ.x(new com.google.android.gms.internal.ads.C4512mr());
        }
        for (com.google.android.gms.internal.ads.VK vk : (java.util.List) dVar10.get()) {
            if (vk.f32487a != 1) {
                c3581eJ.n(vk.f32488b, vk.f32490d);
            } else {
                c3581eJ.z(vk.f32488b, vk.f32489c);
            }
        }
        return c3581eJ;
    }

    private static final boolean c(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x00ba  */
    public final P4.d a(final com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60, final org.json.JSONObject jSONObject) {
        final P4.d dVarH;
        org.json.JSONObject jSONObjectOptJSONObject;
        P4.d dVarN;
        final P4.d dVarH0 = this.f26193a.H0(new java.util.concurrent.Callable(this) { // from class: com.google.android.gms.internal.ads.wK
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws com.google.android.gms.internal.ads.XV {
                com.google.android.gms.internal.ads.C3581eJ c3581eJ = new com.google.android.gms.internal.ads.C3581eJ();
                org.json.JSONObject jSONObject2 = jSONObject;
                c3581eJ.B(jSONObject2.optInt("template_id", -1));
                c3581eJ.k(jSONObject2.optString("custom_template_id"));
                org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                java.lang.String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                com.google.android.gms.internal.ads.C3558e70 c3558e71 = c3558e70;
                c3581eJ.v(strOptString);
                com.google.android.gms.internal.ads.C4546n70 c4546n70 = c3558e71.f34898a.f34012a;
                if (!c4546n70.f37514g.contains(java.lang.Integer.toString(c3581eJ.P()))) {
                    throw new com.google.android.gms.internal.ads.XV(1, "Invalid template ID: " + c3581eJ.P());
                }
                if (c3581eJ.P() == 3) {
                    if (c3581eJ.a() == null) {
                        throw new com.google.android.gms.internal.ads.XV(1, "No custom template id for custom template ad response.");
                    }
                    if (!c4546n70.f37515h.contains(c3581eJ.a())) {
                        throw new com.google.android.gms.internal.ads.XV(1, "Unexpected custom template id in the response.");
                    }
                }
                com.google.android.gms.internal.ads.R60 r61 = r60;
                c3581eJ.y(jSONObject2.optDouble("rating", -1.0d));
                java.lang.String strOptString2 = jSONObject2.optString("headline", null);
                if (r61.f31146M) {
                    p174r3.v.t();
                    strOptString2 = p214v3.E0.e0() + " : " + strOptString2;
                }
                c3581eJ.z("headline", strOptString2);
                c3581eJ.z("body", jSONObject2.optString("body", null));
                c3581eJ.z("call_to_action", jSONObject2.optString("call_to_action", null));
                c3581eJ.z("store", jSONObject2.optString("store", null));
                c3581eJ.z("price", jSONObject2.optString("price", null));
                c3581eJ.z("advertiser", jSONObject2.optString("advertiser", null));
                return c3581eJ;
            }
        });
        final P4.d dVarF = this.f26194b.f(jSONObject, "images");
        com.google.android.gms.internal.ads.U60 u60 = c3558e70.f34899b.f34448b;
        com.google.android.gms.internal.ads.RK rk = this.f26194b;
        final P4.d dVarG = rk.g(jSONObject, "images", r60, u60);
        final P4.d dVarE = rk.e(jSONObject, "secondary_image");
        final P4.d dVarE2 = rk.e(jSONObject, "app_icon");
        final P4.d dVarD = rk.d(jSONObject, "attribution");
        final P4.d dVarH2 = this.f26194b.h(jSONObject, r60, c3558e70.f34899b.f34448b);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Pc)).booleanValue() && ((java.lang.Integer) j$.util.Optional.ofNullable(jSONObject.optJSONObject("video")).map(new java.util.function.Function() { // from class: com.google.android.gms.internal.ads.xK
            public /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((org.json.JSONObject) obj).optJSONArray("flags");
            }

            public /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$compose(this, function);
            }
        }).map(new java.util.function.Function() { // from class: com.google.android.gms.internal.ads.yK
            public /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    org.json.JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i6);
                    if (jSONObjectOptJSONObject2.optString("key").equals("afma_video_player_type")) {
                        return jSONObjectOptJSONObject2.optString("value");
                    }
                }
                return null;
            }

            public /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$compose(this, function);
            }
        }).map(new java.util.function.Function() { // from class: com.google.android.gms.internal.ads.zK
            public /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) obj));
            }

            public /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$compose(this, function);
            }
        }).orElse(0)).intValue() == 3) {
            com.google.android.gms.internal.ads.RK rk2 = this.f26194b;
            com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarH2, new com.google.android.gms.internal.ads.QK(rk2, c4512mr), com.google.android.gms.internal.ads.AbstractC3524dr.f34800f);
            dVarH = c4512mr;
        } else {
            dVarH = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new android.os.Bundle());
        }
        final P4.d dVarA = this.f26195c.a(jSONObject, "custom_assets");
        final com.google.android.gms.internal.ads.RK rk3 = this.f26194b;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final java.lang.String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            if (android.text.TextUtils.isEmpty(strOptString)) {
                dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
            } else {
                dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.GK
                    @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                    public final P4.d b(java.lang.Object obj) {
                        return rk3.c(strOptString, obj);
                    }
                }, com.google.android.gms.internal.ads.AbstractC3524dr.f34800f);
            }
        } else {
            dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        }
        final P4.d dVar = dVarN;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(dVarH0);
        arrayList.add(dVarF);
        arrayList.add(dVarG);
        arrayList.add(dVarE);
        arrayList.add(dVarE2);
        arrayList.add(dVarD);
        arrayList.add(dVarH2);
        arrayList.add(dVarH);
        arrayList.add(dVarA);
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25617l5)).booleanValue() || c(jSONObject)) {
            arrayList.add(dVar);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.a(arrayList).a(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.AK
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.android.gms.internal.ads.CK.b(dVarH0, dVarF, dVarE2, dVarE, dVarD, jSONObject, dVarH2, dVarH, dVarG, dVar, dVarA);
            }
        }, this.f26193a);
    }
}
