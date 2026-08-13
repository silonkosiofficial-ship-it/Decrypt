package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class X3 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f33037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC3661f4 f33038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33039c;

    private final boolean a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        com.google.android.gms.internal.ads.AbstractC3661f4 c3223b4;
        com.google.android.gms.internal.ads.Z3 z6 = new com.google.android.gms.internal.ads.Z3();
        if (z6.b(interfaceC5300u0, true) && (z6.f33465a & 2) == 2) {
            int iMin = java.lang.Math.min(z6.f33469e, 8);
            com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(iMin);
            interfaceC5300u0.N(c5128sR.n(), 0, iMin);
            c5128sR.l(0);
            if (c5128sR.r() >= 5 && c5128sR.C() == 127 && c5128sR.K() == 1179402563) {
                c3223b4 = new com.google.android.gms.internal.ads.W3();
            } else {
                c5128sR.l(0);
                try {
                    if (com.google.android.gms.internal.ads.AbstractC3765g1.d(1, c5128sR, true)) {
                        c3223b4 = new com.google.android.gms.internal.ads.C3881h4();
                    } else {
                        c5128sR.l(0);
                        if (com.google.android.gms.internal.ads.C3223b4.j(c5128sR)) {
                            c3223b4 = new com.google.android.gms.internal.ads.C3223b4();
                        }
                    }
                } catch (com.google.android.gms.internal.ads.C4708of unused) {
                }
            }
            this.f33038b = c3223b4;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        com.google.android.gms.internal.ads.AbstractC3661f4 abstractC3661f4 = this.f33038b;
        if (abstractC3661f4 != null) {
            abstractC3661f4.i(j6, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) throws com.google.android.gms.internal.ads.C4708of {
        com.google.android.gms.internal.ads.LC.b(this.f33037a);
        if (this.f33038b == null) {
            if (!a(interfaceC5300u0)) {
                throw com.google.android.gms.internal.ads.C4708of.a("Failed to determine bitstream type", null);
            }
            interfaceC5300u0.j();
        }
        if (!this.f33039c) {
            com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = this.f33037a.S(0, 1);
            this.f33037a.Q();
            this.f33038b.g(this.f33037a, interfaceC3107a1S);
            this.f33039c = true;
        }
        return this.f33038b.d(interfaceC5300u0, q6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        try {
            return a(interfaceC5300u0);
        } catch (com.google.android.gms.internal.ads.C4708of unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f33037a = interfaceC5520w0;
    }
}
