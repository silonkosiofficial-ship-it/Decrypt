package com.google.ads.mediation;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter, p244y3.q, p244y3.s {
    public static final java.lang.String AD_UNIT_ID_PARAMETER = "pubid";
    private p104k3.C6889f adLoader;
    protected p104k3.i mAdView;
    protected p234x3.a mInterstitialAd;

    p104k3.g buildAdRequest(android.content.Context context, p244y3.e eVar, android.os.Bundle bundle, android.os.Bundle bundle2) {
        k3.g.a aVar = new k3.g.a();
        java.util.Set setH = eVar.h();
        if (setH != null) {
            java.util.Iterator it = setH.iterator();
            while (it.hasNext()) {
                aVar.a((java.lang.String) it.next());
            }
        }
        if (eVar.g()) {
            p184s3.C7147y.b();
            aVar.d(p224w3.g.A(context));
        }
        if (eVar.d() != -1) {
            aVar.f(eVar.d() == 1);
        }
        aVar.e(eVar.f());
        aVar.b(com.google.ads.mediation.admob.AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.g();
    }

    protected abstract android.os.Bundle buildExtrasBundle(android.os.Bundle bundle, android.os.Bundle bundle2);

    public java.lang.String getAdUnitId(android.os.Bundle bundle) {
        return bundle.getString("pubid");
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public android.view.View getBannerView() {
        return this.mAdView;
    }

    p234x3.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // p244y3.s
    public p184s3.Y0 getVideoController() {
        p104k3.i iVar = this.mAdView;
        if (iVar != null) {
            return iVar.e().b();
        }
        return null;
    }

    p104k3.C6889f.a newAdLoader(android.content.Context context, java.lang.String str) {
        return new p104k3.C6889f.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p244y3.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        p104k3.i iVar = this.mAdView;
        if (iVar != null) {
            iVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // p244y3.q
    public void onImmersiveModeUpdated(boolean z6) {
        p234x3.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.d(z6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p244y3.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        p104k3.i iVar = this.mAdView;
        if (iVar != null) {
            iVar.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p244y3.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        p104k3.i iVar = this.mAdView;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(android.content.Context context, p244y3.i iVar, android.os.Bundle bundle, p104k3.h hVar, p244y3.e eVar, android.os.Bundle bundle2) {
        p104k3.i iVar2 = new p104k3.i(context);
        this.mAdView = iVar2;
        iVar2.setAdSize(new p104k3.h(hVar.c(), hVar.a()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new com.google.ads.mediation.b(this, iVar));
        this.mAdView.b(buildAdRequest(context, eVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(android.content.Context context, p244y3.l lVar, android.os.Bundle bundle, p244y3.e eVar, android.os.Bundle bundle2) {
        p234x3.a.b(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new com.google.ads.mediation.c(this, lVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(android.content.Context context, p244y3.n nVar, android.os.Bundle bundle, p244y3.p pVar, android.os.Bundle bundle2) {
        com.google.ads.mediation.e eVar = new com.google.ads.mediation.e(this, nVar);
        p104k3.C6889f.a aVarC = newAdLoader(context, bundle.getString("pubid")).c(eVar);
        aVarC.g(pVar.i());
        aVarC.d(pVar.c());
        if (pVar.e()) {
            aVarC.f(eVar);
        }
        if (pVar.b()) {
            for (java.lang.String str : pVar.a().keySet()) {
                aVarC.e(str, eVar, true != ((java.lang.Boolean) pVar.a().get(str)).booleanValue() ? null : eVar);
            }
        }
        p104k3.C6889f c6889fA = aVarC.a();
        this.adLoader = c6889fA;
        c6889fA.a(buildAdRequest(context, pVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        p234x3.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.e(null);
        }
    }
}
