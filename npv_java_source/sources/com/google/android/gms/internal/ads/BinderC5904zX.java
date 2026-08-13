package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5904zX extends p184s3.U implements com.google.android.gms.internal.ads.TD {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f40319C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z40 f40320D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f40321E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.UX f40322F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p184s3.c2 f40323G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4326l70 f40324H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p224w3.a f40325I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f40326J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC2777Qy f40327K;

    public BinderC5904zX(android.content.Context context, p184s3.c2 c2Var, java.lang.String str, com.google.android.gms.internal.ads.Z40 z40, com.google.android.gms.internal.ads.UX ux, p224w3.a aVar, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f40319C = context;
        this.f40320D = z40;
        this.f40323G = c2Var;
        this.f40321E = str;
        this.f40322F = ux;
        this.f40324H = z40.f();
        this.f40325I = aVar;
        this.f40326J = c3588eO;
        z40.o(this);
    }

    private final synchronized void q6(p184s3.c2 c2Var) {
        this.f40324H.O(c2Var);
        this.f40324H.U(this.f40323G.f54211P);
    }

    private final synchronized boolean r6(p184s3.X1 x6) {
        try {
            if (s6()) {
                Q3.AbstractC1477p.e("loadAd must be called on the main UI thread.");
            }
            p174r3.v.t();
            if (!p214v3.E0.i(this.f40319C) || x6.f54170U != null) {
                com.google.android.gms.internal.ads.L70.a(this.f40319C, x6.f54157H);
                return this.f40320D.b(x6, this.f40321E, null, new com.google.android.gms.internal.ads.C5794yX(this));
            }
            p224w3.p.d("Failed to load the ad because app ID is missing.");
            com.google.android.gms.internal.ads.UX ux = this.f40322F;
            if (ux != null) {
                ux.u0(com.google.android.gms.internal.ads.P70.d(4, null, null));
            }
            return false;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    private final boolean s6() {
        boolean z6;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25767f.e()).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue()) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        return this.f40325I.f56219E < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.cb)).intValue() || !z6;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // p184s3.V
    public final synchronized void C() {
        try {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25766e.e()).booleanValue()) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ya)).booleanValue()) {
                    if (this.f40325I.f56219E < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.db)).intValue()) {
                        Q3.AbstractC1477p.e("destroy must be called on the main UI thread.");
                    }
                } else {
                    Q3.AbstractC1477p.e("destroy must be called on the main UI thread.");
                }
            } else {
                Q3.AbstractC1477p.e("destroy must be called on the main UI thread.");
            }
            com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f40327K;
            if (abstractC2777Qy != null) {
                abstractC2777Qy.a();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // p184s3.V
    public final void F1(p184s3.InterfaceC7122p0 interfaceC7122p0) {
    }

    @Override // p184s3.V
    public final synchronized void F2(com.google.android.gms.internal.ads.InterfaceC2970Wf interfaceC2970Wf) {
        Q3.AbstractC1477p.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f40320D.p(interfaceC2970Wf);
    }

    @Override // p184s3.V
    public final synchronized boolean H0() {
        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f40327K;
        return abstractC2777Qy != null && abstractC2777Qy.h();
    }

    @Override // p184s3.V
    public final void I5(com.google.android.gms.internal.ads.InterfaceC2525Kc interfaceC2525Kc) {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // p184s3.V
    public final synchronized void J() {
        try {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25768g.e()).booleanValue()) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Za)).booleanValue()) {
                    if (this.f40325I.f56219E < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.db)).intValue()) {
                        Q3.AbstractC1477p.e("pause must be called on the main UI thread.");
                    }
                } else {
                    Q3.AbstractC1477p.e("pause must be called on the main UI thread.");
                }
            } else {
                Q3.AbstractC1477p.e("pause must be called on the main UI thread.");
            }
            com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f40327K;
            if (abstractC2777Qy != null) {
                abstractC2777Qy.d().r1(null);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // p184s3.V
    public final synchronized boolean K3(p184s3.X1 x6) {
        q6(this.f40323G);
        return r6(x6);
    }

    @Override // p184s3.V
    public final synchronized boolean P5() {
        return this.f40320D.a();
    }

    @Override // p184s3.V
    public final synchronized void T1(p184s3.c2 c2Var) {
        Q3.AbstractC1477p.e("setAdSize must be called on the main UI thread.");
        this.f40324H.O(c2Var);
        this.f40323G = c2Var;
        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f40327K;
        if (abstractC2777Qy != null) {
            abstractC2777Qy.p(this.f40320D.c(), c2Var);
        }
    }

    @Override // p184s3.V
    public final void V0(p184s3.i2 i2Var) {
    }

    @Override // p184s3.V
    public final void V5(p184s3.E e6) {
        if (s6()) {
            Q3.AbstractC1477p.e("setAdListener must be called on the main UI thread.");
        }
        this.f40320D.n(e6);
    }

    @Override // p184s3.V
    public final void W0(java.lang.String str) {
    }

    @Override // p184s3.V
    public final void W2(com.google.android.gms.internal.ads.InterfaceC2947Vn interfaceC2947Vn) {
    }

    @Override // p184s3.V
    public final void X() {
    }

    @Override // p184s3.V
    public final void X1(com.google.android.gms.internal.ads.InterfaceC3055Yn interfaceC3055Yn, java.lang.String str) {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // p184s3.V
    public final synchronized void Y() {
        try {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25769h.e()).booleanValue()) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Xa)).booleanValue()) {
                    if (this.f40325I.f56219E < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.db)).intValue()) {
                        Q3.AbstractC1477p.e("resume must be called on the main UI thread.");
                    }
                } else {
                    Q3.AbstractC1477p.e("resume must be called on the main UI thread.");
                }
            } else {
                Q3.AbstractC1477p.e("resume must be called on the main UI thread.");
            }
            com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f40327K;
            if (abstractC2777Qy != null) {
                abstractC2777Qy.d().s1(null);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // p184s3.V
    public final void Y1(com.google.android.gms.internal.ads.InterfaceC4069ip interfaceC4069ip) {
    }

    @Override // p184s3.V
    public final void Y4(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.TD
    public final synchronized void a() {
        try {
            if (!this.f40320D.s()) {
                this.f40320D.l();
                return;
            }
            p184s3.c2 c2VarD = this.f40324H.D();
            com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f40327K;
            if (abstractC2777Qy != null && abstractC2777Qy.n() != null && this.f40324H.t()) {
                c2VarD = com.google.android.gms.internal.ads.AbstractC5205t70.a(this.f40319C, java.util.Collections.singletonList(this.f40327K.n()));
            }
            q6(c2VarD);
            this.f40324H.T(true);
            try {
                r6(this.f40324H.B());
            } catch (android.os.RemoteException unused) {
                p224w3.p.g("Failed to refresh the banner ad.");
            }
            this.f40324H.T(false);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.TD
    public final synchronized void b() {
        if (this.f40320D.s()) {
            this.f40320D.q();
        } else {
            this.f40320D.m();
        }
    }

    @Override // p184s3.V
    public final synchronized void e6(boolean z6) {
        try {
            if (s6()) {
                Q3.AbstractC1477p.e("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f40324H.b(z6);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // p184s3.V
    public final android.os.Bundle f() {
        Q3.AbstractC1477p.e("getAdMetadata must be called on the main UI thread.");
        return new android.os.Bundle();
    }

    @Override // p184s3.V
    public final boolean f0() {
        return false;
    }

    @Override // p184s3.V
    public final void g3(p184s3.C7084c1 c7084c1) {
    }

    @Override // p184s3.V
    public final p184s3.H h() {
        return this.f40322F.g();
    }

    @Override // p184s3.V
    public final synchronized void h0() {
        Q3.AbstractC1477p.e("recordManualImpression must be called on the main UI thread.");
        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f40327K;
        if (abstractC2777Qy != null) {
            abstractC2777Qy.o();
        }
    }

    @Override // p184s3.V
    public final synchronized p184s3.c2 i() {
        Q3.AbstractC1477p.e("getAdSize must be called on the main UI thread.");
        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f40327K;
        if (abstractC2777Qy != null) {
            return com.google.android.gms.internal.ads.AbstractC5205t70.a(this.f40319C, java.util.Collections.singletonList(abstractC2777Qy.m()));
        }
        return this.f40324H.D();
    }

    @Override // p184s3.V
    public final void i2(p184s3.InterfaceC7101i0 interfaceC7101i0) {
        if (s6()) {
            Q3.AbstractC1477p.e("setAppEventListener must be called on the main UI thread.");
        }
        this.f40322F.C(interfaceC7101i0);
    }

    @Override // p184s3.V
    public final p184s3.InterfaceC7101i0 j() {
        return this.f40322F.i();
    }

    @Override // p184s3.V
    public final synchronized void j4(p184s3.Q1 q6) {
        try {
            if (s6()) {
                Q3.AbstractC1477p.e("setVideoOptions must be called on the main UI thread.");
            }
            this.f40324H.i(q6);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // p184s3.V
    public final synchronized p184s3.U0 k() {
        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25235C6)).booleanValue() && (abstractC2777Qy = this.f40327K) != null) {
            return abstractC2777Qy.c();
        }
        return null;
    }

    @Override // p184s3.V
    public final synchronized p184s3.Y0 l() {
        Q3.AbstractC1477p.e("getVideoController must be called from the main thread.");
        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f40327K;
        if (abstractC2777Qy == null) {
            return null;
        }
        return abstractC2777Qy.l();
    }

    @Override // p184s3.V
    public final void l1(p184s3.N0 n6) {
        if (s6()) {
            Q3.AbstractC1477p.e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!n6.e()) {
                this.f40326J.e();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.c("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f40322F.z(n6);
    }

    @Override // p184s3.V
    public final void m6(X3.a aVar) {
    }

    @Override // p184s3.V
    public final X3.a n() {
        if (s6()) {
            Q3.AbstractC1477p.e("getAdFrame must be called on the main UI thread.");
        }
        return X3.b.c2(this.f40320D.c());
    }

    @Override // p184s3.V
    public final void o3(p184s3.X1 x6, p184s3.K k6) {
    }

    @Override // p184s3.V
    public final void r2(java.lang.String str) {
    }

    @Override // p184s3.V
    public final synchronized java.lang.String t() {
        return this.f40321E;
    }

    @Override // p184s3.V
    public final synchronized java.lang.String u() {
        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f40327K;
        if (abstractC2777Qy == null || abstractC2777Qy.c() == null) {
            return null;
        }
        return abstractC2777Qy.c().i();
    }

    @Override // p184s3.V
    public final void u3(p184s3.H h6) {
        if (s6()) {
            Q3.AbstractC1477p.e("setAdListener must be called on the main UI thread.");
        }
        this.f40322F.k(h6);
    }

    @Override // p184s3.V
    public final synchronized void v3(p184s3.C7113m0 c7113m0) {
        Q3.AbstractC1477p.e("setCorrelationIdProvider must be called on the main UI thread");
        this.f40324H.v(c7113m0);
    }

    @Override // p184s3.V
    public final synchronized java.lang.String w() {
        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f40327K;
        if (abstractC2777Qy == null || abstractC2777Qy.c() == null) {
            return null;
        }
        return abstractC2777Qy.c().i();
    }

    @Override // p184s3.V
    public final void x4(p184s3.InterfaceC7077a0 interfaceC7077a0) {
        Q3.AbstractC1477p.e("setAdMetadataListener must be called on the main UI thread.");
    }
}
