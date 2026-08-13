package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class W60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f32684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f32685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f32686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final org.json.JSONObject f32687d;

    W60(android.util.JsonReader jsonReader) {
        org.json.JSONObject jSONObjectI = p214v3.V.i(jsonReader);
        this.f32687d = jSONObjectI;
        this.f32684a = jSONObjectI.optString("ad_html", null);
        this.f32685b = jSONObjectI.optString("ad_base_url", null);
        this.f32686c = jSONObjectI.optJSONObject("ad_json");
    }
}
