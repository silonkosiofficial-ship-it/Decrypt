package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2976Wi implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    C2976Wi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.lang.String) map.get("args"));
            android.content.SharedPreferences.Editor editorEdit = android.preference.PreferenceManager.getDefaultSharedPreferences(interfaceC2698Ot.getContext()).edit();
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                editorEdit.remove(jSONArray.getString(i6));
            }
            editorEdit.apply();
        } catch (org.json.JSONException e6) {
            p174r3.v.s().x(e6, "GMSG clear local storage keys handler");
        }
    }
}
