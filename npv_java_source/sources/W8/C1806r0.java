package W8;

/* JADX INFO: renamed from: W8.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1806r0 extends W8.AbstractC1805q0 implements W8.X {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.concurrent.Executor f15531F;

    public C1806r0(java.util.concurrent.Executor executor) {
        this.f15531F = executor;
        if (z1() instanceof java.util.concurrent.ScheduledThreadPoolExecutor) {
            ((java.util.concurrent.ScheduledThreadPoolExecutor) z1()).setRemoveOnCancelPolicy(true);
        }
    }

    private final void A1(p127m7.i iVar, java.util.concurrent.RejectedExecutionException rejectedExecutionException) {
        W8.C0.d(iVar, W8.AbstractC1801o0.a("The task was rejected", rejectedExecutionException));
    }

    private final java.util.concurrent.ScheduledFuture B1(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.lang.Runnable runnable, p127m7.i iVar, long j6) {
        try {
            return scheduledExecutorService.schedule(runnable, j6, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.util.concurrent.RejectedExecutionException e6) {
            A1(iVar, e6);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.util.concurrent.Executor executorZ1 = z1();
        java.util.concurrent.ExecutorService executorService = executorZ1 instanceof java.util.concurrent.ExecutorService ? (java.util.concurrent.ExecutorService) executorZ1 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof W8.C1806r0) && ((W8.C1806r0) obj).z1() == z1();
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(z1());
    }

    @Override // W8.X
    public W8.InterfaceC1783f0 m1(long j6, java.lang.Runnable runnable, p127m7.i iVar) {
        java.util.concurrent.Executor executorZ1 = z1();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executorZ1 instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executorZ1 : null;
        java.util.concurrent.ScheduledFuture scheduledFutureB1 = scheduledExecutorService != null ? B1(scheduledExecutorService, runnable, iVar, j6) : null;
        return scheduledFutureB1 != null ? new W8.C1781e0(scheduledFutureB1) : W8.T.f15472K.m1(j6, runnable, iVar);
    }

    @Override // W8.J
    public void t1(p127m7.i iVar, java.lang.Runnable runnable) {
        try {
            java.util.concurrent.Executor executorZ1 = z1();
            W8.AbstractC1776c.a();
            executorZ1.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e6) {
            W8.AbstractC1776c.a();
            A1(iVar, e6);
            W8.C1779d0.b().t1(iVar, runnable);
        }
    }

    @Override // W8.J
    public java.lang.String toString() {
        return z1().toString();
    }

    @Override // W8.X
    public void x0(long j6, W8.InterfaceC1794l interfaceC1794l) {
        java.util.concurrent.Executor executorZ1 = z1();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executorZ1 instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executorZ1 : null;
        java.util.concurrent.ScheduledFuture scheduledFutureB1 = scheduledExecutorService != null ? B1(scheduledExecutorService, new W8.R0(this, interfaceC1794l), interfaceC1794l.getContext(), j6) : null;
        if (scheduledFutureB1 != null) {
            W8.AbstractC1802p.c(interfaceC1794l, new W8.C1790j(scheduledFutureB1));
        } else {
            W8.T.f15472K.x0(j6, interfaceC1794l);
        }
    }

    @Override // W8.AbstractC1805q0
    public java.util.concurrent.Executor z1() {
        return this.f15531F;
    }
}
