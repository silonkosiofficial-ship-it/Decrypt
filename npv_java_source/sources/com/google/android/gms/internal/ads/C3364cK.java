package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3364cK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BM f34480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PL f34481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.view.ViewTreeObserver.OnScrollChangedListener f34482c = null;

    public C3364cK(com.google.android.gms.internal.ads.BM bm, com.google.android.gms.internal.ads.PL pl) {
        this.f34480a = bm;
        this.f34481b = pl;
    }

    private static final int f(android.content.Context context, java.lang.String str, int i6) {
        try {
            i6 = java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
        }
        p184s3.C7147y.b();
        return p224w3.g.z(context, i6);
    }

    public final android.view.View a(final android.view.View view, final android.view.WindowManager windowManager) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = this.f34480a.a(p184s3.c2.s(), null, null);
        interfaceC2698OtA.N().setVisibility(4);
        interfaceC2698OtA.N().setContentDescription("policy_validator");
        interfaceC2698OtA.g1("/sendMessageToSdk", new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.VJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, java.util.Map map) {
                this.f32485a.b((com.google.android.gms.internal.ads.InterfaceC2698Ot) obj, map);
            }
        });
        interfaceC2698OtA.g1("/hideValidatorOverlay", new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.WJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, java.util.Map map) {
                this.f32713a.c(windowManager, view, (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj, map);
            }
        });
        interfaceC2698OtA.g1("/open", new com.google.android.gms.internal.ads.C5265tj(null, null, null, null, null));
        this.f34481b.m(new java.lang.ref.WeakReference(interfaceC2698OtA), "/loadNativeAdPolicyViolations", new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.XJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, java.util.Map map) {
                this.f33117a.d(view, windowManager, (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj, map);
            }
        });
        this.f34481b.m(new java.lang.ref.WeakReference(interfaceC2698OtA), "/showValidatorOverlay", new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.YJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, java.util.Map map) {
                p224w3.p.b("Show native ad policy validator overlay.");
                ((com.google.android.gms.internal.ads.InterfaceC2698Ot) obj).N().setVisibility(0);
            }
        });
        return interfaceC2698OtA.N();
    }

    final /* synthetic */ void b(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.util.Map map) {
        this.f34481b.j("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(android.view.WindowManager windowManager, android.view.View view, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.util.Map map) {
        p224w3.p.b("Hide native ad policy validator overlay.");
        interfaceC2698Ot.N().setVisibility(8);
        if (interfaceC2698Ot.N().getWindowToken() != null) {
            windowManager.removeView(interfaceC2698Ot.N());
        }
        interfaceC2698Ot.destroy();
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f34482c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f34482c);
    }

    final /* synthetic */ void d(final android.view.View view, final android.view.WindowManager windowManager, final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, final java.util.Map map) {
        interfaceC2698Ot.M().D(new com.google.android.gms.internal.ads.InterfaceC2478Iu() { // from class: com.google.android.gms.internal.ads.ZJ
            @Override // com.google.android.gms.internal.ads.InterfaceC2478Iu
            public final void a(boolean z6, int i6, java.lang.String str, java.lang.String str2) {
                this.f33568C.e(map, z6, i6, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        android.content.Context context = view.getContext();
        int iF = f(context, (java.lang.String) map.get("validator_width"), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25456W7)).intValue());
        int iF2 = f(context, (java.lang.String) map.get("validator_height"), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25467X7)).intValue());
        int iF3 = f(context, (java.lang.String) map.get("validator_x"), 0);
        int iF4 = f(context, (java.lang.String) map.get("validator_y"), 0);
        interfaceC2698Ot.l1(com.google.android.gms.internal.ads.C2625Mu.b(iF, iF2));
        try {
            interfaceC2698Ot.i0().getSettings().setUseWideViewPort(((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25478Y7)).booleanValue());
            interfaceC2698Ot.i0().getSettings().setLoadWithOverviewMode(((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25488Z7)).booleanValue());
        } catch (java.lang.NullPointerException unused) {
        }
        final android.view.WindowManager.LayoutParams layoutParamsB = p214v3.Y.b();
        layoutParamsB.x = iF3;
        layoutParamsB.y = iF4;
        windowManager.updateViewLayout(interfaceC2698Ot.N(), layoutParamsB);
        final java.lang.String str = (java.lang.String) map.get("orientation");
        android.graphics.Rect rect = new android.graphics.Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i6 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iF4;
            this.f34482c = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.bK
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = interfaceC2698Ot;
                        if (interfaceC2698Ot2.N().getWindowToken() == null) {
                            return;
                        }
                        int i10 = i6;
                        android.view.WindowManager.LayoutParams layoutParams = layoutParamsB;
                        java.lang.String str2 = str;
                        layoutParams.y = (("1".equals(str2) || "2".equals(str2)) ? rect2.bottom : rect2.top) - i10;
                        windowManager.updateViewLayout(interfaceC2698Ot2.N(), layoutParams);
                    }
                }
            };
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f34482c);
            }
        }
        java.lang.String str2 = (java.lang.String) map.get("overlay_url");
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        interfaceC2698Ot.loadUrl(str2);
    }

    final /* synthetic */ void e(java.util.Map map, boolean z6, int i6, java.lang.String str, java.lang.String str2) {
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (java.lang.String) map.get("id"));
        this.f34481b.j("sendMessageToNativeJs", map2);
    }
}
