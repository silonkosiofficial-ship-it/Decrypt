package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5620wv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f39722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39723b;

    C5620wv0(java.lang.Object obj, int i6) {
        this.f39722a = obj;
        this.f39723b = i6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.C5620wv0)) {
            return false;
        }
        com.google.android.gms.internal.ads.C5620wv0 c5620wv0 = (com.google.android.gms.internal.ads.C5620wv0) obj;
        return this.f39722a == c5620wv0.f39722a && this.f39723b == c5620wv0.f39723b;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.f39722a) * 65535) + this.f39723b;
    }
}
