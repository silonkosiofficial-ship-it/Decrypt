package p149o9;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends p149o9.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o9.j.a f52576b = new o9.j.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f52577c = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p149o9.j.class, "a");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f52578a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    @Override // p149o9.l
    public void a() {
        f52577c.incrementAndGet(this);
    }

    @Override // p149o9.l
    public boolean b() {
        return this.f52578a > 0;
    }

    @Override // p149o9.l
    public boolean c() {
        if (this.f52578a == 0) {
            return false;
        }
        int iDecrementAndGet = f52577c.decrementAndGet(this);
        if (iDecrementAndGet >= 0) {
            return true;
        }
        if (iDecrementAndGet == -1) {
            this.f52578a = 0;
            return false;
        }
        throw new java.lang.IllegalStateException(("Shared copies count is negative: " + (iDecrementAndGet + 1)).toString());
    }
}
