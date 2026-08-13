package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4805pX {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f38016a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f38017b = new java.util.HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f38018c = new java.util.HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f38019d = new java.util.HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Map f38020e = new java.util.HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.Executor f38021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.json.JSONObject f38022g;

    C4805pX(java.util.concurrent.Executor executor) {
        this.f38021f = executor;
    }

    private final synchronized com.google.android.gms.internal.ads.AbstractC3727fi0 h(java.lang.String str) {
        java.util.HashMap map;
        try {
            if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(p174r3.v.s().j().i().c())) {
                boolean zMatches = java.util.regex.Pattern.matches((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25635n3), str);
                boolean zMatches2 = java.util.regex.Pattern.matches((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25645o3), str);
                if (zMatches) {
                    map = new java.util.HashMap(this.f38020e);
                } else if (zMatches2) {
                    map = new java.util.HashMap(this.f38019d);
                }
                return com.google.android.gms.internal.ads.AbstractC3727fi0.c(map);
            }
            return com.google.android.gms.internal.ads.AbstractC3727fi0.d();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized java.util.List i(org.json.JSONObject jSONObject, java.lang.String str) {
        java.util.ArrayList arrayList;
        try {
            arrayList = new java.util.ArrayList();
            if (jSONObject != null) {
                android.os.Bundle bundleO = o(jSONObject.optJSONObject("data"));
                org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                        java.lang.String strOptString = jSONArrayOptJSONArray.optString(i6, "");
                        if (!android.text.TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        java.lang.String str2 = (java.lang.String) arrayList2.get(i10);
                        g(str2);
                        if (((com.google.android.gms.internal.ads.C5024rX) this.f38016a.get(str2)) != null) {
                            arrayList.add(new com.google.android.gms.internal.ads.C5024rX(str2, str, bundleO));
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void j() {
        this.f38017b.clear();
        this.f38016a.clear();
        this.f38020e.clear();
        this.f38019d.clear();
        m();
        n();
        k();
    }

    private final synchronized void k() {
        org.json.JSONObject jSONObjectF;
        java.util.Map map;
        try {
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2459Ig.f28488b.e()).booleanValue()) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25428U1)).booleanValue() && (jSONObjectF = p174r3.v.s().j().i().f()) != null) {
                    try {
                        org.json.JSONArray jSONArray = jSONObjectF.getJSONArray("adapter_settings");
                        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i6);
                            java.lang.String strOptString = jSONObject.optString("adapter_class_name");
                            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                            if (!android.text.TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                    org.json.JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                                    boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                    boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                    boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                    java.lang.String strOptString2 = jSONObject2.optString("platform");
                                    com.google.android.gms.internal.ads.C5244tX c5244tX = new com.google.android.gms.internal.ads.C5244tX(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new android.os.Bundle());
                                    if (strOptString2.equals("ADMOB")) {
                                        map = this.f38019d;
                                    } else {
                                        if (strOptString2.equals("AD_MANAGER")) {
                                            map = this.f38020e;
                                        }
                                    }
                                    map.put(strOptString, c5244tX);
                                }
                            }
                        }
                    } catch (org.json.JSONException e6) {
                        p214v3.AbstractC7265q0.l("Malformed config loading JSON.", e6);
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized void l(java.lang.String str, java.lang.String str2, java.util.List list) {
        try {
            if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
                return;
            }
            java.util.Map map = (java.util.Map) this.f38018c.get(str);
            if (map == null) {
                map = new java.util.HashMap();
            }
            this.f38018c.put(str, map);
            java.util.List arrayList = (java.util.List) map.get(str2);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            arrayList.addAll(list);
            map.put(str2, arrayList);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized void m() {
        org.json.JSONArray jSONArrayOptJSONArray;
        try {
            org.json.JSONObject jSONObjectF = p174r3.v.s().j().i().f();
            if (jSONObjectF != null) {
                try {
                    org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectF.optJSONArray("ad_unit_id_settings");
                    this.f38022g = jSONObjectF.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i6 = 0; i6 < jSONArrayOptJSONArray2.length(); i6++) {
                            org.json.JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i6);
                            java.lang.String lowerCase = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Na)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(java.util.Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            java.lang.String strOptString = jSONObject.optString("format", "");
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                    arrayList.addAll(i(jSONArrayOptJSONArray.getJSONObject(i10), strOptString));
                                }
                            }
                            l(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (org.json.JSONException e6) {
                    p214v3.AbstractC7265q0.l("Malformed config loading JSON.", e6);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized void n() {
        org.json.JSONObject jSONObjectF;
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2459Ig.f28491e.e()).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25417T1)).booleanValue() && (jSONObjectF = p174r3.v.s().j().i().f()) != null) {
                try {
                    org.json.JSONArray jSONArray = jSONObjectF.getJSONArray("signal_adapters");
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i6);
                        android.os.Bundle bundleO = o(jSONObject.optJSONObject("data"));
                        java.lang.String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!android.text.TextUtils.isEmpty(strOptString)) {
                            this.f38017b.put(strOptString, new com.google.android.gms.internal.ads.C5244tX(strOptString, zOptBoolean2, zOptBoolean, true, bundleO));
                        }
                    }
                } catch (org.json.JSONException e6) {
                    p214v3.AbstractC7265q0.l("Malformed config loading JSON.", e6);
                }
            }
        }
    }

    private static final android.os.Bundle o(org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized java.util.Map a(java.lang.String str, java.lang.String str2) {
        java.util.HashMap map;
        try {
            java.util.Map mapB = b(str, str2);
            com.google.android.gms.internal.ads.AbstractC3727fi0 abstractC3727fi0H = h(str2);
            map = new java.util.HashMap();
            for (java.util.Map.Entry entry : ((com.google.android.gms.internal.ads.AbstractC3727fi0) mapB).entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                if (abstractC3727fi0H.containsKey(str3)) {
                    com.google.android.gms.internal.ads.C5244tX c5244tX = (com.google.android.gms.internal.ads.C5244tX) abstractC3727fi0H.get(str3);
                    java.util.List list = (java.util.List) entry.getValue();
                    map.put(str3, new com.google.android.gms.internal.ads.C5244tX(str3, c5244tX.f38961b, c5244tX.f38962c, c5244tX.f38963d, (list == null || list.isEmpty()) ? new android.os.Bundle() : (android.os.Bundle) list.get(0)));
                }
            }
            com.google.android.gms.internal.ads.AbstractC4167jj0 abstractC4167jj0N = abstractC3727fi0H.entrySet().n();
            while (abstractC4167jj0N.hasNext()) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) abstractC4167jj0N.next();
                java.lang.String str4 = (java.lang.String) entry2.getKey();
                if (!map.containsKey(str4) && ((com.google.android.gms.internal.ads.C5244tX) entry2.getValue()).f38963d) {
                    map.put(str4, (com.google.android.gms.internal.ads.C5244tX) entry2.getValue());
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return map;
    }

    public final synchronized java.util.Map b(java.lang.String str, java.lang.String str2) {
        java.util.Map map;
        try {
            if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(p174r3.v.s().j().i().c()) && (map = (java.util.Map) this.f38018c.get(str)) != null) {
                java.util.List<com.google.android.gms.internal.ads.C5024rX> list = (java.util.List) map.get(str2);
                if (list == null) {
                    java.lang.String strA = com.google.android.gms.internal.ads.ZM.a(this.f38022g, str2, str);
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Na)).booleanValue()) {
                        strA = strA.toLowerCase(java.util.Locale.ROOT);
                    }
                    list = (java.util.List) map.get(strA);
                }
                if (list != null) {
                    java.util.HashMap map2 = new java.util.HashMap();
                    for (com.google.android.gms.internal.ads.C5024rX c5024rX : list) {
                        java.lang.String str3 = c5024rX.f38500a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new java.util.ArrayList());
                        }
                        ((java.util.List) map2.get(str3)).add(c5024rX.f38501b);
                    }
                    return com.google.android.gms.internal.ads.AbstractC3727fi0.c(map2);
                }
            }
            return com.google.android.gms.internal.ads.AbstractC3727fi0.d();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized java.util.Map c() {
        if (android.text.TextUtils.isEmpty(p174r3.v.s().j().i().c())) {
            return com.google.android.gms.internal.ads.AbstractC3727fi0.d();
        }
        return com.google.android.gms.internal.ads.AbstractC3727fi0.c(this.f38017b);
    }

    public final void e() {
        p174r3.v.s().j().w(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.oX
            @Override // java.lang.Runnable
            public final void run() {
                this.f37832C.f();
            }
        });
        this.f38021f.execute(new com.google.android.gms.internal.ads.RunnableC4585nX(this));
    }

    final /* synthetic */ void f() {
        this.f38021f.execute(new com.google.android.gms.internal.ads.RunnableC4585nX(this));
    }

    public final synchronized void g(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && !this.f38016a.containsKey(str)) {
            this.f38016a.put(str, new com.google.android.gms.internal.ads.C5024rX(str, "", new android.os.Bundle()));
        }
    }
}
