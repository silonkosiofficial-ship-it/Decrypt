package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2690Ol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f30557a;

    public C2690Ol(org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (p224w3.p.j(2)) {
            p214v3.AbstractC7265q0.k("Mediation Response JSON: ".concat(java.lang.String.valueOf(jSONObject.toString(2))));
        }
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        int i6 = -1;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                com.google.android.gms.internal.ads.C2653Nl c2653Nl = new com.google.android.gms.internal.ads.C2653Nl(jSONArray.getJSONObject(i10));
                "banner".equalsIgnoreCase(c2653Nl.f30371c);
                arrayList.add(c2653Nl);
                if (i6 < 0) {
                    java.util.Iterator it = c2653Nl.f30369a.iterator();
                    while (it.hasNext()) {
                        if (((java.lang.String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            i6 = i10;
                            break;
                        }
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        jSONArray.length();
        this.f30557a = j$.util.DesugarCollections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            p174r3.v.k();
            com.google.android.gms.internal.ads.C2727Pl.a(jSONObjectOptJSONObject, "click_urls");
            p174r3.v.k();
            com.google.android.gms.internal.ads.C2727Pl.a(jSONObjectOptJSONObject, "imp_urls");
            p174r3.v.k();
            com.google.android.gms.internal.ads.C2727Pl.a(jSONObjectOptJSONObject, "downloaded_imp_urls");
            p174r3.v.k();
            com.google.android.gms.internal.ads.C2727Pl.a(jSONObjectOptJSONObject, "nofill_urls");
            p174r3.v.k();
            com.google.android.gms.internal.ads.C2727Pl.a(jSONObjectOptJSONObject, "remote_ping_urls");
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong("refresh", -1L);
            com.google.android.gms.internal.ads.C4728op.e(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
