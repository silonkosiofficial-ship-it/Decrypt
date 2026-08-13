package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3482dR {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final java.util.regex.Pattern f34711l = java.util.regex.Pattern.compile("\\?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2846Su f34712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f34713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p224w3.a f34714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f34715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.Executor f34716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f34717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f34718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q90 f34719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f34720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.lang.Object f34721j = new java.lang.Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3020Xo f34722k;

    C3482dR(com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.C4546n70 c4546n70, java.util.concurrent.Executor executor, java.lang.String str, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.YN yn, com.google.android.gms.internal.ads.C3020Xo c3020Xo, com.google.android.gms.internal.ads.C4360lS c4360lS, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f34712a = abstractC2846Su;
        this.f34713b = context;
        this.f34714c = aVar;
        this.f34715d = c4546n70;
        this.f34716e = executor;
        this.f34718g = str;
        this.f34719h = q90;
        abstractC2846Su.D();
        this.f34720i = yn;
        this.f34722k = c3020Xo;
        this.f34717f = scheduledExecutorService;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0118  */
    private final P4.d d(java.lang.String str, final java.lang.String str2) {
        java.lang.String string;
        P4.d dVarG;
        java.lang.String str3 = "";
        if (android.text.TextUtils.isEmpty(str)) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.XV(15, "Invalid ad string."));
        }
        com.google.android.gms.internal.ads.E90 e90A = com.google.android.gms.internal.ads.D90.a(this.f34713b, 11);
        e90A.h();
        com.google.android.gms.internal.ads.C5599wl c5599wlA = p174r3.v.j().a(this.f34713b, this.f34714c, this.f34712a.F());
        com.google.android.gms.internal.ads.InterfaceC4940ql interfaceC4940ql = com.google.android.gms.internal.ads.AbstractC5269tl.f39020b;
        final com.google.android.gms.internal.ads.InterfaceC4390ll interfaceC4390llA = c5599wlA.a("google.afma.response.normalize", interfaceC4940ql, interfaceC4940ql);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25411S6)).booleanValue()) {
            try {
                string = new org.json.JSONObject(str).optString("fetch_url", "");
            } catch (org.json.JSONException unused) {
                string = "";
            }
            if (android.text.TextUtils.isEmpty(string)) {
                dVarG = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(str);
                this.f34720i.c("sst", "1");
            } else {
                this.f34720i.c("sst", "2");
                java.lang.String str4 = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25433U6);
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25422T6)).booleanValue()) {
                    java.util.List listF = com.google.android.gms.internal.ads.C2755Qg0.c(f34711l).f(string);
                    if (listF.size() < 2) {
                        dVarG = com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.XV(1, "Invalid fetch URL."));
                    } else {
                        str3 = (java.lang.String) listF.get(1);
                        p174r3.v.t();
                        string = android.net.Uri.parse(string).buildUpon().query(null).build().toString();
                        final com.google.android.gms.internal.ads.C4032iS c4032iS = new com.google.android.gms.internal.ads.C4032iS(string, 60000, new java.util.HashMap(), str3.getBytes(java.nio.charset.StandardCharsets.UTF_8), str4, false);
                        dVarG = (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.f((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.o(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.bR
                            @Override // java.util.concurrent.Callable
                            public final java.lang.Object call() {
                                return this.f34319a.c(c4032iS);
                            }
                        })), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25444V6)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f34717f), java.lang.Exception.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.cR
                            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                            public final P4.d b(java.lang.Object obj) {
                                com.google.android.gms.internal.ads.XV xv;
                                java.lang.Exception exc = (java.lang.Exception) obj;
                                p174r3.v.s().w(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                                if (exc instanceof java.util.concurrent.TimeoutException) {
                                    xv = new com.google.android.gms.internal.ads.XV(1, "Timed out waiting for ad response.");
                                } else if (exc instanceof com.google.android.gms.internal.ads.XV) {
                                    xv = (com.google.android.gms.internal.ads.XV) exc;
                                } else {
                                    xv = new com.google.android.gms.internal.ads.XV(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                                }
                                return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(xv);
                            }
                        }, this.f34716e);
                    }
                } else {
                    final com.google.android.gms.internal.ads.C4032iS c4032iS2 = new com.google.android.gms.internal.ads.C4032iS(string, 60000, new java.util.HashMap(), str3.getBytes(java.nio.charset.StandardCharsets.UTF_8), str4, false);
                    dVarG = (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.f((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.o(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.bR
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return this.f34319a.c(c4032iS2);
                        }
                    })), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25444V6)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f34717f), java.lang.Exception.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.cR
                        @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                        public final P4.d b(java.lang.Object obj) {
                            com.google.android.gms.internal.ads.XV xv;
                            java.lang.Exception exc = (java.lang.Exception) obj;
                            p174r3.v.s().w(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                            if (exc instanceof java.util.concurrent.TimeoutException) {
                                xv = new com.google.android.gms.internal.ads.XV(1, "Timed out waiting for ad response.");
                            } else if (exc instanceof com.google.android.gms.internal.ads.XV) {
                                xv = (com.google.android.gms.internal.ads.XV) exc;
                            } else {
                                xv = new com.google.android.gms.internal.ads.XV(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                            }
                            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(xv);
                        }
                    }, this.f34716e);
                }
            }
        } else {
            dVarG = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(str);
            this.f34720i.c("sst", "1");
        }
        P4.d dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVarG, new com.google.android.gms.internal.ads.InterfaceC5268tk0(this) { // from class: com.google.android.gms.internal.ads.YQ
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) throws org.json.JSONException {
                java.lang.String str5 = (java.lang.String) obj;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                java.lang.String str6 = str2;
                try {
                    jSONObject3.put("headers", new org.json.JSONObject());
                    jSONObject3.put("body", str5);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new org.json.JSONObject(str6));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new org.json.JSONObject());
                    return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(jSONObject);
                } catch (org.json.JSONException e6) {
                    throw new org.json.JSONException("Preloaded loader: ".concat(java.lang.String.valueOf(e6.getCause())));
                }
            }
        }, this.f34716e), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.ZQ
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return interfaceC4390llA.c((org.json.JSONObject) obj);
            }
        }, this.f34716e), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.aR
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f34076a.b((org.json.JSONObject) obj);
            }
        }, this.f34716e);
        com.google.android.gms.internal.ads.P90.a(dVarN, this.f34719h, e90A);
        return dVarN;
    }

    private final java.lang.String e(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new org.json.JSONArray().put(this.f34718g));
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e6) {
            p224w3.p.g("Failed to update the ad types for rendering. ".concat(e6.toString()));
            return str;
        }
    }

    private final void f(com.google.android.gms.internal.ads.MN mn) {
        android.os.Bundle bundleA = this.f34720i.a();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25466X6)).booleanValue()) {
            bundleA.putLong(mn.e(), p174r3.v.c().a());
        }
    }

    private static final java.lang.String g(java.lang.String str) {
        try {
            return new org.json.JSONObject(str).optString("request_id", "");
        } catch (org.json.JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01c2 A[Catch: all -> 0x008d, TryCatch #4 {, blocks: (B:18:0x0051, B:20:0x006f, B:22:0x0077, B:24:0x008a, B:29:0x0092, B:32:0x009a, B:34:0x00a2, B:36:0x00a8, B:40:0x00b1, B:49:0x00e9, B:43:0x00c3, B:48:0x00d2, B:51:0x00ee, B:28:0x0090, B:52:0x0104, B:58:0x011a, B:61:0x0122, B:65:0x0146, B:67:0x015b, B:71:0x017e, B:73:0x0193, B:76:0x01a7, B:78:0x01ad, B:79:0x01ba, B:81:0x01bc, B:84:0x01c5, B:83:0x01c2, B:72:0x0188, B:68:0x016e, B:64:0x0130, B:56:0x010d, B:57:0x0112), top: B:117:0x0051, inners: #1, #3 }] */
    public final P4.d a() {
        java.lang.String strOptString;
        int i6;
        java.lang.Boolean bool;
        java.lang.String string;
        java.lang.String strB = this.f34715d.f37511d.f54175Z;
        if (!android.text.TextUtils.isEmpty(strB)) {
            java.lang.String strG = g(strB);
            com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25400R6;
            if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue() && strG.isEmpty()) {
                int iLastIndexOf = strB.lastIndexOf("&request_id=");
                strG = iLastIndexOf != -1 ? strB.substring(iLastIndexOf + 12) : "";
            }
            if (android.text.TextUtils.isEmpty(strG)) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.XV(15, "Invalid ad string."));
            }
            synchronized (this.f34721j) {
                B3.s0 s0VarV = this.f34712a.v();
                java.lang.String strB2 = s0VarV.b(strG, this.f34720i);
                java.lang.String str = null;
                if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
                    com.google.android.gms.internal.ads.YN yn = this.f34720i;
                    if (!android.text.TextUtils.isEmpty(strB2)) {
                        try {
                            bool = new org.json.JSONObject(strB2).optString("is_gbid").equals("true") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
                        } catch (org.json.JSONException unused) {
                        }
                        if (bool.booleanValue()) {
                            int iLastIndexOf2 = strB.lastIndexOf("&");
                            java.lang.String strSubstring = iLastIndexOf2 != -1 ? strB.substring(0, iLastIndexOf2) : null;
                            if (!android.text.TextUtils.isEmpty(strSubstring)) {
                                try {
                                    byte[] bArrDecode = android.util.Base64.decode(strSubstring, 11);
                                    byte[] bytes = strG.getBytes("UTF-8");
                                    if (android.text.TextUtils.isEmpty(strB2)) {
                                        string = null;
                                    } else {
                                        try {
                                            string = new org.json.JSONObject(strB2).getString("arek");
                                        } catch (org.json.JSONException e6) {
                                            p214v3.AbstractC7265q0.k("Failed to get key from QueryJSONMap".concat(e6.toString()));
                                            p174r3.v.s().x(e6, "CryptoUtils.getKeyFromQueryJsonMap");
                                            string = null;
                                        }
                                    }
                                    strB = com.google.android.gms.internal.ads.C70.b(bArrDecode, bytes, string, yn);
                                } catch (java.io.UnsupportedEncodingException e10) {
                                    p214v3.AbstractC7265q0.k("Failed to decode the adResponse. ".concat(e10.toString()));
                                    p174r3.v.s().x(e10, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                    }
                }
                if (android.text.TextUtils.isEmpty(strB)) {
                    strOptString = "";
                } else {
                    try {
                        strOptString = new org.json.JSONObject(strB).optString("render_id", "");
                    } catch (org.json.JSONException unused2) {
                        strOptString = "";
                    }
                }
                if (android.text.TextUtils.isEmpty(strOptString)) {
                    i6 = 0;
                } else {
                    java.lang.String str2 = "";
                    try {
                        str2 = new java.lang.String(android.util.Base64.decode(strOptString, 0), java.nio.charset.StandardCharsets.UTF_8);
                    } catch (java.lang.IllegalArgumentException e11) {
                        p214v3.AbstractC7265q0.k("Ad grouping: Has render_id, but not base64 encoded: ".concat(java.lang.String.valueOf(strOptString)));
                        p174r3.v.s().x(e11, "PreloadedLoader.decodeRenderId");
                    }
                    java.util.List listF = com.google.android.gms.internal.ads.C2755Qg0.b(com.google.android.gms.internal.ads.AbstractC4271kg0.c(':')).f(str2);
                    if (listF.size() == 2) {
                        str = (java.lang.String) listF.get(0);
                        i6 = java.lang.Integer.parseInt((java.lang.String) listF.get(1));
                    } else {
                        p214v3.AbstractC7265q0.k("Ad grouping: Has render_id, but invalid format: ".concat(java.lang.String.valueOf(strOptString)));
                        i6 = 0;
                    }
                }
                android.util.Pair pair = str != null ? new android.util.Pair(str, java.lang.Integer.valueOf(i6)) : new android.util.Pair("", 0);
                java.lang.String str3 = (java.lang.String) pair.first;
                int iIntValue = ((java.lang.Integer) pair.second).intValue();
                if (android.text.TextUtils.isEmpty(str3) || iIntValue <= 0) {
                    s0VarV.f(strG);
                } else {
                    if (s0VarV.h(strG, str3)) {
                        return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.XV(10, "The ad has already been shown."));
                    }
                    if (!s0VarV.g(strG, str3, iIntValue)) {
                        s0VarV.f(strG);
                    }
                }
                if (!android.text.TextUtils.isEmpty(strB2)) {
                    return d(strB, e(strB2));
                }
            }
        }
        p184s3.X x6 = this.f34715d.f37511d.f54170U;
        if (x6 != null) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25312J6)).booleanValue()) {
                java.lang.String str4 = x6.f54150C;
                java.lang.String str5 = x6.f54151D;
                java.lang.String strG2 = g(str4);
                java.lang.String strG3 = g(str5);
                if (android.text.TextUtils.isEmpty(strG3) || !strG2.equals(strG3)) {
                    this.f34720i.b().put("ridmm", "true");
                } else {
                    this.f34712a.v().f(strG2);
                    this.f34720i.b().put("request_id", strG2);
                }
            }
            return d(x6.f54150C, e(x6.f54151D));
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.XV(14, "Mismatch request IDs."));
    }

    final /* synthetic */ P4.d b(org.json.JSONObject jSONObject) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C3558e70(new com.google.android.gms.internal.ads.C3120a70(this.f34715d), com.google.android.gms.internal.ads.C3339c70.a(new java.io.StringReader(jSONObject.toString()), null)));
    }

    final /* synthetic */ java.lang.String c(com.google.android.gms.internal.ads.C4032iS c4032iS) throws com.google.android.gms.internal.ads.XV {
        f(com.google.android.gms.internal.ads.MN.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i6 = 0;
        int i10 = -1;
        while (true) {
            try {
                if (i6 >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25455W6)).intValue()) {
                    throw new com.google.android.gms.internal.ads.XV(1, "Received HTTP error code from ad server: " + i10);
                }
                com.google.android.gms.internal.ads.C4140jS c4140jSA = new com.google.android.gms.internal.ads.C4250kS(this.f34713b, this.f34714c.f56217C, this.f34722k, android.os.Binder.getCallingUid()).b(c4032iS);
                int i11 = c4140jSA.f36675a;
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25466X6)).booleanValue()) {
                    this.f34720i.c("fr", java.lang.String.valueOf(i6));
                }
                if (i11 == 200) {
                    f(com.google.android.gms.internal.ads.MN.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return c4140jSA.f36677c;
                }
                i6++;
                i10 = i11;
            } catch (java.lang.Exception e6) {
                throw new com.google.android.gms.internal.ads.XV(1, e6.getMessage() == null ? "Fetch failed." : e6.getMessage(), e6);
            }
        }
    }
}
