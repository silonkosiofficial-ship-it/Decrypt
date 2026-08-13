package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class T90 implements java.lang.Runnable {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final java.lang.Object f31884L = new java.lang.Object();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final java.lang.Object f31885M = new java.lang.Object();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final java.lang.Object f31886N = new java.lang.Object();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static java.lang.Boolean f31887O;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f31888C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p224w3.a f31889D;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f31892G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PM f31893H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.List f31894I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3020Xo f31896K;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Y90 f31890E = com.google.android.gms.internal.ads.C3382ca0.c0();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.String f31891F = "";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f31895J = false;

    public T90(android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.PM pm, com.google.android.gms.internal.ads.C4360lS c4360lS, com.google.android.gms.internal.ads.C3020Xo c3020Xo) {
        this.f31888C = context;
        this.f31889D = aVar;
        this.f31893H = pm;
        this.f31896K = c3020Xo;
        this.f31894I = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25325K8)).booleanValue() ? p214v3.E0.I() : com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    public static boolean a() {
        boolean zBooleanValue;
        java.lang.Boolean boolValueOf;
        synchronized (f31884L) {
            try {
                if (f31887O == null) {
                    if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39431b.e()).booleanValue()) {
                        boolValueOf = java.lang.Boolean.valueOf(java.lang.Math.random() < ((java.lang.Double) com.google.android.gms.internal.ads.AbstractC5479vg.f39430a.e()).doubleValue());
                    } else {
                        boolValueOf = java.lang.Boolean.FALSE;
                    }
                    f31887O = boolValueOf;
                }
                zBooleanValue = f31887O.booleanValue();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final void b(final com.google.android.gms.internal.ads.J90 j90) {
        com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.S90
            @Override // java.lang.Runnable
            public final void run() {
                this.f31589C.c(j90);
            }
        });
    }

    final /* synthetic */ void c(com.google.android.gms.internal.ads.J90 j90) {
        synchronized (f31886N) {
            try {
                if (!this.f31895J) {
                    this.f31895J = true;
                    if (a()) {
                        try {
                            p174r3.v.t();
                            this.f31891F = p214v3.E0.V(this.f31888C);
                        } catch (android.os.RemoteException | java.lang.RuntimeException e6) {
                            p174r3.v.s().x(e6, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.f31892G = N3.C1395h.f().a(this.f31888C);
                        int iIntValue = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25270F8)).intValue();
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Lb)).booleanValue()) {
                            long j6 = iIntValue;
                            com.google.android.gms.internal.ads.AbstractC3524dr.f34798d.scheduleWithFixedDelay(this, j6, j6, java.util.concurrent.TimeUnit.MILLISECONDS);
                        } else {
                            long j10 = iIntValue;
                            com.google.android.gms.internal.ads.AbstractC3524dr.f34798d.scheduleAtFixedRate(this, j10, j10, java.util.concurrent.TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (a() && j90 != null) {
            synchronized (f31885M) {
                try {
                    if (this.f31890E.z() >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25281G8)).intValue()) {
                        return;
                    }
                    com.google.android.gms.internal.ads.U90 u90B0 = com.google.android.gms.internal.ads.X90.b0();
                    u90B0.W(j90.m());
                    u90B0.S(j90.l());
                    u90B0.G(j90.b());
                    u90B0.Y(3);
                    u90B0.O(this.f31889D.f56217C);
                    u90B0.A(this.f31891F);
                    u90B0.K(android.os.Build.VERSION.RELEASE);
                    u90B0.T(android.os.Build.VERSION.SDK_INT);
                    u90B0.X(j90.o());
                    u90B0.J(j90.a());
                    u90B0.E(this.f31892G);
                    u90B0.V(j90.n());
                    u90B0.B(j90.e());
                    u90B0.F(j90.g());
                    u90B0.H(j90.h());
                    u90B0.I(this.f31893H.b(j90.h()));
                    u90B0.L(j90.i());
                    u90B0.M(j90.d());
                    u90B0.C(j90.f());
                    u90B0.U(j90.k());
                    u90B0.P(j90.j());
                    u90B0.Q(j90.c());
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25325K8)).booleanValue()) {
                        u90B0.z(this.f31894I);
                    }
                    com.google.android.gms.internal.ads.Y90 y90 = this.f31890E;
                    com.google.android.gms.internal.ads.Z90 z90B0 = com.google.android.gms.internal.ads.C3163aa0.b0();
                    z90B0.z(u90B0);
                    y90.A(z90B0);
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrL;
        if (a()) {
            java.lang.Object obj = f31885M;
            synchronized (obj) {
                try {
                    if (this.f31890E.z() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrL = ((com.google.android.gms.internal.ads.C3382ca0) this.f31890E.u()).l();
                            this.f31890E.B();
                        }
                        new com.google.android.gms.internal.ads.C4250kS(this.f31888C, this.f31889D.f56217C, this.f31896K, android.os.Binder.getCallingUid()).b(new com.google.android.gms.internal.ads.C4032iS((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25259E8), 60000, new java.util.HashMap(), bArrL, "application/x-protobuf", false));
                    } catch (java.lang.Exception e6) {
                        if ((e6 instanceof com.google.android.gms.internal.ads.C4688oQ) && ((com.google.android.gms.internal.ads.C4688oQ) e6).a() == 3) {
                            return;
                        }
                        p174r3.v.s().w(e6, "CuiMonitor.sendCuiPing");
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }
}
