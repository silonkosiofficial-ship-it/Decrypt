package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractRunnableC6308v1 extends java.util.concurrent.atomic.AtomicReference implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final java.lang.Runnable f41658C = new com.google.android.gms.internal.play_billing.RunnableC6296t1(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final java.lang.Runnable f41659D = new com.google.android.gms.internal.play_billing.RunnableC6296t1(null);

    AbstractRunnableC6308v1() {
    }

    private final void g(java.lang.Thread thread) {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        com.google.android.gms.internal.play_billing.RunnableC6290s1 runnableC6290s1 = null;
        boolean z6 = false;
        int i6 = 0;
        while (true) {
            if (!(runnable instanceof com.google.android.gms.internal.play_billing.RunnableC6290s1)) {
                if (runnable != f41659D) {
                    break;
                }
            } else {
                runnableC6290s1 = (com.google.android.gms.internal.play_billing.RunnableC6290s1) runnable;
            }
            i6++;
            if (i6 > 1000) {
                java.lang.Runnable runnable2 = f41659D;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z6 = java.lang.Thread.interrupted() || z6;
                    java.util.concurrent.locks.LockSupport.park(runnableC6290s1);
                }
            } else {
                java.lang.Thread.yield();
            }
            runnable = (java.lang.Runnable) get();
        }
        if (z6) {
            thread.interrupt();
        }
    }

    abstract java.lang.Object a();

    abstract java.lang.String b();

    abstract void c(java.lang.Throwable th);

    abstract void d(java.lang.Object obj);

    final void e() {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable instanceof java.lang.Thread) {
            com.google.android.gms.internal.play_billing.RunnableC6290s1 runnableC6290s1 = new com.google.android.gms.internal.play_billing.RunnableC6290s1(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(java.lang.Thread.currentThread());
            if (compareAndSet(runnable, runnableC6290s1)) {
                try {
                    ((java.lang.Thread) runnable).interrupt();
                    if (((java.lang.Runnable) getAndSet(f41658C)) == f41659D) {
                    }
                } finally {
                    if (((java.lang.Runnable) getAndSet(f41658C)) == f41659D) {
                        java.util.concurrent.locks.LockSupport.unpark((java.lang.Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean f();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z6 = !f();
            if (z6) {
                try {
                    objA = a();
                } catch (java.lang.Throwable th) {
                    try {
                        if (th instanceof java.lang.InterruptedException) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, f41658C)) {
                            g(threadCurrentThread);
                        }
                        c(th);
                        return;
                    } catch (java.lang.Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f41658C)) {
                            g(threadCurrentThread);
                        }
                        d(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f41658C)) {
                g(threadCurrentThread);
            }
            if (z6) {
                d(objA);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable == f41658C) {
            str = "running=[DONE]";
        } else if (runnable instanceof com.google.android.gms.internal.play_billing.RunnableC6290s1) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof java.lang.Thread) {
            str = "running=[RUNNING ON " + ((java.lang.Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
