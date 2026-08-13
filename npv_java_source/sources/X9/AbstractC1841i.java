package X9;

/* JADX INFO: renamed from: X9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1841i implements java.io.Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f16157C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f16158D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f16159E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.concurrent.locks.ReentrantLock f16160F = X9.d0.b();

    /* JADX INFO: renamed from: X9.i$a */
    private static final class a implements X9.X {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final X9.AbstractC1841i f16161C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private long f16162D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private boolean f16163E;

        public a(X9.AbstractC1841i abstractC1841i, long j6) {
            p247y7.AbstractC7350t.f(abstractC1841i, "fileHandle");
            this.f16161C = abstractC1841i;
            this.f16162D = j6;
        }

        @Override // X9.X
        public void F0(X9.C1836d c1836d, long j6) {
            p247y7.AbstractC7350t.f(c1836d, "source");
            if (!(!this.f16163E)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            this.f16161C.q0(this.f16162D, c1836d, j6);
            this.f16162D += j6;
        }

        @Override // X9.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f16163E) {
                return;
            }
            this.f16163E = true;
            java.util.concurrent.locks.ReentrantLock reentrantLockR = this.f16161C.r();
            reentrantLockR.lock();
            try {
                this.f16161C.f16159E--;
                if (this.f16161C.f16159E == 0 && this.f16161C.f16158D) {
                    p087i7.M m6 = p087i7.M.f46721a;
                    reentrantLockR.unlock();
                    this.f16161C.s();
                    return;
                }
                reentrantLockR.unlock();
            } catch (java.lang.Throwable th) {
                reentrantLockR.unlock();
                throw th;
            }
        }

        @Override // X9.X, java.io.Flushable
        public void flush() {
            if (!(!this.f16163E)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            this.f16161C.y();
        }

        @Override // X9.X
        public X9.a0 k() {
            return X9.a0.f16113e;
        }
    }

    /* JADX INFO: renamed from: X9.i$b */
    private static final class b implements X9.Z {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final X9.AbstractC1841i f16164C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private long f16165D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private boolean f16166E;

        public b(X9.AbstractC1841i abstractC1841i, long j6) {
            p247y7.AbstractC7350t.f(abstractC1841i, "fileHandle");
            this.f16164C = abstractC1841i;
            this.f16165D = j6;
        }

        @Override // X9.Z
        public long b0(X9.C1836d c1836d, long j6) {
            p247y7.AbstractC7350t.f(c1836d, "sink");
            if (!(!this.f16166E)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            long jR = this.f16164C.R(this.f16165D, c1836d, j6);
            if (jR != -1) {
                this.f16165D += jR;
            }
            return jR;
        }

        @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f16166E) {
                return;
            }
            this.f16166E = true;
            java.util.concurrent.locks.ReentrantLock reentrantLockR = this.f16164C.r();
            reentrantLockR.lock();
            try {
                this.f16164C.f16159E--;
                if (this.f16164C.f16159E == 0 && this.f16164C.f16158D) {
                    p087i7.M m6 = p087i7.M.f46721a;
                    reentrantLockR.unlock();
                    this.f16164C.s();
                    return;
                }
                reentrantLockR.unlock();
            } catch (java.lang.Throwable th) {
                reentrantLockR.unlock();
                throw th;
            }
        }

        @Override // X9.Z
        public X9.a0 k() {
            return X9.a0.f16113e;
        }
    }

    public AbstractC1841i(boolean z6) {
        this.f16157C = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long R(long j6, X9.C1836d c1836d, long j10) {
        if (j10 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        long j11 = j10 + j6;
        long j12 = j6;
        while (j12 < j11) {
            X9.U uL1 = c1836d.l1(1);
            byte[] bArr = uL1.f16095a;
            int i6 = uL1.f16097c;
            int iD = D(j12, bArr, i6, (int) java.lang.Math.min(j11 - j12, 8192 - i6));
            if (iD == -1) {
                if (uL1.f16096b == uL1.f16097c) {
                    c1836d.f16138C = uL1.b();
                    X9.V.b(uL1);
                }
                if (j6 != j12) {
                    break;
                }
                return -1L;
            }
            uL1.f16097c += iD;
            long j13 = iD;
            j12 += j13;
            c1836d.c1(c1836d.d1() + j13);
        }
        return j12 - j6;
    }

    public static /* synthetic */ X9.X g0(X9.AbstractC1841i abstractC1841i, long j6, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i6 & 1) != 0) {
            j6 = 0;
        }
        return abstractC1841i.e0(j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(long j6, X9.C1836d c1836d, long j10) {
        X9.AbstractC1834b.b(c1836d.d1(), 0L, j10);
        long j11 = j10 + j6;
        while (j6 < j11) {
            X9.U u6 = c1836d.f16138C;
            p247y7.AbstractC7350t.c(u6);
            int iMin = (int) java.lang.Math.min(j11 - j6, u6.f16097c - u6.f16096b);
            N(j6, u6.f16095a, u6.f16096b, iMin);
            u6.f16096b += iMin;
            long j12 = iMin;
            j6 += j12;
            c1836d.c1(c1836d.d1() - j12);
            if (u6.f16096b == u6.f16097c) {
                c1836d.f16138C = u6.b();
                X9.V.b(u6);
            }
        }
    }

    protected abstract int D(long j6, byte[] bArr, int i6, int i10);

    protected abstract long H();

    protected abstract void N(long j6, byte[] bArr, int i6, int i10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f16160F;
        reentrantLock.lock();
        try {
            if (this.f16158D) {
                reentrantLock.unlock();
                return;
            }
            this.f16158D = true;
            if (this.f16159E != 0) {
                reentrantLock.unlock();
                return;
            }
            p087i7.M m6 = p087i7.M.f46721a;
            reentrantLock.unlock();
            s();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final X9.X e0(long j6) {
        if (!this.f16157C) {
            throw new java.lang.IllegalStateException("file handle is read-only".toString());
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f16160F;
        reentrantLock.lock();
        try {
            if (!(!this.f16158D)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            this.f16159E++;
            reentrantLock.unlock();
            return new X9.AbstractC1841i.a(this, j6);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.f16157C) {
            throw new java.lang.IllegalStateException("file handle is read-only".toString());
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f16160F;
        reentrantLock.lock();
        try {
            if (!(!this.f16158D)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            p087i7.M m6 = p087i7.M.f46721a;
            reentrantLock.unlock();
            y();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long n0() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f16160F;
        reentrantLock.lock();
        try {
            if (!(!this.f16158D)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            p087i7.M m6 = p087i7.M.f46721a;
            reentrantLock.unlock();
            return H();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final X9.Z o0(long j6) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f16160F;
        reentrantLock.lock();
        try {
            if (!(!this.f16158D)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            this.f16159E++;
            reentrantLock.unlock();
            return new X9.AbstractC1841i.b(this, j6);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final java.util.concurrent.locks.ReentrantLock r() {
        return this.f16160F;
    }

    protected abstract void s();

    protected abstract void y();
}
