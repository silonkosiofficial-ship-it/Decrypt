package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.concurrent.Executor f23821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.concurrent.Executor f23822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final I2.v f23823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final I2.i f23824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final I2.q f23825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final java.lang.String f23826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f23827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f23828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f23829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f23830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f23831k;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0453a implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.concurrent.atomic.AtomicInteger f23832a = new java.util.concurrent.atomic.AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f23833b;

        ThreadFactoryC0453a(boolean z6) {
            this.f23833b = z6;
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            return new java.lang.Thread(runnable, (this.f23833b ? "WM.task-" : "androidx.work-") + this.f23832a.incrementAndGet());
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.util.concurrent.Executor f23835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        I2.v f23836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        I2.i f23837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.util.concurrent.Executor f23838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        I2.q f23839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        java.lang.String f23840f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f23841g = 4;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f23842h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f23843i = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f23844j = 20;

        public androidx.work.a a() {
            return new androidx.work.a(this);
        }
    }

    a(androidx.work.a.b bVar) {
        java.util.concurrent.Executor executor = bVar.f23835a;
        this.f23821a = executor == null ? a(false) : executor;
        java.util.concurrent.Executor executorA = bVar.f23838d;
        if (executorA == null) {
            this.f23831k = true;
            executorA = a(true);
        } else {
            this.f23831k = false;
        }
        this.f23822b = executorA;
        I2.v vVar = bVar.f23836b;
        this.f23823c = vVar == null ? I2.v.c() : vVar;
        I2.i iVar = bVar.f23837c;
        this.f23824d = iVar == null ? I2.i.c() : iVar;
        I2.q qVar = bVar.f23839e;
        this.f23825e = qVar == null ? new J2.a() : qVar;
        this.f23827g = bVar.f23841g;
        this.f23828h = bVar.f23842h;
        this.f23829i = bVar.f23843i;
        this.f23830j = bVar.f23844j;
        this.f23826f = bVar.f23840f;
    }

    private java.util.concurrent.Executor a(boolean z6) {
        return java.util.concurrent.Executors.newFixedThreadPool(java.lang.Math.max(2, java.lang.Math.min(java.lang.Runtime.getRuntime().availableProcessors() - 1, 4)), b(z6));
    }

    private java.util.concurrent.ThreadFactory b(boolean z6) {
        return new androidx.work.a.ThreadFactoryC0453a(z6);
    }

    public java.lang.String c() {
        return this.f23826f;
    }

    public I2.g d() {
        return null;
    }

    public java.util.concurrent.Executor e() {
        return this.f23821a;
    }

    public I2.i f() {
        return this.f23824d;
    }

    public int g() {
        return this.f23829i;
    }

    public int h() {
        return android.os.Build.VERSION.SDK_INT == 23 ? this.f23830j / 2 : this.f23830j;
    }

    public int i() {
        return this.f23828h;
    }

    public int j() {
        return this.f23827g;
    }

    public I2.q k() {
        return this.f23825e;
    }

    public java.util.concurrent.Executor l() {
        return this.f23822b;
    }

    public I2.v m() {
        return this.f23823c;
    }
}
