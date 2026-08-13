package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrw implements com.google.android.gms.ads.mediation.MediationInterstitialAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.app.Activity f40428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p244y3.l f40429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.net.Uri f40430c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        p224w3.p.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        p224w3.p.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        p224w3.p.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(android.content.Context context, p244y3.l lVar, android.os.Bundle bundle, p244y3.e eVar, android.os.Bundle bundle2) {
        this.f40429b = lVar;
        if (lVar == null) {
            p224w3.p.g("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            p224w3.p.g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f40429b.c(this, 0);
            return;
        }
        if (!com.google.android.gms.internal.ads.C3393cg.g(context)) {
            p224w3.p.g("Default browser does not support custom tabs. Bailing out.");
            this.f40429b.c(this, 0);
            return;
        }
        java.lang.String string = bundle.getString("tab_url");
        if (android.text.TextUtils.isEmpty(string)) {
            p224w3.p.g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f40429b.c(this, 0);
        } else {
            this.f40428a = (android.app.Activity) context;
            this.f40430c = android.net.Uri.parse(string);
            this.f40429b.n(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        androidx.browser.customtabs.d dVarA = new androidx.browser.customtabs.d.C0346d().a();
        dVarA.f18641a.setData(this.f40430c);
        p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC4284kn(this, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(new p204u3.l(dVarA.f18641a, null), null, new com.google.android.gms.internal.ads.C4174jn(this), null, new p224w3.a(0, 0, false), null, null, "")));
        p174r3.v.s().r();
    }
}
