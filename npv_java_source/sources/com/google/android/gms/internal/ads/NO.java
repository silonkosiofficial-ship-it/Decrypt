package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class NO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2465Ij f30285a;

    NO(com.google.android.gms.internal.ads.InterfaceC2465Ij interfaceC2465Ij) {
        this.f30285a = interfaceC2465Ij;
    }

    private final void s(com.google.android.gms.internal.ads.LO lo) {
        java.lang.String strA = com.google.android.gms.internal.ads.LO.a(lo);
        p224w3.p.f("Dispatching AFMA event on publisher webview: ".concat(strA));
        this.f30285a.y(strA);
    }

    public final void a() {
        s(new com.google.android.gms.internal.ads.LO("initialize", null));
    }

    public final void b(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("interstitial", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onAdClicked";
        this.f30285a.y(com.google.android.gms.internal.ads.LO.a(lo));
    }

    public final void c(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("interstitial", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onAdClosed";
        s(lo);
    }

    public final void d(long j6, int i6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("interstitial", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onAdFailedToLoad";
        lo.f29488d = java.lang.Integer.valueOf(i6);
        s(lo);
    }

    public final void e(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("interstitial", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onAdLoaded";
        s(lo);
    }

    public final void f(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("interstitial", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onNativeAdObjectNotAvailable";
        s(lo);
    }

    public final void g(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("interstitial", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onAdOpened";
        s(lo);
    }

    public final void h(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("creation", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "nativeObjectCreated";
        s(lo);
    }

    public final void i(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("creation", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "nativeObjectNotCreated";
        s(lo);
    }

    public final void j(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("rewarded", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onAdClicked";
        s(lo);
    }

    public final void k(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("rewarded", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onRewardedAdClosed";
        s(lo);
    }

    public final void l(long j6, com.google.android.gms.internal.ads.InterfaceC5167sp interfaceC5167sp) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("rewarded", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onUserEarnedReward";
        lo.f29489e = interfaceC5167sp.e();
        lo.f29490f = java.lang.Integer.valueOf(interfaceC5167sp.d());
        s(lo);
    }

    public final void m(long j6, int i6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("rewarded", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onRewardedAdFailedToLoad";
        lo.f29488d = java.lang.Integer.valueOf(i6);
        s(lo);
    }

    public final void n(long j6, int i6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("rewarded", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onRewardedAdFailedToShow";
        lo.f29488d = java.lang.Integer.valueOf(i6);
        s(lo);
    }

    public final void o(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("rewarded", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onAdImpression";
        s(lo);
    }

    public final void p(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("rewarded", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onRewardedAdLoaded";
        s(lo);
    }

    public final void q(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("rewarded", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onNativeAdObjectNotAvailable";
        s(lo);
    }

    public final void r(long j6) {
        com.google.android.gms.internal.ads.LO lo = new com.google.android.gms.internal.ads.LO("rewarded", null);
        lo.f29485a = java.lang.Long.valueOf(j6);
        lo.f29487c = "onRewardedAdOpened";
        s(lo);
    }
}
