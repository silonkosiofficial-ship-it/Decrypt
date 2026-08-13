package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class K40 implements com.google.android.gms.internal.ads.HC, com.google.android.gms.internal.ads.FD, com.google.android.gms.internal.ads.C50, p204u3.z, com.google.android.gms.internal.ads.SD, com.google.android.gms.internal.ads.VC, com.google.android.gms.internal.ads.MG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.X70 f28829C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f28830D = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f28831E = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f28832F = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f28833G = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f28834H = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f28835I = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.google.android.gms.internal.ads.K40 f28836J = null;

    public K40(com.google.android.gms.internal.ads.X70 x70) {
        this.f28829C = x70;
    }

    public static com.google.android.gms.internal.ads.K40 a(com.google.android.gms.internal.ads.K40 k40) {
        com.google.android.gms.internal.ads.K40 k41 = new com.google.android.gms.internal.ads.K40(k40.f28829C);
        k41.f28836J = k40;
        return k41;
    }

    @Override // com.google.android.gms.internal.ads.MG
    public final void A() {
    }

    @Override // p204u3.z
    public final void T2() {
        com.google.android.gms.internal.ads.K40 k40 = this.f28836J;
        if (k40 != null) {
            k40.T2();
            return;
        }
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28834H, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.J40
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((p204u3.z) obj).T2();
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28832F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.v40
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC2672Oc) obj).e();
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28832F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.w40
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC2672Oc) obj).d();
            }
        });
    }

    public final void b() {
        com.google.android.gms.internal.ads.K40 k40 = this.f28836J;
        if (k40 != null) {
            k40.b();
            return;
        }
        this.f28829C.a();
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28831E, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.C40
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                androidx.appcompat.app.D.a(obj);
                throw null;
            }
        });
        com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28832F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.D40
            @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC2672Oc) obj).c();
            }
        });
    }

    public final void c(final com.google.android.gms.internal.ads.InterfaceC2414Hc interfaceC2414Hc) {
        com.google.android.gms.internal.ads.K40 k40 = this.f28836J;
        if (k40 != null) {
            k40.c(interfaceC2414Hc);
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28830D, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.A40
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC2525Kc) obj).Q0(interfaceC2414Hc);
                }
            });
        }
    }

    @Override // p204u3.z
    public final void d2() {
        com.google.android.gms.internal.ads.K40 k40 = this.f28836J;
        if (k40 != null) {
            k40.d2();
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28834H, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.y40
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((p204u3.z) obj).d2();
                }
            });
        }
    }

    public final void e(p204u3.z zVar) {
        this.f28834H.set(zVar);
    }

    @Override // p204u3.z
    public final void f3() {
    }

    @Override // com.google.android.gms.internal.ads.C50
    public final void g(com.google.android.gms.internal.ads.C50 c50) {
        this.f28836J = (com.google.android.gms.internal.ads.K40) c50;
    }

    @Override // com.google.android.gms.internal.ads.FD
    public final void i() {
        com.google.android.gms.internal.ads.K40 k40 = this.f28836J;
        if (k40 != null) {
            k40.i();
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28833G, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.H40
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.FD) obj).i();
                }
            });
        }
    }

    public final void k(p184s3.N0 n6) {
        this.f28835I.set(n6);
    }

    public final void o(com.google.android.gms.internal.ads.InterfaceC2525Kc interfaceC2525Kc) {
        this.f28830D.set(interfaceC2525Kc);
    }

    @Override // com.google.android.gms.internal.ads.VC
    public final void p(final p184s3.W0 w6) {
        com.google.android.gms.internal.ads.K40 k40 = this.f28836J;
        if (k40 != null) {
            k40.p(w6);
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28832F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.z40
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC2672Oc) obj).n0(w6);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.MG
    public final void p0() {
        com.google.android.gms.internal.ads.K40 k40 = this.f28836J;
        if (k40 != null) {
            k40.p0();
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28832F, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.B40
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC2672Oc) obj).b();
                }
            });
        }
    }

    @Override // p204u3.z
    public final void p4(final int i6) {
        com.google.android.gms.internal.ads.K40 k40 = this.f28836J;
        if (k40 != null) {
            k40.p4(i6);
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28834H, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.E40
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((p204u3.z) obj).p4(i6);
                }
            });
        }
    }

    public final void q(com.google.android.gms.internal.ads.InterfaceC2672Oc interfaceC2672Oc) {
        this.f28832F.set(interfaceC2672Oc);
    }

    @Override // p204u3.z
    public final void q0() {
        com.google.android.gms.internal.ads.K40 k40 = this.f28836J;
        if (k40 != null) {
            k40.q0();
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28834H, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.I40
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((p204u3.z) obj).q0();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.SD
    public final void r(final p184s3.e2 e2Var) {
        com.google.android.gms.internal.ads.K40 k40 = this.f28836J;
        if (k40 != null) {
            k40.r(e2Var);
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28835I, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.u40
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((p184s3.N0) obj).C2(e2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final void u0(final p184s3.W0 w6) {
        com.google.android.gms.internal.ads.K40 k40 = this.f28836J;
        if (k40 != null) {
            k40.u0(w6);
        } else {
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28830D, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.F40
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC2525Kc) obj).B3(w6);
                }
            });
            com.google.android.gms.internal.ads.AbstractC5091s50.a(this.f28830D, new com.google.android.gms.internal.ads.InterfaceC4981r50() { // from class: com.google.android.gms.internal.ads.G40
                @Override // com.google.android.gms.internal.ads.InterfaceC4981r50
                public final void b(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.InterfaceC2525Kc) obj).B(w6.f54145C);
                }
            });
        }
    }

    @Override // p204u3.z
    public final void y0() {
    }
}
