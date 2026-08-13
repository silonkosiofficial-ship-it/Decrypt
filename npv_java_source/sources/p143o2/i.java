package p143o2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.locks.ReentrantLock f52422a = new java.util.concurrent.locks.ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f52423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f52424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f52425d;

    public enum a {
        NO_OP,
        ADD,
        REMOVE
    }

    public i(int i6) {
        this.f52423b = new long[i6];
        this.f52424c = new boolean[i6];
    }

    public final void a() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f52422a;
        reentrantLock.lock();
        try {
            this.f52425d = true;
            p087i7.M m6 = p087i7.M.f46721a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final o2.i.a[] b() {
        o2.i.a aVar;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f52422a;
        reentrantLock.lock();
        try {
            if (!this.f52425d) {
                return null;
            }
            this.f52425d = false;
            int length = this.f52423b.length;
            o2.i.a[] aVarArr = new o2.i.a[length];
            for (int i6 = 0; i6 < length; i6++) {
                boolean z6 = this.f52423b[i6] > 0;
                boolean[] zArr = this.f52424c;
                if (z6 != zArr[i6]) {
                    zArr[i6] = z6;
                    aVar = z6 ? o2.i.a.ADD : o2.i.a.REMOVE;
                } else {
                    aVar = o2.i.a.NO_OP;
                }
                aVarArr[i6] = aVar;
            }
            return aVarArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "tableIds");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f52422a;
        reentrantLock.lock();
        try {
            boolean z6 = false;
            for (int i6 : iArr) {
                long[] jArr = this.f52423b;
                long j6 = jArr[i6];
                jArr[i6] = 1 + j6;
                if (j6 == 0) {
                    z6 = true;
                    this.f52425d = true;
                }
            }
            reentrantLock.unlock();
            return z6;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean d(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "tableIds");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f52422a;
        reentrantLock.lock();
        try {
            boolean z6 = false;
            for (int i6 : iArr) {
                long[] jArr = this.f52423b;
                long j6 = jArr[i6];
                jArr[i6] = j6 - 1;
                if (j6 == 1) {
                    z6 = true;
                    this.f52425d = true;
                }
            }
            reentrantLock.unlock();
            return z6;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f52422a;
        reentrantLock.lock();
        try {
            p097j7.AbstractC6872n.C(this.f52424c, false, 0, 0, 6, null);
            this.f52425d = true;
            p087i7.M m6 = p087i7.M.f46721a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
