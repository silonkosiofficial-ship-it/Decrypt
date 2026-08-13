package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Q60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V3.f f30892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f30893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f30894c = new java.lang.Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f30896e = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile long f30895d = 0;

    public Q60(V3.f fVar, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f30892a = fVar;
        this.f30893b = c3588eO;
    }

    private final void e() {
        long jA = this.f30892a.a();
        synchronized (this.f30894c) {
            try {
                if (this.f30896e == 3) {
                    if (this.f30895d + ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25377P5)).longValue() <= jA) {
                        this.f30896e = 1;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private final void f(int i6, int i10) {
        e();
        java.lang.Object obj = this.f30894c;
        long jA = this.f30892a.a();
        synchronized (obj) {
            try {
                if (this.f30896e != i6) {
                    return;
                }
                this.f30896e = i10;
                if (this.f30896e == 3) {
                    this.f30895d = jA;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        f(2, 3);
    }

    public final void b(boolean z6) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Tc)).booleanValue()) {
            com.google.android.gms.internal.ads.C3479dO c3479dOA = this.f30893b.a();
            c3479dOA.b("action", "mbs_state");
            c3479dOA.b("mbs_state", true != z6 ? "0" : "1");
            c3479dOA.g();
        }
        if (z6) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean c() {
        boolean z6;
        synchronized (this.f30894c) {
            e();
            z6 = this.f30896e == 3;
        }
        return z6;
    }

    public final boolean d() {
        boolean z6;
        synchronized (this.f30894c) {
            e();
            z6 = this.f30896e == 2;
        }
        return z6;
    }
}
