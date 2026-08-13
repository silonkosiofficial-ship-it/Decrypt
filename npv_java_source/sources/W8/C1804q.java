package W8;

/* JADX INFO: renamed from: W8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1804q extends W8.A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f15528c = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(W8.C1804q.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C1804q(p127m7.e eVar, java.lang.Throwable th, boolean z6) {
        if (th == null) {
            th = new java.util.concurrent.CancellationException("Continuation " + eVar + " was cancelled normally");
        }
        super(th, z6);
        this._resumed$volatile = 0;
    }

    public final boolean e() {
        return f15528c.compareAndSet(this, 0, 1);
    }
}
