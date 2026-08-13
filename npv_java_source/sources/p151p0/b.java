package p151p0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0.b.a f52614a = new p0.b.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f52615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f52616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f52617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f52618e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return p151p0.b.f52617d;
        }

        public final long b() {
            return p151p0.b.f52615b;
        }

        public final long c() {
            return p151p0.b.f52616c;
        }
    }

    static {
        long j6 = 3;
        long j10 = j6 << 32;
        f52615b = d((((long) 0) & 4294967295L) | j10);
        f52616c = d((((long) 1) & 4294967295L) | j10);
        f52617d = d(j10 | (((long) 2) & 4294967295L));
        f52618e = d((j6 & 4294967295L) | (((long) 4) << 32));
    }

    public static long d(long j6) {
        return j6;
    }

    public static final boolean e(long j6, long j10) {
        return j6 == j10;
    }

    public static final int f(long j6) {
        return (int) (j6 >> 32);
    }

    public static int g(long j6) {
        return p170r.r.a(j6);
    }

    public static java.lang.String h(long j6) {
        if (e(j6, f52615b)) {
            return "Rgb";
        }
        if (e(j6, f52616c)) {
            return "Xyz";
        }
        if (e(j6, f52617d)) {
            return "Lab";
        }
        return e(j6, f52618e) ? "Cmyk" : "Unknown";
    }
}
