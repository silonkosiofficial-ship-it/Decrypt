package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public class S2 implements com.google.android.gms.measurement.internal.InterfaceC6505y3 {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static volatile com.google.android.gms.measurement.internal.S2 f42115I;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private volatile java.lang.Boolean f42116A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private java.lang.Boolean f42117B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Boolean f42118C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile boolean f42119D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f42120E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f42121F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final long f42123H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f42124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f42125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f42126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f42127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f42128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6348c f42129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6376g f42130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6511z2 f42131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6428n2 f42132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.P2 f42133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6445p5 f42134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.d6 f42135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6386h2 f42136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final V3.f f42137n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6492w4 f42138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.F3 f42139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6501y f42140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6464s4 f42141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final java.lang.String f42142s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.C6372f2 f42143t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.F4 f42144u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.C6494x f42145v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.C6379g2 f42146w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private java.lang.Boolean f42148y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f42149z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f42147x = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicInteger f42122G = new java.util.concurrent.atomic.AtomicInteger(0);

    private S2(com.google.android.gms.measurement.internal.D3 d6) {
        android.os.Bundle bundle;
        boolean z6 = false;
        Q3.AbstractC1477p.l(d6);
        com.google.android.gms.measurement.internal.C6348c c6348c = new com.google.android.gms.measurement.internal.C6348c(d6.f41756a);
        this.f42129f = c6348c;
        com.google.android.gms.measurement.internal.AbstractC6358d2.f42339a = c6348c;
        android.content.Context context = d6.f41756a;
        this.f42124a = context;
        this.f42125b = d6.f41757b;
        this.f42126c = d6.f41758c;
        this.f42127d = d6.f41759d;
        this.f42128e = d6.f41763h;
        this.f42116A = d6.f41760e;
        this.f42142s = d6.f41765j;
        this.f42119D = true;
        com.google.android.gms.internal.measurement.C5979c1 c5979c1 = d6.f41762g;
        if (c5979c1 != null && (bundle = c5979c1.f40811I) != null) {
            java.lang.Object obj = bundle.get("measurementEnabled");
            if (obj instanceof java.lang.Boolean) {
                this.f42117B = (java.lang.Boolean) obj;
            }
            java.lang.Object obj2 = c5979c1.f40811I.get("measurementDeactivated");
            if (obj2 instanceof java.lang.Boolean) {
                this.f42118C = (java.lang.Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.AbstractC6053k3.l(context);
        V3.f fVarD = V3.i.d();
        this.f42137n = fVarD;
        java.lang.Long l6 = d6.f41764i;
        this.f42123H = l6 != null ? l6.longValue() : fVarD.a();
        this.f42130g = new com.google.android.gms.measurement.internal.C6376g(this);
        com.google.android.gms.measurement.internal.C6511z2 c6511z2 = new com.google.android.gms.measurement.internal.C6511z2(this);
        c6511z2.q();
        this.f42131h = c6511z2;
        com.google.android.gms.measurement.internal.C6428n2 c6428n2 = new com.google.android.gms.measurement.internal.C6428n2(this);
        c6428n2.q();
        this.f42132i = c6428n2;
        com.google.android.gms.measurement.internal.d6 d6Var = new com.google.android.gms.measurement.internal.d6(this);
        d6Var.q();
        this.f42135l = d6Var;
        this.f42136m = new com.google.android.gms.measurement.internal.C6386h2(new com.google.android.gms.measurement.internal.C3(d6, this));
        this.f42140q = new com.google.android.gms.measurement.internal.C6501y(this);
        com.google.android.gms.measurement.internal.C6492w4 c6492w4 = new com.google.android.gms.measurement.internal.C6492w4(this);
        c6492w4.w();
        this.f42138o = c6492w4;
        com.google.android.gms.measurement.internal.F3 f6 = new com.google.android.gms.measurement.internal.F3(this);
        f6.w();
        this.f42139p = f6;
        com.google.android.gms.measurement.internal.C6445p5 c6445p5 = new com.google.android.gms.measurement.internal.C6445p5(this);
        c6445p5.w();
        this.f42134k = c6445p5;
        com.google.android.gms.measurement.internal.C6464s4 c6464s4 = new com.google.android.gms.measurement.internal.C6464s4(this);
        c6464s4.q();
        this.f42141r = c6464s4;
        com.google.android.gms.measurement.internal.P2 p6 = new com.google.android.gms.measurement.internal.P2(this);
        p6.q();
        this.f42133j = p6;
        com.google.android.gms.internal.measurement.C5979c1 c5979c2 = d6.f41762g;
        if (c5979c2 != null && c5979c2.f40806D != 0) {
            z6 = true;
        }
        boolean z10 = !z6;
        if (context.getApplicationContext() instanceof android.app.Application) {
            H().V0(z10);
        } else {
            j().L().a("Application context is not an Application");
        }
        p6.D(new com.google.android.gms.measurement.internal.Y2(this, d6));
    }

    public static com.google.android.gms.measurement.internal.S2 c(android.content.Context context, com.google.android.gms.internal.measurement.C5979c1 c5979c1, java.lang.Long l6) {
        android.os.Bundle bundle;
        if (c5979c1 != null && (c5979c1.f40809G == null || c5979c1.f40810H == null)) {
            c5979c1 = new com.google.android.gms.internal.measurement.C5979c1(c5979c1.f40805C, c5979c1.f40806D, c5979c1.f40807E, c5979c1.f40808F, null, null, c5979c1.f40811I, null);
        }
        Q3.AbstractC1477p.l(context);
        Q3.AbstractC1477p.l(context.getApplicationContext());
        if (f42115I == null) {
            synchronized (com.google.android.gms.measurement.internal.S2.class) {
                try {
                    if (f42115I == null) {
                        f42115I = new com.google.android.gms.measurement.internal.S2(new com.google.android.gms.measurement.internal.D3(context, c5979c1, l6));
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } else if (c5979c1 != null && (bundle = c5979c1.f40811I) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Q3.AbstractC1477p.l(f42115I);
            f42115I.m(c5979c1.f40811I.getBoolean("dataCollectionDefaultEnabled"));
        }
        Q3.AbstractC1477p.l(f42115I);
        return f42115I;
    }

    private static void e(com.google.android.gms.measurement.internal.AbstractC6504y2 abstractC6504y2) {
        if (abstractC6504y2 == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
        if (abstractC6504y2.z()) {
            return;
        }
        throw new java.lang.IllegalStateException("Component not initialized: " + java.lang.String.valueOf(abstractC6504y2.getClass()));
    }

    static /* synthetic */ void g(com.google.android.gms.measurement.internal.S2 s6, com.google.android.gms.measurement.internal.D3 d6) {
        s6.l().n();
        com.google.android.gms.measurement.internal.C6494x c6494x = new com.google.android.gms.measurement.internal.C6494x(s6);
        c6494x.q();
        s6.f42145v = c6494x;
        com.google.android.gms.measurement.internal.C6379g2 c6379g2 = new com.google.android.gms.measurement.internal.C6379g2(s6, d6.f41761f);
        c6379g2.w();
        s6.f42146w = c6379g2;
        com.google.android.gms.measurement.internal.C6372f2 c6372f2 = new com.google.android.gms.measurement.internal.C6372f2(s6);
        c6372f2.w();
        s6.f42143t = c6372f2;
        com.google.android.gms.measurement.internal.F4 f6 = new com.google.android.gms.measurement.internal.F4(s6);
        f6.w();
        s6.f42144u = f6;
        s6.f42135l.r();
        s6.f42131h.r();
        s6.f42146w.x();
        s6.j().J().b("App measurement initialized, version", 106000L);
        s6.j().J().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        java.lang.String strF = c6379g2.F();
        if (android.text.TextUtils.isEmpty(s6.f42125b)) {
            if (s6.L().E0(strF, s6.f42130g.T())) {
                s6.j().J().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                s6.j().J().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strF);
            }
        }
        s6.j().F().a("Debug-level message logging enabled");
        if (s6.f42120E != s6.f42122G.get()) {
            s6.j().G().c("Not all components initialized", java.lang.Integer.valueOf(s6.f42120E), java.lang.Integer.valueOf(s6.f42122G.get()));
        }
        s6.f42147x = true;
    }

    private static void h(com.google.android.gms.measurement.internal.AbstractC6491w3 abstractC6491w3) {
        if (abstractC6491w3 == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
    }

    private static void i(com.google.android.gms.measurement.internal.AbstractC6512z3 abstractC6512z3) {
        if (abstractC6512z3 == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
        if (abstractC6512z3.s()) {
            return;
        }
        throw new java.lang.IllegalStateException("Component not initialized: " + java.lang.String.valueOf(abstractC6512z3.getClass()));
    }

    private final com.google.android.gms.measurement.internal.C6464s4 v() {
        i(this.f42141r);
        return this.f42141r;
    }

    public final com.google.android.gms.measurement.internal.C6494x A() {
        i(this.f42145v);
        return this.f42145v;
    }

    public final com.google.android.gms.measurement.internal.C6379g2 B() {
        e(this.f42146w);
        return this.f42146w;
    }

    public final com.google.android.gms.measurement.internal.C6372f2 C() {
        e(this.f42143t);
        return this.f42143t;
    }

    public final com.google.android.gms.measurement.internal.C6386h2 D() {
        return this.f42136m;
    }

    public final com.google.android.gms.measurement.internal.C6428n2 E() {
        com.google.android.gms.measurement.internal.C6428n2 c6428n2 = this.f42132i;
        if (c6428n2 == null || !c6428n2.s()) {
            return null;
        }
        return this.f42132i;
    }

    public final com.google.android.gms.measurement.internal.C6511z2 F() {
        h(this.f42131h);
        return this.f42131h;
    }

    final com.google.android.gms.measurement.internal.P2 G() {
        return this.f42133j;
    }

    public final com.google.android.gms.measurement.internal.F3 H() {
        e(this.f42139p);
        return this.f42139p;
    }

    public final com.google.android.gms.measurement.internal.C6492w4 I() {
        e(this.f42138o);
        return this.f42138o;
    }

    public final com.google.android.gms.measurement.internal.F4 J() {
        e(this.f42144u);
        return this.f42144u;
    }

    public final com.google.android.gms.measurement.internal.C6445p5 K() {
        e(this.f42134k);
        return this.f42134k;
    }

    public final com.google.android.gms.measurement.internal.d6 L() {
        h(this.f42135l);
        return this.f42135l;
    }

    public final java.lang.String M() {
        return this.f42125b;
    }

    public final java.lang.String N() {
        return this.f42126c;
    }

    public final java.lang.String O() {
        return this.f42127d;
    }

    public final java.lang.String P() {
        return this.f42142s;
    }

    final void Q() {
        throw new java.lang.IllegalStateException("Unexpected call on client side");
    }

    final void R() {
        this.f42122G.incrementAndGet();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final android.content.Context a() {
        return this.f42124a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final V3.f b() {
        return this.f42137n;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0285  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:108:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:114:0x034d  */
    /* JADX WARN: Code duplicated, block: B:124:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:126:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:130:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01be  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x021c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0222  */
    /* JADX WARN: Code duplicated, block: B:89:0x022e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0247  */
    /* JADX WARN: Code duplicated, block: B:99:0x0270  */
    protected final void d(com.google.android.gms.internal.measurement.C5979c1 c5979c1) {
        com.google.android.gms.measurement.internal.A3 a3E;
        java.lang.Boolean boolE;
        com.google.android.gms.measurement.internal.F3 f3H;
        com.google.android.gms.measurement.internal.C6480v c6480v;
        java.lang.Boolean boolE2;
        boolean zBooleanValue;
        boolean zP;
        l().n();
        if (com.google.android.gms.internal.measurement.C6066l7.a() && this.f42130g.t(com.google.android.gms.measurement.internal.G.f41829J0) && L().X0()) {
            com.google.android.gms.measurement.internal.d6 d6VarL = L();
            d6VarL.n();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            androidx.core.content.a.h(d6VarL.a(), new p085i4.F(d6VarL.f42679a), intentFilter, 2);
            d6VarL.j().F().a("Registered app receiver");
        }
        com.google.android.gms.measurement.internal.A3 a3M = F().M();
        int iB = a3M.b();
        p085i4.p pVarB = this.f42130g.B("google_analytics_default_allow_ad_storage", false);
        p085i4.p pVarB2 = this.f42130g.B("google_analytics_default_allow_analytics_storage", false);
        p085i4.p pVar = p085i4.p.UNINITIALIZED;
        if (!(pVarB == pVar && pVarB2 == pVar) && F().y(-10)) {
            a3E = com.google.android.gms.measurement.internal.A3.e(pVarB, pVarB2, -10);
        } else {
            if (!android.text.TextUtils.isEmpty(B().G()) && (iB == 0 || iB == 30 || iB == 10 || iB == 30 || iB == 30 || iB == 40)) {
                H().S(new com.google.android.gms.measurement.internal.A3(null, null, -10), this.f42123H, false);
            } else if (android.text.TextUtils.isEmpty(B().G()) && c5979c1 != null && c5979c1.f40811I != null && F().y(30)) {
                a3E = com.google.android.gms.measurement.internal.A3.c(c5979c1.f40811I, 30);
                if (!a3E.A()) {
                }
            }
            a3E = null;
        }
        if (a3E != null) {
            H().S(a3E, this.f42123H, true);
            a3M = a3E;
        }
        H().R(a3M);
        int iA = F().L().a();
        p085i4.p pVarB3 = this.f42130g.B("google_analytics_default_allow_ad_personalization_signals", true);
        if (pVarB3 != pVar) {
            j().K().b("Default ad personalization consent from Manifest", pVarB3);
        }
        p085i4.p pVarB4 = this.f42130g.B("google_analytics_default_allow_ad_user_data", true);
        if (pVarB4 == pVar || !com.google.android.gms.measurement.internal.A3.l(-10, iA)) {
            if (android.text.TextUtils.isEmpty(B().G()) || !(iA == 0 || iA == 30)) {
                if (android.text.TextUtils.isEmpty(B().G()) && c5979c1 != null && c5979c1.f40811I != null && com.google.android.gms.measurement.internal.A3.l(30, iA)) {
                    com.google.android.gms.measurement.internal.C6480v c6480vB = com.google.android.gms.measurement.internal.C6480v.b(c5979c1.f40811I, 30);
                    if (c6480vB.k()) {
                        H().Q(c6480vB, true);
                    }
                }
                if (android.text.TextUtils.isEmpty(B().G()) && c5979c1 != null && c5979c1.f40811I != null && F().f42736o.a() == null && (boolE = com.google.android.gms.measurement.internal.C6480v.e(c5979c1.f40811I)) != null) {
                    H().l0(c5979c1.f40809G, "allow_personalized_ads", boolE.toString(), false);
                }
            } else {
                f3H = H();
                c6480v = new com.google.android.gms.measurement.internal.C6480v(null, -10);
            }
            boolE2 = this.f42130g.E("google_analytics_tcf_data_enabled");
            if (boolE2 == null) {
                zBooleanValue = true;
            } else {
                zBooleanValue = boolE2.booleanValue();
            }
            if (zBooleanValue) {
                j().F().a("TCF client enabled.");
                H().I0();
                H().G0();
            }
            if (F().f42728g.a() == 0) {
                j().K().b("Persisting first open", java.lang.Long.valueOf(this.f42123H));
                F().f42728g.b(this.f42123H);
            }
            H().f41796q.c();
            if (!s()) {
                if (android.text.TextUtils.isEmpty(B().G()) || !android.text.TextUtils.isEmpty(B().E())) {
                    L();
                    if (com.google.android.gms.measurement.internal.d6.m0(B().G(), F().S(), B().E(), F().R())) {
                        j().J().a("Rechecking which service to use due to a GMP App Id change");
                        F().T();
                        C().H();
                        this.f42144u.a0();
                        this.f42144u.Z();
                        F().f42728g.b(this.f42123H);
                        F().f42730i.b(null);
                    }
                    F().I(B().G());
                    F().F(B().E());
                }
                if (!F().M().m(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE)) {
                    F().f42730i.b(null);
                }
                H().a1(F().f42730i.a());
                if (!L().Y0() && !android.text.TextUtils.isEmpty(F().f42745x.a())) {
                    j().L().a("Remote config removed with active feature rollouts");
                    F().f42745x.b(null);
                }
                if (android.text.TextUtils.isEmpty(B().G()) || !android.text.TextUtils.isEmpty(B().E())) {
                    zP = p();
                    if (!F().D() && !this.f42130g.W()) {
                        F().G(!zP);
                    }
                    if (zP) {
                        H().C0();
                    }
                    K().f42594e.a();
                    J().Q(new java.util.concurrent.atomic.AtomicReference());
                    J().C(F().f42723A.a());
                }
            } else if (p()) {
                if (!L().F0("android.permission.INTERNET")) {
                    j().G().a("App is missing INTERNET permission");
                }
                if (!L().F0("android.permission.ACCESS_NETWORK_STATE")) {
                    j().G().a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!W3.e.a(this.f42124a).g() && !this.f42130g.X()) {
                    if (!com.google.android.gms.measurement.internal.d6.d0(this.f42124a)) {
                        j().G().a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!com.google.android.gms.measurement.internal.d6.e0(this.f42124a, false)) {
                        j().G().a("AppMeasurementService not registered/enabled");
                    }
                }
                j().G().a("Uploading is not possible. App measurement disabled");
            }
            if (com.google.android.gms.internal.measurement.C6066l7.a() && this.f42130g.t(com.google.android.gms.measurement.internal.G.f41829J0) && L().X0()) {
                final com.google.android.gms.measurement.internal.F3 f3H2 = H();
                j$.util.Objects.requireNonNull(f3H2);
                new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.W2
                    @Override // java.lang.Runnable
                    public final void run() {
                        f3H2.E0();
                    }
                }).start();
            }
            F().f42738q.a(true);
        }
        f3H = H();
        c6480v = com.google.android.gms.measurement.internal.C6480v.c(pVarB4, -10);
        f3H.Q(c6480v, true);
        boolE2 = this.f42130g.E("google_analytics_tcf_data_enabled");
        if (boolE2 == null) {
            zBooleanValue = true;
        } else {
            zBooleanValue = boolE2.booleanValue();
        }
        if (zBooleanValue) {
            j().F().a("TCF client enabled.");
            H().I0();
            H().G0();
        }
        if (F().f42728g.a() == 0) {
            j().K().b("Persisting first open", java.lang.Long.valueOf(this.f42123H));
            F().f42728g.b(this.f42123H);
        }
        H().f41796q.c();
        if (!s()) {
            if (android.text.TextUtils.isEmpty(B().G())) {
                L();
                if (com.google.android.gms.measurement.internal.d6.m0(B().G(), F().S(), B().E(), F().R())) {
                    j().J().a("Rechecking which service to use due to a GMP App Id change");
                    F().T();
                    C().H();
                    this.f42144u.a0();
                    this.f42144u.Z();
                    F().f42728g.b(this.f42123H);
                    F().f42730i.b(null);
                }
                F().I(B().G());
                F().F(B().E());
            } else {
                L();
                if (com.google.android.gms.measurement.internal.d6.m0(B().G(), F().S(), B().E(), F().R())) {
                    j().J().a("Rechecking which service to use due to a GMP App Id change");
                    F().T();
                    C().H();
                    this.f42144u.a0();
                    this.f42144u.Z();
                    F().f42728g.b(this.f42123H);
                    F().f42730i.b(null);
                }
                F().I(B().G());
                F().F(B().E());
            }
            if (!F().M().m(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE)) {
                F().f42730i.b(null);
            }
            H().a1(F().f42730i.a());
            if (!L().Y0()) {
                j().L().a("Remote config removed with active feature rollouts");
                F().f42745x.b(null);
            }
            if (android.text.TextUtils.isEmpty(B().G())) {
                zP = p();
                if (!F().D()) {
                    F().G(!zP);
                }
                if (zP) {
                    H().C0();
                }
                K().f42594e.a();
                J().Q(new java.util.concurrent.atomic.AtomicReference());
                J().C(F().f42723A.a());
            } else {
                zP = p();
                if (!F().D()) {
                    F().G(!zP);
                }
                if (zP) {
                    H().C0();
                }
                K().f42594e.a();
                J().Q(new java.util.concurrent.atomic.AtomicReference());
                J().C(F().f42723A.a());
            }
        } else if (p()) {
            if (!L().F0("android.permission.INTERNET")) {
                j().G().a("App is missing INTERNET permission");
            }
            if (!L().F0("android.permission.ACCESS_NETWORK_STATE")) {
                j().G().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!W3.e.a(this.f42124a).g()) {
                if (!com.google.android.gms.measurement.internal.d6.d0(this.f42124a)) {
                    j().G().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!com.google.android.gms.measurement.internal.d6.e0(this.f42124a, false)) {
                    j().G().a("AppMeasurementService not registered/enabled");
                }
            }
            j().G().a("Uploading is not possible. App measurement disabled");
        }
        if (com.google.android.gms.internal.measurement.C6066l7.a()) {
            final com.google.android.gms.measurement.internal.F3 f3H3 = H();
            j$.util.Objects.requireNonNull(f3H3);
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.W2
                @Override // java.lang.Runnable
                public final void run() {
                    f3H3.E0();
                }
            }).start();
        }
        F().f42738q.a(true);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final com.google.android.gms.measurement.internal.C6348c f() {
        return this.f42129f;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final com.google.android.gms.measurement.internal.C6428n2 j() {
        i(this.f42132i);
        return this.f42132i;
    }

    final /* synthetic */ void k(java.lang.String str, int i6, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
        if ((i6 != 200 && i6 != 204 && i6 != 304) || th != null) {
            j().L().c("Network Request for Deferred Deep Link failed. response, exception", java.lang.Integer.valueOf(i6), th);
            return;
        }
        F().f42743v.a(true);
        if (bArr == null || bArr.length == 0) {
            j().F().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            java.lang.String strOptString = jSONObject.optString("deeplink", "");
            if (android.text.TextUtils.isEmpty(strOptString)) {
                j().F().a("Deferred Deep Link is empty.");
                return;
            }
            java.lang.String strOptString2 = jSONObject.optString("gclid", "");
            java.lang.String strOptString3 = jSONObject.optString("gbraid", "");
            java.lang.String strOptString4 = jSONObject.optString("gad_source", "");
            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
            android.os.Bundle bundle = new android.os.Bundle();
            if (com.google.android.gms.internal.measurement.S6.a() && this.f42130g.t(com.google.android.gms.measurement.internal.G.f41851U0)) {
                if (!L().L0(strOptString)) {
                    j().L().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                }
                if (!android.text.TextUtils.isEmpty(strOptString3)) {
                    bundle.putString("gbraid", strOptString3);
                }
                if (!android.text.TextUtils.isEmpty(strOptString4)) {
                    bundle.putString("gad_source", strOptString4);
                }
            } else if (!L().L0(strOptString)) {
                j().L().c("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                return;
            }
            if (com.google.android.gms.internal.measurement.S6.a()) {
                this.f42130g.t(com.google.android.gms.measurement.internal.G.f41851U0);
            }
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            this.f42139p.b1("auto", "_cmp", bundle);
            com.google.android.gms.measurement.internal.d6 d6VarL = L();
            if (android.text.TextUtils.isEmpty(strOptString) || !d6VarL.i0(strOptString, dOptDouble)) {
                return;
            }
            d6VarL.a().sendBroadcast(new android.content.Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (org.json.JSONException e6) {
            j().G().b("Failed to parse the Deferred Deep Link response. exception", e6);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final com.google.android.gms.measurement.internal.P2 l() {
        i(this.f42133j);
        return this.f42133j;
    }

    final void m(boolean z6) {
        this.f42116A = java.lang.Boolean.valueOf(z6);
    }

    final void n() {
        this.f42120E++;
    }

    public final boolean o() {
        return this.f42116A != null && this.f42116A.booleanValue();
    }

    public final boolean p() {
        return x() == 0;
    }

    public final boolean q() {
        l().n();
        return this.f42119D;
    }

    public final boolean r() {
        return android.text.TextUtils.isEmpty(this.f42125b);
    }

    protected final boolean s() {
        if (!this.f42147x) {
            throw new java.lang.IllegalStateException("AppMeasurement is not initialized");
        }
        l().n();
        java.lang.Boolean bool = this.f42148y;
        if (bool == null || this.f42149z == 0 || (bool != null && !bool.booleanValue() && java.lang.Math.abs(this.f42137n.c() - this.f42149z) > 1000)) {
            this.f42149z = this.f42137n.c();
            boolean z6 = true;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(L().F0("android.permission.INTERNET") && L().F0("android.permission.ACCESS_NETWORK_STATE") && (W3.e.a(this.f42124a).g() || this.f42130g.X() || (com.google.android.gms.measurement.internal.d6.d0(this.f42124a) && com.google.android.gms.measurement.internal.d6.e0(this.f42124a, false))));
            this.f42148y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!L().k0(B().G(), B().E()) && android.text.TextUtils.isEmpty(B().E())) {
                    z6 = false;
                }
                this.f42148y = java.lang.Boolean.valueOf(z6);
            }
        }
        return this.f42148y.booleanValue();
    }

    public final boolean t() {
        return this.f42128e;
    }

    public final boolean u() {
        l().n();
        i(v());
        java.lang.String strF = B().F();
        if (!this.f42130g.U()) {
            j().K().a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        android.util.Pair pairU = F().u(strF);
        if (((java.lang.Boolean) pairU.second).booleanValue() || android.text.TextUtils.isEmpty((java.lang.CharSequence) pairU.first)) {
            j().K().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!v().w()) {
            j().L().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.google.android.gms.measurement.internal.F4 f4J = J();
        f4J.n();
        f4J.v();
        if (!f4J.k0() || f4J.i().I0() >= 234200) {
            p085i4.C6650b c6650bQ0 = H().q0();
            android.os.Bundle bundle = c6650bQ0 != null ? c6650bQ0.f46666C : null;
            if (bundle == null) {
                int i6 = this.f42121F;
                this.f42121F = i6 + 1;
                boolean z6 = i6 < 10;
                j().F().b("Failed to retrieve DMA consent from the service, " + (z6 ? "Retrying." : "Skipping.") + " retryCount", java.lang.Integer.valueOf(this.f42121F));
                return z6;
            }
            com.google.android.gms.measurement.internal.A3 a3C = com.google.android.gms.measurement.internal.A3.c(bundle, 100);
            sb.append("&gcs=");
            sb.append(a3C.w());
            com.google.android.gms.measurement.internal.C6480v c6480vB = com.google.android.gms.measurement.internal.C6480v.b(bundle, 100);
            sb.append("&dma=");
            sb.append(c6480vB.h() == java.lang.Boolean.FALSE ? 0 : 1);
            if (!android.text.TextUtils.isEmpty(c6480vB.i())) {
                sb.append("&dma_cps=");
                sb.append(c6480vB.i());
            }
            int i10 = com.google.android.gms.measurement.internal.C6480v.e(bundle) == java.lang.Boolean.TRUE ? 0 : 1;
            sb.append("&npa=");
            sb.append(i10);
            j().K().b("Consent query parameters to Bow", sb);
        }
        com.google.android.gms.measurement.internal.d6 d6VarL = L();
        B();
        java.net.URL urlK = d6VarL.K(106000L, strF, (java.lang.String) pairU.first, F().f42744w.a() - 1, sb.toString());
        if (urlK != null) {
            com.google.android.gms.measurement.internal.C6464s4 c6464s4V = v();
            com.google.android.gms.measurement.internal.InterfaceC6457r4 interfaceC6457r4 = new com.google.android.gms.measurement.internal.InterfaceC6457r4() { // from class: com.google.android.gms.measurement.internal.V2
                @Override // com.google.android.gms.measurement.internal.InterfaceC6457r4
                public final void a(java.lang.String str, int i11, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
                    this.f42173a.k(str, i11, th, bArr, map);
                }
            };
            c6464s4V.n();
            c6464s4V.p();
            Q3.AbstractC1477p.l(urlK);
            Q3.AbstractC1477p.l(interfaceC6457r4);
            c6464s4V.l().z(new com.google.android.gms.measurement.internal.RunnableC6478u4(c6464s4V, strF, urlK, null, null, interfaceC6457r4));
        }
        return false;
    }

    public final void w(boolean z6) {
        l().n();
        this.f42119D = z6;
    }

    public final int x() {
        l().n();
        if (this.f42130g.W()) {
            return 1;
        }
        java.lang.Boolean bool = this.f42118C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!q()) {
            return 8;
        }
        java.lang.Boolean boolP = F().P();
        if (boolP != null) {
            return boolP.booleanValue() ? 0 : 3;
        }
        java.lang.Boolean boolE = this.f42130g.E("firebase_analytics_collection_enabled");
        if (boolE != null) {
            return boolE.booleanValue() ? 0 : 4;
        }
        java.lang.Boolean bool2 = this.f42117B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.f42116A == null || this.f42116A.booleanValue()) ? 0 : 7;
    }

    public final com.google.android.gms.measurement.internal.C6501y y() {
        com.google.android.gms.measurement.internal.C6501y c6501y = this.f42140q;
        if (c6501y != null) {
            return c6501y;
        }
        throw new java.lang.IllegalStateException("Component not created");
    }

    public final com.google.android.gms.measurement.internal.C6376g z() {
        return this.f42130g;
    }
}
