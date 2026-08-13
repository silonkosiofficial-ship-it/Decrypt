package p019b9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A extends p019b9.AbstractC2115b implements W8.N0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f24328d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p019b9.A.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24329c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public A(long j6, p019b9.A a6, int i6) {
        super(a6);
        this.f24329c = j6;
        this.cleanedAndPointers$volatile = i6 << 16;
    }

    @Override // p019b9.AbstractC2115b
    public boolean k() {
        return f24328d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f24328d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i6, java.lang.Throwable th, p127m7.i iVar);

    public final void t() {
        if (f24328d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i6;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24328d;
        do {
            i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, 65536 + i6));
        return true;
    }
}
