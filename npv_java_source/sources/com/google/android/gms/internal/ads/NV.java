package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class NV extends com.google.android.gms.internal.ads.IV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2846Su f30314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4335lC f30315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3269bX f30316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EF f30317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.TV f30318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3266bU f30319f;

    public NV(com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, com.google.android.gms.internal.ads.C4335lC c4335lC, com.google.android.gms.internal.ads.C3269bX c3269bX, com.google.android.gms.internal.ads.EF ef, com.google.android.gms.internal.ads.TV tv, com.google.android.gms.internal.ads.C3266bU c3266bU) {
        this.f30314a = abstractC2846Su;
        this.f30315b = c4335lC;
        this.f30316c = c3269bX;
        this.f30317d = ef;
        this.f30318e = tv;
        this.f30319f = c3266bU;
    }

    @Override // com.google.android.gms.internal.ads.IV
    protected final P4.d c(com.google.android.gms.internal.ads.C4546n70 c4546n70, android.os.Bundle bundle, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        com.google.android.gms.internal.ads.C4335lC c4335lC = this.f30315b;
        c4335lC.k(c4546n70);
        c4335lC.g(bundle);
        c4335lC.h(new com.google.android.gms.internal.ads.C3458dC(c3558e70, r60, this.f30318e));
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25287H3)).booleanValue()) {
            this.f30315b.e(this.f30319f);
        }
        com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su = this.f30314a;
        com.google.android.gms.internal.ads.C4335lC c4335lC2 = this.f30315b;
        com.google.android.gms.internal.ads.PH phN = abstractC2846Su.n();
        phN.s(c4335lC2.l());
        phN.t(this.f30317d);
        phN.o(this.f30316c);
        com.google.android.gms.internal.ads.LA laA = phN.e().a();
        return laA.h(laA.i());
    }
}
