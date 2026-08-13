package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2824Se implements com.google.android.gms.internal.ads.Lv0 {
    PLATFORM_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2);


    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Mv0 f31730G = new com.google.android.gms.internal.ads.Mv0() { // from class: com.google.android.gms.internal.ads.Se.a
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f31732C;

    EnumC2824Se(int i6) {
        this.f31732C = i6;
    }

    public static com.google.android.gms.internal.ads.EnumC2824Se e(int i6) {
        if (i6 == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i6 == 1) {
            return IOS;
        }
        if (i6 != 2) {
            return null;
        }
        return ANDROID;
    }

    public static com.google.android.gms.internal.ads.Nv0 g() {
        return com.google.android.gms.internal.ads.C2860Te.f31972a;
    }

    public final int a() {
        return this.f31732C;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(a());
    }
}
