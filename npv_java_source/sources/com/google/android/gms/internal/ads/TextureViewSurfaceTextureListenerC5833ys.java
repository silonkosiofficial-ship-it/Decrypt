package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class TextureViewSurfaceTextureListenerC5833ys extends com.google.android.gms.internal.ads.AbstractC2549Kr implements android.view.TextureView.SurfaceTextureListener, com.google.android.gms.internal.ads.InterfaceC2951Vr {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3746fs f40147E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3856gs f40148F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3636es f40149G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2512Jr f40150H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private android.view.Surface f40151I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC2987Wr f40152J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.lang.String f40153K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.lang.String[] f40154L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f40155M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f40156N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3526ds f40157O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final boolean f40158P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f40159Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f40160R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f40161S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f40162T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f40163U;

    public TextureViewSurfaceTextureListenerC5833ys(android.content.Context context, com.google.android.gms.internal.ads.C3856gs c3856gs, com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs, boolean z6, boolean z10, com.google.android.gms.internal.ads.C3636es c3636es) {
        super(context);
        this.f40156N = 1;
        this.f40147E = interfaceC3746fs;
        this.f40148F = c3856gs;
        this.f40158P = z6;
        this.f40149G = c3636es;
        setSurfaceTextureListener(this);
        c3856gs.a(this);
    }

    private static java.lang.String T(java.lang.String str, java.lang.Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void U() {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null) {
            abstractC2987Wr.H(true);
        }
    }

    private final void V() {
        if (this.f40159Q) {
            return;
        }
        this.f40159Q = true;
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.xs
            @Override // java.lang.Runnable
            public final void run() {
                this.f39935C.I();
            }
        });
        n();
        this.f40148F.b();
        if (this.f40160R) {
            o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[LOOP:0: B:36:0x00a3->B:38:0x00a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2 A[EDGE_INSN: B:46:0x00b2->B:39:0x00b2 BREAK  A[LOOP:0: B:36:0x00a3->B:38:0x00a8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    private final void W(boolean z6, java.lang.Integer num) {
        android.net.Uri[] uriArr;
        int i6;
        java.lang.String[] strArr;
        int iP;
        com.google.android.gms.internal.ads.AbstractC2880Ts abstractC2880TsV0;
        java.lang.String strConcat;
        java.lang.String strF;
        java.nio.ByteBuffer byteBufferW;
        boolean zC;
        java.lang.String strU;
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null && !z6) {
            abstractC2987Wr.G(num);
            return;
        }
        if (this.f40153K == null || this.f40151I == null) {
            return;
        }
        if (!z6) {
            if (this.f40153K.startsWith("cache:")) {
                abstractC2880TsV0 = this.f40147E.v0(this.f40153K);
                if (abstractC2880TsV0 instanceof com.google.android.gms.internal.ads.C3419ct) {
                    com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987WrT = ((com.google.android.gms.internal.ads.C3419ct) abstractC2880TsV0).t();
                    this.f40152J = abstractC2987WrT;
                    abstractC2987WrT.G(num);
                    if (!this.f40152J.M()) {
                        strConcat = "Precached video player has been released.";
                    }
                } else if (abstractC2880TsV0 instanceof com.google.android.gms.internal.ads.C3096Zs) {
                    com.google.android.gms.internal.ads.C3096Zs c3096Zs = (com.google.android.gms.internal.ads.C3096Zs) abstractC2880TsV0;
                    strF = F();
                    byteBufferW = c3096Zs.w();
                    zC = c3096Zs.C();
                    strU = c3096Zs.u();
                    if (strU == null) {
                        strConcat = "Stream cache URL is null.";
                    } else {
                        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987WrE = E(num);
                        this.f40152J = abstractC2987WrE;
                        abstractC2987WrE.x(new android.net.Uri[]{android.net.Uri.parse(strU)}, strF, byteBufferW, zC);
                    }
                } else {
                    strConcat = "Stream cache miss: ".concat(java.lang.String.valueOf(this.f40153K));
                }
            } else {
                this.f40152J = E(num);
                java.lang.String strF2 = F();
                uriArr = new android.net.Uri[this.f40154L.length];
                i6 = 0;
                while (true) {
                    strArr = this.f40154L;
                    if (i6 < strArr.length) {
                        break;
                    }
                    uriArr[i6] = android.net.Uri.parse(strArr[i6]);
                    i6++;
                }
                this.f40152J.w(uriArr, strF2);
            }
            this.f40152J.C(this);
            Z(this.f40151I, false);
            if (this.f40152J.M()) {
                iP = this.f40152J.P();
                this.f40156N = iP;
                if (iP == 3) {
                    V();
                    return;
                }
                return;
            }
            return;
        }
        if (d0()) {
            abstractC2987Wr.L();
            Y();
            if (this.f40153K.startsWith("cache:")) {
                abstractC2880TsV0 = this.f40147E.v0(this.f40153K);
                if (abstractC2880TsV0 instanceof com.google.android.gms.internal.ads.C3419ct) {
                    com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987WrT2 = ((com.google.android.gms.internal.ads.C3419ct) abstractC2880TsV0).t();
                    this.f40152J = abstractC2987WrT2;
                    abstractC2987WrT2.G(num);
                    if (!this.f40152J.M()) {
                        strConcat = "Precached video player has been released.";
                    }
                } else if (abstractC2880TsV0 instanceof com.google.android.gms.internal.ads.C3096Zs) {
                    com.google.android.gms.internal.ads.C3096Zs c3096Zs2 = (com.google.android.gms.internal.ads.C3096Zs) abstractC2880TsV0;
                    strF = F();
                    byteBufferW = c3096Zs2.w();
                    zC = c3096Zs2.C();
                    strU = c3096Zs2.u();
                    if (strU == null) {
                        strConcat = "Stream cache URL is null.";
                    } else {
                        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987WrE2 = E(num);
                        this.f40152J = abstractC2987WrE2;
                        abstractC2987WrE2.x(new android.net.Uri[]{android.net.Uri.parse(strU)}, strF, byteBufferW, zC);
                    }
                } else {
                    strConcat = "Stream cache miss: ".concat(java.lang.String.valueOf(this.f40153K));
                }
            } else {
                this.f40152J = E(num);
                java.lang.String strF3 = F();
                uriArr = new android.net.Uri[this.f40154L.length];
                i6 = 0;
                while (true) {
                    strArr = this.f40154L;
                    if (i6 < strArr.length) {
                        break;
                        break;
                    } else {
                        uriArr[i6] = android.net.Uri.parse(strArr[i6]);
                        i6++;
                    }
                }
                this.f40152J.w(uriArr, strF3);
            }
            this.f40152J.C(this);
            Z(this.f40151I, false);
            if (this.f40152J.M()) {
                iP = this.f40152J.P();
                this.f40156N = iP;
                if (iP == 3) {
                    V();
                    return;
                }
                return;
            }
            return;
        }
        strConcat = "No valid ExoPlayerAdapter exists when switch source.";
        p224w3.p.g(strConcat);
    }

    private final void X() {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null) {
            abstractC2987Wr.H(false);
        }
    }

    private final void Y() {
        if (this.f40152J != null) {
            Z(null, true);
            com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
            if (abstractC2987Wr != null) {
                abstractC2987Wr.C(null);
                this.f40152J.y();
                this.f40152J = null;
            }
            this.f40156N = 1;
            this.f40155M = false;
            this.f40159Q = false;
            this.f40160R = false;
        }
    }

    private final void Z(android.view.Surface surface, boolean z6) {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr == null) {
            p224w3.p.g("Trying to set surface before player is initialized.");
            return;
        }
        try {
            abstractC2987Wr.J(surface, z6);
        } catch (java.io.IOException e6) {
            p224w3.p.h("", e6);
        }
    }

    private final void a0() {
        b0(this.f40161S, this.f40162T);
    }

    private final void b0(int i6, int i10) {
        float f6 = i10 > 0 ? i6 / i10 : 1.0f;
        if (this.f40163U != f6) {
            this.f40163U = f6;
            requestLayout();
        }
    }

    private final boolean c0() {
        return d0() && this.f40156N != 1;
    }

    private final boolean d0() {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        return (abstractC2987Wr == null || !abstractC2987Wr.M() || this.f40155M) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951Vr
    public final void A(final boolean z6, final long j6) {
        if (this.f40147E != null) {
            com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.rs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38566C.J(z6, j6);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951Vr
    public final void B(java.lang.String str, java.lang.Exception exc) {
        final java.lang.String strT = T(str, exc);
        p224w3.p.g("ExoPlayerAdapter error: ".concat(strT));
        this.f40155M = true;
        if (this.f40149G.f35073a) {
            X();
        }
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.vs
            @Override // java.lang.Runnable
            public final void run() {
                this.f39470C.G(strT);
            }
        });
        p174r3.v.s().w(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void C(int i6) {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null) {
            abstractC2987Wr.B(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void D(int i6) {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null) {
            abstractC2987Wr.D(i6);
        }
    }

    final com.google.android.gms.internal.ads.AbstractC2987Wr E(java.lang.Integer num) {
        com.google.android.gms.internal.ads.C3636es c3636es = this.f40149G;
        com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = this.f40147E;
        com.google.android.gms.internal.ads.C5615wt c5615wt = new com.google.android.gms.internal.ads.C5615wt(interfaceC3746fs.getContext(), c3636es, interfaceC3746fs, num);
        p224w3.p.f("ExoPlayerAdapter initialized.");
        return c5615wt;
    }

    final java.lang.String F() {
        com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = this.f40147E;
        return p174r3.v.t().H(interfaceC3746fs.getContext(), interfaceC3746fs.n().f56217C);
    }

    final /* synthetic */ void G(java.lang.String str) {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f40150H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.q("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void H() {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f40150H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.a();
        }
    }

    final /* synthetic */ void I() {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f40150H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.e();
        }
    }

    final /* synthetic */ void J(boolean z6, long j6) {
        this.f40147E.F0(z6, j6);
    }

    final /* synthetic */ void K(java.lang.String str) {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f40150H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.E0("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void L() {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f40150H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.i();
        }
    }

    final /* synthetic */ void M() {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f40150H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.g();
        }
    }

    final /* synthetic */ void N() {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f40150H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.h();
        }
    }

    final /* synthetic */ void O(int i6, int i10) {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f40150H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.F0(i6, i10);
        }
    }

    final /* synthetic */ void P() {
        float fA = this.f29015D.a();
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr == null) {
            p224w3.p.g("Trying to set volume before player is initialized.");
            return;
        }
        try {
            abstractC2987Wr.K(fA, false);
        } catch (java.io.IOException e6) {
            p224w3.p.h("", e6);
        }
    }

    final /* synthetic */ void Q(int i6) {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f40150H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.onWindowVisibilityChanged(i6);
        }
    }

    final /* synthetic */ void R() {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f40150H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.f();
        }
    }

    final /* synthetic */ void S() {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f40150H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void a(int i6) {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null) {
            abstractC2987Wr.E(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void b(int i6) {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null) {
            abstractC2987Wr.I(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void c(java.lang.String str, java.lang.String[] strArr, java.lang.Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f40154L = new java.lang.String[]{str};
        } else {
            this.f40154L = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
        }
        java.lang.String str2 = this.f40153K;
        boolean z6 = false;
        if (this.f40149G.f35083k && str2 != null && !str.equals(str2) && this.f40156N == 4) {
            z6 = true;
        }
        this.f40153K = str;
        W(z6, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int d() {
        if (c0()) {
            return (int) this.f40152J.U();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int e() {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null) {
            return abstractC2987Wr.N();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int f() {
        if (c0()) {
            return (int) this.f40152J.V();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int g() {
        return this.f40162T;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int h() {
        return this.f40161S;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final long i() {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null) {
            return abstractC2987Wr.T();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final long j() {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null) {
            return abstractC2987Wr.r();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final long k() {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null) {
            return abstractC2987Wr.s();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final java.lang.String l() {
        return "ExoPlayer/2".concat(true != this.f40158P ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void m() {
        if (c0()) {
            if (this.f40149G.f35073a) {
                X();
            }
            this.f40152J.F(false);
            this.f40148F.e();
            this.f29015D.c();
            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ts
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39042C.R();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr, com.google.android.gms.internal.ads.InterfaceC4075is
    public final void n() {
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ms
            @Override // java.lang.Runnable
            public final void run() {
                this.f37425C.P();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void o() {
        if (!c0()) {
            this.f40160R = true;
            return;
        }
        if (this.f40149G.f35073a) {
            U();
        }
        this.f40152J.F(true);
        this.f40148F.c();
        this.f29015D.b();
        this.f29014C.b();
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ls
            @Override // java.lang.Runnable
            public final void run() {
                this.f37246C.S();
            }
        });
    }

    @Override // android.view.View
    protected final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f6 = this.f40163U;
        if (f6 != 0.0f && this.f40157O == null) {
            float f10 = measuredWidth;
            float f11 = f10 / measuredHeight;
            if (f6 > f11) {
                measuredHeight = (int) (f10 / f6);
            }
            if (f6 < f11) {
                measuredWidth = (int) (measuredHeight * f6);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        com.google.android.gms.internal.ads.C3526ds c3526ds = this.f40157O;
        if (c3526ds != null) {
            c3526ds.c(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i6, int i10) {
        if (this.f40158P) {
            com.google.android.gms.internal.ads.C3526ds c3526ds = new com.google.android.gms.internal.ads.C3526ds(getContext());
            this.f40157O = c3526ds;
            c3526ds.d(surfaceTexture, i6, i10);
            this.f40157O.start();
            android.graphics.SurfaceTexture surfaceTextureB = this.f40157O.b();
            if (surfaceTextureB != null) {
                surfaceTexture = surfaceTextureB;
            } else {
                this.f40157O.e();
                this.f40157O = null;
            }
        }
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        this.f40151I = surface;
        if (this.f40152J == null) {
            W(false, null);
        } else {
            Z(surface, true);
            if (!this.f40149G.f35073a) {
                U();
            }
        }
        if (this.f40161S == 0 || this.f40162T == 0) {
            b0(i6, i10);
        } else {
            a0();
        }
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.us
            @Override // java.lang.Runnable
            public final void run() {
                this.f39291C.M();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        m();
        com.google.android.gms.internal.ads.C3526ds c3526ds = this.f40157O;
        if (c3526ds != null) {
            c3526ds.e();
            this.f40157O = null;
        }
        if (this.f40152J != null) {
            X();
            android.view.Surface surface = this.f40151I;
            if (surface != null) {
                surface.release();
            }
            this.f40151I = null;
            Z(null, true);
        }
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.qs
            @Override // java.lang.Runnable
            public final void run() {
                this.f38339C.N();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, final int i6, final int i10) {
        com.google.android.gms.internal.ads.C3526ds c3526ds = this.f40157O;
        if (c3526ds != null) {
            c3526ds.c(i6, i10);
        }
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ps
            @Override // java.lang.Runnable
            public final void run() {
                this.f38092C.O(i6, i10);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.f40148F.f(this);
        this.f29014C.a(surfaceTexture, this.f40150H);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i6) {
        p214v3.AbstractC7265q0.k("AdExoPlayerView3 window visibility changed to " + i6);
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.os
            @Override // java.lang.Runnable
            public final void run() {
                this.f37879C.Q(i6);
            }
        });
        super.onWindowVisibilityChanged(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void p(int i6) {
        if (c0()) {
            this.f40152J.z(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void q(com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr) {
        this.f40150H = interfaceC2512Jr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void r(java.lang.String str) {
        if (str != null) {
            c(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void s() {
        if (d0()) {
            this.f40152J.L();
            Y();
        }
        this.f40148F.e();
        this.f29015D.c();
        this.f40148F.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void t(float f6, float f10) {
        com.google.android.gms.internal.ads.C3526ds c3526ds = this.f40157O;
        if (c3526ds != null) {
            c3526ds.f(f6, f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final java.lang.Integer u() {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null) {
            return abstractC2987Wr.t();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951Vr
    public final void v() {
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ks
            @Override // java.lang.Runnable
            public final void run() {
                this.f37022C.L();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void w(int i6) {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f40152J;
        if (abstractC2987Wr != null) {
            abstractC2987Wr.A(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951Vr
    public final void x(int i6, int i10) {
        this.f40161S = i6;
        this.f40162T = i10;
        a0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951Vr
    public final void y(int i6) {
        if (this.f40156N != i6) {
            this.f40156N = i6;
            if (i6 == 3) {
                V();
                return;
            }
            if (i6 != 4) {
                return;
            }
            if (this.f40149G.f35073a) {
                X();
            }
            this.f40148F.e();
            this.f29015D.c();
            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ws
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39691C.H();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951Vr
    public final void z(java.lang.String str, java.lang.Exception exc) {
        final java.lang.String strT = T("onLoadException", exc);
        p224w3.p.g("ExoPlayerAdapter exception: ".concat(strT));
        p174r3.v.s().w(exc, "AdExoPlayerView.onException");
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ss
            @Override // java.lang.Runnable
            public final void run() {
                this.f38808C.K(strT);
            }
        });
    }
}
