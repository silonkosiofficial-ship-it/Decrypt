package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4038iY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4789pJ f36306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.UX f36307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.HC f36308c;

    public C4038iY(com.google.android.gms.internal.ads.C4789pJ c4789pJ, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f36306a = c4789pJ;
        final com.google.android.gms.internal.ads.UX ux = new com.google.android.gms.internal.ads.UX(c3588eO);
        this.f36307b = ux;
        final com.google.android.gms.internal.ads.InterfaceC5597wk interfaceC5597wkG = c4789pJ.g();
        this.f36308c = new com.google.android.gms.internal.ads.HC() { // from class: com.google.android.gms.internal.ads.gY
            @Override // com.google.android.gms.internal.ads.HC
            public final void u0(p184s3.W0 w6) {
                ux.u0(w6);
                com.google.android.gms.internal.ads.InterfaceC5597wk interfaceC5597wk = interfaceC5597wkG;
                if (interfaceC5597wk != null) {
                    try {
                        interfaceC5597wk.x(w6);
                    } catch (android.os.RemoteException e6) {
                        p224w3.p.i("#007 Could not call remote method.", e6);
                    }
                }
                if (interfaceC5597wk != null) {
                    try {
                        interfaceC5597wk.F(w6.f54145C);
                    } catch (android.os.RemoteException e10) {
                        p224w3.p.i("#007 Could not call remote method.", e10);
                    }
                }
            }
        };
    }

    public final com.google.android.gms.internal.ads.HC a() {
        return this.f36308c;
    }

    public final com.google.android.gms.internal.ads.InterfaceC5326uD b() {
        return this.f36307b;
    }

    public final com.google.android.gms.internal.ads.C4019iI c() {
        return new com.google.android.gms.internal.ads.C4019iI(this.f36306a, this.f36307b.g());
    }

    public final com.google.android.gms.internal.ads.UX d() {
        return this.f36307b;
    }

    public final void e(p184s3.H h6) {
        this.f36307b.k(h6);
    }
}
