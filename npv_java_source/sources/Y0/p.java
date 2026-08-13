package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y0.p.a f16221b = new Y0.p.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f16222c = c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16223a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return Y0.p.f16222c;
        }
    }

    private /* synthetic */ p(long j6) {
        this.f16223a = j6;
    }

    public static final /* synthetic */ Y0.p b(long j6) {
        return new Y0.p(j6);
    }

    public static long c(long j6) {
        return j6;
    }

    public static final long d(long j6, int i6, int i10) {
        return c((((long) i6) << 32) | (((long) i10) & 4294967295L));
    }

    public static /* synthetic */ long e(long j6, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = (int) (j6 >> 32);
        }
        if ((i11 & 2) != 0) {
            i10 = (int) (4294967295L & j6);
        }
        return d(j6, i6, i10);
    }

    public static boolean f(long j6, java.lang.Object obj) {
        return (obj instanceof Y0.p) && j6 == ((Y0.p) obj).n();
    }

    public static final boolean g(long j6, long j10) {
        return j6 == j10;
    }

    public static final int h(long j6) {
        return (int) (j6 >> 32);
    }

    public static final int i(long j6) {
        return (int) (j6 & 4294967295L);
    }

    public static int j(long j6) {
        return p170r.r.a(j6);
    }

    public static final long k(long j6, long j10) {
        return c((((long) (((int) (j6 >> 32)) - ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j6 & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L));
    }

    public static final long l(long j6, long j10) {
        return c((((long) (((int) (j6 >> 32)) + ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j6 & 4294967295L)) + ((int) (j10 & 4294967295L)))) & 4294967295L));
    }

    public static java.lang.String m(long j6) {
        return '(' + h(j6) + ", " + i(j6) + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return f(this.f16223a, obj);
    }

    public int hashCode() {
        return j(this.f16223a);
    }

    public final /* synthetic */ long n() {
        return this.f16223a;
    }

    public java.lang.String toString() {
        return m(this.f16223a);
    }
}
