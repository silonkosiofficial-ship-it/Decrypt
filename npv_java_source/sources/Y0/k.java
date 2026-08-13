package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y0.k.a f16213b = new Y0.k.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f16214c = b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f16215d = b(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16216a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private /* synthetic */ k(long j6) {
        this.f16216a = j6;
    }

    public static final /* synthetic */ Y0.k a(long j6) {
        return new Y0.k(j6);
    }

    public static long b(long j6) {
        return j6;
    }

    public static boolean c(long j6, java.lang.Object obj) {
        return (obj instanceof Y0.k) && j6 == ((Y0.k) obj).i();
    }

    public static final boolean d(long j6, long j10) {
        return j6 == j10;
    }

    public static final float e(long j6) {
        return Y0.i.q(java.lang.Float.intBitsToFloat((int) (j6 >> 32)));
    }

    public static final float f(long j6) {
        return Y0.i.q(java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)));
    }

    public static int g(long j6) {
        return p170r.r.a(j6);
    }

    public static java.lang.String h(long j6) {
        if (j6 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((java.lang.Object) Y0.i.u(e(j6))) + ", " + ((java.lang.Object) Y0.i.u(f(j6))) + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return c(this.f16216a, obj);
    }

    public int hashCode() {
        return g(this.f16216a);
    }

    public final /* synthetic */ long i() {
        return this.f16216a;
    }

    public java.lang.String toString() {
        return h(this.f16216a);
    }
}
