package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3592eS implements com.google.android.gms.internal.ads.InterfaceC4720ol {
    C3592eS() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4720ol
    public final /* bridge */ /* synthetic */ org.json.JSONObject c(java.lang.Object obj) throws org.json.JSONException {
        com.google.android.gms.internal.ads.C3702fS c3702fS = (com.google.android.gms.internal.ads.C3702fS) obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25577h9)).booleanValue()) {
            jSONObject2.put("ad_request_url", c3702fS.f35347c.g());
            jSONObject2.put("ad_request_post_body", c3702fS.f35347c.f());
        }
        jSONObject2.put("base_url", c3702fS.f35347c.d());
        jSONObject2.put("signals", c3702fS.f35346b);
        jSONObject3.put("body", c3702fS.f35345a.f36677c);
        jSONObject3.put("headers", p184s3.C7147y.b().l(c3702fS.f35345a.f36676b));
        jSONObject3.put("response_code", c3702fS.f35345a.f36675a);
        jSONObject3.put("latency", c3702fS.f35345a.f36678d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", c3702fS.f35347c.i());
        return jSONObject;
    }
}
