package p174r3;

/* JADX INFO: loaded from: classes.dex */
public final class k implements java.lang.Runnable, com.google.android.gms.internal.ads.T9 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected boolean f53858F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f53859G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f53860H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.concurrent.Executor f53861I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2929Vc0 f53862J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private android.content.Context f53863K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final android.content.Context f53864L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private p224w3.a f53865M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final p224w3.a f53866N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f53867O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f53869Q;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f53855C = new java.util.Vector();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f53856D = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f53857E = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    final java.util.concurrent.CountDownLatch f53868P = new java.util.concurrent.CountDownLatch(1);

    public k(android.content.Context context, p224w3.a aVar) {
        this.f53863K = context;
        this.f53864L = context;
        this.f53865M = aVar;
        this.f53866N = aVar;
        java.util.concurrent.ExecutorService executorServiceNewCachedThreadPool = java.util.concurrent.Executors.newCachedThreadPool();
        this.f53861I = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25744y2)).booleanValue();
        this.f53867O = zBooleanValue;
        this.f53862J = com.google.android.gms.internal.ads.C2929Vc0.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f53859G = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25714v2)).booleanValue();
        this.f53860H = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25754z2)).booleanValue();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25734x2)).booleanValue()) {
            this.f53869Q = 2;
        } else {
            this.f53869Q = 1;
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25212A3)).booleanValue()) {
            this.f53858F = m();
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25705u3)).booleanValue()) {
            p184s3.C7147y.b();
            if (!p224w3.g.w()) {
                run();
                return;
            }
        }
        com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(this);
    }

    private final com.google.android.gms.internal.ads.T9 q() {
        return (com.google.android.gms.internal.ads.T9) (o() == 2 ? this.f53857E : this.f53856D).get();
    }

    private final void r() {
        java.util.List list = this.f53855C;
        com.google.android.gms.internal.ads.T9 t9Q = q();
        if (list.isEmpty() || t9Q == null) {
            return;
        }
        for (java.lang.Object[] objArr : this.f53855C) {
            int length = objArr.length;
            if (length == 1) {
                t9Q.h((android.view.MotionEvent) objArr[0]);
            } else if (length == 3) {
                t9Q.g(((java.lang.Integer) objArr[0]).intValue(), ((java.lang.Integer) objArr[1]).intValue(), ((java.lang.Integer) objArr[2]).intValue());
            }
        }
        this.f53855C.clear();
    }

    private final void s(boolean z6) {
        java.lang.String str = this.f53865M.f56217C;
        android.content.Context contextT = t(this.f53863K);
        com.google.android.gms.internal.ads.V7 v7B0 = com.google.android.gms.internal.ads.X7.b0();
        v7B0.z(z6);
        v7B0.A(str);
        this.f53856D.set(com.google.android.gms.internal.ads.X9.y(contextT, new com.google.android.gms.internal.ads.V9((com.google.android.gms.internal.ads.X7) v7B0.u())));
    }

    private static final android.content.Context t(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final com.google.android.gms.internal.ads.Q9 u(android.content.Context context, p224w3.a aVar, boolean z6, boolean z10) {
        com.google.android.gms.internal.ads.V7 v7B0 = com.google.android.gms.internal.ads.X7.b0();
        v7B0.z(z6);
        v7B0.A(aVar.f56217C);
        return com.google.android.gms.internal.ads.Q9.j(t(context), (com.google.android.gms.internal.ads.X7) v7B0.u(), z10);
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String a(android.content.Context context) {
        return k(context, null);
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final void b(android.view.View view) {
        com.google.android.gms.internal.ads.T9 t9Q = q();
        if (t9Q != null) {
            t9Q.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final void c(java.lang.StackTraceElement[] stackTraceElementArr) {
        com.google.android.gms.internal.ads.T9 t9Q;
        com.google.android.gms.internal.ads.T9 t9Q2;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25429U2)).booleanValue()) {
            if (this.f53868P.getCount() != 0 || (t9Q2 = q()) == null) {
                return;
            }
            t9Q2.c(stackTraceElementArr);
            return;
        }
        if (!n() || (t9Q = q()) == null) {
            return;
        }
        t9Q.c(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String d(final android.content.Context context) {
        try {
            return (java.lang.String) com.google.android.gms.internal.ads.AbstractC2652Nk0.j(new java.util.concurrent.Callable() { // from class: r3.h
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f53850a.k(context, null);
                }
            }, this.f53861I).get(((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25374P2)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return java.lang.Integer.toString(17);
        } catch (java.util.concurrent.TimeoutException unused2) {
            return com.google.android.gms.internal.ads.M9.a(context, this.f53866N.f56217C, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String e(android.content.Context context, java.lang.String str, android.view.View view) {
        return f(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String f(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        if (!n()) {
            return "";
        }
        com.google.android.gms.internal.ads.T9 t9Q = q();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Aa)).booleanValue()) {
            p174r3.v.t();
            p214v3.E0.k(view, 4, null);
        }
        if (t9Q == null) {
            return "";
        }
        r();
        return t9Q.f(t(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final void g(int i6, int i10, int i11) {
        com.google.android.gms.internal.ads.T9 t9Q = q();
        if (t9Q == null) {
            this.f53855C.add(new java.lang.Object[]{java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11)});
        } else {
            r();
            t9Q.g(i6, i10, i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final void h(android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.T9 t9Q = q();
        if (t9Q == null) {
            this.f53855C.add(new java.lang.Object[]{motionEvent});
        } else {
            r();
            t9Q.h(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String i(android.content.Context context, android.view.View view, android.app.Activity activity) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.za)).booleanValue()) {
            com.google.android.gms.internal.ads.T9 t9Q = q();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Aa)).booleanValue()) {
                p174r3.v.t();
                p214v3.E0.k(view, 2, null);
            }
            return t9Q != null ? t9Q.i(context, view, activity) : "";
        }
        if (!n()) {
            return "";
        }
        com.google.android.gms.internal.ads.T9 t9Q2 = q();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Aa)).booleanValue()) {
            p174r3.v.t();
            p214v3.E0.k(view, 2, null);
        }
        return t9Q2 != null ? t9Q2.i(context, view, activity) : "";
    }

    public final java.lang.String k(android.content.Context context, byte[] bArr) {
        com.google.android.gms.internal.ads.T9 t9Q;
        if (!n() || (t9Q = q()) == null) {
            return "";
        }
        r();
        return t9Q.a(t(context));
    }

    final /* synthetic */ void l(boolean z6) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            u(this.f53864L, this.f53866N, z6, this.f53867O).p();
        } catch (java.lang.NullPointerException e6) {
            this.f53862J.c(2027, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e6);
        }
    }

    protected final boolean m() {
        android.content.Context context = this.f53863K;
        p174r3.j jVar = new p174r3.j(this);
        com.google.android.gms.internal.ads.C2929Vc0 c2929Vc0 = this.f53862J;
        return new com.google.android.gms.internal.ads.C2859Td0(this.f53863K, com.google.android.gms.internal.ads.AbstractC5804yd0.b(context, c2929Vc0), jVar, ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25724w2)).booleanValue()).d(1);
    }

    public final boolean n() {
        try {
            this.f53868P.await();
            return true;
        } catch (java.lang.InterruptedException e6) {
            p224w3.p.h("Interrupted during GADSignals creation.", e6);
            return false;
        }
    }

    protected final int o() {
        if (!this.f53859G || this.f53858F) {
            return this.f53869Q;
        }
        return 1;
    }

    public final int p() {
        return this.f53869Q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25212A3)).booleanValue()) {
                this.f53858F = m();
            }
            boolean z6 = this.f53865M.f56220F;
            final boolean z10 = false;
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25548f1)).booleanValue() && z6) {
                z10 = true;
            }
            if (o() == 1) {
                s(z10);
                if (this.f53869Q == 2) {
                    this.f53861I.execute(new java.lang.Runnable() { // from class: r3.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f53852C.l(z10);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                try {
                    com.google.android.gms.internal.ads.Q9 q9U = u(this.f53863K, this.f53865M, z10, this.f53867O);
                    this.f53857E.set(q9U);
                    if (this.f53860H && !q9U.r()) {
                        this.f53869Q = 1;
                        s(z10);
                    }
                } catch (java.lang.NullPointerException e6) {
                    this.f53869Q = 1;
                    s(z10);
                    this.f53862J.c(2031, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e6);
                }
            }
            this.f53868P.countDown();
            this.f53863K = null;
            this.f53865M = null;
        } catch (java.lang.Throwable th) {
            this.f53868P.countDown();
            this.f53863K = null;
            this.f53865M = null;
            throw th;
        }
    }
}
