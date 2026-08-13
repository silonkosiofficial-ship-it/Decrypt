package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class JV extends com.google.android.gms.internal.ads.IV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2846Su f28696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4335lC f28697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EF f28698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.TV f28699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3266bU f28700e;

    JV(com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, com.google.android.gms.internal.ads.C4335lC c4335lC, com.google.android.gms.internal.ads.EF ef, com.google.android.gms.internal.ads.TV tv, com.google.android.gms.internal.ads.C3266bU c3266bU) {
        this.f28696a = abstractC2846Su;
        this.f28697b = c4335lC;
        this.f28698c = ef;
        this.f28699d = tv;
        this.f28700e = c3266bU;
    }

    @Override // com.google.android.gms.internal.ads.IV
    protected final P4.d c(com.google.android.gms.internal.ads.C4546n70 c4546n70, android.os.Bundle bundle, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        com.google.android.gms.internal.ads.C4335lC c4335lC = this.f28697b;
        c4335lC.k(c4546n70);
        c4335lC.g(bundle);
        c4335lC.h(new com.google.android.gms.internal.ads.C3458dC(c3558e70, r60, this.f28699d));
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25287H3)).booleanValue()) {
            this.f28697b.e(this.f28700e);
        }
        com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su = this.f28696a;
        com.google.android.gms.internal.ads.C4335lC c4335lC2 = this.f28697b;
        com.google.android.gms.internal.ads.InterfaceC2260Cy interfaceC2260CyK = abstractC2846Su.k();
        interfaceC2260CyK.a(c4335lC2.l());
        interfaceC2260CyK.b(this.f28698c);
        com.google.android.gms.internal.ads.LA laB = interfaceC2260CyK.d().b();
        return laB.h(laB.i());
    }
}
