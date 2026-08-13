package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2229Cc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C2229Cc f26255e = new com.google.android.gms.internal.ads.C2229Cc(null, new com.google.android.gms.internal.ads.C3104a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C3104a f26256f = new com.google.android.gms.internal.ads.C3104a(0).b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3104a[] f26260d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26258b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26257a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26259c = 0;

    static {
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
    }

    private C2229Cc(java.lang.Object obj, com.google.android.gms.internal.ads.C3104a[] c3104aArr, long j6, long j10, int i6) {
        this.f26260d = c3104aArr;
    }

    public final com.google.android.gms.internal.ads.C3104a a(int i6) {
        return i6 < 0 ? f26256f : this.f26260d[i6];
    }

    public final boolean b(int i6) {
        a(-1);
        int i10 = com.google.android.gms.internal.ads.C3104a.f33974i;
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && com.google.android.gms.internal.ads.C2229Cc.class == obj.getClass() && java.util.Arrays.equals(this.f26260d, ((com.google.android.gms.internal.ads.C2229Cc) obj).f26260d);
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + java.util.Arrays.hashCode(this.f26260d);
    }

    public final java.lang.String toString() {
        return "AdPlaybackState(adsId=" + ((java.lang.Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
