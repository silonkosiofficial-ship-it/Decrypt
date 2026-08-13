package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5203t60 implements E3.a, com.google.android.gms.internal.ads.InterfaceC5326uD, com.google.android.gms.internal.ads.HC, com.google.android.gms.internal.ads.EC, com.google.android.gms.internal.ads.VC, com.google.android.gms.internal.ads.SD, com.google.android.gms.internal.ads.C50, com.google.android.gms.internal.ads.MG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.X70 f38877C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f38878D = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f38879E = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f38880F = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f38881G = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f38882H = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f38883I = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f38884J = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5203t60 f38885K = null;

    public C5203t60(com.google.android.gms.internal.ads.X70 x70) {
        this.f38877C = x70;
    }

    @Override // com.google.android.gms.internal.ads.MG
    public final void A() {
    }

    public final void B(com.google.android.gms.internal.ads.C3411cp c3411cp) {
        this.f38883I.set(c3411cp);
    }

    public final void C(com.google.android.gms.internal.ads.C2288Dp c2288Dp) {
        this.f38882H.set(c2288Dp);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void a() {
        com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f38885K;
        if (c5203t60 != null) {
            c5203t60.a();
            return;
        }
        this.f38877C.a();
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38880F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.p60
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC5827yp) obj).i();
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38881G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.q60
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC4069ip) obj).e();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void b() {
        com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f38885K;
        if (c5203t60 != null) {
            c5203t60.b();
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38881G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.r60
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC4069ip) obj).g();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void c() {
        com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f38885K;
        if (c5203t60 != null) {
            c5203t60.c();
            return;
        }
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38880F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.Z50
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC5827yp) obj).j();
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38881G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.c60
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC4069ip) obj).j();
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38880F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.d60
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC5827yp) obj).e();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void d() {
        com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f38885K;
        if (c5203t60 != null) {
            c5203t60.d();
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38881G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.l60
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC4069ip) obj).k();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void e() {
        com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f38885K;
        if (c5203t60 != null) {
            c5203t60.e();
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38881G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.V50
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC4069ip) obj).l();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.C50
    public final void g(com.google.android.gms.internal.ads.C50 c50) {
        this.f38885K = (com.google.android.gms.internal.ads.C5203t60) c50;
    }

    public final void i(E3.a aVar) {
        this.f38878D.set(aVar);
    }

    @Override // E3.a
    public final void k() {
        com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f38885K;
        if (c5203t60 != null) {
            c5203t60.k();
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38878D, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.h60
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((E3.a) obj).k();
                }
            });
        }
    }

    public final void o(p184s3.N0 n6) {
        this.f38884J.set(n6);
    }

    @Override // com.google.android.gms.internal.ads.VC
    public final void p(final p184s3.W0 w6) {
        com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f38885K;
        if (c5203t60 != null) {
            c5203t60.p(w6);
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38880F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.j60
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC5827yp) obj).I4(w6);
                }
            });
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38880F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.k60
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC5827yp) obj).L(w6.f54145C);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.MG
    public final void p0() {
        com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f38885K;
        if (c5203t60 != null) {
            c5203t60.p0();
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38880F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.i60
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC5827yp) obj).d();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void q(final com.google.android.gms.internal.ads.InterfaceC3302bp interfaceC3302bp, final java.lang.String str, final java.lang.String str2) {
        com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f38885K;
        if (c5203t60 != null) {
            c5203t60.q(interfaceC3302bp, str, str2);
            return;
        }
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38880F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.s60
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                com.google.android.gms.internal.ads.InterfaceC3302bp interfaceC3302bp2 = interfaceC3302bp;
                ((com.google.android.gms.internal.ads.InterfaceC5827yp) obj).S1(new com.google.android.gms.internal.ads.BinderC2620Mp(interfaceC3302bp2.c(), interfaceC3302bp2.b()));
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38882H, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.W50
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                com.google.android.gms.internal.ads.InterfaceC3302bp interfaceC3302bp2 = interfaceC3302bp;
                ((com.google.android.gms.internal.ads.C2288Dp) obj).d2(new com.google.android.gms.internal.ads.BinderC2620Mp(interfaceC3302bp2.c(), interfaceC3302bp2.b()), str, str2);
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38881G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.X50
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC4069ip) obj).q2(interfaceC3302bp);
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38883I, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.Y50
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.C3411cp) obj).d2(interfaceC3302bp, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.SD
    public final void r(final p184s3.e2 e2Var) {
        com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f38885K;
        if (c5203t60 != null) {
            c5203t60.r(e2Var);
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38884J, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.e60
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((p184s3.N0) obj).C2(e2Var);
                }
            });
        }
    }

    public final void t(com.google.android.gms.internal.ads.InterfaceC5827yp interfaceC5827yp) {
        this.f38880F.set(interfaceC5827yp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
    public final void u() {
        com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f38885K;
        if (c5203t60 != null) {
            c5203t60.u();
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38879E, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.f60
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC2251Cp) obj).i();
                }
            });
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38881G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.g60
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC4069ip) obj).h();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final void u0(final p184s3.W0 w6) {
        com.google.android.gms.internal.ads.C5203t60 c5203t60 = this.f38885K;
        if (c5203t60 != null) {
            c5203t60.u0(w6);
            return;
        }
        final int i6 = w6.f54145C;
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38879E, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.m60
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC2251Cp) obj).x(w6);
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38879E, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.n60
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC2251Cp) obj).F(i6);
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f38881G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.o60
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC4069ip) obj).D(i6);
            }
        });
    }

    public final void w(com.google.android.gms.internal.ads.InterfaceC2251Cp interfaceC2251Cp) {
        this.f38879E.set(interfaceC2251Cp);
    }

    public final void z(com.google.android.gms.internal.ads.InterfaceC4069ip interfaceC4069ip) {
        this.f38881G.set(interfaceC4069ip);
    }
}
