package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y0.t.a f16230b = new Y0.t.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f16231c = c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16232a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return Y0.t.f16231c;
        }
    }

    private /* synthetic */ t(long j6) {
        this.f16232a = j6;
    }

    public static final /* synthetic */ Y0.t b(long j6) {
        return new Y0.t(j6);
    }

    public static long c(long j6) {
        return j6;
    }

    public static boolean d(long j6, java.lang.Object obj) {
        return (obj instanceof Y0.t) && j6 == ((Y0.t) obj).j();
    }

    public static final boolean e(long j6, long j10) {
        return j6 == j10;
    }

    public static final int f(long j6) {
        return (int) (j6 & 4294967295L);
    }

    public static final int g(long j6) {
        return (int) (j6 >> 32);
    }

    public static int h(long j6) {
        return p170r.r.a(j6);
    }

    public static java.lang.String i(long j6) {
        return g(j6) + " x " + f(j6);
    }

    public boolean equals(java.lang.Object obj) {
        return d(this.f16232a, obj);
    }

    public int hashCode() {
        return h(this.f16232a);
    }

    public final /* synthetic */ long j() {
        return this.f16232a;
    }

    public java.lang.String toString() {
        return i(this.f16232a);
    }
}
