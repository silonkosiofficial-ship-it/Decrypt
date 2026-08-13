package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2231Cd implements com.google.android.gms.internal.ads.Lv0 {
    NETWORKTYPE_UNSPECIFIED(0),
    CELL(1),
    WIFI(2);


    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Mv0 f26266G = new com.google.android.gms.internal.ads.Mv0() { // from class: com.google.android.gms.internal.ads.Cd.a
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f26268C;

    EnumC2231Cd(int i6) {
        this.f26268C = i6;
    }

    public static com.google.android.gms.internal.ads.EnumC2231Cd e(int i6) {
        if (i6 == 0) {
            return NETWORKTYPE_UNSPECIFIED;
        }
        if (i6 == 1) {
            return CELL;
        }
        if (i6 != 2) {
            return null;
        }
        return WIFI;
    }

    public static com.google.android.gms.internal.ads.Nv0 g() {
        return com.google.android.gms.internal.ads.C2268Dd.f26753a;
    }

    public final int a() {
        return this.f26268C;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(a());
    }
}
