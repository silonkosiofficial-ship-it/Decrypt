package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Jz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f28779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f28780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28781c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f28782d = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f28784f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f28785g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f28788j = 0.97f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f28787i = 1.03f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f28789k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f28790l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f28783e = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f28786h = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f28791m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f28792n = -9223372036854775807L;

    /* synthetic */ Jz0(float f6, float f10, long j6, float f11, long j10, long j11, float f12, com.google.android.gms.internal.ads.Iz0 iz0) {
        this.f28779a = j10;
        this.f28780b = j11;
    }

    private static long f(long j6, long j10, float f6) {
        return (long) ((j6 * 0.999f) + (j10 * 9.999871E-4f));
    }

    private final void g() {
        long j6;
        long j10 = this.f28781c;
        if (j10 != -9223372036854775807L) {
            j6 = this.f28782d;
            if (j6 == -9223372036854775807L) {
                long j11 = this.f28784f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j6 = this.f28785g;
                if (j6 == -9223372036854775807L || j10 <= j6) {
                    j6 = j10;
                }
            }
        } else {
            j6 = -9223372036854775807L;
        }
        if (this.f28783e == j6) {
            return;
        }
        this.f28783e = j6;
        this.f28786h = j6;
        this.f28791m = -9223372036854775807L;
        this.f28792n = -9223372036854775807L;
        this.f28790l = -9223372036854775807L;
    }

    public final float a(long j6, long j10) {
        long jF;
        long j11;
        float fMax = 1.0f;
        if (this.f28781c != -9223372036854775807L) {
            long j12 = j6 - j10;
            long j13 = this.f28791m;
            if (j13 == -9223372036854775807L) {
                this.f28791m = j12;
                jF = 0;
            } else {
                long jMax = java.lang.Math.max(j12, f(j13, j12, 0.999f));
                this.f28791m = jMax;
                jF = f(this.f28792n, java.lang.Math.abs(j12 - jMax), 0.999f);
            }
            this.f28792n = jF;
            if (this.f28790l != -9223372036854775807L && android.os.SystemClock.elapsedRealtime() - this.f28790l < 1000) {
                return this.f28789k;
            }
            this.f28790l = android.os.SystemClock.elapsedRealtime();
            long j14 = this.f28791m + (this.f28792n * 3);
            if (this.f28786h > j14) {
                float fK = com.google.android.gms.internal.ads.EW.K(1000L);
                long[] jArr = {j14, this.f28783e, this.f28786h - (((long) ((this.f28789k - 1.0f) * fK)) + ((long) ((this.f28787i - 1.0f) * fK)))};
                j11 = jArr[0];
                for (int i6 = 1; i6 < 3; i6++) {
                    long j15 = jArr[i6];
                    if (j15 > j11) {
                        j11 = j15;
                    }
                }
                this.f28786h = j11;
            } else {
                long jMax2 = java.lang.Math.max(this.f28786h, java.lang.Math.min(j6 - ((long) (java.lang.Math.max(0.0f, this.f28789k - 1.0f) / 1.0E-7f)), j14));
                this.f28786h = jMax2;
                long j16 = this.f28785g;
                if (j16 == -9223372036854775807L || jMax2 <= j16) {
                    j11 = jMax2;
                } else {
                    this.f28786h = j16;
                    j11 = j16;
                }
            }
            long j17 = j6 - j11;
            fMax = java.lang.Math.abs(j17) >= this.f28779a ? java.lang.Math.max(this.f28788j, java.lang.Math.min((j17 * 1.0E-7f) + 1.0f, this.f28787i)) : 1.0f;
            this.f28789k = fMax;
        }
        return fMax;
    }

    public final long b() {
        return this.f28786h;
    }

    public final void c() {
        long j6 = this.f28786h;
        if (j6 == -9223372036854775807L) {
            return;
        }
        long j10 = j6 + this.f28780b;
        this.f28786h = j10;
        long j11 = this.f28785g;
        if (j11 != -9223372036854775807L && j10 > j11) {
            this.f28786h = j11;
        }
        this.f28790l = -9223372036854775807L;
    }

    public final void d(com.google.android.gms.internal.ads.N4 n6) {
        long j6 = n6.f30161a;
        this.f28781c = com.google.android.gms.internal.ads.EW.K(-9223372036854775807L);
        this.f28784f = com.google.android.gms.internal.ads.EW.K(-9223372036854775807L);
        this.f28785g = com.google.android.gms.internal.ads.EW.K(-9223372036854775807L);
        this.f28788j = 0.97f;
        this.f28787i = 1.03f;
        g();
    }

    public final void e(long j6) {
        this.f28782d = j6;
        g();
    }
}
