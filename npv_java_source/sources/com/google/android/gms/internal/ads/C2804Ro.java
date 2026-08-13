package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2804Ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f31350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f31351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f31352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f31355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f31356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final org.json.JSONObject f31357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.String f31358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f31359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f31360k;

    public C2804Ro(org.json.JSONObject jSONObject) {
        this.f31355f = jSONObject.optString("url");
        this.f31351b = jSONObject.optString("base_uri");
        this.f31352c = jSONObject.optString("post_parameters");
        this.f31353d = m(jSONObject.optString("drt_include"));
        this.f31354e = m(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        java.lang.String strOptString = jSONObject.optString("errors");
        this.f31350a = strOptString == null ? null : java.util.Arrays.asList(strOptString.split(","));
        this.f31356g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f31357h = jSONObjectOptJSONObject == null ? new org.json.JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f31358i = jSONObject.optString("pool_key");
        this.f31359j = l(jSONObject.optString("start_time")).longValue();
        this.f31360k = l(jSONObject.optString("end_time")).longValue();
    }

    private static java.lang.Long l(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return java.lang.Long.valueOf(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    private static boolean m(java.lang.String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }

    public final int a() {
        return this.f31356g;
    }

    public final long b() {
        return this.f31360k;
    }

    public final long c() {
        return this.f31359j;
    }

    public final java.lang.String d() {
        return this.f31351b;
    }

    public final java.lang.String e() {
        return this.f31358i;
    }

    public final java.lang.String f() {
        return this.f31352c;
    }

    public final java.lang.String g() {
        return this.f31355f;
    }

    public final java.util.List h() {
        return this.f31350a;
    }

    public final org.json.JSONObject i() {
        return this.f31357h;
    }

    public final boolean j() {
        return this.f31354e;
    }

    public final boolean k() {
        return this.f31353d;
    }
}
