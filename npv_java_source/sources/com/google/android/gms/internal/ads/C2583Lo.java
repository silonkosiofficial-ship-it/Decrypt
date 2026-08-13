package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2583Lo extends com.google.android.gms.internal.ads.AbstractC2509Jo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f29567a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f29568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.content.SharedPreferences f29569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4390ll f29570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p224w3.a f29571e;

    public C2583Lo(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC4390ll interfaceC4390ll, p224w3.a aVar) {
        this.f29568b = context.getApplicationContext();
        this.f29571e = aVar;
        this.f29570d = interfaceC4390ll;
    }

    public static org.json.JSONObject c(android.content.Context context, p224w3.a aVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2237Cg.f26273b.e()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.f56217C);
            jSONObject.put("mf", com.google.android.gms.internal.ads.AbstractC2237Cg.f26274c.e());
            jSONObject.put("cl", "697668803");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", com.google.android.gms.dynamite.DynamiteModule.c(context, "com.google.android.gms.ads.dynamite"));
            jSONObject.put("container_version", 12451000);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2509Jo
    public final P4.d a() {
        synchronized (this.f29567a) {
            try {
                if (this.f29569c == null) {
                    this.f29569c = this.f29568b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        android.content.SharedPreferences sharedPreferences = this.f29569c;
        if (p174r3.v.c().a() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2237Cg.f26275d.e()).longValue()) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(this.f29570d.c(c(this.f29568b, this.f29571e)), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.Ko
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                this.f29009a.b((org.json.JSONObject) obj);
                return null;
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }

    final /* synthetic */ java.lang.Void b(org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25491a;
        p184s3.A.b();
        android.content.SharedPreferences sharedPreferencesA = com.google.android.gms.internal.ads.C5257tf.a(this.f29568b);
        if (sharedPreferencesA == null) {
            return null;
        }
        android.content.SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        p184s3.A.a();
        int i6 = com.google.android.gms.internal.ads.AbstractC5149sg.f38786a;
        p184s3.A.a().e(editorEdit, 1, jSONObject);
        p184s3.A.b();
        editorEdit.commit();
        android.content.SharedPreferences sharedPreferences = this.f29569c;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", p174r3.v.c().a()).apply();
        return null;
    }
}
