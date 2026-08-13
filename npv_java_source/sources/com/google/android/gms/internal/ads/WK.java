package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class WK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f32716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RK f32717b;

    public WK(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.RK rk) {
        this.f32716a = executor;
        this.f32717b = rk;
    }

    public final P4.d a(org.json.JSONObject jSONObject, java.lang.String str) {
        final java.lang.String strOptString;
        P4.d dVarM;
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(java.util.Collections.emptyList());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i6);
            com.google.android.gms.internal.ads.VK vk = null;
            if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("name")) == null) {
                dVarM = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(vk);
            } else {
                java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("type");
                if ("string".equals(strOptString2)) {
                    vk = new com.google.android.gms.internal.ads.VK(strOptString, jSONObjectOptJSONObject.optString("string_value"));
                } else if ("image".equals(strOptString2)) {
                    dVarM = com.google.android.gms.internal.ads.AbstractC2652Nk0.m(this.f32717b.e(jSONObjectOptJSONObject, "image_value"), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.TK
                        @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return new com.google.android.gms.internal.ads.VK(strOptString, (com.google.android.gms.internal.ads.BinderC3286bh) obj);
                        }
                    }, this.f32716a);
                }
                dVarM = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(vk);
            }
            arrayList.add(dVarM);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(com.google.android.gms.internal.ads.AbstractC2652Nk0.d(arrayList), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.UK
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.google.android.gms.internal.ads.VK vk2 : (java.util.List) obj) {
                    if (vk2 != null) {
                        arrayList2.add(vk2);
                    }
                }
                return arrayList2;
            }
        }, this.f32716a);
    }
}
