package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
final class w extends com.android.billingclient.api.C2133b {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final android.content.Context f24635G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private volatile int f24636H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private volatile com.google.android.gms.internal.play_billing.InterfaceC6235j f24637I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private volatile com.android.billingclient.api.v f24638J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private volatile com.google.android.gms.internal.play_billing.InterfaceScheduledExecutorServiceC6331z1 f24639K;

    w(java.lang.String str, android.content.Context context, com.android.billingclient.api.y yVar, java.util.concurrent.ExecutorService executorService) {
        super(null, context, null, null);
        this.f24636H = 0;
        this.f24635G = context;
    }

    w(java.lang.String str, com.android.billingclient.api.C2136e c2136e, android.content.Context context, T2.e eVar, T2.k kVar, com.android.billingclient.api.y yVar, java.util.concurrent.ExecutorService executorService) {
        super(null, c2136e, context, eVar, null, null, null);
        this.f24636H = 0;
        this.f24635G = context;
    }

    w(java.lang.String str, com.android.billingclient.api.C2136e c2136e, android.content.Context context, T2.u uVar, com.android.billingclient.api.y yVar, java.util.concurrent.ExecutorService executorService) {
        super(null, c2136e, context, null, null, null);
        this.f24636H = 0;
        this.f24635G = context;
    }

    private final int L0(com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1) {
        java.lang.String str;
        try {
            return ((java.lang.Integer) interfaceFutureC6320x1.get(28500L, java.util.concurrent.TimeUnit.MILLISECONDS)).intValue();
        } catch (java.util.concurrent.TimeoutException e6) {
            e = e6;
            S0(114, 28, com.android.billingclient.api.z.f24647G);
            str = "Asynchronous call to Billing Override Service timed out.";
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClientTesting", str, e);
            return 0;
        } catch (java.lang.Exception e10) {
            e = e10;
            if (e instanceof java.lang.InterruptedException) {
                java.lang.Thread.currentThread().interrupt();
            }
            S0(107, 28, com.android.billingclient.api.z.f24647G);
            str = "An error occurred while retrieving billing override.";
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClientTesting", str, e);
            return 0;
        }
    }

