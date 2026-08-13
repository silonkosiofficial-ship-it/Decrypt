package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes3.dex */
class o implements java.util.concurrent.ScheduledExecutorService {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f43992C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f43993D;

    o(java.util.concurrent.ExecutorService executorService, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f43992C = executorService;
        this.f43993D = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(java.lang.Runnable runnable, com.google.firebase.concurrent.p.b bVar) {
        try {
            runnable.run();
        } catch (java.lang.Exception e6) {
            bVar.a(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(java.lang.Runnable runnable, com.google.firebase.concurrent.p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (java.lang.Exception e6) {
            bVar.a(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(final java.lang.Runnable runnable, final com.google.firebase.concurrent.p.b bVar) {
        this.f43992C.execute(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.m
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.concurrent.o.n(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.concurrent.ScheduledFuture p(final java.lang.Runnable runnable, long j6, java.util.concurrent.TimeUnit timeUnit, final com.google.firebase.concurrent.p.b bVar) {
        return this.f43993D.schedule(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f43979C.o(runnable, bVar);
            }
        }, j6, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(java.util.concurrent.Callable callable, com.google.firebase.concurrent.p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (java.lang.Exception e6) {
            bVar.a(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.concurrent.Future t(final java.util.concurrent.Callable callable, final com.google.firebase.concurrent.p.b bVar) {
        return this.f43992C.submit(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.n
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.concurrent.o.q(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.concurrent.ScheduledFuture u(final java.util.concurrent.Callable callable, long j6, java.util.concurrent.TimeUnit timeUnit, final com.google.firebase.concurrent.p.b bVar) {
        return this.f43993D.schedule(new java.util.concurrent.Callable() { // from class: com.google.firebase.concurrent.k
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f43982a.t(callable, bVar);
            }
        }, j6, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(java.lang.Runnable runnable, com.google.firebase.concurrent.p.b bVar) throws java.lang.Exception {
        try {
            runnable.run();
        } catch (java.lang.Exception e6) {
            bVar.a(e6);
            throw e6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(final java.lang.Runnable runnable, final com.google.firebase.concurrent.p.b bVar) {
        this.f43992C.execute(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.d
            @Override // java.lang.Runnable
            public final void run() throws java.lang.Exception {
                com.google.firebase.concurrent.o.v(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.concurrent.ScheduledFuture x(final java.lang.Runnable runnable, long j6, long j10, java.util.concurrent.TimeUnit timeUnit, final com.google.firebase.concurrent.p.b bVar) {
        return this.f43993D.scheduleAtFixedRate(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f43976C.w(runnable, bVar);
            }
        }, j6, j10, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(final java.lang.Runnable runnable, final com.google.firebase.concurrent.p.b bVar) {
        this.f43992C.execute(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.concurrent.o.A(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.concurrent.ScheduledFuture z(final java.lang.Runnable runnable, long j6, long j10, java.util.concurrent.TimeUnit timeUnit, final com.google.firebase.concurrent.p.b bVar) {
        return this.f43993D.scheduleWithFixedDelay(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f43985C.y(runnable, bVar);
            }
        }, j6, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j6, java.util.concurrent.TimeUnit timeUnit) {
        return this.f43992C.awaitTermination(j6, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f43992C.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List invokeAll(java.util.Collection collection) {
        return this.f43992C.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List invokeAll(java.util.Collection collection, long j6, java.util.concurrent.TimeUnit timeUnit) {
        return this.f43992C.invokeAll(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.lang.Object invokeAny(java.util.Collection collection) {
        return this.f43992C.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.lang.Object invokeAny(java.util.Collection collection, long j6, java.util.concurrent.TimeUnit timeUnit) {
        return this.f43992C.invokeAny(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f43992C.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f43992C.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture schedule(final java.lang.Runnable runnable, final long j6, final java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.firebase.concurrent.p(new com.google.firebase.concurrent.p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.p.c
            public final java.util.concurrent.ScheduledFuture a(com.google.firebase.concurrent.p.b bVar) {
                return this.f43954a.p(runnable, j6, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture schedule(final java.util.concurrent.Callable callable, final long j6, final java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.firebase.concurrent.p(new com.google.firebase.concurrent.p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.p.c
            public final java.util.concurrent.ScheduledFuture a(com.google.firebase.concurrent.p.b bVar) {
                return this.f43972a.u(callable, j6, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture scheduleAtFixedRate(final java.lang.Runnable runnable, final long j6, final long j10, final java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.firebase.concurrent.p(new com.google.firebase.concurrent.p.c() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.p.c
            public final java.util.concurrent.ScheduledFuture a(com.google.firebase.concurrent.p.b bVar) {
                return this.f43962a.x(runnable, j6, j10, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(final java.lang.Runnable runnable, final long j6, final long j10, final java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.firebase.concurrent.p(new com.google.firebase.concurrent.p.c() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.p.c
            public final java.util.concurrent.ScheduledFuture a(com.google.firebase.concurrent.p.b bVar) {
                return this.f43967a.z(runnable, j6, j10, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List shutdownNow() {
        throw new java.lang.UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return this.f43992C.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return this.f43992C.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return this.f43992C.submit(callable);
    }
}
