package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F5.b f44214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f44215b = j$.util.DesugarCollections.synchronizedMap(new java.util.HashMap());

    public v(F5.b bVar) {
        this.f44214a = bVar;
    }

    public void a(java.lang.String str, com.google.firebase.remoteconfig.internal.g gVar) {
        org.json.JSONObject jSONObjectOptJSONObject;
        T4.a aVar = (T4.a) this.f44214a.get();
        if (aVar == null) {
            return;
        }
        org.json.JSONObject jSONObjectI = gVar.i();
        if (jSONObjectI.length() < 1) {
            return;
        }
        org.json.JSONObject jSONObjectG = gVar.g();
        if (jSONObjectG.length() >= 1 && (jSONObjectOptJSONObject = jSONObjectI.optJSONObject(str)) != null) {
            java.lang.String strOptString = jSONObjectOptJSONObject.optString("choiceId");
            if (strOptString.isEmpty()) {
                return;
            }
            synchronized (this.f44215b) {
                try {
                    if (strOptString.equals(this.f44215b.get(str))) {
                        return;
                    }
                    this.f44215b.put(str, strOptString);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", jSONObjectG.optString(str));
                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                    aVar.d("fp", "personalization_assignment", bundle);
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("_fpid", strOptString);
                    aVar.d("fp", "_fpc", bundle2);
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }
}
