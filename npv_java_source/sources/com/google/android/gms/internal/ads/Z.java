package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f33442d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f33443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f33445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f33446h;

    protected Z(long j6, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f33439a = j6;
        this.f33440b = j10;
        this.f33443e = j12;
        this.f33444f = j13;
        this.f33445g = j14;
        this.f33441c = j15;
        this.f33446h = f(j10, 0L, j12, j13, j14, j15);
    }

    protected static long f(long j6, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 >= j13 || 1 + j10 >= j11) {
            return j12;
        }
        long j15 = (long) ((j6 - j10) * ((j13 - j12) / (j11 - j10)));
        return java.lang.Math.max(j12, java.lang.Math.min(((j12 + j15) - j14) - (j15 / 20), j13 - 1));
    }

    static /* bridge */ /* synthetic */ void g(com.google.android.gms.internal.ads.Z z6, long j6, long j10) {
        z6.f33443e = j6;
        z6.f33445g = j10;
        z6.i();
    }

    static /* bridge */ /* synthetic */ void h(com.google.android.gms.internal.ads.Z z6, long j6, long j10) {
        z6.f33442d = j6;
        z6.f33444f = j10;
        z6.i();
    }

    private final void i() {
        this.f33446h = f(this.f33440b, this.f33442d, this.f33443e, this.f33444f, this.f33445g, this.f33441c);
    }
}
