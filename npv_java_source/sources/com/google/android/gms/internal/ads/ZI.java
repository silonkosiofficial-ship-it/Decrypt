package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class ZI extends com.google.android.gms.internal.ads.AbstractC3673fA {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f33543G = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final p224w3.a f33544A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final android.content.Context f33545B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3253bJ f33546C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XX f33547D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.Map f33548E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.List f33549F;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.Executor f33550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3581eJ f33551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4459mJ f33552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.FJ f33553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4129jJ f33554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4789pJ f33555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Uy0 f33556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Uy0 f33557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Uy0 f33558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Uy0 f33559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Uy0 f33560t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK f33561u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f33562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f33563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f33564x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4400lq f33565y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f33566z;

    static {
        com.google.android.gms.internal.ads.AbstractC3398ci0.T("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public ZI(com.google.android.gms.internal.ads.C3563eA c3563eA, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.C3581eJ c3581eJ, com.google.android.gms.internal.ads.InterfaceC4459mJ interfaceC4459mJ, com.google.android.gms.internal.ads.FJ fj, com.google.android.gms.internal.ads.C4129jJ c4129jJ, com.google.android.gms.internal.ads.C4789pJ c4789pJ, com.google.android.gms.internal.ads.Uy0 uy0, com.google.android.gms.internal.ads.Uy0 uy1, com.google.android.gms.internal.ads.Uy0 uy2, com.google.android.gms.internal.ads.Uy0 uy3, com.google.android.gms.internal.ads.Uy0 uy4, com.google.android.gms.internal.ads.C4400lq c4400lq, com.google.android.gms.internal.ads.Z9 z10, p224w3.a aVar, android.content.Context context, com.google.android.gms.internal.ads.C3253bJ c3253bJ, com.google.android.gms.internal.ads.XX xx, com.google.android.gms.internal.ads.C2707Pb c2707Pb) {
        super(c3563eA);
        this.f33550j = executor;
        this.f33551k = c3581eJ;
        this.f33552l = interfaceC4459mJ;
        this.f33553m = fj;
        this.f33554n = c4129jJ;
        this.f33555o = c4789pJ;
        this.f33556p = uy0;
        this.f33557q = uy1;
        this.f33558r = uy2;
        this.f33559s = uy3;
        this.f33560t = uy4;
        this.f33565y = c4400lq;
        this.f33566z = z10;
        this.f33544A = aVar;
        this.f33545B = context;
        this.f33546C = c3253bJ;
        this.f33547D = xx;
        this.f33548E = new java.util.HashMap();
        this.f33549F = new java.util.ArrayList();
    }

    public static boolean H(android.view.View view) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.xa)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new android.graphics.Rect(), new android.graphics.Point());
        }
        p174r3.v.t();
        long jC0 = p214v3.E0.c0(view);
        if (view.isShown() && view.getGlobalVisibleRect(new android.graphics.Rect(), new android.graphics.Point())) {
            if (jC0 >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ya)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized android.widget.ImageView.ScaleType K() {
        com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK = this.f33561u;
        if (interfaceViewOnClickListenerC3583eK == null) {
            p224w3.p.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        X3.a aVarJ = interfaceViewOnClickListenerC3583eK.j();
        if (aVarJ != null) {
            return (android.widget.ImageView.ScaleType) X3.b.L0(aVarJ);
        }
        return com.google.android.gms.internal.ads.FJ.f27334k;
    }

    private final void L(java.lang.String str, boolean z6) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25617l5)).booleanValue()) {
            T("Google", true);
            return;
        }
        P4.d dVarJ0 = this.f33551k.j0();
        if (dVarJ0 == null) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarJ0, new com.google.android.gms.internal.ads.WI(this, "Google", true), this.f33550j);
    }

    private final synchronized void M(android.view.View view, java.util.Map map, java.util.Map map2) {
        this.f33553m.d(this.f33561u);
        this.f33552l.b(view, map, map2, K());
        this.f33563w = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(android.view.View view, com.google.android.gms.internal.ads.QT qt) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtE0 = this.f33551k.e0();
        if (!this.f33554n.d() || qt == null || interfaceC2698OtE0 == null || view == null) {
            return;
        }
        p174r3.v.b().c(qt.a(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final synchronized void f0(com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK) {
        java.util.Iterator<java.lang.String> itKeys;
        android.view.View view;
        com.google.android.gms.internal.ads.T9 t9C;
        try {
            if (!this.f33562v) {
                this.f33561u = interfaceViewOnClickListenerC3583eK;
                this.f33553m.e(interfaceViewOnClickListenerC3583eK);
                this.f33552l.f(interfaceViewOnClickListenerC3583eK.e(), interfaceViewOnClickListenerC3583eK.m(), interfaceViewOnClickListenerC3583eK.n(), interfaceViewOnClickListenerC3583eK, interfaceViewOnClickListenerC3583eK);
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25319K2)).booleanValue() && (t9C = this.f33566z.c()) != null) {
                    t9C.b(interfaceViewOnClickListenerC3583eK.e());
                }
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25406S1)).booleanValue()) {
                    com.google.android.gms.internal.ads.R60 r60 = this.f35291b;
                    if (r60.f31181k0 && (itKeys = r60.f31179j0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            java.lang.String next = itKeys.next();
                            com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK2 = this.f33561u;
                            java.lang.ref.WeakReference weakReference = interfaceViewOnClickListenerC3583eK2 == null ? null : (java.lang.ref.WeakReference) interfaceViewOnClickListenerC3583eK2.l().get(next);
                            this.f33548E.put(next, java.lang.Boolean.FALSE);
                            if (weakReference != null && (view = (android.view.View) weakReference.get()) != null) {
                                com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob viewOnAttachStateChangeListenerC2670Ob = new com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob(this.f33545B, view);
                                this.f33549F.add(viewOnAttachStateChangeListenerC2670Ob);
                                viewOnAttachStateChangeListenerC2670Ob.c(new com.google.android.gms.internal.ads.VI(this, next));
                            }
                        }
                    }
                }
                if (interfaceViewOnClickListenerC3583eK.h() != null) {
                    interfaceViewOnClickListenerC3583eK.h().c(this.f33565y);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void i(com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK) {
        this.f33552l.l(interfaceViewOnClickListenerC3583eK.e(), interfaceViewOnClickListenerC3583eK.l());
        if (interfaceViewOnClickListenerC3583eK.g() != null) {
            interfaceViewOnClickListenerC3583eK.g().setClickable(false);
            interfaceViewOnClickListenerC3583eK.g().removeAllViews();
        }
        if (interfaceViewOnClickListenerC3583eK.h() != null) {
            interfaceViewOnClickListenerC3583eK.h().e(this.f33565y);
        }
        this.f33561u = null;
    }

    public static /* synthetic */ void Y(com.google.android.gms.internal.ads.ZI zi) {
        try {
            com.google.android.gms.internal.ads.C3581eJ c3581eJ = zi.f33551k;
            int iP = c3581eJ.P();
            if (iP == 1) {
                com.google.android.gms.internal.ads.InterfaceC2682Oh interfaceC2682OhB = zi.f33555o.b();
                if (interfaceC2682OhB != null) {
                    zi.L("Google", true);
                    interfaceC2682OhB.Q5((com.google.android.gms.internal.ads.InterfaceC2313Eh) zi.f33556p.b());
                    return;
                }
                return;
            }
            if (iP == 2) {
                com.google.android.gms.internal.ads.InterfaceC2572Lh interfaceC2572LhA = zi.f33555o.a();
                if (interfaceC2572LhA != null) {
                    zi.L("Google", true);
                    interfaceC2572LhA.v1((com.google.android.gms.internal.ads.InterfaceC2239Ch) zi.f33557q.b());
                    return;
                }
                return;
            }
            if (iP == 3) {
                com.google.android.gms.internal.ads.InterfaceC2938Vh interfaceC2938VhD = zi.f33555o.d(c3581eJ.a());
                if (interfaceC2938VhD != null) {
                    if (zi.f33551k.f0() != null) {
                        zi.T("Google", true);
                    }
                    interfaceC2938VhD.J3((com.google.android.gms.internal.ads.InterfaceC2424Hh) zi.f33560t.b());
                    return;
                }
                return;
            }
            if (iP == 6) {
                com.google.android.gms.internal.ads.InterfaceC3397ci interfaceC3397ciF = zi.f33555o.f();
                if (interfaceC3397ciF != null) {
                    zi.L("Google", true);
                    interfaceC3397ciF.N3((com.google.android.gms.internal.ads.InterfaceC4274ki) zi.f33558r.b());
                    return;
                }
                return;
            }
            if (iP != 7) {
                p224w3.p.d("Wrong native template id!");
                return;
            }
            com.google.android.gms.internal.ads.InterfaceC5597wk interfaceC5597wkG = zi.f33555o.g();
            if (interfaceC5597wkG != null) {
                interfaceC5597wkG.r1((com.google.android.gms.internal.ads.InterfaceC4938qk) zi.f33559s.b());
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("RemoteException when notifyAdLoad is called", e6);
        }
    }

    public final synchronized void A(com.google.android.gms.internal.ads.InterfaceC3946hi interfaceC3946hi) {
        this.f33552l.p(interfaceC3946hi);
    }

    public final synchronized void B(final com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25384Q1)).booleanValue()) {
            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.NI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30269C.f0(interfaceViewOnClickListenerC3583eK);
                }
            });
        } else {
            f0(interfaceViewOnClickListenerC3583eK);
        }
    }

    public final synchronized void C(final com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25384Q1)).booleanValue()) {
            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.OI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30478C.i(interfaceViewOnClickListenerC3583eK);
                }
            });
        } else {
            i(interfaceViewOnClickListenerC3583eK);
        }
    }

    public final boolean D() {
        return this.f33554n.e();
    }

    public final synchronized boolean E() {
        return this.f33552l.Y();
    }

    public final synchronized boolean F() {
        return this.f33552l.r();
    }

    public final boolean G() {
        return this.f33554n.d();
    }

    public final synchronized boolean I(android.os.Bundle bundle) {
        if (this.f33563w) {
            return true;
        }
        boolean zE = this.f33552l.e(bundle);
        this.f33563w = zE;
        return zE;
    }

    public final synchronized int J() {
        return this.f33552l.a();
    }

    public final com.google.android.gms.internal.ads.C3253bJ Q() {
        return this.f33546C;
    }

    public final com.google.android.gms.internal.ads.QT T(java.lang.String str, boolean z6) {
        java.lang.String str2;
        java.lang.String str3;
        com.google.android.gms.internal.ads.NT nt;
        com.google.android.gms.internal.ads.MT mt;
        java.lang.String str4;
        if (!this.f33554n.d() || android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        com.google.android.gms.internal.ads.C3581eJ c3581eJ = this.f33551k;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtE0 = c3581eJ.e0();
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtF0 = c3581eJ.f0();
        if (interfaceC2698OtE0 == null && interfaceC2698OtF0 == null) {
            str3 = "Omid display and video webview are null. Skipping initialization.";
        } else {
            boolean z10 = false;
            boolean z11 = interfaceC2698OtE0 != null;
            boolean z12 = interfaceC2698OtF0 != null;
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25596j5)).booleanValue()) {
                this.f33554n.a();
                int iC = this.f33554n.a().c();
                int i6 = iC - 1;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (iC != 1) {
                            str4 = iC != 2 ? "UNKNOWN" : "DISPLAY";
                        } else {
                            str4 = "VIDEO";
                        }
                        str3 = "Unknown omid media type: " + str4 + ". Not initializing Omid.";
                    } else if (interfaceC2698OtE0 != null) {
                        z12 = false;
                        z10 = true;
                    } else {
                        str3 = "Omid media type was display but there was no display webview.";
                    }
                } else if (interfaceC2698OtF0 != null) {
                    z12 = true;
                } else {
                    str3 = "Omid media type was video but there was no video webview.";
                }
            } else {
                z10 = z11;
            }
            if (z10) {
                str2 = null;
            } else {
                str2 = "javascript";
                interfaceC2698OtE0 = interfaceC2698OtF0;
            }
            if (interfaceC2698OtE0 != null) {
                if (p174r3.v.b().f(this.f33545B)) {
                    p224w3.a aVar = this.f33544A;
                    java.lang.String str5 = aVar.f56218D + "." + aVar.f56219E;
                    if (z12) {
                        mt = com.google.android.gms.internal.ads.MT.VIDEO;
                        nt = com.google.android.gms.internal.ads.NT.DEFINED_BY_JAVASCRIPT;
                    } else {
                        com.google.android.gms.internal.ads.C3581eJ c3581eJ2 = this.f33551k;
                        com.google.android.gms.internal.ads.MT mt2 = com.google.android.gms.internal.ads.MT.NATIVE_DISPLAY;
                        nt = c3581eJ2.P() == 3 ? com.google.android.gms.internal.ads.NT.UNSPECIFIED : com.google.android.gms.internal.ads.NT.ONE_PIXEL;
                        mt = mt2;
                    }
                    com.google.android.gms.internal.ads.QT qtG = p174r3.v.b().g(str5, interfaceC2698OtE0.i0(), "", "javascript", str2, str, nt, mt, this.f35291b.f31183l0);
                    if (qtG != null) {
                        this.f33551k.w(qtG);
                        interfaceC2698OtE0.n1(qtG);
                        if (z12) {
                            com.google.android.gms.internal.ads.AbstractC2191Bb0 abstractC2191Bb0A = qtG.a();
                            if (interfaceC2698OtF0 != null) {
                                p174r3.v.b().c(abstractC2191Bb0A, interfaceC2698OtF0.N());
                            }
                            this.f33564x = true;
                        }
                        if (z6) {
                            p174r3.v.b().e(qtG.a());
                            interfaceC2698OtE0.O("onSdkLoaded", new p170r.C7026a());
                        }
                        return qtG;
                    }
                    str3 = "Failed to create omid session in InternalNativeAd";
                } else {
                    str3 = "Failed to initialize omid in InternalNativeAd";
                }
            } else {
                str3 = "Webview is null in InternalNativeAd";
            }
        }
        p224w3.p.g(str3);
        return null;
    }

    public final java.lang.String U() {
        return this.f33554n.b();
    }

    public final synchronized org.json.JSONObject W(android.view.View view, java.util.Map map, java.util.Map map2) {
        return this.f33552l.q(view, map, map2, K());
    }

    public final synchronized org.json.JSONObject X(android.view.View view, java.util.Map map, java.util.Map map2) {
        return this.f33552l.v(view, map, map2, K());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3673fA
    public final synchronized void a() {
        this.f33562v = true;
        this.f33550j.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.TI
            @Override // java.lang.Runnable
            public final void run() {
                this.f31917C.c0();
            }
        });
        super.a();
    }

    public final void a0(android.view.View view) {
        com.google.android.gms.internal.ads.QT qtH0 = this.f33551k.h0();
        if (!this.f33554n.d() || qtH0 == null || view == null) {
            return;
        }
        p174r3.v.b().d(qtH0.a(), view);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3673fA
    public final void b() {
        this.f33550j.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.PI
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.ZI.Y(this.f30684C);
            }
        });
        if (this.f33551k.P() != 7) {
            java.util.concurrent.Executor executor = this.f33550j;
            final com.google.android.gms.internal.ads.InterfaceC4459mJ interfaceC4459mJ = this.f33552l;
            j$.util.Objects.requireNonNull(interfaceC4459mJ);
            executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.QI
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC4459mJ.s();
                }
            });
        }
        super.b();
    }

    public final synchronized void b0() {
        this.f33552l.h();
    }

    final /* synthetic */ void c0() {
        this.f33552l.j();
        this.f33551k.i();
    }

    final /* synthetic */ void d0(android.view.View view, boolean z6, int i6) {
        com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK = this.f33561u;
        if (interfaceViewOnClickListenerC3583eK == null) {
            p224w3.p.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        } else {
            this.f33552l.o(view, interfaceViewOnClickListenerC3583eK.e(), this.f33561u.l(), this.f33561u.m(), z6, K(), i6);
        }
    }

    final /* synthetic */ void e0(boolean z6) {
        com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK = this.f33561u;
        if (interfaceViewOnClickListenerC3583eK == null) {
            p224w3.p.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.f33552l.o(null, interfaceViewOnClickListenerC3583eK.e(), this.f33561u.l(), this.f33561u.m(), z6, K(), 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006a A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[Catch: all -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    public final synchronized void j(android.view.View view, java.util.Map map, java.util.Map map2, boolean z6) {
        java.util.Iterator it;
        android.view.View view2;
        try {
            if (!this.f33563w) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25406S1)).booleanValue() && this.f35291b.f31181k0) {
                    java.util.Iterator it2 = this.f33548E.keySet().iterator();
                    while (it2.hasNext()) {
                        if (!((java.lang.Boolean) this.f33548E.get((java.lang.String) it2.next())).booleanValue()) {
                        }
                    }
                    if (!z6) {
                        M(view, map, map2);
                        return;
                    }
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25463X3)).booleanValue()) {
                        it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            view2 = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
                            if (view2 == null) {
                            }
                        }
                    }
                } else {
                    if (!z6) {
                        M(view, map, map2);
                        return;
                    }
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25463X3)).booleanValue() && map != null) {
                        it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            view2 = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
                            if (view2 == null && H(view2)) {
                                M(view, map, map2);
                                return;
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(p184s3.D0 d6) {
        this.f33552l.c(d6);
    }

    public final synchronized void l(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z6) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtF0;
        this.f33553m.c(this.f33561u);
        this.f33552l.i(view, view2, map, map2, z6, K());
        if (this.f33564x) {
            com.google.android.gms.internal.ads.C3581eJ c3581eJ = this.f33551k;
            if (c3581eJ.f0() != null && (interfaceC2698OtF0 = c3581eJ.f0()) != null) {
                interfaceC2698OtF0.O("onSdkAdUserInteractionClick", new p170r.C7026a());
            }
        }
    }

    public final synchronized void m(final android.view.View view, final int i6) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.tb)).booleanValue()) {
            com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK = this.f33561u;
            if (interfaceViewOnClickListenerC3583eK == null) {
                p224w3.p.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z6 = interfaceViewOnClickListenerC3583eK instanceof com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC5778yJ;
                this.f33550j.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.SI
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31663C.d0(view, z6, i6);
                    }
                });
            }
        }
    }

    public final synchronized void n(java.lang.String str) {
        this.f33552l.u0(str);
    }

    public final synchronized void o(android.os.Bundle bundle) {
        this.f33552l.k(bundle);
    }

    public final synchronized void p() {
        com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK = this.f33561u;
        if (interfaceViewOnClickListenerC3583eK == null) {
            p224w3.p.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z6 = interfaceViewOnClickListenerC3583eK instanceof com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC5778yJ;
            this.f33550j.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.UI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32180C.e0(z6);
                }
            });
        }
    }

    public final void q(android.os.Bundle bundle) {
        final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtF0 = this.f33551k.f0();
        if (interfaceC2698OtF0 == null) {
            p224w3.p.d("Video webview is null");
            return;
        }
        try {
            final org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.lang.String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.f33550j.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.RI
                @Override // java.lang.Runnable
                public final void run() {
                    int i6 = com.google.android.gms.internal.ads.ZI.f33543G;
                    interfaceC2698OtF0.a("onVideoEvent", jSONObject);
                }
            });
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error reading event signals", e6);
        }
    }

    public final synchronized void r() {
        if (this.f33563w) {
            return;
        }
        this.f33552l.u();
    }

    public final void s(android.view.View view) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25617l5)).booleanValue()) {
            com.google.android.gms.internal.ads.C3581eJ c3581eJ = this.f33551k;
            if (c3581eJ.P() != 3) {
                com.google.android.gms.internal.ads.C4512mr c4512mrC0 = c3581eJ.c0();
                if (c4512mrC0 == null) {
                    return;
                }
                com.google.android.gms.internal.ads.AbstractC2652Nk0.r(c4512mrC0, new com.google.android.gms.internal.ads.XI(this, view), this.f33550j);
                return;
            }
        }
        N(view, this.f33551k.h0());
    }

    public final synchronized void u(android.view.View view, android.view.MotionEvent motionEvent, android.view.View view2) {
        this.f33552l.n(view, motionEvent, view2);
    }

    public final synchronized void v(android.os.Bundle bundle) {
        this.f33552l.m(bundle);
    }

    public final synchronized void w(android.view.View view) {
        this.f33552l.d(view);
    }

    public final synchronized void x() {
        this.f33552l.z();
    }

    public final synchronized void y(p184s3.A0 a6) {
        this.f33552l.t(a6);
    }

    public final synchronized void z(p184s3.N0 n6) {
        this.f33547D.a(n6);
    }
}
