package p213v2;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v2.b.a f55761l = new v2.b.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p213v2.b.InterfaceC0730b f55762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p253z2.e f55763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private W8.N f55764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p237x7.a f55765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Object f55766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f55767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f55768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicLong f55769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p253z2.d f55770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f55771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private W8.InterfaceC1822z0 f55772k;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: v2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0730b {
        long a();
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f55773G;

        c(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f55773G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                long j6 = p213v2.b.this.f55767f;
                this.f55773G = 1;
                if (W8.Y.a(j6, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            p213v2.b.this.e();
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((v2.b.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p213v2.b.this.new c(eVar);
        }
    }

    public b(long j6, java.util.concurrent.TimeUnit timeUnit, p213v2.b.InterfaceC0730b interfaceC0730b) {
        p247y7.AbstractC7350t.f(timeUnit, "timeUnit");
        p247y7.AbstractC7350t.f(interfaceC0730b, "watch");
        this.f55762a = interfaceC0730b;
        this.f55766e = new java.lang.Object();
        this.f55767f = timeUnit.toMillis(j6);
        this.f55768g = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f55769h = new java.util.concurrent.atomic.AtomicLong(interfaceC0730b.a());
    }

    public /* synthetic */ b(long j6, java.util.concurrent.TimeUnit timeUnit, p213v2.b.InterfaceC0730b interfaceC0730b, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, timeUnit, (i6 & 4) != 0 ? new p213v2.b.InterfaceC0730b() { // from class: v2.a
            @Override // p213v2.b.InterfaceC0730b
            public final long a() {
                return p213v2.b.b();
            }
        } : interfaceC0730b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b() {
        return android.os.SystemClock.uptimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        p087i7.M m6;
        synchronized (this.f55766e) {
            try {
                if (this.f55762a.a() - this.f55769h.get() < this.f55767f) {
                    return;
                }
                if (this.f55768g.get() != 0) {
                    return;
                }
                p237x7.a aVar = this.f55765d;
                if (aVar != null) {
                    aVar.b();
                    m6 = p087i7.M.f46721a;
                } else {
                    m6 = null;
                }
                if (m6 == null) {
                    throw new java.lang.IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
                }
                p253z2.d dVar = this.f55770i;
                if (dVar != null && dVar.isOpen()) {
                    dVar.close();
                }
                this.f55770i = null;
                p087i7.M m10 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f55766e) {
            try {
                this.f55771j = true;
                W8.InterfaceC1822z0 interfaceC1822z0 = this.f55772k;
                if (interfaceC1822z0 != null) {
                    W8.InterfaceC1822z0.a.a(interfaceC1822z0, null, 1, null);
                }
                this.f55772k = null;
                p253z2.d dVar = this.f55770i;
                if (dVar != null) {
                    dVar.close();
                }
                this.f55770i = null;
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        W8.N n6;
        int iDecrementAndGet = this.f55768g.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new java.lang.IllegalStateException("Unbalanced reference count.".toString());
        }
        this.f55769h.set(this.f55762a.a());
        if (iDecrementAndGet == 0) {
            W8.N n10 = this.f55764c;
            if (n10 == null) {
                p247y7.AbstractC7350t.p("coroutineScope");
                n6 = null;
            } else {
                n6 = n10;
            }
            this.f55772k = W8.AbstractC1788i.d(n6, null, null, new v2.b.c(null), 3, null);
        }
    }

    public final java.lang.Object h(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "block");
        try {
            return lVar.l(j());
        } finally {
            g();
        }
    }

    public final p253z2.d i() {
        return this.f55770i;
    }

    public final p253z2.d j() {
        W8.InterfaceC1822z0 interfaceC1822z0 = this.f55772k;
        p253z2.e eVar = null;
        if (interfaceC1822z0 != null) {
            W8.InterfaceC1822z0.a.a(interfaceC1822z0, null, 1, null);
        }
        this.f55772k = null;
        this.f55768g.incrementAndGet();
        if (!(!this.f55771j)) {
            throw new java.lang.IllegalStateException("Attempting to open already closed database.".toString());
        }
        synchronized (this.f55766e) {
            p253z2.d dVar = this.f55770i;
            if (dVar != null && dVar.isOpen()) {
                return dVar;
            }
            p253z2.e eVar2 = this.f55763b;
            if (eVar2 == null) {
                p247y7.AbstractC7350t.p("delegateOpenHelper");
            } else {
                eVar = eVar2;
            }
            p253z2.d dVarV0 = eVar.v0();
            this.f55770i = dVarV0;
            return dVarV0;
        }
    }

    public final void k(W8.N n6) {
        p247y7.AbstractC7350t.f(n6, "coroutineScope");
        this.f55764c = n6;
    }

    public final void l(p253z2.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "delegateOpenHelper");
        if (eVar instanceof p213v2.c) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        this.f55763b = eVar;
    }

    public final void m(p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "onAutoClose");
        this.f55765d = aVar;
    }
}
