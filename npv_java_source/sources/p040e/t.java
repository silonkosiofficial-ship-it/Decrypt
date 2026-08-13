package p040e;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f44421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f44422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f44423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f44426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f44427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.Runnable f44428h;

    public t(java.util.concurrent.Executor executor, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(executor, "executor");
        p247y7.AbstractC7350t.f(aVar, "reportFullyDrawn");
        this.f44421a = executor;
        this.f44422b = aVar;
        this.f44423c = new java.lang.Object();
        this.f44427g = new java.util.ArrayList();
        this.f44428h = new java.lang.Runnable() { // from class: e.s
            @Override // java.lang.Runnable
            public final void run() {
                p040e.t.d(this.f44420C);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(p040e.t tVar) {
        p247y7.AbstractC7350t.f(tVar, "this$0");
        synchronized (tVar.f44423c) {
            try {
                tVar.f44425e = false;
                if (tVar.f44424d == 0 && !tVar.f44426f) {
                    tVar.f44422b.b();
                    tVar.b();
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f44423c) {
            try {
                this.f44426f = true;
                java.util.Iterator it = this.f44427g.iterator();
                while (it.hasNext()) {
                    ((p237x7.a) it.next()).b();
                }
                this.f44427g.clear();
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z6;
        synchronized (this.f44423c) {
            z6 = this.f44426f;
        }
        return z6;
    }
}
