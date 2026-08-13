package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class P6 extends java.lang.Thread {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final boolean f30648I = com.google.android.gms.internal.ads.AbstractC4545n7.f37506b;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.BlockingQueue f30649C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.BlockingQueue f30650D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.N6 f30651E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private volatile boolean f30652F = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4655o7 f30653G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.U6 f30654H;

    public P6(java.util.concurrent.BlockingQueue blockingQueue, java.util.concurrent.BlockingQueue blockingQueue2, com.google.android.gms.internal.ads.N6 n6, com.google.android.gms.internal.ads.U6 u6) {
        this.f30649C = blockingQueue;
        this.f30650D = blockingQueue2;
        this.f30651E = n6;
        this.f30654H = u6;
        this.f30653G = new com.google.android.gms.internal.ads.C4655o7(this, blockingQueue2, u6);
    }

    private void c() {
        com.google.android.gms.internal.ads.U6 u6;
        java.util.concurrent.BlockingQueue blockingQueue;
        com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7 = (com.google.android.gms.internal.ads.AbstractC3448d7) this.f30649C.take();
        abstractC3448d7.v("cache-queue-take");
        abstractC3448d7.C(1);
        try {
            abstractC3448d7.F();
            com.google.android.gms.internal.ads.M6 m6O = this.f30651E.o(abstractC3448d7.s());
            if (m6O == null) {
                abstractC3448d7.v("cache-miss");
                if (!this.f30653G.c(abstractC3448d7)) {
                    blockingQueue = this.f30650D;
                    blockingQueue.put(abstractC3448d7);
                }
            } else {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (m6O.a(jCurrentTimeMillis)) {
                    abstractC3448d7.v("cache-hit-expired");
                    abstractC3448d7.m(m6O);
                    if (!this.f30653G.c(abstractC3448d7)) {
                        blockingQueue = this.f30650D;
                        blockingQueue.put(abstractC3448d7);
                    }
                } else {
                    abstractC3448d7.v("cache-hit");
                    com.google.android.gms.internal.ads.C3887h7 c3887h7Q = abstractC3448d7.q(new com.google.android.gms.internal.ads.Z6(m6O.f29656a, m6O.f29662g));
                    abstractC3448d7.v("cache-hit-parsed");
                    if (c3887h7Q.c()) {
                        if (m6O.f29661f < jCurrentTimeMillis) {
                            abstractC3448d7.v("cache-hit-refresh-needed");
                            abstractC3448d7.m(m6O);
                            c3887h7Q.f36009d = true;
                            if (this.f30653G.c(abstractC3448d7)) {
                                u6 = this.f30654H;
                            } else {
                                this.f30654H.b(abstractC3448d7, c3887h7Q, new com.google.android.gms.internal.ads.O6(this, abstractC3448d7));
                            }
                        } else {
                            u6 = this.f30654H;
                        }
                        u6.b(abstractC3448d7, c3887h7Q, null);
                    } else {
                        abstractC3448d7.v("cache-parsing-failed");
                        this.f30651E.p(abstractC3448d7.s(), true);
                        abstractC3448d7.m(null);
                        if (!this.f30653G.c(abstractC3448d7)) {
                            blockingQueue = this.f30650D;
                            blockingQueue.put(abstractC3448d7);
                        }
                    }
                }
            }
        } finally {
            abstractC3448d7.C(2);
        }
    }

    public final void b() {
        this.f30652F = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f30648I) {
            com.google.android.gms.internal.ads.AbstractC4545n7.d("start new dispatcher", new java.lang.Object[0]);
        }
        android.os.Process.setThreadPriority(10);
        this.f30651E.b();
        while (true) {
            try {
                c();
            } catch (java.lang.InterruptedException unused) {
                if (this.f30652F) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
                com.google.android.gms.internal.ads.AbstractC4545n7.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new java.lang.Object[0]);
            }
        }
    }
}
