package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class XM {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.json.JSONObject f33123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f33124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.json.JSONObject f33126e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f33122a = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f33127f = new java.util.concurrent.atomic.AtomicBoolean(false);

    public XM(java.util.concurrent.Executor executor) {
        this.f33124c = executor;
    }

    private final void g() {
        if (this.f33127f.getAndSet(true)) {
            return;
        }
        p174r3.v.s().j().w(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.VM
            @Override // java.lang.Runnable
            public final void run() {
                this.f32492C.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized void e() {
        org.json.JSONObject jSONObjectF;
        java.util.Map map;
        try {
            this.f33125d = true;
            com.google.android.gms.internal.ads.C2695Oq c2695OqI = p174r3.v.s().j().i();
            if (c2695OqI != null && (jSONObjectF = c2695OqI.f()) != null) {
                this.f33123b = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25551f4)).booleanValue() ? jSONObjectF.optJSONObject("common_settings") : null;
                this.f33126e = jSONObjectF.optJSONObject("ad_unit_patterns");
                org.json.JSONArray jSONArrayOptJSONArray = jSONObjectF.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                        org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i6);
                        if (jSONObjectOptJSONObject != null) {
                            java.lang.String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                if (this.f33122a.containsKey(strOptString2)) {
                                    map = (java.util.Map) this.f33122a.get(strOptString2);
                                } else {
                                    j$.util.concurrent.ConcurrentHashMap concurrentHashMap = new j$.util.concurrent.ConcurrentHashMap();
                                    this.f33122a.put(strOptString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final org.json.JSONObject a() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25551f4)).booleanValue()) {
            return this.f33123b;
        }
        return null;
    }

    public final org.json.JSONObject b(java.lang.String str, java.lang.String str2) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25529d4)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f33125d) {
            e();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25540e4)).booleanValue()) {
                g();
            }
        }
        java.util.Map map = (java.util.Map) this.f33122a.get(str2);
        if (map == null) {
            return null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        java.lang.String strA = com.google.android.gms.internal.ads.ZM.a(this.f33126e, str, str2);
        if (strA != null) {
            return (org.json.JSONObject) map.get(strA);
        }
        return null;
    }

    public final void d() {
        g();
        this.f33124c.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.UM
            @Override // java.lang.Runnable
            public final void run() {
                this.f32200C.e();
            }
        });
    }

    final /* synthetic */ void f() {
        this.f33124c.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.WM
            @Override // java.lang.Runnable
            public final void run() {
                this.f32728C.e();
            }
        });
    }
}
