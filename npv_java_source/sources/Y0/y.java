package Y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static final long a(float f6, long j6) {
        return i(j6, f6);
    }

    public static final void b(long j6) {
        if (!(!g(j6))) {
            throw new java.lang.IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    public static final void c(long j6, long j10) {
        if (g(j6) || g(j10)) {
            throw new java.lang.IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (Y0.z.g(Y0.x.g(j6), Y0.x.g(j10))) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Cannot perform operation for " + ((java.lang.Object) Y0.z.i(Y0.x.g(j6))) + " and " + ((java.lang.Object) Y0.z.i(Y0.x.g(j10)))).toString());
    }

    public static final long d(double d6) {
        return i(4294967296L, (float) d6);
    }

    public static final long e(float f6) {
        return i(4294967296L, f6);
    }

    public static final long f(int i6) {
        return i(4294967296L, i6);
    }

    public static final boolean g(long j6) {
        return Y0.x.f(j6) == 0;
    }

    public static final long h(long j6, long j10, float f6) {
        c(j6, j10);
        return i(Y0.x.f(j6), p002a1.b.b(Y0.x.h(j6), Y0.x.h(j10), f6));
    }

    public static final long i(long j6, float f6) {
        return Y0.x.c(j6 | (((long) java.lang.Float.floatToIntBits(f6)) & 4294967295L));
    }
}
