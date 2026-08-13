package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y0.l.a f16217b = new Y0.l.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f16218c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f16219d = d(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16220a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return Y0.l.f16219d;
        }

        public final long b() {
            return Y0.l.f16218c;
        }
    }

    private /* synthetic */ l(long j6) {
        this.f16220a = j6;
    }

    public static final /* synthetic */ Y0.l c(long j6) {
        return new Y0.l(j6);
    }

    public static long d(long j6) {
        return j6;
    }

    public static boolean e(long j6, java.lang.Object obj) {
        return (obj instanceof Y0.l) && j6 == ((Y0.l) obj).k();
    }

    public static final boolean f(long j6, long j10) {
        return j6 == j10;
    }

    public static final float g(long j6) {
        return Y0.i.q(java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)));
    }

    public static final float h(long j6) {
        return Y0.i.q(java.lang.Float.intBitsToFloat((int) (j6 >> 32)));
    }

    public static int i(long j6) {
        return p170r.r.a(j6);
    }

    public static java.lang.String j(long j6) {
        if (j6 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((java.lang.Object) Y0.i.u(h(j6))) + " x " + ((java.lang.Object) Y0.i.u(g(j6)));
    }

    public boolean equals(java.lang.Object obj) {
        return e(this.f16220a, obj);
    }

    public int hashCode() {
        return i(this.f16220a);
    }

    public final /* synthetic */ long k() {
        return this.f16220a;
    }

    public java.lang.String toString() {
        return j(this.f16220a);
    }
}
