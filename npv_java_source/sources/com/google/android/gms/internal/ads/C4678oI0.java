package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4678oI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37764b;

    public C4678oI0(int i6, boolean z6) {
        this.f37763a = i6;
        this.f37764b = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C4678oI0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C4678oI0 c4678oI0 = (com.google.android.gms.internal.ads.C4678oI0) obj;
            if (this.f37763a == c4678oI0.f37763a && this.f37764b == c4678oI0.f37764b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f37763a * 31) + (this.f37764b ? 1 : 0);
    }
}
