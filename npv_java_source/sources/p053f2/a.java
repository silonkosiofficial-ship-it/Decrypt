package p053f2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends p053f2.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.concurrent.Executor f44910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile p053f2.a.RunnableC0502a f44911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile p053f2.a.RunnableC0502a f44912k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f44913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f44914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private android.os.Handler f44915n;

    /* JADX INFO: renamed from: f2.a$a, reason: collision with other inner class name */
    final class RunnableC0502a extends p053f2.c implements java.lang.Runnable {

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        boolean f44916H;

        RunnableC0502a() {
        }

        @Override // p053f2.c
        protected java.lang.Object b() {
            return p053f2.a.this.E();
        }

        @Override // p053f2.c
        protected void g(java.lang.Object obj) {
            p053f2.a.this.y(this, obj);
        }

        @Override // p053f2.c
        protected void h(java.lang.Object obj) {
            p053f2.a.this.z(this, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f44916H = false;
            p053f2.a.this.A();
        }
    }

    public a(android.content.Context context) {
        super(context);
        this.f44914m = -10000L;
    }

    void A() {
        if (this.f44912k != null || this.f44911j == null) {
            return;
        }
        if (this.f44911j.f44916H) {
            this.f44911j.f44916H = false;
            this.f44915n.removeCallbacks(this.f44911j);
        }
        if (this.f44913l > 0 && android.os.SystemClock.uptimeMillis() < this.f44914m + this.f44913l) {
            this.f44911j.f44916H = true;
            this.f44915n.postAtTime(this.f44911j, this.f44914m + this.f44913l);
        } else {
            if (this.f44910i == null) {
                this.f44910i = B();
            }
            this.f44911j.c(this.f44910i);
        }
    }

    protected java.util.concurrent.Executor B() {
        return android.os.AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public abstract java.lang.Object C();

    public void D(java.lang.Object obj) {
    }

    protected java.lang.Object E() {
        return C();
    }

    @Override // p053f2.b
    public void g(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.lang.String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f44911j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f44911j);
            printWriter.print(" waiting=");
            printWriter.println(this.f44911j.f44916H);
        }
        if (this.f44912k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f44912k);
            printWriter.print(" waiting=");
            printWriter.println(this.f44912k.f44916H);
        }
        if (this.f44913l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            printWriter.print(android.text.format.DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f44913l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f44914m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + android.text.format.DateUtils.formatElapsedTime(timeUnit.toSeconds(android.os.SystemClock.uptimeMillis() - this.f44914m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // p053f2.b
    protected boolean l() {
        if (this.f44911j == null) {
            return false;
        }
        if (!j()) {
            m();
        }
        if (this.f44912k != null) {
            if (this.f44911j.f44916H) {
                this.f44911j.f44916H = false;
                this.f44915n.removeCallbacks(this.f44911j);
            }
            this.f44911j = null;
            return false;
        }
        if (this.f44911j.f44916H) {
            this.f44911j.f44916H = false;
            this.f44915n.removeCallbacks(this.f44911j);
            this.f44911j = null;
            return false;
        }
        boolean zA = this.f44911j.a(false);
        if (zA) {
            this.f44912k = this.f44911j;
            x();
        }
        this.f44911j = null;
        return zA;
    }

    @Override // p053f2.b
    protected void n() {
        super.n();
        b();
        this.f44911j = new p053f2.a.RunnableC0502a();
        A();
    }

    public void x() {
    }

    void y(p053f2.a.RunnableC0502a runnableC0502a, java.lang.Object obj) {
        D(obj);
        if (this.f44912k == runnableC0502a) {
            t();
            this.f44914m = android.os.SystemClock.uptimeMillis();
            this.f44912k = null;
            e();
            A();
        }
    }

    void z(p053f2.a.RunnableC0502a runnableC0502a, java.lang.Object obj) {
        if (this.f44911j != runnableC0502a) {
            y(runnableC0502a, obj);
            return;
        }
        if (i()) {
            D(obj);
            return;
        }
        c();
        this.f44914m = android.os.SystemClock.uptimeMillis();
        this.f44911j = null;
        f(obj);
    }
}
