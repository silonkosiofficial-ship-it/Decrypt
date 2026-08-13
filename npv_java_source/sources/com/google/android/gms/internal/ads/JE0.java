package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class JE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Handler f28653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KE0 f28654b;

    public JE0(android.os.Handler handler, com.google.android.gms.internal.ads.KE0 ke0) {
        this.f28653a = ke0 == null ? null : handler;
        this.f28654b = ke0;
    }

    public final void a(final java.lang.Exception exc) {
        android.os.Handler handler = this.f28653a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.CE0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26163C.j(exc);
                }
            });
        }
    }

    public final void b(final java.lang.Exception exc) {
        android.os.Handler handler = this.f28653a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.DE0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26632C.k(exc);
                }
            });
        }
    }

    public final void c(final com.google.android.gms.internal.ads.LE0 le0) {
        android.os.Handler handler = this.f28653a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.AE0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25092C.l(le0);
                }
            });
        }
    }

    public final void d(final com.google.android.gms.internal.ads.LE0 le0) {
        android.os.Handler handler = this.f28653a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.BE0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25916C.m(le0);
                }
            });
        }
    }

    public final void e(final java.lang.String str, final long j6, final long j10) {
        android.os.Handler handler = this.f28653a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.HE0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27993C.n(str, j6, j10);
                }
            });
        }
    }

    public final void f(final java.lang.String str) {
        android.os.Handler handler = this.f28653a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.IE0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28428C.o(str);
                }
            });
        }
    }

    public final void g(final com.google.android.gms.internal.ads.Gz0 gz0) {
        gz0.a();
        android.os.Handler handler = this.f28653a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.xE0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39813C.p(gz0);
                }
            });
        }
    }

    public final void h(final com.google.android.gms.internal.ads.Gz0 gz0) {
        android.os.Handler handler = this.f28653a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.wE0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39564C.q(gz0);
                }
            });
        }
    }

    public final void i(final com.google.android.gms.internal.ads.D d6, final com.google.android.gms.internal.ads.Hz0 hz0) {
        android.os.Handler handler = this.f28653a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.FE0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27326C.r(d6, hz0);
                }
            });
        }
    }

    final /* synthetic */ void j(java.lang.Exception exc) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28654b.a(exc);
    }

    final /* synthetic */ void k(java.lang.Exception exc) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28654b.h(exc);
    }

    final /* synthetic */ void l(com.google.android.gms.internal.ads.LE0 le0) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28654b.d(le0);
    }

    final /* synthetic */ void m(com.google.android.gms.internal.ads.LE0 le0) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28654b.c(le0);
    }

    final /* synthetic */ void n(java.lang.String str, long j6, long j10) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28654b.f(str, j6, j10);
    }

    final /* synthetic */ void o(java.lang.String str) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28654b.E(str);
    }

    final /* synthetic */ void p(com.google.android.gms.internal.ads.Gz0 gz0) {
        gz0.a();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28654b.j(gz0);
    }

    final /* synthetic */ void q(com.google.android.gms.internal.ads.Gz0 gz0) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28654b.i(gz0);
    }

    final /* synthetic */ void r(com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.Hz0 hz0) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28654b.g(d6, hz0);
    }

    final /* synthetic */ void s(long j6) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28654b.b(j6);
    }

    final /* synthetic */ void t(boolean z6) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28654b.O(z6);
    }

    final /* synthetic */ void u(int i6, long j6, long j10) {
        int i10 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28654b.e(i6, j6, j10);
    }

    public final void v(final long j6) {
        android.os.Handler handler = this.f28653a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.yE0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40021C.s(j6);
                }
            });
        }
    }

    public final void w(final boolean z6) {
        android.os.Handler handler = this.f28653a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.GE0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27759C.t(z6);
                }
            });
        }
    }

    public final void x(final int i6, final long j6, final long j10) {
        android.os.Handler handler = this.f28653a;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zE0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40237C.u(i6, j6, j10);
                }
            });
        }
    }
}
