package p073h2;

/* JADX INFO: renamed from: h2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6639p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f46224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f46225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.locks.ReentrantLock f46226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f46227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f46228e;

    public C6639p(p237x7.l lVar, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(lVar, "callbackInvoker");
        this.f46224a = lVar;
        this.f46225b = aVar;
        this.f46226c = new java.util.concurrent.locks.ReentrantLock();
        this.f46227d = new java.util.ArrayList();
    }

    public /* synthetic */ C6639p(p237x7.l lVar, p237x7.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(lVar, (i6 & 2) != 0 ? null : aVar);
    }

    public final boolean a() {
        return this.f46228e;
    }

    public final boolean b() {
        if (this.f46228e) {
            return false;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f46226c;
        try {
            reentrantLock.lock();
            if (this.f46228e) {
                reentrantLock.unlock();
                return false;
            }
            this.f46228e = true;
            java.util.List listT0 = p097j7.AbstractC6879v.T0(this.f46227d);
            this.f46227d.clear();
            reentrantLock.unlock();
            p237x7.l lVar = this.f46224a;
            java.util.Iterator it = listT0.iterator();
            while (it.hasNext()) {
                lVar.l(it.next());
            }
            return true;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c(java.lang.Object obj) {
        p237x7.a aVar = this.f46225b;
        boolean z6 = true;
        if (aVar != null && ((java.lang.Boolean) aVar.b()).booleanValue()) {
            b();
        }
        if (this.f46228e) {
            this.f46224a.l(obj);
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f46226c;
        try {
            reentrantLock.lock();
            if (!this.f46228e) {
                this.f46227d.add(obj);
                z6 = false;
            }
            if (z6) {
                this.f46224a.l(obj);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(java.lang.Object obj) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f46226c;
        try {
            reentrantLock.lock();
            this.f46227d.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }
}
