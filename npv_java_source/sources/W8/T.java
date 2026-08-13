package W8;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends W8.AbstractC1793k0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final W8.T f15472K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final long f15473L;
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    static {
        java.lang.Long l6;
        W8.T t6 = new W8.T();
        f15472K = t6;
        W8.AbstractC1791j0.F1(t6, false, 1, null);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        try {
            l6 = java.lang.Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (java.lang.SecurityException unused) {
            l6 = 1000L;
        }
        f15473L = timeUnit.toNanos(l6.longValue());
    }

    private T() {
    }

    private final synchronized void f2() {
        if (i2()) {
            debugStatus = 3;
            Z1();
            p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized java.lang.Thread g2() {
        java.lang.Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new java.lang.Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f15472K.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean h2() {
        return debugStatus == 4;
    }

    private final boolean i2() {
        int i6 = debugStatus;
        return i6 == 2 || i6 == 3;
    }

    private final synchronized boolean j2() {
        if (i2()) {
            return false;
        }
        debugStatus = 1;
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void k2() {
        throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // W8.AbstractC1795l0
    protected java.lang.Thread L1() {
        java.lang.Thread thread = _thread;
        return thread == null ? g2() : thread;
    }

    @Override // W8.AbstractC1795l0
    protected void M1(long j6, W8.AbstractC1793k0.c cVar) {
        k2();
    }

    @Override // W8.AbstractC1793k0
    public void R1(java.lang.Runnable runnable) {
        if (h2()) {
            k2();
        }
        super.R1(runnable);
    }

    @Override // W8.AbstractC1793k0, W8.X
    public W8.InterfaceC1783f0 m1(long j6, java.lang.Runnable runnable, p127m7.i iVar) {
        return c2(j6, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zX1;
        W8.X0.f15476a.d(this);
        W8.AbstractC1776c.a();
        try {
            if (!j2()) {
                if (zX1) {
                    return;
                } else {
                    return;
                }
            }
            long j6 = Long.MAX_VALUE;
            while (true) {
                java.lang.Thread.interrupted();
                long jI1 = I1();
                if (jI1 == Long.MAX_VALUE) {
                    W8.AbstractC1776c.a();
                    long jNanoTime = java.lang.System.nanoTime();
                    if (j6 == Long.MAX_VALUE) {
                        j6 = f15473L + jNanoTime;
                    }
                    long j10 = j6 - jNanoTime;
                    if (j10 <= 0) {
                        if (zX1) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jI1 = E7.j.h(jI1, j10);
                } else {
                    j6 = Long.MAX_VALUE;
                }
                if (jI1 > 0) {
                    if (i2()) {
                        if (zX1) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        W8.AbstractC1776c.a();
                        java.util.concurrent.locks.LockSupport.parkNanos(this, jI1);
                    }
                }
            }
        } finally {
            _thread = null;
            f2();
            W8.AbstractC1776c.a();
            if (!X1()) {
                L1();
            }
        }
    }

    @Override // W8.AbstractC1793k0, W8.AbstractC1791j0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // W8.J
    public java.lang.String toString() {
        return "DefaultExecutor";
    }
}
