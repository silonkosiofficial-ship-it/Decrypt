package W8;

/* JADX INFO: renamed from: W8.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1818x0 extends W8.E0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f15536H = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(W8.C1818x0.class, "_invoked$volatile");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p237x7.l f15537G;
    private volatile /* synthetic */ int _invoked$volatile = 0;

    public C1818x0(p237x7.l lVar) {
        this.f15537G = lVar;
    }

    @Override // W8.E0
    public boolean w() {
        return true;
    }

    @Override // W8.E0
    public void x(java.lang.Throwable th) {
        if (f15536H.compareAndSet(this, 0, 1)) {
            this.f15537G.l(th);
        }
    }
}
