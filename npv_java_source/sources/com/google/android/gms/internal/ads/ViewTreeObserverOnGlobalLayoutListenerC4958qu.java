package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC4958qu extends android.webkit.WebView implements android.webkit.DownloadListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, com.google.android.gms.internal.ads.InterfaceC2698Ot {

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final /* synthetic */ int f38344D0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private final android.view.WindowManager f38345A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4704od f38346B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2588Lu f38347C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private boolean f38348C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f38349D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4985r70 f38350E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4051ig f38351F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p224w3.a f38352G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private p174r3.n f38353H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p174r3.a f38354I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final android.util.DisplayMetrics f38355J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final float f38356K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private com.google.android.gms.internal.ads.R60 f38357L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private com.google.android.gms.internal.ads.U60 f38358M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f38359N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f38360O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC3097Zt f38361P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p204u3.x f38362Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private com.google.android.gms.internal.ads.QT f38363R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private com.google.android.gms.internal.ads.OT f38364S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2625Mu f38365T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final java.lang.String f38366U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f38367V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f38368W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f38369a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f38370b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private java.lang.Boolean f38371c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f38372d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final java.lang.String f38373e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.BinderC5287tu f38374f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f38375g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f38376h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3395ch f38377i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3176ah f38378j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5911zc f38379k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f38380l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f38381m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2604Mf f38382n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2604Mf f38383o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2604Mf f38384p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2641Nf f38385q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f38386r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private p204u3.x f38387s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f38388t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final p214v3.C7261o0 f38389u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f38390v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f38391w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f38392x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f38393y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private java.util.Map f38394z0;

    protected ViewTreeObserverOnGlobalLayoutListenerC4958qu(com.google.android.gms.internal.ads.C2588Lu c2588Lu, com.google.android.gms.internal.ads.C2625Mu c2625Mu, java.lang.String str, boolean z6, boolean z10, com.google.android.gms.internal.ads.Z9 z11, com.google.android.gms.internal.ads.C4051ig c4051ig, p224w3.a aVar, com.google.android.gms.internal.ads.C2752Qf c2752Qf, p174r3.n nVar, p174r3.a aVar2, com.google.android.gms.internal.ads.C4704od c4704od, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.U60 u60, com.google.android.gms.internal.ads.C4985r70 c4985r70) {
        com.google.android.gms.internal.ads.U60 u61;
        super(c2588Lu);
        this.f38359N = false;
        this.f38360O = false;
        this.f38372d0 = true;
        this.f38373e0 = "";
        this.f38390v0 = -1;
        this.f38391w0 = -1;
        this.f38392x0 = -1;
        this.f38393y0 = -1;
        this.f38347C = c2588Lu;
        this.f38365T = c2625Mu;
        this.f38366U = str;
        this.f38369a0 = z6;
        this.f38349D = z11;
        this.f38350E = c4985r70;
        this.f38351F = c4051ig;
        this.f38352G = aVar;
        this.f38353H = nVar;
        this.f38354I = aVar2;
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        this.f38345A0 = windowManager;
        p174r3.v.t();
        android.util.DisplayMetrics displayMetricsZ = p214v3.E0.Z(windowManager);
        this.f38355J = displayMetricsZ;
        this.f38356K = displayMetricsZ.density;
        this.f38346B0 = c4704od;
        this.f38357L = r60;
        this.f38358M = u60;
        this.f38389u0 = new p214v3.C7261o0(c2588Lu.a(), this, this, null);
        this.f38348C0 = false;
        setBackgroundColor(0);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.wb)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        final android.webkit.WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (java.lang.NullPointerException e6) {
            p224w3.p.e("Unable to enable Javascript.", e6);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.vb)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(p174r3.v.t().H(c2588Lu, aVar.f56217C));
        p174r3.v.t();
        final android.content.Context context = getContext();
        p214v3.AbstractC7247h0.a(context, new java.util.concurrent.Callable() { // from class: v3.w0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.google.android.gms.internal.ads.HandlerC2345Fe0 handlerC2345Fe0 = p214v3.E0.f55826l;
                java.lang.String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                android.webkit.WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25438V0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return java.lang.Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        C1();
        addJavascriptInterface(new com.google.android.gms.internal.ads.C5837yu(this, new com.google.android.gms.internal.ads.C5727xu(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        K1();
        com.google.android.gms.internal.ads.C2641Nf c2641Nf = new com.google.android.gms.internal.ads.C2641Nf(new com.google.android.gms.internal.ads.C2752Qf(true, "make_wv", this.f38366U));
        this.f38385q0 = c2641Nf;
        c2641Nf.a().c(null);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue() && (u61 = this.f38358M) != null && u61.f32114b != null) {
            c2641Nf.a().d("gqi", this.f38358M.f32114b);
        }
        c2641Nf.a();
        com.google.android.gms.internal.ads.C2604Mf c2604MfF = com.google.android.gms.internal.ads.C2752Qf.f();
        this.f38383o0 = c2604MfF;
        c2641Nf.b("native:view_create", c2604MfF);
        this.f38384p0 = null;
        this.f38382n0 = null;
        p214v3.C7253k0.a().b(c2588Lu);
        p174r3.v.s().u();
    }

    private final synchronized void C1() {
        com.google.android.gms.internal.ads.R60 r60 = this.f38357L;
        if (r60 != null && r60.f31185m0) {
            p224w3.p.b("Disabling hardware acceleration on an overlay.");
            E1();
            return;
        }
        if (!this.f38369a0 && !this.f38365T.i()) {
            p224w3.p.b("Enabling hardware acceleration on an AdView.");
            G1();
            return;
        }
        p224w3.p.b("Enabling hardware acceleration on an overlay.");
        G1();
    }

    private final synchronized void D1() {
        if (this.f38388t0) {
            return;
        }
        this.f38388t0 = true;
        p174r3.v.s().s();
    }

    private final synchronized void E1() {
        try {
            if (!this.f38370b0) {
                setLayerType(1, null);
            }
            this.f38370b0 = true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final void F1(boolean z6) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("isVisible", true != z6 ? "0" : "1");
        O("onAdVisibilityChanged", map);
    }

    private final synchronized void G1() {
        try {
            if (this.f38370b0) {
                setLayerType(0, null);
            }
            this.f38370b0 = false;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized void H1(java.lang.String str) {
        final java.lang.String str2 = "about:blank";
        try {
            p214v3.E0.f55826l.post(new java.lang.Runnable(str2) { // from class: com.google.android.gms.internal.ads.lu

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f37248D = "about:blank";

                @Override // java.lang.Runnable
                public final void run() {
                    this.f37247C.y1(this.f37248D);
                }
            });
        } catch (java.lang.Throwable th) {
            p174r3.v.s().x(th, "AdWebViewImpl.loadUrlUnsafe");
            p224w3.p.h("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void I1() {
        com.google.android.gms.internal.ads.AbstractC2420Hf.a(this.f38385q0.a(), this.f38383o0, "aeh2");
    }

    private final synchronized void J1() {
        try {
            java.util.Map map = this.f38394z0;
            if (map != null) {
                java.util.Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.internal.ads.AbstractC2880Ts) it.next()).a();
                }
            }
            this.f38394z0 = null;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final void K1() {
        com.google.android.gms.internal.ads.C2641Nf c2641Nf = this.f38385q0;
        if (c2641Nf == null) {
            return;
        }
        com.google.android.gms.internal.ads.C2752Qf c2752QfA = c2641Nf.a();
        com.google.android.gms.internal.ads.C2346Ff c2346FfH = p174r3.v.s().h();
        if (c2346FfH != null) {
            c2346FfH.f(c2752QfA);
        }
    }

    private final synchronized void L1() {
        java.lang.Boolean boolM = p174r3.v.s().m();
        this.f38371c0 = boolM;
        if (boolM == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                A1(java.lang.Boolean.TRUE);
            } catch (java.lang.IllegalStateException unused) {
                A1(java.lang.Boolean.FALSE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.MG
    public final void A() {
        com.google.android.gms.internal.ads.AbstractC3097Zt abstractC3097Zt = this.f38361P;
        if (abstractC3097Zt != null) {
            abstractC3097Zt.A();
        }
    }

    final void A1(java.lang.Boolean bool) {
        synchronized (this) {
            this.f38371c0 = bool;
        }
        p174r3.v.s().z(bool);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final void B(int i6) {
    }

    public final boolean B1() {
        int i6;
        int iX;
        if (this.f38361P.o0() || this.f38361P.p()) {
            p184s3.C7147y.b();
            android.util.DisplayMetrics displayMetrics = this.f38355J;
            int iX2 = p224w3.g.x(displayMetrics, displayMetrics.widthPixels);
            p184s3.C7147y.b();
            android.util.DisplayMetrics displayMetrics2 = this.f38355J;
            int iX3 = p224w3.g.x(displayMetrics2, displayMetrics2.heightPixels);
            android.app.Activity activityA = this.f38347C.a();
            if (activityA == null || activityA.getWindow() == null) {
                i6 = iX2;
                iX = iX3;
            } else {
                p174r3.v.t();
                int[] iArrQ = p214v3.E0.q(activityA);
                p184s3.C7147y.b();
                int iX4 = p224w3.g.x(this.f38355J, iArrQ[0]);
                p184s3.C7147y.b();
                iX = p224w3.g.x(this.f38355J, iArrQ[1]);
                i6 = iX4;
            }
            int i10 = this.f38391w0;
            if (i10 != iX2 || this.f38390v0 != iX3 || this.f38392x0 != i6 || this.f38393y0 != iX) {
                boolean z6 = (i10 == iX2 && this.f38390v0 == iX3) ? false : true;
                this.f38391w0 = iX2;
                this.f38390v0 = iX3;
                this.f38392x0 = i6;
                this.f38393y0 = iX;
                new com.google.android.gms.internal.ads.C5603wn(this, "").e(iX2, iX3, i6, iX, this.f38355J.density, this.f38345A0.getDefaultDisplay().getRotation());
                return z6;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256Cu
    public final void C(boolean z6, int i6, java.lang.String str, java.lang.String str2, boolean z10) {
        this.f38361P.y0(z6, i6, str, str2, z10);
    }

    @Override // p174r3.n
    public final synchronized void E() {
        p174r3.n nVar = this.f38353H;
        if (nVar != null) {
            nVar.E();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final void E0(int i6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final void F() {
        p204u3.x xVarP = P();
        if (xVarP != null) {
            xVarP.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final void F0(boolean z6, long j6) {
        java.util.HashMap map = new java.util.HashMap(2);
        map.put("success", true != z6 ? "0" : "1");
        map.put("duration", java.lang.Long.toString(j6));
        O("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Kk
    public final void G0(java.lang.String str, org.json.JSONObject jSONObject) {
        q(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC2367Fu
    public final com.google.android.gms.internal.ads.Z9 H() {
        return this.f38349D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void H0() {
        I1();
        java.util.HashMap map = new java.util.HashMap(1);
        map.put("version", this.f38352G.f56217C);
        O("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC2330Eu
    public final synchronized com.google.android.gms.internal.ads.C2625Mu I() {
        return this.f38365T;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void I0() {
        java.util.HashMap map = new java.util.HashMap(3);
        map.put("app_muted", java.lang.String.valueOf(p174r3.v.v().e()));
        map.put("app_volume", java.lang.String.valueOf(p174r3.v.v().a()));
        map.put("device_volume", java.lang.String.valueOf(p214v3.C7236c.b(getContext())));
        O("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void J0(boolean z6) {
        this.f38372d0 = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void K0(int i6) {
        p204u3.x xVar = this.f38362Q;
        if (xVar != null) {
            xVar.p6(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2633Nb
    public final void L(com.google.android.gms.internal.ads.C2596Mb c2596Mb) {
        boolean z6;
        synchronized (this) {
            z6 = c2596Mb.f29800j;
            this.f38375g0 = z6;
        }
        F1(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized boolean L0() {
        return this.f38368W;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2552Ku M() {
        return this.f38361P;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void M0(boolean z6) {
        this.f38361P.Z(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC2441Hu
    public final android.view.View N() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void N0(boolean z6) {
        this.f38348C0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5817yk
    public final void O(java.lang.String str, java.util.Map map) {
        try {
            a(str, p184s3.C7147y.b().l(map));
        } catch (org.json.JSONException unused) {
            p224w3.p.g("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void O0(android.content.Context context) {
        this.f38347C.setBaseContext(context);
        this.f38389u0.e(this.f38347C.a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized p204u3.x P() {
        return this.f38362Q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void P0(com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.U60 u60) {
        this.f38357L = r60;
        this.f38358M = u60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC2366Ft
    public final com.google.android.gms.internal.ads.R60 Q() {
        return this.f38357L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void Q0(com.google.android.gms.internal.ads.InterfaceC3176ah interfaceC3176ah) {
        this.f38378j0 = interfaceC3176ah;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized p204u3.x R() {
        return this.f38387s0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized boolean R0() {
        return this.f38369a0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void S0(int i6) {
        if (i6 == 0) {
            com.google.android.gms.internal.ads.C2641Nf c2641Nf = this.f38385q0;
            com.google.android.gms.internal.ads.AbstractC2420Hf.a(c2641Nf.a(), this.f38383o0, "aebb2");
        }
        I1();
        this.f38385q0.a();
        this.f38385q0.a().d("close_type", java.lang.String.valueOf(i6));
        java.util.HashMap map = new java.util.HashMap(2);
        map.put("closetype", java.lang.String.valueOf(i6));
        map.put("version", this.f38352G.f56217C);
        O("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final android.webkit.WebViewClient T() {
        return this.f38361P;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized boolean T0() {
        return this.f38380l0 > 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void U0(com.google.android.gms.internal.ads.InterfaceC5911zc interfaceC5911zc) {
        this.f38379k0 = interfaceC5911zc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void V0(java.lang.String str, V3.o oVar) {
        com.google.android.gms.internal.ads.AbstractC3097Zt abstractC3097Zt = this.f38361P;
        if (abstractC3097Zt != null) {
            abstractC3097Zt.i(str, oVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void W0(p204u3.x xVar) {
        this.f38362Q = xVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void X() {
        p214v3.AbstractC7265q0.k("Destroying WebView!");
        D1();
        p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC4848pu(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final java.util.List X0() {
        return new java.util.ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized java.lang.String Y() {
        return this.f38366U;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void Y0(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        com.google.android.gms.internal.ads.AbstractC3097Zt abstractC3097Zt = this.f38361P;
        if (abstractC3097Zt != null) {
            abstractC3097Zt.g(str, interfaceC3838gj);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256Cu
    public final void Z(p204u3.l lVar, boolean z6, boolean z10, java.lang.String str) {
        this.f38361P.u0(lVar, z6, z10, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void Z0(boolean z6) {
        if (z6) {
            try {
                setBackgroundColor(0);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        p204u3.x xVar = this.f38362Q;
        if (xVar != null) {
            xVar.q6(z6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5817yk
    public final void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String string = jSONObject.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        p224w3.p.b("Dispatching AFMA event: ".concat(sb.toString()));
        v1(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final com.google.android.gms.internal.ads.C4985r70 a1() {
        return this.f38350E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256Cu
    public final void b(boolean z6, int i6, java.lang.String str, boolean z10, boolean z11) {
        this.f38361P.a(z6, i6, str, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized com.google.android.gms.internal.ads.InterfaceC3395ch b0() {
        return this.f38377i0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void b1(com.google.android.gms.internal.ads.InterfaceC3395ch interfaceC3395ch) {
        this.f38377i0 = interfaceC3395ch;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void c1(com.google.android.gms.internal.ads.OT ot) {
        this.f38364S = ot;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized com.google.android.gms.internal.ads.OT d0() {
        return this.f38364S;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void d1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        try {
            if (L0()) {
                p224w3.p.g("#004 The webview is destroyed. Ignoring action.");
                return;
            }
            java.lang.String str5 = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25503b0);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (org.json.JSONException e6) {
                p224w3.p.h("Unable to build MRAID_ENV", e6);
                str4 = null;
            }
            super.loadDataWithBaseURL(str, com.google.android.gms.internal.ads.AbstractC2293Du.b(str2, str4), "text/html", "UTF-8", null);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void destroy() {
        try {
            K1();
            this.f38389u0.a();
            p204u3.x xVar = this.f38362Q;
            if (xVar != null) {
                xVar.b();
                this.f38362Q.m();
                this.f38362Q = null;
            }
            this.f38363R = null;
            this.f38364S = null;
            this.f38361P.W();
            this.f38379k0 = null;
            this.f38353H = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f38368W) {
                return;
            }
            p174r3.v.C().g(this);
            J1();
            this.f38368W = true;
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ga)).booleanValue()) {
                p214v3.AbstractC7265q0.k("Destroying the WebView immediately...");
                X();
                return;
            }
            android.app.Activity activityA = this.f38347C.a();
            if (activityA != null && activityA.isDestroyed()) {
                p214v3.AbstractC7265q0.k("Destroying the WebView immediately...");
                X();
            } else {
                p214v3.AbstractC7265q0.k("Initiating WebView self destruct sequence in 3...");
                p214v3.AbstractC7265q0.k("Loading blank page in WebView, 2...");
                H1("about:blank");
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final synchronized int e() {
        return this.f38386r0;
    }

    @Override // p184s3.InterfaceC7076a
    public final void e0() {
        com.google.android.gms.internal.ads.AbstractC3097Zt abstractC3097Zt = this.f38361P;
        if (abstractC3097Zt != null) {
            abstractC3097Zt.e0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized boolean e1() {
        return this.f38367V;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final java.lang.String str, final android.webkit.ValueCallback valueCallback) {
        if (L0()) {
            p224w3.p.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ha)).booleanValue() || android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ku
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37024C.w1(str, valueCallback);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void f0() {
        if (this.f38382n0 == null) {
            com.google.android.gms.internal.ads.C2641Nf c2641Nf = this.f38385q0;
            com.google.android.gms.internal.ads.AbstractC2420Hf.a(c2641Nf.a(), this.f38383o0, "aes2");
            this.f38385q0.a();
            com.google.android.gms.internal.ads.C2604Mf c2604MfF = com.google.android.gms.internal.ads.C2752Qf.f();
            this.f38382n0 = c2604MfF;
            this.f38385q0.b("native:view_show", c2604MfF);
        }
        java.util.HashMap map = new java.util.HashMap(1);
        map.put("version", this.f38352G.f56217C);
        O("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void f1(boolean z6) {
        try {
            boolean z10 = this.f38369a0;
            this.f38369a0 = z6;
            C1();
            if (z6 != z10) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25514c0)).booleanValue()) {
                    if (!this.f38365T.i()) {
                    }
                }
                new com.google.android.gms.internal.ads.C5603wn(this, "").g(true != z6 ? "default" : "expanded");
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f38368W) {
                        this.f38361P.W();
                        p174r3.v.C().g(this);
                        J1();
                        D1();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            super.finalize();
        } catch (java.lang.Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final int g() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized com.google.android.gms.internal.ads.QT g0() {
        return this.f38363R;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void g1(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        com.google.android.gms.internal.ads.AbstractC3097Zt abstractC3097Zt = this.f38361P;
        if (abstractC3097Zt != null) {
            abstractC3097Zt.b(str, interfaceC3838gj);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC5947zu, com.google.android.gms.internal.ads.InterfaceC3746fs
    public final android.app.Activity h() {
        return this.f38347C.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC5507vu
    public final com.google.android.gms.internal.ads.U60 h0() {
        return this.f38358M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final boolean h1(final boolean z6, final int i6) {
        destroy();
        this.f38346B0.b(new com.google.android.gms.internal.ads.InterfaceC4594nd() { // from class: com.google.android.gms.internal.ads.mu
            @Override // com.google.android.gms.internal.ads.InterfaceC4594nd
            public final void a(com.google.android.gms.internal.ads.C3004Xe c3004Xe) {
                int i10 = com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4958qu.f38344D0;
                com.google.android.gms.internal.ads.C2270De c2270DeD0 = com.google.android.gms.internal.ads.C2307Ee.d0();
                boolean zB = c2270DeD0.B();
                boolean z10 = z6;
                if (zB != z10) {
                    c2270DeD0.z(z10);
                }
                c2270DeD0.A(i6);
                c3004Xe.F((com.google.android.gms.internal.ads.C2307Ee) c2270DeD0.u());
            }
        });
        this.f38346B0.c(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final int i() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final android.webkit.WebView i0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void i1(p204u3.x xVar) {
        this.f38387s0 = xVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC3746fs
    public final p174r3.a j() {
        return this.f38354I;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void j0() {
        p214v3.AbstractC7265q0.k("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final boolean j1() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final com.google.android.gms.internal.ads.C2604Mf k() {
        return this.f38383o0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void k0() {
        if (this.f38384p0 == null) {
            this.f38385q0.a();
            com.google.android.gms.internal.ads.C2604Mf c2604MfF = com.google.android.gms.internal.ads.C2752Qf.f();
            this.f38384p0 = c2604MfF;
            this.f38385q0.b("native:view_load", c2604MfF);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void k1(boolean z6) {
        p204u3.x xVar;
        int i6 = this.f38380l0 + (true != z6 ? -1 : 1);
        this.f38380l0 = i6;
        if (i6 > 0 || (xVar = this.f38362Q) == null) {
            return;
        }
        xVar.r0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized com.google.android.gms.internal.ads.InterfaceC5911zc l0() {
        return this.f38379k0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void l1(com.google.android.gms.internal.ads.C2625Mu c2625Mu) {
        this.f38365T = c2625Mu;
        requestLayout();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (L0()) {
            p224w3.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (L0()) {
            p224w3.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void loadUrl(final java.lang.String str) {
        if (L0()) {
            p224w3.p.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.nu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37691C.x1(str);
                }
            });
        } catch (java.lang.Throwable th) {
            p174r3.v.s().x(th, "AdWebViewImpl.loadUrl");
            p224w3.p.h("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC3746fs
    public final com.google.android.gms.internal.ads.C2641Nf m() {
        return this.f38385q0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void m0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void m1(boolean z6) {
        p204u3.x xVar = this.f38362Q;
        if (xVar != null) {
            xVar.z6(this.f38361P.o0(), z6);
        } else {
            this.f38367V = z6;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC2404Gu, com.google.android.gms.internal.ads.InterfaceC3746fs
    public final p224w3.a n() {
        return this.f38352G;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void n0() {
        this.f38389u0.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized void n1(com.google.android.gms.internal.ads.QT qt) {
        this.f38363R = qt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Kk
    public final void o(java.lang.String str) {
        v1(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final P4.d o0() {
        com.google.android.gms.internal.ads.C4051ig c4051ig = this.f38351F;
        return c4051ig == null ? com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null) : c4051ig.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final synchronized boolean o1() {
        return this.f38372d0;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!L0()) {
                this.f38389u0.c();
            }
            if (this.f38348C0) {
                onResume();
                this.f38348C0 = false;
            }
            boolean z6 = this.f38375g0;
            com.google.android.gms.internal.ads.AbstractC3097Zt abstractC3097Zt = this.f38361P;
            if (abstractC3097Zt != null && abstractC3097Zt.p()) {
                if (!this.f38376h0) {
                    this.f38361P.z();
                    this.f38361P.F();
                    this.f38376h0 = true;
                }
                B1();
                z6 = true;
            }
            F1(z6);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        com.google.android.gms.internal.ads.AbstractC3097Zt abstractC3097Zt;
        synchronized (this) {
            try {
                if (!L0()) {
                    this.f38389u0.d();
                }
                super.onDetachedFromWindow();
                if (this.f38376h0 && (abstractC3097Zt = this.f38361P) != null && abstractC3097Zt.p() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.f38361P.z();
                    this.f38361P.F();
                    this.f38376h0 = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        F1(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j6) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setDataAndType(android.net.Uri.parse(str), str4);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Va)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            p174r3.v.t();
            p214v3.E0.t(getContext(), intent);
        } catch (android.content.ActivityNotFoundException e6) {
            p224w3.p.b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            p174r3.v.s().x(e6, "AdWebViewImpl.onDownloadStart: ".concat(java.lang.String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        if (L0()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zB1 = B1();
        p204u3.x xVarP = P();
        if (xVarP == null || !zB1) {
            return;
        }
        xVarP.n();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0083 A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:10:0x0010, B:12:0x0016, B:14:0x001a, B:17:0x0024, B:19:0x002c, B:22:0x0031, B:24:0x0039, B:26:0x004b, B:29:0x0050, B:31:0x0057, B:35:0x0061, B:38:0x0066, B:41:0x0077, B:49:0x008f, B:43:0x007e, B:46:0x0083, B:52:0x009c, B:54:0x00a4, B:56:0x00b6, B:59:0x00bb, B:61:0x00d7, B:63:0x00df, B:62:0x00db, B:66:0x00e4, B:68:0x00ec, B:71:0x00f7, B:80:0x011b, B:82:0x0122, B:86:0x0129, B:88:0x013b, B:90:0x0149, B:94:0x0156, B:97:0x015b, B:99:0x01a6, B:100:0x01aa, B:102:0x01b1, B:107:0x01be, B:109:0x01c4, B:110:0x01c7, B:112:0x01cb, B:113:0x01d4, B:116:0x01df), top: B:121:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected final synchronized void onMeasure(int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (L0()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.f38369a0 && !this.f38365T.f()) {
            if (this.f38365T.h()) {
                super.onMeasure(i6, i10);
                return;
            }
            if (this.f38365T.j()) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25441V3)).booleanValue()) {
                    super.onMeasure(i6, i10);
                    return;
                }
                com.google.android.gms.internal.ads.BinderC5287tu binderC5287tuS = s();
                float fD = binderC5287tuS != null ? binderC5287tuS.d() : 0.0f;
                if (fD == 0.0f) {
                    super.onMeasure(i6, i10);
                    return;
                }
                int size = android.view.View.MeasureSpec.getSize(i6);
                int size2 = android.view.View.MeasureSpec.getSize(i10);
                float f6 = size2 * fD;
                int i15 = (int) (size / fD);
                if (size2 != 0) {
                    i11 = (int) f6;
                    if (size == 0) {
                        i14 = size;
                    } else if (i11 != 0) {
                        i15 = (int) (i11 / fD);
                        i12 = size2;
                        i13 = i11;
                        i14 = i13;
                    }
                    i12 = size2;
                    i13 = i11;
                } else if (i15 != 0) {
                    i13 = (int) (i15 * fD);
                    i14 = size;
                    i12 = i15;
                } else {
                    size2 = 0;
                    i11 = (int) f6;
                    if (size == 0) {
                        i14 = size;
                    } else if (i11 != 0) {
                        i15 = (int) (i11 / fD);
                        i12 = size2;
                        i13 = i11;
                        i14 = i13;
                    }
                    i12 = size2;
                    i13 = i11;
                }
                setMeasuredDimension(java.lang.Math.min(i13, i14), java.lang.Math.min(i15, i12));
                return;
            }
            if (this.f38365T.g()) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25496a4)).booleanValue()) {
                    super.onMeasure(i6, i10);
                    return;
                }
                g1("/contentHeight", new com.google.android.gms.internal.ads.C4738ou(this));
                v1("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f10 = this.f38355J.density;
                int size3 = android.view.View.MeasureSpec.getSize(i6);
                int i16 = this.f38381m0;
                setMeasuredDimension(size3, i16 != -1 ? (int) (i16 * f10) : android.view.View.MeasureSpec.getSize(i10));
                return;
            }
            if (this.f38365T.i()) {
                android.util.DisplayMetrics displayMetrics = this.f38355J;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = android.view.View.MeasureSpec.getMode(i6);
            int size4 = android.view.View.MeasureSpec.getSize(i6);
            int mode2 = android.view.View.MeasureSpec.getMode(i10);
            int size5 = android.view.View.MeasureSpec.getSize(i10);
            int i17 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i18 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            com.google.android.gms.internal.ads.C2625Mu c2625Mu = this.f38365T;
            boolean z6 = c2625Mu.f29846c > i17 || c2625Mu.f29845b > i18;
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25687s5)).booleanValue()) {
                com.google.android.gms.internal.ads.C2625Mu c2625Mu2 = this.f38365T;
                float f11 = c2625Mu2.f29846c;
                float f12 = this.f38356K;
                z6 &= f11 / f12 <= ((float) i17) / f12 && ((float) c2625Mu2.f29845b) / f12 <= ((float) i18) / f12;
            }
            if (!z6) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.f38360O) {
                    this.f38346B0.c(10002);
                    this.f38360O = true;
                }
                com.google.android.gms.internal.ads.C2625Mu c2625Mu3 = this.f38365T;
                setMeasuredDimension(c2625Mu3.f29846c, c2625Mu3.f29845b);
                return;
            }
            com.google.android.gms.internal.ads.C2625Mu c2625Mu4 = this.f38365T;
            float f13 = c2625Mu4.f29846c;
            float f14 = this.f38356K;
            p224w3.p.g("Not enough space to show ad. Needs " + ((int) (f13 / f14)) + "x" + ((int) (c2625Mu4.f29845b / f14)) + " dp, but only has " + ((int) (size4 / f14)) + "x" + ((int) (size5 / f14)) + " dp.");
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.f38359N) {
                return;
            }
            this.f38346B0.c(10001);
            this.f38359N = true;
            return;
        }
        super.onMeasure(i6, i10);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void onPause() {
        if (L0()) {
            return;
        }
        try {
            super.onPause();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.vc)).booleanValue() && G2.f.a("MUTE_AUDIO")) {
                p224w3.p.b("Muting webview");
                G2.e.j(this, true);
            }
        } catch (java.lang.Exception e6) {
            p224w3.p.e("Could not pause webview.", e6);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.yc)).booleanValue()) {
                p174r3.v.s().x(e6, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void onResume() {
        if (L0()) {
            return;
        }
        try {
            super.onResume();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.vc)).booleanValue() && G2.f.a("MUTE_AUDIO")) {
                p224w3.p.b("Unmuting webview");
                G2.e.j(this, false);
            }
        } catch (java.lang.Exception e6) {
            p224w3.p.e("Could not resume webview.", e6);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.yc)).booleanValue()) {
                p174r3.v.s().x(e6, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z6 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25243D3)).booleanValue() && this.f38361P.k();
        if ((!this.f38361P.p() || this.f38361P.o()) && !z6) {
            com.google.android.gms.internal.ads.Z9 z10 = this.f38349D;
            if (z10 != null) {
                z10.d(motionEvent);
            }
            com.google.android.gms.internal.ads.C4051ig c4051ig = this.f38351F;
            if (c4051ig != null) {
                c4051ig.b(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    com.google.android.gms.internal.ads.InterfaceC3395ch interfaceC3395ch = this.f38377i0;
                    if (interfaceC3395ch != null) {
                        interfaceC3395ch.d(motionEvent);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        if (L0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final com.google.android.gms.internal.ads.C2915Ur p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.MG
    public final void p0() {
        com.google.android.gms.internal.ads.AbstractC3097Zt abstractC3097Zt = this.f38361P;
        if (abstractC3097Zt != null) {
            abstractC3097Zt.p0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Kk
    public final void q(java.lang.String str, java.lang.String str2) {
        v1(str + "(" + str2 + ");");
    }

    public final com.google.android.gms.internal.ads.AbstractC3097Zt q1() {
        return this.f38361P;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final synchronized void r(int i6) {
        this.f38386r0 = i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final android.content.Context r0() {
        return this.f38347C.b();
    }

    final synchronized java.lang.Boolean r1() {
        return this.f38371c0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC3746fs
    public final synchronized com.google.android.gms.internal.ads.BinderC5287tu s() {
        return this.f38374f0;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2698Ot
    public final void setWebViewClient(android.webkit.WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof com.google.android.gms.internal.ads.AbstractC3097Zt) {
            this.f38361P = (com.google.android.gms.internal.ads.AbstractC3097Zt) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (L0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (java.lang.Exception e6) {
            p224w3.p.e("Could not stop loading webview.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final synchronized java.lang.String t() {
        com.google.android.gms.internal.ads.U60 u60 = this.f38358M;
        if (u60 == null) {
            return null;
        }
        return u60.f32114b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final synchronized java.lang.String u() {
        return this.f38373e0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final void u0(boolean z6) {
        this.f38361P.c(false);
    }

    protected final synchronized void u1(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (L0()) {
            p224w3.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC3746fs
    public final synchronized void v(com.google.android.gms.internal.ads.BinderC5287tu binderC5287tu) {
        if (this.f38374f0 != null) {
            p224w3.p.d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f38374f0 = binderC5287tu;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final synchronized com.google.android.gms.internal.ads.AbstractC2880Ts v0(java.lang.String str) {
        java.util.Map map = this.f38394z0;
        if (map == null) {
            return null;
        }
        return (com.google.android.gms.internal.ads.AbstractC2880Ts) map.get(str);
    }

    protected final void v1(java.lang.String str) {
        if (!V3.n.d()) {
            z1("javascript:".concat(str));
            return;
        }
        if (r1() == null) {
            L1();
        }
        if (r1().booleanValue()) {
            u1(str, null);
        } else {
            z1("javascript:".concat(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256Cu
    public final void w(boolean z6, int i6, boolean z10) {
        this.f38361P.w0(z6, i6, z10);
    }

    @Override // p174r3.n
    public final synchronized void w0() {
        p174r3.n nVar = this.f38353H;
        if (nVar != null) {
            nVar.w0();
        }
    }

    final /* synthetic */ void w1(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2256Cu
    public final void x0(java.lang.String str, java.lang.String str2, int i6) {
        this.f38361P.v0(str, str2, 14);
    }

    final /* synthetic */ void x1(java.lang.String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC3746fs
    public final synchronized void y(java.lang.String str, com.google.android.gms.internal.ads.AbstractC2880Ts abstractC2880Ts) {
        try {
            if (this.f38394z0 == null) {
                this.f38394z0 = new java.util.HashMap();
            }
            this.f38394z0.put(str, abstractC2880Ts);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final void y0(int i6) {
    }

    final /* synthetic */ void y1(java.lang.String str) {
        super.loadUrl("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3746fs
    public final synchronized void z() {
        com.google.android.gms.internal.ads.InterfaceC3176ah interfaceC3176ah = this.f38378j0;
        if (interfaceC3176ah != null) {
            final com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4793pL viewTreeObserverOnGlobalLayoutListenerC4793pL = (com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4793pL) interfaceC3176ah;
            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.nL
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC4793pL.f();
                    } catch (android.os.RemoteException e6) {
                        p224w3.p.i("#007 Could not call remote method.", e6);
                    }
                }
            });
        }
    }

    protected final synchronized void z1(java.lang.String str) {
        if (L0()) {
            p224w3.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }
}
