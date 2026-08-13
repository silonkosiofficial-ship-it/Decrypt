package p204u3;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2642Nf0 f55485f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2698Ot f55482c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55484e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f55480a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4819pf0 f55483d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f55481b = null;

    private final com.google.android.gms.internal.ads.AbstractC2716Pf0 l() {
        com.google.android.gms.internal.ads.AbstractC2679Of0 abstractC2679Of0C = com.google.android.gms.internal.ads.AbstractC2716Pf0.c();
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.rb)).booleanValue() || android.text.TextUtils.isEmpty(this.f55481b)) {
            java.lang.String str = this.f55480a;
            if (str != null) {
                abstractC2679Of0C.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            abstractC2679Of0C.a(this.f55481b);
        }
        return abstractC2679Of0C.c();
    }

    private final void m() {
        if (this.f55485f == null) {
            this.f55485f = new p204u3.G(this);
        }
    }

    public final synchronized void a(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, android.content.Context context) {
        this.f55482c = interfaceC2698Ot;
        if (!k(context)) {
            f("Unable to bind", "on_play_store_bind");
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("action", "fetch_completed");
        e("on_play_store_bind", map);
    }

    public final void b() {
        com.google.android.gms.internal.ads.InterfaceC4819pf0 interfaceC4819pf0;
        if (!this.f55484e || (interfaceC4819pf0 = this.f55483d) == null) {
            p214v3.AbstractC7265q0.k("LastMileDelivery not connected");
        } else {
            interfaceC4819pf0.a(l(), this.f55485f);
            d("onLMDOverlayCollapse");
        }
    }

    public final void c() {
        com.google.android.gms.internal.ads.InterfaceC4819pf0 interfaceC4819pf0;
        if (!this.f55484e || (interfaceC4819pf0 = this.f55483d) == null) {
            p214v3.AbstractC7265q0.k("LastMileDelivery not connected");
            return;
        }
        com.google.android.gms.internal.ads.AbstractC4599nf0 abstractC4599nf0C = com.google.android.gms.internal.ads.AbstractC4709of0.c();
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.rb)).booleanValue() || android.text.TextUtils.isEmpty(this.f55481b)) {
            java.lang.String str = this.f55480a;
            if (str != null) {
                abstractC4599nf0C.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            abstractC4599nf0C.a(this.f55481b);
        }
        interfaceC4819pf0.c(abstractC4599nf0C.c(), this.f55485f);
    }

    final void d(java.lang.String str) {
        e(str, new java.util.HashMap());
    }

    final void e(final java.lang.String str, final java.util.Map map) {
        com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: u3.F
            @Override // java.lang.Runnable
            public final void run() {
                this.f55476C.h(str, map);
            }
        });
    }

    final void f(java.lang.String str, java.lang.String str2) {
        p214v3.AbstractC7265q0.k(str);
        if (this.f55482c != null) {
            java.util.HashMap map = new java.util.HashMap();
            map.put("message", str);
            map.put("action", str2);
            e("onError", map);
        }
    }

    public final void g() {
        com.google.android.gms.internal.ads.InterfaceC4819pf0 interfaceC4819pf0;
        if (!this.f55484e || (interfaceC4819pf0 = this.f55483d) == null) {
            p214v3.AbstractC7265q0.k("LastMileDelivery not connected");
        } else {
            interfaceC4819pf0.d(l(), this.f55485f);
            d("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void h(java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f55482c;
        if (interfaceC2698Ot != null) {
            interfaceC2698Ot.O(str, map);
        }
    }

    final void i(com.google.android.gms.internal.ads.AbstractC2605Mf0 abstractC2605Mf0) {
        if (!android.text.TextUtils.isEmpty(abstractC2605Mf0.b())) {
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.rb)).booleanValue()) {
                this.f55480a = abstractC2605Mf0.b();
            }
        }
        switch (abstractC2605Mf0.a()) {
            case 8152:
                d("onLMDOverlayOpened");
                break;
            case 8153:
                d("onLMDOverlayClicked");
                break;
            case 8155:
                d("onLMDOverlayClose");
                break;
            case 8157:
                this.f55480a = null;
                this.f55481b = null;
                this.f55484e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                java.util.HashMap map = new java.util.HashMap();
                map.put("error", java.lang.String.valueOf(abstractC2605Mf0.a()));
                e("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final void j(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.AbstractC2495Jf0 abstractC2495Jf0) {
        if (interfaceC2698Ot == null) {
            f("adWebview missing", "onLMDShow");
            return;
        }
        this.f55482c = interfaceC2698Ot;
        if (!this.f55484e && !k(interfaceC2698Ot.getContext())) {
            f("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.rb)).booleanValue()) {
            this.f55481b = abstractC2495Jf0.h();
        }
        m();
        com.google.android.gms.internal.ads.InterfaceC4819pf0 interfaceC4819pf0 = this.f55483d;
        if (interfaceC4819pf0 != null) {
            interfaceC4819pf0.b(abstractC2495Jf0, this.f55485f);
        }
    }

    public final synchronized boolean k(android.content.Context context) {
        if (!com.google.android.gms.internal.ads.AbstractC3394cg0.a(context)) {
            return false;
        }
        try {
            this.f55483d = com.google.android.gms.internal.ads.AbstractC4929qf0.a(context);
        } catch (java.lang.NullPointerException e6) {
            p214v3.AbstractC7265q0.k("Error connecting LMD Overlay service");
            p174r3.v.s().x(e6, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f55483d == null) {
            this.f55484e = false;
            return false;
        }
        m();
        this.f55484e = true;
        return true;
    }
}
