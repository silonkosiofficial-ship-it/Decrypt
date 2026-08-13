package p143o2;

/* JADX INFO: loaded from: classes.dex */
public final class z implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.Executor f52532C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.ArrayDeque f52533D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.Runnable f52534E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.Object f52535F;

    public z(java.util.concurrent.Executor executor) {
        p247y7.AbstractC7350t.f(executor, "executor");
        this.f52532C = executor;
        this.f52533D = new java.util.ArrayDeque();
        this.f52535F = new java.lang.Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(java.lang.Runnable runnable, p143o2.z zVar) {
        try {
            runnable.run();
        } finally {
            zVar.d();
        }
    }

    public final void d() {
        synchronized (this.f52535F) {
            try {
                java.lang.Object objPoll = this.f52533D.poll();
                java.lang.Runnable runnable = (java.lang.Runnable) objPoll;
                this.f52534E = runnable;
                if (objPoll != null) {
                    this.f52532C.execute(runnable);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final java.lang.Runnable runnable) {
        p247y7.AbstractC7350t.f(runnable, "command");
        synchronized (this.f52535F) {
            try {
                this.f52533D.offer(new java.lang.Runnable() { // from class: o2.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        p143o2.z.c(runnable, this);
                    }
                });
                if (this.f52534E == null) {
                    d();
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
