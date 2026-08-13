package V8;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final V8.c.a f15144c = new V8.c.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f15145d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(V8.c.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V8.d f15146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f15147b;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public c(int i6, V8.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "trace");
        this.f15146a = dVar;
        this.f15147b = i6;
    }

    public final boolean a(int i6, int i10) {
        V8.d dVar;
        boolean zCompareAndSet = f15145d.compareAndSet(this, i6, i10);
        if (zCompareAndSet && (dVar = this.f15146a) != V8.d.a.f15148a) {
            dVar.a("CAS(" + i6 + ", " + i10 + ')');
        }
        return zCompareAndSet;
    }

    public final int b() {
        int iDecrementAndGet = f15145d.decrementAndGet(this);
        V8.d dVar = this.f15146a;
        if (dVar != V8.d.a.f15148a) {
            dVar.a("decAndGet():" + iDecrementAndGet);
        }
        return iDecrementAndGet;
    }

    public final int c() {
        return this.f15147b;
    }

    public final int d() {
        int iIncrementAndGet = f15145d.incrementAndGet(this);
        V8.d dVar = this.f15146a;
        if (dVar != V8.d.a.f15148a) {
            dVar.a("incAndGet():" + iIncrementAndGet);
        }
        return iIncrementAndGet;
    }

    public final void e(int i6) {
        this.f15147b = i6;
        V8.d dVar = this.f15146a;
        if (dVar != V8.d.a.f15148a) {
            dVar.a("set(" + i6 + ')');
        }
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.f15147b);
    }
}
