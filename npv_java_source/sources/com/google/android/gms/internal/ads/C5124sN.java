package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5124sN implements com.google.android.gms.internal.ads.InterfaceC3571eE, com.google.android.gms.internal.ads.InterfaceC5326uD, com.google.android.gms.internal.ads.HC, com.google.android.gms.internal.ads.ZC, p184s3.InterfaceC7076a, com.google.android.gms.internal.ads.InterfaceC5330uF {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4704od f38731C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f38732D = false;

    public C5124sN(com.google.android.gms.internal.ads.C4704od c4704od, com.google.android.gms.internal.ads.J50 j50) {
        this.f38731C = c4704od;
        c4704od.c(2);
        if (j50 != null) {
            c4704od.c(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void B(com.google.android.gms.internal.ads.C2730Po c2730Po) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5330uF
    public final void O(boolean z6) {
        this.f38731C.c(true != z6 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5330uF
    public final void S(final com.google.android.gms.internal.ads.C5145se c5145se) {
        this.f38731C.b(new com.google.android.gms.internal.ads.InterfaceC4594nd() { // from class: com.google.android.gms.internal.ads.pN
            @Override // com.google.android.gms.internal.ads.InterfaceC4594nd
            public final void a(com.google.android.gms.internal.ads.C3004Xe c3004Xe) {
                c3004Xe.A(c5145se);
            }
        });
        this.f38731C.c(1102);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5330uF
    public final void a0(final com.google.android.gms.internal.ads.C5145se c5145se) {
        this.f38731C.b(new com.google.android.gms.internal.ads.InterfaceC4594nd() { // from class: com.google.android.gms.internal.ads.rN
            @Override // com.google.android.gms.internal.ads.InterfaceC4594nd
            public final void a(com.google.android.gms.internal.ads.C3004Xe c3004Xe) {
                c3004Xe.A(c5145se);
            }
        });
        this.f38731C.c(1103);
    }

    @Override // p184s3.InterfaceC7076a
    public final synchronized void e0() {
        if (this.f38732D) {
            this.f38731C.c(8);
        } else {
            this.f38731C.c(7);
            this.f38732D = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5330uF
    public final void g() {
        this.f38731C.c(1109);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5330uF
    public final void k(boolean z6) {
        this.f38731C.c(true != z6 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final synchronized void t() {
        this.f38731C.c(6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
    public final void u() {
        this.f38731C.c(3);
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final void u0(p184s3.W0 w6) {
        com.google.android.gms.internal.ads.C4704od c4704od;
        int i6;
        switch (w6.f54145C) {
            case 1:
                c4704od = this.f38731C;
                i6 = 101;
                break;
            case 2:
                c4704od = this.f38731C;
                i6 = 102;
                break;
            case 3:
                c4704od = this.f38731C;
                i6 = 5;
                break;
            case 4:
                c4704od = this.f38731C;
                i6 = 103;
                break;
            case 5:
                c4704od = this.f38731C;
                i6 = 104;
                break;
            case 6:
                c4704od = this.f38731C;
                i6 = 105;
                break;
            case 7:
                c4704od = this.f38731C;
                i6 = 106;
                break;
            default:
                c4704od = this.f38731C;
                i6 = 4;
                break;
        }
        c4704od.c(i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void w0(final com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        this.f38731C.b(new com.google.android.gms.internal.ads.InterfaceC4594nd() { // from class: com.google.android.gms.internal.ads.oN
            @Override // com.google.android.gms.internal.ads.InterfaceC4594nd
            public final void a(com.google.android.gms.internal.ads.C3004Xe c3004Xe) {
                com.google.android.gms.internal.ads.C5693xd c5693xd = (com.google.android.gms.internal.ads.C5693xd) c3004Xe.H().H();
                com.google.android.gms.internal.ads.C2566Le c2566Le = (com.google.android.gms.internal.ads.C2566Le) c3004Xe.H().d0().H();
                c2566Le.z(c3558e70.f34899b.f34448b.f32114b);
                c5693xd.A(c2566Le);
                c3004Xe.z(c5693xd);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5330uF
    public final void z(final com.google.android.gms.internal.ads.C5145se c5145se) {
        this.f38731C.b(new com.google.android.gms.internal.ads.InterfaceC4594nd() { // from class: com.google.android.gms.internal.ads.qN
            @Override // com.google.android.gms.internal.ads.InterfaceC4594nd
            public final void a(com.google.android.gms.internal.ads.C3004Xe c3004Xe) {
                c3004Xe.A(c5145se);
            }
        });
        this.f38731C.c(1104);
    }
}
