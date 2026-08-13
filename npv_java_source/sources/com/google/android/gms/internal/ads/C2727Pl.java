package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2727Pl {
    public static final java.util.List a(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArrayOptJSONArray.length());
        for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i6));
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }
}
