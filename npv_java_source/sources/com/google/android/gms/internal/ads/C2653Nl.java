package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2653Nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f30369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f30370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f30371c;

    public C2653Nl(org.json.JSONObject jSONObject) throws org.json.JSONException {
        jSONObject.optString("id");
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            arrayList.add(jSONArray.getString(i6));
        }
        this.f30369a = j$.util.DesugarCollections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        p174r3.v.k();
        com.google.android.gms.internal.ads.C2727Pl.a(jSONObject, "clickurl");
        p174r3.v.k();
        com.google.android.gms.internal.ads.C2727Pl.a(jSONObject, "imp_urls");
        p174r3.v.k();
        com.google.android.gms.internal.ads.C2727Pl.a(jSONObject, "downloaded_imp_urls");
        p174r3.v.k();
        com.google.android.gms.internal.ads.C2727Pl.a(jSONObject, "fill_urls");
        p174r3.v.k();
        com.google.android.gms.internal.ads.C2727Pl.a(jSONObject, "video_start_urls");
        p174r3.v.k();
        com.google.android.gms.internal.ads.C2727Pl.a(jSONObject, "video_complete_urls");
        p174r3.v.k();
        com.google.android.gms.internal.ads.C2727Pl.a(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            p174r3.v.k();
            com.google.android.gms.internal.ads.C2727Pl.a(jSONObjectOptJSONObject, "manual_impression_urls");
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f30370b = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        org.json.JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        p174r3.v.k();
        com.google.android.gms.internal.ads.C2727Pl.a(jSONObject, "template_ids");
        org.json.JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.f30371c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
