package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class D implements androidx.lifecycle.r {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final androidx.lifecycle.D.b f22738K = new androidx.lifecycle.D.b(null);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final androidx.lifecycle.D f22739L = new androidx.lifecycle.D();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f22740C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f22741D;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.os.Handler f22744G;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f22742E = true;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f22743F = true;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final androidx.lifecycle.C2087t f22745H = new androidx.lifecycle.C2087t(this);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.lang.Runnable f22746I = new java.lang.Runnable() { // from class: androidx.lifecycle.C
        @Override // java.lang.Runnable
        public final void run() {
            androidx.lifecycle.D.j(this.f22737C);
        }
    };

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final androidx.lifecycle.F.a f22747J = new androidx.lifecycle.D.d();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.lifecycle.D.a f22748a = new androidx.lifecycle.D.a();

        private a() {
        }

        public static final void a(android.app.Activity activity, android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            p247y7.AbstractC7350t.f(activity, "activity");
            p247y7.AbstractC7350t.f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.lifecycle.r a() {
            return androidx.lifecycle.D.f22739L;
        }

        public final void b(android.content.Context context) {
            p247y7.AbstractC7350t.f(context, "context");
            androidx.lifecycle.D.f22739L.i(context);
        }
    }

    public static final class c extends androidx.lifecycle.AbstractC2075g {

        public static final class a extends androidx.lifecycle.AbstractC2075g {
            final /* synthetic */ androidx.lifecycle.D this$0;

            a(androidx.lifecycle.D d6) {
                this.this$0 = d6;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(android.app.Activity activity) {
                p247y7.AbstractC7350t.f(activity, "activity");
                this.this$0.f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(android.app.Activity activity) {
                p247y7.AbstractC7350t.f(activity, "activity");
                this.this$0.g();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC2075g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            p247y7.AbstractC7350t.f(activity, "activity");
            if (android.os.Build.VERSION.SDK_INT < 29) {
                androidx.lifecycle.F.f22752D.b(activity).e(androidx.lifecycle.D.this.f22747J);
            }
        }

        @Override // androidx.lifecycle.AbstractC2075g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
            androidx.lifecycle.D.this.e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
            p247y7.AbstractC7350t.f(activity, "activity");
            androidx.lifecycle.D.a.a(activity, new androidx.lifecycle.D.c.a(androidx.lifecycle.D.this));
        }

        @Override // androidx.lifecycle.AbstractC2075g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
            androidx.lifecycle.D.this.h();
        }
    }

    public static final class d implements androidx.lifecycle.F.a {
        d() {
        }

        @Override // androidx.lifecycle.F.a
        public void a() {
            androidx.lifecycle.D.this.g();
        }

        @Override // androidx.lifecycle.F.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.F.a
        public void onResume() {
            androidx.lifecycle.D.this.f();
        }
    }

    private D() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(androidx.lifecycle.D d6) {
        p247y7.AbstractC7350t.f(d6, "this$0");
        d6.k();
        d6.l();
    }

    public final void e() {
        int i6 = this.f22741D - 1;
        this.f22741D = i6;
        if (i6 == 0) {
            android.os.Handler handler = this.f22744G;
            p247y7.AbstractC7350t.c(handler);
            handler.postDelayed(this.f22746I, 700L);
        }
    }

    public final void f() {
        int i6 = this.f22741D + 1;
        this.f22741D = i6;
        if (i6 == 1) {
            if (this.f22742E) {
                this.f22745H.i(androidx.lifecycle.AbstractC2079k.a.ON_RESUME);
                this.f22742E = false;
            } else {
                android.os.Handler handler = this.f22744G;
                p247y7.AbstractC7350t.c(handler);
                handler.removeCallbacks(this.f22746I);
            }
        }
    }

    public final void g() {
        int i6 = this.f22740C + 1;
        this.f22740C = i6;
        if (i6 == 1 && this.f22743F) {
            this.f22745H.i(androidx.lifecycle.AbstractC2079k.a.ON_START);
            this.f22743F = false;
        }
    }

    public final void h() {
        this.f22740C--;
        l();
    }

    public final void i(android.content.Context context) {
        p247y7.AbstractC7350t.f(context, "context");
        this.f22744G = new android.os.Handler();
        this.f22745H.i(androidx.lifecycle.AbstractC2079k.a.ON_CREATE);
        android.content.Context applicationContext = context.getApplicationContext();
        p247y7.AbstractC7350t.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new androidx.lifecycle.D.c());
    }

    public final void k() {
        if (this.f22741D == 0) {
            this.f22742E = true;
            this.f22745H.i(androidx.lifecycle.AbstractC2079k.a.ON_PAUSE);
        }
    }

    public final void l() {
        if (this.f22740C == 0 && this.f22742E) {
            this.f22745H.i(androidx.lifecycle.AbstractC2079k.a.ON_STOP);
            this.f22743F = true;
        }
    }

    @Override // androidx.lifecycle.r
    public androidx.lifecycle.AbstractC2079k u() {
        return this.f22745H;
    }
}
