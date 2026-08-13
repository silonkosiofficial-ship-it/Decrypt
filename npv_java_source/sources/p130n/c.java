package p130n;

/* JADX INFO: loaded from: classes.dex */
public class c extends p130n.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile p130n.c f51296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.concurrent.Executor f51297d = new java.util.concurrent.Executor() { // from class: n.a
        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            p130n.c.h(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.concurrent.Executor f51298e = new java.util.concurrent.Executor() { // from class: n.b
        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            p130n.c.i(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p130n.e f51299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p130n.e f51300b;

    private c() {
        p130n.d dVar = new p130n.d();
        this.f51300b = dVar;
        this.f51299a = dVar;
    }

    public static java.util.concurrent.Executor f() {
        return f51298e;
    }

    public static p130n.c g() {
        if (f51296c != null) {
            return f51296c;
        }
        synchronized (p130n.c.class) {
            try {
                if (f51296c == null) {
                    f51296c = new p130n.c();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return f51296c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(java.lang.Runnable runnable) {
        g().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(java.lang.Runnable runnable) {
        g().a(runnable);
    }

    @Override // p130n.e
    public void a(java.lang.Runnable runnable) {
        this.f51299a.a(runnable);
    }

    @Override // p130n.e
    public boolean b() {
        return this.f51299a.b();
    }

    @Override // p130n.e
    public void c(java.lang.Runnable runnable) {
        this.f51299a.c(runnable);
    }
}
