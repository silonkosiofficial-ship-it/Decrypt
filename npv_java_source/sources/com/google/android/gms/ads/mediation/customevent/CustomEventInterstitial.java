package com.google.android.gms.ads.mediation.customevent;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface CustomEventInterstitial extends p254z3.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(android.content.Context context, p254z3.c cVar, java.lang.String str, p244y3.e eVar, android.os.Bundle bundle);

    void showInterstitial();
}
