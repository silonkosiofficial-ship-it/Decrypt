package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3787gC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5429v90 f35561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p224w3.a f35562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.pm.ApplicationInfo f35563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f35564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f35565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.content.pm.PackageInfo f35566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Uy0 f35567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f35568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.O20 f35569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f35570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f35571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f35572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5550wF f35573m;

    C3787gC(com.google.android.gms.internal.ads.C5429v90 c5429v90, p224w3.a aVar, android.content.pm.ApplicationInfo applicationInfo, java.lang.String str, java.util.List list, android.content.pm.PackageInfo packageInfo, com.google.android.gms.internal.ads.Uy0 uy0, p214v3.InterfaceC7268s0 interfaceC7268s0, java.lang.String str2, com.google.android.gms.internal.ads.O20 o20, com.google.android.gms.internal.ads.C4546n70 c4546n70, com.google.android.gms.internal.ads.C5550wF c5550wF, int i6) {
        this.f35561a = c5429v90;
        this.f35562b = aVar;
        this.f35563c = applicationInfo;
        this.f35564d = str;
        this.f35565e = list;
        this.f35566f = packageInfo;
        this.f35567g = uy0;
        this.f35568h = str2;
        this.f35569i = o20;
        this.f35570j = interfaceC7268s0;
        this.f35571k = c4546n70;
        this.f35573m = c5550wF;
        this.f35572l = i6;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C2730Po a(P4.d dVar, android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) dVar.get();
        android.os.Bundle bundle2 = c3677fC.f35301a;
        java.lang.String str = (java.lang.String) ((P4.d) this.f35567g.b()).get();
        boolean z6 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25389Q6)).booleanValue() && this.f35570j.M();
        java.lang.String str2 = this.f35568h;
        android.content.pm.PackageInfo packageInfo = this.f35566f;
        java.util.List list = this.f35565e;
        return new com.google.android.gms.internal.ads.C2730Po(bundle2, this.f35562b, this.f35563c, this.f35564d, list, packageInfo, str, str2, null, null, z6, this.f35571k.b(), bundle, c3677fC.f35302b);
    }

    public final P4.d b(android.os.Bundle bundle) {
        this.f35573m.a();
        return com.google.android.gms.internal.ads.AbstractC3562e90.c(this.f35569i.a(new com.google.android.gms.internal.ads.C3677fC(new android.os.Bundle(), new android.os.Bundle()), bundle, this.f35572l == 2), com.google.android.gms.internal.ads.EnumC4770p90.SIGNALS, this.f35561a).a();
    }

    public final P4.d c() {
        final android.os.Bundle bundle = new android.os.Bundle();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue()) {
            android.os.Bundle bundle2 = this.f35571k.f37526s;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final P4.d dVarB = b(bundle);
        return this.f35561a.a(com.google.android.gms.internal.ads.EnumC4770p90.REQUEST_PARCEL, dVarB, (P4.d) this.f35567g.b()).a(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.eC
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f34934a.a(dVarB, bundle);
            }
        }).a();
    }
}
