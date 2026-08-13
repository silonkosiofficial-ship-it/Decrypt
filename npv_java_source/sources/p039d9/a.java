package p039d9;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements java.util.concurrent.Executor, java.io.Closeable {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final p039d9.a.C0490a f44299J = new p039d9.a.C0490a(null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f44300K = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p039d9.a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f44301L = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p039d9.a.class, "controlState$volatile");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f44302M = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p039d9.a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final p019b9.D f44303N = new p019b9.D("NOT_IN_STACK");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f44304C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f44305D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f44306E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f44307F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final p039d9.d f44308G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p039d9.d f44309H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final p019b9.y f44310I;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: d9.a$a, reason: collision with other inner class name */
    public static final class C0490a {
        private C0490a() {
        }

        public /* synthetic */ C0490a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44311a;

        static {
            int[] iArr = new int[d9.a.d.values().length];
            try {
                iArr[d9.a.d.PARKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[d9.a.d.BLOCKING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[d9.a.d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[d9.a.d.DORMANT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[d9.a.d.TERMINATED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            f44311a = iArr;
        }
    }

    public final class c extends java.lang.Thread {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f44312K = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(d9.a.c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public final p039d9.l f44313C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p247y7.O f44314D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public d9.a.d f44315E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private long f44316F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private long f44317G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private int f44318H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public boolean f44319I;
        private volatile int indexInArray;
        private volatile java.lang.Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(p039d9.a.this.getClass().getClassLoader());
            this.f44313C = new p039d9.l();
            this.f44314D = new p247y7.O();
            this.f44315E = d9.a.d.DORMANT;
            this.nextParkedWorker = p039d9.a.f44303N;
            int iNanoTime = (int) java.lang.System.nanoTime();
            this.f44318H = iNanoTime == 0 ? 42 : iNanoTime;
        }

        public c(p039d9.a aVar, int i6) {
            this();
            n(i6);
        }

        private final void b(p039d9.h hVar) {
            this.f44316F = 0L;
            if (this.f44315E == d9.a.d.PARKING) {
                this.f44315E = d9.a.d.BLOCKING;
            }
            if (!hVar.f44338D) {
                p039d9.a.this.r0(hVar);
                return;
            }
            if (r(d9.a.d.BLOCKING)) {
                p039d9.a.this.z0();
            }
            p039d9.a.this.r0(hVar);
            p039d9.a.N().addAndGet(p039d9.a.this, -2097152L);
            if (this.f44315E != d9.a.d.TERMINATED) {
                this.f44315E = d9.a.d.DORMANT;
            }
        }

        private final p039d9.h c(boolean z6) {
            p039d9.h hVarL;
            p039d9.h hVarL2;
            if (z6) {
                boolean z10 = j(p039d9.a.this.f44304C * 2) == 0;
                if (z10 && (hVarL2 = l()) != null) {
                    return hVarL2;
                }
                p039d9.h hVarK = this.f44313C.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z10 && (hVarL = l()) != null) {
                    return hVarL;
                }
            } else {
                p039d9.h hVarL3 = l();
                if (hVarL3 != null) {
                    return hVarL3;
                }
            }
            return s(3);
        }

        private final p039d9.h d() {
            p039d9.h hVarL = this.f44313C.l();
            if (hVarL != null) {
                return hVarL;
            }
            p039d9.h hVar = (p039d9.h) p039d9.a.this.f44309H.e();
            return hVar == null ? s(1) : hVar;
        }

        private final boolean i() {
            return this.nextParkedWorker != p039d9.a.f44303N;
        }

        private final void k() {
            if (this.f44316F == 0) {
                this.f44316F = java.lang.System.nanoTime() + p039d9.a.this.f44306E;
            }
            java.util.concurrent.locks.LockSupport.parkNanos(p039d9.a.this.f44306E);
            if (java.lang.System.nanoTime() - this.f44316F >= 0) {
                this.f44316F = 0L;
                t();
            }
        }

        private final p039d9.h l() {
            p039d9.d dVar;
            if (j(2) == 0) {
                p039d9.h hVar = (p039d9.h) p039d9.a.this.f44308G.e();
                if (hVar != null) {
                    return hVar;
                }
                dVar = p039d9.a.this.f44309H;
            } else {
                p039d9.h hVar2 = (p039d9.h) p039d9.a.this.f44309H.e();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = p039d9.a.this.f44308G;
            }
            return (p039d9.h) dVar.e();
        }

        private final void m() {
            loop0: while (true) {
                boolean z6 = false;
                while (true) {
                    if (p039d9.a.this.isTerminated() || this.f44315E == d9.a.d.TERMINATED) {
                        break loop0;
                    }
                    p039d9.h hVarE = e(this.f44319I);
                    if (hVarE != null) {
                        this.f44317G = 0L;
                        b(hVarE);
                        break;
                    }
                    this.f44319I = false;
                    if (this.f44317G == 0) {
                        q();
                    } else {
                        if (z6) {
                            r(d9.a.d.PARKING);
                            java.lang.Thread.interrupted();
                            java.util.concurrent.locks.LockSupport.parkNanos(this.f44317G);
                            this.f44317G = 0L;
                            break;
                        }
                        z6 = true;
                    }
                }
            }
            r(d9.a.d.TERMINATED);
        }

        private final boolean p() {
            long j6;
            if (this.f44315E == d9.a.d.CPU_ACQUIRED) {
                return true;
            }
            p039d9.a aVar = p039d9.a.this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdaterN = p039d9.a.N();
            do {
                j6 = atomicLongFieldUpdaterN.get(aVar);
                if (((int) ((9223367638808264704L & j6) >> 42)) == 0) {
                    return false;
                }
            } while (!p039d9.a.N().compareAndSet(aVar, j6, j6 - 4398046511104L));
            this.f44315E = d9.a.d.CPU_ACQUIRED;
            return true;
        }

        private final void q() {
            if (!i()) {
                p039d9.a.this.o0(this);
                return;
            }
            f44312K.set(this, -1);
            while (i() && f44312K.get(this) == -1 && !p039d9.a.this.isTerminated() && this.f44315E != d9.a.d.TERMINATED) {
                r(d9.a.d.PARKING);
                java.lang.Thread.interrupted();
                k();
            }
        }

        private final p039d9.h s(int i6) {
            int i10 = (int) (p039d9.a.N().get(p039d9.a.this) & 2097151);
            if (i10 < 2) {
                return null;
            }
            int iJ = j(i10);
            p039d9.a aVar = p039d9.a.this;
            long jMin = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                iJ++;
                if (iJ > i10) {
                    iJ = 1;
                }
                d9.a.c cVar = (d9.a.c) aVar.f44310I.b(iJ);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f44313C.r(i6, this.f44314D);
                    if (jR == -1) {
                        p247y7.O o6 = this.f44314D;
                        p039d9.h hVar = (p039d9.h) o6.f57254C;
                        o6.f57254C = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = java.lang.Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f44317G = jMin;
            return null;
        }

        private final void t() {
            p039d9.a aVar = p039d9.a.this;
            synchronized (aVar.f44310I) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (p039d9.a.N().get(aVar) & 2097151)) <= aVar.f44304C) {
                        return;
                    }
                    if (f44312K.compareAndSet(this, -1, 1)) {
                        int i6 = this.indexInArray;
                        n(0);
                        aVar.q0(this, i6, 0);
                        int andDecrement = (int) (p039d9.a.N().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i6) {
                            java.lang.Object objB = aVar.f44310I.b(andDecrement);
                            p247y7.AbstractC7350t.c(objB);
                            d9.a.c cVar = (d9.a.c) objB;
                            aVar.f44310I.c(i6, cVar);
                            cVar.n(i6);
                            aVar.q0(cVar, andDecrement, i6);
                        }
                        aVar.f44310I.c(andDecrement, null);
                        p087i7.M m6 = p087i7.M.f46721a;
                        this.f44315E = d9.a.d.TERMINATED;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        public final p039d9.h e(boolean z6) {
            return p() ? c(z6) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final java.lang.Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i6) {
            int i10 = this.f44318H;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >> 17);
            int i13 = i12 ^ (i12 << 5);
            this.f44318H = i13;
            int i14 = i6 - 1;
            return (i14 & i6) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % i6;
        }

        public final void n(int i6) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(p039d9.a.this.f44307F);
            sb.append("-worker-");
            sb.append(i6 == 0 ? "TERMINATED" : java.lang.String.valueOf(i6));
            setName(sb.toString());
            this.indexInArray = i6;
        }

        public final void o(java.lang.Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d9.a.d dVar) {
            d9.a.d dVar2 = this.f44315E;
            boolean z6 = dVar2 == d9.a.d.CPU_ACQUIRED;
            if (z6) {
                p039d9.a.N().addAndGet(p039d9.a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f44315E = dVar;
            }
            return z6;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f44327I = p157p7.b.a(e());
    }

    public a(int i6, int i10, long j6, java.lang.String str) {
        this.f44304C = i6;
        this.f44305D = i10;
        this.f44306E = j6;
        this.f44307F = str;
        if (i6 < 1) {
            throw new java.lang.IllegalArgumentException(("Core pool size " + i6 + " should be at least 1").toString());
        }
        if (i10 < i6) {
            throw new java.lang.IllegalArgumentException(("Max pool size " + i10 + " should be greater than or equals to core pool size " + i6).toString());
        }
        if (i10 > 2097150) {
            throw new java.lang.IllegalArgumentException(("Max pool size " + i10 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j6 <= 0) {
            throw new java.lang.IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
        }
        this.f44308G = new p039d9.d();
        this.f44309H = new p039d9.d();
        this.f44310I = new p019b9.y((i6 + 1) * 2);
        this.controlState$volatile = ((long) i6) << 42;
        this._isTerminated$volatile = 0;
    }

    private final p039d9.h E0(d9.a.c cVar, p039d9.h hVar, boolean z6) {
        d9.a.d dVar;
        if (cVar == null || (dVar = cVar.f44315E) == d9.a.d.TERMINATED) {
            return hVar;
        }
        if (!hVar.f44338D && dVar == d9.a.d.BLOCKING) {
            return hVar;
        }
        cVar.f44319I = true;
        return cVar.f44313C.a(hVar, z6);
    }

    public static /* synthetic */ void H(p039d9.a aVar, java.lang.Runnable runnable, boolean z6, boolean z10, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        if ((i6 & 4) != 0) {
            z10 = false;
        }
        aVar.D(runnable, z6, z10);
    }

    private final boolean K0(long j6) {
        if (E7.j.d(((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21)), 0) < this.f44304C) {
            int i6 = i();
            if (i6 == 1 && this.f44304C > 1) {
                i();
            }
            if (i6 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater N() {
        return f44301L;
    }

    static /* synthetic */ boolean P0(p039d9.a aVar, long j6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            j6 = f44301L.get(aVar);
        }
        return aVar.K0(j6);
    }

    private final boolean R0() {
        d9.a.c cVarN0;
        do {
            cVarN0 = n0();
            if (cVarN0 == null) {
                return false;
            }
        } while (!d9.a.c.f44312K.compareAndSet(cVarN0, -1, 0));
        java.util.concurrent.locks.LockSupport.unpark(cVarN0);
        return true;
    }

    private final boolean g(p039d9.h hVar) {
        return (hVar.f44338D ? this.f44309H : this.f44308G).a(hVar);
    }

    private final int g0(d9.a.c cVar) {
        int iF;
        do {
            java.lang.Object objG = cVar.g();
            if (objG == f44303N) {
                return -1;
            }
            if (objG == null) {
                return 0;
            }
            cVar = (d9.a.c) objG;
            iF = cVar.f();
        } while (iF == 0);
        return iF;
    }

    private final int i() {
        synchronized (this.f44310I) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j6 = f44301L.get(this);
                int i6 = (int) (j6 & 2097151);
                int iD = E7.j.d(i6 - ((int) ((j6 & 4398044413952L) >> 21)), 0);
                if (iD >= this.f44304C) {
                    return 0;
                }
                if (i6 >= this.f44305D) {
                    return 0;
                }
                int i10 = ((int) (N().get(this) & 2097151)) + 1;
                if (i10 <= 0 || this.f44310I.b(i10) != null) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                d9.a.c cVar = new d9.a.c(this, i10);
                this.f44310I.c(i10, cVar);
                if (i10 != ((int) (2097151 & f44301L.incrementAndGet(this)))) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                int i11 = iD + 1;
                cVar.start();
                return i11;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private final d9.a.c n0() {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f44300K;
        while (true) {
            long j6 = atomicLongFieldUpdater.get(this);
            d9.a.c cVar = (d9.a.c) this.f44310I.b((int) (2097151 & j6));
            if (cVar == null) {
                return null;
            }
            long j10 = (2097152 + j6) & (-2097152);
            int iG0 = g0(cVar);
            if (iG0 >= 0 && f44300K.compareAndSet(this, j6, ((long) iG0) | j10)) {
                cVar.o(f44303N);
                return cVar;
            }
        }
    }

    private final d9.a.c y() {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        d9.a.c cVar = threadCurrentThread instanceof d9.a.c ? (d9.a.c) threadCurrentThread : null;
        if (cVar == null || !p247y7.AbstractC7350t.b(p039d9.a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final void y0(long j6, boolean z6) {
        if (z6 || R0() || K0(j6)) {
            return;
        }
        R0();
    }

    public final void D(java.lang.Runnable runnable, boolean z6, boolean z10) {
        W8.AbstractC1776c.a();
        p039d9.h hVarO = o(runnable, z6);
        boolean z11 = hVarO.f44338D;
        long jAddAndGet = z11 ? f44301L.addAndGet(this, 2097152L) : 0L;
        d9.a.c cVarY = y();
        p039d9.h hVarE0 = E0(cVarY, hVarO, z10);
        if (hVarE0 != null && !g(hVarE0)) {
            throw new java.util.concurrent.RejectedExecutionException(this.f44307F + " was terminated");
        }
        boolean z12 = z10 && cVarY != null;
        if (z11) {
            y0(jAddAndGet, z12);
        } else {
            if (z12) {
                return;
            }
            z0();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.InterruptedException {
        x0(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        H(this, runnable, false, false, 6, null);
    }

    public final boolean isTerminated() {
        return f44302M.get(this) != 0;
    }

    public final p039d9.h o(java.lang.Runnable runnable, boolean z6) {
        long jA = p039d9.j.f44345f.a();
        if (!(runnable instanceof p039d9.h)) {
            return p039d9.j.b(runnable, jA, z6);
        }
        p039d9.h hVar = (p039d9.h) runnable;
        hVar.f44337C = jA;
        hVar.f44338D = z6;
        return hVar;
    }

    public final boolean o0(d9.a.c cVar) {
        long j6;
        int iF;
        if (cVar.g() != f44303N) {
            return false;
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f44300K;
        do {
            j6 = atomicLongFieldUpdater.get(this);
            iF = cVar.f();
            cVar.o(this.f44310I.b((int) (2097151 & j6)));
        } while (!f44300K.compareAndSet(this, j6, ((2097152 + j6) & (-2097152)) | ((long) iF)));
        return true;
    }

    public final void q0(d9.a.c cVar, int i6, int i10) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f44300K;
        while (true) {
            long j6 = atomicLongFieldUpdater.get(this);
            int iG0 = (int) (2097151 & j6);
            long j10 = (2097152 + j6) & (-2097152);
            if (iG0 == i6) {
                iG0 = i10 == 0 ? g0(cVar) : i10;
            }
            if (iG0 >= 0 && f44300K.compareAndSet(this, j6, j10 | ((long) iG0))) {
                return;
            }
        }
    }

    public final void r0(p039d9.h hVar) {
        try {
            hVar.run();
        } catch (java.lang.Throwable th) {
            try {
                java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                W8.AbstractC1776c.a();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        char c6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iA = this.f44310I.a();
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < iA; i14++) {
            d9.a.c cVar = (d9.a.c) this.f44310I.b(i14);
            if (cVar != null) {
                int i15 = cVar.f44313C.i();
                int i16 = d9.a.b.f44311a[cVar.f44315E.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        i10++;
                        sb = new java.lang.StringBuilder();
                        sb.append(i15);
                        c6 = 'b';
                    } else if (i16 == 3) {
                        i6++;
                        sb = new java.lang.StringBuilder();
                        sb.append(i15);
                        c6 = 'c';
                    } else if (i16 == 4) {
                        i12++;
                        if (i15 > 0) {
                            sb = new java.lang.StringBuilder();
                            sb.append(i15);
                            c6 = 'd';
                        }
                    } else {
                        if (i16 != 5) {
                            throw new p087i7.s();
                        }
                        i13++;
                    }
                    sb.append(c6);
                    arrayList.add(sb.toString());
                } else {
                    i11++;
                }
            }
        }
        long j6 = f44301L.get(this);
        return this.f44307F + '@' + W8.S.b(this) + "[Pool Size {core = " + this.f44304C + ", max = " + this.f44305D + "}, Worker States {CPU = " + i6 + ", blocking = " + i10 + ", parked = " + i11 + ", dormant = " + i12 + ", terminated = " + i13 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f44308G.c() + ", global blocking queue size = " + this.f44309H.c() + ", Control State {created workers= " + ((int) (2097151 & j6)) + ", blocking tasks = " + ((int) ((4398044413952L & j6) >> 21)) + ", CPUs acquired = " + (this.f44304C - ((int) ((9223367638808264704L & j6) >> 42))) + "}]";
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public final void x0(long j6) throws java.lang.InterruptedException {
        int i6;
        p039d9.h hVarE;
        if (f44302M.compareAndSet(this, 0, 1)) {
            d9.a.c cVarY = y();
            synchronized (this.f44310I) {
                i6 = (int) (N().get(this) & 2097151);
            }
            if (1 <= i6) {
                int i10 = 1;
                while (true) {
                    java.lang.Object objB = this.f44310I.b(i10);
                    p247y7.AbstractC7350t.c(objB);
                    d9.a.c cVar = (d9.a.c) objB;
                    if (cVar != cVarY) {
                        while (cVar.getState() != java.lang.Thread.State.TERMINATED) {
                            java.util.concurrent.locks.LockSupport.unpark(cVar);
                            cVar.join(j6);
                        }
                        cVar.f44313C.j(this.f44309H);
                    }
                    if (i10 == i6) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f44309H.b();
            this.f44308G.b();
            while (true) {
                if (cVarY == null) {
                    hVarE = (p039d9.h) this.f44308G.e();
                    if (hVarE == null && (hVarE = (p039d9.h) this.f44309H.e()) == null) {
                        break;
                    }
                } else {
                    hVarE = cVarY.e(true);
                    if (hVarE == null) {
                        hVarE = (p039d9.h) this.f44308G.e();
                        if (hVarE == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                r0(hVarE);
            }
            if (cVarY != null) {
                cVarY.r(d9.a.d.TERMINATED);
            }
            f44300K.set(this, 0L);
            f44301L.set(this, 0L);
        }
    }

    public final void z0() {
        if (R0() || P0(this, 0L, 1, null)) {
            return;
        }
        R0();
    }
}
