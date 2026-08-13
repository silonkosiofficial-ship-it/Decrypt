package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2695Oq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.String f30566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f30567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f30568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.json.JSONObject f30569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f30570h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30572j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f30563a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f30564b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f30565c = new java.util.HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.List f30571i = new java.util.ArrayList();

    public C2695Oq(java.lang.String str, long j6) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONObject jSONObjectOptJSONObject2;
        org.json.JSONArray jSONArrayOptJSONArray;
        org.json.JSONObject jSONObjectOptJSONObject3;
        this.f30566d = "";
        this.f30570h = false;
        this.f30572j = false;
        this.f30567e = str;
        this.f30568f = j6;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f30569g = new org.json.JSONObject(str);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.zb)).booleanValue() && j()) {
                return;
            }
            if (this.f30569g.optInt("status", -1) != 1) {
                this.f30570h = false;
                p224w3.p.g("App settings could not be fetched successfully.");
                return;
            }
            this.f30570h = true;
            this.f30566d = this.f30569g.optString("app_id");
            org.json.JSONArray jSONArrayOptJSONArray2 = this.f30569g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i6 = 0; i6 < jSONArrayOptJSONArray2.length(); i6++) {
                    org.json.JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i6);
                    java.lang.String strOptString = jSONObject.optString("format");
                    java.lang.String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!android.text.TextUtils.isEmpty(strOptString) && !android.text.TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f30564b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f30565c.put(strOptString2, new com.google.android.gms.internal.ads.C2690Ol(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            org.json.JSONArray jSONArrayOptJSONArray3 = this.f30569g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray3.length(); i10++) {
                    this.f30563a.add(jSONArrayOptJSONArray3.optString(i10));
                }
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25301I6)).booleanValue() && (jSONObjectOptJSONObject2 = this.f30569g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    this.f30571i.add(jSONArrayOptJSONArray.get(i11).toString());
                }
            }
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.e6)).booleanValue() || (jSONObjectOptJSONObject = this.f30569g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f30572j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (org.json.JSONException e6) {
            p224w3.p.h("Exception occurred while processing app setting json", e6);
            p174r3.v.s().x(e6, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long a() {
        return this.f30568f;
    }

    public final java.lang.String b() {
        return this.f30566d;
    }

    public final java.lang.String c() {
        return this.f30567e;
    }

    public final java.util.List d() {
        return this.f30571i;
    }

    public final java.util.Map e() {
        return this.f30565c;
    }

    public final org.json.JSONObject f() {
        return this.f30569g;
    }

    public final void g(long j6) {
        this.f30568f = j6;
    }

    public final boolean h() {
        return this.f30572j;
    }

    public final boolean i() {
        return this.f30570h;
    }

    public final boolean j() {
        if (!android.text.TextUtils.isEmpty(this.f30567e) && this.f30569g != null) {
            com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.Cb;
            long jLongValue = ((java.lang.Long) p184s3.A.c().a(abstractC5037rf)).longValue();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Bb)).booleanValue() && !android.text.TextUtils.isEmpty(this.f30567e)) {
                jLongValue = this.f30569g.optLong("cache_ttl_sec", ((java.lang.Long) p184s3.A.c().a(abstractC5037rf)).longValue());
            }
            long jA = p174r3.v.c().a();
            if (jLongValue >= 0) {
                long j6 = this.f30568f;
                if (j6 > jA || java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(jA - j6) > jLongValue) {
                    this.f30563a.clear();
                    this.f30564b.clear();
                    this.f30565c.clear();
                    this.f30566d = "";
                    this.f30567e = "";
                    this.f30569g = null;
                    this.f30570h = false;
                    this.f30571i.clear();
                    this.f30572j = false;
                    return true;
                }
            }
        }
        return false;
    }
}
