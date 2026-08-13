package p053f2;

/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static android.os.Handler f44926G;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile f2.c.e f44928D = f2.c.e.PENDING;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicBoolean f44929E = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicBoolean f44930F = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.FutureTask f44927C = new f2.c.b(new f2.c.a());

    class a implements java.util.concurrent.Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public java.lang.Object call() {
            p053f2.c.this.f44930F.set(true);
            java.lang.Object objB = null;
            try {
                android.os.Process.setThreadPriority(10);
                objB = p053f2.c.this.b();
                android.os.Binder.flushPendingCommands();
                p053f2.c.this.i(objB);
                return objB;
            } catch (java.lang.Throwable th) {
                try {
                    p053f2.c.this.f44929E.set(true);
                    throw th;
                } catch (java.lang.Throwable th2) {
                    p053f2.c.this.i(objB);
                    throw th2;
                }
            }
        }
    }

    class b extends java.util.concurrent.FutureTask {
        b(java.util.concurrent.Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                p053f2.c.this.j(get());
            } catch (java.lang.InterruptedException e6) {
            } catch (java.util.concurrent.CancellationException unused) {
                p053f2.c.this.j(null);
            } catch (java.util.concurrent.ExecutionException e10) {
                throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", e10.getCause());
            } catch (java.lang.Throwable th) {
                throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: f2.c$c, reason: collision with other inner class name */
    class RunnableC0503c implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f44933C;

        RunnableC0503c(java.lang.Object obj) {
            this.f44933C = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            p053f2.c.this.d(this.f44933C);
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44935a;

        static {
            int[] iArr = new int[f2.c.e.values().length];
            f44935a = iArr;
            try {
                iArr[f2.c.e.RUNNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f44935a[f2.c.e.FINISHED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    c() {
    }

    private static android.os.Handler e() {
        android.os.Handler handler;
        synchronized (p053f2.c.class) {
            try {
                if (f44926G == null) {
                    f44926G = new android.os.Handler(android.os.Looper.getMainLooper());
                }
                handler = f44926G;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final boolean a(boolean z6) {
        this.f44929E.set(true);
        return this.f44927C.cancel(z6);
    }

    protected abstract java.lang.Object b();

    public final void c(java.util.concurrent.Executor executor) {
        if (this.f44928D == f2.c.e.PENDING) {
            this.f44928D = f2.c.e.RUNNING;
            executor.execute(this.f44927C);
            return;
        }
        int i6 = f2.c.d.f44935a[this.f44928D.ordinal()];
        if (i6 == 1) {
            throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i6 == 2) {
            throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new java.lang.IllegalStateException("We should never reach this state");
    }

    void d(java.lang.Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f44928D = f2.c.e.FINISHED;
    }

    public final boolean f() {
        return this.f44929E.get();
    }

    protected abstract void g(java.lang.Object obj);

    protected abstract void h(java.lang.Object obj);

    void i(java.lang.Object obj) {
        e().post(new p053f2.c.RunnableC0503c(obj));
    }

    void j(java.lang.Object obj) {
        if (this.f44930F.get()) {
            return;
        }
        i(obj);
    }
}
