package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3529dt0 implements com.google.android.gms.internal.ads.Lv0 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f34843C;

    EnumC3529dt0(int i6) {
        this.f34843C = i6;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f34843C;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(a());
    }
}
