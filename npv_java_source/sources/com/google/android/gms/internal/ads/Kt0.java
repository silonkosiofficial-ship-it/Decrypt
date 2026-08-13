package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public enum Kt0 implements com.google.android.gms.internal.ads.Lv0 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f29028C;

    Kt0(int i6) {
        this.f29028C = i6;
    }

    public static com.google.android.gms.internal.ads.Kt0 e(int i6) {
        if (i6 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i6 == 1) {
            return TINK;
        }
        if (i6 == 2) {
            return LEGACY;
        }
        if (i6 == 3) {
            return RAW;
        }
        if (i6 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f29028C;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(a());
    }
}
