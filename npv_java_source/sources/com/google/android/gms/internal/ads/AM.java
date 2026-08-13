package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class AM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.CC f25149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KG f25150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4557nD f25151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AD f25152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.MD f25153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3793gF f25154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.Executor f25155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.GG f25156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4306ky f25157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p174r3.b f25158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3194aq f25159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f25160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XE f25161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4033iT f25162n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f25163o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f25164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2591Lx f25165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.HM f25166r;

    public AM(com.google.android.gms.internal.ads.CC cc, com.google.android.gms.internal.ads.C4557nD c4557nD, com.google.android.gms.internal.ads.AD ad, com.google.android.gms.internal.ads.MD md, com.google.android.gms.internal.ads.C3793gF c3793gF, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.GG gg, com.google.android.gms.internal.ads.C4306ky c4306ky, p174r3.b bVar, com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq, com.google.android.gms.internal.ads.Z9 z10, com.google.android.gms.internal.ads.XE xe, com.google.android.gms.internal.ads.C4033iT c4033iT, com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.KG kg, com.google.android.gms.internal.ads.C2591Lx c2591Lx, com.google.android.gms.internal.ads.HM hm) {
        this.f25149a = cc;
        this.f25151c = c4557nD;
        this.f25152d = ad;
        this.f25153e = md;
        this.f25154f = c3793gF;
        this.f25155g = executor;
        this.f25156h = gg;
        this.f25157i = c4306ky;
        this.f25158j = bVar;
        this.f25159k = interfaceC3194aq;
        this.f25160l = z10;
        this.f25161m = xe;
        this.f25162n = c4033iT;
        this.f25163o = c2559La0;
        this.f25164p = c3588eO;
        this.f25150b = kg;
        this.f25165q = c2591Lx;
        this.f25166r = hm;
    }

    public static final P4.d j(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.lang.String str, java.lang.String str2, final android.os.Bundle bundle) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25624m2)).booleanValue()) {
            bundle.putLong(com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_LOAD_HTML_START.e(), p174r3.v.c().a());
        }
        final com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        interfaceC2698Ot.M().D(new com.google.android.gms.internal.ads.InterfaceC2478Iu() { // from class: com.google.android.gms.internal.ads.rM
            @Override // com.google.android.gms.internal.ads.InterfaceC2478Iu
            public final void a(boolean z6, int i6, java.lang.String str3, java.lang.String str4) {
                com.google.android.gms.internal.ads.C4512mr c4512mr2 = c4512mr;
                if (z6) {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25624m2)).booleanValue()) {
                        bundle.putLong(com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_LOAD_HTML_END.e(), p174r3.v.c().a());
                    }
                    c4512mr2.c(null);
                    return;
                }
                c4512mr2.d(new java.lang.Exception("Ad Web View failed to load. Error code: " + i6 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        interfaceC2698Ot.d1(str, str2, null);
        return c4512mr;
    }

    final /* synthetic */ void c() {
        this.f25149a.e0();
    }

    final /* synthetic */ void d(java.lang.String str, java.lang.String str2) {
        this.f25154f.q(str, str2);
    }

    final /* synthetic */ void e() {
        this.f25151c.b();
    }

    final /* synthetic */ void f(android.view.View view) {
        this.f25158j.a();
    }

    final /* synthetic */ void g(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2, java.util.Map map) {
        this.f25157i.b(interfaceC2698Ot);
    }

    final /* synthetic */ boolean h(android.view.View view, android.view.MotionEvent motionEvent) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25436U9)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.f25166r.b(motionEvent);
        }
        this.f25158j.a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void i(final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, boolean z6, com.google.android.gms.internal.ads.C4166jj c4166jj, android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.T9 t9C;
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25624m2;
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            bundle.putLong(com.google.android.gms.internal.ads.MN.RENDERING_CONFIGURE_WEBVIEW_START.e(), p174r3.v.c().a());
        }
        interfaceC2698Ot.M().V(new p184s3.InterfaceC7076a() { // from class: com.google.android.gms.internal.ads.sM
            @Override // p184s3.InterfaceC7076a
            public final void e0() {
                this.f38730C.c();
            }
        }, this.f25152d, this.f25153e, new com.google.android.gms.internal.ads.InterfaceC5703xi() { // from class: com.google.android.gms.internal.ads.tM
            @Override // com.google.android.gms.internal.ads.InterfaceC5703xi
            public final void q(java.lang.String str, java.lang.String str2) {
                this.f38939C.d(str, str2);
            }
        }, new p204u3.InterfaceC7202d() { // from class: com.google.android.gms.internal.ads.uM
            @Override // p204u3.InterfaceC7202d
            public final void i() {
                this.f39149C.e();
            }
        }, z6, c4166jj, this.f25158j, new com.google.android.gms.internal.ads.C5893zM(this), this.f25159k, this.f25162n, this.f25163o, this.f25164p, null, this.f25150b, null, null, null, this.f25165q);
        interfaceC2698Ot.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.vM
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                this.f39386C.h(view, motionEvent);
                return false;
            }
        });
        interfaceC2698Ot.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.gms.internal.ads.wM
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f39586C.f(view);
            }
        });
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25319K2)).booleanValue() && (t9C = this.f25160l.c()) != null) {
            t9C.b(interfaceC2698Ot.N());
        }
        this.f25156h.F0(interfaceC2698Ot, this.f25155g);
        this.f25156h.F0(new com.google.android.gms.internal.ads.InterfaceC2633Nb() { // from class: com.google.android.gms.internal.ads.xM
            @Override // com.google.android.gms.internal.ads.InterfaceC2633Nb
            public final void L(com.google.android.gms.internal.ads.C2596Mb c2596Mb) {
                com.google.android.gms.internal.ads.InterfaceC2552Ku interfaceC2552KuM = interfaceC2698Ot.M();
                android.graphics.Rect rect = c2596Mb.f29794d;
                interfaceC2552KuM.t0(rect.left, rect.top, false);
            }
        }, this.f25155g);
        this.f25156h.q1(interfaceC2698Ot.N());
        interfaceC2698Ot.g1("/trackActiveViewUnit", new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.yM
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, java.util.Map map) {
                this.f40047a.g(interfaceC2698Ot, (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj, map);
            }
        });
        this.f25157i.c(interfaceC2698Ot);
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            bundle.putLong(com.google.android.gms.internal.ads.MN.RENDERING_CONFIGURE_WEBVIEW_END.e(), p174r3.v.c().a());
        }
    }
}
