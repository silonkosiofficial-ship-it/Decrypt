package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IV implements com.google.android.gms.internal.ads.VT {
    private static android.os.Bundle d(android.os.Bundle bundle) {
        return bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        return !android.text.TextUtils.isEmpty(r60.f31202v.optString("pubid", ""));
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final P4.d b(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        java.lang.String strOptString = r60.f31202v.optString("pubid", "");
        com.google.android.gms.internal.ads.C4546n70 c4546n70 = c3558e70.f34898a.f34012a;
        com.google.android.gms.internal.ads.C4326l70 c4326l70 = new com.google.android.gms.internal.ads.C4326l70();
        c4326l70.M(c4546n70);
        c4326l70.P(strOptString);
        android.os.Bundle bundleD = d(c4546n70.f37511d.f54164O);
        android.os.Bundle bundleD2 = d(bundleD.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleD2.putInt("gw", 1);
        java.lang.String strOptString2 = r60.f31202v.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleD2.putString("mad_hac", strOptString2);
        }
        java.lang.String strOptString3 = r60.f31202v.optString("adJson", null);
        if (strOptString3 != null) {
            bundleD2.putString("_ad", strOptString3);
        }
        bundleD2.putBoolean("_noRefresh", true);
        java.util.Iterator<java.lang.String> itKeys = r60.f31137D.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.String strOptString4 = r60.f31137D.optString(next, null);
            if (next != null) {
                bundleD2.putString(next, strOptString4);
            }
        }
        bundleD.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleD2);
        p184s3.X1 x6 = c4546n70.f37511d;
        c4326l70.h(new p184s3.X1(x6.f54152C, x6.f54153D, bundleD2, x6.f54155F, x6.f54156G, x6.f54157H, x6.f54158I, x6.f54159J, x6.f54160K, x6.f54161L, x6.f54162M, x6.f54163N, bundleD, x6.f54165P, x6.f54166Q, x6.f54167R, x6.f54168S, x6.f54169T, x6.f54170U, x6.f54171V, x6.f54172W, x6.f54173X, x6.f54174Y, x6.f54175Z, x6.f54176a0, x6.f54177b0));
        com.google.android.gms.internal.ads.C4546n70 c4546n70J = c4326l70.j();
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.gms.internal.ads.U60 u60 = c3558e70.f34899b.f34448b;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putStringArrayList("nofill_urls", new java.util.ArrayList<>(u60.f32113a));
        bundle2.putInt("refresh_interval", u60.f32115c);
        bundle2.putString("gws_query_id", u60.f32114b);
        bundle.putBundle("parent_common_config", bundle2);
        com.google.android.gms.internal.ads.C4546n70 c4546n71 = c3558e70.f34898a.f34012a;
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putString("initial_ad_unit_id", c4546n71.f37513f);
        bundle3.putString("allocation_id", r60.f31204w);
        bundle3.putString("ad_source_name", r60.f31139F);
        bundle3.putStringArrayList("click_urls", new java.util.ArrayList<>(r60.f31164c));
        bundle3.putStringArrayList("imp_urls", new java.util.ArrayList<>(r60.f31166d));
        bundle3.putStringArrayList("manual_tracking_urls", new java.util.ArrayList<>(r60.f31190p));
        bundle3.putStringArrayList("fill_urls", new java.util.ArrayList<>(r60.f31184m));
        bundle3.putStringArrayList("video_start_urls", new java.util.ArrayList<>(r60.f31172g));
        bundle3.putStringArrayList("video_reward_urls", new java.util.ArrayList<>(r60.f31174h));
        bundle3.putStringArrayList("video_complete_urls", new java.util.ArrayList<>(r60.f31176i));
        bundle3.putString("transaction_id", r60.f31178j);
        bundle3.putString("valid_from_timestamp", r60.f31180k);
        bundle3.putBoolean("is_closable_area_disabled", r60.f31149P);
        bundle3.putString("recursive_server_response_data", r60.f31189o0);
        bundle3.putBoolean("is_analytics_logging_enabled", r60.f31156W);
        if (r60.f31182l != null) {
            android.os.Bundle bundle4 = new android.os.Bundle();
            bundle4.putInt("rb_amount", r60.f31182l.f37874D);
            bundle4.putString("rb_type", r60.f31182l.f37873C);
            bundle3.putParcelableArray("rewards", new android.os.Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return c(c4546n70J, bundle, r60, c3558e70);
    }

    protected abstract P4.d c(com.google.android.gms.internal.ads.C4546n70 c4546n70, android.os.Bundle bundle, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C3558e70 c3558e70);
}
