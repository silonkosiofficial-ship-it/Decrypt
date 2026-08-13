package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class KP implements com.google.android.gms.internal.ads.InterfaceC4468mQ, com.google.android.gms.internal.ads.InterfaceC5456vP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.WP f28906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4578nQ f28907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5566wP f28908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.FP f28909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5346uP f28910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC4030iQ f28911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SP f28912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SP f28913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.String f28914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final android.content.Context f28915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.lang.String f28916k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private org.json.JSONObject f28921p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f28924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28925t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f28926u;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.Map f28917l = new java.util.HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.util.Map f28918m = new java.util.HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final java.util.Map f28919n = new java.util.HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private java.lang.String f28920o = "{}";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f28922q = Long.MAX_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.google.android.gms.internal.ads.GP f28923r = com.google.android.gms.internal.ads.GP.NONE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.google.android.gms.internal.ads.JP f28927v = com.google.android.gms.internal.ads.JP.UNKNOWN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f28928w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private java.lang.String f28929x = "";

    KP(com.google.android.gms.internal.ads.WP wp, com.google.android.gms.internal.ads.C4578nQ c4578nQ, com.google.android.gms.internal.ads.C5566wP c5566wP, android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.FP fp, com.google.android.gms.internal.ads.BinderC4030iQ binderC4030iQ, com.google.android.gms.internal.ads.SP sp, com.google.android.gms.internal.ads.SP sp2, java.lang.String str) {
        this.f28906a = wp;
        this.f28907b = c4578nQ;
        this.f28908c = c5566wP;
        this.f28910e = new com.google.android.gms.internal.ads.C5346uP(context);
        this.f28914i = aVar.f56217C;
        this.f28916k = str;
        this.f28909d = fp;
        this.f28911f = binderC4030iQ;
        this.f28912g = sp;
        this.f28913h = sp2;
        this.f28915j = context;
        p174r3.v.w().g(this);
    }

    private final synchronized void A() {
        int iOrdinal = this.f28923r.ordinal();
        if (iOrdinal == 1) {
            this.f28907b.c();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f28908c.c();
        }
    }

    private final synchronized void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            y(jSONObject.optBoolean("isTestMode", false), false);
            x((com.google.android.gms.internal.ads.GP) java.lang.Enum.valueOf(com.google.android.gms.internal.ads.GP.class, jSONObject.optString("gesture", "NONE")), false);
            this.f28920o = jSONObject.optString("networkExtras", "{}");
            this.f28922q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (org.json.JSONException unused) {
        }
    }

    private final synchronized org.json.JSONObject u() {
        org.json.JSONObject jSONObject;
        try {
            jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : this.f28917l.entrySet()) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.google.android.gms.internal.ads.C5786yP c5786yP : (java.util.List) entry.getValue()) {
                    if (c5786yP.e()) {
                        jSONArray.put(c5786yP.b());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((java.lang.String) entry.getKey(), jSONArray);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void v() {
        this.f28926u = true;
        this.f28909d.c();
        this.f28906a.c(this);
        this.f28907b.d(this);
        this.f28908c.d(this);
        this.f28911f.r6(this);
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25680r9;
        if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) p184s3.A.c().a(abstractC5037rf))) {
            this.f28912g.b(android.preference.PreferenceManager.getDefaultSharedPreferences(this.f28915j), java.util.Arrays.asList(((java.lang.String) p184s3.A.c().a(abstractC5037rf)).split(",")));
        }
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf2 = com.google.android.gms.internal.ads.AbstractC2161Af.f25690s9;
        if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) p184s3.A.c().a(abstractC5037rf2))) {
            this.f28913h.b(this.f28915j.getSharedPreferences("admob", 0), java.util.Arrays.asList(((java.lang.String) p184s3.A.c().a(abstractC5037rf2)).split(",")));
        }
        a(p174r3.v.s().j().k());
        this.f28929x = p174r3.v.s().j().l();
    }

    private final void w() {
        p174r3.v.s().j().A(e());
    }

    private final synchronized void x(com.google.android.gms.internal.ads.GP gp, boolean z6) {
        try {
            if (this.f28923r != gp) {
                if (r()) {
                    z();
                }
                this.f28923r = gp;
                if (r()) {
                    A();
                }
                if (z6) {
                    w();
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    private final synchronized void y(boolean z6, boolean z10) {
        try {
            if (this.f28924s != z6) {
                this.f28924s = z6;
                if (z6) {
                    if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25533d9)).booleanValue() || !p174r3.v.w().l()) {
                        A();
                    } else if (!r()) {
                        z();
                    }
                } else if (!r()) {
                    z();
                }
                if (z10) {
                    w();
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized void z() {
        int iOrdinal = this.f28923r.ordinal();
        if (iOrdinal == 1) {
            this.f28907b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f28908c.b();
        }
    }

    public final com.google.android.gms.internal.ads.GP b() {
        return this.f28923r;
    }

    public final synchronized P4.d c(java.lang.String str) {
        com.google.android.gms.internal.ads.C4512mr c4512mr;
        try {
            c4512mr = new com.google.android.gms.internal.ads.C4512mr();
            if (this.f28918m.containsKey(str)) {
                c4512mr.c((com.google.android.gms.internal.ads.C5786yP) this.f28918m.get(str));
            } else {
                if (!this.f28919n.containsKey(str)) {
                    this.f28919n.put(str, new java.util.ArrayList());
                }
                ((java.util.List) this.f28919n.get(str)).add(c4512mr);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return c4512mr;
    }

    public final synchronized java.lang.String d() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue() && r()) {
            if (this.f28922q < p174r3.v.c().a() / 1000) {
                this.f28920o = "{}";
                this.f28922q = Long.MAX_VALUE;
                return "";
            }
            if (!this.f28920o.equals("{}")) {
                return this.f28920o;
            }
        }
        return "";
    }

    public final synchronized java.lang.String e() {
        org.json.JSONObject jSONObject;
        jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("isTestMode", this.f28924s);
            jSONObject.put("gesture", this.f28923r);
            if (this.f28922q > p174r3.v.c().a() / 1000) {
                jSONObject.put("networkExtras", this.f28920o);
                jSONObject.put("networkExtrasExpirationSecs", this.f28922q);
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized org.json.JSONObject f() {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        try {
            jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                if (!android.text.TextUtils.isEmpty(this.f28916k)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.f28916k);
                }
                jSONObject.put("internalSdkVersion", this.f28914i);
                jSONObject.put("osVersion", android.os.Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.f28909d.a());
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25650o9)).booleanValue()) {
                    java.lang.String strO = p174r3.v.s().o();
                    if (!android.text.TextUtils.isEmpty(strO)) {
                        jSONObject.put("plugin", strO);
                    }
                }
                if (this.f28922q < p174r3.v.c().a() / 1000) {
                    this.f28920o = "{}";
                }
                jSONObject.put("networkExtras", this.f28920o);
                jSONObject.put("adSlots", u());
                jSONObject.put("appInfo", this.f28910e.a());
                java.lang.String strC = p174r3.v.s().j().i().c();
                if (!android.text.TextUtils.isEmpty(strC)) {
                    jSONObject.put("cld", new org.json.JSONObject(strC));
                }
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25544e9)).booleanValue() && (jSONObject2 = this.f28921p) != null) {
                    p224w3.p.b("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.f28921p);
                }
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25533d9)).booleanValue()) {
                    jSONObject.put("openAction", this.f28927v);
                    jSONObject.put("gesture", this.f28923r);
                }
                jSONObject.put("isGamRegisteredTestDevice", p174r3.v.w().l());
                p174r3.v.t();
                p184s3.C7147y.b();
                jSONObject.put("isSimulator", p224w3.g.t());
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25670q9)).booleanValue()) {
                    jSONObject.put("uiStorage", new org.json.JSONObject(this.f28929x));
                }
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25690s9))) {
                    jSONObject.put("gmaDisk", this.f28913h.a());
                }
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25680r9))) {
                    jSONObject.put("userDisk", this.f28912g.a());
                }
            } catch (org.json.JSONException e6) {
                p174r3.v.s().w(e6, "Inspector.toJson");
                p224w3.p.h("Ad inspector encountered an error", e6);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized void g(java.lang.String str, com.google.android.gms.internal.ads.C5786yP c5786yP) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue() && r()) {
            if (this.f28925t >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25391Q8)).intValue()) {
                p224w3.p.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f28917l.containsKey(str)) {
                this.f28917l.put(str, new java.util.ArrayList());
            }
            this.f28925t++;
            ((java.util.List) this.f28917l.get(str)).add(c5786yP);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25630m9)).booleanValue()) {
                java.lang.String strA = c5786yP.a();
                this.f28918m.put(strA, c5786yP);
                if (this.f28919n.containsKey(strA)) {
                    java.util.List list = (java.util.List) this.f28919n.get(strA);
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.internal.ads.C4512mr) it.next()).c(c5786yP);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void h() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25533d9)).booleanValue() && p174r3.v.s().j().R()) {
                v();
                return;
            }
            java.lang.String strK = p174r3.v.s().j().k();
            if (android.text.TextUtils.isEmpty(strK)) {
                return;
            }
            try {
                if (new org.json.JSONObject(strK).optBoolean("isTestMode", false)) {
                    v();
                }
            } catch (org.json.JSONException unused) {
            }
        }
    }

    public final synchronized void i(p184s3.H0 h6, com.google.android.gms.internal.ads.JP jp) {
        if (!r()) {
            try {
                h6.V1(com.google.android.gms.internal.ads.P70.d(18, null, null));
                return;
            } catch (android.os.RemoteException unused) {
                p224w3.p.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue()) {
            this.f28927v = jp;
            this.f28906a.e(h6, new com.google.android.gms.internal.ads.C2206Bj(this), new com.google.android.gms.internal.ads.C5375uj(this.f28911f), new com.google.android.gms.internal.ads.C3948hj(this));
            return;
        } else {
            try {
                h6.V1(com.google.android.gms.internal.ads.P70.d(1, null, null));
                return;
            } catch (android.os.RemoteException unused2) {
                p224w3.p.g("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    public final synchronized void j(java.lang.String str, long j6) {
        this.f28920o = str;
        this.f28922q = j6;
        w();
    }

    public final synchronized void k(java.lang.String str) {
        this.f28929x = str;
        p174r3.v.s().j().v(this.f28929x);
    }

    public final synchronized void l(long j6) {
        this.f28928w += j6;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0011  */
    public final void m(boolean z6) {
        if (this.f28926u) {
            if (z6) {
                if (!this.f28924s) {
                    A();
                    return;
                }
            }
        } else if (z6) {
            v();
            if (!this.f28924s) {
                A();
                return;
            }
        }
        if (r()) {
            return;
        }
        z();
    }

    public final void n(com.google.android.gms.internal.ads.GP gp) {
        x(gp, true);
    }

    public final synchronized void o(org.json.JSONObject jSONObject) {
        this.f28921p = jSONObject;
    }

    public final void p(boolean z6) {
        if (!this.f28926u && z6) {
            v();
        }
        y(z6, true);
    }

    public final boolean q() {
        return this.f28921p != null;
    }

    public final synchronized boolean r() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25533d9)).booleanValue()) {
            return this.f28924s || p174r3.v.w().l();
        }
        return this.f28924s;
    }

    public final synchronized boolean s() {
        return this.f28924s;
    }

    public final boolean t() {
        return this.f28928w < ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25599j9)).longValue();
    }
}
