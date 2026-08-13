package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5886zI implements com.google.android.gms.internal.ads.InterfaceC4459mJ {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p184s3.A0 f40249C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.HJ f40250D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f40251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4789pJ f40252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.json.JSONObject f40253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PL f40254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3581eJ f40255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f40256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XC f40257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.CC f40258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KG f40259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f40260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p224w3.a f40261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f40262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4306ky f40263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.LJ f40264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final V3.f f40265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.GG f40266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f40267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.HM f40268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q90 f40269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC5240tT f40270t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f40272v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f40271u = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f40273w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f40274x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private android.graphics.Point f40275y = new android.graphics.Point();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private android.graphics.Point f40276z = new android.graphics.Point();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f40247A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f40248B = 0;

    public C5886zI(android.content.Context context, com.google.android.gms.internal.ads.C4789pJ c4789pJ, org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.PL pl, com.google.android.gms.internal.ads.C3581eJ c3581eJ, com.google.android.gms.internal.ads.Z9 z10, com.google.android.gms.internal.ads.XC xc, com.google.android.gms.internal.ads.CC cc, com.google.android.gms.internal.ads.KG kg, com.google.android.gms.internal.ads.R60 r60, p224w3.a aVar, com.google.android.gms.internal.ads.C4546n70 c4546n70, com.google.android.gms.internal.ads.C4306ky c4306ky, com.google.android.gms.internal.ads.LJ lj, V3.f fVar, com.google.android.gms.internal.ads.GG gg, com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT, com.google.android.gms.internal.ads.HM hm, com.google.android.gms.internal.ads.HJ hj) {
        this.f40251a = context;
        this.f40252b = c4789pJ;
        this.f40253c = jSONObject;
        this.f40254d = pl;
        this.f40255e = c3581eJ;
        this.f40256f = z10;
        this.f40257g = xc;
        this.f40258h = cc;
        this.f40259i = kg;
        this.f40260j = r60;
        this.f40261k = aVar;
        this.f40262l = c4546n70;
        this.f40263m = c4306ky;
        this.f40264n = lj;
        this.f40265o = fVar;
        this.f40266p = gg;
        this.f40267q = c2559La0;
        this.f40269s = q90;
        this.f40270t = binderC5240tT;
        this.f40268r = hm;
        this.f40250D = hj;
    }

    private final boolean A() {
        return this.f40253c.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean B(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4, java.lang.String str, org.json.JSONObject jSONObject5, boolean z6, android.view.View view) {
        com.google.android.gms.internal.ads.PL pl;
        java.lang.String str2;
        com.google.android.gms.internal.ads.InterfaceC3838gj c5336uI;
        try {
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            jSONObject6.put("ad", this.f40253c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25254E3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z6);
            android.content.Context context = this.f40251a;
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            p174r3.v.t();
            android.util.DisplayMetrics displayMetricsZ = p214v3.E0.Z((android.view.WindowManager) context.getSystemService("window"));
            com.google.android.gms.internal.ads.AbstractC5776yI abstractC5776yI = null;
            try {
                jSONObject7.put("width", p184s3.C7147y.b().e(context, displayMetricsZ.widthPixels));
                jSONObject7.put("height", p184s3.C7147y.b().e(context, displayMetricsZ.heightPixels));
            } catch (org.json.JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25749y8)).booleanValue()) {
                pl = this.f40254d;
                str2 = "/clickRecorded";
                c5336uI = new com.google.android.gms.internal.ads.C5446vI(this, abstractC5776yI);
            } else {
                pl = this.f40254d;
                str2 = "/logScionEvent";
                c5336uI = new com.google.android.gms.internal.ads.C5336uI(this, abstractC5776yI);
            }
            pl.l(str2, c5336uI);
            this.f40254d.l("/nativeImpression", new com.google.android.gms.internal.ads.C5556wI(this, view, abstractC5776yI));
            com.google.android.gms.internal.ads.AbstractC3854gr.a(this.f40254d.g("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f40271u) {
                return true;
            }
            com.google.android.gms.internal.ads.R60 r60 = this.f40260j;
            this.f40271u = p174r3.v.w().n(this.f40251a, this.f40261k.f56217C, r60.f31136C.toString(), this.f40262l.f37513f);
            return true;
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Unable to create impression JSON.", e6);
            return false;
        }
    }

    private final java.lang.String w(android.view.View view) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25254E3)).booleanValue()) {
            return null;
        }
        try {
            return this.f40256f.c().i(this.f40251a, view, null);
        } catch (java.lang.Exception unused) {
            p224w3.p.d("Exception getting data.");
            return null;
        }
    }

    private final java.lang.String x(android.view.View view, java.util.Map map) {
        if (map != null && view != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (view.equals((android.view.View) ((java.lang.ref.WeakReference) entry.getValue()).get())) {
                    return (java.lang.String) entry.getKey();
                }
            }
        }
        int iP = this.f40255e.P();
        if (iP == 1) {
            return "1099";
        }
        if (iP == 2) {
            return "2099";
        }
        if (iP != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean y(java.lang.String str) {
        org.json.JSONObject jSONObjectOptJSONObject = this.f40253c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    protected final void G(android.view.View view, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4, java.lang.String str, org.json.JSONObject jSONObject5, org.json.JSONObject jSONObject6, boolean z6, boolean z10) {
        java.lang.String strE;
        try {
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            jSONObject7.put("ad", this.f40253c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f40252b.c(this.f40255e.a()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            org.json.JSONObject jSONObject8 = new org.json.JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f40255e.P());
            jSONObject8.put("view_aware_api_used", z6);
            com.google.android.gms.internal.ads.C3505dh c3505dh = this.f40262l.f37516i;
            jSONObject8.put("custom_mute_requested", c3505dh != null && c3505dh.f34781I);
            jSONObject8.put("custom_mute_enabled", (this.f40255e.h().isEmpty() || this.f40255e.X() == null) ? false : true);
            if (this.f40264n.a() != null && this.f40253c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f40265o.a());
            if (this.f40274x && A()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z10) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f40252b.c(this.f40255e.a()) != null);
            try {
                org.json.JSONObject jSONObjectOptJSONObject = this.f40253c.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new org.json.JSONObject();
                }
                strE = this.f40256f.c().e(this.f40251a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (java.lang.Exception e6) {
                p224w3.p.e("Exception obtaining click signals", e6);
                strE = null;
            }
            jSONObject8.put("click_signals", strE);
            jSONObject8.put("open_chrome_custom_tab", true);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25237C8)).booleanValue() && V3.n.k()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25248D8)).booleanValue() && V3.n.k()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            org.json.JSONObject jSONObject9 = new org.json.JSONObject();
            long jA = this.f40265o.a();
            jSONObject9.put("time_from_last_touch_down", jA - this.f40247A);
            jSONObject9.put("time_from_last_touch", jA - this.f40248B);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.f40260j.b()) {
                org.json.JSONObject jSONObject10 = (org.json.JSONObject) this.f40253c.get("tracking_urls_and_actions");
                java.lang.String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.f40270t.x6(string, this.f40255e);
                }
            }
            com.google.android.gms.internal.ads.AbstractC3854gr.a(this.f40254d.g("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (org.json.JSONException e10) {
            p224w3.p.e("Unable to create click JSON.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final boolean Y() {
        if (a() == 0) {
            return true;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.tb)).booleanValue()) {
            return this.f40262l.f37516i.f34784L;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final int a() {
        if (this.f40262l.f37516i == null) {
            return 0;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.tb)).booleanValue()) {
            return this.f40262l.f37516i.f34783K;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void b(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        android.content.Context context = this.f40251a;
        B(p214v3.Y.g(context, view), p214v3.Y.d(context, map, map2, view, scaleType), p214v3.Y.f(view), p214v3.Y.e(context, view), w(view), null, p214v3.Y.h(context, this.f40260j), view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void c(p184s3.D0 d6) {
        try {
            if (this.f40273w) {
                return;
            }
            if (d6 == null) {
                com.google.android.gms.internal.ads.C3581eJ c3581eJ = this.f40255e;
                if (c3581eJ.X() != null) {
                    this.f40273w = true;
                    this.f40267q.d(c3581eJ.X().e(), this.f40260j.f31207x0, this.f40269s);
                    g();
                    return;
                }
            }
            this.f40273w = true;
            this.f40267q.d(d6.e(), this.f40260j.f31207x0, this.f40269s);
            g();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void d(android.view.View view) {
        if (!this.f40253c.optBoolean("custom_one_point_five_click_enabled", false)) {
            p224w3.p.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        com.google.android.gms.internal.ads.LJ lj = this.f40264n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(lj);
        view.setClickable(true);
        lj.f29469I = new java.lang.ref.WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final boolean e(android.os.Bundle bundle) {
        if (y("impression_reporting")) {
            return B(null, null, null, null, ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.pb)).booleanValue() ? w(null) : null, p184s3.C7147y.b().m(bundle, null), false, null);
        }
        p224w3.p.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void f(android.view.View view, java.util.Map map, java.util.Map map2, android.view.View.OnTouchListener onTouchListener, android.view.View.OnClickListener onClickListener) {
        this.f40275y = new android.graphics.Point();
        this.f40276z = new android.graphics.Point();
        if (!this.f40272v) {
            this.f40266p.q1(view);
            this.f40272v = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f40263m.c(this);
        boolean zI = p214v3.Y.i(this.f40261k.f56219E);
        if (map != null) {
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zI) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            java.util.Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                android.view.View view3 = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zI) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void g() {
        try {
            p184s3.A0 a6 = this.f40249C;
            if (a6 != null) {
                a6.d();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void h() {
        if (this.f40253c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f40264n.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void i(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z6, android.widget.ImageView.ScaleType scaleType) {
        android.content.Context context = this.f40251a;
        org.json.JSONObject jSONObjectD = p214v3.Y.d(context, map, map2, view2, scaleType);
        org.json.JSONObject jSONObjectG = p214v3.Y.g(context, view2);
        org.json.JSONObject jSONObjectF = p214v3.Y.f(view2);
        org.json.JSONObject jSONObjectE = p214v3.Y.e(context, view2);
        java.lang.String strX = x(view, map);
        G(true == ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25331L3)).booleanValue() ? view2 : view, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strX, p214v3.Y.c(strX, context, this.f40276z, this.f40275y), null, z6, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void j() {
        this.f40254d.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void k(android.os.Bundle bundle) {
        if (bundle == null) {
            p224w3.p.b("Click data is null. No click is reported.");
        } else if (!y("click_reporting")) {
            p224w3.p.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            android.os.Bundle bundle2 = bundle.getBundle("click_signal");
            G(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, p184s3.C7147y.b().m(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void l(android.view.View view, java.util.Map map) {
        this.f40275y = new android.graphics.Point();
        this.f40276z = new android.graphics.Point();
        if (view != null) {
            this.f40266p.r1(view);
        }
        this.f40272v = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void m(android.os.Bundle bundle) {
        if (bundle == null) {
            p224w3.p.b("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!y("touch_reporting")) {
            p224w3.p.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f40256f.c().g((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void n(android.view.View view, android.view.MotionEvent motionEvent, android.view.View view2) {
        this.f40275y = p214v3.Y.a(motionEvent, view2);
        long jA = this.f40265o.a();
        this.f40248B = jA;
        if (motionEvent.getAction() == 0) {
            this.f40268r.b(motionEvent);
            this.f40247A = jA;
            this.f40276z = this.f40275y;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        android.graphics.Point point = this.f40275y;
        motionEventObtain.setLocation(point.x, point.y);
        this.f40256f.d(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void o(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z6, android.widget.ImageView.ScaleType scaleType, int i6) {
        org.json.JSONObject jSONObject;
        boolean z10 = false;
        if (this.f40253c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.tb)).booleanValue()) {
                z10 = true;
            }
        }
        if (!z10) {
            if (!this.f40274x) {
                p224w3.p.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!A()) {
                p224w3.p.b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        org.json.JSONObject jSONObjectD = p214v3.Y.d(this.f40251a, map, map2, view2, scaleType);
        org.json.JSONObject jSONObjectG = p214v3.Y.g(this.f40251a, view2);
        org.json.JSONObject jSONObjectF = p214v3.Y.f(view2);
        org.json.JSONObject jSONObjectE = p214v3.Y.e(this.f40251a, view2);
        java.lang.String strX = x(view, map);
        org.json.JSONObject jSONObjectC = p214v3.Y.c(strX, this.f40251a, this.f40276z, this.f40275y);
        if (z10) {
            try {
                org.json.JSONObject jSONObject2 = this.f40253c;
                android.graphics.Point point = this.f40276z;
                android.graphics.Point point2 = this.f40275y;
                try {
                    jSONObject = new org.json.JSONObject();
                    try {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i6);
                    } catch (java.lang.Exception e6) {
                        e = e6;
                        p224w3.p.e("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (java.lang.Exception e10) {
                    e = e10;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (org.json.JSONException e11) {
                p224w3.p.e("Error occurred while adding CustomClickGestureSignals to adJson.", e11);
                p174r3.v.s().x(e11, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        G(view2, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strX, jSONObjectC, null, z6, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void p(com.google.android.gms.internal.ads.InterfaceC3946hi interfaceC3946hi) {
        if (this.f40253c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f40264n.c(interfaceC3946hi);
        } else {
            p224w3.p.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final org.json.JSONObject q(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        android.content.Context context = this.f40251a;
        org.json.JSONObject jSONObjectD = p214v3.Y.d(context, map, map2, view, scaleType);
        org.json.JSONObject jSONObjectG = p214v3.Y.g(context, view);
        org.json.JSONObject jSONObjectF = p214v3.Y.f(view);
        org.json.JSONObject jSONObjectE = p214v3.Y.e(context, view);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectD);
            jSONObject.put("ad_view_signal", jSONObjectG);
            jSONObject.put("scroll_view_signal", jSONObjectF);
            jSONObject.put("lock_screen_signal", jSONObjectE);
            return jSONObject;
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Unable to create native ad view signals JSON.", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final boolean r() {
        return A();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void s() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ad", this.f40253c);
            com.google.android.gms.internal.ads.AbstractC3854gr.a(this.f40254d.g("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (org.json.JSONException e6) {
            p224w3.p.e("", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void t(p184s3.A0 a6) {
        this.f40249C = a6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void u() {
        B(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void u0(java.lang.String str) {
        G(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final org.json.JSONObject v(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        org.json.JSONObject jSONObjectQ = q(view, map, map2, scaleType);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (this.f40274x && A()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectQ != null) {
                jSONObject.put("nas", jSONObjectQ);
            }
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Unable to create native click meta data JSON.", e6);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void z() {
        this.f40274x = true;
    }
}
