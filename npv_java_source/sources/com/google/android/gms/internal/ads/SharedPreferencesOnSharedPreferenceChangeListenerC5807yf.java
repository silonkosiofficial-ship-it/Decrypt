package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC5807yf implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.content.Context f40117g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f40111a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.ConditionVariable f40112b = new android.os.ConditionVariable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f40113c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f40114d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.content.SharedPreferences f40115e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.os.Bundle f40116f = new android.os.Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.json.JSONObject f40118h = new org.json.JSONObject();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f40119i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f40120j = false;

    private final void g(final android.content.SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.f40118h = new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.AbstractC2235Cf.a(new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.vf
                @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
                public final java.lang.Object a() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (org.json.JSONException unused) {
        }
    }

    public final java.lang.Object a(final com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf) {
        if (!this.f40112b.block(5000L)) {
            synchronized (this.f40111a) {
                try {
                    if (!this.f40114d) {
                        throw new java.lang.IllegalStateException("Flags.initialize() was not called!");
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        if (!this.f40113c || this.f40115e == null || this.f40120j) {
            synchronized (this.f40111a) {
                if (this.f40113c && this.f40115e != null && !this.f40120j) {
                }
                return abstractC5037rf.k();
            }
        }
        if (abstractC5037rf.e() != 2) {
            return (abstractC5037rf.e() == 1 && this.f40118h.has(abstractC5037rf.l())) ? abstractC5037rf.a(this.f40118h) : com.google.android.gms.internal.ads.AbstractC2235Cf.a(new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.wf
                @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
                public final java.lang.Object a() {
                    return this.f39656C.c(abstractC5037rf);
                }
            });
        }
        android.os.Bundle bundle = this.f40116f;
        return bundle == null ? abstractC5037rf.k() : abstractC5037rf.b(bundle);
    }

    public final java.lang.Object b(com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf) {
        return (this.f40113c || this.f40114d) ? a(abstractC5037rf) : abstractC5037rf.k();
    }

    final /* synthetic */ java.lang.Object c(com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf) {
        return abstractC5037rf.c(this.f40115e);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0120 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #2 {all -> 0x000e, blocks: (B:7:0x0008, B:9:0x000c, B:13:0x0011, B:15:0x0016, B:16:0x0018, B:18:0x002a, B:19:0x002e, B:20:0x0030, B:42:0x009e, B:43:0x00a5, B:52:0x00d4, B:53:0x00db, B:67:0x0120, B:68:0x0127, B:76:0x014e, B:77:0x0155, B:79:0x0157, B:80:0x015e, B:22:0x0045, B:25:0x004f, B:31:0x005c, B:34:0x0067, B:35:0x006f, B:37:0x0075, B:39:0x0085, B:41:0x009a, B:45:0x00a7, B:47:0x00ab, B:49:0x00bb, B:51:0x00d0, B:55:0x00dd, B:65:0x011c, B:70:0x0129, B:72:0x0140, B:74:0x0144, B:75:0x0147, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f), top: B:88:0x0008, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0129 A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {all -> 0x0057, blocks: (B:22:0x0045, B:25:0x004f, B:31:0x005c, B:34:0x0067, B:35:0x006f, B:37:0x0075, B:39:0x0085, B:41:0x009a, B:45:0x00a7, B:47:0x00ab, B:49:0x00bb, B:51:0x00d0, B:55:0x00dd, B:65:0x011c, B:70:0x0129, B:72:0x0140, B:74:0x0144, B:75:0x0147, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f), top: B:85:0x0045, outer: #2 }] */
    public final void d(android.content.Context context) {
        android.content.SharedPreferences sharedPreferencesA;
        final android.content.SharedPreferences sharedPreferences;
        android.content.SharedPreferences sharedPreferences2;
        if (this.f40113c) {
            return;
        }
        synchronized (this.f40111a) {
            try {
                if (this.f40113c) {
                    return;
                }
                if (!this.f40114d) {
                    this.f40114d = true;
                }
                this.f40119i = android.text.TextUtils.equals(context.getPackageName(), "com.google.android.gms");
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f40117g = context;
                try {
                    this.f40116f = W3.e.a(context).c(this.f40117g.getPackageName(), 128).metaData;
                } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
                }
                try {
                    android.content.Context context2 = this.f40117g;
                    android.content.Context contextC = N3.AbstractC1398k.c(context2);
                    if (contextC != null || context2 == null || (contextC = context2.getApplicationContext()) != null) {
                        context2 = contextC;
                    }
                    if (context2 != null) {
                        p184s3.A.b();
                        sharedPreferencesA = com.google.android.gms.internal.ads.C5257tf.a(context2);
                    } else {
                        sharedPreferencesA = null;
                    }
                    if (sharedPreferencesA != null) {
                        com.google.android.gms.internal.ads.AbstractC2900Ug.c(new com.google.android.gms.internal.ads.C5697xf(this, sharedPreferencesA));
                    }
                    if (!this.f40119i) {
                        com.google.android.gms.internal.ads.C4380lg c4380lg = com.google.android.gms.internal.ads.AbstractC5369ug.f39197d;
                        if (((java.lang.Long) c4380lg.e()).longValue() > 0 && com.google.android.gms.internal.ads.AbstractC4158jf.a(this.f40117g) >= ((java.lang.Long) c4380lg.e()).longValue()) {
                            this.f40120j = true;
                            this.f40113c = true;
                            this.f40114d = false;
                            this.f40112b.open();
                            return;
                        }
                    }
                    if (!this.f40119i) {
                        com.google.android.gms.internal.ads.C4380lg c4380lg2 = com.google.android.gms.internal.ads.AbstractC5369ug.f39199f;
                        if (((java.lang.Long) c4380lg2.e()).longValue() > 0 && com.google.android.gms.internal.ads.AbstractC4158jf.b(this.f40117g) >= ((java.lang.Long) c4380lg2.e()).longValue()) {
                            this.f40120j = true;
                            this.f40113c = true;
                            this.f40114d = false;
                            this.f40112b.open();
                            return;
                        }
                    }
                    android.content.Context context3 = this.f40117g;
                    if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2237Cg.f26278g.e()).booleanValue()) {
                        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2237Cg.f26279h.e()).booleanValue() && (sharedPreferences = context3.getSharedPreferences("admob", 0)) != null) {
                            try {
                                if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.AbstractC2235Cf.a(new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.uf
                                    @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
                                    public final java.lang.Object a() {
                                        return sharedPreferences.getString("app_settings_json", "{}");
                                    }
                                })).optBoolean("local_flags_enabled")) {
                                }
                            } catch (org.json.JSONException unused2) {
                            }
                        }
                        if (context2 == null) {
                            this.f40114d = false;
                            this.f40112b.open();
                            return;
                        }
                        p184s3.A.b();
                        this.f40115e = com.google.android.gms.internal.ads.C5257tf.a(context2);
                        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2237Cg.f26272a.e()).booleanValue() && (sharedPreferences2 = this.f40115e) != null) {
                            sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                        }
                        g(this.f40115e);
                        this.f40113c = true;
                        this.f40114d = false;
                        this.f40112b.open();
                    }
                    context2 = this.f40117g;
                    if (context2 == null) {
                        this.f40114d = false;
                        this.f40112b.open();
                        return;
                    }
                    p184s3.A.b();
                    this.f40115e = com.google.android.gms.internal.ads.C5257tf.a(context2);
                    if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2237Cg.f26272a.e()).booleanValue()) {
                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                    }
                    g(this.f40115e);
                    this.f40113c = true;
                    this.f40114d = false;
                    this.f40112b.open();
                } catch (java.lang.Throwable th) {
                    this.f40114d = false;
                    this.f40112b.open();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        return this.f40120j;
    }

    final boolean f() {
        return this.f40119i;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        if ("flag_configuration".equals(str)) {
            g(sharedPreferences);
        }
    }
}
