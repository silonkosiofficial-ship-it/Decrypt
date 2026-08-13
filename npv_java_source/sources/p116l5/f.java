package p116l5;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l5.f.a f50060e = new l5.f.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f50061f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p116l5.e f50062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p116l5.e f50063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p116l5.e f50064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p116l5.e f50065d;

    public static final class a {

        /* JADX INFO: renamed from: l5.f$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0634a extends p247y7.C7348q implements p237x7.a {
            C0634a(java.lang.Object obj) {
                super(0, obj, l5.f.a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean b() {
                return java.lang.Boolean.valueOf(((l5.f.a) this.f57287D).k());
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final l5.f.a.b f50066D = new l5.f.a.b();

            b() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.String b() {
                return "Must be called on a background thread, was called on " + p116l5.f.f50060e.j() + '.';
            }
        }

        /* synthetic */ class c extends p247y7.C7348q implements p237x7.a {
            c(java.lang.Object obj) {
                super(0, obj, l5.f.a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean b() {
                return java.lang.Boolean.valueOf(((l5.f.a) this.f57287D).l());
            }
        }

        static final class d extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final l5.f.a.d f50067D = new l5.f.a.d();

            d() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.String b() {
                return "Must be called on a blocking thread, was called on " + p116l5.f.f50060e.j() + '.';
            }
        }

        /* synthetic */ class e extends p247y7.C7348q implements p237x7.a {
            e(java.lang.Object obj) {
                super(0, obj, l5.f.a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean b() {
                return java.lang.Boolean.valueOf(((l5.f.a) this.f57287D).m());
            }
        }

        /* JADX INFO: renamed from: l5.f$a$f, reason: collision with other inner class name */
        static final class C0635f extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final l5.f.a.C0635f f50068D = new l5.f.a.C0635f();

            C0635f() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.String b() {
                return "Must not be called on a main thread, was called on " + p116l5.f.f50060e.j() + '.';
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final void h(p237x7.a aVar, p237x7.a aVar2) {
            if (((java.lang.Boolean) aVar.b()).booleanValue()) {
                return;
            }
            p076h5.g.f().b((java.lang.String) aVar2.b());
            i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String j() {
            return java.lang.Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k() {
            java.lang.String strJ = j();
            p247y7.AbstractC7350t.e(strJ, "threadName");
            return S8.r.c0(strJ, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l() {
            java.lang.String strJ = j();
            p247y7.AbstractC7350t.e(strJ, "threadName");
            return S8.r.c0(strJ, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m() {
            return !android.os.Looper.getMainLooper().isCurrentThread();
        }

        public final void e() {
            h(new l5.f.a.C0634a(this), l5.f.a.b.f50066D);
        }

        public final void f() {
            h(new l5.f.a.c(this), l5.f.a.d.f50067D);
        }

        public final void g() {
            h(new l5.f.a.e(this), l5.f.a.C0635f.f50068D);
        }

        public final boolean i() {
            return p116l5.f.f50061f;
        }

        public final void n(boolean z6) {
            p116l5.f.f50061f = z6;
        }
    }

    public f(java.util.concurrent.ExecutorService executorService, java.util.concurrent.ExecutorService executorService2) {
        p247y7.AbstractC7350t.f(executorService, "backgroundExecutorService");
        p247y7.AbstractC7350t.f(executorService2, "blockingExecutorService");
        this.f50062a = new p116l5.e(executorService);
        this.f50063b = new p116l5.e(executorService);
        this.f50064c = new p116l5.e(executorService);
        this.f50065d = new p116l5.e(executorService2);
    }

    public static final void c() {
        f50060e.e();
    }

    public static final void d() {
        f50060e.f();
    }

    public static final void e() {
        f50060e.g();
    }

    public static final void f(boolean z6) {
        f50060e.n(z6);
    }
}
