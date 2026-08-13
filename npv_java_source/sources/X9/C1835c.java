package X9;

/* JADX INFO: renamed from: X9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1835c extends X9.a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final X9.C1835c.a f16119i = new X9.C1835c.a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final java.util.concurrent.locks.ReentrantLock f16120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final java.util.concurrent.locks.Condition f16121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f16122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f16123m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static X9.C1835c f16124n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private X9.C1835c f16126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f16127h;

    /* JADX INFO: renamed from: X9.c$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:18:0x004b  */
        /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:16:0x0042->B:21:0x005b, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:24:0x0070  */
        /* JADX WARN: Code duplicated, block: B:28:0x0060 A[EDGE_INSN: B:28:0x0060->B:22:0x0060 BREAK  A[LOOP:0: B:16:0x0042->B:21:0x005b], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:29:0x0060 A[EDGE_INSN: B:29:0x0060->B:22:0x0060 BREAK  A[LOOP:0: B:16:0x0042->B:21:0x005b], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
        public final void f(X9.C1835c c1835c, long j6, boolean z6) {
            long jC;
            long jY;
            X9.C1835c c1835c2;
            X9.C1835c c1835c3;
            if (X9.C1835c.f16124n == null) {
                X9.C1835c.f16124n = new X9.C1835c();
                new X9.C1835c.b().start();
            }
            long jNanoTime = java.lang.System.nanoTime();
            if (j6 == 0 || !z6) {
                if (j6 == 0) {
                    if (!z6) {
                        throw new java.lang.AssertionError();
                    }
                    jC = c1835c.c();
                }
                c1835c.f16127h = jC;
                jY = c1835c.y(jNanoTime);
                c1835c2 = X9.C1835c.f16124n;
                while (true) {
                    p247y7.AbstractC7350t.c(c1835c2);
                    if (c1835c2.f16126g != null) {
                        break;
                    }
                    c1835c3 = c1835c2.f16126g;
                    p247y7.AbstractC7350t.c(c1835c3);
                    if (jY < c1835c3.y(jNanoTime)) {
                        break;
                    } else {
                        c1835c2 = c1835c2.f16126g;
                    }
                }
                c1835c.f16126g = c1835c2.f16126g;
                c1835c2.f16126g = c1835c;
                if (c1835c2 == X9.C1835c.f16124n) {
                    d().signal();
                }
            }
            j6 = java.lang.Math.min(j6, c1835c.c() - jNanoTime);
            jC = j6 + jNanoTime;
            c1835c.f16127h = jC;
            jY = c1835c.y(jNanoTime);
            c1835c2 = X9.C1835c.f16124n;
            while (true) {
                p247y7.AbstractC7350t.c(c1835c2);
                if (c1835c2.f16126g != null) {
                    break;
                    break;
                }
                c1835c3 = c1835c2.f16126g;
                p247y7.AbstractC7350t.c(c1835c3);
                if (jY < c1835c3.y(jNanoTime)) {
                    break;
                    break;
                }
                c1835c2 = c1835c2.f16126g;
            }
            c1835c.f16126g = c1835c2.f16126g;
            c1835c2.f16126g = c1835c;
            if (c1835c2 == X9.C1835c.f16124n) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(X9.C1835c c1835c) {
            for (X9.C1835c c1835c2 = X9.C1835c.f16124n; c1835c2 != null; c1835c2 = c1835c2.f16126g) {
                if (c1835c2.f16126g == c1835c) {
                    c1835c2.f16126g = c1835c.f16126g;
                    c1835c.f16126g = null;
                    return;
                }
            }
            throw new java.lang.IllegalStateException("node was not found in the queue".toString());
        }

        public final X9.C1835c c() throws java.lang.InterruptedException {
            X9.C1835c c1835c = X9.C1835c.f16124n;
            p247y7.AbstractC7350t.c(c1835c);
            X9.C1835c c1835c2 = c1835c.f16126g;
            long jNanoTime = java.lang.System.nanoTime();
            if (c1835c2 == null) {
                d().await(X9.C1835c.f16122l, java.util.concurrent.TimeUnit.MILLISECONDS);
                X9.C1835c c1835c3 = X9.C1835c.f16124n;
                p247y7.AbstractC7350t.c(c1835c3);
                if (c1835c3.f16126g != null || java.lang.System.nanoTime() - jNanoTime < X9.C1835c.f16123m) {
                    return null;
                }
                return X9.C1835c.f16124n;
            }
            long jY = c1835c2.y(jNanoTime);
            if (jY > 0) {
                d().await(jY, java.util.concurrent.TimeUnit.NANOSECONDS);
                return null;
            }
            X9.C1835c c1835c4 = X9.C1835c.f16124n;
            p247y7.AbstractC7350t.c(c1835c4);
            c1835c4.f16126g = c1835c2.f16126g;
            c1835c2.f16126g = null;
            c1835c2.f16125f = 2;
            return c1835c2;
        }

        public final java.util.concurrent.locks.Condition d() {
            return X9.C1835c.f16121k;
        }

        public final java.util.concurrent.locks.ReentrantLock e() {
            return X9.C1835c.f16120j;
        }
    }

    /* JADX INFO: renamed from: X9.c$b */
    private static final class b extends java.lang.Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    java.util.concurrent.locks.ReentrantLock reentrantLockE = X9.C1835c.f16119i.e();
                    reentrantLockE.lock();
                    try {
                        X9.C1835c c1835cC = X9.C1835c.f16119i.c();
                        if (c1835cC == X9.C1835c.f16124n) {
                            X9.C1835c.a unused = X9.C1835c.f16119i;
                            X9.C1835c.f16124n = null;
                            reentrantLockE.unlock();
                            return;
                        } else {
                            p087i7.M m6 = p087i7.M.f46721a;
                            reentrantLockE.unlock();
                            if (c1835cC != null) {
                                c1835cC.B();
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        reentrantLockE.unlock();
                        throw th;
                    }
                } catch (java.lang.InterruptedException unused2) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: X9.c$c, reason: collision with other inner class name */
    public static final class C0305c implements X9.X {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ X9.X f16129D;

        C0305c(X9.X x6) {
            this.f16129D = x6;
        }

        @Override // X9.X
        public void F0(X9.C1836d c1836d, long j6) throws java.io.IOException {
            p247y7.AbstractC7350t.f(c1836d, "source");
            X9.AbstractC1834b.b(c1836d.d1(), 0L, j6);
            while (true) {
                long j10 = 0;
                if (j6 <= 0) {
                    return;
                }
                X9.U u6 = c1836d.f16138C;
                while (true) {
                    p247y7.AbstractC7350t.c(u6);
                    if (j10 >= 65536) {
                        break;
                    }
                    j10 += (long) (u6.f16097c - u6.f16096b);
                    if (j10 >= j6) {
                        j10 = j6;
                        break;
                    }
                    u6 = u6.f16100f;
                }
                X9.C1835c c1835c = X9.C1835c.this;
                X9.X x6 = this.f16129D;
                c1835c.v();
                try {
                    try {
                        x6.F0(c1836d, j10);
                        p087i7.M m6 = p087i7.M.f46721a;
                        if (c1835c.w()) {
                            throw c1835c.p(null);
                        }
                        j6 -= j10;
                    } catch (java.io.IOException e6) {
                        if (!c1835c.w()) {
                            throw e6;
                        }
                        throw c1835c.p(e6);
                    }
                } catch (java.lang.Throwable th) {
                    c1835c.w();
                    throw th;
                }
            }
        }

        @Override // X9.X
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public X9.C1835c k() {
            return X9.C1835c.this;
        }

        @Override // X9.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            X9.C1835c c1835c = X9.C1835c.this;
            X9.X x6 = this.f16129D;
            c1835c.v();
            try {
                try {
                    x6.close();
                    p087i7.M m6 = p087i7.M.f46721a;
                    if (c1835c.w()) {
                        throw c1835c.p(null);
                    }
                } catch (java.io.IOException e6) {
                    if (!c1835c.w()) {
                        throw e6;
                    }
                    throw c1835c.p(e6);
                }
            } catch (java.lang.Throwable th) {
                c1835c.w();
                throw th;
            }
        }

        @Override // X9.X, java.io.Flushable
        public void flush() throws java.io.IOException {
            X9.C1835c c1835c = X9.C1835c.this;
            X9.X x6 = this.f16129D;
            c1835c.v();
            try {
                try {
                    x6.flush();
                    p087i7.M m6 = p087i7.M.f46721a;
                    if (c1835c.w()) {
                        throw c1835c.p(null);
                    }
                } catch (java.io.IOException e6) {
                    if (!c1835c.w()) {
                        throw e6;
                    }
                    throw c1835c.p(e6);
                }
            } catch (java.lang.Throwable th) {
                c1835c.w();
                throw th;
            }
        }

        public java.lang.String toString() {
            return "AsyncTimeout.sink(" + this.f16129D + ')';
        }
    }

    /* JADX INFO: renamed from: X9.c$d */
    public static final class d implements X9.Z {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ X9.Z f16131D;

        d(X9.Z z6) {
            this.f16131D = z6;
        }

        @Override // X9.Z
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public X9.C1835c k() {
            return X9.C1835c.this;
        }

        @Override // X9.Z
        public long b0(X9.C1836d c1836d, long j6) throws java.io.IOException {
            p247y7.AbstractC7350t.f(c1836d, "sink");
            X9.C1835c c1835c = X9.C1835c.this;
            X9.Z z6 = this.f16131D;
            c1835c.v();
            try {
                try {
                    long jB0 = z6.b0(c1836d, j6);
                    if (c1835c.w()) {
                        throw c1835c.p(null);
                    }
                    return jB0;
                } catch (java.io.IOException e6) {
                    if (c1835c.w()) {
                        throw c1835c.p(e6);
                    }
                    throw e6;
                }
            } catch (java.lang.Throwable th) {
                c1835c.w();
                throw th;
            }
        }

        @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            X9.C1835c c1835c = X9.C1835c.this;
            X9.Z z6 = this.f16131D;
            c1835c.v();
            try {
                try {
                    z6.close();
                    p087i7.M m6 = p087i7.M.f46721a;
                    if (c1835c.w()) {
                        throw c1835c.p(null);
                    }
                } catch (java.io.IOException e6) {
                    if (!c1835c.w()) {
                        throw e6;
                    }
                    throw c1835c.p(e6);
                }
            } catch (java.lang.Throwable th) {
                c1835c.w();
                throw th;
            }
        }

        public java.lang.String toString() {
            return "AsyncTimeout.source(" + this.f16131D + ')';
        }
    }

    static {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        f16120j = reentrantLock;
        java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
        p247y7.AbstractC7350t.e(conditionNewCondition, "newCondition(...)");
        f16121k = conditionNewCondition;
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(60L);
        f16122l = millis;
        f16123m = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j6) {
        return this.f16127h - j6;
    }

    public final X9.Z A(X9.Z z6) {
        p247y7.AbstractC7350t.f(z6, "source");
        return new X9.C1835c.d(z6);
    }

    protected void B() {
    }

    public final java.io.IOException p(java.io.IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = f16120j;
            reentrantLock.lock();
            try {
                if (this.f16125f != 0) {
                    throw new java.lang.IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f16125f = 1;
                f16119i.f(this, jH, zE);
                p087i7.M m6 = p087i7.M.f46721a;
                reentrantLock.unlock();
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean w() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = f16120j;
        reentrantLock.lock();
        try {
            int i6 = this.f16125f;
            this.f16125f = 0;
            if (i6 != 1) {
                return i6 == 2;
            }
            f16119i.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected java.io.IOException x(java.io.IOException iOException) {
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final X9.X z(X9.X x6) {
        p247y7.AbstractC7350t.f(x6, "sink");
        return new X9.C1835c.C0305c(x6);
    }
}
