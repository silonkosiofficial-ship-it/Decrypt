package E8;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends E8.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Runnable f2268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.l f2269d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(java.lang.Runnable runnable, p237x7.l lVar) {
        this(new java.util.concurrent.locks.ReentrantLock(), runnable, lVar);
        p247y7.AbstractC7350t.f(runnable, "checkCancelled");
        p247y7.AbstractC7350t.f(lVar, "interruptedExceptionHandler");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.concurrent.locks.Lock lock, java.lang.Runnable runnable, p237x7.l lVar) {
        super(lock);
        p247y7.AbstractC7350t.f(lock, "lock");
        p247y7.AbstractC7350t.f(runnable, "checkCancelled");
        p247y7.AbstractC7350t.f(lVar, "interruptedExceptionHandler");
        this.f2268c = runnable;
        this.f2269d = lVar;
    }

    @Override // E8.d, E8.k
    public void b() {
        while (!c().tryLock(50L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            try {
                this.f2268c.run();
            } catch (java.lang.InterruptedException e6) {
                this.f2269d.l(e6);
                return;
            }
        }
    }
}
