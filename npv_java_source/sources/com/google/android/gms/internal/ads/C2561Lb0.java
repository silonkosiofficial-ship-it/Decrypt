package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2561Lb0 implements G2.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2634Nb0 f29528a;

    C2561Lb0(com.google.android.gms.internal.ads.C2634Nb0 c2634Nb0) {
        this.f29528a = c2634Nb0;
    }

    @Override // G2.e.a
    public final void a(android.webkit.WebView webView, G2.c cVar, android.net.Uri uri, boolean z6, G2.a aVar) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(cVar.b());
            java.lang.String string = jSONObject.getString("method");
            java.lang.String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                com.google.android.gms.internal.ads.C2634Nb0.e(this.f29528a, string2);
            } else if (string.equals("finishSession")) {
                com.google.android.gms.internal.ads.C2634Nb0.c(this.f29528a, string2);
            } else {
                com.google.android.gms.internal.ads.AbstractC5800yb0.f40106a.booleanValue();
            }
        } catch (org.json.JSONException e6) {
            com.google.android.gms.internal.ads.AbstractC5362uc0.a("Error parsing JS message in JavaScriptSessionService.", e6);
        }
    }
}
