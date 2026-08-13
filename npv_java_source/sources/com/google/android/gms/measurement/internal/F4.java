package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class F4 extends com.google.android.gms.measurement.internal.AbstractC6504y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.ServiceConnectionC6361d5 f41802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p085i4.InterfaceC6654f f41803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile java.lang.Boolean f41804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.AbstractC6466t f41805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6507y5 f41806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.List f41807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.AbstractC6466t f41808i;

    protected F4(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f41807h = new java.util.ArrayList();
        this.f41806g = new com.google.android.gms.measurement.internal.C6507y5(s6.b());
        this.f41802c = new com.google.android.gms.measurement.internal.ServiceConnectionC6361d5(this);
        this.f41805f = new com.google.android.gms.measurement.internal.G4(this, s6);
        this.f41808i = new com.google.android.gms.measurement.internal.T4(this, s6);
    }

    static /* synthetic */ void K(com.google.android.gms.measurement.internal.F4 f6, android.content.ComponentName componentName) {
        f6.n();
        if (f6.f41803d != null) {
            f6.f41803d = null;
            f6.j().K().b("Disconnected from device MeasurementService", componentName);
            f6.n();
            f6.Z();
        }
    }

    private final void P(java.lang.Runnable runnable) {
        n();
        if (g0()) {
            runnable.run();
        } else {
            if (this.f41807h.size() >= 1000) {
                j().G().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f41807h.add(runnable);
            this.f41808i.b(60000L);
            Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0() {
        n();
        j().K().b("Processing queued up service tasks", java.lang.Integer.valueOf(this.f41807h.size()));
        java.util.Iterator it = this.f41807h.iterator();
        while (it.hasNext()) {
            try {
                ((java.lang.Runnable) it.next()).run();
            } catch (java.lang.RuntimeException e6) {
                j().G().b("Task exception while flushing queue", e6);
            }
        }
        this.f41807h.clear();
        this.f41808i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        n();
        this.f41806g.c();
        this.f41805f.b(((java.lang.Long) com.google.android.gms.measurement.internal.G.f41834M.a(null)).longValue());
    }

    private final com.google.android.gms.measurement.internal.M5 p0(boolean z6) {
        return p().B(z6 ? j().O() : null);
    }

    static /* synthetic */ void r0(com.google.android.gms.measurement.internal.F4 f6) {
        f6.n();
        if (f6.g0()) {
            f6.j().K().a("Inactivity, disconnecting from the service");
            f6.a0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6504y2
    protected final boolean A() {
        return false;
    }

    public final void C(android.os.Bundle bundle) {
        n();
        v();
        P(new com.google.android.gms.measurement.internal.S4(this, p0(false), bundle));
    }

    public final void D(com.google.android.gms.internal.measurement.U0 u6) {
        n();
        v();
        P(new com.google.android.gms.measurement.internal.P4(this, p0(false), u6));
    }

    public final void E(com.google.android.gms.internal.measurement.U0 u6, com.google.android.gms.measurement.internal.E e6, java.lang.String str) {
        n();
        v();
        if (i().u(12451000) == 0) {
            P(new com.google.android.gms.measurement.internal.V4(this, e6, str, u6));
        } else {
            j().L().a("Not bundling data. Service unavailable or out of date");
            i().V(u6, new byte[0]);
        }
    }

    protected final void F(com.google.android.gms.internal.measurement.U0 u6, java.lang.String str, java.lang.String str2) {
        n();
        v();
        P(new com.google.android.gms.measurement.internal.RunnableC6347b5(this, str, str2, p0(false), u6));
    }

    protected final void G(com.google.android.gms.internal.measurement.U0 u6, java.lang.String str, java.lang.String str2, boolean z6) {
        n();
        v();
        P(new com.google.android.gms.measurement.internal.I4(this, str, str2, p0(false), z6, u6));
    }

    protected final void H(com.google.android.gms.measurement.internal.C6362e c6362e) {
        Q3.AbstractC1477p.l(c6362e);
        n();
        v();
        P(new com.google.android.gms.measurement.internal.Z4(this, true, p0(true), q().E(c6362e), new com.google.android.gms.measurement.internal.C6362e(c6362e), c6362e));
    }

    protected final void I(com.google.android.gms.measurement.internal.E e6, java.lang.String str) {
        Q3.AbstractC1477p.l(e6);
        n();
        v();
        P(new com.google.android.gms.measurement.internal.W4(this, true, p0(true), q().F(e6), e6, str));
    }

    protected final void J(com.google.android.gms.measurement.internal.C6499x4 c6499x4) {
        n();
        v();
        P(new com.google.android.gms.measurement.internal.Q4(this, c6499x4));
    }

    protected final void M(com.google.android.gms.measurement.internal.Y5 y6) {
        n();
        v();
        P(new com.google.android.gms.measurement.internal.J4(this, p0(true), q().G(y6), y6));
    }

    protected final void N(p085i4.InterfaceC6654f interfaceC6654f) {
        n();
        Q3.AbstractC1477p.l(interfaceC6654f);
        this.f41803d = interfaceC6654f;
        m0();
        l0();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x0136 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    final void O(p085i4.InterfaceC6654f interfaceC6654f, R3.a aVar, com.google.android.gms.measurement.internal.M5 m6) {
        int size;
        com.google.android.gms.measurement.internal.C6442p2 c6442p2G;
        java.lang.String str;
        long jC;
        long j6;
        long jA;
        n();
        v();
        int i6 = 100;
        int i10 = 0;
        for (int i11 = 100; i10 < 1001 && i6 == i11; i11 = 100) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List listC = q().C(i11);
            if (listC != null) {
                arrayList.addAll(listC);
                size = listC.size();
            } else {
                size = 0;
            }
            if (aVar != null && size < i11) {
                arrayList.add(aVar);
            }
            boolean zT = d().t(com.google.android.gms.measurement.internal.G.f41821F0);
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                int i13 = i12 + 1;
                R3.a aVar2 = (R3.a) arrayList.get(i12);
                if (aVar2 instanceof com.google.android.gms.measurement.internal.E) {
                    if (zT) {
                        try {
                            jA = this.f42679a.b().a();
                            try {
                                jC = this.f42679a.b().c();
                            } catch (android.os.RemoteException e6) {
                                e = e6;
                                jC = 0;
                                j6 = jA;
                                j().G().b("Failed to send event to the service", e);
                                if (!zT) {
                                }
                                i12 = i13;
                            }
                        } catch (android.os.RemoteException e10) {
                            e = e10;
                            jC = 0;
                            j6 = 0;
                            j().G().b("Failed to send event to the service", e);
                            if (!zT) {
                            }
                        }
                    } else {
                        jA = 0;
                        jC = 0;
                    }
                    try {
                        interfaceC6654f.d6((com.google.android.gms.measurement.internal.E) aVar2, m6);
                        if (zT) {
                            j().K().a("Logging telemetry for logEvent from database");
                            com.google.android.gms.measurement.internal.C6414l2.a(this.f42679a).b(36301, 0, jA, this.f42679a.b().a(), (int) (this.f42679a.b().c() - jC));
                        }
                    } catch (android.os.RemoteException e11) {
                        e = e11;
                        j6 = jA;
                        j().G().b("Failed to send event to the service", e);
                        if (!zT && j6 != 0) {
                            com.google.android.gms.measurement.internal.C6414l2.a(this.f42679a).b(36301, 13, j6, this.f42679a.b().a(), (int) (this.f42679a.b().c() - jC));
                        }
                    }
                } else if (aVar2 instanceof com.google.android.gms.measurement.internal.Y5) {
                    try {
                        interfaceC6654f.G1((com.google.android.gms.measurement.internal.Y5) aVar2, m6);
                    } catch (android.os.RemoteException e12) {
                        e = e12;
                        c6442p2G = j().G();
                        str = "Failed to send user property to the service";
                        c6442p2G.b(str, e);
                    }
                } else if (aVar2 instanceof com.google.android.gms.measurement.internal.C6362e) {
                    try {
                        interfaceC6654f.w2((com.google.android.gms.measurement.internal.C6362e) aVar2, m6);
                    } catch (android.os.RemoteException e13) {
                        e = e13;
                        c6442p2G = j().G();
                        str = "Failed to send conditional user property to the service";
                        c6442p2G.b(str, e);
                    }
                } else {
                    j().G().a("Discarding data. Unrecognized parcel type.");
                }
                i12 = i13;
            }
            i10++;
            i6 = size;
        }
    }

    public final void Q(java.util.concurrent.atomic.AtomicReference atomicReference) {
        n();
        v();
        P(new com.google.android.gms.measurement.internal.L4(this, atomicReference, p0(false)));
    }

    protected final void R(java.util.concurrent.atomic.AtomicReference atomicReference, android.os.Bundle bundle) {
        n();
        v();
        P(new com.google.android.gms.measurement.internal.K4(this, atomicReference, p0(false), bundle));
    }

    protected final void S(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        n();
        v();
        P(new com.google.android.gms.measurement.internal.Y4(this, atomicReference, str, str2, str3, p0(false)));
    }

    protected final void T(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6) {
        n();
        v();
        P(new com.google.android.gms.measurement.internal.RunnableC6340a5(this, atomicReference, str, str2, str3, p0(false), z6));
    }

    protected final void U(boolean z6) {
        n();
        v();
        if ((!com.google.android.gms.internal.measurement.C6038i6.a() || !d().t(com.google.android.gms.measurement.internal.G.f41859Y0)) && z6) {
            q().H();
        }
        if (i0()) {
            P(new com.google.android.gms.measurement.internal.X4(this, p0(false)));
        }
    }

    protected final p085i4.C6650b V() {
        n();
        v();
        p085i4.InterfaceC6654f interfaceC6654f = this.f41803d;
        if (interfaceC6654f == null) {
            Z();
            j().F().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        com.google.android.gms.measurement.internal.M5 m5P0 = p0(false);
        Q3.AbstractC1477p.l(m5P0);
        try {
            p085i4.C6650b c6650bS4 = interfaceC6654f.s4(m5P0);
            m0();
            return c6650bS4;
        } catch (android.os.RemoteException e6) {
            j().G().b("Failed to get consents; remote exception", e6);
            return null;
        }
    }

    final java.lang.Boolean W() {
        return this.f41804e;
    }

    protected final void X() {
        n();
        v();
        P(new com.google.android.gms.measurement.internal.R4(this, p0(true)));
    }

    protected final void Y() {
        n();
        v();
        com.google.android.gms.measurement.internal.M5 m5P0 = p0(true);
        q().I();
        P(new com.google.android.gms.measurement.internal.O4(this, m5P0));
    }

    final void Z() {
        n();
        v();
        if (g0()) {
            return;
        }
        if (k0()) {
            this.f41802c.a();
            return;
        }
        if (d().X()) {
            return;
        }
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = a().getPackageManager().queryIntentServices(new android.content.Intent().setClassName(a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            j().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new android.content.ComponentName(a(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f41802c.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ android.content.Context a() {
        return super.a();
    }

    public final void a0() {
        n();
        v();
        this.f41802c.d();
        try {
            U3.b.b().c(a(), this.f41802c);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException unused) {
        }
        this.f41803d = null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ V3.f b() {
        return super.b();
    }

    final /* synthetic */ void b0() {
        p085i4.InterfaceC6654f interfaceC6654f = this.f41803d;
        if (interfaceC6654f == null) {
            j().G().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            com.google.android.gms.measurement.internal.M5 m5P0 = p0(false);
            Q3.AbstractC1477p.l(m5P0);
            interfaceC6654f.j5(m5P0);
            m0();
        } catch (android.os.RemoteException e6) {
            j().G().b("Failed to send Dma consent settings to the service", e6);
        }
    }

    final /* synthetic */ void c0() {
        p085i4.InterfaceC6654f interfaceC6654f = this.f41803d;
        if (interfaceC6654f == null) {
            j().G().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            com.google.android.gms.measurement.internal.M5 m5P0 = p0(false);
            Q3.AbstractC1477p.l(m5P0);
            interfaceC6654f.f4(m5P0);
            m0();
        } catch (android.os.RemoteException e6) {
            j().G().b("Failed to send storage consent settings to the service", e6);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6376g d() {
        return super.d();
    }

    protected final void d0() {
        n();
        v();
        com.google.android.gms.measurement.internal.M5 m5P0 = p0(false);
        q().H();
        P(new com.google.android.gms.measurement.internal.N4(this, m5P0));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6494x e() {
        return super.e();
    }

    protected final void e0() {
        n();
        v();
        P(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.H4
            @Override // java.lang.Runnable
            public final void run() {
                this.f41934C.b0();
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6348c f() {
        return super.f();
    }

    protected final void f0() {
        n();
        v();
        P(new com.google.android.gms.measurement.internal.U4(this, p0(true)));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6386h2 g() {
        return super.g();
    }

    public final boolean g0() {
        n();
        v();
        return this.f41803d != null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 h() {
        return super.h();
    }

    final boolean h0() {
        n();
        v();
        return !k0() || i().I0() >= 200900;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.d6 i() {
        return super.i();
    }

    final boolean i0() {
        n();
        v();
        return !k0() || i().I0() >= ((java.lang.Integer) com.google.android.gms.measurement.internal.G.f41916u0.a(null)).intValue();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 j() {
        return super.j();
    }

    final boolean j0() {
        n();
        v();
        return !k0() || i().I0() >= 241200;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    final boolean k0() {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2K;
        java.lang.String str;
        boolean z6;
        com.google.android.gms.measurement.internal.C6442p2 c6442p2L;
        java.lang.String str2;
        n();
        v();
        if (this.f41804e == null) {
            n();
            v();
            java.lang.Boolean boolN = h().N();
            boolean z10 = true;
            if (boolN == null || !boolN.booleanValue()) {
                boolean z11 = false;
                if (p().C() == 1) {
                    z6 = true;
                } else {
                    j().K().a("Checking service availability");
                    int iU = i().u(12451000);
                    if (iU != 0) {
                        if (iU == 1) {
                            j().K().a("Service missing");
                        } else if (iU != 2) {
                            if (iU != 3) {
                                if (iU == 9) {
                                    c6442p2L = j().L();
                                    str2 = "Service invalid";
                                } else if (iU != 18) {
                                    j().L().b("Unexpected service status", java.lang.Integer.valueOf(iU));
                                } else {
                                    c6442p2K = j().L();
                                    str = "Service updating";
                                }
                                z6 = false;
                                z10 = false;
                            } else {
                                c6442p2L = j().L();
                                str2 = "Service disabled";
                            }
                            c6442p2L.a(str2);
                            z6 = false;
                            z10 = false;
                        } else {
                            j().F().a("Service container out of date");
                            if (i().I0() >= 17443) {
                                z10 = boolN == null;
                                z6 = false;
                            }
                        }
                        z6 = true;
                        z10 = false;
                    } else {
                        c6442p2K = j().K();
                        str = "Service available";
                    }
                    c6442p2K.a(str);
                    z6 = true;
                }
                if (z10 || !d().X()) {
                    z11 = z6;
                } else {
                    j().G().a("No way to upload. Consider using the full version of Analytics");
                }
                if (z11) {
                    h().x(z10);
                }
            }
            this.f41804e = java.lang.Boolean.valueOf(z10);
        }
        return this.f41804e.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6501y o() {
        return super.o();
    }

    protected final void o0(boolean z6) {
        n();
        v();
        if ((!com.google.android.gms.internal.measurement.C6038i6.a() || !d().t(com.google.android.gms.measurement.internal.G.f41859Y0)) && z6) {
            q().H();
        }
        P(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.E4
            @Override // java.lang.Runnable
            public final void run() {
                this.f41777C.c0();
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6379g2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6372f2 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.F3 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6492w4 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.F4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6445p5 u() {
        return super.u();
    }
}
