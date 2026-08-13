package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class X extends W8.J {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final androidx.compose.ui.platform.X.c f20045O = new androidx.compose.ui.platform.X.c(null);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f20046P = 8;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f20047Q = p087i7.AbstractC6669o.b(androidx.compose.ui.platform.X.a.f20059D);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final java.lang.ThreadLocal f20048R = new androidx.compose.ui.platform.X.b();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.view.Choreographer f20049E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final android.os.Handler f20050F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.lang.Object f20051G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final p097j7.C6871m f20052H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.util.List f20053I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.util.List f20054J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f20055K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f20056L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final androidx.compose.ui.platform.X.d f20057M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final V.InterfaceC1723j0 f20058N;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.X.a f20059D = new androidx.compose.ui.platform.X.a();

        /* JADX INFO: renamed from: androidx.compose.ui.platform.X$a$a, reason: collision with other inner class name */
        static final class C0382a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f20060G;

            C0382a(p127m7.e eVar) {
                super(2, eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f20060G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                return android.view.Choreographer.getInstance();
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((androidx.compose.ui.platform.X.a.C0382a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new androidx.compose.ui.platform.X.a.C0382a(eVar);
            }
        }

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p127m7.i b() {
            androidx.compose.ui.platform.X x6 = new androidx.compose.ui.platform.X(androidx.compose.ui.platform.Y.b() ? android.view.Choreographer.getInstance() : (android.view.Choreographer) W8.AbstractC1784g.e(W8.C1779d0.c(), new androidx.compose.ui.platform.X.a.C0382a(null)), androidx.core.os.h.a(android.os.Looper.getMainLooper()), null);
            return x6.o0(x6.I1());
        }
    }

    public static final class b extends java.lang.ThreadLocal {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p127m7.i initialValue() {
            android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
            android.os.Looper looperMyLooper = android.os.Looper.myLooper();
            if (looperMyLooper == null) {
                throw new java.lang.IllegalStateException("no Looper on this thread".toString());
            }
            androidx.compose.ui.platform.X x6 = new androidx.compose.ui.platform.X(choreographer, androidx.core.os.h.a(looperMyLooper), null);
            return x6.o0(x6.I1());
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p127m7.i a() {
            if (androidx.compose.ui.platform.Y.b()) {
                return b();
            }
            p127m7.i iVar = (p127m7.i) androidx.compose.ui.platform.X.f20048R.get();
            if (iVar != null) {
                return iVar;
            }
            throw new java.lang.IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        public final p127m7.i b() {
            return (p127m7.i) androidx.compose.ui.platform.X.f20047Q.getValue();
        }
    }

    public static final class d implements android.view.Choreographer.FrameCallback, java.lang.Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j6) {
            androidx.compose.ui.platform.X.this.f20050F.removeCallbacks(this);
            androidx.compose.ui.platform.X.this.L1();
            androidx.compose.ui.platform.X.this.K1(j6);
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.compose.ui.platform.X.this.L1();
            java.lang.Object obj = androidx.compose.ui.platform.X.this.f20051G;
            androidx.compose.ui.platform.X x6 = androidx.compose.ui.platform.X.this;
            synchronized (obj) {
                try {
                    if (x6.f20053I.isEmpty()) {
                        x6.H1().removeFrameCallback(this);
                        x6.f20056L = false;
                    }
                    p087i7.M m6 = p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    private X(android.view.Choreographer choreographer, android.os.Handler handler) {
        this.f20049E = choreographer;
        this.f20050F = handler;
        this.f20051G = new java.lang.Object();
        this.f20052H = new p097j7.C6871m();
        this.f20053I = new java.util.ArrayList();
        this.f20054J = new java.util.ArrayList();
        this.f20057M = new androidx.compose.ui.platform.X.d();
        this.f20058N = new androidx.compose.ui.platform.Z(choreographer, this);
    }

    public /* synthetic */ X(android.view.Choreographer choreographer, android.os.Handler handler, p247y7.AbstractC7342k abstractC7342k) {
        this(choreographer, handler);
    }

    private final java.lang.Runnable J1() {
        java.lang.Runnable runnable;
        synchronized (this.f20051G) {
            runnable = (java.lang.Runnable) this.f20052H.S();
        }
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(long j6) {
        synchronized (this.f20051G) {
            if (this.f20056L) {
                this.f20056L = false;
                java.util.List list = this.f20053I;
                this.f20053I = this.f20054J;
                this.f20054J = list;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((android.view.Choreographer.FrameCallback) list.get(i6)).doFrame(j6);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L1() {
        boolean z6;
        while (true) {
            java.lang.Runnable runnableJ1 = J1();
            if (runnableJ1 != null) {
                runnableJ1.run();
            } else {
                synchronized (this.f20051G) {
                    if (this.f20052H.isEmpty()) {
                        z6 = false;
                        this.f20055K = false;
                    } else {
                        z6 = true;
                    }
                }
                if (!z6) {
                    return;
                }
            }
        }
    }

    public final android.view.Choreographer H1() {
        return this.f20049E;
    }

    public final V.InterfaceC1723j0 I1() {
        return this.f20058N;
    }

    public final void M1(android.view.Choreographer.FrameCallback frameCallback) {
        synchronized (this.f20051G) {
            try {
                this.f20053I.add(frameCallback);
                if (!this.f20056L) {
                    this.f20056L = true;
                    this.f20049E.postFrameCallback(this.f20057M);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void N1(android.view.Choreographer.FrameCallback frameCallback) {
        synchronized (this.f20051G) {
            this.f20053I.remove(frameCallback);
        }
    }

    @Override // W8.J
    public void t1(p127m7.i iVar, java.lang.Runnable runnable) {
        synchronized (this.f20051G) {
            try {
                this.f20052H.g(runnable);
                if (!this.f20055K) {
                    this.f20055K = true;
                    this.f20050F.post(this.f20057M);
                    if (!this.f20056L) {
                        this.f20056L = true;
                        this.f20049E.postFrameCallback(this.f20057M);
                    }
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
