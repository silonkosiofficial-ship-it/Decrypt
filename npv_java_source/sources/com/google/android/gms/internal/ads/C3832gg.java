package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3832gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f35653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B3.l0 f35654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B3.c0 f35655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4246kO f35656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.Runnable f35657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3503dg f35658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.browser.customtabs.f f35659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.lang.String f35660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f35661i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f35662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.json.JSONArray f35663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private android.content.Context f35664l;

    public C3832gg(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, B3.l0 l0Var, B3.c0 c0Var, com.google.android.gms.internal.ads.C4246kO c4246kO) {
        this.f35653a = scheduledExecutorService;
        this.f35654b = l0Var;
        this.f35655c = c0Var;
        this.f35656d = c4246kO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25326K9)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.dg r0 = r5.f35658f
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            p224w3.p.d(r0)
            return
        La:
            java.lang.Boolean r0 = r0.l()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r5.f35660h
            if (r0 == 0) goto L70
            androidx.browser.customtabs.f r0 = r5.f35659g
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r5.f35653a
            if (r0 == 0) goto L70
            long r0 = r5.f35661i
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L39
        L2a:
            V3.f r0 = p174r3.v.c()
            long r0 = r0.c()
            long r2 = r5.f35661i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L4b
        L39:
            com.google.android.gms.internal.ads.rf r0 = com.google.android.gms.internal.ads.AbstractC2161Af.f25326K9
            com.google.android.gms.internal.ads.yf r1 = p184s3.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
        L4b:
            androidx.browser.customtabs.f r0 = r5.f35659g
            java.lang.String r1 = r5.f35660h
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.h(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r5.f35653a
            java.lang.Runnable r1 = r5.f35657e
            com.google.android.gms.internal.ads.rf r2 = com.google.android.gms.internal.ads.AbstractC2161Af.f25337L9
            com.google.android.gms.internal.ads.yf r3 = p184s3.A.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L70:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            p214v3.AbstractC7265q0.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3832gg.j():void");
    }

    private final void k(org.json.JSONObject jSONObject) {
        try {
            if (this.f35663k == null) {
                this.f35663k = new org.json.JSONArray((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25359N9));
            }
            jSONObject.put("eids", this.f35663k);
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error fetching the PACT active eids JSON: ", e6);
        }
    }

    public final androidx.browser.customtabs.f b() {
        return this.f35659g;
    }

    final org.json.JSONObject c(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28091c.e()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2422Hg.f28094f.e()).longValue() : 0L);
        k(jSONObject);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28089a.e()).booleanValue()) {
            jSONObject.put("as", this.f35655c.a());
        }
        return jSONObject;
    }

    final org.json.JSONObject d(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28091c.e()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2422Hg.f28094f.e()).longValue() : 0L);
        k(jSONObject);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28089a.e()).booleanValue()) {
            jSONObject.put("as", this.f35655c.a());
        }
        return jSONObject;
    }

    final void f() {
        this.f35661i = p174r3.v.c().c() + ((long) ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25315J9)).intValue());
        if (this.f35657e == null) {
            this.f35657e = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.eg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35033C.j();
                }
            };
        }
        j();
    }

    public final void g(android.content.Context context, androidx.browser.customtabs.c cVar, java.lang.String str, androidx.browser.customtabs.b bVar) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("App Context parameter is null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Origin parameter is empty or null");
        }
        if (cVar == null) {
            throw new java.lang.IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.f35664l = context;
        this.f35660h = str;
        com.google.android.gms.internal.ads.C3503dg c3503dg = new com.google.android.gms.internal.ads.C3503dg(this, bVar, this.f35656d);
        this.f35658f = c3503dg;
        androidx.browser.customtabs.f fVarE = cVar.e(c3503dg);
        this.f35659g = fVarE;
        if (fVarE == null) {
            p224w3.p.d("CustomTabsClient failed to create new session.");
        }
        B3.AbstractC0797c.d(this.f35656d, null, "pact_action", new android.util.Pair("pe", "pact_init"));
    }

    final void h(java.lang.String str) {
        try {
            androidx.browser.customtabs.f fVar = this.f35659g;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new java.util.Date(this.f35662j).toString());
            k(jSONObject);
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28089a.e()).booleanValue()) {
                jSONObject.put("as", this.f35655c.a());
            }
            fVar.g(jSONObject.toString(), null);
            com.google.android.gms.internal.ads.C3722fg c3722fg = new com.google.android.gms.internal.ads.C3722fg(this, str);
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28091c.e()).booleanValue()) {
                this.f35654b.g(this.f35659g, c3722fg);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            D3.a.a(this.f35664l, p104k3.EnumC6886c.BANNER, ((k3.g.a) new k3.g.a().b(com.google.ads.mediation.admob.AdMobAdapter.class, bundle)).g(), c3722fg);
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error creating JSON: ", e6);
        }
    }

    public final void i(long j6) {
        this.f35662j = j6;
    }
}
