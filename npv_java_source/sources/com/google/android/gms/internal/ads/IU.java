package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class IU implements com.google.android.gms.internal.ads.InterfaceC3375cU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f28469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC5517vz f28470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.view.View f28471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3624em f28472d;

    public IU(android.content.Context context, com.google.android.gms.internal.ads.AbstractC5517vz abstractC5517vz) {
        this.f28469a = context;
        this.f28470b = abstractC5517vz;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final void a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.C5315u70 {
        try {
            ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).J0(r60.f31159Z);
            com.google.android.gms.internal.ads.HU hu = null;
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25313J7)).booleanValue() && r60.f31173g0) {
                ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).Z4(r60.f31154U, r60.f31202v.toString(), c3558e70.f34898a.f34012a.f37511d, X3.b.c2(this.f28469a), new com.google.android.gms.internal.ads.GU(this, yt, hu), (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c, c3558e70.f34898a.f34012a.f37512e);
            } else {
                ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).K5(r60.f31154U, r60.f31202v.toString(), c3558e70.f34898a.f34012a.f37511d, X3.b.c2(this.f28469a), new com.google.android.gms.internal.ads.GU(this, yt, hu), (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c, c3558e70.f34898a.f34012a.f37512e);
            }
        } catch (android.os.RemoteException e6) {
            throw new com.google.android.gms.internal.ads.C5315u70(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final /* bridge */ /* synthetic */ java.lang.Object b(com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60, final com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.C5315u70 {
        final android.view.View view;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25313J7)).booleanValue() && r60.f31173g0) {
            try {
                view = (android.view.View) X3.b.L0(this.f28472d.d());
                boolean zE = this.f28472d.e();
                if (view == null) {
                    throw new com.google.android.gms.internal.ads.C5315u70(new java.lang.Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zE) {
                    try {
                        view = (android.view.View) com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.FU
                            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                            public final P4.d b(java.lang.Object obj) {
                                return this.f27365a.c(view, r60, obj);
                            }
                        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34800f).get();
                    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e6) {
                        throw new com.google.android.gms.internal.ads.C5315u70(e6);
                    }
                }
            } catch (android.os.RemoteException e10) {
                throw new com.google.android.gms.internal.ads.C5315u70(e10);
            }
        } else {
            view = this.f28471c;
        }
        com.google.android.gms.internal.ads.AbstractC2814Ry abstractC2814RyA = this.f28470b.a(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, yt.f33354a), new com.google.android.gms.internal.ads.C3030Xy(view, null, new com.google.android.gms.internal.ads.InterfaceC3454dA() { // from class: com.google.android.gms.internal.ads.EU
            @Override // com.google.android.gms.internal.ads.InterfaceC3454dA
            public final p184s3.Y0 a() throws com.google.android.gms.internal.ads.C5315u70 {
                try {
                    return ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).d();
                } catch (android.os.RemoteException e11) {
                    throw new com.google.android.gms.internal.ads.C5315u70(e11);
                }
            }
        }, (com.google.android.gms.internal.ads.S60) r60.f31200u.get(0)));
        abstractC2814RyA.i().q1(view);
        ((com.google.android.gms.internal.ads.TU) yt.f33356c).p6(abstractC2814RyA.f());
        return abstractC2814RyA.h();
    }

    final /* synthetic */ P4.d c(android.view.View view, com.google.android.gms.internal.ads.R60 r60, java.lang.Object obj) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(com.google.android.gms.internal.ads.ViewTreeObserverOnScrollChangedListenerC2815Rz.a(this.f28469a, view, r60));
    }
}
