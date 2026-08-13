package L9;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L9.e.b f6460h = new L9.e.b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L9.e f6461i = new L9.e(new L9.e.c(I9.d.L(I9.d.f5555i + " TaskRunner", true)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final java.util.logging.Logger f6462j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L9.e.a f6463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f6466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f6467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f6468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.Runnable f6469g;

    public interface a {
        long b();

        void c(L9.e eVar);

        void d(L9.e eVar, long j6);

        void execute(java.lang.Runnable runnable);
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final java.util.logging.Logger a() {
            return L9.e.f6462j;
        }
    }

    public static final class c implements L9.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.concurrent.ThreadPoolExecutor f6470a;

        public c(java.util.concurrent.ThreadFactory threadFactory) {
            p247y7.AbstractC7350t.f(threadFactory, "threadFactory");
            this.f6470a = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), threadFactory);
        }

        @Override // L9.e.a
        public long b() {
            return java.lang.System.nanoTime();
        }

        @Override // L9.e.a
        public void c(L9.e eVar) {
            p247y7.AbstractC7350t.f(eVar, "taskRunner");
            eVar.notify();
        }

        @Override // L9.e.a
        public void d(L9.e eVar, long j6) throws java.lang.InterruptedException {
            p247y7.AbstractC7350t.f(eVar, "taskRunner");
            long j10 = j6 / 1000000;
            long j11 = j6 - (1000000 * j10);
            if (j10 > 0 || j6 > 0) {
                eVar.wait(j10, (int) j11);
            }
        }

        @Override // L9.e.a
        public void execute(java.lang.Runnable runnable) {
            p247y7.AbstractC7350t.f(runnable, "runnable");
            this.f6470a.execute(runnable);
        }
    }

    public static final class d implements java.lang.Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            L9.a aVarD;
            long jB;
            while (true) {
                L9.e eVar = L9.e.this;
                synchronized (eVar) {
                    aVarD = eVar.d();
                }
                if (aVarD == null) {
                    return;
                }
                L9.d dVarD = aVarD.d();
                p247y7.AbstractC7350t.c(dVarD);
                L9.e eVar2 = L9.e.this;
                boolean zIsLoggable = L9.e.f6460h.a().isLoggable(java.util.logging.Level.FINE);
                if (zIsLoggable) {
                    jB = dVarD.h().g().b();
                    L9.b.c(aVarD, dVarD, "starting");
                } else {
                    jB = -1;
                }
                try {
                    eVar2.j(aVarD);
                    try {
                        p087i7.M m6 = p087i7.M.f46721a;
                        if (zIsLoggable) {
                            L9.b.c(aVarD, dVarD, "finished run in " + L9.b.b(dVarD.h().g().b() - jB));
                        }
                    } catch (java.lang.Throwable th) {
                        if (zIsLoggable) {
                            L9.b.c(aVarD, dVarD, "failed a run in " + L9.b.b(dVarD.h().g().b() - jB));
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    eVar2.g().execute(this);
                    throw th2;
                }
            }
        }
    }

    static {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(L9.e.class.getName());
        p247y7.AbstractC7350t.e(logger, "getLogger(TaskRunner::class.java.name)");
        f6462j = logger;
    }

    public e(L9.e.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "backend");
        this.f6463a = aVar;
        this.f6464b = 10000;
        this.f6467e = new java.util.ArrayList();
        this.f6468f = new java.util.ArrayList();
        this.f6469g = new L9.e.d();
    }

    private final void c(L9.a aVar, long j6) {
        if (I9.d.f5554h && !java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        L9.d dVarD = aVar.d();
        p247y7.AbstractC7350t.c(dVarD);
        if (dVarD.c() != aVar) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean zD = dVarD.d();
        dVarD.m(false);
        dVarD.l(null);
        this.f6467e.remove(dVarD);
        if (j6 != -1 && !zD && !dVarD.g()) {
            dVarD.k(aVar, j6, true);
        }
        if (!dVarD.e().isEmpty()) {
            this.f6468f.add(dVarD);
        }
    }

    private final void e(L9.a aVar) {
        if (I9.d.f5554h && !java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        L9.d dVarD = aVar.d();
        p247y7.AbstractC7350t.c(dVarD);
        dVarD.e().remove(aVar);
        this.f6468f.remove(dVarD);
        dVarD.l(aVar);
        this.f6467e.add(dVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(L9.a aVar) {
        if (I9.d.f5554h && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.b());
        try {
            long jF = aVar.f();
            synchronized (this) {
                c(aVar, jF);
                p087i7.M m6 = p087i7.M.f46721a;
            }
        } finally {
            synchronized (this) {
                c(aVar, -1L);
                p087i7.M m10 = p087i7.M.f46721a;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final L9.a d() {
        boolean z6;
        if (I9.d.f5554h && !java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f6468f.isEmpty()) {
            long jB = this.f6463a.b();
            java.util.Iterator it = this.f6468f.iterator();
            long jMin = Long.MAX_VALUE;
            L9.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                L9.a aVar2 = (L9.a) ((L9.d) it.next()).e().get(0);
                long jMax = java.lang.Math.max(0L, aVar2.c() - jB);
                if (jMax > 0) {
                    jMin = java.lang.Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z6 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z6 || (!this.f6465c && (!this.f6468f.isEmpty()))) {
                    this.f6463a.execute(this.f6469g);
                }
                return aVar;
            }
            if (this.f6465c) {
                if (jMin < this.f6466d - jB) {
                    this.f6463a.c(this);
                }
                return null;
            }
            this.f6465c = true;
            this.f6466d = jB + jMin;
            try {
                try {
                    this.f6463a.d(this, jMin);
                } catch (java.lang.InterruptedException unused) {
                    f();
                }
                this.f6465c = false;
            } catch (java.lang.Throwable th) {
                this.f6465c = false;
                throw th;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.f6467e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((L9.d) this.f6467e.get(size)).b();
            }
        }
        for (int size2 = this.f6468f.size() - 1; -1 < size2; size2--) {
            L9.d dVar = (L9.d) this.f6468f.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f6468f.remove(size2);
            }
        }
    }

    public final L9.e.a g() {
        return this.f6463a;
    }

    public final void h(L9.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "taskQueue");
        if (I9.d.f5554h && !java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (dVar.c() == null) {
            if (!dVar.e().isEmpty()) {
                I9.d.c(this.f6468f, dVar);
            } else {
                this.f6468f.remove(dVar);
            }
        }
        if (this.f6465c) {
            this.f6463a.c(this);
        } else {
            this.f6463a.execute(this.f6469g);
        }
    }

    public final L9.d i() {
        int i6;
        synchronized (this) {
            i6 = this.f6464b;
            this.f6464b = i6 + 1;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('Q');
        sb.append(i6);
        return new L9.d(this, sb.toString());
    }
}
