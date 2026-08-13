package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3347cB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.LH0 f34462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f34465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f34466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f34468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f34469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f34470i;

    C3347cB0(com.google.android.gms.internal.ads.LH0 lh0, long j6, long j10, long j11, long j12, boolean z6, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        com.google.android.gms.internal.ads.LC.d(!z12 || z10);
        if (z11 && !z10) {
            z13 = false;
        }
        com.google.android.gms.internal.ads.LC.d(z13);
        this.f34462a = lh0;
        this.f34463b = j6;
        this.f34464c = j10;
        this.f34465d = j11;
        this.f34466e = j12;
        this.f34467f = false;
        this.f34468g = z10;
        this.f34469h = z11;
        this.f34470i = z12;
    }

    public final com.google.android.gms.internal.ads.C3347cB0 a(long j6) {
        return j6 == this.f34464c ? this : new com.google.android.gms.internal.ads.C3347cB0(this.f34462a, this.f34463b, j6, this.f34465d, this.f34466e, false, this.f34468g, this.f34469h, this.f34470i);
    }

    public final com.google.android.gms.internal.ads.C3347cB0 b(long j6) {
        return j6 == this.f34463b ? this : new com.google.android.gms.internal.ads.C3347cB0(this.f34462a, j6, this.f34464c, this.f34465d, this.f34466e, false, this.f34468g, this.f34469h, this.f34470i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C3347cB0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C3347cB0 c3347cB0 = (com.google.android.gms.internal.ads.C3347cB0) obj;
            if (this.f34463b == c3347cB0.f34463b && this.f34464c == c3347cB0.f34464c && this.f34465d == c3347cB0.f34465d && this.f34466e == c3347cB0.f34466e && this.f34468g == c3347cB0.f34468g && this.f34469h == c3347cB0.f34469h && this.f34470i == c3347cB0.f34470i && j$.util.Objects.equals(this.f34462a, c3347cB0.f34462a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f34462a.hashCode() + 527;
        long j6 = this.f34466e;
        long j10 = this.f34465d;
        return (((((((((((((iHashCode * 31) + ((int) this.f34463b)) * 31) + ((int) this.f34464c)) * 31) + ((int) j10)) * 31) + ((int) j6)) * 961) + (this.f34468g ? 1 : 0)) * 31) + (this.f34469h ? 1 : 0)) * 31) + (this.f34470i ? 1 : 0);
    }
}
