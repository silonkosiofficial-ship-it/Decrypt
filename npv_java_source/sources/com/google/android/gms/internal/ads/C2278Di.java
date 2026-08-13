package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2278Di implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.MG f26763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.C2591Lx f26764b;

    public /* synthetic */ C2278Di(com.google.android.gms.internal.ads.MG mg, com.google.android.gms.internal.ads.C2591Lx c2591Lx) {
        this.f26763a = mg;
        this.f26764b = c2591Lx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        com.google.android.gms.internal.ads.AbstractC3728fj.c(map, this.f26763a);
        final java.lang.String str = (java.lang.String) map.get("u");
        if (str == null) {
            p224w3.p.g("URL missing from click GMSG.");
            return;
        }
        final com.google.android.gms.internal.ads.C2591Lx c2591Lx = this.f26764b;
        com.google.android.gms.internal.ads.AbstractC2283Dk0 abstractC2283Dk0D = com.google.android.gms.internal.ads.AbstractC2283Dk0.D(com.google.android.gms.internal.ads.AbstractC3728fj.a(interfaceC2698Ot, str));
        com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0 = new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.Gi
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj2) {
                com.google.android.gms.internal.ads.C2591Lx c2591Lx2;
                java.lang.String str2 = (java.lang.String) obj2;
                com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj = com.google.android.gms.internal.ads.AbstractC3728fj.f35396a;
                return (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25436U9)).booleanValue() && (c2591Lx2 = c2591Lx) != null && com.google.android.gms.internal.ads.C2591Lx.j(str)) ? c2591Lx2.b(str2, p184s3.C7147y.e()) : com.google.android.gms.internal.ads.AbstractC2652Nk0.h(str2);
            }
        };
        com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34795a;
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.n(abstractC2283Dk0D, interfaceC5268tk0, yk0), new com.google.android.gms.internal.ads.C2904Ui(interfaceC2698Ot), yk0);
    }
}
