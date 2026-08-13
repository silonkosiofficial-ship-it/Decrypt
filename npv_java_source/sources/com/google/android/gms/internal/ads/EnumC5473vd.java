package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5473vd implements com.google.android.gms.internal.ads.Lv0 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);


    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Mv0 f39424P = new com.google.android.gms.internal.ads.Mv0() { // from class: com.google.android.gms.internal.ads.vd.a
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f39426C;

    EnumC5473vd(int i6) {
        this.f39426C = i6;
    }

    public static com.google.android.gms.internal.ads.EnumC5473vd e(int i6) {
        switch (i6) {
            case 0:
                return AD_INITIATER_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return DFP_BANNER;
            case 3:
                return INTERSTITIAL;
            case 4:
                return DFP_INTERSTITIAL;
            case 5:
                return NATIVE_EXPRESS;
            case 6:
                return AD_LOADER;
            case 7:
                return REWARD_BASED_VIDEO_AD;
            case 8:
                return BANNER_SEARCH_ADS;
            case 9:
                return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
            case 10:
                return APP_OPEN;
            case 11:
                return REWARDED_INTERSTITIAL;
            default:
                return null;
        }
    }

    public static com.google.android.gms.internal.ads.Nv0 g() {
        return com.google.android.gms.internal.ads.C5583wd.f39655a;
    }

    public final int a() {
        return this.f39426C;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(a());
    }
}
