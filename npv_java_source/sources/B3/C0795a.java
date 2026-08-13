package B3;

/* JADX INFO: renamed from: B3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0795a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.webkit.WebView f588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4985r70 f590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4246kO f592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f594h = com.google.android.gms.internal.ads.AbstractC3524dr.f34800f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final B3.l0 f596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final B3.c0 f597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final B3.g0 f598l;

    C0795a(android.webkit.WebView webView, com.google.android.gms.internal.ads.Z9 z10, com.google.android.gms.internal.ads.C4246kO c4246kO, com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.C4985r70 c4985r70, B3.l0 l0Var, B3.c0 c0Var, B3.g0 g0Var) {
        this.f588b = webView;
        android.content.Context context = webView.getContext();
        this.f587a = context;
        this.f589c = z10;
        this.f592f = c4246kO;
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        this.f591e = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25730w9)).intValue();
        this.f593g = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25740x9)).booleanValue();
        this.f595i = c2559La0;
        this.f590d = c4985r70;
        this.f596j = l0Var;
        this.f597k = c0Var;
        this.f598l = g0Var;
    }

    final /* synthetic */ void e(android.os.Bundle bundle, D3.b bVar) {
        android.webkit.CookieManager cookieManagerA = p174r3.v.u().a(this.f587a);
        bundle.putBoolean("accept_3p_cookie", cookieManagerA != null ? cookieManagerA.acceptThirdPartyCookies(this.f588b) : false);
        D3.a.a(this.f587a, p104k3.EnumC6886c.BANNER, ((k3.g.a) new k3.g.a().b(com.google.ads.mediation.admob.AdMobAdapter.class, bundle)).g(), bVar);
    }

    final /* synthetic */ void f(java.lang.String str) {
        com.google.android.gms.internal.ads.C4985r70 c4985r70;
        android.net.Uri uriA = android.net.Uri.parse(str);
        try {
            uriA = (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Sb)).booleanValue() || (c4985r70 = this.f590d) == null) ? this.f589c.a(uriA, this.f587a, this.f588b, null) : c4985r70.a(uriA, this.f587a, this.f588b, null);
        } catch (com.google.android.gms.internal.ads.C3162aa e6) {
            p224w3.p.c("Failed to append the click signal to URL: ", e6);
            p174r3.v.s().x(e6, "TaggingLibraryJsInterface.recordClick");
        }
        this.f595i.d(uriA.toString(), null, null);
    }

    @android.webkit.JavascriptInterface
    @android.annotation.TargetApi(com.google.android.gms.internal.ads.C3040Ye.zzm)
    public java.lang.String getClickSignals(java.lang.String str) {
        try {
            long jA = p174r3.v.c().a();
            java.lang.String strE = this.f589c.c().e(this.f587a, str, this.f588b);
            if (this.f593g) {
                B3.AbstractC0797c.d(this.f592f, null, "csg", new android.util.Pair("clat", java.lang.String.valueOf(p174r3.v.c().a() - jA)));
            }
            return strE;
        } catch (java.lang.RuntimeException e6) {
            p224w3.p.e("Exception getting click signals. ", e6);
            p174r3.v.s().x(e6, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @android.webkit.JavascriptInterface
    @android.annotation.TargetApi(com.google.android.gms.internal.ads.C3040Ye.zzm)
    public java.lang.String getClickSignalsWithTimeout(final java.lang.String str, int i6) {
        if (i6 <= 0) {
            p224w3.p.d("Invalid timeout for getting click signals. Timeout=" + i6);
            return "";
        }
        try {
            return (java.lang.String) com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.H0(new java.util.concurrent.Callable() { // from class: B3.U
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f571a.getClickSignals(str);
                }
            }).get(java.lang.Math.min(i6, this.f591e), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e6) {
            p224w3.p.e("Exception getting click signals with timeout. ", e6);
            p174r3.v.s().x(e6, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e6 instanceof java.util.concurrent.TimeoutException ? "17" : "";
        }
    }

    @android.webkit.JavascriptInterface
    @android.annotation.TargetApi(com.google.android.gms.internal.ads.C3040Ye.zzm)
    public java.lang.String getQueryInfo() {
        p174r3.v.t();
        java.lang.String string = java.util.UUID.randomUUID().toString();
        final android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final B3.Y y6 = new B3.Y(this, string);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28091c.e()).booleanValue()) {
            this.f596j.g(this.f588b, y6);
        } else {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25760z9)).booleanValue()) {
                this.f594h.execute(new java.lang.Runnable() { // from class: B3.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f573C.e(bundle, y6);
                    }
                });
            } else {
                D3.a.a(this.f587a, p104k3.EnumC6886c.BANNER, ((k3.g.a) new k3.g.a().b(com.google.ads.mediation.admob.AdMobAdapter.class, bundle)).g(), y6);
            }
        }
        return string;
    }

    @android.webkit.JavascriptInterface
    @android.annotation.TargetApi(com.google.android.gms.internal.ads.C3040Ye.zzm)
    public java.lang.String getViewSignals() {
        try {
            long jA = p174r3.v.c().a();
            java.lang.String strI = this.f589c.c().i(this.f587a, this.f588b, null);
            if (this.f593g) {
                B3.AbstractC0797c.d(this.f592f, null, "vsg", new android.util.Pair("vlat", java.lang.String.valueOf(p174r3.v.c().a() - jA)));
            }
            return strI;
        } catch (java.lang.RuntimeException e6) {
            p224w3.p.e("Exception getting view signals. ", e6);
            p174r3.v.s().x(e6, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @android.webkit.JavascriptInterface
    @android.annotation.TargetApi(com.google.android.gms.internal.ads.C3040Ye.zzm)
    public java.lang.String getViewSignalsWithTimeout(int i6) {
        if (i6 <= 0) {
            p224w3.p.d("Invalid timeout for getting view signals. Timeout=" + i6);
            return "";
        }
        try {
            return (java.lang.String) com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.H0(new java.util.concurrent.Callable() { // from class: B3.S
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f568a.getViewSignals();
                }
            }).get(java.lang.Math.min(i6, this.f591e), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e6) {
            p224w3.p.e("Exception getting view signals with timeout. ", e6);
            p174r3.v.s().x(e6, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e6 instanceof java.util.concurrent.TimeoutException ? "17" : "";
        }
    }

    @android.webkit.JavascriptInterface
    @android.annotation.TargetApi(com.google.android.gms.internal.ads.C3040Ye.zzm)
    public void recordClick(final java.lang.String str) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25227B9)).booleanValue() || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: B3.T
            @Override // java.lang.Runnable
            public final void run() {
                this.f569C.f(str);
            }
        });
    }

    @android.webkit.JavascriptInterface
    @android.annotation.TargetApi(com.google.android.gms.internal.ads.C3040Ye.zzm)
    public void reportTouchEvent(java.lang.String str) {
        int i6;
        int i10;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int i11 = jSONObject.getInt("x");
            int i12 = jSONObject.getInt("y");
            int i13 = jSONObject.getInt("duration_ms");
            float f6 = (float) jSONObject.getDouble("force");
            int i14 = jSONObject.getInt("type");
            try {
                if (i14 != 0) {
                    int i15 = 1;
                    if (i14 != 1) {
                        i15 = 2;
                        if (i14 != 2) {
                            i15 = 3;
                            i10 = i14 != 3 ? -1 : 0;
                            this.f589c.d(android.view.MotionEvent.obtain(0L, i13, i6, i11, i12, f6, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                            return;
                        }
                    }
                    i6 = i15;
                    this.f589c.d(android.view.MotionEvent.obtain(0L, i13, i6, i11, i12, f6, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                    return;
                }
                this.f589c.d(android.view.MotionEvent.obtain(0L, i13, i6, i11, i12, f6, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            } catch (java.lang.RuntimeException e6) {
                e = e6;
                p224w3.p.e("Failed to parse the touch string. ", e);
                p174r3.v.s().x(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            } catch (org.json.JSONException e10) {
                e = e10;
                p224w3.p.e("Failed to parse the touch string. ", e);
                p174r3.v.s().x(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            }
            i6 = i10;
        } catch (java.lang.RuntimeException | org.json.JSONException e11) {
            e = e11;
        }
    }
}
