package A7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends A7.b {
    public static int a(int i6) {
        return java.lang.Integer.signum(i6);
    }

    public static int b(long j6) {
        return java.lang.Long.signum(j6);
    }

    public static int c(double d6) {
        if (java.lang.Double.isNaN(d6)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        if (d6 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d6 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) java.lang.Math.round(d6);
    }

    public static int d(float f6) {
        if (java.lang.Float.isNaN(f6)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(f6);
    }

    public static long e(double d6) {
        if (java.lang.Double.isNaN(d6)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(d6);
    }

    public static long f(float f6) {
        return A7.a.e(f6);
    }
}
