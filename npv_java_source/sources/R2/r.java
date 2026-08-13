package R2;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.String f9471f = I2.j.f("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ThreadFactory f9472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f9473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.util.Map f9474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final java.util.Map f9475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final java.lang.Object f9476e;

    class a implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9477a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread threadNewThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f9477a);
            this.f9477a = this.f9477a + 1;
            return threadNewThread;
        }
    }

    public interface b {
        void a(java.lang.String str);
    }

    public static class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final R2.r f9479C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final java.lang.String f9480D;

        c(R2.r rVar, java.lang.String str) {
            this.f9479C = rVar;
            this.f9480D = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f9479C.f9476e) {
                try {
                    if (((R2.r.c) this.f9479C.f9474c.remove(this.f9480D)) != null) {
                        R2.r.b bVar = (R2.r.b) this.f9479C.f9475d.remove(this.f9480D);
                        if (bVar != null) {
                            bVar.a(this.f9480D);
                        }
                    } else {
                        I2.j.c().a("WrkTimerRunnable", java.lang.String.format("Timer with %s is already marked as complete.", this.f9480D), new java.lang.Throwable[0]);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public r() {
        R2.r.a aVar = new R2.r.a();
        this.f9472a = aVar;
        this.f9474c = new java.util.HashMap();
        this.f9475d = new java.util.HashMap();
        this.f9476e = new java.lang.Object();
        this.f9473b = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f9473b.isShutdown()) {
            return;
        }
        this.f9473b.shutdownNow();
    }

    public void b(java.lang.String str, long j6, R2.r.b bVar) {
        synchronized (this.f9476e) {
            I2.j.c().a(f9471f, java.lang.String.format("Starting timer for %s", str), new java.lang.Throwable[0]);
            c(str);
            R2.r.c cVar = new R2.r.c(this, str);
            this.f9474c.put(str, cVar);
            this.f9475d.put(str, bVar);
            this.f9473b.schedule(cVar, j6, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    public void c(java.lang.String str) {
        synchronized (this.f9476e) {
            try {
                if (((R2.r.c) this.f9474c.remove(str)) != null) {
                    I2.j.c().a(f9471f, java.lang.String.format("Stopping timer for %s", str), new java.lang.Throwable[0]);
                    this.f9475d.remove(str);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
