package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class PV extends com.google.android.gms.internal.ads.IV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2846Su f30728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4335lC f30729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EF f30730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.TV f30731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3668f70 f30732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3266bU f30733f;

    public PV(com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, com.google.android.gms.internal.ads.C4335lC c4335lC, com.google.android.gms.internal.ads.EF ef, com.google.android.gms.internal.ads.C3668f70 c3668f70, com.google.android.gms.internal.ads.TV tv, com.google.android.gms.internal.ads.C3266bU c3266bU) {
        this.f30728a = abstractC2846Su;
        this.f30729b = c4335lC;
        this.f30730c = ef;
        this.f30732e = c3668f70;
        this.f30731d = tv;
        this.f30733f = c3266bU;
    }

    @Override // com.google.android.gms.internal.ads.IV
    protected final P4.d c(com.google.android.gms.internal.ads.C4546n70 c4546n70, android.os.Bundle bundle, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        com.google.android.gms.internal.ads.C3668f70 c3668f70;
        com.google.android.gms.internal.ads.C4335lC c4335lC = this.f30729b;
        c4335lC.k(c4546n70);
        c4335lC.g(bundle);
        c4335lC.h(new com.google.android.gms.internal.ads.C3458dC(c3558e70, r60, this.f30731d));
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25276G3)).booleanValue() && (c3668f70 = this.f30732e) != null) {
            this.f30729b.j(c3668f70);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25287H3)).booleanValue()) {
            this.f30729b.e(this.f30733f);
        }
        com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su = this.f30728a;
        com.google.android.gms.internal.ads.C4335lC c4335lC2 = this.f30729b;
        com.google.android.gms.internal.ads.InterfaceC4134jM interfaceC4134jMP = abstractC2846Su.p();
        interfaceC4134jMP.a(c4335lC2.l());
        interfaceC4134jMP.b(this.f30730c);
        com.google.android.gms.internal.ads.LA laB = interfaceC4134jMP.d().b();
        return laB.h(laB.i());
    }
}
