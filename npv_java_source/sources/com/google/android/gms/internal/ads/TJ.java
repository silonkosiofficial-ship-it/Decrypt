package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class TJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BM f31920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PL f31921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5405uy f31922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4459mJ f31923d;

    public TJ(com.google.android.gms.internal.ads.BM bm, com.google.android.gms.internal.ads.PL pl, com.google.android.gms.internal.ads.C5405uy c5405uy, com.google.android.gms.internal.ads.InterfaceC4459mJ interfaceC4459mJ) {
        this.f31920a = bm;
        this.f31921b = pl;
        this.f31922c = c5405uy;
        this.f31923d = interfaceC4459mJ;
    }

    public final android.view.View a() {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = this.f31920a.a(p184s3.c2.s(), null, null);
        interfaceC2698OtA.N().setVisibility(8);
        interfaceC2698OtA.g1("/sendMessageToSdk", new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.NJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, java.util.Map map) {
                this.f30272a.b((com.google.android.gms.internal.ads.InterfaceC2698Ot) obj, map);
            }
        });
        interfaceC2698OtA.g1("/adMuted", new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.OJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, java.util.Map map) {
                this.f30480a.c((com.google.android.gms.internal.ads.InterfaceC2698Ot) obj, map);
            }
        });
        this.f31921b.m(new java.lang.ref.WeakReference(interfaceC2698OtA), "/loadHtml", new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.PJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, final java.util.Map map) {
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
                com.google.android.gms.internal.ads.InterfaceC2552Ku interfaceC2552KuM = interfaceC2698Ot.M();
                final com.google.android.gms.internal.ads.TJ tj = this.f30689a;
                interfaceC2552KuM.D(new com.google.android.gms.internal.ads.InterfaceC2478Iu() { // from class: com.google.android.gms.internal.ads.SJ
                    @Override // com.google.android.gms.internal.ads.InterfaceC2478Iu
                    public final void a(boolean z6, int i6, java.lang.String str, java.lang.String str2) {
                        tj.d(map, z6, i6, str, str2);
                    }
                });
                java.lang.String str = (java.lang.String) map.get("overlayHtml");
                java.lang.String str2 = (java.lang.String) map.get("baseUrl");
                if (android.text.TextUtils.isEmpty(str2)) {
                    interfaceC2698Ot.loadData(str, "text/html", "UTF-8");
                } else {
                    interfaceC2698Ot.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f31921b.m(new java.lang.ref.WeakReference(interfaceC2698OtA), "/showOverlay", new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.QJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, java.util.Map map) {
                this.f30962a.e((com.google.android.gms.internal.ads.InterfaceC2698Ot) obj, map);
            }
        });
        this.f31921b.m(new java.lang.ref.WeakReference(interfaceC2698OtA), "/hideOverlay", new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.RJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, java.util.Map map) {
                this.f31230a.f((com.google.android.gms.internal.ads.InterfaceC2698Ot) obj, map);
            }
        });
        return interfaceC2698OtA.N();
    }

    final /* synthetic */ void b(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.util.Map map) {
        this.f31921b.j("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.util.Map map) {
        this.f31923d.g();
    }

    final /* synthetic */ void d(java.util.Map map, boolean z6, int i6, java.lang.String str, java.lang.String str2) {
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (java.lang.String) map.get("id"));
        this.f31921b.j("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void e(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.util.Map map) {
        p224w3.p.f("Showing native ads overlay.");
        interfaceC2698Ot.N().setVisibility(0);
        this.f31922c.d(true);
    }

    final /* synthetic */ void f(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.util.Map map) {
        p224w3.p.f("Hiding native ads overlay.");
        interfaceC2698Ot.N().setVisibility(8);
        this.f31922c.d(false);
    }
}
