package p040e;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends androidx.core.app.f implements androidx.lifecycle.r, androidx.lifecycle.Y, androidx.lifecycle.InterfaceC2077i, p233x2.f, p040e.A, p070h.f, androidx.core.content.b, androidx.core.content.c, androidx.core.app.n, androidx.core.app.o, androidx.core.view.InterfaceC2033w, p040e.u {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final e.j.c f44373X = new e.j.c(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p060g.a f44374E = new p060g.a();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final androidx.core.view.C2035x f44375F = new androidx.core.view.C2035x(new java.lang.Runnable() { // from class: e.d
        @Override // java.lang.Runnable
        public final void run() {
            p040e.j.V(this.f44366C);
        }
    });

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p233x2.e f44376G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private androidx.lifecycle.X f44377H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final e.j.e f44378I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f44379J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f44380K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f44381L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final p070h.e f44382M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f44383N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f44384O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f44385P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f44386Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f44387R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f44388S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f44389T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f44390U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f44391V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f44392W;

    public static final class a implements androidx.lifecycle.InterfaceC2083o {
        a() {
        }

        @Override // androidx.lifecycle.InterfaceC2083o
        public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
            p247y7.AbstractC7350t.f(rVar, "source");
            p247y7.AbstractC7350t.f(aVar, "event");
            p040e.j.this.R();
            p040e.j.this.u().d(this);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e.j.b f44394a = new e.j.b();

        private b() {
        }

        public final android.window.OnBackInvokedDispatcher a(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            p247y7.AbstractC7350t.e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    private static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Object f44395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.lifecycle.X f44396b;

        public final androidx.lifecycle.X a() {
            return this.f44396b;
        }

        public final void b(java.lang.Object obj) {
            this.f44395a = obj;
        }

        public final void c(androidx.lifecycle.X x6) {
            this.f44396b = x6;
        }
    }

    private interface e extends java.util.concurrent.Executor {
        void s();

        void s0(android.view.View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class f implements e.j.e, android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final long f44397C = android.os.SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private java.lang.Runnable f44398D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private boolean f44399E;

        public f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(e.j.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "this$0");
            java.lang.Runnable runnable = fVar.f44398D;
            if (runnable != null) {
                p247y7.AbstractC7350t.c(runnable);
                runnable.run();
                fVar.f44398D = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            p247y7.AbstractC7350t.f(runnable, "runnable");
            this.f44398D = runnable;
            android.view.View decorView = p040e.j.this.getWindow().getDecorView();
            p247y7.AbstractC7350t.e(decorView, "window.decorView");
            if (!this.f44399E) {
                decorView.postOnAnimation(new java.lang.Runnable() { // from class: e.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.j.f.c(this.f44406C);
                    }
                });
            } else if (p247y7.AbstractC7350t.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            java.lang.Runnable runnable = this.f44398D;
            if (runnable != null) {
                runnable.run();
                this.f44398D = null;
                if (!p040e.j.this.S().c()) {
                    return;
                }
            } else if (android.os.SystemClock.uptimeMillis() <= this.f44397C) {
                return;
            }
            this.f44399E = false;
            p040e.j.this.getWindow().getDecorView().post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            p040e.j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // e.j.e
        public void s() {
            p040e.j.this.getWindow().getDecorView().removeCallbacks(this);
            p040e.j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // e.j.e
        public void s0(android.view.View view) {
            p247y7.AbstractC7350t.f(view, "view");
            if (this.f44399E) {
                return;
            }
            this.f44399E = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public static final class g extends p070h.e {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(e.j.g gVar, int i6, p080i.a.C0566a c0566a) {
            p247y7.AbstractC7350t.f(gVar, "this$0");
            gVar.f(i6, c0566a.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(e.j.g gVar, int i6, android.content.IntentSender.SendIntentException sendIntentException) {
            p247y7.AbstractC7350t.f(gVar, "this$0");
            p247y7.AbstractC7350t.f(sendIntentException, "$e");
            gVar.e(i6, 0, new android.content.Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // p070h.e
        public void i(final int i6, p080i.a aVar, java.lang.Object obj, androidx.core.app.c cVar) {
            android.os.Bundle bundle;
            p247y7.AbstractC7350t.f(aVar, "contract");
            p040e.j jVar = p040e.j.this;
            final p080i.a.C0566a c0566aB = aVar.b(jVar, obj);
            if (c0566aB != null) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: e.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.j.g.s(this.f44407C, i6, c0566aB);
                    }
                });
                return;
            }
            android.content.Intent intentA = aVar.a(jVar, obj);
            if (intentA.getExtras() != null) {
                android.os.Bundle extras = intentA.getExtras();
                p247y7.AbstractC7350t.c(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(jVar.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                android.os.Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if (p247y7.AbstractC7350t.b("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
                java.lang.String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new java.lang.String[0];
                }
                androidx.core.app.b.o(jVar, stringArrayExtra, i6);
                return;
            }
            if (!p247y7.AbstractC7350t.b("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                androidx.core.app.b.p(jVar, intentA, i6, bundle);
                return;
            }
            p070h.g gVar = (p070h.g) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                p247y7.AbstractC7350t.c(gVar);
                androidx.core.app.b.q(jVar, gVar.d(), i6, gVar.a(), gVar.b(), gVar.c(), 0, bundle);
            } catch (android.content.IntentSender.SendIntentException e6) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: e.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.j.g.t(this.f44410C, i6, e6);
                    }
                });
            }
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.a {
        h() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.O b() {
            android.app.Application application = p040e.j.this.getApplication();
            p040e.j jVar = p040e.j.this;
            return new androidx.lifecycle.O(application, jVar, jVar.getIntent() != null ? p040e.j.this.getIntent().getExtras() : null);
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.a {

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p040e.j f44404D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p040e.j jVar) {
                super(0);
                this.f44404D = jVar;
            }

            public final void a() {
                this.f44404D.reportFullyDrawn();
            }

            @Override // p237x7.a
            public /* bridge */ /* synthetic */ java.lang.Object b() {
                a();
                return p087i7.M.f46721a;
            }
        }

        i() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p040e.t b() {
            return new p040e.t(p040e.j.this.f44378I, new e.j.i.a(p040e.j.this));
        }
    }

    /* JADX INFO: renamed from: e.j$j, reason: collision with other inner class name */
    static final class C0491j extends p247y7.AbstractC7352v implements p237x7.a {
        C0491j() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(p040e.j jVar) {
            p247y7.AbstractC7350t.f(jVar, "this$0");
            try {
                p040e.j.super.onBackPressed();
            } catch (java.lang.IllegalStateException e6) {
                if (!p247y7.AbstractC7350t.b(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e6;
                }
            } catch (java.lang.NullPointerException e10) {
                if (!p247y7.AbstractC7350t.b(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e10;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(p040e.j jVar, p040e.x xVar) {
            p247y7.AbstractC7350t.f(jVar, "this$0");
            p247y7.AbstractC7350t.f(xVar, "$dispatcher");
            jVar.M(xVar);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final p040e.x b() {
            final p040e.j jVar = p040e.j.this;
            final p040e.x xVar = new p040e.x(new java.lang.Runnable() { // from class: e.n
                @Override // java.lang.Runnable
                public final void run() {
                    p040e.j.C0491j.g(jVar);
                }
            });
            final p040e.j jVar2 = p040e.j.this;
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                if (p247y7.AbstractC7350t.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    jVar2.M(xVar);
                } else {
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: e.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            p040e.j.C0491j.k(jVar2, xVar);
                        }
                    });
                }
            }
            return xVar;
        }
    }

    public j() {
        p233x2.e eVarA = p233x2.e.f56909d.a(this);
        this.f44376G = eVarA;
        this.f44378I = Q();
        this.f44379J = p087i7.AbstractC6669o.b(new e.j.i());
        this.f44381L = new java.util.concurrent.atomic.AtomicInteger();
        this.f44382M = new e.j.g();
        this.f44383N = new java.util.concurrent.CopyOnWriteArrayList();
        this.f44384O = new java.util.concurrent.CopyOnWriteArrayList();
        this.f44385P = new java.util.concurrent.CopyOnWriteArrayList();
        this.f44386Q = new java.util.concurrent.CopyOnWriteArrayList();
        this.f44387R = new java.util.concurrent.CopyOnWriteArrayList();
        this.f44388S = new java.util.concurrent.CopyOnWriteArrayList();
        if (u() == null) {
            throw new java.lang.IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
        }
        u().a(new androidx.lifecycle.InterfaceC2083o() { // from class: e.e
            @Override // androidx.lifecycle.InterfaceC2083o
            public final void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
                p040e.j.E(this.f44367C, rVar, aVar);
            }
        });
        u().a(new androidx.lifecycle.InterfaceC2083o() { // from class: e.f
            @Override // androidx.lifecycle.InterfaceC2083o
            public final void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
                p040e.j.F(this.f44368C, rVar, aVar);
            }
        });
        u().a(new e.j.a());
        eVarA.c();
        androidx.lifecycle.L.c(this);
        if (android.os.Build.VERSION.SDK_INT <= 23) {
            u().a(new p040e.v(this));
        }
        p().h("android:support:activity-result", new x2.d.c() { // from class: e.g
            @Override // x2.d.c
            public final android.os.Bundle a() {
                return p040e.j.G(this.f44369a);
            }
        });
        O(new p060g.b() { // from class: e.h
            @Override // p060g.b
            public final void a(android.content.Context context) {
                p040e.j.H(this.f44370a, context);
            }
        });
        this.f44391V = p087i7.AbstractC6669o.b(new e.j.h());
        this.f44392W = p087i7.AbstractC6669o.b(new p040e.j.C0491j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(p040e.j jVar, androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        android.view.Window window;
        android.view.View viewPeekDecorView;
        p247y7.AbstractC7350t.f(jVar, "this$0");
        p247y7.AbstractC7350t.f(rVar, "<anonymous parameter 0>");
        p247y7.AbstractC7350t.f(aVar, "event");
        if (aVar != androidx.lifecycle.AbstractC2079k.a.ON_STOP || (window = jVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(p040e.j jVar, androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        p247y7.AbstractC7350t.f(jVar, "this$0");
        p247y7.AbstractC7350t.f(rVar, "<anonymous parameter 0>");
        p247y7.AbstractC7350t.f(aVar, "event");
        if (aVar == androidx.lifecycle.AbstractC2079k.a.ON_DESTROY) {
            jVar.f44374E.b();
            if (!jVar.isChangingConfigurations()) {
                jVar.n().a();
            }
            jVar.f44378I.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.os.Bundle G(p040e.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "this$0");
        android.os.Bundle bundle = new android.os.Bundle();
        jVar.f44382M.k(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(p040e.j jVar, android.content.Context context) {
        p247y7.AbstractC7350t.f(jVar, "this$0");
        p247y7.AbstractC7350t.f(context, "it");
        android.os.Bundle bundleB = jVar.p().b("android:support:activity-result");
        if (bundleB != null) {
            jVar.f44382M.j(bundleB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(final p040e.x xVar) {
        u().a(new androidx.lifecycle.InterfaceC2083o() { // from class: e.i
            @Override // androidx.lifecycle.InterfaceC2083o
            public final void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
                p040e.j.N(xVar, this, rVar, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(p040e.x xVar, p040e.j jVar, androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        p247y7.AbstractC7350t.f(xVar, "$dispatcher");
        p247y7.AbstractC7350t.f(jVar, "this$0");
        p247y7.AbstractC7350t.f(rVar, "<anonymous parameter 0>");
        p247y7.AbstractC7350t.f(aVar, "event");
        if (aVar == androidx.lifecycle.AbstractC2079k.a.ON_CREATE) {
            xVar.o(e.j.b.f44394a.a(jVar));
        }
    }

    private final e.j.e Q() {
        return new e.j.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        if (this.f44377H == null) {
            e.j.d dVar = (e.j.d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.f44377H = dVar.a();
            }
            if (this.f44377H == null) {
                this.f44377H = new androidx.lifecycle.X();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(p040e.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "this$0");
        jVar.U();
    }

    public final void O(p060g.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "listener");
        this.f44374E.a(bVar);
    }

    public final void P(B1.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "listener");
        this.f44385P.add(aVar);
    }

    public p040e.t S() {
        return (p040e.t) this.f44379J.getValue();
    }

    public void T() {
        android.view.View decorView = getWindow().getDecorView();
        p247y7.AbstractC7350t.e(decorView, "window.decorView");
        androidx.lifecycle.Z.b(decorView, this);
        android.view.View decorView2 = getWindow().getDecorView();
        p247y7.AbstractC7350t.e(decorView2, "window.decorView");
        androidx.lifecycle.a0.b(decorView2, this);
        android.view.View decorView3 = getWindow().getDecorView();
        p247y7.AbstractC7350t.e(decorView3, "window.decorView");
        p233x2.g.b(decorView3, this);
        android.view.View decorView4 = getWindow().getDecorView();
        p247y7.AbstractC7350t.e(decorView4, "window.decorView");
        p040e.D.b(decorView4, this);
        android.view.View decorView5 = getWindow().getDecorView();
        p247y7.AbstractC7350t.e(decorView5, "window.decorView");
        p040e.C.a(decorView5, this);
    }

    public void U() {
        invalidateOptionsMenu();
    }

    public java.lang.Object W() {
        return null;
    }

    public final p070h.c X(p080i.a aVar, p070h.b bVar) {
        p247y7.AbstractC7350t.f(aVar, "contract");
        p247y7.AbstractC7350t.f(bVar, "callback");
        return Y(aVar, this.f44382M, bVar);
    }

    public final p070h.c Y(p080i.a aVar, p070h.e eVar, p070h.b bVar) {
        p247y7.AbstractC7350t.f(aVar, "contract");
        p247y7.AbstractC7350t.f(eVar, "registry");
        p247y7.AbstractC7350t.f(bVar, "callback");
        return eVar.l("activity_rq#" + this.f44381L.getAndIncrement(), this, aVar, bVar);
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        T();
        e.j.e eVar = this.f44378I;
        android.view.View decorView = getWindow().getDecorView();
        p247y7.AbstractC7350t.e(decorView, "window.decorView");
        eVar.s0(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // p040e.A
    public final p040e.x b() {
        return (p040e.x) this.f44392W.getValue();
    }

    @Override // androidx.core.app.n
    public final void c(B1.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "listener");
        this.f44386Q.remove(aVar);
    }

    @Override // androidx.core.view.InterfaceC2033w
    public void d(androidx.core.view.InterfaceC2039z interfaceC2039z) {
        p247y7.AbstractC7350t.f(interfaceC2039z, "provider");
        this.f44375F.f(interfaceC2039z);
    }

    @Override // androidx.core.content.c
    public final void e(B1.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "listener");
        this.f44384O.add(aVar);
    }

    @Override // androidx.core.app.o
    public final void f(B1.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "listener");
        this.f44387R.add(aVar);
    }

    @Override // androidx.core.content.b
    public final void i(B1.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "listener");
        this.f44383N.add(aVar);
    }

    @Override // androidx.lifecycle.InterfaceC2077i
    public androidx.lifecycle.V.c j() {
        return (androidx.lifecycle.V.c) this.f44391V.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC2077i
    public p023c2.a k() {
        p023c2.d dVar = new p023c2.d(null, 1, null);
        if (getApplication() != null) {
            c2.a.b bVar = androidx.lifecycle.V.a.f22795g;
            android.app.Application application = getApplication();
            p247y7.AbstractC7350t.e(application, "application");
            dVar.c(bVar, application);
        }
        dVar.c(androidx.lifecycle.L.f22766a, this);
        dVar.c(androidx.lifecycle.L.f22767b, this);
        android.content.Intent intent = getIntent();
        android.os.Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            dVar.c(androidx.lifecycle.L.f22768c, extras);
        }
        return dVar;
    }

    @Override // androidx.core.app.o
    public final void l(B1.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "listener");
        this.f44387R.remove(aVar);
    }

    @Override // p070h.f
    public final p070h.e m() {
        return this.f44382M;
    }

    @Override // androidx.lifecycle.Y
    public androidx.lifecycle.X n() {
        if (getApplication() == null) {
            throw new java.lang.IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
        }
        R();
        androidx.lifecycle.X x6 = this.f44377H;
        p247y7.AbstractC7350t.c(x6);
        return x6;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i6, int i10, android.content.Intent intent) {
        if (this.f44382M.e(i6, i10, intent)) {
            return;
        }
        super.onActivityResult(i6, i10, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        b().l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        p247y7.AbstractC7350t.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        java.util.Iterator it = this.f44383N.iterator();
        while (it.hasNext()) {
            ((B1.a) it.next()).accept(configuration);
        }
    }

    @Override // androidx.core.app.f, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        this.f44376G.d(bundle);
        this.f44374E.c(this);
        super.onCreate(bundle);
        androidx.lifecycle.F.f22752D.c(this);
        int i6 = this.f44380K;
        if (i6 != 0) {
            setContentView(i6);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i6, android.view.Menu menu) {
        p247y7.AbstractC7350t.f(menu, "menu");
        if (i6 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i6, menu);
        this.f44375F.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, android.view.MenuItem menuItem) {
        p247y7.AbstractC7350t.f(menuItem, "item");
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 == 0) {
            return this.f44375F.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6) {
        if (this.f44389T) {
            return;
        }
        java.util.Iterator it = this.f44386Q.iterator();
        while (it.hasNext()) {
            ((B1.a) it.next()).accept(new androidx.core.app.g(z6));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6, android.content.res.Configuration configuration) {
        p247y7.AbstractC7350t.f(configuration, "newConfig");
        this.f44389T = true;
        try {
            super.onMultiWindowModeChanged(z6, configuration);
            this.f44389T = false;
            java.util.Iterator it = this.f44386Q.iterator();
            while (it.hasNext()) {
                ((B1.a) it.next()).accept(new androidx.core.app.g(z6, configuration));
            }
        } catch (java.lang.Throwable th) {
            this.f44389T = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        p247y7.AbstractC7350t.f(intent, "intent");
        super.onNewIntent(intent);
        java.util.Iterator it = this.f44385P.iterator();
        while (it.hasNext()) {
            ((B1.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i6, android.view.Menu menu) {
        p247y7.AbstractC7350t.f(menu, "menu");
        this.f44375F.c(menu);
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6) {
        if (this.f44390U) {
            return;
        }
        java.util.Iterator it = this.f44387R.iterator();
        while (it.hasNext()) {
            ((B1.a) it.next()).accept(new androidx.core.app.p(z6));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6, android.content.res.Configuration configuration) {
        p247y7.AbstractC7350t.f(configuration, "newConfig");
        this.f44390U = true;
        try {
            super.onPictureInPictureModeChanged(z6, configuration);
            this.f44390U = false;
            java.util.Iterator it = this.f44387R.iterator();
            while (it.hasNext()) {
                ((B1.a) it.next()).accept(new androidx.core.app.p(z6, configuration));
            }
        } catch (java.lang.Throwable th) {
            this.f44390U = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i6, android.view.View view, android.view.Menu menu) {
        p247y7.AbstractC7350t.f(menu, "menu");
        if (i6 != 0) {
            return true;
        }
        super.onPreparePanel(i6, view, menu);
        this.f44375F.e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i6, java.lang.String[] strArr, int[] iArr) {
        p247y7.AbstractC7350t.f(strArr, "permissions");
        p247y7.AbstractC7350t.f(iArr, "grantResults");
        if (this.f44382M.e(i6, -1, new android.content.Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
        e.j.d dVar;
        java.lang.Object objW = W();
        androidx.lifecycle.X xA = this.f44377H;
        if (xA == null && (dVar = (e.j.d) getLastNonConfigurationInstance()) != null) {
            xA = dVar.a();
        }
        if (xA == null && objW == null) {
            return null;
        }
        e.j.d dVar2 = new e.j.d();
        dVar2.b(objW);
        dVar2.c(xA);
        return dVar2;
    }

    @Override // androidx.core.app.f, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        p247y7.AbstractC7350t.f(bundle, "outState");
        if (u() instanceof androidx.lifecycle.C2087t) {
            androidx.lifecycle.AbstractC2079k abstractC2079kU = u();
            p247y7.AbstractC7350t.d(abstractC2079kU, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.C2087t) abstractC2079kU).n(androidx.lifecycle.AbstractC2079k.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f44376G.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i6) {
        super.onTrimMemory(i6);
        java.util.Iterator it = this.f44384O.iterator();
        while (it.hasNext()) {
            ((B1.a) it.next()).accept(java.lang.Integer.valueOf(i6));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        java.util.Iterator it = this.f44388S.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    @Override // p233x2.f
    public final p233x2.d p() {
        return this.f44376G.b();
    }

    @Override // androidx.core.content.c
    public final void q(B1.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "listener");
        this.f44384O.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (E2.b.d()) {
                E2.b.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            S().b();
        } finally {
            E2.b.b();
        }
    }

    @Override // androidx.core.view.InterfaceC2033w
    public void s(androidx.core.view.InterfaceC2039z interfaceC2039z) {
        p247y7.AbstractC7350t.f(interfaceC2039z, "provider");
        this.f44375F.a(interfaceC2039z);
    }

    @Override // android.app.Activity
    public void setContentView(int i6) {
        T();
        e.j.e eVar = this.f44378I;
        android.view.View decorView = getWindow().getDecorView();
        p247y7.AbstractC7350t.e(decorView, "window.decorView");
        eVar.s0(decorView);
        super.setContentView(i6);
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view) {
        T();
        e.j.e eVar = this.f44378I;
        android.view.View decorView = getWindow().getDecorView();
        p247y7.AbstractC7350t.e(decorView, "window.decorView");
        eVar.s0(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        T();
        e.j.e eVar = this.f44378I;
        android.view.View decorView = getWindow().getDecorView();
        p247y7.AbstractC7350t.e(decorView, "window.decorView");
        eVar.s0(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i6) {
        p247y7.AbstractC7350t.f(intent, "intent");
        super.startActivityForResult(intent, i6);
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i6, android.os.Bundle bundle) {
        p247y7.AbstractC7350t.f(intent, "intent");
        super.startActivityForResult(intent, i6, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i6, android.content.Intent intent, int i10, int i11, int i12) throws android.content.IntentSender.SendIntentException {
        p247y7.AbstractC7350t.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i6, intent, i10, i11, i12);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i6, android.content.Intent intent, int i10, int i11, int i12, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        p247y7.AbstractC7350t.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i6, intent, i10, i11, i12, bundle);
    }

    @Override // androidx.core.content.b
    public final void t(B1.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "listener");
        this.f44383N.remove(aVar);
    }

    @Override // androidx.core.app.f, androidx.lifecycle.r
    public androidx.lifecycle.AbstractC2079k u() {
        return super.u();
    }

    @Override // androidx.core.app.n
    public final void v(B1.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "listener");
        this.f44386Q.add(aVar);
    }
}
