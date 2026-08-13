package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3379cY extends p184s3.U {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p184s3.c2 f34511C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.content.Context f34512D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R50 f34513E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f34514F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p224w3.a f34515G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.UX f34516H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5203t60 f34517I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f34518J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f34519K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4345lH f34520L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f34521M = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25361O0)).booleanValue();

    public BinderC3379cY(android.content.Context context, p184s3.c2 c2Var, java.lang.String str, com.google.android.gms.internal.ads.R50 r50, com.google.android.gms.internal.ads.UX ux, com.google.android.gms.internal.ads.C5203t60 c5203t60, p224w3.a aVar, com.google.android.gms.internal.ads.Z9 z10, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f34511C = c2Var;
        this.f34514F = str;
        this.f34512D = context;
        this.f34513E = r50;
        this.f34516H = ux;
        this.f34517I = c5203t60;
        this.f34515G = aVar;
        this.f34518J = z10;
        this.f34519K = c3588eO;
    }

    private final synchronized boolean q6() {
        com.google.android.gms.internal.ads.C4345lH c4345lH = this.f34520L;
        return (c4345lH == null || c4345lH.i()) ? false : true;
    }

    @Override // p184s3.V
    public final synchronized void C() {
        Q3.AbstractC1477p.e("destroy must be called on the main UI thread.");
        com.google.android.gms.internal.ads.C4345lH c4345lH = this.f34520L;
        if (c4345lH != null) {
            c4345lH.d().q1(null);
        }
    }

    @Override // p184s3.V
    public final void F1(p184s3.InterfaceC7122p0 interfaceC7122p0) {
        this.f34516H.E(interfaceC7122p0);
    }

    @Override // p184s3.V
    public final synchronized void F2(com.google.android.gms.internal.ads.InterfaceC2970Wf interfaceC2970Wf) {
        Q3.AbstractC1477p.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f34513E.i(interfaceC2970Wf);
    }

    @Override // p184s3.V
    public final synchronized boolean H0() {
        return false;
    }

    @Override // p184s3.V
    public final void I5(com.google.android.gms.internal.ads.InterfaceC2525Kc interfaceC2525Kc) {
    }

    @Override // p184s3.V
    public final synchronized void J() {
        Q3.AbstractC1477p.e("pause must be called on the main UI thread.");
        com.google.android.gms.internal.ads.C4345lH c4345lH = this.f34520L;
        if (c4345lH != null) {
            c4345lH.d().r1(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // p184s3.V
    public final synchronized boolean K3(p184s3.X1 x6) {
        boolean z6;
        try {
            if (!x6.f()) {
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25770i.e()).booleanValue()) {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (this.f34515G.f56219E < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.cb)).intValue() || !z6) {
                    Q3.AbstractC1477p.e("loadAd must be called on the main UI thread.");
                }
            }
            p174r3.v.t();
            if (p214v3.E0.i(this.f34512D) && x6.f54170U == null) {
                p224w3.p.d("Failed to load the ad because app ID is missing.");
                com.google.android.gms.internal.ads.UX ux = this.f34516H;
                if (ux != null) {
                    ux.u0(com.google.android.gms.internal.ads.P70.d(4, null, null));
                }
            } else if (!q6()) {
                com.google.android.gms.internal.ads.L70.a(this.f34512D, x6.f54157H);
                this.f34520L = null;
                return this.f34513E.b(x6, this.f34514F, new com.google.android.gms.internal.ads.K50(this.f34511C), new com.google.android.gms.internal.ads.C3270bY(this));
            }
            return false;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // p184s3.V
    public final synchronized boolean P5() {
        return this.f34513E.a();
    }

    @Override // p184s3.V
    public final void T1(p184s3.c2 c2Var) {
    }

    @Override // p184s3.V
    public final void V0(p184s3.i2 i2Var) {
    }

    @Override // p184s3.V
    public final void V5(p184s3.E e6) {
    }

    @Override // p184s3.V
    public final void W0(java.lang.String str) {
    }

    @Override // p184s3.V
    public final void W2(com.google.android.gms.internal.ads.InterfaceC2947Vn interfaceC2947Vn) {
    }

    @Override // p184s3.V
    public final synchronized void X() {
        Q3.AbstractC1477p.e("showInterstitial must be called on the main UI thread.");
        if (this.f34520L == null) {
            p224w3.p.g("Interstitial can not be shown before loaded.");
            this.f34516H.p(com.google.android.gms.internal.ads.P70.d(9, null, null));
        } else {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25418T2)).booleanValue()) {
                this.f34518J.c().c(new java.lang.Throwable().getStackTrace());
            }
            this.f34520L.j(this.f34521M, null);
        }
    }

    @Override // p184s3.V
    public final void X1(com.google.android.gms.internal.ads.InterfaceC3055Yn interfaceC3055Yn, java.lang.String str) {
    }

    @Override // p184s3.V
    public final synchronized void Y() {
        Q3.AbstractC1477p.e("resume must be called on the main UI thread.");
        com.google.android.gms.internal.ads.C4345lH c4345lH = this.f34520L;
        if (c4345lH != null) {
            c4345lH.d().s1(null);
        }
    }

    @Override // p184s3.V
    public final void Y1(com.google.android.gms.internal.ads.InterfaceC4069ip interfaceC4069ip) {
        this.f34517I.z(interfaceC4069ip);
    }

    @Override // p184s3.V
    public final synchronized void Y4(boolean z6) {
        Q3.AbstractC1477p.e("setImmersiveMode must be called on the main UI thread.");
        this.f34521M = z6;
    }

    @Override // p184s3.V
    public final void e6(boolean z6) {
    }

    @Override // p184s3.V
    public final android.os.Bundle f() {
        Q3.AbstractC1477p.e("getAdMetadata must be called on the main UI thread.");
        return new android.os.Bundle();
    }

    @Override // p184s3.V
    public final synchronized boolean f0() {
        Q3.AbstractC1477p.e("isLoaded must be called on the main UI thread.");
        return q6();
    }

    @Override // p184s3.V
    public final void g3(p184s3.C7084c1 c7084c1) {
    }

    @Override // p184s3.V
    public final p184s3.H h() {
        return this.f34516H.g();
    }

    @Override // p184s3.V
    public final void h0() {
    }

    @Override // p184s3.V
    public final p184s3.c2 i() {
        return null;
    }

    @Override // p184s3.V
    public final void i2(p184s3.InterfaceC7101i0 interfaceC7101i0) {
        Q3.AbstractC1477p.e("setAppEventListener must be called on the main UI thread.");
        this.f34516H.C(interfaceC7101i0);
    }

    @Override // p184s3.V
    public final p184s3.InterfaceC7101i0 j() {
        return this.f34516H.i();
    }

    @Override // p184s3.V
    public final void j4(p184s3.Q1 q6) {
    }

    @Override // p184s3.V
    public final synchronized p184s3.U0 k() {
        com.google.android.gms.internal.ads.C4345lH c4345lH;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25235C6)).booleanValue() && (c4345lH = this.f34520L) != null) {
            return c4345lH.c();
        }
        return null;
    }

    @Override // p184s3.V
    public final p184s3.Y0 l() {
        return null;
    }

    @Override // p184s3.V
    public final void l1(p184s3.N0 n6) {
        Q3.AbstractC1477p.e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!n6.e()) {
                this.f34519K.e();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.c("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f34516H.z(n6);
    }

    @Override // p184s3.V
    public final synchronized void m6(X3.a aVar) {
        if (this.f34520L == null) {
            p224w3.p.g("Interstitial can not be shown before loaded.");
            this.f34516H.p(com.google.android.gms.internal.ads.P70.d(9, null, null));
            return;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25418T2)).booleanValue()) {
            this.f34518J.c().c(new java.lang.Throwable().getStackTrace());
        }
        this.f34520L.j(this.f34521M, (android.app.Activity) X3.b.L0(aVar));
    }

    @Override // p184s3.V
    public final X3.a n() {
        return null;
    }

    @Override // p184s3.V
    public final void o3(p184s3.X1 x6, p184s3.K k6) {
        this.f34516H.w(k6);
        K3(x6);
    }

    @Override // p184s3.V
    public final void r2(java.lang.String str) {
    }

    @Override // p184s3.V
    public final synchronized java.lang.String t() {
        return this.f34514F;
    }

    @Override // p184s3.V
    public final synchronized java.lang.String u() {
        com.google.android.gms.internal.ads.C4345lH c4345lH = this.f34520L;
        if (c4345lH == null || c4345lH.c() == null) {
            return null;
        }
        return c4345lH.c().i();
    }

    @Override // p184s3.V
    public final void u3(p184s3.H h6) {
        Q3.AbstractC1477p.e("setAdListener must be called on the main UI thread.");
        this.f34516H.k(h6);
    }

    @Override // p184s3.V
    public final void v3(p184s3.C7113m0 c7113m0) {
    }

    @Override // p184s3.V
    public final synchronized java.lang.String w() {
        com.google.android.gms.internal.ads.C4345lH c4345lH = this.f34520L;
        if (c4345lH == null || c4345lH.c() == null) {
            return null;
        }
        return c4345lH.c().i();
    }

    @Override // p184s3.V
    public final void x4(p184s3.InterfaceC7077a0 interfaceC7077a0) {
        Q3.AbstractC1477p.e("setAdMetadataListener must be called on the main UI thread.");
    }
}
