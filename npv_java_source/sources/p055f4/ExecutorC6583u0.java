package p055f4;

/* JADX INFO: renamed from: f4.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ExecutorC6583u0 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.ThreadPoolExecutor f45255D;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f45254C = new java.util.concurrent.atomic.AtomicInteger(1);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.ref.WeakReference f45256E = new java.lang.ref.WeakReference(null);

    ExecutorC6583u0(java.lang.String str) {
        final java.lang.String str2 = "Google consent worker";
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new java.util.concurrent.ThreadFactory(str2) { // from class: f4.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f45252b = "Google consent worker";

            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return this.f45251a.b(this.f45252b, runnable);
            }
        });
        this.f45255D = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    final /* synthetic */ java.lang.Thread b(java.lang.String str, java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, "Google consent worker #" + this.f45254C.getAndIncrement());
        this.f45256E = new java.lang.ref.WeakReference(thread);
        return thread;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() == this.f45256E.get()) {
            runnable.run();
        } else {
            this.f45255D.execute(runnable);
        }
    }
}
