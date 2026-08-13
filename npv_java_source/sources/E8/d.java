package E8;

/* JADX INFO: loaded from: classes2.dex */
public class d implements E8.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.locks.Lock f2270b;

    public d(java.util.concurrent.locks.Lock lock) {
        p247y7.AbstractC7350t.f(lock, "lock");
        this.f2270b = lock;
    }

    public /* synthetic */ d(java.util.concurrent.locks.Lock lock, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? new java.util.concurrent.locks.ReentrantLock() : lock);
    }

    @Override // E8.k
    public void a() {
        this.f2270b.unlock();
    }

    @Override // E8.k
    public void b() {
        this.f2270b.lock();
    }

    protected final java.util.concurrent.locks.Lock c() {
        return this.f2270b;
    }
}
