package com.google.android.gms.ads.mediation;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface MediationInterstitialAdapter extends p244y3.f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(android.content.Context context, p244y3.l lVar, android.os.Bundle bundle, p244y3.e eVar, android.os.Bundle bundle2);

    void showInterstitial();
}
