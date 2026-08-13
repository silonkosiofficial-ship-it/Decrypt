package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Runnable f4790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.concurrent.ExecutorService f4791d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4788a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4789b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.ArrayDeque f4792e = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.ArrayDeque f4793f = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.ArrayDeque f4794g = new java.util.ArrayDeque();

    private final M9.e.a c(java.lang.String str) {
        for (M9.e.a aVar : this.f4793f) {
            if (p247y7.AbstractC7350t.b(aVar.d(), str)) {
                return aVar;
            }
        }
        for (M9.e.a aVar2 : this.f4792e) {
            if (p247y7.AbstractC7350t.b(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void d(java.util.Deque deque, java.lang.Object obj) {
        java.lang.Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new java.lang.AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f4790c;
            p087i7.M m6 = p087i7.M.f46721a;
        }
        if (f() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean f() {
        int i6;
        boolean z6;
        if (I9.d.f5554h && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this) {
            try {
                java.util.Iterator it = this.f4792e.iterator();
                p247y7.AbstractC7350t.e(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    M9.e.a aVar = (M9.e.a) it.next();
                    if (this.f4793f.size() >= this.f4788a) {
                        break;
                    }
                    if (aVar.c().get() < this.f4789b) {
                        it.remove();
                        aVar.c().incrementAndGet();
                        p247y7.AbstractC7350t.e(aVar, "asyncCall");
                        arrayList.add(aVar);
                        this.f4793f.add(aVar);
                    }
                }
                z6 = g() > 0;
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i6 = 0; i6 < size; i6++) {
            ((M9.e.a) arrayList.get(i6)).a(b());
        }
        return z6;
    }

    public final void a(M9.e.a aVar) {
        M9.e.a aVarC;
        p247y7.AbstractC7350t.f(aVar, "call");
        synchronized (this) {
            try {
                this.f4792e.add(aVar);
                if (!aVar.b().q() && (aVarC = c(aVar.d())) != null) {
                    aVar.e(aVarC);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        f();
    }

    public final synchronized java.util.concurrent.ExecutorService b() {
        java.util.concurrent.ExecutorService executorService;
        try {
            if (this.f4791d == null) {
                this.f4791d = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), I9.d.L(I9.d.f5555i + " Dispatcher", false));
            }
            executorService = this.f4791d;
            p247y7.AbstractC7350t.c(executorService);
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void e(M9.e.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "call");
        aVar.c().decrementAndGet();
        d(this.f4793f, aVar);
    }

    public final synchronized int g() {
        return this.f4793f.size() + this.f4794g.size();
    }
}
