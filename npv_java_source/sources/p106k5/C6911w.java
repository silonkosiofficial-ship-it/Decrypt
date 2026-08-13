package p106k5;

/* JADX INFO: renamed from: k5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6911w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f49689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q4.f f49690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p106k5.C f49691c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p106k5.C6912x f49694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p106k5.C6912x f49695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p106k5.C6905p f49697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p106k5.H f49698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p166q5.g f49699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p096j5.b f49700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p086i5.a f49701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p106k5.C6902m f49702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p076h5.a f49703o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p076h5.l f49704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p116l5.f f49705q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f49693e = java.lang.System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p106k5.M f49692d = new p106k5.M();

    public C6911w(Q4.f fVar, p106k5.H h6, p076h5.a aVar, p106k5.C c6, p096j5.b bVar, p086i5.a aVar2, p166q5.g gVar, p106k5.C6902m c6902m, p076h5.l lVar, p116l5.f fVar2) {
        this.f49690b = fVar;
        this.f49691c = c6;
        this.f49689a = fVar.k();
        this.f49698j = h6;
        this.f49703o = aVar;
        this.f49700l = bVar;
        this.f49701m = aVar2;
        this.f49699k = gVar;
        this.f49702n = c6902m;
        this.f49704p = lVar;
        this.f49705q = fVar2;
    }

    private void f() {
        boolean zEquals;
        try {
            zEquals = java.lang.Boolean.TRUE.equals((java.lang.Boolean) this.f49705q.f50062a.d().submit(new java.util.concurrent.Callable() { // from class: k5.r
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f49679a.m();
                }
            }).get(3L, java.util.concurrent.TimeUnit.SECONDS));
        } catch (java.lang.Exception unused) {
            zEquals = false;
        }
        this.f49696h = zEquals;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void o(p186s5.j jVar) {
        p116l5.f.c();
        t();
        try {
            try {
                this.f49700l.a(new p096j5.a() { // from class: k5.t
                    @Override // p096j5.a
                    public final void a(java.lang.String str) {
                        this.f49682a.r(str);
                    }
                });
                this.f49697i.S();
                if (!jVar.b().f54362b.f54369a) {
                    p076h5.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                    throw new java.lang.RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f49697i.y(jVar)) {
                    p076h5.g.f().k("Previous sessions could not be finalized.");
                }
                this.f49697i.U(jVar.a());
                s();
            } catch (java.lang.Exception e6) {
                p076h5.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e6);
            }
        } catch (java.lang.Throwable th) {
            s();
            throw th;
        }
    }

    private void j(final p186s5.j jVar) {
        p076h5.g gVarF;
        java.lang.String str;
        java.util.concurrent.Future<?> futureSubmit = this.f49705q.f50062a.d().submit(new java.lang.Runnable() { // from class: k5.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f49680C.o(jVar);
            }
        });
        p076h5.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e6) {
            p076h5.g.f().e("Crashlytics was interrupted during initialization.", e6);
            java.lang.Thread.currentThread().interrupt();
        } catch (java.util.concurrent.ExecutionException e10) {
            e = e10;
            gVarF = p076h5.g.f();
            str = "Crashlytics encountered a problem during initialization.";
            gVarF.e(str, e);
        } catch (java.util.concurrent.TimeoutException e11) {
            e = e11;
            gVarF = p076h5.g.f();
            str = "Crashlytics timed out during initialization.";
            gVarF.e(str, e);
        }
    }

    public static java.lang.String k() {
        return "19.3.0";
    }

    static boolean l(java.lang.String str, boolean z6) {
        if (z6) {
            return !android.text.TextUtils.isEmpty(str);
        }
        p076h5.g.f().i("Configured not to require a build ID.");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Boolean m() {
        return java.lang.Boolean.valueOf(this.f49697i.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(long j6, java.lang.String str) {
        this.f49697i.X(j6, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(final long j6, final java.lang.String str) {
        this.f49705q.f50063b.g(new java.lang.Runnable() { // from class: k5.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f49686C.p(j6, str);
            }
        });
    }

    boolean g() {
        return this.f49694f.c();
    }

    public p115l4.AbstractC6931l i(final p186s5.j jVar) {
        return this.f49705q.f50062a.g(new java.lang.Runnable() { // from class: k5.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f49677C.n(jVar);
            }
        });
    }

    public void r(final java.lang.String str) {
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - this.f49693e;
        this.f49705q.f50062a.g(new java.lang.Runnable() { // from class: k5.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f49683C.q(jCurrentTimeMillis, str);
            }
        });
    }

    void s() {
        p116l5.f.c();
        try {
            if (this.f49694f.d()) {
                return;
            }
            p076h5.g.f().k("Initialization marker file was not properly removed.");
        } catch (java.lang.Exception e6) {
            p076h5.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e6);
        }
    }

    void t() {
        p116l5.f.c();
        this.f49694f.a();
        p076h5.g.f().i("Initialization marker file was created.");
    }

    public boolean u(p106k5.C6890a c6890a, p186s5.j jVar) {
        if (!l(c6890a.f49594b, p106k5.AbstractC6898i.i(this.f49689a, "com.crashlytics.RequireBuildId", true))) {
            throw new java.lang.IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        java.lang.String strC = new p106k5.C6897h().c();
        try {
            this.f49695g = new p106k5.C6912x("crash_marker", this.f49699k);
            this.f49694f = new p106k5.C6912x("initialization_marker", this.f49699k);
            p126m5.n nVar = new p126m5.n(strC, this.f49699k, this.f49705q);
            p126m5.e eVar = new p126m5.e(this.f49699k);
            p196t5.a aVar = new p196t5.a(1024, new p196t5.c(10));
            this.f49704p.c(nVar);
            this.f49697i = new p106k5.C6905p(this.f49689a, this.f49698j, this.f49691c, this.f49699k, this.f49695g, c6890a, nVar, eVar, p106k5.Z.i(this.f49689a, this.f49698j, this.f49699k, c6890a, eVar, nVar, aVar, jVar, this.f49692d, this.f49702n, this.f49705q), this.f49703o, this.f49701m, this.f49702n, this.f49705q);
            boolean zG = g();
            f();
            this.f49697i.w(strC, java.lang.Thread.getDefaultUncaughtExceptionHandler(), jVar);
            if (!zG || !p106k5.AbstractC6898i.d(this.f49689a)) {
                p076h5.g.f().b("Successfully configured exception handler.");
                return true;
            }
            p076h5.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            j(jVar);
            return false;
        } catch (java.lang.Exception e6) {
            p076h5.g.f().e("Crashlytics was not started due to an exception during initialization", e6);
            this.f49697i = null;
            return false;
        }
    }
}
