package p204u3;

/* JADX INFO: loaded from: classes.dex */
public abstract class x extends com.google.android.gms.internal.ads.AbstractBinderC2582Ln implements p204u3.InterfaceC7206h {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    static final int f55513Y = android.graphics.Color.argb(0, 0, 0, 0);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected final android.app.Activity f55514C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel f55515D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    com.google.android.gms.internal.ads.InterfaceC2698Ot f55516E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    p204u3.r f55517F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    p204u3.C f55518G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    android.widget.FrameLayout f55520I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    android.webkit.WebChromeClient.CustomViewCallback f55521J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    p204u3.q f55524M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private java.lang.Runnable f55528Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f55529R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f55530S;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private android.widget.Toolbar f55534W;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    boolean f55519H = false;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    boolean f55522K = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    boolean f55523L = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    boolean f55525N = false;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    int f55535X = 1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final java.lang.Object f55526O = new java.lang.Object();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final android.view.View.OnClickListener f55527P = new p204u3.o(this);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f55531T = false;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f55532U = false;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f55533V = true;

    public x(android.app.Activity activity) {
        this.f55514C = activity;
    }

    private final void u6(android.view.View view) {
        com.google.android.gms.internal.ads.QT qtG0;
        com.google.android.gms.internal.ads.OT otD0;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f55516E;
        if (interfaceC2698Ot == null) {
            return;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25552f5)).booleanValue() && (otD0 = interfaceC2698Ot.d0()) != null) {
            otD0.a(view);
        } else if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25541e5)).booleanValue() && (qtG0 = interfaceC2698Ot.g0()) != null && qtG0.b()) {
            p174r3.v.b().d(qtG0.a(), view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    private final void v6(android.content.res.Configuration configuration) {
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel;
        p174r3.l lVar;
        int i6;
        p174r3.l lVar2;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.f55515D;
        boolean z6 = true;
        boolean z10 = false;
        boolean z11 = (adOverlayInfoParcel2 == null || (lVar2 = adOverlayInfoParcel2.f24724Q) == null || !lVar2.f53871D) ? false : true;
        boolean zD = p174r3.v.u().d(this.f55514C, configuration);
        if (!this.f55523L || z11) {
            if (zD) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25372P0)).booleanValue()) {
                    z6 = false;
                }
            }
            adOverlayInfoParcel = this.f55515D;
            if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f24724Q) != null && lVar.f53876I) {
                z10 = true;
            }
        } else if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25383Q0)).booleanValue()) {
            if (zD) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25372P0)).booleanValue()) {
                    z6 = false;
                }
            }
            adOverlayInfoParcel = this.f55515D;
            if (adOverlayInfoParcel != null) {
                z10 = true;
            }
        } else {
            z6 = false;
        }
        android.view.Window window = this.f55514C.getWindow();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25633n1)).booleanValue()) {
            android.view.View decorView = window.getDecorView();
            if (z6) {
                i6 = z10 ? 5894 : 5380;
            } else {
                i6 = 256;
            }
            decorView.setSystemUiVisibility(i6);
            return;
        }
        if (!z6) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z10) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    private static final void w6(com.google.android.gms.internal.ads.QT qt, android.view.View view) {
        if (qt == null || view == null) {
            return;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25541e5)).booleanValue() && qt.b()) {
            return;
        }
        p174r3.v.b().c(qt.a(), view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void A() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25409S4)).booleanValue() && this.f55516E != null && (!this.f55514C.isFinishing() || this.f55517F == null)) {
            this.f55516E.onPause();
        }
        N();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void C() {
        this.f55530S = true;
    }

    public final void J() {
        this.f55524M.removeView(this.f55518G);
        y6(true);
    }

    protected final void N() {
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel;
        p204u3.z zVar;
        if (!this.f55514C.isFinishing() || this.f55531T) {
            return;
        }
        this.f55531T = true;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f55516E;
        if (interfaceC2698Ot != null) {
            interfaceC2698Ot.S0(this.f55535X - 1);
            synchronized (this.f55526O) {
                try {
                    if (!this.f55529R && this.f55516E.T0()) {
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25387Q4)).booleanValue() && !this.f55532U && (adOverlayInfoParcel = this.f55515D) != null && (zVar = adOverlayInfoParcel.f24712E) != null) {
                            zVar.d2();
                        }
                        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: u3.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f55501C.c();
                            }
                        };
                        this.f55528Q = runnable;
                        p214v3.E0.f55826l.postDelayed(runnable, ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25559g1)).longValue());
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void N2(int i6, java.lang.String[] strArr, int[] iArr) {
        if (i6 == 12345) {
            android.app.Activity activity = this.f55514C;
            com.google.android.gms.internal.ads.AbstractC5350uT abstractC5350uTE = com.google.android.gms.internal.ads.AbstractC5460vT.e();
            abstractC5350uTE.a(activity);
            abstractC5350uTE.b(this.f55515D.f24720M == 5 ? this : null);
            try {
                this.f55515D.f24731X.i6(strArr, iArr, X3.b.c2(abstractC5350uTE.e()));
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final boolean T() {
        this.f55535X = 1;
        if (this.f55516E == null) {
            return true;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue() && this.f55516E.canGoBack()) {
            this.f55516E.goBack();
            return false;
        }
        boolean zO1 = this.f55516E.o1();
        if (!zO1) {
            this.f55516E.O("onbackblocked", java.util.Collections.emptyMap());
        }
        return zO1;
    }

    public void W3(android.os.Bundle bundle) {
        if (!this.f55530S) {
            this.f55514C.requestWindowFeature(1);
        }
        this.f55522K = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcelE = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.e(this.f55514C.getIntent());
            this.f55515D = adOverlayInfoParcelE;
            if (adOverlayInfoParcelE == null) {
                throw new p204u3.p("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelE.f24732Y) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    this.f55514C.setShowWhenLocked(true);
                } else {
                    this.f55514C.getWindow().addFlags(524288);
                }
            }
            if (this.f55515D.f24722O.f56219E > 7500000) {
                this.f55535X = 4;
            }
            if (this.f55514C.getIntent() != null) {
                this.f55533V = this.f55514C.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.f55515D;
            p174r3.l lVar = adOverlayInfoParcel.f24724Q;
            if (lVar != null) {
                boolean z6 = lVar.f53870C;
                this.f55523L = z6;
                if (z6) {
                    if (adOverlayInfoParcel.f24720M != 5 && lVar.f53875H != -1) {
                        new p204u3.t(this, null).b();
                    }
                }
            } else if (adOverlayInfoParcel.f24720M == 5) {
                this.f55523L = true;
                if (adOverlayInfoParcel.f24720M != 5) {
                    new p204u3.t(this, null).b();
                }
            } else {
                this.f55523L = false;
            }
            if (bundle == null) {
                if (this.f55533V) {
                    com.google.android.gms.internal.ads.SC sc = this.f55515D.f24729V;
                    if (sc != null) {
                        sc.d();
                    }
                    p204u3.z zVar = this.f55515D.f24712E;
                    if (zVar != null) {
                        zVar.T2();
                    }
                }
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.f55515D;
                if (adOverlayInfoParcel2.f24720M != 1) {
                    p184s3.InterfaceC7076a interfaceC7076a = adOverlayInfoParcel2.f24711D;
                    if (interfaceC7076a != null) {
                        interfaceC7076a.e0();
                    }
                    com.google.android.gms.internal.ads.MG mg = this.f55515D.f24730W;
                    if (mg != null) {
                        mg.p0();
                    }
                }
            }
            android.app.Activity activity = this.f55514C;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel3 = this.f55515D;
            p204u3.q qVar = new p204u3.q(activity, adOverlayInfoParcel3.f24723P, adOverlayInfoParcel3.f24722O.f56217C, adOverlayInfoParcel3.f24728U);
            this.f55524M = qVar;
            qVar.setId(1000);
            p174r3.v.u().j(this.f55514C);
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel4 = this.f55515D;
            int i6 = adOverlayInfoParcel4.f24720M;
            if (i6 == 1) {
                s6(false);
                return;
            }
            if (i6 == 2) {
                this.f55517F = new p204u3.r(adOverlayInfoParcel4.f24713F);
                s6(false);
            } else if (i6 == 3) {
                s6(true);
            } else {
                if (i6 != 5) {
                    throw new p204u3.p("Could not determine ad overlay type.");
                }
                s6(false);
            }
        } catch (p204u3.p e6) {
            p224w3.p.g(e6.getMessage());
            this.f55535X = 4;
            this.f55514C.finish();
        }
    }

    public final void b() {
        this.f55535X = 3;
        this.f55514C.finish();
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.f55515D;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f24720M != 5) {
            return;
        }
        this.f55514C.overridePendingTransition(0, 0);
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f55516E;
        if (interfaceC2698Ot != null) {
            interfaceC2698Ot.W0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void b0(X3.a aVar) {
        v6((android.content.res.Configuration) X3.b.L0(aVar));
    }

    final void c() {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot;
        p204u3.z zVar;
        if (this.f55532U) {
            return;
        }
        this.f55532U = true;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = this.f55516E;
        if (interfaceC2698Ot2 != null) {
            this.f55524M.removeView(interfaceC2698Ot2.N());
            p204u3.r rVar = this.f55517F;
            if (rVar != null) {
                this.f55516E.O0(rVar.f55509d);
                this.f55516E.f1(false);
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ac)).booleanValue() && this.f55516E.getParent() != null) {
                    ((android.view.ViewGroup) this.f55516E.getParent()).removeView(this.f55516E.N());
                }
                android.view.ViewGroup viewGroup = this.f55517F.f55508c;
                android.view.View viewN = this.f55516E.N();
                p204u3.r rVar2 = this.f55517F;
                viewGroup.addView(viewN, rVar2.f55506a, rVar2.f55507b);
                this.f55517F = null;
            } else if (this.f55514C.getApplicationContext() != null) {
                this.f55516E.O0(this.f55514C.getApplicationContext());
            }
            this.f55516E = null;
        }
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.f55515D;
        if (adOverlayInfoParcel != null && (zVar = adOverlayInfoParcel.f24712E) != null) {
            zVar.p4(this.f55535X);
        }
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.f55515D;
        if (adOverlayInfoParcel2 == null || (interfaceC2698Ot = adOverlayInfoParcel2.f24713F) == null) {
            return;
        }
        w6(interfaceC2698Ot.g0(), this.f55515D.f24713F.N());
    }

    protected final void d() {
        this.f55516E.f0();
    }

    public final void f() {
        this.f55524M.f55505D = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void h() {
        this.f55535X = 1;
    }

    public final void i() {
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.f55515D;
        if (adOverlayInfoParcel != null && this.f55519H) {
            p6(adOverlayInfoParcel.f24719L);
        }
        if (this.f55520I != null) {
            this.f55514C.setContentView(this.f55524M);
            this.f55530S = true;
            this.f55520I.removeAllViews();
            this.f55520I = null;
        }
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.f55521J;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f55521J = null;
        }
        this.f55519H = false;
    }

    @Override // p204u3.InterfaceC7206h
    public final void j() {
        this.f55535X = 2;
        this.f55514C.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void j2(int i6, int i10, android.content.Intent intent) {
        com.google.android.gms.internal.ads.C3588eO c3588eOD;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel;
        if (i6 == 236) {
            com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.Wc;
            if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
                p214v3.AbstractC7265q0.k("Callback from intent launch with requestCode: 236 and resultCode: " + i10);
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f55516E;
                if (interfaceC2698Ot == null || interfaceC2698Ot.M() == null || (c3588eOD = interfaceC2698Ot.M().d()) == null || (adOverlayInfoParcel = this.f55515D) == null || !((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
                    return;
                }
                com.google.android.gms.internal.ads.C3479dO c3479dOA = c3588eOD.a();
                c3479dOA.b("action", "hilca");
                c3479dOA.b("gqi", com.google.android.gms.internal.ads.AbstractC2829Sg0.c(adOverlayInfoParcel.f24726S));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(i10);
                c3479dOA.b("hilr", sb.toString());
                if (i10 == -1 && intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("callerPackage");
                    java.lang.String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        c3479dOA.b("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        c3479dOA.b("hills", stringExtra2);
                    }
                }
                c3479dOA.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void m() {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f55516E;
        if (interfaceC2698Ot != null) {
            try {
                this.f55524M.removeView(interfaceC2698Ot.N());
            } catch (java.lang.NullPointerException unused) {
            }
        }
        N();
    }

    public final void n() {
        if (this.f55525N) {
            this.f55525N = false;
            d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void p() {
        p204u3.z zVar;
        i();
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.f55515D;
        if (adOverlayInfoParcel != null && (zVar = adOverlayInfoParcel.f24712E) != null) {
            zVar.y0();
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25409S4)).booleanValue() && this.f55516E != null && (!this.f55514C.isFinishing() || this.f55517F == null)) {
            this.f55516E.onPause();
        }
        N();
    }

    public final void p6(int i6) {
        if (this.f55514C.getApplicationInfo().targetSdkVersion >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25388Q5)).intValue()) {
            if (this.f55514C.getApplicationInfo().targetSdkVersion <= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25399R5)).intValue()) {
                int i10 = android.os.Build.VERSION.SDK_INT;
                if (i10 >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25410S5)).intValue()) {
                    if (i10 <= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25421T5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f55514C.setRequestedOrientation(i6);
        } catch (java.lang.Throwable th) {
            p174r3.v.s().w(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void q6(boolean z6) {
        p204u3.q qVar;
        int i6;
        if (z6) {
            qVar = this.f55524M;
            i6 = 0;
        } else {
            qVar = this.f55524M;
            i6 = -16777216;
        }
        qVar.setBackgroundColor(i6);
    }

    public final void r0() {
        synchronized (this.f55526O) {
            try {
                this.f55529R = true;
                java.lang.Runnable runnable = this.f55528Q;
                if (runnable != null) {
                    com.google.android.gms.internal.ads.HandlerC2345Fe0 handlerC2345Fe0 = p214v3.E0.f55826l;
                    handlerC2345Fe0.removeCallbacks(runnable);
                    handlerC2345Fe0.post(this.f55528Q);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void r6(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f55514C);
        this.f55520I = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f55520I.addView(view, -1, -1);
        this.f55514C.setContentView(this.f55520I);
        this.f55530S = true;
        this.f55521J = customViewCallback;
        this.f55519H = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void s() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    protected final void s6(boolean z6) throws p204u3.p {
        boolean z10;
        p204u3.q qVar;
        int i6;
        if (!this.f55530S) {
            this.f55514C.requestWindowFeature(1);
        }
        android.view.Window window = this.f55514C.getWindow();
        if (window == null) {
            throw new p204u3.p("Invalid activity, no window available.");
        }
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f55515D.f24713F;
        com.google.android.gms.internal.ads.InterfaceC2552Ku interfaceC2552KuM = interfaceC2698Ot != null ? interfaceC2698Ot.M() : null;
        boolean z11 = interfaceC2552KuM != null && interfaceC2552KuM.o0();
        this.f55525N = false;
        if (z11) {
            int i10 = this.f55515D.f24719L;
            if (i10 == 6) {
                if (this.f55514C.getResources().getConfiguration().orientation == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (i10 != 7) {
                z10 = false;
            } else if (this.f55514C.getResources().getConfiguration().orientation == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f55525N = z10;
        } else {
            z10 = false;
        }
        p224w3.p.b("Delay onShow to next orientation change: " + z10);
        p6(this.f55515D.f24719L);
        window.setFlags(16777216, 16777216);
        p224w3.p.b("Hardware acceleration on the AdActivity window enabled.");
        if (this.f55523L) {
            qVar = this.f55524M;
            i6 = f55513Y;
        } else {
            qVar = this.f55524M;
            i6 = -16777216;
        }
        qVar.setBackgroundColor(i6);
        this.f55514C.setContentView(this.f55524M);
        this.f55530S = true;
        if (z6) {
            try {
                p174r3.v.a();
                android.app.Activity activity = this.f55514C;
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = this.f55515D.f24713F;
                com.google.android.gms.internal.ads.C2625Mu c2625MuI = interfaceC2698Ot2 != null ? interfaceC2698Ot2.I() : null;
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot3 = this.f55515D.f24713F;
                java.lang.String strY = interfaceC2698Ot3 != null ? interfaceC2698Ot3.Y() : null;
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.f55515D;
                p224w3.a aVar = adOverlayInfoParcel.f24722O;
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot4 = adOverlayInfoParcel.f24713F;
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = com.google.android.gms.internal.ads.C3640eu.a(activity, c2625MuI, strY, true, z11, null, null, aVar, null, null, interfaceC2698Ot4 != null ? interfaceC2698Ot4.j() : null, com.google.android.gms.internal.ads.C4704od.a(), null, null, null, null);
                this.f55516E = interfaceC2698OtA;
                com.google.android.gms.internal.ads.InterfaceC2552Ku interfaceC2552KuM2 = interfaceC2698OtA.M();
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.f55515D;
                com.google.android.gms.internal.ads.InterfaceC5483vi interfaceC5483vi = adOverlayInfoParcel2.f24725R;
                com.google.android.gms.internal.ads.InterfaceC5703xi interfaceC5703xi = adOverlayInfoParcel2.f24714G;
                p204u3.InterfaceC7202d interfaceC7202d = adOverlayInfoParcel2.f24718K;
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot5 = adOverlayInfoParcel2.f24713F;
                interfaceC2552KuM2.V(null, interfaceC5483vi, null, interfaceC5703xi, interfaceC7202d, true, null, interfaceC2698Ot5 != null ? interfaceC2698Ot5.M().f() : null, null, null, null, null, null, null, null, null, null, null, null);
                this.f55516E.M().D(new com.google.android.gms.internal.ads.InterfaceC2478Iu() { // from class: u3.n
                    @Override // com.google.android.gms.internal.ads.InterfaceC2478Iu
                    public final void a(boolean z12, int i11, java.lang.String str, java.lang.String str2) {
                        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot6 = this.f55502C.f55516E;
                        if (interfaceC2698Ot6 != null) {
                            interfaceC2698Ot6.f0();
                        }
                    }
                });
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel3 = this.f55515D;
                java.lang.String str = adOverlayInfoParcel3.f24721N;
                if (str != null) {
                    this.f55516E.loadUrl(str);
                } else {
                    java.lang.String str2 = adOverlayInfoParcel3.f24717J;
                    if (str2 == null) {
                        throw new p204u3.p("No URL or HTML to display in ad overlay.");
                    }
                    this.f55516E.loadDataWithBaseURL(adOverlayInfoParcel3.f24715H, str2, "text/html", "UTF-8", null);
                }
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot6 = this.f55515D.f24713F;
                if (interfaceC2698Ot6 != null) {
                    interfaceC2698Ot6.i1(this);
                }
            } catch (java.lang.Exception e6) {
                p224w3.p.e("Error obtaining webview.", e6);
                throw new p204u3.p("Could not obtain webview for the overlay.", e6);
            }
        } else {
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot7 = this.f55515D.f24713F;
            this.f55516E = interfaceC2698Ot7;
            interfaceC2698Ot7.O0(this.f55514C);
        }
        if (this.f55515D.f24732Y) {
            android.webkit.CookieManager.getInstance().setAcceptThirdPartyCookies(this.f55516E.i0(), false);
        }
        this.f55516E.W0(this);
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot8 = this.f55515D.f24713F;
        if (interfaceC2698Ot8 != null) {
            w6(interfaceC2698Ot8.g0(), this.f55524M);
        }
        if (this.f55515D.f24720M != 5) {
            android.view.ViewParent parent = this.f55516E.getParent();
            if (parent != null && (parent instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) parent).removeView(this.f55516E.N());
            }
            if (this.f55523L) {
                this.f55516E.m0();
            }
            if (!this.f55515D.f24732Y || android.os.Build.VERSION.SDK_INT < 24) {
                this.f55524M.addView(this.f55516E.N(), -1, -1);
            } else {
                android.widget.Toolbar toolbar = new android.widget.Toolbar(this.f55514C);
                this.f55534W = toolbar;
                toolbar.setId(android.view.View.generateViewId());
                this.f55516E.N().setId(android.view.View.generateViewId());
                this.f55534W.setBackgroundColor(-12303292);
                this.f55534W.setVisibility(0);
                try {
                    this.f55534W.setNavigationIcon(p174r3.v.s().f().getDrawable(p154p3.a.f52727c, null));
                } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException e10) {
                    p214v3.AbstractC7265q0.l("Error obtaining close icon.", e10);
                }
                this.f55534W.setNavigationOnClickListener(this.f55527P);
                this.f55534W.setTitleMarginStart(0);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.f55524M.addView(this.f55534W, layoutParams);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.f55534W.getId());
                layoutParams2.addRule(12);
                this.f55524M.addView(this.f55516E.N(), layoutParams2);
                u6(this.f55534W);
            }
        }
        if (!z6 && !this.f55525N) {
            d();
        }
        if (this.f55515D.f24720M != 5) {
            y6(z11);
            if (this.f55516E.e1()) {
                z6(z11, true);
                return;
            }
            return;
        }
        android.app.Activity activity2 = this.f55514C;
        com.google.android.gms.internal.ads.AbstractC5350uT abstractC5350uTE = com.google.android.gms.internal.ads.AbstractC5460vT.e();
        abstractC5350uTE.a(activity2);
        abstractC5350uTE.b(this);
        abstractC5350uTE.c(this.f55515D.f24726S);
        abstractC5350uTE.d(this.f55515D.f24727T);
        try {
            x6(abstractC5350uTE.e());
        } catch (android.os.RemoteException | p204u3.p e11) {
            throw new p204u3.p(e11.getMessage(), e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void t() {
        p204u3.z zVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.f55515D;
        if (adOverlayInfoParcel != null && (zVar = adOverlayInfoParcel.f24712E) != null) {
            zVar.f3();
        }
        v6(this.f55514C.getResources().getConfiguration());
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25409S4)).booleanValue()) {
            return;
        }
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f55516E;
        if (interfaceC2698Ot == null || interfaceC2698Ot.L0()) {
            p224w3.p.g("The webview does not exist. Ignoring action.");
        } else {
            this.f55516E.onResume();
        }
    }

    public final void t6(java.lang.String str) {
        android.widget.Toolbar toolbar = this.f55534W;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void v() {
        p204u3.z zVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.f55515D;
        if (adOverlayInfoParcel == null || (zVar = adOverlayInfoParcel.f24712E) == null) {
            return;
        }
        zVar.q0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void w() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25409S4)).booleanValue()) {
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f55516E;
            if (interfaceC2698Ot == null || interfaceC2698Ot.L0()) {
                p224w3.p.g("The webview does not exist. Ignoring action.");
            } else {
                this.f55516E.onResume();
            }
        }
    }

    public final void x6(com.google.android.gms.internal.ads.AbstractC5460vT abstractC5460vT) throws p204u3.p {
        com.google.android.gms.internal.ads.InterfaceC2323En interfaceC2323En;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.f55515D;
        if (adOverlayInfoParcel == null || (interfaceC2323En = adOverlayInfoParcel.f24731X) == null) {
            throw new p204u3.p("noioou");
        }
        interfaceC2323En.j0(X3.b.c2(abstractC5460vT));
    }

    public final void y6(boolean z6) {
        if (this.f55515D.f24732Y) {
            return;
        }
        int iIntValue = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25442V4)).intValue();
        boolean z10 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25592j1)).booleanValue() || z6;
        p204u3.B b6 = new p204u3.B();
        b6.f55473d = 50;
        b6.f55470a = true != z10 ? 0 : iIntValue;
        b6.f55471b = true != z10 ? iIntValue : 0;
        b6.f55472c = iIntValue;
        this.f55518G = new p204u3.C(this.f55514C, b6, this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z10 ? 9 : 11);
        z6(z6, this.f55515D.f24716I);
        this.f55524M.addView(this.f55518G, layoutParams);
        u6(this.f55518G);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void z0(android.os.Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f55522K);
    }

    public final void z6(boolean z6, boolean z10) {
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel;
        p174r3.l lVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2;
        p174r3.l lVar2;
        boolean z11 = true;
        boolean z12 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25570h1)).booleanValue() && (adOverlayInfoParcel2 = this.f55515D) != null && (lVar2 = adOverlayInfoParcel2.f24724Q) != null && lVar2.f53877J;
        boolean z13 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25581i1)).booleanValue() && (adOverlayInfoParcel = this.f55515D) != null && (lVar = adOverlayInfoParcel.f24724Q) != null && lVar.f53878K;
        if (z6 && z10 && z12 && !z13) {
            new com.google.android.gms.internal.ads.C5603wn(this.f55516E, "useCustomClose").c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        p204u3.C c6 = this.f55518G;
        if (c6 != null) {
            if (!z13 && (!z10 || z12)) {
                z11 = false;
            }
            c6.b(z11);
        }
    }
}
