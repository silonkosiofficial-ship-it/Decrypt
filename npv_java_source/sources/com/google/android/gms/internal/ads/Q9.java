package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Q9 implements com.google.android.gms.internal.ads.T9 {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static com.google.android.gms.internal.ads.Q9 f30903T;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f30904C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2565Ld0 f30905D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2859Td0 f30906E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2931Vd0 f30907F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5577wa f30908G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2929Vc0 f30909H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.concurrent.Executor f30910I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2823Sd0 f30911J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2631Na f30913L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2299Ea f30914M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5357ua f30915N;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private volatile boolean f30918Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private volatile boolean f30919R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final int f30920S;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    volatile long f30916O = 0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final java.lang.Object f30917P = new java.lang.Object();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final java.util.concurrent.CountDownLatch f30912K = new java.util.concurrent.CountDownLatch(1);

    Q9(android.content.Context context, com.google.android.gms.internal.ads.C2929Vc0 c2929Vc0, com.google.android.gms.internal.ads.C2565Ld0 c2565Ld0, com.google.android.gms.internal.ads.C2859Td0 c2859Td0, com.google.android.gms.internal.ads.C2931Vd0 c2931Vd0, com.google.android.gms.internal.ads.C5577wa c5577wa, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.C2747Qc0 c2747Qc0, int i6, com.google.android.gms.internal.ads.C2631Na c2631Na, com.google.android.gms.internal.ads.C2299Ea c2299Ea, com.google.android.gms.internal.ads.C5357ua c5357ua) {
        this.f30919R = false;
        this.f30904C = context;
        this.f30909H = c2929Vc0;
        this.f30905D = c2565Ld0;
        this.f30906E = c2859Td0;
        this.f30907F = c2931Vd0;
        this.f30908G = c5577wa;
        this.f30910I = executor;
        this.f30920S = i6;
        this.f30913L = c2631Na;
        this.f30914M = c2299Ea;
        this.f30915N = c5357ua;
        this.f30919R = false;
        this.f30911J = new com.google.android.gms.internal.ads.O9(this, c2747Qc0);
    }

    public static synchronized com.google.android.gms.internal.ads.Q9 j(android.content.Context context, com.google.android.gms.internal.ads.X7 x10, boolean z6) {
        com.google.android.gms.internal.ads.AbstractC2965Wc0 abstractC2965Wc0C;
        abstractC2965Wc0C = com.google.android.gms.internal.ads.AbstractC3001Xc0.c();
        abstractC2965Wc0C.a(x10.f0());
        abstractC2965Wc0C.g(x10.i0());
        return s(context, java.util.concurrent.Executors.newCachedThreadPool(), abstractC2965Wc0C.h(), z6);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d5 A[Catch: all -> 0x009d, Vv0 -> 0x00a0, TryCatch #0 {Vv0 -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:58:0x0021, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc A[Catch: all -> 0x009d, Vv0 -> 0x00a0, TryCatch #0 {Vv0 -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:58:0x0021, outer: #2 }] */
    static /* bridge */ /* synthetic */ void n(com.google.android.gms.internal.ads.Q9 q10) {
        java.lang.String str;
        java.lang.String strJ0;
        int length;
        boolean zA;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.android.gms.internal.ads.C2528Kd0 c2528Kd0U = q10.u(1);
        if (c2528Kd0U != null) {
            java.lang.String strK0 = c2528Kd0U.a().k0();
            strJ0 = c2528Kd0U.a().j0();
            str = strK0;
        } else {
            str = null;
            strJ0 = null;
        }
        try {
            try {
                com.google.android.gms.internal.ads.C2749Qd0 c2749Qd0A = com.google.android.gms.internal.ads.AbstractC3717fd0.a(q10.f30904C, 1, q10.f30920S, str, strJ0, "1", q10.f30909H);
                byte[] bArr = c2749Qd0A.f31021D;
                if (bArr == null || (length = bArr.length) == 0) {
                    q10.f30909H.d(5009, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        com.google.android.gms.internal.ads.C5799yb c5799ybC0 = com.google.android.gms.internal.ads.C5799yb.c0(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArr, 0, length), com.google.android.gms.internal.ads.C5730xv0.a());
                        if (c5799ybC0.d0().k0().isEmpty() || c5799ybC0.d0().j0().isEmpty() || c5799ybC0.e0().d().length == 0) {
                            q10.f30909H.d(5010, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            com.google.android.gms.internal.ads.C2528Kd0 c2528Kd0U2 = q10.u(1);
                            if (c2528Kd0U2 != null) {
                                com.google.android.gms.internal.ads.C2190Bb c2190BbA = c2528Kd0U2.a();
                                if (c5799ybC0.d0().k0().equals(c2190BbA.k0()) && c5799ybC0.d0().j0().equals(c2190BbA.j0())) {
                                    q10.f30909H.d(5010, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                                }
                            }
                            com.google.android.gms.internal.ads.InterfaceC2823Sd0 interfaceC2823Sd0 = q10.f30911J;
                            int i6 = c2749Qd0A.f31022E;
                            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25704u2)).booleanValue()) {
                                zA = q10.f30905D.a(c5799ybC0, interfaceC2823Sd0);
                            } else if (i6 == 3) {
                                zA = q10.f30906E.a(c5799ybC0);
                            } else if (i6 == 4) {
                                zA = q10.f30906E.b(c5799ybC0, interfaceC2823Sd0);
                            } else {
                                q10.f30909H.d(4009, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zA) {
                                com.google.android.gms.internal.ads.C2528Kd0 c2528Kd0U3 = q10.u(1);
                                if (c2528Kd0U3 != null) {
                                    if (q10.f30907F.c(c2528Kd0U3)) {
                                        q10.f30919R = true;
                                    }
                                    q10.f30916O = java.lang.System.currentTimeMillis() / 1000;
                                }
                            } else {
                                q10.f30909H.d(4009, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (java.lang.NullPointerException unused) {
                        q10.f30909H.d(2030, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (com.google.android.gms.internal.ads.Vv0 e6) {
                q10.f30909H.c(4002, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e6);
            }
        } finally {
            q10.f30912K.countDown();
        }
    }

    private static synchronized com.google.android.gms.internal.ads.Q9 s(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.AbstractC3001Xc0 abstractC3001Xc0, boolean z6) {
        try {
            if (f30903T == null) {
                com.google.android.gms.internal.ads.C2929Vc0 c2929Vc0A = com.google.android.gms.internal.ads.C2929Vc0.a(context, executor, z6);
                com.google.android.gms.internal.ads.C3710fa c3710faC = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25725w3)).booleanValue() ? com.google.android.gms.internal.ads.C3710fa.c(context) : null;
                com.google.android.gms.internal.ads.C2631Na c2631NaD = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25735x3)).booleanValue() ? com.google.android.gms.internal.ads.C2631Na.d(context, executor) : null;
                com.google.android.gms.internal.ads.C2299Ea c2299Ea = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25341M2)).booleanValue() ? new com.google.android.gms.internal.ads.C2299Ea() : null;
                com.google.android.gms.internal.ads.C5357ua c5357ua = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25418T2)).booleanValue() ? new com.google.android.gms.internal.ads.C5357ua() : null;
                com.google.android.gms.internal.ads.C4815pd0 c4815pd0E = com.google.android.gms.internal.ads.C4815pd0.e(context, executor, c2929Vc0A, abstractC3001Xc0);
                com.google.android.gms.internal.ads.C5467va c5467va = new com.google.android.gms.internal.ads.C5467va(context);
                com.google.android.gms.internal.ads.C5577wa c5577wa = new com.google.android.gms.internal.ads.C5577wa(abstractC3001Xc0, c4815pd0E, new com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2521Ka(context, c5467va), c5467va, c3710faC, c2631NaD, c2299Ea, c5357ua);
                int iB = com.google.android.gms.internal.ads.AbstractC5804yd0.b(context, c2929Vc0A);
                com.google.android.gms.internal.ads.C2747Qc0 c2747Qc0 = new com.google.android.gms.internal.ads.C2747Qc0();
                com.google.android.gms.internal.ads.Q9 q10 = new com.google.android.gms.internal.ads.Q9(context, c2929Vc0A, new com.google.android.gms.internal.ads.C2565Ld0(context, iB), new com.google.android.gms.internal.ads.C2859Td0(context, iB, new com.google.android.gms.internal.ads.N9(c2929Vc0A), ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25724w2)).booleanValue()), new com.google.android.gms.internal.ads.C2931Vd0(context, c5577wa, c2929Vc0A, c2747Qc0), c5577wa, executor, c2747Qc0, iB, c2631NaD, c2299Ea, c5357ua);
                f30903T = q10;
                q10.o();
                f30903T.p();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f30903T;
    }

    private final void t() {
        com.google.android.gms.internal.ads.C2631Na c2631Na = this.f30913L;
        if (c2631Na != null) {
            c2631Na.h();
        }
    }

    private final com.google.android.gms.internal.ads.C2528Kd0 u(int i6) {
        if (com.google.android.gms.internal.ads.AbstractC5804yd0.a(this.f30920S)) {
            return ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25704u2)).booleanValue() ? this.f30906E.c(1) : this.f30905D.c(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String a(android.content.Context context) {
        t();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25341M2)).booleanValue()) {
            this.f30914M.j();
        }
        p();
        com.google.android.gms.internal.ads.InterfaceC3037Yc0 interfaceC3037Yc0A = this.f30907F.a();
        if (interfaceC3037Yc0A == null) {
            return "";
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strA = interfaceC3037Yc0A.a(context, null);
        this.f30909H.f(5001, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, strA, null);
        return strA;
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final void b(android.view.View view) {
        this.f30908G.d(view);
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final void c(java.lang.StackTraceElement[] stackTraceElementArr) {
        com.google.android.gms.internal.ads.C5357ua c5357ua = this.f30915N;
        if (c5357ua != null) {
            c5357ua.b(java.util.Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String d(android.content.Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String e(android.content.Context context, java.lang.String str, android.view.View view) {
        return f(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String f(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        t();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25341M2)).booleanValue()) {
            this.f30914M.i();
        }
        p();
        com.google.android.gms.internal.ads.InterfaceC3037Yc0 interfaceC3037Yc0A = this.f30907F.a();
        if (interfaceC3037Yc0A == null) {
            return "";
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strC = interfaceC3037Yc0A.c(context, null, str, view, activity);
        this.f30909H.f(5000, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, strC, null);
        return strC;
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final void g(int i6, int i10, int i11) {
        android.util.DisplayMetrics displayMetrics;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Qb)).booleanValue() || (displayMetrics = this.f30904C.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f6 = i6;
        float f10 = displayMetrics.density;
        float f11 = i10;
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(0L, 0L, 0, f6 * f10, f11 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        h(motionEventObtain);
        motionEventObtain.recycle();
        float f12 = displayMetrics.density;
        android.view.MotionEvent motionEventObtain2 = android.view.MotionEvent.obtain(0L, 0L, 2, f6 * f12, f11 * f12, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        h(motionEventObtain2);
        motionEventObtain2.recycle();
        float f13 = displayMetrics.density;
        android.view.MotionEvent motionEventObtain3 = android.view.MotionEvent.obtain(0L, i11, 1, f6 * f13, f11 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        h(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final void h(android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.InterfaceC3037Yc0 interfaceC3037Yc0A = this.f30907F.a();
        if (interfaceC3037Yc0A != null) {
            try {
                interfaceC3037Yc0A.b(null, motionEvent);
            } catch (com.google.android.gms.internal.ads.C2895Ud0 e6) {
                this.f30909H.c(e6.a(), -1L, e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String i(android.content.Context context, android.view.View view, android.app.Activity activity) {
        t();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25341M2)).booleanValue()) {
            this.f30914M.k(context, view);
        }
        p();
        com.google.android.gms.internal.ads.InterfaceC3037Yc0 interfaceC3037Yc0A = this.f30907F.a();
        if (interfaceC3037Yc0A == null) {
            return "";
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strD = interfaceC3037Yc0A.d(context, null, view, activity);
        this.f30909H.f(5002, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, strD, null);
        return strD;
    }

    final synchronized void o() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.android.gms.internal.ads.C2528Kd0 c2528Kd0U = u(1);
        if (c2528Kd0U == null) {
            this.f30909H.d(4013, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f30907F.c(c2528Kd0U)) {
            this.f30919R = true;
            this.f30912K.countDown();
        }
    }

    public final void p() {
        if (this.f30918Q) {
            return;
        }
        synchronized (this.f30917P) {
            try {
                if (!this.f30918Q) {
                    if ((java.lang.System.currentTimeMillis() / 1000) - this.f30916O < 3600) {
                        return;
                    }
                    com.google.android.gms.internal.ads.C2528Kd0 c2528Kd0B = this.f30907F.b();
                    if ((c2528Kd0B == null || c2528Kd0B.d(3600L)) && com.google.android.gms.internal.ads.AbstractC5804yd0.a(this.f30920S)) {
                        this.f30910I.execute(new com.google.android.gms.internal.ads.P9(this));
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean r() {
        return this.f30919R;
    }
}
