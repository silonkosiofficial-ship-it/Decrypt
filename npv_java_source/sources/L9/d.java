package L9;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L9.e f6454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f6455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private L9.a f6457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f6458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6459f;

    public d(L9.e eVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(eVar, "taskRunner");
        p247y7.AbstractC7350t.f(str, "name");
        this.f6454a = eVar;
        this.f6455b = str;
        this.f6458e = new java.util.ArrayList();
    }

    public static /* synthetic */ void j(L9.d dVar, L9.a aVar, long j6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            j6 = 0;
        }
        dVar.i(aVar, j6);
    }

    public final void a() {
        if (I9.d.f5554h && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f6454a) {
            try {
                if (b()) {
                    this.f6454a.h(this);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        L9.a aVar = this.f6457d;
        if (aVar != null) {
            p247y7.AbstractC7350t.c(aVar);
            if (aVar.a()) {
                this.f6459f = true;
            }
        }
        boolean z6 = false;
        for (int size = this.f6458e.size() - 1; -1 < size; size--) {
            if (((L9.a) this.f6458e.get(size)).a()) {
                L9.a aVar2 = (L9.a) this.f6458e.get(size);
                if (L9.e.f6460h.a().isLoggable(java.util.logging.Level.FINE)) {
                    L9.b.c(aVar2, this, "canceled");
                }
                this.f6458e.remove(size);
                z6 = true;
            }
        }
        return z6;
    }

    public final L9.a c() {
        return this.f6457d;
    }

    public final boolean d() {
        return this.f6459f;
    }

    public final java.util.List e() {
        return this.f6458e;
    }

    public final java.lang.String f() {
        return this.f6455b;
    }

    public final boolean g() {
        return this.f6456c;
    }

    public final L9.e h() {
        return this.f6454a;
    }

    public final void i(L9.a aVar, long j6) {
        p247y7.AbstractC7350t.f(aVar, "task");
        synchronized (this.f6454a) {
            if (!this.f6456c) {
                if (k(aVar, j6, false)) {
                    this.f6454a.h(this);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } else if (aVar.a()) {
                if (L9.e.f6460h.a().isLoggable(java.util.logging.Level.FINE)) {
                    L9.b.c(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (L9.e.f6460h.a().isLoggable(java.util.logging.Level.FINE)) {
                    L9.b.c(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new java.util.concurrent.RejectedExecutionException();
            }
        }
    }

    public final boolean k(L9.a aVar, long j6, boolean z6) {
        java.lang.StringBuilder sb;
        java.lang.String str;
        p247y7.AbstractC7350t.f(aVar, "task");
        aVar.e(this);
        long jB = this.f6454a.g().b();
        long j10 = jB + j6;
        int iIndexOf = this.f6458e.indexOf(aVar);
        if (iIndexOf != -1) {
            if (aVar.c() <= j10) {
                if (L9.e.f6460h.a().isLoggable(java.util.logging.Level.FINE)) {
                    L9.b.c(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f6458e.remove(iIndexOf);
        }
        aVar.g(j10);
        if (L9.e.f6460h.a().isLoggable(java.util.logging.Level.FINE)) {
            if (z6) {
                sb = new java.lang.StringBuilder();
                str = "run again after ";
            } else {
                sb = new java.lang.StringBuilder();
                str = "scheduled after ";
            }
            sb.append(str);
            sb.append(L9.b.b(j10 - jB));
            L9.b.c(aVar, this, sb.toString());
        }
        java.util.Iterator it = this.f6458e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((L9.a) it.next()).c() - jB > j6) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f6458e.size();
        }
        this.f6458e.add(size, aVar);
        return size == 0;
    }

    public final void l(L9.a aVar) {
        this.f6457d = aVar;
    }

    public final void m(boolean z6) {
        this.f6459f = z6;
    }

    public final void n() {
        if (I9.d.f5554h && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f6454a) {
            try {
                this.f6456c = true;
                if (b()) {
                    this.f6454a.h(this);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public java.lang.String toString() {
        return this.f6455b;
    }
}
