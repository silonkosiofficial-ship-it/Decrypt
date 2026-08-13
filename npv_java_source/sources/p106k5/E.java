package p106k5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E {

    class a implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f49557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.concurrent.atomic.AtomicLong f49558b;

        /* JADX INFO: renamed from: k5.E$a$a, reason: collision with other inner class name */
        class C0622a extends p106k5.AbstractRunnableC6893d {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ java.lang.Runnable f49559C;

            C0622a(java.lang.Runnable runnable) {
                this.f49559C = runnable;
            }

            @Override // p106k5.AbstractRunnableC6893d
            public void a() {
                this.f49559C.run();
            }
        }

        a(java.lang.String str, java.util.concurrent.atomic.AtomicLong atomicLong) {
            this.f49557a = str;
            this.f49558b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread threadNewThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(new k5.E.a.C0622a(runnable));
            threadNewThread.setName(this.f49557a + this.f49558b.getAndIncrement());
            return threadNewThread;
        }
    }

    class b extends p106k5.AbstractRunnableC6893d {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.lang.String f49561C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.concurrent.ExecutorService f49562D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f49563E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.util.concurrent.TimeUnit f49564F;

        b(java.lang.String str, java.util.concurrent.ExecutorService executorService, long j6, java.util.concurrent.TimeUnit timeUnit) {
            this.f49561C = str;
            this.f49562D = executorService;
            this.f49563E = j6;
            this.f49564F = timeUnit;
        }

        @Override // p106k5.AbstractRunnableC6893d
        public void a() {
            try {
                p076h5.g.f().b("Executing shutdown hook for " + this.f49561C);
                this.f49562D.shutdown();
                if (this.f49562D.awaitTermination(this.f49563E, this.f49564F)) {
                    return;
                }
                p076h5.g.f().b(this.f49561C + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f49562D.shutdownNow();
            } catch (java.lang.InterruptedException unused) {
                p076h5.g.f().b(java.lang.String.format(java.util.Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f49561C));
                this.f49562D.shutdownNow();
            }
        }
    }

    private static void a(java.lang.String str, java.util.concurrent.ExecutorService executorService) {
        b(str, executorService, 2L, java.util.concurrent.TimeUnit.SECONDS);
    }

    private static void b(java.lang.String str, java.util.concurrent.ExecutorService executorService, long j6, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Runtime.getRuntime().addShutdownHook(new java.lang.Thread(new k5.E.b(str, executorService, j6, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static java.util.concurrent.ExecutorService c(java.lang.String str) {
        java.util.concurrent.ExecutorService executorServiceE = e(d(str), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static java.util.concurrent.ThreadFactory d(java.lang.String str) {
        return new k5.E.a(str, new java.util.concurrent.atomic.AtomicLong(1L));
    }

    private static java.util.concurrent.ExecutorService e(java.util.concurrent.ThreadFactory threadFactory, java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler) {
        return java.util.concurrent.Executors.unconfigurableExecutorService(new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
