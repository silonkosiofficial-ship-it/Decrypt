package com.google.android.gms.ads.mediation;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface MediationBannerAdapter extends p244y3.f {
    android.view.View getBannerView();

    @Override // p244y3.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // p244y3.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // p244y3.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(android.content.Context context, p244y3.i iVar, android.os.Bundle bundle, p104k3.h hVar, p244y3.e eVar, android.os.Bundle bundle2);
}
