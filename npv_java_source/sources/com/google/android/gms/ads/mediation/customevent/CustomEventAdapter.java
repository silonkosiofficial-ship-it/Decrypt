package com.google.android.gms.ads.mediation.customevent;

/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepName
public final class CustomEventAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final p104k3.C6885b f24745e = new p104k3.C6885b(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.view.View f24746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.google.android.gms.ads.mediation.customevent.CustomEventBanner f24747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial f24748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.google.android.gms.ads.mediation.customevent.CustomEventNative f24749d;

    private static java.lang.Object a(java.lang.Class cls, java.lang.String str) {
        try {
            if (str != null) {
                return cls.cast(java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null));
            }
            throw null;
        } catch (java.lang.Throwable th) {
            p224w3.p.g("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public android.view.View getBannerView() {
        return this.f24746a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p244y3.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        com.google.android.gms.ads.mediation.customevent.CustomEventBanner customEventBanner = this.f24747b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial customEventInterstitial = this.f24748c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        com.google.android.gms.ads.mediation.customevent.CustomEventNative customEventNative = this.f24749d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p244y3.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        com.google.android.gms.ads.mediation.customevent.CustomEventBanner customEventBanner = this.f24747b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial customEventInterstitial = this.f24748c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        com.google.android.gms.ads.mediation.customevent.CustomEventNative customEventNative = this.f24749d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p244y3.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        com.google.android.gms.ads.mediation.customevent.CustomEventBanner customEventBanner = this.f24747b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial customEventInterstitial = this.f24748c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        com.google.android.gms.ads.mediation.customevent.CustomEventNative customEventNative = this.f24749d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(android.content.Context context, p244y3.i iVar, android.os.Bundle bundle, p104k3.h hVar, p244y3.e eVar, android.os.Bundle bundle2) {
        com.google.android.gms.ads.mediation.customevent.CustomEventBanner customEventBanner = (com.google.android.gms.ads.mediation.customevent.CustomEventBanner) a(com.google.android.gms.ads.mediation.customevent.CustomEventBanner.class, bundle.getString("class_name"));
        this.f24747b = customEventBanner;
        if (customEventBanner == null) {
            iVar.q(this, f24745e);
            return;
        }
        android.os.Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        com.google.android.gms.ads.mediation.customevent.CustomEventBanner customEventBanner2 = this.f24747b;
        customEventBanner2.getClass();
        customEventBanner2.requestBannerAd(context, new com.google.android.gms.ads.mediation.customevent.a(this, iVar), bundle.getString("parameter"), hVar, eVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(android.content.Context context, p244y3.l lVar, android.os.Bundle bundle, p244y3.e eVar, android.os.Bundle bundle2) {
        com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial customEventInterstitial = (com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial) a(com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f24748c = customEventInterstitial;
        if (customEventInterstitial == null) {
            lVar.f(this, f24745e);
            return;
        }
        android.os.Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial customEventInterstitial2 = this.f24748c;
        customEventInterstitial2.getClass();
        customEventInterstitial2.requestInterstitialAd(context, new com.google.android.gms.ads.mediation.customevent.b(this, this, lVar), bundle.getString("parameter"), eVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(android.content.Context context, p244y3.n nVar, android.os.Bundle bundle, p244y3.p pVar, android.os.Bundle bundle2) {
        com.google.android.gms.ads.mediation.customevent.CustomEventNative customEventNative = (com.google.android.gms.ads.mediation.customevent.CustomEventNative) a(com.google.android.gms.ads.mediation.customevent.CustomEventNative.class, bundle.getString("class_name"));
        this.f24749d = customEventNative;
        if (customEventNative == null) {
            nVar.m(this, f24745e);
            return;
        }
        android.os.Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        com.google.android.gms.ads.mediation.customevent.CustomEventNative customEventNative2 = this.f24749d;
        customEventNative2.getClass();
        customEventNative2.requestNativeAd(context, new com.google.android.gms.ads.mediation.customevent.c(this, nVar), bundle.getString("parameter"), pVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial customEventInterstitial = this.f24748c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
