package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class P2 extends com.google.android.gms.measurement.internal.AbstractC6512z3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicLong f42080l = new java.util.concurrent.atomic.AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.T2 f42081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.T2 f42082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.PriorityBlockingQueue f42083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.BlockingQueue f42084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.Thread.UncaughtExceptionHandler f42085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.Thread.UncaughtExceptionHandler f42086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.Object f42087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.Semaphore f42088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f42089k;

    P2(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f42087i = new java.lang.Object();
        this.f42088j = new java.util.concurrent.Semaphore(2);
        this.f42083e = new java.util.concurrent.PriorityBlockingQueue();
        this.f42084f = new java.util.concurrent.LinkedBlockingQueue();
        this.f42085g = new com.google.android.gms.measurement.internal.R2(this, "Thread death: Uncaught exception on worker thread");
        this.f42086h = new com.google.android.gms.measurement.internal.R2(this, "Thread death: Uncaught exception on network thread");
    }

    private final void y(com.google.android.gms.measurement.internal.Q2 q6) {
        synchronized (this.f42087i) {
            try {
                this.f42083e.add(q6);
                com.google.android.gms.measurement.internal.T2 t6 = this.f42081c;
                if (t6 == null) {
                    com.google.android.gms.measurement.internal.T2 t10 = new com.google.android.gms.measurement.internal.T2(this, "Measurement Worker", this.f42083e);
                    this.f42081c = t10;
                    t10.setUncaughtExceptionHandler(this.f42085g);
                    this.f42081c.start();
                } else {
                    t6.a();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final java.util.concurrent.Future B(java.util.concurrent.Callable callable) {
        p();
        Q3.AbstractC1477p.l(callable);
        com.google.android.gms.measurement.internal.Q2 q6 = new com.google.android.gms.measurement.internal.Q2(this, callable, true, "Task exception on worker thread");
        if (java.lang.Thread.currentThread() == this.f42081c) {
            q6.run();
        } else {
            y(q6);
        }
        return q6;
    }

    public final void D(java.lang.Runnable runnable) {
        p();
        Q3.AbstractC1477p.l(runnable);
        y(new com.google.android.gms.measurement.internal.Q2(this, runnable, false, "Task exception on worker thread"));
    }

    public final void G(java.lang.Runnable runnable) {
        p();
        Q3.AbstractC1477p.l(runnable);
        y(new com.google.android.gms.measurement.internal.Q2(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean J() {
        return java.lang.Thread.currentThread() == this.f42081c;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ android.content.Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ V3.f b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6376g d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6494x e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6348c f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6386h2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.d6 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final void k() {
        if (java.lang.Thread.currentThread() != this.f42082d) {
            throw new java.lang.IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final void n() {
        if (java.lang.Thread.currentThread() != this.f42081c) {
            throw new java.lang.IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6512z3
    protected final boolean t() {
        return false;
    }

    final java.lang.Object v(java.util.concurrent.atomic.AtomicReference atomicReference, long j6, java.lang.String str, java.lang.Runnable runnable) {
        synchronized (atomicReference) {
            l().D(runnable);
            try {
                atomicReference.wait(j6);
            } catch (java.lang.InterruptedException unused) {
                j().L().a("Interrupted waiting for " + str);
                return null;
            }
        }
        java.lang.Object obj = atomicReference.get();
        if (obj == null) {
            j().L().a("Timed out waiting for " + str);
        }
        return obj;
    }

    public final java.util.concurrent.Future w(java.util.concurrent.Callable callable) {
        p();
        Q3.AbstractC1477p.l(callable);
        com.google.android.gms.measurement.internal.Q2 q6 = new com.google.android.gms.measurement.internal.Q2(this, callable, false, "Task exception on worker thread");
        if (java.lang.Thread.currentThread() == this.f42081c) {
            if (!this.f42083e.isEmpty()) {
                j().L().a("Callable skipped the worker queue.");
            }
            q6.run();
        } else {
            y(q6);
        }
        return q6;
    }

    public final void z(java.lang.Runnable runnable) {
        p();
        Q3.AbstractC1477p.l(runnable);
        com.google.android.gms.measurement.internal.Q2 q6 = new com.google.android.gms.measurement.internal.Q2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f42087i) {
            try {
                this.f42084f.add(q6);
                com.google.android.gms.measurement.internal.T2 t6 = this.f42082d;
                if (t6 == null) {
                    com.google.android.gms.measurement.internal.T2 t10 = new com.google.android.gms.measurement.internal.T2(this, "Measurement Network", this.f42084f);
                    this.f42082d = t10;
                    t10.setUncaughtExceptionHandler(this.f42086h);
                    this.f42082d.start();
                } else {
                    t6.a();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
