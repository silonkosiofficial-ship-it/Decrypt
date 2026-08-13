package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class LO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Long f29485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f29486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f29487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Integer f29488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f29489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.Integer f29490f;

    /* synthetic */ LO(java.lang.String str, com.google.android.gms.internal.ads.MO mo) {
        this.f29486b = str;
    }

    static /* bridge */ /* synthetic */ java.lang.String a(com.google.android.gms.internal.ads.LO lo) {
        java.lang.String str = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25403R9);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("objectId", lo.f29485a);
            jSONObject.put("eventCategory", lo.f29486b);
            jSONObject.putOpt("event", lo.f29487c);
            jSONObject.putOpt("errorCode", lo.f29488d);
            jSONObject.putOpt("rewardType", lo.f29489e);
            jSONObject.putOpt("rewardAmount", lo.f29490f);
        } catch (org.json.JSONException unused) {
            p224w3.p.g("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
