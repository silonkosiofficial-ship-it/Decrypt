package p174r3;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f53848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f53849b = 0;

    static final /* synthetic */ P4.d d(java.lang.Long l6, com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.T90 t90, com.google.android.gms.internal.ads.E90 e90, org.json.JSONObject jSONObject) throws org.json.JSONException {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            p174r3.v.s().j().u(jSONObject.getString("appSettingsJson"));
            if (l6 != null) {
                f(c3588eO, "cld_s", p174r3.v.c().c() - l6.longValue());
            }
        }
        e90.K0(zOptBoolean);
        t90.b(e90.m());
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(com.google.android.gms.internal.ads.C3588eO c3588eO, java.lang.String str, long j6) {
        if (c3588eO != null) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.zc)).booleanValue()) {
                com.google.android.gms.internal.ads.C3479dO c3479dOA = c3588eO.a();
                c3479dOA.b("action", "lat_init");
                c3479dOA.b(str, java.lang.Long.toString(j6));
                c3479dOA.g();
            }
        }
    }

    public final void a(android.content.Context context, p224w3.a aVar, java.lang.String str, java.lang.Runnable runnable, com.google.android.gms.internal.ads.T90 t90, com.google.android.gms.internal.ads.C3588eO c3588eO, java.lang.Long l6) {
        b(context, aVar, true, null, str, null, runnable, t90, c3588eO, l6);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0127 A[Catch: Exception -> 0x00b1, TryCatch #1 {Exception -> 0x00b1, blocks: (B:30:0x009e, B:33:0x00ad, B:39:0x00bf, B:40:0x00eb, B:42:0x00f3, B:44:0x00ff, B:47:0x010c, B:49:0x0127, B:51:0x012c, B:52:0x0136, B:55:0x014a, B:57:0x014e, B:46:0x0107, B:36:0x00b4), top: B:63:0x009e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x012c A[Catch: Exception -> 0x00b1, TryCatch #1 {Exception -> 0x00b1, blocks: (B:30:0x009e, B:33:0x00ad, B:39:0x00bf, B:40:0x00eb, B:42:0x00f3, B:44:0x00ff, B:47:0x010c, B:49:0x0127, B:51:0x012c, B:52:0x0136, B:55:0x014a, B:57:0x014e, B:46:0x0107, B:36:0x00b4), top: B:63:0x009e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014a A[Catch: Exception -> 0x00b1, TRY_ENTER, TryCatch #1 {Exception -> 0x00b1, blocks: (B:30:0x009e, B:33:0x00ad, B:39:0x00bf, B:40:0x00eb, B:42:0x00f3, B:44:0x00ff, B:47:0x010c, B:49:0x0127, B:51:0x012c, B:52:0x0136, B:55:0x014a, B:57:0x014e, B:46:0x0107, B:36:0x00b4), top: B:63:0x009e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x014e A[Catch: Exception -> 0x00b1, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b1, blocks: (B:30:0x009e, B:33:0x00ad, B:39:0x00bf, B:40:0x00eb, B:42:0x00f3, B:44:0x00ff, B:47:0x010c, B:49:0x0127, B:51:0x012c, B:52:0x0136, B:55:0x014a, B:57:0x014e, B:46:0x0107, B:36:0x00b4), top: B:63:0x009e, inners: #0 }] */
    final void b(android.content.Context context, p224w3.a aVar, boolean z6, com.google.android.gms.internal.ads.C2695Oq c2695Oq, java.lang.String str, java.lang.String str2, java.lang.Runnable runnable, final com.google.android.gms.internal.ads.T90 t90, final com.google.android.gms.internal.ads.C3588eO c3588eO, final java.lang.Long l6) {
        java.lang.String str3;
        java.lang.String str4;
        P4.d dVarC;
        com.google.android.gms.internal.ads.Yk0 yk0;
        P4.d dVarN;
        android.content.pm.ApplicationInfo applicationInfo;
        android.content.pm.PackageInfo packageInfoF;
        if (p174r3.v.c().c() - this.f53849b < 5000) {
            p224w3.p.g("Not retrying to fetch app settings");
            return;
        }
        this.f53849b = p174r3.v.c().c();
        if (c2695Oq != null && !android.text.TextUtils.isEmpty(c2695Oq.c())) {
            if (p174r3.v.c().a() - c2695Oq.a() <= ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25595j4)).longValue() && c2695Oq.i()) {
                return;
            }
        }
        if (context == null) {
            p224w3.p.g("Context not provided to fetch application settings");
            return;
        }
        if (android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isEmpty(str2)) {
            p224w3.p.g("App settings could not be fetched. Required parameters missing");
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f53848a = applicationContext;
        final com.google.android.gms.internal.ads.E90 e90A = com.google.android.gms.internal.ads.D90.a(context, 4);
        e90A.h();
        com.google.android.gms.internal.ads.C5599wl c5599wlA = p174r3.v.j().a(this.f53848a, aVar, t90);
        com.google.android.gms.internal.ads.InterfaceC4940ql interfaceC4940ql = com.google.android.gms.internal.ads.AbstractC5269tl.f39020b;
        com.google.android.gms.internal.ads.InterfaceC4390ll interfaceC4390llA = c5599wlA.a("google.afma.config.fetchAppSettings", interfaceC4940ql, interfaceC4940ql);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                if (android.text.TextUtils.isEmpty(str)) {
                    if (android.text.TextUtils.isEmpty(str2)) {
                        jSONObject.put("is_init", z6);
                        jSONObject.put("pn", context.getPackageName());
                        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25491a;
                        jSONObject.put("experiment_ids", android.text.TextUtils.join(",", p184s3.A.a().a()));
                        jSONObject.put("js", aVar.f56217C);
                        applicationInfo = this.f53848a.getApplicationInfo();
                        if (applicationInfo != null && (packageInfoF = W3.e.a(context).f(applicationInfo.packageName, 0)) != null) {
                            jSONObject.put("version", packageInfoF.versionCode);
                        }
                        dVarC = interfaceC4390llA.c(jSONObject);
                        com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0 = new com.google.android.gms.internal.ads.InterfaceC5268tk0(this) { // from class: r3.d
                            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                            public final P4.d b(java.lang.Object obj) {
                                return p174r3.f.d(l6, c3588eO, t90, e90A, (org.json.JSONObject) obj);
                            }
                        };
                        yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34801g;
                        dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVarC, interfaceC5268tk0, yk0);
                        if (runnable != null) {
                            dVarC.e(runnable, yk0);
                        }
                        if (l6 != null) {
                            dVarC.e(new java.lang.Runnable(this) { // from class: r3.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    p174r3.f.f(c3588eO, "cld_r", p174r3.v.c().c() - l6.longValue());
                                }
                            }, yk0);
                        }
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25236C7)).booleanValue()) {
                            com.google.android.gms.internal.ads.AbstractC3854gr.b(dVarN, "ConfigLoader.maybeFetchNewAppSettings");
                        } else {
                            com.google.android.gms.internal.ads.AbstractC3854gr.a(dVarN, "ConfigLoader.maybeFetchNewAppSettings");
                        }
                    }
                    str3 = "ad_unit_id";
                    str4 = str2;
                    p224w3.p.e("Error requesting application settings", e);
                    e90A.c(e);
                    e90A.K0(false);
                    t90.b(e90A.m());
                }
                str3 = "app_id";
                str4 = str;
                applicationInfo = this.f53848a.getApplicationInfo();
                if (applicationInfo != null) {
                    jSONObject.put("version", packageInfoF.versionCode);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                p214v3.AbstractC7265q0.k("Error fetching PackageInfo.");
            }
            jSONObject.put(str3, str4);
            jSONObject.put("is_init", z6);
            jSONObject.put("pn", context.getPackageName());
            com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf2 = com.google.android.gms.internal.ads.AbstractC2161Af.f25491a;
            jSONObject.put("experiment_ids", android.text.TextUtils.join(",", p184s3.A.a().a()));
            jSONObject.put("js", aVar.f56217C);
            dVarC = interfaceC4390llA.c(jSONObject);
            com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk1 = new com.google.android.gms.internal.ads.InterfaceC5268tk0(this) { // from class: r3.d
                @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                public final P4.d b(java.lang.Object obj) {
                    return p174r3.f.d(l6, c3588eO, t90, e90A, (org.json.JSONObject) obj);
                }
            };
            yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34801g;
            dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVarC, interfaceC5268tk1, yk0);
            if (runnable != null) {
                dVarC.e(runnable, yk0);
            }
            if (l6 != null) {
                dVarC.e(new java.lang.Runnable(this) { // from class: r3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        p174r3.f.f(c3588eO, "cld_r", p174r3.v.c().c() - l6.longValue());
                    }
                }, yk0);
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25236C7)).booleanValue()) {
                com.google.android.gms.internal.ads.AbstractC3854gr.b(dVarN, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                com.google.android.gms.internal.ads.AbstractC3854gr.a(dVarN, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (java.lang.Exception e6) {
            p224w3.p.e("Error requesting application settings", e6);
            e90A.c(e6);
            e90A.K0(false);
            t90.b(e90A.m());
        }
    }

    public final void c(android.content.Context context, p224w3.a aVar, java.lang.String str, com.google.android.gms.internal.ads.C2695Oq c2695Oq, com.google.android.gms.internal.ads.T90 t90) {
        b(context, aVar, false, c2695Oq, c2695Oq != null ? c2695Oq.b() : null, str, null, t90, null, null);
    }
}
