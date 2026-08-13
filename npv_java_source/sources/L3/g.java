package L3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p053f2.a implements P3.j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final java.util.concurrent.Semaphore f6202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final java.util.Set f6203p;

    public g(android.content.Context context, java.util.Set set) {
        super(context);
        this.f6202o = new java.util.concurrent.Semaphore(0);
        this.f6203p = set;
    }

    @Override // p053f2.a
    public final /* bridge */ /* synthetic */ java.lang.Object C() {
        java.util.Iterator it = this.f6203p.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (((O3.f) it.next()).d(this)) {
                i6++;
            }
        }
        try {
            this.f6202o.tryAcquire(i6, 5L, java.util.concurrent.TimeUnit.SECONDS);
            return null;
        } catch (java.lang.InterruptedException e6) {
            java.lang.Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p053f2.b
    protected final void p() {
        this.f6202o.drainPermits();
        h();
    }
}
