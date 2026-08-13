package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4486me implements com.google.android.gms.internal.ads.Lv0 {
    UNSPECIFIED(0),
    IN_MEMORY(1);


    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Mv0 f37388F = new com.google.android.gms.internal.ads.Mv0() { // from class: com.google.android.gms.internal.ads.me.a
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f37390C;

    EnumC4486me(int i6) {
        this.f37390C = i6;
    }

    public static com.google.android.gms.internal.ads.EnumC4486me e(int i6) {
        if (i6 == 0) {
            return UNSPECIFIED;
        }
        if (i6 != 1) {
            return null;
        }
        return IN_MEMORY;
    }

    public static com.google.android.gms.internal.ads.Nv0 g() {
        return com.google.android.gms.internal.ads.C4596ne.f37632a;
    }

    public final int a() {
        return this.f37390C;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(a());
    }
}
