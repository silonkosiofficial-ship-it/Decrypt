package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class F3 extends com.google.android.gms.measurement.internal.AbstractC6504y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.C6430n4 f41782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p085i4.u f41783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Set f41784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f41786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.Object f41787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f41789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.AbstractC6466t f41790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private java.util.PriorityQueue f41791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f41792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.A3 f41793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f41794o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f41795p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final com.google.android.gms.measurement.internal.i6 f41796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f41797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.AbstractC6466t f41798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener f41799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.AbstractC6466t f41800u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.c6 f41801v;

    protected F3(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f41784e = new java.util.concurrent.CopyOnWriteArraySet();
        this.f41787h = new java.lang.Object();
        this.f41788i = false;
        this.f41789j = 1;
        this.f41797r = true;
        this.f41801v = new com.google.android.gms.measurement.internal.C6374f4(this);
        this.f41786g = new java.util.concurrent.atomic.AtomicReference();
        this.f41793n = com.google.android.gms.measurement.internal.A3.f41705c;
        this.f41795p = -1L;
        this.f41794o = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f41796q = new com.google.android.gms.measurement.internal.i6(s6);
    }

    static /* synthetic */ int C(com.google.android.gms.measurement.internal.F3 f6, java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        f6.f41792m = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof java.lang.IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof java.lang.SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (message.contains("Background")) {
            f6.f41792m = true;
        }
        return 1;
    }

    public static int E(java.lang.String str) {
        Q3.AbstractC1477p.f(str);
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0() {
        n();
        java.lang.String strA = h().f42736o.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                k0("app", "_npa", null, b().a());
            } else {
                k0("app", "_npa", java.lang.Long.valueOf("true".equals(strA) ? 1L : 0L), b().a());
            }
        }
        if (!this.f42679a.p() || !this.f41797r) {
            j().F().a("Updating Scion state (FE)");
            t().f0();
        } else {
            j().F().a("Recording app launch after enabling measurement for the first time (FE)");
            C0();
            u().f42594e.a();
            l().D(new com.google.android.gms.measurement.internal.S3(this));
        }
    }

    private final void N(android.os.Bundle bundle, int i6, long j6) {
        v();
        java.lang.String strK = com.google.android.gms.measurement.internal.A3.k(bundle);
        if (strK != null) {
            j().M().b("Ignoring invalid consent setting", strK);
            j().M().a("Valid consent values are 'granted', 'denied'");
        }
        boolean zJ = l().J();
        com.google.android.gms.measurement.internal.A3 a3C = com.google.android.gms.measurement.internal.A3.c(bundle, i6);
        if (a3C.A()) {
            S(a3C, j6, zJ);
        }
        com.google.android.gms.measurement.internal.C6480v c6480vB = com.google.android.gms.measurement.internal.C6480v.b(bundle, i6);
        if (c6480vB.k()) {
            Q(c6480vB, zJ);
        }
        java.lang.Boolean boolE = com.google.android.gms.measurement.internal.C6480v.e(bundle);
        if (boolE != null) {
            java.lang.String str = i6 == -30 ? "tcf" : "app";
            if (d().t(com.google.android.gms.measurement.internal.G.f41849T0) && zJ) {
                k0(str, "allow_personalized_ads", boolE.toString(), j6);
            } else {
                m0(str, "allow_personalized_ads", boolE.toString(), false, j6);
            }
        }
    }

    static /* synthetic */ void P0(com.google.android.gms.measurement.internal.F3 f6, int i6) {
        if (f6.f41790k == null) {
            f6.f41790k = new com.google.android.gms.measurement.internal.Q3(f6, f6.f42679a);
        }
        f6.f41790k.b(i6 * 1000);
    }

    static /* synthetic */ void Q0(com.google.android.gms.measurement.internal.F3 f6, android.os.Bundle bundle) {
        f6.n();
        f6.v();
        Q3.AbstractC1477p.l(bundle);
        java.lang.String string = bundle.getString("name");
        java.lang.String string2 = bundle.getString("origin");
        Q3.AbstractC1477p.f(string);
        Q3.AbstractC1477p.f(string2);
        Q3.AbstractC1477p.l(bundle.get("value"));
        if (!f6.f42679a.p()) {
            f6.j().K().a("Conditional property not set since app measurement is disabled");
            return;
        }
        com.google.android.gms.measurement.internal.Y5 y6 = new com.google.android.gms.measurement.internal.Y5(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            com.google.android.gms.measurement.internal.E eH = f6.i().H(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            f6.t().H(new com.google.android.gms.measurement.internal.C6362e(bundle.getString("app_id"), string2, y6, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), f6.i().H(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), eH, bundle.getLong("time_to_live"), f6.i().H(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    private final void T0(java.lang.String str, java.lang.String str2, long j6, android.os.Bundle bundle, boolean z6, boolean z10, boolean z11, java.lang.String str3) {
        l().D(new com.google.android.gms.measurement.internal.X3(this, str, str2, j6, com.google.android.gms.measurement.internal.d6.D(bundle), z6, z10, z11, str3));
    }

    static /* synthetic */ void U(com.google.android.gms.measurement.internal.F3 f6, android.os.Bundle bundle) {
        f6.n();
        f6.v();
        Q3.AbstractC1477p.l(bundle);
        java.lang.String strF = Q3.AbstractC1477p.f(bundle.getString("name"));
        if (!f6.f42679a.p()) {
            f6.j().K().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            f6.t().H(new com.google.android.gms.measurement.internal.C6362e(bundle.getString("app_id"), "", new com.google.android.gms.measurement.internal.Y5(strF, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), f6.i().H(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void V(com.google.android.gms.measurement.internal.F3 f6, com.google.android.gms.measurement.internal.A3 a6, long j6, boolean z6, boolean z10) {
        f6.n();
        f6.v();
        com.google.android.gms.measurement.internal.A3 a3M = f6.h().M();
        if (j6 <= f6.f41795p && com.google.android.gms.measurement.internal.A3.l(a3M.b(), a6.b())) {
            f6.j().J().b("Dropped out-of-date consent setting, proposed settings", a6);
            return;
        }
        if (!f6.h().B(a6)) {
            f6.j().J().b("Lower precedence consent source ignored, proposed source", java.lang.Integer.valueOf(a6.b()));
            return;
        }
        f6.j().K().b("Setting storage consent(FE)", a6);
        f6.f41795p = j6;
        if (f6.t().j0()) {
            f6.t().o0(z6);
        } else {
            f6.t().U(z6);
        }
        if (z10) {
            f6.t().Q(new java.util.concurrent.atomic.AtomicReference());
        }
    }

    static /* synthetic */ void W(com.google.android.gms.measurement.internal.F3 f6, com.google.android.gms.measurement.internal.A3 a6, com.google.android.gms.measurement.internal.A3 a10) {
        if (com.google.android.gms.internal.measurement.C6038i6.a() && f6.d().t(com.google.android.gms.measurement.internal.G.f41859Y0)) {
            return;
        }
        com.google.android.gms.measurement.internal.A3.a aVar = com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE;
        com.google.android.gms.measurement.internal.A3.a aVar2 = com.google.android.gms.measurement.internal.A3.a.AD_STORAGE;
        boolean zN = a6.n(a10, aVar, aVar2);
        boolean zS = a6.s(a10, aVar, aVar2);
        if (zN || zS) {
            f6.p().I();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(java.lang.Boolean bool, boolean z6) {
        n();
        v();
        j().F().b("Setting app measurement enabled (FE)", bool);
        h().w(bool);
        if (z6) {
            h().E(bool);
        }
        if (this.f42679a.q() || !(bool == null || bool.booleanValue())) {
            K0();
        }
    }

    private final void g0(java.lang.String str, java.lang.String str2, long j6, java.lang.Object obj) {
        l().D(new com.google.android.gms.measurement.internal.W3(this, str, str2, obj, j6));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6504y2
    protected final boolean A() {
        return false;
    }

    final java.util.PriorityQueue A0() {
        if (this.f41791l == null) {
            p085i4.x.a();
            this.f41791l = p085i4.w.a(j$.util.Comparator.CC.comparing(new java.util.function.Function() { // from class: com.google.android.gms.measurement.internal.E3
                public /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                    return j$.util.function.Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Long.valueOf(((com.google.android.gms.measurement.internal.B5) obj).f41739D);
                }

                public /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                    return j$.util.function.Function$CC.$default$compose(this, function);
                }
            }, new java.util.Comparator() { // from class: com.google.android.gms.measurement.internal.H3
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return java.lang.Long.compare(((java.lang.Long) obj).longValue(), ((java.lang.Long) obj2).longValue());
                }
            }));
        }
        return this.f41791l;
    }

    public final void B0() {
        n();
        v();
        if (d().t(com.google.android.gms.measurement.internal.G.f41876e1)) {
            com.google.android.gms.measurement.internal.F4 f4T = t();
            f4T.n();
            f4T.v();
            if (f4T.k0() && f4T.i().I0() < 242600) {
                return;
            }
            t().X();
        }
    }

    public final void C0() {
        n();
        v();
        if (this.f42679a.s()) {
            java.lang.Boolean boolE = d().E("google_analytics_deferred_deep_link_enabled");
            if (boolE != null && boolE.booleanValue()) {
                j().F().a("Deferred Deep Link feature enabled.");
                l().D(new java.lang.Runnable() { // from class: i4.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46688C.F0();
                    }
                });
            }
            t().Y();
            this.f41797r = false;
            java.lang.String strQ = h().Q();
            if (android.text.TextUtils.isEmpty(strQ)) {
                return;
            }
            e().p();
            if (strQ.equals(android.os.Build.VERSION.RELEASE)) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("_po", strQ);
            b1("auto", "_ou", bundle);
        }
    }

    public final void D0() {
        if (!(a().getApplicationContext() instanceof android.app.Application) || this.f41782c == null) {
            return;
        }
        ((android.app.Application) a().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f41782c);
    }

    final void E0() {
        if (com.google.android.gms.internal.measurement.C6066l7.a() && d().t(com.google.android.gms.measurement.internal.G.f41829J0)) {
            if (l().J()) {
                j().G().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (com.google.android.gms.measurement.internal.C6348c.a()) {
                j().G().a("Cannot get trigger URIs from main thread");
                return;
            }
            v();
            j().K().a("Getting trigger URIs (FE)");
            final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            l().v(atomicReference, 5000L, "get trigger URIs", new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.G3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41929C.o0(atomicReference);
                }
            });
            final java.util.List list = (java.util.List) atomicReference.get();
            if (list == null) {
                j().G().a("Timed out waiting for get trigger URIs");
            } else {
                l().D(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.J3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42000C.n0(list);
                    }
                });
            }
        }
    }

    public final void F0() {
        n();
        if (h().f42743v.b()) {
            j().F().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = h().f42744w.a();
        h().f42744w.b(1 + jA);
        if (jA >= 5) {
            j().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            h().f42743v.a(true);
        } else {
            if (this.f41798s == null) {
                this.f41798s = new com.google.android.gms.measurement.internal.C6339a4(this, this.f42679a);
            }
            this.f41798s.b(0L);
        }
    }

    public final java.util.ArrayList G(java.lang.String str, java.lang.String str2) {
        if (l().J()) {
            j().G().a("Cannot get conditional user properties from analytics worker thread");
            return new java.util.ArrayList(0);
        }
        if (com.google.android.gms.measurement.internal.C6348c.a()) {
            j().G().a("Cannot get conditional user properties from main thread");
            return new java.util.ArrayList(0);
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.f42679a.l().v(atomicReference, 5000L, "get conditional user properties", new com.google.android.gms.measurement.internal.RunnableC6367e4(this, atomicReference, null, str, str2));
        java.util.List list = (java.util.List) atomicReference.get();
        if (list != null) {
            return com.google.android.gms.measurement.internal.d6.t0(list);
        }
        j().G().b("Timed out waiting for get conditional user properties", null);
        return new java.util.ArrayList();
    }

    public final void G0() {
        n();
        j().F().a("Handle tcf update.");
        com.google.android.gms.measurement.internal.C6514z5 c6514z5C = com.google.android.gms.measurement.internal.C6514z5.c(h().H());
        j().K().b("Tcf preferences read", c6514z5C);
        if (h().C(c6514z5C)) {
            android.os.Bundle bundleB = c6514z5C.b();
            j().K().b("Consent generated from Tcf", bundleB);
            if (bundleB != android.os.Bundle.EMPTY) {
                N(bundleB, -30, b().a());
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("_tcfd", c6514z5C.e());
            b1("auto", "_tcf", bundle);
        }
    }

    public final java.util.Map H(java.lang.String str, java.lang.String str2, boolean z6) {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2G;
        java.lang.String str3;
        if (!l().J()) {
            if (com.google.android.gms.measurement.internal.C6348c.a()) {
                c6442p2G = j().G();
                str3 = "Cannot get user properties from main thread";
            } else {
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                this.f42679a.l().v(atomicReference, 5000L, "get user properties", new com.google.android.gms.measurement.internal.RunnableC6360d4(this, atomicReference, null, str, str2, z6));
                java.util.List<com.google.android.gms.measurement.internal.Y5> list = (java.util.List) atomicReference.get();
                if (list != null) {
                    p170r.C7026a c7026a = new p170r.C7026a(list.size());
                    for (com.google.android.gms.measurement.internal.Y5 y6 : list) {
                        java.lang.Object objE = y6.e();
                        if (objE != null) {
                            c7026a.put(y6.f42230D, objE);
                        }
                    }
                    return c7026a;
                }
                j().G().b("Timed out waiting for handle get user properties, includeInternal", java.lang.Boolean.valueOf(z6));
            }
            return java.util.Collections.emptyMap();
        }
        c6442p2G = j().G();
        str3 = "Cannot get user properties from analytics worker thread";
        c6442p2G.a(str3);
        return java.util.Collections.emptyMap();
    }

    final void H0() {
        com.google.android.gms.measurement.internal.B5 b6;
        p103k2.a aVarT0;
        n();
        this.f41792m = false;
        if (A0().isEmpty() || this.f41788i || (b6 = (com.google.android.gms.measurement.internal.B5) A0().poll()) == null || (aVarT0 = i().T0()) == null) {
            return;
        }
        this.f41788i = true;
        j().K().b("Registering trigger URI", b6.f41738C);
        P4.d dVarD = aVarT0.d(android.net.Uri.parse(b6.f41738C));
        if (dVarD == null) {
            this.f41788i = false;
            A0().add(b6);
            return;
        }
        if (!d().t(com.google.android.gms.measurement.internal.G.f41839O0)) {
            android.util.SparseArray sparseArrayK = h().K();
            sparseArrayK.put(b6.f41740E, java.lang.Long.valueOf(b6.f41739D));
            h().v(sparseArrayK);
        }
        P4.b.a(dVarD, new com.google.android.gms.measurement.internal.R3(this, b6), new com.google.android.gms.measurement.internal.N3(this));
    }

    public final void I(long j6) {
        a1(null);
        l().D(new com.google.android.gms.measurement.internal.Z3(this, j6));
    }

    public final void I0() {
        n();
        j().F().a("Register tcfPrefChangeListener.");
        if (this.f41799t == null) {
            this.f41800u = new com.google.android.gms.measurement.internal.U3(this, this.f42679a);
            this.f41799t = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.M3
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
                    this.f42028a.L(sharedPreferences, str);
                }
            };
        }
        h().H().registerOnSharedPreferenceChangeListener(this.f41799t);
    }

    final void J(long j6, boolean z6) {
        n();
        v();
        j().F().a("Resetting analytics data (FE)");
        com.google.android.gms.measurement.internal.C6445p5 c6445p5U = u();
        c6445p5U.n();
        c6445p5U.f42595f.b();
        p().I();
        boolean zP = this.f42679a.p();
        com.google.android.gms.measurement.internal.C6511z2 c6511z2H = h();
        c6511z2H.f42728g.b(j6);
        if (!android.text.TextUtils.isEmpty(c6511z2H.h().f42745x.a())) {
            c6511z2H.f42745x.b(null);
        }
        c6511z2H.f42739r.b(0L);
        c6511z2H.f42740s.b(0L);
        if (!c6511z2H.d().W()) {
            c6511z2H.G(!zP);
        }
        c6511z2H.f42746y.b(null);
        c6511z2H.f42747z.b(0L);
        c6511z2H.f42723A.b(null);
        if (z6) {
            t().d0();
        }
        u().f42594e.a();
        this.f41797r = !zP;
    }

    final boolean J0() {
        return this.f41792m;
    }

    public final void K(android.content.Intent intent) {
        if (com.google.android.gms.internal.measurement.s7.a() && d().t(com.google.android.gms.measurement.internal.G.f41926z0)) {
            android.net.Uri data = intent.getData();
            if (data == null) {
                j().J().a("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            java.lang.String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                j().J().a("Preview Mode was not enabled.");
                d().L(null);
                return;
            }
            java.lang.String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (android.text.TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            j().J().b("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            d().L(queryParameter2);
        }
    }

    final /* synthetic */ void L(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        if ("IABTCF_TCString".equals(str)) {
            j().K().a("IABTCF_TCString change picked up in listener.");
            ((com.google.android.gms.measurement.internal.AbstractC6466t) Q3.AbstractC1477p.l(this.f41800u)).b(500L);
        }
    }

    final /* synthetic */ void M(android.os.Bundle bundle) {
        android.os.Bundle bundleA;
        if (bundle.isEmpty()) {
            bundleA = bundle;
        } else {
            bundleA = h().f42723A.a();
            if (d().t(com.google.android.gms.measurement.internal.G.f41888i1)) {
                bundleA = new android.os.Bundle(bundleA);
            }
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof java.lang.String) && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Double)) {
                    i();
                    if (com.google.android.gms.measurement.internal.d6.h0(obj)) {
                        i();
                        com.google.android.gms.measurement.internal.d6.Y(this.f41801v, 27, null, null, 0);
                    }
                    j().M().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (com.google.android.gms.measurement.internal.d6.J0(str)) {
                    j().M().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    bundleA.remove(str);
                } else if (i().l0("param", str, d().r(null, false), obj)) {
                    i().O(bundleA, str, obj);
                }
            }
            i();
            if (com.google.android.gms.measurement.internal.d6.g0(bundleA, d().y())) {
                i();
                com.google.android.gms.measurement.internal.d6.Y(this.f41801v, 26, null, null, 0);
                j().M().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        h().f42723A.b(bundleA);
        if (!bundle.isEmpty() || d().t(com.google.android.gms.measurement.internal.G.f41882g1)) {
            t().C(bundleA);
        }
    }

    final void M0(long j6) {
        J(j6, true);
    }

    public final void N0(android.os.Bundle bundle) {
        O0(bundle, b().a());
    }

    final /* synthetic */ void O(android.os.Bundle bundle, long j6) {
        if (android.text.TextUtils.isEmpty(p().G())) {
            N(bundle, 0, j6);
        } else {
            j().M().a("Using developer consent only; google app id found");
        }
    }

    public final void O0(android.os.Bundle bundle, long j6) {
        Q3.AbstractC1477p.l(bundle);
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        if (!android.text.TextUtils.isEmpty(bundle2.getString("app_id"))) {
            j().L().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Q3.AbstractC1477p.l(bundle2);
        p085i4.o.a(bundle2, "app_id", java.lang.String.class, null);
        p085i4.o.a(bundle2, "origin", java.lang.String.class, null);
        p085i4.o.a(bundle2, "name", java.lang.String.class, null);
        p085i4.o.a(bundle2, "value", java.lang.Object.class, null);
        p085i4.o.a(bundle2, "trigger_event_name", java.lang.String.class, null);
        p085i4.o.a(bundle2, "trigger_timeout", java.lang.Long.class, 0L);
        p085i4.o.a(bundle2, "timed_out_event_name", java.lang.String.class, null);
        p085i4.o.a(bundle2, "timed_out_event_params", android.os.Bundle.class, null);
        p085i4.o.a(bundle2, "triggered_event_name", java.lang.String.class, null);
        p085i4.o.a(bundle2, "triggered_event_params", android.os.Bundle.class, null);
        p085i4.o.a(bundle2, "time_to_live", java.lang.Long.class, 0L);
        p085i4.o.a(bundle2, "expired_event_name", java.lang.String.class, null);
        p085i4.o.a(bundle2, "expired_event_params", android.os.Bundle.class, null);
        Q3.AbstractC1477p.f(bundle2.getString("name"));
        Q3.AbstractC1477p.f(bundle2.getString("origin"));
        Q3.AbstractC1477p.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j6);
        java.lang.String string = bundle2.getString("name");
        java.lang.Object obj = bundle2.get("value");
        if (i().r0(string) != 0) {
            j().G().b("Invalid conditional user property name", g().g(string));
            return;
        }
        if (i().w(string, obj) != 0) {
            j().G().c("Invalid conditional user property value", g().g(string), obj);
            return;
        }
        java.lang.Object objA0 = i().A0(string, obj);
        if (objA0 == null) {
            j().G().c("Unable to normalize conditional user property value", g().g(string), obj);
            return;
        }
        p085i4.o.b(bundle2, objA0);
        long j10 = bundle2.getLong("trigger_timeout");
        if (!android.text.TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j10 > 15552000000L || j10 < 1)) {
            j().G().c("Invalid conditional user property timeout", g().g(string), java.lang.Long.valueOf(j10));
            return;
        }
        long j11 = bundle2.getLong("time_to_live");
        if (j11 > 15552000000L || j11 < 1) {
            j().G().c("Invalid conditional user property time to live", g().g(string), java.lang.Long.valueOf(j11));
        } else {
            l().D(new com.google.android.gms.measurement.internal.RunnableC6353c4(this, bundle2));
        }
    }

    public final void P(com.google.android.gms.internal.measurement.U0 u6) {
        l().D(new com.google.android.gms.measurement.internal.RunnableC6381g4(this, u6));
    }

    final void Q(com.google.android.gms.measurement.internal.C6480v c6480v, boolean z6) {
        com.google.android.gms.measurement.internal.RunnableC6423m4 runnableC6423m4 = new com.google.android.gms.measurement.internal.RunnableC6423m4(this, c6480v);
        if (!z6) {
            l().D(runnableC6423m4);
        } else {
            n();
            runnableC6423m4.run();
        }
    }

    final void R(com.google.android.gms.measurement.internal.A3 a6) {
        n();
        boolean z6 = (a6.z() && a6.y()) || t().i0();
        if (z6 != this.f42679a.q()) {
            this.f42679a.w(z6);
            java.lang.Boolean boolO = h().O();
            if (!z6 || boolO == null || boolO.booleanValue()) {
                c0(java.lang.Boolean.valueOf(z6), false);
            }
        }
    }

    public final void R0(p085i4.t tVar) {
        v();
        Q3.AbstractC1477p.l(tVar);
        if (this.f41784e.remove(tVar)) {
            return;
        }
        j().L().a("OnEventListener had not been registered");
    }

    public final void S(com.google.android.gms.measurement.internal.A3 a6, long j6, boolean z6) {
        com.google.android.gms.measurement.internal.A3 a10;
        boolean z10;
        boolean zU;
        boolean z11;
        com.google.android.gms.measurement.internal.A3 a3P = a6;
        v();
        int iB = a6.b();
        if (iB != -10) {
            p085i4.p pVarT = a6.t();
            p085i4.p pVar = p085i4.p.UNINITIALIZED;
            if (pVarT == pVar && a6.v() == pVar) {
                j().M().a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.f41787h) {
            try {
                a10 = this.f41793n;
                z10 = false;
                if (com.google.android.gms.measurement.internal.A3.l(iB, a10.b())) {
                    zU = a6.u(this.f41793n);
                    if (a6.z() && !this.f41793n.z()) {
                        z10 = true;
                    }
                    a3P = a6.p(this.f41793n);
                    this.f41793n = a3P;
                    z11 = z10;
                    z10 = true;
                } else {
                    zU = false;
                    z11 = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (!z10) {
            j().J().b("Ignoring lower-priority consent settings, proposed settings", a3P);
            return;
        }
        long andIncrement = this.f41794o.getAndIncrement();
        if (zU) {
            a1(null);
            com.google.android.gms.measurement.internal.RunnableC6416l4 runnableC6416l4 = new com.google.android.gms.measurement.internal.RunnableC6416l4(this, a3P, j6, andIncrement, z11, a10);
            if (!z6) {
                l().G(runnableC6416l4);
                return;
            } else {
                n();
                runnableC6416l4.run();
                return;
            }
        }
        com.google.android.gms.measurement.internal.RunnableC6444p4 runnableC6444p4 = new com.google.android.gms.measurement.internal.RunnableC6444p4(this, a3P, andIncrement, z11, a10);
        if (z6) {
            n();
            runnableC6444p4.run();
        } else if (iB == 30 || iB == -10) {
            l().G(runnableC6444p4);
        } else {
            l().D(runnableC6444p4);
        }
    }

    final /* synthetic */ void S0(java.lang.String str) {
        if (p().K(str)) {
            p().I();
        }
    }

    public final void U0(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        j0(str, str2, bundle, true, true, b().a());
    }

    public final void V0(boolean z6) {
        if (a().getApplicationContext() instanceof android.app.Application) {
            android.app.Application application = (android.app.Application) a().getApplicationContext();
            if (this.f41782c == null) {
                this.f41782c = new com.google.android.gms.measurement.internal.C6430n4(this);
            }
            if (z6) {
                application.unregisterActivityLifecycleCallbacks(this.f41782c);
                application.registerActivityLifecycleCallbacks(this.f41782c);
                j().K().a("Registered activity lifecycle callback");
            }
        }
    }

    public final void W0(long j6) {
        l().D(new com.google.android.gms.measurement.internal.V3(this, j6));
    }

    public final void X0(android.os.Bundle bundle) {
        final android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
        l().D(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.I3
            @Override // java.lang.Runnable
            public final void run() {
                this.f41987C.M(bundle2);
            }
        });
    }

    public final void Y0(final android.os.Bundle bundle, final long j6) {
        l().G(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.K3
            @Override // java.lang.Runnable
            public final void run() {
                this.f42009C.O(bundle, j6);
            }
        });
    }

    public final void Z(p085i4.t tVar) {
        v();
        Q3.AbstractC1477p.l(tVar);
        if (this.f41784e.add(tVar)) {
            return;
        }
        j().L().a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ android.content.Context a() {
        return super.a();
    }

    public final void a0(p085i4.u uVar) {
        p085i4.u uVar2;
        n();
        v();
        if (uVar != null && uVar != (uVar2 = this.f41783d)) {
            Q3.AbstractC1477p.p(uVar2 == null, "EventInterceptor already set.");
        }
        this.f41783d = uVar;
    }

    final void a1(java.lang.String str) {
        this.f41786g.set(str);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ V3.f b() {
        return super.b();
    }

    public final void b0(java.lang.Boolean bool) {
        v();
        l().D(new com.google.android.gms.measurement.internal.RunnableC6402j4(this, bool));
    }

    final void b1(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        n();
        e0(str, str2, b().a(), bundle);
    }

    public final void c1(boolean z6) {
        v();
        l().D(new com.google.android.gms.measurement.internal.T3(this, z6));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6376g d() {
        return super.d();
    }

    public final void d0(final java.lang.String str, long j6) {
        if (str != null && android.text.TextUtils.isEmpty(str)) {
            this.f42679a.j().L().a("User ID must be non-empty or null");
        } else {
            l().D(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.L3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42018C.S0(str);
                }
            });
            m0(null, "_id", str, true, j6);
        }
    }

    public final void d1(android.os.Bundle bundle, long j6) {
        N(bundle, -20, j6);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6494x e() {
        return super.e();
    }

    final void e0(java.lang.String str, java.lang.String str2, long j6, android.os.Bundle bundle) {
        n();
        f0(str, str2, j6, bundle, true, this.f41783d == null || com.google.android.gms.measurement.internal.d6.J0(str2), true, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6348c f() {
        return super.f();
    }

    protected final void f0(java.lang.String str, java.lang.String str2, long j6, android.os.Bundle bundle, boolean z6, boolean z10, boolean z11, java.lang.String str3) {
        long j10;
        int i6;
        int length;
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.l(bundle);
        n();
        v();
        if (!this.f42679a.p()) {
            j().F().a("Event not sent since app measurement is disabled");
            return;
        }
        java.util.List listH = p().H();
        if (listH != null && !listH.contains(str2)) {
            j().F().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f41785f) {
            this.f41785f = true;
            try {
                try {
                    (!this.f42679a.t() ? java.lang.Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, a().getClassLoader()) : java.lang.Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", android.content.Context.class).invoke(null, a());
                } catch (java.lang.Exception e6) {
                    j().L().b("Failed to invoke Tag Manager's initialize() method", e6);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                j().J().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            k0("auto", "_lgclid", bundle.getString("gclid"), b().a());
        }
        if (z6 && com.google.android.gms.measurement.internal.d6.M0(str2)) {
            i().N(bundle, h().f42723A.a());
        }
        if (!z11 && !"_iap".equals(str2)) {
            com.google.android.gms.measurement.internal.d6 d6VarL = this.f42679a.L();
            int i10 = 2;
            if (d6VarL.C0("event", str2)) {
                if (!d6VarL.p0("event", p085i4.q.f46678a, p085i4.q.f46679b, str2)) {
                    i10 = 13;
                } else if (d6VarL.j0("event", 40, str2)) {
                    i10 = 0;
                }
            }
            if (i10 != 0) {
                j().H().b("Invalid public event name. Event will not be logged (FE)", g().c(str2));
                this.f42679a.L();
                java.lang.String strJ = com.google.android.gms.measurement.internal.d6.J(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f42679a.L();
                com.google.android.gms.measurement.internal.d6.Y(this.f41801v, i10, "_ev", strJ, length);
                return;
            }
        }
        com.google.android.gms.measurement.internal.C6499x4 c6499x4C = s().C(false);
        if (c6499x4C != null && !bundle.containsKey("_sc")) {
            c6499x4C.f42703d = true;
        }
        com.google.android.gms.measurement.internal.d6.X(c6499x4C, bundle, z6 && !z11);
        boolean zEquals = "am".equals(str);
        boolean zJ0 = com.google.android.gms.measurement.internal.d6.J0(str2);
        if (z6 && this.f41783d != null && !zJ0 && !zEquals) {
            j().F().c("Passing event to registered event handler (FE)", g().c(str2), g().a(bundle));
            Q3.AbstractC1477p.l(this.f41783d);
            this.f41783d.a(str, str2, bundle, j6);
            return;
        }
        if (this.f42679a.s()) {
            int iV = i().v(str2);
            if (iV != 0) {
                j().H().b("Invalid event name. Event will not be logged (FE)", g().c(str2));
                i();
                java.lang.String strJ2 = com.google.android.gms.measurement.internal.d6.J(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f42679a.L();
                com.google.android.gms.measurement.internal.d6.Z(this.f41801v, str3, iV, "_ev", strJ2, length);
                return;
            }
            android.os.Bundle bundleF = i().F(str3, str2, bundle, V3.g.b("_o", "_sn", "_sc", "_si"), z11);
            Q3.AbstractC1477p.l(bundleF);
            if (s().C(false) != null && "_ae".equals(str2)) {
                com.google.android.gms.measurement.internal.C6479u5 c6479u5 = u().f42595f;
                long jC = c6479u5.f42659d.b().c();
                long j11 = jC - c6479u5.f42657b;
                c6479u5.f42657b = jC;
                if (j11 > 0) {
                    i().M(bundleF, j11);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                com.google.android.gms.measurement.internal.d6 d6VarI = i();
                java.lang.String string = bundleF.getString("_ffr");
                if (V3.r.b(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (j$.util.Objects.equals(string, d6VarI.h().f42745x.a())) {
                    d6VarI.j().F().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                d6VarI.h().f42745x.b(string);
            } else if ("_ae".equals(str2)) {
                java.lang.String strA = i().h().f42745x.a();
                if (!android.text.TextUtils.isEmpty(strA)) {
                    bundleF.putString("_ffr", strA);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(bundleF);
            boolean zF = d().t(com.google.android.gms.measurement.internal.G.f41841P0) ? u().F() : h().f42742u.b();
            if (h().f42739r.a() > 0 && h().z(j6) && zF) {
                j().K().a("Current session is expired, remove the session number, ID, and engagement time");
                j10 = 0;
                k0("auto", "_sid", null, b().a());
                k0("auto", "_sno", null, b().a());
                k0("auto", "_se", null, b().a());
                h().f42740s.b(0L);
            } else {
                j10 = 0;
            }
            if (bundleF.getLong("extend_session", j10) == 1) {
                j().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                i6 = 1;
                this.f42679a.K().f42594e.b(j6, true);
            } else {
                i6 = 1;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(bundleF.keySet());
            java.util.Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                java.lang.Object obj = arrayList2.get(i11);
                i11 += i6;
                java.lang.String str4 = (java.lang.String) obj;
                if (str4 != null) {
                    i();
                    android.os.Bundle[] bundleArrX0 = com.google.android.gms.measurement.internal.d6.x0(bundleF.get(str4));
                    if (bundleArrX0 != null) {
                        bundleF.putParcelableArray(str4, bundleArrX0);
                    }
                }
                i6 = 1;
            }
            int i12 = 0;
            while (i12 < arrayList.size()) {
                android.os.Bundle bundleE = (android.os.Bundle) arrayList.get(i12);
                java.lang.String str5 = i12 != 0 ? "_ep" : str2;
                bundleE.putString("_o", str);
                if (z10) {
                    bundleE = i().E(bundleE, null);
                }
                android.os.Bundle bundle2 = bundleE;
                t().I(new com.google.android.gms.measurement.internal.E(str5, new com.google.android.gms.measurement.internal.D(bundle2), str, j6), str3);
                if (!zEquals) {
                    java.util.Iterator it = this.f41784e.iterator();
                    while (it.hasNext()) {
                        ((p085i4.t) it.next()).a(str, str2, new android.os.Bundle(bundle2), j6);
                    }
                }
                i12++;
            }
            if (s().C(false) == null || !"_ae".equals(str2)) {
                return;
            }
            u().E(true, true, b().c());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6386h2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 h() {
        return super.h();
    }

    public final void h0(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        long jA = b().a();
        Q3.AbstractC1477p.f(str);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        l().D(new com.google.android.gms.measurement.internal.RunnableC6346b4(this, bundle2));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.d6 i() {
        return super.i();
    }

    public final void i0(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3) {
        m();
        T0(str, str2, b().a(), bundle, false, true, true, str3);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 j() {
        return super.j();
    }

    public final void j0(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z6, boolean z10, long j6) {
        java.lang.String str3 = str == null ? "app" : str;
        android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : bundle;
        if (j$.util.Objects.equals(str2, "screen_view")) {
            s().I(bundle2, j6);
        } else {
            T0(str3, str2, j6, bundle2, z10, !z10 || this.f41783d == null || com.google.android.gms.measurement.internal.d6.J0(str2), z6, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    final void k0(java.lang.String str, java.lang.String str2, java.lang.Object obj, long j6) {
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.f(str2);
        n();
        v();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof java.lang.String) {
                java.lang.String str3 = (java.lang.String) obj;
                if (!android.text.TextUtils.isEmpty(str3)) {
                    java.lang.Long lValueOf = java.lang.Long.valueOf("false".equals(str3.toLowerCase(java.util.Locale.ENGLISH)) ? 1L : 0L);
                    h().f42736o.b(lValueOf.longValue() == 1 ? "true" : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    h().f42736o.b("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                h().f42736o.b("unset");
                str2 = "_npa";
            }
            j().K().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        java.lang.String str4 = str2;
        java.lang.Object obj2 = obj;
        if (!this.f42679a.p()) {
            j().K().a("User property not set since app measurement is disabled");
        } else if (this.f42679a.s()) {
            t().M(new com.google.android.gms.measurement.internal.Y5(str4, j6, obj2, str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    public final void l0(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z6) {
        m0(str, str2, obj, z6, b().a());
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public final void m0(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z6, long j6) {
        int iR0;
        int length;
        if (str == null) {
            str = "app";
        }
        java.lang.String str3 = str;
        if (z6) {
            iR0 = i().r0(str2);
        } else {
            com.google.android.gms.measurement.internal.d6 d6VarI = i();
            if (!d6VarI.C0("user property", str2)) {
                iR0 = 6;
            } else if (!d6VarI.o0("user property", p085i4.r.f46682a, str2)) {
                iR0 = 15;
            } else if (d6VarI.j0("user property", 24, str2)) {
                iR0 = 0;
            } else {
                iR0 = 6;
            }
        }
        if (iR0 != 0) {
            i();
            java.lang.String strJ = com.google.android.gms.measurement.internal.d6.J(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.f42679a.L();
            com.google.android.gms.measurement.internal.d6.Y(this.f41801v, iR0, "_ev", strJ, length);
            return;
        }
        if (obj == null) {
            g0(str3, str2, j6, null);
            return;
        }
        int iW = i().w(str2, obj);
        if (iW == 0) {
            java.lang.Object objA0 = i().A0(str2, obj);
            if (objA0 != null) {
                g0(str3, str2, j6, objA0);
                return;
            }
            return;
        }
        i();
        java.lang.String strJ2 = com.google.android.gms.measurement.internal.d6.J(str2, 24, true);
        length = ((obj instanceof java.lang.String) || (obj instanceof java.lang.CharSequence)) ? java.lang.String.valueOf(obj).length() : 0;
        this.f42679a.L();
        com.google.android.gms.measurement.internal.d6.Y(this.f41801v, iW, "_ev", strJ2, length);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    final /* synthetic */ void n0(java.util.List list) {
        n();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.util.SparseArray sparseArrayK = h().K();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.measurement.internal.B5 b6 = (com.google.android.gms.measurement.internal.B5) it.next();
                if (!sparseArrayK.contains(b6.f41740E) || ((java.lang.Long) sparseArrayK.get(b6.f41740E)).longValue() < b6.f41739D) {
                    A0().add(b6);
                }
            }
            H0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6501y o() {
        return super.o();
    }

    final /* synthetic */ void o0(java.util.concurrent.atomic.AtomicReference atomicReference) {
        android.os.Bundle bundleA = h().f42737p.a();
        com.google.android.gms.measurement.internal.F4 f4T = t();
        if (bundleA == null) {
            bundleA = new android.os.Bundle();
        }
        f4T.R(atomicReference, bundleA);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6379g2 p() {
        return super.p();
    }

    public final android.app.Application.ActivityLifecycleCallbacks p0() {
        return this.f41782c;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6372f2 q() {
        return super.q();
    }

    public final p085i4.C6650b q0() {
        n();
        return t().V();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.F3 r() {
        return super.r();
    }

    public final java.lang.Boolean r0() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Boolean) l().v(atomicReference, 15000L, "boolean test flag value", new com.google.android.gms.measurement.internal.P3(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6492w4 s() {
        return super.s();
    }

    public final java.lang.Double s0() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Double) l().v(atomicReference, 15000L, "double test flag value", new com.google.android.gms.measurement.internal.RunnableC6409k4(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.F4 t() {
        return super.t();
    }

    public final java.lang.Integer t0() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Integer) l().v(atomicReference, 15000L, "int test flag value", new com.google.android.gms.measurement.internal.RunnableC6388h4(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6445p5 u() {
        return super.u();
    }

    public final java.lang.Long u0() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Long) l().v(atomicReference, 15000L, "long test flag value", new com.google.android.gms.measurement.internal.RunnableC6395i4(this, atomicReference));
    }

    public final java.lang.String v0() {
        return (java.lang.String) this.f41786g.get();
    }

    public final java.lang.String w0() {
        com.google.android.gms.measurement.internal.C6499x4 c6499x4P = this.f42679a.I().P();
        if (c6499x4P != null) {
            return c6499x4P.f42701b;
        }
        return null;
    }

    public final java.lang.String x0() {
        com.google.android.gms.measurement.internal.C6499x4 c6499x4P = this.f42679a.I().P();
        if (c6499x4P != null) {
            return c6499x4P.f42700a;
        }
        return null;
    }

    public final java.lang.String y0() {
        if (this.f42679a.M() != null) {
            return this.f42679a.M();
        }
        try {
            return new p085i4.n(a(), this.f42679a.P()).b("google_app_id");
        } catch (java.lang.IllegalStateException e6) {
            this.f42679a.j().G().b("getGoogleAppId failed with exception", e6);
            return null;
        }
    }

    public final java.lang.String z0() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.String) l().v(atomicReference, 15000L, "String test flag value", new com.google.android.gms.measurement.internal.Y3(this, atomicReference));
    }
}
