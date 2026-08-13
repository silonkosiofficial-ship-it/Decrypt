package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.Map f44104d = new java.util.HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.concurrent.Executor f44105e = new p123m2.m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f44106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.u f44107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p115l4.AbstractC6931l f44108c = null;

    private static class b implements p115l4.InterfaceC6927h, p115l4.InterfaceC6926g, p115l4.InterfaceC6924e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.concurrent.CountDownLatch f44109a;

        private b() {
            this.f44109a = new java.util.concurrent.CountDownLatch(1);
        }

        @Override // p115l4.InterfaceC6927h
        public void a(java.lang.Object obj) {
            this.f44109a.countDown();
        }

        @Override // p115l4.InterfaceC6924e
        public void b() {
            this.f44109a.countDown();
        }

        public boolean c(long j6, java.util.concurrent.TimeUnit timeUnit) {
            return this.f44109a.await(j6, timeUnit);
        }

        @Override // p115l4.InterfaceC6926g
        public void d(java.lang.Exception exc) {
            this.f44109a.countDown();
        }
    }

    private f(java.util.concurrent.Executor executor, com.google.firebase.remoteconfig.internal.u uVar) {
        this.f44106a = executor;
        this.f44107b = uVar;
    }

    private static java.lang.Object c(p115l4.AbstractC6931l abstractC6931l, long j6, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        com.google.firebase.remoteconfig.internal.f.b bVar = new com.google.firebase.remoteconfig.internal.f.b();
        java.util.concurrent.Executor executor = f44105e;
        abstractC6931l.f(executor, bVar);
        abstractC6931l.d(executor, bVar);
        abstractC6931l.a(executor, bVar);
        if (!bVar.c(j6, timeUnit)) {
            throw new java.util.concurrent.TimeoutException("Task await timed out.");
        }
        if (abstractC6931l.o()) {
            return abstractC6931l.l();
        }
        throw new java.util.concurrent.ExecutionException(abstractC6931l.k());
    }

    public static synchronized com.google.firebase.remoteconfig.internal.f h(java.util.concurrent.Executor executor, com.google.firebase.remoteconfig.internal.u uVar) {
        java.lang.String strB;
        java.util.Map map;
        try {
            strB = uVar.b();
            map = f44104d;
            if (!map.containsKey(strB)) {
                map.put(strB, new com.google.firebase.remoteconfig.internal.f(executor, uVar));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (com.google.firebase.remoteconfig.internal.f) map.get(strB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Void i(com.google.firebase.remoteconfig.internal.g gVar) {
        return this.f44107b.e(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l j(boolean z6, com.google.firebase.remoteconfig.internal.g gVar, java.lang.Void r6) {
        if (z6) {
            m(gVar);
        }
        return p115l4.AbstractC6934o.e(gVar);
    }

    private synchronized void m(com.google.firebase.remoteconfig.internal.g gVar) {
        this.f44108c = p115l4.AbstractC6934o.e(gVar);
    }

    public void d() {
        synchronized (this) {
            this.f44108c = p115l4.AbstractC6934o.e(null);
        }
        this.f44107b.a();
    }

    public synchronized p115l4.AbstractC6931l e() {
        try {
            p115l4.AbstractC6931l abstractC6931l = this.f44108c;
            if (abstractC6931l == null || (abstractC6931l.n() && !this.f44108c.o())) {
                java.util.concurrent.Executor executor = this.f44106a;
                final com.google.firebase.remoteconfig.internal.u uVar = this.f44107b;
                j$.util.Objects.requireNonNull(uVar);
                this.f44108c = p115l4.AbstractC6934o.c(executor, new java.util.concurrent.Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return uVar.d();
                    }
                });
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f44108c;
    }

    public com.google.firebase.remoteconfig.internal.g f() {
        return g(5L);
    }

    com.google.firebase.remoteconfig.internal.g g(long j6) {
        synchronized (this) {
            try {
                p115l4.AbstractC6931l abstractC6931l = this.f44108c;
                if (abstractC6931l == null || !abstractC6931l.o()) {
                    try {
                        return (com.google.firebase.remoteconfig.internal.g) c(e(), j6, java.util.concurrent.TimeUnit.SECONDS);
                    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e6) {
                        return null;
                    }
                }
                return (com.google.firebase.remoteconfig.internal.g) this.f44108c.l();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public p115l4.AbstractC6931l k(com.google.firebase.remoteconfig.internal.g gVar) {
        return l(gVar, true);
    }

    public p115l4.AbstractC6931l l(final com.google.firebase.remoteconfig.internal.g gVar, final boolean z6) {
        return p115l4.AbstractC6934o.c(this.f44106a, new java.util.concurrent.Callable() { // from class: com.google.firebase.remoteconfig.internal.d
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f44099a.i(gVar);
            }
        }).p(this.f44106a, new p115l4.InterfaceC6930k() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // p115l4.InterfaceC6930k
            public final p115l4.AbstractC6931l a(java.lang.Object obj) {
                return this.f44101a.j(z6, gVar, (java.lang.Void) obj);
            }
        });
    }
}
