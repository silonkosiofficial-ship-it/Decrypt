package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ed0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3607ed0 implements Q3.AbstractC1464c.a, Q3.AbstractC1464c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.C2269Dd0 f35018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f35019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f35020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.LinkedBlockingQueue f35021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.os.HandlerThread f35022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2929Vc0 f35023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f35024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f35025h;

    public C3607ed0(android.content.Context context, int i6, int i10, java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.C2929Vc0 c2929Vc0) {
        this.f35019b = str;
        this.f35025h = i10;
        this.f35020c = str2;
        this.f35023f = c2929Vc0;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("GassDGClient");
        this.f35022e = handlerThread;
        handlerThread.start();
        this.f35024g = java.lang.System.currentTimeMillis();
        com.google.android.gms.internal.ads.C2269Dd0 c2269Dd0 = new com.google.android.gms.internal.ads.C2269Dd0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f35018a = c2269Dd0;
        this.f35021d = new java.util.concurrent.LinkedBlockingQueue();
        c2269Dd0.q();
    }

    private final void d(int i6, long j6, java.lang.Exception exc) {
        this.f35023f.c(i6, java.lang.System.currentTimeMillis() - j6, exc);
    }

    @Override // Q3.AbstractC1464c.a
    public final void L0(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.C2454Id0 c2454Id0C = c();
        if (c2454Id0C != null) {
            try {
                com.google.android.gms.internal.ads.C2749Qd0 c2749Qd0T2 = c2454Id0C.T2(new com.google.android.gms.internal.ads.C2638Nd0(1, this.f35025h, this.f35019b, this.f35020c));
                d(5011, this.f35024g, null);
                this.f35021d.put(c2749Qd0T2);
            } catch (java.lang.Throwable th) {
                try {
                    d(2010, this.f35024g, new java.lang.Exception(th));
                } finally {
                    b();
                    this.f35022e.quit();
                }
            }
        }
    }

    public final com.google.android.gms.internal.ads.C2749Qd0 a(int i6) {
        com.google.android.gms.internal.ads.C2749Qd0 c2749Qd0;
        try {
            c2749Qd0 = (com.google.android.gms.internal.ads.C2749Qd0) this.f35021d.poll(50000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e6) {
            d(2009, this.f35024g, e6);
            c2749Qd0 = null;
        }
        d(3004, this.f35024g, null);
        if (c2749Qd0 != null) {
            com.google.android.gms.internal.ads.C2929Vc0.g(c2749Qd0.f31022E == 7 ? 3 : 2);
        }
        return c2749Qd0 == null ? new com.google.android.gms.internal.ads.C2749Qd0(null, 1) : c2749Qd0;
    }

    public final void b() {
        com.google.android.gms.internal.ads.C2269Dd0 c2269Dd0 = this.f35018a;
        if (c2269Dd0 != null) {
            if (c2269Dd0.j() || this.f35018a.e()) {
                this.f35018a.h();
            }
        }
    }

    protected final com.google.android.gms.internal.ads.C2454Id0 c() {
        try {
            return this.f35018a.j0();
        } catch (android.os.DeadObjectException | java.lang.IllegalStateException unused) {
            return null;
        }
    }

    @Override // Q3.AbstractC1464c.b
    public final void q0(N3.C1389b c1389b) {
        try {
            d(4012, this.f35024g, null);
            this.f35021d.put(new com.google.android.gms.internal.ads.C2749Qd0(null, 1));
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // Q3.AbstractC1464c.a
    public final void y0(int i6) {
        try {
            d(4011, this.f35024g, null);
            this.f35021d.put(new com.google.android.gms.internal.ads.C2749Qd0(null, 1));
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
