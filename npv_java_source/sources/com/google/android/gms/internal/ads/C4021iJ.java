package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4021iJ extends com.google.android.gms.internal.ads.C4129jJ {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.json.JSONObject f36263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f36265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f36266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f36267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f36268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final org.json.JSONObject f36269h;

    public C4021iJ(com.google.android.gms.internal.ads.R60 r60, org.json.JSONObject jSONObject) {
        super(r60);
        this.f36263b = p214v3.V.h(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f36264c = p214v3.V.l(false, jSONObject, "allow_pub_owned_ad_view");
        this.f36265d = p214v3.V.l(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f36266e = p214v3.V.l(false, jSONObject, "enable_omid");
        this.f36268g = p214v3.V.b("", jSONObject, "watermark_overlay_png_base64");
        this.f36267f = jSONObject.optJSONObject("overlay") != null;
        this.f36269h = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25596j5)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.C4129jJ
    public final com.google.android.gms.internal.ads.C4876q70 a() {
        org.json.JSONObject jSONObject = this.f36269h;
        return jSONObject != null ? new com.google.android.gms.internal.ads.C4876q70(jSONObject) : this.f36630a.f31155V;
    }

    @Override // com.google.android.gms.internal.ads.C4129jJ
    public final java.lang.String b() {
        return this.f36268g;
    }

    @Override // com.google.android.gms.internal.ads.C4129jJ
    public final org.json.JSONObject c() {
        org.json.JSONObject jSONObject = this.f36263b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new org.json.JSONObject(this.f36630a.f31210z);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.C4129jJ
    public final boolean d() {
        return this.f36266e;
    }

    @Override // com.google.android.gms.internal.ads.C4129jJ
    public final boolean e() {
        return this.f36264c;
    }

    @Override // com.google.android.gms.internal.ads.C4129jJ
    public final boolean f() {
        return this.f36265d;
    }

    @Override // com.google.android.gms.internal.ads.C4129jJ
    public final boolean g() {
        return this.f36267f;
    }
}
