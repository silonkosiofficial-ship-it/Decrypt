package D;

/* JADX INFO: renamed from: D.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0864a implements D.P, V.Z0, java.lang.Runnable, android.view.Choreographer.FrameCallback {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final D.RunnableC0864a.C0033a f1620I = new D.RunnableC0864a.C0033a(null);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f1621J = 8;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static long f1622K;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.view.View f1623C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f1625E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f1627G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f1628H;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final X.b f1624D = new X.b(new D.N[16], 0);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final android.view.Choreographer f1626F = android.view.Choreographer.getInstance();

    /* JADX INFO: renamed from: D.a$a, reason: collision with other inner class name */
    public static final class C0033a {
        private C0033a() {
        }

        public /* synthetic */ C0033a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        public final void b(android.view.View view) {
            float refreshRate;
            if (D.RunnableC0864a.f1622K == 0) {
                android.view.Display display = view.getDisplay();
                if (view.isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                D.RunnableC0864a.f1622K = (long) (1000000000 / refreshRate);
            }
        }
    }

    /* JADX INFO: renamed from: D.a$b */
    public static final class b implements D.O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f1629a;

        public b(long j6) {
            this.f1629a = j6;
        }

        @Override // D.O
        public long a() {
            return java.lang.Math.max(0L, this.f1629a - java.lang.System.nanoTime());
        }
    }

    public RunnableC0864a(android.view.View view) {
        this.f1623C = view;
        f1620I.b(view);
    }

    @Override // D.P
    public void a(D.N n6) {
        this.f1624D.d(n6);
        if (this.f1625E) {
            return;
        }
        this.f1625E = true;
        this.f1623C.post(this);
    }

    @Override // V.Z0
    public void b() {
    }

    @Override // V.Z0
    public void c() {
        this.f1627G = false;
        this.f1623C.removeCallbacks(this);
        this.f1626F.removeFrameCallback(this);
    }

    @Override // V.Z0
    public void d() {
        this.f1627G = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j6) {
        if (this.f1627G) {
            this.f1628H = j6;
            this.f1623C.post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f1624D.w() || !this.f1625E || !this.f1627G || this.f1623C.getWindowVisibility() != 0) {
            this.f1625E = false;
            return;
        }
        D.RunnableC0864a.b bVar = new D.RunnableC0864a.b(this.f1628H + f1622K);
        boolean z6 = false;
        while (this.f1624D.x() && !z6) {
            if (bVar.a() <= 0 || ((D.N) this.f1624D.s()[0]).b(bVar)) {
                z6 = true;
            } else {
                this.f1624D.D(0);
            }
        }
        if (z6) {
            this.f1626F.postFrameCallback(this);
        } else {
            this.f1625E = false;
        }
    }
}
