package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class GV extends com.google.android.gms.internal.ads.IV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2846Su f27815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4019iI f27816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4335lC f27817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EF f27818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.TV f27819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3266bU f27820f;

    public GV(com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, com.google.android.gms.internal.ads.C4019iI c4019iI, com.google.android.gms.internal.ads.C4335lC c4335lC, com.google.android.gms.internal.ads.EF ef, com.google.android.gms.internal.ads.TV tv, com.google.android.gms.internal.ads.C3266bU c3266bU) {
        this.f27815a = abstractC2846Su;
        this.f27816b = c4019iI;
        this.f27817c = c4335lC;
        this.f27818d = ef;
        this.f27819e = tv;
        this.f27820f = c3266bU;
    }

    @Override // com.google.android.gms.internal.ads.IV
    protected final P4.d c(com.google.android.gms.internal.ads.C4546n70 c4546n70, android.os.Bundle bundle, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        com.google.android.gms.internal.ads.C4335lC c4335lC = this.f27817c;
        c4335lC.k(c4546n70);
        c4335lC.g(bundle);
        c4335lC.h(new com.google.android.gms.internal.ads.C3458dC(c3558e70, r60, this.f27819e));
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25287H3)).booleanValue()) {
            this.f27817c.e(this.f27820f);
        }
        com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su = this.f27815a;
        com.google.android.gms.internal.ads.C4335lC c4335lC2 = this.f27817c;
        com.google.android.gms.internal.ads.InterfaceC4457mI interfaceC4457mIO = abstractC2846Su.o();
        interfaceC4457mIO.p(c4335lC2.l());
        interfaceC4457mIO.r(this.f27818d);
        interfaceC4457mIO.c(this.f27816b);
        interfaceC4457mIO.f(new com.google.android.gms.internal.ads.C2666Ny(null));
        com.google.android.gms.internal.ads.LA laA = interfaceC4457mIO.i().a();
        return laA.h(laA.i());
    }
}
