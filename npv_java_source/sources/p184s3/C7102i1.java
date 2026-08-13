package p184s3;

/* JADX INFO: renamed from: s3.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7102i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC2801Rl f54263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p184s3.b2 f54264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f54265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p104k3.w f54266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final p184s3.AbstractC7150z f54267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p184s3.InterfaceC7076a f54268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p104k3.AbstractC6887d f54269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p104k3.h[] f54270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p114l3.c f54271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p184s3.V f54272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p104k3.x f54273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private java.lang.String f54274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final android.view.ViewGroup f54275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f54276n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f54277o;

    public C7102i1(android.view.ViewGroup viewGroup, int i6) {
        this(viewGroup, null, false, p184s3.b2.f54193a, null, i6);
    }

    C7102i1(android.view.ViewGroup viewGroup, android.util.AttributeSet attributeSet, boolean z6, p184s3.b2 b2Var, p184s3.V v6, int i6) {
        p184s3.c2 c2Var;
        this.f54263a = new com.google.android.gms.internal.ads.BinderC2801Rl();
        this.f54266d = new p104k3.w();
        this.f54267e = new p184s3.C7099h1(this);
        this.f54275m = viewGroup;
        this.f54264b = b2Var;
        this.f54272j = null;
        this.f54265c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f54276n = i6;
        if (attributeSet != null) {
            android.content.Context context = viewGroup.getContext();
            try {
                p184s3.C7079b c7079b = new p184s3.C7079b(context, attributeSet);
                this.f54270h = c7079b.b(z6);
                this.f54274l = c7079b.a();
                if (viewGroup.isInEditMode()) {
                    p224w3.g gVarB = p184s3.C7147y.b();
                    p104k3.h hVar = this.f54270h[0];
                    int i10 = this.f54276n;
                    if (hVar.equals(p104k3.h.f49475q)) {
                        c2Var = new p184s3.c2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        p184s3.c2 c2Var2 = new p184s3.c2(context, hVar);
                        c2Var2.f54207L = b(i10);
                        c2Var = c2Var2;
                    }
                    gVarB.o(viewGroup, c2Var, "Ads by Google");
                }
            } catch (java.lang.IllegalArgumentException e6) {
                p184s3.C7147y.b().n(viewGroup, new p184s3.c2(context, p104k3.h.f49467i), e6.getMessage(), e6.getMessage());
            }
        }
    }

    private static p184s3.c2 a(android.content.Context context, p104k3.h[] hVarArr, int i6) {
        for (p104k3.h hVar : hVarArr) {
            if (hVar.equals(p104k3.h.f49475q)) {
                return new p184s3.c2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        p184s3.c2 c2Var = new p184s3.c2(context, hVarArr);
        c2Var.f54207L = b(i6);
        return c2Var;
    }

    private static boolean b(int i6) {
        return i6 == 1;
    }

    public final p104k3.AbstractC6887d c() {
        return this.f54269g;
    }

    public final p104k3.h d() {
        p184s3.c2 c2VarI;
        try {
            p184s3.V v6 = this.f54272j;
            if (v6 != null && (c2VarI = v6.i()) != null) {
                return p104k3.z.c(c2VarI.f54202G, c2VarI.f54199D, c2VarI.f54198C);
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
        p104k3.h[] hVarArr = this.f54270h;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public final p104k3.o e() {
        return null;
    }

    public final p104k3.u f() {
        p184s3.U0 u0K = null;
        try {
            p184s3.V v6 = this.f54272j;
            if (v6 != null) {
                u0K = v6.k();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
        return p104k3.u.d(u0K);
    }

    public final p104k3.w h() {
        return this.f54266d;
    }

    public final p184s3.Y0 i() {
        p184s3.V v6 = this.f54272j;
        if (v6 != null) {
            try {
                return v6.l();
            } catch (android.os.RemoteException e6) {
                p224w3.p.i("#007 Could not call remote method.", e6);
            }
        }
        return null;
    }

    public final java.lang.String j() {
        p184s3.V v6;
        if (this.f54274l == null && (v6 = this.f54272j) != null) {
            try {
                this.f54274l = v6.t();
            } catch (android.os.RemoteException e6) {
                p224w3.p.i("#007 Could not call remote method.", e6);
            }
        }
        return this.f54274l;
    }

    public final void k() {
        try {
            p184s3.V v6 = this.f54272j;
            if (v6 != null) {
                v6.C();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    final /* synthetic */ void l(X3.a aVar) {
        this.f54275m.addView((android.view.View) X3.b.L0(aVar));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d6 A[Catch: RemoteException -> 0x00d4, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00d4, blocks: (B:28:0x00a3, B:30:0x00a9, B:32:0x00b7, B:34:0x00c9, B:37:0x00d6), top: B:53:0x00a3, outer: #0 }] */
    public final void m(p184s3.C7093f1 c7093f1) {
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (this.f54272j == null) {
                if (this.f54270h == null || this.f54274l == null) {
                    throw new java.lang.IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                android.content.Context context = this.f54275m.getContext();
                p184s3.c2 c2VarA = a(context, this.f54270h, this.f54276n);
                p184s3.V v6 = (p184s3.V) ("search_v2".equals(c2VarA.f54198C) ? new p184s3.C7115n(p184s3.C7147y.a(), context, c2VarA, this.f54274l).d(context, false) : new p184s3.C7109l(p184s3.C7147y.a(), context, c2VarA, this.f54274l, this.f54263a).d(context, false));
                this.f54272j = v6;
                v6.u3(new p184s3.P1(this.f54267e));
                p184s3.InterfaceC7076a interfaceC7076a = this.f54268f;
                if (interfaceC7076a != null) {
                    this.f54272j.V5(new p184s3.BinderC7138v(interfaceC7076a));
                }
                p114l3.c cVar = this.f54271i;
                if (cVar != null) {
                    this.f54272j.i2(new com.google.android.gms.internal.ads.BinderC3276bc(cVar));
                }
                if (this.f54273k != null) {
                    this.f54272j.j4(new p184s3.Q1(this.f54273k));
                }
                this.f54272j.l1(new p184s3.H1(null));
                this.f54272j.e6(this.f54277o);
                p184s3.V v10 = this.f54272j;
                if (v10 != null) {
                    try {
                        final X3.a aVarN = v10.n();
                        if (aVarN != null) {
                            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25767f.e()).booleanValue()) {
                                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue()) {
                                    p224w3.g.f56228b.post(new java.lang.Runnable() { // from class: s3.g1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f54250C.l(aVarN);
                                        }
                                    });
                                } else {
                                    this.f54275m.addView((android.view.View) X3.b.L0(aVarN));
                                }
                            } else {
                                this.f54275m.addView((android.view.View) X3.b.L0(aVarN));
                            }
                        }
                    } catch (android.os.RemoteException e6) {
                        p224w3.p.i("#007 Could not call remote method.", e6);
                    }
                }
            }
            if (c7093f1 != null) {
                c7093f1.o(jCurrentTimeMillis);
            }
            p184s3.V v11 = this.f54272j;
            if (v11 == null) {
                throw null;
            }
            v11.K3(this.f54264b.a(this.f54275m.getContext(), c7093f1));
        } catch (android.os.RemoteException e10) {
            p224w3.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void n() {
        try {
            p184s3.V v6 = this.f54272j;
            if (v6 != null) {
                v6.J();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    public final void o() {
        try {
            p184s3.V v6 = this.f54272j;
            if (v6 != null) {
                v6.Y();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    public final void p(p184s3.InterfaceC7076a interfaceC7076a) {
        try {
            this.f54268f = interfaceC7076a;
            p184s3.V v6 = this.f54272j;
            if (v6 != null) {
                v6.V5(interfaceC7076a != null ? new p184s3.BinderC7138v(interfaceC7076a) : null);
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    public final void q(p104k3.AbstractC6887d abstractC6887d) {
        this.f54269g = abstractC6887d;
        this.f54267e.r(abstractC6887d);
    }

    public final void r(p104k3.h... hVarArr) {
        if (this.f54270h != null) {
            throw new java.lang.IllegalStateException("The ad size can only be set once on AdView.");
        }
        s(hVarArr);
    }

    public final void s(p104k3.h... hVarArr) {
        this.f54270h = hVarArr;
        try {
            p184s3.V v6 = this.f54272j;
            if (v6 != null) {
                v6.T1(a(this.f54275m.getContext(), this.f54270h, this.f54276n));
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
        this.f54275m.requestLayout();
    }

    public final void t(java.lang.String str) {
        if (this.f54274l != null) {
            throw new java.lang.IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f54274l = str;
    }

    public final void u(p114l3.c cVar) {
        try {
            this.f54271i = cVar;
            p184s3.V v6 = this.f54272j;
            if (v6 != null) {
                v6.i2(cVar != null ? new com.google.android.gms.internal.ads.BinderC3276bc(cVar) : null);
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    public final void v(p104k3.o oVar) {
        try {
            p184s3.V v6 = this.f54272j;
            if (v6 != null) {
                v6.l1(new p184s3.H1(oVar));
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }
}
