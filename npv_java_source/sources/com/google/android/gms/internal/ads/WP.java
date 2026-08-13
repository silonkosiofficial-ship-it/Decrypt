package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class WP implements p204u3.z, com.google.android.gms.internal.ads.InterfaceC2478Iu {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f32731C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p224w3.a f32732D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.ads.KP f32733E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2698Ot f32734F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f32735G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f32736H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private long f32737I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private p184s3.H0 f32738J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f32739K;

    WP(android.content.Context context, p224w3.a aVar) {
        this.f32731C = context;
        this.f32732D = aVar;
    }

    private final synchronized boolean g(p184s3.H0 h6) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue()) {
            p224w3.p.g("Ad inspector had an internal error.");
            try {
                h6.V1(com.google.android.gms.internal.ads.P70.d(16, null, null));
            } catch (android.os.RemoteException unused) {
            }
            return false;
        }
        if (this.f32733E == null) {
            p224w3.p.g("Ad inspector had an internal error.");
            try {
                p174r3.v.s().x(new java.lang.NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                h6.V1(com.google.android.gms.internal.ads.P70.d(16, null, null));
            } catch (android.os.RemoteException unused2) {
            }
            return false;
        }
        if (!this.f32735G && !this.f32736H) {
            if (p174r3.v.c().a() >= this.f32737I + ((long) ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25402R8)).intValue())) {
                return true;
            }
        }
        p224w3.p.g("Ad inspector cannot be opened because it is already open.");
        try {
            h6.V1(com.google.android.gms.internal.ads.P70.d(19, null, null));
        } catch (android.os.RemoteException unused3) {
        }
        return false;
    }

    @Override // p204u3.z
    public final synchronized void T2() {
        this.f32736H = true;
        f("");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2478Iu
    public final synchronized void a(boolean z6, int i6, java.lang.String str, java.lang.String str2) {
        if (z6) {
            p214v3.AbstractC7265q0.k("Ad inspector loaded.");
            this.f32735G = true;
            f("");
            return;
        }
        p224w3.p.g("Ad inspector failed to load.");
        try {
            p174r3.v.s().x(new java.lang.Exception("Failed to load UI. Error code: " + i6 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            p184s3.H0 h6 = this.f32738J;
            if (h6 != null) {
                h6.V1(com.google.android.gms.internal.ads.P70.d(17, null, null));
            }
        } catch (android.os.RemoteException e6) {
            p174r3.v.s().x(e6, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.f32739K = true;
        this.f32734F.destroy();
    }

    public final android.app.Activity b() {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f32734F;
        if (interfaceC2698Ot == null || interfaceC2698Ot.L0()) {
            return null;
        }
        return this.f32734F.h();
    }

    public final void c(com.google.android.gms.internal.ads.KP kp) {
        this.f32733E = kp;
    }

    final /* synthetic */ void d(java.lang.String str) {
        org.json.JSONObject jSONObjectF = this.f32733E.f();
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                jSONObjectF.put("redirectUrl", str);
            } catch (org.json.JSONException unused) {
            }
        }
        this.f32734F.q("window.inspectorInfo", jSONObjectF.toString());
    }

    @Override // p204u3.z
    public final void d2() {
    }

    public final synchronized void e(p184s3.H0 h6, com.google.android.gms.internal.ads.C2206Bj c2206Bj, com.google.android.gms.internal.ads.C5375uj c5375uj, com.google.android.gms.internal.ads.C3948hj c3948hj) {
        if (g(h6)) {
            try {
                p174r3.v.a();
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = com.google.android.gms.internal.ads.C3640eu.a(this.f32731C, com.google.android.gms.internal.ads.C2625Mu.a(), "", false, false, null, null, this.f32732D, null, null, null, com.google.android.gms.internal.ads.C4704od.a(), null, null, null, null);
                this.f32734F = interfaceC2698OtA;
                com.google.android.gms.internal.ads.InterfaceC2552Ku interfaceC2552KuM = interfaceC2698OtA.M();
                if (interfaceC2552KuM == null) {
                    p224w3.p.g("Failed to obtain a web view for the ad inspector");
                    try {
                        p174r3.v.s().x(new java.lang.NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        h6.V1(com.google.android.gms.internal.ads.P70.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (android.os.RemoteException e6) {
                        p174r3.v.s().x(e6, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.f32738J = h6;
                interfaceC2552KuM.V(null, null, null, null, null, false, null, null, null, null, null, null, null, c2206Bj, null, new com.google.android.gms.internal.ads.C2169Aj(this.f32731C), c5375uj, c3948hj, null);
                interfaceC2552KuM.D(this);
                this.f32734F.loadUrl((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25380P8));
                p174r3.v.m();
                p204u3.y.a(this.f32731C, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(this, this.f32734F, 1, this.f32732D), true, null);
                this.f32737I = p174r3.v.c().a();
            } catch (com.google.android.gms.internal.ads.C3530du e10) {
                p224w3.p.h("Failed to obtain a web view for the ad inspector", e10);
                try {
                    p174r3.v.s().x(e10, "InspectorUi.openInspector 0");
                    h6.V1(com.google.android.gms.internal.ads.P70.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (android.os.RemoteException e11) {
                    p174r3.v.s().x(e11, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void f(final java.lang.String str) {
        if (this.f32735G && this.f32736H) {
            com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.VP
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32493C.d(str);
                }
            });
        }
    }

    @Override // p204u3.z
    public final void f3() {
    }

    @Override // p204u3.z
    public final synchronized void p4(int i6) {
        this.f32734F.destroy();
        if (!this.f32739K) {
            p214v3.AbstractC7265q0.k("Inspector closed.");
            p184s3.H0 h6 = this.f32738J;
            if (h6 != null) {
                try {
                    h6.V1(null);
                } catch (android.os.RemoteException unused) {
                }
            }
        }
        this.f32736H = false;
        this.f32735G = false;
        this.f32737I = 0L;
        this.f32739K = false;
        this.f32738J = null;
    }

    @Override // p204u3.z
    public final void q0() {
    }

    @Override // p204u3.z
    public final void y0() {
    }
}
