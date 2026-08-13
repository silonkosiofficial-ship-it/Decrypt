package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2527Kd implements com.google.android.gms.internal.ads.Lv0 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Mv0 f28984J = new com.google.android.gms.internal.ads.Mv0() { // from class: com.google.android.gms.internal.ads.Kd.a
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f28986C;

    EnumC2527Kd(int i6) {
        this.f28986C = i6;
    }

    public static com.google.android.gms.internal.ads.EnumC2527Kd e(int i6) {
        if (i6 == 0) {
            return UNSPECIFIED;
        }
        if (i6 == 1) {
            return CONNECTING;
        }
        if (i6 == 2) {
            return CONNECTED;
        }
        if (i6 == 3) {
            return DISCONNECTING;
        }
        if (i6 == 4) {
            return DISCONNECTED;
        }
        if (i6 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public static com.google.android.gms.internal.ads.Nv0 g() {
        return com.google.android.gms.internal.ads.C2564Ld.f29529a;
    }

    public final int a() {
        return this.f28986C;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(a());
    }
}
