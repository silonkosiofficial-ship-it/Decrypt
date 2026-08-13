package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3377cW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.TV f34509a;

    C3377cW() {
    }

    private C3377cW(com.google.android.gms.internal.ads.TV tv) {
        this.f34509a = tv;
    }

    public static com.google.android.gms.internal.ads.C3377cW b(com.google.android.gms.internal.ads.TV tv) {
        return new com.google.android.gms.internal.ads.C3377cW(tv);
    }

    public final com.google.android.gms.internal.ads.TV a(V3.f fVar, com.google.android.gms.internal.ads.VV vv, com.google.android.gms.internal.ads.C3266bU c3266bU, com.google.android.gms.internal.ads.C2559La0 c2559La0) {
        com.google.android.gms.internal.ads.TV tv = this.f34509a;
        return tv != null ? tv : new com.google.android.gms.internal.ads.TV(fVar, vv, c3266bU, c2559La0);
    }
}
