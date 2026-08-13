package p214v3;

/* JADX INFO: renamed from: v3.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7274v0 implements p214v3.InterfaceC7268s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f55953b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private P4.d f55955d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.content.SharedPreferences f55957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.content.SharedPreferences.Editor f55958g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.lang.String f55960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.lang.String f55961j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f55952a = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f55954c = new java.util.ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4482mc f55956e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f55959h = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f55962k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private java.lang.String f55963l = "-1";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f55964m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2695Oq f55965n = new com.google.android.gms.internal.ads.C2695Oq("", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f55966o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f55967p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f55968q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f55969r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private java.util.Set f55970s = java.util.Collections.emptySet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private org.json.JSONObject f55971t = new org.json.JSONObject();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f55972u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f55973v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private java.lang.String f55974w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private java.lang.String f55975x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f55976y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private java.lang.String f55977z = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private java.lang.String f55948A = "{}";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f55949B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f55950C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f55951D = 0;

    private final void N() {
        P4.d dVar = this.f55955d;
        if (dVar == null || dVar.isDone()) {
            return;
        }
        try {
            this.f55955d.get(1L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e6) {
            java.lang.Thread.currentThread().interrupt();
            p224w3.p.h("Interrupted while waiting for preferences loaded.", e6);
        } catch (java.util.concurrent.CancellationException e10) {
            e = e10;
            p224w3.p.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (java.util.concurrent.ExecutionException e11) {
            e = e11;
            p224w3.p.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (java.util.concurrent.TimeoutException e12) {
            e = e12;
            p224w3.p.e("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void O() {
        com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: v3.t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f55931C.K();
            }
        });
    }

    @Override // p214v3.InterfaceC7268s0
    public final void A(java.lang.String str) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue()) {
            N();
            synchronized (this.f55952a) {
                try {
                    if (this.f55975x.equals(str)) {
                        return;
                    }
                    this.f55975x = str;
                    android.content.SharedPreferences.Editor editor = this.f55958g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f55958g.apply();
                    }
                    O();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void B(java.lang.String str, java.lang.String str2, boolean z6) {
        N();
        synchronized (this.f55952a) {
            try {
                org.json.JSONArray jSONArrayOptJSONArray = this.f55971t.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new org.json.JSONArray();
                }
                int length = jSONArrayOptJSONArray.length();
                for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i6);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        if (!z6 || !jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            length = i6;
                            break;
                        }
                        return;
                    }
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z6);
                    jSONObject.put("timestamp_ms", p174r3.v.c().a());
                    jSONArrayOptJSONArray.put(length, jSONObject);
                    this.f55971t.put(str, jSONArrayOptJSONArray);
                } catch (org.json.JSONException e6) {
                    p224w3.p.h("Could not update native advanced settings", e6);
                }
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f55971t.toString());
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void C(long j6) {
        N();
        synchronized (this.f55952a) {
            try {
                if (this.f55967p == j6) {
                    return;
                }
                this.f55967p = j6;
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j6);
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void D(java.lang.String str) {
        N();
        synchronized (this.f55952a) {
            try {
                if (android.text.TextUtils.equals(this.f55974w, str)) {
                    return;
                }
                this.f55974w = str;
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void E(int i6) {
        N();
        synchronized (this.f55952a) {
            try {
                if (this.f55968q == i6) {
                    return;
                }
                this.f55968q = i6;
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i6);
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void F(long j6) {
        N();
        synchronized (this.f55952a) {
            try {
                if (this.f55966o == j6) {
                    return;
                }
                this.f55966o = j6;
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j6);
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void G(int i6) {
        N();
        synchronized (this.f55952a) {
            try {
                if (this.f55950C == i6) {
                    return;
                }
                this.f55950C = i6;
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i6);
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void G0(boolean z6) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25533d9)).booleanValue()) {
            N();
            synchronized (this.f55952a) {
                try {
                    if (this.f55976y == z6) {
                        return;
                    }
                    this.f55976y = z6;
                    android.content.SharedPreferences.Editor editor = this.f55958g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z6);
                        this.f55958g.apply();
                    }
                    O();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void H(boolean z6) {
        N();
        synchronized (this.f55952a) {
            try {
                if (z6 == this.f55962k) {
                    return;
                }
                this.f55962k = z6;
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z6);
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final boolean I() {
        N();
        synchronized (this.f55952a) {
            try {
                android.content.SharedPreferences sharedPreferences = this.f55957f;
                boolean z6 = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < java.lang.System.currentTimeMillis()) {
                    return false;
                }
                if (this.f55957f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f55962k) {
                    z6 = true;
                }
                return z6;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void J(boolean z6) {
        N();
        synchronized (this.f55952a) {
            try {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis() + ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.qa)).longValue();
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z6);
                    this.f55958g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.android.gms.internal.ads.C4482mc K() {
        if (!this.f55953b) {
            return null;
        }
        if ((b0() && P()) || !((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5259tg.f39002b.e()).booleanValue()) {
            return null;
        }
        synchronized (this.f55952a) {
            try {
                if (android.os.Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f55956e == null) {
                    this.f55956e = new com.google.android.gms.internal.ads.C4482mc();
                }
                this.f55956e.d();
                p224w3.p.f("start fetching content...");
                return this.f55956e;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void L(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (this.f55952a) {
                try {
                    this.f55957f = sharedPreferences;
                    this.f55958g = editorEdit;
                    if (V3.n.g()) {
                        android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    }
                    this.f55959h = this.f55957f.getBoolean("use_https", this.f55959h);
                    this.f55972u = this.f55957f.getBoolean("content_url_opted_out", this.f55972u);
                    this.f55960i = this.f55957f.getString("content_url_hashes", this.f55960i);
                    this.f55962k = this.f55957f.getBoolean("gad_idless", this.f55962k);
                    this.f55973v = this.f55957f.getBoolean("content_vertical_opted_out", this.f55973v);
                    this.f55961j = this.f55957f.getString("content_vertical_hashes", this.f55961j);
                    this.f55969r = this.f55957f.getInt("version_code", this.f55969r);
                    if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5369ug.f39200g.e()).booleanValue() && p184s3.A.c().e()) {
                        this.f55965n = new com.google.android.gms.internal.ads.C2695Oq("", 0L);
                    } else {
                        this.f55965n = new com.google.android.gms.internal.ads.C2695Oq(this.f55957f.getString("app_settings_json", this.f55965n.c()), this.f55957f.getLong("app_settings_last_update_ms", this.f55965n.a()));
                    }
                    this.f55966o = this.f55957f.getLong("app_last_background_time_ms", this.f55966o);
                    this.f55968q = this.f55957f.getInt("request_in_session_count", this.f55968q);
                    this.f55967p = this.f55957f.getLong("first_ad_req_time_ms", this.f55967p);
                    this.f55970s = this.f55957f.getStringSet("never_pool_slots", this.f55970s);
                    this.f55974w = this.f55957f.getString("display_cutout", this.f55974w);
                    this.f55949B = this.f55957f.getInt("app_measurement_npa", this.f55949B);
                    this.f55950C = this.f55957f.getInt("sd_app_measure_npa", this.f55950C);
                    this.f55951D = this.f55957f.getLong("sd_app_measure_npa_ts", this.f55951D);
                    this.f55975x = this.f55957f.getString("inspector_info", this.f55975x);
                    this.f55976y = this.f55957f.getBoolean("linked_device", this.f55976y);
                    this.f55977z = this.f55957f.getString("linked_ad_unit", this.f55977z);
                    this.f55948A = this.f55957f.getString("inspector_ui_storage", this.f55948A);
                    this.f55963l = this.f55957f.getString("IABTCF_TCString", this.f55963l);
                    this.f55964m = this.f55957f.getInt("gad_has_consent_for_cookies", this.f55964m);
                    try {
                        this.f55971t = new org.json.JSONObject(this.f55957f.getString("native_advanced_settings", "{}"));
                    } catch (org.json.JSONException e6) {
                        p224w3.p.h("Could not convert native advanced settings to json object", e6);
                    }
                    O();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            p174r3.v.s().x(th2, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            p214v3.AbstractC7265q0.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final boolean M() {
        boolean z6;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25284H0)).booleanValue()) {
            return false;
        }
        N();
        synchronized (this.f55952a) {
            z6 = this.f55962k;
        }
        return z6;
    }

    @Override // p214v3.InterfaceC7268s0
    public final boolean P() {
        boolean z6;
        N();
        synchronized (this.f55952a) {
            z6 = this.f55973v;
        }
        return z6;
    }

    @Override // p214v3.InterfaceC7268s0
    public final boolean R() {
        boolean z6;
        N();
        synchronized (this.f55952a) {
            z6 = this.f55976y;
        }
        return z6;
    }

    @Override // p214v3.InterfaceC7268s0
    public final int a() {
        int i6;
        N();
        synchronized (this.f55952a) {
            i6 = this.f55969r;
        }
        return i6;
    }

    @Override // p214v3.InterfaceC7268s0
    public final int b() {
        N();
        return this.f55964m;
    }

    @Override // p214v3.InterfaceC7268s0
    public final boolean b0() {
        boolean z6;
        N();
        synchronized (this.f55952a) {
            z6 = this.f55972u;
        }
        return z6;
    }

    @Override // p214v3.InterfaceC7268s0
    public final int c() {
        int i6;
        N();
        synchronized (this.f55952a) {
            i6 = this.f55968q;
        }
        return i6;
    }

    @Override // p214v3.InterfaceC7268s0
    public final long d() {
        long j6;
        N();
        synchronized (this.f55952a) {
            j6 = this.f55967p;
        }
        return j6;
    }

    @Override // p214v3.InterfaceC7268s0
    public final long e() {
        long j6;
        N();
        synchronized (this.f55952a) {
            j6 = this.f55951D;
        }
        return j6;
    }

    @Override // p214v3.InterfaceC7268s0
    public final long f() {
        long j6;
        N();
        synchronized (this.f55952a) {
            j6 = this.f55966o;
        }
        return j6;
    }

    @Override // p214v3.InterfaceC7268s0
    public final com.google.android.gms.internal.ads.C2695Oq g() {
        com.google.android.gms.internal.ads.C2695Oq c2695Oq;
        synchronized (this.f55952a) {
            c2695Oq = this.f55965n;
        }
        return c2695Oq;
    }

    @Override // p214v3.InterfaceC7268s0
    public final java.lang.String h() {
        java.lang.String str;
        N();
        synchronized (this.f55952a) {
            str = this.f55977z;
        }
        return str;
    }

    @Override // p214v3.InterfaceC7268s0
    public final com.google.android.gms.internal.ads.C2695Oq i() {
        com.google.android.gms.internal.ads.C2695Oq c2695Oq;
        N();
        synchronized (this.f55952a) {
            try {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ab)).booleanValue() && this.f55965n.j()) {
                    java.util.Iterator it = this.f55954c.iterator();
                    while (it.hasNext()) {
                        ((java.lang.Runnable) it.next()).run();
                    }
                }
                c2695Oq = this.f55965n;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c2695Oq;
    }

    @Override // p214v3.InterfaceC7268s0
    public final java.lang.String j() {
        java.lang.String str;
        N();
        synchronized (this.f55952a) {
            str = this.f55974w;
        }
        return str;
    }

    @Override // p214v3.InterfaceC7268s0
    public final java.lang.String k() {
        java.lang.String str;
        N();
        synchronized (this.f55952a) {
            str = this.f55975x;
        }
        return str;
    }

    @Override // p214v3.InterfaceC7268s0
    public final java.lang.String l() {
        java.lang.String str;
        N();
        synchronized (this.f55952a) {
            str = this.f55948A;
        }
        return str;
    }

    @Override // p214v3.InterfaceC7268s0
    public final java.lang.String m() {
        N();
        return this.f55963l;
    }

    @Override // p214v3.InterfaceC7268s0
    public final org.json.JSONObject n() {
        org.json.JSONObject jSONObject;
        N();
        synchronized (this.f55952a) {
            jSONObject = this.f55971t;
        }
        return jSONObject;
    }

    @Override // p214v3.InterfaceC7268s0
    public final void o(boolean z6) {
        N();
        synchronized (this.f55952a) {
            try {
                if (this.f55973v == z6) {
                    return;
                }
                this.f55973v = z6;
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z6);
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void p(boolean z6) {
        N();
        synchronized (this.f55952a) {
            try {
                if (this.f55972u == z6) {
                    return;
                }
                this.f55972u = z6;
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z6);
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void q(java.lang.String str) {
        N();
        synchronized (this.f55952a) {
            try {
                this.f55963l = str;
                if (this.f55958g != null) {
                    if (str.equals("-1")) {
                        this.f55958g.remove("IABTCF_TCString");
                    } else {
                        this.f55958g.putString("IABTCF_TCString", str);
                    }
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void r(int i6) {
        N();
        synchronized (this.f55952a) {
            try {
                this.f55964m = i6;
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    if (i6 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i6);
                    }
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void s() {
        N();
        synchronized (this.f55952a) {
            try {
                this.f55971t = new org.json.JSONObject();
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void t(final android.content.Context context) {
        synchronized (this.f55952a) {
            try {
                if (this.f55957f != null) {
                    return;
                }
                final java.lang.String str = "admob";
                this.f55955d = com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.r(new java.lang.Runnable(context, str) { // from class: v3.u0

                    /* JADX INFO: renamed from: D, reason: collision with root package name */
                    public final /* synthetic */ android.content.Context f55934D;

                    /* JADX INFO: renamed from: E, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f55935E = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f55933C.L(this.f55934D, this.f55935E);
                    }
                });
                this.f55953b = true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void u(java.lang.String str) {
        N();
        synchronized (this.f55952a) {
            try {
                long jA = p174r3.v.c().a();
                if (str != null && !str.equals(this.f55965n.c())) {
                    this.f55965n = new com.google.android.gms.internal.ads.C2695Oq(str, jA);
                    android.content.SharedPreferences.Editor editor = this.f55958g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f55958g.putLong("app_settings_last_update_ms", jA);
                        this.f55958g.apply();
                    }
                    O();
                    java.util.Iterator it = this.f55954c.iterator();
                    while (it.hasNext()) {
                        ((java.lang.Runnable) it.next()).run();
                    }
                    return;
                }
                this.f55965n.g(jA);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void v(java.lang.String str) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25670q9)).booleanValue()) {
            N();
            synchronized (this.f55952a) {
                try {
                    if (this.f55948A.equals(str)) {
                        return;
                    }
                    this.f55948A = str;
                    android.content.SharedPreferences.Editor editor = this.f55958g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f55958g.apply();
                    }
                    O();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void w(java.lang.Runnable runnable) {
        this.f55954c.add(runnable);
    }

    @Override // p214v3.InterfaceC7268s0
    public final void x(java.lang.String str) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25533d9)).booleanValue()) {
            N();
            synchronized (this.f55952a) {
                try {
                    if (this.f55977z.equals(str)) {
                        return;
                    }
                    this.f55977z = str;
                    android.content.SharedPreferences.Editor editor = this.f55958g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f55958g.apply();
                    }
                    O();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void y(long j6) {
        N();
        synchronized (this.f55952a) {
            try {
                if (this.f55951D == j6) {
                    return;
                }
                this.f55951D = j6;
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j6);
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p214v3.InterfaceC7268s0
    public final void z(int i6) {
        N();
        synchronized (this.f55952a) {
            try {
                if (this.f55969r == i6) {
                    return;
                }
                this.f55969r = i6;
                android.content.SharedPreferences.Editor editor = this.f55958g;
                if (editor != null) {
                    editor.putInt("version_code", i6);
                    this.f55958g.apply();
                }
                O();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
