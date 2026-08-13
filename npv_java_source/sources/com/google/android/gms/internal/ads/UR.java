package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class UR {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.UR f32204c = new com.google.android.gms.internal.ads.UR(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32206b;

    static {
        new com.google.android.gms.internal.ads.UR(0, 0);
    }

    public UR(int i6, int i10) {
        boolean z6 = false;
        if ((i6 == -1 || i6 >= 0) && (i10 == -1 || i10 >= 0)) {
            z6 = true;
        }
        com.google.android.gms.internal.ads.LC.d(z6);
        this.f32205a = i6;
        this.f32206b = i10;
    }

    public final int a() {
        return this.f32206b;
    }

    public final int b() {
        return this.f32205a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.UR) {
            com.google.android.gms.internal.ads.UR ur = (com.google.android.gms.internal.ads.UR) obj;
            if (this.f32205a == ur.f32205a && this.f32206b == ur.f32206b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f32205a;
        return ((i6 >>> 16) | (i6 << 16)) ^ this.f32206b;
    }

    public final java.lang.String toString() {
        return this.f32205a + "x" + this.f32206b;
    }
}
