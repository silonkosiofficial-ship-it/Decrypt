package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3728fj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35396a = new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.Ci
        @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
        public final void a(java.lang.Object obj, java.util.Map map) {
            com.google.android.gms.internal.ads.InterfaceC5947zu interfaceC5947zu = (com.google.android.gms.internal.ads.InterfaceC5947zu) obj;
            com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj = com.google.android.gms.internal.ads.AbstractC3728fj.f35396a;
            java.lang.String str = (java.lang.String) map.get("urls");
            if (android.text.TextUtils.isEmpty(str)) {
                p224w3.p.g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            java.lang.String[] strArrSplit = str.split(",");
            java.util.HashMap map2 = new java.util.HashMap();
            android.content.pm.PackageManager packageManager = interfaceC5947zu.getContext().getPackageManager();
            for (java.lang.String str2 : strArrSplit) {
                java.lang.String[] strArrSplit2 = str2.split(";", 2);
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(packageManager.resolveActivity(new android.content.Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", android.net.Uri.parse(strArrSplit2[0].trim())), 65536) != null);
                map2.put(str2, boolValueOf);
                p214v3.AbstractC7265q0.k("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((com.google.android.gms.internal.ads.InterfaceC5817yk) interfaceC5947zu).O("openableURLs", map2);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35397b = new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.Ei
        @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
        public final void a(java.lang.Object obj, java.util.Map map) {
            com.google.android.gms.internal.ads.InterfaceC5947zu interfaceC5947zu = (com.google.android.gms.internal.ads.InterfaceC5947zu) obj;
            com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj = com.google.android.gms.internal.ads.AbstractC3728fj.f35396a;
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25543e8)).booleanValue()) {
                p224w3.p.g("canOpenAppGmsgHandler disabled.");
                return;
            }
            java.lang.String str = (java.lang.String) map.get("package_name");
            if (android.text.TextUtils.isEmpty(str)) {
                p224w3.p.g("Package name missing in canOpenApp GMSG.");
                return;
            }
            java.util.HashMap map2 = new java.util.HashMap();
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(interfaceC5947zu.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            p214v3.AbstractC7265q0.k("/canOpenApp;" + str + ";" + boolValueOf);
            ((com.google.android.gms.internal.ads.InterfaceC5817yk) interfaceC5947zu).O("openableApp", map2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35398c = new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.Hi
        @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
        public final void a(java.lang.Object obj, java.util.Map map) {
            com.google.android.gms.internal.ads.AbstractC3728fj.b((com.google.android.gms.internal.ads.InterfaceC5947zu) obj, map);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35399d = new com.google.android.gms.internal.ads.C3012Xi();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35400e = new com.google.android.gms.internal.ads.C3048Yi();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35401f = new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.Ii
        @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
        public final void a(java.lang.Object obj, java.util.Map map) {
            com.google.android.gms.internal.ads.InterfaceC5947zu interfaceC5947zu = (com.google.android.gms.internal.ads.InterfaceC5947zu) obj;
            com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj = com.google.android.gms.internal.ads.AbstractC3728fj.f35396a;
            java.lang.String str = (java.lang.String) map.get("u");
            if (str == null) {
                p224w3.p.g("URL missing from httpTrack GMSG.");
            } else {
                com.google.android.gms.internal.ads.InterfaceC2366Ft interfaceC2366Ft = (com.google.android.gms.internal.ads.InterfaceC2366Ft) interfaceC5947zu;
                new p214v3.Z(interfaceC5947zu.getContext(), ((com.google.android.gms.internal.ads.InterfaceC2404Gu) interfaceC5947zu).n().f56217C, str, null, interfaceC2366Ft.Q() != null ? interfaceC2366Ft.Q().f31207x0 : null).b();
            }
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35402g = new com.google.android.gms.internal.ads.C3084Zi();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35403h = new com.google.android.gms.internal.ads.C3180aj();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35404i = new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.Fi
        @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
        public final void a(java.lang.Object obj, java.util.Map map) {
            com.google.android.gms.internal.ads.InterfaceC2367Fu interfaceC2367Fu = (com.google.android.gms.internal.ads.InterfaceC2367Fu) obj;
            com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj = com.google.android.gms.internal.ads.AbstractC3728fj.f35396a;
            java.lang.String str = (java.lang.String) map.get("tx");
            java.lang.String str2 = (java.lang.String) map.get("ty");
            java.lang.String str3 = (java.lang.String) map.get("td");
            try {
                int i6 = java.lang.Integer.parseInt(str);
                int i10 = java.lang.Integer.parseInt(str2);
                int i11 = java.lang.Integer.parseInt(str3);
                com.google.android.gms.internal.ads.Z9 z9H = interfaceC2367Fu.H();
                if (z9H != null) {
                    z9H.c().g(i6, i10, i11);
                }
            } catch (java.lang.NumberFormatException unused) {
                p224w3.p.g("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35405j = new com.google.android.gms.internal.ads.C3290bj();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35406k = new com.google.android.gms.internal.ads.C3399cj();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35407l = new com.google.android.gms.internal.ads.C2402Gs();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35408m = new com.google.android.gms.internal.ads.C2439Hs();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35409n = new com.google.android.gms.internal.ads.C5813yi();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C5705xj f35410o = new com.google.android.gms.internal.ads.C5705xj();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35411p = new com.google.android.gms.internal.ads.C3509dj();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35412q = new com.google.android.gms.internal.ads.C3618ej();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35413r = new com.google.android.gms.internal.ads.C2500Ji();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35414s = new com.google.android.gms.internal.ads.C2537Ki();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35415t = new com.google.android.gms.internal.ads.C2574Li();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35416u = new com.google.android.gms.internal.ads.C2610Mi();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35417v = new com.google.android.gms.internal.ads.C2647Ni();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35418w = new com.google.android.gms.internal.ads.C2684Oi();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35419x = new com.google.android.gms.internal.ads.C2721Pi();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35420y = new com.google.android.gms.internal.ads.C2795Ri();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35421z = new com.google.android.gms.internal.ads.C2832Si();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35393A = new com.google.android.gms.internal.ads.C2868Ti();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35394B = new com.google.android.gms.internal.ads.C2940Vi();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC3838gj f35395C = new com.google.android.gms.internal.ads.C2976Wi();

    public static P4.d a(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.lang.String str) {
        android.net.Uri uriA = android.net.Uri.parse(str);
        try {
            com.google.android.gms.internal.ads.Z9 z9H = interfaceC2698Ot.H();
            com.google.android.gms.internal.ads.C4985r70 c4985r70A1 = interfaceC2698Ot.a1();
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Sb)).booleanValue() || c4985r70A1 == null) {
                if (z9H != null && z9H.f(uriA)) {
                    uriA = z9H.a(uriA, interfaceC2698Ot.getContext(), interfaceC2698Ot.N(), interfaceC2698Ot.h());
                }
            } else if (z9H != null && z9H.f(uriA)) {
                uriA = c4985r70A1.a(uriA, interfaceC2698Ot.getContext(), interfaceC2698Ot.N(), interfaceC2698Ot.h());
            }
        } catch (com.google.android.gms.internal.ads.C3162aa unused) {
            p224w3.p.g("Unable to append parameter to URL: ".concat(str));
        }
        java.util.Map map = new java.util.HashMap();
        if (interfaceC2698Ot.Q() != null) {
            map = interfaceC2698Ot.Q().f31205w0;
        }
        final java.lang.String strB = com.google.android.gms.internal.ads.AbstractC5059rq.b(uriA, interfaceC2698Ot.getContext(), map);
        long jLongValue = ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2200Bg.f26005e.e()).longValue();
        if (jLongValue <= 0 || jLongValue > 244410203) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(strB);
        }
        com.google.android.gms.internal.ads.AbstractC2283Dk0 abstractC2283Dk0D = com.google.android.gms.internal.ads.AbstractC2283Dk0.D(interfaceC2698Ot.o0());
        com.google.android.gms.internal.ads.InterfaceC4821pg0 interfaceC4821pg0 = new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.zi
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Throwable th = (java.lang.Throwable) obj;
                com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj = com.google.android.gms.internal.ads.AbstractC3728fj.f35396a;
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2200Bg.f26009i.e()).booleanValue()) {
                    return "failure_click_attok";
                }
                p174r3.v.s().x(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34801g;
        return (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.e((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.m((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.e(abstractC2283Dk0D, java.lang.Throwable.class, interfaceC4821pg0, yk0), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.Ai
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.String str2;
                java.lang.String str3;
                android.net.Uri uri;
                java.lang.String str4 = (java.lang.String) obj;
                com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj = com.google.android.gms.internal.ads.AbstractC3728fj.f35396a;
                java.lang.String strReplace = strB;
                if (str4 != null) {
                    if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2200Bg.f26006f.e()).booleanValue()) {
                        java.lang.String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        java.lang.String host = android.net.Uri.parse(strReplace).getHost();
                        for (int i6 = 0; i6 < 3; i6++) {
                            if (host.endsWith(strArr[i6])) {
                                str2 = (java.lang.String) com.google.android.gms.internal.ads.AbstractC2200Bg.f26001a.e();
                                str3 = (java.lang.String) com.google.android.gms.internal.ads.AbstractC2200Bg.f26002b.e();
                                if (!android.text.TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!android.text.TextUtils.isEmpty(str3)) {
                                    uri = android.net.Uri.parse(strReplace);
                                    if (!android.text.TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (java.lang.String) com.google.android.gms.internal.ads.AbstractC2200Bg.f26001a.e();
                        str3 = (java.lang.String) com.google.android.gms.internal.ads.AbstractC2200Bg.f26002b.e();
                        if (!android.text.TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!android.text.TextUtils.isEmpty(str3)) {
                            uri = android.net.Uri.parse(strReplace);
                            if (!android.text.TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, yk0), java.lang.Throwable.class, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.Bi
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Throwable th = (java.lang.Throwable) obj;
                com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj = com.google.android.gms.internal.ads.AbstractC3728fj.f35396a;
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2200Bg.f26009i.e()).booleanValue()) {
                    p174r3.v.s().x(th, "prepareClickUrl.attestation2");
                }
                return strB;
            }
        }, yk0);
    }

    static /* synthetic */ void b(com.google.android.gms.internal.ads.InterfaceC5947zu interfaceC5947zu, java.util.Map map) {
        org.json.JSONException jSONException;
        java.lang.String str;
        android.content.Intent uri;
        android.content.pm.PackageManager packageManager = interfaceC5947zu.getContext().getPackageManager();
        try {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONObject((java.lang.String) map.get("data")).getJSONArray("intents");
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    try {
                        org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i6);
                        java.lang.String strOptString = jSONObject2.optString("id");
                        java.lang.String strOptString2 = jSONObject2.optString("u");
                        java.lang.String strOptString3 = jSONObject2.optString("i");
                        java.lang.String strOptString4 = jSONObject2.optString("m");
                        java.lang.String strOptString5 = jSONObject2.optString("p");
                        java.lang.String strOptString6 = jSONObject2.optString("c");
                        java.lang.String strOptString7 = jSONObject2.optString("intent_url");
                        android.content.pm.ResolveInfo resolveInfoResolveActivity = null;
                        if (android.text.TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = android.content.Intent.parseUri(strOptString7, 0);
                            } catch (java.net.URISyntaxException e6) {
                                p224w3.p.e("Error parsing the url: ".concat(java.lang.String.valueOf(strOptString7)), e6);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new android.content.Intent();
                            if (!android.text.TextUtils.isEmpty(strOptString2)) {
                                uri.setData(android.net.Uri.parse(strOptString2));
                            }
                            if (!android.text.TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!android.text.TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!android.text.TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!android.text.TextUtils.isEmpty(strOptString6)) {
                                java.lang.String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new android.content.ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        android.content.Intent intent = uri;
                        try {
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (java.lang.NullPointerException e10) {
                            p174r3.v.s().x(e10, intent.toString());
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (org.json.JSONException e11) {
                            jSONException = e11;
                            str = "Error constructing openable urls response.";
                            p224w3.p.e(str, jSONException);
                        }
                    } catch (org.json.JSONException e12) {
                        jSONException = e12;
                        str = "Error parsing the intent data.";
                    }
                }
                ((com.google.android.gms.internal.ads.InterfaceC5817yk) interfaceC5947zu).a("openableIntents", jSONObject);
            } catch (org.json.JSONException unused) {
                ((com.google.android.gms.internal.ads.InterfaceC5817yk) interfaceC5947zu).a("openableIntents", new org.json.JSONObject());
            }
        } catch (org.json.JSONException unused2) {
            ((com.google.android.gms.internal.ads.InterfaceC5817yk) interfaceC5947zu).a("openableIntents", new org.json.JSONObject());
        }
    }

    public static void c(java.util.Map map, com.google.android.gms.internal.ads.MG mg) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ea)).booleanValue() && map.containsKey("sc") && ((java.lang.String) map.get("sc")).equals("1") && mg != null) {
            mg.p0();
        }
    }
}
