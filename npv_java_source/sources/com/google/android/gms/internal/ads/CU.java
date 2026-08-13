package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class CU implements com.google.android.gms.internal.ads.InterfaceC3375cU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f26235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC5517vz f26236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f26237c;

    public CU(android.content.Context context, com.google.android.gms.internal.ads.AbstractC5517vz abstractC5517vz, java.util.concurrent.Executor executor) {
        this.f26235a = context;
        this.f26236b = abstractC5517vz;
        this.f26237c = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final void a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.C5315u70 {
        p184s3.c2 c2Var;
        p184s3.c2 c2Var2 = c3558e70.f34898a.f34012a.f37512e;
        if (c2Var2.f54211P) {
            c2Var = new p184s3.c2(this.f26235a, p104k3.z.d(c2Var2.f54202G, c2Var2.f54199D));
        } else {
            c2Var = (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25313J7)).booleanValue() && r60.f31173g0) ? new p184s3.c2(this.f26235a, p104k3.z.e(c2Var2.f54202G, c2Var2.f54199D)) : com.google.android.gms.internal.ads.AbstractC5205t70.a(this.f26235a, r60.f31200u);
        }
        p184s3.c2 c2Var3 = c2Var;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25313J7)).booleanValue() && r60.f31173g0) {
            java.lang.Object obj = yt.f33355b;
            ((com.google.android.gms.internal.ads.M70) obj).s(this.f26235a, c2Var3, c3558e70.f34898a.f34012a.f37511d, r60.f31202v.toString(), p214v3.V.m(r60.f31196s), (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c);
            return;
        }
        java.lang.Object obj2 = yt.f33355b;
        ((com.google.android.gms.internal.ads.M70) obj2).r(this.f26235a, c2Var3, c3558e70.f34898a.f34012a.f37511d, r60.f31202v.toString(), p214v3.V.m(r60.f31196s), (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final /* bridge */ /* synthetic */ java.lang.Object b(com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.C5315u70 {
        final android.view.View viewF;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25313J7)).booleanValue() && r60.f31173g0) {
            com.google.android.gms.internal.ads.InterfaceC3624em interfaceC3624emH = ((com.google.android.gms.internal.ads.M70) yt.f33355b).h();
            if (interfaceC3624emH == null) {
                p224w3.p.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new com.google.android.gms.internal.ads.C5315u70(new java.lang.Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewF = (android.view.View) X3.b.L0(interfaceC3624emH.d());
                boolean zE = interfaceC3624emH.e();
                if (viewF == null) {
                    throw new com.google.android.gms.internal.ads.C5315u70(new java.lang.Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zE) {
                    try {
                        viewF = (android.view.View) com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.zU
                            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                            public final P4.d b(java.lang.Object obj) {
                                return this.f40312a.c(viewF, r60, obj);
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
            viewF = ((com.google.android.gms.internal.ads.M70) yt.f33355b).f();
        }
        com.google.android.gms.internal.ads.AbstractC5517vz abstractC5517vz = this.f26236b;
        com.google.android.gms.internal.ads.C5540wA c5540wA = new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, yt.f33354a);
        final com.google.android.gms.internal.ads.M70 m70 = (com.google.android.gms.internal.ads.M70) yt.f33355b;
        j$.util.Objects.requireNonNull(m70);
        com.google.android.gms.internal.ads.AbstractC2814Ry abstractC2814RyA = abstractC5517vz.a(c5540wA, new com.google.android.gms.internal.ads.C3030Xy(viewF, null, new com.google.android.gms.internal.ads.InterfaceC3454dA() { // from class: com.google.android.gms.internal.ads.BU
            @Override // com.google.android.gms.internal.ads.InterfaceC3454dA
            public final p184s3.Y0 a() {
                return m70.g();
            }
        }, (com.google.android.gms.internal.ads.S60) r60.f31200u.get(0)));
        abstractC2814RyA.i().q1(viewF);
        abstractC2814RyA.c().F0(new com.google.android.gms.internal.ads.C2222Bx((com.google.android.gms.internal.ads.M70) yt.f33355b), this.f26237c);
        ((com.google.android.gms.internal.ads.TU) yt.f33356c).p6(abstractC2814RyA.g());
        return abstractC2814RyA.h();
    }

    final /* synthetic */ P4.d c(android.view.View view, com.google.android.gms.internal.ads.R60 r60, java.lang.Object obj) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(com.google.android.gms.internal.ads.ViewTreeObserverOnScrollChangedListenerC2815Rz.a(this.f26235a, view, r60));
    }
}
