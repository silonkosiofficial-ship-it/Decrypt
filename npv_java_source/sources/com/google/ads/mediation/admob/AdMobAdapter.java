package com.google.ads.mediation.admob;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.Keep
public final class AdMobAdapter extends com.google.ads.mediation.AbstractAdViewAdapter {
    static final java.lang.String AD_JSON_PARAMETER = "adJson";
    public static final java.lang.String NEW_BUNDLE = "_newBundle";
    static final java.lang.String HOUSE_ADS_PARAMETER = "mad_hac";
    static final java.lang.String AD_PARAMETER = "_ad";

    @Override // com.google.ads.mediation.AbstractAdViewAdapter
    protected android.os.Bundle buildExtrasBundle(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        if (bundle.getBoolean("_newBundle")) {
            bundle = new android.os.Bundle(bundle);
        }
        bundle.putInt("gw", 1);
        bundle.putString("mad_hac", bundle2.getString("mad_hac"));
        if (!android.text.TextUtils.isEmpty(bundle2.getString("adJson"))) {
            bundle.putString("_ad", bundle2.getString("adJson"));
        }
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
