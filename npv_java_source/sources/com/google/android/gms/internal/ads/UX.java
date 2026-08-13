package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class UX implements p114l3.c, com.google.android.gms.internal.ads.InterfaceC3571eE, com.google.android.gms.internal.ads.InterfaceC5326uD, com.google.android.gms.internal.ads.HC, com.google.android.gms.internal.ads.ZC, p184s3.InterfaceC7076a, com.google.android.gms.internal.ads.EC, com.google.android.gms.internal.ads.SD, com.google.android.gms.internal.ads.VC, com.google.android.gms.internal.ads.MG {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C3588eO f32228K;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f32220C = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f32221D = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f32222E = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f32223F = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f32224G = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f32225H = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f32226I = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f32227J = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final java.util.concurrent.BlockingQueue f32229L = new java.util.concurrent.ArrayBlockingQueue(((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25336L8)).intValue());

    public UX(com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f32228K = c3588eO;
    }

    private final void F() {
        if (this.f32226I.get() && this.f32227J.get()) {
            for (final android.util.Pair pair : this.f32229L) {
                com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32221D, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.EX
                    @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                    public final void b(java.lang.Object obj) {
                        android.util.Pair pair2 = pair;
                        ((p184s3.InterfaceC7101i0) obj).E0((java.lang.String) pair2.first, (java.lang.String) pair2.second);
                    }
                });
            }
            this.f32229L.clear();
            this.f32225H.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.MG
    public final void A() {
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32220C, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.OX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.H) obj).k();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void B(com.google.android.gms.internal.ads.C2730Po c2730Po) {
    }

    public final void C(p184s3.InterfaceC7101i0 interfaceC7101i0) {
        this.f32221D.set(interfaceC7101i0);
        this.f32226I.set(true);
        F();
    }

    public final void E(p184s3.InterfaceC7122p0 interfaceC7122p0) {
        this.f32224G.set(interfaceC7122p0);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void a() {
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32220C, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.BX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.H) obj).f();
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32224G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.CX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.InterfaceC7122p0) obj).c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void b() {
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32220C, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.NX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.H) obj).g();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void c() {
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32220C, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.PX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.H) obj).j();
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32224G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.QX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.InterfaceC7122p0) obj).e();
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32224G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.RX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.InterfaceC7122p0) obj).d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void e() {
    }

    @Override // p184s3.InterfaceC7076a
    public final void e0() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Fa)).booleanValue()) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32220C, new com.google.android.gms.internal.ads.SX());
    }

    public final synchronized p184s3.H g() {
        return (p184s3.H) this.f32220C.get();
    }

    public final synchronized p184s3.InterfaceC7101i0 i() {
        return (p184s3.InterfaceC7101i0) this.f32221D.get();
    }

    public final void k(p184s3.H h6) {
        this.f32220C.set(h6);
    }

    @Override // p114l3.c
    public final synchronized void o(final java.lang.String str, final java.lang.String str2) {
        if (!this.f32225H.get()) {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32221D, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.MX
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((p184s3.InterfaceC7101i0) obj).E0(str, str2);
                }
            });
            return;
        }
        if (!this.f32229L.offer(new android.util.Pair(str, str2))) {
            p224w3.p.b("The queue for app events is full, dropping the new event.");
            com.google.android.gms.internal.ads.C3588eO c3588eO = this.f32228K;
            if (c3588eO != null) {
                com.google.android.gms.internal.ads.C3479dO c3479dOA = c3588eO.a();
                c3479dOA.b("action", "dae_action");
                c3479dOA.b("dae_name", str);
                c3479dOA.b("dae_data", str2);
                c3479dOA.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.VC
    public final void p(final p184s3.W0 w6) {
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32224G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.LX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.InterfaceC7122p0) obj).n0(w6);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.MG
    public final void p0() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Fa)).booleanValue()) {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32220C, new com.google.android.gms.internal.ads.SX());
        }
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32224G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.DX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.InterfaceC7122p0) obj).b();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void q(com.google.android.gms.internal.ads.InterfaceC3302bp interfaceC3302bp, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.google.android.gms.internal.ads.SD
    public final void r(final p184s3.e2 e2Var) {
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32222E, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.TX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.N0) obj).C2(e2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void t() {
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32220C, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.AX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.H) obj).i();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
    public final synchronized void u() {
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32220C, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.JX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.H) obj).h();
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32223F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.KX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.K) obj).c();
            }
        });
        this.f32227J.set(true);
        F();
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final void u0(final p184s3.W0 w6) {
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32220C, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.FX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.H) obj).x(w6);
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32220C, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.HX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.H) obj).F(w6.f54145C);
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f32223F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.IX
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p184s3.K) obj).x0(w6);
            }
        });
        this.f32225H.set(false);
        this.f32229L.clear();
    }

    public final void w(p184s3.K k6) {
        this.f32223F.set(k6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void w0(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        this.f32225H.set(true);
        this.f32227J.set(false);
    }

    public final void z(p184s3.N0 n6) {
        this.f32222E.set(n6);
    }
}
