package M9;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final M9.g.a f7261f = new M9.g.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L9.d f7264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M9.g.b f7265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentLinkedQueue f7266e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static final class b extends L9.a {
        b(java.lang.String str) {
            super(str, false, 2, null);
        }

        @Override // L9.a
        public long f() {
            return M9.g.this.b(java.lang.System.nanoTime());
        }
    }

    public g(L9.e eVar, int i6, long j6, java.util.concurrent.TimeUnit timeUnit) {
        p247y7.AbstractC7350t.f(eVar, "taskRunner");
        p247y7.AbstractC7350t.f(timeUnit, "timeUnit");
        this.f7262a = i6;
        this.f7263b = timeUnit.toNanos(j6);
        this.f7264c = eVar.i();
        this.f7265d = new M9.g.b(I9.d.f5555i + " ConnectionPool");
        this.f7266e = new java.util.concurrent.ConcurrentLinkedQueue();
        if (j6 > 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("keepAliveDuration <= 0: " + j6).toString());
    }

    private final int e(M9.f fVar, long j6) {
        if (I9.d.f5554h && !java.lang.Thread.holdsLock(fVar)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        java.util.List listN = fVar.n();
        int i6 = 0;
        while (i6 < listN.size()) {
            java.lang.ref.Reference reference = (java.lang.ref.Reference) listN.get(i6);
            if (reference.get() != null) {
                i6++;
            } else {
                p247y7.AbstractC7350t.d(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                Q9.k.f9149a.g().l("A connection to " + fVar.A().a().l() + " was leaked. Did you forget to close a response body?", ((M9.e.b) reference).a());
                listN.remove(i6);
                fVar.D(true);
                if (listN.isEmpty()) {
                    fVar.C(j6 - this.f7263b);
                    return 0;
                }
            }
        }
        return listN.size();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0033 A[SYNTHETIC] */
    public final boolean a(H9.C1235a c1235a, M9.e eVar, java.util.List list, boolean z6) {
        p247y7.AbstractC7350t.f(c1235a, "address");
        p247y7.AbstractC7350t.f(eVar, "call");
        for (M9.f fVar : this.f7266e) {
            p247y7.AbstractC7350t.e(fVar, "connection");
            synchronized (fVar) {
                if (z6) {
                    try {
                        if (fVar.v()) {
                            if (fVar.t(c1235a, list)) {
                                eVar.c(fVar);
                                return true;
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                } else if (fVar.t(c1235a, list)) {
                    eVar.c(fVar);
                    return true;
                }
                p087i7.M m6 = p087i7.M.f46721a;
            }
        }
        return false;
    }

    public final long b(long j6) {
        int i6 = 0;
        long j10 = Long.MIN_VALUE;
        M9.f fVar = null;
        int i10 = 0;
        for (M9.f fVar2 : this.f7266e) {
            p247y7.AbstractC7350t.e(fVar2, "connection");
            synchronized (fVar2) {
                if (e(fVar2, j6) > 0) {
                    i10++;
                } else {
                    i6++;
                    long jO = j6 - fVar2.o();
                    if (jO > j10) {
                        fVar = fVar2;
                        j10 = jO;
                    }
                    p087i7.M m6 = p087i7.M.f46721a;
                }
            }
        }
        long j11 = this.f7263b;
        if (j10 < j11 && i6 <= this.f7262a) {
            if (i6 > 0) {
                return j11 - j10;
            }
            if (i10 > 0) {
                return j11;
            }
            return -1L;
        }
        p247y7.AbstractC7350t.c(fVar);
        synchronized (fVar) {
            if (!fVar.n().isEmpty()) {
                return 0L;
            }
            if (fVar.o() + j10 != j6) {
                return 0L;
            }
            fVar.D(true);
            this.f7266e.remove(fVar);
            I9.d.n(fVar.E());
            if (this.f7266e.isEmpty()) {
                this.f7264c.a();
            }
            return 0L;
        }
    }

    public final boolean c(M9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "connection");
        if (I9.d.f5554h && !java.lang.Thread.holdsLock(fVar)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        if (!fVar.p() && this.f7262a != 0) {
            L9.d.j(this.f7264c, this.f7265d, 0L, 2, null);
            return false;
        }
        fVar.D(true);
        this.f7266e.remove(fVar);
        if (this.f7266e.isEmpty()) {
            this.f7264c.a();
        }
        return true;
    }

    public final void d() {
        java.net.Socket socketE;
        java.util.Iterator it = this.f7266e.iterator();
        p247y7.AbstractC7350t.e(it, "connections.iterator()");
        while (it.hasNext()) {
            M9.f fVar = (M9.f) it.next();
            p247y7.AbstractC7350t.e(fVar, "connection");
            synchronized (fVar) {
                if (fVar.n().isEmpty()) {
                    it.remove();
                    fVar.D(true);
                    socketE = fVar.E();
                } else {
                    socketE = null;
                }
            }
            if (socketE != null) {
                I9.d.n(socketE);
            }
        }
        if (this.f7266e.isEmpty()) {
            this.f7264c.a();
        }
    }

    public final void f(M9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "connection");
        if (!I9.d.f5554h || java.lang.Thread.holdsLock(fVar)) {
            this.f7266e.add(fVar);
            L9.d.j(this.f7264c, this.f7265d, 0L, 2, null);
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }
}
