package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public class SkuDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f24527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.json.JSONObject f24528b;

    public SkuDetails(java.lang.String str) {
        this.f24527a = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.f24528b = jSONObject;
        if (android.text.TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new java.lang.IllegalArgumentException("SKU cannot be empty.");
        }
        if (android.text.TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new java.lang.IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public java.lang.String a() {
        return this.f24528b.optString("price");
    }

    public java.lang.String b() {
        return this.f24528b.optString("productId");
    }

    public java.lang.String c() {
        return this.f24528b.optString("subscriptionPeriod");
    }

    public java.lang.String d() {
        return this.f24528b.optString("type");
    }

    public int e() {
        return this.f24528b.optInt("offer_type");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.billingclient.api.SkuDetails) {
            return android.text.TextUtils.equals(this.f24527a, ((com.android.billingclient.api.SkuDetails) obj).f24527a);
        }
        return false;
    }

    public java.lang.String f() {
        return this.f24528b.optString("offer_id");
    }

    public java.lang.String g() {
        java.lang.String strOptString = this.f24528b.optString("offerIdToken");
        return strOptString.isEmpty() ? this.f24528b.optString("offer_id_token") : strOptString;
    }

    public final java.lang.String h() {
        return this.f24528b.optString("packageName");
    }

    public int hashCode() {
        return this.f24527a.hashCode();
    }

    public java.lang.String i() {
        return this.f24528b.optString("serializedDocid");
    }

    final java.lang.String j() {
        return this.f24528b.optString("skuDetailsToken");
    }

    public java.lang.String toString() {
        return "SkuDetails: ".concat(java.lang.String.valueOf(this.f24527a));
    }
}
