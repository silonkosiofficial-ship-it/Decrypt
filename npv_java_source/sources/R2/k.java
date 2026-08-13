package R2;

/* JADX INFO: loaded from: classes.dex */
public class k implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.Executor f9430D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private volatile java.lang.Runnable f9432F;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.ArrayDeque f9429C = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object f9431E = new java.lang.Object();

    static class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final R2.k f9433C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final java.lang.Runnable f9434D;

        a(R2.k kVar, java.lang.Runnable runnable) {
            this.f9433C = kVar;
            this.f9434D = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9434D.run();
            } finally {
                this.f9433C.c();
            }
        }
    }

    public k(java.util.concurrent.Executor executor) {
        this.f9430D = executor;
    }

    public boolean b() {
        boolean z6;
        synchronized (this.f9431E) {
            z6 = !this.f9429C.isEmpty();
        }
        return z6;
    }

    void c() {
        synchronized (this.f9431E) {
            try {
                java.lang.Runnable runnable = (java.lang.Runnable) this.f9429C.poll();
                this.f9432F = runnable;
                if (runnable != null) {
                    this.f9430D.execute(this.f9432F);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        synchronized (this.f9431E) {
            try {
                this.f9429C.add(new R2.k.a(this, runnable));
                if (this.f9432F == null) {
                    c();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
