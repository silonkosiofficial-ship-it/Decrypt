package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2157Ad implements com.google.android.gms.internal.ads.Lv0 {
    CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
    TWO_G(1),
    THREE_G(2),
    LTE(4);


    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Mv0 f25201H = new com.google.android.gms.internal.ads.Mv0() { // from class: com.google.android.gms.internal.ads.Ad.a
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f25203C;

    EnumC2157Ad(int i6) {
        this.f25203C = i6;
    }

    public static com.google.android.gms.internal.ads.EnumC2157Ad e(int i6) {
        if (i6 == 0) {
            return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
        }
        if (i6 == 1) {
            return TWO_G;
        }
        if (i6 == 2) {
            return THREE_G;
        }
        if (i6 != 4) {
            return null;
        }
        return LTE;
    }

    public static com.google.android.gms.internal.ads.Nv0 g() {
        return com.google.android.gms.internal.ads.C2194Bd.f25997a;
    }

    public final int a() {
        return this.f25203C;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(a());
    }
}
