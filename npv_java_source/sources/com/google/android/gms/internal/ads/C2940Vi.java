package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2940Vi implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    C2940Vi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        float fFloatValue;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) map.get("args"));
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            android.content.SharedPreferences.Editor editorEdit = android.preference.PreferenceManager.getDefaultSharedPreferences(interfaceC2698Ot.getContext()).edit();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object obj2 = jSONObject.get(next);
                if (obj2 instanceof java.lang.Integer) {
                    editorEdit.putInt(next, ((java.lang.Integer) obj2).intValue());
                } else if (obj2 instanceof java.lang.Long) {
                    editorEdit.putLong(next, ((java.lang.Long) obj2).longValue());
                } else {
                    if (obj2 instanceof java.lang.Double) {
                        fFloatValue = ((java.lang.Double) obj2).floatValue();
                    } else if (obj2 instanceof java.lang.Float) {
                        fFloatValue = ((java.lang.Float) obj2).floatValue();
                    } else if (obj2 instanceof java.lang.Boolean) {
                        editorEdit.putBoolean(next, ((java.lang.Boolean) obj2).booleanValue());
                    } else if (obj2 instanceof java.lang.String) {
                        editorEdit.putString(next, (java.lang.String) obj2);
                    }
                    editorEdit.putFloat(next, fFloatValue);
                }
            }
            editorEdit.apply();
        } catch (org.json.JSONException e6) {
            p174r3.v.s().x(e6, "GMSG write local storage KV pairs handler");
        }
    }
}
