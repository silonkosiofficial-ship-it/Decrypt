package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4212k50 implements com.google.android.gms.internal.ads.F50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.F50 f36890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.F50 f36891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5757y80 f36892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f36893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4115jC f36894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.Executor f36895f;

    public C4212k50(com.google.android.gms.internal.ads.F50 f50, com.google.android.gms.internal.ads.F50 f51, com.google.android.gms.internal.ads.C5757y80 c5757y80, java.lang.String str, java.util.concurrent.Executor executor) {
        this.f36890a = f50;
        this.f36891b = f51;
        this.f36892c = c5757y80;
        this.f36893d = str;
        this.f36895f = executor;
    }

    private final P4.d g(com.google.android.gms.internal.ads.C4328l80 c4328l80, com.google.android.gms.internal.ads.G50 g50) {
        com.google.android.gms.internal.ads.InterfaceC4115jC interfaceC4115jC = c4328l80.f37093a;
        this.f36894e = interfaceC4115jC;
        if (c4328l80.f37095c != null) {
            if (interfaceC4115jC.e() != null) {
                c4328l80.f37095c.f().g(c4328l80.f37093a.e());
            }
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c4328l80.f37095c);
        }
        interfaceC4115jC.b().k(c4328l80.f37094b);
        return ((com.google.android.gms.internal.ads.C5311u50) this.f36890a).c(g50, null, c4328l80.f37093a);
    }

    @Override // com.google.android.gms.internal.ads.F50
    public final /* bridge */ /* synthetic */ P4.d a(com.google.android.gms.internal.ads.G50 g50, com.google.android.gms.internal.ads.E50 e50, java.lang.Object obj) {
        return e(g50, e50, null);
    }

    @Override // com.google.android.gms.internal.ads.F50
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.internal.ads.InterfaceC4115jC f() {
        return this.f36894e;
    }

    final /* synthetic */ P4.d c(com.google.android.gms.internal.ads.G50 g50, com.google.android.gms.internal.ads.C4102j50 c4102j50, com.google.android.gms.internal.ads.E50 e50, com.google.android.gms.internal.ads.InterfaceC4115jC interfaceC4115jC, com.google.android.gms.internal.ads.C4762p50 c4762p50) {
        if (c4762p50 != null) {
            com.google.android.gms.internal.ads.C4102j50 c4102j51 = new com.google.android.gms.internal.ads.C4102j50(c4102j50.f36561a, c4102j50.f36562b, c4102j50.f36563c, c4102j50.f36564d, c4102j50.f36565e, c4102j50.f36566f, c4762p50.f37915a);
            if (c4762p50.f37917c != null) {
                this.f36894e = null;
                this.f36892c.e(c4102j51);
                return g(c4762p50.f37917c, g50);
            }
            P4.d dVarA = this.f36892c.a(c4102j51);
            if (dVarA != null) {
                this.f36894e = null;
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVarA, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.g50
                    @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                    public final P4.d b(java.lang.Object obj) {
                        return this.f35542a.d((com.google.android.gms.internal.ads.C5427v80) obj);
                    }
                }, this.f36895f);
            }
            this.f36892c.e(c4102j51);
            g50 = new com.google.android.gms.internal.ads.G50(g50.f27676b, c4762p50.f37916b);
        }
        P4.d dVarC = ((com.google.android.gms.internal.ads.C5311u50) this.f36890a).c(g50, e50, interfaceC4115jC);
        this.f36894e = interfaceC4115jC;
        return dVarC;
    }

    final /* synthetic */ P4.d d(com.google.android.gms.internal.ads.C5427v80 c5427v80) throws com.google.android.gms.internal.ads.C4688oQ {
        com.google.android.gms.internal.ads.InterfaceC5647x80 interfaceC5647x80;
        if (c5427v80 == null || c5427v80.f39345a == null || (interfaceC5647x80 = c5427v80.f39346b) == null) {
            throw new com.google.android.gms.internal.ads.C4688oQ(1, "Empty prefetch");
        }
        com.google.android.gms.internal.ads.C4376le c4376leD0 = com.google.android.gms.internal.ads.C5145se.d0();
        com.google.android.gms.internal.ads.C4156je c4156jeH0 = com.google.android.gms.internal.ads.C4266ke.h0();
        c4156jeH0.z(com.google.android.gms.internal.ads.EnumC4486me.IN_MEMORY);
        c4156jeH0.B(com.google.android.gms.internal.ads.C4816pe.f0());
        c4376leD0.z(c4156jeH0);
        c5427v80.f39345a.f37093a.b().c().z((com.google.android.gms.internal.ads.C5145se) c4376leD0.u());
        return g(c5427v80.f39345a, ((com.google.android.gms.internal.ads.C4102j50) interfaceC5647x80).f36562b);
    }

    public final synchronized P4.d e(final com.google.android.gms.internal.ads.G50 g50, final com.google.android.gms.internal.ads.E50 e50, com.google.android.gms.internal.ads.InterfaceC4115jC interfaceC4115jC) {
        com.google.android.gms.internal.ads.InterfaceC4007iC interfaceC4007iCA = e50.a(g50.f27676b);
        interfaceC4007iCA.u(new com.google.android.gms.internal.ads.C4322l50(this.f36893d));
        final com.google.android.gms.internal.ads.InterfaceC4115jC interfaceC4115jC2 = (com.google.android.gms.internal.ads.InterfaceC4115jC) interfaceC4007iCA.g();
        interfaceC4115jC2.i();
        interfaceC4115jC2.i();
        p184s3.X1 x6 = interfaceC4115jC2.i().f37511d;
        if (x6.f54170U == null && x6.f54175Z == null) {
            com.google.android.gms.internal.ads.C4546n70 c4546n70I = interfaceC4115jC2.i();
            final com.google.android.gms.internal.ads.C4102j50 c4102j50 = new com.google.android.gms.internal.ads.C4102j50(e50, g50, c4546n70I.f37511d, c4546n70I.f37513f, this.f36895f, c4546n70I.f37517j, null);
            return (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(((com.google.android.gms.internal.ads.C4872q50) this.f36891b).c(g50, e50, interfaceC4115jC2)), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.h50
                @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                public final P4.d b(java.lang.Object obj) {
                    return this.f35999a.c(g50, c4102j50, e50, interfaceC4115jC2, (com.google.android.gms.internal.ads.C4762p50) obj);
                }
            }, this.f36895f);
        }
        this.f36894e = interfaceC4115jC2;
        return ((com.google.android.gms.internal.ads.C5311u50) this.f36890a).c(g50, e50, interfaceC4115jC2);
    }
}
