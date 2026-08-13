package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class T2 extends java.lang.Thread {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f42155C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.BlockingQueue f42156D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f42157E = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.P2 f42158F;

    public T2(com.google.android.gms.measurement.internal.P2 p6, java.lang.String str, java.util.concurrent.BlockingQueue blockingQueue) {
        this.f42158F = p6;
        Q3.AbstractC1477p.l(str);
        Q3.AbstractC1477p.l(blockingQueue);
        this.f42155C = new java.lang.Object();
        this.f42156D = blockingQueue;
        setName(str);
    }

    private final void b(java.lang.InterruptedException interruptedException) {
        this.f42158F.j().L().b(getName() + " was interrupted", interruptedException);
    }

    private final void c() {
        synchronized (this.f42158F.f42087i) {
            try {
                if (!this.f42157E) {
                    this.f42158F.f42088j.release();
                    this.f42158F.f42087i.notifyAll();
                    if (this == this.f42158F.f42081c) {
                        this.f42158F.f42081c = null;
                    } else if (this == this.f42158F.f42082d) {
                        this.f42158F.f42082d = null;
                    } else {
                        this.f42158F.j().G().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f42157E = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        synchronized (this.f42155C) {
            this.f42155C.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z6 = false;
        while (!z6) {
            try {
                this.f42158F.f42088j.acquire();
                z6 = true;
            } catch (java.lang.InterruptedException e6) {
                b(e6);
            }
        }
        try {
            int threadPriority = android.os.Process.getThreadPriority(android.os.Process.myTid());
            while (true) {
                com.google.android.gms.measurement.internal.Q2 q6 = (com.google.android.gms.measurement.internal.Q2) this.f42156D.poll();
                if (q6 != null) {
                    android.os.Process.setThreadPriority(q6.f42099D ? threadPriority : 10);
                    q6.run();
                } else {
                    synchronized (this.f42155C) {
                        if (this.f42156D.peek() == null && !this.f42158F.f42089k) {
                            try {
                                this.f42155C.wait(30000L);
                            } catch (java.lang.InterruptedException e10) {
                                b(e10);
                            }
                        }
                    }
                    synchronized (this.f42158F.f42087i) {
                        if (this.f42156D.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            c();
            throw th;
        }
    }
}
