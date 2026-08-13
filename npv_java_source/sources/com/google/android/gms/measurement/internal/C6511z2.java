package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6511z2 extends com.google.android.gms.measurement.internal.AbstractC6512z3 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final android.util.Pair f42722B = new android.util.Pair("", 0L);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.B2 f42723A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.content.SharedPreferences f42724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Object f42725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.content.SharedPreferences f42726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.gms.measurement.internal.D2 f42727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.A2 f42728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.A2 f42729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.C2 f42730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.lang.String f42731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f42732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f42733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.A2 f42734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.C6497x2 f42735n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.C2 f42736o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.B2 f42737p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.C6497x2 f42738q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.A2 f42739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.A2 f42740s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f42741t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.google.android.gms.measurement.internal.C6497x2 f42742u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.google.android.gms.measurement.internal.C6497x2 f42743v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.google.android.gms.measurement.internal.A2 f42744w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.C2 f42745x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.C2 f42746y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.A2 f42747z;

    C6511z2(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f42725d = new java.lang.Object();
        this.f42734m = new com.google.android.gms.measurement.internal.A2(this, "session_timeout", 1800000L);
        this.f42735n = new com.google.android.gms.measurement.internal.C6497x2(this, "start_new_session", true);
        this.f42739r = new com.google.android.gms.measurement.internal.A2(this, "last_pause_time", 0L);
        this.f42740s = new com.google.android.gms.measurement.internal.A2(this, "session_id", 0L);
        this.f42736o = new com.google.android.gms.measurement.internal.C2(this, "non_personalized_ads", null);
        this.f42737p = new com.google.android.gms.measurement.internal.B2(this, "last_received_uri_timestamps_by_source", null);
        this.f42738q = new com.google.android.gms.measurement.internal.C6497x2(this, "allow_remote_dynamite", false);
        this.f42728g = new com.google.android.gms.measurement.internal.A2(this, "first_open_time", 0L);
        this.f42729h = new com.google.android.gms.measurement.internal.A2(this, "app_install_time", 0L);
        this.f42730i = new com.google.android.gms.measurement.internal.C2(this, "app_instance_id", null);
        this.f42742u = new com.google.android.gms.measurement.internal.C6497x2(this, "app_backgrounded", false);
        this.f42743v = new com.google.android.gms.measurement.internal.C6497x2(this, "deep_link_retrieval_complete", false);
        this.f42744w = new com.google.android.gms.measurement.internal.A2(this, "deep_link_retrieval_attempts", 0L);
        this.f42745x = new com.google.android.gms.measurement.internal.C2(this, "firebase_feature_rollouts", null);
        this.f42746y = new com.google.android.gms.measurement.internal.C2(this, "deferred_attribution_cache", null);
        this.f42747z = new com.google.android.gms.measurement.internal.A2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f42723A = new com.google.android.gms.measurement.internal.B2(this, "default_event_parameters", null);
    }

    final boolean A(com.google.android.gms.measurement.internal.C6480v c6480v) {
        n();
        if (!com.google.android.gms.measurement.internal.A3.l(c6480v.a(), L().a())) {
            return false;
        }
        android.content.SharedPreferences.Editor editorEdit = J().edit();
        editorEdit.putString("dma_consent_settings", c6480v.j());
        editorEdit.apply();
        return true;
    }

    final boolean B(com.google.android.gms.measurement.internal.A3 a6) {
        n();
        int iB = a6.b();
        if (!y(iB)) {
            return false;
        }
        android.content.SharedPreferences.Editor editorEdit = J().edit();
        editorEdit.putString("consent_settings", a6.x());
        editorEdit.putInt("consent_source", iB);
        editorEdit.apply();
        return true;
    }

    protected final boolean C(com.google.android.gms.measurement.internal.C6514z5 c6514z5) {
        n();
        java.lang.String string = J().getString("stored_tcf_param", "");
        java.lang.String strG = c6514z5.g();
        if (strG.equals(string)) {
            return false;
        }
        android.content.SharedPreferences.Editor editorEdit = J().edit();
        editorEdit.putString("stored_tcf_param", strG);
        editorEdit.apply();
        return true;
    }

    final boolean D() {
        android.content.SharedPreferences sharedPreferences = this.f42724c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final void E(java.lang.Boolean bool) {
        n();
        android.content.SharedPreferences.Editor editorEdit = J().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled_from_api");
        }
        editorEdit.apply();
    }

    final void F(java.lang.String str) {
        n();
        android.content.SharedPreferences.Editor editorEdit = J().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    final void G(boolean z6) {
        n();
        j().K().b("App measurement setting deferred collection", java.lang.Boolean.valueOf(z6));
        android.content.SharedPreferences.Editor editorEdit = J().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z6);
        editorEdit.apply();
    }

    protected final android.content.SharedPreferences H() {
        n();
        p();
        if (this.f42726e == null) {
            synchronized (this.f42725d) {
                try {
                    if (this.f42726e == null) {
                        java.lang.String str = a().getPackageName() + "_preferences";
                        j().K().b("Default prefs file", str);
                        this.f42726e = a().getSharedPreferences(str, 0);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return this.f42726e;
    }

    final void I(java.lang.String str) {
        n();
        android.content.SharedPreferences.Editor editorEdit = J().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    protected final android.content.SharedPreferences J() {
        n();
        p();
        Q3.AbstractC1477p.l(this.f42724c);
        return this.f42724c;
    }

    final android.util.SparseArray K() {
        android.os.Bundle bundleA = this.f42737p.a();
        if (bundleA == null) {
            return new android.util.SparseArray();
        }
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new android.util.SparseArray();
        }
        if (intArray.length != longArray.length) {
            j().G().a("Trigger URI source and timestamp array lengths do not match");
            return new android.util.SparseArray();
        }
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        for (int i6 = 0; i6 < intArray.length; i6++) {
            sparseArray.put(intArray[i6], java.lang.Long.valueOf(longArray[i6]));
        }
        return sparseArray;
    }

    final com.google.android.gms.measurement.internal.C6480v L() {
        n();
        return com.google.android.gms.measurement.internal.C6480v.d(J().getString("dma_consent_settings", null));
    }

    final com.google.android.gms.measurement.internal.A3 M() {
        n();
        return com.google.android.gms.measurement.internal.A3.f(J().getString("consent_settings", "G1"), J().getInt("consent_source", 100));
    }

    final java.lang.Boolean N() {
        n();
        if (J().contains("use_service")) {
            return java.lang.Boolean.valueOf(J().getBoolean("use_service", false));
        }
        return null;
    }

    final java.lang.Boolean O() {
        n();
        if (J().contains("measurement_enabled_from_api")) {
            return java.lang.Boolean.valueOf(J().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    final java.lang.Boolean P() {
        n();
        if (J().contains("measurement_enabled")) {
            return java.lang.Boolean.valueOf(J().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    protected final java.lang.String Q() {
        n();
        java.lang.String string = J().getString("previous_os_version", null);
        e().p();
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(string)) {
            android.content.SharedPreferences.Editor editorEdit = J().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    final java.lang.String R() {
        n();
        return J().getString("admob_app_id", null);
    }

    final java.lang.String S() {
        n();
        return J().getString("gmp_app_id", null);
    }

    final void T() {
        n();
        java.lang.Boolean boolP = P();
        android.content.SharedPreferences.Editor editorEdit = J().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolP != null) {
            w(boolP);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6512z3
    protected final void o() {
        android.content.SharedPreferences sharedPreferences = a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f42724c = sharedPreferences;
        boolean z6 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f42741t = z6;
        if (!z6) {
            android.content.SharedPreferences.Editor editorEdit = this.f42724c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f42727f = new com.google.android.gms.measurement.internal.D2(this, "health_monitor", java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.G.f41871d.a(null)).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6512z3
    protected final boolean t() {
        return true;
    }

    final android.util.Pair u(java.lang.String str) {
        n();
        if (!M().m(com.google.android.gms.measurement.internal.A3.a.AD_STORAGE)) {
            return new android.util.Pair("", java.lang.Boolean.FALSE);
        }
        long jC = b().c();
        if (this.f42731j != null && jC < this.f42733l) {
            return new android.util.Pair(this.f42731j, java.lang.Boolean.valueOf(this.f42732k));
        }
        this.f42733l = jC + d().C(str);
        p144o3.a.d(true);
        try {
            p144o3.a.C0676a c0676aA = p144o3.a.a(a());
            this.f42731j = "";
            java.lang.String strA = c0676aA.a();
            if (strA != null) {
                this.f42731j = strA;
            }
            this.f42732k = c0676aA.b();
        } catch (java.lang.Exception e6) {
            j().F().b("Unable to get advertising id", e6);
            this.f42731j = "";
        }
        p144o3.a.d(false);
        return new android.util.Pair(this.f42731j, java.lang.Boolean.valueOf(this.f42732k));
    }

    final void v(android.util.SparseArray sparseArray) {
        if (sparseArray == null) {
            this.f42737p.b(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            iArr[i6] = sparseArray.keyAt(i6);
            jArr[i6] = ((java.lang.Long) sparseArray.valueAt(i6)).longValue();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f42737p.b(bundle);
    }

    final void w(java.lang.Boolean bool) {
        n();
        android.content.SharedPreferences.Editor editorEdit = J().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final void x(boolean z6) {
        n();
        android.content.SharedPreferences.Editor editorEdit = J().edit();
        editorEdit.putBoolean("use_service", z6);
        editorEdit.apply();
    }

    final boolean y(int i6) {
        return com.google.android.gms.measurement.internal.A3.l(i6, J().getInt("consent_source", 100));
    }

    final boolean z(long j6) {
        return j6 - this.f42734m.a() > this.f42739r.a();
    }
}
