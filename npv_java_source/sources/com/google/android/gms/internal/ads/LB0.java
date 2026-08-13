package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class LB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.AbstractC4942qm f29431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.LH0 f29433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f29434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.AbstractC4942qm f29435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.LH0 f29437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f29438i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f29439j;

    public LB0(long j6, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, int i6, com.google.android.gms.internal.ads.LH0 lh0, long j10, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm2, int i10, com.google.android.gms.internal.ads.LH0 lh1, long j11, long j12) {
        this.f29430a = j6;
        this.f29431b = abstractC4942qm;
        this.f29432c = i6;
        this.f29433d = lh0;
        this.f29434e = j10;
        this.f29435f = abstractC4942qm2;
        this.f29436g = i10;
        this.f29437h = lh1;
        this.f29438i = j11;
        this.f29439j = j12;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.LB0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.LB0 lb0 = (com.google.android.gms.internal.ads.LB0) obj;
            if (this.f29430a == lb0.f29430a && this.f29432c == lb0.f29432c && this.f29434e == lb0.f29434e && this.f29436g == lb0.f29436g && this.f29438i == lb0.f29438i && this.f29439j == lb0.f29439j && com.google.android.gms.internal.ads.AbstractC5700xg0.a(this.f29431b, lb0.f29431b) && com.google.android.gms.internal.ads.AbstractC5700xg0.a(this.f29433d, lb0.f29433d) && com.google.android.gms.internal.ads.AbstractC5700xg0.a(this.f29435f, lb0.f29435f) && com.google.android.gms.internal.ads.AbstractC5700xg0.a(this.f29437h, lb0.f29437h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.f29430a), this.f29431b, java.lang.Integer.valueOf(this.f29432c), this.f29433d, java.lang.Long.valueOf(this.f29434e), this.f29435f, java.lang.Integer.valueOf(this.f29436g), this.f29437h, java.lang.Long.valueOf(this.f29438i), java.lang.Long.valueOf(this.f29439j)});
    }
}
