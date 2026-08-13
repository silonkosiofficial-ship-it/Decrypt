package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3608ee implements com.google.android.gms.internal.ads.Lv0 {
    VIDEO_ERROR_CODE_UNSPECIFIED(0),
    OPENGL_RENDERING_FAILED(1),
    CACHE_LOAD_FAILED(2),
    ANDROID_TARGET_API_TOO_LOW(3);


    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Mv0 f35030H = new com.google.android.gms.internal.ads.Mv0() { // from class: com.google.android.gms.internal.ads.ee.a
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f35032C;

    EnumC3608ee(int i6) {
        this.f35032C = i6;
    }

    public static com.google.android.gms.internal.ads.EnumC3608ee e(int i6) {
        if (i6 == 0) {
            return VIDEO_ERROR_CODE_UNSPECIFIED;
        }
        if (i6 == 1) {
            return OPENGL_RENDERING_FAILED;
        }
        if (i6 == 2) {
            return CACHE_LOAD_FAILED;
        }
        if (i6 != 3) {
            return null;
        }
        return ANDROID_TARGET_API_TOO_LOW;
    }

    public static com.google.android.gms.internal.ads.Nv0 g() {
        return com.google.android.gms.internal.ads.C3718fe.f35378a;
    }

    public final int a() {
        return this.f35032C;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(a());
    }
}
