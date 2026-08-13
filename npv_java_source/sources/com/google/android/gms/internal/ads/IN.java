package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class IN implements com.google.android.gms.internal.ads.InterfaceC3573eF, p184s3.InterfaceC7076a, com.google.android.gms.internal.ads.ZC, com.google.android.gms.internal.ads.IC {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f28456C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.G70 f28457D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f28458E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3558e70 f28459F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f28460G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4033iT f28461H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.lang.String f28462I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.lang.Boolean f28463J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final boolean f28464K = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25268F6)).booleanValue();

    public IN(android.content.Context context, com.google.android.gms.internal.ads.G70 g70, com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C4033iT c4033iT, java.lang.String str) {
        this.f28456C = context;
        this.f28457D = g70;
        this.f28458E = c3588eO;
        this.f28459F = c3558e70;
        this.f28460G = r60;
        this.f28461H = c4033iT;
        this.f28462I = str;
    }

    private final com.google.android.gms.internal.ads.C3479dO a(java.lang.String str) {
        com.google.android.gms.internal.ads.C3339c70 c3339c70 = this.f28459F.f34899b;
        com.google.android.gms.internal.ads.C3479dO c3479dOA = this.f28458E.a();
        c3479dOA.d(c3339c70.f34448b);
        c3479dOA.c(this.f28460G);
        c3479dOA.b("action", str);
        c3479dOA.b("ad_format", this.f28462I.toUpperCase(java.util.Locale.ROOT));
        if (!this.f28460G.f31198t.isEmpty()) {
            c3479dOA.b("ancn", (java.lang.String) this.f28460G.f31198t.get(0));
        }
        if (this.f28460G.b()) {
            c3479dOA.b("device_connectivity", true != p174r3.v.s().a(this.f28456C) ? "offline" : "online");
            c3479dOA.b("event_timestamp", java.lang.String.valueOf(p174r3.v.c().a()));
            c3479dOA.b("offline_ad", "1");
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25345M6)).booleanValue()) {
            boolean z6 = B3.AbstractC0797c.f(this.f28459F.f34898a.f34012a) != 1;
            c3479dOA.b("scar", java.lang.String.valueOf(z6));
            if (z6) {
                p184s3.X1 x6 = this.f28459F.f34898a.f34012a.f37511d;
                c3479dOA.b("ragent", x6.f54167R);
                c3479dOA.b("rtype", B3.AbstractC0797c.b(B3.AbstractC0797c.c(x6)));
            }
        }
        return c3479dOA;
    }

    private final void c(com.google.android.gms.internal.ads.C3479dO c3479dO) {
        if (!this.f28460G.b()) {
            c3479dO.g();
            return;
        }
        this.f28461H.i(new com.google.android.gms.internal.ads.C4251kT(p174r3.v.c().a(), this.f28459F.f34899b.f34448b.f32114b, c3479dO.e(), 2));
    }

    private final boolean e() {
        java.lang.String strV;
        if (this.f28463J == null) {
            synchronized (this) {
                if (this.f28463J == null) {
                    java.lang.String str = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25220B1);
                    p174r3.v.t();
                    try {
                        strV = p214v3.E0.V(this.f28456C);
                    } catch (android.os.RemoteException unused) {
                        strV = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strV != null) {
                        try {
                            zMatches = java.util.regex.Pattern.matches(str, strV);
                        } catch (java.lang.RuntimeException e6) {
                            p174r3.v.s().x(e6, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f28463J = java.lang.Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f28463J.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.IC
    public final void F(com.google.android.gms.internal.ads.YH yh) {
        if (this.f28464K) {
            com.google.android.gms.internal.ads.C3479dO c3479dOA = a("ifts");
            c3479dOA.b("reason", "exception");
            if (!android.text.TextUtils.isEmpty(yh.getMessage())) {
                c3479dOA.b("msg", yh.getMessage());
            }
            c3479dOA.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.IC
    public final void b() {
        if (this.f28464K) {
            com.google.android.gms.internal.ads.C3479dO c3479dOA = a("ifts");
            c3479dOA.b("reason", "blocked");
            c3479dOA.g();
        }
    }

    @Override // p184s3.InterfaceC7076a
    public final void e0() {
        if (this.f28460G.b()) {
            c(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573eF
    public final void h() {
        if (e()) {
            a("adapter_shown").g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573eF
    public final void j() {
        if (e()) {
            a("adapter_impression").g();
        }
    }

    @Override // com.google.android.gms.internal.ads.IC
    public final void p(p184s3.W0 w6) {
        p184s3.W0 w10;
        if (this.f28464K) {
            com.google.android.gms.internal.ads.C3479dO c3479dOA = a("ifts");
            c3479dOA.b("reason", "adapter");
            int i6 = w6.f54145C;
            java.lang.String str = w6.f54146D;
            if (w6.f54147E.equals("com.google.android.gms.ads") && (w10 = w6.f54148F) != null && !w10.f54147E.equals("com.google.android.gms.ads")) {
                p184s3.W0 w11 = w6.f54148F;
                i6 = w11.f54145C;
                str = w11.f54146D;
            }
            if (i6 >= 0) {
                c3479dOA.b("arec", java.lang.String.valueOf(i6));
            }
            java.lang.String strA = this.f28457D.a(str);
            if (strA != null) {
                c3479dOA.b("areec", strA);
            }
            c3479dOA.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void t() {
        if (e() || this.f28460G.b()) {
            c(a("impression"));
        }
    }
}
