package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2879Tr extends android.widget.FrameLayout implements com.google.android.gms.internal.ads.InterfaceC2512Jr {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3746fs f32005C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.widget.FrameLayout f32006D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.view.View f32007E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2752Qf f32008F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final com.google.android.gms.internal.ads.RunnableC3966hs f32009G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final long f32010H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2549Kr f32011I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f32012J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f32013K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f32014L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f32015M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f32016N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f32017O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private java.lang.String f32018P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private java.lang.String[] f32019Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private android.graphics.Bitmap f32020R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final android.widget.ImageView f32021S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f32022T;

    public C2879Tr(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs, int i6, boolean z6, com.google.android.gms.internal.ads.C2752Qf c2752Qf, com.google.android.gms.internal.ads.C3636es c3636es) {
        super(context);
        this.f32005C = interfaceC3746fs;
        this.f32008F = c2752Qf;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f32006D = frameLayout;
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        Q3.AbstractC1477p.l(interfaceC3746fs.j());
        com.google.android.gms.internal.ads.Lr lr = interfaceC3746fs.j().f53836a;
        com.google.android.gms.internal.ads.C3856gs c3856gs = new com.google.android.gms.internal.ads.C3856gs(context, interfaceC3746fs.n(), interfaceC3746fs.u(), c2752Qf, interfaceC3746fs.k());
        com.google.android.gms.internal.ads.AbstractC2549Kr c2292Dt = i6 == 3 ? new com.google.android.gms.internal.ads.C2292Dt(context, c3856gs) : i6 == 2 ? new com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC5833ys(context, c3856gs, interfaceC3746fs, z6, com.google.android.gms.internal.ads.Lr.a(interfaceC3746fs), c3636es) : new com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir(context, interfaceC3746fs, z6, com.google.android.gms.internal.ads.Lr.a(interfaceC3746fs), c3636es, new com.google.android.gms.internal.ads.C3856gs(context, interfaceC3746fs.n(), interfaceC3746fs.u(), c2752Qf, interfaceC3746fs.k()));
        this.f32011I = c2292Dt;
        android.view.View view = new android.view.View(context);
        this.f32007E = view;
        view.setBackgroundColor(0);
        frameLayout.addView(c2292Dt, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25404S)).booleanValue()) {
            frameLayout.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25371P)).booleanValue()) {
            x();
        }
        this.f32021S = new android.widget.ImageView(context);
        this.f32010H = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25426U)).longValue();
        boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25393R)).booleanValue();
        this.f32015M = zBooleanValue;
        if (c2752Qf != null) {
            c2752Qf.d("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.f32009G = new com.google.android.gms.internal.ads.RunnableC3966hs(this);
        c2292Dt.q(this);
    }

    private final void s() {
        if (this.f32005C.h() == null || !this.f32013K || this.f32014L) {
            return;
        }
        this.f32005C.h().getWindow().clearFlags(128);
        this.f32013K = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(java.lang.String str, java.lang.String... strArr) {
        java.util.HashMap map = new java.util.HashMap();
        java.lang.Integer numV = v();
        if (numV != null) {
            map.put("playerId", numV.toString());
        }
        map.put("event", str);
        java.lang.String str2 = null;
        for (java.lang.String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f32005C.O("onVideoEvent", map);
    }

    private final boolean u() {
        return this.f32021S.getParent() != null;
    }

    final /* synthetic */ void A(boolean z6) {
        t("windowFocusChanged", "hasWindowFocus", java.lang.String.valueOf(z6));
    }

    public final void B(java.lang.Integer num) {
        if (this.f32011I == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(this.f32018P)) {
            t("no_src", new java.lang.String[0]);
        } else {
            this.f32011I.c(this.f32018P, this.f32019Q, num);
        }
    }

    public final void C() {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        abstractC2549Kr.f29015D.d(true);
        abstractC2549Kr.n();
    }

    final void D() {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        long jD = abstractC2549Kr.d();
        if (this.f32016N == jD || jD <= 0) {
            return;
        }
        float f6 = jD / 1000.0f;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue()) {
            t("timeupdate", "time", java.lang.String.valueOf(f6), "totalBytes", java.lang.String.valueOf(this.f32011I.k()), "qoeCachedBytes", java.lang.String.valueOf(this.f32011I.i()), "qoeLoadedBytes", java.lang.String.valueOf(this.f32011I.j()), "droppedFrames", java.lang.String.valueOf(this.f32011I.e()), "reportTime", java.lang.String.valueOf(p174r3.v.c().a()));
        } else {
            t("timeupdate", "time", java.lang.String.valueOf(f6));
        }
        this.f32016N = jD;
    }

    public final void E() {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        abstractC2549Kr.m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2512Jr
    public final void E0(java.lang.String str, java.lang.String str2) {
        t("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    public final void F() {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        abstractC2549Kr.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2512Jr
    public final void F0(int i6, int i10) {
        if (this.f32015M) {
            com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25415T;
            int iMax = java.lang.Math.max(i6 / ((java.lang.Integer) p184s3.A.c().a(abstractC5037rf)).intValue(), 1);
            int iMax2 = java.lang.Math.max(i10 / ((java.lang.Integer) p184s3.A.c().a(abstractC5037rf)).intValue(), 1);
            android.graphics.Bitmap bitmap = this.f32020R;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f32020R.getHeight() == iMax2) {
                return;
            }
            this.f32020R = android.graphics.Bitmap.createBitmap(iMax, iMax2, android.graphics.Bitmap.Config.ARGB_8888);
            this.f32022T = false;
        }
    }

    public final void G(int i6) {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        abstractC2549Kr.p(i6);
    }

    public final void H(android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        abstractC2549Kr.dispatchTouchEvent(motionEvent);
    }

    public final void I(int i6) {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        abstractC2549Kr.w(i6);
    }

    public final void J(int i6) {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        abstractC2549Kr.C(i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2512Jr
    public final void a() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25494a2)).booleanValue()) {
            this.f32009G.a();
        }
        t("ended", new java.lang.String[0]);
        s();
    }

    public final void b(int i6) {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        abstractC2549Kr.D(i6);
    }

    public final void c(int i6) {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        abstractC2549Kr.a(i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2512Jr
    public final void d() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25494a2)).booleanValue()) {
            this.f32009G.b();
        }
        if (this.f32005C.h() != null && !this.f32013K) {
            boolean z6 = (this.f32005C.h().getWindow().getAttributes().flags & 128) != 0;
            this.f32014L = z6;
            if (!z6) {
                this.f32005C.h().getWindow().addFlags(128);
                this.f32013K = true;
            }
        }
        this.f32012J = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2512Jr
    public final void e() {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr != null && this.f32017O == 0) {
            float f6 = abstractC2549Kr.f();
            com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr2 = this.f32011I;
            t("canplaythrough", "duration", java.lang.String.valueOf(f6 / 1000.0f), "videoWidth", java.lang.String.valueOf(abstractC2549Kr2.h()), "videoHeight", java.lang.String.valueOf(abstractC2549Kr2.g()));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2512Jr
    public final void f() {
        t("pause", new java.lang.String[0]);
        s();
        this.f32012J = false;
    }

    public final void finalize() throws java.lang.Throwable {
        try {
            this.f32009G.a();
            final com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
            if (abstractC2549Kr != null) {
                com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Nr
                    @Override // java.lang.Runnable
                    public final void run() {
                        abstractC2549Kr.s();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2512Jr
    public final void g() {
        this.f32009G.b();
        p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC2770Qr(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2512Jr
    public final void h() {
        if (this.f32022T && this.f32020R != null && !u()) {
            this.f32021S.setImageBitmap(this.f32020R);
            this.f32021S.invalidate();
            this.f32006D.addView(this.f32021S, new android.widget.FrameLayout.LayoutParams(-1, -1));
            this.f32006D.bringChildToFront(this.f32021S);
        }
        this.f32009G.a();
        this.f32017O = this.f32016N;
        p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC2807Rr(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2512Jr
    public final void i() {
        this.f32007E.setVisibility(4);
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Or
            @Override // java.lang.Runnable
            public final void run() {
                this.f30573C.z();
            }
        });
    }

    public final void j(int i6) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25404S)).booleanValue()) {
            this.f32006D.setBackgroundColor(i6);
            this.f32007E.setBackgroundColor(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2512Jr
    public final void k() {
        if (this.f32012J && u()) {
            this.f32006D.removeView(this.f32021S);
        }
        if (this.f32011I == null || this.f32020R == null) {
            return;
        }
        long jC = p174r3.v.c().c();
        if (this.f32011I.getBitmap(this.f32020R) != null) {
            this.f32022T = true;
        }
        long jC2 = p174r3.v.c().c() - jC;
        if (p214v3.AbstractC7265q0.m()) {
            p214v3.AbstractC7265q0.k("Spinner frame grab took " + jC2 + "ms");
        }
        if (jC2 > this.f32010H) {
            p224w3.p.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f32015M = false;
            this.f32020R = null;
            com.google.android.gms.internal.ads.C2752Qf c2752Qf = this.f32008F;
            if (c2752Qf != null) {
                c2752Qf.d("spinner_jank", java.lang.Long.toString(jC2));
            }
        }
    }

    public final void l(int i6) {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        abstractC2549Kr.b(i6);
    }

    public final void m(java.lang.String str, java.lang.String[] strArr) {
        this.f32018P = str;
        this.f32019Q = strArr;
    }

    public final void n(int i6, int i10, int i11, int i12) {
        if (p214v3.AbstractC7265q0.m()) {
            p214v3.AbstractC7265q0.k("Set video bounds to x:" + i6 + ";y:" + i10 + ";w:" + i11 + ";h:" + i12);
        }
        if (i11 == 0 || i12 == 0) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i11, i12);
        layoutParams.setMargins(i6, i10, 0, 0);
        this.f32006D.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void o(float f6) {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        abstractC2549Kr.f29015D.e(f6);
        abstractC2549Kr.n();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z6) {
        super.onWindowFocusChanged(z6);
        com.google.android.gms.internal.ads.RunnableC3966hs runnableC3966hs = this.f32009G;
        if (z6) {
            runnableC3966hs.b();
        } else {
            runnableC3966hs.a();
            this.f32017O = this.f32016N;
        }
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Pr
            @Override // java.lang.Runnable
            public final void run() {
                this.f30819C.A(z6);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC2512Jr
    public final void onWindowVisibilityChanged(int i6) {
        boolean z6;
        super.onWindowVisibilityChanged(i6);
        if (i6 == 0) {
            this.f32009G.b();
            z6 = true;
        } else {
            this.f32009G.a();
            this.f32017O = this.f32016N;
            z6 = false;
        }
        p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC2843Sr(this, z6));
    }

    public final void p(float f6, float f10) {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr != null) {
            abstractC2549Kr.t(f6, f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2512Jr
    public final void q(java.lang.String str, java.lang.String str2) {
        t("error", "what", str, "extra", str2);
    }

    public final void r() {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        abstractC2549Kr.f29015D.d(false);
        abstractC2549Kr.n();
    }

    public final java.lang.Integer v() {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr != null) {
            return abstractC2549Kr.u();
        }
        return null;
    }

    public final void x() {
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr == null) {
            return;
        }
        android.widget.TextView textView = new android.widget.TextView(abstractC2549Kr.getContext());
        android.content.res.Resources resourcesF = p174r3.v.s().f();
        textView.setText(java.lang.String.valueOf(resourcesF == null ? "AdMob - " : resourcesF.getString(p154p3.d.f52751u)).concat(this.f32011I.l()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f32006D.addView(textView, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        this.f32006D.bringChildToFront(textView);
    }

    public final void y() {
        this.f32009G.a();
        com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr = this.f32011I;
        if (abstractC2549Kr != null) {
            abstractC2549Kr.s();
        }
        s();
    }

    final /* synthetic */ void z() {
        t("firstFrameRendered", new java.lang.String[0]);
    }
}
