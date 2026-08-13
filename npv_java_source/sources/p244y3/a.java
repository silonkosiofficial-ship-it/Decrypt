package p244y3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public abstract p104k3.v getSDKVersionInfo();

    public abstract p104k3.v getVersionInfo();

    public abstract void initialize(android.content.Context context, p244y3.b bVar, java.util.List<p244y3.j> list);

    public void loadAppOpenAd(p244y3.g gVar, p244y3.d dVar) {
        dVar.a(new p104k3.C6885b(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads"));
    }

    public void loadBannerAd(p244y3.h hVar, p244y3.d dVar) {
        dVar.a(new p104k3.C6885b(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    @java.lang.Deprecated
    public void loadInterscrollerAd(p244y3.h hVar, p244y3.d dVar) {
        dVar.a(new p104k3.C6885b(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(p244y3.k kVar, p244y3.d dVar) {
        dVar.a(new p104k3.C6885b(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    @java.lang.Deprecated
    public void loadNativeAd(p244y3.m mVar, p244y3.d dVar) {
        dVar.a(new p104k3.C6885b(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAdMapper(p244y3.m mVar, p244y3.d dVar) throws android.os.RemoteException {
        throw new android.os.RemoteException("Method is not found");
    }

    public void loadRewardedAd(p244y3.o oVar, p244y3.d dVar) {
        dVar.a(new p104k3.C6885b(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(p244y3.o oVar, p244y3.d dVar) {
        dVar.a(new p104k3.C6885b(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
