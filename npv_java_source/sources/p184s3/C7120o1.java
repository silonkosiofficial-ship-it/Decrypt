package p184s3;

/* JADX INFO: renamed from: s3.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7120o1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.Set f54306i = new java.util.HashSet(java.util.Arrays.asList(p104k3.EnumC6886c.APP_OPEN_AD, p104k3.EnumC6886c.INTERSTITIAL, p104k3.EnumC6886c.REWARDED));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static p184s3.C7120o1 f54307j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p184s3.InterfaceC7139v0 f54314g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f54308a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f54309b = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f54311d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f54312e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.Object f54313f = new java.lang.Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p104k3.t f54315h = new k3.t.a().a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.ArrayList f54310c = new java.util.ArrayList();

    private C7120o1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p164q3.b a(java.util.List list) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.C3182ak c3182ak = (com.google.android.gms.internal.ads.C3182ak) it.next();
            map.put(c3182ak.f34128C, new com.google.android.gms.internal.ads.C4059ik(c3182ak.f34129D ? p164q3.a.READY : p164q3.a.NOT_READY, c3182ak.f34131F, c3182ak.f34130E));
        }
        return new com.google.android.gms.internal.ads.C4168jk(map);
    }

    private final void b(android.content.Context context, java.lang.String str) {
        try {
            com.google.android.gms.internal.ads.C2616Ml.a().b(context, null);
            this.f54314g.k();
            this.f54314g.P4(null, X3.b.c2(null));
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("MobileAdsSettingManager initialization failed", e6);
        }
    }

    private final void c(android.content.Context context) {
        if (this.f54314g == null) {
            this.f54314g = (p184s3.InterfaceC7139v0) new p184s3.C7129s(p184s3.C7147y.a(), context).d(context, false);
        }
    }

    private final void d(p104k3.t tVar) {
        try {
            this.f54314g.B5(new p184s3.K1(tVar));
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Unable to set request configuration parcel.", e6);
        }
    }

    public static p184s3.C7120o1 h() {
        p184s3.C7120o1 c7120o1;
        synchronized (p184s3.C7120o1.class) {
            try {
                if (f54307j == null) {
                    f54307j = new p184s3.C7120o1();
                }
                c7120o1 = f54307j;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c7120o1;
    }

    public final p104k3.t e() {
        return this.f54315h;
    }

    public final p164q3.b g() {
        p164q3.b bVarA;
        synchronized (this.f54313f) {
            try {
                Q3.AbstractC1477p.p(this.f54314g != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    bVarA = a(this.f54314g.i());
                } catch (android.os.RemoteException unused) {
                    p224w3.p.d("Unable to get Initialization status.");
                    return new p164q3.b() { // from class: s3.j1
                    };
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return bVarA;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void m(final android.content.Context context, java.lang.String str, p164q3.c cVar) {
        synchronized (this.f54308a) {
            try {
                if (this.f54311d) {
                    if (cVar != null) {
                        this.f54310c.add(cVar);
                    }
                    return;
                }
                if (this.f54312e) {
                    if (cVar != null) {
                        cVar.a(g());
                    }
                    return;
                }
                this.f54311d = true;
                if (cVar != null) {
                    this.f54310c.add(cVar);
                }
                if (context == null) {
                    throw new java.lang.IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.f54313f) {
                    p184s3.AbstractC7117n1 abstractC7117n1 = null;
                    java.lang.Object[] objArr = 0;
                    java.lang.Object[] objArr2 = 0;
                    try {
                        try {
                            c(context);
                            this.f54314g.y2(new p184s3.BinderC7114m1(this, abstractC7117n1));
                            this.f54314g.Y0(new com.google.android.gms.internal.ads.BinderC2801Rl());
                            if (this.f54315h.c() != -1 || this.f54315h.d() != -1) {
                                d(this.f54315h);
                            }
                        } catch (android.os.RemoteException e6) {
                            p224w3.p.h("MobileAdsSettingManager initialization failed", e6);
                        }
                        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
                        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25762a.e()).booleanValue()) {
                            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ab)).booleanValue()) {
                                p224w3.p.b("Initializing on bg thread");
                                java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = p224w3.c.f56224a;
                                final java.lang.Object[] objArr3 = objArr2 == true ? 1 : 0;
                                threadPoolExecutor.execute(new java.lang.Runnable(context, objArr3) { // from class: s3.k1

                                    /* JADX INFO: renamed from: D, reason: collision with root package name */
                                    public final /* synthetic */ android.content.Context f54283D;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f54282C.n(this.f54283D, null);
                                    }
                                });
                            } else if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25763b.e()).booleanValue()) {
                                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ab)).booleanValue()) {
                                    java.util.concurrent.ExecutorService executorService = p224w3.c.f56225b;
                                    final java.lang.Object[] objArr4 = objArr == true ? 1 : 0;
                                    executorService.execute(new java.lang.Runnable(context, objArr4) { // from class: s3.l1

                                        /* JADX INFO: renamed from: D, reason: collision with root package name */
                                        public final /* synthetic */ android.content.Context f54290D;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f54289C.o(this.f54290D, null);
                                        }
                                    });
                                } else {
                                    p224w3.p.b("Initializing on calling thread");
                                    b(context, null);
                                }
                            } else {
                                p224w3.p.b("Initializing on calling thread");
                                b(context, null);
                            }
                        } else if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25763b.e()).booleanValue()) {
                            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ab)).booleanValue()) {
                                java.util.concurrent.ExecutorService executorService2 = p224w3.c.f56225b;
                                final java.lang.String objArr5 = objArr == true ? 1 : 0;
                                executorService2.execute(new java.lang.Runnable(context, objArr5) { // from class: s3.l1

                                    /* JADX INFO: renamed from: D, reason: collision with root package name */
                                    public final /* synthetic */ android.content.Context f54290D;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f54289C.o(this.f54290D, null);
                                    }
                                });
                            } else {
                                p224w3.p.b("Initializing on calling thread");
                                b(context, null);
                            }
                        } else {
                            p224w3.p.b("Initializing on calling thread");
                            b(context, null);
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void n(android.content.Context context, java.lang.String str) {
        synchronized (this.f54313f) {
            b(context, null);
        }
    }

    final /* synthetic */ void o(android.content.Context context, java.lang.String str) {
        synchronized (this.f54313f) {
            b(context, null);
        }
    }

    public final void p(java.lang.String str) {
        synchronized (this.f54313f) {
            Q3.AbstractC1477p.p(this.f54314g != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f54314g.R0(str);
            } catch (android.os.RemoteException e6) {
                p224w3.p.e("Unable to set plugin.", e6);
            }
        }
    }
}
