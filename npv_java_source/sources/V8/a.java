package V8;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final V8.a.C0290a f15140c = new V8.a.C0290a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f15141d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(V8.a.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V8.d f15142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f15143b;

    /* JADX INFO: renamed from: V8.a$a, reason: collision with other inner class name */
    private static final class C0290a {
        private C0290a() {
        }

        public /* synthetic */ C0290a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public a(boolean z6, V8.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "trace");
        this.f15142a = dVar;
        this.f15143b = z6 ? 1 : 0;
    }

    public final boolean a(boolean z6, boolean z10) {
        V8.d dVar;
        boolean zCompareAndSet = f15141d.compareAndSet(this, z6 ? 1 : 0, z10 ? 1 : 0);
        if (zCompareAndSet && (dVar = this.f15142a) != V8.d.a.f15148a) {
            dVar.a("CAS(" + z6 + ", " + z10 + ')');
        }
        return zCompareAndSet;
    }

    public final boolean b(boolean z6) {
        int andSet = f15141d.getAndSet(this, z6 ? 1 : 0);
        V8.d dVar = this.f15142a;
        if (dVar != V8.d.a.f15148a) {
            dVar.a("getAndSet(" + z6 + "):" + andSet);
        }
        return andSet == 1;
    }

    public final boolean c() {
        return this.f15143b != 0;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(c());
    }
}
