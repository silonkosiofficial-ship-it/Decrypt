package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class EP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f27036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f27037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f27038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f27040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f27041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f27042g;

    public EP(java.lang.String str, java.lang.String str2, java.lang.String str3, int i6, java.lang.String str4, int i10, boolean z6) {
        this.f27036a = str;
        this.f27037b = str2;
        this.f27038c = str3;
        this.f27039d = i6;
        this.f27040e = str4;
        this.f27041f = i10;
        this.f27042g = z6;
    }

    public final org.json.JSONObject a() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("adapterClassName", this.f27036a);
        jSONObject.put("version", this.f27038c);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25610k9)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f27037b);
        }
        jSONObject.put("status", this.f27039d);
        jSONObject.put("description", this.f27040e);
        jSONObject.put("initializationLatencyMillis", this.f27041f);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25620l9)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f27042g);
        }
        return jSONObject;
    }
}
