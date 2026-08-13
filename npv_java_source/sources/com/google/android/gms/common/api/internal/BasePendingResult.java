package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepName
public abstract class BasePendingResult<R extends O3.k> extends O3.g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final java.lang.ThreadLocal f24860m = new com.google.android.gms.common.api.internal.D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.BasePendingResult.a f24862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final java.lang.ref.WeakReference f24863c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private O3.k f24867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.common.api.Status f24868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f24869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f24871k;

    @com.google.android.gms.common.annotation.KeepName
    private com.google.android.gms.common.api.internal.E resultGuardian;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f24861a = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.CountDownLatch f24864d = new java.util.concurrent.CountDownLatch(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.ArrayList f24865e = new java.util.ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f24866f = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f24872l = false;

    public static class a extends p035d4.h {
        public a(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            int i6 = message.what;
            if (i6 == 1) {
                android.util.Pair pair = (android.util.Pair) message.obj;
                androidx.appcompat.app.D.a(pair.first);
                O3.k kVar = (O3.k) pair.second;
                try {
                    throw null;
                } catch (java.lang.RuntimeException e6) {
                    com.google.android.gms.common.api.internal.BasePendingResult.k(kVar);
                    throw e6;
                }
            }
            if (i6 == 2) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) message.obj).d(com.google.android.gms.common.api.Status.f24848K);
                return;
            }
            java.lang.String str = "Don't know how to handle message: " + i6;
            new java.lang.Exception();
        }
    }

    protected BasePendingResult(O3.f fVar) {
        this.f24862b = new com.google.android.gms.common.api.internal.BasePendingResult.a(fVar != null ? fVar.c() : android.os.Looper.getMainLooper());
        this.f24863c = new java.lang.ref.WeakReference(fVar);
    }

    private final O3.k g() {
        O3.k kVar;
        synchronized (this.f24861a) {
            Q3.AbstractC1477p.p(!this.f24869i, "Result has already been consumed.");
            Q3.AbstractC1477p.p(e(), "Result is not ready.");
            kVar = this.f24867g;
            this.f24867g = null;
            this.f24869i = true;
        }
        androidx.appcompat.app.D.a(this.f24866f.getAndSet(null));
        return (O3.k) Q3.AbstractC1477p.l(kVar);
    }

    private final void h(O3.k kVar) {
        this.f24867g = kVar;
        this.f24868h = kVar.d();
        this.f24864d.countDown();
        if (!this.f24870j && (this.f24867g instanceof O3.i)) {
            this.resultGuardian = new com.google.android.gms.common.api.internal.E(this, null);
        }
        java.util.ArrayList arrayList = this.f24865e;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((O3.g.a) arrayList.get(i6)).a(this.f24868h);
        }
        this.f24865e.clear();
    }

    public static void k(O3.k kVar) {
        if (kVar instanceof O3.i) {
            try {
                ((O3.i) kVar).a();
            } catch (java.lang.RuntimeException e6) {
                "Unable to release ".concat(java.lang.String.valueOf(kVar));
            }
        }
    }

    @Override // O3.g
    public final void a(O3.g.a aVar) {
        Q3.AbstractC1477p.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f24861a) {
            try {
                if (e()) {
                    aVar.a(this.f24868h);
                } else {
                    this.f24865e.add(aVar);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // O3.g
    public final O3.k b(long j6, java.util.concurrent.TimeUnit timeUnit) {
        if (j6 > 0) {
            Q3.AbstractC1477p.k("await must not be called on the UI thread when time is greater than zero.");
        }
        Q3.AbstractC1477p.p(!this.f24869i, "Result has already been consumed.");
        Q3.AbstractC1477p.p(true, "Cannot await if then() has been called.");
        try {
            if (!this.f24864d.await(j6, timeUnit)) {
                d(com.google.android.gms.common.api.Status.f24848K);
            }
        } catch (java.lang.InterruptedException unused) {
            d(com.google.android.gms.common.api.Status.f24846I);
        }
        Q3.AbstractC1477p.p(e(), "Result is not ready.");
        return g();
    }

    protected abstract O3.k c(com.google.android.gms.common.api.Status status);

    public final void d(com.google.android.gms.common.api.Status status) {
        synchronized (this.f24861a) {
            try {
                if (!e()) {
                    f(c(status));
                    this.f24871k = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        return this.f24864d.getCount() == 0;
    }

    public final void f(O3.k kVar) {
        synchronized (this.f24861a) {
            try {
                if (this.f24871k || this.f24870j) {
                    k(kVar);
                    return;
                }
                e();
                Q3.AbstractC1477p.p(!e(), "Results have already been set");
                Q3.AbstractC1477p.p(!this.f24869i, "Result has already been consumed");
                h(kVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        boolean z6 = true;
        if (!this.f24872l && !((java.lang.Boolean) f24860m.get()).booleanValue()) {
            z6 = false;
        }
        this.f24872l = z6;
    }
}
