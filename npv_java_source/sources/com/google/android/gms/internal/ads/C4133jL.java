package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4133jL {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f36664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5405uy f36665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.GG f36666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2591Lx f36667d;

    C4133jL(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.C5405uy c5405uy, com.google.android.gms.internal.ads.GG gg, com.google.android.gms.internal.ads.C2591Lx c2591Lx) {
        this.f36664a = executor;
        this.f36666c = gg;
        this.f36665b = c5405uy;
        this.f36667d = c2591Lx;
    }

    public final void a(final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        if (interfaceC2698Ot == null) {
            return;
        }
        this.f36666c.q1(interfaceC2698Ot.N());
        this.f36666c.F0(new com.google.android.gms.internal.ads.InterfaceC2633Nb() { // from class: com.google.android.gms.internal.ads.fL
            @Override // com.google.android.gms.internal.ads.InterfaceC2633Nb
            public final void L(com.google.android.gms.internal.ads.C2596Mb c2596Mb) {
                com.google.android.gms.internal.ads.InterfaceC2552Ku interfaceC2552KuM = interfaceC2698Ot.M();
                android.graphics.Rect rect = c2596Mb.f29794d;
                interfaceC2552KuM.t0(rect.left, rect.top, false);
            }
        }, this.f36664a);
        this.f36666c.F0(new com.google.android.gms.internal.ads.InterfaceC2633Nb() { // from class: com.google.android.gms.internal.ads.gL
            @Override // com.google.android.gms.internal.ads.InterfaceC2633Nb
            public final void L(com.google.android.gms.internal.ads.C2596Mb c2596Mb) {
                java.util.HashMap map = new java.util.HashMap();
                map.put("isVisible", true != c2596Mb.f29800j ? "0" : "1");
                interfaceC2698Ot.O("onAdVisibilityChanged", map);
            }
        }, this.f36664a);
        this.f36666c.F0(this.f36665b, this.f36664a);
        this.f36665b.e(interfaceC2698Ot);
        com.google.android.gms.internal.ads.InterfaceC2552Ku interfaceC2552KuM = interfaceC2698Ot.M();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25490Z9)).booleanValue() && interfaceC2552KuM != null) {
            interfaceC2552KuM.z0(this.f36667d);
            interfaceC2552KuM.B0(this.f36667d, null, null);
        }
        interfaceC2698Ot.g1("/trackActiveViewUnit", new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.hL
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, java.util.Map map) {
                this.f36056a.b((com.google.android.gms.internal.ads.InterfaceC2698Ot) obj, map);
            }
        });
        interfaceC2698Ot.g1("/untrackActiveViewUnit", new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.iL
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, java.util.Map map) {
                this.f36273a.c((com.google.android.gms.internal.ads.InterfaceC2698Ot) obj, map);
            }
        });
    }

    final /* synthetic */ void b(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.util.Map map) {
        this.f36665b.b();
    }

    final /* synthetic */ void c(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.util.Map map) {
        this.f36665b.a();
    }
}
