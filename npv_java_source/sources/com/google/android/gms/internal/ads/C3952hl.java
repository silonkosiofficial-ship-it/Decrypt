package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3952hl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f36118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f36119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p224w3.a f36120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f36121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p214v3.F f36122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p214v3.F f36123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3842gl f36124h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f36117a = new java.lang.Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36125i = 1;

    public C3952hl(android.content.Context context, p224w3.a aVar, java.lang.String str, p214v3.F f6, p214v3.F f10, com.google.android.gms.internal.ads.T90 t90) {
        this.f36119c = str;
        this.f36118b = context.getApplicationContext();
        this.f36120d = aVar;
        this.f36121e = t90;
        this.f36122f = f6;
        this.f36123g = f10;
    }

    public final com.google.android.gms.internal.ads.C3294bl b(com.google.android.gms.internal.ads.Z9 z10) {
        p214v3.AbstractC7265q0.k("getEngine: Trying to acquire lock");
        synchronized (this.f36117a) {
            try {
                p214v3.AbstractC7265q0.k("getEngine: Lock acquired");
                p214v3.AbstractC7265q0.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.f36117a) {
                    try {
                        p214v3.AbstractC7265q0.k("refreshIfDestroyed: Lock acquired");
                        com.google.android.gms.internal.ads.C3842gl c3842gl = this.f36124h;
                        if (c3842gl != null && this.f36125i == 0) {
                            c3842gl.f(new com.google.android.gms.internal.ads.InterfaceC4952qr() { // from class: com.google.android.gms.internal.ads.Pk
                                @Override // com.google.android.gms.internal.ads.InterfaceC4952qr
                                public final void b(java.lang.Object obj) {
                                    this.f30776a.k((com.google.android.gms.internal.ads.InterfaceC2208Bk) obj);
                                }
                            }, new com.google.android.gms.internal.ads.InterfaceC4732or() { // from class: com.google.android.gms.internal.ads.Qk
                                @Override // com.google.android.gms.internal.ads.InterfaceC4732or
                                public final void a() {
                                }
                            });
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                p214v3.AbstractC7265q0.k("refreshIfDestroyed: Lock released");
                com.google.android.gms.internal.ads.C3842gl c3842gl2 = this.f36124h;
                if (c3842gl2 != null && c3842gl2.a() != -1) {
                    int i6 = this.f36125i;
                    if (i6 == 0) {
                        p214v3.AbstractC7265q0.k("getEngine (NO_UPDATE): Lock released");
                        return this.f36124h.g();
                    }
                    if (i6 != 1) {
                        p214v3.AbstractC7265q0.k("getEngine (UPDATING): Lock released");
                        return this.f36124h.g();
                    }
                    this.f36125i = 2;
                    d(null);
                    p214v3.AbstractC7265q0.k("getEngine (PENDING_UPDATE): Lock released");
                    return this.f36124h.g();
                }
                this.f36125i = 2;
                this.f36124h = d(null);
                p214v3.AbstractC7265q0.k("getEngine (NULL or REJECTED): Lock released");
                return this.f36124h.g();
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    protected final com.google.android.gms.internal.ads.C3842gl d(com.google.android.gms.internal.ads.Z9 z10) {
        com.google.android.gms.internal.ads.E90 e90A = com.google.android.gms.internal.ads.D90.a(this.f36118b, 6);
        e90A.h();
        final com.google.android.gms.internal.ads.C3842gl c3842gl = new com.google.android.gms.internal.ads.C3842gl(this.f36123g);
        p214v3.AbstractC7265q0.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final com.google.android.gms.internal.ads.Z9 z11 = null;
        com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable(z11, c3842gl) { // from class: com.google.android.gms.internal.ads.Rk

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public final /* synthetic */ com.google.android.gms.internal.ads.C3842gl f31346D;

            {
                this.f31346D = c3842gl;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f31345C.i(null, this.f31346D);
            }
        });
        p214v3.AbstractC7265q0.k("loadNewJavascriptEngine: Promise created");
        c3842gl.f(new com.google.android.gms.internal.ads.C2980Wk(this, c3842gl, e90A), new com.google.android.gms.internal.ads.C3016Xk(this, c3842gl, e90A));
        return c3842gl;
    }

    final /* synthetic */ void i(com.google.android.gms.internal.ads.Z9 z10, com.google.android.gms.internal.ads.C3842gl c3842gl) {
        java.lang.String str;
        long jA = p174r3.v.c().a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            p214v3.AbstractC7265q0.k("loadJavascriptEngine > Before createJavascriptEngine");
            com.google.android.gms.internal.ads.C2504Jk c2504Jk = new com.google.android.gms.internal.ads.C2504Jk(this.f36118b, this.f36120d, null, null);
            p214v3.AbstractC7265q0.k("loadJavascriptEngine > After createJavascriptEngine");
            p214v3.AbstractC7265q0.k("loadJavascriptEngine > Before setting new engine loaded listener");
            c2504Jk.c0(new com.google.android.gms.internal.ads.C2614Mk(this, arrayList, jA, c3842gl, c2504Jk));
            p214v3.AbstractC7265q0.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            c2504Jk.W("/jsLoaded", new com.google.android.gms.internal.ads.C2836Sk(this, jA, c3842gl, c2504Jk));
            p214v3.C7235b0 c7235b0 = new p214v3.C7235b0();
            com.google.android.gms.internal.ads.C2872Tk c2872Tk = new com.google.android.gms.internal.ads.C2872Tk(this, null, c2504Jk, c7235b0);
            c7235b0.b(c2872Tk);
            p214v3.AbstractC7265q0.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            c2504Jk.W("/requestReload", c2872Tk);
            p214v3.AbstractC7265q0.k("loadJavascriptEngine > javascriptPath: ".concat(java.lang.String.valueOf(this.f36119c)));
            if (this.f36119c.endsWith(".js")) {
                p214v3.AbstractC7265q0.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                c2504Jk.a0(this.f36119c);
                str = "loadJavascriptEngine > After newEngine.loadJavascript";
            } else if (this.f36119c.startsWith("<html>")) {
                p214v3.AbstractC7265q0.k("loadJavascriptEngine > Before newEngine.loadHtml");
                c2504Jk.G(this.f36119c);
                str = "loadJavascriptEngine > After newEngine.loadHtml";
            } else {
                p214v3.AbstractC7265q0.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                c2504Jk.S(this.f36119c);
                str = "loadJavascriptEngine > After newEngine.loadHtmlWrapper";
            }
            p214v3.AbstractC7265q0.k(str);
            p214v3.AbstractC7265q0.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            p214v3.E0.f55826l.postDelayed(new com.google.android.gms.internal.ads.RunnableC2944Vk(this, c3842gl, c2504Jk, arrayList, jA), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25513c)).intValue());
        } catch (java.lang.Throwable th) {
            p224w3.p.e("Error creating webview.", th);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25225B7)).booleanValue()) {
                c3842gl.d(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25247D7)).booleanValue()) {
                p174r3.v.s().w(th, "SdkJavascriptFactory.loadJavascriptEngine");
                c3842gl.c();
            } else {
                p174r3.v.s().x(th, "SdkJavascriptFactory.loadJavascriptEngine");
                c3842gl.c();
            }
        }
    }

    final /* synthetic */ void j(com.google.android.gms.internal.ads.C3842gl c3842gl, final com.google.android.gms.internal.ads.InterfaceC2208Bk interfaceC2208Bk, java.util.ArrayList arrayList, long j6) {
        p214v3.AbstractC7265q0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.f36117a) {
            try {
                p214v3.AbstractC7265q0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (c3842gl.a() != -1 && c3842gl.a() != 1) {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25225B7)).booleanValue()) {
                        c3842gl.d(new java.util.concurrent.TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        c3842gl.c();
                    }
                    com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34800f;
                    j$.util.Objects.requireNonNull(interfaceC2208Bk);
                    yk0.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Lk
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC2208Bk.c();
                        }
                    });
                    p214v3.AbstractC7265q0.k("Could not receive /jsLoaded in " + java.lang.String.valueOf(p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25502b)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + c3842gl.a() + ". Update status(onEngLoadedTimeout) is " + this.f36125i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + java.lang.String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (p174r3.v.c().a() - j6) + " ms. Rejecting.");
                    p214v3.AbstractC7265q0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                p214v3.AbstractC7265q0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void k(com.google.android.gms.internal.ads.InterfaceC2208Bk interfaceC2208Bk) {
        if (interfaceC2208Bk.h()) {
            this.f36125i = 1;
        }
    }
}
