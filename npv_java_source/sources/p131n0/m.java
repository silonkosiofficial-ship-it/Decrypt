package p131n0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0.m.a f51333b = new n0.m.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f51334c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f51335d = d(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f51336a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return p131n0.m.f51335d;
        }

        public final long b() {
            return p131n0.m.f51334c;
        }
    }

    private /* synthetic */ m(long j6) {
        this.f51336a = j6;
    }

    public static final /* synthetic */ p131n0.m c(long j6) {
        return new p131n0.m(j6);
    }

    public static long d(long j6) {
        return j6;
    }

    public static boolean e(long j6, java.lang.Object obj) {
        return (obj instanceof p131n0.m) && j6 == ((p131n0.m) obj).m();
    }

    public static final boolean f(long j6, long j10) {
        return j6 == j10;
    }

    public static final float g(long j6) {
        if (j6 == 9205357640488583168L) {
            p131n0.d.a("Size is unspecified");
        }
        return java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    public static final float h(long j6) {
        if (j6 == 9205357640488583168L) {
            p131n0.d.a("Size is unspecified");
        }
        return java.lang.Math.min(java.lang.Float.intBitsToFloat((int) ((j6 >> 32) & 2147483647L)), java.lang.Float.intBitsToFloat((int) (j6 & 2147483647L)));
    }

    public static final float i(long j6) {
        if (j6 == 9205357640488583168L) {
            p131n0.d.a("Size is unspecified");
        }
        return java.lang.Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static int j(long j6) {
        return p170r.r.a(j6);
    }

    public static final boolean k(long j6) {
        if (j6 == 9205357640488583168L) {
            p131n0.d.a("Size is unspecified");
        }
        long j10 = j6 & (~((((-9223372034707292160L) & j6) >>> 31) * ((long) (-1))));
        return ((j10 & 4294967295L) & (j10 >>> 32)) == 0;
    }

    public static java.lang.String l(long j6) {
        if (j6 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + p131n0.c.a(i(j6), 1) + ", " + p131n0.c.a(g(j6), 1) + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return e(this.f51336a, obj);
    }

    public int hashCode() {
        return j(this.f51336a);
    }

    public final /* synthetic */ long m() {
        return this.f51336a;
    }

    public java.lang.String toString() {
        return l(this.f51336a);
    }
}
