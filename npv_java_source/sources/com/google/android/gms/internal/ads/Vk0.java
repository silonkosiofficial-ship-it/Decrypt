package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Vk0 extends java.util.concurrent.atomic.AtomicReference implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final java.lang.Runnable f32567C = new com.google.android.gms.internal.ads.Tk0(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final java.lang.Runnable f32568D = new com.google.android.gms.internal.ads.Tk0(null);

    Vk0() {
    }

    private final void c(java.lang.Thread thread) {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        com.google.android.gms.internal.ads.Sk0 sk0 = null;
        boolean z6 = false;
        int i6 = 0;
        while (true) {
            if (!(runnable instanceof com.google.android.gms.internal.ads.Sk0)) {
                if (runnable != f32568D) {
                    break;
                }
            } else {
                sk0 = (com.google.android.gms.internal.ads.Sk0) runnable;
            }
            i6++;
            if (i6 > 1000) {
                java.lang.Runnable runnable2 = f32568D;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z6 = java.lang.Thread.interrupted() || z6;
                    java.util.concurrent.locks.LockSupport.park(sk0);
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

    abstract void d(java.lang.Throwable th);

    abstract void e(java.lang.Object obj);

    abstract boolean f();

    final void g() {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable instanceof java.lang.Thread) {
            com.google.android.gms.internal.ads.Sk0 sk0 = new com.google.android.gms.internal.ads.Sk0(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(java.lang.Thread.currentThread());
            if (compareAndSet(runnable, sk0)) {
                try {
                    ((java.lang.Thread) runnable).interrupt();
                    if (((java.lang.Runnable) getAndSet(f32567C)) == f32568D) {
                    }
                } finally {
                    if (((java.lang.Runnable) getAndSet(f32567C)) == f32568D) {
                        java.util.concurrent.locks.LockSupport.unpark((java.lang.Thread) runnable);
                    }
                }
            }
        }
    }

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
                        com.google.android.gms.internal.ads.AbstractC3953hl0.a(th);
                        if (!compareAndSet(threadCurrentThread, f32567C)) {
                            c(threadCurrentThread);
                        }
                        d(th);
                        return;
                    } catch (java.lang.Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f32567C)) {
                            c(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f32567C)) {
                c(threadCurrentThread);
            }
            if (z6) {
                e(objA);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable == f32567C) {
            str = "running=[DONE]";
        } else if (runnable instanceof com.google.android.gms.internal.ads.Sk0) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof java.lang.Thread) {
            str = "running=[RUNNING ON " + ((java.lang.Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
