package com.google.android.gms.ads.mediation.rtb;

/* JADX INFO: loaded from: classes.dex */
public abstract class RtbAdapter extends p244y3.a {
    public abstract void collectSignals(A3.a aVar, A3.b bVar);

    public void loadRtbAppOpenAd(p244y3.g gVar, p244y3.d dVar) {
        loadAppOpenAd(gVar, dVar);
    }

    public void loadRtbBannerAd(p244y3.h hVar, p244y3.d dVar) {
        loadBannerAd(hVar, dVar);
    }

    @java.lang.Deprecated
    public void loadRtbInterscrollerAd(p244y3.h hVar, p244y3.d dVar) {
        dVar.a(new p104k3.C6885b(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(p244y3.k kVar, p244y3.d dVar) {
        loadInterstitialAd(kVar, dVar);
    }

    @java.lang.Deprecated
    public void loadRtbNativeAd(p244y3.m mVar, p244y3.d dVar) {
        loadNativeAd(mVar, dVar);
    }

    public void loadRtbNativeAdMapper(p244y3.m mVar, p244y3.d dVar) throws android.os.RemoteException {
        loadNativeAdMapper(mVar, dVar);
    }

    public void loadRtbRewardedAd(p244y3.o oVar, p244y3.d dVar) {
        loadRewardedAd(oVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(p244y3.o oVar, p244y3.d dVar) {
        loadRewardedInterstitialAd(oVar, dVar);
    }
}
