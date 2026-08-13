package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3664f50 implements com.google.android.gms.internal.ads.F50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4115jC f35276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f35277b = com.google.android.gms.internal.ads.AbstractC3733fl0.c();

    @Override // com.google.android.gms.internal.ads.F50
    public final /* bridge */ /* synthetic */ P4.d a(com.google.android.gms.internal.ads.G50 g50, com.google.android.gms.internal.ads.E50 e50, java.lang.Object obj) {
        return c(g50, e50, null);
    }

    public final com.google.android.gms.internal.ads.InterfaceC4115jC b() {
        return this.f35276a;
    }

    public final P4.d c(com.google.android.gms.internal.ads.G50 g50, com.google.android.gms.internal.ads.E50 e50, com.google.android.gms.internal.ads.InterfaceC4115jC interfaceC4115jC) {
        com.google.android.gms.internal.ads.InterfaceC4007iC interfaceC4007iCA = e50.a(g50.f27676b);
        interfaceC4007iCA.l(new com.google.android.gms.internal.ads.J50(true));
        com.google.android.gms.internal.ads.InterfaceC4115jC interfaceC4115jC2 = (com.google.android.gms.internal.ads.InterfaceC4115jC) interfaceC4007iCA.g();
        this.f35276a = interfaceC4115jC2;
        final com.google.android.gms.internal.ads.LA laB = interfaceC4115jC2.b();
        final com.google.android.gms.internal.ads.C4328l80 c4328l80 = new com.google.android.gms.internal.ads.C4328l80();
        return (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.m((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(laB.i()), new com.google.android.gms.internal.ads.InterfaceC5268tk0(this) { // from class: com.google.android.gms.internal.ads.d50
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                com.google.android.gms.internal.ads.C3558e70 c3558e70 = (com.google.android.gms.internal.ads.C3558e70) obj;
                c4328l80.f37094b = c3558e70;
                java.util.Iterator it = c3558e70.f34899b.f34447a.iterator();
                boolean z6 = false;
                while (it.hasNext()) {
                    java.util.Iterator it2 = ((com.google.android.gms.internal.ads.R60) it.next()).f31160a.iterator();
                    while (it2.hasNext()) {
                        if (!((java.lang.String) it2.next()).contains("FirstPartyRenderer")) {
                            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
                        }
                        z6 = true;
                    }
                }
                if (z6) {
                    return laB.h(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c3558e70));
                }
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
            }
        }, this.f35277b), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.e50
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.C4328l80 c4328l81 = c4328l80;
                c4328l81.f37095c = (com.google.android.gms.internal.ads.AbstractC3673fA) obj;
                return c4328l81;
            }
        }, this.f35277b);
    }

    @Override // com.google.android.gms.internal.ads.F50
    public final /* synthetic */ java.lang.Object f() {
        return this.f35276a;
    }
}