    private final synchronized com.google.android.gms.internal.play_billing.InterfaceScheduledExecutorServiceC6331z1 M0() {
        try {
            if (this.f24639K == null) {
                this.f24639K = com.google.android.gms.internal.play_billing.F1.b(java.util.concurrent.Executors.newSingleThreadScheduledExecutor());
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f24639K;
    }

    private final synchronized void N0() {
        T0(27);
        try {
            try {
                T2.o oVar = null;
                if (this.f24638J != null && this.f24637I != null) {
                    com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.f24635G.unbindService(this.f24638J);
                    this.f24638J = new com.android.billingclient.api.v(this, oVar);
                }
                this.f24637I = null;
                if (this.f24639K != null) {
                    this.f24639K.shutdownNow();
                    this.f24639K = null;
                }
            } catch (java.lang.RuntimeException e6) {
                com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e6);
            }
            this.f24636H = 3;
        } catch (java.lang.Throwable th) {
            this.f24636H = 3;
            throw th;
        }
    }

    private final synchronized void O0() {
        java.lang.String str;
        java.lang.String str2;
        if (G0()) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            T0(26);
            return;
        }
        int i6 = 1;
        if (this.f24636H == 1) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f24636H == 3) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            S0(38, 26, com.android.billingclient.api.z.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f24636H = 1;
        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClientTesting", "Starting Billing Override Service setup.");
        this.f24638J = new com.android.billingclient.api.v(this, null);
        android.content.Intent intent = new android.content.Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = this.f24635G.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i6 = 41;
        } else {
            android.content.pm.ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                java.lang.String str3 = serviceInfo.packageName;
                java.lang.String str4 = serviceInfo.name;
                if (!j$.util.Objects.equals(str3, "com.google.android.apps.play.billingtestcompanion") || str4 == null) {
                    str = "BillingClientTesting";
                    str2 = "The device doesn't have valid Play Billing Lab.";
                } else {
                    android.content.ComponentName componentName = new android.content.ComponentName(str3, str4);
                    android.content.Intent intent2 = new android.content.Intent(intent);
                    intent2.setComponent(componentName);
                    if (this.f24635G.bindService(intent2, this.f24638J, 1)) {
                        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        str = "BillingClientTesting";
                        str2 = "Connection to Billing Override Service is blocked.";
                    }
                }
                com.google.android.gms.internal.play_billing.AbstractC6195c1.j(str, str2);
                i6 = 39;
            }
        }
        this.f24636H = 0;
        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClientTesting", "Billing Override Service unavailable on device.");
        S0(i6, 26, com.android.billingclient.api.z.a(2, "Billing Override Service unavailable on device."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean P0(int i6) {
        return i6 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.android.billingclient.api.C2135d Q0(int i6, int i10) {
        com.android.billingclient.api.C2135d c2135dA = com.android.billingclient.api.z.a(i10, "Billing override value was set by a license tester.");
        S0(105, i6, c2135dA);
        return c2135dA;
    }

    private final com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 R0(int i6) {
        if (G0()) {
            return com.google.android.gms.internal.play_billing.W4.a(new com.android.billingclient.api.p(this, i6));
        }
        com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClientTesting", "Billing Override Service is not ready.");
        S0(106, 28, com.android.billingclient.api.z.a(-1, "Billing Override Service connection is disconnected."));
        return com.google.android.gms.internal.play_billing.AbstractC6267o1.a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(int i6, int i10, com.android.billingclient.api.C2135d c2135d) {
        com.google.android.gms.internal.play_billing.N3 n3B = com.android.billingclient.api.x.b(i6, i10, c2135d);
        j$.util.Objects.requireNonNull(n3B, "ApiFailure should not be null");
        s0().d(n3B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0(int i6) {
        com.google.android.gms.internal.play_billing.S3 s3D = com.android.billingclient.api.x.d(i6);
        j$.util.Objects.requireNonNull(s3D, "ApiSuccess should not be null");
        s0().g(s3D);
    }

    private final void U0(int i6, java.util.function.Consumer consumer, java.lang.Runnable runnable) {
        com.google.android.gms.internal.play_billing.AbstractC6267o1.c(com.google.android.gms.internal.play_billing.AbstractC6267o1.b(R0(i6), 28500L, java.util.concurrent.TimeUnit.MILLISECONDS, M0()), new com.android.billingclient.api.t(this, i6, consumer, runnable), x0());
    }

    final /* synthetic */ void C0(T2.C1651a c1651a, T2.InterfaceC1652b interfaceC1652b) {
        super.a(c1651a, interfaceC1652b);
    }

    final /* synthetic */ void D0(com.android.billingclient.api.C2135d c2135d) {
        super.u0(c2135d);
    }

    final /* synthetic */ void E0(com.android.billingclient.api.C2137f c2137f, T2.g gVar) {
        super.f(c2137f, gVar);
    }

    public final synchronized boolean G0() {
        return (this.f24636H != 2 || this.f24637I == null || this.f24638J == null) ? false : true;
    }

    final /* synthetic */ java.lang.Object I0(int i6, com.google.android.gms.internal.play_billing.S4 s6) {
        java.lang.String str;
        try {
            if (this.f24637I == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.InterfaceC6235j interfaceC6235j = this.f24637I;
            java.lang.String packageName = this.f24635G.getPackageName();
            switch (i6) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            interfaceC6235j.N1(packageName, str, new com.android.billingclient.api.u(s6));
            return "billingOverrideService.getBillingOverride";
        } catch (java.lang.Exception e6) {
            S0(107, 28, com.android.billingclient.api.z.f24647G);
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClientTesting", "An error occurred while retrieving billing override.", e6);
            s6.b(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    final /* synthetic */ com.android.billingclient.api.C2135d V0(android.app.Activity activity, com.android.billingclient.api.C2134c c2134c) {
        return super.c(activity, c2134c);
    }

    @Override // com.android.billingclient.api.C2133b, com.android.billingclient.api.AbstractC2132a
    public final void a(final T2.C1651a c1651a, final T2.InterfaceC1652b interfaceC1652b) {
        j$.util.Objects.requireNonNull(interfaceC1652b);
        U0(3, new java.util.function.Consumer() { // from class: T2.n
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                interfaceC1652b.a((com.android.billingclient.api.C2135d) obj);
            }

            public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
            }
        }, new java.lang.Runnable() { // from class: com.android.billingclient.api.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f24625C.C0(c1651a, interfaceC1652b);
            }
        });
    }

    @Override // com.android.billingclient.api.C2133b, com.android.billingclient.api.AbstractC2132a
    public final void b() {
        N0();
        super.b();
    }

    @Override // com.android.billingclient.api.C2133b, com.android.billingclient.api.AbstractC2132a
    public final com.android.billingclient.api.C2135d c(final android.app.Activity activity, final com.android.billingclient.api.C2134c c2134c) {
        java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: com.android.billingclient.api.s
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                this.f24628a.D0((com.android.billingclient.api.C2135d) obj);
            }

            public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer2) {
                return j$.util.function.Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.o
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f24617a.V0(activity, c2134c);
            }
        };
        int iL0 = L0(R0(2));
        if (P0(iL0)) {
            com.android.billingclient.api.C2135d c2135dQ0 = Q0(2, iL0);
            consumer.accept(c2135dQ0);
            return c2135dQ0;
        }
        try {
            return (com.android.billingclient.api.C2135d) callable.call();
        } catch (java.lang.Exception e6) {
            com.android.billingclient.api.C2135d c2135d = com.android.billingclient.api.z.f24658k;
            S0(115, 2, c2135d);
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClientTesting", "An internal error occurred.", e6);
            return c2135d;
        }
    }

    @Override // com.android.billingclient.api.C2133b, com.android.billingclient.api.AbstractC2132a
    public final void f(final com.android.billingclient.api.C2137f c2137f, final T2.g gVar) {
        U0(8, new java.util.function.Consumer() { // from class: T2.m
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                gVar.a((com.android.billingclient.api.C2135d) obj, null);
            }

            public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
            }
        }, new java.lang.Runnable() { // from class: com.android.billingclient.api.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f24622C.E0(c2137f, gVar);
            }
        });
    }

    @Override // com.android.billingclient.api.C2133b, com.android.billingclient.api.AbstractC2132a
    public final void g(T2.c cVar) {
        O0();
        super.g(cVar);
    }
}
