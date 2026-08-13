package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2133b extends com.android.billingclient.api.AbstractC2132a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f24534A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private com.android.billingclient.api.C2136e f24535B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f24536C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.util.concurrent.ExecutorService f24537D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private volatile com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC6326y1 f24538E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.Long f24539F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f24540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f24541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f24542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.os.Handler f24543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile com.android.billingclient.api.I f24544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.content.Context f24545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.android.billingclient.api.y f24546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.google.android.gms.internal.play_billing.InterfaceC6199d f24547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile com.android.billingclient.api.ServiceConnectionC2145n f24548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f24550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f24551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f24552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f24553n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f24554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f24555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f24556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f24557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f24558s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f24559t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f24560u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f24561v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f24562w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f24563x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f24564y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f24565z;

    C2133b(java.lang.String str, android.content.Context context, com.android.billingclient.api.y yVar, java.util.concurrent.ExecutorService executorService) {
        this.f24540a = new java.lang.Object();
        this.f24541b = 0;
        this.f24543d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f24551l = 0;
        java.lang.Long lValueOf = java.lang.Long.valueOf(new java.util.Random().nextLong());
        this.f24539F = lValueOf;
        java.lang.String strH = H();
        this.f24542c = strH;
        this.f24545f = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.C6228h4 c6228h4F = com.google.android.gms.internal.play_billing.C6240j4.F();
        c6228h4F.u(strH);
        c6228h4F.t(this.f24545f.getPackageName());
        c6228h4F.r(lValueOf.longValue());
        this.f24546g = new com.android.billingclient.api.A(this.f24545f, (com.google.android.gms.internal.play_billing.C6240j4) c6228h4F.l());
        this.f24545f.getPackageName();
    }

    C2133b(java.lang.String str, com.android.billingclient.api.C2136e c2136e, android.content.Context context, T2.e eVar, T2.k kVar, com.android.billingclient.api.y yVar, java.util.concurrent.ExecutorService executorService) {
        java.lang.String strH = H();
        this.f24540a = new java.lang.Object();
        this.f24541b = 0;
        this.f24543d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f24551l = 0;
        this.f24539F = java.lang.Long.valueOf(new java.util.Random().nextLong());
        this.f24542c = strH;
        h(context, eVar, c2136e, null, strH, null);
    }

    C2133b(java.lang.String str, com.android.billingclient.api.C2136e c2136e, android.content.Context context, T2.u uVar, com.android.billingclient.api.y yVar, java.util.concurrent.ExecutorService executorService) {
        this.f24540a = new java.lang.Object();
        this.f24541b = 0;
        this.f24543d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f24551l = 0;
        java.lang.Long lValueOf = java.lang.Long.valueOf(new java.util.Random().nextLong());
        this.f24539F = lValueOf;
        this.f24542c = H();
        this.f24545f = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.C6228h4 c6228h4F = com.google.android.gms.internal.play_billing.C6240j4.F();
        c6228h4F.u(H());
        c6228h4F.t(this.f24545f.getPackageName());
        c6228h4F.r(lValueOf.longValue());
        this.f24546g = new com.android.billingclient.api.A(this.f24545f, (com.google.android.gms.internal.play_billing.C6240j4) c6228h4F.l());
        com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f24544e = new com.android.billingclient.api.I(this.f24545f, null, null, null, null, this.f24546g);
        this.f24535B = c2136e;
        this.f24545f.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.android.billingclient.api.C2135d G() {
        com.android.billingclient.api.C2135d c2135d;
        int[] iArr = {0, 3};
        synchronized (this.f24540a) {
            for (int i6 = 0; i6 < 2; i6++) {
                if (this.f24541b == iArr[i6]) {
                    c2135d = com.android.billingclient.api.z.f24660m;
                }
            }
            c2135d = com.android.billingclient.api.z.f24658k;
        }
        return c2135d;
    }

    private static java.lang.String H() {
        try {
            return (java.lang.String) java.lang.Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (java.lang.Exception unused) {
            return "7.1.1";
        }
    }

    private final synchronized java.util.concurrent.ExecutorService I() {
        try {
            if (this.f24537D == null) {
                this.f24537D = java.util.concurrent.Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.AbstractC6195c1.f41524a, new com.android.billingclient.api.ThreadFactoryC2141j(this));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f24537D;
    }

    private final void J(com.google.android.gms.internal.play_billing.N3 n6) {
        try {
            this.f24546g.e(n6, this.f24551l);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Unable to log.", th);
        }
    }

    private final void K(com.google.android.gms.internal.play_billing.S3 s6) {
        try {
            this.f24546g.f(s6, this.f24551l);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Unable to log.", th);
        }
    }

    private final void L(java.lang.String str, final T2.d dVar) {
        com.android.billingclient.api.C2135d c2135dG;
        int i6;
        if (!i()) {
            c2135dG = com.android.billingclient.api.z.f24660m;
            i6 = 2;
        } else if (android.text.TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Please provide a valid product type.");
            c2135dG = com.android.billingclient.api.z.f24655h;
            i6 = 50;
        } else {
            if (k(new com.android.billingclient.api.CallableC2142k(this, str, dVar), 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24600C.Y(dVar);
                }
            }, g0(), I()) != null) {
                return;
            }
            c2135dG = G();
            i6 = 25;
        }
        j0(i6, 9, c2135dG);
        dVar.a(c2135dG, com.google.android.gms.internal.play_billing.AbstractC6206e0.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int i6) {
        synchronized (this.f24540a) {
            try {
                if (this.f24541b == 3) {
                    return;
                }
                com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Setting clientState from " + Q(this.f24541b) + " to " + Q(i6));
                this.f24541b = i6;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void N() {
        java.util.concurrent.ExecutorService executorService = this.f24537D;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f24537D = null;
            this.f24538E = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        synchronized (this.f24540a) {
            if (this.f24548i != null) {
                try {
                    this.f24545f.unbindService(this.f24548i);
                    this.f24547h = null;
                } catch (java.lang.Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "There was an exception while unbinding service!", th);
                        this.f24547h = null;
                    } catch (java.lang.Throwable th2) {
                        this.f24547h = null;
                        this.f24548i = null;
                        throw th2;
                    }
                }
                this.f24548i = null;
            }
        }
    }

    private final boolean P() {
        return this.f24562w && this.f24535B.b();
    }

    private static final java.lang.String Q(int i6) {
        if (i6 == 0) {
            return "DISCONNECTED";
        }
        if (i6 != 1) {
            return i6 != 2 ? "CLOSED" : "CONNECTED";
        }
        return "CONNECTING";
    }

    private final T2.w R(int i6, com.android.billingclient.api.C2135d c2135d, int i10, java.lang.String str, java.lang.Exception exc) {
        k0(i10, 9, c2135d, com.android.billingclient.api.x.a(exc));
        com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", str, exc);
        return new T2.w(c2135d, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T2.w S(java.lang.String str, int i6) {
        java.lang.Exception exc;
        java.lang.String str2;
        com.android.billingclient.api.C2135d c2135dA;
        int iB;
        com.google.android.gms.internal.play_billing.InterfaceC6199d interfaceC6199d;
        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Querying owned items, item type: ".concat(java.lang.String.valueOf(str)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Bundle bundleD = com.google.android.gms.internal.play_billing.AbstractC6195c1.d(this.f24554o, this.f24562w, this.f24535B.a(), this.f24535B.b(), this.f24542c, this.f24539F.longValue());
        java.lang.String string = null;
        do {
            try {
                synchronized (this.f24540a) {
                    interfaceC6199d = this.f24547h;
                }
                if (interfaceC6199d == null) {
                    return R(9, com.android.billingclient.api.z.f24660m, 119, "Service has been reset to null", null);
                }
                android.os.Bundle bundleA5 = this.f24554o ? interfaceC6199d.A5(true != this.f24562w ? 9 : 19, this.f24545f.getPackageName(), str, string, bundleD) : interfaceC6199d.D2(3, this.f24545f.getPackageName(), str, string);
                com.android.billingclient.api.E eA = com.android.billingclient.api.F.a(bundleA5, "BillingClient", "getPurchase()");
                c2135dA = eA.a();
                if (c2135dA != com.android.billingclient.api.z.f24659l) {
                    iB = eA.b();
                    str2 = "Purchase bundle invalid";
                    exc = null;
                } else {
                    java.util.ArrayList<java.lang.String> stringArrayList = bundleA5.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    java.util.ArrayList<java.lang.String> stringArrayList2 = bundleA5.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    java.util.ArrayList<java.lang.String> stringArrayList3 = bundleA5.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    boolean z6 = false;
                    for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                        java.lang.String str3 = stringArrayList2.get(i10);
                        java.lang.String str4 = stringArrayList3.get(i10);
                        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Sku is owned: ".concat(java.lang.String.valueOf(stringArrayList.get(i10))));
                        try {
                            com.android.billingclient.api.Purchase purchase = new com.android.billingclient.api.Purchase(str3, str4);
                            if (android.text.TextUtils.isEmpty(purchase.d())) {
                                com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "BUG: empty/null token!");
                                z6 = true;
                            }
                            arrayList.add(purchase);
                        } catch (org.json.JSONException e6) {
                            exc = e6;
                            str2 = "Got an exception trying to decode the purchase!";
                            c2135dA = com.android.billingclient.api.z.f24658k;
                            iB = 51;
                        }
                    }
                    if (z6) {
                        j0(26, 9, com.android.billingclient.api.z.f24658k);
                    }
                    string = bundleA5.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Continuation token: ".concat(java.lang.String.valueOf(string)));
                }
                return R(9, c2135dA, iB, str2, exc);
            } catch (android.os.DeadObjectException e10) {
                exc = e10;
                str2 = "Got exception trying to get purchases try to reconnect";
                c2135dA = com.android.billingclient.api.z.f24660m;
                iB = 52;
            } catch (java.lang.Exception e11) {
                exc = e11;
                str2 = "Got exception trying to get purchases try to reconnect";
                c2135dA = com.android.billingclient.api.z.f24658k;
                iB = 52;
            }
        } while (!android.text.TextUtils.isEmpty(string));
        return new T2.w(com.android.billingclient.api.z.f24659l, arrayList);
    }

    private final com.android.billingclient.api.G T(com.android.billingclient.api.C2135d c2135d, int i6, java.lang.String str, java.lang.Exception exc) {
        com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", str, exc);
        k0(i6, 8, c2135d, com.android.billingclient.api.x.a(exc));
        return new com.android.billingclient.api.G(c2135d.b(), c2135d.a(), null);
    }

    private final void U(T2.InterfaceC1652b interfaceC1652b, com.android.billingclient.api.C2135d c2135d, int i6, java.lang.Exception exc) {
        com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Error in acknowledge purchase!", exc);
        k0(i6, 3, c2135d, com.android.billingclient.api.x.a(exc));
        interfaceC1652b.a(c2135d);
    }

    static /* bridge */ /* synthetic */ boolean b0(com.android.billingclient.api.C2133b c2133b) {
        boolean z6;
        synchronized (c2133b.f24540a) {
            z6 = true;
            if (c2133b.f24541b != 1) {
                z6 = false;
            }
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.os.Handler g0() {
        return android.os.Looper.myLooper() == null ? this.f24543d : new android.os.Handler(android.os.Looper.myLooper());
    }

    private void h(android.content.Context context, T2.e eVar, com.android.billingclient.api.C2136e c2136e, T2.k kVar, java.lang.String str, com.android.billingclient.api.y yVar) {
        this.f24545f = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.C6228h4 c6228h4F = com.google.android.gms.internal.play_billing.C6240j4.F();
        c6228h4F.u(str);
        c6228h4F.t(this.f24545f.getPackageName());
        c6228h4F.r(this.f24539F.longValue());
        if (yVar == null) {
            yVar = new com.android.billingclient.api.A(this.f24545f, (com.google.android.gms.internal.play_billing.C6240j4) c6228h4F.l());
        }
        this.f24546g = yVar;
        if (eVar == null) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f24544e = new com.android.billingclient.api.I(this.f24545f, eVar, null, kVar, null, this.f24546g);
        this.f24535B = c2136e;
        this.f24536C = kVar != null;
        this.f24545f.getPackageName();
    }

    private final com.android.billingclient.api.C2135d h0() {
        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Service connection is valid. No need to re-initialize.");
        com.google.android.gms.internal.play_billing.Q3 q3D = com.google.android.gms.internal.play_billing.S3.D();
        q3D.r(6);
        com.google.android.gms.internal.play_billing.L4 l4C = com.google.android.gms.internal.play_billing.N4.C();
        l4C.q(true);
        q3D.q(l4C);
        K((com.google.android.gms.internal.play_billing.S3) q3D.l());
        return com.android.billingclient.api.z.f24659l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(int i6, int i10, com.android.billingclient.api.C2135d c2135d) {
        try {
            J(com.android.billingclient.api.x.b(i6, i10, c2135d));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static java.util.concurrent.Future k(java.util.concurrent.Callable callable, long j6, final java.lang.Runnable runnable, android.os.Handler handler, java.util.concurrent.ExecutorService executorService) {
        try {
            final java.util.concurrent.Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new java.lang.Runnable() { // from class: T2.j
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.concurrent.Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    java.lang.Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j6 * 0.95d));
            return futureSubmit;
        } catch (java.lang.Exception e6) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Async task throws exception!", e6);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(int i6, int i10, com.android.billingclient.api.C2135d c2135d, java.lang.String str) {
        try {
            J(com.android.billingclient.api.x.c(i6, i10, c2135d, str));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(int i6) {
        try {
            K(com.android.billingclient.api.x.d(i6));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Unable to log.", th);
        }
    }

    final /* synthetic */ java.lang.Object A0(T2.InterfaceC1652b interfaceC1652b, T2.C1651a c1651a) {
        com.google.android.gms.internal.play_billing.InterfaceC6199d interfaceC6199d;
        try {
            synchronized (this.f24540a) {
                interfaceC6199d = this.f24547h;
            }
            if (interfaceC6199d == null) {
                U(interfaceC1652b, com.android.billingclient.api.z.f24660m, 119, null);
                return null;
            }
            java.lang.String packageName = this.f24545f.getPackageName();
            java.lang.String strA = c1651a.a();
            java.lang.String str = this.f24542c;
            long jLongValue = this.f24539F.longValue();
            android.os.Bundle bundle = new android.os.Bundle();
            com.google.android.gms.internal.play_billing.AbstractC6195c1.c(bundle, str, jLongValue);
            android.os.Bundle bundleA6 = interfaceC6199d.a6(9, packageName, strA, bundle);
            interfaceC1652b.a(com.android.billingclient.api.z.a(com.google.android.gms.internal.play_billing.AbstractC6195c1.b(bundleA6, "BillingClient"), com.google.android.gms.internal.play_billing.AbstractC6195c1.f(bundleA6, "BillingClient")));
            return null;
        } catch (android.os.DeadObjectException e6) {
            U(interfaceC1652b, com.android.billingclient.api.z.f24660m, 28, e6);
            return null;
        } catch (java.lang.Exception e10) {
            U(interfaceC1652b, com.android.billingclient.api.z.f24658k, 28, e10);
            return null;
        }
    }

    final /* synthetic */ void W(T2.InterfaceC1652b interfaceC1652b) {
        com.android.billingclient.api.C2135d c2135d = com.android.billingclient.api.z.f24661n;
        j0(24, 3, c2135d);
        interfaceC1652b.a(c2135d);
    }

    final /* synthetic */ void X(com.android.billingclient.api.C2135d c2135d) {
        if (this.f24544e.d() != null) {
            this.f24544e.d().a(c2135d, null);
        } else {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    final /* synthetic */ void Y(T2.d dVar) {
        com.android.billingclient.api.C2135d c2135d = com.android.billingclient.api.z.f24661n;
        j0(24, 9, c2135d);
        dVar.a(c2135d, com.google.android.gms.internal.play_billing.AbstractC6206e0.E());
    }

    final /* synthetic */ void Z(T2.g gVar) {
        com.android.billingclient.api.C2135d c2135d = com.android.billingclient.api.z.f24661n;
        j0(24, 8, c2135d);
        gVar.a(c2135d, null);
    }

    @Override // com.android.billingclient.api.AbstractC2132a
    public void a(final T2.C1651a c1651a, final T2.InterfaceC1652b interfaceC1652b) {
        com.android.billingclient.api.C2135d c2135dG;
        int i6;
        if (!i()) {
            c2135dG = com.android.billingclient.api.z.f24660m;
            i6 = 2;
        } else if (android.text.TextUtils.isEmpty(c1651a.a())) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Please provide a valid purchase token.");
            c2135dG = com.android.billingclient.api.z.f24657j;
            i6 = 26;
        } else if (!this.f24554o) {
            c2135dG = com.android.billingclient.api.z.f24649b;
            i6 = 27;
        } else {
            if (k(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.L
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    this.f24506a.A0(interfaceC1652b, c1651a);
                    return null;
                }
            }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.M
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24509C.W(interfaceC1652b);
                }
            }, g0(), I()) != null) {
                return;
            }
            c2135dG = G();
            i6 = 25;
        }
        j0(i6, 3, c2135dG);
        interfaceC1652b.a(c2135dG);
    }

    @Override // com.android.billingclient.api.AbstractC2132a
    public void b() {
        l0(12);
        synchronized (this.f24540a) {
            try {
                if (this.f24544e != null) {
                    this.f24544e.f();
                    try {
                        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Unbinding from service.");
                        O();
                    } catch (java.lang.Throwable th) {
                        com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
                    }
                    try {
                        N();
                    } catch (java.lang.Throwable th2) {
                        try {
                            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th2);
                        } catch (java.lang.Throwable th3) {
                            M(3);
                            throw th3;
                        }
                    }
                    M(3);
                } else {
                    com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Unbinding from service.");
                    O();
                    N();
                    M(3);
                }
            } catch (java.lang.Throwable th4) {
                com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th4);
            }
            throw th;
        }
    }

    @Override // com.android.billingclient.api.AbstractC2132a
    public com.android.billingclient.api.C2135d c(android.app.Activity activity, final com.android.billingclient.api.C2134c c2134c) {
        java.lang.String str;
        java.lang.String str2;
        java.util.concurrent.Future futureK;
        com.android.billingclient.api.C2135d c2135d;
        java.lang.String strA;
        int i6;
        int iA;
        int i10;
        java.lang.String string;
        boolean z6;
        java.lang.String str3;
        com.android.billingclient.api.SkuDetails skuDetails;
        java.lang.String str4;
        java.lang.String str5;
        boolean z10;
        java.lang.String str6;
        int i11;
        final int i12;
        final com.android.billingclient.api.C2133b c2133b = this;
        if (c2133b.f24544e == null || c2133b.f24544e.d() == null) {
            com.android.billingclient.api.C2135d c2135d2 = com.android.billingclient.api.z.f24646F;
            c2133b.j0(12, 2, c2135d2);
            return c2135d2;
        }
        if (!i()) {
            com.android.billingclient.api.C2135d c2135d3 = com.android.billingclient.api.z.f24660m;
            c2133b.j0(2, 2, c2135d3);
            c2133b.u0(c2135d3);
            return c2135d3;
        }
        java.util.ArrayList<com.android.billingclient.api.SkuDetails> arrayListH = c2134c.h();
        java.util.List listI = c2134c.i();
        com.android.billingclient.api.SkuDetails skuDetails2 = (com.android.billingclient.api.SkuDetails) com.google.android.gms.internal.play_billing.AbstractC6260n0.a(arrayListH, null);
        androidx.appcompat.app.D.a(com.google.android.gms.internal.play_billing.AbstractC6260n0.a(listI, null));
        skuDetails2.getClass();
        final java.lang.String strB = skuDetails2.b();
        final java.lang.String strD = skuDetails2.d();
        java.lang.String str7 = "BillingClient";
        if (strD.equals("subs") && !c2133b.f24549j) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Current client doesn't support subscriptions.");
            com.android.billingclient.api.C2135d c2135d4 = com.android.billingclient.api.z.f24662o;
            c2133b.j0(9, 2, c2135d4);
            c2133b.u0(c2135d4);
            return c2135d4;
        }
        if (c2134c.r() && !c2133b.f24552m) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Current client doesn't support extra params for buy intent.");
            com.android.billingclient.api.C2135d c2135d5 = com.android.billingclient.api.z.f24656i;
            c2133b.j0(18, 2, c2135d5);
            c2133b.u0(c2135d5);
            return c2135d5;
        }
        if (arrayListH.size() > 1 && !c2133b.f24559t) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Current client doesn't support multi-item purchases.");
            com.android.billingclient.api.C2135d c2135d6 = com.android.billingclient.api.z.f24667t;
            c2133b.j0(19, 2, c2135d6);
            c2133b.u0(c2135d6);
            return c2135d6;
        }
        if (!listI.isEmpty() && !c2133b.f24560u) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            com.android.billingclient.api.C2135d c2135d7 = com.android.billingclient.api.z.f24669v;
            c2133b.j0(20, 2, c2135d7);
            c2133b.u0(c2135d7);
            return c2135d7;
        }
        com.android.billingclient.api.C2135d c2135dC = c2134c.c();
        if (c2135dC != com.android.billingclient.api.z.f24659l) {
            c2133b.j0(120, 2, c2135dC);
            c2133b.u0(c2135dC);
            return c2135dC;
        }
        if (c2133b.f24552m) {
            boolean z11 = c2133b.f24554o;
            boolean z12 = c2133b.f24562w;
            boolean zA = c2133b.f24535B.a();
            boolean zB = c2133b.f24535B.b();
            boolean z13 = c2133b.f24536C;
            java.lang.String str8 = c2133b.f24542c;
            long jLongValue = c2133b.f24539F.longValue();
            final java.lang.String packageName = c2133b.f24545f.getPackageName();
            final android.os.Bundle bundle = new android.os.Bundle();
            com.google.android.gms.internal.play_billing.AbstractC6195c1.c(bundle, str8, jLongValue);
            if (c2134c.b() != 0) {
                bundle.putInt("prorationMode", c2134c.b());
            }
            if (!android.text.TextUtils.isEmpty(c2134c.d())) {
                bundle.putString("accountId", c2134c.d());
            }
            if (!android.text.TextUtils.isEmpty(c2134c.e())) {
                bundle.putString("obfuscatedProfileId", c2134c.e());
            }
            if (c2134c.q()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!android.text.TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new java.util.ArrayList<>(java.util.Arrays.asList(null)));
            }
            if (!android.text.TextUtils.isEmpty(c2134c.f())) {
                bundle.putString("oldSkuPurchaseToken", c2134c.f());
            }
            if (!android.text.TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!android.text.TextUtils.isEmpty(c2134c.g())) {
                bundle.putString("originalExternalTransactionId", c2134c.g());
            }
            if (!android.text.TextUtils.isEmpty(null)) {
                bundle.putString("paymentsPurchaseParams", null);
            }
            if (z11 && zA) {
                z6 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z6 = true;
            }
            if (z12 && zB) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z6);
            }
            if (z13) {
                bundle.putBoolean("enableAlternativeBilling", z6);
            }
            if (j$.util.Collection.EL.stream(c2134c.i()).anyMatch(new java.util.function.Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                public /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
                    return j$.util.function.Predicate$CC.$default$and(this, predicate);
                }

                public /* synthetic */ java.util.function.Predicate negate() {
                    return j$.util.function.Predicate$CC.$default$negate(this);
                }

                public /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                    return j$.util.function.Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    androidx.appcompat.app.D.a(obj);
                    int i13 = com.google.android.gms.internal.play_billing.AbstractC6195c1.f41524a;
                    return false;
                }
            })) {
                com.google.android.gms.internal.play_billing.Q1 q1A = com.google.android.gms.internal.play_billing.R1.A();
                q1A.q((java.lang.Iterable) j$.util.Collection.EL.stream(c2134c.i()).filter(new java.util.function.Predicate() { // from class: com.google.android.gms.internal.play_billing.o
                    public /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
                        return j$.util.function.Predicate$CC.$default$and(this, predicate);
                    }

                    public /* synthetic */ java.util.function.Predicate negate() {
                        return j$.util.function.Predicate$CC.$default$negate(this);
                    }

                    public /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                        return j$.util.function.Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(java.lang.Object obj) {
                        androidx.appcompat.app.D.a(obj);
                        int i13 = com.google.android.gms.internal.play_billing.AbstractC6195c1.f41524a;
                        return false;
                    }
                }).map(new java.util.function.Function() { // from class: com.google.android.gms.internal.play_billing.P
                    public /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                        return j$.util.function.Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        androidx.appcompat.app.D.a(obj);
                        int i13 = com.google.android.gms.internal.play_billing.AbstractC6195c1.f41524a;
                        throw null;
                    }

                    public /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                        return j$.util.function.Function$CC.$default$compose(this, function);
                    }
                }).collect(com.google.android.gms.internal.play_billing.AbstractC6206e0.O()));
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((com.google.android.gms.internal.play_billing.R1) q1A.l()).d());
            }
            if (arrayListH.isEmpty()) {
                str3 = "proxyPackageVersion";
                skuDetails = skuDetails2;
                str4 = "BillingClient";
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(listI.size() - 1);
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>(listI.size() - 1);
                java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList5 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.Integer> arrayList6 = new java.util.ArrayList<>();
                if (listI.size() > 0) {
                    androidx.appcompat.app.D.a(listI.get(0));
                    throw null;
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList6);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                java.util.ArrayList<java.lang.String> arrayList7 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList8 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList9 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.Integer> arrayList10 = new java.util.ArrayList<>();
                str3 = "proxyPackageVersion";
                java.util.ArrayList<java.lang.String> arrayList11 = new java.util.ArrayList<>();
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                for (com.android.billingclient.api.SkuDetails skuDetails3 : arrayListH) {
                    if (!skuDetails3.j().isEmpty()) {
                        arrayList7.add(skuDetails3.j());
                    }
                    java.lang.String strG = skuDetails3.g();
                    com.android.billingclient.api.SkuDetails skuDetails4 = skuDetails2;
                    java.lang.String strF = skuDetails3.f();
                    int iE = skuDetails3.e();
                    java.lang.String strI = skuDetails3.i();
                    arrayList8.add(strG);
                    z14 |= !android.text.TextUtils.isEmpty(strG);
                    arrayList9.add(strF);
                    z15 |= !android.text.TextUtils.isEmpty(strF);
                    arrayList10.add(java.lang.Integer.valueOf(iE));
                    z16 |= iE != 0;
                    z17 |= !android.text.TextUtils.isEmpty(strI);
                    arrayList11.add(strI);
                    str7 = str7;
                    skuDetails2 = skuDetails4;
                }
                skuDetails = skuDetails2;
                str4 = str7;
                if (!arrayList7.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (z14) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                }
                if (z15) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList9);
                }
                if (z16) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList10);
                }
                if (z17) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList11);
                }
                if (arrayListH.size() > 1) {
                    java.util.ArrayList<java.lang.String> arrayList12 = new java.util.ArrayList<>(arrayListH.size() - 1);
                    java.util.ArrayList<java.lang.String> arrayList13 = new java.util.ArrayList<>(arrayListH.size() - 1);
                    for (int i13 = 1; i13 < arrayListH.size(); i13++) {
                        arrayList12.add(((com.android.billingclient.api.SkuDetails) arrayListH.get(i13)).b());
                        arrayList13.add(((com.android.billingclient.api.SkuDetails) arrayListH.get(i13)).d());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList12);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList13);
                }
            }
            c2133b = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !c2133b.f24557r) {
                com.android.billingclient.api.C2135d c2135d8 = com.android.billingclient.api.z.f24668u;
                c2133b.j0(21, 2, c2135d8);
                c2133b.u0(c2135d8);
                return c2135d8;
            }
            if (skuDetails == null || android.text.TextUtils.isEmpty(skuDetails.h())) {
                str5 = null;
                z10 = false;
            } else {
                bundle.putString("skuPackageName", skuDetails.h());
                str5 = null;
                z10 = true;
            }
            if (!android.text.TextUtils.isEmpty(str5)) {
                bundle.putString("accountName", str5);
            }
            android.content.Intent intent = activity.getIntent();
            if (intent == null) {
                str2 = str4;
                com.google.android.gms.internal.play_billing.AbstractC6195c1.j(str2, "Activity's intent is null.");
            } else {
                str2 = str4;
                if (!android.text.TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    java.lang.String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra);
                    try {
                        str6 = str3;
                        try {
                            bundle.putString(str6, c2133b.f24545f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                            bundle.putString(str6, "package not found");
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                        str6 = str3;
                    }
                }
            }
            if (c2133b.f24560u && !listI.isEmpty()) {
                i11 = 17;
            } else if (c2133b.f24558s && z10) {
                i11 = 15;
            } else {
                if (c2133b.f24554o) {
                    i12 = 9;
                } else {
                    i11 = 6;
                }
                futureK = k(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.i
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return this.f24602a.n0(i12, strB, strD, c2134c, bundle);
                    }
                }, 5000L, null, c2133b.f24543d, I());
                str = null;
            }
            i12 = i11;
            futureK = k(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.i
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f24602a.n0(i12, strB, strD, c2134c, bundle);
                }
            }, 5000L, null, c2133b.f24543d, I());
            str = null;
        } else {
            str = null;
            str2 = "BillingClient";
            futureK = k(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.K
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f24503a.o0(strB, strD);
                }
            }, 5000L, null, c2133b.f24543d, I());
        }
        try {
            if (futureK == null) {
                com.android.billingclient.api.C2135d c2135d9 = com.android.billingclient.api.z.f24651d;
                c2133b.j0(25, 2, c2135d9);
                c2133b.u0(c2135d9);
                return c2135d9;
            }
            android.os.Bundle bundle2 = (android.os.Bundle) futureK.get(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            int iB = com.google.android.gms.internal.play_billing.AbstractC6195c1.b(bundle2, str2);
            java.lang.String strF2 = com.google.android.gms.internal.play_billing.AbstractC6195c1.f(bundle2, str2);
            if (iB == 0) {
                android.content.Intent intent2 = new android.content.Intent(activity, (java.lang.Class<?>) com.android.billingclient.api.ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (android.app.PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                activity.startActivity(intent2);
                return com.android.billingclient.api.z.f24659l;
            }
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j(str2, "Unable to buy item, Error response code: " + iB);
            com.android.billingclient.api.C2135d c2135dA = com.android.billingclient.api.z.a(iB, strF2);
            if (bundle2 == null) {
                i10 = 1;
                iA = 1;
            } else {
                try {
                    java.lang.Object obj = bundle2.get("LOG_REASON");
                    if (obj != null) {
                        if (obj instanceof java.lang.Integer) {
                            iA = com.google.android.gms.internal.play_billing.V3.a(((java.lang.Integer) obj).intValue());
                            i10 = 1;
                        } else {
                            com.google.android.gms.internal.play_billing.AbstractC6195c1.j(str2, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        }
                    }
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.internal.play_billing.AbstractC6195c1.j(str2, "Failed to get log reason from bundle: ".concat(java.lang.String.valueOf(th.getMessage())));
                }
                i10 = 1;
                iA = 1;
            }
            if (iA == i10) {
                iA = 23;
            }
            if (bundle2 == null) {
                string = str;
            } else {
                try {
                    string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                } catch (java.lang.Throwable th2) {
                    com.google.android.gms.internal.play_billing.AbstractC6195c1.j(str2, "Failed to get additional log details from bundle: ".concat(java.lang.String.valueOf(th2.getMessage())));
                    string = str;
                }
            }
            c2133b.k0(iA, 2, c2135dA, string);
            c2133b.u0(c2135dA);
            return c2135dA;
        } catch (java.util.concurrent.CancellationException e6) {
            e = e6;
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k(str2, "Time out while launching billing flow. Try to reconnect", e);
            c2135d = com.android.billingclient.api.z.f24661n;
            strA = com.android.billingclient.api.x.a(e);
            i6 = 4;
            c2133b.k0(i6, 2, c2135d, strA);
            c2133b.u0(c2135d);
            return c2135d;
        } catch (java.util.concurrent.TimeoutException e10) {
            e = e10;
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k(str2, "Time out while launching billing flow. Try to reconnect", e);
            c2135d = com.android.billingclient.api.z.f24661n;
            strA = com.android.billingclient.api.x.a(e);
            i6 = 4;
            c2133b.k0(i6, 2, c2135d, strA);
            c2133b.u0(c2135d);
            return c2135d;
        } catch (java.lang.Exception e11) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k(str2, "Exception while launching billing flow. Try to reconnect", e11);
            c2135d = com.android.billingclient.api.z.f24660m;
            strA = com.android.billingclient.api.x.a(e11);
            i6 = 5;
            c2133b.k0(i6, 2, c2135d, strA);
            c2133b.u0(c2135d);
            return c2135d;
        }
    }

    @Override // com.android.billingclient.api.AbstractC2132a
    public final void e(T2.f fVar, T2.d dVar) {
        L(fVar.b(), dVar);
    }

    @Override // com.android.billingclient.api.AbstractC2132a
    public void f(com.android.billingclient.api.C2137f c2137f, final T2.g gVar) {
        com.android.billingclient.api.C2135d c2135dG;
        int i6;
        if (i()) {
            final java.lang.String strA = c2137f.a();
            final java.util.List listB = c2137f.b();
            if (android.text.TextUtils.isEmpty(strA)) {
                com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Please fix the input params. SKU type can't be empty.");
                c2135dG = com.android.billingclient.api.z.f24654g;
                i6 = 49;
            } else if (listB == null) {
                com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
                c2135dG = com.android.billingclient.api.z.f24653f;
                i6 = 48;
            } else {
                final java.lang.String str = null;
                if (k(new java.util.concurrent.Callable(strA, listB, str, gVar) { // from class: com.android.billingclient.api.N

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f24512b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ java.util.List f24513c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ T2.g f24514d;

                    {
                        this.f24514d = gVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        com.android.billingclient.api.G gV0 = this.f24511a.v0(this.f24512b, this.f24513c, null);
                        this.f24514d.a(com.android.billingclient.api.z.a(gV0.a(), gV0.b()), gV0.c());
                        return null;
                    }
                }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24598C.Z(gVar);
                    }
                }, g0(), I()) != null) {
                    return;
                }
                c2135dG = G();
                i6 = 25;
            }
        } else {
            c2135dG = com.android.billingclient.api.z.f24660m;
            i6 = 2;
        }
        j0(i6, 8, c2135dG);
        gVar.a(c2135dG, null);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    @Override // com.android.billingclient.api.AbstractC2132a
    public void g(T2.c cVar) {
        com.android.billingclient.api.C2135d c2135dH0;
        synchronized (this.f24540a) {
            try {
                if (i()) {
                    c2135dH0 = h0();
                } else if (this.f24541b == 1) {
                    com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Client is already in the process of connecting to billing service.");
                    c2135dH0 = com.android.billingclient.api.z.f24652e;
                    j0(37, 6, c2135dH0);
                } else if (this.f24541b == 3) {
                    com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    c2135dH0 = com.android.billingclient.api.z.f24660m;
                    j0(38, 6, c2135dH0);
                } else {
                    M(1);
                    O();
                    com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Starting in-app billing setup.");
                    this.f24548i = new com.android.billingclient.api.ServiceConnectionC2145n(this, cVar, null);
                    android.content.Intent intent = new android.content.Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = this.f24545f.getPackageManager().queryIntentServices(intent, 0);
                    int i6 = 41;
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        M(0);
                        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Billing service unavailable on device.");
                        c2135dH0 = com.android.billingclient.api.z.f24650c;
                        j0(i6, 6, c2135dH0);
                    } else {
                        android.content.pm.ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i6 = 40;
                        if (serviceInfo != null) {
                            java.lang.String str = serviceInfo.packageName;
                            java.lang.String str2 = serviceInfo.name;
                            if (!j$.util.Objects.equals(str, "com.android.vending") || str2 == null) {
                                com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                android.content.ComponentName componentName = new android.content.ComponentName(str, str2);
                                android.content.Intent intent2 = new android.content.Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f24542c);
                                synchronized (this.f24540a) {
                                    try {
                                        if (this.f24541b == 2) {
                                            c2135dH0 = h0();
                                        } else if (this.f24541b != 1) {
                                            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            c2135dH0 = com.android.billingclient.api.z.f24660m;
                                            j0(117, 6, c2135dH0);
                                        } else {
                                            com.android.billingclient.api.ServiceConnectionC2145n serviceConnectionC2145n = this.f24548i;
                                            if (this.f24545f.bindService(intent2, serviceConnectionC2145n, 1)) {
                                                com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Service was bonded successfully.");
                                                c2135dH0 = null;
                                            } else {
                                                com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Connection to Billing service is blocked.");
                                                i6 = 39;
                                            }
                                        }
                                    } catch (java.lang.Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            M(0);
                            com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Billing service unavailable on device.");
                            c2135dH0 = com.android.billingclient.api.z.f24650c;
                            j0(i6, 6, c2135dH0);
                        } else {
                            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "The device doesn't have valid Play Store.");
                            M(0);
                            com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Billing service unavailable on device.");
                            c2135dH0 = com.android.billingclient.api.z.f24650c;
                            j0(i6, 6, c2135dH0);
                        }
                    }
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        if (c2135dH0 != null) {
            cVar.b(c2135dH0);
        }
    }

    public final boolean i() {
        boolean z6;
        synchronized (this.f24540a) {
            try {
                z6 = false;
                if (this.f24541b == 2 && this.f24547h != null && this.f24548i != null) {
                    z6 = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    final /* synthetic */ android.os.Bundle n0(int i6, java.lang.String str, java.lang.String str2, com.android.billingclient.api.C2134c c2134c, android.os.Bundle bundle) {
        com.android.billingclient.api.C2135d c2135d;
        com.google.android.gms.internal.play_billing.InterfaceC6199d interfaceC6199d;
        try {
            synchronized (this.f24540a) {
                interfaceC6199d = this.f24547h;
            }
            return interfaceC6199d == null ? com.google.android.gms.internal.play_billing.AbstractC6195c1.l(com.android.billingclient.api.z.f24660m, 119) : interfaceC6199d.o4(i6, this.f24545f.getPackageName(), str, str2, null, bundle);
        } catch (android.os.DeadObjectException e6) {
            e = e6;
            c2135d = com.android.billingclient.api.z.f24660m;
            return com.google.android.gms.internal.play_billing.AbstractC6195c1.m(c2135d, 5, com.android.billingclient.api.x.a(e));
        } catch (java.lang.Exception e10) {
            e = e10;
            c2135d = com.android.billingclient.api.z.f24658k;
            return com.google.android.gms.internal.play_billing.AbstractC6195c1.m(c2135d, 5, com.android.billingclient.api.x.a(e));
        }
    }

    final /* synthetic */ android.os.Bundle o0(java.lang.String str, java.lang.String str2) {
        com.android.billingclient.api.C2135d c2135d;
        com.google.android.gms.internal.play_billing.InterfaceC6199d interfaceC6199d;
        try {
            synchronized (this.f24540a) {
                interfaceC6199d = this.f24547h;
            }
            return interfaceC6199d == null ? com.google.android.gms.internal.play_billing.AbstractC6195c1.l(com.android.billingclient.api.z.f24660m, 119) : interfaceC6199d.Q2(3, this.f24545f.getPackageName(), str, str2, null);
        } catch (android.os.DeadObjectException e6) {
            e = e6;
            c2135d = com.android.billingclient.api.z.f24660m;
            return com.google.android.gms.internal.play_billing.AbstractC6195c1.m(c2135d, 5, com.android.billingclient.api.x.a(e));
        } catch (java.lang.Exception e10) {
            e = e10;
            c2135d = com.android.billingclient.api.z.f24658k;
            return com.google.android.gms.internal.play_billing.AbstractC6195c1.m(c2135d, 5, com.android.billingclient.api.x.a(e));
        }
    }

    final com.android.billingclient.api.y s0() {
        return this.f24546g;
    }

    final com.android.billingclient.api.C2135d u0(final com.android.billingclient.api.C2135d c2135d) {
        if (java.lang.Thread.interrupted()) {
            return c2135d;
        }
        this.f24543d.post(new java.lang.Runnable() { // from class: com.android.billingclient.api.J
            @Override // java.lang.Runnable
            public final void run() {
                this.f24501C.X(c2135d);
            }
        });
        return c2135d;
    }

    final com.android.billingclient.api.G v0(java.lang.String str, java.util.List list, java.lang.String str2) {
        com.google.android.gms.internal.play_billing.InterfaceC6199d interfaceC6199d;
        android.os.Bundle bundleT4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            int i10 = i6 + 20;
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>(list.subList(i6, i10 > size ? size : i10));
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.f24542c);
            try {
                synchronized (this.f24540a) {
                    interfaceC6199d = this.f24547h;
                }
                if (interfaceC6199d == null) {
                    return T(com.android.billingclient.api.z.f24660m, 119, "Service has been reset to null.", null);
                }
                if (this.f24555p) {
                    java.lang.String packageName = this.f24545f.getPackageName();
                    int i11 = this.f24551l;
                    boolean zA = this.f24535B.a();
                    boolean zP = P();
                    java.lang.String str3 = this.f24542c;
                    long jLongValue = this.f24539F.longValue();
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    if (i11 >= 9) {
                        com.google.android.gms.internal.play_billing.AbstractC6195c1.c(bundle2, str3, jLongValue);
                    }
                    if (i11 >= 9 && zA) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    if (zP) {
                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    bundleT4 = interfaceC6199d.e1(10, packageName, str, bundle, bundle2);
                } else {
                    bundleT4 = interfaceC6199d.t4(3, this.f24545f.getPackageName(), str, bundle);
                }
                if (bundleT4 == null) {
                    return T(com.android.billingclient.api.z.f24643C, 44, "querySkuDetailsAsync got null sku details list", null);
                }
                if (!bundleT4.containsKey("DETAILS_LIST")) {
                    int iB = com.google.android.gms.internal.play_billing.AbstractC6195c1.b(bundleT4, "BillingClient");
                    java.lang.String strF = com.google.android.gms.internal.play_billing.AbstractC6195c1.f(bundleT4, "BillingClient");
                    if (iB == 0) {
                        return T(com.android.billingclient.api.z.a(6, strF), 45, "getSkuDetails() returned a bundle with neither an error nor a detail list.", null);
                    }
                    return T(com.android.billingclient.api.z.a(iB, strF), 23, "getSkuDetails() failed. Response code: " + iB, null);
                }
                java.util.ArrayList<java.lang.String> stringArrayList = bundleT4.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return T(com.android.billingclient.api.z.f24643C, 46, "querySkuDetailsAsync got null response list", null);
                }
                for (int i12 = 0; i12 < stringArrayList.size(); i12++) {
                    try {
                        com.android.billingclient.api.SkuDetails skuDetails = new com.android.billingclient.api.SkuDetails(stringArrayList.get(i12));
                        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                        arrayList.add(skuDetails);
                    } catch (org.json.JSONException e6) {
                        return T(com.android.billingclient.api.z.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode SkuDetails.", e6);
                    }
                }
                i6 = i10;
            } catch (android.os.DeadObjectException e10) {
                return T(com.android.billingclient.api.z.f24660m, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e10);
            } catch (java.lang.Exception e11) {
                return T(com.android.billingclient.api.z.f24658k, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e11);
            }
        }
        return new com.android.billingclient.api.G(0, "", arrayList);
    }

    final synchronized com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC6326y1 x0() {
        try {
            if (this.f24538E == null) {
                this.f24538E = com.google.android.gms.internal.play_billing.F1.a(I());
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f24538E;
    }
}
