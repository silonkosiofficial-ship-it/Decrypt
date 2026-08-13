package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5352uV implements com.google.android.gms.internal.ads.InterfaceC3375cU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f39163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4567nI f39164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f39165c;

    public C5352uV(android.content.Context context, com.google.android.gms.internal.ads.AbstractC4567nI abstractC4567nI, java.util.concurrent.Executor executor) {
        this.f39163a = context;
        this.f39164b = abstractC4567nI;
        this.f39165c = executor;
    }

    private static final boolean c(com.google.android.gms.internal.ads.C3558e70 c3558e70, int i6) {
        return c3558e70.f34898a.f34012a.f37514g.contains(java.lang.Integer.toString(i6));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final void a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.C5315u70 {
        com.google.android.gms.internal.ads.M70 m70 = (com.google.android.gms.internal.ads.M70) yt.f33355b;
        com.google.android.gms.internal.ads.C4546n70 c4546n70 = c3558e70.f34898a.f34012a;
        java.lang.String string = r60.f31202v.toString();
        java.lang.String strM = p214v3.V.m(r60.f31196s);
        com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm = (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c;
        com.google.android.gms.internal.ads.C4546n70 c4546n71 = c3558e70.f34898a.f34012a;
        m70.u(this.f39163a, c4546n70.f37511d, string, strM, interfaceC3296bm, c4546n71.f37516i, c4546n71.f37514g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final /* bridge */ /* synthetic */ java.lang.Object b(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.XV, com.google.android.gms.internal.ads.C5315u70 {
        com.google.android.gms.internal.ads.C3581eJ c3581eJI;
        com.google.android.gms.internal.ads.C3844gm c3844gmD = ((com.google.android.gms.internal.ads.M70) yt.f33355b).d();
        com.google.android.gms.internal.ads.C3954hm c3954hmE = ((com.google.android.gms.internal.ads.M70) yt.f33355b).e();
        com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282kmI = ((com.google.android.gms.internal.ads.M70) yt.f33355b).i();
        if (interfaceC4282kmI != null && c(c3558e70, 6)) {
            c3581eJI = com.google.android.gms.internal.ads.C3581eJ.g0(interfaceC4282kmI);
        } else if (c3844gmD != null && c(c3558e70, 6)) {
            c3581eJI = com.google.android.gms.internal.ads.C3581eJ.J(c3844gmD);
        } else if (c3844gmD != null && c(c3558e70, 2)) {
            c3581eJI = com.google.android.gms.internal.ads.C3581eJ.H(c3844gmD);
        } else if (c3954hmE != null && c(c3558e70, 6)) {
            c3581eJI = com.google.android.gms.internal.ads.C3581eJ.K(c3954hmE);
        } else {
            if (c3954hmE == null || !c(c3558e70, 1)) {
                throw new com.google.android.gms.internal.ads.XV(1, "No native ad mappers");
            }
            c3581eJI = com.google.android.gms.internal.ads.C3581eJ.I(c3954hmE);
        }
        if (c3581eJI != null) {
            com.google.android.gms.internal.ads.C4546n70 c4546n70 = c3558e70.f34898a.f34012a;
            if (c4546n70.f37514g.contains(java.lang.Integer.toString(c3581eJI.P()))) {
                com.google.android.gms.internal.ads.AbstractC3801gJ abstractC3801gJD = this.f39164b.d(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, yt.f33354a), new com.google.android.gms.internal.ads.C4899qJ(c3581eJI), new com.google.android.gms.internal.ads.C4351lK(c3954hmE, c3844gmD, interfaceC4282kmI));
                ((com.google.android.gms.internal.ads.TU) yt.f33356c).p6(abstractC3801gJD.g());
                abstractC3801gJD.c().F0(new com.google.android.gms.internal.ads.C2222Bx((com.google.android.gms.internal.ads.M70) yt.f33355b), this.f39165c);
                return abstractC3801gJD.h();
            }
        }
        throw new com.google.android.gms.internal.ads.XV(1, "No corresponding native ad listener");
    }
}
