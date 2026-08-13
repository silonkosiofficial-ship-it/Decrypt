package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class BJ extends com.google.android.gms.internal.ads.AbstractBinderC5041rh implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.AbstractC3398ci0 f25923Q = com.google.android.gms.internal.ads.AbstractC3398ci0.R("2011", "1009", "3010");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f25924C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.widget.FrameLayout f25926E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.widget.FrameLayout f25927F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f25928G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private android.view.View f25929H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.google.android.gms.internal.ads.ZI f25931J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob f25932K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4382lh f25934M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f25935N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private android.view.GestureDetector f25937P;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.util.Map f25925D = new java.util.HashMap();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private X3.a f25933L = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f25936O = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int f25930I = 244410000;

    public BJ(android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2, int i6) {
        java.lang.String str;
        this.f25926E = frameLayout;
        this.f25927F = frameLayout2;
        java.lang.String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f25924C = str;
        p174r3.v.B();
        com.google.android.gms.internal.ads.C5391ur.a(frameLayout, this);
        p174r3.v.B();
        com.google.android.gms.internal.ads.C5391ur.b(frameLayout, this);
        this.f25928G = com.google.android.gms.internal.ads.AbstractC3524dr.f34800f;
        this.f25932K = new com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob(this.f25926E.getContext(), this.f25926E);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void A() {
        this.f25928G.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.AJ
            @Override // java.lang.Runnable
            public final void run() {
                this.f25132C.q6();
            }
        });
    }

    private final synchronized void R0(java.lang.String str) {
        android.util.DisplayMetrics displayMetrics;
        try {
            android.view.View frameLayout = new android.widget.FrameLayout(this.f25927F.getContext());
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            android.content.Context context = this.f25927F.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!android.text.TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                android.content.res.Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = android.util.Base64.decode(str, 0);
                        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (java.lang.IllegalArgumentException e6) {
                        p224w3.p.h("Encountered invalid base64 watermark.", e6);
                    }
                }
            }
            this.f25927F.addView(frameLayout);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized void v() {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.tb)).booleanValue() || this.f25931J.J() == 0) {
            return;
        }
        this.f25937P = new android.view.GestureDetector(this.f25926E.getContext(), new com.google.android.gms.internal.ads.JJ(this.f25931J, this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final synchronized void B1(X3.a aVar, int i6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final synchronized void Q1(java.lang.String str, X3.a aVar) {
        c2(str, (android.view.View) X3.b.L0(aVar), true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized android.view.View S(java.lang.String str) {
        java.lang.ref.WeakReference weakReference;
        if (!this.f25936O && (weakReference = (java.lang.ref.WeakReference) this.f25925D.get(str)) != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final synchronized void c() {
        try {
            if (this.f25936O) {
                return;
            }
            com.google.android.gms.internal.ads.ZI zi = this.f25931J;
            if (zi != null) {
                zi.C(this);
                this.f25931J = null;
            }
            this.f25925D.clear();
            this.f25926E.removeAllViews();
            this.f25927F.removeAllViews();
            this.f25925D = null;
            this.f25926E = null;
            this.f25927F = null;
            this.f25929H = null;
            this.f25932K = null;
            this.f25936O = true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized void c2(java.lang.String str, android.view.View view, boolean z6) {
        if (!this.f25936O) {
            if (view == null) {
                this.f25925D.remove(str);
                return;
            }
            this.f25925D.put(str, new java.lang.ref.WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (p214v3.Y.i(this.f25930I)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final /* synthetic */ android.view.View e() {
        return this.f25926E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final synchronized void e4(X3.a aVar) {
        this.f25931J.w((android.view.View) X3.b.L0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final android.widget.FrameLayout g() {
        return this.f25927F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob h() {
        return this.f25932K;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final synchronized void h1(com.google.android.gms.internal.ads.InterfaceC4382lh interfaceC4382lh) {
        if (!this.f25936O) {
            this.f25935N = true;
            this.f25934M = interfaceC4382lh;
            com.google.android.gms.internal.ads.ZI zi = this.f25931J;
            if (zi != null) {
                zi.Q().b(interfaceC4382lh);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final synchronized void h5(X3.a aVar) {
        if (this.f25936O) {
            return;
        }
        java.lang.Object objL0 = X3.b.L0(aVar);
        if (!(objL0 instanceof com.google.android.gms.internal.ads.ZI)) {
            p224w3.p.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        com.google.android.gms.internal.ads.ZI zi = this.f25931J;
        if (zi != null) {
            zi.C(this);
        }
        A();
        com.google.android.gms.internal.ads.ZI zi2 = (com.google.android.gms.internal.ads.ZI) objL0;
        this.f25931J = zi2;
        zi2.B(this);
        this.f25931J.s(this.f25926E);
        this.f25931J.a0(this.f25927F);
        if (this.f25935N) {
            this.f25931J.Q().b(this.f25934M);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25474Y3)).booleanValue() && !android.text.TextUtils.isEmpty(this.f25931J.U())) {
            R0(this.f25931J.U());
        }
        v();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final X3.a j() {
        return this.f25933L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized java.lang.String k() {
        return this.f25924C;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized java.util.Map l() {
        return this.f25925D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized java.util.Map m() {
        return this.f25925D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized java.util.Map n() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(android.view.View view) {
        com.google.android.gms.internal.ads.ZI zi = this.f25931J;
        if (zi == null || !zi.E()) {
            return;
        }
        this.f25931J.b0();
        this.f25931J.l(view, this.f25926E, l(), m(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        com.google.android.gms.internal.ads.ZI zi = this.f25931J;
        if (zi != null) {
            android.widget.FrameLayout frameLayout = this.f25926E;
            zi.j(frameLayout, l(), m(), com.google.android.gms.internal.ads.ZI.H(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        com.google.android.gms.internal.ads.ZI zi = this.f25931J;
        if (zi != null) {
            android.widget.FrameLayout frameLayout = this.f25926E;
            zi.j(frameLayout, l(), m(), com.google.android.gms.internal.ads.ZI.H(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.ZI zi = this.f25931J;
        if (zi != null) {
            zi.u(view, motionEvent, this.f25926E);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.tb)).booleanValue() && this.f25937P != null && this.f25931J.J() != 0) {
                this.f25937P.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized org.json.JSONObject p() {
        com.google.android.gms.internal.ads.ZI zi = this.f25931J;
        if (zi == null) {
            return null;
        }
        return zi.W(this.f25926E, l(), m());
    }

    public final android.widget.FrameLayout p6() {
        return this.f25926E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized org.json.JSONObject q() {
        com.google.android.gms.internal.ads.ZI zi = this.f25931J;
        if (zi == null) {
            return null;
        }
        return zi.X(this.f25926E, l(), m());
    }

    final /* synthetic */ void q6() {
        if (this.f25929H == null) {
            android.view.View view = new android.view.View(this.f25926E.getContext());
            this.f25929H = view;
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f25926E != this.f25929H.getParent()) {
            this.f25926E.addView(this.f25929H);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final void s0(X3.a aVar) {
        onTouch(this.f25926E, (android.view.MotionEvent) X3.b.L0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final synchronized void v4(X3.a aVar) {
        if (this.f25936O) {
            return;
        }
        this.f25933L = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final synchronized X3.a y(java.lang.String str) {
        return X3.b.c2(S(str));
    }
}
