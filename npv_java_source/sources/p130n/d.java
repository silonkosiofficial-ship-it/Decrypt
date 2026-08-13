package p130n;

/* JADX INFO: loaded from: classes.dex */
public class d extends p130n.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f51301a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f51302b = java.util.concurrent.Executors.newFixedThreadPool(4, new n.d.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile android.os.Handler f51303c;

    class a implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.concurrent.atomic.AtomicInteger f51304a = new java.util.concurrent.atomic.AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setName("arch_disk_io_" + this.f51304a.getAndIncrement());
            return thread;
        }
    }

    private static class b {
        public static android.os.Handler a(android.os.Looper looper) {
            return android.os.Handler.createAsync(looper);
        }
    }

    private static android.os.Handler d(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return n.d.b.a(looper);
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException unused) {
            return new android.os.Handler(looper);
        } catch (java.lang.reflect.InvocationTargetException unused2) {
            return new android.os.Handler(looper);
        }
    }

    @Override // p130n.e
    public void a(java.lang.Runnable runnable) {
        this.f51302b.execute(runnable);
    }

    @Override // p130n.e
    public boolean b() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }

    @Override // p130n.e
    public void c(java.lang.Runnable runnable) {
        if (this.f51303c == null) {
            synchronized (this.f51301a) {
                try {
                    if (this.f51303c == null) {
                        this.f51303c = d(android.os.Looper.getMainLooper());
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        this.f51303c.post(runnable);
    }
}
