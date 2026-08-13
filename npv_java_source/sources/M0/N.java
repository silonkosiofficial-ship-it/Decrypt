package M0;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M0.N.a f6666b = new M0.N.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f6667c = M0.O.a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6668a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return M0.N.f6667c;
        }
    }

    private /* synthetic */ N(long j6) {
        this.f6668a = j6;
    }

    public static final /* synthetic */ M0.N b(long j6) {
        return new M0.N(j6);
    }

    public static long c(long j6) {
        return j6;
    }

    public static final boolean d(long j6, long j10) {
        return l(j6) <= l(j10) && k(j10) <= k(j6);
    }

    public static final boolean e(long j6, int i6) {
        return i6 < k(j6) && l(j6) <= i6;
    }

    public static boolean f(long j6, java.lang.Object obj) {
        return (obj instanceof M0.N) && j6 == ((M0.N) obj).r();
    }

    public static final boolean g(long j6, long j10) {
        return j6 == j10;
    }

    public static final boolean h(long j6) {
        return n(j6) == i(j6);
    }

    public static final int i(long j6) {
        return (int) (j6 & 4294967295L);
    }

    public static final int j(long j6) {
        return k(j6) - l(j6);
    }

    public static final int k(long j6) {
        return n(j6) > i(j6) ? n(j6) : i(j6);
    }

    public static final int l(long j6) {
        return n(j6) > i(j6) ? i(j6) : n(j6);
    }

    public static final boolean m(long j6) {
        return n(j6) > i(j6);
    }

    public static final int n(long j6) {
        return (int) (j6 >> 32);
    }

    public static int o(long j6) {
        return p170r.r.a(j6);
    }

    public static final boolean p(long j6, long j10) {
        return l(j6) < k(j10) && l(j10) < k(j6);
    }

    public static java.lang.String q(long j6) {
        return "TextRange(" + n(j6) + ", " + i(j6) + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return f(this.f6668a, obj);
    }

    public int hashCode() {
        return o(this.f6668a);
    }

    public final /* synthetic */ long r() {
        return this.f6668a;
    }

    public java.lang.String toString() {
        return q(this.f6668a);
    }
}
