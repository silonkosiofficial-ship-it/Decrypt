package p019b9;

/* JADX INFO: renamed from: b9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2124k extends W8.J implements W8.X {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f24362K = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p019b9.C2124k.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ W8.X f24363E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final W8.J f24364F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f24365G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.lang.String f24366H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p019b9.C2129p f24367I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.lang.Object f24368J;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: b9.k$a */
    private final class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private java.lang.Runnable f24369C;

        public a(java.lang.Runnable runnable) {
            this.f24369C = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i6 = 0;
            while (true) {
                try {
                    this.f24369C.run();
                } catch (java.lang.Throwable th) {
                    W8.L.a(p127m7.j.f51198C, th);
                }
                java.lang.Runnable runnableC1 = p019b9.C2124k.this.C1();
                if (runnableC1 == null) {
                    return;
                }
                this.f24369C = runnableC1;
                i6++;
                if (i6 >= 16 && p019b9.C2124k.this.f24364F.v1(p019b9.C2124k.this)) {
                    p019b9.C2124k.this.f24364F.t1(p019b9.C2124k.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2124k(W8.J j6, int i6, java.lang.String str) {
        W8.X x6 = j6 instanceof W8.X ? (W8.X) j6 : null;
        this.f24363E = x6 == null ? W8.U.a() : x6;
        this.f24364F = j6;
        this.f24365G = i6;
        this.f24366H = str;
        this.f24367I = new p019b9.C2129p(false);
        this.f24368J = new java.lang.Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Runnable C1() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.f24367I.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f24368J) {
                f24362K.decrementAndGet(this);
                if (this.f24367I.c() == 0) {
                    return null;
                }
                f24362K.incrementAndGet(this);
            }
        }
    }

    private final boolean D1() {
        synchronized (this.f24368J) {
            if (f24362K.get(this) >= this.f24365G) {
                return false;
            }
            f24362K.incrementAndGet(this);
            return true;
        }
    }

    @Override // W8.X
    public W8.InterfaceC1783f0 m1(long j6, java.lang.Runnable runnable, p127m7.i iVar) {
        return this.f24363E.m1(j6, runnable, iVar);
    }

    @Override // W8.J
    public void t1(p127m7.i iVar, java.lang.Runnable runnable) {
        java.lang.Runnable runnableC1;
        this.f24367I.a(runnable);
        if (f24362K.get(this) >= this.f24365G || !D1() || (runnableC1 = C1()) == null) {
            return;
        }
        this.f24364F.t1(this, new p019b9.C2124k.a(runnableC1));
    }

    @Override // W8.J
    public java.lang.String toString() {
        java.lang.String str = this.f24366H;
        if (str != null) {
            return str;
        }
        return this.f24364F + ".limitedParallelism(" + this.f24365G + ')';
    }

    @Override // W8.J
    public void u1(p127m7.i iVar, java.lang.Runnable runnable) {
        java.lang.Runnable runnableC1;
        this.f24367I.a(runnable);
        if (f24362K.get(this) >= this.f24365G || !D1() || (runnableC1 = C1()) == null) {
            return;
        }
        this.f24364F.u1(this, new p019b9.C2124k.a(runnableC1));
    }

    @Override // W8.X
    public void x0(long j6, W8.InterfaceC1794l interfaceC1794l) {
        this.f24363E.x0(j6, interfaceC1794l);
    }

    @Override // W8.J
    public W8.J x1(int i6, java.lang.String str) {
        p019b9.AbstractC2125l.a(i6);
        return i6 >= this.f24365G ? p019b9.AbstractC2125l.b(this, str) : super.x1(i6, str);
    }
}
