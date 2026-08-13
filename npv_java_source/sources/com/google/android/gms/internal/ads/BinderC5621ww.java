package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5621ww extends p184s3.AbstractBinderC7136u0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f39724C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p224w3.a f39725D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SM f39726E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XT f39727F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4805pX f39728G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4797pP f39729H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4840pq f39730I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XM f39731J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KP f39732K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2972Wg f39733L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f39734M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.K70 f39735N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5102sB f39736O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f39737P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f39738Q = false;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final java.lang.Long f39739R = java.lang.Long.valueOf(p174r3.v.c().c());

    BinderC5621ww(android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.SM sm, com.google.android.gms.internal.ads.XT xt, com.google.android.gms.internal.ads.C4805pX c4805pX, com.google.android.gms.internal.ads.C4797pP c4797pP, com.google.android.gms.internal.ads.C4840pq c4840pq, com.google.android.gms.internal.ads.XM xm, com.google.android.gms.internal.ads.KP kp, com.google.android.gms.internal.ads.C2972Wg c2972Wg, com.google.android.gms.internal.ads.T90 t90, com.google.android.gms.internal.ads.K70 k70, com.google.android.gms.internal.ads.C5102sB c5102sB, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f39724C = context;
        this.f39725D = aVar;
        this.f39726E = sm;
        this.f39727F = xt;
        this.f39728G = c4805pX;
        this.f39729H = c4797pP;
        this.f39730I = c4840pq;
        this.f39731J = xm;
        this.f39732K = kp;
        this.f39733L = c2972Wg;
        this.f39734M = t90;
        this.f39735N = k70;
        this.f39736O = c5102sB;
        this.f39737P = c3588eO;
    }

    @Override // p184s3.InterfaceC7139v0
    public final void B5(p184s3.K1 k6) {
        this.f39730I.n(this.f39724C, k6);
    }

    final /* synthetic */ void C() {
        this.f39733L.a(new com.google.android.gms.internal.ads.BinderC4946qo());
    }

    @Override // p184s3.InterfaceC7139v0
    public final void P4(java.lang.String str, X3.a aVar) {
        java.lang.String strV;
        java.lang.Runnable runnable;
        com.google.android.gms.internal.ads.AbstractC2161Af.a(this.f39724C);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25584i4)).booleanValue()) {
            try {
                p174r3.v.t();
                strV = p214v3.E0.V(this.f39724C);
            } catch (android.os.RemoteException | java.lang.RuntimeException e6) {
                p174r3.v.s().x(e6, "NonagonMobileAdsSettingManager_AppId");
                strV = "";
            }
        } else {
            strV = "";
        }
        boolean z6 = true;
        java.lang.String str2 = true == android.text.TextUtils.isEmpty(strV) ? str : strV;
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25507b4)).booleanValue();
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25493a1;
        boolean zBooleanValue2 = zBooleanValue | ((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue();
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            final java.lang.Runnable runnable2 = (java.lang.Runnable) X3.b.L0(aVar);
            runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.vw
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34800f;
                    final com.google.android.gms.internal.ads.BinderC5621ww binderC5621ww = this.f39476C;
                    final java.lang.Runnable runnable3 = runnable2;
                    yk0.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.qw
                        @Override // java.lang.Runnable
                        public final void run() {
                            binderC5621ww.o6(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z6 = zBooleanValue2;
        }
        java.lang.Runnable runnable3 = runnable;
        if (z6) {
            p174r3.v.d().a(this.f39724C, this.f39725D, str2, runnable3, this.f39734M, this.f39737P, this.f39739R);
        }
    }

    @Override // p184s3.InterfaceC7139v0
    public final void R0(java.lang.String str) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25650o9)).booleanValue()) {
            p174r3.v.s().A(str);
        }
    }

    @Override // p184s3.InterfaceC7139v0
    public final synchronized void W4(java.lang.String str) {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(this.f39724C);
        if (!android.text.TextUtils.isEmpty(str)) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25507b4)).booleanValue()) {
                p174r3.v.d().a(this.f39724C, this.f39725D, str, null, this.f39734M, null, null);
            }
        }
    }

    @Override // p184s3.InterfaceC7139v0
    public final void Y0(com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        this.f39735N.f(interfaceC2945Vl);
    }

    @Override // p184s3.InterfaceC7139v0
    public final void a0(java.lang.String str) {
        this.f39728G.g(str);
    }

    final void b() {
        if (p174r3.v.s().j().R()) {
            java.lang.String strH = p174r3.v.s().j().h();
            if (p174r3.v.w().j(this.f39724C, strH, this.f39725D.f56217C)) {
                return;
            }
            p174r3.v.s().j().G0(false);
            p174r3.v.s().j().x("");
        }
    }

    @Override // p184s3.InterfaceC7139v0
    public final synchronized float d() {
        return p174r3.v.v().a();
    }

    @Override // p184s3.InterfaceC7139v0
    public final java.lang.String e() {
        return this.f39725D.f56217C;
    }

    @Override // p184s3.InterfaceC7139v0
    public final void e2(p184s3.H0 h6) {
        this.f39732K.i(h6, com.google.android.gms.internal.ads.JP.API);
    }

    final /* synthetic */ void f() {
        com.google.android.gms.internal.ads.S70.b(this.f39724C, true);
    }

    @Override // p184s3.InterfaceC7139v0
    public final void h() {
        this.f39729H.l();
    }

    @Override // p184s3.InterfaceC7139v0
    public final java.util.List i() {
        return this.f39729H.g();
    }

    @Override // p184s3.InterfaceC7139v0
    public final synchronized void j6(boolean z6) {
        p174r3.v.v().c(z6);
    }

    @Override // p184s3.InterfaceC7139v0
    public final synchronized void k() {
        if (this.f39738Q) {
            p224w3.p.g("Mobile ads is initialized already.");
            return;
        }
        com.google.android.gms.internal.ads.AbstractC2161Af.a(this.f39724C);
        p174r3.v.s().v(this.f39724C, this.f39725D);
        this.f39736O.c();
        p174r3.v.f().i(this.f39724C);
        this.f39738Q = true;
        this.f39729H.r();
        this.f39728G.e();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25529d4)).booleanValue()) {
            this.f39731J.d();
        }
        this.f39732K.h();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25533d9)).booleanValue()) {
            com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.rw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38577C.b();
                }
            });
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Pa)).booleanValue()) {
            com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.uw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39294C.C();
                }
            });
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25506b3)).booleanValue()) {
            com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.sw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38823C.f();
                }
            });
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25277G4)).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25288H4)).booleanValue()) {
                com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.tw
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39058C.z();
                    }
                });
            }
        }
    }

    @Override // p184s3.InterfaceC7139v0
    public final void l0(boolean z6) throws android.os.RemoteException {
        try {
            com.google.android.gms.internal.ads.C2567Le0.a(this.f39724C).c(z6);
            if (z6) {
                return;
            }
            try {
                if (this.f39724C.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new java.io.IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (java.io.IOException e6) {
                p174r3.v.s().x(e6, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (java.io.IOException e10) {
            throw new android.os.RemoteException(e10.getMessage());
        }
    }

    final void o6(java.lang.Runnable runnable) {
        Q3.AbstractC1477p.e("Adapters must be initialized on the main thread.");
        java.util.Map mapE = p174r3.v.s().j().i().e();
        if (mapE.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (java.lang.Throwable th) {
                p224w3.p.h("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.f39726E.d()) {
            java.util.HashMap map = new java.util.HashMap();
            java.util.Iterator it = mapE.values().iterator();
            while (it.hasNext()) {
                for (com.google.android.gms.internal.ads.C2653Nl c2653Nl : ((com.google.android.gms.internal.ads.C2690Ol) it.next()).f30557a) {
                    java.lang.String str = c2653Nl.f30370b;
                    for (java.lang.String str2 : c2653Nl.f30369a) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new java.util.ArrayList());
                        }
                        if (str != null) {
                            ((java.util.List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                try {
                    com.google.android.gms.internal.ads.YT ytA = this.f39727F.a(str3, jSONObject);
                    if (ytA != null) {
                        com.google.android.gms.internal.ads.M70 m70 = (com.google.android.gms.internal.ads.M70) ytA.f33355b;
                        if (!m70.c() && m70.b()) {
                            m70.o(this.f39724C, (com.google.android.gms.internal.ads.UU) ytA.f33356c, (java.util.List) entry.getValue());
                            p224w3.p.b("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (com.google.android.gms.internal.ads.C5315u70 e6) {
                    p224w3.p.h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e6);
                }
            }
        }
    }

    @Override // p184s3.InterfaceC7139v0
    public final void p5(X3.a aVar, java.lang.String str) {
        if (aVar == null) {
            p224w3.p.d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        android.content.Context context = (android.content.Context) X3.b.L0(aVar);
        if (context == null) {
            p224w3.p.d("Context is null. Failed to open debug menu.");
            return;
        }
        p214v3.C7273v c7273v = new p214v3.C7273v(context);
        c7273v.n(str);
        c7273v.o(this.f39725D.f56217C);
        c7273v.r();
    }

    @Override // p184s3.InterfaceC7139v0
    public final synchronized boolean v() {
        return p174r3.v.v().e();
    }

    @Override // p184s3.InterfaceC7139v0
    public final synchronized void w0(float f6) {
        p174r3.v.v().d(f6);
    }

    @Override // p184s3.InterfaceC7139v0
    public final void y2(com.google.android.gms.internal.ads.InterfaceC3950hk interfaceC3950hk) {
        this.f39729H.s(interfaceC3950hk);
    }

    final /* synthetic */ void z() {
        p174r3.v.i().d(this.f39724C, this.f39737P);
    }
}
