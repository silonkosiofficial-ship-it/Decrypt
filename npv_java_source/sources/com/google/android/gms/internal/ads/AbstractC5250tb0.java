package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5250tb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.google.android.gms.ads.internal.ClientApi f38981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final android.content.Context f38982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f38983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.InterfaceC2945Vl f38984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected p184s3.I1 f38985e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p184s3.InterfaceC7083c0 f38987g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2780Ra0 f38989i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f38991k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3165ab0 f38994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final V3.f f38995o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentLinkedQueue f38988h = new java.util.concurrent.ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final java.util.concurrent.atomic.AtomicBoolean f38986f = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f38990j = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f38992l = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f38993m = new java.util.concurrent.atomic.AtomicBoolean(false);

    public AbstractC5250tb0(com.google.android.gms.ads.internal.ClientApi clientApi, android.content.Context context, int i6, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, p184s3.I1 i10, p184s3.InterfaceC7083c0 interfaceC7083c0, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.C2780Ra0 c2780Ra0, V3.f fVar) {
        this.f38981a = clientApi;
        this.f38982b = context;
        this.f38983c = i6;
        this.f38984d = interfaceC2945Vl;
        this.f38985e = i10;
        this.f38987g = interfaceC7083c0;
        this.f38991k = scheduledExecutorService;
        this.f38989i = c2780Ra0;
        this.f38995o = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void A(java.lang.Object obj) {
        try {
            this.f38990j.set(false);
            if (obj != null) {
                this.f38989i.c();
                this.f38993m.set(true);
                y(obj);
            }
            c(obj == null);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void B() {
        if (this.f38992l.get()) {
            try {
                this.f38987g.O0(this.f38985e);
            } catch (android.os.RemoteException unused) {
                p224w3.p.g("Failed to call onAdsAvailable");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void C() {
        if (this.f38992l.get()) {
            try {
                this.f38987g.J5(this.f38985e);
            } catch (android.os.RemoteException unused) {
                p224w3.p.g("Failed to call onAdsExhausted");
            }
        }
    }

    private final synchronized void D() {
        if (this.f38993m.get() && this.f38988h.isEmpty()) {
            this.f38993m.set(false);
            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.qb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38288C.C();
                }
            });
            this.f38991k.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.rb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38511C.r();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void a(p184s3.W0 w6) {
        this.f38990j.set(false);
        int i6 = w6.f54145C;
        if (i6 != 1 && i6 != 8 && i6 != 10 && i6 != 11) {
            c(true);
            return;
        }
        p184s3.I1 i10 = this.f38985e;
        p224w3.p.f("Preloading " + i10.f54131D + ", for adUnitId:" + i10.f54130C + ", Ad load failed. Stop preloading due to non-retriable error:");
        this.f38986f.set(false);
    }

    private final synchronized void b() {
        java.util.Iterator it = this.f38988h.iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.internal.ads.C4043ib0) it.next()).c()) {
                it.remove();
            }
        }
    }

    private final synchronized void c(boolean z6) {
        try {
            if (this.f38989i.e()) {
                return;
            }
            if (z6) {
                this.f38989i.b();
            }
            this.f38991k.schedule(new com.google.android.gms.internal.ads.RunnableC4151jb0(this), this.f38989i.a(), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private static final j$.util.Optional d(j$.util.Optional optional) {
        final java.lang.Class<com.google.android.gms.internal.ads.BinderC5654xC> cls = com.google.android.gms.internal.ads.BinderC5654xC.class;
        return optional.filter(new java.util.function.Predicate() { // from class: com.google.android.gms.internal.ads.kb0
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
                return cls.isInstance((p184s3.U0) obj);
            }
        }).map(new java.util.function.Function() { // from class: com.google.android.gms.internal.ads.mb0
            public /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return (com.google.android.gms.internal.ads.BinderC5654xC) cls.cast((p184s3.U0) obj);
            }

            public /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$compose(this, function);
            }
        }).map(new java.util.function.Function() { // from class: com.google.android.gms.internal.ads.nb0
            public /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.android.gms.internal.ads.BinderC5654xC) obj).k();
            }

            public /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$compose(this, function);
            }
        });
    }

    private final synchronized void y(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C4043ib0 c4043ib0 = new com.google.android.gms.internal.ads.C4043ib0(obj, this.f38995o);
        this.f38988h.add(c4043ib0);
        V3.f fVar = this.f38995o;
        final j$.util.Optional optionalF = f(obj);
        final long jA = fVar.a();
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ob0
            @Override // java.lang.Runnable
            public final void run() {
                this.f37839C.B();
            }
        });
        this.f38991k.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.pb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f38026C.q(jA, optionalF);
            }
        });
        this.f38991k.schedule(new com.google.android.gms.internal.ads.RunnableC4151jb0(this), c4043ib0.a(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void z(java.lang.Throwable th) {
        try {
            this.f38990j.set(false);
            if ((th instanceof com.google.android.gms.internal.ads.C2632Na0) && ((com.google.android.gms.internal.ads.C2632Na0) th).a() == 0) {
                throw null;
            }
            c(true);
        } catch (java.lang.Throwable th2) {
            throw th2;
        }
    }

    protected abstract P4.d e();

    protected abstract j$.util.Optional f(java.lang.Object obj);

    public final synchronized com.google.android.gms.internal.ads.AbstractC5250tb0 g() {
        this.f38991k.submit(new com.google.android.gms.internal.ads.RunnableC4151jb0(this));
        return this;
    }

    protected final synchronized java.lang.Object h() {
        com.google.android.gms.internal.ads.C4043ib0 c4043ib0 = (com.google.android.gms.internal.ads.C4043ib0) this.f38988h.peek();
        if (c4043ib0 == null) {
            return null;
        }
        return c4043ib0.b();
    }

    public final synchronized java.lang.Object i() {
        this.f38989i.c();
        com.google.android.gms.internal.ads.C4043ib0 c4043ib0 = (com.google.android.gms.internal.ads.C4043ib0) this.f38988h.poll();
        this.f38993m.set(c4043ib0 != null);
        p();
        if (c4043ib0 == null) {
            return null;
        }
        return c4043ib0.b();
    }

    public final synchronized j$.util.Optional j() {
        java.lang.Object objH;
        try {
            objH = h();
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return d(objH == null ? j$.util.Optional.empty() : f(objH));
    }

    protected final synchronized void p() {
        b();
        D();
        if (!this.f38990j.get() && this.f38986f.get() && this.f38988h.size() < this.f38985e.f54133F) {
            this.f38990j.set(true);
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(e(), new com.google.android.gms.internal.ads.C5140sb0(this), this.f38991k);
        }
    }

    final /* synthetic */ void q(long j6, j$.util.Optional optional) {
        com.google.android.gms.internal.ads.C3165ab0 c3165ab0 = this.f38994n;
        if (c3165ab0 != null) {
            c3165ab0.b(p104k3.EnumC6886c.e(this.f38985e.f54131D), j6, d(optional));
        }
    }

    final /* synthetic */ void r() {
        com.google.android.gms.internal.ads.C3165ab0 c3165ab0 = this.f38994n;
        if (c3165ab0 != null) {
            c3165ab0.c(p104k3.EnumC6886c.e(this.f38985e.f54131D), this.f38995o.a());
        }
    }

    public final synchronized void s(int i6) {
        Q3.AbstractC1477p.a(i6 >= 5);
        this.f38989i.d(i6);
    }

    public final synchronized void t() {
        this.f38986f.set(true);
        this.f38992l.set(true);
        this.f38991k.submit(new com.google.android.gms.internal.ads.RunnableC4151jb0(this));
    }

    public final void u(com.google.android.gms.internal.ads.C3165ab0 c3165ab0) {
        this.f38994n = c3165ab0;
    }

    public final void v() {
        this.f38986f.set(false);
        this.f38992l.set(false);
    }

    protected final synchronized void w(int i6) {
        try {
            Q3.AbstractC1477p.a(i6 > 0);
            p184s3.I1 i10 = this.f38985e;
            java.lang.String str = i10.f54130C;
            int i11 = i10.f54131D;
            p184s3.X1 x6 = i10.f54132E;
            if (i6 <= 0) {
                i6 = i10.f54133F;
            }
            this.f38985e = new p184s3.I1(str, i11, x6, i6);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean x() {
        b();
        return !this.f38988h.isEmpty();
    }
}
