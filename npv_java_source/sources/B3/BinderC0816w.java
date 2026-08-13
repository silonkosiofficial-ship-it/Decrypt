package B3;

/* JADX INFO: renamed from: B3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0816w extends com.google.android.gms.internal.ads.AbstractBinderC2178Aq {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    protected static final java.util.List f710i0 = new java.util.ArrayList(java.util.Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    protected static final java.util.List f711j0 = new java.util.ArrayList(java.util.Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected static final java.util.List f712k0 = new java.util.ArrayList(java.util.Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    protected static final java.util.List f713l0 = new java.util.ArrayList(java.util.Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2846Su f714C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.content.Context f715D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f716E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4985r70 f717F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.N70 f718G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f719H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f720I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3848go f721J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4246kO f724M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f725N;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final p224w3.a f733V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private java.lang.String f734W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final java.util.List f736Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final java.util.List f737Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final java.util.List f738a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final java.util.List f739b0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3832gg f743f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final B3.l0 f744g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final B3.c0 f745h0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private android.graphics.Point f722K = new android.graphics.Point();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private android.graphics.Point f723L = new android.graphics.Point();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f732U = new java.util.concurrent.atomic.AtomicInteger(0);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f740c0 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f741d0 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f742e0 = new java.util.concurrent.atomic.AtomicInteger(0);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f726O = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25498a7)).booleanValue();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final boolean f727P = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25487Z6)).booleanValue();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final boolean f728Q = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25520c7)).booleanValue();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final boolean f729R = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25542e7)).booleanValue();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final java.lang.String f730S = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25531d7);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final java.lang.String f731T = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25553f7);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final java.lang.String f735X = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25564g7);

    BinderC0816w(com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, android.content.Context context, com.google.android.gms.internal.ads.Z9 z10, com.google.android.gms.internal.ads.N70 n70, com.google.android.gms.internal.ads.Yk0 yk0, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.C4246kO c4246kO, com.google.android.gms.internal.ads.C2559La0 c2559La0, p224w3.a aVar, com.google.android.gms.internal.ads.C3832gg c3832gg, com.google.android.gms.internal.ads.C4985r70 c4985r70, B3.l0 l0Var, B3.c0 c0Var) {
        java.util.List listO6;
        this.f714C = abstractC2846Su;
        this.f715D = context;
        this.f716E = z10;
        this.f717F = c4985r70;
        this.f718G = n70;
        this.f719H = yk0;
        this.f720I = scheduledExecutorService;
        this.f724M = c4246kO;
        this.f725N = c2559La0;
        this.f733V = aVar;
        this.f743f0 = c3832gg;
        this.f744g0 = l0Var;
        this.f745h0 = c0Var;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25575h7)).booleanValue()) {
            this.f736Y = O6((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25586i7));
            this.f737Z = O6((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25597j7));
            this.f738a0 = O6((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25608k7));
            listO6 = O6((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25618l7));
        } else {
            this.f736Y = f710i0;
            this.f737Z = f711j0;
            this.f738a0 = f712k0;
            listO6 = f713l0;
        }
        this.f739b0 = listO6;
    }

    static final /* synthetic */ android.net.Uri F6(android.net.Uri uri, java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) ? N6(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    private final B3.AbstractC0799e G6(android.content.Context context, java.lang.String str, java.lang.String str2, p184s3.c2 c2Var, p184s3.X1 x6, int i6, java.lang.String str3, android.os.Bundle bundle, com.google.android.gms.internal.ads.C2363Fq c2363Fq) {
        p184s3.c2 c2Var2;
        byte b6;
        com.google.android.gms.internal.ads.C4326l70 c4326l70 = new com.google.android.gms.internal.ads.C4326l70();
        if ("REWARDED".equals(str2)) {
            c4326l70.L().a(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            c4326l70.L().a(3);
        }
        B3.InterfaceC0798d interfaceC0798dW = this.f714C.w();
        com.google.android.gms.internal.ads.C4335lC c4335lC = new com.google.android.gms.internal.ads.C4335lC();
        c4335lC.f(context);
        c4326l70.P(str == null ? "adUnitId" : str);
        c4326l70.h(x6 == null ? new p184s3.Y1().a() : x6);
        if (c2Var == null) {
            switch (str2) {
                case "NATIVE":
                    b6 = 3;
                    break;
                case "APP_OPEN_AD":
                    b6 = 4;
                    break;
                case "REWARDED":
                    b6 = 1;
                    break;
                case "REWARDED_INTERSTITIAL":
                    b6 = 2;
                    break;
                case "BANNER":
                    b6 = 0;
                    break;
                default:
                    b6 = -1;
                    break;
            }
            if (b6 == 0) {
                c2Var2 = new p184s3.c2(context, p104k3.h.f49467i);
            } else if (b6 == 1 || b6 == 2) {
                c2Var2 = p184s3.c2.w();
            } else if (b6 != 3) {
                c2Var2 = b6 != 4 ? new p184s3.c2() : p184s3.c2.f();
            } else {
                c2Var2 = p184s3.c2.s();
            }
        } else {
            c2Var2 = c2Var;
        }
        c4326l70.O(c2Var2);
        c4326l70.V(true);
        c4326l70.a(bundle);
        c4335lC.k(c4326l70.j());
        c4335lC.i(i6);
        interfaceC0798dW.d(c4335lC.l());
        B3.C0819z c0819z = new B3.C0819z();
        c0819z.b(str2);
        c0819z.c(str3);
        c0819z.d(c2363Fq);
        interfaceC0798dW.e(new B3.B(c0819z, null));
        new com.google.android.gms.internal.ads.CF();
        return interfaceC0798dW.c();
    }

    private final boolean H0() {
        java.util.Map map;
        com.google.android.gms.internal.ads.C3848go c3848go = this.f721J;
        return (c3848go == null || (map = c3848go.f35688D) == null || map.isEmpty()) ? false : true;
    }

    private final P4.d H6(final java.lang.String str) {
        final com.google.android.gms.internal.ads.PL[] plArr = new com.google.android.gms.internal.ads.PL[1];
        P4.d dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(this.f718G.a(), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: B3.h
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f625a.Z6(plArr, str, (com.google.android.gms.internal.ads.PL) obj);
            }
        }, this.f719H);
        dVarN.e(new java.lang.Runnable() { // from class: B3.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f631C.y6(plArr);
            }
        }, this.f719H);
        return (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.e((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.m((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.o(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(dVarN), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25748y7)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f720I), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: B3.o
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.List list = B3.BinderC0816w.f710i0;
                return ((org.json.JSONObject) obj).optString("nas");
            }
        }, this.f719H), java.lang.Exception.class, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: B3.p
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.List list = B3.BinderC0816w.f710i0;
                p224w3.p.e("", (java.lang.Exception) obj);
                return null;
            }
        }, this.f719H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I6() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28091c.e()).booleanValue()) {
            this.f744g0.b();
        } else {
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Wa)).booleanValue() ? com.google.android.gms.internal.ads.AbstractC2652Nk0.k(new com.google.android.gms.internal.ads.InterfaceC5158sk0() { // from class: B3.f
                @Override // com.google.android.gms.internal.ads.InterfaceC5158sk0
                public final P4.d a() {
                    return this.f617a.Y6();
                }
            }, com.google.android.gms.internal.ads.AbstractC3524dr.f34795a) : G6(this.f715D, null, p104k3.EnumC6886c.BANNER.name(), null, null, 0, null, new android.os.Bundle(), null).b(), new B3.C0815v(this), this.f714C.d());
        }
    }

    private final void J6() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25720v9)).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25750y9)).booleanValue()) {
                return;
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25238C9)).booleanValue() && this.f740c0.getAndSet(true)) {
                return;
            }
            I6();
        }
    }

    private final void K6(java.util.List list, final X3.a aVar, com.google.android.gms.internal.ads.InterfaceC3300bo interfaceC3300bo, boolean z6) {
        P4.d dVarH0;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25738x7)).booleanValue()) {
            p224w3.p.g("The updating URL feature is not enabled.");
            try {
                interfaceC3300bo.o("The updating URL feature is not enabled.");
                return;
            } catch (android.os.RemoteException e6) {
                p224w3.p.e("", e6);
                return;
            }
        }
        java.util.Iterator it = list.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (D6((android.net.Uri) it.next())) {
                i6++;
            }
        }
        if (i6 > 1) {
            p224w3.p.g("Multiple google urls found: ".concat(java.lang.String.valueOf(list)));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final android.net.Uri uri = (android.net.Uri) it2.next();
            if (D6(uri)) {
                dVarH0 = this.f719H.H0(new java.util.concurrent.Callable() { // from class: B3.j
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return this.f636a.R6(uri, aVar);
                    }
                });
                if (H0()) {
                    dVarH0 = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVarH0, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: B3.k
                        @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                        public final P4.d b(java.lang.Object obj) {
                            B3.BinderC0816w binderC0816w = this.f641a;
                            return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(binderC0816w.H6("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new com.google.android.gms.internal.ads.InterfaceC4821pg0(binderC0816w, (android.net.Uri) obj) { // from class: B3.l

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ android.net.Uri f645a;

                                {
                                    this.f645a = uri;
                                }

                                @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                                public final java.lang.Object apply(java.lang.Object obj2) {
                                    return B3.BinderC0816w.F6(this.f645a, (java.lang.String) obj2);
                                }
                            }, binderC0816w.f719H);
                        }
                    }, this.f719H);
                } else {
                    p224w3.p.f("Asset view map is empty.");
                }
            } else {
                p224w3.p.g("Not a Google URL: ".concat(java.lang.String.valueOf(uri)));
                dVarH0 = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(uri);
            }
            arrayList.add(dVarH0);
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(com.google.android.gms.internal.ads.AbstractC2652Nk0.d(arrayList), new B3.C0814u(this, interfaceC3300bo, z6), this.f714C.d());
    }

    private final void L6(final java.util.List list, final X3.a aVar, com.google.android.gms.internal.ads.InterfaceC3300bo interfaceC3300bo, boolean z6) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25738x7)).booleanValue()) {
            try {
                interfaceC3300bo.o("The updating URL feature is not enabled.");
                return;
            } catch (android.os.RemoteException e6) {
                p224w3.p.e("", e6);
                return;
            }
        }
        P4.d dVarH0 = this.f719H.H0(new java.util.concurrent.Callable() { // from class: B3.q
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f672a.r6(list, aVar);
            }
        });
        if (H0()) {
            dVarH0 = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVarH0, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: B3.r
                @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                public final P4.d b(java.lang.Object obj) {
                    return this.f676a.a7((java.util.ArrayList) obj);
                }
            }, this.f719H);
        } else {
            p224w3.p.f("Asset view map is empty.");
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarH0, new B3.C0813t(this, interfaceC3300bo, z6), this.f714C.d());
    }

    private static boolean M6(android.net.Uri uri, java.util.List list, java.util.List list2) {
        java.lang.String host = uri.getHost();
        java.lang.String path = uri.getPath();
        if (host != null && path != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((java.lang.String) it.next())) {
                    java.util.Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((java.lang.String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.net.Uri N6(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        java.lang.String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i6 = iIndexOf + 1;
        return android.net.Uri.parse(string.substring(0, i6) + str + "=" + str2 + "&" + string.substring(i6));
    }

    private static final java.util.List O6(java.lang.String str) {
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str, ",");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : strArrSplit) {
            if (!com.google.android.gms.internal.ads.AbstractC2829Sg0.d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.Q90 V6(P4.d dVar, com.google.android.gms.internal.ads.C2363Fq c2363Fq) {
        if (!com.google.android.gms.internal.ads.T90.a() || !((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39434e.e()).booleanValue()) {
            return null;
        }
        try {
            com.google.android.gms.internal.ads.Q90 q90A = ((B3.AbstractC0799e) com.google.android.gms.internal.ads.AbstractC2652Nk0.p(dVar)).a();
            q90A.d(new java.util.ArrayList(java.util.Collections.singletonList(c2363Fq.f27459D)));
            p184s3.X1 x6 = c2363Fq.f27461F;
            q90A.b(x6 == null ? "" : x6.f54167R);
            q90A.f(c2363Fq.f27461F.f54164O);
            return q90A;
        } catch (java.util.concurrent.ExecutionException e6) {
            p174r3.v.s().x(e6, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void w6(B3.BinderC0816w binderC0816w, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (binderC0816w.D6((android.net.Uri) it.next())) {
                binderC0816w.f732U.getAndIncrement();
                return;
            }
        }
    }

    final boolean D6(android.net.Uri uri) {
        return M6(uri, this.f736Y, this.f737Z);
    }

    final boolean E6(android.net.Uri uri) {
        return M6(uri, this.f738a0, this.f739b0);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:9:0x0065 A[PHI: r1
  0x0065: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v18 int) binds: [B:6:0x0057, B:8:0x0063, B:11:0x0073, B:14:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2215Bq
    public final void F3(X3.a aVar, final com.google.android.gms.internal.ads.C2363Fq c2363Fq, com.google.android.gms.internal.ads.InterfaceC5829yq interfaceC5829yq) {
        final int i6;
        P4.d dVarH;
        P4.d dVarB;
        P4.d dVarG;
        final android.os.Bundle bundle = new android.os.Bundle();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue()) {
            bundle.putLong(com.google.android.gms.internal.ads.MN.PUBLIC_API_CALL.e(), c2363Fq.f27461F.f54177b0);
            bundle.putLong(com.google.android.gms.internal.ads.MN.DYNAMITE_ENTER.e(), p174r3.v.c().a());
        }
        android.content.Context context = (android.content.Context) X3.b.L0(aVar);
        this.f715D = context;
        com.google.android.gms.internal.ads.E90 e90A = com.google.android.gms.internal.ads.D90.a(context, 22);
        e90A.h();
        int i10 = 0;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25668q7)).booleanValue() && c2363Fq.f27461F.f54154E.getBoolean("optimize_for_app_start", false) && j$.util.Objects.equals(B3.AbstractC0797c.c(c2363Fq.f27461F), "requester_type_8")) {
            i10 = 2;
            if (c2363Fq.f27462G == 2) {
                i6 = i10;
            } else {
                i6 = 1;
            }
        } else {
            i6 = i10;
        }
        if ("UNKNOWN".equals(c2363Fq.f27459D)) {
            java.util.List arrayList = new java.util.ArrayList();
            com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25658p7;
            if (!((java.lang.String) p184s3.A.c().a(abstractC5037rf)).isEmpty()) {
                arrayList = java.util.Arrays.asList(((java.lang.String) p184s3.A.c().a(abstractC5037rf)).split(","));
            }
            if (arrayList.contains(B3.AbstractC0797c.c(c2363Fq.f27461F))) {
                dVarG = com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new java.lang.IllegalArgumentException("Unknown format is no longer supported."));
                dVarB = com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new java.lang.IllegalArgumentException("Unknown format is no longer supported."));
            } else {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Wa)).booleanValue()) {
                    com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34795a;
                    dVarH = yk0.H0(new java.util.concurrent.Callable() { // from class: B3.m
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return this.f651a.U6(c2363Fq, i6, bundle);
                        }
                    });
                    dVarB = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVarH, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: B3.n
                        @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                        public final P4.d b(java.lang.Object obj) {
                            return ((B3.AbstractC0799e) obj).b();
                        }
                    }, yk0);
                } else {
                    B3.AbstractC0799e abstractC0799eG6 = G6(this.f715D, c2363Fq.f27458C, c2363Fq.f27459D, c2363Fq.f27460E, c2363Fq.f27461F, i6, c2363Fq.f27463H, bundle, c2363Fq);
                    dVarH = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(abstractC0799eG6);
                    dVarB = abstractC0799eG6.b();
                }
                dVarG = dVarH;
            }
        } else {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Wa)).booleanValue()) {
                com.google.android.gms.internal.ads.Yk0 yk1 = com.google.android.gms.internal.ads.AbstractC3524dr.f34795a;
                dVarH = yk1.H0(new java.util.concurrent.Callable() { // from class: B3.m
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return this.f651a.U6(c2363Fq, i6, bundle);
                    }
                });
                dVarB = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVarH, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: B3.n
                    @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                    public final P4.d b(java.lang.Object obj) {
                        return ((B3.AbstractC0799e) obj).b();
                    }
                }, yk1);
            } else {
                B3.AbstractC0799e abstractC0799eG7 = G6(this.f715D, c2363Fq.f27458C, c2363Fq.f27459D, c2363Fq.f27460E, c2363Fq.f27461F, i6, c2363Fq.f27463H, bundle, c2363Fq);
                dVarH = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(abstractC0799eG7);
                dVarB = abstractC0799eG7.b();
            }
            dVarG = dVarH;
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarB, new B3.C0812s(this, dVarG, c2363Fq, interfaceC5829yq, e90A), this.f714C.d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2215Bq
    public final void H1(java.util.List list, X3.a aVar, com.google.android.gms.internal.ads.InterfaceC3300bo interfaceC3300bo) {
        L6(list, aVar, interfaceC3300bo, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2215Bq
    public final void N4(java.util.List list, X3.a aVar, com.google.android.gms.internal.ads.InterfaceC3300bo interfaceC3300bo) {
        L6(list, aVar, interfaceC3300bo, true);
    }

    final /* synthetic */ android.net.Uri R6(android.net.Uri uri, X3.a aVar) throws java.lang.Exception {
        com.google.android.gms.internal.ads.C4985r70 c4985r70;
        try {
            uri = (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Sb)).booleanValue() || (c4985r70 = this.f717F) == null) ? this.f716E.a(uri, this.f715D, (android.view.View) X3.b.L0(aVar), null) : c4985r70.a(uri, this.f715D, (android.view.View) X3.b.L0(aVar), null);
        } catch (com.google.android.gms.internal.ads.C3162aa e6) {
            p224w3.p.h("", e6);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new java.lang.Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ B3.AbstractC0799e U6(com.google.android.gms.internal.ads.C2363Fq c2363Fq, int i6, android.os.Bundle bundle) {
        return G6(this.f715D, c2363Fq.f27458C, c2363Fq.f27459D, c2363Fq.f27460E, c2363Fq.f27461F, i6, c2363Fq.f27463H, bundle, c2363Fq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2215Bq
    public final X3.a X4(X3.a aVar, X3.a aVar2, java.lang.String str, X3.a aVar3) {
        androidx.browser.customtabs.f fVarB;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25304I9)).booleanValue()) {
            this.f743f0.g((android.content.Context) X3.b.L0(aVar), (androidx.browser.customtabs.c) X3.b.L0(aVar2), str, (androidx.browser.customtabs.b) X3.b.L0(aVar3));
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28091c.e()).booleanValue()) {
                this.f744g0.b();
            }
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28089a.e()).booleanValue()) {
                this.f745h0.b();
            }
            fVarB = this.f743f0.b();
        } else {
            fVarB = null;
        }
        return X3.b.c2(fVarB);
    }

    final /* synthetic */ P4.d Y6() {
        return G6(this.f715D, null, p104k3.EnumC6886c.BANNER.name(), null, null, 0, null, new android.os.Bundle(), null).b();
    }

    final /* synthetic */ P4.d Z6(com.google.android.gms.internal.ads.PL[] plArr, java.lang.String str, com.google.android.gms.internal.ads.PL pl) throws org.json.JSONException {
        plArr[0] = pl;
        android.content.Context context = this.f715D;
        com.google.android.gms.internal.ads.C3848go c3848go = this.f721J;
        java.util.Map map = c3848go.f35688D;
        org.json.JSONObject jSONObjectD = p214v3.Y.d(context, map, map, c3848go.f35687C, null);
        org.json.JSONObject jSONObjectG = p214v3.Y.g(this.f715D, this.f721J.f35687C);
        org.json.JSONObject jSONObjectF = p214v3.Y.f(this.f721J.f35687C);
        org.json.JSONObject jSONObjectE = p214v3.Y.e(this.f715D, this.f721J.f35687C);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectD);
        jSONObject.put("ad_view_signal", jSONObjectG);
        jSONObject.put("scroll_view_signal", jSONObjectF);
        jSONObject.put("lock_screen_signal", jSONObjectE);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", p214v3.Y.c(null, this.f715D, this.f723L, this.f722K));
        }
        return pl.g(str, jSONObject);
    }

    final /* synthetic */ P4.d a7(final java.util.ArrayList arrayList) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(H6("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: B3.g
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f619a.q6(arrayList, (java.lang.String) obj);
            }
        }, this.f719H);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2215Bq
    public final void b0(X3.a aVar) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25738x7)).booleanValue()) {
            android.view.MotionEvent motionEvent = (android.view.MotionEvent) X3.b.L0(aVar);
            com.google.android.gms.internal.ads.C3848go c3848go = this.f721J;
            this.f722K = p214v3.Y.a(motionEvent, c3848go == null ? null : c3848go.f35687C);
            if (motionEvent.getAction() == 0) {
                this.f723L = this.f722K;
            }
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
            android.graphics.Point point = this.f722K;
            motionEventObtain.setLocation(point.x, point.y);
            this.f716E.d(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2215Bq
    public final void c0(X3.a aVar) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25710u9)).booleanValue()) {
            com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25648o7;
            if (!((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
                J6();
            }
            android.webkit.WebView webView = (android.webkit.WebView) X3.b.L0(aVar);
            if (webView == null) {
                p224w3.p.d("The webView cannot be null.");
                return;
            }
            final B3.g0 g0Var = new B3.g0(webView, this.f745h0, com.google.android.gms.internal.ads.AbstractC3524dr.f34800f);
            webView.addJavascriptInterface(new B3.C0795a(webView, this.f716E, this.f724M, this.f725N, this.f717F, this.f744g0, this.f745h0, g0Var), "gmaSdk");
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25260E9)).booleanValue()) {
                p174r3.v.s().t();
            }
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28089a.e()).booleanValue()) {
                this.f745h0.b();
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28090b.e()).booleanValue()) {
                    com.google.android.gms.internal.ads.AbstractC3524dr.f34798d.scheduleWithFixedDelay(new java.lang.Runnable() { // from class: B3.f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            g0Var.c();
                        }
                    }, 0L, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25271F9)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
                }
            }
            if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
                J6();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2215Bq
    public final void c1(com.google.android.gms.internal.ads.C3848go c3848go) {
        this.f721J = c3848go;
        this.f718G.c(1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2215Bq
    public final void o1(java.util.List list, X3.a aVar, com.google.android.gms.internal.ads.InterfaceC3300bo interfaceC3300bo) {
        K6(list, aVar, interfaceC3300bo, false);
    }

    final /* synthetic */ java.util.ArrayList q6(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.net.Uri uriN6 = (android.net.Uri) it.next();
            if (E6(uriN6) && !android.text.TextUtils.isEmpty(str)) {
                uriN6 = N6(uriN6, "nas", str);
            }
            arrayList.add(uriN6);
        }
        return arrayList;
    }

    final /* synthetic */ java.util.ArrayList r6(java.util.List list, X3.a aVar) throws java.lang.Exception {
        java.lang.String strI = this.f716E.c() != null ? this.f716E.c().i(this.f715D, (android.view.View) X3.b.L0(aVar), null) : "";
        if (android.text.TextUtils.isEmpty(strI)) {
            throw new java.lang.Exception("Failed to get view signals.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.net.Uri uriN6 = (android.net.Uri) it.next();
            if (E6(uriN6)) {
                uriN6 = N6(uriN6, "ms", strI);
            } else {
                p224w3.p.g("Not a Google URL: ".concat(java.lang.String.valueOf(uriN6)));
            }
            arrayList.add(uriN6);
        }
        if (arrayList.isEmpty()) {
            throw new java.lang.Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2215Bq
    public final void u4(java.util.List list, X3.a aVar, com.google.android.gms.internal.ads.InterfaceC3300bo interfaceC3300bo) {
        K6(list, aVar, interfaceC3300bo, true);
    }

    final /* synthetic */ void y6(com.google.android.gms.internal.ads.PL[] plArr) {
        com.google.android.gms.internal.ads.PL pl = plArr[0];
        if (pl != null) {
            this.f718G.b(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(pl));
        }
    }
}
