package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class X6 extends java.lang.Thread {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.BlockingQueue f33059C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.W6 f33060D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.N6 f33061E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private volatile boolean f33062F = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.U6 f33063G;

    public X6(java.util.concurrent.BlockingQueue blockingQueue, com.google.android.gms.internal.ads.W6 w6, com.google.android.gms.internal.ads.N6 n6, com.google.android.gms.internal.ads.U6 u6) {
        this.f33059C = blockingQueue;
        this.f33060D = w6;
        this.f33061E = n6;
        this.f33063G = u6;
    }

    private void b() {
        com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7 = (com.google.android.gms.internal.ads.AbstractC3448d7) this.f33059C.take();
        android.os.SystemClock.elapsedRealtime();
        abstractC3448d7.C(3);
        try {
            try {
                abstractC3448d7.v("network-queue-take");
                abstractC3448d7.F();
                android.net.TrafficStats.setThreadStatsTag(abstractC3448d7.g());
                com.google.android.gms.internal.ads.Z6 z6A = this.f33060D.a(abstractC3448d7);
                abstractC3448d7.v("network-http-complete");
                if (z6A.f33504e && abstractC3448d7.E()) {
                    abstractC3448d7.y("not-modified");
                    abstractC3448d7.A();
                } else {
                    com.google.android.gms.internal.ads.C3887h7 c3887h7Q = abstractC3448d7.q(z6A);
                    abstractC3448d7.v("network-parse-complete");
                    if (c3887h7Q.f36007b != null) {
                        this.f33061E.q(abstractC3448d7.s(), c3887h7Q.f36007b);
                        abstractC3448d7.v("network-cache-written");
                    }
                    abstractC3448d7.z();
                    this.f33063G.b(abstractC3448d7, c3887h7Q, null);
                    abstractC3448d7.B(c3887h7Q);
                }
            } catch (com.google.android.gms.internal.ads.C4215k7 e6) {
                android.os.SystemClock.elapsedRealtime();
                this.f33063G.a(abstractC3448d7, e6);
                abstractC3448d7.A();
            } catch (java.lang.Exception e10) {
                com.google.android.gms.internal.ads.AbstractC4545n7.c(e10, "Unhandled exception %s", e10.toString());
                com.google.android.gms.internal.ads.C4215k7 c4215k7 = new com.google.android.gms.internal.ads.C4215k7(e10);
                android.os.SystemClock.elapsedRealtime();
                this.f33063G.a(abstractC3448d7, c4215k7);
                abstractC3448d7.A();
            }
            abstractC3448d7.C(4);
        } catch (java.lang.Throwable th) {
            abstractC3448d7.C(4);
            throw th;
        }
    }

    public final void a() {
        this.f33062F = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (java.lang.InterruptedException unused) {
                if (this.f33062F) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
                com.google.android.gms.internal.ads.AbstractC4545n7.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new java.lang.Object[0]);
            }
        }
    }
}
