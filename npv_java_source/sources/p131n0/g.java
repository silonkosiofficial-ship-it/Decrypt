package p131n0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0.g.a f51312b = new n0.g.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f51313c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f51314d = e(9187343241974906880L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f51315e = e(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f51316a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return p131n0.g.f51314d;
        }

        public final long b() {
            return p131n0.g.f51315e;
        }

        public final long c() {
            return p131n0.g.f51313c;
        }
    }

    private /* synthetic */ g(long j6) {
        this.f51316a = j6;
    }

    public static final /* synthetic */ p131n0.g d(long j6) {
        return new p131n0.g(j6);
    }

    public static long e(long j6) {
        return j6;
    }

    public static final long f(long j6, float f6, float f10) {
        return e((((long) java.lang.Float.floatToRawIntBits(f6)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L));
    }

    public static /* synthetic */ long g(long j6, float f6, float f10, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            f6 = java.lang.Float.intBitsToFloat((int) (j6 >> 32));
        }
        if ((i6 & 2) != 0) {
            f10 = java.lang.Float.intBitsToFloat((int) (4294967295L & j6));
        }
        return f(j6, f6, f10);
    }

    public static final long h(long j6, float f6) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j6 >> 32)) / f6;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)) / f6;
        return e((((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static boolean i(long j6, java.lang.Object obj) {
        return (obj instanceof p131n0.g) && j6 == ((p131n0.g) obj).v();
    }

    public static final boolean j(long j6, long j10) {
        return j6 == j10;
    }

    public static final float k(long j6) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (float) java.lang.Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    public static final float l(long j6) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    public static final float m(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static final float n(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    public static int o(long j6) {
        return p170r.r.a(j6);
    }

    public static final boolean p(long j6) {
        long j10 = j6 & 9223372034707292159L;
        return (((~j10) & (j10 - 9187343246269874177L)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    public static final long q(long j6, long j10) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j6 >> 32)) - java.lang.Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j10 & 4294967295L));
        return e((((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long r(long j6, long j10) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j6 >> 32)) + java.lang.Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (j10 & 4294967295L));
        return e((((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long s(long j6, float f6) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j6 >> 32)) * f6;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)) * f6;
        return e((((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static java.lang.String t(long j6) {
        if (!p131n0.h.c(j6)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + p131n0.c.a(m(j6), 1) + ", " + p131n0.c.a(n(j6), 1) + ')';
    }

    public static final long u(long j6) {
        return e(j6 ^ (-9223372034707292160L));
    }

    public boolean equals(java.lang.Object obj) {
        return i(this.f51316a, obj);
    }

    public int hashCode() {
        return o(this.f51316a);
    }

    public java.lang.String toString() {
        return t(this.f51316a);
    }

    public final /* synthetic */ long v() {
        return this.f51316a;
    }
}
