package S2;

/* JADX INFO: loaded from: classes.dex */
public class b implements S2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R2.k f12423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Handler f12424b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f12425c = new S2.b.a();

    class a implements java.util.concurrent.Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            S2.b.this.d(runnable);
        }
    }

    public b(java.util.concurrent.Executor executor) {
        this.f12423a = new R2.k(executor);
    }

    @Override // S2.a
    public java.util.concurrent.Executor a() {
        return this.f12425c;
    }

    @Override // S2.a
    public void b(java.lang.Runnable runnable) {
        this.f12423a.execute(runnable);
    }

    @Override // S2.a
    public R2.k c() {
        return this.f12423a;
    }

    public void d(java.lang.Runnable runnable) {
        this.f12424b.post(runnable);
    }
}
