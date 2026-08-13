package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Handler f27264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.G f27265b;

    public F(android.os.Handler handler, com.google.android.gms.internal.ads.G g6) {
        this.f27264a = g6 == null ? null : handler;
        this.f27265b = g6;
    }

    public final void a(final java.lang.String str, final long j6, final long j10) {
        android.os.Handler handler = this.f27264a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39066C.g(str, j6, j10);
                }
            });
        }
    }

    public final void b(final java.lang.String str) {
        android.os.Handler handler = this.f27264a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.E
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26856C.h(str);
                }
            });
        }
    }

    public final void c(final com.google.android.gms.internal.ads.Gz0 gz0) {
        gz0.a();
        android.os.Handler handler = this.f27264a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.C
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26107C.i(gz0);
                }
            });
        }
    }

    public final void d(final int i6, final long j6) {
        android.os.Handler handler = this.f27264a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39491C.j(i6, j6);
                }
            });
        }
    }

    public final void e(final com.google.android.gms.internal.ads.Gz0 gz0) {
        android.os.Handler handler = this.f27264a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.A
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24990C.k(gz0);
                }
            });
        }
    }

    public final void f(final com.google.android.gms.internal.ads.D d6, final com.google.android.gms.internal.ads.Hz0 hz0) {
        android.os.Handler handler = this.f27264a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.B
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25829C.l(d6, hz0);
                }
            });
        }
    }

    final /* synthetic */ void g(java.lang.String str, long j6, long j10) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f27265b.L0(str, j6, j10);
    }

    final /* synthetic */ void h(java.lang.String str) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f27265b.J0(str);
    }

    final /* synthetic */ void i(com.google.android.gms.internal.ads.Gz0 gz0) {
        gz0.a();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f27265b.K0(gz0);
    }

    final /* synthetic */ void j(int i6, long j6) {
        int i10 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f27265b.Q0(i6, j6);
    }

    final /* synthetic */ void k(com.google.android.gms.internal.ads.Gz0 gz0) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f27265b.N0(gz0);
    }

    final /* synthetic */ void l(com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.Hz0 hz0) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f27265b.P0(d6, hz0);
    }

    final /* synthetic */ void m(java.lang.Object obj, long j6) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f27265b.M0(obj, j6);
    }

    final /* synthetic */ void n(long j6, int i6) {
        int i10 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f27265b.R0(j6, i6);
    }

    final /* synthetic */ void o(java.lang.Exception exc) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f27265b.O0(exc);
    }

    final /* synthetic */ void p(com.google.android.gms.internal.ads.C2697Os c2697Os) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f27265b.S0(c2697Os);
    }

    public final void q(final java.lang.Object obj) {
        android.os.Handler handler = this.f27264a;
        if (handler != null) {
            final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39757C.m(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void r(final long j6, final int i6) {
        android.os.Handler handler = this.f27264a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39968C.n(j6, i6);
                }
            });
        }
    }

    public final void s(final java.lang.Exception exc) {
        android.os.Handler handler = this.f27264a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40184C.o(exc);
                }
            });
        }
    }

    public final void t(final com.google.android.gms.internal.ads.C2697Os c2697Os) {
        android.os.Handler handler = this.f27264a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39303C.p(c2697Os);
                }
            });
        }
    }
}
