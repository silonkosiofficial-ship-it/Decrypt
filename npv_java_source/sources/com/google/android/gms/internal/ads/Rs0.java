package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public enum Rs0 implements com.google.android.gms.internal.ads.Lv0 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f31382C;

    Rs0(int i6) {
        this.f31382C = i6;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f31382C;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(a());
    }
}
