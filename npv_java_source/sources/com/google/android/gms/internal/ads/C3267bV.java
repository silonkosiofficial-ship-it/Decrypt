package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3267bV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f34328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f34329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f34330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.ThreadLocal f34331d = new java.lang.ThreadLocal();

    public C3267bV(long j6) {
        i(0L);
    }

    public static long g(long j6) {
        return com.google.android.gms.internal.ads.EW.M(j6, 1000000L, 90000L, java.math.RoundingMode.DOWN);
    }

    public static long h(long j6) {
        return com.google.android.gms.internal.ads.EW.M(j6, 90000L, 1000000L, java.math.RoundingMode.DOWN);
    }

    public final synchronized long a(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!j()) {
                long jLongValue = this.f34328a;
                if (jLongValue == 9223372036854775806L) {
                    java.lang.Long l6 = (java.lang.Long) this.f34331d.get();
                    if (l6 == null) {
                        throw null;
                    }
                    jLongValue = l6.longValue();
                }
                this.f34329b = jLongValue - j6;
                notifyAll();
            }
            this.f34330c = j6;
            return j6 + this.f34329b;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f34330c;
            if (j10 != -9223372036854775807L) {
                long jH = h(j10);
                long j11 = (4294967296L + jH) / 8589934592L;
                long j12 = (((-1) + j11) * 8589934592L) + j6;
                j6 += j11 * 8589934592L;
                if (java.lang.Math.abs(j12 - jH) < java.lang.Math.abs(j6 - jH)) {
                    j6 = j12;
                }
            }
            return a(g(j6));
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.f34330c;
        if (j10 != -9223372036854775807L) {
            long jH = h(j10);
            long j11 = jH / 8589934592L;
            java.lang.Long.signum(j11);
            long j12 = (j11 * 8589934592L) + j6;
            j6 += (j11 + 1) * 8589934592L;
            if (j12 >= jH) {
                j6 = j12;
            }
        }
        return a(g(j6));
    }

    public final synchronized long d() {
        long j6 = this.f34328a;
        if (j6 == Long.MAX_VALUE || j6 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j6;
    }

    public final synchronized long e() {
        long j6;
        try {
            j6 = this.f34330c;
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return j6 != -9223372036854775807L ? j6 + this.f34329b : d();
    }

    public final synchronized long f() {
        return this.f34329b;
    }

    public final synchronized void i(long j6) {
        this.f34328a = j6;
        this.f34329b = j6 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f34330c = -9223372036854775807L;
    }

    public final synchronized boolean j() {
        return this.f34329b != -9223372036854775807L;
    }
}
