package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class EO implements p114l3.c, com.google.android.gms.internal.ads.InterfaceC3571eE, p184s3.InterfaceC7076a, com.google.android.gms.internal.ads.EC, com.google.android.gms.internal.ads.ZC, com.google.android.gms.internal.ads.InterfaceC3131aD, com.google.android.gms.internal.ads.InterfaceC5326uD, com.google.android.gms.internal.ads.HC, com.google.android.gms.internal.ads.InterfaceC5539w90 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f27033C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5125sO f27034D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f27035E;

    public EO(com.google.android.gms.internal.ads.C5125sO c5125sO, com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su) {
        this.f27034D = c5125sO;
        this.f27033C = java.util.Collections.singletonList(abstractC2846Su);
    }

    private final void A(java.lang.Class cls, java.lang.String str, java.lang.Object... objArr) {
        this.f27034D.a(this.f27033C, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void B(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        this.f27035E = p174r3.v.c().c();
        A(com.google.android.gms.internal.ads.InterfaceC3571eE.class, "onAdRequest", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void a() {
        A(com.google.android.gms.internal.ads.EC.class, "onAdClosed", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void b() {
        A(com.google.android.gms.internal.ads.EC.class, "onAdLeftApplication", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void c() {
        A(com.google.android.gms.internal.ads.EC.class, "onAdOpened", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void d() {
        A(com.google.android.gms.internal.ads.EC.class, "onRewardedVideoCompleted", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void e() {
        A(com.google.android.gms.internal.ads.EC.class, "onRewardedVideoStarted", new java.lang.Object[0]);
    }

    @Override // p184s3.InterfaceC7076a
    public final void e0() {
        A(p184s3.InterfaceC7076a.class, "onAdClicked", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final void g(android.content.Context context) {
        A(com.google.android.gms.internal.ads.InterfaceC3131aD.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void i(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str, java.lang.Throwable th) {
        A(com.google.android.gms.internal.ads.InterfaceC4660o90.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final void k(android.content.Context context) {
        A(com.google.android.gms.internal.ads.InterfaceC3131aD.class, "onPause", context);
    }

    @Override // p114l3.c
    public final void o(java.lang.String str, java.lang.String str2) {
        A(p114l3.c.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void p(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str) {
        A(com.google.android.gms.internal.ads.InterfaceC4660o90.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void q(com.google.android.gms.internal.ads.InterfaceC3302bp interfaceC3302bp, java.lang.String str, java.lang.String str2) {
        A(com.google.android.gms.internal.ads.EC.class, "onRewarded", interfaceC3302bp, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final void r(android.content.Context context) {
        A(com.google.android.gms.internal.ads.InterfaceC3131aD.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void t() {
        A(com.google.android.gms.internal.ads.ZC.class, "onAdImpression", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
    public final void u() {
        p214v3.AbstractC7265q0.k("Ad Request Latency : " + (p174r3.v.c().c() - this.f27035E));
        A(com.google.android.gms.internal.ads.InterfaceC5326uD.class, "onAdLoaded", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final void u0(p184s3.W0 w6) {
        A(com.google.android.gms.internal.ads.HC.class, "onAdFailedToLoad", java.lang.Integer.valueOf(w6.f54145C), w6.f54146D, w6.f54147E);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void w(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str) {
        A(com.google.android.gms.internal.ads.InterfaceC4660o90.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void w0(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void z(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str) {
        A(com.google.android.gms.internal.ads.InterfaceC4660o90.class, "onTaskStarted", str);
    }
}
