package p176r5;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f53967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f53968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f53969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f53970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f53971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.BlockingQueue f53972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.ThreadPoolExecutor f53973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final W2.h f53974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p106k5.M f53975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f53976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f53977k;

    private final class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final p106k5.AbstractC6914z f53978C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p115l4.C6932m f53979D;

        private b(p106k5.AbstractC6914z abstractC6914z, p115l4.C6932m c6932m) {
            this.f53978C = abstractC6914z;
            this.f53979D = c6932m;
        }

        @Override // java.lang.Runnable
        public void run() {
            p176r5.e.this.p(this.f53978C, this.f53979D);
            p176r5.e.this.f53975i.c();
            double dG = p176r5.e.this.g();
            p076h5.g.f().b("Delay for: " + java.lang.String.format(java.util.Locale.US, "%.2f", java.lang.Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f53978C.d());
            p176r5.e.q(dG);
        }
    }

    e(double d6, double d10, long j6, W2.h hVar, p106k5.M m6) {
        this.f53967a = d6;
        this.f53968b = d10;
        this.f53969c = j6;
        this.f53974h = hVar;
        this.f53975i = m6;
        this.f53970d = android.os.SystemClock.elapsedRealtime();
        int i6 = (int) d6;
        this.f53971e = i6;
        java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue = new java.util.concurrent.ArrayBlockingQueue(i6);
        this.f53972f = arrayBlockingQueue;
        this.f53973g = new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f53976j = 0;
        this.f53977k = 0L;
    }

    e(W2.h hVar, p186s5.d dVar, p106k5.M m6) {
        this(dVar.f54366f, dVar.f54367g, ((long) dVar.f54368h) * 1000, hVar, m6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return java.lang.Math.min(3600000.0d, (60000.0d / this.f53967a) * java.lang.Math.pow(this.f53968b, h()));
    }

    private int h() {
        if (this.f53977k == 0) {
            this.f53977k = o();
        }
        int iO = (int) ((o() - this.f53977k) / this.f53969c);
        int iMin = l() ? java.lang.Math.min(100, this.f53976j + iO) : java.lang.Math.max(0, this.f53976j - iO);
        if (this.f53976j != iMin) {
            this.f53976j = iMin;
            this.f53977k = o();
        }
        return iMin;
    }

    private boolean k() {
        return this.f53972f.size() < this.f53971e;
    }

    private boolean l() {
        return this.f53972f.size() == this.f53971e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(java.util.concurrent.CountDownLatch countDownLatch) {
        try {
            Y2.l.a(this.f53974h, W2.e.HIGHEST);
        } catch (java.lang.Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(p115l4.C6932m c6932m, boolean z6, p106k5.AbstractC6914z abstractC6914z, java.lang.Exception exc) {
        if (exc != null) {
            c6932m.d(exc);
            return;
        }
        if (z6) {
            j();
        }
        c6932m.e(abstractC6914z);
    }

    private long o() {
        return java.lang.System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final p106k5.AbstractC6914z abstractC6914z, final p115l4.C6932m c6932m) {
        p076h5.g.f().b("Sending report through Google DataTransport: " + abstractC6914z.d());
        final boolean z6 = android.os.SystemClock.elapsedRealtime() - this.f53970d < 2000;
        this.f53974h.b(W2.c.g(abstractC6914z.b()), new W2.j() { // from class: r5.c
            @Override // W2.j
            public final void a(java.lang.Exception exc) {
                this.f53961a.n(c6932m, z6, abstractC6914z, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d6) {
        try {
            java.lang.Thread.sleep((long) d6);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    p115l4.C6932m i(p106k5.AbstractC6914z abstractC6914z, boolean z6) {
        synchronized (this.f53972f) {
            try {
                p115l4.C6932m c6932m = new p115l4.C6932m();
                if (!z6) {
                    p(abstractC6914z, c6932m);
                    return c6932m;
                }
                this.f53975i.b();
                if (!k()) {
                    h();
                    p076h5.g.f().b("Dropping report due to queue being full: " + abstractC6914z.d());
                    this.f53975i.a();
                    c6932m.e(abstractC6914z);
                    return c6932m;
                }
                p076h5.g.f().b("Enqueueing report: " + abstractC6914z.d());
                p076h5.g.f().b("Queue size: " + this.f53972f.size());
                this.f53973g.execute(new r5.e.b(abstractC6914z, c6932m));
                p076h5.g.f().b("Closing task for report: " + abstractC6914z.d());
                c6932m.e(abstractC6914z);
                return c6932m;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        new java.lang.Thread(new java.lang.Runnable() { // from class: r5.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f53965C.m(countDownLatch);
            }
        }).start();
        p106k5.c0.c(countDownLatch, 2L, java.util.concurrent.TimeUnit.SECONDS);
    }
}
