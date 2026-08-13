package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2932Ve implements com.google.android.gms.internal.ads.Lv0 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);


    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Mv0 f32546G = new com.google.android.gms.internal.ads.Mv0() { // from class: com.google.android.gms.internal.ads.Ve.a
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f32548C;

    EnumC2932Ve(int i6) {
        this.f32548C = i6;
    }

    public static com.google.android.gms.internal.ads.EnumC2932Ve e(int i6) {
        if (i6 == 0) {
            return ENUM_FALSE;
        }
        if (i6 == 1) {
            return ENUM_TRUE;
        }
        if (i6 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static com.google.android.gms.internal.ads.Nv0 g() {
        return com.google.android.gms.internal.ads.C2968We.f32776a;
    }

    public final int a() {
        return this.f32548C;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(a());
    }
}
