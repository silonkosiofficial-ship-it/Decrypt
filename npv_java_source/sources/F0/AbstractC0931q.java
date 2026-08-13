package F0;

/* JADX INFO: renamed from: F0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0931q {
    public static final int a(long j6, long j10) {
        boolean zD = d(j6);
        if (zD != d(j10)) {
            return zD ? -1 : 1;
        }
        return (int) java.lang.Math.signum(c(j6) - c(j10));
    }

    public static long b(long j6) {
        return j6;
    }

    public static final float c(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static final boolean d(long j6) {
        return ((int) (j6 & 4294967295L)) != 0;
    }
}
