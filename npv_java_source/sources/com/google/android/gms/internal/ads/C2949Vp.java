package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2949Vp implements com.google.android.gms.internal.ads.InterfaceC3194aq {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final java.util.List f32574l = j$.util.DesugarCollections.synchronizedList(new java.util.ArrayList());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f32575m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4965qx0 f32576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.LinkedHashMap f32577b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.content.Context f32580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f32581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3021Xp f32582g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f32578c = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f32579d = new java.util.ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.Object f32583h = new java.lang.Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.HashSet f32584i = new java.util.HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f32585j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f32586k = false;

    public C2949Vp(android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.C3021Xp c3021Xp, java.lang.String str, com.google.android.gms.internal.ads.C2985Wp c2985Wp) {
        Q3.AbstractC1477p.m(c3021Xp, "SafeBrowsing config is not present.");
        this.f32580e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f32577b = new java.util.LinkedHashMap();
        this.f32582g = c3021Xp;
        java.util.Iterator it = c3021Xp.f33175G.iterator();
        while (it.hasNext()) {
            this.f32584i.add(((java.lang.String) it.next()).toLowerCase(java.util.Locale.ENGLISH));
        }
        this.f32584i.remove("cookie".toLowerCase(java.util.Locale.ENGLISH));
        com.google.android.gms.internal.ads.C4965qx0 c4965qx0B0 = com.google.android.gms.internal.ads.C5406uy0.b0();
        c4965qx0B0.O(9);
        c4965qx0B0.J(str);
        c4965qx0B0.H(str);
        com.google.android.gms.internal.ads.C5074rx0 c5074rx0B0 = com.google.android.gms.internal.ads.C5184sx0.b0();
        java.lang.String str2 = this.f32582g.f33171C;
        if (str2 != null) {
            c5074rx0B0.z(str2);
        }
        c4965qx0B0.G((com.google.android.gms.internal.ads.C5184sx0) c5074rx0B0.u());
        com.google.android.gms.internal.ads.C4417ly0 c4417ly0B0 = com.google.android.gms.internal.ads.C4527my0.b0();
        c4417ly0B0.B(W3.e.a(this.f32580e).g());
        java.lang.String str3 = aVar.f56217C;
        if (str3 != null) {
            c4417ly0B0.z(str3);
        }
        long jA = N3.C1395h.f().a(this.f32580e);
        if (jA > 0) {
            c4417ly0B0.A(jA);
        }
        c4965qx0B0.F((com.google.android.gms.internal.ads.C4527my0) c4417ly0B0.u());
        this.f32576a = c4965qx0B0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194aq
    public final com.google.android.gms.internal.ads.C3021Xp a() {
        return this.f32582g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194aq
    public final void a0(java.lang.String str) {
        synchronized (this.f32583h) {
            try {
                if (str == null) {
                    this.f32576a.C();
                } else {
                    this.f32576a.E(str);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194aq
    public final void b(java.lang.String str, java.util.Map map, int i6) {
        synchronized (this.f32583h) {
            if (i6 == 3) {
                try {
                    this.f32586k = true;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (this.f32577b.containsKey(str)) {
                if (i6 == 3) {
                    ((com.google.android.gms.internal.ads.C4197jy0) this.f32577b.get(str)).E(4);
                }
                return;
            }
            com.google.android.gms.internal.ads.C4197jy0 c4197jy0C0 = com.google.android.gms.internal.ads.C4307ky0.c0();
            int iA = com.google.android.gms.internal.ads.AbstractC4087iy0.a(i6);
            if (iA != 0) {
                c4197jy0C0.E(iA);
            }
            c4197jy0C0.A(this.f32577b.size());
            c4197jy0C0.C(str);
            com.google.android.gms.internal.ads.Hx0 hx0B0 = com.google.android.gms.internal.ads.Kx0.b0();
            if (!this.f32584i.isEmpty() && map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    java.lang.String str2 = entry.getKey() != null ? (java.lang.String) entry.getKey() : "";
                    java.lang.String str3 = entry.getValue() != null ? (java.lang.String) entry.getValue() : "";
                    if (this.f32584i.contains(str2.toLowerCase(java.util.Locale.ENGLISH))) {
                        com.google.android.gms.internal.ads.Bx0 bx0B0 = com.google.android.gms.internal.ads.Cx0.b0();
                        bx0B0.z(com.google.android.gms.internal.ads.AbstractC3753fv0.U(str2));
                        bx0B0.A(com.google.android.gms.internal.ads.AbstractC3753fv0.U(str3));
                        hx0B0.z((com.google.android.gms.internal.ads.Cx0) bx0B0.u());
                    }
                }
            }
            c4197jy0C0.B((com.google.android.gms.internal.ads.Kx0) hx0B0.u());
            this.f32577b.put(str, c4197jy0C0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194aq
    public final void c(android.view.View view) {
        android.graphics.Bitmap bitmapCreateBitmap;
        if (this.f32582g.f33173E && !this.f32585j) {
            p174r3.v.t();
            final android.graphics.Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    android.graphics.Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? android.graphics.Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (java.lang.RuntimeException e6) {
                        e = e6;
                        p224w3.p.e("Fail to capture the web view", e);
                    }
                } catch (java.lang.RuntimeException e10) {
                    e = e10;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            p224w3.p.g("Width or height of view is zero");
                        } else {
                            android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.RGB_565);
                            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (java.lang.RuntimeException e11) {
                        p224w3.p.e("Fail to capture the webview", e11);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                com.google.android.gms.internal.ads.AbstractC3093Zp.a("Failed to capture the webview bitmap.");
            } else {
                this.f32585j = true;
                p214v3.E0.M(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Rp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31364C.g(bitmap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194aq
    public final void d() {
        synchronized (this.f32583h) {
            this.f32577b.keySet();
            P4.d dVarH = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(java.util.Collections.emptyMap());
            com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0 = new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.Qp
                @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                public final P4.d b(java.lang.Object obj) {
                    return this.f31061a.e((java.util.Map) obj);
                }
            };
            com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34801g;
            P4.d dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVarH, interfaceC5268tk0, yk0);
            P4.d dVarO = com.google.android.gms.internal.ads.AbstractC2652Nk0.o(dVarN, 10L, java.util.concurrent.TimeUnit.SECONDS, com.google.android.gms.internal.ads.AbstractC3524dr.f34798d);
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarN, new com.google.android.gms.internal.ads.C2913Up(this, dVarO), yk0);
            f32574l.add(dVarO);
        }
    }

    final /* synthetic */ P4.d e(java.util.Map map) {
        com.google.android.gms.internal.ads.C4197jy0 c4197jy0;
        P4.d dVarM;
        if (map != null) {
            try {
                for (java.lang.String str : map.keySet()) {
                    org.json.JSONArray jSONArrayOptJSONArray = new org.json.JSONObject((java.lang.String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.f32583h) {
                            try {
                                int length = jSONArrayOptJSONArray.length();
                                synchronized (this.f32583h) {
                                    try {
                                        c4197jy0 = (com.google.android.gms.internal.ads.C4197jy0) this.f32577b.get(str);
                                    } catch (java.lang.Throwable th) {
                                        throw th;
                                    }
                                }
                                if (c4197jy0 == null) {
                                    com.google.android.gms.internal.ads.AbstractC3093Zp.a("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i6 = 0; i6 < length; i6++) {
                                        c4197jy0.z(jSONArrayOptJSONArray.getJSONObject(i6).getString("threat_type"));
                                    }
                                    this.f32581f = (length > 0) | this.f32581f;
                                }
                            } catch (java.lang.Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            } catch (org.json.JSONException e6) {
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2533Kg.f28994a.e()).booleanValue()) {
                    p224w3.p.c("Failed to get SafeBrowsing metadata", e6);
                }
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new java.lang.Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f32581f) {
            synchronized (this.f32583h) {
                this.f32576a.O(10);
            }
        }
        boolean z6 = this.f32581f;
        if (!(z6 && this.f32582g.f33177I) && (!(this.f32586k && this.f32582g.f33176H) && (z6 || !this.f32582g.f33174F))) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        }
        synchronized (this.f32583h) {
            try {
                java.util.Iterator it = this.f32577b.values().iterator();
                while (it.hasNext()) {
                    this.f32576a.B((com.google.android.gms.internal.ads.C4307ky0) ((com.google.android.gms.internal.ads.C4197jy0) it.next()).u());
                }
                this.f32576a.z(this.f32578c);
                this.f32576a.A(this.f32579d);
                if (com.google.android.gms.internal.ads.AbstractC3093Zp.b()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Sending SB report\n  url: " + this.f32576a.L() + "\n  clickUrl: " + this.f32576a.K() + "\n  resources: \n");
                    for (com.google.android.gms.internal.ads.C4307ky0 c4307ky0 : this.f32576a.M()) {
                        sb.append("    [");
                        sb.append(c4307ky0.b0());
                        sb.append("] ");
                        sb.append(c4307ky0.e0());
                    }
                    com.google.android.gms.internal.ads.AbstractC3093Zp.a(sb.toString());
                }
                P4.d dVarB = new p214v3.Q(this.f32580e).b(1, this.f32582g.f33172D, null, ((com.google.android.gms.internal.ads.C5406uy0) this.f32576a.u()).l());
                if (com.google.android.gms.internal.ads.AbstractC3093Zp.b()) {
                    dVarB.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Sp
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.gms.internal.ads.AbstractC3093Zp.a("Pinged SB successfully.");
                        }
                    }, com.google.android.gms.internal.ads.AbstractC3524dr.f34795a);
                }
                dVarM = com.google.android.gms.internal.ads.AbstractC2652Nk0.m(dVarB, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.Tp
                    @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                    public final java.lang.Object apply(java.lang.Object obj) {
                        int i10 = com.google.android.gms.internal.ads.C2949Vp.f32575m;
                        return null;
                    }
                }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
            } catch (java.lang.Throwable th3) {
                throw th3;
            }
        }
        return dVarM;
    }

    final /* synthetic */ void g(android.graphics.Bitmap bitmap) {
        com.google.android.gms.internal.ads.C3533dv0 c3533dv0R = com.google.android.gms.internal.ads.AbstractC3753fv0.R();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, c3533dv0R);
        synchronized (this.f32583h) {
            com.google.android.gms.internal.ads.C4965qx0 c4965qx0 = this.f32576a;
            com.google.android.gms.internal.ads.C3430cy0 c3430cy0B0 = com.google.android.gms.internal.ads.C3649ey0.b0();
            c3430cy0B0.z(c3533dv0R.f());
            c3430cy0B0.A("image/png");
            c3430cy0B0.B(2);
            c4965qx0.I((com.google.android.gms.internal.ads.C3649ey0) c3430cy0B0.u());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194aq
    public final boolean h() {
        return V3.n.d() && this.f32582g.f33173E && !this.f32585j;
    }
}
