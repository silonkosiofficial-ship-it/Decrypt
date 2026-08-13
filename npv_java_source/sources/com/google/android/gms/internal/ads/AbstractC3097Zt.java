package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3097Zt extends android.webkit.WebViewClient implements com.google.android.gms.internal.ads.InterfaceC2552Ku {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f33677j0 = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f33678C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4704od f33679D;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p184s3.InterfaceC7076a f33682G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private p204u3.z f33683H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2478Iu f33684I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2515Ju f33685J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5483vi f33686K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5703xi f33687L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private com.google.android.gms.internal.ads.MG f33688M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f33689N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f33690O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f33694S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f33695T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f33696U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f33697V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private p204u3.InterfaceC7202d f33698W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5493vn f33699X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private p174r3.b f33700Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected com.google.android.gms.internal.ads.InterfaceC3194aq f33702a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3588eO f33703b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f33704c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f33705d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f33706e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f33707f0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC5240tT f33709h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private android.view.View.OnAttachStateChangeListener f33710i0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.HashMap f33680E = new java.util.HashMap();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.Object f33681F = new java.lang.Object();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f33691P = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private java.lang.String f33692Q = "";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private java.lang.String f33693R = "";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4944qn f33701Z = null;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final java.util.HashSet f33708g0 = new java.util.HashSet(java.util.Arrays.asList(((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25234C5)).split(",")));

    public AbstractC3097Zt(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C4704od c4704od, boolean z6, com.google.android.gms.internal.ads.C5493vn c5493vn, com.google.android.gms.internal.ads.C4944qn c4944qn, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT) {
        this.f33679D = c4704od;
        this.f33678C = interfaceC2698Ot;
        this.f33694S = z6;
        this.f33699X = c5493vn;
        this.f33709h0 = binderC5240tT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(final android.view.View view, final com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq, final int i6) {
        if (!interfaceC3194aq.h() || i6 <= 0) {
            return;
        }
        interfaceC3194aq.c(view);
        if (interfaceC3194aq.h()) {
            p214v3.E0.f55826l.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Pt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30831C.q0(view, interfaceC3194aq, i6);
                }
            }, 100L);
        }
    }

    private static final boolean C(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        return interfaceC2698Ot.Q() != null && interfaceC2698Ot.Q().b();
    }

    private static final boolean E(boolean z6, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        return (!z6 || interfaceC2698Ot.I().i() || interfaceC2698Ot.Y().equals("interstitial_mb")) ? false : true;
    }

    private static android.webkit.WebResourceResponse q() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25427U0)).booleanValue()) {
            return new android.webkit.WebResourceResponse("", "", new java.io.ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final android.webkit.WebResourceResponse r(java.lang.String str, java.util.Map map) throws java.io.IOException {
        android.webkit.WebResourceResponse webResourceResponseB;
        java.net.URL url = new java.net.URL(str);
        try {
            android.net.TrafficStats.setThreadStatsTag(264);
            int i6 = 0;
            while (true) {
                i6++;
                if (i6 > 20) {
                    android.net.TrafficStats.clearThreadStatsTag();
                    throw new java.io.IOException("Too many redirects (20)");
                }
                java.net.URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (java.util.Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof java.net.HttpURLConnection)) {
                    throw new java.io.IOException("Invalid protocol.");
                }
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) uRLConnectionOpenConnection;
                p174r3.v.t().K(this.f33678C.getContext(), this.f33678C.n().f56217C, false, httpURLConnection, false, 60000);
                webResourceResponseB = null;
                p224w3.m mVar = new p224w3.m(null);
                mVar.c(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                mVar.e(httpURLConnection, responseCode);
                if (responseCode >= 300 && responseCode < 400) {
                    java.lang.String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        throw new java.io.IOException("Missing Location header in redirect");
                    }
                    if (!headerField.startsWith("tel:")) {
                        java.net.URL url2 = new java.net.URL(url, headerField);
                        java.lang.String protocol = url2.getProtocol();
                        if (protocol == null) {
                            p224w3.p.g("Protocol is null");
                        } else if (protocol.equals("http") || protocol.equals("https")) {
                            p224w3.p.b("Redirecting to " + headerField);
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            p224w3.p.g("Unsupported scheme: " + protocol);
                        }
                        webResourceResponseB = q();
                        break;
                    }
                    break;
                }
                p174r3.v.t();
                p174r3.v.t();
                java.lang.String contentType = httpURLConnection.getContentType();
                java.lang.String strTrim = "";
                java.lang.String strTrim2 = android.text.TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                p174r3.v.t();
                java.lang.String contentType2 = httpURLConnection.getContentType();
                if (!android.text.TextUtils.isEmpty(contentType2)) {
                    java.lang.String[] strArrSplit = contentType2.split(";");
                    if (strArrSplit.length != 1) {
                        for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                            if (strArrSplit[i10].trim().startsWith("charset")) {
                                java.lang.String[] strArrSplit2 = strArrSplit[i10].trim().split("=");
                                if (strArrSplit2.length > 1) {
                                    strTrim = strArrSplit2[1].trim();
                                    break;
                                }
                            }
                        }
                    }
                }
                java.lang.String str2 = strTrim;
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
                java.util.HashMap map2 = new java.util.HashMap(headerFields.size());
                for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry2 : headerFields.entrySet()) {
                    if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                        map2.put(entry2.getKey(), entry2.getValue().get(0));
                    }
                }
                webResourceResponseB = p174r3.v.u().b(strTrim2, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map2, httpURLConnection.getInputStream());
                break;
            }
            android.net.TrafficStats.clearThreadStatsTag();
            return webResourceResponseB;
        } catch (java.lang.Throwable th) {
            android.net.TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(java.util.Map map, java.util.List list, java.lang.String str) {
        if (p214v3.AbstractC7265q0.m()) {
            p214v3.AbstractC7265q0.k("Received GMSG: ".concat(str));
            for (java.lang.String str2 : map.keySet()) {
                p214v3.AbstractC7265q0.k("  " + str2 + ": " + ((java.lang.String) map.get(str2)));
            }
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.InterfaceC3838gj) it.next()).a(this.f33678C, map);
        }
    }

    private final void w() {
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.f33710i0;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((android.view.View) this.f33678C).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    @Override // com.google.android.gms.internal.ads.MG
    public final void A() {
        com.google.android.gms.internal.ads.MG mg = this.f33688M;
        if (mg != null) {
            mg.A();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void A0(boolean z6) {
        synchronized (this.f33681F) {
            this.f33697V = z6;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void B0(com.google.android.gms.internal.ads.C2591Lx c2591Lx, com.google.android.gms.internal.ads.C4033iT c4033iT, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        e("/open");
        b("/open", new com.google.android.gms.internal.ads.C5265tj(this.f33700Y, this.f33701Z, c4033iT, c3588eO, c2591Lx));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void C0(com.google.android.gms.internal.ads.R60 r60) {
        if (p174r3.v.r().p(this.f33678C.getContext())) {
            e("/logScionEvent");
            new java.util.HashMap();
            b("/logScionEvent", new com.google.android.gms.internal.ads.C4496mj(this.f33678C.getContext(), r60.f31205w0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void D(com.google.android.gms.internal.ads.InterfaceC2478Iu interfaceC2478Iu) {
        this.f33684I = interfaceC2478Iu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void D0(android.net.Uri uri) {
        p214v3.AbstractC7265q0.k("Received GMSG: ".concat(java.lang.String.valueOf(uri)));
        java.util.HashMap map = this.f33680E;
        java.lang.String path = uri.getPath();
        java.util.List list = (java.util.List) map.get(path);
        if (path == null || list == null) {
            p214v3.AbstractC7265q0.k("No GMSG handler found for GMSG: ".concat(java.lang.String.valueOf(uri)));
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.B6)).booleanValue() || p174r3.v.s().h() == null) {
                return;
            }
            final java.lang.String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.St
                @Override // java.lang.Runnable
                public final void run() throws java.lang.Throwable {
                    int i6 = com.google.android.gms.internal.ads.AbstractC3097Zt.f33677j0;
                    p174r3.v.s().h().e(strSubstring);
                }
            });
            return;
        }
        java.lang.String encodedQuery = uri.getEncodedQuery();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25224B5)).booleanValue() && this.f33708g0.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25245D5)).intValue()) {
                p214v3.AbstractC7265q0.k("Parsing gmsg query params on BG thread: ".concat(path));
                com.google.android.gms.internal.ads.AbstractC2652Nk0.r(p174r3.v.t().G(uri), new com.google.android.gms.internal.ads.C2953Vt(this, list, path, uri), com.google.android.gms.internal.ads.AbstractC3524dr.f34800f);
                return;
            }
        }
        p174r3.v.t();
        t(p214v3.E0.p(uri), list, path);
    }

    public final android.view.ViewTreeObserver.OnScrollChangedListener F() {
        synchronized (this.f33681F) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02b8 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #13 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0028, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0082, B:22:0x0099, B:23:0x009c, B:25:0x009f, B:28:0x00b9, B:30:0x00d1, B:31:0x00db, B:33:0x00e9, B:78:0x01bc, B:50:0x0175, B:98:0x02a3, B:86:0x022a, B:87:0x0253, B:85:0x0202, B:49:0x014e, B:32:0x00de, B:88:0x0254, B:90:0x025e, B:92:0x0264, B:94:0x0297, B:100:0x02b2, B:102:0x02b8, B:104:0x02c6), top: B:113:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02cb A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f7 A[Catch: all -> 0x01b0, TryCatch #8 {all -> 0x01b0, blocks: (B:71:0x0195, B:73:0x01a7, B:77:0x01b2, B:81:0x01e5, B:83:0x01f7, B:84:0x01fe), top: B:112:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02a3 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #13 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0028, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0082, B:22:0x0099, B:23:0x009c, B:25:0x009f, B:28:0x00b9, B:30:0x00d1, B:31:0x00db, B:33:0x00e9, B:78:0x01bc, B:50:0x0175, B:98:0x02a3, B:86:0x022a, B:87:0x0253, B:85:0x0202, B:49:0x014e, B:32:0x00de, B:88:0x0254, B:90:0x025e, B:92:0x0264, B:94:0x0297, B:100:0x02b2, B:102:0x02b8, B:104:0x02c6), top: B:113:0x000c }] */
    /* JADX WARN: Multi-variable type inference failed */
    protected final android.webkit.WebResourceResponse G(java.lang.String str, java.util.Map map) throws java.lang.Throwable {
        int i6;
        java.io.InputStream inputStreamA;
        java.lang.Object objA;
        final boolean z6;
        java.io.InputStream inputStreamC;
        final boolean z10;
        final boolean z11;
        java.lang.String str2;
        try {
            java.util.Map map2 = new java.util.HashMap();
            if (this.f33678C.Q() != null) {
                map2 = this.f33678C.Q().f31205w0;
            }
            java.lang.String strC = com.google.android.gms.internal.ads.AbstractC5059rq.c(str, this.f33678C.getContext(), this.f33707f0, map2);
            if (!strC.equals(str)) {
                return r(strC, map);
            }
            com.google.android.gms.internal.ads.C3072Zc c3072ZcE = com.google.android.gms.internal.ads.C3072Zc.e(android.net.Uri.parse(str));
            if (c3072ZcE != null) {
                java.util.HashMap map3 = new java.util.HashMap();
                map3.put("Access-Control-Allow-Origin", "*");
                android.net.Uri uri = android.net.Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    java.util.List listF = com.google.android.gms.internal.ads.C2755Qg0.b(com.google.android.gms.internal.ads.AbstractC4271kg0.c('-')).f(uri.getQueryParameter("range"));
                    if (listF.size() == 2) {
                        int i10 = java.lang.Integer.parseInt((java.lang.String) listF.get(0));
                        int i11 = java.lang.Integer.parseInt((java.lang.String) listF.get(1)) + 1;
                        if (i10 > 0) {
                            c3072ZcE.f33623J = i10;
                        }
                        i6 = i11 - i10;
                    } else {
                        i6 = -1;
                    }
                } else {
                    i6 = -1;
                }
                java.lang.String str3 = "X-Afma-Gcache-CachedBytes";
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25666q4)).booleanValue()) {
                    c3072ZcE.f33624K = com.google.android.gms.internal.ads.AbstractC2829Sg0.c(this.f33678C.t());
                    c3072ZcE.f33625L = this.f33678C.e();
                    if (c3072ZcE.f33622I) {
                        objA = p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25686s4);
                    } else {
                        objA = p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25676r4);
                    }
                    try {
                        long jLongValue = ((java.lang.Long) objA).longValue();
                        long jC = p174r3.v.c().c();
                        p174r3.v.g();
                        java.util.concurrent.Future futureA = com.google.android.gms.internal.ads.C4374ld.a(this.f33678C.getContext(), c3072ZcE);
                        try {
                            com.google.android.gms.internal.ads.C4484md c4484md = (com.google.android.gms.internal.ads.C4484md) futureA.get(jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS);
                            try {
                                try {
                                    map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", java.lang.Boolean.toString(c4484md.d()));
                                    map3.put("X-Afma-Gcache-IsGcacheHit", java.lang.Boolean.toString(c4484md.f()));
                                    map3.put("X-Afma-Gcache-IsDownloaded", java.lang.Boolean.toString(c4484md.e()));
                                    map3.put("X-Afma-Gcache-CachedBytes", java.lang.Long.toString(c4484md.a()));
                                    inputStreamC = c4484md.c();
                                    if (i6 != -1) {
                                        try {
                                            inputStreamC = com.google.android.gms.internal.ads.AbstractC5486vj0.a(inputStreamC, i6);
                                        } catch (java.lang.InterruptedException e6) {
                                            e = e6;
                                            z11 = true;
                                            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25716v4)).booleanValue()) {
                                                p174r3.v.s().x(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureA.cancel(true);
                                            java.lang.Thread.currentThread().interrupt();
                                            final long jC2 = p174r3.v.c().c() - jC;
                                            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Tt
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.f32028C.c0(z11, jC2);
                                                }
                                            });
                                            str2 = "Cache connection took " + jC2 + "ms";
                                        } catch (java.util.concurrent.ExecutionException e10) {
                                            e = e10;
                                            z10 = true;
                                            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25716v4)).booleanValue()) {
                                                p174r3.v.s().x(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureA.cancel(true);
                                            final long jC3 = p174r3.v.c().c() - jC;
                                            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Tt
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.f32028C.c0(z10, jC3);
                                                }
                                            });
                                            str2 = "Cache connection took " + jC3 + "ms";
                                        } catch (java.util.concurrent.TimeoutException e11) {
                                            e = e11;
                                            z10 = true;
                                            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25716v4)).booleanValue()) {
                                                p174r3.v.s().x(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureA.cancel(true);
                                            final long jC4 = p174r3.v.c().c() - jC;
                                            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Tt
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.f32028C.c0(z10, jC4);
                                                }
                                            });
                                            str2 = "Cache connection took " + jC4 + "ms";
                                        }
                                    }
                                    final long jC5 = p174r3.v.c().c() - jC;
                                    final boolean z12 = true;
                                    p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Tt
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f32028C.c0(z12, jC5);
                                        }
                                    });
                                    str2 = "Cache connection took " + jC5 + "ms";
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    z6 = 1;
                                    final long jC6 = p174r3.v.c().c() - jC;
                                    p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Tt
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f32028C.c0(z6, jC6);
                                        }
                                    });
                                    p214v3.AbstractC7265q0.k("Cache connection took " + jC6 + "ms");
                                    throw th;
                                }
                            } catch (java.lang.InterruptedException e12) {
                                e = e12;
                                inputStreamC = null;
                            } catch (java.util.concurrent.ExecutionException e13) {
                                e = e13;
                                inputStreamC = null;
                                z10 = true;
                                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25716v4)).booleanValue()) {
                                    p174r3.v.s().x(e, "AdWebViewClient.interceptRequest.gcache");
                                }
                                futureA.cancel(true);
                                final long jC7 = p174r3.v.c().c() - jC;
                                p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Tt
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f32028C.c0(z10, jC7);
                                    }
                                });
                                str2 = "Cache connection took " + jC7 + "ms";
                                p214v3.AbstractC7265q0.k(str2);
                                inputStreamA = inputStreamC;
                                if (inputStreamA != null) {
                                    return new android.webkit.WebResourceResponse("", "", 200, "OK", map3, inputStreamA);
                                }
                                if (p224w3.m.k()) {
                                    return null;
                                }
                                return null;
                            } catch (java.util.concurrent.TimeoutException e14) {
                                e = e14;
                                inputStreamC = null;
                                z10 = true;
                                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25716v4)).booleanValue()) {
                                    p174r3.v.s().x(e, "AdWebViewClient.interceptRequest.gcache");
                                }
                                futureA.cancel(true);
                                final long jC8 = p174r3.v.c().c() - jC;
                                p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Tt
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f32028C.c0(z10, jC8);
                                    }
                                });
                                str2 = "Cache connection took " + jC8 + "ms";
                                p214v3.AbstractC7265q0.k(str2);
                                inputStreamA = inputStreamC;
                                if (inputStreamA != null) {
                                    return new android.webkit.WebResourceResponse("", "", 200, "OK", map3, inputStreamA);
                                }
                                if (p224w3.m.k()) {
                                    return null;
                                }
                                return null;
                            }
                        } catch (java.lang.InterruptedException e15) {
                            e = e15;
                            inputStreamC = null;
                            z11 = false;
                        } catch (java.util.concurrent.ExecutionException e16) {
                            e = e16;
                            inputStreamC = null;
                            z10 = false;
                            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25716v4)).booleanValue()) {
                                p174r3.v.s().x(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureA.cancel(true);
                            final long jC9 = p174r3.v.c().c() - jC;
                            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Tt
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f32028C.c0(z10, jC9);
                                }
                            });
                            str2 = "Cache connection took " + jC9 + "ms";
                            p214v3.AbstractC7265q0.k(str2);
                            inputStreamA = inputStreamC;
                            if (inputStreamA != null) {
                                return new android.webkit.WebResourceResponse("", "", 200, "OK", map3, inputStreamA);
                            }
                            if (p224w3.m.k()) {
                                return null;
                            }
                            return null;
                        } catch (java.util.concurrent.TimeoutException e17) {
                            e = e17;
                            inputStreamC = null;
                            z10 = false;
                            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25716v4)).booleanValue()) {
                                p174r3.v.s().x(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureA.cancel(true);
                            final long jC10 = p174r3.v.c().c() - jC;
                            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Tt
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f32028C.c0(z10, jC10);
                                }
                            });
                            str2 = "Cache connection took " + jC10 + "ms";
                            p214v3.AbstractC7265q0.k(str2);
                            inputStreamA = inputStreamC;
                            if (inputStreamA != null) {
                                return new android.webkit.WebResourceResponse("", "", 200, "OK", map3, inputStreamA);
                            }
                            if (p224w3.m.k()) {
                                return null;
                            }
                            return null;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            z6 = 0;
                        }
                        p214v3.AbstractC7265q0.k(str2);
                        inputStreamA = inputStreamC;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        z6 = str3;
                    }
                } else {
                    com.google.android.gms.internal.ads.C2964Wc c2964WcB = p174r3.v.f().b(c3072ZcE);
                    if (c2964WcB == null || !c2964WcB.C()) {
                        inputStreamA = null;
                    } else {
                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", java.lang.Boolean.toString(c2964WcB.w()));
                        map3.put("X-Afma-Gcache-IsGcacheHit", java.lang.Boolean.toString(c2964WcB.E()));
                        map3.put("X-Afma-Gcache-IsDownloaded", java.lang.Boolean.toString(c2964WcB.D()));
                        map3.put("X-Afma-Gcache-CachedBytes", java.lang.Long.toString(c2964WcB.e()));
                        java.io.InputStream inputStreamS = c2964WcB.s();
                        inputStreamA = i6 != -1 ? com.google.android.gms.internal.ads.AbstractC5486vj0.a(inputStreamS, i6) : inputStreamS;
                    }
                }
                if (inputStreamA != null) {
                    return new android.webkit.WebResourceResponse("", "", 200, "OK", map3, inputStreamA);
                }
            }
            if (p224w3.m.k() || !((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5809yg.f40123b.e()).booleanValue()) {
                return null;
            }
            return r(str, map);
        } catch (java.lang.Exception e18) {
            e = e18;
            p174r3.v.s().x(e, "AdWebViewClient.interceptRequest");
            return q();
        } catch (java.lang.NoClassDefFoundError e19) {
            e = e19;
            p174r3.v.s().x(e, "AdWebViewClient.interceptRequest");
            return q();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void J(com.google.android.gms.internal.ads.C2591Lx c2591Lx, com.google.android.gms.internal.ads.C4033iT c4033iT, com.google.android.gms.internal.ads.C2559La0 c2559La0) {
        e("/click");
        if (c4033iT == null || c2559La0 == null) {
            b("/click", new com.google.android.gms.internal.ads.C2278Di(this.f33688M, c2591Lx));
        } else {
            b("/click", new com.google.android.gms.internal.ads.C5425v70(this.f33688M, c2591Lx, c2559La0, c4033iT));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void K(com.google.android.gms.internal.ads.InterfaceC2515Ju interfaceC2515Ju) {
        this.f33685J = interfaceC2515Ju;
    }

    public final void S() {
        if (this.f33684I != null && ((this.f33704c0 && this.f33706e0 <= 0) || this.f33705d0 || this.f33690O)) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue() && this.f33678C.m() != null) {
                com.google.android.gms.internal.ads.AbstractC2420Hf.a(this.f33678C.m().a(), this.f33678C.k(), "awfllc");
            }
            com.google.android.gms.internal.ads.InterfaceC2478Iu interfaceC2478Iu = this.f33684I;
            boolean z6 = false;
            if (!this.f33705d0 && !this.f33690O) {
                z6 = true;
            }
            interfaceC2478Iu.a(z6, this.f33691P, this.f33692Q, this.f33693R);
            this.f33684I = null;
        }
        this.f33678C.k0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void T() {
        synchronized (this.f33681F) {
            this.f33689N = false;
            this.f33694S = true;
            com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Qt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31068C.a0();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void U(boolean z6) {
        synchronized (this.f33681F) {
            this.f33695T = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void V(p184s3.InterfaceC7076a interfaceC7076a, com.google.android.gms.internal.ads.InterfaceC5483vi interfaceC5483vi, p204u3.z zVar, com.google.android.gms.internal.ads.InterfaceC5703xi interfaceC5703xi, p204u3.InterfaceC7202d interfaceC7202d, boolean z6, com.google.android.gms.internal.ads.C4166jj c4166jj, p174r3.b bVar, com.google.android.gms.internal.ads.InterfaceC5713xn interfaceC5713xn, com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq, final com.google.android.gms.internal.ads.C4033iT c4033iT, final com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.C2206Bj c2206Bj, com.google.android.gms.internal.ads.MG mg, com.google.android.gms.internal.ads.C2169Aj c2169Aj, com.google.android.gms.internal.ads.C5375uj c5375uj, com.google.android.gms.internal.ads.C3948hj c3948hj, com.google.android.gms.internal.ads.C2591Lx c2591Lx) {
        com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj;
        p174r3.b bVar2 = bVar == null ? new p174r3.b(this.f33678C.getContext(), interfaceC3194aq, null) : bVar;
        this.f33701Z = new com.google.android.gms.internal.ads.C4944qn(this.f33678C, interfaceC5713xn);
        this.f33702a0 = interfaceC3194aq;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25504b1)).booleanValue()) {
            b("/adMetadata", new com.google.android.gms.internal.ads.C5373ui(interfaceC5483vi));
        }
        if (interfaceC5703xi != null) {
            b("/appEvent", new com.google.android.gms.internal.ads.C5593wi(interfaceC5703xi));
        }
        b("/backButton", com.google.android.gms.internal.ads.AbstractC3728fj.f35405j);
        b("/refresh", com.google.android.gms.internal.ads.AbstractC3728fj.f35406k);
        b("/canOpenApp", com.google.android.gms.internal.ads.AbstractC3728fj.f35397b);
        b("/canOpenURLs", com.google.android.gms.internal.ads.AbstractC3728fj.f35396a);
        b("/canOpenIntents", com.google.android.gms.internal.ads.AbstractC3728fj.f35398c);
        b("/close", com.google.android.gms.internal.ads.AbstractC3728fj.f35399d);
        b("/customClose", com.google.android.gms.internal.ads.AbstractC3728fj.f35400e);
        b("/instrument", com.google.android.gms.internal.ads.AbstractC3728fj.f35409n);
        b("/delayPageLoaded", com.google.android.gms.internal.ads.AbstractC3728fj.f35411p);
        b("/delayPageClosed", com.google.android.gms.internal.ads.AbstractC3728fj.f35412q);
        b("/getLocationInfo", com.google.android.gms.internal.ads.AbstractC3728fj.f35413r);
        b("/log", com.google.android.gms.internal.ads.AbstractC3728fj.f35402g);
        b("/mraid", new com.google.android.gms.internal.ads.C4606nj(bVar2, this.f33701Z, interfaceC5713xn));
        com.google.android.gms.internal.ads.C5493vn c5493vn = this.f33699X;
        if (c5493vn != null) {
            b("/mraidLoaded", c5493vn);
        }
        p174r3.b bVar3 = bVar2;
        b("/open", new com.google.android.gms.internal.ads.C5265tj(bVar2, this.f33701Z, c4033iT, c3588eO, c2591Lx));
        b("/precache", new com.google.android.gms.internal.ads.C2916Us());
        b("/touch", com.google.android.gms.internal.ads.AbstractC3728fj.f35404i);
        b("/video", com.google.android.gms.internal.ads.AbstractC3728fj.f35407l);
        b("/videoMeta", com.google.android.gms.internal.ads.AbstractC3728fj.f35408m);
        if (c4033iT == null || c2559La0 == null) {
            b("/click", new com.google.android.gms.internal.ads.C2278Di(mg, c2591Lx));
            interfaceC3838gj = com.google.android.gms.internal.ads.AbstractC3728fj.f35401f;
        } else {
            b("/click", new com.google.android.gms.internal.ads.C5425v70(mg, c2591Lx, c2559La0, c4033iT));
            interfaceC3838gj = new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.w70
                @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
                public final void a(java.lang.Object obj, java.util.Map map) {
                    com.google.android.gms.internal.ads.InterfaceC2366Ft interfaceC2366Ft = (com.google.android.gms.internal.ads.InterfaceC2366Ft) obj;
                    java.lang.String str = (java.lang.String) map.get("u");
                    if (str == null) {
                        p224w3.p.g("URL missing from httpTrack GMSG.");
                        return;
                    }
                    com.google.android.gms.internal.ads.R60 r60Q = interfaceC2366Ft.Q();
                    if (r60Q != null && !r60Q.f31177i0) {
                        c2559La0.d(str, r60Q.f31207x0, null);
                        return;
                    }
                    com.google.android.gms.internal.ads.U60 u60H0 = ((com.google.android.gms.internal.ads.InterfaceC5507vu) interfaceC2366Ft).h0();
                    if (u60H0 != null) {
                        c4033iT.i(new com.google.android.gms.internal.ads.C4251kT(p174r3.v.c().a(), u60H0.f32114b, str, 2));
                    } else {
                        p174r3.v.s().x(new java.lang.IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                    }
                }
            };
        }
        b("/httpTrack", interfaceC3838gj);
        if (p174r3.v.r().p(this.f33678C.getContext())) {
            java.util.Map map = new java.util.HashMap();
            if (this.f33678C.Q() != null) {
                map = this.f33678C.Q().f31205w0;
            }
            b("/logScionEvent", new com.google.android.gms.internal.ads.C4496mj(this.f33678C.getContext(), map));
        }
        if (c4166jj != null) {
            b("/setInterstitialProperties", new com.google.android.gms.internal.ads.C4057ij(c4166jj));
        }
        if (c2206Bj != null) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue()) {
                b("/inspectorNetworkExtras", c2206Bj);
            }
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25577h9)).booleanValue() && c2169Aj != null) {
            b("/shareSheet", c2169Aj);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25630m9)).booleanValue() && c5375uj != null) {
            b("/inspectorOutOfContextTest", c5375uj);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25670q9)).booleanValue() && c3948hj != null) {
            b("/inspectorStorage", c3948hj);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.sb)).booleanValue()) {
            b("/bindPlayStoreOverlay", com.google.android.gms.internal.ads.AbstractC3728fj.f35416u);
            b("/presentPlayStoreOverlay", com.google.android.gms.internal.ads.AbstractC3728fj.f35417v);
            b("/expandPlayStoreOverlay", com.google.android.gms.internal.ads.AbstractC3728fj.f35418w);
            b("/collapsePlayStoreOverlay", com.google.android.gms.internal.ads.AbstractC3728fj.f35419x);
            b("/closePlayStoreOverlay", com.google.android.gms.internal.ads.AbstractC3728fj.f35420y);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25675r3)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", com.google.android.gms.internal.ads.AbstractC3728fj.f35393A);
            b("/resetPAID", com.google.android.gms.internal.ads.AbstractC3728fj.f35421z);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Mb)).booleanValue()) {
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f33678C;
            if (interfaceC2698Ot.Q() != null && interfaceC2698Ot.Q().f31195r0) {
                b("/writeToLocalStorage", com.google.android.gms.internal.ads.AbstractC3728fj.f35394B);
                b("/clearLocalStorageKeys", com.google.android.gms.internal.ads.AbstractC3728fj.f35395C);
            }
        }
        this.f33682G = interfaceC7076a;
        this.f33683H = zVar;
        this.f33686K = interfaceC5483vi;
        this.f33687L = interfaceC5703xi;
        this.f33698W = interfaceC7202d;
        this.f33700Y = bVar3;
        this.f33688M = mg;
        this.f33703b0 = c3588eO;
        this.f33689N = z6;
    }

    public final void W() {
        com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq = this.f33702a0;
        if (interfaceC3194aq != null) {
            interfaceC3194aq.d();
            this.f33702a0 = null;
        }
        w();
        synchronized (this.f33681F) {
            try {
                this.f33680E.clear();
                this.f33682G = null;
                this.f33683H = null;
                this.f33684I = null;
                this.f33685J = null;
                this.f33686K = null;
                this.f33687L = null;
                this.f33689N = false;
                this.f33694S = false;
                this.f33695T = false;
                this.f33696U = false;
                this.f33698W = null;
                this.f33700Y = null;
                this.f33699X = null;
                com.google.android.gms.internal.ads.C4944qn c4944qn = this.f33701Z;
                if (c4944qn != null) {
                    c4944qn.h(true);
                    this.f33701Z = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void Z(boolean z6) {
        this.f33707f0 = z6;
    }

    public final void a(boolean z6, int i6, java.lang.String str, boolean z10, boolean z11) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f33678C;
        boolean zR0 = interfaceC2698Ot.R0();
        boolean zE = E(zR0, interfaceC2698Ot);
        boolean z12 = true;
        if (!zE && z10) {
            z12 = false;
        }
        p184s3.InterfaceC7076a interfaceC7076a = zE ? null : this.f33682G;
        com.google.android.gms.internal.ads.C2989Wt c2989Wt = zR0 ? null : new com.google.android.gms.internal.ads.C2989Wt(this.f33678C, this.f33683H);
        com.google.android.gms.internal.ads.InterfaceC5483vi interfaceC5483vi = this.f33686K;
        com.google.android.gms.internal.ads.InterfaceC5703xi interfaceC5703xi = this.f33687L;
        p204u3.InterfaceC7202d interfaceC7202d = this.f33698W;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = this.f33678C;
        x0(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(interfaceC7076a, c2989Wt, interfaceC5483vi, interfaceC5703xi, interfaceC7202d, interfaceC2698Ot2, z6, i6, str, interfaceC2698Ot2.n(), z12 ? null : this.f33688M, C(this.f33678C) ? this.f33709h0 : null, z11));
    }

    final /* synthetic */ void a0() {
        this.f33678C.n0();
        p204u3.x xVarP = this.f33678C.P();
        if (xVarP != null) {
            xVarP.J();
        }
    }

    public final void b(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        synchronized (this.f33681F) {
            try {
                java.util.List copyOnWriteArrayList = (java.util.List) this.f33680E.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
                    this.f33680E.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(interfaceC3838gj);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z6) {
        this.f33689N = false;
    }

    final /* synthetic */ void c0(boolean z6, long j6) {
        this.f33678C.F0(z6, j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final com.google.android.gms.internal.ads.C3588eO d() {
        return this.f33703b0;
    }

    public final void e(java.lang.String str) {
        synchronized (this.f33681F) {
            try {
                java.util.List list = (java.util.List) this.f33680E.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p184s3.InterfaceC7076a
    public final void e0() {
        p184s3.InterfaceC7076a interfaceC7076a = this.f33682G;
        if (interfaceC7076a != null) {
            interfaceC7076a.e0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final p174r3.b f() {
        return this.f33700Y;
    }

    public final void g(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        synchronized (this.f33681F) {
            try {
                java.util.List list = (java.util.List) this.f33680E.get(str);
                if (list == null) {
                    return;
                }
                list.remove(interfaceC3838gj);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void i(java.lang.String str, V3.o oVar) {
        synchronized (this.f33681F) {
            try {
                java.util.List<com.google.android.gms.internal.ads.InterfaceC3838gj> list = (java.util.List) this.f33680E.get(str);
                if (list == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj : list) {
                    if (oVar.apply(interfaceC3838gj)) {
                        arrayList.add(interfaceC3838gj);
                    }
                }
                list.removeAll(arrayList);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k() {
        boolean z6;
        synchronized (this.f33681F) {
            z6 = this.f33696U;
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void l() {
        com.google.android.gms.internal.ads.C4704od c4704od = this.f33679D;
        if (c4704od != null) {
            c4704od.c(10005);
        }
        this.f33705d0 = true;
        this.f33691P = 10004;
        this.f33692Q = "Page loaded delay cancel.";
        S();
        this.f33678C.destroy();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void m() {
        synchronized (this.f33681F) {
        }
        this.f33706e0++;
        S();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void n() {
        this.f33706e0--;
        S();
    }

    public final boolean o() {
        boolean z6;
        synchronized (this.f33681F) {
            z6 = this.f33697V;
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final boolean o0() {
        boolean z6;
        synchronized (this.f33681F) {
            z6 = this.f33694S;
        }
        return z6;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        p214v3.AbstractC7265q0.k("Loading resource: ".concat(java.lang.String.valueOf(str)));
        android.net.Uri uri = android.net.Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            D0(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        synchronized (this.f33681F) {
            try {
                if (this.f33678C.L0()) {
                    p214v3.AbstractC7265q0.k("Blank page loaded, 1...");
                    this.f33678C.X();
                    return;
                }
                this.f33704c0 = true;
                com.google.android.gms.internal.ads.InterfaceC2515Ju interfaceC2515Ju = this.f33685J;
                if (interfaceC2515Ju != null) {
                    interfaceC2515Ju.a();
                    this.f33685J = null;
                }
                S();
                if (this.f33678C.P() != null) {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Nb)).booleanValue()) {
                        this.f33678C.P().t6(str);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i6, java.lang.String str, java.lang.String str2) {
        this.f33690O = true;
        this.f33691P = i6;
        this.f33692Q = str;
        this.f33693R = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f33678C.h1(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final boolean p() {
        boolean z6;
        synchronized (this.f33681F) {
            z6 = this.f33695T;
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.MG
    public final void p0() {
        com.google.android.gms.internal.ads.MG mg = this.f33688M;
        if (mg != null) {
            mg.p0();
        }
    }

    final /* synthetic */ void q0(android.view.View view, com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq, int i6) {
        B(view, interfaceC3194aq, i6 - 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void s0(boolean z6) {
        synchronized (this.f33681F) {
            this.f33696U = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        return G(str, java.util.Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION /* 127 */:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        p214v3.AbstractC7265q0.k("AdWebView shouldOverrideUrlLoading: ".concat(java.lang.String.valueOf(str)));
        android.net.Uri uriA = android.net.Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriA.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriA.getHost())) {
            D0(uriA);
        } else {
            if (this.f33689N && webView == this.f33678C.i0()) {
                java.lang.String scheme = uriA.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    p184s3.InterfaceC7076a interfaceC7076a = this.f33682G;
                    if (interfaceC7076a != null) {
                        interfaceC7076a.e0();
                        com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq = this.f33702a0;
                        if (interfaceC3194aq != null) {
                            interfaceC3194aq.a0(str);
                        }
                        this.f33682G = null;
                    }
                    com.google.android.gms.internal.ads.MG mg = this.f33688M;
                    if (mg != null) {
                        mg.p0();
                        this.f33688M = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f33678C.i0().willNotDraw()) {
                p224w3.p.g("AdWebView unable to handle URL: ".concat(java.lang.String.valueOf(str)));
            } else {
                try {
                    com.google.android.gms.internal.ads.Z9 z9H = this.f33678C.H();
                    com.google.android.gms.internal.ads.C4985r70 c4985r70A1 = this.f33678C.a1();
                    if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Sb)).booleanValue() || c4985r70A1 == null) {
                        if (z9H != null && z9H.f(uriA)) {
                            android.content.Context context = this.f33678C.getContext();
                            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f33678C;
                            uriA = z9H.a(uriA, context, (android.view.View) interfaceC2698Ot, interfaceC2698Ot.h());
                        }
                    } else if (z9H != null && z9H.f(uriA)) {
                        android.content.Context context2 = this.f33678C.getContext();
                        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = this.f33678C;
                        uriA = c4985r70A1.a(uriA, context2, (android.view.View) interfaceC2698Ot2, interfaceC2698Ot2.h());
                    }
                } catch (com.google.android.gms.internal.ads.C3162aa unused) {
                    p224w3.p.g("Unable to append parameter to URL: ".concat(java.lang.String.valueOf(str)));
                }
                p174r3.b bVar = this.f33700Y;
                if (bVar == null || bVar.c()) {
                    p204u3.l lVar = new p204u3.l("android.intent.action.VIEW", uriA.toString(), null, null, null, null, null, null);
                    com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot3 = this.f33678C;
                    u0(lVar, true, false, interfaceC2698Ot3 != null ? interfaceC2698Ot3.t() : "");
                } else {
                    bVar.b(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void t0(int i6, int i10, boolean z6) {
        com.google.android.gms.internal.ads.C5493vn c5493vn = this.f33699X;
        if (c5493vn != null) {
            c5493vn.h(i6, i10);
        }
        com.google.android.gms.internal.ads.C4944qn c4944qn = this.f33701Z;
        if (c4944qn != null) {
            c4944qn.k(i6, i10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void u() {
        com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq = this.f33702a0;
        if (interfaceC3194aq != null) {
            android.webkit.WebView webViewI0 = this.f33678C.i0();
            if (androidx.core.view.X.Q(webViewI0)) {
                B(webViewI0, interfaceC3194aq, 10);
                return;
            }
            w();
            com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2917Ut viewOnAttachStateChangeListenerC2917Ut = new com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2917Ut(this, interfaceC3194aq);
            this.f33710i0 = viewOnAttachStateChangeListenerC2917Ut;
            ((android.view.View) this.f33678C).addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2917Ut);
        }
    }

    public final void u0(p204u3.l lVar, boolean z6, boolean z10, java.lang.String str) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f33678C;
        boolean zR0 = interfaceC2698Ot.R0();
        boolean z11 = E(zR0, interfaceC2698Ot) || z10;
        boolean z12 = z11 || !z6;
        p184s3.InterfaceC7076a interfaceC7076a = z11 ? null : this.f33682G;
        p204u3.z zVar = zR0 ? null : this.f33683H;
        p204u3.InterfaceC7202d interfaceC7202d = this.f33698W;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = this.f33678C;
        x0(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(lVar, interfaceC7076a, zVar, interfaceC7202d, interfaceC2698Ot2.n(), interfaceC2698Ot2, z12 ? null : this.f33688M, str));
    }

    public final void v0(java.lang.String str, java.lang.String str2, int i6) {
        com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT = this.f33709h0;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f33678C;
        x0(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(interfaceC2698Ot, interfaceC2698Ot.n(), str, str2, 14, binderC5240tT));
    }

    public final void w0(boolean z6, int i6, boolean z10) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f33678C;
        boolean zE = E(interfaceC2698Ot.R0(), interfaceC2698Ot);
        boolean z11 = true;
        if (!zE && z10) {
            z11 = false;
        }
        p184s3.InterfaceC7076a interfaceC7076a = zE ? null : this.f33682G;
        p204u3.z zVar = this.f33683H;
        p204u3.InterfaceC7202d interfaceC7202d = this.f33698W;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = this.f33678C;
        x0(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(interfaceC7076a, zVar, interfaceC7202d, interfaceC2698Ot2, z6, i6, interfaceC2698Ot2.n(), z11 ? null : this.f33688M, C(this.f33678C) ? this.f33709h0 : null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void x(int i6, int i10) {
        com.google.android.gms.internal.ads.C4944qn c4944qn = this.f33701Z;
        if (c4944qn != null) {
            c4944qn.l(i6, i10);
        }
    }

    public final void x0(com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel) {
        p204u3.l lVar;
        com.google.android.gms.internal.ads.C4944qn c4944qn = this.f33701Z;
        boolean zM = c4944qn != null ? c4944qn.m() : false;
        p174r3.v.m();
        p204u3.y.a(this.f33678C.getContext(), adOverlayInfoParcel, !zM, this.f33703b0);
        com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq = this.f33702a0;
        if (interfaceC3194aq != null) {
            java.lang.String str = adOverlayInfoParcel.f24721N;
            if (str == null && (lVar = adOverlayInfoParcel.f24710C) != null) {
                str = lVar.f55492D;
            }
            interfaceC3194aq.a0(str);
        }
    }

    public final void y0(boolean z6, int i6, java.lang.String str, java.lang.String str2, boolean z10) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f33678C;
        boolean zR0 = interfaceC2698Ot.R0();
        boolean zE = E(zR0, interfaceC2698Ot);
        boolean z11 = true;
        if (!zE && z10) {
            z11 = false;
        }
        p184s3.InterfaceC7076a interfaceC7076a = zE ? null : this.f33682G;
        com.google.android.gms.internal.ads.C2989Wt c2989Wt = zR0 ? null : new com.google.android.gms.internal.ads.C2989Wt(this.f33678C, this.f33683H);
        com.google.android.gms.internal.ads.InterfaceC5483vi interfaceC5483vi = this.f33686K;
        com.google.android.gms.internal.ads.InterfaceC5703xi interfaceC5703xi = this.f33687L;
        p204u3.InterfaceC7202d interfaceC7202d = this.f33698W;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = this.f33678C;
        x0(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(interfaceC7076a, c2989Wt, interfaceC5483vi, interfaceC5703xi, interfaceC7202d, interfaceC2698Ot2, z6, i6, str, str2, interfaceC2698Ot2.n(), z11 ? null : this.f33688M, C(this.f33678C) ? this.f33709h0 : null));
    }

    public final android.view.ViewTreeObserver.OnGlobalLayoutListener z() {
        synchronized (this.f33681F) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2552Ku
    public final void z0(com.google.android.gms.internal.ads.C2591Lx c2591Lx) {
        e("/click");
        b("/click", new com.google.android.gms.internal.ads.C2278Di(this.f33688M, c2591Lx));
    }
}
