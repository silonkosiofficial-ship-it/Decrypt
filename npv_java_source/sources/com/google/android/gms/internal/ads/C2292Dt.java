package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2292Dt extends com.google.android.gms.internal.ads.AbstractC2549Kr {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3856gs f26779E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2329Et f26780F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.net.Uri f26781G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2512Jr f26782H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f26783I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f26784J;

    public C2292Dt(android.content.Context context, com.google.android.gms.internal.ads.C3856gs c3856gs) {
        super(context);
        this.f26784J = 1;
        this.f26783I = false;
        this.f26779E = c3856gs;
        c3856gs.a(this);
    }

    private final boolean H() {
        int i6 = this.f26784J;
        return (i6 == 1 || i6 == 2 || this.f26780F == null) ? false : true;
    }

    private final void I(int i6) {
        if (i6 == 4) {
            this.f26779E.c();
            this.f29015D.b();
        } else if (this.f26784J == 4) {
            this.f26779E.e();
            this.f29015D.c();
        }
        this.f26784J = i6;
    }

    final /* synthetic */ void E() {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f26782H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.f();
        }
    }

    final /* synthetic */ void F() {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f26782H;
        if (interfaceC2512Jr != null) {
            if (!this.f26783I) {
                interfaceC2512Jr.i();
                this.f26783I = true;
            }
            this.f26782H.d();
        }
    }

    final /* synthetic */ void G() {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f26782H;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int e() {
        return H() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int f() {
        return H() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int g() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final long i() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final long j() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final long k() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final java.lang.String l() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void m() {
        p214v3.AbstractC7265q0.k("AdImmersivePlayerView pause");
        if (H() && this.f26780F.d()) {
            this.f26780F.a();
            I(5);
            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Ct
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26293C.E();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr, com.google.android.gms.internal.ads.InterfaceC4075is
    public final void n() {
        if (this.f26780F != null) {
            this.f29015D.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void o() {
        p214v3.AbstractC7265q0.k("AdImmersivePlayerView play");
        if (H()) {
            this.f26780F.b();
            I(4);
            this.f29014C.b();
            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Bt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26038C.F();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void p(int i6) {
        p214v3.AbstractC7265q0.k("AdImmersivePlayerView seek " + i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void q(com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr) {
        this.f26782H = interfaceC2512Jr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void r(java.lang.String str) {
        if (str != null) {
            android.net.Uri uri = android.net.Uri.parse(str);
            this.f26781G = uri;
            this.f26780F = new com.google.android.gms.internal.ads.C2329Et(uri.toString());
            I(3);
            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.At
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25807C.G();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void s() {
        p214v3.AbstractC7265q0.k("AdImmersivePlayerView stop");
        com.google.android.gms.internal.ads.C2329Et c2329Et = this.f26780F;
        if (c2329Et != null) {
            c2329Et.c();
            this.f26780F = null;
            I(1);
        }
        this.f26779E.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void t(float f6, float f10) {
    }

    @Override // android.view.View
    public final java.lang.String toString() {
        return com.google.android.gms.internal.ads.C2292Dt.class.getName() + "@" + java.lang.Integer.toHexString(hashCode());
    }
}
