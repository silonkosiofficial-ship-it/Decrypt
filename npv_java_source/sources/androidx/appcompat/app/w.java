package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class w implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f17646C = new java.lang.Object();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final java.util.Queue f17647D = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final java.util.concurrent.Executor f17648E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    java.lang.Runnable f17649F;

    w(java.util.concurrent.Executor executor) {
        this.f17648E = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } finally {
            d();
        }
    }

    protected void d() {
        synchronized (this.f17646C) {
            try {
                java.lang.Runnable runnable = (java.lang.Runnable) this.f17647D.poll();
                this.f17649F = runnable;
                if (runnable != null) {
                    this.f17648E.execute(runnable);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final java.lang.Runnable runnable) {
        synchronized (this.f17646C) {
            try {
                this.f17647D.add(new java.lang.Runnable() { // from class: androidx.appcompat.app.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17644C.c(runnable);
                    }
                });
                if (this.f17649F == null) {
                    d();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
