package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f24524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f24525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.json.JSONObject f24526c;

    public Purchase(java.lang.String str, java.lang.String str2) {
        this.f24524a = str;
        this.f24525b = str2;
        this.f24526c = new org.json.JSONObject(str);
    }

    private final java.util.ArrayList g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f24526c.has("productIds")) {
            org.json.JSONArray jSONArrayOptJSONArray = this.f24526c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i6));
                }
            }
        } else if (this.f24526c.has("productId")) {
            arrayList.add(this.f24526c.optString("productId"));
        }
        return arrayList;
    }

    public java.lang.String a() {
        return this.f24524a;
    }

    public java.util.List b() {
        return g();
    }

    public int c() {
        return this.f24526c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public java.lang.String d() {
        org.json.JSONObject jSONObject = this.f24526c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public java.lang.String e() {
        return this.f24525b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.android.billingclient.api.Purchase)) {
            return false;
        }
        com.android.billingclient.api.Purchase purchase = (com.android.billingclient.api.Purchase) obj;
        return android.text.TextUtils.equals(this.f24524a, purchase.a()) && android.text.TextUtils.equals(this.f24525b, purchase.e());
    }

    public boolean f() {
        return this.f24526c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f24524a.hashCode();
    }

    public java.lang.String toString() {
        return "Purchase. Json: ".concat(java.lang.String.valueOf(this.f24524a));
    }
}
