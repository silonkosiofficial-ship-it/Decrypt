package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5354uX extends p184s3.U {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f39168C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p184s3.H f39169D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f39170E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2777Qy f39171F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final android.view.ViewGroup f39172G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f39173H;

    public BinderC5354uX(android.content.Context context, p184s3.H h6, com.google.android.gms.internal.ads.C4546n70 c4546n70, com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f39168C = context;
        this.f39169D = h6;
        this.f39170E = c4546n70;
        this.f39171F = abstractC2777Qy;
        this.f39173H = c3588eO;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.removeAllViews();
        android.view.View viewK = abstractC2777Qy.k();
        p174r3.v.t();
        frameLayout.addView(viewK, new android.view.ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(i().f54200E);
        frameLayout.setMinimumWidth(i().f54203H);
        this.f39172G = frameLayout;
    }

    @Override // p184s3.V
    public final void C() {
        Q3.AbstractC1477p.e("destroy must be called on the main UI thread.");
        this.f39171F.a();
    }

    @Override // p184s3.V
    public final void F1(p184s3.InterfaceC7122p0 interfaceC7122p0) {
    }

    @Override // p184s3.V
    public final void F2(com.google.android.gms.internal.ads.InterfaceC2970Wf interfaceC2970Wf) {
        p224w3.p.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p184s3.V
    public final boolean H0() {
        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f39171F;
        return abstractC2777Qy != null && abstractC2777Qy.h();
    }

    @Override // p184s3.V
    public final void I5(com.google.android.gms.internal.ads.InterfaceC2525Kc interfaceC2525Kc) {
    }

    @Override // p184s3.V
    public final void J() {
        Q3.AbstractC1477p.e("destroy must be called on the main UI thread.");
        this.f39171F.d().r1(null);
    }

    @Override // p184s3.V
    public final boolean K3(p184s3.X1 x6) {
        p224w3.p.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // p184s3.V
    public final boolean P5() {
        return false;
    }

    @Override // p184s3.V
    public final void T1(p184s3.c2 c2Var) {
        Q3.AbstractC1477p.e("setAdSize must be called on the main UI thread.");
        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = this.f39171F;
        if (abstractC2777Qy != null) {
            abstractC2777Qy.p(this.f39172G, c2Var);
        }
    }

    @Override // p184s3.V
    public final void V0(p184s3.i2 i2Var) {
    }

    @Override // p184s3.V
    public final void V5(p184s3.E e6) {
        p224w3.p.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
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

    @Override // p184s3.V
    public final void Y() {
        Q3.AbstractC1477p.e("destroy must be called on the main UI thread.");
        this.f39171F.d().s1(null);
    }

    @Override // p184s3.V
    public final void Y1(com.google.android.gms.internal.ads.InterfaceC4069ip interfaceC4069ip) {
    }

    @Override // p184s3.V
    public final void Y4(boolean z6) {
    }

    @Override // p184s3.V
    public final void e6(boolean z6) {
        p224w3.p.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p184s3.V
    public final android.os.Bundle f() {
        p224w3.p.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
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
        return this.f39169D;
    }

    @Override // p184s3.V
    public final void h0() {
        this.f39171F.o();
    }

    @Override // p184s3.V
    public final p184s3.c2 i() {
        Q3.AbstractC1477p.e("getAdSize must be called on the main UI thread.");
        return com.google.android.gms.internal.ads.AbstractC5205t70.a(this.f39168C, java.util.Collections.singletonList(this.f39171F.m()));
    }

    @Override // p184s3.V
    public final void i2(p184s3.InterfaceC7101i0 interfaceC7101i0) {
        com.google.android.gms.internal.ads.UX ux = this.f39170E.f37510c;
        if (ux != null) {
            ux.C(interfaceC7101i0);
        }
    }

    @Override // p184s3.V
    public final p184s3.InterfaceC7101i0 j() {
        return this.f39170E.f37521n;
    }

    @Override // p184s3.V
    public final void j4(p184s3.Q1 q6) {
        p224w3.p.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p184s3.V
    public final p184s3.U0 k() {
        return this.f39171F.c();
    }

    @Override // p184s3.V
    public final p184s3.Y0 l() {
        return this.f39171F.l();
    }

    @Override // p184s3.V
    public final void l1(p184s3.N0 n6) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ub)).booleanValue()) {
            p224w3.p.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        com.google.android.gms.internal.ads.UX ux = this.f39170E.f37510c;
        if (ux != null) {
            try {
                if (!n6.e()) {
                    this.f39173H.e();
                }
            } catch (android.os.RemoteException e6) {
                p224w3.p.c("Error in making CSI ping for reporting paid event callback", e6);
            }
            ux.z(n6);
        }
    }

    @Override // p184s3.V
    public final void m6(X3.a aVar) {
    }

    @Override // p184s3.V
    public final X3.a n() {
        return X3.b.c2(this.f39172G);
    }

    @Override // p184s3.V
    public final void o3(p184s3.X1 x6, p184s3.K k6) {
    }

    @Override // p184s3.V
    public final void r2(java.lang.String str) {
    }

    @Override // p184s3.V
    public final java.lang.String t() {
        return this.f39170E.f37513f;
    }

    @Override // p184s3.V
    public final java.lang.String u() {
        if (this.f39171F.c() != null) {
            return this.f39171F.c().i();
        }
        return null;
    }

    @Override // p184s3.V
    public final void u3(p184s3.H h6) {
        p224w3.p.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p184s3.V
    public final void v3(p184s3.C7113m0 c7113m0) {
        p224w3.p.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p184s3.V
    public final java.lang.String w() {
        if (this.f39171F.c() != null) {
            return this.f39171F.c().i();
        }
        return null;
    }

    @Override // p184s3.V
    public final void x4(p184s3.InterfaceC7077a0 interfaceC7077a0) {
        p224w3.p.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }
}
