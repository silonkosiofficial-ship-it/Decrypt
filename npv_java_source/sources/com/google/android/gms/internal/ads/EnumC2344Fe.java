package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2344Fe implements com.google.android.gms.internal.ads.Lv0 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Mv0 f27429O = new com.google.android.gms.internal.ads.Mv0() { // from class: com.google.android.gms.internal.ads.Fe.a
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f27431C;

    EnumC2344Fe(int i6) {
        this.f27431C = i6;
    }

    public static com.google.android.gms.internal.ads.EnumC2344Fe e(int i6) {
        switch (i6) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    public static com.google.android.gms.internal.ads.Nv0 g() {
        return com.google.android.gms.internal.ads.C2381Ge.f27859a;
    }

    public final int a() {
        return this.f27431C;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(a());
    }
}
