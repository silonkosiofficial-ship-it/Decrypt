package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class UU extends com.google.android.gms.internal.ads.AbstractBinderC4508mp implements com.google.android.gms.internal.ads.InterfaceC4887qD {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4618np f32212C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4777pD f32213D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.ads.YG f32214E;

    @Override // com.google.android.gms.internal.ads.InterfaceC4618np
    public final synchronized void I0(X3.a aVar) {
        com.google.android.gms.internal.ads.InterfaceC4777pD interfaceC4777pD = this.f32213D;
        if (interfaceC4777pD != null) {
            interfaceC4777pD.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4887qD
    public final synchronized void L0(com.google.android.gms.internal.ads.InterfaceC4777pD interfaceC4777pD) {
        this.f32213D = interfaceC4777pD;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4618np
    public final synchronized void O2(X3.a aVar, int i6) {
        com.google.android.gms.internal.ads.InterfaceC4777pD interfaceC4777pD = this.f32213D;
        if (interfaceC4777pD != null) {
            interfaceC4777pD.r(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4618np
    public final synchronized void O3(X3.a aVar) {
        com.google.android.gms.internal.ads.YG yg = this.f32214E;
        if (yg != null) {
            java.util.concurrent.Executor executor = ((com.google.android.gms.internal.ads.BW) yg).f25976d.f26718b;
            final com.google.android.gms.internal.ads.YT yt = ((com.google.android.gms.internal.ads.BW) yg).f25975c;
            final com.google.android.gms.internal.ads.R60 r60 = ((com.google.android.gms.internal.ads.BW) yg).f25974b;
            final com.google.android.gms.internal.ads.C3558e70 c3558e70 = ((com.google.android.gms.internal.ads.BW) yg).f25973a;
            final com.google.android.gms.internal.ads.BW bw = (com.google.android.gms.internal.ads.BW) yg;
            executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.AW
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.ads.DW dw = bw.f25976d;
                    com.google.android.gms.internal.ads.DW.e(c3558e70, r60, yt);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4618np
    public final synchronized void c0(X3.a aVar) {
        com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618np = this.f32212C;
        if (interfaceC4618np != null) {
            ((com.google.android.gms.internal.ads.CW) interfaceC4618np).f26239C.T2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4618np
    public final synchronized void c5(X3.a aVar, com.google.android.gms.internal.ads.C4728op c4728op) {
        com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618np = this.f32212C;
        if (interfaceC4618np != null) {
            ((com.google.android.gms.internal.ads.CW) interfaceC4618np).f26242F.v0(c4728op);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4618np
    public final synchronized void k0(X3.a aVar) {
        com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618np = this.f32212C;
        if (interfaceC4618np != null) {
            interfaceC4618np.k0(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4618np
    public final synchronized void k6(X3.a aVar) {
        com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618np = this.f32212C;
        if (interfaceC4618np != null) {
            ((com.google.android.gms.internal.ads.CW) interfaceC4618np).f26241E.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4618np
    public final synchronized void m0(X3.a aVar) {
        com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618np = this.f32212C;
        if (interfaceC4618np != null) {
            ((com.google.android.gms.internal.ads.CW) interfaceC4618np).f26241E.d();
        }
    }

    public final synchronized void p6(com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618np) {
        this.f32212C = interfaceC4618np;
    }

    public final synchronized void q6(com.google.android.gms.internal.ads.YG yg) {
        this.f32214E = yg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4618np
    public final synchronized void r5(X3.a aVar, int i6) {
        com.google.android.gms.internal.ads.YG yg = this.f32214E;
        if (yg != null) {
            p224w3.p.g("Fail to initialize adapter ".concat(java.lang.String.valueOf(((com.google.android.gms.internal.ads.BW) yg).f25975c.f33354a)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4618np
    public final synchronized void u1(X3.a aVar) {
        com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618np = this.f32212C;
        if (interfaceC4618np != null) {
            ((com.google.android.gms.internal.ads.CW) interfaceC4618np).f26242F.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4618np
    public final synchronized void zze(X3.a aVar) {
        com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618np = this.f32212C;
        if (interfaceC4618np != null) {
            ((com.google.android.gms.internal.ads.CW) interfaceC4618np).f26240D.e0();
        }
    }
}
