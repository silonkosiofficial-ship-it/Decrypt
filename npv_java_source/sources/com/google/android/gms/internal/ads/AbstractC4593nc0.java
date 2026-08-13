package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4593nc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f37623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2710Pc0 f37624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f37625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37626d;

    public AbstractC4593nc0(java.lang.String str) {
        b();
        this.f37623a = str;
        this.f37624b = new com.google.android.gms.internal.ads.C2710Pc0(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.webkit.WebView a() {
        return (android.webkit.WebView) this.f37624b.get();
    }

    public final void b() {
        this.f37625c = java.lang.System.nanoTime();
        this.f37626d = 1;
    }

    public void c() {
        this.f37624b.clear();
    }

    public final void d(java.lang.String str, long j6) {
        if (j6 < this.f37625c || this.f37626d == 3) {
            return;
        }
        this.f37626d = 3;
        com.google.android.gms.internal.ads.C3496dc0.a().h(a(), this.f37623a, str);
    }

    public final void e() {
        com.google.android.gms.internal.ads.C3496dc0.a().c(a(), this.f37623a);
    }

    public final void f(com.google.android.gms.internal.ads.C2228Cb0 c2228Cb0) {
        com.google.android.gms.internal.ads.C3496dc0.a().d(a(), this.f37623a, c2228Cb0.b());
    }

    public final void g(java.util.Date date) {
        if (date == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject, "timestamp", java.lang.Long.valueOf(date.getTime()));
        com.google.android.gms.internal.ads.C3496dc0.a().f(a(), jSONObject);
    }

    public final void h(java.lang.String str, long j6) {
        if (j6 >= this.f37625c) {
            this.f37626d = 2;
            com.google.android.gms.internal.ads.C3496dc0.a().h(a(), this.f37623a, str);
        }
    }

    public void i(com.google.android.gms.internal.ads.C2339Fb0 c2339Fb0, com.google.android.gms.internal.ads.C2265Db0 c2265Db0) {
        j(c2339Fb0, c2265Db0, null);
    }

    protected final void j(com.google.android.gms.internal.ads.C2339Fb0 c2339Fb0, com.google.android.gms.internal.ads.C2265Db0 c2265Db0, org.json.JSONObject jSONObject) {
        java.lang.String strH = c2339Fb0.h();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject2, "environment", "app");
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject2, "adSessionType", c2265Db0.d());
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject3, "deviceType", android.os.Build.MANUFACTURER + "; " + android.os.Build.MODEL);
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject3, "osVersion", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject3, "os", "Android");
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject2, "deviceInfo", jSONObject3);
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject2, "deviceCategory", com.google.android.gms.internal.ads.AbstractC5142sc0.a().toString());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject2, "supports", jSONArray);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject4, "partnerName", c2265Db0.e().b());
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject4, "partnerVersion", c2265Db0.e().c());
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject2, "omidNativeInfo", jSONObject4);
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject5, "appId", com.google.android.gms.internal.ads.C3277bc0.b().a().getApplicationContext().getPackageName());
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject2, "app", jSONObject5);
        if (c2265Db0.f() != null) {
            com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject2, "contentUrl", c2265Db0.f());
        }
        if (c2265Db0.g() != null) {
            com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject2, "customReferenceData", c2265Db0.g());
        }
        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
        java.util.Iterator it = c2265Db0.h().iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            throw null;
        }
        com.google.android.gms.internal.ads.C3496dc0.a().j(a(), strH, jSONObject2, jSONObject6, jSONObject);
    }

    public final void k(boolean z6) {
        if (p()) {
            com.google.android.gms.internal.ads.C3496dc0.a().i(a(), this.f37623a, true != z6 ? "backgrounded" : "foregrounded");
        }
    }

    public final void l(float f6) {
        com.google.android.gms.internal.ads.C3496dc0.a().e(a(), this.f37623a, f6);
    }

    public final void m(boolean z6) {
        if (p()) {
            com.google.android.gms.internal.ads.C3496dc0.a().g(a(), this.f37623a, true != z6 ? "unlocked" : "locked");
        }
    }

    final void n(android.webkit.WebView webView) {
        this.f37624b = new com.google.android.gms.internal.ads.C2710Pc0(webView);
    }

    public void o() {
    }

    public final boolean p() {
        return this.f37624b.get() != 0;
    }
}
